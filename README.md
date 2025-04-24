## 자바 강좌

### STEP1 - 수업 공지지

- 수업소스는 깃허브와 슬랙에 공유합니다.
- https://github.com/kimjoy0914/VC-java250410.git

### STEP2 - 개발도구 설치 및 설정

1. JDK21 설치

- https://www.oracle.com/kr/java/technologies/downloads/#jdk21-windows

```sh
    java -version
```

2. VSCODE 설치

- https://code.visualstudio.com/download
- 자바프로젝트 만들기 : https://logs-jejustone.tistory.com/102

3. IntelliJ설치

- https://www.jetbrains.com/ko-kr/idea/download/?section=windows

### STEP3 - 수업소스 내 계정으로 복사하기

1. Fork의 개념 이해
   - Fork : 다른 사람의 저장소를 내 계정으로 복사해 오는 것.
   - 용도 : 원본 저장소에 직접 권한이 없어도 내 계정에서 마음껏 수정, 실험 가능함.

### STEP4 - 깃 활용

1. 로컬에서 만든 브랜치 원격 저장소에 푸시하기

```sh
# day1브랜치 만들고 day1브랜치로 이동
git checkout -b day1
# 로컬에서 파일 추가나 기존 파일 수정하기
git add .
git commit -m "메시지"
git push -u origin day1
```
