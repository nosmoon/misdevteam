package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_8000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/acct8000/";
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
			case FC_ACCT_8000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_9011:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_9011_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9011_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_9998:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_9998_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9998_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8000:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8000_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8000_m.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8001:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8001_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8001_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8003:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8003_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8003_i.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8004:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8004_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8004_i.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8005:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8005_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8005_i.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8010:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8010_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8010_m.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8021:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8021_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8021_s.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8030:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8030_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8030_m.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8061:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8061_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8061_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8062:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8062_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8062_l.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8064:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8064_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8064_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8065:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8065_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8065_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8066:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8066_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8066_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8070:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8070_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8070_m.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8071:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8071_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8071_l.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8072:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8072_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8072_l.jsp";
				break;		
			case FC_ACCT_8000WBMapping.FC_ACCT_8073:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8073_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8073_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8074:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8074_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8074_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8080:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8080_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8080_m.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8081:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8081_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8081_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8082:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8082_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8082_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8083:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8083_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8083_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8084:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8084_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8084_l.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8090:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8090_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8090_m.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8091:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8091_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8091_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8110:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8110_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8110_m.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8121:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8121_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8121_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8122:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8122_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8122_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8123:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8123_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8123_l.jsp";
				break;
			case FC_ACCT_8000WBMapping.FC_ACCT_8124:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8124_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8124_l.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8130:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8130_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8130_m.jsp";
				break;				
			case FC_ACCT_8000WBMapping.FC_ACCT_8999:
				wb = new FC_ACCT_8000WB();
				((FC_ACCT_8000WB)wb).fc_acct_8999_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_8999_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
