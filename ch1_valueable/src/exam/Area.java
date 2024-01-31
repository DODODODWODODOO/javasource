package exam;

public class Area {

  public static void main(String[] args) {
    // 사다리꼴의 넓이를 구한 후 출력
    // 윗변 + 아랫변 * 높이 / 2
    // 소수점 2자리까지 출력
    int top = 8;
    int bottom = 15;
    int height = 5;

    double area = (top + bottom) * height / 2.0; // 셋중 하나만 큰 타입으로 변경 예) (double) .0
    System.out.printf("사다리꼴 넓이 : %.2f", area);
  }
}
