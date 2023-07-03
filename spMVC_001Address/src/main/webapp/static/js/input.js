//HTML DOM 기반의 JS 코드 시작점
document.addEventListener("DOMContentLoaded", () => {
  // div.message의 index 변수
  const INDEX = {
    ID: 0,
    NAME: 1,
    TEL: 2,
    ADDR: 3,
  };

  //DOM 객체(tag 객체)

  /*
  JS의 false 판별
  어떤 변수의 값이 null, undefined, "", 0, NaN(Not a Number) 등의 값을 가질때
  변수 || 연산을 수행하면  이결과는 false 처럼 작동한다 
  const 변수  = 변수1 || 변수2 || 변수3 || 변수4 ||"없음"
  
  1. 변수1의 값이 false가 아니면 변수1의 값을 왼쪽 변수에 대입
  2. 변수2의 값이 false이면 변수2의 값을 비교
  3. 변수2의 값이 false가 아니면 변수2의 값을 왼쪽 변수에 대입
  4. 변수4까지 (변수 1 ~ 변수 4)모든 변수가 false인 값을 가지고 있으면
  5. 왼쪽 변수에는 없음 이라는 문자열이 대입된다

  let 변수 = null
  if(변수1) 변수 = 변수1
  else if(변수2) 변수 = 변수2
  else if(변수3) 변수 = 변수3
  else if(변수4) 변수 = 변수4
  else 변수없음


  */
  const form_addr =
    document.querySelector("form.main.input") ||
    document.querySelector("form.main.update");

  /* 아래 코드처럼도 사용가능하지만 위에처럼 단순한 코드 선호 */
  // let form_addr = null;
  // if(document.querySelector("form.main.input")){
  //   form_addr = document.querySelector("form.main.input")
  // }else{
  //   form_addr = document.querySelector("form.main.update")
  // }
  const input_id = form_addr?.querySelector("input[name='a_id']");
  const input_name = document?.querySelector("input[name='a_name']");
  const input_tel = document?.querySelector("input[name='a_tel']");
  const input_addr = document?.querySelector("input[name='a_addr']");

  const btn_input = document?.querySelector("button.input");
  const btn_list = document?.querySelector("button.list");

  const msg_boxs = document.querySelectorAll("div.message");
  // 두개의 매개변수를 받는 함수 선언
  const message_view = (index, className, message) => {
    const msg_box = msg_boxs[index];
    msg_box?.classList.remove("ok");
    msg_box?.classList.remove("error");

    msg_box?.classList.add(className);
    msg_box.querySelector("span").innerHTML = message;
  };

  // inline 익명 함수로 click event 설청
  btn_list?.addEventListener("click", (e) => {
    // alert("리스트 버튼 클릭");
    // 현재화면에 보여줄 페이지 요청하기
    document.location.href = `${rootPath}`;
  });
  // event call 함수 선언
  const inputButtonClickHandler = (e) => {
    // alert("추가 버튼 클릭");
    // JS 코드에서 form에 포함된 button을 클릭했을때
    // Server로 데이터를 전송하라
    // input_id = document.quertySelector("form.main input[name='a_id']")

    for (let i = 0; i < msg_boxs.length; i++) {
      // 저장하고 메세지를 지워주쟈
      msg_boxs[i].classList.remove("ok");
      msg_boxs[i].classList.remove("error");
    }

    if (input_id && !input_id.value) {
      // const msg_box = msg_boxs[INDEX.ID];
      // msg_box.classList.remove("ok");
      // msg_box.classList.add("error");
      // msg_box.querySelector("span").innerHTML = "*ID는 반드싱 입력해야합니다";

      message_view(INDEX.ID, "error", "*ID는 반드시 입력해야 합니다");

      input_id.focus();
      return false;
    }

    if (!input_name.value) {
      message_view(INDEX.NAME, "error", "* 이름은 반드시 입력해야 합니다");
      input_name.focus();
      return false;
    }
    if (!input_tel.value) {
      message_view(INDEX.TEL, "error", "* 전화번호는 반드시 입력해야 합니다");
      input_tel.focus();
      return false;
    }
    const tel_rexp = /^\d{3}-\d{3,4}-\d{4}$/;
    if (!tel_rexp.test(input_tel.value)) {
      message_view(
        INDEX.TEL,
        "error",
        "전화번호 형식이 다릅니다(010-0000-0000)"
      );
      input_tel.focus();
      input_tel.select();
      return false;
    }
    if (!input_addr.value) {
      message_view(INDEX.ADDR, "error", "* 주소는 반드시 입력해야 합니다");
      input_addr.focus();
      input_addr.select();
      return false;
    }
    if (confirm("저장할까요?")) {
      form_addr?.submit();
    }
  };
  btn_input?.addEventListener("click", inputButtonClickHandler);

  input_id?.addEventListener("blur", async (e) => {
    const value = e.target.value;
    const idCheck_url = `${rootPath}/id_check?id=${value}`;

    if (!value) {
      message_view(INDEX.ID, "error", "*ID를 입력해주세요");
      input_id.focus();
      return false;
    }

    const response = await fetch(idCheck_url);
    const result = await response.text();
    if (result === "OK") {
      message_view(INDEX.ID, "ok", "* 사용가능한 ID 입니다");
    } else if (result === "FAIL") {
      message_view(INDEX.ID, "error", "* 이미추가된 ID 입니다");
      input_id.focus();
    } else {
      message_view(INDEX.ID, "error", "서버오류");
      input_id.focus();
    }
  });
});
