package somo.framework.lib;

import java.util.*;
import java.rmi.RemoteException;
import javax.naming.*;
import javax.rmi.PortableRemoteObject;
import javax.sql.*;

import somo.framework.prop.*;
import somo.framework.expt.*;
import somo.framework.log.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * JNDI Interface를 통해 NamingService에 등록된 자원(DataSource, EJB 등)의 lookup 서비스를 제공한다.<BR>
 *
 */
public class TomcatJNDIManager{
  /**
   * Singleton 패턴 적용 멤버변수
   */
  private static TomcatJNDIManager m_instance;
  /**
   * JNDI NamingService URL
   */
  private String m_PROVIDER_URL;
  /**
   * JNDI NamingService SPI 구현 클래스
   */
  private String m_INITIAL_CONTEXT_FACTORY;
  /**
   * JNDI Context
   */
  private Context m_ctx;
  private Context envCtx;

  /**
   * default 생성자<BR>
   * PropertyManager 로부터 JNDI 서비스정보를 얻고, JNDI NamingService의 InitialContext 를 얻는다.
   */
  private TomcatJNDIManager(){
    PropertyManager prop = PropertyManager.getInstance();
    try{
      m_ctx = new InitialContext();
      envCtx = (Context) m_ctx.lookup("java:/comp/env");
      System.out.println("envctx : " + envCtx);
    } catch(NamingException e){
      FWLogManager.getInstance().log("JNDIManager.java", "InitialContext()", e,
                                     "NamingServer의 reference를 얻지 못했습니다.",
          "초기화 파일에서 JNDI의 PROVIDER.URL, INITIAL.CONTEXT.FACTORY 속성 및 값을 확인하십시오.", true);
      throw new SysException(e);
    }
  }

  /**
   * JDNIManager 객체를 Singleton 패턴으로 리턴한다.
   * @return JDNIManager 객체
   */
  public static TomcatJNDIManager getInstance(){
    if(m_instance == null){
      m_instance = new TomcatJNDIManager();
    }
    return m_instance;
  }

  /**
   * Weblogic JNDI API를 사용하여 EJBHome인터페이스를 얻는다. . <br>
   * JNDI 구조는 aaaa.bbbb형식을 기준으로 한다. LOG를 위해 필요.
   * @param jndiName EJB의 JNDI Alias name
   * @return EJBHome 객체
   */
  public synchronized Object getHome(String jndiName){
    Object obj = null;
    try{
      obj = envCtx.lookup(jndiName);
    } catch(NamingException e){
      SysException se = new SysException(e);
      FWLogManager.getInstance().log("JNDIManager.java","getHome()", e, "JNDIManager를 이용하여 EJBHome 객체를 얻는 과정에서 예외가 발생했습니다.", "JNDI 관련부분을 확인하십시오.", false);
      throw se;
    }
    return PortableRemoteObject.narrow(obj, obj.getClass());
  }

  public synchronized DataSource getDataSource(String jndiName){
    DataSource obj = null;
    try{
      System.out.println("jndiName "+jndiName);
      System.out.println("jdbc/"+jndiName);
      //jndiName = "jdbc/" + jndiName;
      obj = (DataSource)envCtx.lookup(jndiName);

    } catch(NamingException e){
      SysException se = new SysException(e);
      FWLogManager.getInstance().log("JNDIManager.java","getDataSource()", e, "JNDIManager를 이용하여 DataSource 객체를 얻는 과정에서 예외가 발생했습니다.", "JNDI 관련부분을 확인하십시오.", false);
      throw se;
    }
    return obj;
  }

  /**
   * Initial Context를 리턴한다.
   * @return InitialContext 객체
   */
  private Context getInitialContext(){
    if(m_instance == null){
      m_instance = new TomcatJNDIManager();
    }
    return m_ctx;
  }
}
