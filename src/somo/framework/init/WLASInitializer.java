package somo.framework.init;

import java.io.*;
import java.util.*;

import somo.framework.prop.*;
import somo.framework.lib.*;
import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.log.*;

/**
 *
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * Weblogic Server의 초기화에 사용된다.<BR>
 * Startup class에서 이 클래스의 초기화 메소드를 호출한다.<BR>
 * 웹로직제공 클래스포맷으로 보다 자세한 사용법은 웹로직의 기술문서를 참조한다.
 * @see somo.framework.init.WLAST3Init
 */
public class WLASInitializer{
  /**
   * 웹로직 기술문서 참조
   */
  protected WLASInitializer(){
  }

  /**
   * Server 기동시 수행되어야 할 프레임워크의 초기화 메소드를 모두 호출한다.
   * @param WLASConfigfile - 프레임워크의 PropertyManager가 읽고 처리해야할 프레임워크 Property설정파일 경로
   */
  public static void executeAll(String WLASConfigfile){
    initPropertyManager(WLASConfigfile);
    initMessageManager();
    initJNDIManager();
    LogManager.getInstance().log("시스템 기동시 필요한 Framework의 모든 Manager 초기화 작업이 성공적으로 수행되었습니다.");
  }

  /**
   * 프레임워크의 PropertyManager를 이용하여 프레임워크 Property설정파일의 내용을 메모리에 로드한다.
   * @param fileName Property설정파일 경로
   */
  private static void initPropertyManager(String fileName){
    try{
      PropertyManager.init(fileName);
    } catch(Exception e){
      FWLogManager.getInstance().log("WLASInitialzer.java",
                                     "PropertyManager.init()", e,
                                     "Property 초기화에서 Exception이 발생했습니다.",
                                     "Property 초기화 파일의 위치 및 포맷을 확인하십시오.", true);
      throw new SysException(e);
    }
  }

  /**
   * 비즈니스로직의 예외상황시 표현해야할 메세지를 관리하는 MessageManager의 초기화를 실행한다.
   */
  private static void initMessageManager(){
    try{
      MessageManager.getInstance();
    } catch(Exception e){
      FWLogManager.getInstance().log("WLASInitialzer.java",
                                     "MessageManager.getInstance()", e,
                                     "Message 초기화과정에서 Exception이 발생했습니다.",
                                     "Message 초기화 파일의 위치, 설정 속성 및 값을 확인하십시오.", true);
      throw new SysException(e);
    }
  }

  /**
   * Server의 Resource 정보를 관리하는 JNDIManager의 초기화를 실행한다.
   */
  private static void initJNDIManager(){
    try{
      JNDIManager.getInstance();
    } catch(Exception e){
      FWLogManager.getInstance().log("WLASInitialzer.java",
                                     "JNDIManager.getInstance()", e,
                                     "JNDIManager 초기화과정에서 Exception이 발생했습니다.",
                                     "JNDI 서버의 설정 속성 및 값을 확인하십시오.", true);
      throw new SysException(e);
    }
  }
}