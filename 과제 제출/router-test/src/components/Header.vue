<template>
  <nav class="navbar navbar-expand-md bg-dark navbar-dark mt-2">
    <span class="navbar-brand">이날치(LeeNalChi)</span>
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div :class="navClass">
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link class="nav-link" to="/">홈</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/about">소개</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/members">멤버</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/videos">영상</router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
import { reactive, computed } from 'vue';

export default {
  setup() {
    // 기본 토글 닫음 상태 state 변수에 저장
    const state = reactive({ isNavShow: false });

    // state 상태값에 따른 토글 열림/닫힘 속성 지정
    const navClass = computed(() =>
      state.isNavShow
        ? 'collapse navbar-collapse show'
        : 'collapse navbar-collapse',
    );
    // 버튼 누를때마다 state 속성 값 반대로 바꿔줌
    const changeIsNavShow = () => {
      state.isNavShow = !state.isNavShow;
    };
    return { state, changeIsNavShow, navClass };
  },
};
</script>

<style scoped></style>
