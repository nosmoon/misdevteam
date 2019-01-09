package somo.framework.log;

import java.io.*;
import java.util.*;
import java.text.*;

import somo.framework.prop.*;
import somo.framework.expt.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  로그의 대상이 되는 기본 항목으로 날짜 및 시간, 코드, 메세지, 상세메세지를 가진다.
 *
 */
public class LogData implements Serializable{
  /**
   * 로그 날짜 및 시간
   */
  public String date;
  /**
   * 로그 항목 코드
   */
  public String code;
  /**
   * 로그 항목 설명 메세지
   */
  public String message;
  /**
   * 로그 항목 설명 및 처리를 위한 상세 메세지
   */
  public String detail;

  /**
   * default 생성자
   */
  public LogData(){
    init();
  }

  /**
   * 메세지를 매개변수로 받는 생성자
   * @param message 로그 항목 설명 메세지
   */
  public LogData(String message){
    init();
    this.message = message;
  }

  /**
   * 코드, 메세지를 매개변수로 받는 생성자
   * @param code 로그 항목 코드
   * @param message 로그 항목 설명 메세지
   */
  public LogData(String code, String message){
    init();
    this.code = code;
    this.message = message;
  }

  /**
   * 코드, 메세지, 상세메세지를 매개변수로 받는 생성자
   * @param code 로그 항목 코드
   * @param message 로그 항목 설명 메세지
   * @param detail 로그 항목 설명 및 처리를 위한 상세 메세지
   */
  public LogData(String code, String message, String detail){
    init();
    this.code = code;
    this.message = message;
    this.detail = detail;
  }

  /**
   * AppException 객체를 매개변수로 받는 생성자<BR>
   * AppException의 멤버변수인 코드, 메세지, 상세메세지를 멤버변수에 저장한다.
   * @param e
   */
  public LogData(AppException e){
    init();
    this.code = e.getErrorCode();
    this.message = e.getErrorMessage();
    this.detail = e.getErrorDetail();
  }

  /**
   * SysException 객체를 매개변수로 받는 생성자<BR>
   * SysException로부터 코드, 메세지, 상세메세지를 설정한다.
   * @param e
   */
  public LogData(SysException e){
    init();
    this.code = (String)PropertyManager.getInstance().get("LOG.SYSEXCEPTION");
    this.message = e.getException().toString();
    // 예외 발생에 대한 stack 정보를 String으로 변환
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    this.detail = sw.getBuffer().toString();
  }

  /**
   * 초기화 메소드로서 Property 설정파일의 포맷 설정에 맞게 날짜 및 시간 정보를 얻는다.
   */
  private void init(){
    String dateFormat = (String)PropertyManager.getInstance().get("LOG.DATEFORMAT");
    this.date = new SimpleDateFormat(dateFormat).format(new Date());
  }
}