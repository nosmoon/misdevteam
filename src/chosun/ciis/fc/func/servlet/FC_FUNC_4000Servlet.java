package chosun.ciis.fc.func.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.func.wb.*;

public class FC_FUNC_4000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/func4000/";
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
			case FC_FUNC_4000WBMapping.FC_FUNC_9999:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/func/fc_func_9999_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4000:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4000_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_4000_m.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4001:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4001_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4001_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4002:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4002_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_4002_i.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4003:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4003_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_4003_i.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4004:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4004_a(req, res);
				nextPage = "/jsp/fc/func/fc_func_4004_a.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4021:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4021_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4021_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4022:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4022_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4022_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4023:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4023_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4023_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4024:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4024_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_4024_i.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4025:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4025_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_4025_d.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4026:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4026_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_4026_m.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4040:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4040_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_4040_m.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4041:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4041_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4041_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4042:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4042_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4042_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4050:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4050_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_4050_m.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4051:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4051_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4051_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4052:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4052_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4052_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4060:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4060_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_4060_m.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4032:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4032_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4032_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4034:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4034_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4034_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4035:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4035_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_4035_i.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4036:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4036_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_4036_d.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4030:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4030_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_4030_m.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4011:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4011_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4011_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4012:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4012_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_4012_l.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4015:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4015_e(req, res);
				nextPage = "/jsp/fc/func/fc_func_4015_e.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4014:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4014_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_4014_d.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4013:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4013_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_4013_i.jsp";
				break;
			case FC_FUNC_4000WBMapping.FC_FUNC_4010:
				wb = new FC_FUNC_4000WB();
				((FC_FUNC_4000WB)wb).fc_func_4010_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_4010_m.jsp";
				break;
				
			
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
