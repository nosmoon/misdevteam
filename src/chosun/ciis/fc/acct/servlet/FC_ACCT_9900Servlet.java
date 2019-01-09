package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*; 


public class FC_ACCT_9900Servlet extends chosun.ciis.co.base.servlet.BaseServlet {

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
	public void process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		int pid = 0;
		String nextPage = null;
		try {
			String servletMappedUrl = "/fc/acct9900/";
			System.out.println(">>Servlet.process().servletMappedUrl=" + servletMappedUrl);
			pid = this.extractPid(req, servletMappedUrl);
			System.out.println(">>Servlet.process().pid=" + pid);
			nextPage = this.executeWorker(req, res, pid);
			System.out.println(">>Servlet.process().nextPage=" + nextPage);
		}
		catch (AppException ae) {
			System.out.println(">>Servlet.process().AppException=" + ae.getMessage());
			req.setAttribute("appException", ae);
			nextPage = "/common/jsp/app_error.jsp";
		}
		catch (SysException se) {
			System.out.println(">>Servlet.process().SysException=" + se.getMessage());
			req.setAttribute("sysException", se);
			nextPage = "/common/jsp/sys_error.jsp";
		}
		catch (Exception e) {
			System.out.println(">>Servlet.process().Exception=" + e.getMessage());
			req.setAttribute("sysException", new SysException(e));
			nextPage = "/common/jsp/sys_error.jsp";
		}

		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(req, res);
	}

	public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException, SQLException {
		String nextPage = null;
		BaseWB wb = null;

		switch(pid) {
			case FC_ACCT_9900WBMapping.FC_ACCT_9900:
				wb = new FC_ACCT_9900WB();
				((FC_ACCT_9900WB)wb).fc_acct_9900_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9900_m.jsp";
				break;
			case FC_ACCT_9900WBMapping.FC_ACCT_9910:
				wb = new FC_ACCT_9900WB();
				((FC_ACCT_9900WB)wb).fc_acct_9910_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9910_l.jsp";
				break;
        	case FC_ACCT_9900WBMapping.FC_ACCT_9920:
				wb = new FC_ACCT_9900WB();
				((FC_ACCT_9900WB)wb).fc_acct_9920_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case FC_ACCT_9900WBMapping.FC_ACCT_9930:
				wb = new FC_ACCT_9900WB();
				((FC_ACCT_9900WB)wb).fc_acct_9930_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9930_l.jsp";
				break;
        	case FC_ACCT_9900WBMapping.FC_ACCT_9931:
				wb = new FC_ACCT_9900WB();
				((FC_ACCT_9900WB)wb).fc_acct_9931_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9931_s.jsp";				
				break;
			case FC_ACCT_9900WBMapping.FC_ACCT_9940:
				wb = new FC_ACCT_9900WB();
				((FC_ACCT_9900WB)wb).fc_acct_9940_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9940_l.jsp";
				break; 
			default:				
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}

		return nextPage;
	}
}
