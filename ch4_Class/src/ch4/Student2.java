package ch4;

public class Student2 {

  // 맴버변수(= 인스턴스 변수, property, 속성, 필드) - 학생 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동), 주소(서울시 종로구),
  // 주민번호(071215-2011237), 핸드폰번호(010-1234-5678),
  private String id; //학번저장
  private String name;
  private String addr;
  private String hp;

  // 맴버 메소드( = 인스턴스 메소드 , 기능)
  // 속성을 변경시킬 수 있도록 메소드 작성
  // 메소드(== 함수) 작성 규칙
  // 타입 메소드명(){}
  // return type : 정수형, 실수형, 불린형, 문자형, String, 배열, void
  void changeAddr(String addr) {
    // 맴버변수 addr 의 값을 변경
    this.addr = addr;
    // 리턴 값은 없음
  }

  void changeHp(String hp) {
    this.hp = hp;
  }

  // 생성자(constructor) : 맴버변수 초기화(초기화를 안하면 기본 값이기 때문에)
  // 클래스를 객체로 생성할 때 필수로 필요
  Student2() {}

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
  }

  Student2(String id, String name, String addr, String hp) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp;
  }

  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
  }
}
