document.addEventListener("DOMContentLoaded", () => {
  const nav = document.querySelector("nav.main");

  const navClickHandler = (e) => {
    const target = e.target;
    if (target.tagName == "LI") {
      const nav_class = target.className;
      let URL = `${rootPath}`;

      if (nav_class === "home") {
        URL += "/";
        document.URL, (href = `$[rootPath]/`);
      } else if (nav_class === "add_book") {
        URL += "/book_input";
        document.URL, (href = `$[rootPath]/book_input`);
      } else if (nav_class === "add_user") {
        URL += "/user_input";
        document.URL, (href = `$[rootPath]/user_input`);
      } else if (nav_class === "search_book") {
        URL += "/book_search";
        document.URL, (href = `$[rootPath]/book_search`);
      } else if (nav_class === "search_user") {
        URL += "/user_search";
        document.URL, (href = `$[rootPath]/user_search`);
      }
      document.URL.href = URL;
      console.log("URL", URL);
    }
  };
  nav?.addEventListener("click", navClickHandler);
});
