package chosun.ciis.fc.co.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.co.wb.*;

public class FC_CO_5000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
	* @throws ServletException
	*/
	public void process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		int pid = 0;
		String nextPage = null;
		
		try {
			String servletMappedUrl = "/fc/co5000/";
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
			case FC_CO_5000WBMapping.FC_CO_9999:
				wb = new FC_CO_5000WB();
				((FC_CO_5000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/co/fc_co_9999_l.jsp";
				break;
			default:
				throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
		}
		
		return nextPage;
	}
}
