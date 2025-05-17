import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class VulnerableServer {
    
    private static Connection connection;
    private static Object test;
    
    public static void main(String[] args) throws IOException {
        // 데이터베이스 연결 설정
        String host = "database.server.com";
        String database = "mydb";
        String password = System.getenv("POSTGRES_PASSWORD");
        int port = 3211;
        
        // 서버 생성 및 시작
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        server.start();
        
        System.out.println("Server running");
        
        // 음료 및 음식 리스트
        List<String> drinks = Arrays.asList("lemonade", "soda", "tea", "water");
        List<String> food = Arrays.asList("beans", "chicken", "rice");
        String iban = "DE012345678910112345";
    }
    
    static class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // GET 요청 파라미터 가져오기
            String query = exchange.getRequestURI().getQuery();
            Map<String, String> params = parseQuery(query);
            String search = params.get("q");
            
            if (search != null && !search.isEmpty()) {
                // SQL 쿼리 실행
                String sqlQuery = "SELECT * FROM users WHERE name = \"" + search + "\"";
                executeQuery(sqlQuery);
            }
            
            // 응답 보내기
            String response = "Response from server";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
        
        private Map<String, String> parseQuery(String query) {
            // 간단한 쿼리 파싱 구현 필요
            // 이 예제에서는 단순화를 위해 빈 Map을 반환합니다
            return Map.of(); 
        }
        
        private void executeQuery(String sqlQuery) {
            try {
                if (connection != null) {
                    Statement stmt = connection.createStatement();
                    stmt.execute(sqlQuery);
                    stmt.close();
                }
            } catch (SQLException e) {
                System.out.println("SQL Error: " + e.getMessage());
            }
        }
    }
    
    // 데이터베이스 연결 메서드
    private static void connectToDatabase(String host, String database, String password, int port) {
        try {
            String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            connection = DriverManager.getConnection(url, "postgres", password);
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
}