# Spring Project 시작하기
- Spring Legacy Project > Spring MVC Project 생성
- views/home.jsp 삭제 후 다시 작성

## pom.xml 수정
- Java version ->11
- spring framework 5.2.24
- slf4j 1.7.36

- maven-compiler-plugin java 버전 property 로 변경
- lombok 설정
- logback 설정

## Dto 데이터 클래스 생성하기
- Spring Framework 에서 사용하는 데이터 클래스는 모든 변수를 private로 선언한다
- 변수에 접근하기 위하여 getter, setter method를 필수로 생성한다.
- 두개의 생성자, toString() 재정의
- lombok 을 사용하여 자동 생성한다.

## Service 클래스 생성하기
- Service 클래스는 기본적으로 Service interface를 만들고,
interface를 Impl하여 작성한다
- Service 클래스에 @Service Annotation을 부착한다
- @Service Annotation이 부착된 클래스는 Spring Framework 에서 자동으로 객체를 준비하여 가지고있다.
- @Autowired 가 부착된 곳을 발견하면 자동으로 객체를 "주입하여" 사용할 준비를 해준다.
