# Mybatis Mapper

- Mybatis는 Dao interface를 만들고 @Select, @Insert,@Update,@Delete등의 Annotation을 사용하여 간단하게 SQL을 만들수 있다
- Annotation에 설정된 SQL명령문을 사용하여 실제 DBMS와 통신하는 class 코드를 작성한ㄷ
- 개발자는 interface를 만들고 Annotation을 사용한 SQL만 잘 작성하면 나머지는 Mybatis가 알아서 수행한다
- Annotation을 이용한 SQL작성은 Mybatis 3.5 이상에서만 사용할수 있다.
- 또한 Annotaion 방식은 다소 복잡한 SQL을 작성하는데 어려움이 있을 수 있다
- Mybatis는 전통적으로 `mapper.xml`을 사용하여 SQL 을 작성하도록 하였다.

## mapper.xml 을 이용한 Mybatis코딩
- Dao interface에는 메서드 정의만 하고,`/mapper/` 폴더에 mapper.xml 파일을 생성하여
여기에 SQL코드를 작성한다.
- 매우 복잡하고, 복합적인 SQL 문도 비교적 쉽게 작성할수있다.
-` SQL Developer`등과 같은 도구를 사용하여 복잡한 SQL을 테스트하고, 완성된 코드를 복사 붙이기 방법으로 mapper.xml에 사용할 수있다
- Annotation 방식에서 문자열 이어붙이기 등으로 작성했던 SQL을 좀더 쉽게 작성 할 수 있다.
-`DOCType Mapper` 형식의 xml 파일의 구조를 가지며,`namespace`항목에 Dao interface의 Path와 
파일을 지정해 두고, `<select></select>` 등과 같은 tag 를 사용하여 SQL 명령을 작성한다
- 이때 tag에는  id 속성을 부여하는데  이 id에 Dao의 metho이름을 지정한다.