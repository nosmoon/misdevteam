package chosun.ciis.mc.budg.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.budg.wb.*;

public class MC_BUDG_5000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/budg5000/";
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
			case MC_BUDG_5000WBMapping.MC_BUDG_9999:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_9999_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5011:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5011_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5011_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5020:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5020_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5020_m.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5031:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5031_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5031_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5061:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5061_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5061_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5062:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5062_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5062_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5070:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5070_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5070_m.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5071:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5071_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5071_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5151:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5151_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5151_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5021:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5021_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5021_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5072:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5072_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5072_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5160:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5160_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5160_m.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5161:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5161_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5161_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5171:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5171_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5171_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5172:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5172_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5172_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5173:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5173_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5173_l.jsp";
				break;				
			case MC_BUDG_5000WBMapping.MC_BUDG_5043:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5043_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5043_l.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5098:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5098_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5098_m.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5180:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5180_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5180_m.jsp";
				break;
			case MC_BUDG_5000WBMapping.MC_BUDG_5181:
				wb = new MC_BUDG_5000WB();
				((MC_BUDG_5000WB)wb).mc_budg_5181_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_5181_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
