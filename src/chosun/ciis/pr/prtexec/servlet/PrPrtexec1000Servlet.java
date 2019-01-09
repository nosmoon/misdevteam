package chosun.ciis.pr.prtexec.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pr.prtexec.wb.PR_PRTEXEC_5000WB;
import chosun.ciis.pr.prtexec.wb.PR_PRTEXEC_6000WB;
import chosun.ciis.pr.prtexec.wb.PR_PRTEXEC_7000WB;
import chosun.ciis.pr.prtexec.servlet.PrPrtexecWBMapping;



public class PrPrtexec1000Servlet extends BaseServlet {

 
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
            String servletMappedUrl = "/pr/prtexec/";
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
        PR_PRTEXEC_5000WB wb5 = null;
        PR_PRTEXEC_6000WB wb6 = null;
        PR_PRTEXEC_7000WB wb7 = null;

        switch (pid) {
        
        case PrPrtexecWBMapping.PR_PRTEXEC_5000:
			wb5 = new PR_PRTEXEC_5000WB();
			((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5000_l(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_5000_l.jsp";
			break;
        case PrPrtexecWBMapping.PR_PRTEXEC_5030:
			wb5 = new PR_PRTEXEC_5000WB();
			((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5030_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPrtexecWBMapping.PR_PRTEXEC_5040:
			wb5 = new PR_PRTEXEC_5000WB();
			((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5040_l(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_5040_l.jsp";
			break;
    	case PrPrtexecWBMapping.PR_PRTEXEC_5050:
			wb5 = new PR_PRTEXEC_5000WB();
			((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5050_l(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_5050_l.jsp";
			break;
    	case PrPrtexecWBMapping.PR_PRTEXEC_5060:
			wb5 = new PR_PRTEXEC_5000WB();
			((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5060_l(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_5060_l.jsp";
			break;
    	case PrPrtexecWBMapping.PR_PRTEXEC_5070:
			wb5 = new PR_PRTEXEC_5000WB();
			((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5070_a(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_5070_a.jsp";
			break;
    	case PrPrtexecWBMapping.PR_PRTEXEC_5090:
			wb5 = new PR_PRTEXEC_5000WB();
			((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5090_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
        case PrPrtexecWBMapping.PR_PRTEXEC_6000:
			wb6 = new PR_PRTEXEC_6000WB();
			((PR_PRTEXEC_6000WB)wb6).pr_prtexec_6000_l(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_6000_l.jsp";
			break;
        case PrPrtexecWBMapping.PR_PRTEXEC_6010:
			wb6 = new PR_PRTEXEC_6000WB();
			((PR_PRTEXEC_6000WB)wb6).pr_prtexec_6010_m(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_6010_m.jsp";
			break;
        case PrPrtexecWBMapping.PR_PRTEXEC_6020:
			wb6 = new PR_PRTEXEC_6000WB();
			((PR_PRTEXEC_6000WB)wb6).pr_prtexec_6020_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
        case PrPrtexecWBMapping.PR_PRTEXEC_7000:
			wb7 = new PR_PRTEXEC_7000WB();
			((PR_PRTEXEC_7000WB)wb7).pr_prtexec_7000_l(req, res);
			nextPage = "/jsp/pr/prtexec/pr_prtexec_7000_l.jsp";
			break;
        case PrPrtexecWBMapping.PR_PRTEXEC_7010:
			wb7 = new PR_PRTEXEC_7000WB();
			((PR_PRTEXEC_7000WB)wb7).pr_prtexec_7010_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
       return nextPage;
    }
}