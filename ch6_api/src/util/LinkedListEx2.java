package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

  public static void main(String[] args) {
    // ArrayList 와 LinkedList 성능 차이
    // 순차적으로 추가/ 삭제시 ArrayList 가 LinkedList 보다 빠르다
    // 중간 데이터를 추가/삭제 시 LinkedList 가 ArrayList 보다 빠르다

    ArrayList<String> aList = new ArrayList<>(2000000);
    LinkedList<String> linkedList = new LinkedList<>();

    System.out.println("순차적 추가 비교");
    System.out.println("ArrayList : " + add1(aList));
    System.out.println("LinkedList : " + add1(linkedList));
    System.out.println("============================");
    System.out.println("중간 추가 비교");
    System.out.println("ArrayList : " + add2(aList));
    System.out.println("LinkedList : " + add2(linkedList));
    System.out.println("==============================");
    System.out.println("중간 삭제 비교");
    System.out.println("ArrayList : " + remove2(aList));
    System.out.println("LinkedList : " + remove2(linkedList));
    System.out.println("==============================");
    System.out.println("순차 삭제 비교");
    System.out.println("ArrayList : " + remove1(aList));
    System.out.println("LinkedList : " + remove1(linkedList));
  }

  public static long add1(List<String> list) {
    long start = System.currentTimeMillis(); // 밀리세컨드
    for (int i = 0; i < 1000000; i++) {
      list.add(i + ""); // 리스트에 순차적 추가
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long add2(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.add(500, "X"); // 중간 추가
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long remove1(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = list.size() - 1; i >= 0; i--) {
      list.remove(i); // 순차적 삭제
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long remove2(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.remove(i); // 중간 삭제
    }
    long end = System.currentTimeMillis();
    return end - start;
  }
}
