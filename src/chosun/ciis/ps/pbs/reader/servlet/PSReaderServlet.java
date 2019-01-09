/***************************************************************************************************
 * 파일명   : PSReaderServlet.java
 * 기능     : 독자-중재요청 서블릿
 * 작성일자 : 2004-02-20
 * 작성자   : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
  * 수정내역 : 수금입력목록 추가
  * 수정자   : 김재일
  * 수정일자 : 2008-07-14
 * 백업     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.reader.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.wb.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-독자메뉴 대표 서블릿
 */
public class PSReaderServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/reader/";
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ps/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        } catch (Exception e){
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * PBReaderWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        PSReader1101WB  wb1101 = null;
        PSReader1201WB  wb1201 = null;
        PSReader1301WB  wb1301 = null;
        PSReader1401WB  wb1401 = null;
        PSReader1501WB  wb1501 = null;
        PSReader1601WB  wb1601 = null;
        PSReader1701WB  wb1701 = null;
        PSReader1801WB  wb1801 = null;
        PSReader1901WB  wb1901 = null;

        switch (pid) {
            //확장독자관리 초기
            case PSReaderWBMapping.PSREADER_1101:
                wb1101 = new PSReader1101WB();
                wb1101.selectRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1101_a.jsp";
                break;
            //확장독자관리 상세조회 및 RESET
            case PSReaderWBMapping.PSREADER_1106:
                wb1101 = new PSReader1101WB();
                wb1101.selectRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1106_s.jsp";
                break;
            //확장독자관리 입력
            case PSReaderWBMapping.PSREADER_1111:
                wb1101 = new PSReader1101WB();
                wb1101.insertRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1111_i.jsp";
                break;
            //확장독자관리 수정
            case PSReaderWBMapping.PSREADER_1116:
                wb1101 = new PSReader1101WB();
                wb1101.updateRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1116_u.jsp";
                break;
            //확장독자관리 삭제
            case PSReaderWBMapping.PSREADER_1121:
                wb1101 = new PSReader1101WB();
                wb1101.deleteRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1121_d.jsp";
                break;
            //확장독자관리 확장독자내역 초기
            case PSReaderWBMapping.PSREADER_1126:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1126_l.jsp";
                break;
            //확장독자관리 확장독자내역 검색
            case PSReaderWBMapping.PSREADER_1131:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1131_l.jsp";
                break;

            //확장독자내역 초기
            case PSReaderWBMapping.PSREADER_1201:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1201_l.jsp";
                break;
            //확장독자내역 검색
            case PSReaderWBMapping.PSREADER_1206:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1206_l.jsp";
                break;
            //확장독자리스트 출력
            case PSReaderWBMapping.PSREADER_1211:
                nextPage = "/jsp/ps/reader/ps_rdr_1211_t.jsp";
                break;
            //확장독자집계 출력
            case PSReaderWBMapping.PSREADER_1216:
                nextPage = "/jsp/ps/reader/ps_rdr_1216_t.jsp";
                break;                
            //확장자정보 출력
            case PSReaderWBMapping.PSREADER_1221:
                nextPage = "/jsp/ps/reader/ps_rdr_1221_t.jsp";
                break;
                
            //독자-중재요청독자 초기
            case PSReaderWBMapping.PSREADER_1301:
                wb1301 = new PSReader1301WB();
                wb1301.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1301_s.jsp";
                break;
            //독자-중재요청독자 조회리스트
            case PSReaderWBMapping.PSREADER_1306:
                wb1301 = new PSReader1301WB();
                wb1301.selectArbtList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1306_l.jsp";
                break;
            //독자-중재요청독자 수정처리
            case PSReaderWBMapping.PSREADER_1311:
                wb1301 = new PSReader1301WB();
                wb1301.updateArbt(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1311_u.jsp";
                break;
            //독자-비교대상독자 조회
            case PSReaderWBMapping.PSREADER_1316:
                wb1301 = new PSReader1301WB();
                wb1301.selectArbtCmprobjList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1316_l.jsp";
                break;
            //독자-비교대상독자 상세내역조회
            case PSReaderWBMapping.PSREADER_1321:
                wb1301 = new PSReader1301WB();
                wb1301.selectCmprobjDetail(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1321_p.jsp";
                break;
            //독자-독자조회 초기화면
            case PSReaderWBMapping.PSREADER_1401:
                wb1401 = new PSReader1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1401_s.jsp";
                break;
            //독자-독자조회 조회화면
            case PSReaderWBMapping.PSREADER_1406:
                wb1401 = new PSReader1401WB();
                wb1401.selectRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1406_l.jsp";
                break;
            //독자-독자조회 출력화면
            case PSReaderWBMapping.PSREADER_1411:
                nextPage = "/jsp/ps/reader/ps_rdr_1411_t.jsp";
                break;
            //독자-상세조회
            case PSReaderWBMapping.PSREADER_1416:
                wb1401 = new PSReader1401WB();
                wb1401.selectDetailInfo(req,res);
                nextPage = "/jsp/ps/reader/ps_rdr_1416_p.jsp";
                break;
            //지사배정처리 초기
            case PSReaderWBMapping.PSREADER_1501:
                wb1501 = new PSReader1501WB();
                wb1501.selectAsinExtn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1501_a.jsp";
                break;
            //지사배정처리 검색
            case PSReaderWBMapping.PSREADER_1506:
                wb1501 = new PSReader1501WB();
                wb1501.selectAsinExtn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1506_l.jsp";
                break;
            //지사배정처리 비교대상초기
            case PSReaderWBMapping.PSREADER_1511:
                nextPage = "/jsp/ps/reader/ps_rdr_1511_l.jsp";
                break;
            //지사배정처리 비교대상리스트
            case PSReaderWBMapping.PSREADER_1516:
                wb1501 = new PSReader1501WB();
                wb1501.selectExstRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1516_l.jsp";
                break;
            //지사배정처리 저장
            case PSReaderWBMapping.PSREADER_1521:
            	wb1501 = new PSReader1501WB();
                wb1501.updateExstRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1521_u.jsp";
                break;
            //독자등급관리 초기
            case PSReaderWBMapping.PSREADER_1601:
                wb1601 = new PSReader1601WB();
                wb1601.selectGradAplcList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1601_a.jsp";
                break;
            //독자등급관리 검색
            case PSReaderWBMapping.PSREADER_1606:
                wb1601 = new PSReader1601WB();
                wb1601.selectGradAplcList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1606_l.jsp";
                break;
            //독자등급관리 저장
            case PSReaderWBMapping.PSREADER_1611:
                wb1601 = new PSReader1601WB();
                wb1601.updateGradAplcGrnt(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1611_u.jsp";
                break;
            //독자등급관리 비교대상검색 초기
            case PSReaderWBMapping.PSREADER_1616:
                wb1601 = new PSReader1601WB();
                wb1601.selectAplcCmprList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1616_l.jsp";
                break;
            //독자등급관리 비교대상 검색
            case PSReaderWBMapping.PSREADER_1621:
                wb1601 = new PSReader1601WB();
                wb1601.selectAplcCmprList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1621_l.jsp";
                break;
            //독자등급관리 독자번호/매체코드로 조회
            case PSReaderWBMapping.PSREADER_1626:
                wb1601 = new PSReader1601WB();
                wb1601.select_mplist(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1626_p.jsp";
                break;

            //독자별리스트 초기
            case PSReaderWBMapping.PSREADER_1701:
                wb1401 = new PSReader1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1701_a.jsp";
                break;
            //독자별리스트 검색
            case PSReaderWBMapping.PSREADER_1706:
                wb1701 = new PSReader1701WB();
                wb1701.selectTodayInputList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1706_l.jsp";
                break;
            //독자별리스트 출력
            case PSReaderWBMapping.PSREADER_1711:
                nextPage = "/jsp/ps/reader/ps_rdr_1711_t.jsp";
                break;

            //독자-독자조회 초기화면
            case PSReaderWBMapping.PSREADER_1801:
                wb1401 = new PSReader1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1801_s.jsp";
                break;
            //독자-독자조회 조회화면
            case PSReaderWBMapping.PSREADER_1806:
                wb1801 = new PSReader1801WB();
                wb1801.selectRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1806_l.jsp";
                break;
            //독자-독자조회 출력화면
            case PSReaderWBMapping.PSREADER_1811:
                nextPage = "/jsp/ps/reader/ps_rdr_1811_t.jsp";
                break;
            //독자-상세조회
            /*
            case PSReaderWBMapping.PSREADER_1816:
                wb1801 = new PSReader1801WB();
                wb1801.selectDetailInfo(req,res);
                nextPage = "/jsp/ps/reader/ps_rdr_1816_p.jsp";
                break;
            */

           //지국 독자 초기
           case PSReaderWBMapping.PSREADER_1851:
               wb1401 = new PSReader1401WB();
               wb1401.selectCodeList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1851_s.jsp";
               break;
            //지국 독자 조회
           case PSReaderWBMapping.PSREADER_1856:
               wb1801 = new PSReader1801WB();
               wb1801.selectBoReaderList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1856_l.jsp";
               break;
            //지국 독자 상세 조회
           case PSReaderWBMapping.PSREADER_1861:
               wb1801 = new PSReader1801WB();
               wb1801.selectBoReaderDetail(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1861_s.jsp";
               break;
               //구독자 수정(수정버튼)
           case PSReaderWBMapping.PSREADER_1866:
               wb1801 = new PSReader1801WB();
               wb1801.updateBoReaderInfo(req,res);
               nextPage = "/jsp/ps/reader/ps_rdr_1866_u.jsp";
               break;
           //독자-독자조회 출력화면
           case PSReaderWBMapping.PSREADER_1871:
               nextPage = "/jsp/ps/reader/ps_rdr_1871_t.jsp";
               break;

           //수금입력목록 초기
           case PSReaderWBMapping.PSREADER_1901:
               wb1401 = new PSReader1401WB();
               wb1401.selectCodeList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1901_a.jsp";
               break;
           //수금입력목록 검색
           case PSReaderWBMapping.PSREADER_1906:
               wb1901 = new PSReader1901WB();
               wb1901.selectClamtList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1906_l.jsp";
               break;
           //수금입력목록 출력
           case PSReaderWBMapping.PSREADER_1911:
               nextPage = "/jsp/ps/reader/ps_rdr_1911_t.jsp";
               break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
