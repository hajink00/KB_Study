<template>
  <div>
    <button @click="increase">좋아요 누르기</button>
  </div>
</template>

<script setup>
//01_ basic
import { useLikeStore } from '@/stores/01_basic/like';
const { increase } = useLikeStore();
</script>
