<template></template>
<script>
export default {
  name: 'InputTodo.vue',
  data() {
    return { todo: '' };
  },
  emits: ['add-todo'],
  methods: {
    addTodoHandler() {
      if (this.todo.length >= 3) {
        this.$emit('add-todo', this.todo);
        this.todo = '';
      }
    },
  },
};
</script>
