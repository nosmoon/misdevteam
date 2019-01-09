package chosun.ciis.fc.func.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.func.wb.*;

public class FC_FUNC_6000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/func6000/";
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
			case FC_FUNC_6000WBMapping.FC_FUNC_9999:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/func/fc_func_9999_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6080:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6080_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6080_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6081:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6081_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6081_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6082:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6082_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6082_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6083:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6083_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6083_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6084:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6084_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6084_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6090:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6090_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6090_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6091:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6091_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6091_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6092:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6092_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6092_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6093:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6093_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6093_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6100:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6100_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6100_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6101:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6101_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6101_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6111:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6111_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6111_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6112:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6112_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6112_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6113:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6113_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6113_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6114:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6114_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6114_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6120:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6120_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6120_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6121:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6121_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6121_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6122:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6122_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6122_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6123:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6123_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6123_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6124:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6124_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6124_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6150:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6150_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6150_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6151:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6151_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6151_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6160:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6160_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6160_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6161:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6161_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6161_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6000:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6000_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6000_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6001:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6001_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6001_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6002:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6002_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6002_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6003:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6003_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6003_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6004:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6004_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6004_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6005:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6005_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6005_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6010:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6010_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6010_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6011:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6011_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6011_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6012:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6012_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6012_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6020:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6020_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6020_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6021:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6021_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6021_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6022:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6022_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6022_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6023:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6023_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6023_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6024:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6024_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6024_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6030:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6030_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6030_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6031:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6031_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6031_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6032:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6032_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6032_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6033:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6033_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6033_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6034:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6034_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6034_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6050:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6050_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6050_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6051:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6051_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6051_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6060:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6060_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6060_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6061:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6061_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6061_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6062:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6062_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6062_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6063:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6063_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6063_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6064:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6064_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6064_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6070:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6070_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6070_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6071:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6071_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6071_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6072:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6072_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6072_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6076:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6076_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6076_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6073:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6073_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6073_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6074:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6074_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6074_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6075:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6075_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6075_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6077:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6077_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6077_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6040:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6040_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6040_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6041:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6041_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6041_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6042:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6042_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6042_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6043:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6043_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6043_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6044:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6044_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6044_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6500:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6500_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6500_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6501:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6501_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6501_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6502:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6502_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6502_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6503:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6503_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6503_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6504:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6504_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6504_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6505:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6505_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6505_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6510:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6510_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6510_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6511:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6511_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6511_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6512:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6512_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6512_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6520:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6520_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6520_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6521:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6521_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6521_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6522:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6522_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6522_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6523:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6523_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6523_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6524:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6524_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6524_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6530:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6530_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6530_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6531:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6531_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6531_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6532:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6532_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6532_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6533:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6533_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6533_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6534:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6534_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6534_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6540:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6540_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6540_m.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6541:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6541_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6541_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6542:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6542_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6542_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6543:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6543_i(req, res);
				nextPage = "/jsp/fc/func/fc_func_6543_i.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6544:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6544_d(req, res);
				nextPage = "/jsp/fc/func/fc_func_6544_d.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6550:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6550_l(req, res);
				nextPage = "/jsp/fc/func/fc_func_6550_l.jsp";
				break;
			case FC_FUNC_6000WBMapping.FC_FUNC_6551:
				wb = new FC_FUNC_6000WB();
				((FC_FUNC_6000WB)wb).fc_func_6551_m(req, res);
				nextPage = "/jsp/fc/func/fc_func_6551_m.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
