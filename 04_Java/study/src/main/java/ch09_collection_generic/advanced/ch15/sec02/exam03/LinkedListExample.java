package main.java.ch09_collection_generic.advanced.ch15.sec02.exam03;

import main.java.ch09_collection_generic.advanced.ch15.sec02.exam01.Board;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Board 클래스를 저장하기 위한 ArrayList 인스턴스 생성
        LinkedList<Board> list = new LinkedList<>();

        // 2. Board 클래스의 인스턴스 5개를 생성하여 ArrayList에 추가
        Board board1 = new Board("subject1", "content1", "writer1");
        Board board2 = new Board("subject2", "content2", "writer2");
        Board board3 = new Board("subject3", "content3", "writer3");
        Board board4 = new Board("subject4", "content4", "writer4");
        Board board5 = new Board("subject5", "content5", "writer5");

        list.add(board1);
        list.add(board2);
        list.add(board3);
        list.add(board4);
        list.add(board5);

        // 3. ArrayList에 저장된 요소의 개수 출력
        System.out.println("list요소 개수 : " + list.size());

        // 4. 3번째 데이터를 추출하여 출력
        System.out.println("3번째 데이터 : " + list.get(2));

        // 5. 일반 for문으로 순회하면서 리스트의 각 요소를 출력
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        // 6. 인덱스 2에 해당하는 요소 제거

        list.remove(2);

        // 7. 향상된 for문으로 순회하면서 리스트의 각 요소를 출력
        for (Board b:list){
            System.out.println(b);
        }
    }
}
