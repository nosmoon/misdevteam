/***************************************************************************************************
* ���ϸ� : ChosunServlet.java
* ��� : �����Ϻ� ������Ʈ �⺻ ����
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import somo.framework.servlet.*;
import somo.framework.expt.*;

public abstract class ChosunServlet extends ControllerServlet {

  public abstract void checkAuthority();

  /**
   * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
   * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
   * ���ϵ� nextPage�� request�� forward�Ѵ�.
   *
   * @param req request
   * @param res response
   * @throws IOException
   * @throws ServletException
   */
  public abstract void process(HttpServletRequest req, HttpServletResponse res) throws
      IOException, ServletException;

  /**
   * PilotWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
   * �޼ҵ带 ȣ���Ѵ�.
   * ����� ���� nextPage�� ��ȯ�Ѵ�.
   *
   * @param req request
   * @param res response
   * @param pid process id
   * @return forward�� nextPage
   * @throws SysException
   * @throws AppException
   */
  public abstract String executeWorker(HttpServletRequest req, HttpServletResponse res,
                              int pid) throws AppException;

  public int extractPid(HttpServletRequest req, String servletMappedUrl) {
    int iPid = 0;
    try {
      String requestURI = req.getRequestURI(); // (�� : "/pilot/1000")
      String strPid = requestURI.substring(servletMappedUrl.length()); // PID �� (�� : "1000")
      iPid = Integer.parseInt(strPid);
    } catch (Exception e) {
      throw new SysException(e);
    }
    return iPid;
  }

}