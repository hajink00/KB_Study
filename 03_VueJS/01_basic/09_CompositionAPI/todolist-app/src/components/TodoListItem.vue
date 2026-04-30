<template>
  <li
    class="list-group-item"
    :class="{ 'list-group-item-success': todoItem.completed }"
  >
    <span class="pointer" :class="{ 'todo-done': todoItem.completed }">
      {{ todoItem.todo }}
    </span>
  </li>
</template>
<script setup>
const props = defineProps({ todoItem: { type: Object, required: true } });
</script>
