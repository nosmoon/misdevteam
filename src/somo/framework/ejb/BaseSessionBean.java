package somo.framework.ejb;

import java.rmi.*;
import javax.ejb.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 *  EJB�� ���Ǻ� Ŭ������ �⺻������ ��ӹ޾ƾ� �� Ŭ�����μ� javax.ejb.SessionBean �������̽��� �޼ҵ带 �⺻������ �����ϰ� �ִ�.
 *     ex) public class SampleEJB extends BaseSessionBean <BR>
 */
public class BaseSessionBean implements SessionBean{
  /**  javax.ejb.SessionBean api doc ����*/
  protected SessionContext ctx;

  /**  javax.ejb.SessionBean api doc ����*/
  public void ejbActivate() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc ����*/
  public void ejbRemove() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc ����*/
  public void ejbPassivate() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc ����*/
  public void ejbCreate() throws RemoteException{}

  /**  javax.ejb.SessionBean api doc ����*/
  public void setSessionContext(SessionContext ctx){
    this.ctx = ctx;
  }
}