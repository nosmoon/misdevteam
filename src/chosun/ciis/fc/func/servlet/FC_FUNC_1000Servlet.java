package chosun.ciis.fc.func.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.func.wb.*;

public class FC_FUNC_1000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {

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
			String servletMappedUrl = "/fc/func1000/";
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
			case FC_FUNC_1000WBMapping.FC_FUNC_9999:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/func/fc_func_9999_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1120:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1120_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1120_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1121:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1121_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1121_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1122:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1122_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1122_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1151:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1151_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1151_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1000:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1000_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1000_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1001:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1001_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1001_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1002:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1002_u(req, res);
				nextPage = "/jsp/fc/func/fc_func_1002_u.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1020:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1020_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1020_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1021:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1021_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1021_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1022:
				wb = new FC_FUNC_1000WB();
				System.out.println("servler start");
				((FC_FUNC_1000WB)wb).fc_func_1022_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1022_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1023:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1023_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1023_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1024:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1024_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1024_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1030:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1030_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1030_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1031:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1031_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1031_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1032:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1032_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1032_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1033:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1033_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1033_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1040:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1040_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1040_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1041:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1041_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1041_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1042:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1042_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1042_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1043:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1043_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1043_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1044:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1044_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1044_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1050:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1050_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1050_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1051:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1051_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1051_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1052:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1052_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1052_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1053:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1053_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1053_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1054:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1054_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1054_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1420:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1420_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1420_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1421:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1421_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1421_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1430:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1430_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1430_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1440:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1440_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1440_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1441:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1441_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1441_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1060:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1060_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1060_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1061:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1061_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1061_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1062:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1062_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1062_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1063:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1063_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1063_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1064:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1064_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1064_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1065:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1065_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1065_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1070:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1070_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1070_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1071:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1071_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1071_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1074:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1074_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1074_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1075:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1075_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1075_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1072:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1072_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1072_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1073:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1073_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1073_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1080:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1080_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1080_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1081:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1081_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1081_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1082:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1082_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1082_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1083:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1083_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1083_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1084:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1084_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1084_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1085:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1085_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1085_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1091:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1091_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1091_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1092:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1092_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1092_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1090:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1090_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1090_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1093:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1093_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1093_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1094:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1094_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1094_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1097:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1097_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1097_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1095:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1095_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1095_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1096:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1096_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1096_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1361:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1361_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1361_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1100:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1100_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1100_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1103:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1103_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1103_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1104:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1104_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1104_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1101:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1101_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1101_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1102:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1102_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1102_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1110:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1110_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1110_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1111:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1111_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1111_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1112:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1112_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1112_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1113:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1113_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1113_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1114:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1114_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1114_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1115:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1115_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1115_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1116:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1116_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1116_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1200:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1200_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1200_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1201:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1201_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1201_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1400:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1400_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1400_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1401:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1401_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1401_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1003:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1003_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1003_l.jsp";
				break;

        	case FC_FUNC_1000WBMapping.FC_FUNC_1130:
                wb = new FC_FUNC_1000WB();
                ((FC_FUNC_1000WB)wb).fc_func_1130_l(req,res);
                nextPage = "/jsp/fc/func/fc_func_1130_l.jsp";
       		    break;

            case FC_FUNC_1000WBMapping.FC_FUNC_1140:
                wb = new FC_FUNC_1000WB();
                 ((FC_FUNC_1000WB)wb).fc_func_1140_l(req,res);
                nextPage = "/jsp/fc/func/fc_func_1140_l.jsp";
                break;

            case FC_FUNC_1000WBMapping.FC_FUNC_1160:
                wb = new FC_FUNC_1000WB();
                 ((FC_FUNC_1000WB)wb).fc_func_1160_l(req,res);
                nextPage = "/jsp/fc/func/fc_func_1160_l.jsp";
                break;

            case FC_FUNC_1000WBMapping.FC_FUNC_1170:
                wb = new FC_FUNC_1000WB();
                 ((FC_FUNC_1000WB)wb).fc_func_1170_l(req,res);
                nextPage = "/jsp/fc/func/fc_func_1170_l.jsp";
                break;
            case FC_FUNC_1000WBMapping.FC_FUNC_1171:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1171_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1171_l.jsp";
				break;
            case FC_FUNC_1000WBMapping.FC_FUNC_1172:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1172_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1172_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1180:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1180_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1180_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1181:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1181_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1181_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1183:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1183_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1183_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1184:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1184_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1184_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1185:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1185_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1185_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1190:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1190_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1190_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1191:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1191_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1191_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1192:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1192_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1192_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1193:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1193_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1193_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1210:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1210_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1210_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1211:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1211_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1211_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1212:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1212_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1212_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1213:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1213_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1213_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1280:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1280_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1280_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1290:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1290_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1290_m.jsp";
				break;				
			case FC_FUNC_1000WBMapping.FC_FUNC_1410:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1410_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1410_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1411:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1411_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1411_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1412:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1412_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1412_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1413:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1413_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1413_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1414:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1414_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1414_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1450:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1450_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1450_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1451:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1451_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1451_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1452:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1452_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1452_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1453:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1453_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1453_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1454:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1454_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1454_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1455:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1455_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1455_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1010:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1010_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1010_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1011:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1011_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1011_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1012:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1012_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1012_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1013:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1013_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1013_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1014:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1014_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1014_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1015:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1015_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1015_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1370:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1370_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1370_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1380:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1380_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1380_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1390:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1390_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1390_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1221:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1221_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1221_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1230:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1230_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1230_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1240:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1240_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1240_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1250:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1250_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1250_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1260:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1260_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_1260_m.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1461:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1461_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1461_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1462:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1462_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1462_l.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1463:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1463_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_1463_i.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1464:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1464_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_1464_d.jsp";
				break;
			case FC_FUNC_1000WBMapping.FC_FUNC_1465:
				wb = new FC_FUNC_1000WB();
				((FC_FUNC_1000WB)wb).fc_func_1465_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_1465_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}

		return nextPage;
	}
}
