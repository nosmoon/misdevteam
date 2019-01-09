package somo.framework.db;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.lang.*;
import javax.sql.*;
import javax.naming.*;
import java.lang.reflect.*;
import oracle.jdbc.driver.*;

import somo.framework.prop.*;
import somo.framework.util.*;
import somo.framework.expt.*;
import somo.framework.lib.*;
import somo.framework.log.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  JDBC를 이용하여 DB Access 전반을 처리한다. DataSource를 통해 Connection객체를 얻고 반납한다. 프로시저를 호출하고 결과를 리턴한다.
 *
 */
public class DBManager{

  /**
   *  Server의 DataSoure 이름 저장을 위한 변수
   */
  public String m_dbPool = null;

  /**
   * Server의 DataSource 변수
   */
  public DataSource m_ds = null; // lookup 성능 향상을 위해 static으로 선언
  /**
   * JDBC Connection 객체 변수
   */
  public Connection m_conn = null;

  /**
   * DB명을 매개변수로 받아서 PropertyManager로부터 DataSource 명을 얻는다.
   * @param dbName Property 설정파일에 지정되어 있는, Access 대상 DB 명
   */
  public DBManager(String dbName){
    System.out.println("dbName :" + dbName);
     PropertyManager prop = PropertyManager.getInstance();
//     prop.list(System.out);
     m_dbPool = (String)prop.getProperty(dbName);
//     System.out.println("m_dbPool 0 :" + m_dbPool);
  }

 /**
   * JNDIManager를 이용하여 JDBC Connection 객체를 생성한다.
   */
  public void getConnection(){
    try{
      if(m_ds == null){
    	  ResinJNDIManager manager = ResinJNDIManager.getInstance();
//        JNDIManager manager = JNDIManager.getInstance();
        System.out.println("m_dbPool 1 :" + m_dbPool);
//        TomcatJNDIManager manager = TomcatJNDIManager.getInstance();
        m_ds = manager.getDataSource(m_dbPool);
      }
      m_conn = m_ds.getConnection();
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","getConnection()", e, "JNDIManager를 이용하여 DataSource,Connection객체를 얻는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
  }

  /**
   * Connection객체를 DataSource로 반납한다.
   */
  public void disConnection(){
    try{
      if(m_conn != null){
        m_conn.close();
      }
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","disConnection()", e, "DataSource로 Connection객체를 반납하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
  }

  /**
   * DM 객체를 매개변수로 받아서 DM 객체가 담당할 프로시저를 호출하고, 그 결과를 DataSet 객체에 반영한 후 DataSet객체를 리턴한다.
   * @param dm 프로시저 호출을 위한 DM 객체
   * @return 프로시저 호출결과가 반영된 DataSet 객체
   */
  public BaseDataSet executeCall(BaseDM dm){
    BaseDataSet ds = null;
    try{
      getConnection();
      CallableStatement cstmt = m_conn.prepareCall(dm.getSQL());
      dm.setParams(cstmt, dm);
      cstmt.execute();
      ds = dm.createDataSetObject();
      ds.getValues(cstmt);
    } catch(SQLException sqle){
      FWLogManager.getInstance().log("DBManager.java", "executeCall()", sqle,
                                     "Procedure 호출시 예외가 발생했습니다.",
                                     "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(sqle);
    } finally{
      disConnection();
    }
    return ds;
  }

  /**
   * DatabaseMetaData 객체를 얻는다.
   * @return DatabaseMetaData 객체
   */
  public DatabaseMetaData getMetaData(){
    try{
      return m_conn.getMetaData();
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","getMetaData()", e, "DatabaseMetaData 객체를 얻는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
  }

  /**
   * Connection 객체의 commit()을 호출하여 DB 변경내용을 DB에 반영한다.
   */
  public void commit(){
    try{
      m_conn.commit();
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","commit()", e, "DB 변경내용을 DB에 반영하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
  }

  /**
   * Connection 객체의 rollback()을 호출하여 DB 변경내용을 원래로 복구한다.
   */
  public void rollback(){
    try{
      m_conn.rollback();
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","rollback()", e, "DB 변경내용을 원래로 복구하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
  }

  /**
   * Connection 객체의 사용가능여부를 리턴한다.
   * @return 예/아니오
   */
  public boolean isClosed(){
    boolean flag = false;
    try{
      flag = m_conn.isClosed();
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","rollback()", e, "Connection 객체의 사용가능여부를 확인하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
    return flag;
  }

  /**
   * Connection 객체의 자동 commit 기능을 설정한다.
   * @param autoCommit 예/아니오
   */
  public void setAutoCommit(boolean autoCommit){
    try{
      m_conn.setAutoCommit(autoCommit);
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","setAutoCommit()", e, "Connection 객체의 자동 commit 기능을 설정하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
  }

  /**
   * Connection 객체의 자동 commit 기능의 설정여부를 리턴한다.
   * @return 예/아니오
   */
  public boolean getAutoCommit(){
    boolean flag = false;
    try{
      flag = m_conn.getAutoCommit();
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","getAutoCommit()", e, "Connection 객체의 자동 commit 기능의 설정여부를 확인하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
    return flag;
  }

  /**
   * Connection 객체의 ReadOnly 기능을 설정한다.
   * @param readOnly 예/아니오
   */
  public void setReadOnly(boolean readOnly){
    try{
      m_conn.setReadOnly(readOnly);
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","setReadOnly()", e, "Connection 객체의 ReadOnly 기능을 설정하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
  }

  /**
   * Connection 객체의 ReadOnly 기능의 설정여부를 리턴한다.
   * @return 예/아니오
   */
  public boolean isReadOnly(){
    boolean flag = false;
    try{
      flag = m_conn.isReadOnly();
    } catch(SQLException e){
      FWLogManager.getInstance().log("DBManager.java","isReadOnly()", e, "Connection 객체의 ReadOnly 기능의 설정여부를 확인하는 과정에서 예외가 발생했습니다.", "데이터베이스 관련부분을 확인하십시오.", false);
      throw new SysException(e);
    }
    return flag;
  }
}
