package somo.framework.log;

import java.io.*;

import somo.framework.prop.*;
import somo.framework.log.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  프레임워크 내에서 발생한 예외사항을 별도로 로그처리한다.
 *
 */
public class FWLogManager{
  /**
   * Singleton 패턴 적용 멤버변수
   */
  private static FWLogManager m_instance;
  private String fwLogFile;
  private File f;
  private PrintWriter fwFileOut;

  /**
   * default 생성자<BR>
   * PropertyManager를 이용하여 프레임워크 예외 로그 대상 파일명을 얻는다. 해당 파일을 찾지 못한 경우 콘솔에 에러메세지를 출력한다.
   */
  private FWLogManager(){
    PropertyManager prop = PropertyManager.getInstance();
    fwLogFile = (String)prop.get("LOG.FILENAME");
System.out.println("11:FWLogManager : FWLogManager() : fwLogFile : "+fwLogFile);
    f = new File(fwLogFile);

    try{
      if(f.exists()){
        // 파일이 존재하면 append mode, autoflush 로 PrintWriter를 생성
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile, true), true);
      } else{
        //autoflush
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile), true);
      }
    } catch(IOException e){
      System.out.println("Framework Message : ");
      System.out.println("\tSource : FWLogManager.java");
      System.out.println("\tCall : FWLogManager()");
      System.out.println("\tException : IOException");
      System.out.println("\tDetail : ");
      System.out.println(
          "\t\t프레임워크의 예외상황발생시 로그를 담당하는 FWLogManager가 대상파일을 찾지 못했습니다.");
      System.out.println("\t\t프레임워크의 예외상황발생시 로그를 파일에 기록할 수 없습니다.");
      System.out.println("\tCheck : ");
      System.out.println("\t\t프레임워크 설정파일의 LOG.FWFILENAME 항목을 확인하십시오.");
      System.out.println("\tServer Restart : ");
      System.out.println("\t\tSystem은 문제해결 뒤 다시 시작되는 것이 좋습니다.");
      System.out.println("\t\tSystem은 계속 서비스할 수 있습니다.");
    } finally{
      if(fwFileOut != null){
        fwFileOut.close();
      }
    }
  }

  /**
   * Singleton 패턴 적용 객체를 리턴한다.
   * @return FWLogManager 객체
   */
  public static FWLogManager getInstance(){
    if(m_instance == null){
      m_instance = new FWLogManager();
    }
    return m_instance;
  }

  /**
   * 화면과 파일에 로그를 기록한다.
   * @param src 로그수행 코드(예외발생 코드)
   * @param call 로그수행 코드내 호출 메소드
   * @param e 발생된 예외
   * @param detail 발생된 예외 상세 내용
   * @param check 예외발생 원인 명세
   * @param restart 서버 재가동 필요성 여부
   */
  public void log(String src, String call, Exception e, String detail,
                  String check, boolean restart){
    // Log to Console
    System.out.println("Framework Message : ");
    System.out.println("\tSource : " + src);
    System.out.println("\tCall : " + call);
    System.out.println("\tException : " + e);
    System.out.println("\tDetail : ");
    System.out.println("\t\t" + detail);
    System.out.println("\tCheck : ");
    System.out.println("\t\t" + check);
    System.out.println("\tServer Restart : ");
    if(restart){
      System.out.println("\t\tSystem은 문제해결 뒤 다시 시작되어야 합니다.");
    } else{
      System.out.println("\t\tSystem은 계속 서비스할 수 있습니다.");
    }

    // Log to File
    try{
      if(f.exists()){
        // 파일이 존재하면 append mode, autoflush 로 PrintWriter를 생성
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile, true), true);
      } else{
        //autoflush
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile), true);
      }
      fwFileOut.println("Framework Message : ");
      fwFileOut.println("\tSource : " + src);
      fwFileOut.println("\tCall : " + call);
      fwFileOut.println("\tException : " + e);
      fwFileOut.println("\tDetail : ");
      fwFileOut.println("\t\t" + detail);
      fwFileOut.println("\tCheck : ");
      fwFileOut.println("\t\t" + check);
      fwFileOut.println("\tServer Restart : ");
      if(restart){
        fwFileOut.println("\t\tSystem은 문제해결 뒤 다시 시작되어야 합니다.");
      } else{
        fwFileOut.println("\t\tSystem은 계속 서비스할 수 있습니다.");
      }
    } catch(IOException ioe){
      System.out.println("Framework Message : ");
      System.out.println("\tSource : FWLogManager.java");
      System.out.println("\tCall : FWLogManager()");
      System.out.println("\tException : IOException");
      System.out.println("\tDetail : ");
      System.out.println(
          "\t\t프레임워크의 예외상황발생시 로그를 담당하는 FWLogManager가 대상파일을 찾지 못했습니다.");
      System.out.println("\t\t프레임워크의 예외상황발생시 로그를 파일에 기록할 수 없습니다.");
      System.out.println("\tCheck : ");
      System.out.println("\t\t프레임워크 설정파일의 LOG.FWFILENAME 항목을 확인하십시오.");
      System.out.println("\tServer Restart : ");
      System.out.println("\t\tSystem은 문제해결 뒤 다시 시작되는 것이 좋습니다.");
      System.out.println("\t\tSystem은 계속 서비스할 수 있습니다.");
    } finally{
      if(fwFileOut != null){
        fwFileOut.close();
      }
    }
  }
}