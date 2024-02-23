package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaEx5 {

  // Arrays.asList() : 배열을 리스트로 변환
  // Integer arr[]={1,2,3,4,5};
  // List<Integer> list2 = Arrays.asList(arr);
  // list2=Arrays.asList(5,6,7,8,9);

  private static List<Student> list = Arrays.asList(
    new Student("홍길동", 100, 98),
    new Student("김길동", 80, 78)
  );

  // list.add(new Student("홍길동", 100, 98));
  // list.add(new Student("김길동", 80, 78));
  public static void main(String[] args) {
    // 학생 이름 출력
    // list.forEach(stu -> System.out.println(stu.getName()));

    // 수학 점수 출력
    // list.forEach(stu -> System.out.println(stu.getMath()));

    // 국어 점수 출력
    // list.forEach(stu -> System.out.println(stu.getKor()));

    System.out.println("===== [학생 이름] =====");

    // Function 을 이용한 이름출력
    // Function<Student,String> function = stu -> stu.getName();
    // System.out.println(function.apply(list.get(0)));
    // System.out.println(function.apply(list.get(1)));

    printString(stu -> stu.getName());

    System.out.println("===== [국어 점수] =====");
    printInt(stu -> stu.getKor());

    System.out.println("===== [수학 점수] =====");
    printInt(stu -> stu.getMath());
  }

  // Function<T,R> R applt(T t)
  static void printString(Function<Student, String> function) {
    // System.out.println(function.apply(list.get(0)));
    // System.out.println(function.apply(list.get(1)));
    for (Student student : list) {
      System.out.println(function.apply(student));
    }
  }

  static void printInt(ToIntFunction<Student> function) {
    for (Student student : list) {
      System.out.println(function.applyAsInt(student));
    }
  }
}
