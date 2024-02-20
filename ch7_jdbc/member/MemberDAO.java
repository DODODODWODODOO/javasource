package member;

import static member.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 메소드 작성
// - 실행할 sql 구문 작성
//   insert, update, delete => executeUpdate() => int
//   select
//   1) 결과 값 하나라면 : executeQuery() => ~~DTO
//   2) 결과 값 여러개 라면 : List<~~DTO>

public class MemberDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  public int insert(MemberDTO dto) {
    String sql = "INSERT INTO memberTBL(userid,password,name,email) ";
    sql += "values(?,?,?,?)";
    int result = 0;

    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      // ? 해결
      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      pstmt.setString(3, dto.getName());
      pstmt.setString(4, dto.getEmail());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public MemberDTO getRow(String userId, String password) {
    con = getConnection();
    MemberDTO memberDTO = null;

    // 개별 회원 조회
    String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId);
      pstmt.setString(2, password);
      // java.sql.SQLException: ORA-17003: 열 인덱스가 부적합합니다.  ?부분 확인
      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new MemberDTO();
        memberDTO.setUserId(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  //   public MemberDTO getRow(MemberDTO dto) {
  //     con = getConnection();
  //     MemberDTO memberDTO = null;

  //     // 개별 회원 조회
  //     String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?";

  //     try {
  //       pstmt = con.prepareStatement(sql);
  //       pstmt.setString(1, dto.getUserId());
  //       pstmt.setString(2, dto.getPassword());
  //       rs = pstmt.executeQuery();
  //       if (rs.next()) {
  //         memberDTO = new MemberDTO();
  //         memberDTO.setUserId(rs.getString("userid"));
  //         memberDTO.setPassword(rs.getString("password"));
  //         memberDTO.setName(rs.getString("name"));
  //         memberDTO.setEmail(rs.getString("email"));
  //       }
  //     } catch (SQLException e) {
  //       e.printStackTrace();
  //     } finally {
  //       close(con, pstmt, rs);
  //     }
  //     return memberDTO;
  //   }

  public List<MemberDTO> getRows() {
    // 전체 회원 조회
    List<MemberDTO> list = new ArrayList<>();

    con = getConnection();
    String sql = "select * from membertbl"; // sql 작성문 재대로 확인
    // SQLSyntaxErrorException: ORA-00933: SQL 명령어가 올바르게 종료되지 않았습니다
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        MemberDTO mDto = new MemberDTO();
        mDto.setUserId(rs.getString("userid"));
        mDto.setPassword(rs.getString("password"));
        mDto.setName(rs.getString("name"));
        mDto.setEmail(rs.getString("email"));

        list.add(mDto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }

    return list;
  }

  public int update(String userId, String password) {
    String sql = "UPDATE  MEMBERTBL ";
    sql += "SET PASSWORD = ? WHERE USERID = ?";
    int result = 0;

    try {
      con = getConnection();
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, password);
      pstmt.setString(2, userId);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public int delete(String userId) {
    String sql = "DELETE FROM  MEMBERTBL WHERE userid=?";
    int result = 0;

    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }
}
