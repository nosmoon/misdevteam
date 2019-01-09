/***************************************************************************************************
 * 파일명   : PBGateServlet.java
 * 기능     : 출판국 로그인 대표 서블릿
 * 작성일자 : 2003-11-17
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.gate.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;

/**
 * 출판국 로그인
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
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
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
     * PSGateWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return String (forward할 nextPage)
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws SysException, AppException {
        String nextPage = null;

        switch (pid) {
            //로그인화면
            case PSGateWBMapping.PSGATE_1000:
                nextPage = "/login.jsp";
                break;
            //출판국 초기화면
            case PSGateWBMapping.PSGATE_1101:
                nextPage = "/main.jsp";
                break;
            //출판국 초기화면(TOP MENU)
            case PSGateWBMapping.PSGATE_1106:
                nextPage = "/jsp/ps/pbs_top.jsp";
                break;
            //출판국 초기화면(CONTENT 화면)
            case PSGateWBMapping.PSGATE_1111:
                nextPage = "/jsp/ps/content.jsp";
                break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }

}
