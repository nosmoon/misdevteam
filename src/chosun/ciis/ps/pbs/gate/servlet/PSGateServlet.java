/***************************************************************************************************
 * ���ϸ�   : PBGateServlet.java
 * ���     : ���Ǳ� �α��� ��ǥ ����
 * �ۼ����� : 2003-11-17
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.gate.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;

/**
 * ���Ǳ� �α���
 */
public class PSGateServlet extends ChosunServlet {

    private static final String CONTENT_TYPE = "text/html; charset=KSC5601";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Clean up resources
    public void destroy() {
    }

    public void checkAuthority() {
    }

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
    public void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ps/gate/";
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ps/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * PSGateWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return String (forward�� nextPage)
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws SysException, AppException {
        String nextPage = null;

        switch (pid) {
            //�α���ȭ��
            case PSGateWBMapping.PSGATE_1000:
                nextPage = "/login.jsp";
                break;
            //���Ǳ� �ʱ�ȭ��
            case PSGateWBMapping.PSGATE_1101:
                nextPage = "/main.jsp";
                break;
            //���Ǳ� �ʱ�ȭ��(TOP MENU)
            case PSGateWBMapping.PSGATE_1106:
                nextPage = "/jsp/ps/pbs_top.jsp";
                break;
            //���Ǳ� �ʱ�ȭ��(CONTENT ȭ��)
            case PSGateWBMapping.PSGATE_1111:
                nextPage = "/jsp/ps/content.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }

}
