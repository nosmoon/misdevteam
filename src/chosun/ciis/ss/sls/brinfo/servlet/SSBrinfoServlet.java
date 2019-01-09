/***************************************************************************************************
 * 파일명 : SSBrinfoServlet.java
 * 기능 : 지국Info 서블릿
 * 작성일자 : 2004-01-26
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.wb.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class SSBrinfoServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/brinfo/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSBrinfoServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSBrinfoServlet : process : nextPage : " + nextPage);
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
     * SSBrinfoWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        SSBrinfo1000WB wb1000 = null; //지국Info-지국찾기
        SSBrinfo1100WB wb1100 = null; //지국Info-지국현황
        SSBrinfo1200WB wb1200 = null; //지국Info-지국장정보
        SSBrinfo1300WB wb1300 = null; //지국Info-지국조직현황
        SSBrinfo1400WB wb1400 = null; //지국Info-지국비품현황
        SSBrinfo1500WB wb1500 = null; //지국Info-전세지원금
        SSBrinfo1600WB wb1600 = null; //지국Info-발송노선
        SSReader1700WB wb1700rdr = null;

		/* 모바일관련 wb 따로 분리 장선희 */
        SSBrinfo11600WB wb11600 = null; //지국Info-발송노선_모바일용


        switch (pid) {
            // 지국찾기
            case SSBrinfoWBMapping.BRINFO_1000: //지국Info-지국찾기-초기화면
                wb1000 = new SSBrinfo1000WB();
                wb1000.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1000_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1010: //지국Info-지국찾기-목록
                wb1000 = new SSBrinfo1000WB();
                wb1000.selectBoSrchList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1010_l.jsp";
                break;
            // 지국찾기
            case SSBrinfoWBMapping.BRINFO_1050: //지국Info-지국우편번호-초기화면
                wb1000 = new SSBrinfo1000WB();
                wb1000.initBoZip(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1050_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1055: //지국Info-지국우편번호-목록
                wb1000 = new SSBrinfo1000WB();
                wb1000.selectBoZipList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1055_l.jsp";
                break;
            // 지국현황
            case SSBrinfoWBMapping.BRINFO_1100: //지국Info-지국현황-초기화면
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoinfoInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1100_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1110: //지국Info-지국현황-목록
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoinfoList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1110_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1120: //지국Info-지국현황-상세
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoinfoDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1120_s.jsp";
                break;

                // 지국계좌관리(실시간계좌이체)
            case SSBrinfoWBMapping.BRINFO_1150: //지국경영-
            	wb1100 = new SSBrinfo1100WB();
            	wb1100.selectBoAcctInit(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1150_a.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1155: //지국경영-계좌항목(실시간계좌이체) 조회
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoAcctList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1155_a.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1160: //지국경영-계좌항목(실시간계좌이체) 수정
                wb1100 = new SSBrinfo1100WB();
                wb1100.updateBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1170: //지국경영-계좌항목(실시간계좌이체) 삭제
                wb1100 = new SSBrinfo1100WB();
                wb1100.deleteBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1180: //지국경영-계좌항목(실시간계좌이체) 등록
                wb1100 = new SSBrinfo1100WB();
                wb1100.insertBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1190: //지국경영-계좌항목(실시간계좌이체) 히스토리조회 20150922 장선희
                System.out.println("1190");
            	wb1100 = new SSBrinfo1100WB();
                wb1100.histBoAcctList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1190_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1195: //지국경영-계좌항목(실시간계좌이체) 삭제
                wb1100 = new SSBrinfo1100WB();
                wb1100.cnfmBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            // 지국장정보
            case SSBrinfoWBMapping.BRINFO_1200: //지국Info-지국장정보-초기화면
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1200_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1210: //지국Info-지국장정보-목록
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectBoheadList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1210_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1220: //지국Info-지국장정보-상세
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectBoheadDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1220_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1225: //지국Info-지국장정보-사진
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectBoheadSajin(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1225_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1230: //지국Info-지국장정보-저장(수정)
                wb1200 = new SSBrinfo1200WB();
                wb1200.updateBohead(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1230_u.jsp";
                break;
            // 지국장정보-소견
           case SSBrinfoWBMapping.BRINFO_1240: //지국Info-지국장정보-지국장소견-목록
               wb1200 = new SSBrinfo1200WB();
               wb1200.selectBoheadIdeaList(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1240_l.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1250: //지국Info-지국장정보-지국장소견-상세
               wb1200 = new SSBrinfo1200WB();
               wb1200.selectBoheadIdeaDetail(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1250_s.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1260: //지국Info-지국장정보-지국장소견-등록
               wb1200 = new SSBrinfo1200WB();
               wb1200.accessBoheadIdea(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1260_i.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1270: //지국Info-지국장정보-지국장소견-수정
               wb1200 = new SSBrinfo1200WB();
               wb1200.accessBoheadIdea(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1270_u.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1280: //지국Info-지국장정보-지국장소견-삭제
               wb1200 = new SSBrinfo1200WB();
               wb1200.accessBoheadIdea(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1280_d.jsp";
               break;

            // 지국조직현황
            case SSBrinfoWBMapping.BRINFO_1300: //지국Info-지국조직현황-초기화면
                wb1300 = new SSBrinfo1300WB();
                wb1300.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1300_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1310: //지국Info-지국조직현황-목록
                wb1300 = new SSBrinfo1300WB();
                wb1300.selectBoempList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1310_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1315: //지국Info-지국조직현황-상세목록
                wb1300 = new SSBrinfo1300WB();
                wb1300.selectBoempDetailList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1315_p.jsp";
                break;

            // 지국비품현황
            case SSBrinfoWBMapping.BRINFO_1400: //지국Info-지국비품현황-현황-초기화면
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1400_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1410: //지국Info-지국비품현황-현황-목록
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectAsetList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1410_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1420: //지국Info-지국비품현황-상세-초기화면
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1420_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1425: //지국Info-지국비품현황-상세-목록
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectAsetDetailList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1425_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1430: //지국Info-지국비품현황-상세-상세
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectAsetDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1430_s.jsp";
                break;

            // 전세지원금현황
            case SSBrinfoWBMapping.BRINFO_1500: //지국Info-전세지원금현황
               wb1500 = new SSBrinfo1500WB();
               wb1500.selectBuseoList(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1500_a.jsp";
               break;
            case SSBrinfoWBMapping.BRINFO_1510: //지국Info-전세지원금현황-목록
               wb1500 = new SSBrinfo1500WB();
               wb1500.selectLeasamtList(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1510_l.jsp";
               break;
            case SSBrinfoWBMapping.BRINFO_1520: //지국Info-전세지원금현황-상세
               wb1500 = new SSBrinfo1500WB();
               wb1500.selectDetailView(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1520_s.jsp";
               break;
            case SSBrinfoWBMapping.BRINFO_1530: //지국Info-전세지원금현황 정보수정
               wb1500 = new SSBrinfo1500WB();
               wb1500.updateDetailView(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1530_i.jsp";
               break;

            // 발송노선
            case SSBrinfoWBMapping.BRINFO_1600: //지국Info-발송노선
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectAreaList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1600_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1610: //지국Info-발송노선(리스트)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectBsnsList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1610_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1650: //지국Info-발송노선 SMS(초기)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectAreaList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1650_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1660: //지국Info-발송노선 SMS(목록)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectSmsDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1660_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1670: //지국Info-발송노선 SMS(수정)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectSmsUpdate(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1670_u.jsp";
                break;

/*******************************************모바일용******************************************************************/

            case SSBrinfoWBMapping.BRINFO_11610: //지국Info-발송노선(리스트)_모바일용
                wb11600 = new SSBrinfo11600WB();
                wb11600.mo_selectBsnsList(req, res);
                nextPage = "/jsp/ss/brinfo/mo_ss_brinfo_11610_l.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_11615: //지국Info-발송노선(센터별 상세)_모바일용
                wb11600 = new SSBrinfo11600WB();
                wb11600.mo_selectBsnsDetail(req, res);
                nextPage = "/jsp/ss/brinfo/mo_ss_brinfo_11615_s.jsp";
                break;

           default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
