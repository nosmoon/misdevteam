/***************************************************************************************************
* ���ϸ�   : ChosunServlet.java
* ���     : ���Ǳ� ���� ��ǥ ����
* �ۼ����� : 2004-02-24
* �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import somo.framework.servlet.*;
import somo.framework.expt.*;

/**
 * ���Ǿ������� ����޴� ����
 */
public abstract class ChosunServlet extends ControllerServlet {

    public abstract void checkAuthority();

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
     *
     * @param req request
     * @param res response
     * @throws IOException
     * @throws ServletException
     */
    public abstract void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException;

    /**
     * PSAllowWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,
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
    public abstract String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws SysException, AppException;

    public int extractPid(HttpServletRequest req, String servletMappedUrl) {
        int iPid = 0;
        try {
            String requestURI = req.getRequestURI();                         // (�� : "/allow/1100")
            String strPid = requestURI.substring(servletMappedUrl.length()); // PID �� (�� : "1100")
            iPid = Integer.parseInt(strPid);
        } catch (Exception e) {
            throw new SysException(e);
        }
        return iPid;
    }

}
