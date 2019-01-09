/***************************************************************************************************
* 파일명 : MT_SUBMATRSTOK_Servlet
* 기능 :  분공장 자재일보
* 작성일자 : 2013-04-29
* 작성자 : 김성미
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.mt.submatrstok.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.submatrstok.wb.*;
import chosun.ciis.pr.prtexec.servlet.PrPrtexecWBMapping;
import chosun.ciis.pr.prtexec.servlet.PrtExecWBMapping;
import chosun.ciis.pr.prtexec.wb.PR_PRTEXEC_5000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MtSubmatrstokServlet extends BaseServlet {

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
            String servletMappedUrl = "/mt/submatrstok/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("MT_SUBMATRSTOK_Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MT_SUBMATRSTOK_Servlet : process : nextPage : " + nextPage);
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
		MT_SUBMATRSTOK_1000WB wb = null;

		switch(pid) {
			// 용지일일재고및파지확인 팝업 조회
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1000:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1000_m(req, res);
				nextPage = "/jsp/mt/submatrstok/mt_submatrstok_1000_m.jsp";
				break;
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1010:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1010_l(req, res);
				nextPage = "/jsp/mt/submatrstok/mt_submatrstok_1010_l.jsp";
				break;
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1020:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1120:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1120_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1030:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1030_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1031:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1031_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1110:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1110_l(req, res);
				nextPage = "/jsp/mt/submatrstok/mt_submatrstok_1110_l.jsp";
				break;
			case MtSubmatrstokWBMapping.MT_SUBMATRSTOK_1130:
				wb = new MT_SUBMATRSTOK_1000WB();
				((MT_SUBMATRSTOK_1000WB)wb).mt_submatrstok_1130_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}
}
