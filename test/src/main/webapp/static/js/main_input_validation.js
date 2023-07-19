document.addEventListener("DOMContentLoaded", () => {
  const inputs = document.querySelectorAll("form.main input");
  inputs[INPUT_INDEX.C_CARNUM].addEventListener("blur", (e) => {
    const value = e.target.value;
    if (!value) {
      const error_carnum = document.querySelector("div.error.c_carnum");
      error_carnum.classList.add("on");
      error_carnum.innerHTML = "* 차량번호는 반드시 입력하세요";
      e.target.focus();
      return false;
    } else {
      fetch(`${rootPath}/car_check?carnum=${value}`).then((Response) =>
        Response.json()
      ).then; //응답한 데이터 중 JSON 만 추출
      if (result == null) {
        error_carnum.classList.add("on");
        error_carnum.innerHTML = "*없는 차량번호입니다";
      } else {
        e.target.value = result.c_skm;
      }
    }
  });
  const qty_input = document.querySelector("input[name='c_qty']");
  qty_input?.addEventListener("blur", (e) => {
    const value = e.target.value;
    if (!value) {
      const error_qty = document.querySelector("div.error.c_qty");
      error_qty.classList.add("on");
      error_qty.innerHTML = "* 업무구분은 반드시 입력해야 합니다";
      e.target.focus();
      return false;
    }
  });
});
