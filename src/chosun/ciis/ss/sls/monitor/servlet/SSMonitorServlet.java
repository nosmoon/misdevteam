/***************************************************************************************************
 * 파일명   : SSMonitorServlet.java
 * 기능     : 모니터링 서블릿
 * 작성일자 : 2005-08-02
 * 작성자   : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
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
 * 모니터링 Servlet
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
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
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
     * SSMonitorWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {

        String nextPage = null;

        switch (pid) {
            // 모니터링
            case SSMonitorWBMapping.MONITOR_1000: //모니터링
                nextPage = "/jsp/ss/monitor/ss_monitor_1000_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1100: //모니터링 판매지국
                nextPage = "/jsp/ss/monitor/ss_monitor_1100_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1200: //모니터링 판매국
                nextPage = "/jsp/ss/monitor/ss_monitor_1200_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1300: //모니터링 출판지사
                nextPage = "/jsp/ss/monitor/ss_monitor_1300_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1400: //모니터링 출판국
                nextPage = "/jsp/ss/monitor/ss_monitor_1400_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1500: //모니터링 통합빌링(일반)
                nextPage = "/jsp/ss/monitor/ss_monitor_1500_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1600: //모니터링 통합빌링(관리자)
                nextPage = "/jsp/ss/monitor/ss_monitor_1600_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1700: //모니터링 회원통합
                nextPage = "/jsp/ss/monitor/ss_monitor_1700_l.jsp";
                break;
            case SSMonitorWBMapping.MONITOR_1800: //모니터링 콜센터
                nextPage = "/jsp/ss/monitor/ss_monitor_1800_l.jsp";
                break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
