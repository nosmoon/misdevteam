package somo.framework.log;

import java.io.*;
import java.util.*;

import somo.framework.util.*;
import somo.framework.prop.*;
import somo.framework.expt.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * Log�� ���� ������ �����Ѵ�.<BR>
 * Property �������Ͽ� ����� �α� Ÿ�Կ� ���� �α� ����� �����Ѵ�.<BR>
 *
 */
public class LogManager{
  /**
   * Singleton ���� ���� �������
   */
  private static LogManager m_instance;
  /**
   * LogWriter ����
   */
  private static LogWriter lw;
  /**
   * Property ���Ͽ� ������ LOG.TYPE
   */
  private String logType;

  /**
   * default ������<BR>
   * PropertyManager�κ��� �α� ���� ������ ��´�.
   */
  private LogManager(){
    lw = LogWriter.getInstance();
    PropertyManager prop = PropertyManager.getInstance();
    logType = (String)prop.get("LOG.TYPE");
  }

  /**
   * LogManager ��ü�� Singleton �������� �����Ѵ�.
   * @return LogManager ��ü
   */
  public static LogManager getInstance(){
    if(m_instance == null){
      m_instance = new LogManager();
    }
    return m_instance;
  }

  /**
   * �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� �α׹�Ŀ� ���� �α� ����
   * @param message �α׿� ��ϵ� �޼���
   */
  public void log(String message){
    LogData data = new LogData(message);
    logByType(data);
  }

  /**
   * �ڵ�, �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� �α׹�Ŀ� ���� �α� ����
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   */
  public void log(String code, String message){
    LogData data = new LogData(code, message);
    logByType(data);
  }

  /**
   * �ڵ�, �޼���, �󼼸޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� �α׹�Ŀ� ���� �α� ����
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   * @param detail �α׿� ��ϵ� �� �� ó�� �޼���
   */
  public void log(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    logByType(data);
  }

  /**
   * AppException�� �Ű������� �޾Ƽ� �������Ͽ� ����� �α׹�Ŀ� ���� �α� ����
   * @param e �α׿� ��ϵ� AppException ��ü
   */
  public void log(AppException e){
    LogData data = new LogData(e);
    logByType(data);
  }

  /**
   * SysException �Ű������� �޾Ƽ� �������Ͽ� ����� �α׹�Ŀ� ���� �α� ����
   * @param e �α׿� ��ϵ� SysException ��ü
   */
  public void log(SysException e){
    LogData data = new LogData(e);
    logByType(data);
  }

  /**
   * �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� ���Ͽ� �α� ���
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logFile(String message){
    LogData data = new LogData(message);
    lw.logFile(data);
  }

  /**
   * �ڵ�, �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� ���Ͽ� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logFile(String code, String message){
    LogData data = new LogData(code, message);
    lw.logFile(data);
  }

  /**
   * �ڵ�, �޼���, �󼼸޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� ���Ͽ� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   * @param detail �α׿� ��ϵ� �� �� ó�� �޼���
   */
  public void logFile(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logFile(data);
  }

  /**
   * AppException�� �Ű������� �޾Ƽ� �������Ͽ� ����� ���Ͽ� �α� ���
   * @param e AppException ��ü
   */
  public void logFile(AppException e){
    LogData data = new LogData(e);
    lw.logFile(data);
  }

  /**
   * SysException�� �Ű������� �޾Ƽ� �������Ͽ� ����� ���Ͽ� �α� ���
   * @param e SysException ��ü
   */
  public void logFile(SysException e){
    LogData data = new LogData(e);
    lw.logFile(data);
  }

  /**
   * �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� DB�� �α� ���
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logDB(String message){
    LogData data = new LogData(message);
    lw.logDB(data);
  }

  /**
   * �ڵ�, �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� DB�� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logDB(String code, String message){
    LogData data = new LogData(code, message);
    lw.logDB(data);
  }

  /**
   * �ڵ�, �޼���, �󼼸޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� DB�� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   * @param detail �α׿� ��ϵ� �� �� ó�� �޼���
   */
  public void logDB(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logDB(data);
  }

  /**
   * AppException�� �Ű������� �޾Ƽ� �������Ͽ� ����� DB�� �α� ���
   * @param e AppException ��ü
   */
  public void logDB(AppException e){
    LogData data = new LogData(e);
    lw.logDB(data);
  }

  /**
   * SysException�� �Ű������� �޾Ƽ� �������Ͽ� ����� DB�� �α� ���
   * @param e SysException ��ü
   */
  public void logDB(SysException e){
    LogData data = new LogData(e);
    lw.logDB(data);
  }

  /**
   * �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� �ֿܼ� �α� ���
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logConsole(String message){
    LogData data = new LogData(message);
    lw.logConsole(data);
  }

  /**
   * �ڵ�, �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� �ֿܼ� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logConsole(String code, String message){
    LogData data = new LogData(code, message);
    lw.logConsole(data);
  }

  /**
   * �ڵ�, �޼���, �󼼸޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� �ֿܼ� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   * @param detail �α׿� ��ϵ� �� �� ó�� �޼���
   */
  public void logConsole(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logConsole(data);
  }

  /**
   * AppException�� �Ű������� �޾Ƽ� �������Ͽ� ����� �ֿܼ� �α� ���
   * @param e AppException ��ü
   */
  public void logConsole(AppException e){
    LogData data = new LogData(e);
    lw.logConsole(data);
  }

  /**
   * SysException�� �Ű������� �޾Ƽ� �������Ͽ� ����� �ֿܼ� �α� ���
   * @param e SysException ��ü
   */
  public void logConsole(SysException e){
    LogData data = new LogData(e);
    lw.logConsole(data);
  }

  /**
   * �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� JMS�� �α� ���
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logJMS(String message){
    LogData data = new LogData(message);
    lw.logJMS(data);
  }

  /**
   * �ڵ�, �޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� JMS�� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   */
  public void logJMS(String code, String message){
    LogData data = new LogData(code, message);
    lw.logJMS(data);
  }

  /**
   * �ڵ�, �޼���, �󼼸޼����� �Ű������� �޾Ƽ� �������Ͽ� ����� JMS�� �α� ���
   * @param code �α׿� ��ϵ� �ڵ�
   * @param message �α׿� ��ϵ� �޼���
   * @param detail �α׿� ��ϵ� �� �� ó�� �޼���
   */
  public void logJMS(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logJMS(data);
  }

  /**
   * AppException�� �Ű������� �޾Ƽ� �������Ͽ� ����� JMS�� �α� ���
   * @param e AppException ��ü
   */
  public void logJMS(AppException e){
    LogData data = new LogData(e);
    lw.logJMS(data);
  }

  /**
   * SysException�� �Ű������� �޾Ƽ� �������Ͽ� ����� JMS�� �α� ���
   * @param e SysException ��ü
   */
  public void logJMS(SysException e){
    LogData data = new LogData(e);
    lw.logJMS(data);
  }

  /**
   * Property �������Ͽ� ����� �α� ��� ���� �α� ����
   * @param data
   */
  private void logByType(LogData data){
    if(logType.indexOf("F") != -1){
      lw.logFile(data);
    }
    if(logType.indexOf("D") != -1){
      lw.logDB(data);
    }
    if(logType.indexOf("C") != -1){
      lw.logConsole(data);
    }
    if(logType.indexOf("M") != -1){
      lw.logJMS(data);
    }
  }
}