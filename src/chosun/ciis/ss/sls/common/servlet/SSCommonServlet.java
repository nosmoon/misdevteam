/***************************************************************************************************
* 파일명 : SSCommonServlet.java
 * 기능 : 부서,지역 등 공통 서블릿
* 작성일자 : 2003-11-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.wb.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.rdr.servlet.SSReaderWBMapping;
import chosun.ciis.ss.sls.rdr.wb.SSReader11000WB;

public class SSCommonServlet extends ChosunServlet {
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
        String servletMappedUrl = "/ss/common/";
        iPid = extractPid(req, servletMappedUrl);
System.out.println("SSCommonServlet : process : iPid : "+iPid);
        nextPage = executeWorker(req, res, iPid);
System.out.println("SSCommonServlet : process : nextPage : "+nextPage);
      } catch (AppException ae) {
        req.setAttribute("appException", ae);
        nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
      } catch (SysException se) {
        req.setAttribute("sysException", se);
        nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
      }

      RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
         rd.forward(req, res);
    }

    /**
     * PilotWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
      SSCommon1100WB wb = null;

		/* 모바일관련 wb 따로 분리 20161207 장선희 */
      SSCommon11100WB wb11100 = null; //모바일용


      switch (pid) {
        case SSCommonWBMapping.COMMON_1000:         // 공통-지역검색(일반지국)
              wb = new SSCommon1100WB();
              wb.selectDeptList(req, res);
              nextPage = "/jsp/ss/common/ss_common_1100_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1100:         // 공통-지역검색(일반지국)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1100_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1101:         // 공통-지역검색(지역코드,지역명)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1101_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1102:         // 공통-지역검색(enctype="multipart/form-data")
            wb = new SSCommon1100WB();
            wb.selectAreaList2(req, res);
            nextPage = "/jsp/ss/common/ss_common_1102_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1103:         // 공통-수신지역검색(일반지국)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1102_l.jsp";
            break;

        case SSCommonWBMapping.COMMON_1105:         // 공통-품앗이확장 권유지국 검색-지역검색
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1105_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1106:         // 공통-지국지원-신문지원물품-사고-사고지국 지역검색
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1106_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1107:         // 공통-지국경영-공정위위약금-지역검색
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1107_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1110:         // 공통-지국 검색 초기화면(팝업)
            nextPage = "/jsp/ss/common/ss_common_1110_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1113:         // 공통-지국 검색 목록
            wb = new SSCommon1100WB();
            wb.selectBOList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1113_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1115:         // 공통-지국 검색 목록
            wb = new SSCommon1100WB();
            wb.selectBOList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1115_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1116:         // 공통-지국목록(LIST)
            wb = new SSCommon1100WB();
            wb.selectBoinfoList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1116_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1117:         // 공통-지국목록(LIST)
            wb = new SSCommon1100WB();
            wb.selectGugunList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1117_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1118:         // 공통-지국목록(LIST)
            wb = new SSCommon1100WB();
            wb.selectNewZipList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1118_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1150: //우편번호검색(초기화면)
            nextPage = "/jsp/ss/common/ss_common_1150_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1152: //우편번호검색(우편번호,읍/면/동 입력 - 엔터키)
            wb = new SSCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1152_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1154: //우편번호검색(목록조회)
            wb = new SSCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1154_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1160: //매체코드검색(회사별)-검색폼
            wb = new SSCommon1100WB();
            wb.selectCmpyMedicdList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1160_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1161: //매체코드검색(회사별)-상세폼
            wb = new SSCommon1100WB();
            wb.selectCmpyMedicdList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1161_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1162: //공통-지급기준코드검색(지급구분별-마일리지)-검색폼
            wb = new SSCommon1100WB();
            wb.selectClsfBasiList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1162_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1163: //공통-지급기준코드검색(지급구분별-마일리지)-상세폼
            wb = new SSCommon1100WB();
            wb.selectClsfBasiList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1163_l.jsp";
            break;

            // 독자검색 팝업
        case SSCommonWBMapping.COMMON_1170: //공통-독자상세조회팝업(수금형)(초기화면)
            nextPage = "/jsp/ss/common/ss_common_1170_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1171: //공통-독자상세조회팝업(수금형)(목록조회)
            wb = new SSCommon1100WB();
            wb.selectReaderDetailList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1171_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1172: //공통-독자검색팝업(기본형)(초기화면)
            nextPage = "/jsp/ss/common/ss_common_1172_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1173: //공통-독자검색팝업(기본형)(독자명/번호/구역+배달 - 엔터키)
            wb = new SSCommon1100WB();
            wb.selectReaderList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1173_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1174: //공통-독자검색팝업(기본형)(목록조회)
            wb = new SSCommon1100WB();
            wb.selectReaderList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1174_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1176: //독자검색(초기화면)
            nextPage = "/jsp/ss/common/ss_common_1176_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1178: //독자검색(독자명 입력조회 - 엔터키)
            wb = new SSCommon1100WB();
            wb.selectRDRList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1178_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1180: //독자검색(목록조회)
            wb = new SSCommon1100WB();
            wb.selectRDRList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1180_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1190:         // 공통-지역검색(일반지국)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1190_l.jsp";
            break;

        case SSCommonWBMapping.COMMON_1201:
            wb = new SSCommon1100WB();
            wb.selectNewGugunList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1201_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1202:
            wb = new SSCommon1100WB();
            wb.selectNewAddrList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1202_l.jsp";
            break;

/*******************************************모바일용******************************************************************/
        case SSCommonWBMapping.COMMON_11108: //공통-지역검색(지역리스트)_모바일용
        	wb11100 = new SSCommon11100WB();
        	wb11100.mo_selectAreaList(req, res);
            nextPage = "/jsp/ss/common/mo_ss_common_11108_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_11180: //공통-센터리스트_모바일용
        	wb11100 = new SSCommon11100WB();
        	wb11100.mo_selectBoList(req, res);
            nextPage = "/jsp/ss/common/mo_ss_common_11180_l.jsp";
            break;


        default:
          throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
      }
      return nextPage;
    }
}
