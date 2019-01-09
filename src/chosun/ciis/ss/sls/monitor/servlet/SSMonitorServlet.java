/***************************************************************************************************
 * ���ϸ�   : SSMonitorServlet.java
 * ���     : ����͸� ����
 * �ۼ����� : 2005-08-02
 * �ۼ���   : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.monitor.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
//import chosun.ciis.ss.sls.monitor.dm.*;
import chosun.ciis.ss.sls.monitor.wb.*;
//import chosun.ciis.ss.sls.monitor.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * ����͸� Servlet
 */

public class SSMonitorServlet extends ChosunServlet {

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
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws IOException
     * @throws ServletException
     */
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/monitor/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSMonitorServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSMonitorServlet : process : nextPage : " + nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SSMonitorWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {

        String nextPage = null;

        switch (pid) {
            // ����͸�
            case SSMonitorWBMapping.MONITOR_1000: //����͸�
                nextPage = "/jsp/ss/monitor/ss_monitor_1000_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1100: //����͸� �Ǹ�����
                nextPage = "/jsp/ss/monitor/ss_monitor_1100_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1200: //����͸� �Ǹű�
                nextPage = "/jsp/ss/monitor/ss_monitor_1200_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1300: //����͸� ��������
                nextPage = "/jsp/ss/monitor/ss_monitor_1300_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1400: //����͸� ���Ǳ�
                nextPage = "/jsp/ss/monitor/ss_monitor_1400_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1500: //����͸� ���պ���(�Ϲ�)
                nextPage = "/jsp/ss/monitor/ss_monitor_1500_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1600: //����͸� ���պ���(������)
                nextPage = "/jsp/ss/monitor/ss_monitor_1600_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1700: //����͸� ȸ������
                nextPage = "/jsp/ss/monitor/ss_monitor_1700_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1800: //����͸� �ݼ���
                nextPage = "/jsp/ss/monitor/ss_monitor_1800_l.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
