/***************************************************************************************************
 * 파일명 : SSExtnServlet.java
 * 기능 : 확장현황 서블릿
 * 작성일자 : 2003-11-15
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.wb.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;
import chosun.ciis.ss.sls.brinfo.wb.SSBrinfo1000WB;
import chosun.ciis.ss.sls.brinfo.wb.SSBrinfo1100WB;
 
/*
import chosun.ciis.ss.sls.rdr.ejb.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
*/

/**
 * 판매국 업무지원 확장현황 Servlet
 */

public class SSExtnServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/extn/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSExtnServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSExtnServlet : process : nextPage : " + nextPage);
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
        SSExtn1000WB wb1000 = null; //확장현황
        SSExtn1100WB wb1100 = null; //품앗이확장
        SSExtn1200WB wb1200 = null; //사원확장(대회, 비용)
        SSExtn1300WB wb1300 = null; //사원확장(수당, 송금)
        SSExtn1400WB wb1400 = null; //확장지원비용
        SSExtn1500WB wb1500 = null; //확장용역비용
        SSExtn1600WB wb1600 = null; //확장현황-사이버확장-요원관리,수당,실적조회
        SSExtn1700WB wb1700 = null; //확장현황-사이버확장-대회관리,비용마감
        SSExtn1800WB wb1800 = null; //지국경영-입주아파트현황
        SSExtn1900WB wb1900 = null; //확장현황-확장제한
        SSExtn2000WB wb2000 = null; //확장현황-중지현황  추가 2009.05.14 권정윤 
        SSExtn2100WB wb2100 = null; //확장현황-본사확장  추가 2009.05.20 권정윤
        SSExtn2200WB wb2200 = null; //확장현황-지국확장마감 2009.07.09 김용욱 
        SSExtn2280WB wb2280 = null; //확장현황-일괄확자 등록 김태희 
        SSExtn2300WB wb2300 = null; //확장현황-확장통계 심정보 2012.2.10
        SSExtn2400WB wb2400 = null; //확장현황-대학생확장캠페인
        SSExtn2500WB wb2500 = null; //확장현황-단체확장 심정보 2012.5.18 
        SSReader1700WB wb1700rdr = null;
        SSBrinfo1100WB wb1100brinfo = null;        
        SSExtn2600WB wb2600 = null;
        SSExtn2700WB wb2700 = null;
        SSExtn2800WB wb2800 = null;	//센터비독자관리 2013.06.27 이혁
        SSExtn2900WB wb2900 = null;
        SSExtn3000WB wb3000 = null;
        SSExtn3100WB wb3100 = null;   
        SSExtn3200WB wb3200 = null;   
        SSExtn3400WB wb3400 = null;   
        SSExtn3500WB wb3500 = null;   
        SSExtn3600WB wb3600 = null;   
        SSExtn3700WB wb3700 = null;   
        SSExtn3800WB wb3800 = null;
        SSExtn3900WB wb3900 = null;   
        SSExtn4000WB wb4000 = null;   
        SSExtn4100WB wb4100 = null;   
        SSExtn4200WB wb4200 = null;
        SSExtn3300WB wb3300 = null;   
        SSExtn4300WB wb4300 = null; 
        SSExtn4400WB wb4400 = null;
        SSExtn4500WB wb4500 = null;
        SSExtn4600WB wb4600 = null;
        SSExtn4700WB wb4700 = null;
        SSExtn4800WB wb4800 = null;
        SSExtn4900WB wb4900 = null;
        SSExtn5000WB wb5000 = null;
        SSExtn5100WB wb5100 = null;
        SSExtn5200WB wb5200 = null;
        SSExtn5300WB wb5300 = null;
        SSExtn5400WB wb5400 = null;
        SSExtn5500WB wb5500 = null;
        SSExtn5600WB wb5600 = null;
        SSExtn5700WB wb5700 = null;
        SSExtn5800WB wb5800 = null;
       
        switch (pid) {
            // 확장현황-신청현황
            case SSExtnWBMapping.EXTN_1000: //확장현황-신청현황 초기화면
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1000_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1010: //확장현황-신청현황 확장자소속 목록
                wb1000 = new SSExtn1000WB();
                wb1000.selectExtnBlngCodeList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1010_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1020: //확장현황-신청현황 전체 목록
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1020_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1030: //확장현황-신청현황 독자자진신청 목록
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1030_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1040: //확장현황-신청현황 사원확장 목록
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1040_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1050: //확장현황-신청현황 품앗이확장 목록
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1050_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1060: //확장현황-신청현황 지국자체확장 목록
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1060_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1090: //확장현황-신청현황 상세
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1090_s.jsp";
                break;

            //확장현황-온라인확장 신청현황
            case SSExtnWBMapping.EXTN_1070: //확장현황-온라인확장-신청현황 초기화면
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1070_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1075: //확장현황-온라인확장-신청현황 목록
                wb1000 = new SSExtn1000WB();
                wb1000.selectOnlineExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1075_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1077: //확장현황-온라인확장-신청현황 상세
                wb1000 = new SSExtn1000WB();
                wb1000.selectOnlineExtnDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1077_s.jsp";
                break;

            //확장현황-제휴확장 신청현황
            case SSExtnWBMapping.EXTN_1080: //확장현황-제휴확장-신청현황 초기화면
                wb1000 = new SSExtn1000WB();
                wb1000.jminit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1080_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1082: //확장현황-제휴확장-신청현황 목록
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1082_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1085: //확장현황-제휴확장-신청현황 상세
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1085_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1087: //확장현황-제휴확장-신청현황 엑셀저장
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1087_a.jsp";
                break;


            // 확장현황-품앗이확장-대회
            case SSExtnWBMapping.EXTN_1100: //확장현황-품앗이확장-대회-초기화면
                wb1100 = new SSExtn1100WB();
                wb1100.exgCampInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1100_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1105: //확장현황-품앗이확장-대회-목록
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCampList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1105_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1110: //확장현황-품앗이확장-대회-상세
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCampDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1110_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1115: //확장현황-품앗이확장-대회-등록
                wb1100 = new SSExtn1100WB();
                wb1100.insertExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1115_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1120: //확장현황-품앗이확장-대회-수정
                wb1100 = new SSExtn1100WB();
                wb1100.updateExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1120_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1125: //확장현황-품앗이확장-대회-삭제
                wb1100 = new SSExtn1100WB();
                wb1100.deleteExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1125_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1130: //확장현황-품앗이확장-대회-마감
                wb1100 = new SSExtn1100WB();
                wb1100.closeExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1130_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1135: //확장현황-품앗이확장-대회-마감취소
                wb1100 = new SSExtn1100WB();
                wb1100.closeCancelExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1135_a.jsp";
                break;

                // 확장현황-품앗이확장-비용
            case SSExtnWBMapping.EXTN_1140: //확장현황-품앗이확장-비용(영업)-초기화면
                wb1100 = new SSExtn1100WB();
                wb1100.exgCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1140_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1145: //확장현황-품앗이확장-비용(영업)-목록
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1145_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1150: //확장현황-품앗이확장-비용(영업)-상세
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1150_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1155: //확장현황-품앗이확장-비용(영업)-수정
                wb1100 = new SSExtn1100WB();
                wb1100.updateExgCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1155_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1160: //확장현황-품앗이확장-비용(지원)-초기화면
                wb1100 = new SSExtn1100WB();
                wb1100.exgCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1160_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1165: //확장현황-품앗이확장-비용(지원)-목록
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1165_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1170: //확장현황-품앗이확장-비용(지원)-상세
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1170_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1175: //확장현황-품앗이확장-비용(지원)-수정
                wb1100 = new SSExtn1100WB();
                wb1100.updateExgCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1175_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1180: //확장현황-품앗이확장-송금-인쇄
                wb1100 = new SSExtn1100WB();
                wb1100.printExgCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1180_p.jsp";
                break;

                // 확장현황-사원확장-대회
            case SSExtnWBMapping.EXTN_1200: //확장현황-사원확장-대회-초기화면
                wb1200 = new SSExtn1200WB();
                wb1200.empCampInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1200_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1205: //확장현황-사원확장-대회-목록
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1205_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1210: //확장현황-사원확장-대회-상세
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1210_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1215: //확장현황-사원확장-대회-등록
                wb1200 = new SSExtn1200WB();
                wb1200.insertEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1215_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1220: //확장현황-사원확장-대회-수정
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1220_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1225: //확장현황-사원확장-대회-삭제
                wb1200 = new SSExtn1200WB();
                wb1200.deleteEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1225_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1230: //확장현황-사원확장-대회-마감
                wb1200 = new SSExtn1200WB();
                wb1200.closeEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1230_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1235: //확장현황-사원확장-대회-마감취소
                wb1200 = new SSExtn1200WB();
                wb1200.closeCancelEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1235_a.jsp";
                break;

                // 확장현황-사원확장-비용마감
            case SSExtnWBMapping.EXTN_1240: //확장현황-사원확장-비용마감-초기화면

                // 사원확장 비용관리 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/extn/ss_extn_1240_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1245: //확장현황-사원확장-비용마감-목록
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1245_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1250: //확장현황-사원확장-비용마감-상세
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1250_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1255: //확장현황-사원확장-비용마감-등록
                wb1200 = new SSExtn1200WB();
                wb1200.insertEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1255_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1260: //확장현황-사원확장-비용마감-수정
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1260_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1265: //확장현황-사원확장-비용마감-삭제
                wb1200 = new SSExtn1200WB();
                wb1200.deleteEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1265_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1270: //확장현황-사원확장-비용마감-마감
                wb1200 = new SSExtn1200WB();
                wb1200.closeEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1270_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1275: //확장현황-사원확장-비용마감-마감취소
                wb1200 = new SSExtn1200WB();
                wb1200.closeCancelEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1275_a.jsp";
                break;

                // 확장현황-사원확장-비용
            case SSExtnWBMapping.EXTN_1280: //확장현황-사원확장-비용(영업)-초기화면
                wb1200 = new SSExtn1200WB();
                wb1200.empCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1280_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1282: //확장현황-사원확장-비용(영업)-목록
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1282_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1284: //확장현황-사원확장-비용(영업)-상세
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1284_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1286: //확장현황-사원확장-비용(영업)-수정
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1286_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1288: //확장현황-사원확장-비용(지원)-초기화면
                wb1200 = new SSExtn1200WB();
                wb1200.empCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1288_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1290: //확장현황-사원확장-비용(지원)-목록
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1290_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1292: //확장현황-사원확장-비용(지원)-상세
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1292_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1294: //확장현황-사원확장-비용(지원)-수정
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1294_u.jsp";
                break;

                // 확장현황-사원확장-수당
            case SSExtnWBMapping.EXTN_1300: //확장현황-사원확장-수당-초기화면
                wb1300 = new SSExtn1300WB();
                wb1300.empAlonInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1300_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1310: //확장현황-사원확장-수당-목록
                wb1300 = new SSExtn1300WB();
                wb1300.selectEmpAlonList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1310_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1320: //확장현황-사원확장-수당-상세
                wb1300 = new SSExtn1300WB();
                wb1300.selectEmpAlonDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1320_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1330: //확장현황-사원확장-수당-저장
                wb1300 = new SSExtn1300WB();
                wb1300.updateEmpAlon(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1330_u.jsp";
                break;

                // 확장현황-사원확장-송금
            case SSExtnWBMapping.EXTN_1340: //확장현황-사원확장-송금-초기화면
                wb1300 = new SSExtn1300WB();
                wb1300.empRmttInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1340_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1350: //확장현황-사원확장-송금-목록
                wb1300 = new SSExtn1300WB();
                wb1300.selectEmpRmttList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1350_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1360: //확장현황-사원확장-송금-인쇄
                wb1300 = new SSExtn1300WB();
                wb1300.printEmpAlonList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1360_p.jsp";
                break;

                // 확장현황-확장지원비용-마감
            case SSExtnWBMapping.EXTN_1400: //확장현황-확장지원비용-마감-초기화면

                // 확장지원비용 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/extn/ss_extn_1400_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1405: //확장현황-확장지원비용-마감-목록
                wb1400 = new SSExtn1400WB();
                wb1400.selectSlsCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1405_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1410: //확장현황-확장지원비용-마감-상세
                wb1400 = new SSExtn1400WB();
                wb1400.selectSlsCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1410_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1415: //확장현황-확장지원비용-마감-등록
                wb1400 = new SSExtn1400WB();
                wb1400.insertSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1415_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1420: //확장현황-확장지원비용-마감-수정
                wb1400 = new SSExtn1400WB();
                wb1400.updateSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1420_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1425: //확장현황-확장지원비용-마감-삭제
                wb1400 = new SSExtn1400WB();
                wb1400.deleteSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1425_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1430: //확장현황-확장지원비용-마감-마감
                wb1400 = new SSExtn1400WB();
                wb1400.closeSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1430_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1435: //확장현황-확장지원비용-마감-마감취소
                wb1400 = new SSExtn1400WB();
                wb1400.closeCancelSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1435_a.jsp";
                break;

                // 확장현황-확장지원비용-등록/조회
            case SSExtnWBMapping.EXTN_1440: //확장현황-확장지원비용 등록/조회 초기화면
                wb1400 = new SSExtn1400WB();
                wb1400.slsAmtInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1440_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1445: //확장현황-확장지원비용 등록/조회 목록
                wb1400 = new SSExtn1400WB();
                wb1400.selectSlsAmtList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1445_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1450: //확장현황-확장지원비용 등록/조회 수정
                wb1400 = new SSExtn1400WB();
                wb1400.updateSlsAmt(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1450_u.jsp";
                break;

                // 확장현황-확장용역비용-마감(조선IS)
                // 조선IS, 지원담당의 request 처리는 동일한 WB, EJB, DAO, SP를 사용한다.
                // URL 및 처리 후 결과를 보여주는 JSP는 구분한다.
            case SSExtnWBMapping.EXTN_1500: //확장현황-확장용역비용-마감(조선IS)-초기화면
                wb1500 = new SSExtn1500WB();
                wb1500.servCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1500_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1505: //확장현황-확장용역비용-마감(조선IS)-목록
                wb1500 = new SSExtn1500WB();
                wb1500.selectServCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1505_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1510: //확장현황-확장용역비용-마감(조선IS)-상세
                wb1500 = new SSExtn1500WB();
                wb1500.selectServCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1510_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1515: //확장현황-확장용역비용-마감(조선IS)-등록
                wb1500 = new SSExtn1500WB();
                wb1500.insertServCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1515_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1520: //확장현황-확장용역비용-마감(조선IS)-수정
                wb1500 = new SSExtn1500WB();
                wb1500.updateServCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1520_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1525: //확장현황-확장용역비용-마감(조선IS)-삭제
                wb1500 = new SSExtn1500WB();
                wb1500.deleteServCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1525_d.jsp";
                break;

            /* 20050219 김대섭 추가(MC) */
            case SSExtnWBMapping.EXTN_1530: //확장현황-확장용역비용-마감(MC)-초기화면
                wb1500 = new SSExtn1500WB();
                wb1500.MCCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1530_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1535: //확장현황-확장용역비용-마감(MC)-목록
                wb1500 = new SSExtn1500WB();
                wb1500.selectMCCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1535_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1540: //확장현황-확장용역비용-마감(MC)-상세
                wb1500 = new SSExtn1500WB();
                wb1500.selectMCCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1540_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1545: //확장현황-확장용역비용-마감(MC)-등록
                wb1500 = new SSExtn1500WB();
                wb1500.insertMCCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1545_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1550: //확장현황-확장용역비용-마감(MC)-수정
                wb1500 = new SSExtn1500WB();
                wb1500.updateMCCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1550_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1555: //확장현황-확장용역비용-마감(MC)-삭제
                wb1500 = new SSExtn1500WB();
                wb1500.deleteMCCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1555_d.jsp";
                break;

                /* 20050219 김대섭 수정(사용하지 않음) */
                /*
                            case SSExtnWBMapping.EXTN_1530: //확장현황-확장용역비용-마감(조선IS)-마감
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1530_a.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1535: //확장현황-확장용역비용-마감(조선IS)-마감취소
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeCancelServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1535_a.jsp";
                                break;
                            // 확장현황-확장용역비용-마감(지원)
                            case SSExtnWBMapping.EXTN_1540: //확장현황-확장용역비용-마감(지원)-초기화면
                                wb1500 = new SSExtn1500WB();
                                wb1500.servCostInit(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1540_a.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1545: //확장현황-확장용역비용-마감(지원)-목록
                                wb1500 = new SSExtn1500WB();
                                wb1500.selectServCostList(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1545_l.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1550: //확장현황-확장용역비용-마감(지원)-상세
                                wb1500 = new SSExtn1500WB();
                                wb1500.selectServCostDetail(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1550_s.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1555: //확장현황-확장용역비용-마감(지원)-마감
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1555_u.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1560: //확장현황-확장용역비용-마감(지원)-마감취소
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeCancelServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1560_u.jsp";
                                break;
                 */
                // 확장현황-확장용역비용-요원별
            case SSExtnWBMapping.EXTN_1590: //확장현황-확장용역비용-요원별-초기화면
                // 확장용역비용마감 정산내역 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/extn/ss_extn_1590_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1592: //확장현황-확장용역비용-요원별-목록
                wb1500 = new SSExtn1500WB();
                wb1500.selectServAdjmList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1592_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1594: //확장현황-확장용역비용-요원별-상세
                wb1500 = new SSExtn1500WB();
                wb1500.selectServAdjmDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1594_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1575: //확장현황-확장용역비용-요원별-인쇄
                wb1500 = new SSExtn1500WB();
                wb1500.printBoRsltList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1575_p.jsp";
                break;

                // 확장현황-확장용역비용-지국별
            case SSExtnWBMapping.EXTN_1565: //확장현황-확장용역비용-지국별-초기화면
                wb1500 = new SSExtn1500WB();
                wb1500.rsltInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1565_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1570: //확장현황-확장용역비용-지국별-목록
                wb1500 = new SSExtn1500WB();
                wb1500.selectBoRsltList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1570_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1595: //확장현황-확장용역비용-지국별-인쇄
                wb1500 = new SSExtn1500WB();
                wb1500.printServAdjmList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1595_p.jsp";
                break;

                // 확장현황-지국확장이사통계
            case SSExtnWBMapping.EXTN_1596: //확장현황-지국확장이사통계-초기화면
                wb1500 = new SSExtn1500WB();
                wb1500.extnMovmInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1596_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1598: //확장현황-지국확장이사통계-목록
                wb1500 = new SSExtn1500WB();
                wb1500.selectExtnMovmList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1598_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1599: //확장현황-지국확장이사통계-목록인쇄
                nextPage = "/jsp/ss/extn/ss_extn_1599_p.jsp";
                break;

                // 확장현황-사이버확장-요원관리
            case SSExtnWBMapping.EXTN_1600: //확장현황-사이버확장-요원-초기화면
                wb1600 = new SSExtn1600WB();
                wb1600.initPromStafCYEXTN(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1600_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1605: //확장현황-사이버확장-요원-목록
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXTNList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1605_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1610: //확장현황-사이버확장-요원-상세
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXTNDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1610_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1615: //확장현황-사이버확장-요원-인쇄
                wb1600 = new SSExtn1600WB();
                wb1600.printPromStafCYEXTNList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1615_p.jsp";
                break;

                // 확장현황-사이버확장-수당
            case SSExtnWBMapping.EXTN_1650: //확장현황-사이버확장-수당-초기화면
                wb1600 = new SSExtn1600WB();
                wb1600.initPromStafCYEXPay(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1650_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1655: //확장현황-사이버확장-수당-목록
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXPayList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1655_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1660: //확장현황-사이버확장-수당-저장
                wb1600 = new SSExtn1600WB();
                wb1600.updatePromStafCYEXpay(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1660_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1665: //확장현황-사이버확장-수당-인쇄
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXPayList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1665_p.jsp";
                break;

                // 확장현황-사이버확장-기준
            case SSExtnWBMapping.EXTN_1700: //확장현황-사이버확장-기준-초기화면
                wb1700 = new SSExtn1700WB();
                wb1700.cybCampInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1700_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1705: //확장현황-사이버확장-기준-목록
                wb1700 = new SSExtn1700WB();
                wb1700.selectCybCampList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1705_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1710: //확장현황-사이버확장-기준-상세
                wb1700 = new SSExtn1700WB();
                wb1700.selectCybCampDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1710_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1715: //확장현황-사이버확장-기준-등록
                wb1700 = new SSExtn1700WB();
                wb1700.insertCybCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1715_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1720: //확장현황-사이버확장-기준-수정
                wb1700 = new SSExtn1700WB();
                wb1700.updateCybCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1720_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1725: //확장현황-사이버확장-기준-삭제
                wb1700 = new SSExtn1700WB();
                wb1700.deleteCybCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1725_d.jsp";
                break;
                /*
                            case SSExtnWBMapping.EXTN_1730: //확장현황-사이버확장-기준-마감
                                wb1700 = new SSExtn1700WB();
                                wb1700.closeCybCamp(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1730_a.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1735: //확장현황-사이버확장-기준-마감취소
                                wb1700 = new SSExtn1700WB();
                                wb1700.closeCancelCybCamp(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1735_a.jsp";
                                break;
            */

           // 입주아파트현황
           case SSExtnWBMapping.EXTN_1800: //지국경영-입주아파트현황-입주확장조회 초기화면
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1800_a.jsp";
                break;
           case SSExtnWBMapping.EXTN_1810: //지국경영-입주아파트현황-입주확장목록
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1810_l.jsp";
                break;
           case SSExtnWBMapping.EXTN_1815: //지국경영-입주아파트현황-입주확장목록-엑셀저장
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinExtnListPrint(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1815_p.jsp";
                break;
           // 입주아파트 초기화면
           case SSExtnWBMapping.EXTN_1820: //지국경영-입주아파트현황-입주아파트-초기화면
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1820_a.jsp";
                break;
           // 입주아파트 목록조회
           case SSExtnWBMapping.EXTN_1830: //지국경영-입주아파트현황-입주아파트조회
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinAptList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1830_l.jsp";
                break;
           // 입주아파트 목록 엑셀저장
           case SSExtnWBMapping.EXTN_1835: //지국경영-입주아파트현황-입주아파트 엑셀저장
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinAptPrint(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1835_p.jsp";
                break;            
           case SSExtnWBMapping.EXTN_1840: //확장현황-입주아파트관리-입주아파트관리 초기화면
                wb1800 = new SSExtn1800WB();
                wb1800.selectInitList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1840_a.jsp";
                break;
           case SSExtnWBMapping.EXTN_1845: //확장현황-입주아파트관리-입주아파트관리 엑셀 파일 일괄 업로드
               wb1800 = new SSExtn1800WB();
               wb1800.uploadExcel(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1845_i.jsp";
               break;
           case SSExtnWBMapping.EXTN_1850: //확장현황-입주아파트관리-입주아파트관리 조회
               wb1800 = new SSExtn1800WB();
               wb1800.selectList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1850_l.jsp";
               break; 
           case SSExtnWBMapping.EXTN_1855: //확장현황-입주아파트관리-입주아파트관리 승인
               wb1800 = new SSExtn1800WB();
               wb1800.apprList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1855_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_1860: //확장현황-입주아파트관리-입주아파트관리 승인취소
               wb1800 = new SSExtn1800WB();
               wb1800.cancelList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1860_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_1865: //확장현황-입주아파트관리-입주아파트관리 저장(수정)
               wb1800 = new SSExtn1800WB();
               wb1800.updateList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1865_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_1900:
                wb1900 = new SSExtn1900WB();
                wb1900.selectExtnResInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1900_a.jsp";
                break;
           case SSExtnWBMapping.EXTN_1910:
                wb1900 = new SSExtn1900WB();
                wb1900.selectExtnResList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1910_l.jsp";
                break;
           case SSExtnWBMapping.EXTN_1920:
                wb1900 = new SSExtn1900WB();
                wb1900.selectExtnResDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1920_s.jsp";
                break;
	       case SSExtnWBMapping.EXTN_1930:
	            wb1900 = new SSExtn1900WB();
	            wb1900.selectExtnResUpdate(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_1930_u.jsp";
	            break;

	       // 중지현황 추가 2009.05.14 권정윤 
	       case SSExtnWBMapping.EXTN_2000:
	            wb2000 = new SSExtn2000WB();
	            wb2000.suspInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2000_a.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2010:
	            wb2000 = new SSExtn2000WB();
	            wb2000.selectSuspList(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2010_l.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2015:
	            wb2000 = new SSExtn2000WB();
	            wb2000.selectSuspPerList(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2015_l.jsp";
	            break;
	       
	       // 본사확장 추가 2009.05.21  권정윤 
	       case SSExtnWBMapping.EXTN_2100:
	            wb2100 = new SSExtn2100WB();
	            wb2100.hdqtInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2100_a.jsp";
	            break;	            
	       case SSExtnWBMapping.EXTN_2105:
	            wb2100 = new SSExtn2100WB();
	            wb2100.selecthdqt(req, res);
	            String type = req.getParameter("type");
	            nextPage = "/jsp/ss/extn/ss_extn_2105_l.jsp";
	            break;	            
	       case SSExtnWBMapping.EXTN_2110:
	            wb2100 = new SSExtn2100WB();
	            wb2100.detailhdqt(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2110_l.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2120:
	            wb2100 = new SSExtn2100WB();
	            wb2100.updatehdqt(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2120_u.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2130:
	            wb2100 = new SSExtn2100WB();
	            wb2100.alerthdqt(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2130_i.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2135:
	            wb2100 = new SSExtn2100WB();
	            wb2100.showAlert(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2135_l.jsp";
	            break;
	       
           // 에듀/제휴 확장 추가 2009.05.26  권정윤
	       case SSExtnWBMapping.EXTN_2150:
	            wb2100 = new SSExtn2100WB();
	            wb2100.eduInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2150_a.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2155:
	            wb2100 = new SSExtn2100WB();
	            wb2100.selectEdu(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2155_l.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2160:
	            wb2100 = new SSExtn2100WB();
	            wb2100.detailEdu(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2160_s.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2162:
	            wb2100 = new SSExtn2100WB();
	            wb2100.updateEdu(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2162_u.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2163:
	            wb2100 = new SSExtn2100WB();
	            wb2100.eduRdrInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2163_a.jsp";
	            break;	           
	       case SSExtnWBMapping.EXTN_2165:
	            wb2100 = new SSExtn2100WB();
	            wb2100.insertRdr(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2165_i.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2170:
	            wb2100 = new SSExtn2100WB();
	            wb2100.insertInst(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2170_i.jsp";
	            break;
	            
	       // 사원확장비 관리 추가 2009.05.26  권정윤     
           case SSExtnWBMapping.EXTN_2180:
	            wb2100 = new SSExtn2100WB();
	            wb2100.costInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2180_a.jsp";
	            break;	       
           case SSExtnWBMapping.EXTN_2182:
	            wb2100 = new SSExtn2100WB();
	            wb2100.selectCost(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2182_l.jsp";
	            break; 
           case SSExtnWBMapping.EXTN_2183:
	            wb2100 = new SSExtn2100WB();
	            wb2100.insertCost(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2183_i.jsp";
	            break;
	       
	       // 단체확장(대납독자) 추가 2009.06.02 
           case SSExtnWBMapping.EXTN_2190:               
               nextPage = "/jsp/ss/extn/ss_extn_2190_a.jsp"; //WB를 거치지 않고 바로 JSP로 분기시킨다.
               break;
           case SSExtnWBMapping.EXTN_2191:
	            wb2100 = new SSExtn2100WB();
	            wb2100.uploadExtn(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2191_i.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2192:
	            wb2100 = new SSExtn2100WB();
	            wb2100.getUserInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2192_l.jsp";
	            break;
	            
           // 확장현황-지국확장마감 2009.07.09 김용욱
           case SSExtnWBMapping.EXTN_2200: //확장현황-지국확장 마감-초기화면
        	   String frdt = req.getParameter("frdt");
               wb2200 = new SSExtn2200WB();
               wb2200.extnExtnclosInit(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2200_a.jsp?frdt="+frdt;
               break;
           case SSExtnWBMapping.EXTN_2210: //확장현황-지국확장 마감-목록조회
               wb2200 = new SSExtn2200WB();
               wb2200.extnExtnclosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2210_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2220: //확장현황-지국확장 마감-저장
               wb2200 = new SSExtn2200WB();
               wb2200.extnExtnclosUpdate(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2220_u.jsp";
               break;
               
            // 확장현황-지국중지마감 2009.07.10 김용욱
           case SSExtnWBMapping.EXTN_2250: //확장현황-지국확장 마감 -초기화면
        	   String frdt1 = req.getParameter("frdt");
               wb2200 = new SSExtn2200WB();
               wb2200.extnBosuspclosInit(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2250_a.jsp?frdt="+frdt1;
               break;
           case SSExtnWBMapping.EXTN_2253: //확장현황-지국확장 마감 -초기화면
               wb2200 = new SSExtn2200WB();
               wb2200.boclosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2254_p.jsp";
               break;
           case SSExtnWBMapping.EXTN_2260: //확장현황-지국중지 마감 -목록조회
               wb2200 = new SSExtn2200WB();
               wb2200.extnBosuspclosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2260_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2270: //확장현황-지국중지 마감 -저장
               wb2200 = new SSExtn2200WB();
               wb2200.extnBosuspclosUpdate(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2270_u.jsp";
               break;

           //확장현황-일괄확장등록
           case SSExtnWBMapping.EXTN_2280: //확장현황-일괄확장등록
               wb2280 = new SSExtn2280WB();
               wb2280.batchExtnJob(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2280_a.jsp";
               break;

           //확장현황-일괄확장리스트
           case SSExtnWBMapping.EXTN_2290: //확장현황-일괄확장등록
               wb2280 = new SSExtn2280WB();
               wb2280.listBatchExtnJob(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2290_l.jsp";
               break;                              
           //이마TM자료
           case SSExtnWBMapping.EXTN_2295: //확장현황-일괄확장등록
               wb2280 = new SSExtn2280WB();
               wb2280.listIMTM(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2295_l.jsp";
               break;

           case SSExtnWBMapping.EXTN_2230: //확장부실점검-점검목록조회-초기화면
        	   wb2200 = new SSExtn2200WB();
               wb2200.initExtnClos(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2230_a.jsp";
               break;

           case SSExtnWBMapping.EXTN_2231: //확장부실점검-점검목록조회
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2231_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2232: //확장부실점검-상세조회
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosDtls(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2232_s.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2233: //확장부실점검-담당확인목록저장
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosUpdate(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2233_i.jsp";
               break;

           case SSExtnWBMapping.EXTN_2234: //확장부실점검-조선IS중지반영
               wb2200 = new SSExtn2200WB();
               wb2200.updateExtnclosIssup(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2234_i.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2235: //확장부실점검-장표조회
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnclosReport(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2235_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2236: //확장부실점검-점검마감
               wb2200 = new SSExtn2200WB();
               wb2200.updateExtnClosClose(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2236_i.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2237: //확장부실점검-점검마감여부조회
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosInfo(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2237_i.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2240: //마감보고서 초기화면
               wb2200 = new SSExtn2200WB();
               nextPage = "/jsp/ss/extn/ss_extn_2240_a.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2245: //마감보고서 조회/엑셀저장
               wb2200 = new SSExtn2200WB();
               wb2200.selectClosReport(req, res);
               //if(req.getParameter("jobcd").equals("0")) {
               //	   nextPage = "/jsp/ss/extn/ss_extn_2245_l.jsp";
               //} else {
            	   nextPage = "/jsp/ss/extn/ss_extn_2245_p.jsp";
               //}
               break;
            
           case SSExtnWBMapping.EXTN_2300: // 사원확장 통계 초기화면        	   
               wb2300 = new SSExtn2300WB();
               wb2300.init(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2300_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2305: // 사원확장 통계 목록
               wb2300 = new SSExtn2300WB();
               wb2300.selectRdrExtnStatList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2305_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2400: // 대학생 캠페인확장 초기화면
               //wb2400 = new SSExtn2400WB();
               //wb2400.init(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2400_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2401: // 대학생 캠페인확장 목록조회        	   
               wb2400 = new SSExtn2400WB();
               wb2400.selectCampExtnUniList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2401_l.jsp";
               break;
           
            // 단체확장(대납독자) 추가 2009.06.02 
           case SSExtnWBMapping.EXTN_2500:               
               nextPage = "/jsp/ss/extn/ss_extn_2500_a.jsp"; //WB를 거치지 않고 바로 JSP로 분기시킨다.
               break;
           case SSExtnWBMapping.EXTN_2501:
	            wb2500 = new SSExtn2500WB();
	            wb2500.uploadExtn(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2501_i.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2502:
	            wb2500 = new SSExtn2500WB();
	            wb2500.getUserInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2502_l.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2600: // 
               nextPage = "/jsp/ss/extn/ss_extn_2600_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2610: // 
               wb2600 = new SSExtn2600WB();
               wb2600.selectYearlySubsList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2610_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2620: // 
               wb2600 = new SSExtn2600WB();
               wb2600.selectYearlySubsDetail(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2620_s.jsp";
               break;
           case SSExtnWBMapping.EXTN_2630: // 
               wb2600 = new SSExtn2600WB();
               wb2600.getUserInfo(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2630_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2640: // 
               wb2600 = new SSExtn2600WB();
               wb2600.insertYearlySubs(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2640_i.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2650: // 
               wb2600 = new SSExtn2600WB();
               wb2600.getDlvaddr(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2650_l.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2700: // 
               wb2700 = new SSExtn2700WB();
               wb2700.init(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2700_a.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2710: // 
               wb2700 = new SSExtn2700WB();
               wb2700.selectEmpNwsprdrList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2710_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2720: // 
               wb2700 = new SSExtn2700WB();
               wb2700.selectEmpNwsprdrListRdr(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2720_l.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2730: // 
               wb2700 = new SSExtn2700WB();
               wb2700.updateEmpNwsprdr(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2730_u.jsp";
               break;
              
           case SSExtnWBMapping.EXTN_2800: //확장현황-센터비독자관리 초기화면
        	   wb2800 = new SSExtn2800WB();
        	   wb2800.selectInitList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2800_a.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2810: //확장현황-센터비독자관리 조회
               wb2800 = new SSExtn2800WB();
               wb2800.selectRdrareaList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2810_l.jsp";
               break;

           case SSExtnWBMapping.EXTN_2820: //확장현황-센터비독자관리 상세화면
               wb2800 = new SSExtn2800WB();
               wb2800.selectRdrareaDetail(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2820_s.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2900: 
               nextPage = "/jsp/ss/extn/ss_extn_2900_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2901:        	   
               wb2900 = new SSExtn2900WB();
               wb2900.selectKyoboEventList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2901_l.jsp";
               break;   
           case SSExtnWBMapping.EXTN_2902: 	   
               wb2900 = new SSExtn2900WB();
               wb2900.updateKyoboEventDeli(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2902_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_2903:
               wb2100 = new SSExtn2100WB();
	           wb2100.detailhdqt(req, res);
	           nextPage = "/jsp/ss/extn/ss_extn_2903_s.jsp";
	           break;
          
          case SSExtnWBMapping.EXTN_3000:
               wb3000 = new SSExtn3000WB();
               wb3000.selectSuspDefInit(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_3000_a.jsp";
               break;
          case SSExtnWBMapping.EXTN_3010:
        	   wb3000 = new SSExtn3000WB();
        	   wb3000.selectSuspDefList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_3010_l.jsp";
               break;
          case SSExtnWBMapping.EXTN_3020:
        	   wb3000 = new SSExtn3000WB();
        	   wb3000.selectSuspDefDetail(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_3020_s.jsp";
               break;  
          case SSExtnWBMapping.EXTN_3030:
	       	   wb3000 = new SSExtn3000WB();
	       	   wb3000.selectSuspDefPrint(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3030_p.jsp";
              break;       
              
          case SSExtnWBMapping.EXTN_3100: //확장부실점검-점검목록조회-초기화면
        	  wb3100 = new SSExtn3100WB();
              wb3100.initExtnClos(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3100_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_3101: //확장부실점검-점검목록조회
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosList(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3101_l.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3102: //확장부실점검-상세조회
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosDtls(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3102_s.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3103: //확장부실점검-담당확인목록저장
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosUpdate(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3103_i.jsp";
              break;
          case SSExtnWBMapping.EXTN_3104: //확장부실점검-조선IS중지반영
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.updateExtnclosIssup(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3104_i.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3105: //확장부실점검-장표조회
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnclosReport(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3105_l.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3106: //확장부실점검-점검마감
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.updateExtnClosClose(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3106_i.jsp";
              break;              
          /*case SSExtnWBMapping.EXTN_3107: //확장부실점검-점검마감여부조회
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosInfo(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3107_i.jsp";
              break;     	*/
          case SSExtnWBMapping.EXTN_3200: //확장조건-초기
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.selectExtnCondInit(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3200_a.jsp";
              break;   
          case SSExtnWBMapping.EXTN_3210: //확장조건-리스트
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.selectExtnCondList(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3210_l.jsp";
              break;   
          case SSExtnWBMapping.EXTN_3220: //확장조건-승인
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.apprExtnCond(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3220_u.jsp";
              break;   
          case SSExtnWBMapping.EXTN_3230: //확장조건-승인거절
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.apprRejExtnCond(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3230_u.jsp";
              break; 
          case SSExtnWBMapping.EXTN_3240: //확장조건-삭제
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.delExtnCond(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3240_u.jsp";
              break;
          //미수개월수별 조회    
          case SSExtnWBMapping.EXTN_3400: 
        	  wb3400 = new SSExtn3400WB();
        	  wb3400.initExtn3400(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3400_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3410: 
        	  wb3400 = new SSExtn3400WB();
        	  wb3400.selectExtn3410(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3410_l.jsp";
              break;
          //재무독자 이후수금 조회    
          case SSExtnWBMapping.EXTN_3500: 
        	  wb3500 = new SSExtn3500WB();
        	  wb3500.initExtn3500(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3500_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3510: 
        	  wb3500 = new SSExtn3500WB();
        	  wb3500.selectExtn3510(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3510_l.jsp";
              break;               
          //준유가 중지독자 조회    
          case SSExtnWBMapping.EXTN_3600: 
        	  wb3600 = new SSExtn3600WB();
        	  wb3600.initExtn3600(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3600_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3610: 
        	  wb3600 = new SSExtn3600WB();
        	  wb3600.selectExtn3610(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3610_l.jsp";
              break;              
          //1년미만수금 중지 조회    
          case SSExtnWBMapping.EXTN_3700: 
        	  wb3700 = new SSExtn3700WB();
        	  wb3700.initExtn3700(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3700_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3710: 
        	  wb3700 = new SSExtn3700WB();
        	  wb3700.selectExtn3710(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3710_l.jsp";
              break;               
          //마감후 중지취소 조회  
          case SSExtnWBMapping.EXTN_3800: 
        	  wb3800 = new SSExtn3800WB();
        	  wb3800.initExtn3800(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3800_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3810: 
        	  wb3800 = new SSExtn3800WB();
        	  wb3800.selectExtn3810(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3810_l.jsp";
              break;   
          //연락처이상 독자 조회
          case SSExtnWBMapping.EXTN_3900: 
        	  wb3900 = new SSExtn3900WB();
        	  wb3900.initExtn3900(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3900_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3910: 
        	  wb3900 = new SSExtn3900WB();
        	  wb3900.selectExtn3910(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3910_l.jsp";
              break; 
          //다부수 입력 독자 조회
          case SSExtnWBMapping.EXTN_4000: 
        	  wb4000 = new SSExtn4000WB();
        	  wb4000.initExtn4000(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4000_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4010: 
        	  wb4000 = new SSExtn4000WB();
        	  wb4000.selectExtn4010(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4010_l.jsp";
              break; 
          //단가이상 독자 조회
          case SSExtnWBMapping.EXTN_4100: 
        	  wb4100 = new SSExtn4100WB();
        	  wb4100.initExtn4100(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4100_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4110: 
        	  wb4100 = new SSExtn4100WB();
        	  wb4100.selectExtn4110(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4110_l.jsp";
              break; 
          //확장조건별 독자 조회
          case SSExtnWBMapping.EXTN_4200: 
        	  wb4200 = new SSExtn4200WB();
        	  wb4200.initExtn4200(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4200_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4210: 
        	  wb4200 = new SSExtn4200WB();
        	  wb4200.selectExtn4210(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4210_l.jsp";
              break;
          case SSExtnWBMapping.EXTN_3300: //문자점검독자관리-설문등록  20151111 장선희
              nextPage = "/jsp/ss/extn/ss_extn_3300_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_3310: //문자점검독자관리-설문리스트
        	  wb3300 = new SSExtn3300WB();
        	  wb3300.selectMoSvyList(req, res);
        	  System.out.println("------SSExtnServlet3310------");
        	  nextPage = "/jsp/ss/extn/ss_extn_3310_l.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_3320: //문자점검독자관리-설문상세
        	  wb3300 = new SSExtn3300WB();
        	  wb3300.selectMoSvyDetail(req, res);
        	  System.out.println("------SSExtnServlet3320------");
        	  nextPage = "/jsp/ss/extn/ss_extn_3320_s.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_3330: //문자점검독자관리-설문추가,변경
        	  wb3300 = new SSExtn3300WB();
        	  wb3300.MoSvyUpdate(req, res);
        	  System.out.println("------SSExtnServlet3330------");
        	  nextPage = "/jsp/ss/extn/ss_extn_3330_u.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_3340: //문자점검독자관리-설문등록-대기중인문자일괄삭제
              wb3300 = new SSExtn3300WB();
              wb3300.MoDelete(req, res);
              System.out.println("------SSExtnServlet3340------");
              nextPage = "/jsp/ss/extn/ss_extn_3340_u.jsp";
              break;	  
          case SSExtnWBMapping.EXTN_4300: //문자점검독자관리-설문응답-초기화면 20151127 장선희
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyRdrInit(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4300_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_4310: //문자점검독자관리-설문응답-독자리스트
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyRdrList(req, res);
        	  System.out.println("------SSExtnServlet4310------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4310_l.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_4320: //문자점검독자관리-설문응답-독자상세 및 응답리스트
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyRdrDetail(req, res);
        	  System.out.println("------SSExtnServlet4320------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4320_s.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_4330: //문자점검독자관리-설문응답-센터전달, 부실확정, 전체마감
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyBsComp(req, res);
        	  System.out.println("------SSExtnServlet4330------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4330_u.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_4340: //문자점검독자관리-설문응답-마감년월,캠페인유형으로 설문명리스트
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyList(req, res);
        	  System.out.println("------SSExtnServlet4340------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4340_l.jsp";
        	  break;	  
          //연락처 중복독자
          case SSExtnWBMapping.EXTN_4400: 
        	  wb4400 = new SSExtn4400WB();
        	  wb4400.initExtn4400(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4400_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4410: 
        	  wb4400 = new SSExtn4400WB();
        	  wb4400.selectExtn4410(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4410_l.jsp";
              break;
/*          case SSExtnWBMapping.EXTN_4500:  //무료지관리-초기
        	  wb4500 = new SSExtn4500WB();
        	  wb4500.freeNwspInit(req, res);
        	  nextPage = "/jsp/ss/extn/ss_extn_4500_l.jsp";
        	  break;
*/
          case SSExtnWBMapping.EXTN_4510:  //무료지관리-조회
        	  wb4500 = new SSExtn4500WB();
        	  wb4500.freeNwspList(req, res);
        	  nextPage = "/jsp/ss/extn/ss_extn_4510_l.jsp";
        	  break;
          //기업후원확장-등록및조회
          case SSExtnWBMapping.EXTN_4600: 
        	  wb4600 = new SSExtn4600WB();
        	  wb4600.initExtn4600(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4600_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_4601:
	            wb4600 = new SSExtn4600WB();
	            wb4600.getUserInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4601_l.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4602:
	            wb4600 = new SSExtn4600WB();
	            wb4600.getDncompInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4602_l.jsp";
	            break;     
          case SSExtnWBMapping.EXTN_4610:
	            wb4600 = new SSExtn4600WB();
	            wb4600.uploadExtn4610(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4620:
	            wb4600 = new SSExtn4600WB();
	            wb4600.selectExtn4620(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4620_l.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4630:
	            wb4600 = new SSExtn4600WB();
	            wb4600.saveExtn4630(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4640:
	            wb4600 = new SSExtn4600WB();
	            wb4600.closExtn4640(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4650:
	            wb4600 = new SSExtn4600WB();
	            wb4600.selectExtn4650(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4650_l.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4660:
	            wb4600 = new SSExtn4600WB();
	            wb4600.stopExtn4660(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break;  
          case SSExtnWBMapping.EXTN_4700:
              nextPage = "/jsp/ss/extn/ss_extn_4700_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_4710: 
        	  wb4700 = new SSExtn4700WB();
        	  wb4700.selectExtn4710(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4710_l.jsp";
              break; 
          case SSExtnWBMapping.EXTN_4720: 
        	  wb4700 = new SSExtn4700WB();
        	  wb4700.selectExtn4720(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4720_l.jsp";
              break;
          case SSExtnWBMapping.EXTN_4730: 
        	  wb4700 = new SSExtn4700WB();
        	  wb4700.updateExtn4730(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4730_u.jsp";
              break;
          case SSExtnWBMapping.EXTN_4800: 
        	  wb4800 = new SSExtn4800WB();
        	  wb4800.initExtn4800(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4800_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_4810:
	          wb4800 = new SSExtn4800WB();
	          wb4800.selectExtn4810(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4810_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4820:
	          wb4800 = new SSExtn4800WB();
	          wb4800.updateExtn4820(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4820_u.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4830:
	          wb4800 = new SSExtn4800WB();
	          wb4800.selectExtn4830(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4830_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_4840:
	          wb4800 = new SSExtn4800WB();
	          wb4800.updateExtn4840(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4820_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_4850:
	          wb4800 = new SSExtn4800WB();
	          wb4800.updateExtn4850(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4820_u.jsp";
	          break;    
          case SSExtnWBMapping.EXTN_4900:
	          wb4900 = new SSExtn4900WB();
	          wb4900.initExtn4900(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4900_a.jsp";
	          break; 
          case SSExtnWBMapping.EXTN_4901:
	          wb4900 = new SSExtn4900WB();
	          wb4900.selectExtn4901(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4901_l.jsp";
	          break;      
          case SSExtnWBMapping.EXTN_4910:
	          wb4900 = new SSExtn4900WB();
	          wb4900.selectExtn4910(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4910_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4920:
	          wb4900 = new SSExtn4900WB();
	          wb4900.updateExtn4920(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4920_i.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4930:
	          wb4900 = new SSExtn4900WB();
	          wb4900.selectExtn4930(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4930_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5000:
	          wb5000 = new SSExtn5000WB();
	          wb5000.initExtn5000(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5000_a.jsp";
	          break;     
          case SSExtnWBMapping.EXTN_5010:
	          wb5000 = new SSExtn5000WB();
	          wb5000.selectExtn5010(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5010_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5020:
	          wb5000 = new SSExtn5000WB();
	          wb5000.selectExtn5020(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5020_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5030:
	          wb5000 = new SSExtn5000WB();
	          wb5000.updateExtn5030(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5030_i.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5040:
	          wb5000 = new SSExtn5000WB();
	          wb5000.excelExtn5040(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5040_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5110:
	          wb5100 = new SSExtn5100WB();
	          wb5100.selectExtn5110(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5110_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5120:
	          wb5100 = new SSExtn5100WB();
	          wb5100.selectExtn5120(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5120_l.jsp";
	          break;      
          case SSExtnWBMapping.EXTN_5130:
	          wb5100 = new SSExtn5100WB();
	          wb5100.updateExtn5130(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5130_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5210:
	          wb5200 = new SSExtn5200WB();
	          wb5200.selectExtn5210(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5210_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5220:
	          wb5200 = new SSExtn5200WB();
	          wb5200.updateExtn5220(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5220_u.jsp";
	          break; 
          case SSExtnWBMapping.EXTN_5230:
	          wb5200 = new SSExtn5200WB();
	          wb5200.updateExtn5230(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5220_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5300: 
        	  wb5300 = new SSExtn5300WB();
        	  wb5300.initExtn5300(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_5300_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_5310:
	          wb5300 = new SSExtn5300WB();
	          wb5300.selectExtn5310(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5310_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5320:
	          wb5300 = new SSExtn5300WB();
	          wb5300.updateExtn5320(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5320_u.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5330:
	          wb5300 = new SSExtn5300WB();
	          wb5300.selectExtn5330(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5330_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5340:
	          wb5300 = new SSExtn5300WB();
	          wb5300.updateExtn5340(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5320_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5400: 
        	  wb5400 = new SSExtn5400WB();
        	  wb5400.initExtn5400(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_5400_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_5410:
	          wb5400 = new SSExtn5400WB();
	          wb5400.selectExtn5410(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5410_l.jsp";
	          break;          
          case SSExtnWBMapping.EXTN_5420:
	          wb5400 = new SSExtn5400WB();
	          wb5400.selectExtn5420(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5420_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5500: 
        	  wb5500 = new SSExtn5500WB();
        	  wb5500.initExtn5500(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_5500_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_5510:
	            wb5500 = new SSExtn5500WB();
	            wb5500.uploadExtn5510(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5510_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_5520:
	            wb5500 = new SSExtn5500WB();
	            wb5500.selectExtn5520(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5520_l.jsp";
	            break;     
          case SSExtnWBMapping.EXTN_5530:
	            wb5500 = new SSExtn5500WB();
	            wb5500.deleteExtn5530(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5510_i.jsp";
	            break;
          case SSExtnWBMapping.EXTN_5601:
	            wb5600 = new SSExtn5600WB();
	            wb5600.selectExtn5601(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5601_l.jsp";
	            break;       
          case SSExtnWBMapping.EXTN_5610:
	            wb5600 = new SSExtn5600WB();
	            wb5600.selectExtn5610(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5610_l.jsp";
	            break; 
	      case SSExtnWBMapping.EXTN_5620:
		        wb5600 = new SSExtn5600WB();		        
	            wb5600.insertExtn5620(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5620_i.jsp";
	            break;	    	    
	      case SSExtnWBMapping.EXTN_5630:
	            wb5600 = new SSExtn5600WB();
	            wb5600.updateExtn5630(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5620_i.jsp";
	            break;         
	      case SSExtnWBMapping.EXTN_5700:
	            wb5700 = new SSExtn5700WB();
	            wb5700.initExtn5700(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5700_a.jsp";
	            break;       
          case SSExtnWBMapping.EXTN_5710:
	            wb5700 = new SSExtn5700WB();
	            wb5700.selectExtn5710(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5710_l.jsp";
	            break; 
	      case SSExtnWBMapping.EXTN_5720:
		        wb5700 = new SSExtn5700WB();		        
	            wb5700.insertExtn5720(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5720_i.jsp";
	            break;	    	    
	      case SSExtnWBMapping.EXTN_5730:
	            wb5700 = new SSExtn5700WB();
	            wb5700.selectExtn5730(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5730_l.jsp";
	            break;       
	      case SSExtnWBMapping.EXTN_5800:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.ininExtn5800(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5800_a.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5810:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.selectExtn5800WB(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5810_l.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5820:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.updateExtn5800(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5820_u.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5830:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.dlvComplete(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5830_u.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5840:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.isDlvChg(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5840_u.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5850:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.isPayCanc(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5840_u.jsp";
	            break;         
	      default:	
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
