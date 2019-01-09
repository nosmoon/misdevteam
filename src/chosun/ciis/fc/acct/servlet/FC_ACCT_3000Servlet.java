package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_3000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/acct3000/";
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
			case FC_ACCT_3000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3000:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3000_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3000_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3001:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3001_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3001_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3002:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3002_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3002_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3003:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3003_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3003_i.jsp";
				break;		
			case FC_ACCT_3000WBMapping.FC_ACCT_3004:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3004_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3004_d.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3005:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3005_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3005_a.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3006:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3006_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3006_l.jsp";
				break;		
			case FC_ACCT_3000WBMapping.FC_ACCT_3010:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3010_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3010_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3011:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3011_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3011_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3012:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3012_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3012_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3013:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3013_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3013_i.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3014:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3014_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3014_d.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3015:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3015_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3015_a.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3016:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3016_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3016_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3020:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3020_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3020_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3021:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3021_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3021_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3022:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3022_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3022_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3023:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3023_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3023_i.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3024:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3024_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3024_d.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3025:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3025_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3025_a.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3026:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3026_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3026_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3030:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3030_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3030_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3031:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3031_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3031_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3032:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3032_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3032_l.jsp";
				break;				
			case FC_ACCT_3000WBMapping.FC_ACCT_3033:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3033_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3033_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3034:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3034_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3034_i.jsp";  
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3035:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3035_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3035_d.jsp"; 
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3040:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3040_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3040_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3041:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3041_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3041_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3042:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3042_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3042_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3043:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3043_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3043_i.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3044:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3044_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3044_d.jsp";
				break;				
			case FC_ACCT_3000WBMapping.FC_ACCT_3045:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3045_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3045_l.jsp";
				break;				
			case FC_ACCT_3000WBMapping.FC_ACCT_3046:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3046_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3046_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3050:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3050_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3050_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3051:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3051_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3051_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3052:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3052_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3052_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3053:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3053_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3053_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3054:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3054_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3054_i.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3055:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3055_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3055_d.jsp";
				break;				
			case FC_ACCT_3000WBMapping.FC_ACCT_3056:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3056_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3056_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3150:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3150_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3150_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3151:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3151_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3151_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3152:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3152_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3152_i.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3153:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3153_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3153_d.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3154:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3154_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3154_i.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3070:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3070_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3070_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3071:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3071_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3071_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3072:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3072_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3072_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3073:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3073_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3073_i.jsp";
				break;		
			case FC_ACCT_3000WBMapping.FC_ACCT_3074:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3074_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3074_d.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3075:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3075_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3075_a.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3076:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3076_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3076_l.jsp";
				break;	
			case FC_ACCT_3000WBMapping.FC_ACCT_3250:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3250_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3250_m.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3251:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3251_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3251_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3253:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3253_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3253_i.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3254:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3254_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3254_u.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3255:
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3255_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3255_d.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3256: //2014.05.21 봉은정추가
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3256_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3256_l.jsp";
				break;
			case FC_ACCT_3000WBMapping.FC_ACCT_3257: //2014.11.27 봉은정추가
				wb = new FC_ACCT_3000WB();
				((FC_ACCT_3000WB)wb).fc_acct_3257_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_3257_a.jsp";
				break;
			default:
			throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
