package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_2000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/acct2000/";
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
			case FC_ACCT_2000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2030:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2030_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2030_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2031:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2031_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2031_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2032:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2032_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2032_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2033:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2033_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2033_d.jsp";
				break;	
			case FC_ACCT_2000WBMapping.FC_ACCT_2034:
				nextPage = "/jsp/fc/acct/fc_acct_2034_t.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2040:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2040_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2040_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2041:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2041_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2041_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2045:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2045_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2045_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2010:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2010_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2010_m.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2011:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2011_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2011_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2012:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2012_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2012_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2013:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2013_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2013_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2014:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2014_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2014_s.jsp";
				break;	
			case FC_ACCT_2000WBMapping.FC_ACCT_2050:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2050_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2050_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2060:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2060_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2060_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2070:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2070_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2070_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2080:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2080_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2080_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2090:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2090_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2090_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2081:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2081_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2081_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2082:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2082_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2082_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2083:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2083_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2083_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2101:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2101_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2101_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2110:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2110_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2110_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2111:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2111_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2111_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2112:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2112_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2112_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2113:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2113_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2114:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2114_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2115:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2115_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2116:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2116_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2120:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2120_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2120_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2121:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2121_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2121_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2122:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2122_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2122_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2123:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2123_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2123_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2124:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2124_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2124_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2125:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2125_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2125_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2126:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2126_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2126_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2142:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2142_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2142_a.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2143:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2143_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2143_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2144:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2144_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2144_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2150:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2150_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2150_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2160:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2160_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2160_m.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2161:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2161_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2161_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2162:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2162_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2162_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2164:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2164_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2164_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2165:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2165_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2165_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2166:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2166_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2166_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2167:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2167_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2167_d.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2168:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2168_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2168_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2175:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2175_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2175_a.jsp";
				break;					
			case FC_ACCT_2000WBMapping.FC_ACCT_2180:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2180_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2180_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2182:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2182_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2182_s.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2190:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2190_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2190_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2191:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2191_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2191_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2193:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2193_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2193_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2194:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2194_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2194_s.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2200:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2200_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2200_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2201:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2201_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2201_p.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2203:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2203_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2203_s.jsp";
				break;		
			case FC_ACCT_2000WBMapping.FC_ACCT_2210:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2210_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2210_m.jsp";
				break;	
			case FC_ACCT_2000WBMapping.FC_ACCT_2211:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2211_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2211_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2212:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2212_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2212_i.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2213:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2213_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2213_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2220:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2220_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2220_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2222:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2222_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2222_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2223:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2223_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2223_s.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2230:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2230_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2230_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2231:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2231_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2231_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2232:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2232_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2232_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2241:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2241_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2241_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2245:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2245_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2245_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2246:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2246_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2246_l.jsp";
				break;	
			case FC_ACCT_2000WBMapping.FC_ACCT_2247:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2247_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2247_l.jsp";
				break;		
			case FC_ACCT_2000WBMapping.FC_ACCT_2250:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2250_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2250_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2251:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2251_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2251_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2253:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2253_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2253_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2254:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2254_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2254_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2255:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2255_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2255_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2260:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2260_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2260_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2261:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2261_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2261_p.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2263:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2263_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2263_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2270:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2270_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2270_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2272:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2272_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2272_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2280:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2280_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2280_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2281:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2281_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2281_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2282:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2282_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2282_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2283:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2283_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2283_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2284:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2284_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2284_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2285:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2285_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2285_a.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2290:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2290_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2290_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2291:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2291_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2291_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2292:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2292_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2292_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2293:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2293_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2293_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2340:				
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2340_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2340_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2341:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2341_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2341_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2342:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2342_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2342_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2343:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2343_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2343_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2345:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2345_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2345_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2346:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2346_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2346_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2347:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2347_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2347_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2350:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2350_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2350_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2351:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2351_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2351_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2352:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2352_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2352_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2353:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2353_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2353_i.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2354:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2354_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2354_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2355:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2355_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2355_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2361:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2361_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2361_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2370:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2370_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2370_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2371:
				wb = new FC_ACCT_2000WB();
				System.out.println("servlet 2371~~~");
				((FC_ACCT_2000WB)wb).fc_acct_2371_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2371_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2372:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2372_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2372_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2373:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2373_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2373_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2374:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2374_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2374_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2375:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2375_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2375_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2376:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2376_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2376_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2380:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2380_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2380_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2381:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2381_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2381_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2382:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2382_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2382_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2410:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2410_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2410_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2411:
				System.out.println("servlet 2411");
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2411_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2411_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2420:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2420_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2420_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2421:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2421_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2421_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2470:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2470_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2470_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2471:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2471_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2471_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2472:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2472_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2472_u.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2473:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2473_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2473_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2480:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2480_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2480_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2481:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2481_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2481_l.jsp";
				break;	
			case FC_ACCT_2000WBMapping.FC_ACCT_2482:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2481_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2482_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2490:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2490_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2490_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2491:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2491_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2491_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2492:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2492_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2492_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2500:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2500_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2500_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2501:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2501_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2501_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2510:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2510_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2510_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2511:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2511_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2511_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2512:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2512_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2512_s.jsp";				
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2520:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2520_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2520_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2521:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2521_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2521_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2530:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2530_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2530_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2531:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2531_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2531_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2542:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2542_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2542_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2560:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2560_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2560_m.jsp";
				break;			
			case FC_ACCT_2000WBMapping.FC_ACCT_2561:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2561_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2561_l.jsp";
				break;			
			case FC_ACCT_2000WBMapping.FC_ACCT_2562:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2562_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2562_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2570:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2570_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2570_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2571:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2571_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2571_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2572:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2572_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2572_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2573:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2573_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2573_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2574:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2574_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2574_d.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2580:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2580_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2580_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2581:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2581_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2581_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2582:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2582_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2582_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2583:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2583_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2583_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2584:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2584_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2584_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2585:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2585_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2585_a.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2591:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2591_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2591_l.jsp";
				break;	
			case FC_ACCT_2000WBMapping.FC_ACCT_2840:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2840_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2840_m.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2841:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2841_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2841_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2842:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2842_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2842_a.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2920:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2920_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2920_m.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2921:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2921_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2921_l.jsp";
				break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2130:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2130_m(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2130_m.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2131:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2131_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2131_l.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2132:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2132_i(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2132_i.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2133:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2133_u(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2133_u.jsp";
                break;

            case FC_ACCT_2000WBMapping.FC_ACCT_2134:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2134_d(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2134_d.jsp";
                break;
                
            case FC_ACCT_2000WBMapping.FC_ACCT_2135:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2135_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2135_s.jsp";
				break;

            case FC_ACCT_2000WBMapping.FC_ACCT_2170:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2170_m(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2170_m.jsp";
				break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2171:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2171_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2171_l.jsp";
				break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2172:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2172_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2172_a.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2173:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2173_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2173_u.jsp";
				break;				
            case FC_ACCT_2000WBMapping.FC_ACCT_2310:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2310_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2310_l.jsp";
				break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2430:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2430_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2430_m.jsp";
				break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2431:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2431_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2431_l.jsp";
				break;

            case FC_ACCT_2000WBMapping.FC_ACCT_2440:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2440_m(req,res);
                nextPage = "/jsp/fc/acct/fc_acct_2440_m.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2441:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2441_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2441_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2540:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2540_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2540_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2541:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2541_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2541_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2550:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2550_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2550_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2555:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2555_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2555_s.jsp";
				break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2851:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2851_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2851_l.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2852:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2852_u(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2852_u.jsp";
                break;

            case FC_ACCT_2000WBMapping.FC_ACCT_2860:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2860_m(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2860_m.jsp";
                break;

            case FC_ACCT_2000WBMapping.FC_ACCT_2861:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2861_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2861_l.jsp";
                break;
        	case FC_ACCT_2000WBMapping.FC_ACCT_2450:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2450_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2450_m.jsp";
				break;            
			case FC_ACCT_2000WBMapping.FC_ACCT_2451:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2451_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2451_l.jsp";
				break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2460:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2460_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2460_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2461:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2461_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2461_i.jsp";
				break;
				
            case FC_ACCT_2000WBMapping.FC_ACCT_2870:
                nextPage = "/jsp/fc/acct/fc_acct_2870_t.jsp";
                break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2873:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2873_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2873_s.jsp";
				break;
                
            case FC_ACCT_2000WBMapping.FC_ACCT_2900:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2900_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2900_l.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2901:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2901_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2901_l.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2902:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2902_u(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2902_u.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2903:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2903_d(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2903_d.jsp";
                break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2904:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2904_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2904_l.jsp";
				break;                
			case FC_ACCT_2000WBMapping.FC_ACCT_2905:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2905_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2905_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2906:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2906_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2906_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2907:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2907_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2907_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2908:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2908_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2908_d.jsp";
				break;				
            case FC_ACCT_2000WBMapping.FC_ACCT_2910:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2910_m(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2910_m.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2911:
                nextPage = "/jsp/fc/acct/fc_acct_2911_t.jsp";
                break;

            case FC_ACCT_2000WBMapping.FC_ACCT_2940:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2940_m(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2940_m.jsp";
                break;

            case FC_ACCT_2000WBMapping.FC_ACCT_2941:
                nextPage = "/jsp/fc/acct/fc_acct_2941_t.jsp";
                break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2942:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2942_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2942_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2931:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2931_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2931_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2932:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2932_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2932_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2933:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2933_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2933_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2934:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2934_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2934_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2935:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2935_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2935_d.jsp";
				break;				
            case FC_ACCT_2000WBMapping.FC_ACCT_2950:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2950_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2950_l.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2951:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2951_u(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2951_u.jsp";
                break;
            case FC_ACCT_2000WBMapping.FC_ACCT_2952:
                wb = new FC_ACCT_2000WB();
                ((FC_ACCT_2000WB)wb).fc_acct_2952_d(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_2952_d.jsp";
                break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2970:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2970_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2970_m.jsp";
				break;                
			case FC_ACCT_2000WBMapping.FC_ACCT_2971:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2971_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2971_l.jsp";
				break;				
			case FC_ACCT_2000WBMapping.FC_ACCT_2300:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2300_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2300_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2301:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2301_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2301_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2303:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2303_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2303_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2304:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2304_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2304_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2305:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2305_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2305_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2151:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2151_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2151_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2152:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2152_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2152_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2153:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2153_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2153_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2960:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2960_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2960_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2961:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2961_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2961_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2963:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2963_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2963_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2964:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2964_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2964_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2020:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2020_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2020_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2021:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2021_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2021_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2022:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2022_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2022_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2023:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2023_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2023_i.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2024:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2024_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2024_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2025:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2025_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2025_d.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2026:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2026_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2026_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2053:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2053_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2053_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2054:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2054_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2054_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2055:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2055_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2055_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2063:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2063_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2063_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2072:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2072_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2072_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2915:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2915_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2915_s.jsp";
				break;			
			case FC_ACCT_2000WBMapping.FC_ACCT_2015:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2015_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2015_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2128:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2128_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2128_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2016:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2016_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2016_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2017:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2017_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2017_s.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2600:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2600_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2600_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2601:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2601_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2601_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2603:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2603_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2603_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2610:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2610_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2610_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2611:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2611_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2611_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2612:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2612_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2612_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2614:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2614_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2614_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2620:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2620_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2620_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2621:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2621_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2621_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2622:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2622_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2622_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2630:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2630_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2630_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2631:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2631_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2631_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2632:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2632_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2632_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2633:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2633_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2633_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2640:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2640_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2640_m.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2641:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2641_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2641_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2642:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2642_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2642_u.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2651:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2651_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2651_l.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2652:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2652_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2652_a.jsp";
				break;
			case FC_ACCT_2000WBMapping.FC_ACCT_2700:
				wb = new FC_ACCT_2000WB();
				((FC_ACCT_2000WB)wb).fc_acct_2700_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_2700_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
