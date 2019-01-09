/***************************************************************************************************
* 파일명 : MtPapmedaServlet위탁인쇄조정 관리인쇄용지 관리
* 작성일자 : 2009-05-06
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.mt.papmeda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.papmeda.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MtPapmedaServlet extends BaseServlet {

    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
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
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/mt/papmeda/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("MT_PAPMEDA_Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MT_PAPMEDA_Servlet : process : nextPage : " + nextPage);
        }
        catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/common/jsp/app_error.jsp";
        }
        catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/common/jsp/sys_error.jsp";
        }
        catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/common/jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
            nextPage);
        rd.forward(req, res);
    }

    /**
     * SEBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
		String nextPage = null;
		MT_PAPMEDA_1000WB wb  = null;

		switch(pid) {
			//위탁처, 제지사, 매체콤보
			case MtPapmedaWBMapping.MT_PAPMEDA_1000:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1000_m(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1000_m.jsp";
				break;
			//사업자등록번호 조회
			case MtPapmedaWBMapping.MT_PAPMEDA_1100:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1100_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1100_l.jsp";
				break;
			//위탁처조정금액내역 저장,수정,삭제
			case MtPapmedaWBMapping.MT_PAPMEDA_1101:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//위탁처조정금액내역 조회
			case MtPapmedaWBMapping.MT_PAPMEDA_1102:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1102_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1102_l.jsp";
				break;
//				위탁처조정금액내역 조회
			case MtPapmedaWBMapping.MT_PAPMEDA_1104:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1104_m(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//위탁처별 조회 - 위탁처(동적그리드)조회
			case MtPapmedaWBMapping.MT_PAPMEDA_1200:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1200_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1200_l.jsp";
				break;
			//위탁처별 조회
			case MtPapmedaWBMapping.MT_PAPMEDA_1201:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1201_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1201_l.jsp";
				break;
			//제지사별 조회 - 제지사(동적그리드)조회
			case MtPapmedaWBMapping.MT_PAPMEDA_1300:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1300_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1300_l.jsp";
				break;
			//제지사별 조회
			case MtPapmedaWBMapping.MT_PAPMEDA_1301:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1301_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1301_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}
}
