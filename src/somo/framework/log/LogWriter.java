package somo.framework.log;

import java.io.*;
import somo.framework.prop.*;
import somo.framework.expt.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 *  LogHandler ��ü�� �̿��Ͽ� �α׸� �����Ѵ�.<BR>
 *  ����,DB,�ܼ�,JMS �� �α׸� �����ϸ� �α׹�Ŀ� ���� ������ �޼ҵ带 �̿��Ѵ�.
 *
 */
public class LogWriter{
  /**
   * Singleton ���� ���� �������
   */
  private static LogWriter instance;
  /**
   * �αװ� ��ϵ� ���ϸ�(Full Name)
   */
  private String logFile;
  /**
   * �αװ� ��ϵ� DB�� �α׸� ó���ϴ� ���Ǻ�
   */
  private String logSB;
  /**
   * �α׸� ó���ϴ� Message-Driven Bean
   */
  private String logMDB;

  /**
   * ���� �䱸�� ���� Ŀ���͸���¡�� LogHandler ��ü<BR>
   * Ŀ���͸���¡�� Ŭ������ LogHandler Ŭ������ ���� Ŭ���� ��ü
   */
  private LogHandler handler;

  /**
   * default ������<BR>
       * PropertyManager�κ��� �α׸� ����� ���ϸ�� Ŀ���͸���¡ �α׸� ó���� LogHandler Ŭ�������� ��� ��ü�� �����Ѵ�.
   */
  private LogWriter(){
    PropertyManager prop = PropertyManager.getInstance();
    logFile = (String)prop.get("LOG.FILENAME");
    handler = new LogHandler();
  }

  /**
   * LogWriter ��ü�� LogWriter �������� �����Ѵ�.
   * @return JDNIManager ��ü
   */
  public static LogWriter getInstance(){
    if(instance == null){
      instance = new LogWriter();
    }
    return instance;
  }

  /**
   * LogHandler ��ü�� �̿��Ͽ� �α����Ͽ� �α׸� ����Ѵ�.
   * @param data �α� ���� ��ü
   */
  public void logFile(LogData data){
    PrintWriter out = null;
    File f = new File(logFile);

    try{
      if(f.exists()){
        // ������ �����ϸ� append mode, autoflush �� PrintWriter�� ����
        out = new PrintWriter(new FileOutputStream(logFile, true), true);
      } else{
        //autoflush
        out = new PrintWriter(new FileOutputStream(logFile), true);
      }
      handler.writeToFile(out, data);
    } catch(IOException e){
      FWLogManager.getInstance().log("LogWriter.java",
                                     "logFile()", e,
                                     "File�� Write �������� ���ܰ� �߻��߽��ϴ�.",
                                     "Log ���� �Ӽ��� Ȯ���Ͻʽÿ�", false);
    } finally{
      if(out != null){
        out.close();
      }
    }
  }

  /**
   * LogHandler ��ü�� �̿��Ͽ� DB�� �α׸� ����Ѵ�.
   * @param data �α� ���� ��ü
   */
  public void logDB(LogData data){
    handler.writeToDB(data);
  }

  /**
   * LogHandler ��ü�� �̿��Ͽ� �ֿܼ� �α׸� ����Ѵ�.
   * @param data �α� ���� ��ü
   */
  public void logConsole(LogData data){
    handler.writeToConsole(data);
  }

  /**
   * LogHandler ��ü�� �̿��Ͽ� JMS�� �α׸� ����Ѵ�.
   * @param data �α� ���� ��ü
   */
  public void logJMS(LogData data){
    handler.writeToJMS(data);
  }
}