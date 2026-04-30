<template>
  <div class="m-3">
    <h3>존재하지 않는 경로</h3>

    <!-- 작성하기 -->
    <p>요청 경로 : {{ currentRoute.fullPath }}</p>
  </div>
</template>
<script setup>
// 요청 경로 : route에서 얻어옴
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
// console.log('라우트 정보',currentRoute)
</script>
