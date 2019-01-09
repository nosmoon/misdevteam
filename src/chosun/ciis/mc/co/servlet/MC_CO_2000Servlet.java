package chosun.ciis.mc.co.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.co.wb.*;

public class MC_CO_2000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/co2000/";
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
			case MC_CO_2000WBMapping.MC_CO_9999:
				wb = new MC_CO_2000WB();
				((MC_CO_2000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/co/mc_co_9999_l.jsp";
				break;
			case MC_CO_2000WBMapping.MC_CO_2070:
				wb = new MC_CO_2000WB();
				((MC_CO_2000WB)wb).mc_co_2070_m(req, res);
				nextPage = "/jsp/mc/co/mc_co_2070_m.jsp";
				break;
			case MC_CO_2000WBMapping.MC_CO_2071:
				wb = new MC_CO_2000WB();
				((MC_CO_2000WB)wb).mc_co_2071_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_2071_l.jsp";
				break;
			case MC_CO_2000WBMapping.MC_CO_2072:
				wb = new MC_CO_2000WB();
				((MC_CO_2000WB)wb).mc_co_2072_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_2072_l.jsp";
				break;
			default:
				throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
		}
		
		return nextPage;
	}
}
