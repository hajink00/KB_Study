<template>
  <h3>watch() 예제</h3>
  <div>
    X : <input type="text" v-model.number="x" /> <br />

    <div>결과 : {{ result }}</div>
  </div>
</template>
<script>
import { ref, watch } from 'vue';

export default {
  name: 'Calc5',
  setup() {
    const x = ref(0);
    const result = ref(0);

    /* watch()
      - 반응형 데이터의 변활르 감지하고 콜백 함수를 실행
      - 첫 번째 인자 : 감시 대상 (ref, reactive, 또는 getter 함수)
      - 두 번째 인자 : 콜백 함수 (현재 값, 이전 값)
      - 세 번째 인자 : 옵션 객체
      
      - immediate : true
      -> 최초 실행시에도 콜백 함수 실행

      - deep : true
      -> 객체/배열 내부 값 변화까지 감지
      */
    watch(
      x,
      (current, old) => {
        console.log(`old : ${old} -> currnet : ${current}`);

        result.value = current * 2;
      },
      { immediate: true }, // 세번째 인자
    );
    return { x, result, watch };
  },
};
</script>
