/***************************************************************************************************
 * 파일명 : SSBrmgrServlet.java
 * 기능 : 지국경영 서블릿
 * 작성일자 : 2004-03-06
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
//import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.wb.*;
//import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;
/*
import chosun.ciis.ss.sls.rdr.ejb.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
*/

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class SSBrmgrServlet extends ChosunServlet {

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
    public void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/brmgr/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSBrmgrServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSBrmgrServlet : process : nextPage : " + nextPage);
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
     * SSBrmgrWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {

        String nextPage = null;
        SSBrmgr1000WB wb1000 = null; //지국경영-지국부수현황
        SSBrmgr1100WB wb1100 = null; //지국경영-마일리지현황
        SSBrmgr1200WB wb1200 = null; //지국경영-부수증감 담당
        SSBrmgr1300WB wb1300 = null; //지국경영-부수증감 부수담당
        SSBrmgr1400WB wb1400 = null; //지국경영-부수증감 신청대행
        SSBrmgr1500WB wb1500 = null; //지국경영-부수증감 신청대행
        SSBrmgr1600WB wb1600 = null; //지국경영-스포츠부수현황
        SSBrmgr1700WB wb1700 = null; //지국경영-관할지국조정
        SSBrmgr1800WB wb1800 = null; //지국경영-아파트투입률
        SSBrmgr1900WB wb1900 = null; //지국경영-주간조선발송관리
        SSBrmgr2000WB wb2000 = null; //지국경영-구독유지캠페인
        SSBrmgr2100WB wb2100 = null;
        SSBrmgr2200WB wb2200 = null;
        SSBrmgr2300WB wb2300 = null;
        SSBrmgr2400WB wb2400 = null;
        SSBrmgr2500WB wb2500 = null;
        SSBrmgr2600WB wb2600 = null;
        SSBrmgr2700WB wb2700 = null;
        SSBrmgr2800WB wb2800 = null; //센터공사지원
        SSBrmgr3000WB wb3000 = null;
        SSReader1700WB wb1700rdr = null;

		/* 모바일관련 wb 따로 분리  */
        SSBrmgr12500WB wb12500 = null; //센터관리-건전도관리-센터종합정보관리
        SSBrmgr11800WB wb11800 = null; //센터관리-투입률조사

        switch (pid) {
            // 지국부수현황
            case SSBrmgrWBMapping.BRMGR_1000: //지국경영-지국부수현황-초기화면
                wb1000 = new SSBrmgr1000WB();
                wb1000.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1000_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1010: //지국경영-지국부수현황-조회(리스트)
                wb1000 = new SSBrmgr1000WB();
                wb1000.selectBoqtypcondList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1010_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1020: //지국경영-지국부수현황-조회(리스트)
                wb1000 = new SSBrmgr1000WB();
                wb1000.selectBoqtypcondEXCEL(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1020_p.jsp";
                break;

            // 마일리지현황
            case SSBrmgrWBMapping.BRMGR_1100: //지국경영-마일리지현황-초기화면
                wb1100 = new SSBrmgr1100WB();
                wb1100.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1100_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1110: //지국경영-마일리지현황-조회(리스트)
                wb1100 = new SSBrmgr1100WB();
                wb1100.selectMigllmmtclosList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1110_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1120: //지국경영-마일리지현황-조회(리스트)
                wb1100 = new SSBrmgr1100WB();
                wb1100.selectMilgpayDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1120_l.jsp";
                break;
            // 부수증감-영업
            case SSBrmgrWBMapping.BRMGR_1200: //지국경영-부수증감-본지신청(영업)-초기화면
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1200_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1210: //지국경영-부수증감-본지신청(영업)-조회(리스트)
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectQtyaplcMainNwspList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1210_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1220: //지국경영-부수증감-본지신청(영업)-저장
                wb1200 = new SSBrmgr1200WB();
                wb1200.updateQtyaplcMainNwsp(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1220_u.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1225: //지국경영-부수증감-본지신청(지원)-인쇄
                wb1200 = new SSBrmgr1200WB();
                wb1200.printQtyaplcMainNwspClosList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1225_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1230: //지국경영-부수증감-신청(영업)-초기화면
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1230_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1240: //지국경영-부수증감-신청(영업)-조회(리스트)
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectQtyaplcList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1240_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1250: //지국경영-부수증감-신청(영업)-저장
                wb1200 = new SSBrmgr1200WB();
                wb1200.updateQtyaplc(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1250_u.jsp";
                break;
            // 부수증감-지원
            case SSBrmgrWBMapping.BRMGR_1300: //지국경영-부수증감-본지신청(지원)-초기화면
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1300_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1310: //지국경영-부수증감-본지신청(지원)-조회(리스트)
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectQtyaplcMainNwspList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1310_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1320: //지국경영-부수증감-본지신청(지원)-마감
                wb1300 = new SSBrmgr1300WB();
                wb1300.updateQtyaplcMainNwspClos(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1320_u.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1340: //지국경영-부수증감-신청(지원)-초기화면
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1340_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1350: //지국경영-부수증감-신청(지원)-조회(리스트)
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectQtyaplcList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1350_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1360: //지국경영-부수증감-신청(지원)-마감
                wb1300 = new SSBrmgr1300WB();
                wb1300.updateQtyaplcClos(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1360_u.jsp";
                break;
            // 부수증감 신청대행 부수담당
            case SSBrmgrWBMapping.BRMGR_1400: //지국경영-부수증감-신청대행(지원)-초기화면
                wb1400 = new SSBrmgr1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1400_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1410: //지국경영-부수증감-신청대행(지원)-조회
                wb1400 = new SSBrmgr1400WB();
                wb1400.selectQtyaplcVexcList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1410_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1420: //지국경영-부수증감-신청대행(지원)-저장
                wb1400 = new SSBrmgr1400WB();
                wb1400.updateQtyaplcVexc(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1420_u.jsp";
                break;

            // 공정위위약금
            case SSBrmgrWBMapping.BRMGR_1500: //지국경영-공정위위약금-초기화면
                wb1500 = new SSBrmgr1500WB();
                wb1500.selectCodeList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1500_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1510: //지국경영-공정위위약금-조회(리스트)
                wb1500 = new SSBrmgr1500WB();
                wb1500.selectCommList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1510_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1520: //지국경영-공정위위약금-상세조회
                wb1500 = new SSBrmgr1500WB();
                wb1500.selectFctFrftDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1520_s.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1530: //지국경영-공정위위약금-입력
                wb1500 = new SSBrmgr1500WB();
                wb1500.accessFctFrft(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1530_i.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1540: //지국경영-공정위위약금-수정
                wb1500 = new SSBrmgr1500WB();
                wb1500.accessFctFrft(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1540_u.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1550: //지국경영-공정위위약금-삭제
                wb1500 = new SSBrmgr1500WB();
                wb1500.accessFctFrft(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1550_d.jsp";
                break;

            // 스포츠부수현황
            case SSBrmgrWBMapping.BRMGR_1600: //지국경영-스포츠부수현황-초기화면
                wb1600 = new SSBrmgr1600WB();
                wb1600.initSpQty(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1600_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1610: //지국경영-스포츠부수현황-목록
                wb1600 = new SSBrmgr1600WB();
                wb1600.selectSpQtyList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1610_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1620: //지국경영-스포츠부수현황-인쇄
                wb1600 = new SSBrmgr1600WB();
                wb1600.printSpQtyExcel(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1620_p.jsp";
                break;

            // 관할지국조정
            case SSBrmgrWBMapping.BRMGR_1700: //지국경영-관할지국조정-초기화면
                wb1700 = new SSBrmgr1700WB();
                wb1700.initRdrMovm(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1700_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1710: //지국경영-관할지국조정-목록
                wb1700 = new SSBrmgr1700WB();
                wb1700.selectRdrMovmList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1710_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1720: //지국경영-관할지국조정-상세
                wb1700 = new SSBrmgr1700WB();
                wb1700.selectRdrMovmDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1720_s.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1730: //지국경영-관할지국조정-담당확인
                wb1700 = new SSBrmgr1700WB();
                wb1700.updateRdrMovm(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1730_u.jsp";
                break;

            // 아파트투입률
            case SSBrmgrWBMapping.BRMGR_1800: //지국경영-아파트투입률-초기화면(아파트)
                wb1800 = new SSBrmgr1800WB();
                wb1800.initApt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1800_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1805: //지국경영-아파트투입률-목록(아파트)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1805_l.jsp";
                break;
/*=======================================================*/
            case SSBrmgrWBMapping.BRMGR_1810: //지국경영-아파트투입률-초기화면
//                wb1800 = new SSBrmgr1800WB();
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1810_a.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1815: //지국경영-아파트투입률-초기화면(투입률)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1815_a.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1820: //SLCommunWBMapping.COMMUN_2620:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectDongList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1820_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1825:  //지국경영-아파트투입률-주소로 아파트목록조회
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1825_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1826:  //지국경영-아파트투입률-주소로 아파트목록조회
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAddrToAptList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1826_s.jsp";
                break;


            case SSBrmgrWBMapping.BRMGR_1830: //지국경영-아파트투입률-조사목록
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1830_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1840:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptinfo(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1840_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1841:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptQuickSearch(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1841_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1850:  //지국경영-아파트투입률-조사내역 상세보기
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1850_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1851:  //지국경영-아파트투입률-아파트구조 인쇄 초기화면
//                wb1800 = new SSBrmgr1800WB();
//                wb1800.selectThrwDetail(req, res);
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1851_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1852:  //지국경영-아파트투입률-아파트구조 인쇄
                wb1800 = new SSBrmgr1800WB();
//                wb1800.selectThrwDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1852_t.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1853:  //지국경영-아파트투입률-아파트목록
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptAddrList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1853_l.jsp";
                break;


                //직원검색
            case SSBrmgrWBMapping.BRMGR_1860:
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1860_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1868:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectBoempList(req, res);
//                nextPage = "/jsp/ss/account/sl_account_1168_l.jsp";
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1868_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1870:
                wb1800 = new SSBrmgr1800WB();
                wb1800.accessThrw(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1870_a.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1880: //지국경영-아파트투입률-매체,약어목록
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectMediyList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1880_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1881: //지국경영-투입율조사-현황검색-아파트명(목록)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1881_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1885: //지국경영-투입율조사-현황검색-아파트 투입율조사내역 상세조회 팝업 초기화면
//                wb1800 = new SSBrmgr1800WB();
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1885_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1886: //지국경영-투입율조사-현황검색-아파트 투입율조사내역 상세조회 팝업 내용
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1886_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1890: //지국경영-아파트투입률-활동현황 등록 팝업 초기
                wb1800 = new SSBrmgr1800WB();
                wb1800.accessActMemo(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1890_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1891: //지국경영-아파트투입률-투입률계산
                wb1800 = new SSBrmgr1800WB();
                wb1800.calcThrwRate(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1891_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1895: //지국경영-아파트투입률-활동현황 등록 팝업 초기
                wb1800 = new SSBrmgr1800WB();
                wb1800.accessActMemo(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1895_a.jsp";
              break;

          case SSBrmgrWBMapping.BRMGR_1896: //지국경영-아파트투입률-활동현황 등록 팝업 초기
              wb1800 = new SSBrmgr1800WB();
              wb1800.accessActMemo(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1896_p.jsp";
              break;


          case SSBrmgrWBMapping.BRMGR_1897: //지국경영-아파트투입률-초기화면
              wb1700rdr = new SSReader1700WB();
              wb1700rdr.selectInitList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1897_a.jsp";
                break;

          case SSBrmgrWBMapping.BRMGR_1898: //지국경영-아파트투입률-초기화면
              wb1700rdr = new SSReader1700WB();
//              wb1700rdr.selectInitList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1898_a.jsp";
              break;

          case SSBrmgrWBMapping.BRMGR_1899: //지국경영-아파트투입률-초기화면
              wb1800 = new SSBrmgr1800WB();
              wb1800.selectResult(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1899_l.jsp";
              break;

          //주간조선 발송관리
          // 지국별발송처리 초기화면
           case SSBrmgrWBMapping.BRMGR_1900:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1901_a.jsp";
               break;
           // 지국별발송처리 리스트조회
           case SSBrmgrWBMapping.BRMGR_1906:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1906_l.jsp";
               break;
           // 지국별발송처리 발송방법별 상세조회
           case SSBrmgrWBMapping.BRMGR_1911:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectBoList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1911_l.jsp";
               break;
           // 지국별발송처리 리스트 출력
           case SSBrmgrWBMapping.BRMGR_1916:
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1916_t.jsp";
               break;
           // 지국별발송처리 리스트 스티커출력
           case SSBrmgrWBMapping.BRMGR_1921:
               wb1900 = new SSBrmgr1900WB();
               wb1900.printSticker(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1921_t.jsp";
               break;
           // 지국별발송처리 매체변경시 호수/일자 변경
           case SSBrmgrWBMapping.BRMGR_1926:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1926_s.jsp";
               break;
           // 지국별발송처리 리스트 출력
           case SSBrmgrWBMapping.BRMGR_1931:
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1931_t.jsp";
               break;
           // 지국별발송처리 지역변경시
           case SSBrmgrWBMapping.BRMGR_1936:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1936_l.jsp";
                break;

            //지국 독자 초기
           case SSBrmgrWBMapping.BRMGR_1951:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1951_s.jsp";
               break;

           //지국 독자 조회
           case SSBrmgrWBMapping.BRMGR_1956:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectBoReaderList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1956_l.jsp";
               break;

           //지국 독자 상세 조회
           case SSBrmgrWBMapping.BRMGR_1961:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectBoReaderDetail(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1961_s.jsp";
               break;

           //구독자 수정(수정버튼)
           case SSBrmgrWBMapping.BRMGR_1966:
               wb1900 = new SSBrmgr1900WB();
               wb1900.updateBoReaderInfo(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1966_u.jsp";
               break;

           //독자-독자조회 출력화면
           case SSBrmgrWBMapping.BRMGR_1971:
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1971_t.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2000:
        	   wb1000 = new SSBrmgr1000WB();
        	   wb1000.selectInitList(req, res);
//               wb2000.selectlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2000_a.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2010:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.campinfolist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2010_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2020:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.selectlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2020_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2050:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.selectaptlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2050_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2055:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.updateaptlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2055_u.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2058:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.aptlistinit1(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2058_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2059:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.aptlistinit(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2059_l.jsp";
               break;
/*
        // 입주아파트현황
        case SSBrmgrWBMapping.BRMGR_1900: //지국경영-입주아파트현황-입주확장조회 초기화면
             wb1700rdr = new SSReader1700WB();
             wb1700rdr.selectInitList(req, res);
             nextPage = "/jsp/ss/brmgr/ss_brmgr_1900_a.jsp";
             break;

        case SSBrmgrWBMapping.BRMGR_1910: //지국경영-입주아파트현황-입주확장목록
             wb1900 = new SSBrmgr1900WB();
             wb1900.selectMoveinExtnList(req, res);
             nextPage = "/jsp/ss/brmgr/ss_brmgr_1910_l.jsp";
             break;

         case SSBrmgrWBMapping.BRMGR_1915: //지국경영-입주아파트현황-입주확장목록-엑셀저장
              wb1900 = new SSBrmgr1900WB();
              wb1900.selectMoveinExtnListPrint(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1915_p.jsp";
             break;

         // 입주아파트 초기화면
         case SSBrmgrWBMapping.BRMGR_1920: //지국경영-입주아파트현황-입주아파트-초기화면
              wb1700rdr = new SSReader1700WB();
              wb1700rdr.selectInitList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1920_a.jsp";
              break;

         // 입주아파트 목록조회
         case SSBrmgrWBMapping.BRMGR_1930: //지국경영-입주아파트현황-입주아파트조회
              wb1900 = new SSBrmgr1900WB();
              wb1900.selectMoveinAptList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1930_l.jsp";
              break;

        // 입주아파트 목록 엑셀저장
          case SSBrmgrWBMapping.BRMGR_1935: //지국경영-입주아파트현황-입주아파트 엑셀저장
              wb1900 = new SSBrmgr1900WB();
              wb1900.selectMoveinAptPrint(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1935_p.jsp";
              break;
*/
/*=======================================================*/
/*
            case SSBrmgrWBMapping.BRMGR_1815: //지국경영-아파트투입률-목록(투입률)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwrtList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1815_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1820: //지국경영-아파트투입률-상세(투입률)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwrtDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1820_s.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1825: //지국경영-아파트투입률-등록(투입률)
                wb1800 = new SSBrmgr1800WB();
                wb1800.insertThrwrt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1825_i.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1830: //지국경영-아파트투입률-수정(투입률)
                wb1800 = new SSBrmgr1800WB();
                wb1800.updateThrwrt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1830_u.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1835: //지국경영-아파트투입률-삭제(투입률)
                wb1800 = new SSBrmgr1800WB();
                wb1800.deleteThrwrt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1835_d.jsp";
                break;
*/
           case SSBrmgrWBMapping.BRMGR_2070: //지국경영-지국부수현황-초기화면
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectInitList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2070_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2075: //지국경영-지국부수현황-조회(리스트)
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectBoqtypcondList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2075_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2076: //지국경영-지국부수현황-조회(엑셀)
               wb1000 = new SSBrmgr1000WB();
               wb1000.selectBoqtypcondEXCEL(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2076_p.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2077: //지국경영-지국부수현황-조회(상세)
               wb1000 = new SSBrmgr1000WB();
               wb1000.selectBoqtypcondDetailList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2077_s.jsp";
               break;

           /*case SSBrmgrWBMapping.BRMGR_2078:
        	   System.out.println("2078servlet");
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratio(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2078_l.jsp";
               break;
           */
           case SSBrmgrWBMapping.BRMGR_2078:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratio(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2079_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2080:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAbcworkchg(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2080_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2081:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratiodtl(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2081_l.jsp";
               break;


           case SSBrmgrWBMapping.BRMGR_2082:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratio(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2082_p.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2083:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAbcworkchg(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2082_p.jsp";
               break;

            // 스포츠부수현황
           case SSBrmgrWBMapping.BRMGR_2100: //지국관리-대행지국관리-초기화면
               wb2100 = new SSBrmgr2100WB();
               wb2100.initBoProxy(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2100_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2110: //지국관리-대행지국관리-조
               wb2100 = new SSBrmgr2100WB();
               wb2100.selectBoProxyList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2110_l.jsp";
               break;

           //전략센터구분 관리
           case SSBrmgrWBMapping.BRMGR_2200:
               wb2200 = new SSBrmgr2200WB();
               wb2200.initBrmgr2200(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2200_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2210:
               wb2200 = new SSBrmgr2200WB();
               wb2200.selectBrmgr2210(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2210_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2220:
               wb2200 = new SSBrmgr2200WB();
               wb2200.saveBrmgr2220(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2220_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2230:
               wb2200 = new SSBrmgr2200WB();
               wb2200.createBrmgr2230(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2230_u.jsp";
               break;

           //평가기준 관리
           case SSBrmgrWBMapping.BRMGR_2300:
               wb2300 = new SSBrmgr2300WB();
               wb2300.initBrmgr2300(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2300_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2310:
               wb2300 = new SSBrmgr2300WB();
               wb2300.selectBrmgr2310(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2310_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2320:
               wb2300 = new SSBrmgr2300WB();
               wb2300.saveBrmgr2320(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2320_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2330:
               wb2300 = new SSBrmgr2300WB();
               wb2300.createBrmgr2330(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2330_u.jsp";
               break;

           //감액센터 등록 및 조회
           case SSBrmgrWBMapping.BRMGR_2400:
               wb2400 = new SSBrmgr2400WB();
               wb2400.initBrmgr2400(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2400_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2410:
               wb2400 = new SSBrmgr2400WB();
               wb2400.selectBrmgr2410(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2410_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2420:
               wb2400 = new SSBrmgr2400WB();
               wb2400.saveBrmgr2420(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2420_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2430:
               wb2400 = new SSBrmgr2400WB();
               wb2400.createBrmgr2430(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2430_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2440:
               wb2400 = new SSBrmgr2400WB();
               wb2400.selectBrmgr2440(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2440_l.jsp";
               break;
           //센터 종합정보관리
           case SSBrmgrWBMapping.BRMGR_2500:
               wb2500 = new SSBrmgr2500WB();
               wb2500.initBrmgr2500(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2500_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2510:
               wb2500 = new SSBrmgr2500WB();
               wb2500.selectBrmgr2510(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2510_l.jsp";
               break;
           //센터 모드 변경
           case SSBrmgrWBMapping.BRMGR_2600:
               wb2600 = new SSBrmgr2600WB();
               wb2600.initBrmgr2600(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2600_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2610:
               wb2600 = new SSBrmgr2600WB();
               wb2600.selectBrmgr2610(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2610_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2620:
               wb2600 = new SSBrmgr2600WB();
               wb2600.saveBrmgr2620(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2620_u.jsp";
               break;
             //평가점수설정
           case SSBrmgrWBMapping.BRMGR_2700:
               wb2700 = new SSBrmgr2700WB();
               wb2700.initBrmgr2700(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2700_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2710:
               wb2700 = new SSBrmgr2700WB();
               wb2700.selectBrmgr2710(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2710_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2720:
               wb2700 = new SSBrmgr2700WB();
               wb2700.selectBrmgr2720(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2720_s.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2730:
               wb2700 = new SSBrmgr2700WB();
               wb2700.updateBrmgr2730(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2730_u.jsp";
               break;

           //센터공사지원
           case SSBrmgrWBMapping.BRMGR_2850:
        	   	wb2800 = new SSBrmgr2800WB();
        	   	wb2800.ss_sls_brmgr_2850_m(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_2850_m.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_2851:
				wb2800 = new SSBrmgr2800WB();
				wb2800.ss_sls_brmgr_2851_l(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_2851_l.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_2852:
				wb2800 = new SSBrmgr2800WB();
				wb2800.ss_sls_brmgr_2852_s(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_2852_s.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3000:
				wb3000 = new SSBrmgr3000WB();
				wb3000.initBrmgr3000(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3000_m.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3010:
				wb3000 = new SSBrmgr3000WB();
				wb3000.selectBrmgr3010(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3010_l.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3020:
				wb3000 = new SSBrmgr3000WB();
				wb3000.createBrmgr3020(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3020_i.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3030:
				wb3000 = new SSBrmgr3000WB();
				wb3000.updateBrmgr3030(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3030_u.jsp";
				break;


/*******************************************모바일용******************************************************************/
           //센터관리-투입률조사-현황등록
           case SSBrmgrWBMapping.BRMGR_11810: //아파트주소코드리스트 =commun_12600(agency)_모바일용
             wb11800 = new SSBrmgr11800WB();
             wb11800.mo_selectThrwList(req, res);
             nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11810_a.jsp";
             break;
           case SSBrmgrWBMapping.BRMGR_11820: //아파트동리스트 =basic_11430(agency)_모바일용
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectDtladdrList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11820_l.jsp";
        	   break;
           case SSBrmgrWBMapping.BRMGR_11830: //배달카드(해당센터의 아파트 구독현황 조회) =commun_12635(agency)_모바일용
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectAptdlvList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11830_l.jsp";
        	   break;

        	 //투입률조사
           case SSBrmgrWBMapping.BRMGR_11850: //아파트형태리스트 및 투입률리스트 =commun_12631(agency)_모바일용
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectAptrchList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11850_l.jsp";
        	   break;
           case SSBrmgrWBMapping.BRMGR_11870: //투입률조사 저장 =commun_12651(agency)_모바일용
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_accessThrw(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11870_i.jsp";
        	   break;

           case SSBrmgrWBMapping.BRMGR_11880: //아파트정보 및 매체,약어리스트 =commun_12632(agency)_모바일용
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectAptinfoList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11880_l.jsp";
        	   break;
           case SSBrmgrWBMapping.BRMGR_11890: //센터관리-투입률조사-현황검색_모바일용
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectThrwResult(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11890_l.jsp";
        	   break;


               //센터 종합정보관리
               case SSBrmgrWBMapping.BRMGR_12510: //확장부수_모바일용
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2510(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12510_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12511: //부수현황_모바일용
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2511(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12511_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12512: //매출_모바일용
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2512(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12512_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12513: //구독료수금_모바일용
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2513(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12513_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12514: //전단매출기타_모바일용
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2514(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12514_l.jsp";
                   break;


            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
