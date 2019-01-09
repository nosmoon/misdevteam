package somo.framework.db;

import java.sql.*;
import java.util.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  DB Access 후 리스트 타입의 객체를 생성하여 ArrayList에 관리한다.
 *
 */
public abstract class BaseDataSet {
  /**
   * CallableStatement 객체로부터 에러코드,에러메세지를 얻는다. ResultSet으로부터 반복적으로 객체를 얻어서 list 멤버변수에 저장한다.
   * @param cstmt list 결과를 얻기 위해 필요한 DB Access를 수행하는 CallableStatement 객체
   * @throws SQLException
   */
  public abstract void getValues(CallableStatement cstmt) throws SQLException;
  public abstract String getErrcode();
  public abstract void setErrcode(String errmsg);
  public abstract String getErrmsg();
  public abstract void setErrmsg(String errmsg); 
}