/***************************************************************************************************
 * ���ϸ�   : PSPrintServlet.java
 * ���     : ���ʰ���
 * �ۼ����� : 2006-02-01
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.print.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.wb.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * ���ʸ޴� ��ǥ ����
 */
public class PSPrintServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/print/";
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
     * PBPrintWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {
        String nextPage = null;
        PSPrint1101WB wb1101 = null;

        switch (pid) {
            //���-������´����ʱ�ȭ��
            case PSPrintWBMapping.PSPRINT_1101:            	
                wb1101 = new PSPrint1101WB();
                wb1101.selectCodeList(req, res);
                nextPage = "/jsp/ps/print/ps_print_1101_s.jsp";
                break;
            //���-������´��忡�� ���ȭ�� ȣ��
            case PSPrintWBMapping.PSPRINT_1106:

                //��´�� ���а�
                String kubun = Util.checkString(req.getParameter("kubun"));

                // ���纰 ����/���� ���
                if (kubun.equals("PROC_SUSP")) {
                    nextPage = "/jsp/ps/print/ps_print_1101_t.jsp";
                // ���纰 ������û ��Ȳ
                } else if (kubun.equals("SELF_PCOND")) {
                    nextPage = "/jsp/ps/print/ps_print_1102_t.jsp";
                // ������ ��� ���
                } else if (kubun.equals("BO_SEND_LIST")) {
                    nextPage = "/jsp/ps/print/ps_print_1103_t.jsp";
                // ������ ��޺� ����
                } else if (kubun.equals("BO_SEND_ADJM")) {
                    nextPage = "/jsp/ps/print/ps_print_1104_t.jsp";
                // �߼��ܿ��μ�
                } else if (kubun.equals("SEND_REST")) {
                    nextPage = "/jsp/ps/print/ps_print_1105_t.jsp";
                // �����μ���Ȳ
                } else if (kubun.equals("JD_CAL")) {
                    nextPage = "/jsp/ps/print/ps_print_1106_t.jsp";
                // Ȯ�嵶����Ȳ
                } else if (kubun.equals("RDR_EXTN")) {
                    nextPage = "/jsp/ps/print/ps_print_1107_t.jsp";
                }

                break;
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
