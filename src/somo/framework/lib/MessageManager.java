package somo.framework.lib;

import java.util.*;
import java.io.*;
import java.sql.*;

import somo.framework.expt.*;
import somo.framework.prop.*;
import somo.framework.log.*;
import somo.framework.db.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * 공통 메시지에 대한 관리를 수행한다.<BR>
 * Weblogic Server 기동시 Startup Class에 의해 초기화된다.<BR>
 * message.properties 파일에 기술된 메시지를 읽고 보관하다.
 *
 */
public class MessageManager extends Properties{
  /**
   * Singleton 패턴 적용 멤버변수
   */
  private static MessageManager m_instance;
  /**
   * PropertyManager 로부터 메세지설정 파일정보를 읽어서 설정에 따라 처리한다.<BR>
   * DB Tier의 메세지는 서버기동시 반영여부에 따라 메모리에 로드한 후 DB에 Write한다.
   * Application Tier의 메세지는 메세지파일로부터 메모리에 로드한다.
   */
  private MessageManager(){
  }

  private void init(){
    // DB Tier의 메세지를 파일로부터 읽고 DB에 WRITE한다.
   String yesno = (String)PropertyManager.getInstance().get("MESSAGE.DB.UPDATE.ON.SERVER.START");
    if("YES".equals(yesno)){
      loadAndWriteDBMessage();
    }
    // 메모리에 로드된 DB Tier의 메세지를 제거한다.
    this.clear();
    // Application Tier의 메세지를 파일로부터 읽고 메모리에 로드한다.
    loadAppMessage();
  }

  private void loadAndWriteDBMessage(){
    // 변수 초기화
    String fileName = (String)PropertyManager.getInstance().get("MESSAGE.DB.FILENANE");
    String dbName = (String)PropertyManager.getInstance().get("MESSAGE.DB");
    String tableName = (String)PropertyManager.getInstance().get("MESSAGE.DB.TABLE");
    // 파일 -> 메모리
    try{
      FileInputStream fin;
      fin = new FileInputStream(fileName);
      m_instance.load(fin);
      fin.close();
    } catch(IOException e){
      FWLogManager.getInstance().log("MessageManager.java",
                                     "loadAndWriteDBMessage()", e,
                                     "Message 설정파일로부터 Message를 로드하지 못했습니다.",
                                     "초기화 파일에서 MESSAGE.DB.FILENANE 속성을 확인하십시오", true);
      throw new SysException(e);
    }
    // 메모리 -> DB
    DBManager manager = new DBManager(dbName);
    manager.getConnection();
    Connection con = manager.m_conn;
    try{
      String deleteQuery = "DELETE * FROM " + tableName;
      Statement stmt = con.createStatement();
      stmt.executeUpdate(deleteQuery);
      String updateQuery = "INSERT INTO " + tableName + " VALUES(?,?)";
      PreparedStatement pstmt = con.prepareStatement(updateQuery);
      Enumeration e = this.keys();
      while(e.hasMoreElements()){
        String key = (String)e.nextElement();
        String value = (String)this.get(key);
        pstmt.setString(1, key);
        pstmt.setString(2, value);
        pstmt.executeUpdate();
      }
    }catch(SQLException e){
      FWLogManager.getInstance().log("MessageManager.java",
                                     "loadAndWriteDBMessage()", e,
                                     "DB에 Write 과정에서 예외가 발생했습니다.",
                                     "DB 관련 속성을 확인하십시오", true);
      throw new SysException(e);
   }
    manager.disConnection();
  }
  private void loadAppMessage(){
    String fileName = (String)PropertyManager.getInstance().get("MESSAGE.APP.FILENANE");
    try{
      FileInputStream fin;
      fin = new FileInputStream(fileName);
      m_instance.load(fin);
      fin.close();
    } catch(IOException e){
      FWLogManager.getInstance().log("MessageManager.java",
                                     "loadAppMessage()", e,
                                     "Message 설정파일로부터 Message를 로드하지 못했습니다.",
                                     "초기화 파일에서 MESSAGE.APP.FILENAME 속성을 확인하십시오", true);
      throw new SysException(e);
    }
  }
  /**
   * MessageManager 객체를 Singleton 패턴으로 리턴한다.
   * @return MessageManager 객체
   */
  public static MessageManager getInstance(){
    if(m_instance == null){
      m_instance = new MessageManager();
      m_instance.init();
    }
    return m_instance;
  }
 }