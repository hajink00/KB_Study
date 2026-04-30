const user = require('./05_user.js'); //05_user.js에서 module 추출 해서 user라는 변수로 선언
const hello = require('./06_hello.js'); // 06_hello.js에서 module 추출 해서 hello라는 변수로 선언

console.log(user);
console.log(hello);

hello(user);
