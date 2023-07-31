# context setting
- Spring Project에서는 2가지 영역 (Scope)의  context가 있다.
`root-context`라고 일반적으로 부르는`context- param` 설정과 `servlet-context`라고 부르는 설정이 있다.
## root-context(`/WEB-INF/spring/root-context.xml` 파일)
- `Web.xml`의 `context-param`에 설정된 `context.xml`의 내용 부분이다.
- 이 context에 설정된 내용들은 Tomcat에서 Project로 Request가 전달될때
여러가지 설정된 항목들이 적용되어 Project 전반에 전역적으로(global public)으로 사용되는 항목들이다.
## servlet-context(`WEB-INF/spring/appServlet/*-context.xml`)
- Dispatcher Servelt 이 실행되면서 개발자가 만든 Controller, Service, Dao 등에서 사용하던 항목이다
