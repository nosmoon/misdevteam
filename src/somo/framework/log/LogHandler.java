package somo.framework.log;

import java.io.*;
import somo.framework.prop.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * 로그를 실행하는 클래스<BR>
 * 고객사의 구체적인 로그방식에 맞게 커스터마이징 될 수 있도록 로그 대상(파일,콘솔,DB,JMS)별로 별도의 메소드를 가진다.
 *
 */
public class LogHandler {
  /**
   * DB에 로그를 기록하는 세션빈 변수
   */
  protected String logSB;
  /**
   * JMS(Message-Driven Bean)를 이용하여 Asynchronous 하게 로그를 기록하는 Message-Driven Bean 변수
   */
  protected String logMDB;

  /**
   * default 생성자<BR>
   * 세션빈과 Message-driven Bean의 JNDI 이름을 PropertyManager로 부터 얻는다.
   */
  public LogHandler(){
    PropertyManager prop = PropertyManager.getInstance();
    logSB = (String)prop.get("LOG.SBNAME");
    logMDB  = (String)prop.get("LOG.MDBNAME");
  }
  /**
   * 파일에 로그를 기록하는 메소드
   * @param out 대상 파일의 PrintWriter 객체
   * @param data 로그 항목 정보를 가진 LogData 객체
   */
  public void writeToFile(PrintWriter out, LogData data){
    out.println("Log :");
    out.println("\tDATE : "+data.date);
    out.println("\tERROR_CODE : "+data.code);
    out.println("\tERROR_MESSAGE : "+data.message);
    out.println();
  }
  /**
   * 콘솔에 로그를 기록하는 메소드
   * @param out 대상 파일의 콘솔출력스트림 객체
   * @param data 로그 항목 정보를 가진 LogData 객체
   */
  public void writeToConsole(LogData data){
    System.out.println("Log :");
    System.out.println("\tDATE : "+data.date);
    System.out.println("\tCODE : "+data.code);
    System.out.println("\tMESSAGE : "+data.message);
    System.out.println();
  }
  /**
   * 세션빈을 통해 DB에 로그를 기록하는 메소드
   * @param data 로그 항목 정보를 가진 LogData 객체
   */
  public void writeToDB(LogData data){
    System.out.println("LogHandler writeToDB() is called");
    System.out.println("LogHandler writeToDB() should be implemented !!!");
  }
  /**
   * JMS를 통해 Message-driven Bean에 로그를 기록하는 메소드
   * @param data 로그 항목 정보를 가진 LogData 객체
   */
  public void writeToJMS(LogData data){
    System.out.println("LogHandler writeToJMS() is called");
    System.out.println("LogHandler writeToJMS() should be implemented !!!");
  }
}