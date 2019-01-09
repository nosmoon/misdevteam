/**************************************************************************************************
* 파일명    : CommonServlet.java
* 기능      : 판매지국 시스템 공통부분 처리 서블릿
* 작성일자  : 2003-11-30
* 작성자    : 김영윤
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/

package chosun.ciis.ss.sal.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.common.servlet.*;

import chosun.ciis.ss.sal.common.wb.*;

/**
 * 공통 처리 서블릿
 */
public class SLCommonServlet extends ChosunServlet{

    private static final String CONTENT_TYPE = "text/html; charset=KSC5601";
    //Initialize global variables
    public void init() throws ServletException{
    }

    //Clean up resources
    public void destroy(){
    }

    public void checkAuthority(){
    //System.out.println("PilotSystem Output : checkAuthority() called.");
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
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException{

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try{
            String servletMappedUrl = "/ss/slcommon/";
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch(AppException ae){
            ae.printStackTrace();
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/slcomm_jsp/app_error.jsp";
        } catch(SysException se){
            se.printStackTrace();
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/slcomm_jsp/sys_error.jsp";
        } catch (Exception e){
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/slcomm_jsp/sys_error.jsp";
        }


        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
System.out.println("SLCommonServlet : nextPage : " + nextPage);
        rd.forward(req, res);
    }

    /**
     * SLCommon1000WBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws SysException, AppException{
        String nextPage = null;
        SLCommon1000WB wb = new SLCommon1000WB();
        SLCommon11000WB wb11000 = new SLCommon11000WB();

        switch(pid){
            case SLCommonWBMapping.COMMON_1000: //우편번호검색(초기화면)
                nextPage = "/jsp/ss/slcommon/sl_common_1000_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1005: //우편번호검색(우편번호,읍/면/동 입력 - 엔터키)
                wb.selectZipList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1005_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1010: //우편번호검색(목록조회)
                wb.selectZipList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1010_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1100: //독자상세조회팝업(수금형)(초기화면)
                wb.selectDsctList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1100_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1105: //독자상세조회팝업(수금형)(목록조회)
                wb.selectReaderDetailList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1105_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1110: //독자검색팝업(기본형)(초기화면)
                nextPage = "/jsp/ss/slcommon/sl_common_1110_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1115: //독자검색팝업(기본형)(독자명/번호/구역+배달 - 엔터키)
                wb.selectReaderList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1115_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1120: //독자검색팝업(기본형)(목록조회)
                wb.selectReaderList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1120_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1200: //확장자검색(초기화면))
                wb.selectExtnBlngCdList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1200_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1205: //확장자검색(확장자명 입력 - 엔터키)
                wb.selectExtnPersList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1205_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1210: //확장자검색(목록조회)
                wb.selectExtnPersList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1210_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1300: //공통코드 상위코드 선택
                wb.selectClsfCodeList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1300_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1310: // 통합 회원 서비스 조회
                wb.selectRDR_SERVICE(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1310_s.jsp";
                break;
            case SLCommonWBMapping.COMMON_1400: //지국검색(초기화면)
                nextPage = "/jsp/ss/slcommon/sl_common_1400_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1405: //지국검색(지국명 입력 - 엔터키)
                wb.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1405_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1410: //지국검색(목록조회)
                wb.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1410_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1500: //판촉물검색(초기화면)
                nextPage = "/jsp/ss/slcommon/sl_common_1500_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1505: //판촉물검색(판촉물명 입력 - 엔터키)
                wb.selectBnsItemCdList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1505_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1510: //판촉물검색(목록조회)
                wb.selectBnsItemCdList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1510_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1600: //지국지사취급매체(목록조회)
                wb.selectBoHndlMediList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1600_l.jsp";
                break;

               //우편번호 공통 2017-02-17 장선희 추가.
    		case SLCommonWBMapping.COMMON_12710: // 새우편번호검색(목록조회)_모바일용_agency와 동일
    			wb11000 = new SLCommon11000WB();
    			wb11000.mo_selectNewAddrList(req, res);
    			nextPage = "/jsp/ss/common/mo_sl_common_12710_l.jsp";
    			break;
    		case SLCommonWBMapping.COMMON_12720: // 새우편번호검색(구군목록)_모바일용_agency와 동일
    			wb11000.mo_selectNewGugunList(req, res);
    			nextPage = "/jsp/ss/common/mo_sl_common_12720_l.jsp";
    			break;


            default:
                nextPage = "/";
                throw new AppException("AE003", "해당 PID가 없습니다.");
        }
        return nextPage;
    }
}
