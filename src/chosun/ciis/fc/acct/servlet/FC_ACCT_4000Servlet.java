package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_4000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {

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
			String servletMappedUrl = "/fc/acct4000/";
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
			case FC_ACCT_4000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4000:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4000_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4000_m.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4001:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4001_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4001_l.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4002:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4002_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4002_l.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4004:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4004_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4004_d.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4005:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4005_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4005_i.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4006:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4006_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4006_l.jsp";
				break;				
			case FC_ACCT_4000WBMapping.FC_ACCT_4010:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4010_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4010_l.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4011:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4011_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4011_i.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4012:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4012_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4012_d.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4020:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4020_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4020_m.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4021:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4021_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4021_l.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4022:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4022_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4022_d.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4023:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4023_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4023_i.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4027:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4027_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4027_m.jsp";
				break;
			case FC_ACCT_4000WBMapping.FC_ACCT_4028:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4028_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4028_i.jsp";
				break;				
			case FC_ACCT_4000WBMapping.FC_ACCT_4029:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4029_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4029_d.jsp";
				break;

            case FC_ACCT_4000WBMapping.FC_ACCT_4030:
                wb = new FC_ACCT_4000WB();
                ((FC_ACCT_4000WB)wb).fc_acct_4030_m(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_4030_m.jsp";
                break;
            case FC_ACCT_4000WBMapping.FC_ACCT_4031:
                nextPage = "/jsp/fc/acct/fc_acct_4031_t.jsp";
                break;
            case FC_ACCT_4000WBMapping.FC_ACCT_4040:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4040_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4040_m.jsp";
				break;
            case FC_ACCT_4000WBMapping.FC_ACCT_4041:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4041_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4041_p.jsp";
				break;
            case FC_ACCT_4000WBMapping.FC_ACCT_4044:
				wb = new FC_ACCT_4000WB();
				((FC_ACCT_4000WB)wb).fc_acct_4044_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_4044_p.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}

		return nextPage;
	}
}
