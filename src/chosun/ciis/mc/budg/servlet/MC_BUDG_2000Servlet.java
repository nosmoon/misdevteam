package chosun.ciis.mc.budg.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.budg.wb.*;

public class MC_BUDG_2000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/budg2000/";
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
			case MC_BUDG_2000WBMapping.MC_BUDG_9999:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_9999_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2010:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2010_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2010_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2011:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2011_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2011_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2020:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2020_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2020_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2021:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2021_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2021_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2022:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2022_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2022_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2030:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2030_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2030_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2031:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2031_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2031_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2070:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2070_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2070_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2071:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2071_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2071_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2072:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2072_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2072_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2073:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2073_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2073_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2077:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2077_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2077_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2080:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2080_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2080_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2081:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2081_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2081_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2082:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2082_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2082_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2083:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2083_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2083_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2084:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2084_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2084_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2085:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2085_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2085_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2090:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2090_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2090_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2091:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2091_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2091_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2092:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2092_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2092_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2093:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2093_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2093_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2094:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2094_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2094_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2095:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2095_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2095_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2096:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2096_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2096_u.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2097:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2097_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2097_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2100:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2100_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2100_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2101:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2101_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2101_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2102:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2102_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2102_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2103:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2103_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2103_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2104:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2104_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2104_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2105:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2105_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2105_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2106:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2106_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2106_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2107:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2107_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2107_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2111:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2111_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2111_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2112:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2112_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2112_l.jsp";
				break;				
			case MC_BUDG_2000WBMapping.MC_BUDG_2113:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2113_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2113_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2114:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2114_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2114_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2115:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2115_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2115_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2116:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2116_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2116_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2117:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2117_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2117_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2118:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2118_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2118_l.jsp";
				break;				
			case MC_BUDG_2000WBMapping.MC_BUDG_2121:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2121_s(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2121_s.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2122:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2122_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2122_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2123:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2123_a(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2123_a.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2124:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2124_s(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2124_s.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2125:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2125_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2125_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2126:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2126_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2126_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2127:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2127_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2127_l.jsp";
				break;				
			case MC_BUDG_2000WBMapping.MC_BUDG_2241:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2241_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2241_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2242:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2242_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2242_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2243:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2243_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2243_u.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2244:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2244_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2244_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2251:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2251_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2251_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2252:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2252_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2252_u.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2253:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2253_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2253_u.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2254:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2254_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2254_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2255:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2255_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2255_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2256:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2256_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2256_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2257:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2257_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2257_d.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2258:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2258_a(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2258_a.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2259:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2259_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2259_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2281:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2281_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2281_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2290:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2290_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2290_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2291:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2291_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2291_l.jsp";
				break;				
			case MC_BUDG_2000WBMapping.MC_BUDG_2240:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2240_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2240_m.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2162:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2162_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2162_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2076:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2076_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2076_i.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2061:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2061_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2061_l.jsp";
				break;
			case MC_BUDG_2000WBMapping.MC_BUDG_2128:
				wb = new MC_BUDG_2000WB();
				((MC_BUDG_2000WB)wb).mc_budg_2128_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_2128_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
