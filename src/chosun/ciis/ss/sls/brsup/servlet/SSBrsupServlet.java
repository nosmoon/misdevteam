/***************************************************************************************************
 * 파일명 : SSBrsupServlet.java
 * 기능 : 지국지원 서블릿
 * 작성일자 : 2004-01-20
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.util.Util;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.SS_SLS_BRSUP_1799_LALLSTR2Record;
import chosun.ciis.ss.sls.brsup.rec.SS_U_PROCAUTOTRASALLSTRRecord;
import chosun.ciis.ss.sls.brsup.wb.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;

/**
 * 판매국 업무지원 지국지원 Servlet//
 */

public class SSBrsupServlet extends ChosunServlet {

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
    d * @throws ServletException;;
     */
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/brsup/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSMoveServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSMoveServlet : process : nextPage : " + nextPage);
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

        if(nextPage != null && nextPage.length() > 0){
          RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
          rd.forward(req, res);
        }
    }

    /**
     * SSMoveWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        SSBrsup1000WB wb1000 = null; //지국지원-신문지원물품-등록,입고,신청
        SSBrsup1100WB wb1100 = null; //지국지원-신문지원물품-발송,사고
        SSBrsup1200WB wb1200 = null; //지국지원-신문지원물품-마감,비용
        SSBrsup1300WB wb1300 = null; //지국지원-상해보험-등록,신규신청,변경신청
        SSBrsup1400WB wb1400 = null; //지국지원-상해보험-마감,비용
        SSBrsup1500WB wb1500 = null; //지국지원-상해보험-사고,보험금,가입현황
        SSBrsup1600WB wb1600 = null; //지국지원-빌링-지로EDI수납관리
        SSBrsup1700WB wb1700 = null; //지국지원-빌링-자동이체-납부자관리
        SSBrsup2200WB wb2200 = null; //지국지원-빌링-자동이체-납부자관리2
        SSBrsup1800WB wb1800 = null; //지국지원-빌링-수납수수료-기준

        SSBrsup2000WB wb2000 = null; //지국지원-판촉요원
        SSBrsup2100WB wb2100 = null; //지국지원-컴퓨터A/S
        SSBrsup2400WB wb2400 = null; //지국지원-주간조선관리
        SSBrsup2500WB wb2500 = null; //통합정보지원시스템-판촉물재고관리
        SSBrsup2600WB wb2600 = null; //지국지원_빌링-자동이체-이체신청개선
        SSBrsup2700WB wb2700 = null; //지국지원-빌링-가상계좌통계
        SSBrsup2800WB wb2800 = null; //센터지원-판촉현황-요원관리-13개월실적
        SSBrsup2900WB wb2900 = null; //센터지원-판촉현황-요원관리-요원별실적관리,요원별월별실적
        SSBrsup3000WB wb3000 = null; //센터지원-빌링-지로출력이력

        SSReader1700WB wb1700rdr = null;

        switch (pid) {
            // 지국지원-신문지원물품-등록
            case SSBrsupWBMapping.BRSUP_1000: //지국지원-신문지원물품-등록-초기화면
                wb1000 = new SSBrsup1000WB();
                wb1000.initNwspItem(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1000_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1005: //지국지원-신문지원물품-물품-목록
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemClsfList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1005_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1010: //지국지원-신문지원물품-등록-목록
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1010_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1015: //지국지원-신문지원물품-등록-상세
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1015_s.jsp";
                break;

            // 요기부터 수정
            case SSBrsupWBMapping.BRSUP_1016: //지국지원-신문지원물품-등록-상세
            	boolean is = false;
                wb1000 = new SSBrsup1000WB();
                wb1000.selectThunbnail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1016_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1017: //지국지원-신문지원물품-등록-상세
                wb1000 = new SSBrsup1000WB();
                wb1000.selectpopup(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1017_s.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_1020: //지국지원-신문지원물품-등록-저장
                wb1000 = new SSBrsup1000WB();
                wb1000.updateNwspItem(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1020_u.jsp";
                break;

                // 지국지원-신문지원물품-입고
            case SSBrsupWBMapping.BRSUP_1025: //지국지원-신문지원물품-입고-초기화면
                wb1000 = new SSBrsup1000WB();
                wb1000.initNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1025_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1030: //지국지원-신문지원물품-입고-목록
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemEwhList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1030_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1035: //지국지원-신문지원물품-입고-상세
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemEwhDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1035_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1040: //지국지원-신문지원물품-입고-등록
                wb1000 = new SSBrsup1000WB();
                wb1000.insertNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1040_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1045: //지국지원-신문지원물품-입고-수정
                wb1000 = new SSBrsup1000WB();
                wb1000.updateNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1045_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1050: //지국지원-신문지원물품-입고-삭제
                wb1000 = new SSBrsup1000WB();
                wb1000.deleteNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1050_d.jsp";
                break;

                // 지국지원-신문지원물품-신청
            case SSBrsupWBMapping.BRSUP_1055: //지국지원-신문지원물품-신청-초기화면
                wb1000 = new SSBrsup1000WB();
                wb1000.initNwspItemAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1055_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1060: //지국지원-신문지원물품-신청-목록
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemAplcList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1060_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1065: //지국지원-신문지원물품-신청-저장
                wb1000 = new SSBrsup1000WB();
                wb1000.updateNwspItemAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1065_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1070: //지국지원-신문지원물품-신청-인쇄
                wb1000 = new SSBrsup1000WB();
                wb1000.printNwspItemList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1070_p.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1075: //지국지원-신문지원물품-신청-출고등록
                wb1000 = new SSBrsup1000WB();
                wb1000.outNwspItemList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1075_i.jsp";
                break;

                // 지국지원-신문지원물품-발송
            case SSBrsupWBMapping.BRSUP_1100: //지국지원-신문지원물품-발송-초기화면
                wb1100 = new SSBrsup1100WB();
                wb1100.initNwspItemSend(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1100_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1105: //지국지원-신문지원물품-발송-목록
                wb1100 = new SSBrsup1100WB();
                wb1100.selectNwspItemSendList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1105_l.jsp";
                break;

                // 지국지원-신문지원물품-사고
            case SSBrsupWBMapping.BRSUP_1110: //지국지원-신문지원물품-사고-초기화면
                wb1100 = new SSBrsup1100WB();
                wb1100.initNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1110_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1115: //지국지원-신문지원물품-사고-목록
                wb1100 = new SSBrsup1100WB();
                wb1100.selectNwspItemAccdList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1115_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1120: //지국지원-신문지원물품-사고-상세
                wb1100 = new SSBrsup1100WB();
                wb1100.selectNwspItemAccdDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1120_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1125: //지국지원-신문지원물품-사고-등록
                wb1100 = new SSBrsup1100WB();
                wb1100.insertNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1125_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1130: //지국지원-신문지원물품-사고-수정
                wb1100 = new SSBrsup1100WB();
                wb1100.updateNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1130_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1135: //지국지원-신문지원물품-사고-삭제
                wb1100 = new SSBrsup1100WB();
                wb1100.deleteNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1135_d.jsp";
                break;

                // 지국지원-신문지원물품-마감
            case SSBrsupWBMapping.BRSUP_1200: //지국지원-신문지원물품-마감-초기화면
                // 신문지원물품 마감 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/brsup/ss_brsup_1200_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1205: //지국지원-신문지원물품-마감-목록
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1205_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1210: //지국지원-신문지원물품-마감-상세
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1210_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1215: //지국지원-신문지원물품-마감-신규등록
                wb1200 = new SSBrsup1200WB();
                wb1200.insertNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1215_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1220: //지국지원-신문지원물품-마감-수정
                wb1200 = new SSBrsup1200WB();
                wb1200.updateNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1220_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1225: //지국지원-신문지원물품-마감-삭제
                wb1200 = new SSBrsup1200WB();
                wb1200.deleteNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1225_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1230: //지국지원-신문지원물품-마감-마감
                wb1200 = new SSBrsup1200WB();
                wb1200.closeNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1230_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1235: //지국지원-신문지원물품-마감-마감 취소
                wb1200 = new SSBrsup1200WB();
                wb1200.closeCancelNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1235_a.jsp";
                break;

                // 지국지원-신문지원물품-비용
            case SSBrsupWBMapping.BRSUP_1240: //지국지원-신문지원물품-비용(영업담당)-초기화면
                wb1200 = new SSBrsup1200WB();
                wb1200.nwspitemCostBusnInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1240_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1245: //지국지원-신문지원물품-비용(영업담당)-목록
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostBusnList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1245_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1250: //지국지원-신문지원물품-비용(영업담당)-상세목록
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostBusnDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1250_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1255: //지국지원-신문지원물품-비용(영업담당)-저장(등록)
                wb1200 = new SSBrsup1200WB();
                wb1200.insertNwspitemCostBusn(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1255_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1260: //지국지원-신문지원물품-비용(지원담당)-초기화면
                wb1200 = new SSBrsup1200WB();
                wb1200.nwspitemCostSplyInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1260_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1265: //지국지원-신문지원물품-비용(지원담당)-목록
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostSplyList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1265_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1270: //지국지원-신문지원물품-비용(지원담당)-저장(수정)
                wb1200 = new SSBrsup1200WB();
                wb1200.updateNwspitemCostSply(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1270_u.jsp";
                break;

                // 지국지원-상해보험-등록
            case SSBrsupWBMapping.BRSUP_1300: //지국지원-상해보험-등록-초기화면

                // 상해보험 등록 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/brsup/ss_brsup_1300_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1305: //지국지원-상해보험-등록-목록
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1305_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1310: //지국지원-상해보험-등록-상세
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1310_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1315: //지국지원-상해보험-등록-등록
                wb1300 = new SSBrsup1300WB();
                wb1300.insertInsr(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1315_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1320: //지국지원-상해보험-등록-수정
                wb1300 = new SSBrsup1300WB();
                wb1300.updateInsr(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1320_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1325: //지국지원-상해보험-등록-삭제
                wb1300 = new SSBrsup1300WB();
                wb1300.deleteInsr(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1325_d.jsp";
                break;

                // 지국지원-상해보험-신청
            case SSBrsupWBMapping.BRSUP_1330: //지국지원-상해보험-신청-초기화면
                wb1300 = new SSBrsup1300WB();
                wb1300.initInsrAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1330_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1335: //지국지원-상해보험-신청-목록
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrAplcList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1335_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1345: //지국지원-상해보험-신청-저장(수정)
                wb1300 = new SSBrsup1300WB();
                wb1300.updateInsrAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1345_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1350: //지국지원-상해보험-신청-상세목록`
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrAplcDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1350_l.jsp";
                break;

                // 지국지원-상해보험-변경
            case SSBrsupWBMapping.BRSUP_1355: //지국지원-상해보험-변경-초기화면
                wb1300 = new SSBrsup1300WB();
                wb1300.initInsrChg(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1355_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1360: //지국지원-상해보험-변경-목록
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrChgList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1360_l.jsp";
                break;

                // 지국지원-상해보험-마감
            case SSBrsupWBMapping.BRSUP_1400: //지국지원-상해보험-마감-초기화면

                // 상해보험 마감 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/brsup/ss_brsup_1400_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1405: //지국지원-상해보험-마감-목록
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrClosList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1405_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1410: //지국지원-상해보험-마감-상세
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrClosDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1410_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1415: //지국지원-상해보험-마감-신규등록
                wb1400 = new SSBrsup1400WB();
                wb1400.insertInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1415_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1420: //지국지원-상해보험-마감-수정
                wb1400 = new SSBrsup1400WB();
                wb1400.updateInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1420_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1425: //지국지원-상해보험-마감-삭제
                wb1400 = new SSBrsup1400WB();
                wb1400.deleteInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1425_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1427: //지국지원-상해보험-마감-마감
                wb1400 = new SSBrsup1400WB();
                wb1400.closeInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1427_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1430: //지국지원-상해보험-마감-마감 취소
                wb1400 = new SSBrsup1400WB();
                wb1400.closeCancelInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1430_a.jsp";
                break;

                // 지국지원-상해보험-비용
            case SSBrsupWBMapping.BRSUP_1435: //지국지원-상해보험-비용(영업담당)-초기화면
                wb1400 = new SSBrsup1400WB();
                wb1400.insrCostBusnInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1435_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1440: //지국지원-상해보험-비용(영업담당)-목록
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrCostBusnList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1440_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1445: //지국지원-상해보험-비용(영업담당)-상세목록
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrCostBusnDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1445_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1450: //지국지원-상해보험-비용(영업담당)-저장(등록)
                wb1400 = new SSBrsup1400WB();
                wb1400.insertInsrCostBusn(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1450_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1455: //지국지원-상해보험-비용(지원담당)-초기화면
                wb1400 = new SSBrsup1400WB();
                wb1400.insrCostSplyInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1455_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1460: //지국지원-상해보험-비용(지원담당)-목록
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrCostSplyList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1460_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1465: //지국지원-상해보험-비용(지원담당)-저장(수정)
                wb1400 = new SSBrsup1400WB();
                wb1400.updateInsrCostSply(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1465_u.jsp";
                break;

                // 지국지원-상해보험-사고
            case SSBrsupWBMapping.BRSUP_1500: //지국지원-상해보험-사고-초기화면
                wb1500 = new SSBrsup1500WB();
                wb1500.initInsrAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1500_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1505: //지국지원-상해보험-사고-목록
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAccdList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1505_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1510: //지국지원-상해보험-사고-상세
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAccdDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1510_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1515: //지국지원-상해보험-사고-저장(수정)
                wb1500 = new SSBrsup1500WB();
                wb1500.updateInsrAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1515_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1520: //지국지원-상해보험-사고-삭제
                wb1500 = new SSBrsup1500WB();
                wb1500.deleteInsrAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1520_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1525: //지국지원-상해보험-사고-인쇄
                // 인쇄는 상세와 동일한 처리를 수행하고 jsp만 다르게 처리한다.
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAccdDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1525_p.jsp";
                break;

                // 지국지원-상해보험-보험금
            case SSBrsupWBMapping.BRSUP_1530: //지국지원-상해보험-보험금-초기화면
                wb1500 = new SSBrsup1500WB();
                wb1500.initInsrAmt(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1530_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1535: //지국지원-상해보험-보험금-목록
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAmtList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1535_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1540: //지국지원-상해보험-보험금-저장(수정)
                wb1500 = new SSBrsup1500WB();
                wb1500.updateInsrAmt(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1540_u.jsp";
                break;

                // 지국지원-상해보험-가입현황
            case SSBrsupWBMapping.BRSUP_1545: //지국지원-상해보험-가입현황-초기화면
                wb1500 = new SSBrsup1500WB();
                wb1500.initInsrStcs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1545_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1550: //지국지원-상해보험-가입현황-목록
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrStcsList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1550_l.jsp";
                break;

             // 지국지원-빌링-파일송수신
            case SSBrsupWBMapping.BRSUP_1900: //지국지원-빌링-파일송수신-지로EDI-초기화면
                wb1600 = new SSBrsup1600WB();
                //wb1600.selectEDIInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1900_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1901: //지국지원-빌링-파일송수신-지로EDI-파일업로드
                wb1600 = new SSBrsup1600WB();
                wb1600.ediUpload(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1901_a.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_1910: //지국지원-빌링-파일송수신-CD/ATM-초기화면
                wb1600 = new SSBrsup1600WB();
                wb1600.selectEDIInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1910_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1920: //지국지원-빌링-파일송수신-자동이체-초기화면
                wb1600 = new SSBrsup1600WB();
                wb1600.selectEDIInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1920_a.jsp";
                break;

                // 지국지원-빌링-지로EDI수납관리
              case SSBrsupWBMapping.BRSUP_1600: //지국지원-빌링-지로EDI수납관리-초기화면
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectEDIInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1600_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1605: //지국지원-빌링-지로EDI수납관리-수납결과현황 조회
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectEDIRecp(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1605_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1610: //지국지원-빌링-지로EDI수납관리-지로EDI 수납결과 목록조회
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectRecpCatl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1610_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1615: //지국지원-빌링-지로EDI수납관리-지로EDI 입금처리결과 목록조회
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectRcpmCatl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1615_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1620: //지국지원-빌링-지로EDI수납관리-지로EDI Reject목록조회
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectRejectList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1620_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1625: //지국지원-빌링-지로EDI수납관리-지로EDI Reject보정
                  wb1600 = new SSBrsup1600WB();
                  wb1600.updateEDIReject(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1625_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1630: //지국지원-빌링-지로EDI수납관리-지로EDI 수신
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectGiroRecp(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1630_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1635: //지국지원-빌링-지로EDI수납관리-지로EDI 입금처리결과 목록인쇄
                  nextPage = "/jsp/ss/brsup/ss_brsup_1635_p.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1640: //지국지원-빌링-지로EDI수납관리-지로EDI 입금반영
                    wb1600 = new SSBrsup1600WB();
                  wb1600.updateRcpmrfl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1640_u.jsp";
                  break;


              case SSBrsupWBMapping.BRSUP_1645: //지국지원-빌링-지로EDI수납관리-지로EDI 입금반영
                  wb1600 = new SSBrsup1600WB();
                  wb1600.loadEDIfile(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1645_l.jsp";
                  break;

              // 지국지원-빌링_자동이체-납부내역
              case SSBrsupWBMapping.BRSUP_1700: //지국지원-빌링-자동이체-납부내역 초기화면
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1700_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1710: //지국지원-빌링-자동이체-납부내역 납부자목록
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1710_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1720: //지국지원-빌링-자동이체-납부내역 납부계약목록
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtCntrList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1720_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1730: //지국지원-빌링-자동이체-납부내역 납부내역목록
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtPtcrList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1730_l.jsp";
                  break;

              // 지국지원-빌링_자동이체-신청관리
              case SSBrsupWBMapping.BRSUP_1740: //지국지원-빌링_자동이체-신청관리-초기화면
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcMangInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1740_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1741: //지국지원-빌링_자동이체-신청관리-신청요약
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcSsumList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1741_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1742: //지국지원-빌링_자동이체-신청관리-신청목록
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1742_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1743: //지국지원-빌링_자동이체-신청관리-납부자(구독)정보
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcDetail(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1743_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1744: //지국지원-빌링_자동이체-신청관리-납부자(구독)정보저장
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateAplcInfo(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1744_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1745: //지국지원-빌링_자동이체-신청관리-독자별 매체리스트
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectMediList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1745_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1746: //지국지원-빌링_자동이체-신청관리-신청확인
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1746_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1747: //지국지원-빌링_자동이체-신청관리-신규신청초기화면
                  wb1700 = new SSBrsup1700WB();
                  nextPage = "/jsp/ss/brsup/ss_brsup_1747_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1748: //지국지원-빌링_자동이체-신청관리-신규신청초기화면 초기화
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcNew(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1748_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1749: //지국지원-빌링_자동이체-신청관리-신청입력
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertAutoShiftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1749_i.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1750: //지국지원-빌링_자동이체-신청관리-자동이체해지신청 초기화
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpy(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1750_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1751: //지국지원-빌링_자동이체-신청관리-자동이체 해지신청대상목록 상세보기
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcDetail2(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1751_s.jsp";
                  break;

              case SSBrsupWBMapping.BRSUP_1752: //지국지원-빌링_자동이체-신청관리-자동이체신청 송신
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertShftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1752_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1753: //지국지원-빌링_자동이체-신청관리-자동이체신청 수신
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateShftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1753_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1754: //지국지원-빌링_자동이체-신청관리-카드인증
                  nextPage = "/jsp/ss/brsup/ss_brsup_1754_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1755: //지국지원-빌링_자동이체-신청관리-이체방법전환 초기화면
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpy(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1755_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1756: //지국지원-빌링_자동이체-신청관리-이체방법전환 상세보기
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcDetail2(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1756_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1757: //지국지원-빌링_자동이체-신청관리-이체방법전환
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateShftMthd(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1757_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1758: //지국지원-빌링_자동이체-청구결과-입금처리
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateRcpmrfl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1758_u.jsp";
                  break;


              // 지국지원-빌링_자동이체-납부자관리
              case SSBrsupWBMapping.BRSUP_1760: //초기화면
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftPymtInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1760_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1761: //납부자목록
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftPymtList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1761_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1762: //납부자상세
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftPymtDetail(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1762_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1763: //납부자정보수정
                  wb1700 = new SSBrsup1700WB();
                  if("2".equals(req.getParameter("cnfm"))) {	// 이체신청 미확인건에 대해서
                  	wb1700.updatePymtInfo2(req, res);
                  } else {
                  	wb1700.updatePymtInfo(req, res);
                  }
                  nextPage = "/jsp/ss/brsup/ss_brsup_1763_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1764: //자동이체신규/해지신청
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertPymtShftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1764_i.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1765: //수금내역조회
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtClamtList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1765_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1766: //청구내역조회
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtClamOcomList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1766_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1767: //납부자정보 로그내역
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtLogList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1767_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1768: //납부계약 로그내역
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtCntrLogList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1768_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1769: //신규/해지내역 목록조회
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtShftAplcList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1769_l.jsp";
                  break;

              // 지국지원-빌링_자동이체-청구결과관리
              case SSBrsupWBMapping.BRSUP_1770: //초기화면
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcMangInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1770_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1771: //지국별청구결과요약
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectClamList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1771_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1772: //자동이체청구결과목록검색
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectClamOcomList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1772_l.jsp";
                  break;

              // 지국지원-빌링_자동이체-청구관리
              case SSBrsupWBMapping.BRSUP_1775: //초기화면
                  wb1700 = new SSBrsup1700WB();
                  //wb1700.selectAplcMangInit(req, res);
                  wb1700.selectAplcClamInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1775_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1776: //이체구분별 청구목록
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftClamSsum(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1776_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1777: //지국별 청구목록
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftClamList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1777_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1778: //청구생성
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertShftClam(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1778_i.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1779: //청구송신
                  wb1700 = new SSBrsup1700WB();
                  wb1700.sendShftClam(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1779_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1780: //청구수신
                  wb1700 = new SSBrsup1700WB();
                  wb1700.receiveShftClam(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1780_u.jsp";
                  break;

              // 지국지원-빌링_자동이체-신청통계
              case SSBrsupWBMapping.BRSUP_1785: //초기화면
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcMangInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1785_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1786: //목록조회
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcStcsList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1786_l.jsp";
                  break;

              // 지국지원-빌링_자동이체-신청확인통계
              case SSBrsupWBMapping.BRSUP_1787: //초기화면
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectEDIInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1787_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1788: //목록조회
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcCnfmStcsList(req, res);
                  if("N".equals(req.getParameter("excelyn"))) {
                  	nextPage = "/jsp/ss/brsup/ss_brsup_1788_l.jsp";
                  } else if("Y".equals(req.getParameter("excelyn"))) {	// 엑셀다운로드의 경우
                  	nextPage = "/jsp/ss/brsup/ss_brsup_1789_l.jsp";
                  }
                  break;

              // 지국지원-빌링_자동이체-신청/해지통계
              case SSBrsupWBMapping.BRSUP_1790: //초기화면
                    wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpyStcsInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1790_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1791: //목록조회
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpyStcsList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1791_l.jsp";
                  break;

              // 지국지원-빌링_자동이체-해지독자
              case SSBrsupWBMapping.BRSUP_1795: //초기화면
                    wb1700 = new SSBrsup1700WB();
                  wb1700.selectExpyRdrInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1795_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1796: //목록조회
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectExpyRdrList(req, res);
                  if("N".equals(req.getParameter("excelyn"))) {
                    nextPage = "/jsp/ss/brsup/ss_brsup_1796_l.jsp";
                  } else if("Y".equals(req.getParameter("excelyn"))) {	// 엑셀다운로드의 경우
                    nextPage = "/jsp/ss/brsup/ss_brsup_1797_l.jsp";
                  }
                  break;

              // 지국지원-빌링_자동이체-해지독자
              case SSBrsupWBMapping.BRSUP_1798:

            	  String path=req.getRealPath("/aplc_upload/");    //업로드되는 위치 지정

            	  wb1700 = new SSBrsup1700WB();
            	  System.out.println("==========Servlet1=========");
                  wb1700.procAutoTrans(req, res);
                  //return "";

                  SS_U_PROCAUTOTRASDataSet ds = (SS_U_PROCAUTOTRASDataSet) req.getAttribute("ds");
                  StringBuffer sb = new StringBuffer();
                  System.out.println("==========Servlet2========= SB : " + sb.toString());
                  int size = ds.allstr.size();
                  System.out.println("==========Servlet2.0========= SIZE : " + size);
	          	  for(int i=0; i<size; i++){
	          		SS_U_PROCAUTOTRASALLSTRRecord rec = (SS_U_PROCAUTOTRASALLSTRRecord) ds.allstr.get(i);
	          		sb.append(rec.getAllstr());
	          	  }
	          	  System.out.println("==========Servlet2.1=========");
	              java.io.OutputStream os = null;
	              System.out.println("==========Servlet2.2=========");
	              FileWriter fw = null;
	              System.out.println("==========Servlet3=========");
	              try{
	            	  //File rfile = new File(path,"GW82903116153" + Util.getDate().substring(4));
		          	  //fw = new FileWriter(rfile);

		          	  //fw.write(sb.toString()+ "We are the ~");

		          	  //fw.flush();
		          	  //fw.close();
		          	  //fw = null;

		          	  //System.out.println("===========file.length============" + rfile.length());
		          	  //System.out.println("===========path============" + rfile.getAbsolutePath());

		          	  // make file
	            	  //res.reset();

		          	  res.setContentType("application/octet-stream");
		              res.setHeader("Content-Disposition","attachment; filename=" + "GW82903116153" + Util.getDate().substring(4));
		              //res.setHeader("Content-Length", Long.toString(sb.toString().getBytes().length));
		              res.setContentLength(sb.toString().getBytes().length);

	            	  os = res.getOutputStream();
		              os.write(sb.toString().getBytes());
		              //os.write(sb.toString().getBytes() , 0, sb.toString().getBytes().length);
		              os.flush();
		              //os.close();
		              //os = null;
	              } catch(Exception e) {
	            	  System.out.println("########"+e.toString());
	            	  e.printStackTrace();

	              } finally {
	            	  //java.io.File file = new java.io.File(path + "/" + "GW82903116153" + "0830");
            		  try{
            			  if(fw != null){
            				  fw.close();
            				  fw = null;
            			  }
            			  /*if(os != null)os.close();*/
	            		}catch(Exception e){}
	              }

                  //nextPage = "/jsp/ss/brsup/ss_brsup_1798_l.jsp";
                  break;

            case SSBrsupWBMapping.BRSUP_1799: //초기화면
                wb1700 = new SSBrsup1700WB();
                wb1700.createBrsup1799(req, res);

                System.out.println("Hello Universe!");

        		try{

        			res.setContentType("application/octet-stream");
		            res.setHeader("Content-Disposition","attachment; filename=" + "GE123116153"+Util.getDate().substring(4));
		            //res.setContentLength(tot_size+1024);

        			int tot_size = 0;
        			int tot_block_cnt = 0;
        			//String resPath = "C:/work/ciis_chosun_com/applications/mainWebApp/ge12/";
        			//String resFile = resPath+"GE123116153"+Util.getDate().substring(4);

        			BufferedOutputStream fos = new BufferedOutputStream(res.getOutputStream());

        			SS_SLS_BRSUP_1799_LDataSet ds2 = (SS_SLS_BRSUP_1799_LDataSet) req.getAttribute("ds");

        			System.out.println("header length() : "+ds2.getHeaderstr().length());//+filler_header.length));

        			fos.write(ds2.getHeaderstr().getBytes());
        			/*
        			byte filler_header[] = new byte[974];
        			fos.write(filler_header);
        			*/

        			tot_size = tot_size + ds2.getHeaderstr().length(); //+filler_header.length;

        			//String dirPath = "C:/work/agency_new/www/recfile/";
        			//String dirPath = "/webstore/pub/ciis/webapps/recfile/";
        	        String dirPath = "/webstore/pub/ciis/recfile/";
        			String fileName;
        			File file;
        			FileInputStream fis = null;

        			for(int j=0; j<ds2.allstr2.size(); j++){
                		SS_SLS_BRSUP_1799_LALLSTR2Record rec = (SS_SLS_BRSUP_1799_LALLSTR2Record) ds2.allstr2.get(j);

                		fos.write(rec.datastr.getBytes());

                		fileName = dirPath+rec.recfilenm;
                		file = new File(fileName);
            			fis = new FileInputStream(file);

            			byte b[] = new byte[(int)file.length()];
            			int len = 0;

            			while((len=fis.read(b)) != -1){
            				fos.write(b,0,len);
            			}
            			/*
            			byte filler_b[] = new byte[1024-((rec.datastr.length()+b.length)%1024)];
            			fos.write(filler_b);
            			*/

            			fos.write(rec.filler.getBytes());

            			tot_size = tot_size + rec.datastr.length() + b.length + rec.filler.length();

            			System.out.println("rec.datastr.length() : "+rec.datastr.length());
            			System.out.println("b.length : "+b.length);
            			System.out.println("rec.filler.length() : "+rec.filler.length());

            			System.out.println("data length() : "+(rec.datastr.length() + b.length + rec.filler.length()));
                	}

        			tot_block_cnt = (tot_size / 1024) - 1;
        			String tot_block_cnt_S = String.valueOf(tot_block_cnt);

        			byte[] b2 = tot_block_cnt_S.getBytes();
        	        int len = b2.length;

        	        int tmp = 10 - len;

        	        for (int i=0; i < tmp ; i++){
        	        	tot_block_cnt_S = "0" + tot_block_cnt_S;
        	        }

        			fos.write(ds2.getTailstr().getBytes());
        			System.out.println("ds2.getTailstr() : "+ds2.getTailstr());
        			fos.write(tot_block_cnt_S.getBytes());
        			System.out.println("tot_block_cnt_S : "+tot_block_cnt_S);
        			fos.write(ds2.getTail_filler().getBytes());
        			System.out.println("ds2.getTail_filler() : "+ds2.getTail_filler());
        			/*
        			byte filter_tail[] = new byte[972];
        			fos.write(filler_tail);
        			*/
        			//System.out.println("tail length() : "+ds2.getTailstr().length()+tot_block_cnt_S.length()+ds2.getTail_filler().length());//+filler_tail.length));

        			fos.flush();

        			fis.close();
        			fos.close();

        		}catch(Exception e){
        			e.printStackTrace();
        			System.out.println("File create Failed!");
        		}

                break;
            // 지국지원-빌링-수납수수료기준
            case SSBrsupWBMapping.BRSUP_1800: //지국지원-빌링-수납수수료-기준-초기화면
                wb1800 = new SSBrsup1800WB();
                wb1800.initRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1800_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1805: //지국지원-빌링-수납수수료-기준-목록
                wb1800 = new SSBrsup1800WB();
                wb1800.selectRcpcmsbsList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1805_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1810: //지국지원-빌링-수납수수료-기준-상세
                wb1800 = new SSBrsup1800WB();
                wb1800.selectRcpcmsbsDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1810_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1815: //지국지원-빌링-수납수수료-기준-등록
                wb1800 = new SSBrsup1800WB();
                wb1800.insertRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1815_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1820: //지국지원-빌링-수납수수료-기준-수정
                wb1800 = new SSBrsup1800WB();
                wb1800.updateRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1820_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1825: //지국지원-빌링-수납수수료-기준-삭제
                wb1800 = new SSBrsup1800WB();
                wb1800.deleteRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1825_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1830: //지국지원-빌링-수납수수료-마감-초기화면
                nextPage = "/jsp/ss/brsup/ss_brsup_1830_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1835: //지국지원-빌링-수납수수료-마감-목록
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCloseList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1835_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1840: //지국지원-빌링-수납수수료-마감-상세
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCloseDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1840_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1845: //지국지원-빌링-수납수수료-마감-등록
                wb1800 = new SSBrsup1800WB();
                wb1800.insertClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1845_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1850: //지국지원-빌링-수납수수료-마감-수정
                wb1800 = new SSBrsup1800WB();
                wb1800.updateClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1850_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1855: //지국지원-빌링-수납수수료-마감-삭제
                wb1800 = new SSBrsup1800WB();
                wb1800.deleteClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1855_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1860: //지국지원-빌링-수납수수료-마감-마감
                wb1800 = new SSBrsup1800WB();
                wb1800.executeClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1860_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1865: //지국지원-빌링-수납수수료-마감-마감취소
                wb1800 = new SSBrsup1800WB();
                wb1800.cancelClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1865_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1870: //지국지원-빌링-수납수수료-현황-초기화면
                wb1800 = new SSBrsup1800WB();
                wb1800.initRcp(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1870_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1875: //지국지원-빌링-수납수수료-현황-목록
                wb1800 = new SSBrsup1800WB();
                wb1800.selectRcpList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1875_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1880: //지국지원-빌링-지로 수납현황-초기화면
                wb1800 = new SSBrsup1800WB();
                wb1800.selectGiroRecpInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1880_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1885: //지국지원-빌링-지로 수납현황-목록조회
                wb1800 = new SSBrsup1800WB();
                wb1800.selectGiroRecpList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1885_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1886: //지국지원-빌링-지로 수납현황-목록엑셀저장
                wb1800 = new SSBrsup1800WB();
                wb1800.selectGiroRecpExcel(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1886_p.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_1890: //지국지원-빌링-편의점수납관리-초기화면
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCvsRecpInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1890_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1895: //지국지원-빌링-지로수납현황-목록조회
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCvsRecpList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1895_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1896: //지국지원-빌링-편의점수납관리-엘셀저장
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCvsRecpPrint(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1896_p.jsp";
                break;

                // 지국지원-판촉현황
            case SSBrsupWBMapping.BRSUP_2000: //지국지원-판촉현황-IS요원-초기화면
                wb2000 = new SSBrsup2000WB();
                wb2000.initPromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2000_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2005: //지국지원-판촉현황-IS요원-목록
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafISList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2005_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2006: //지국지원-판촉현황-IS요원-목록
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafISPrint(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2006_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2010: //지국지원-판촉현황-IS요원-상세
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafISDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2010_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2015: //지국지원-판촉현황-IS요원-등록
                wb2000 = new SSBrsup2000WB();
                wb2000.insertPromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2015_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2020: //지국지원-판촉현황-IS요원-수정
                wb2000 = new SSBrsup2000WB();
                wb2000.updatePromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2020_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2025: //지국지원-판촉현황-IS요원-삭제
                wb2000 = new SSBrsup2000WB();
                wb2000.deletePromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2025_d.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_2030: //지국지원-판촉현황-요원관리-초기화면
                wb2000 = new SSBrsup2000WB();
                wb2000.initPromStaf(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2030_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2035: //지국지원-판촉현황-요원관리-목록
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2035_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2040: //지국지원-판촉현황-요원관리-상세
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2040_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2050: //지국지원-판촉현황-요원관리-Excel
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafListExcel(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2050_p.jsp";
                break;


            // 지국지원-컴퓨터A/S, 전단현황
            case SSBrsupWBMapping.BRSUP_2100: //지국지원-컴퓨터A/S-초기화면
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2100_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2110: //지국지원-컴퓨터A/S-리스트
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2110_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2120: //지국지원-컴퓨터A/S-상세
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2120_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2130: //지국지원-컴퓨터A/S-등록,수정,삭제
                wb2100 = new SSBrsup2100WB();
                wb2100.accessAsreq(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2130_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2140: //지국지원-컴퓨터A/S-기종정보
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2140_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2150: //지국지원-전단현황-초기화면
                wb2100 = new SSBrsup2100WB();
                wb2100.initLeafScat(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2150_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2160: //지국지원-전단현황-리스트
                wb2100 = new SSBrsup2100WB();
                wb2100.selectLeafScatList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2160_l.jsp";
                break;
            // 지국지원-빌링_자동이체-납부자관리
            case SSBrsupWBMapping.BRSUP_2210: //초기화면
                wb2200 = new SSBrsup2200WB();
                wb2200.selectShftPymtInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2210_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2211: //납부자목록
                wb2200 = new SSBrsup2200WB();
                wb2200.selectShftPymtList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2211_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2212: //납부자상세
                wb2200 = new SSBrsup2200WB();
                wb2200.selectShftPymtDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2212_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2213: //납부자정보수정
                wb2200 = new SSBrsup2200WB();
                if("2".equals(req.getParameter("cnfm"))) {	// 이체신청 미확인건에 대해서
                    wb1700.updatePymtInfo2(req, res);
                } else {
                    wb1700.updatePymtInfo(req, res);
                }
                nextPage = "/jsp/ss/brsup/ss_brsup_2213_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2214: //자동이체신규/해지신청
                wb2200 = new SSBrsup2200WB();
                wb2200.insertPymtShftAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2214_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2215: //수금내역조회
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtClamtList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2215_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2216: //청구내역조회
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtClamOcomList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2216_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2217: //납부자정보 로그내역
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtLogList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2217_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2218: //납부계약 로그내역
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtCntrLogList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2218_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2219: //신규/해지내역 목록조회
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtShftAplcList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2219_l.jsp";
                break;


            //주간조선관리-배달비정산마감
            case SSBrsupWBMapping.BRSUP_2400: //주간조선관리-배달비정산마감-초기화면
                nextPage = "/jsp/ss/brsup/ss_brsup_2400_s.jsp";
                break;

            //주간조선관리-배달비정산마감
            case SSBrsupWBMapping.BRSUP_2410: //주간조선관리-배달비정산마감-마감및취소
                wb2400 = new SSBrsup2400WB();
                wb2400.ClosandCancel(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2410_a.jsp";
                break;

            //주간조선관리-배달비정산마감
            case SSBrsupWBMapping.BRSUP_2420: //주간조선관리-배달비정산마감-마감내역
                wb2400 = new SSBrsup2400WB();
                wb2400.initClosList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2420_l.jsp";
                break;

                //주간조선관리-배달비정산마감
            case SSBrsupWBMapping.BRSUP_2430: //주간조선관리-배달비정산마감-마감내역-엑셀저장
                    wb2400 = new SSBrsup2400WB();
                    wb2400.closListExcel(req, res);
                    nextPage = "/jsp/ss/brsup/ss_brsup_2430_p.jsp";
                break;

                //주간조선관리-배달비정산마감
            case SSBrsupWBMapping.BRSUP_2440: //주간조선관리-배달비정산마감-마감내역-호수별 상세
                    wb2400 = new SSBrsup2400WB();
                    wb2400.closSernoList(req, res);
                    nextPage = "/jsp/ss/brsup/ss_brsup_2440_s.jsp";
                break;


                // 통합정보지원시스템-판촉물재고관리
           case SSBrsupWBMapping.BRSUP_2500: //통합정보지원시스템-판촉물재고관리-초기화면
                wb2500 = new SSBrsup2500WB();
                wb2500.initSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2500_a.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2501: //통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업
               wb2500 = new SSBrsup2500WB();
               wb2500.popInInitSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2501_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2502: //통합정보지원시스템-판촉물재고현황-조회화면-출고추가 팝업
               wb2500 = new SSBrsup2500WB();
               wb2500.popOutInitSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2502_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2503: //통합정보지원시스템-판촉물재고현황-조회화면-사후정산 팝업
               nextPage = "/jsp/ss/brsup/ss_brsup_2503_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2504: //통합정보지원시스템-판촉물재고현황-조회화면-통합출고등록팝업
               wb2500 = new SSBrsup2500WB();
               wb2500.popTotalOutInitSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2504_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2510: //통합정보지원시스템-판촉물재고관리-목록
            	wb2500 = new SSBrsup2500WB();
                wb2500.listSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2510_l.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2511: //통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업-등록
               wb2500 = new SSBrsup2500WB();
               wb2500.popInInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2511_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2512: //통합정보지원시스템-판촉물재고현황-조회화면-출고추가 팝업-저장
               wb2500 = new SSBrsup2500WB();
               wb2500.popOutInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2512_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2513: //지국지원-판촉현황-판촉물재고현황 추후배분 건에 대한 사후 정산
               wb2500 = new SSBrsup2500WB();
               wb2500.popAfterInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2513_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2514: //지국지원-판촉현황-판촉물재고현황 통합출고등록 물품신규등록 저장
               wb2500 = new SSBrsup2500WB();
               wb2500.popTotalOutInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2514_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2520: //통합정보지원시스템-판촉물재고관리-상세
            	wb2500 = new SSBrsup2500WB();
                wb2500.detailSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2520_s.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2530: //통합정보지원시스템-판촉물재고관리-상세목록조회
            	wb2500 = new SSBrsup2500WB();
                wb2500.detailSearchSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2530_l.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2540: //통합정보지원시스템-판촉물재고관리-상세-삭제
        	   wb2500 = new SSBrsup2500WB();
               wb2500.detailDeleteSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2540_d.jsp";
               break;


           // 빌링-자동이체-이체신청개선(2005-05-20 김용욱 추가)
           case SSBrsupWBMapping.BRSUP_2600: //지국지원-빌링_자동이체-이체신청개선-초기화면
               nextPage = "/jsp/ss/brsup/ss_brsup_2600_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2601: //지국지원-빌링_자동이체-이체신청개선-신규화면
               nextPage = "/jsp/ss/brsup/ss_brsup_2601_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2610: //지국지원-빌링_자동이체-이체신청개선-목록
        	   wb2600 = new SSBrsup2600WB();
               wb2600.listSearchTransfer(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2610_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2620: //지국지원-빌링_자동이체-이체신청개선-상세
        	   wb2600 = new SSBrsup2600WB();
               wb2600.detailSearchTransfer(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2620_S.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2630: //지국지원-빌링_자동이체-이체신청개선-업로드
        	   wb2600 = new SSBrsup2600WB();
               wb2600.uploadSearchTransfer(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2630_i.jsp";
               break;

           case SSBrsupWBMapping.BRSUP_2700: //지국지원-빌링-가상계좌통계-초기화면
        	   wb2700 = new SSBrsup2700WB();
               wb2700.initVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2700_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2701: //지국지원-빌링-가상계좌통계-초기화면
        	   wb2700 = new SSBrsup2700WB();
               wb2700.searchBrsup2701(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2701_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2710: //지국지원-빌링-가상계좌통계-조회
        	   wb2700 = new SSBrsup2700WB();
               wb2700.searchVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2710_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2720: //지국지원-빌링-가상계좌통계-조회
        	   wb2700 = new SSBrsup2700WB();
               wb2700.detailVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2720_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2730: //지국지원-빌링-가상계좌통계-조회
        	   wb2700 = new SSBrsup2700WB();
               wb2700.printVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2730_p.jsp";
               break;

           case SSBrsupWBMapping.BRSUP_2800: //센터지원-판촉현황-요원관리-13개월실적-초기화면
        	   wb2800 = new SSBrsup2800WB();
               wb2800.initBrsup2800(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2800_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2810: //센터지원-판촉현황-요원관리-13개월실적-조회
        	   wb2800 = new SSBrsup2800WB();
               wb2800.searchBrsup2810(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2810_l.jsp";
               break;
           // 센터지원-판촉현황-요원관리-요원별실적관리(2016-05-02 장선희 추가)
           case SSBrsupWBMapping.BRSUP_2900: //센터지원-판촉현황-요원관리-요원별실적관리-초기화면
               wb2900 = new SSBrsup2900WB();
               wb2900.initBrsup2900(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2900_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2910: //센터지원-판촉현황-요원관리-요원별실적관리-리스트
        	   wb2900 = new SSBrsup2900WB();
        	   wb2900.selectBrsup2910(req, res);
        	   nextPage = "/jsp/ss/brsup/ss_brsup_2910_l.jsp";
        	   break;
           case SSBrsupWBMapping.BRSUP_2920: // 센터지원-판촉현황-요원관리-요원별실적관리-리스트-요원별상세(팝업)
        	   wb2900 = new SSBrsup2900WB();
        	   wb2900.selectBrsup2920(req, res);
        	   nextPage = "/jsp/ss/brsup/ss_brsup_2920_s.jsp";
        	   break;
           //센터지원-빌링-지로출력이력 2017-12-26 심정보	   
           case SSBrsupWBMapping.BRSUP_3000: //초기화면
               wb3000 = new SSBrsup3000WB();
               wb3000.initBrsup3000(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_3000_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_3010: //리스트
        	   wb3000 = new SSBrsup3000WB();
        	   wb3000.selectBrsup3010(req, res);
        	   nextPage = "/jsp/ss/brsup/ss_brsup_3010_l.jsp";
        	   break;	   
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
