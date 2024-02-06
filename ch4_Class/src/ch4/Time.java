package ch4;

// 시, 분 ,초 는 모두 0보다 크거나 같아야 한다
// 시의 범위는 0~23, 분,초의 범위는 0~59 이다
public class Time {

  // 맴버변수, 속성, 필드,
  // 인스턴스 변수 : 인스턴스 마다 다른 값 저장 가능
  //                참조변수가 없을 때 가비지컬렉터에 의해 자동 제거됨
  //                인스턴스 생성 시 (~ new ~ )
  private int hour;
  private int minute;
  private float second;

  //클래스 변수 : 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸
  private static String max;

  public int getHour() {
    return hour;
  }

  // 메소드 내부에 선언된 변수 : 지역변수
  // 메소드 종료 소멸
  // for, if => {}블럭 내부에 선언된 변수는 블럭을 벗어나는 경우 소멸
  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return; // 타입이 void 일 경우 return
    this.hour = hour; // return 떄문에 실행x
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second < 0 || second > 59) return;
    this.second = second;
  }
}
