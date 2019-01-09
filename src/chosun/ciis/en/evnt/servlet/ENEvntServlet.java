/***************************************************************************************************
 * 파일명 : EN_EVNT_1000Servlet.java
 * 기능 : 행사관리 관련 Servlet
 * 작성일자 : 2009.02.01
 * 작성자 : 최승구
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.en.evnt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.en.evnt.wb.EN_EVNT_1000WB;

public class ENEvntServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
    
    /**
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
    */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/en/evnt/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("Servlet : process : nextPage : " + nextPage);
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        EN_EVNT_1000WB wb = null;
        
        switch (pid) {
			case ENEvntWBMapping.EN_EVNT_1000:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1000_m(req, res);
				nextPage = "/jsp/en/evnt/en_evnt_1000_m.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1001:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1001_m(req, res);
				nextPage = "/jsp/en/evnt/en_evnt_1001_m.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1002:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1002_l(req, res);
				nextPage = "/jsp/en/evnt/en_evnt_1002_l.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1003:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1003_s(req, res);
				nextPage = "/jsp/en/evnt/en_evnt_1003_s.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1004:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1101:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1101_l(req, res);
				nextPage = "/jsp/en/evnt/en_evnt_1101_l.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1102:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1102_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1103:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1103_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1201:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1201_l(req, res);
				nextPage = "/jsp/en/evnt/en_evnt_1201_l.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1202:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1202_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ENEvntWBMapping.EN_EVNT_1203:
				wb = new EN_EVNT_1000WB();
				((EN_EVNT_1000WB)wb).en_evnt_1203_l(req, res);
				nextPage = "/jsp/en/evnt/en_evnt_1203_l.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
