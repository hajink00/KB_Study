<template>
  <div id="app" class="container-lg">
    <div class="card card-body bg-light">
      <div class="title">우리반 Contact ❤️</div>
    </div>

    <!-- 연락처 입력 폼 -->
    <ContactForm @addnewContact="addNew" />

    <!-- 연락처 목록 -->
    <ContactList :contacts="contacts" @deleteContact="delCon" />
  </div>
</template>

<script>
import ContactForm from './components/ContactForm.vue';
import ContactList from './components/ContactList.vue';

export default {
  name: 'App',
  components: { ContactForm, ContactList },
  data() {
    return {
      contacts: [
        {
          id: 1,
          name: '홍길동',
          gender: '남',
          age: 20,
          email: 'hong@example.com',
          github: 'hongGD',
          isEditing: false,
        },
        {
          id: 2,
          name: '짱구',
          gender: '남',
          age: 7,
          email: 'janggu@example.com',
          github: 'janggu',
          isEditing: false,
        },
        {
          id: 3,
          name: '유리',
          gender: '여',
          age: 7,
          email: 'yuri@example.com',
          github: 'yuri',
          isEditing: false,
        },
      ],
    };
  },
  methods: {
    /* contact 추가 */
    addNew(newContact) {
      // console.log(newContact);
      newContact.id = this.contacts.length + 1;
      this.contacts.push(newContact);
    },
    /* contact 삭제 */
    delCon(id) {
      //emit 통해서 받은 데이터를 id라고 해당 함수에서 명명하겠다
      let index = this.contacts.findIndex((item) => id === item.id);
      console.log(index);

      // splice(시작index, 삭제개수)
      this.contacts.splice(index, 1);
    },
  },
};
</script>
