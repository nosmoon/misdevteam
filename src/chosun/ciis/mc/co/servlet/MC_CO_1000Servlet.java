package chosun.ciis.mc.co.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.co.wb.*;

public class MC_CO_1000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/co1000/";
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
			case MC_CO_1000WBMapping.MC_CO_9999:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/co/mc_co_9999_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1001:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1001_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1001_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1002:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1002_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1002_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1003:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1003_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1003_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1004:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1004_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1004_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1005:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1005_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1005_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1006:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1006_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1006_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1007:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1007_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1007_l.jsp";
				break;				
			case MC_CO_1000WBMapping.MC_CO_1008:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1008_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1008_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1009:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1009_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1009_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1010I:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1010i(req, res);
				nextPage = "/jsp/mc/co/mc_co_1010i.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1011:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1011_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1011_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1012:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1012_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1012_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1013:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1013_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1013_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1014:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1014_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1014_l.jsp";
				break;
			case MC_CO_1000WBMapping.MC_CO_1030:
				wb = new MC_CO_1000WB();
				((MC_CO_1000WB)wb).mc_co_1030_l(req, res);
				nextPage = "/jsp/mc/co/mc_co_1030_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
