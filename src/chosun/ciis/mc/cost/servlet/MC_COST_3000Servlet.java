package chosun.ciis.mc.cost.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.cost.wb.*;

public class MC_COST_3000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/cost3000/";
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
			case MC_COST_3000WBMapping.MC_COST_9999:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_9999_d.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3000:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3000_a(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3000_a.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3001:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3001_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3001_i.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3002:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3002_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3002_i.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3003:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3003_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3003_i.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3004:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3004_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3004_i.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3005:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3005_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3005_i.jsp";
				break;				
			case MC_COST_3000WBMapping.MC_COST_3006:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3006_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3006_d.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3007:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3007_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3007_d.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3008:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3008_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3008_d.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3009:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3009_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3009_d.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3010:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3010_a(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3010_a.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3011:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3011_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3011_i.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3012:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3012_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3012_d.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3013:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3013_i(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3013_i.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3014:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3014_d(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3014_d.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3015:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3015_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3015_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3016:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3016_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3016_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3017:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3017_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3017_m.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3018:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3018_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3018_l.jsp";
				break;				
			case MC_COST_3000WBMapping.MC_COST_3020:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3020_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3020_m.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3021:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3021_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3021_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3022:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3022_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3022_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3023:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3023_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3023_l.jsp";
				break;				
			case MC_COST_3000WBMapping.MC_COST_3030:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3030_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3030_m.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3031:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3031_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3031_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3040:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3040_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3040_m.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3041:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3041_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3041_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3050:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3050_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3050_m.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3051:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3051_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3051_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3061:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3061_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3061_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3062:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3062_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3062_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3071:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3071_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3071_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3072:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3072_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3072_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3080:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3080_m(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3080_m.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3081:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3081_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3081_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3082:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3082_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3082_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3161:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3161_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3161_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3162:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3162_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3162_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3163:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3163_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3163_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3164:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3164_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3164_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3165:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3165_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3165_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3166:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3166_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3166_l.jsp";
				break;				
			case MC_COST_3000WBMapping.MC_COST_3171:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3171_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3171_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3172:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3172_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3172_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3181:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3181_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3181_l.jsp";
				break;
			case MC_COST_3000WBMapping.MC_COST_3191:
				wb = new MC_COST_3000WB();
				((MC_COST_3000WB)wb).mc_cost_3191_l(req, res);
				nextPage = "/jsp/mc/cost/mc_cost_3191_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
