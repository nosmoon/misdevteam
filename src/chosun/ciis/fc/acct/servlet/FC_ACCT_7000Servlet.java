package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_7000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/acct7000/";
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
			case FC_ACCT_7000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_7000WBMapping.FC_ACCT_7000:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7000_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7000_m.jsp";
				break;
			case FC_ACCT_7000WBMapping.FC_ACCT_7001:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7001_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7001_l.jsp";
				break;
			case FC_ACCT_7000WBMapping.FC_ACCT_7002:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7002_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7002_i.jsp";
				break;
			case FC_ACCT_7000WBMapping.FC_ACCT_7003:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7003_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7003_u.jsp";
				break;
			case FC_ACCT_7000WBMapping.FC_ACCT_7004:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7004_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7004_d.jsp";
				break;				
			case FC_ACCT_7000WBMapping.FC_ACCT_7011:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7011_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7011_l.jsp";
				break;
			case FC_ACCT_7000WBMapping.FC_ACCT_7012:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7012_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7012_i.jsp";
				break;				
			case FC_ACCT_7000WBMapping.FC_ACCT_7013:
				wb = new FC_ACCT_7000WB();
				((FC_ACCT_7000WB)wb).fc_acct_7013_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_7013_d.jsp";
				break;				
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
