package somo.framework.ejb;

import java.rmi.*;
import javax.ejb.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  EJB의 세션빈 클래스가 기본적으로 상속받아야 할 클래스로서 javax.ejb.SessionBean 인터페이스의 메소드를 기본적으로 구현하고 있다.
 *     ex) public class SampleEJB extends BaseSessionBean <BR>
 */
public class BaseSessionBean implements SessionBean{
  /**  javax.ejb.SessionBean api doc 참조*/
  protected SessionContext ctx;

  /**  javax.ejb.SessionBean api doc 참조*/
  public void ejbActivate() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc 참조*/
  public void ejbRemove() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc 참조*/
  public void ejbPassivate() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc 참조*/
  public void ejbCreate() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc 참조*/
  public void setSessionContext(SessionContext ctx){
    this.ctx = ctx;
  }
}