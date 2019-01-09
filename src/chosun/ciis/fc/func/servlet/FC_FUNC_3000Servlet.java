package chosun.ciis.fc.func.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.func.wb.*;

public class FC_FUNC_3000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/func3000/";
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
			case FC_FUNC_3000WBMapping.FC_FUNC_9999:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/func/fc_func_9999_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3000:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3000_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3000_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3020:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3020_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3020_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3040:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3040_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3040_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3060:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3060_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_3060_i.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3061:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3061_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3061_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3062:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3062_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_3062_i.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3063:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3063_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_3063_m.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3070:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3070_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3070_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3071:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3071_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_3071_i.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3073:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3073_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3073_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3074:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3074_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_3074_i.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3075:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3075_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_3075_d.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3080:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3080_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3080_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3090:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3090_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_3090_l.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3091:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3091_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_3091_i.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3092:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3092_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_3092_i.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3093:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3093_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_3093_d.jsp";
				break;
			case FC_FUNC_3000WBMapping.FC_FUNC_3094:
				wb = new FC_FUNC_3000WB();
				((FC_FUNC_3000WB)wb).fc_func_3094_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_3094_m.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
