import { createApp } from 'vue';
//import App from './App.vue' // 프록시 서버
//import App from './App1.vue'; // 프로미스 객체
//import App from './App2.vue'; // async/await
//import App from './App3.vue';
//import App from './App4.vue';
//import App from './App5.vue'; // 프로미스로 에러 처리
import App from './App6.vue'; // async/await로 에러 처리
import router from './router';

const app = createApp(App);

app.use(router);

app.mount('#app');
