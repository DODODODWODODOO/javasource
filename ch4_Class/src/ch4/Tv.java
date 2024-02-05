package ch4;

// 맴버변수 초기값
// String : null
// int,long : 0
// float, double : 0.0
// char : ' '
// boolean : flase

// 클래스 : 설계도
// 객체 : 실제 사용

public class Tv {

  // 색상(검,흰), 전원상태(on,off), 채널(6~....), 볼륨(13,14...),
  // 크기....(50,46....)
  String color;
  int channel;
  boolean power;

  void channelUp() {
    channel++;
  }

  void changeDown() {
    channel--;
  }
  // 생성자
  // Tv(){}
}
