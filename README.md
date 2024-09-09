# Cloud-Sample

## 프로젝트 설명
샘플 프로젝트를 사용하여 CI pipeline을 사용하여 Application 배포하는 법을 학습합니다.

## 설치 방법
1. 프로젝트를 fork하여 사용자별 repo에서 작업합니다.

2. fork한 프로젝트에 `gradle.setting` 또는 `pom.xml` 파일을 열어 gradle 빌드하는경우 `rootProject.Name`를 원하는 프로젝트 명으로 변경, 
   maven인경우 `<name><\name>`에 원하는 프로젝트명으로 변경합니다.

## 학습 내용
- Kubernates ConfigMap을 사용하여 환경에 따른 Application yml적용을 실습합니다.
- Github Actions을 사용하여 Build(gradle, maven, ACR) 실습합니다.
- AKS에서 DB 접속 실습합니다.

## 샘플 Pipeline
- CI: [Maven pipeline](https://github.com/axccoe/cloud-sample/blob/main/.github/workflows/ci-maven.yml), [Gradle pipline](https://github.com/axccoe/cloud-sample/blob/main/.github/workflows/ci-gradle.yml)

## 기능 목록
- TODO List 목록 조회, 삭제, 수정.
- JPA를 사용하여 스키마 및 샘플 데이터 생성.
- 로컬용 h2 mem db 샘플.
- 개발용 postgresql 접속 템플릿.
- 파일업로드&다운로드 로컬 실행시(application-local.yml에 pvc.path 파일저장 경로 설정 기본값 c:\temp)

## Application 동작 방법
- 웹브라우저에서 서버 또는 로컬 8080 포트로 접속
~~~
http://[hostname]:8080
~~~

## DB 접속 예제
~~~yaml
  datasource:
    # jdbc driver
    driver-class-name: org.postgresql.Driver
    # url: jdbc:postgresql://localhost:5432/postgres
    url: jdbc:postgresql://[hostname]:[port]/[database]
    # 사용자명
    username: sa
    # 비밀번호
    password: 1234
~~~
