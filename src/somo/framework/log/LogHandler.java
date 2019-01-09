package somo.framework.log;

import java.io.*;
import somo.framework.prop.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * �α׸� �����ϴ� Ŭ����<BR>
 * ������ ��ü���� �α׹�Ŀ� �°� Ŀ���͸���¡ �� �� �ֵ��� �α� ���(����,�ܼ�,DB,JMS)���� ������ �޼ҵ带 ������.
 *
 */
public class LogHandler {
  /**
   * DB�� �α׸� ����ϴ� ���Ǻ� ����
   */
  protected String logSB;
  /**
   * JMS(Message-Driven Bean)�� �̿��Ͽ� Asynchronous �ϰ� �α׸� ����ϴ� Message-Driven Bean ����
   */
  protected String logMDB;

  /**
   * default ������<BR>
   * ���Ǻ�� Message-driven Bean�� JNDI �̸��� PropertyManager�� ���� ��´�.
   */
  public LogHandler(){
    PropertyManager prop = PropertyManager.getInstance();
    logSB = (String)prop.get("LOG.SBNAME");
    logMDB  = (String)prop.get("LOG.MDBNAME");
  }
  /**
   * ���Ͽ� �α׸� ����ϴ� �޼ҵ�
   * @param out ��� ������ PrintWriter ��ü
   * @param data �α� �׸� ������ ���� LogData ��ü
   */
  public void writeToFile(PrintWriter out, LogData data){
    out.println("Log :");
    out.println("\tDATE : "+data.date);
    out.println("\tERROR_CODE : "+data.code);
    out.println("\tERROR_MESSAGE : "+data.message);
    out.println();
  }
  /**
   * �ֿܼ� �α׸� ����ϴ� �޼ҵ�
   * @param out ��� ������ �ܼ���½�Ʈ�� ��ü
   * @param data �α� �׸� ������ ���� LogData ��ü
   */
  public void writeToConsole(LogData data){
    System.out.println("Log :");
    System.out.println("\tDATE : "+data.date);
    System.out.println("\tCODE : "+data.code);
    System.out.println("\tMESSAGE : "+data.message);
    System.out.println();
  }
  /**
   * ���Ǻ��� ���� DB�� �α׸� ����ϴ� �޼ҵ�
   * @param data �α� �׸� ������ ���� LogData ��ü
   */
  public void writeToDB(LogData data){
    System.out.println("LogHandler writeToDB() is called");
    System.out.println("LogHandler writeToDB() should be implemented !!!");
  }
  /**
   * JMS�� ���� Message-driven Bean�� �α׸� ����ϴ� �޼ҵ�
   * @param data �α� �׸� ������ ���� LogData ��ü
   */
  public void writeToJMS(LogData data){
    System.out.println("LogHandler writeToJMS() is called");
    System.out.println("LogHandler writeToJMS() should be implemented !!!");
  }
}