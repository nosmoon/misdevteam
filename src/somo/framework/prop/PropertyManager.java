package somo.framework.prop;

import java.util.*;
import java.io.*;

import somo.framework.expt.*;
import somo.framework.log.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * Property에 대한 관리를 수행한다.<BR>
 * Property 설정파일에 기술된 각종 설정정보를 읽고 유지한다.<BR>
 *
 */
public class PropertyManager extends Properties{
  /**
   * Singleton 패턴 적용 멤버변수
   */
  protected static PropertyManager m_instance;

  /**
   * default 생성자
   */
  private PropertyManager(){
  }

  /**
   * PropertyManager 객체를 Singleton 패턴으로 리턴한다.
   * @return PropertyManager 객체
   */
  public static PropertyManager getInstance(){
    if(m_instance == null){
      m_instance = new PropertyManager();
    }
    return m_instance;
  }

  /**
   * PropertyManager 초기화 메소드<BR>
   * Server의 Startup 클래스에서 호출한다.<BR>
   * Property 설정파일을 매개변수로 받아서 해당파일의 다양한 설정내용을 메모리에 로드한다.
   * @param ConfigeFileFullName Property 설정파일명(Full Path)
   */
  public static void init(String ConfigeFileFullName){
    if(m_instance == null){
      m_instance = new PropertyManager();

      try{
        //default 환경변수파일인  default.conf file loading
        FileInputStream fin = new FileInputStream(ConfigeFileFullName);
        m_instance.load(fin);
        fin.close();
      } catch(IOException e){
        FWLogManager.getInstance().log("PropertyManager.java", "FileInputStream(), load()", e, "공통속성 파일로부터 속성을 로드하지 못했습니다.", "공통속성 파일 default.conf의 위치 및 포맷을 확인하십시오.", true);
        throw new SysException(e);
      }
    }
  }
}