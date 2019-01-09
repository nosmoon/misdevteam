package somo.framework.db;

import java.sql.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  프로시저 및 DataSet 객체와 대응 관계를 갖는다. CallableStatement 객체의 매개변수를 설정하고<BR>
 *  프로시저 호출 결과를 반영할 DataSet 클래스정보를 제공한다.
 *
 */

public abstract class BaseDM {

  /**
  * 하위 DM 클래스가, 대응되는 프로시저를 호출하기 위해 CallableStatement의 파리미터를 설정하도록 구현한다.
  * @return CallableStatement의 문자열
  */
 public abstract String getSQL();
  /**
   * 하위 DM 클래스가, 대응되는 프로시저를 호출하기 위해 CallableStatement의 파리미터를 설정하도록 구현한다.
   * @param cstmt 파라미터 설정이 필요한 PreparedStatement 또는 CallableStatement 객체
   */

  /**
   * 하위 DM 클래스가, 대응되는 프로시저를 호출하기 위해 CallableStatement의 파리미터를 설정하도록 구현한다.
   * @param cstmt 파라미터 설정이 필요한 PreparedStatement 또는 CallableStatement 객체
   * @param dm 호출되어야 할 프로시저명과 호출결과를 담을 DataSet 클래스정보를 가진 DM 객체
   * @throws SQLException
   */
  public abstract void setParams(CallableStatement cstmt, BaseDM dm) throws SQLException;

  /**
   * 하위 DM 클래스에 대응되는 DataSet 클래스의 이름을 리턴한다.
   * @return DataSet 클래스 이름
   */
  public abstract BaseDataSet createDataSetObject();
}