/***************************************************************************************************
 * 파일명 : PSShareServlet.java
 * 기능 : 정보공유 일정 이벤트 분기
 * 작성일자 : 2004-02-20
 * 작성자 : 전현표
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.share.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.common.servlet.ChosunServlet;
import chosun.ciis.ps.pbs.share.servlet.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;
import chosun.ciis.ps.pbs.share.wb.*;
import chosun.ciis.ps.pbs.common.servlet.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.rec.*;
import chosun.ciis.ps.pbs.common.wb.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class PSShareServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/share/";
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {

        String nextPage = null;

        PSShare1101WB wb1101 = null;
        PSShare1201WB wb1201 = null;
        PSShare1301WB wb1301 = null;

        PSShare1601WB wb1601 = null;
        PSShare1801WB wb1801 = null;

//        PSShare1401WB wb1401 = null;
//        PSShare1501WB wb1501 = null;

        switch (pid) {

            // 정보공유-일정
            case PSShareWBMapping.SHARE_1101: //정보공유-일정-초기화면
                wb1101 = new PSShare1101WB();
                nextPage = "/jsp/ps/share/ps_share_1101_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1106: //정보공유-일정-조회(리스트)
                wb1101 = new PSShare1101WB();
                wb1101.selectTacomScheList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1106_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1111: //정보공유-일정-상세보기
                wb1101 = new PSShare1101WB();
                wb1101.selectTacomScheDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1111_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1116: //정보공유-일정-저장(등록)
                wb1101 = new PSShare1101WB();
                wb1101.accessTacomSche(req, res);
                nextPage = "/jsp/ps/share/ps_share_1116_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1121: //정보공유-일정-저장(수정)
                wb1101 = new PSShare1101WB();
                wb1101.accessTacomSche(req, res);
                nextPage = "/jsp/ps/share/ps_share_1121_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1126: //정보공유-일정-삭제
                wb1101 = new PSShare1101WB();
                wb1101.accessTacomSche(req, res);
                nextPage = "/jsp/ps/share/ps_share_1126_d.jsp";
                break;

                //정보공유-게시판-공지사항
            case PSShareWBMapping.SHARE_1201: //정보공유-게시판-공지사항-조회(리스트)
                wb1201 = new PSShare1201WB();
                wb1201.selectInitList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1201_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1206: //정보공유-게시판-공지사항-조회(검색)
                wb1201 = new PSShare1201WB();
                wb1201.selectSrchList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1206_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1211: //정보공유-게시판-공지사항-등록화면
                wb1201 = new PSShare1201WB();
                wb1201.selectCombo(req, res);
//				wb1201.writeInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1211_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1216: //정보공유-게시판-공지사항-등록
                wb1201 = new PSShare1201WB();
                try {
                    wb1201.insertInfoexg(req, res);
                } catch (IOException ex) {} catch (AppException ex) {}
                nextPage = "/jsp/ps/share/ps_share_1216_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1221: //정보공유-게시판-공지사항-상세보기
                wb1201 = new PSShare1201WB();
                wb1201.selectCombo(req, res);
                wb1201.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1221_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1226: //정보공유-게시판-공지사항-수정
                wb1201 = new PSShare1201WB();
                wb1201.updateInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1226_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1231: //정보공유-게시판-공지사항-삭제
                wb1201 = new PSShare1201WB();
                wb1201.deleteInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1231_d.jsp";
                break;
            case PSShareWBMapping.SHARE_1236: //정보공유-게시판-공지사항-추천
                wb1201 = new PSShare1201WB();
                wb1201.recomInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1236_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1241: //정보공유-게시판-공지사항-다운로드
                wb1201 = new PSShare1201WB();
                wb1201.dwloadInfoexg(req, res);
                nextPage = "/jsp/ps/common/download.jsp";
                break;

                //정보공유-게시판-판매국게시판
            case PSShareWBMapping.SHARE_1301: //정보공유-게시판-판매국게시판-조회(리스트)
                wb1301 = new PSShare1301WB();
                wb1301.selectInitList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1301_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1306: //정보공유-게시판-판매국게시판-조회(검색)
                wb1301 = new PSShare1301WB();
                wb1301.selectSrchList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1306_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1311: //정보공유-게시판-판매국게시판-등록화면
                wb1301 = new PSShare1301WB();
                wb1301.writeInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1311_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1316: //정보공유-게시판-판매국게시판-등록
                wb1301 = new PSShare1301WB();
                wb1301.insertInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1316_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1321: //정보공유-게시판-판매국게시판-상세보기
                wb1301 = new PSShare1301WB();
                wb1301.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1321_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1326: //정보공유-게시판-판매국게시판-수정
                wb1301 = new PSShare1301WB();
                wb1301.updateInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1326_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1331: //정보공유-게시판-판매국게시판-삭제
                wb1301 = new PSShare1301WB();
                wb1301.deleteInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1331_d.jsp";
                break;
            case PSShareWBMapping.SHARE_1336: //정보공유-게시판-판매국게시판-추천
                wb1301 = new PSShare1301WB();
                wb1301.recomInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1336_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1341: //정보공유-게시판-판매국게시판-답변화면
                wb1301 = new PSShare1301WB();
                wb1301.answerInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1341_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1346: //정보공유-게시판-판매국게시판-답변
                wb1301 = new PSShare1301WB();
                wb1301.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1346_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1351: //정보공유-게시판-판매국게시판-다운로드
                wb1301 = new PSShare1301WB();
                wb1301.dwloadInfoexg(req, res);
                nextPage = "/jsp/ps/common/download.jsp";
                break;

                //정보공유-달력
            case PSShareWBMapping.SHARE_1601: //정보공유-달력
                wb1601 = new PSShare1601WB();
                wb1601.selectMonthScheList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1601_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1606: //정보공유-상세
                wb1601 = new PSShare1601WB();
                wb1601.selectDayScheDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1606_s.jsp";
                break;

                //정보공유-게시판-공지사항
            case PSShareWBMapping.SHARE_1801: //정보공유-게시판-공지사항-조회(리스트)
                wb1801 = new PSShare1801WB();
                wb1801.selectInitList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1801_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1806: //정보공유-게시판-공지사항-상세보기
                wb1801 = new PSShare1801WB();
                wb1801.selectCombo(req, res);
                wb1801.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1806_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1811: //정보공유-게시판-공지사항-다운로드
                wb1801 = new PSShare1801WB();
                wb1801.dwloadInfoexg(req, res);
                nextPage = "/jsp/ps/common/download.jsp";
                break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));

        }
        return nextPage;
    }
}