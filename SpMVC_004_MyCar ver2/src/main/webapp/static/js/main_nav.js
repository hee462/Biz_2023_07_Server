document.addEventListener("DOMContentLoaded", () => {
  const nav = document.querySelector("nav.main");
  const nav_login = document.querySelector("li.login");
  const nav_join = document.querySelector("li.join");
  /*
    event 핸드러의 매개변수(e)
    e.currentTarget과 e.target 속성이 기본으로 포함되어 있다
    이때 e.currentTarget은 event 핸들러가 부착된 tag(nav.main)이고
    e.target은 event 버블링에 의해 가장 안쪽에서 실제 event가 적용되는 tag(li)
  */
  const navClivkHandler = (e) => {
    const current = e.currentTarget; //nav.ain
    const target = e.target; //li

    if (target.tagName == "LI") {
      const targetClassName = target.className;
      let URL = `${rootPath}` + targetClassName;
      const USER_URL = "user login join mypage logout";
      if (targetClassName === "home") {
        URL = `${rootPath}`;
        //   } else if (targetClassName === "mycar") {
        //     URL += targetClassName;
        //   } else if (targetClassName === "tarcho") {
        //     alert("tacho");
        //   } else if (targetClassName === "login") {
        //     alert("Nav를 클릭한 login");
        //   }
        /*
        문자열.indexOf("찾는문자열")
        문자열 내에 찾는문자열이 있으면 0이상의 위치값을 return 없으면 -1을 return

        문자열.search("찾는문자열")
        정규표현식으로 문자열 찾기 가능
        */
      } else if (USER_URL.indexOf(targetClassName) > -1) {
        URL = `${rootPath}user/` + targetClassName;
      }
      document.location.href = URL;
    }
  };
  // event bobbling 을 활용하여 한개의 event를 설정하여 할일들 처리하기
  nav?.addEventListener("click", navClivkHandler);
  // 개별적인 LI tag에 click event 를 설정하여
  // nav을 선택했을때 할일들 지정
  //   nav_login?.addEventListener("click", () => {
  //     alert("login 나 클릭");
  //   });
  //   nav_login?.addEventListener("click", () => {
  //     alert("login 나 클릭2");
  //   });
  //   nav_join?.addEventListener("click", () => {
  //     alert("join");
  //   });
});

/*
0, "", undefined,NaN, null 값이 if()명령을 만나면
이 값들은 false로 취급한다
const 변수 =0;
if(변수){
    console.log(`이 값은 0이 아님 ${변수}`)
}else{
    console.log(`이 값은 false로 취급 ${변수}`)
}

const 변수1 ="";
const 변수2;
const 변수3 =0;
const 변수 = 변수1 && 변수2 && 변수3 && "몰라"

*/
