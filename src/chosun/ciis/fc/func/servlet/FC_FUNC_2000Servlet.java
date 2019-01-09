package chosun.ciis.fc.func.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.func.wb.*;

public class FC_FUNC_2000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/func2000/";
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
		System.out.println("FUNC2000Servlet.executeWorker(S)");
		switch(pid) {
			case FC_FUNC_2000WBMapping.FC_FUNC_9999:
				System.out.println("FUNC2000Servlet.executeWorker().9999");
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/func/fc_func_9999_l.jsp";
				System.out.println("FUNC2000Servlet.executeWorker().nextPage=[" + nextPage + "]");
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2000:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2000_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_2000_m.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2001:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2001_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_2001_l.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2002:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2002_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_2002_i.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2010:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2010_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_2010_m.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2011:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2011_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_2011_l.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2012:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2012_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_2012_l.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2013:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2013_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_2013_i.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2014:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2014_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_2014_d.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2020:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2020_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_2020_m.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2021:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2021_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_2021_l.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2022:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2022_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_2022_l.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2023:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2023_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_2023_i.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2024:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2024_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_2024_d.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2030:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2030_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_2030_m.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2031:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2031_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_2031_l.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2050:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2050_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_2050_m.jsp";
				break;
			case FC_FUNC_2000WBMapping.FC_FUNC_2051:
				wb = new FC_FUNC_2000WB();
				((FC_FUNC_2000WB)wb).fc_func_2051_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_2051_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		System.out.println("FUNC2000Servlet.executeWorker(E)");
		return nextPage;
	}
}
