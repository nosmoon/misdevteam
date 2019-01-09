package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_5000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/acct5000/";
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
			case FC_ACCT_5000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5001:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5001_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5001_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5002:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5002_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5002_a.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5003:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5003_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5003_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5004:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5004_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5004_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5011:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5011_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5011_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5012:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5012_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5012_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5020:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5020_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5020_m.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5022:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5022_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5022_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5030:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5030_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5030_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5032:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5032_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5032_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5040:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5040_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5040_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5111:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5111_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5111_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5112:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5112_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5112_a.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5300:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5300_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5300_m.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5301:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5301_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5301_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5303:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5303_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5303_a.jsp";				
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5310:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5310_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5310_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5311:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5311_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5311_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5312:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5312_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5312_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5313:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5313_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5313_d.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5314:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5314_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5314_i.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5320:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5320_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5320_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5322:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5322_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5322_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5331:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5331_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5331_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5332:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5332_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5332_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5343:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5343_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5343_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5352:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5352_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5352_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5360:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5360_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5360_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5361:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5361_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5361_l.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5362:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5362_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5362_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5363:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5363_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5363_d.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5364:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5364_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5364_i.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5365:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5365_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5365_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5382:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5382_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5382_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5394:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5394_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5394_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5402:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5402_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5402_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5412:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5412_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5412_s.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5501:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5501_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5501_a.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5510:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5510_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5510_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5520:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5520_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5520_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5521:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5521_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5521_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5530:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5530_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5530_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5540:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5540_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5540_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5580:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5580_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5580_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5600:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5600_p(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5600_p.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5601:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5601_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5601_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5590:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5590_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5590_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5591:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5591_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5591_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5592:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5592_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5592_d.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5593:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5593_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5593_i.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5850:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5850_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5850_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5801:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5801_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5801_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5802:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5802_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5802_s.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5811:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5811_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5811_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5812:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5812_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5812_l.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5821:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5821_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5821_l.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5831:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5831_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5831_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5832:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5832_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5832_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5841:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5841_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5841_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5842:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5842_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5842_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5851:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5851_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5851_l.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5852:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5852_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5852_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5861:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5861_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5861_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5862:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5862_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5862_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5863:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5863_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5863_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5864:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5864_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5864_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5870:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5870_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5870_m.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5871:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5871_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5871_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5872:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5872_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5872_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5873:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5873_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5873_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5874:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5874_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5874_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5875:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5875_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5875_l.jsp";
				break;				
			case FC_ACCT_5000WBMapping.FC_ACCT_5881:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5881_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5881_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5882:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5882_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5882_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5883:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5883_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5883_l.jsp";
				break;
			case FC_ACCT_5000WBMapping.FC_ACCT_5891:
				wb = new FC_ACCT_5000WB();
				((FC_ACCT_5000WB)wb).fc_acct_5891_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_5891_l.jsp";
				break;				
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
