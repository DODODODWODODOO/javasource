package lang;

public class Member {

  String id;

  public Member(String id) {
    this.id = id;
  }

  // 값 비교로 equals 재정의
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member mem = (Member) obj;
      if (this.id.equals(mem.id)) {
        // String 비교할때는 equals
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Member [id=" + id + "]";
  }
}
