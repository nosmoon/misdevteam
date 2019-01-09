package somo.framework.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * ��� Controller ������ ��ӹ޴� �߻� Ŭ����<BR>
 * Request�� ������ ���� �� �α��� ó���� ���������� ������ �� process()�� ȣ���Ѵ�.<BR>
 * ��ӹ޴� Controller ������ checkAuthority()�� �����Ͽ� ���� �� �α��� ó���� �����Ѵ�.<BR>
 * ��ӹ޴� Controller ������ process()�� �����Ͽ� ������ ���� �۾��� �����Ѵ�.
 *   1. Request Processing, Session Processing�� ���� Bean�� �޼ҵ带 ȣ���� �غ� �����Ѵ�.<BR>
 *   2. URL ���� ���� �̿��Ͽ� ������ Bean �� Bean�� �޼ҵ带 �����Ͽ� ȣ���Ѵ�.<BR>
 *   3. Bean �� �޼ҵ� ȣ������ ����, ������ JSP�� �б��Ű��, �б�� JSP �� ������ �����͸� RequestDispatching�� ���� �����Ѵ�.
 *
 */
public abstract class ControllerServlet extends HttpServlet {
  /**
   * �ʱ�ȭ�� �ʿ��� �۾��� �����Ѵ�.<BR>
   * ���� Controller ������ �ʿ�ÿ� overriding�� ���� �߰����� �۾��� �����Ѵ�.
   * @throws ServletException
   */
  public void init() throws ServletException {
  }

  /**
   * HTTP GET ����� ��û�� ó���Ѵ�.
   * @param req ����� HTTP ��û
   * @param res ����� HTTP ����
   * @throws ServletException
   * @throws IOException
   */
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    checkAuthority();
    process(req, res);
  }

  /**
   * HTTP POST ����� ��û�� ó���Ѵ�.
   * @param req ����� HTTP ��û
   * @param res ����� HTTP ����
   * @throws ServletException
   * @throws IOException
   */
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    doGet(req, res);
  }

  /**
   * ���ҽ� �ݳ� �� ������ �������� �۾��� �����Ѵ�.<BR>
   * ���� Controller ������ �ʿ�ÿ� overriding�� ���� �߰����� �۾��� �����Ѵ�.
   */
  public void destroy() {
  }

  /**
   * ���� Ŭ�������� �����Ͽ� ���� �� �α��� ó���� �����Ѵ�.
   */
  public abstract void checkAuthority();
  /**
   * ���� Ŭ�������� �����Ͽ� �Ķ���� ó��,Bean�� �޼ҵ�ȣ��,JSP �б���� �۾��� �����Ѵ�.
   * @param req ����� HTTP ��û
   * @param res ����� HTTP ����
   */
  public abstract void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException ;
}