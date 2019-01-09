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
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * JNDI Interface�� ���� NamingService�� ��ϵ� �ڿ�(DataSource, EJB ��)�� lookup ���񽺸� �����Ѵ�.<BR>
 *
 */
public class TomcatJNDIManager{
  /**
   * Singleton ���� ���� �������
   */
  private static TomcatJNDIManager m_instance;
  /**
   * JNDI NamingService URL
   */
  private String m_PROVIDER_URL;
  /**
   * JNDI NamingService SPI ���� Ŭ����
   */
  private String m_INITIAL_CONTEXT_FACTORY;
  /**
   * JNDI Context
   */
  private Context m_ctx;
  private Context envCtx;

  /**
   * default ������<BR>
   * PropertyManager �κ��� JNDI ���������� ���, JNDI NamingService�� InitialContext �� ��´�.
   */
  private TomcatJNDIManager(){
    PropertyManager prop = PropertyManager.getInstance();
    try{
      m_ctx = new InitialContext();
      envCtx = (Context) m_ctx.lookup("java:/comp/env");
      System.out.println("envctx : " + envCtx);
    } catch(NamingException e){
      FWLogManager.getInstance().log("JNDIManager.java", "InitialContext()", e,
                                     "NamingServer�� reference�� ���� ���߽��ϴ�.",
          "�ʱ�ȭ ���Ͽ��� JNDI�� PROVIDER.URL, INITIAL.CONTEXT.FACTORY �Ӽ� �� ���� Ȯ���Ͻʽÿ�.", true);
      throw new SysException(e);
    }
  }

  /**
   * JDNIManager ��ü�� Singleton �������� �����Ѵ�.
   * @return JDNIManager ��ü
   */
  public static TomcatJNDIManager getInstance(){
    if(m_instance == null){
      m_instance = new TomcatJNDIManager();
    }
    return m_instance;
  }

  /**
   * Weblogic JNDI API�� ����Ͽ� EJBHome�������̽��� ��´�. . <br>
   * JNDI ������ aaaa.bbbb������ �������� �Ѵ�. LOG�� ���� �ʿ�.
   * @param jndiName EJB�� JNDI Alias name
   * @return EJBHome ��ü
   */
  public synchronized Object getHome(String jndiName){
    Object obj = null;
    try{
      obj = envCtx.lookup(jndiName);
    } catch(NamingException e){
      SysException se = new SysException(e);
      FWLogManager.getInstance().log("JNDIManager.java","getHome()", e, "JNDIManager�� �̿��Ͽ� EJBHome ��ü�� ��� �������� ���ܰ� �߻��߽��ϴ�.", "JNDI ���úκ��� Ȯ���Ͻʽÿ�.", false);
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
      FWLogManager.getInstance().log("JNDIManager.java","getDataSource()", e, "JNDIManager�� �̿��Ͽ� DataSource ��ü�� ��� �������� ���ܰ� �߻��߽��ϴ�.", "JNDI ���úκ��� Ȯ���Ͻʽÿ�.", false);
      throw se;
    }
    return obj;
  }

  /**
   * Initial Context�� �����Ѵ�.
   * @return InitialContext ��ü
   */
  private Context getInitialContext(){
    if(m_instance == null){
      m_instance = new TomcatJNDIManager();
    }
    return m_ctx;
  }
}
