package chosun.ciis.fc.acct.servlet;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import somo.framework.expt.*;

import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;
import chosun.ciis.fc.acct.wb.*;

public class FC_ACCT_6000Servlet extends chosun.ciis.co.base.servlet.BaseServlet {
	
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
			String servletMappedUrl = "/fc/acct6000/";
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
		System.out.println("executeWorker!!!!!!!!");  
		switch(pid) {
			case FC_ACCT_6000WBMapping.FC_ACCT_9999:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).getDummyList(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_9999_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6000:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6000_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6000_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6001:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6001_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6001_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6002:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6002_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6002_i.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6003:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6003_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6003_u.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6004:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6004_d(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6004_d.jsp";
				break;
            case FC_ACCT_6000WBMapping.FC_ACCT_6010:
                wb = new FC_ACCT_6000WB();
                ((FC_ACCT_6000WB)wb).fc_acct_6010_m(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_6010_m.jsp";
                break;
            case FC_ACCT_6000WBMapping.FC_ACCT_6011:
                wb = new FC_ACCT_6000WB();
                ((FC_ACCT_6000WB)wb).fc_acct_6011_l(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_6011_l.jsp";
                break;
            case FC_ACCT_6000WBMapping.FC_ACCT_6012:
                wb = new FC_ACCT_6000WB();
                ((FC_ACCT_6000WB)wb).fc_acct_6012_a(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_6012_a.jsp";
                break;
            case FC_ACCT_6000WBMapping.FC_ACCT_6013:
                wb = new FC_ACCT_6000WB();
                ((FC_ACCT_6000WB)wb).fc_acct_6013_a(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_6013_a.jsp";
                break;
            case FC_ACCT_6000WBMapping.FC_ACCT_6014:
                wb = new FC_ACCT_6000WB();
                ((FC_ACCT_6000WB)wb).fc_acct_6014_u(req, res);
                nextPage = "/jsp/fc/acct/fc_acct_6014_u.jsp";
                break;
            case FC_ACCT_6000WBMapping.FC_ACCT_6015:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6015_e(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6015_e.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6020:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6020_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6020_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6021:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6021_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6021_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6022:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6022_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6022_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6023:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6023_e(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6023_e.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6024:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6024_e(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6024_e.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6025:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6025_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6025_u.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6026:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6026_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6026_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6027:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6027_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6027_u.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6030:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6030_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6030_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6031:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6031_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6031_i.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6032:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6032_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6032_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6033:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6033_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6033_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6034:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6034_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6034_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6035:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6035_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6035_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6036:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6036_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6037:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6037_u(req, res);  
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6038:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6038_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6040:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6040_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6040_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6090:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6090_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6090_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6091:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6091_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6091_l.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6092:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6092_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6092_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6111:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6111_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6111_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6120:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6120_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6120_m.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6121:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6121_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6121_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6130:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6130_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6130_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6131:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6131_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6131_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6132:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6132_i(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6132_i.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6133:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6133_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6133_u.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6134:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6134_u(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6134_u.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6136:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6136_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6136_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6138:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6138_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6138_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6150:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6150_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6150_m.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6151:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6151_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6151_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6152:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6152_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6152_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6160:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6160_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6160_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6161:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6161_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6161_l.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6162:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6162_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6162_l.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6170:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6170_l(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6170_l.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6171:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6171_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6171_a.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6172:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6172_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6172_m.jsp";
				break;					
			case FC_ACCT_6000WBMapping.FC_ACCT_6173:
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6173_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6173_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6210: //부가세_초기세팅
				System.out.println("FC_ACCT_6210 gogogogogogo");
				wb = new FC_ACCT_6000WB();
				System.out.println("FC_ACCT_6210 22222222");
				((FC_ACCT_6000WB)wb).fc_acct_6210_m(req, res);
				System.out.println("FC_ACCT_6210 3333333");
				nextPage = "/jsp/fc/acct/fc_acct_6210_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6211: //부가세_조회
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6211_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6211_s.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6212: //부가세_입력/수정/삭제
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6212_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6212_a.jsp";
				break;	
			case FC_ACCT_6000WBMapping.FC_ACCT_6218: //부가세_조회
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6218_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6218_s.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6219: //부가세_입력/수정/삭제
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6219_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6219_a.jsp";
				break;					
			case FC_ACCT_6000WBMapping.FC_ACCT_6220: //부동산임대공급가액명세서_콤보구성_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6220_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6220_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6221: //부동산임대공급가액명세서_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6221_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6221_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6222: //부동산임대공급가액명세서_생성,수정,삭제_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6222_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6222_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6230: //수출실적명세서_사업장 콤보구성_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6230_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6230_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6231: //수출실적명세서_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6231_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6231_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6232: //수출실적명세서_생성,수정,삭제_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6232_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6232_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6240: //건물등감가상각_콤보구성_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6240_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6240_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6241: //건물등감가상각_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6241_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6241_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6242: //건물등감가상각_생성,수정,삭제_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6242_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6242_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6250: //매입세액불공제내역_사업장콤보구성_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6250_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6250_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6251: //매입세액불공제내역_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6251_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6251_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6252: //매입세액불공제내역_생성,수정,삭제_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6252_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6252_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6260: //신용카드수취명세서_사업장 콤보구성_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6260_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6260_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6261: //신용카드수취명세서_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6261_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6261_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6262: //신용카드수취명세서_생성,수정,삭제_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6262_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6262_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6270: //영세율매출명세서_사업장 콤보구성_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6270_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6270_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6271: //영세율매출명세서_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6271_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6271_s.jsp";
				break;				
			case FC_ACCT_6000WBMapping.FC_ACCT_6272: ////영세율매출명세서_생성,수정,삭제_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6272_a(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6272_a.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6280: //전자신고_콤보구성_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6280_m(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6280_m.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6281: //전자신고_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6281_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6281_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6282: //전자신고_상세조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6282_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6282_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6283: //전자신고_신고파일생성_최호정 
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6283_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6283_s.jsp";
				break;
			case FC_ACCT_6000WBMapping.FC_ACCT_6291: //사업장별 과세표준_조회_최호정
				wb = new FC_ACCT_6000WB();
				((FC_ACCT_6000WB)wb).fc_acct_6291_s(req, res);
				nextPage = "/jsp/fc/acct/fc_acct_6291_s.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		
		return nextPage;
	}
}
