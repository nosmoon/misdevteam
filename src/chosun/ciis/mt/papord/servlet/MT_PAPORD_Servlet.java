/***************************************************************************************************
* 파일명 : MT_PAPORD_Servlet
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-03 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.mt.papord.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.commatr.servlet.MtCommatrWBMapping;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_7000WB;
import chosun.ciis.mt.papord.wb.*;
import chosun.ciis.pr.prtexec.servlet.PrtExecWBMapping;
import chosun.ciis.pr.prtexec.wb.PR_PRTEXEC_2000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MT_PAPORD_Servlet extends BaseServlet {

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
            String servletMappedUrl = "/mt/prnpap/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("MT_PAPORD_Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MT_PAPORD_Servlet : process : nextPage : " + nextPage);
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

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
            nextPage);
        rd.forward(req, res);
    }

    /**
     * SEBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
		String nextPage = null;
		MT_PAPORD_1000WB wb  = null;
		MT_PAPORD_1400WB wb14 = null;
		MT_PAPORD_2000WB wb2 = null;
		MT_PAPORD_3000WB wb3 = null;
		MT_PAPORD_4000WB wb4 = null;
		MT_PAPORD_5000WB wb5 = null;
		MT_PAPORD_6000WB wb6 = null;
		MT_PAPORD_7000WB wb7 = null;
		MT_PAPORD_8000WB wb8 = null;
		
		switch(pid) {
			//공장combo
			case MT_PAPORD_WBMapping.MT_PAPORD_1000:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1000_m(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1000_m.jsp";
				break;
			//공장별 용지 적정수용량 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_1001:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1001_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1001_l.jsp";
				break;
			//용지Roll당중량 table Data 유무 확인
			case MT_PAPORD_WBMapping.MT_PAPORD_1002:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1002_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1002_l.jsp";
				break;
			//공장별 용지 적정수용량 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_1003:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1003_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1003_l.jsp";
				break;
			//공장별 용지 적정수용량 저장,수정,삭제
			case MT_PAPORD_WBMapping.MT_PAPORD_1004:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1004_a(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1004_a.jsp";
				break;
			//공장별 용지 적정수용량 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_1005:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1005_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1005_l.jsp";
				break;
			//공장별 용지 적정수용량 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_1006:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1006_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1006_l.jsp";
				break;
			//공장별 용지 적정수용량 저장,수정,삭제
			case MT_PAPORD_WBMapping.MT_PAPORD_1007:
				wb = new MT_PAPORD_1000WB();
				((MT_PAPORD_1000WB)wb).mt_papord_1007_a(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1007_a.jsp";
				break;
			//사용량산정 초기화면
			case MT_PAPORD_WBMapping.MT_PAPORD_1400:
				wb14 = new MT_PAPORD_1400WB();
				((MT_PAPORD_1400WB)wb14).mt_papord_1400_m(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1400_m.jsp";
				break;
			//사용량산정 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_1410:
				wb14 = new MT_PAPORD_1400WB();
				((MT_PAPORD_1400WB)wb14).mt_papord_1410_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_1410_l.jsp";
				break;
			//주간발행인쇄량산정 저장,수정,삭제
			case MT_PAPORD_WBMapping.MT_PAPORD_1420:
				wb14 = new MT_PAPORD_1400WB();
				((MT_PAPORD_1400WB)wb14).mt_papord_1420_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//제지사별 기본발주비율 조회				
			case MT_PAPORD_WBMapping.MT_PAPORD_2001:
				wb2 = new MT_PAPORD_2000WB();
				((MT_PAPORD_2000WB)wb2).mt_papord_2001_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_2001_l.jsp";
				break;
			//제지사별 기본발주비율 저장, 수정, 삭제
			case MT_PAPORD_WBMapping.MT_PAPORD_2002:
				wb2 = new MT_PAPORD_2000WB();
				((MT_PAPORD_2000WB)wb2).mt_papord_2002_a(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_2002_a.jsp";
				break;
			//제지사별 공장별 용지 차량적재량 저장, 수정, 삭제 
			case MT_PAPORD_WBMapping.MT_PAPORD_3001:
				wb3 = new MT_PAPORD_3000WB();
				((MT_PAPORD_3000WB)wb3).mt_papord_3001_a(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_3001_a.jsp";
				break;
			//제지사별 공장별 용지 차량적재량 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_3003:
				wb3 = new MT_PAPORD_3000WB();
				((MT_PAPORD_3000WB)wb3).mt_papord_3003_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_3003_l.jsp";
				break;
			//주간발행인쇄량산정(공장, 매체 콤보)
			case MT_PAPORD_WBMapping.MT_PAPORD_4000:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4000_m(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4000_m.jsp";
				break;
			//주간발행인쇄량산정(섹션 콤보)
			case MT_PAPORD_WBMapping.MT_PAPORD_4001:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4001_m(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4001_m.jsp";
				break;
			//주간발행인쇄량산정(중량/1롤 콤보)
			case MT_PAPORD_WBMapping.MT_PAPORD_4002:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4002_m(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4002_m.jsp";
				break;
			//발행면수, 발행부수, 양출여부
			case MT_PAPORD_WBMapping.MT_PAPORD_4003:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4003_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4003_l.jsp";
				break;
			//주간발행인쇄량산정 저장,수정,삭제
			case MT_PAPORD_WBMapping.MT_PAPORD_4004:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4004_a(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4004_a.jsp";
				break;
			//주간발행인쇄량산정 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_4005:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4005_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4005_l.jsp";
				break;
			//주간발행인쇄량산정 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_4006:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4006_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4006_l.jsp";
				break;
			//주간발행인쇄량산정 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_4007:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4007_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4007_l.jsp";
				break;
			//주간발행인쇄량산정 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_4008:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4008_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4008_l.jsp";
				break;
			//주간발행조회 팝업
			case MT_PAPORD_WBMapping.MT_PAPORD_4100:
				wb4 = new MT_PAPORD_4000WB();
				((MT_PAPORD_4000WB)wb4).mt_papord_4100_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_4100_l.jsp";
				break;
			//공장콤보
			case MT_PAPORD_WBMapping.MT_PAPORD_5000:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5000_m(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5000_m.jsp";
				break;
			//제지사조회
			case MT_PAPORD_WBMapping.MT_PAPORD_5001:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5001_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5001_l.jsp";
				break;
			//조회
			case MT_PAPORD_WBMapping.MT_PAPORD_5002:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5002_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5002_l.jsp";
				break;
			//제지사별 발주량
			case MT_PAPORD_WBMapping.MT_PAPORD_5003:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5003_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5003_l.jsp";
				break;
			//저장
			case MT_PAPORD_WBMapping.MT_PAPORD_5004:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5004_a(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5004_a.jsp";
				break;
			//공장별 최대 수용량
			case MT_PAPORD_WBMapping.MT_PAPORD_5005:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5005_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5005_l.jsp";
				break;
			//공장별 최대 수용량
			case MT_PAPORD_WBMapping.MT_PAPORD_5006:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5006_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5006_l.jsp";
				break;
			case MT_PAPORD_WBMapping.MT_PAPORD_5008:
				wb5 = new MT_PAPORD_5000WB();
				((MT_PAPORD_5000WB)wb5).mt_papord_5008_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_5008_l.jsp";
				break;
			//제지사별 용지 발주비율 조회(일일발주비율)
			case MT_PAPORD_WBMapping.MT_PAPORD_6000:
				wb6 = new MT_PAPORD_6000WB();
				((MT_PAPORD_6000WB)wb6).mt_papord_6000_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_6000_l.jsp";
				break;
			//제지사별 용지 발주비율 조회(월별발주비율)
			case MT_PAPORD_WBMapping.MT_PAPORD_6001:
				wb6 = new MT_PAPORD_6000WB();
				((MT_PAPORD_6000WB)wb6).mt_papord_6001_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_6001_l.jsp";
				break;
			//제지사별 용지 발주비율 조회(누적발주비율)
			case MT_PAPORD_WBMapping.MT_PAPORD_6002:
				wb6 = new MT_PAPORD_6000WB();
				((MT_PAPORD_6000WB)wb6).mt_papord_6002_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_6002_l.jsp";
				break;
			//용지자동발주서 조회
			case MT_PAPORD_WBMapping.MT_PAPORD_7000:
				wb7 = new MT_PAPORD_7000WB();
				((MT_PAPORD_7000WB)wb7).mt_papord_7000_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_7000_l.jsp";
				break;
			//그리드Caption
			case MT_PAPORD_WBMapping.MT_PAPORD_7001:
				wb7 = new MT_PAPORD_7000WB();
				((MT_PAPORD_7000WB)wb7).mt_papord_7001_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_7001_l.jsp";
				break;
			//발주서전송
			case MT_PAPORD_WBMapping.MT_PAPORD_7002:
				wb7 = new MT_PAPORD_7000WB();
				((MT_PAPORD_7000WB)wb7).mt_papord_7002_l(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_7002_l.jsp";
				break;
	        case MT_PAPORD_WBMapping.MT_PAPORD_8000:
			    System.out.println("MT_PAPORD_8000::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8000_m(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8000_m.jsp";
			    break;	
	        case MT_PAPORD_WBMapping.MT_PAPORD_8002:
			    System.out.println("MT_PAPORD_8002::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8002_l(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8002_l.jsp";
			    break;
	        case MT_PAPORD_WBMapping.MT_PAPORD_8003:
			    System.out.println("MT_PAPORD_8003::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8003_l(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8003_l.jsp";
			    break;
        	case MT_PAPORD_WBMapping.MT_PAPORD_8004:
        		System.out.println("MT_PAPORD_8004::::::::::::::");
        		wb8 = new MT_PAPORD_8000WB();
				((MT_PAPORD_8000WB)wb8).mt_papord_8004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MT_PAPORD_WBMapping.MT_PAPORD_8005:
			    System.out.println("MT_PAPORD_8005::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8005_l(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8005_l.jsp";
			    break;	
        	case MT_PAPORD_WBMapping.MT_PAPORD_8006:
			    System.out.println("MT_PAPORD_8006::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8006_l(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8006_l.jsp";
			    break;	
        	case MT_PAPORD_WBMapping.MT_PAPORD_8007:
        		System.out.println("MT_PAPORD_8007::::::::::::::");
        		wb8 = new MT_PAPORD_8000WB();
        		((MT_PAPORD_8000WB)wb8).mt_papord_8007_u(req, res);
				nextPage = "/jsp/mt/papord/mt_papord_8007_u.jsp";
				break; 
	        case MT_PAPORD_WBMapping.MT_PAPORD_8101:
			    System.out.println("MT_PAPORD_8101::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8101_l(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8101_l.jsp";
			    break;
	        case MT_PAPORD_WBMapping.MT_PAPORD_8201:
			    System.out.println("MT_PAPORD_8201::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8201_l(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8201_l.jsp";
			    break;
        	case MT_PAPORD_WBMapping.MT_PAPORD_8008:
			    System.out.println("MT_PAPORD_8008::::::::::::::");
			    wb8 = new MT_PAPORD_8000WB();
			    wb8.mt_papord_8008_l(req, res);
			    nextPage = "/jsp/mt/papord/mt_papord_8008_l.jsp";
			    break;	
        	case MT_PAPORD_WBMapping.MT_PAPORD_8009:
        		System.out.println("MT_PAPORD_8009::::::::::::::");
        		wb8 = new MT_PAPORD_8000WB();
        		((MT_PAPORD_8000WB)wb8).mt_papord_8009_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
	       
				
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}
}
