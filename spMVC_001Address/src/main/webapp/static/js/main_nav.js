document.addEventListener("DOMContentLoaded", () => {
  const main_nav = document.querySelector("nav.main");
  const navClivkHandler = (e) => {
    const nav_item = e.target;
    if (nav_item.tagName === "LI") {
      const nav_class = nav_item.className;
      const nav_classList = nav_item.classList;
      let location = `${rootPath}`;
      console.log("className", nav_class);

      if (nav_class === "home") {
        location += "/";
        // nav_item에  user라는 클래스이름이 있으면
      } else if (nav_classList.contains("user")) {
        /*
        class ="user login"이라면
        /user/login이라는 location을 만들고

        class ="user join"이라면
        /user/join 이라는 location을 만들어라  
        */
        location += `/user/${nav_classList[1]}`;
      } else if (nav_class === "admin") {
        location += "/admin";
      }
      document.location.href = location;

      console.log("location", location);
    }
    // if (nav_item.tagName === "LI") {
    //   const nav_class = nav_item.className;
    //   let location = `${rootPaht}/`;
    //   if (nav_class === "home") {
    //     location += `/`;
    //     // document.location.href = `${rootPaht}/`;
    //   } else if (nav_class === "login") {
    //     location += `/user/login`;
    //   } else if (nav_class === "join") {
    //     location += `/user/join`;
    //     // document.location.href = `${rootPaht}/user/join`;
    //   } else if (nav_class === "logout") {
    //     location += `/user/logout`;
    //     // document.location.href = `${rootPaht}/user/logout`;
    //   } else if (nav_class === "mypage") {
    //     location += `/user/mypage`;
    //     // document.location.href = `${rootPaht}/user/mypage`;
    //   } else if (nav_class === "admin") {
    //     location += `/admin`;
    //     // document.location.href = `${rootPaht}/user/admin`;
    //   } else {
    //     location += "/";
    //   }
  };
  main_nav?.addEventListener("click", navClivkHandler);
});
