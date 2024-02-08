package com.project.book;

// 접근 제어자 - 클래스, 맴버변수, 메소드, 생성자
// private : 같은 클래스 내에서만 접근 가능
// default : 같은 패키지 내에서만 접근 가능 (아무것도 안 붙는 경우)
// protected : 같은 패키지 + 다른 패키지의 자손 클래스
// public : 접근 제한 없음

// 대상에 따라 사용할 수 있는 접근 제어자
// 클래스 - public or default
// 메소드, 맴버변수 - private, default, protected, public

// public > protected > default > private
public class Time {

  // 맴버 변수의 변질을 막기 위해 private
  private int hour;
  private int minute;
  private int second;

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }

  // 내부에서만 사용하는 메소드
  private void print() {}
}
