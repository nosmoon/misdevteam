package somo.framework.init;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.prop.*;
import somo.framework.lib.*;
import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.log.*;

/**
 *
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * Weblogic Server�� �ʱ�ȭ�� ���ȴ�.<BR>
 * Startup class���� �� Ŭ������ �ʱ�ȭ �޼ҵ带 ȣ���Ѵ�.<BR>
 * ���������� Ŭ������������ ���� �ڼ��� ������ �������� ��������� �����Ѵ�.
 * @see somo.framework.init.WLAST3Init
 */
public class ResinInitializer extends HttpServlet { 

	static {
//            initPropertyManager("/appstore/webserver/resin4/prop/default-ciis.properties");
            initPropertyManager("C:/workspace/ciis_chosun_com/prop/default.properties");
	    initMessageManager();
            System.out.println("11framework start");
	    //initJNDIManager();
	    LogManager.getInstance().log("�ý��� �⵿�� �ʿ��� Framework�� ��� Manager �ʱ�ȭ �۾��� ���������� ����Ǿ����ϴ�.");
	}

  /**
   * �����ӿ�ũ�� PropertyManager�� �̿��Ͽ� �����ӿ�ũ Property���������� ������ �޸𸮿� �ε��Ѵ�.
   * @param fileName Property�������� ���
   */
  private static void initPropertyManager(String fileName){
    try{
      PropertyManager.init(fileName);
    } catch(Exception e){
      FWLogManager.getInstance().log("ResinInitializer.java",
                                     "PropertyManager.init()", e,
                                     "Property �ʱ�ȭ���� Exception�� �߻��߽��ϴ�.",
                                     "Property �ʱ�ȭ ������ ��ġ �� ������ Ȯ���Ͻʽÿ�.", true);
      throw new SysException(e);
    }
  }

  /**
   * ����Ͻ������� ���ܻ�Ȳ�� ǥ���ؾ��� �޼����� �����ϴ� MessageManager�� �ʱ�ȭ�� �����Ѵ�.
   */
  private static void initMessageManager(){
    try{
      MessageManager.getInstance();
    } catch(Exception e){
      e.printStackTrace();
      FWLogManager.getInstance().log("ResinInitializer.java",
                                     "MessageManager.getInstance()", e,
                                     "Message �ʱ�ȭ�������� Exception�� �߻��߽��ϴ�.",
                                     "Message �ʱ�ȭ ������ ��ġ, ���� �Ӽ� �� ���� Ȯ���Ͻʽÿ�.", true);
      throw new SysException(e);
    }
  }

  /**
   * Server�� Resource ������ �����ϴ� JNDIManager�� �ʱ�ȭ�� �����Ѵ�.
   */
  private static void initJNDIManager(){
    try{
      JNDIManager.getInstance();
    } catch(Exception e){
      e.printStackTrace();
      FWLogManager.getInstance().log("ResinInitializer.java",
                                     "JNDIManager.getInstance()", e,
                                     "JNDIManager �ʱ�ȭ�������� Exception�� �߻��߽��ϴ�.",
                                     "JNDI ������ ���� �Ӽ� �� ���� Ȯ���Ͻʽÿ�.", true);
      throw new SysException(e);
    }
  }
}