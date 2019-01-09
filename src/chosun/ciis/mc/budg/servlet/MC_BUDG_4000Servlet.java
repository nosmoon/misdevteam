package chosun.ciis.mc.budg.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.budg.wb.*;

public class MC_BUDG_4000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/budg4000/";
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
			case MC_BUDG_4000WBMapping.MC_BUDG_9999:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_9999_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4030:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4030_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4030_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4031:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4031_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4031_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4032:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4032_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4032_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4041:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4041_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4041_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4042:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4042_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4042_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4070:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4070_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4070_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4071:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4071_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4071_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4072:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4072_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4072_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4073:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4073_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4073_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4074:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4074_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4074_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4075:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4075_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4075_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4080:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4080_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4080_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4081:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4081_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4081_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4082:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4082_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4082_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4083:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4083_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4083_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4060:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4060_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4060_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4061:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4061_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4061_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4062:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4062_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4062_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4063:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4063_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4063_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4001:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4001_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4001_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4002:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4002_e(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4002_e.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4003:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4003_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4003_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4004:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4004_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4004_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4005:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4005_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4005_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4006:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4006_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4006_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4000:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4000_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4000_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4020:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4020_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4020_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4021:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4021_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4021_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4024:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4024_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4024_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4027:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4027_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4027_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4010:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4010_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4010_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4011:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4011_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4011_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4012:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4012_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4012_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4013:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4013_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4013_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4014:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4014_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4014_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4015:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4015_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4015_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4016:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4016_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4016_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4017:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4017_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4017_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4018:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4018_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4018_d.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4019:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4019_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4019_d.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_40500:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_40500_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_40500_m.jsp";
				break;	
			case MC_BUDG_4000WBMapping.MC_BUDG_4050:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4050_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4050_m.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4051:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4051_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4051_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4052:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4052_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4052_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4053:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4053_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4053_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4054:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4054_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4054_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4055:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4055_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4055_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4056:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4056_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4056_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4057:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4057_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4057_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4058:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4058_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4058_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4059:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4059_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4059_d.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4100:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4100_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4100_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4101:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4101_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4101_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4102:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4102_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4102_d.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4103:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4103_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4103_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4104:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4104_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4104_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4105:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4105_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4105_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4106:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4106_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4106_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4120:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4120_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4120_i.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4122:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4122_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4122_d.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4123:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4123_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4123_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4130:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4130_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4130_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4091:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4091_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4091_l.jsp";
				break;
			case MC_BUDG_4000WBMapping.MC_BUDG_4092:
				wb = new MC_BUDG_4000WB();
				((MC_BUDG_4000WB)wb).mc_budg_4092_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_4092_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
