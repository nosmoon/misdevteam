/***************************************************************************************************
 * 파일명 : SSCNSServlet.java
 * 기능 : 상담원 서블릿
 * 작성일자 : 2004-01-05
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.cns.servlet;

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

import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.wb.*;
import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * 판매국 업무지원 상담원 Servlet
 */

public class SSCNSServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/cns/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSCNSServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSCNSServlet : process : nextPage : " + nextPage);
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
     * SSCNSWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        SSExtn1000WB wbextn = null; //확장현황
        SSMove1000WB wbmove = null; //이사독자
        SSReader1100WB wbdsct = null; //독자불편
        SSReader1200WB wbvs = null; //VacationStop
        SLReader2400WB wbvs2 = null; //VacationStop(지국)
        SSCNS1000WB wbcns = null;

        switch (pid) {
            // 상담원-확장
            case SSCNSWBMapping.CNS_1000: //상담원-확장 초기화면
                wbextn = new SSExtn1000WB();
                wbextn.init(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1000_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1010: //상담원-확장 확장자소속 목록
                wbextn = new SSExtn1000WB();
                wbextn.selectExtnBlngCodeList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1010_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1020: //상담원-확장 전체 목록
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1020_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1030: //상담원-확장 독자자진신청 목록
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1030_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1040: //상담원-확장 사원확장 목록
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1040_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1050: //상담원-확장 품앗이확장 목록
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1050_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1060: //상담원-확장 지국자체확장 목록
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1060_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1070: //상담원-확장 상세
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1070_s.jsp";
                break;


            // 상담원-이사
            case SSCNSWBMapping.CNS_1100: //상담원-이사 초기화면
                wbmove = new SSMove1000WB();
                wbmove.init(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1100_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1110: //상담원-이사 목록
                wbmove = new SSMove1000WB();
                wbmove.selectMoveList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1110_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1120: //상담원-이사 상세
                wbmove = new SSMove1000WB();
                wbmove.selectMoveDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1120_s.jsp";
                break;


            // 상담원-불편
            case SSCNSWBMapping.CNS_1200: //상담원-불편 초기화면
                wbdsct = new SSReader1100WB();
                wbdsct.selectInitList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1200_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1210: //상담원-불편 목록
                wbdsct = new SSReader1100WB();
                wbdsct.selectRdrDsctList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1210_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1220: //상담원-불편 상세
                wbdsct = new SSReader1100WB();
                wbdsct.selectRdrDsctDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1220_s.jsp";
                break;
            case SSCNSWBMapping.CNS_1230: //상담원-불편 통계 초기화면
                nextPage = "/jsp/ss/cns/ss_cns_1230_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1240: //상담원-불편 통계 목록
                wbcns = new SSCNS1000WB();
                wbcns.selectDsctStatDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1240_l.jsp";
                break;

            // 상담원-VacationStop
            case SSCNSWBMapping.CNS_1300: //상담원-VacationStop 초기화면
                wbvs = new SSReader1200WB();
                wbvs.selectInitList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1300_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1305: //상담원-VacationStop 휴가지코드
                wbvs2 = new SLReader2400WB();
                wbvs2.selectVSAreaRegn(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1305_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1307: //상담원-VacationStop 휴가지지국정보
                wbvs2 = new SLReader2400WB();
                wbvs2.selectVSBODetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1307_s.jsp";
                break;
            case SSCNSWBMapping.CNS_1310: //상담원-VacationStop 목록
                wbvs = new SSReader1200WB();
                wbvs.selectVsList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1310_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1320: //상담원-VacationStop 상세
                wbvs = new SSReader1200WB();
                wbvs.selectVsDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1320_s.jsp";
                break;

            // 상담원-자동이체
            case SSCNSWBMapping.CNS_1400: //상담원-지로자동이체신청-초기화면
                wbcns = new SSCNS1000WB();
                wbcns.initCNSShftAplc(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1400_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1410: //상담원-카드자동이체신청-초기화면
                wbcns = new SSCNS1000WB();
                wbcns.initCNSShftAplc(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1410_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1420: //상담원-카드인증
                nextPage = "/jsp/ss/cns/ss_cns_1420_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1430: //상담원-지로자동이체신청-등록
                wbcns = new SSCNS1000WB();
                wbcns.insertCNSShftAplc(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1430_i.jsp";
                break;
                
            // 상담원-검색,기타
            case SSCNSWBMapping.CNS_1500: //상담원-독자검색 초기화면
                nextPage = "/jsp/ss/cns/ss_cns_1500_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1510: //상담원-독자검색 목록
                wbcns = new SSCNS1000WB();
                wbcns.selectRdrSrchList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1510_l.jsp";
                break;

            case SSCNSWBMapping.CNS_1550: //상담원-등록
                wbcns = new SSCNS1000WB();
                wbcns.accessCNS(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1550_i.jsp";
                break;
            case SSCNSWBMapping.CNS_1560: //상담원-수정
                wbcns = new SSCNS1000WB();
                wbcns.accessCNS(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1560_u.jsp";
                break;
            case SSCNSWBMapping.CNS_1570: //상담원-삭제
                wbcns = new SSCNS1000WB();
                wbcns.accessCNS(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1570_d.jsp";
                break;

           default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
