/***************************************************************************************************
 * 파일명   : PSPrintServlet.java
 * 기능     : 기초관리
 * 작성일자 : 2006-02-01
 * 작성자   : 전현표
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
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
 * 기초메뉴 대표 서블릿
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
     * PBPrintWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {
        String nextPage = null;
        PSPrint1101WB wb1101 = null;

        switch (pid) {
            //출력-당일출력대장초기화면
            case PSPrintWBMapping.PSPRINT_1101:            	
                wb1101 = new PSPrint1101WB();
                wb1101.selectCodeList(req, res);
                nextPage = "/jsp/ps/print/ps_print_1101_s.jsp";
                break;
            //출력-당일출력대장에서 출력화면 호출
            case PSPrintWBMapping.PSPRINT_1106:

                //출력대상 구분값
                String kubun = Util.checkString(req.getParameter("kubun"));

                // 지사별 생산/중지 통계
                if (kubun.equals("PROC_SUSP")) {
                    nextPage = "/jsp/ps/print/ps_print_1101_t.jsp";
                // 지사별 자진신청 현황
                } else if (kubun.equals("SELF_PCOND")) {
                    nextPage = "/jsp/ps/print/ps_print_1102_t.jsp";
                // 지국별 배달 목록
                } else if (kubun.equals("BO_SEND_LIST")) {
                    nextPage = "/jsp/ps/print/ps_print_1103_t.jsp";
                // 지국별 배달비 정산
                } else if (kubun.equals("BO_SEND_ADJM")) {
                    nextPage = "/jsp/ps/print/ps_print_1104_t.jsp";
                // 발송잔여부수
                } else if (kubun.equals("SEND_REST")) {
                    nextPage = "/jsp/ps/print/ps_print_1105_t.jsp";
                // 절독부수현황
                } else if (kubun.equals("JD_CAL")) {
                    nextPage = "/jsp/ps/print/ps_print_1106_t.jsp";
                // 확장독자현황
                } else if (kubun.equals("RDR_EXTN")) {
                    nextPage = "/jsp/ps/print/ps_print_1107_t.jsp";
                }

                break;
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
