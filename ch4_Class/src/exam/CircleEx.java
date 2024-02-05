package exam;

public class CircleEx {

  public static void main(String[] args) {
    // Circle 객체 생성
    Circle circle = new Circle(3.5);
    //circle.radius=3.5

    // 원의 면적 구하기 호춯
    double result = circle.getArea();
    System.out.println("원의 면적 : " + result);
  }
}
