package somo.framework.expt;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * System 관련 발생되는 다양한 예외상황을 표현한다.<BR>
 * 모든 프레임워크의 public 메소드는 System 관련 예외상항이 발생하면 이 SysException을 발생시킨다.<BR>
 *
 */
public class SysException extends RuntimeException
{
    private Exception e;

    /**
     * Default 생성자
     */
    public SysException(){
    }

    /**
     *
     * @param e 발생한 System Exception
     */
    public SysException(Exception e) {
      this.e = e;
    }

    /**
     *
     * @return  System Exception
     */
    public Exception getException(){
      return e;
    }

    /**
     *
     * @param e System Exception
     */
    public void setException(Exception e){
      this.e = e;
    }
}

