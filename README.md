# GitHub Copilot Workshop
안녕하세요. GitHub Copilot Workshop 리포지토리 입니다. 
이 Repository는 여러개의 다른 실습 과제들을 담고 있으며, GitHub Copilot의 기본적인 코드를 제안받는 사용법 부터 추가적인 다른 워크플로우에 이용할 수 있는 방법까지 핸즈온 경험을 기반으로 한 워크샾 내용을 담고 있습니다. 
각 프로젝트는 GitHub Copilot의 서로 다른 사용례를 담고 있으며, 개별적인 실습 과제로서 마무리 됩니다.

## 실습 환경
- Android Studio를 활용합니다.
  * 다른 IDE도구와 기능적인 차이가 있을 수 있어, 지원되지 않는 실습예가 있을 수 있습니다.
  * 본 워크샵에 보기로 주어진 화면 캡쳐와, 참여하시는 분들이 보시는 메뉴가 다를 수 있습니다. 
  * 이유는, GitHub Copilot의 기능이나, Android Studio의의 기능이 업데이트 되어, 메뉴의 위치나 기능이 변경되었을 수 있습니다.
  * 또, 각 기업의 관리자 설정에서 기업의 정책에 따라 허용된 기능이 다를 수 있습니다. 

- GitHub Copilot 플러그인을 설치하고, GitHub Copilot Business 라이센스가 있는 계정으로 로그인하여 사용할 수 있는 상태여야 합니다.
- Android Studio 및 GitHub Copilot 플러그인은 **최신 버전으로 업데이트 되어 있어야 합니다.**

  ### 언어 및 빌드
 Adnroid Studio에서 Java언어를 사용합니다.
  [JetBrains에서 GitHub Copilot 플러그인을 설치합니다.](https://docs.github.com/en/enterprise-cloud@latest/copilot/managing-copilot/configure-personal-settings/installing-the-github-copilot-extension-in-your-environment?tool=jetbrains)

## 설명: GitHub Copilot 미리보기
 - GitHub Copilot의 기본적인 내용에 대해 자료를 통해 설명 드립니다. 
  - [GitHub Copilot 사용 베스트 프랙티스](https://docs.github.com/ko/enterprise-cloud@latest/copilot/using-github-copilot/best-practices-for-using-github-copilot)
  - [GitHub Copilot in VS Code](https://code.visualstudio.com/docs/copilot/overview)
  - [초보자를 위한 GitHub Copilot의 핵심기능소개](https://github.blog/ai-and-ml/github-copilot/github-for-beginners-essential-features-of-github-copilot/)
  
## [Task 1](/Task01/README.md): 간단한 함수 및 테스트 코드 제안 받기 (코드완성)
 - GitHub Copilot를 활용하여 간단한 함수와 테스트 코드를 제안받는 실습입니다. 이를 통해 기본적인 Copilot의 기능을 활용하는 방법을 익힙니다. 
 - GitHub Copilot Log를 확인하여, 오픈소스와 매치되는 코드인 경우 레퍼런스 정보를 확인합니다. 
 - VS Code의 Copilot 메뉴에 관한 기본적인 설정들을 변경해 봅니다. 

## [Task 2](/Task02/README.md): 가위, 바위, 보 게임 만들기 (Copilot Chat사용)
 - GitHub Copilot과 함께 가위, 바위, 보 게임을 만들어 봅니다.
 - Copilot을 통해 테스트 코드를 작성해 봅니다.
 - 이미지를 Copilot Chat에 이미지를 통해 코드를 제안받아 봅니다.

## [Task 3](/Task03/README.md): 영어 단어장 앱 만들기 (Part 1) (Copilot Edit 사용)
 - 실제 영어 단어장 앱을을 빌드하면서 GitHub Copilot의 다양한 기능을 활용하는 방법을 익힙니다.
 - 기본 GPT-4o 모델 외에, 다른 모델을 활용해 봅니다. 
 - @project를 활용하여 질문에 대해 Copilot이 프로젝트 전체에서 관련된 파일들을 참조하는 방법을 익힙니다.
 - Copilot Edits 기능을 활용하여 더욱 편리하게 GitHub Copilot을 사용할 수 있는 방법을 익힙니다. 

## 설명: GitHub Copilot Prompt Engineering 
 - GitHub Copilot을 활용할 때의 프롬프트 엔지니어링 방법에 대해 설명 드립니다. 
 - [Best practices for using GitHub Copilot in VS Code](https://code.visualstudio.com/docs/copilot/prompt-crafting)
 - [IDE에서 GitHub Copilot 사용 팁, 트릭과 모범 사례](https://github.blog/developer-skills/github/how-to-use-github-copilot-in-your-ide-tips-tricks-and-best-practices/)
 - [프롬프트엔지니어링과 LMM에 대한 개발자 가이드](https://github.blog/ai-and-ml/generative-ai/prompt-engineering-guide-generative-ai-llms/)
 - [Introduction to prompt engineering with GitHub Copilot](https://learn.microsoft.com/training/modules/introduction-prompt-engineering-with-github-copilot//?WT.mc_id=academic-113596-abartolo)
 - [GitHub Copilot에게 더 좋은 프롬프트를 작성하기 위한 예제와 모범사례](https://github.blog/developer-skills/github/how-to-write-better-prompts-for-github-copilot/)


## [Task 4](/Task04/README.md): 영어 단어장 앱 만들기 (Part 2) (Copilot Agent 사용)
 - Copilot Agent를 활용하여, 영어 단어장 앱의 나머지 기능을 구현합니다. 
 - Copilot chat에서 '/'를 입력하고 /fix를 통해 에러 메세지를 붙여넣고 문제 해결을 요청해 봅니다. 
 - `@project` 를 통해 Copilot의 도움을 받으며 에러를 해결합니다.
 - 디버깅 실행 후 모바일 화면의 에러를 화면 캡쳐하고 이미지를 통해 Copilot에게 문제 해결을 요청합니다.

## [Task 5](/Task05/README.md): Test 코드 작성
 - Copilot Edit 혹은 Agent 모드를 활용하여, 유닛 테스트와 계측 테스트 코드 생성을 실습합니다.
 - 저장소의 변경 사항을 커밋할 때, GitHub Copilot을 활용하여 커밋 메세지를 자동으로 생성합니다.

## [Task 6](/Task06/README.md): 코드 리팩토링, 보안 문제 확인
 - GitHub Copilot Chat을 활용해 코드를 리팩토링 하는 예제를 실습합니다.
 - GitHub Copilot Chat을 활용해 문제점을 찾고, 해결 방법을 제안 받습니다..

## [Task 7](/Task07/README.md): CI/CD 파이프라인 실습
 - GitHub Copilot을 사용해 GitHub Actions의 워크 플로우 생성을을 실습하는 예제입니다




