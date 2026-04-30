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

<script>
import TodoListItem from './TodoListItem.vue';

export default {
  name: 'TodoList',
  components: { TodoListItem },
  props: { todoList: { type: Array, required: true } },
  emits: ['delete-todo', 'toggle-completed'],
};
</script>
