/***************************************************************************************************
 * 파일명   : PSReaderServlet.java
 * 기능     : 불편접수등록 및 등록된 불편접수 내역 조회및 처리 서블릿
 * 작성일자 : 2003-11-20
 * 작성자   : 김건호
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.support.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.wb.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 불편접수메뉴 대표 서블릿
 */
public class PSSupportServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/support/";
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
     * PSSupportWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return String (forward할 nextPage)
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {
        String nextPage = null;
        PSSupport1101WB wb1101 = null;
        PSSupport1201WB wb1201 = null;
        PSSupport1301WB wb1301 = null;
        PSSupport1401WB wb1401 = null;

        switch (pid) {
            //불편접수 top메뉴
            case PSSupportWBMapping.PSSUPPORT_1000:
                nextPage = "/jsp/ps/support/ps_sppt_1000_m.jsp";
                break;
            //불편접수 sub메뉴
            case PSSupportWBMapping.PSSUPPORT_1006:
                nextPage = "/jsp/ps/support/ps_sppt_1006_s.jsp";
                break;
            //불편접수-초기화면
            case PSSupportWBMapping.PSSUPPORT_1011:
                nextPage = "/jsp/ps/support/ps_sppt_1011_f.jsp";
                break;
            //불편접수 초기
            case PSSupportWBMapping.PSSUPPORT_1101:
                wb1101 = new PSSupport1101WB();
                wb1101.selectCodeList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1101_s.jsp";
                break;
            //불편접수 독자검색
            case PSSupportWBMapping.PSSUPPORT_1106:
                wb1101 = new PSSupport1101WB();
                wb1101.selectRdrList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1106_p.jsp";
                break;
           //불편접수 등록
            case PSSupportWBMapping.PSSUPPORT_1111:
                wb1101 = new PSSupport1101WB();
                wb1101.insertDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1111_i.jsp";
                break;
            //불편접수 초기
            case PSSupportWBMapping.PSSUPPORT_1201:
                wb1101 = new PSSupport1101WB();
                wb1101.selectCodeList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1201_s.jsp";
                break;
            //불편접수 내역 조회
            case PSSupportWBMapping.PSSUPPORT_1206:
                wb1201 = new PSSupport1201WB();
                wb1201.selectRdrList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1206_l.jsp";
                break;
            //불편접수 확인 및 처리등록
            case PSSupportWBMapping.PSSUPPORT_1211:
                wb1201 = new PSSupport1201WB();
                wb1201.updateDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1211_u.jsp";
                break;
            //불편처리 상세내역보기
            case PSSupportWBMapping.PSSUPPORT_1216:
                wb1201 = new PSSupport1201WB();
                wb1201.selectDsctDetail(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1216_s.jsp";
                break;
            //불편처리 리스트출력
            case PSSupportWBMapping.PSSUPPORT_1221:
                nextPage = "/jsp/ps/support/ps_sppt_1221_t.jsp";
                break;
            //불편접수 확인 및 지사배정
            case PSSupportWBMapping.PSSUPPORT_1226:
                wb1201 = new PSSupport1201WB();
                wb1201.updateBranchDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1226_u.jsp";
                break;

            //이사신청 초기
            case PSSupportWBMapping.PSSUPPORT_1301:
                nextPage = "/jsp/ps/support/ps_sppt_1301_s.jsp";
                break;
            //이사신청 내역 조회
            case PSSupportWBMapping.PSSUPPORT_1306:
                wb1301 = new PSSupport1301WB();
                wb1301.selectMoveList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1306_l.jsp";
                break;
            //이사신청 지사배정
            case PSSupportWBMapping.PSSUPPORT_1311:
                wb1301 = new PSSupport1301WB();
                wb1301.updateBranchMove(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1311_u.jsp";
                break;

            ///이사신청 상세내역보기
            case PSSupportWBMapping.PSSUPPORT_1316:
                wb1301 = new PSSupport1301WB();
                wb1301.selectMoveDetail(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1316_s.jsp";
                break;
            ///이사신청 리스트출력
            case PSSupportWBMapping.PSSUPPORT_1321:
                nextPage = "/jsp/ps/support/ps_sppt_1321_t.jsp";
                break;
/*
            //이사신청 확인 및 처리등록
            case PSSupportWBMapping.PSSUPPORT_1226:
                wb1201 = new PSSupport1201WB();
                wb1301.updateDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1226_u.jsp";
                break;
*/

            //현금영수증 신청 초기
            case PSSupportWBMapping.PSSUPPORT_1401:
                wb1401 = new PSSupport1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1401_a.jsp";
                break;
            //현금영수증 신청 조회
            case PSSupportWBMapping.PSSUPPORT_1406:
                wb1401 = new PSSupport1401WB();
                wb1401.selectCashrcptList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1406_l.jsp";
                break;
            //현금영수증 신청 출력
            case PSSupportWBMapping.PSSUPPORT_1411:
                nextPage = "/jsp/ps/support/ps_sppt_1411_t.jsp";
                break;

            ///현금영수증 상세조회/입력/삭제
            case PSSupportWBMapping.PSSUPPORT_1416:
                wb1401 = new PSSupport1401WB();
                wb1401.accessCashrcpt(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1416_a.jsp";
                break;
            ///현금영수증 상세조회/입력/삭제
            case PSSupportWBMapping.PSSUPPORT_1421:
                wb1401 = new PSSupport1401WB();
                wb1401.selectCashrcptDetail(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1421_s.jsp";
                break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}