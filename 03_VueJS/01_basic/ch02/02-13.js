let obj = { result: 0 };
obj.add = function (x, y) {
  function inner() {
    this.result = x + y; //this가 호출된 함수가 메서드가 아닌 전역함수임 -> 해당 this는 obj가 아닌 전역을 받음
  }
  inner(); // 다시 inner 호출시 result 값이 전역에 저장. obj와는 상관 X

  /* JavaScript에서 일반 함수의 this는 호출방식에 따라 결정됨
  inner()함수는 단독으로 호출되었기 때문에 그 안의 this는 전역 객체(브라우저에서는 window, Node.js에서는 global)를 가리킴 */
};
obj.add(3, 4);
console.log(obj);
console.log(result);
