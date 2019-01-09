/***************************************************************************************************
 * 파일명 : PSCodeServlet.java
 * 기능 : 출판국 매체단가 서브릿
 * 작성일자 : 2004-02-20
 * 작성자 : 김건호
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.code.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.wb.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 기초메뉴 대표 서블릿
 */
public class PSCodeServlet extends ChosunServlet {

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
      String servletMappedUrl = "/ps/code/";
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
     * PBBaseWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        PSCode1101WB wb1101 = null  ;
        PSCode1201WB wb1201 = null  ; //매체단가관리
        PSCode1301WB wb1301 = null  ; //보너스북관리
        PSCode1401WB wb1401 = null  ; //지사통합코드관리
        PSCode1501WB wb1501 = null  ; //출판지사계좌관리

            switch (pid) {
              // 단행본 초기화면
              case PSCodeWBMapping.PSCODE_1101:
                  wb1101 =  new PSCode1101WB();
                  wb1101.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1101_a.jsp";
                  break;
              // 단행본 코드리스트조회
              case PSCodeWBMapping.PSCODE_1106:
                  wb1101 =  new PSCode1101WB();
                  wb1101.selectList(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1106_l.jsp";
                  break;

              // 단행본 코드저장
              case PSCodeWBMapping.PSCODE_1116:
                  wb1101 =  new PSCode1101WB();
                  wb1101.insertSepbkCode(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1116_i.jsp";
                  break;
              // 단행본 코드수정
              case PSCodeWBMapping.PSCODE_1121:
                  wb1101 =  new PSCode1101WB();
                  wb1101.updateSepbkCode(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1121_u.jsp";
                  break;
              // 매체단가 초기화면
              case PSCodeWBMapping.PSCODE_1201:
                  wb1201 =  new PSCode1201WB();
                  wb1201.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1201_a.jsp";
                  break;
              // 매체단가 리스트조회
              case PSCodeWBMapping.PSCODE_1206:
                  wb1201 =  new PSCode1201WB();
                  wb1201.selectList(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1206_l.jsp";
                  break;
              // 매체단가 저장
              case PSCodeWBMapping.PSCODE_1211:
                  wb1201 =  new PSCode1201WB();
                  wb1201.insertMedipri(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1211_i.jsp";
                  break;
              // 매체단가 수정
              case PSCodeWBMapping.PSCODE_1216:
                  wb1201 =  new PSCode1201WB();
                  wb1201.updateMedipri(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1216_u.jsp";
                  break;
              // 매체단가 삭제
              case PSCodeWBMapping.PSCODE_1221:
                  wb1201 =  new PSCode1201WB();
                  wb1201.deleteMedipri(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1221_d.jsp";
                  break;
              // 단행본 코드삭제
              case PSCodeWBMapping.PSCODE_1126:
                  wb1101 =  new PSCode1101WB();
                  wb1101.deleteSepbkCode(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1126_d.jsp";
                  break;
              // 단행본 상세내역
              case PSCodeWBMapping.PSCODE_1131:
                  wb1101 =  new PSCode1101WB();
                  wb1101.selectSepbkDtl(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1131_s.jsp";
                  break;
              // 보너스북 초기화면
              case PSCodeWBMapping.PSCODE_1301:
                  wb1301 =  new PSCode1301WB();
                  wb1301.selectCodelist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1301_a.jsp";
                  break;
              // 보너스북 리스트조회
              case PSCodeWBMapping.PSCODE_1306:
                  wb1301 =  new PSCode1301WB();
                  wb1301.selectBnsbklist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1306_l.jsp";
                  break;
              // 보너스북 등록처리
              case PSCodeWBMapping.PSCODE_1311:
                  wb1301 =  new PSCode1301WB();
                  wb1301.insertBnsbk(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1311_i.jsp";
                  break;
              // 보너스북 수정처리
              case PSCodeWBMapping.PSCODE_1316:
                  wb1301 =  new PSCode1301WB();
                  wb1301.updateBnsbk(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1316_u.jsp";
                  break;
              // 보너스북 삭제처리
              case PSCodeWBMapping.PSCODE_1321:
                  wb1301 =  new PSCode1301WB();
                  wb1301.deleteBnsbk(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1321_d.jsp";
                  break;
              // 지사통합코드관리 초기화면
              case PSCodeWBMapping.PSCODE_1401:
                  wb1401 =  new PSCode1401WB();
                  wb1401.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1401_s.jsp";
                  break;
              // 지사통합코드관리 조회화면
              case PSCodeWBMapping.PSCODE_1406:
                  wb1401 =  new PSCode1401WB();
                  wb1401.selectCmpybolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1406_l.jsp";
                  break;
              // 지사통합코드관리 저장화면
              case PSCodeWBMapping.PSCODE_1411:
                  wb1401 =  new PSCode1401WB();
                  wb1401.insertCmpybo(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1411_i.jsp";
                  break;

              // 출판지사계좌관리 초기화면
              case PSCodeWBMapping.PSCODE_1501:
                  wb1501 =  new PSCode1501WB();
                  wb1501.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1501_s.jsp";
                  break;
              // 출판지사계좌관리 조회화면
              case PSCodeWBMapping.PSCODE_1506:
                  wb1501 =  new PSCode1501WB();
                  wb1501.selectBoacctlist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1506_l.jsp";
                  break;
              // 출판지사계좌관리 저장화면
              case PSCodeWBMapping.PSCODE_1511:
                  wb1501 =  new PSCode1501WB();
                  wb1501.accessBoacct(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1511_a.jsp";
                  break;
      default:
        throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
    }
    return nextPage;
  }
}
