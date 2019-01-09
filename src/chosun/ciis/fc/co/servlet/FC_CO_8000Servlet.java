package chosun.ciis.fc.co.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.co.wb.*;

public class FC_CO_8000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/co8000/";
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
			case FC_CO_8000WBMapping.FC_CO_9999:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/co/fc_co_9999_l.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8000:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8000_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8000_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8001:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8001_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8001_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8002:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8002_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8002_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8003:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8003_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8003_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8010:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8010_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_8010_m.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8011:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8011_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_8011_l.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8020:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8020_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8020_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8030:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8030_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8030_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8040:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8040_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8040_s.jsp";
				break;	
			case FC_CO_8000WBMapping.FC_CO_8050:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8050_a(req, res);
				nextPage = "/jsp/fc/co/fc_co_8050_a.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8060:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8060_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8060_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8070:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8070_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8070_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8080:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8080_s(req, res);
				nextPage = "/jsp/fc/co/fc_co_8080_s.jsp";
				break;
			case FC_CO_8000WBMapping.FC_CO_8120:
				wb = new FC_CO_8000WB();
				((FC_CO_8000WB)wb).fc_co_8120_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_8120_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
