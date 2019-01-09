package chosun.ciis.mc.cost.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.cost.wb.*;

public class MC_COST_2000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/cost2000/";
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
			case MC_COST_2000WBMapping.MC_COST_2000:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2000_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2000_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2001:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2001_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2001_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2002:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2002_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2002_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2003:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2003_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2003_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2004:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2004_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2004_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2010:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2010_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2010_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2011:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2011_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2011_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2012:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2012_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2012_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2013:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2013_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2013_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2014:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2014_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2014_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2015:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2015_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2015_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2016:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2016_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2016_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2017:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2017_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2017_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2018:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2018_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2018_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2020:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2020_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2020_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2021:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2021_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2021_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2022:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2022_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2022_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2023:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2023_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2023_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2030:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2030_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2030_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2031:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2031_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2031_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2032:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2032_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2032_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2033:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2033_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2033_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2034:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2034_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2034_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2035:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2035_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2035_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2036:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2036_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2036_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2040:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2040_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2040_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2041:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2041_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2041_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2042:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2042_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2042_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2043:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2043_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2043_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2044:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2044_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2044_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2045:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2045_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2045_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2046:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2046_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2046_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2047:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2047_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2047_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2050:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2050_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2050_m.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2051:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2051_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2051_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2052:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2052_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2052_l.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2053:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2053_u(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2053_u.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2054:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2054_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2054_i.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_2055:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).mc_cost_2055_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_2055_d.jsp";
				break;
			case MC_COST_2000WBMapping.MC_COST_9999:
				wb = new MC_COST_2000WB();
				((MC_COST_2000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_9999_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
