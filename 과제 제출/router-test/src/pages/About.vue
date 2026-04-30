<template>
  <div class="card card-body">
    <h2>About</h2>
    <p>요청 경로 : {{ currentRoute.fullPath }}</p>
  </div>
</template>
<script>
import { useRoute, useRouter } from 'vue-router';

export default {
  name: 'About',
  //setup()사용
  setup() {
    const router = useRouter();
    const currentRoute = useRoute();

    console.log(currentRoute);
    return { router, currentRoute };
  },
};
</script>
<style></style>
