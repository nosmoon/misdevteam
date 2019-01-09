package chosun.ciis.pr.prtcnsg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pr.prtcnsg.wb.*;
import chosun.ciis.pr.prtcnsg.servlet.PrPrtcnsgWBMapping; 




public class PrPrtcnsgServlet extends BaseServlet {
	
	
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
			String servletMappedUrl = "/mt/prtcnsg/";
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
		PR_PRTCNSG_1000WB wb = null;
		PR_OTHCNSM_1000WB wb2 = null;
		System.out.println("pid=" + pid);
		switch(pid) {
		
			// 위탁인쇄소모입력 콤보 조회 
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1000:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1000_m(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1000_m.jsp";
				break;
			// 위탁인쇄소모입력 조회 
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1100:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1100_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1100_l.jsp";
				break;
			// 위탁인쇄소모입력 등록/수정
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1101:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1101_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1101_a.jsp";
				break;
			// 위탁인쇄소모입력 등록/수정
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1102:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1102_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1102_l.jsp";
				break;
			// 위탁인쇄소모 삭제
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1105:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1105_d(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1105_d.jsp";
				break;
			// 위탁인쇄소모검색 
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1200:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1200_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1200_l.jsp";
				break;
			// 위탁인쇄단가관리 조회
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1310:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1310_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1310_l.jsp";
				break;
			// 위탁인쇄단가관리  입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1311:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1311_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1311_a.jsp";
				break;
			// 위탁용지단가 조회
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1320:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1320_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1320_l.jsp";
				break;
			// 위탁용지단가 입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1321:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1321_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1321_a.jsp";
				break;
			// PS판단가관리 조회
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1330:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1330_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1330_l.jsp";
				break;
			// PS판단가관리  입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1331:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1331_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1331_a.jsp";
				break;
			// 위탁인쇄월마감 컬럼조회, 
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1400:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1400_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1400_l.jsp";
				break;
			// 위탁인쇄월마감 조회
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1401:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1401_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1401_l.jsp";
				break;
			// 마감
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1402:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1402_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1402_a.jsp";
				break;
			// 마감취소
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1403:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1403_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1403_a.jsp";
				break;
			// 위탁인쇄월마감 조회
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1501:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1501_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1501_l.jsp";
				break;
//				 마감
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1502:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1502_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1502_a.jsp";
				break;
			// 마감취소
			case PrPrtcnsgWBMapping.PR_PRTCNSG_1503:
				wb = new PR_PRTCNSG_1000WB();
				((PR_PRTCNSG_1000WB)wb).pr_prtcnsg_1503_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_prtcnsg_1503_a.jsp";
				break;
				
				
				
				
				
				
				// 위탁인쇄소모입력 콤보 조회 
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2000:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2000_m(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2000_m.jsp";
				break;
			// 위탁인쇄소모입력 조회 
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2100:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2100_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2100_l.jsp";
				break;
			// 위탁인쇄소모입력 등록/수정
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2101:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2101_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2101_a.jsp";
				break;
			// 위탁인쇄소모입력 등록/수정
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2102:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2102_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2102_l.jsp";
				break;
			// 위탁인쇄소모 삭제
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2105:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2105_d(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2105_d.jsp";
				break;
			// 위탁인쇄소모검색 
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2200:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2200_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2200_l.jsp";
				break;
			// 위탁인쇄단가관리 조회
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2310:
				wb2 = new PR_OTHCNSM_1000WB();
				System.out.println("...");
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2310_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2310_l.jsp";
				break;
			// 위탁인쇄단가관리  입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2311:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2311_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2311_a.jsp";
				break;
			// 위탁용지단가 조회
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2320:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2320_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2320_l.jsp";
				break;
			// 위탁용지단가 입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2321:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2321_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2321_a.jsp";
				break;
			// PS판단가관리 조회
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2330:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2330_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2330_l.jsp";
				break;
			// PS판단가관리  입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2331:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2331_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2331_a.jsp";
				break;
			// PS판단가관리  입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2332:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2332_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2332_l.jsp";
				break;
				// PS판단가관리 조회
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2340:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2340_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2340_l.jsp";
				break;
			// PS판단가관리  입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2341:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2341_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2341_a.jsp";
				break;
			// PS판단가관리  입력/수정/삭제
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2342:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2342_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2342_l.jsp";
				break;
			// 위탁인쇄월마감 컬럼조회, 
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2400:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2400_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2400_l.jsp";
				break;
			// 위탁인쇄월마감 조회
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2401:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2401_l(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2401_l.jsp";
				break;
			// 마감
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2402:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2402_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2402_a.jsp";
				break;
			//마감취소
			case PrPrtcnsgWBMapping.PR_OTHCNSM_2403:
				wb2 = new PR_OTHCNSM_1000WB();
				((PR_OTHCNSM_1000WB)wb2).pr_othcnsm_2403_a(req, res);
				nextPage = "/jsp/pr/prtcnsg/pr_othcnsm_2403_a.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));

			}
		return nextPage;
	}
}
