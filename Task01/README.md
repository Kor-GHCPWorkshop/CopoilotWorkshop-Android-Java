# Task 1: 간단한 함수 및 테스트 코드 제안 받기 (코드완성)

## Use case: 
- GitHub Copilot를 활용하여 간단한 함수와 테스트 코드를 제안받습니다. 이를 통해, GitHub Copilot이 기본적인 기능을 익히고, 어떠한 방식으로 일반적인 코딩 작업을 지원하는지 확인할 수 있습니다.

## 목표:
- 주석을 활용하여, 간단한 함수 (factorial, is_prime)를 코드완성 기능으로 작성합니다. 
- 작성한 함수에 대한 테스트 코드를 작성합니다.
- GitHub Copilot Log를 확인하여, 오픈소스와 매치되는 코드인 경우 레퍼런스 정보를 확인합니다. 
- Android Studio의 Copilot 메뉴에 관한 기본적인 설정들을 변경해 봅니다.

## Step 1 : 기본 함수 작성
- 새로운 모듈을 생성합니다. (예: MyTest)<br>
  <img src = "img/01.png" width = "400">

- 아래의 주석을 입력 합니다.<br>
- 회색으로 제안된 코드를 확인하고, Tab키를 눌러서 코드를 완성합니다.<br>

  `# 팩토리얼 함수 `<br>
  <img src = "img/02.png" width = "400">

- 두번째로 아래 주석을 입력하고 자동 완성되는 코드를 확인합니다. <br>
  `# 소수 판별 함수`<br>
  <img src = "img/03.png" width = "500">

- `Hep > Show Log in Explorer` 를 선택하고, `idea.log`파일을 열고 `[public code References]` 부분을 찾아 오픈소스의 레퍼런스 정보를 확인합니다.<br>
  <img src = "img/04.png" width = "400">
  <img src = "img/05.png" width = "600">

## Step 2 : 오른 마우스 Copilot 메뉴 사용하기
- 마우스 오른 버튼을 클릭하여, 'Copilot' 메뉴의 'generate_test'를 선택합니다.<br>
    <img src = "img/06.png" width = "500">
    <img src = "img/07.png" width = "500"> 

- 마우스 오른 버튼을 클릭하여 'Copilot' 메뉴의 'generate_docs'를 선택합니다.<br>
    <img src = "img/08.png" width = "500">
	<img src = "img/09.png" width = "500">


## Step 3 : 코드 완성 기능의 컨텍스트 이해하기
- Copilot은 코드 완성 기능을 제공하기 위해, **주석과 함수 이름을 기반으로** 컨텍스트를 이해합니다.<br>
- 또한, 현재 작성중인 파일의 커서 위치의 **전,후 데이터**와, 이 데이터와 유사한 데이터를 **오픈되어져 있는 주변의 탭**에서 찾아 컨텍스트를 이해합니다. (**Neighboring Tab**) <br>
   - 코드 완성 기능에서의 Neighboring Tab 기법을 테스트하기 위해 아래 절차데로 실습합니다. 
   - `/src` 디렉토리의 `url_tools.java`, `url.java` 파일 내용을 현재 실습하는 워크스페이스로 복사 <br>
     <img src = "img/11.png" width = "700"> <br>

   - 복사된 내용의 파일은 오픈된 상태로 두고, 이 파일을 import한 (예시의 'MyUrl.java')  파일의 마지막 라인에서 키보드의 Enter를 누르면 아래와 같이 함수가 제안됩니다.<br>   
     <img src = "img/12.png" width = "700">


## Step 4 : Android Studio의 Copilot 설정 메뉴
- Android Studio에서 우측 하단의 GitHub Copilot 아이콘을 클릭하고 `Edit Settings`을 선택한다.  <br>
    <img src = "img/13.png" width = "500">
- `Natural Launguage` 부분을 '한국어'로 변경합니다.<br>
    <img src = "img/14.png" width = "500">

- Code완성 기능의 기본 모델을 변경해 봅니다.<br>
  - Model for completions 우측의 드롭다운 메뉴를 확인해 봅니다. <br>
    <img src = "img/15.png" width = "400">


## 지식 확인
- GitHub Copilot의 코드 완성 기능
- 코드완성 기능의 모델 선택
- GitHub Copilot의 코드 완성 기능의 컨텍스트
- Android Studio의 Copilot 설정 메뉴



