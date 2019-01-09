package chosun.ciis.mc.budg.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.mc.budg.wb.*;

public class MC_BUDG_6000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/mc/budg6000/";
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
			case MC_BUDG_6000WBMapping.MC_BUDG_6010:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6010_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6010_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6011:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6011_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6011_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6012:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6012_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6012_u.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6020:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6020_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6020_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6021:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6021_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6021_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6022:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6022_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6022_u.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6023:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6023_u(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6023_u.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6024:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6024_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6024_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6025:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6025_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6025_m.jsp";
				break;				
			case MC_BUDG_6000WBMapping.MC_BUDG_6031:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6031_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6031_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6032:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6032_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6032_d.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6033:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6033_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6033_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6034:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6034_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6034_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6035:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6035_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6035_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6040:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6040_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6040_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6041:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6041_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6041_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6042:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6042_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6042_i.jsp";
				break;				
			case MC_BUDG_6000WBMapping.MC_BUDG_6043:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6043_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6043_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6044:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6044_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6044_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6045:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6045_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6045_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6046:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6046_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6046_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6047:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6047_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6047_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6048:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6048_d(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6048_d.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6051:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6051_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6051_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6052:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6052_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6052_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6053:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6053_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6053_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6054:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6054_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6054_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6055:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6055_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6055_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6056:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6056_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6056_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6057:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6057_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6057_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6058:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6058_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6058_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6111:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6111_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6111_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6112:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6112_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6112_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6113:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6113_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6113_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6115:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6115_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6115_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6116:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6116_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6116_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6130:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6130_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6130_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6132:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6132_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6132_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6140:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6140_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6140_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6141:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6141_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6141_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6142:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6142_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6142_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6143:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6143_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6143_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6150:;
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6150_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6150_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6151:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6151_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6151_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6152:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6152_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6152_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6153:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6153_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6153_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6210:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6210_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6210_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6211:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6211_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6211_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6212:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6212_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6212_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6213:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6213_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6213_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6214:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6214_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6214_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6271:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6271_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6271_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6272:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6272_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6272_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6273:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6273_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6273_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6274:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6274_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6274_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6275:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6275_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6275_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_9999:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_9999_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6241:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6241_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6241_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6251:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6251_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6251_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6261:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6261_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6261_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6231:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6231_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6231_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6232:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6232_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6232_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6221:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6221_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6221_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6222:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6222_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6222_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6000:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6000_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6000_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6001:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6001_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6001_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6002:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6002_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6002_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6003:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6003_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6003_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6281:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6281_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6281_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6290:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6290_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6290_m.jsp";
				break;				
			case MC_BUDG_6000WBMapping.MC_BUDG_6291:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6291_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6291_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6292:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6292_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6292_i.jsp";
				break;				
			case MC_BUDG_6000WBMapping.MC_BUDG_6293:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6293_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6293_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6300:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6300_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6300_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6301:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6301_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6301_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6302:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6302_i(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6302_i.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6303:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6303_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6303_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6304:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6304_l(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6304_l.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6062:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6062_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6062_m.jsp";
				break;
			case MC_BUDG_6000WBMapping.MC_BUDG_6082:
				wb = new MC_BUDG_6000WB();
				((MC_BUDG_6000WB)wb).mc_budg_6082_m(req, res);
				nextPage = "/jsp/mc/budg/mc_budg_6082_m.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
