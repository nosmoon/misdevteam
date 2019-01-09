/***************************************************************************************************
 * 파일명   : PSCommonServlet.java
 * 기능     : 출판업무지원 공통사용 서블릿
 * 작성일자 : 2004-02-26
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.wb.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * 공통 대표 서블릿
 */
public class PSCommonServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/common/";
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
     * PSCommonWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        PSCommonWB wbCommon = null ;

        switch (pid) {
            //우편번호 검색 초기
            case PSCommonWBMapping.PSCOMMON_1801:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1101_p.jsp";
                break;
            //우편번호 검색
            case PSCommonWBMapping.PSCOMMON_1806:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1106_l.jsp";
                break;
            //우편번호 검색
            case PSCommonWBMapping.PSCOMMON_1811:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1111_l.jsp";
                break;
            //우편번호 검색
            case PSCommonWBMapping.PSCOMMON_1816:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1116_l.jsp";
                break;

            //우편번호 검색 초기
            case PSCommonWBMapping.PSCOMMON_1101:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr3(req, res);
                nextPage = "/jsp/ps/common/ps_common_1801_p.jsp";
                break;
            //우편번호 검색
            case PSCommonWBMapping.PSCOMMON_1106:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr3(req, res);
                nextPage = "/jsp/ps/common/ps_common_1806_l.jsp";
                break;
            //우편번호 검색
            case PSCommonWBMapping.PSCOMMON_1111:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr3(req, res);
                nextPage = "/jsp/ps/common/ps_common_1811_l.jsp";
                break;

            //사원번호로 사원명검색
            case PSCommonWBMapping.PSCOMMON_1201:
                wbCommon = new PSCommonWB();
                wbCommon.selectEmpDetail(req, res);
                nextPage = "/jsp/ps/common/ps_common_1201_s.jsp";
                break;
            //지사별 부서검색
            case PSCommonWBMapping.PSCOMMON_1301:
            	wbCommon  =  new PSCommonWB();
                wbCommon.selectBoDept(req, res);
                nextPage = "/jsp/ps/common/ps_common_1301_l.jsp";
                break;
            //기존독자검색
            case PSCommonWBMapping.PSCOMMON_1401:
                wbCommon = new PSCommonWB();
                wbCommon.selectExstRdr(req, res);
                nextPage = "/jsp/ps/common/ps_common_1401_l.jsp";
                break;
            //사원번호로 사원명검색
            case PSCommonWBMapping.PSCOMMON_1601:
                wbCommon = new PSCommonWB();
                wbCommon.selectReaderDetail(req, res);
                nextPage = "/jsp/ps/common/ps_common_1601_s.jsp";
                break;
            //사원번호로 사원명검색(지국지사명포함)
            case PSCommonWBMapping.PSCOMMON_1701:
                wbCommon = new PSCommonWB();
                wbCommon.selectReaderDetailBocd(req, res);
                nextPage = "/jsp/ps/common/ps_common_1701_s.jsp";
                break;

            //지국검색팝업
            case PSCommonWBMapping.PSCOMMON_1901:
                wbCommon = new PSCommonWB();
                nextPage = "/jsp/ps/common/ps_common_1901_p.jsp";
                break;
            //지국검색조회
            case PSCommonWBMapping.PSCOMMON_1906:
                wbCommon = new PSCommonWB();
                wbCommon.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ps/common/ps_common_1906_l.jsp";
                break;
            //지국검색조회
            case PSCommonWBMapping.PSCOMMON_1911:
                wbCommon = new PSCommonWB();
                wbCommon.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ps/common/ps_common_1911_l.jsp";
                break;
            default:
              throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
