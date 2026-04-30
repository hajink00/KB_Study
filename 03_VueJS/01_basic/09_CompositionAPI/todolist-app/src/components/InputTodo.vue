<template></template>
<script setup>
import { ref } from 'vue';

let todo = ref('');
const emit = defineEmits(['add-todo']);

const addTodoHandler = () => {
  if (todo.value.length >= 3) {
    emit('add-todo', todo.value);
    todo.value = '';
  }
};
</script>
