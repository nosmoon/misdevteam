package chosun.ciis.fc.func.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.func.wb.*;

public class FC_FUNC_8000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/func8000/";
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
			case FC_FUNC_8000WBMapping.FC_FUNC_9999:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/func/fc_func_9999_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8000:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8000_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_8000_m.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8001:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8001_s(req, res);
				nextPage = "/jsp/fc/func/fc_func_8001_s.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8002:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8002_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8002_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8003:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8003_u(req, res);
				nextPage = "/jsp/fc/func/fc_func_8003_u.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8004:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8004_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8004_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8011:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8011_a(req, res);
				nextPage = "/jsp/fc/func/fc_func_8011_a.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8012:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8012_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8012_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8013:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8013_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8013_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8014:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8014_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_8014_m.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8021:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8021_s(req, res);
				nextPage = "/jsp/fc/func/fc_func_8021_s.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8022:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8022_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8022_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8023:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8023_u(req, res);
				nextPage = "/jsp/fc/func/fc_func_8023_u.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8024:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8024_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8024_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8031:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8031_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8031_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8032:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8032_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8032_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8033:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8033_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8033_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8034:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8034_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8034_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8035:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8035_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8035_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8036:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8036_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_8036_m.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8071:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8071_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8071_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8072:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8072_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8072_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8073:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8073_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_8073_m.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8131:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8131_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8131_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8132:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8132_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8132_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8040:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8040_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_8040_m.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8041:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8041_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8041_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8042:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8042_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8042_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8043:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8043_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8043_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8044:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8044_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8044_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8045:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8045_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8045_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8050:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8050_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_8050_m.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8051:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8051_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8051_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8052:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8052_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8052_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8053:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8053_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8053_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8054:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8054_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8054_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8060:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8060_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_8060_m.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8061:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8061_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8061_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8062:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8062_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8062_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8063:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8063_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8063_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8064:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8064_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_8064_i.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8065:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8065_u(req, res);
				nextPage = "/jsp/fc/func/fc_func_8065_u.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8066:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8066_u(req, res);
				nextPage = "/jsp/fc/func/fc_func_8066_u.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8067:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8067_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_8067_d.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8121:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8121_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8121_l.jsp";
				break;
			case FC_FUNC_8000WBMapping.FC_FUNC_8122:
				wb = new FC_FUNC_8000WB();
				((FC_FUNC_8000WB)wb).fc_func_8122_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_8122_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
