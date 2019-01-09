package chosun.ciis.mt.etcbook.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
//import chosun.ciis.mt.submatrin.wb.*;
import chosun.ciis.mt.etcbook.wb.MT_ETCBOOK_1000WB;
import chosun.ciis.mt.etcbook.wb.MT_ETCBOOK_2000WB;
import chosun.ciis.mt.etcbook.servlet.MtEtcbookWBMapping; 




public class MtEtcbookServlet extends BaseServlet {
	
	
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
	
	public void process(HttpServletRequest req, HttpServletResponse res) throws
								ServletException, IOException {
		String requestURI = null;
		String strPid = null;
		int iPid = 0;
		String nextPage = null;
		
		try {
			String servletMappedUrl = "/mt/etcbook/";
			iPid = extractPid(req, servletMappedUrl);
			
			System.out.println("MtCommon0000Sevlet : process : iPid : " + iPid);
			nextPage = executeWorker(req, res, iPid);
			System.out.println("MtCommon0000Sevlet : process : nextPage : " + nextPage);
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

	    
	public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
		String nextPage = null;
		MT_ETCBOOK_1000WB wb = null;
		MT_ETCBOOK_2000WB wb2 = null;
		switch(pid) {
			//도서청구 조회
			case MtEtcbookWBMapping.MT_ETCBOOK_1100:
				wb = new MT_ETCBOOK_1000WB();
				((MT_ETCBOOK_1000WB)wb).mt_etcbook_1100_l(req, res);
				nextPage = "/jsp/mt/etcbook/mt_etcbook_1100_l.jsp";
				break;
			// 도서관리조회
			case MtEtcbookWBMapping.MT_ETCBOOK_1300:
				wb = new MT_ETCBOOK_1000WB();
				((MT_ETCBOOK_1000WB)wb).mt_etcbook_1300_l(req, res);
				nextPage = "/jsp/mt/etcbook/mt_etcbook_1300_l.jsp";
				break;
			case MtEtcbookWBMapping.MT_ETCBOOK_1101:
				wb = new MT_ETCBOOK_1000WB();
				((MT_ETCBOOK_1000WB)wb).mt_etcbook_1101_l(req, res);
				nextPage = "/jsp/mt/etcbook/mt_etcbook_1101_l.jsp";
				break;
			//통화구분 Combo
			case MtEtcbookWBMapping.MT_ETCBOOK_1102:
				wb = new MT_ETCBOOK_1000WB();
				((MT_ETCBOOK_1000WB)wb).mt_etcbook_1102_m(req, res);
				nextPage = "/jsp/mt/etcbook/mt_etcbook_1102_m.jsp";
				break;
			//구입처 Combo 
			case MtEtcbookWBMapping.MT_ETCBOOK_1103:
				wb = new MT_ETCBOOK_1000WB();
				((MT_ETCBOOK_1000WB)wb).mt_etcbook_1103_m(req, res);
				nextPage = "/jsp/mt/etcbook/mt_etcbook_1103_m.jsp";
				break;
			// 도서청구 입력/
			case MtEtcbookWBMapping.MT_ETCBOOK_1104:
				wb = new MT_ETCBOOK_1000WB();
				System.out.println("servlet ");
				((MT_ETCBOOK_1000WB)wb).mt_etcbook_1104_a(req, res);
				System.out.println("servlet end");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 도서관리 수정/
			case MtEtcbookWBMapping.MT_ETCBOOK_1201:
				wb = new MT_ETCBOOK_1000WB();
				((MT_ETCBOOK_1000WB)wb).mt_etcbook_1201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 도서코드내역 콤보 
			case MtEtcbookWBMapping.MT_ETCBOOK_2001:
				wb2 = new MT_ETCBOOK_2000WB();
				((MT_ETCBOOK_2000WB)wb2).mt_etcbook_2001_m(req, res);
				nextPage = "/jsp/mt/etcbook/mt_etcbook_2001_m.jsp";
				break;
			// 도서코드내역 조회	
			case MtEtcbookWBMapping.MT_ETCBOOK_2000:
				wb2 = new MT_ETCBOOK_2000WB();
				((MT_ETCBOOK_2000WB)wb2).mt_etcbook_2000_l(req, res);
				nextPage = "/jsp/mt/etcbook/mt_etcbook_2000_l.jsp";
				break;
			// 도서코드내역 등록/수정/삭제	
			case MtEtcbookWBMapping.MT_ETCBOOK_2002:
				wb2 = new MT_ETCBOOK_2000WB();
				((MT_ETCBOOK_2000WB)wb2).mt_etcbook_2002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));

			}
		return nextPage;
	}
}
