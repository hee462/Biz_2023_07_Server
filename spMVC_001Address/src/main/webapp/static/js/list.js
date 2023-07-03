/*
이벤트 버블링을 역 이용한 이벤트 핸들링 간소화하기

List 화면에서 항목을 클릭했을때, Detail 주소정보를 보여주는 화면으로 화면전환을 하려고한다
사용자가 List의 어딘가를 클릭하면 그 클릭한 event를 설정을 해야한다
List에서 최종적으로 클릭되는 요소는 Table> Tr > Td 에서 Td 요소가 된다
현재 화면에 10명의 주소가 보이고 있는데, 이 화면의 Td요소에 이벤트 핸들링을 수행하려면 40개의 이벤트를 설정해야한다

이러한 방식은 코드 작성은 그리 많이 어렵지 않으나, 실제 작동되는 과정에서 많은 문제를 일으킬 수 있다.

JS에서 querySelectAll() 을 사용하여 만든 List에 event 핸들링을 설정하는 것은 매우 불합리한 코드가 될 수 있다

이럴때는 querySelectAll()을 사용해야하는 tag 들을 감싸고 있는 부모 tag를 살펴야 한다.
어떤 부모 tag에 event 핸들링을 설정하면 
가장 작은 개수의 event 핸들링을 설정할 수 있을까 고민해야 한다

여기에서는 table 자체의 event 핸들링을 설정하였다.
event 코드 내에서 최종적으로 어떤 tag가 선택(클릭) 되는지를 살피고
그 tag가 클릭 되었을때 실제 필요한 코드를 작성한다

*/

document.addEventListener("DOMContentLoaded", () => {
  /*td 의 갯수는 40개 그러므로 총 click event가 40개가 설정된다*/
  // const tdList =document.querySelectorAll("table.main td")
  // for(let i=0; i<tdList.length; i++){
  //   tdList[i].addEventListener("click" ,(e) =>{
  //     //td 를 클릭했을때 수행할 event 코드들
  //   })
  // }
  /*table을 Select 하고 */
  const list_table = document.querySelector("table.main.list");

  // table에 click 할때 사용할 event 핸들러
  // 실제로는 table > tr > "td" 을 감지하여 이벤트 실행됨
  const trClickHander = (e) => {
    // table > tr > td 을 클릭했을때 최종적으로 클릭되는 요소는 TD이다
    // 최종적으로 클릭되는 요소를 e.target 이라고 한다
    const td = e.target;
    // 최종적으로 click 된 요소가 TD인지 확인하고
    if (td.tagName === "TD") {
      //td를 감싸고 있는 TR중에서 가장 가까운 tag
      const tr = td.closest("TR");
      // data-id의 속성에 설정되어 있는 값을  가져오기
      const id = tr.dataset.id;
      document.location.href = `${rootPath}/detail?id=${id}`;
      alert(id);
    }
  };
  list_table?.addEventListener("click", trClickHander);
});
