/***************************************************************************************************
* 파일명 : MT_PRNPAP_Servlet
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-03-30
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.mt.prnpap.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.prnpap.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MT_PRNPAP_Servlet extends BaseServlet {

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

            System.out.println("MT_PRNPAP_Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MT_PRNPAP_Servlet : process : nextPage : " + nextPage);
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
		MT_PRNPAP_1000WB wb = null;
		MT_PRNPAP_2000WB wb2 = null;
		MT_PRNPAP_3000WB wb3 = null;

		switch(pid) {
			//용지품질시험결과관리 조회
		 	case MT_PRNPAP_WBMapping.MT_PRNPAP_1000:
				wb = new MT_PRNPAP_1000WB();
				((MT_PRNPAP_1000WB)wb).mt_prnpap_1000_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_1000_l.jsp";
				break;
			//공장, 제지사
			case MT_PRNPAP_WBMapping.MT_PRNPAP_1001:
				wb = new MT_PRNPAP_1000WB();
				((MT_PRNPAP_1000WB)wb).mt_prnpap_1001_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_1001_l.jsp";
				break;
			//측정항목, 단위, 기준치, 최대치, 최저치 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_1002:
				wb = new MT_PRNPAP_1000WB();
				((MT_PRNPAP_1000WB)wb).mt_prnpap_1002_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_1002_l.jsp";
				break;
			//용지품질시험결과관리 저장 및 삭제
			case MT_PRNPAP_WBMapping.MT_PRNPAP_1003:
				wb = new MT_PRNPAP_1000WB();
				((MT_PRNPAP_1000WB)wb).mt_prnpap_1003_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//용지품질시험결과조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_1004:
				wb = new MT_PRNPAP_1000WB();
				((MT_PRNPAP_1000WB)wb).mt_prnpap_1004_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_1004_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_2000:
				wb2 = new MT_PRNPAP_2000WB();
				((MT_PRNPAP_2000WB)wb2).mt_prnpap_2000_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_2000_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_2010:
				wb2 = new MT_PRNPAP_2000WB();
				((MT_PRNPAP_2000WB)wb2).mt_prnpap_2010_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_2010_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_2020:
				wb2 = new MT_PRNPAP_2000WB();
				((MT_PRNPAP_2000WB)wb2).mt_prnpap_2020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_2030:
				wb2 = new MT_PRNPAP_2000WB();
				((MT_PRNPAP_2000WB)wb2).mt_prnpap_2030_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_2030_l.jsp";
				break;
			// 용지일일재고및파지확인 팝업 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3000:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3000_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3000_l.jsp";
				break;
//				 용지일일재고및파지확인  조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3001:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3001_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3001_l.jsp";
				break;
			// 일일재고 등록/수정
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3002:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 일일재고 금일입고 롤당 중량 구하기
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3003:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3003_m(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3003_m.jsp";
				break;
			// 일일재고 공장구분
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3004:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3004_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3004_l.jsp";
				break;
//				 용지일일재고및파지확인 팝업 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3006:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3006_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3006_l.jsp";
				break;
//				 분공장 마감
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3007:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3007_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//				 분공장 취소  마감
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3008:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3008_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//	지고재고 자동생성
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3009:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3009_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3009_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3011:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3011_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 일일재고지고 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3100:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3100_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3100_l.jsp";
				break;
			// 일일재고지고 등록/수정/삭제
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3101:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//				 일일재고지고 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3102:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3102_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3102_l.jsp";
				break;
//				 일일재고지고 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3103:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3103_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3103_l.jsp";
				break;
//				 일일재고지고 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3104:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3104_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3104_l.jsp";
				break;
		    case MT_PRNPAP_WBMapping.MT_PRNPAP_3105: 
		      wb3 = new MT_PRNPAP_3000WB();
		      wb3.mt_prnpap_3105_l(req, res);
		      nextPage = "/jsp/mt/prnpap/mt_prnpap_3105_l.jsp";
		      break;	
			// 용지일일재고중잔지 등록/수정/삭제
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3201:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 용지일일재고중잔지 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3200:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3200_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3200_l.jsp";
				break;

			case MT_PRNPAP_WBMapping.MT_PRNPAP_3203:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3203_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3203_l.jsp";
				break;
		    case MT_PRNPAP_WBMapping.MT_PRNPAP_3204: 
		      wb3 = new MT_PRNPAP_3000WB();
		      wb3.mt_prnpap_3204_l(req, res);
		      nextPage = "/jsp/mt/prnpap/mt_prnpap_3204_l.jsp";
		      break;	
			// 용지일일재고윤전기 등록/수정/삭제
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3301:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 잔량산출기준 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3202:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3202_m(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3202_m.jsp";
				break;
			// 용지일일재고윤전기 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3300:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3300_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3300_l.jsp";
				break;
			// 용지일일재고윤전기 호기 콤보 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3303:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3303_m(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3303_m.jsp";
				break;
		    case MT_PRNPAP_WBMapping.MT_PRNPAP_3304: 
		      wb3 = new MT_PRNPAP_3000WB();
		      wb3.mt_prnpap_3304_l(req, res); 
		      nextPage = "/jsp/mt/prnpap/mt_prnpap_3304_l.jsp";
		      break;	
			// 선인쇄 사용량 등록/수정/삭제
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3401:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3401_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 선인쇄 사용량 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3400:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3400_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3400_l.jsp";
				break;

			// 선인쇄사용량 섹션 콤보 가져오기
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3402:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3402_m(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3402_m.jsp";
				break;
			// 선인쇄 파지량 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3403:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3403_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3403_l.jsp";
				break;
			// 선인쇄 파지량  등록/수정
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3404:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3404_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//				 선인쇄 파지량 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3405:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3405_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3405_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3406:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3406_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3406_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3407:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3407_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3407_l.jsp";
				break;
//				 선인쇄 파지량  등록/수정
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3409:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3409_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3410:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3410_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3411:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3411_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3411_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3412:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3412_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3412_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3413:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3412_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3413_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3414:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3414_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3415:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3415_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3416:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3416_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3416_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3417:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3417_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
		    case MT_PRNPAP_WBMapping.MT_PRNPAP_3418: 
		    	wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3418_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3418_l.jsp";
				break;
		    case MT_PRNPAP_WBMapping.MT_PRNPAP_3419: 
		    	wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3419_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3419_l.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3420:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3420_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 용지일일파지량 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3500:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3500_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3500_l.jsp";
				break;
			// 용지일일파지량  등록/수정
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3501:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3501_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 용지일일파지량 섹션 콤보 조회
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3502:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3502_m(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3502_m.jsp";
				break;
			case MT_PRNPAP_WBMapping.MT_PRNPAP_3503:
				wb3 = new MT_PRNPAP_3000WB();
				((MT_PRNPAP_3000WB)wb3).mt_prnpap_3503_l(req, res);
				nextPage = "/jsp/mt/prnpap/mt_prnpap_3503_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}
}
