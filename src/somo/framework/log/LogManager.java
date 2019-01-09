package somo.framework.log;

import java.io.*;
import java.util.*;

import somo.framework.util.*;
import somo.framework.prop.*;
import somo.framework.expt.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * Log에 대한 관리를 수행한다.<BR>
 * Property 설정파일에 기술된 로그 타입에 의해 로그 기능을 수행한다.<BR>
 *
 */
public class LogManager{
  /**
   * Singleton 패턴 적용 멤버변수
   */
  private static LogManager m_instance;
  /**
   * LogWriter 변수
   */
  private static LogWriter lw;
  /**
   * Property 파일에 설정된 LOG.TYPE
   */
  private String logType;

  /**
   * default 생성자<BR>
   * PropertyManager로부터 로그 설정 정보를 얻는다.
   */
  private LogManager(){
    lw = LogWriter.getInstance();
    PropertyManager prop = PropertyManager.getInstance();
    logType = (String)prop.get("LOG.TYPE");
  }

  /**
   * LogManager 객체를 Singleton 패턴으로 리턴한다.
   * @return LogManager 객체
   */
  public static LogManager getInstance(){
    if(m_instance == null){
      m_instance = new LogManager();
    }
    return m_instance;
  }

  /**
   * 메세지를 매개변수로 받아서 설정파일에 기술된 로그방식에 따라 로그 수행
   * @param message 로그에 기록될 메세지
   */
  public void log(String message){
    LogData data = new LogData(message);
    logByType(data);
  }

  /**
   * 코드, 메세지를 매개변수로 받아서 설정파일에 기술된 로그방식에 따라 로그 수행
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   */
  public void log(String code, String message){
    LogData data = new LogData(code, message);
    logByType(data);
  }

  /**
   * 코드, 메세지, 상세메세지를 매개변수로 받아서 설정파일에 기술된 로그방식에 따라 로그 수행
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   * @param detail 로그에 기록될 상세 및 처리 메세지
   */
  public void log(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    logByType(data);
  }

  /**
   * AppException을 매개변수로 받아서 설정파일에 기술된 로그방식에 따라 로그 수행
   * @param e 로그에 기록될 AppException 객체
   */
  public void log(AppException e){
    LogData data = new LogData(e);
    logByType(data);
  }

  /**
   * SysException 매개변수로 받아서 설정파일에 기술된 로그방식에 따라 로그 수행
   * @param e 로그에 기록될 SysException 객체
   */
  public void log(SysException e){
    LogData data = new LogData(e);
    logByType(data);
  }

  /**
   * 메세지를 매개변수로 받아서 설정파일에 기술된 파일에 로그 기록
   * @param message 로그에 기록될 메세지
   */
  public void logFile(String message){
    LogData data = new LogData(message);
    lw.logFile(data);
  }

  /**
   * 코드, 메세지를 매개변수로 받아서 설정파일에 기술된 파일에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   */
  public void logFile(String code, String message){
    LogData data = new LogData(code, message);
    lw.logFile(data);
  }

  /**
   * 코드, 메세지, 상세메세지를 매개변수로 받아서 설정파일에 기술된 파일에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   * @param detail 로그에 기록될 상세 및 처리 메세지
   */
  public void logFile(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logFile(data);
  }

  /**
   * AppException을 매개변수로 받아서 설정파일에 기술된 파일에 로그 기록
   * @param e AppException 객체
   */
  public void logFile(AppException e){
    LogData data = new LogData(e);
    lw.logFile(data);
  }

  /**
   * SysException을 매개변수로 받아서 설정파일에 기술된 파일에 로그 기록
   * @param e SysException 객체
   */
  public void logFile(SysException e){
    LogData data = new LogData(e);
    lw.logFile(data);
  }

  /**
   * 메세지를 매개변수로 받아서 설정파일에 기술된 DB에 로그 기록
   * @param message 로그에 기록될 메세지
   */
  public void logDB(String message){
    LogData data = new LogData(message);
    lw.logDB(data);
  }

  /**
   * 코드, 메세지를 매개변수로 받아서 설정파일에 기술된 DB에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   */
  public void logDB(String code, String message){
    LogData data = new LogData(code, message);
    lw.logDB(data);
  }

  /**
   * 코드, 메세지, 상세메세지를 매개변수로 받아서 설정파일에 기술된 DB에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   * @param detail 로그에 기록될 상세 및 처리 메세지
   */
  public void logDB(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logDB(data);
  }

  /**
   * AppException을 매개변수로 받아서 설정파일에 기술된 DB에 로그 기록
   * @param e AppException 객체
   */
  public void logDB(AppException e){
    LogData data = new LogData(e);
    lw.logDB(data);
  }

  /**
   * SysException을 매개변수로 받아서 설정파일에 기술된 DB에 로그 기록
   * @param e SysException 객체
   */
  public void logDB(SysException e){
    LogData data = new LogData(e);
    lw.logDB(data);
  }

  /**
   * 메세지를 매개변수로 받아서 설정파일에 기술된 콘솔에 로그 기록
   * @param message 로그에 기록될 메세지
   */
  public void logConsole(String message){
    LogData data = new LogData(message);
    lw.logConsole(data);
  }

  /**
   * 코드, 메세지를 매개변수로 받아서 설정파일에 기술된 콘솔에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   */
  public void logConsole(String code, String message){
    LogData data = new LogData(code, message);
    lw.logConsole(data);
  }

  /**
   * 코드, 메세지, 상세메세지를 매개변수로 받아서 설정파일에 기술된 콘솔에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   * @param detail 로그에 기록될 상세 및 처리 메세지
   */
  public void logConsole(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logConsole(data);
  }

  /**
   * AppException을 매개변수로 받아서 설정파일에 기술된 콘솔에 로그 기록
   * @param e AppException 객체
   */
  public void logConsole(AppException e){
    LogData data = new LogData(e);
    lw.logConsole(data);
  }

  /**
   * SysException을 매개변수로 받아서 설정파일에 기술된 콘솔에 로그 기록
   * @param e SysException 객체
   */
  public void logConsole(SysException e){
    LogData data = new LogData(e);
    lw.logConsole(data);
  }

  /**
   * 메세지를 매개변수로 받아서 설정파일에 기술된 JMS에 로그 기록
   * @param message 로그에 기록될 메세지
   */
  public void logJMS(String message){
    LogData data = new LogData(message);
    lw.logJMS(data);
  }

  /**
   * 코드, 메세지를 매개변수로 받아서 설정파일에 기술된 JMS에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   */
  public void logJMS(String code, String message){
    LogData data = new LogData(code, message);
    lw.logJMS(data);
  }

  /**
   * 코드, 메세지, 상세메세지를 매개변수로 받아서 설정파일에 기술된 JMS에 로그 기록
   * @param code 로그에 기록될 코드
   * @param message 로그에 기록될 메세지
   * @param detail 로그에 기록될 상세 및 처리 메세지
   */
  public void logJMS(String code, String message, String detail){
    LogData data = new LogData(code, message, detail);
    lw.logJMS(data);
  }

  /**
   * AppException을 매개변수로 받아서 설정파일에 기술된 JMS에 로그 기록
   * @param e AppException 객체
   */
  public void logJMS(AppException e){
    LogData data = new LogData(e);
    lw.logJMS(data);
  }

  /**
   * SysException을 매개변수로 받아서 설정파일에 기술된 JMS에 로그 기록
   * @param e SysException 객체
   */
  public void logJMS(SysException e){
    LogData data = new LogData(e);
    lw.logJMS(data);
  }

  /**
   * Property 설정파일에 기술된 로그 대상에 따라 로그 수행
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