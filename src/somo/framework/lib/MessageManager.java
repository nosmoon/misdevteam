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
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * ���� �޽����� ���� ������ �����Ѵ�.<BR>
 * Weblogic Server �⵿�� Startup Class�� ���� �ʱ�ȭ�ȴ�.<BR>
 * message.properties ���Ͽ� ����� �޽����� �а� �����ϴ�.
 *
 */
public class MessageManager extends Properties{
  /**
   * Singleton ���� ���� �������
   */
  private static MessageManager m_instance;
  /**
   * PropertyManager �κ��� �޼������� ���������� �о ������ ���� ó���Ѵ�.<BR>
   * DB Tier�� �޼����� �����⵿�� �ݿ����ο� ���� �޸𸮿� �ε��� �� DB�� Write�Ѵ�.
   * Application Tier�� �޼����� �޼������Ϸκ��� �޸𸮿� �ε��Ѵ�.
   */
  private MessageManager(){
  }

  private void init(){
    // DB Tier�� �޼����� ���Ϸκ��� �а� DB�� WRITE�Ѵ�.
   String yesno = (String)PropertyManager.getInstance().get("MESSAGE.DB.UPDATE.ON.SERVER.START");
    if("YES".equals(yesno)){
      loadAndWriteDBMessage();
    }
    // �޸𸮿� �ε�� DB Tier�� �޼����� �����Ѵ�.
    this.clear();
    // Application Tier�� �޼����� ���Ϸκ��� �а� �޸𸮿� �ε��Ѵ�.
    loadAppMessage();
  }

  private void loadAndWriteDBMessage(){
    // ���� �ʱ�ȭ
    String fileName = (String)PropertyManager.getInstance().get("MESSAGE.DB.FILENANE");
    String dbName = (String)PropertyManager.getInstance().get("MESSAGE.DB");
    String tableName = (String)PropertyManager.getInstance().get("MESSAGE.DB.TABLE");
    // ���� -> �޸�
    try{
      FileInputStream fin;
      fin = new FileInputStream(fileName);
      m_instance.load(fin);
      fin.close();
    } catch(IOException e){
      FWLogManager.getInstance().log("MessageManager.java",
                                     "loadAndWriteDBMessage()", e,
                                     "Message �������Ϸκ��� Message�� �ε����� ���߽��ϴ�.",
                                     "�ʱ�ȭ ���Ͽ��� MESSAGE.DB.FILENANE �Ӽ��� Ȯ���Ͻʽÿ�", true);
      throw new SysException(e);
    }
    // �޸� -> DB
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
                                     "DB�� Write �������� ���ܰ� �߻��߽��ϴ�.",
                                     "DB ���� �Ӽ��� Ȯ���Ͻʽÿ�", true);
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
                                     "Message �������Ϸκ��� Message�� �ε����� ���߽��ϴ�.",
                                     "�ʱ�ȭ ���Ͽ��� MESSAGE.APP.FILENAME �Ӽ��� Ȯ���Ͻʽÿ�", true);
      throw new SysException(e);
    }
  }
  /**
   * MessageManager ��ü�� Singleton �������� �����Ѵ�.
   * @return MessageManager ��ü
   */
  public static MessageManager getInstance(){
    if(m_instance == null){
      m_instance = new MessageManager();
      m_instance.init();
    }
    return m_instance;
  }
 }