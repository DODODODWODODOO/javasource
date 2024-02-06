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
  private String color;
  private int channel;
  private boolean power;

  void channelUp() {
    channel++;
  }

  void changeDown() {
    channel--;
  }

  // 생성자 오버로딩
  // Tv(){}

  public Tv() {}

  public Tv(String color, int channel, boolean power) {
    this.color = color;
    this.channel = channel;
    this.power = power;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }
}
