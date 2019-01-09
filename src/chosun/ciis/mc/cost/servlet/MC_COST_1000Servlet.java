package chosun.ciis.mc.cost.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.cost.wb.*;

public class MC_COST_1000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/cost1000/";
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
			case MC_COST_1000WBMapping.MC_COST_1000:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1000_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1000_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1001:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1001_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1001_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1002:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1002_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1002_i.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1003:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1003_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1003_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1004:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1004_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1004_d.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1010:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1010_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1010_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1011:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1011_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1011_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1012:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1012_u(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1012_u.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1013:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1013_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1013_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1020:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1020_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1020_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1021:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1021_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1021_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1022:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1022_u(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1022_u.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1023:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1023_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1023_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1030:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1030_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1030_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1031:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1031_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1031_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1032:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1032_a(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1032_a.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1033:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1033_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1033_d.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1040:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1040_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1040_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1041:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1041_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1041_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1042:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1042_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1042_l.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1043:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1043_u(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1043_u.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1044:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1044_u(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1044_u.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1045:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1045_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1045_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1047:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1047_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1047_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_1046:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).mc_cost_1046_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_1046_m.jsp";
				break;
			case MC_COST_1000WBMapping.MC_COST_9999:
				wb = new MC_COST_1000WB();
				((MC_COST_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_9999_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
