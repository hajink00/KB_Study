<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <TodoList
          v-for="todo in todoList"
          :key="todo.id"
          :todoItem="todoItem"
          :completed="todo.completed"
        />
      </ul>
    </div>
  </div>
</template>

<script setup>
import TodoListItem from './TodoListItem.vue';

const props = defineProps({ todoList: { type: Array, required: true } });

const emit = defineEmits(['delete-todo', 'toggle-completed']);
</script>
