package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Collections : 클래스
// 컬렉션(List, Set, Map)과 관련된 메소드 제공
// static 요소로 구성
// 동기화, fill(), copy(), sort(), binarySearch() 유용한 메소드 제공

// Collection : 인터페이스

public class CollectionsEx {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    // list.sort(Comparator.reverseOrder()); sort 방법 1

    // 오른쪽으로 n 칸씩 이동
    Collections.rotate(list, 2);
    System.out.println(list);

    // i 와 j 위치변경
    Collections.swap(list, 0, 2);
    System.out.println(list);

    // Collections.sort(list, Collections.reverseOrder()); // sort 방법 2
    Collections.sort(list, Comparator.naturalOrder());
    System.out.println(list);

    // binarySearch() : 오름차순 정렬이 되어야 함, 못찾으면 음수로 결과 나옴
    System.out.println(
      "3이 저장된 위치 : " + Collections.binarySearch(list, 3)
    );

    System.out.println("최대값 : " + Collections.max(list));
    System.out.println("최소값 : " + Collections.min(list));

    // list 를 하나의 값으로 채울 때
    Collections.fill(list, 9);
    System.out.println(list);
  }
}
