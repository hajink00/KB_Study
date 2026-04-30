package main.java.ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Scanner; // new scanner 사용시 자동 출력됨

public class ArrayExample2 { // 예제 작성용 클래스
    public void ex1() {
        // 배열 선언 및 할당
        int[] arr = new int[4];

        // 1) stack 영역에 int[] 자료형 arr 선언
        // 2) heap 영역에 int 자료형 4개를 묶음으로 다루는 int[] 할당
        // 3) heap 영역에서 생성된 int[]의 시작 주소를
        //    arr에 대입하여 참조하는 형태를 만든다.

        // 배열의 길이 : 배열명.length
        System.out.println("배열의 길이 : " + arr.length);

        // 배열에 값 대입하기
        // 1. 일반 for문
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100;
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }

        // 2. 향상된 for문
        // 작성법 : for( 자료형 변수명(선언) : 배열명 또는 컬렉션명){}
        // -> index가 필요한 경우에는 일반 for문 사용
        int i = 0;
        for (int num : arr) { // arr안의 값 하나씩
            System.out.printf("arr[%d] : %d\n", i, num);
            i++;
        }
    }

    public void ex2() {
        // 숙제
        // 입력 받은 양의 정수 만큼의
        // 크기를 가지는 배열 만들기

        // [평균 점수 구하기]
        // 입력 받을 인원 수 : 4
        // 1번 점수 입력 : 100
        // 2번 점수 입력 : 20
        // 3번 점수 입력 : 50
        // 4번 점수 입력 : 90

        // 합계 : 260 점
        // 평균 : 65 점
        //-----------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 인원 수 : ");
        int num = sc.nextInt();

        // 배열 생성
        int[] scores = new int[num];
        int sum = 0;


        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 점수 입력 : ", i + 1);
            scores[i] = sc.nextInt();
            // 입력 받은 정수를 배열 요소에 저장

            sum += scores[i];
        }
        // 평균 계산
        // 정확한 평균(소수점) 계산 위해 int를 자동 형변환 (int/int = int 출력)
        double avg = (double) sum / num;


        System.out.println("합계 : " + sum + " 점");
        System.out.println("평균 : " + avg + " 점");
    }

    public void ex3(){
        // 저녁 메뉴 뽑기

        // 배열 선언과 동시에 초기화
        String[] menu = {"햄버거", "돈까스", "삼겹살", "아구찜", "파스타", "서브웨이"}; // 배열 초기화


        // 난수 발생시켜서 메뉴 출력
        // () : 우선순위 지정
        int random = (int) (Math.random() * 6);
        // 0.0 <= x < 1.0
        // 0.0 <= x * 6 < 6.0
        // 0.0 <= (int)(x * 6) < 6.0

        System.out.println(random);
        System.out.println("저녁 메뉴 추천 : " + menu[random]);
    }
}
