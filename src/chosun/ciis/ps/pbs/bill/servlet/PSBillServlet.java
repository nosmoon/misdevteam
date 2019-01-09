/***************************************************************************************************
 * 파일명   : PSBillServlet.java
 * 기능     : 수금 대표 서블릿
 * 작성일자 : 2003-11-28
 * 작성자   : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.common.wb.*;
import chosun.ciis.ps.pbs.bill.wb.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * 수금메뉴 대표 서블릿
 */

public class PSBillServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/bill/";
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ps/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        } catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * PSBillWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {
        /*
         selectCodeList         공통코드조회
         selectSeprrecptList    개별입금리스트
         accessSeprrcpm         개별입금 입력,수정,삭제
         selectReaderDetail     독자 상세 정보
         selectLumprcpmList     지로 수납 리스트
         selectLumprcpmDetail   지로 수납 상세 리스트
         selectNonrcpmList      비정상입금 리스트
         accessNonrcpm          비정상입금 수정,삭제,입력
         */
        String nextPage = null;
        PSBill1101WB wb1101 = null;
        PSBill1201WB wb1201 = null;
        PSBill1301WB wb1301 = null;
        PSBill1401WB wb1401 = null;
        PSBill1501WB wb1501 = null;
        PSBill1701WB wb1701 = null;
        PSBill1801WB wb1801 = null;
        PSBill1901WB wb1901 = null;

        switch (pid) {
            //개별입금 초기화면
            case PSBillWBMapping.PSBILL_1101 :
                wb1101 = new PSBill1101WB();
                wb1101.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1101_a.jsp";
                break;
            //개별입금 리스트
            case PSBillWBMapping.PSBILL_1106 :
                wb1101 = new PSBill1101WB();
                wb1101.selectSeprrecptList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1106_l.jsp";
                break;
            //개별입금 입력
            case PSBillWBMapping.PSBILL_1111 :
                wb1101 = new PSBill1101WB();
                wb1101.accessSeprrcpm(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1111_i.jsp";
                break;
            //개별입금 수정
            case PSBillWBMapping.PSBILL_1116 :
                wb1101 = new PSBill1101WB();
                wb1101.accessSeprrcpm(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1116_u.jsp";
                break;
            //개별입금 삭제
            case PSBillWBMapping.PSBILL_1121 :
                wb1101 = new PSBill1101WB();
                wb1101.accessSeprrcpm(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1121_d.jsp";
                break;
            //개별입금 출력
            case PSBillWBMapping.PSBILL_1126 :
                nextPage = "/jsp/ps/bill/ps_bil_1126_t.jsp";
                break;
            //일괄입금 초기화면
            case PSBillWBMapping.PSBILL_1201 :
                wb1201 = new PSBill1201WB();
                wb1201.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1201_a.jsp";
                break;
            //일괄입금 검색
            case PSBillWBMapping.PSBILL_1206:
                wb1201 = new PSBill1201WB();
                wb1201.selectLumprcpmList(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1206_l.jsp";
                break;
            //일괄입금 상세 목록
            case PSBillWBMapping.PSBILL_1211:
                wb1201 = new PSBill1201WB();
                wb1201.selectLumprcpmDetail(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1211_l.jsp";
                break;
                //일괄입금 상세 목록 출력
            case PSBillWBMapping.PSBILL_1216:
                nextPage = "/jsp/ps/bill/ps_bil_1216_t.jsp";
                break;
            //비정상 입금 초기 화면
            case PSBillWBMapping.PSBILL_1301:
                wb1301 = new PSBill1301WB();
                wb1301.selectCodeList(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1301_a.jsp";
                break;
            //비정상 입금 리스트
            case PSBillWBMapping.PSBILL_1306:
                wb1301 = new PSBill1301WB();
                wb1301.selectNonrcpmList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1306_l.jsp";
                break;
            //비정상 입금 저장
            case PSBillWBMapping.PSBILL_1311:
                wb1301 = new PSBill1301WB();
                wb1301.accessNonrcpm(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1311_u.jsp";
                break;
            //비정상 입금 리스트 출력
            case PSBillWBMapping.PSBILL_1316:
                nextPage = "/jsp/ps/bill/ps_bil_1316_t.jsp";
                break;
            //초과입금처리 초기화면
            case PSBillWBMapping.PSBILL_1401:
                wb1401 = new PSBill1401WB();
                wb1401.selectCombolist(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1401_a.jsp";
                break;
            //초과입금처리 리스트조회
            case PSBillWBMapping.PSBILL_1406:
                wb1401 = new PSBill1401WB();
                wb1401.selectList(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1406_l.jsp";
                break;
            //초과입금처리 신규입력
            case PSBillWBMapping.PSBILL_1411:
                wb1401 = new PSBill1401WB();
                wb1401.aceessExcsamt(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1411_i.jsp";
                break;
            //초과입금처리 삭제
            case PSBillWBMapping.PSBILL_1421:
                wb1401 = new PSBill1401WB();
                wb1401.aceessExcsamt(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1421_d.jsp";
                break;
            //초과입금처리 출력
            case PSBillWBMapping.PSBILL_1426:
                nextPage = "/jsp/ps/bill/ps_bil_1426_t.jsp";
                break;
            //초과입금처리 단일 독자정보 검색
            case PSBillWBMapping.PSBILL_1431:
                wb1401 = new PSBill1401WB();
                wb1401.selectRdrinfoPart(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1431_s.jsp";
                break;

            // 지로자동이체신청-초기화면
            case PSBillWBMapping.PSBILL_1501:
                wb1501 = new PSBill1501WB();
                wb1501.initAutoShftAplc(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1501_a.jsp";
                break;
             // 카드자동이체신청-초기화면
            case PSBillWBMapping.PSBILL_1506:
                wb1501 = new PSBill1501WB();
                wb1501.initAutoShftAplc(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1506_a.jsp";
                break;
            // 카드인증
            case PSBillWBMapping.PSBILL_1511:
                nextPage = "/jsp/ps/bill/ps_bil_1511_a.jsp";
                break;
             // 지로-카드 자동이체신청-등록
            case PSBillWBMapping.PSBILL_1516:
                wb1501 = new PSBill1501WB();
                wb1501.insertAutoshftAplc(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1516_a.jsp";
                break;
            // 지로-독자리스트 조회
           case PSBillWBMapping.PSBILL_1521:
               wb1501 = new PSBill1501WB();
               wb1501.selectPbrdrList(req, res);
               nextPage = "/jsp/ps/bill/ps_bil_1521_l.jsp";
               break;


            //자동이체신청 목록조회화면 초기화면
            case PSBillWBMapping.PSBILL_1701 :
                wb1701 = new PSBill1701WB();
                wb1701.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1701_a.jsp";
                break;
            //자동이체신청 목록조회
            case PSBillWBMapping.PSBILL_1706 :
                wb1701 = new PSBill1701WB();
                wb1701.selectAplcList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1706_l.jsp";
                break;
            //자동이체신청 목록저장
            case PSBillWBMapping.PSBILL_1711 :
                wb1701 = new PSBill1701WB();
                wb1701.updateAplc(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1711_u.jsp";
                break;
            //자동이체신청 상세조회
            case PSBillWBMapping.PSBILL_1716 :
                wb1701 = new PSBill1701WB();
                wb1701.selectAplcDetail(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1716_s.jsp";
                break;
            //자동이체신청 상세저장
            case PSBillWBMapping.PSBILL_1726 :
                wb1701 = new PSBill1701WB();
                wb1701.updateAplcInfo(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1726_u.jsp";
                break;

            //자동이체청구확인 초기화면
            case PSBillWBMapping.PSBILL_1801 :
                wb1101 = new PSBill1101WB();
                wb1101.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1801_a.jsp";
                break;
            //자동이체청구확인 검색
            case PSBillWBMapping.PSBILL_1806 :
                wb1801 = new PSBill1801WB();
                wb1801.selectPlanList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1806_l.jsp";
                break;
            //자동이체청구확인 출력
            case PSBillWBMapping.PSBILL_1811 :
                nextPage = "/jsp/ps/bill/ps_bil_1811_t.jsp";
                break;

            //자동이체청구결과 초기화면
            case PSBillWBMapping.PSBILL_1901 :
                wb1701 = new PSBill1701WB();
                wb1701.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1901_a.jsp";
                break;
            //자동이체청구결과 요약조회
            case PSBillWBMapping.PSBILL_1906 :
                wb1901 = new PSBill1901WB();
                wb1901.selectClamSsum(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1906_l.jsp";
                break;
            //자동이체청구결과 상세조회
            case PSBillWBMapping.PSBILL_1911 :
                wb1901 = new PSBill1901WB();
                wb1901.selectClamOcomList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1911_l.jsp";
                break;
            //자동이체청구결과 상세출력
            case PSBillWBMapping.PSBILL_1916 :
                nextPage = "/jsp/ps/bill/ps_bil_1916_t.jsp";
                break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
