/***************************************************************************************************
 * 파일명 : SSCAMPServlet.java
 * 기능 :  캠페인확장등록 servlet
 * 작성일자 : 2005-05-27
 * 작성자 :  이혁
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.camp.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.wb.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.wb.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.wb.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.wb.*;
import chosun.ciis.ss.sal.rdr.ds.*;

import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.camp.wb.*;
import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * 판매국 업무지원 상담원 Servlet
 */

public class SSCAMPServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/camp/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSCAMPServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSCAMPServlet : process : nextPage : " + nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e){
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }


        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SSCAMPWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
/*        SSExtn1000WB wbextn = null; //확장현황
        SSMove1000WB wbmove = null; //이사독자
        SSReader1100WB wbdsct = null; //독자불편
        SSReader1200WB wbvs = null; //VacationStop
        SLReader2400WB wbvs2 = null; //VacationStop(지국)*/
        SSCAMP1000WB wbcamp = null;

        switch (pid) {
            // 상담원-확장
            case SSCAMPWBMapping.CAMP_1000: //캠페인확장 초기화면
                wbcamp = new SSCAMP1000WB();
                wbcamp.init(req, res);
                nextPage = "/jsp/ss/camp/ss_camp_1000_a.jsp";
                break;
            case SSCAMPWBMapping.CAMP_1100: //캠페인확장 등록
                wbcamp = new SSCAMP1000WB();
                wbcamp.saveCampExtn(req, res);
                nextPage = "/jsp/ss/camp/ss_camp_1100_i.jsp";
                break;

            case SSCAMPWBMapping.CAMP_1101: //캠페인확장 이벤트목록 검색
                wbcamp = new SSCAMP1000WB();
                wbcamp.searchCampEventList(req, res);
                System.out.println("camp_1101...");
                nextPage = "/jsp/ss/camp/ss_camp_1101_a.jsp";
                break;

           default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
