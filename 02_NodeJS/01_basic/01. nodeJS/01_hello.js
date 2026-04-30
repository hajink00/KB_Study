// 실행하기
// 1) 터미널 열기 : ctrl + shift + `
// 2)cmd로 변경
// 3) node 파일명.js
// (주의!!) 꼭 저장하고 실행하세요!

const c = require('ansi-colors');

function hello(name) {
  console.log(c.green(name) + ' 님, 안녕하세요?');
}

hello('홍길동'); // 함수 호출
