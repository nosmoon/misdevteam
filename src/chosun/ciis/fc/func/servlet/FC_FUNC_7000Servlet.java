package chosun.ciis.fc.func.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.func.wb.*;

public class FC_FUNC_7000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/func7000/";
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
			case FC_FUNC_7000WBMapping.FC_FUNC_9999:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/func/fc_func_9999_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7000:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7000_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_7000_m.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7001:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7001_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_7001_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7002:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7002_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_7002_i.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7003:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7003_u(req, res);
				nextPage = "/jsp/fc/func/fc_func_7003_u.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7004:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7004_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_7004_d.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7010:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7010_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_7010_m.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7011:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7011_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_7011_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7012:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7012_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_7012_i.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7013:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7013_u(req, res);
				nextPage = "/jsp/fc/func/fc_func_7013_u.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7014:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7014_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_7014_d.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7020:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7020_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_7020_m.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7021:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7021_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_7021_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7022:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7022_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_7022_i.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7023:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7023_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_7023_d.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7040:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7040_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_7040_m.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7041:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7041_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_7041_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7030:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7030_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_7030_m.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7031:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7031_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_7031_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7034:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7034_e(req, res);
				nextPage = "/jsp/fc/func/fc_func_7034_e.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7035:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7035_e(req, res);
				nextPage = "/jsp/fc/func/fc_func_7035_e.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7032:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7032_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_7032_i.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7033:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7033_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_7033_d.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7070:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7070_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_7070_m.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7071:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7071_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_7071_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7072:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7072_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_7072_l.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7073:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7073_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_7073_i.jsp";
				break;
			case FC_FUNC_7000WBMapping.FC_FUNC_7074:
				wb = new FC_FUNC_7000WB();
				((FC_FUNC_7000WB)wb).fc_func_7074_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_7074_d.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
