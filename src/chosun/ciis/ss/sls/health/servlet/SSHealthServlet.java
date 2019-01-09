/***************************************************************************************************
 * 파일명 : SSHealthServlet.java
 * 기능 : 헬스조선 서블릿
 * 작성일자 : 2014-12-23
 * 작성자 : 심정보
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.health.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.wb.*;
import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * 판매국 업무지원 헬스조선 Servlet
 */

public class SSHealthServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/health/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSHealthServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSHealthServlet : process : nextPage : " + nextPage);
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
     * SSExtnWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        SSHealth1000WB wb1000 = null; //워크북 관리
        SSHealth1100WB wb1100 = null; //워크북 마감
       
        switch (pid) {
            case SSHealthWBMapping.HEALTH_1000: //워크북 관리 초기
                wb1000 = new SSHealth1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/health/ss_health_1000_a.jsp";
                break;
            case SSHealthWBMapping.HEALTH_1010: //워크북 관리 리스트
                wb1000 = new SSHealth1000WB();
                wb1000.selectWorkbook(req, res);
                nextPage = "/jsp/ss/health/ss_health_1010_l.jsp";
                break;  
            case SSHealthWBMapping.HEALTH_1020: //워크북 관리 상세
                wb1000 = new SSHealth1000WB();
                wb1000.detailWorkbook(req, res);
                nextPage = "/jsp/ss/health/ss_health_1020_s.jsp";
                break;      
            case SSHealthWBMapping.HEALTH_1030: //워크북 관리 입금 저장
                wb1000 = new SSHealth1000WB();
                wb1000.saveWorkbook(req, res);
                nextPage = "/jsp/ss/health/ss_health_1030_u.jsp";
                break;  
                
            case SSHealthWBMapping.HEALTH_1100: //워크북 마감 초기
                nextPage = "/jsp/ss/health/ss_health_1100_a.jsp";
                break;   
            case SSHealthWBMapping.HEALTH_1110: //워크북 마감 리스트
                wb1100 = new SSHealth1100WB();
                wb1100.selectWorkbookSend(req, res);
                nextPage = "/jsp/ss/health/ss_health_1110_l.jsp";
                break; 
            case SSHealthWBMapping.HEALTH_1120: //워크북 마감 상세리스트
            	wb1100 = new SSHealth1100WB();
                wb1100.detailWorkbookSend(req, res);
                nextPage = "/jsp/ss/health/ss_health_1120_s.jsp";
                break; 
            case SSHealthWBMapping.HEALTH_1130: //워크북 마감 마감처리
            	wb1100 = new SSHealth1100WB();
                wb1100.saveWorkbookSend(req, res);
                nextPage = "/jsp/ss/health/ss_health_1130_u.jsp";
                break;     
            
            default:	
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
