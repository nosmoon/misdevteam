package chosun.ciis.tn.dns.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.co.servlet.FC_CO_1000WBMapping;
import chosun.ciis.fc.co.wb.FC_CO_1000WB;
import chosun.ciis.mt.etccar.servlet.MtEtccarWBMapping;
import chosun.ciis.mt.etccar.wb.MT_ETCCAR_9000WB;
import chosun.ciis.tn.dns.servlet.TnDnsWBMapping;
import chosun.ciis.tn.dns.wb.*;

public class TnDnsServlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
		String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;

        try {
            String servletMappedUrl = "/tn/dns/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("");
            System.out.println("############### Servlet Start ###############");
            System.out.println("TN_DNS_Servlet : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("TN_DNS_Servlet : nextPage : " + nextPage);
        }
        catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/common/jsp/app_error.jsp";
        }
        catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/common/jsp/sys_error.jsp";
        }
        catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/common/jsp/sys_error.jsp";
        }

		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(req, res);
	}	
	
	public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException, SQLException {
			
		String nextPage = null;
		BaseWB wb1 = null;
		BaseWB wb2 = null;
		BaseWB wb3 = null;
		BaseWB wb5 = null;
		switch(pid) {
			case TnDnsWBMapping.TN_DNS_1000:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1000_m(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1000_m.jsp";
			break;
			case TnDnsWBMapping.TN_DNS_1010:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1010_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1010_l.jsp";
				break;
			case TnDnsWBMapping.TN_DNS_1020:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1020_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1020_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_1030:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1030_a(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1030_a.jsp";
				break;
			case TnDnsWBMapping.TN_DNS_1040:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1040_a(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1040_a.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_1041:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1041_u(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1041_u.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_1045:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1045_u(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1045_u.jsp";
				break;				
			case TnDnsWBMapping.TN_DNS_1050:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1050_a(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1050_a.jsp";
				break;					
			case TnDnsWBMapping.TN_DNS_1060:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1060_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1060_l.jsp";
				break;		
			case TnDnsWBMapping.TN_DNS_1070:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1070_a(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1070_a.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_1075:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1075_a(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1075_a.jsp";
				break;					
			case TnDnsWBMapping.TN_DNS_1080:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_1080_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_1080_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3040:
				wb1 = new TN_DNS_1000WB();
				((TN_DNS_1000WB)wb1).tn_dns_3040_a(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3040_a.jsp";
				break;				
				
			case TnDnsWBMapping.TN_DNS_2000:
				wb2 = new TN_DNS_2000WB();
				((TN_DNS_2000WB)wb2).tn_dns_2000_m(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_2000_m.jsp";
				break; 
			case TnDnsWBMapping.TN_DNS_2010:
				wb2 = new TN_DNS_2000WB();
				((TN_DNS_2000WB)wb2).tn_dns_2010_l(req, res);
				//nextPage = "/jsp/tn/dns/tn_dns_2010_l.jsp";
				nextPage = "/jsp/tn/dns/tn_dns_2050_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_2020:
				wb2 = new TN_DNS_2000WB();
				((TN_DNS_2000WB)wb2).tn_dns_2020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case TnDnsWBMapping.TN_DNS_2030:
				wb2 = new TN_DNS_2000WB(); 
				((TN_DNS_2000WB)wb2).tn_dns_2030_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_2030_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_2110:
				wb2 = new TN_DNS_2000WB();
				((TN_DNS_2000WB)wb2).tn_dns_2110_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_2110_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3010:
				wb3 = new TN_DNS_3000WB();
				((TN_DNS_3000WB)wb3).tn_dns_3010_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3010_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3030:
				wb3 = new TN_DNS_3000WB();
				((TN_DNS_3000WB)wb3).tn_dns_3030_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case TnDnsWBMapping.TN_DNS_3060:
				wb3 = new TN_DNS_3000WB(); 
				((TN_DNS_3000WB)wb3).tn_dns_3060_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3060_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3110:
				wb3 = new TN_DNS_3000WB();
				((TN_DNS_3000WB)wb3).tn_dns_3110_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3110_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3120:
				wb3 = new TN_DNS_3000WB(); 
				((TN_DNS_3000WB)wb3).tn_dns_3120_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3120_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3130:
				wb3 = new TN_DNS_3000WB(); 
				((TN_DNS_3000WB)wb3).tn_dns_3130_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3130_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3140:
				wb3 = new TN_DNS_3000WB();
				((TN_DNS_3000WB)wb3).tn_dns_3140_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case TnDnsWBMapping.TN_DNS_3150:
				wb3 = new TN_DNS_3000WB();
				((TN_DNS_3000WB)wb3).tn_dns_3150_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case TnDnsWBMapping.TN_DNS_3160:
				wb3 = new TN_DNS_3000WB(); 
				((TN_DNS_3000WB)wb3).tn_dns_3160_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3160_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_3170:
				wb3 = new TN_DNS_3000WB(); 
				((TN_DNS_3000WB)wb3).tn_dns_3170_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_3170_l.jsp";
				break;	
			case TnDnsWBMapping.TN_DNS_5010:
				wb5 = new TN_DNS_5000WB(); 
				((TN_DNS_5000WB)wb5).tn_dns_5010_l(req, res);
				nextPage = "/jsp/tn/dns/tn_dns_5010_l.jsp";
				break;					
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
