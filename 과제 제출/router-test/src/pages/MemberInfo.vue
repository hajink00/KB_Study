<template>
  <div class="card card-body">
    <h2>Member Info</h2>
    <div>
      경로 패턴: /members/:id <br />
      요청 경로 : {{}} <br />
    </div>
  </div>
</template>
<script>
import members from '@/members.json';
import { useRoute } from 'vue-router';
export default {
  name: 'MemberInfo',
  setup() {
    const currentRoute = useRoute();
    // 전달된 id를 꺼내서 id로 json에서 개인정보 검색한 후
    // 개인정보 return하면 template에 출력
    return {};
  },
};
</script>
<style></style>
