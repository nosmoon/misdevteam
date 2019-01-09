package chosun.ciis.mt.knowhow.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.knowhow.wb.MT_KNOWHOW_1000WB;
import chosun.ciis.mt.knowhow.servlet.MtKnowhowWBMapping;



public class MtKnowhowServlet extends BaseServlet {

 
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
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;

        try {
            String servletMappedUrl = "/mt/knowhow/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("");
            System.out.println("############### Servlet Start ###############");
            System.out.println("MtpapinoutSevlet : req  : " + req);
            System.out.println("MtpapinoutSevlet : res  : " + res);
            System.out.println("MtpapinoutSevlet : iPid : " + iPid);
            System.out.println("MtpapinoutSevlet : nextPage : " + nextPage);

            nextPage = executeWorker(req, res, iPid);

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
        MT_KNOWHOW_1000WB wb = null;

        
        switch (pid) {
			case MtKnowhowWBMapping.MT_KNOWHOW_1001:
				wb = new MT_KNOWHOW_1000WB();
				((MT_KNOWHOW_1000WB)wb).mt_knowhow_1001_m(req, res);
				nextPage = "/jsp/mt/knowhow/mt_knowhow_1001_m.jsp";
				break;
			case MtKnowhowWBMapping.MT_KNOWHOW_1002:
				wb = new MT_KNOWHOW_1000WB();
				((MT_KNOWHOW_1000WB)wb).mt_knowhow_1002_l(req, res);
				nextPage = "/jsp/mt/knowhow/mt_knowhow_1002_l.jsp";
				break;
			case MtKnowhowWBMapping.MT_KNOWHOW_1003:
				wb = new MT_KNOWHOW_1000WB();
				((MT_KNOWHOW_1000WB)wb).mt_knowhow_1003_l(req, res);
				nextPage = "/jsp/mt/knowhow/mt_knowhow_1003_l.jsp";
				break;
			case MtKnowhowWBMapping.MT_KNOWHOW_1004:
				wb = new MT_KNOWHOW_1000WB();
				((MT_KNOWHOW_1000WB)wb).mt_knowhow_1004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtKnowhowWBMapping.MT_KNOWHOW_1005:
				wb = new MT_KNOWHOW_1000WB();
				((MT_KNOWHOW_1000WB)wb).mt_knowhow_1005_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	
			default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}