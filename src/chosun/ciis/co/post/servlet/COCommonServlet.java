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

package chosun.ciis.co.post.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.co.post.dm.*;
import chosun.ciis.co.post.wb.*;
import chosun.ciis.co.post.ds.*;
import chosun.ciis.co.post.servlet.*;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class COCommonServlet extends chosun.ciis.co.base.servlet.BaseServlet {
    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
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
      public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String requestURI = null;
      String strPid = null;
      int iPid = 0;
      String nextPage = null;
      try {
        String servletMappedUrl = "/co/post/";
        iPid = extractPid(req, servletMappedUrl);
System.out.println("COCommonServlet : process : iPid : "+iPid);
        nextPage = executeWorker(req, res, iPid);
System.out.println("COCommonServlet : process : nextPage : "+nextPage);
      } catch (AppException ae) {
        req.setAttribute("appException", ae);
        nextPage = "/jsp/co/post/app_error.jsp";
      } catch (SysException se) {
        req.setAttribute("sysException", se);
        nextPage = "/jsp/co/post/sys_error.jsp";
      } catch (Exception e) {
          req.setAttribute("sysException", new SysException(e));
          nextPage = "/comm_jsp/sys_error.jsp";        
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,int pid) throws AppException, SQLException {
      String nextPage = null;
      COCommon1100WB wb = null;
      switch (pid) {
      
        case COCommonWBMapping.COMMON_1150: //우편번호검색(초기화면)
            nextPage = "/jsp/co/post/co_common_1150_p.jsp";
            break;
        case COCommonWBMapping.COMMON_1152: //우편번호검색(우편번호,읍/면/동 입력 - 엔터키)
            wb = new COCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/co/post/co_common_1152_l.jsp";
            break;
        case COCommonWBMapping.COMMON_1154: //우편번호검색(목록조회)
            wb = new COCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/co/post/co_common_1154_l.jsp";
            break;
        
        // 가동지국을 조인하지 않고 모든 주소를 조회하는 주소팝업창 추가개발(20090827 권정윤)
        // url부터 프로시져까지 완전분리 
        case COCommonWBMapping.COMMON_1160: //우편번호검색(초기화면)
            nextPage = "/jsp/co/post/co_common_1160_p.jsp";
            break;
        case COCommonWBMapping.COMMON_1162: //우편번호검색(우편번호,읍/면/동 입력 - 엔터키)
            wb = new COCommon1100WB();
            wb.selectZipListAll(req, res);
            nextPage = "/jsp/co/post/co_common_1162_l.jsp";
            break;
        case COCommonWBMapping.COMMON_1164: //우편번호검색(목록조회)
            wb = new COCommon1100WB();
            wb.selectZipListAll(req, res);
            nextPage = "/jsp/co/post/co_common_1164_l.jsp";
            break;            

        default:
          throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
      }
      return nextPage;
    }
}
