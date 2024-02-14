package enumtest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumEx {

  public static void main(String[] args) {
    Week today = null;

    // 오늘 날짜 가져오기
    LocalDate now = LocalDate.now();
    // System.out.println(now); // 2024-02-14

    // 오늘 날짜에 맞는 숫자를 리턴(1(월요일) ~ 7(일요일))
    DayOfWeek week = now.getDayOfWeek();

    switch (week.getValue()) {
      case 1:
        today = week.MONDAY;
        break;
      case 2:
        today = week.TUESDAY;
        break;
      case 3:
        today = week.WEDNESDAY;
        break;
      case 4:
        today = week.THURSDAY;
        break;
      case 5:
        today = week.FRIDAY;
        break;
      case 6:
        today = week.SATURDAY;
        break;
      case 7:
        today = week.SUNDAY;
        break;
      default:
        break;
    }

    System.out.println("오늘 요일 : " + today);
    if (today == week.SUNDAY) {
      System.out.println("휴식을 취합니다");
    } else {
      System.out.println("열심히 공부한다");
    }
  }
}
