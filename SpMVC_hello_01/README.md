# Spring Project 시작하기
- Spring Legacy Project > Spring MVC Project 생성
- Base-package 3단계 package 로 작성 : com.hee462.hello
- views/home.jsp 삭제 후 다시 작성
- home.jsp 에 보여줄 메시지 추가
- Run As > Run On Server를 실행하여 서비스 Start

## 생성한 Project 설정 변경
- Template 로 생성한 Spring Project 는 오래된 버전의 설정이 되어 있다.
- 새로운 버전으로 다시 리모델링하기
- pom.xml에 설정된 값들을 변경하기

## pom.xml의 설정값들

### property
- IT 개발과 관련된 용어 중 변수,속성,Var,varrialbe,Attribute,Property 등은 모두 같은 용어이다
- template 으로 설정된 pom,xml 속성들 대부분 오래된 설정이
```xml
	<properties>
		<java-version>11</java-version>
		<org.springframework-version>5.2.24.RELEASE</org.springframework-version>
		<org.aspectj-version>1.6.10</org.aspectj-version>
		<org.slf4j-version>1.7.36</org.slf4j-version>
	</properties>
```

### dependency
- maven project에서 3rd party LIB를 설정하는 부분
### plugin
-Spring Project의 근간인 maven project가 사용할 여러가지 도구설정
- plugin 중에서 maven-compiler-plugin의 설정을 변경
- 이 plugin 은 java 소스 코드를 컴파일하고 실행하는 보조도구이다.
- 이 pulgin은 작성하고 있는 project를 컴파일하고 실행하는 java버전을 설정해주어야한다.
- 여기 source와 target 이 값으로 설정되어 있는데 위에서 설정한 property 로 변경해준다
```xml
<plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.5.1</version>
                <configuration>
                    <source>${java-version}</source>
                    <target>${java-version}</target>
                    <compilerArgument>-Xlint:all</compilerArgument>
                    <showWarnings>true</showWarnings>
                    <showDeprecation>true</showDeprecation>
                </configuration>
            </plugin>
```
-login 첫번째 
```
    <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>${org.slf4j-version}</version>
        </dependency>
```
-위 코드 제외하고 inject까지 모두 삭제 후 logback 입력
```
<!-- https://mvnrepository.com/artifact/ch.qos.logback/logback-classic -->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.2.12</version>
        </dependency>

```
```<scope> 태그 지우기```
- <!-- Test --> 바로 위
```
<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.28</version>
            <scope>provided</scope>
        </dependency>
```
lombok 입력
서버 오른쪽  maven -> update project 후 서버 재로딩 진행하면 
                     jdk 및 다른 버전 업데이트 완료 됬는지 확인 필