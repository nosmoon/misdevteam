/***************************************************************************************************
 * 파일명 : SSShareServlet.java
 * 기능 : 정보공유 일정 이벤트 분기
 * 작성일자 : 2003-10-30
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/
package chosun.ciis.ss.sls.share.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.servlet.ChosunServlet;
import chosun.ciis.ss.sls.share.servlet.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;
import chosun.ciis.ss.sls.share.wb.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;
import chosun.ciis.ss.sls.common.wb.*;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class SSShareServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/share/";
            iPid = extractPid(req, servletMappedUrl);

// import 제거할 것.

System.out.println("SSShareServlet : process : iPid : "+iPid);
            nextPage = executeWorker(req, res, iPid);
System.out.println("SSShareServlet : process : nextPage : "+nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            System.out.println("SSShareServlet : process : appException : "+ae.toString() + ae.getErrorMessage());
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SSSHAREWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,int pid) throws AppException {

        String nextPage = null;
        SSShare1000WB ssshare1000WB = null;
        SSShare1100WB ssshare1100WB = null;
        SSShare1200WB ssshare1200WB = null;
        SSShare1300WB ssshare1300WB = null;
        SSShare1400WB ssshare1400WB = null;
        SSShare1500WB ssshare1500WB = null;
        SSShare1600WB ssshare1600WB = null;
        SSShare1700WB ssshare1700WB = null;
        SSShare1800WB ssshare1800WB = null;
        SSShare1900WB ssshare1900WB = null;
        SSShare2000WB ssshare2000WB = null;
        SSShare2100WB ssshare2100WB = null;
        SSShare2200WB ssshare2200WB = null;

        // 모바일용
        SSShare11300WB ssshare11300WB = null;

        switch (pid) {
            // 정보공유-일정
            case SSShareWBMapping.SHARE_1000:	//정보공유-일정-초기화면
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1000_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1010:	//정보공유-일정-조회(리스트)
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.selectTacomScheList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1010_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1020:	//정보공유-일정-상세보기
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.selectTacomScheDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1020_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1030:	//정보공유-일정-저장(등록)
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.accessTacomSche(req, res);
                nextPage = "/jsp/ss/share/ss_share_1030_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1040:	//정보공유-일정-저장(수정)
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.accessTacomSche(req, res);
                nextPage = "/jsp/ss/share/ss_share_1040_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1050:	//정보공유-일정-삭제
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.accessTacomSche(req, res);
                nextPage = "/jsp/ss/share/ss_share_1050_d.jsp";
                break;
            //정보공유-타사발송부수
            case SSShareWBMapping.SHARE_1100:	//정보공유-타사발송부수-초기화면
                ssshare1100WB = new SSShare1100WB();
                nextPage = "/jsp/ss/share/ss_share_1100_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1110:	//정보공유-타사발송부수-조회(리스트)
                ssshare1100WB = new SSShare1100WB();
                ssshare1100WB.selectOthqtyList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1110_l.jsp";
                break;
            //정보공유-실시간공지
            case SSShareWBMapping.SHARE_1200:	//정보공유-실시간공지-지국공지-조회(리스트)
                ssshare1200WB = new SSShare1200WB();
                ssshare1200WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1200_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1201:	//정보공유-실시간공지-지국공지-조회(검색)
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1201_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1210:	//정보공유-실시간공지-지국공지-등록화면
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.writeAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1210_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1215:	//정보공유-실시간공지-지국공지-등록
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.insertAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1215_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1216:	//정보공유-실시간공지-지국공지-수정
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.updateAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1216_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1217:	//정보공유-실시간공지-지국공지-삭제
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.deleteAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1217_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1220:	//정보공유-실시간공지-지국공지-등록
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.selectSrchDtls(req, res);
                nextPage = "/jsp/ss/share/ss_share_1220_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1250:	//정보공유-실시간공지-판매국공지-등록화면
                ssshare1200WB = new SSShare1200WB();
                ssshare1200WB.writeAnncsls(req, res);
                nextPage = "/jsp/ss/share/ss_share_1250_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1251:	//정보공유-실시간공지-판매국공지-등록
                ssshare1200WB = new SSShare1200WB();
                ssshare1200WB.insertAnncsls(req, res);
                nextPage = "/jsp/ss/share/ss_share_1251_i.jsp";
                break;
            //정보공유-게시판-공지사항
            case SSShareWBMapping.SHARE_1300:	//정보공유-게시판-공지사항-조회(리스트)
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1300_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1301:	//정보공유-게시판-공지사항-조회(검색)
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1301_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1310:	//정보공유-게시판-공지사항-등록화면
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1310_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1315:	//정보공유-게시판-공지사항-등록
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1315_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1320:	//정보공유-게시판-공지사항-상세보기
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1320_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1330:	//정보공유-게시판-공지사항-수정
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1330_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1340:	//정보공유-게시판-공지사항-삭제
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1340_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1350:	//정보공유-게시판-공지사항-추천
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1350_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1360: //정보공유-게시판-공지사항-다운로드
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.dwloadInfoexg(req, res);
//20060608 이혁 수정
                nextPage = "/jsp/ss/common/download.jsp";

//20050708 김대섭 수정                nextPage = "/jsp/ss/common/download.jsp";
//                nextPage = "/jsp/ss/common/download2.jsp"; //20050708 김대섭 추가(파일생성 후 다운로드)
                break;
            //정보공유-게시판-판매국게시판
            case SSShareWBMapping.SHARE_1400: //정보공유-게시판-판매국게시판-조회(리스트)
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1400_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1401:	//정보공유-게시판-판매국게시판-조회(검색)
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1401_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1410:	//정보공유-게시판-판매국게시판-등록화면
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1410_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1415:	//정보공유-게시판-판매국게시판-등록
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1415_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1420:	//정보공유-게시판-판매국게시판-상세보기
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1420_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1430:	//정보공유-게시판-판매국게시판-수정
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1430_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1440:	//정보공유-게시판-판매국게시판-삭제
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1440_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1450:	//정보공유-게시판-판매국게시판-추천
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1450_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1460:	//정보공유-게시판-판매국게시판-답변화면
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1460_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1465:	//정보공유-게시판-판매국게시판-답변
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1465_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1470: //정보공유-게시판-판매국게시판-다운로드
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //정보공유-게시판-이슈게시판
            case SSShareWBMapping.SHARE_1500:	//정보공유-게시판-이슈게시판-조회(리스트)
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1500_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1501:	//정보공유-게시판-이슈게시판-조회(검색)
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1501_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1510:	//정보공유-게시판-이슈게시판-등록화면
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1510_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1515:	//정보공유-게시판-이슈게시판-등록
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1515_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1520:	//정보공유-게시판-이슈게시판-상세보기
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1520_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1530:	//정보공유-게시판-이슈게시판-수정
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1530_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1540:	//정보공유-게시판-이슈게시판-삭제
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1540_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1550:	//정보공유-게시판-이슈게시판-추천
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1550_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1560:	//정보공유-게시판-이슈게시판-답변화면
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1560_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1565:	//정보공유-게시판-이슈게시판-답변
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1565_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1570: //정보공유-게시판-이슈게시판-다운로드
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //정보공유-게시판-신문고게시판
            case SSShareWBMapping.SHARE_1600:	//정보공유-게시판-신문고게시판-조회(리스트)
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1600_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1601:	//정보공유-게시판-신문고게시판-조회(검색)
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1601_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1610: //정보공유-게시판-신문고게시판-등록화면
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1610_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1615:	//정보공유-게시판-신문고게시판-등록
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1615_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1620:	//정보공유-게시판-신문고게시판-상세보기
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1620_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1630:	//정보공유-게시판-신문고게시판-수정
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1630_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1640:	//정보공유-게시판-신문고게시판-삭제
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1640_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1650:	//정보공유-게시판-신문고게시판-추천
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1650_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1660:	//정보공유-게시판-신문고게시판-답변화면
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1660_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1665:	//정보공유-게시판-신문고게시판-답변
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1665_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1670: //정보공유-게시판-신문고게시판-다운로드
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //정보공유-게시판-기사평게시판
            case SSShareWBMapping.SHARE_1700:	//정보공유-게시판-기사평게시판-조회(리스트)
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1700_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1701: //정보공유-게시판-기사평게시판-조회(검색)
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1701_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1710:	//정보공유-게시판-기사평게시판-등록화면
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1710_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1715:	//정보공유-게시판-기사평게시판-등록
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1715_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1720:	//정보공유-게시판-기사평게시판-상세보기
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1720_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1730:	//정보공유-게시판-기사평게시판-수정
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1730_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1740:	//정보공유-게시판-기사평게시판-삭제
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1740_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1750:	//정보공유-게시판-기사평게시판-추천
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1750_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1760:	//정보공유-게시판-기사평게시판-답변화면
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1760_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1765:	//정보공유-게시판-기사평게시판-답변
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1765_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1770: //정보공유-게시판-신문고게시판-다운로드
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //정보공유-일지및보고서-일일업무일지
            case SSShareWBMapping.SHARE_1800:	//정보공유-일지및보고서-일일업무일지-조회(리스트)
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1800_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1801:	//정보공유-일지및보고서-일일업무일지-조회(검색)
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1801_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1810:	//정보공유-일지및보고서-일일업무일지-등록화면
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.writeJobrec(req, res);
                nextPage = "/jsp/ss/share/ss_share_1810_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1815:	//정보공유-일지및보고서-일일업무일지-등록
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.insertJobrec(req,res);
                nextPage = "/jsp/ss/share/ss_share_1815_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1820:	//정보공유-일지및보고서-일일업무일지-상세보기
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.selectJobrecDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1820_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1830:	//정보공유-일지및보고서-일일업무일지-수정
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.updateJobrec(req, res);
                nextPage = "/jsp/ss/share/ss_share_1830_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1840:	//정보공유-일지및보고서-일일업무일지-삭제
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.deleteJobrec(req, res);
                nextPage = "/jsp/ss/share/ss_share_1840_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1850: //정보공유-일지및보고서-일일업무일지-다운로드
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.dwloadJobrec(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //정보공유-일지및보고서-출장보고서
            case SSShareWBMapping.SHARE_1900:	//정보공유-일지및보고서-출장보고서-조회(리스트)
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1900_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1901:	//정보공유-일지및보고서-출장보고서-조회(검색)
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1901_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1910:	//정보공유-일지및보고서-출장보고서-등록화면
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.writeOutrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_1910_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1915:	//정보공유-일지및보고서-출장보고서-등록
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.insertOutrpt(req,res);
                nextPage = "/jsp/ss/share/ss_share_1915_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1920:	//정보공유-일지및보고서-출장보고서-상세보기
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.selectOutrptDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1920_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1930:	//정보공유-일지및보고서-출장보고서-수정
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.updateOutrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_1930_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1940:	//정보공유-일지및보고서-출장보고서-삭제
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.deleteOutrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_1940_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1950: //정보공유-일지및보고서-출장보고서-다운로드
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.dwloadOutrpt(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //정보공유-일지및보고서-새벽근무보고서
            case SSShareWBMapping.SHARE_2000:	//정보공유-일지및보고서-새벽근무보고서-조회(리스트)
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2000_a.jsp";
                break;
            case SSShareWBMapping.SHARE_2001:	//정보공유-일지및보고서-새벽근무보고서-조회(검색)
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2001_l.jsp";
                break;
            case SSShareWBMapping.SHARE_2010:	//정보공유-일지및보고서-새벽근무보고서-등록화면
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.writeDawnrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2010_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2015:	//정보공유-일지및보고서-새벽근무보고서-등록
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.insertDawnrpt(req,res);
                nextPage = "/jsp/ss/share/ss_share_2015_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2020:	//정보공유-일지및보고서-새벽근무보고서-상세보기
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.selectDawnrptDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2020_s.jsp";
                break;
            case SSShareWBMapping.SHARE_2030:	//정보공유-일지및보고서-새벽근무보고서-수정
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.updateDawnrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2030_u.jsp";
                break;
            case SSShareWBMapping.SHARE_2040:	//정보공유-일지및보고서-새벽근무보고서-삭제
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.deleteDawnrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2040_d.jsp";
                break;
            case SSShareWBMapping.SHARE_2050: //정보공유-일지및보고서-새벽근무보고서-다운로드
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.dwloadDawnrpt(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //정보공유-일지및보고서-타사동향보고
            case SSShareWBMapping.SHARE_2100:	//정보공유-일지및보고서-타사동향보고-조회(리스트)
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2100_a.jsp";
                break;
            case SSShareWBMapping.SHARE_2101:	//정보공유-일지및보고서-타사동향보고-조회(검색)
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2101_l.jsp";
                break;
            case SSShareWBMapping.SHARE_2110:	//정보공유-일지및보고서-타사동향보고-등록화면
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.writeOthrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2110_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2115:	//정보공유-일지및보고서-타사동향보고-등록
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.insertOthrpt(req,res);
                nextPage = "/jsp/ss/share/ss_share_2115_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2120:	//정보공유-일지및보고서-타사동향보고-상세보기
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.selectOthrptDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2120_s.jsp";
                break;
            case SSShareWBMapping.SHARE_2130:	//정보공유-일지및보고서-타사동향보고-수정
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.updateOthrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2130_u.jsp";
                break;
            case SSShareWBMapping.SHARE_2140:	//정보공유-일지및보고서-타사동향보고-삭제
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.deleteOthrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2140_d.jsp";
                break;
            case SSShareWBMapping.SHARE_2150: //정보공유-일지및보고서-타사동향보고-다운로드
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.dwloadOthrpt(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //판매국메인
            case SSShareWBMapping.SHARE_2200:	//판매국메인-초기화면
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectMainInit(req, res);
                nextPage = "/jsp/ss/share/ss_share_2200_a.jsp";
                break;
            case SSShareWBMapping.SHARE_2210: //판매국메인-달력-월별일정 조회
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectMonthScheList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2210_l.jsp";
                break;
            case SSShareWBMapping.SHARE_2212: //판매국메인-달력-일별일정 조회(팝업)
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectDayScheList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2212_p.jsp";
                break;
            case SSShareWBMapping.SHARE_2220: //판매국메인-공지사항-상세(팝업)
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectAnncDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2220_p.jsp";
                break;
            case SSShareWBMapping.SHARE_2222: //판매국메인-공지사항-다운로드
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.dwloadAnnc(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            case SSShareWBMapping.SHARE_2230: //판매국메인-실시간공지-상세(팝업)
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectAnncslsDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2230_p.jsp";
                break;
            case SSShareWBMapping.SHARE_2240: //판매국메인-초기화면-hidden
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectAnncslsList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2240_s.jsp";
                break;

/*******************************************모바일용******************************************************************/
            case SSShareWBMapping.SHARE_11301:	//정보공유-게시판-공지사항-조회(검색)
                ssshare11300WB = new SSShare11300WB();
                ssshare11300WB.mo_selectSrchList(req, res);
                nextPage = "/jsp/ss/share/mo_ss_share_11301_l.jsp";
                break;
            case SSShareWBMapping.SHARE_11302:	//정보공유-게시판-공지사항-조회(상세)/ agency/commun_11120 동일
                ssshare11300WB = new SSShare11300WB();
                ssshare11300WB.mo_selectSrchDetail(req, res);
                nextPage = "/jsp/ss/share/mo_ss_share_11302_s.jsp";
                break;
            case SSShareWBMapping.SHARE_11315:	//정보공유-게시판-공지사항-등록
                ssshare11300WB = new SSShare11300WB();
                ssshare11300WB.mo_insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/mo_ss_share_11315_i.jsp";
                break;

            default:
            throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
