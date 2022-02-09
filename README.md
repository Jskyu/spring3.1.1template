## SPRING LEGACY 3.1.1 RELEASE Template
```
OS : WINDOWS 10
IDE : Eclipse Java EE IDE (java-luna-SR2-x86-64)
Java : JDK 1.8.0.*
Server : Apache Tomcat 8.0.26
DataBase : Oracle 11g Express Edition 11.2
```

## SETTINGS
`Eclipse Luna SR2`            [**download**](https://www.eclipse.org/downloads/packages/release/luna/sr2)<br/>
`JDK 1.8.0.*`                 [**download**](https://www.oracle.com/java/technologies/downloads/#java8)<br/>
`Apache Tomcat 8.0.26`        [**download**](https://archive.apache.org/dist/tomcat/tomcat-8/v8.0.26/bin/)<br/>
`Oracle Express Edition 11.2` [**download**](https://www.oracle.com/database/technologies/xe-prior-release-downloads.html)<br/>

1. 윈도우 검색 - 시스템 환경 변수 편집 - 고급 - 환경 변수 `JAVA_HOME`, `CLASSPATH` 설정
2. 다운로드 받은 Eclipse 폴더 - `eclipse.ini`에서 `JavaVersion=1.8` 로 변경
3. `eclipse` 실행 후 help - Eclipse MarketPlace에서 `sts` 검색, `Spring Tools 3 Add-On For Spring Tools 4 3.9.21.RELEASE` 또는 `3버전` 선택
4. 다운로드 완료 후 `eclipse` 재실행
5. `eclipse` 우측 상단 `JAVA EE` -> `Spring` 으로 변경
6. Window - Preferences - JAVA - Installed JREs - `JDK 1.8.0.*` 설정
7. 좌측 `Package Explorer` 우클릭 - New - Server `Apache` 폴더 하위 `Tomcat v8.0 Server` 생성
8. Template `import`
9. `import` 완료 후 프로젝트 우클릭 - Build Path - Add Libraries.. - `Server Runtime` - `Apache Tomcat v8.0`
10. 프로젝트 우클릭 - Build Path - Configure Build Path... 클릭 후 `jdk` 확인
11. 프로젝트 우클릭 - maven - Update Project...
12. 프로젝트 우클릭 - Run As - Maven Clean, Install
13. `server` 실행

## ISSUE
`MAVEN PLUGIN 2.6 ERROR` https://stackoverflow.com/questions/31316339/how-to-solve-maven-2-6-resource-plugin-dependency
