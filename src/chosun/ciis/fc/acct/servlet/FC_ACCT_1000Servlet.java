package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_1000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {

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
			String servletMappedUrl = "/fc/acct1000/";
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
			case FC_ACCT_1000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1011:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1011_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1011_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1012:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1012_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1012_a.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1031:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1031_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1031_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1032:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1032_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1032_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1033:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1033_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1033_s.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1040:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1040_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1040_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1041:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1041_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1041_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1042:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1042_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1042_a.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1043:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1043_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1043_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1044:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1044_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1044_d.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1045:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1045_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1045_i.jsp";
				break;				
			case FC_ACCT_1000WBMapping.FC_ACCT_1046:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1046_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1046_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1047:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1047_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1047_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1048:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1048_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1048_u.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1049:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1049_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1049_l.jsp";
				break;	
			case FC_ACCT_1000WBMapping.FC_ACCT_1050:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1050_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1050_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1051:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1051_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1051_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1052:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1052_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1052_a.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1053:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1053_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1053_s.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1060:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1060_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1060_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1061:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1061_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1061_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1062:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1062_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1062_a.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1071:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1071_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1071_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1081:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1081_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1081_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1090:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1090_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1090_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1091:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1091_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1091_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1092:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1092_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1092_d.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1093:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1093_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1093_i.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1100:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1100_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1100_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1101:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1101_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1101_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1111:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1111_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1111_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1112:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1112_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1112_l.jsp";
				break;				
			case FC_ACCT_1000WBMapping.FC_ACCT_1113:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1113_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1113_d.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1114:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1114_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1114_i.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1115:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1115_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1115_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1116:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1116_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1116_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1120:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1120_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1120_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1121:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1121_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1121_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1122:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1122_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1122_i.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1123:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1123_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1123_d.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1180:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1180_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1180_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1181:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1181_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1181_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1201:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1201_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1201_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1202:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1202_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1202_i.jsp";
				break;				
			case FC_ACCT_1000WBMapping.FC_ACCT_1210:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1210_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1210_m.jsp";
				break;

			case FC_ACCT_1000WBMapping.FC_ACCT_1211:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1211_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1211_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1212:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1212_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1212_s.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1213:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1213_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1213_i.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1214:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1214_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1214_d.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1190:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1190_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1190_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1020:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1020_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1020_m.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1021:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1021_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1021_s.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1022:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1022_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1022_l.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1023:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1023_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1023_u.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1024:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1024_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1024_s.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1025:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1025_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1025_u.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1026:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1026_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1026_u.jsp";
				break;
			case FC_ACCT_1000WBMapping.FC_ACCT_1027:
				wb = new FC_ACCT_1000WB();
				((FC_ACCT_1000WB)wb).fc_acct_1027_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_1027_a.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}

		return nextPage;
	}
}
