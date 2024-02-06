package ch4;

public class MyMathEx {

  public static void main(String[] args) {
    MyMath math = new MyMath(15, 5);

    //non-static 메소드 호출
    System.out.println("add()" + math.add());
    System.out.println("subtract()" + math.subtract());
    System.out.println("multply()" + math.multply());
    System.out.println("divide()" + math.diyide());

    // static 메소드 호출
    System.out.println("static add()" + MyMath.add(300L, 200L));
    System.out.println("static subtract()" + MyMath.subtract(300L, 200L));
    System.out.println("static multply()" + MyMath.multply(300L, 200L));
    System.out.println("static divide()" + MyMath.diyide(300L, 200L));
  }
}
//인스턴스 변수 값을 변경(초기화)
// setter
// 생성자
