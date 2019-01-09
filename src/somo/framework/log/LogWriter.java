package somo.framework.log;

import java.io.*;
import somo.framework.prop.*;
import somo.framework.expt.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  LogHandler 객체를 이용하여 로그를 수행한다.<BR>
 *  파일,DB,콘솔,JMS 에 로그를 수행하며 로그방식에 따라 별도의 메소드를 이용한다.
 *
 */
public class LogWriter{
  /**
   * Singleton 패턴 적용 멤버변수
   */
  private static LogWriter instance;
  /**
   * 로그가 기록될 파일명(Full Name)
   */
  private String logFile;
  /**
   * 로그가 기록될 DB에 로그를 처리하는 세션빈
   */
  private String logSB;
  /**
   * 로그를 처리하는 Message-Driven Bean
   */
  private String logMDB;

  /**
   * 고객의 요구에 따라 커스터마이징된 LogHandler 객체<BR>
   * 커스터마이징된 클래스는 LogHandler 클래스의 하위 클래스 객체
   */
  private LogHandler handler;

  /**
   * default 생성자<BR>
       * PropertyManager로부터 로그를 기록할 파일명과 커스터마이징 로그를 처리할 LogHandler 클래스명을 얻고 객체를 생성한다.
   */
  private LogWriter(){
    PropertyManager prop = PropertyManager.getInstance();
    logFile = (String)prop.get("LOG.FILENAME");
    handler = new LogHandler();
  }

  /**
   * LogWriter 객체를 LogWriter 패턴으로 리턴한다.
   * @return JDNIManager 객체
   */
  public static LogWriter getInstance(){
    if(instance == null){
      instance = new LogWriter();
    }
    return instance;
  }

  /**
   * LogHandler 객체를 이용하여 로그파일에 로그를 기록한다.
   * @param data 로그 정보 객체
   */
  public void logFile(LogData data){
    PrintWriter out = null;
    File f = new File(logFile);

    try{
      if(f.exists()){
        // 파일이 존재하면 append mode, autoflush 로 PrintWriter를 생성
        out = new PrintWriter(new FileOutputStream(logFile, true), true);
      } else{
        //autoflush
        out = new PrintWriter(new FileOutputStream(logFile), true);
      }
      handler.writeToFile(out, data);
    } catch(IOException e){
      FWLogManager.getInstance().log("LogWriter.java",
                                     "logFile()", e,
                                     "File에 Write 과정에서 예외가 발생했습니다.",
                                     "Log 관련 속성을 확인하십시오", false);
    } finally{
      if(out != null){
        out.close();
      }
    }
  }

  /**
   * LogHandler 객체를 이용하여 DB에 로그를 기록한다.
   * @param data 로그 정보 객체
   */
  public void logDB(LogData data){
    handler.writeToDB(data);
  }

  /**
   * LogHandler 객체를 이용하여 콘솔에 로그를 기록한다.
   * @param data 로그 정보 객체
   */
  public void logConsole(LogData data){
    handler.writeToConsole(data);
  }

  /**
   * LogHandler 객체를 이용하여 JMS에 로그를 기록한다.
   * @param data 로그 정보 객체
   */
  public void logJMS(LogData data){
    handler.writeToJMS(data);
  }
}