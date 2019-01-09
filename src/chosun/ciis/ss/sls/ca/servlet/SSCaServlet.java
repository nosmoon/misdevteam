/***************************************************************************************************
 * 파일명 : SSCaServlet.java
 * 기능 : 사이버센터-서블릿
 * 작성일자 : 2005-04-18
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.ca.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.wb.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.wb.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

public class SSCaServlet extends ChosunServlet {
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
            String servletMappedUrl = "/ss/ca/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSCaServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSCaServlet : process : nextPage : " + nextPage);
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
     * SSCaWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        SSCa1000WB     wb1000 = null; //사이버센터-사이버센터장
        SSBrinfo1000WB wb1100 = null; //사이버센터-사이버수당청구 초기
        SSCa1100WB     wb1110 = null; //사이버센터-사이버수당청구
        SSCa1200WB     wb1200 = null; //사이버센터-사이버수당지급
        SSCa1300WB     wb1300 = null; //사이버센터-사이버수당마감

        switch (pid) {

            //사이버센터-사이버센터장
            case SSCaWBMapping.CA_1000: //사이버센터-사이버센터장-초기화면
                wb1000 = new SSCa1000WB();
                wb1000.initCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1000_a.jsp";
                break;
            case SSCaWBMapping.CA_1005: //사이버센터-사이버센터장-목록
                wb1000 = new SSCa1000WB();
                wb1000.selectCaHeadList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1005_l.jsp";
                break;
            case SSCaWBMapping.CA_1010: //사이버센터-사이버센터장-상세
                wb1000 = new SSCa1000WB();
                wb1000.selectCaHeadDetail(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1010_s.jsp";
                break;
            case SSCaWBMapping.CA_1015: //사이버센터-사이버센터장-등록
                wb1000 = new SSCa1000WB();
                wb1000.accessCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1015_i.jsp";
                break;
            case SSCaWBMapping.CA_1020: //사이버센터-사이버센터장-수정
                wb1000 = new SSCa1000WB();
                wb1000.accessCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1020_u.jsp";
                break;
            case SSCaWBMapping.CA_1025: //사이버센터-사이버센터장-삭제
                wb1000 = new SSCa1000WB();
                wb1000.accessCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1025_d.jsp";
                break;

            //사이버센터-사이버수당청구
            case SSCaWBMapping.CA_1100: //사이버센터-사이버수당청구-초기화면
                wb1100 = new SSBrinfo1000WB();
                wb1100.initBoZip(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1100_a.jsp";
                break;
            case SSCaWBMapping.CA_1110: //사이버센터-사이버수당청구-조회
                wb1110 = new SSCa1100WB();
                wb1110.selectClamList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1110_l.jsp";
                break;
            case SSCaWBMapping.CA_1120: //사이버센터-사이버수당청구-저장
                wb1110 = new SSCa1100WB();
                wb1110.updateCybalon(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1120_i.jsp";
                break;
            case SSCaWBMapping.CA_1130: //사이버센터-사이버수당청구-인쇄
                nextPage = "/jsp/ss/ca/ss_ca_1130_t.jsp";
                break;

            //사이버센터-사이버수당지급
            case SSCaWBMapping.CA_1200: //사이버센터-사이버수당지급-초기화면
                nextPage = "/jsp/ss/ca/ss_ca_1200_l.jsp";
                break;
            case SSCaWBMapping.CA_1210: //사이버센터-사이버수당지급-조회
                wb1200 = new SSCa1200WB();
                wb1200.selectStafpayList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1210_l.jsp";
                break;
            case SSCaWBMapping.CA_1220: //사이버센터-사이버수당지급-인쇄
                nextPage = "/jsp/ss/ca/ss_ca_1220_t.jsp";
                break;
            case SSCaWBMapping.CA_1230: //사이버센터-사이버수당지급-DOWNLOAD
                wb1200 = new SSCa1200WB();
                wb1200.selectDownloadList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1230_l.jsp";
                break;

            //사이버센터-사이버수당마감
            case SSCaWBMapping.CA_1300: //사이버센터-사이버수당마감-마감내역
                wb1300 = new SSCa1300WB();
                wb1300.selectAlonClos(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1300_l.jsp";
                break;
            case SSCaWBMapping.CA_1310: //사이버센터-사이버수당마감-정산마감및취소
                wb1300 = new SSCa1300WB();
                wb1300.accessAlonClos(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1310_a.jsp";
                break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
