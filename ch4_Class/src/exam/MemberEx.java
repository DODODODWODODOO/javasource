package exam;

public class MemberEx {

  public static void main(String[] args) {
    // 회원 객체 생성 ==> 생성자 호출
    // 아이디, 비밀번호, 이름 필수
    Member member = new Member("member1", "member1", "홍길동");
    // 아이디, 비밀번호, 이름, 나이, 직업
    Member member2 = new Member("member2", "member2", "성춘향", 30, "회사원");
    // Member member3 = new Member(); => 조건에 안맞음
    // grade, point => 마트 규칙에 따라 변경
  }
}
