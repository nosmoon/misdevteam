package chosun.ciis.fc.co.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.co.wb.*;

public class FC_CO_1000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/co1000/";
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
			case FC_CO_1000WBMapping.FC_CO_9999:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/co/fc_co_9999_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1001:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1001_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1001_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1002:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1002_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1002_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1003:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1003_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1003_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1010:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1010_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_1010_m.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1011:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1011_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1011_l.jsp";
				break;			
			case FC_CO_1000WBMapping.FC_CO_1020:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1020_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_1020_m.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1021:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1021_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1021_l.jsp";
				break;	
			case FC_CO_1000WBMapping.FC_CO_1030:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1030_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_1030_m.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1031:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1031_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1031_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1040:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1040_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_1040_m.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1041:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1041_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1041_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1050:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1050_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_1050_m.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1051:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1051_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1051_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1060:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1060_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_1060_m.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1061:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1061_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1061_l.jsp";
				break;				
			case FC_CO_1000WBMapping.FC_CO_1101:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1101_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1101_l.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1080:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1080_m(req, res);
				nextPage = "/jsp/fc/co/fc_co_1080_m.jsp";
				break;
			case FC_CO_1000WBMapping.FC_CO_1081:
				wb = new FC_CO_1000WB();
				((FC_CO_1000WB)wb).fc_co_1081_l(req, res);
				nextPage = "/jsp/fc/co/fc_co_1081_l.jsp";
				break;		
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
