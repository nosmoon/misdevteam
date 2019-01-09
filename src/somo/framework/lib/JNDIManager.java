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
public class JNDIManager{
  /**
   * WAS ���� �������	(2009.07.21 ��뼷 was�� ���� jndi ó��)
   */
  private String m_WAS;
  /**
   * Singleton ���� ���� �������
   */
  private static JNDIManager m_instance;
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

  /**
   * default ������<BR>
   * PropertyManager �κ��� JNDI ���������� ���, JNDI NamingService�� InitialContext �� ��´�.
   */
  private JNDIManager(){
    PropertyManager prop = PropertyManager.getInstance();

    //m_WAS = (String)prop.getProperty("WAS");
		m_WAS = (String)prop.getProperty("RESIN");
    if("RESIN".equals(m_WAS)){
	    try{
	      m_ctx = (Context) new InitialContext().lookup("java:comp/env/ejb");
	    } catch(NamingException e){
	      FWLogManager.getInstance().log("JNDIManager.java", "InitialContext()", e,
	                                     "NamingServer�� reference�� ���� ���߽��ϴ�.",
	          "Resin server�� JNDI root�� ���� ���߽��ϴ�.", true);
	      throw new SysException(e); 
	    }
    }else{
	    m_PROVIDER_URL = (String)prop.getProperty("PROVIDER.URL");
	    m_INITIAL_CONTEXT_FACTORY = (String)prop.getProperty("INITIAL.CONTEXT.FACTORY");

	    Properties p = new Properties();
	    p.put(Context.INITIAL_CONTEXT_FACTORY, m_INITIAL_CONTEXT_FACTORY);
	    p.put(Context.PROVIDER_URL, m_PROVIDER_URL);
	    try{
	      m_ctx = new InitialContext(p);
	    } catch(NamingException e){
	      FWLogManager.getInstance().log("JNDIManager.java", "InitialContext()", e,
	                                     "NamingServer�� reference�� ���� ���߽��ϴ�.",
	          "�ʱ�ȭ ���Ͽ��� JNDI�� PROVIDER.URL, INITIAL.CONTEXT.FACTORY �Ӽ� �� ���� Ȯ���Ͻʽÿ�.", true);
	      throw new SysException(e);
	    }
	}
  }

    /* (2009.07.21 ��뼷 was�� ���� jndi ó��)
      private JNDIManager(){
        PropertyManager prop = PropertyManager.getInstance();
        m_PROVIDER_URL = (String)prop.getProperty("PROVIDER.URL");
        m_PROVIDER_URL = (String)prop.getProperty("PROVIDER.URL");
        m_INITIAL_CONTEXT_FACTORY = (String)prop.getProperty("INITIAL.CONTEXT.FACTORY");

        Properties p = new Properties();
        p.put(Context.INITIAL_CONTEXT_FACTORY, m_INITIAL_CONTEXT_FACTORY);
        p.put(Context.PROVIDER_URL, m_PROVIDER_URL);
        try{
          m_ctx = new InitialContext(p);
        } catch(NamingException e){
          FWLogManager.getInstance().log("JNDIManager.java", "InitialContext()", e,
                                         "NamingServer�� reference�� ���� ���߽��ϴ�.",
              "�ʱ�ȭ ���Ͽ��� JNDI�� PROVIDER.URL, INITIAL.CONTEXT.FACTORY �Ӽ� �� ���� Ȯ���Ͻʽÿ�.", true);
          throw new SysException(e);
        }
      }
    */
  /**
   * JDNIManager ��ü�� Singleton �������� �����Ѵ�.
   * @return JDNIManager ��ü
   */
  public static JNDIManager getInstance(){
    if(m_instance == null){
      m_instance = new JNDIManager();
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
      obj = m_ctx.lookup(jndiName);
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
System.out.println("JNDIManager : jndiName : [" +jndiName+"]");
      obj = (DataSource)m_ctx.lookup(jndiName);
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
      m_instance = new JNDIManager();
    }
    return m_ctx;
  }
}
