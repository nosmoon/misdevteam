package chosun.ciis.mc.budg.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.budg.wb.*;

public class MC_BUDG_1000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/budg1000/";
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
			case MC_BUDG_1000WBMapping.MC_BUDG_9999:
				wb = new MC_BUDG_1000WB();		
				((MC_BUDG_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_9999_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1000:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1000_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1000_m.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1001:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1001_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1001_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1002:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1002_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1002_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1003:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1003_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1003_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1004:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1004_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1004_u.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1006:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1006_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1006_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1007:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1007_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1007_i.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1008:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1008_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1008_d.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1020:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1020_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1020_m.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1021:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1021_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1021_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1030:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1030_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1030_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1031:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1031_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1031_i.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1040:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1040_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1040_m.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1041:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1041_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1041_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1051:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1051_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1051_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1052:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1052_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1052_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1054:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1054_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1054_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1055:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1055_a(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1055_a.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1061:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1061_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1061_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1062:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1062_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1062_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1063:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1063_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1063_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1066:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1066_a(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1066_a.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1067:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1067_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1067_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1069:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1069_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1069_u.jsp";
				break;				
			case MC_BUDG_1000WBMapping.MC_BUDG_1071:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1071_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1071_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1081:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1081_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1081_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1082:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1082_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1082_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1083:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1083_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1083_i.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1084:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1084_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1084_d.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1091:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1091_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1091_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1092:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1092_a(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1092_a.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1093:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1093_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1093_m.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1010:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1010_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1010_m.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1011:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1011_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1011_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1012:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1012_a(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1012_a.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1013:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1013_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1013_l.jsp";
				break;
			case MC_BUDG_1000WBMapping.MC_BUDG_1015:
				wb = new MC_BUDG_1000WB();
				((MC_BUDG_1000WB)wb).mc_budg_1015_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_1015_m.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
