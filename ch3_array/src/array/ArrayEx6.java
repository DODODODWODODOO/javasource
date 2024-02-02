package array;

public class ArrayEx6 {

  public static void main(String[] args) {
    // 학생 10 명의 점수를 관리
    int score[] = { 79, 88, 91, 33, 100, 45, 55, 89, 25, 74 };

    // 최고 점수 / 최저 점수 + 총합 / 평균

    // max,min 변수 사용/score[0] 값을 담기
    int max = score[0];
    int min = score[0];
    int total = score[0];
    for (int i = 0; i < score.length; i++) {
      if (max < score[i]) max = score[i];
      if (min > score[i]) min = score[i];
      total += score[i];
    }
    System.out.printf("최고점수%d,최저점수%d\n", max, min);
    double avg = total / (double) score.length;
    System.out.printf("총합%d, 평균%.2f\n", total, avg);
  }
}
