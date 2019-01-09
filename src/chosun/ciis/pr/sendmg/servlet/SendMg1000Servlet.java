package chosun.ciis.pr.sendmg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pr.sendmg.wb.PR_SENDMG_1000WB;
import chosun.ciis.pr.sendmg.servlet.SendMgWBMapping;



public class SendMg1000Servlet extends BaseServlet {

 
    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
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
            String servletMappedUrl = "/mt/sendmg/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("");
            System.out.println("############### Servlet Start ###############");
            System.out.println("SendMg1000Servlet : req  : " + req);
            System.out.println("SendMg1000Servlet : res  : " + res);
            System.out.println("SendMg1000Servlet : iPid : " + iPid);
            System.out.println("SendMg1000Servlet : nextPage : " + nextPage);

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
     * SEBasWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException, Exception {
        String nextPage = null;
        PR_SENDMG_1000WB wb = null;

        switch (pid) {
				    	case SendMgWBMapping.PR_SENDMG_1000:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1000_l(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1000_l.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1001:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1001_l(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1001_l.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1002:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1002_l(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1002_l.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1010:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1010_a(req, res);
							nextPage = "/common/jsp/resultMsg.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1020:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1020_l(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1020_l.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1021:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1021_l(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1021_l.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1030:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1030_a(req, res);
							nextPage = "/common/jsp/resultMsg.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1039:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1039_l(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1039_l.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1040:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1040_a(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1040_a.jsp";
							break;
				    	case SendMgWBMapping.PR_SENDMG_1050:
							wb = new PR_SENDMG_1000WB();
							((PR_SENDMG_1000WB)wb).pr_sendmg_1050_a(req, res);
							nextPage = "/jsp/pr/sendmg/pr_sendmg_1050_a.jsp";
							break;
				    	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
       return nextPage;
    }
}