/***************************************************************************************************
 * 파일명 : 
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.mt.etccar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.etcbook.servlet.MtEtcbookWBMapping;
import chosun.ciis.mt.etcbook.wb.MT_ETCBOOK_2000WB;
import chosun.ciis.mt.etccar.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MtEtccarServlet extends BaseServlet {

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
            String servletMappedUrl = "/mt/etccar/"; 
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("CODlcoServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CODlcoServlet : process : nextPage : " + nextPage);
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
		MT_ETCCAR_1000WB wb = null;
		MT_ETCCAR_2000WB wb2 = null;
		MT_ETCCAR_3000WB wb3 = null;
		MT_ETCCAR_4000WB wb4 = null;
		MT_ETCCAR_5000WB wb5 = null;
		MT_ETCCAR_6000WB wb6 = null;
		MT_ETCCAR_7000WB wb7 = null;
		MT_ETCCAR_8000WB wb8 = null;
		MT_ETCCAR_9000WB wb9 = null;
		
		switch(pid) {
		
			// 차량운행내역등록 조회
			case MtEtccarWBMapping.MT_ETCCAR_1000:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1000_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_1000_l.jsp";
				break;
			// 차량운행내역등록 조회
			case MtEtccarWBMapping.MT_ETCCAR_1000_500:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1000_500_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_1000_500_l.jsp";
				break;
			// 차량운행내역등록 입력/삭제
			case MtEtccarWBMapping.MT_ETCCAR_1001:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_1001_500:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1001_500_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 차량운행내역등록 차량번호명 가져오기
			case MtEtccarWBMapping.MT_ETCCAR_1002:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1002_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_1002_m.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_1003:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1003_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_1003_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_1004:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_1005:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1005_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_1005_l.jsp";
				break;
			// 차량운행내역등록 조회
			case MtEtccarWBMapping.MT_ETCCAR_2000:
				wb2 = new MT_ETCCAR_2000WB();
				((MT_ETCCAR_2000WB)wb2).mt_etccar_2000_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_2000_l.jsp";
				break;
			// 차량정비내역 등록  조회
			case MtEtccarWBMapping.MT_ETCCAR_3000:
				wb3 = new MT_ETCCAR_3000WB();
				((MT_ETCCAR_3000WB)wb3).mt_etccar_3000_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_3000_l.jsp";
				break;
			// 차량정비내역 등록	
			case MtEtccarWBMapping.MT_ETCCAR_3001:
				wb3 = new MT_ETCCAR_3000WB();
				((MT_ETCCAR_3000WB)wb3).mt_etccar_3001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 차량관리 콤보세팅 
			case MtEtccarWBMapping.MT_ETCCAR_1100:
				wb = new MT_ETCCAR_1000WB();
				((MT_ETCCAR_1000WB)wb).mt_etccar_1100_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_1100_m.jsp";
				break;
			// 차량소모품 관리 콤보
			case MtEtccarWBMapping.MT_ETCCAR_4101:
				wb4 = new MT_ETCCAR_4000WB();
				((MT_ETCCAR_4000WB)wb4).mt_etccar_4101_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_4101_m.jsp";
				break;
			// 차량소모품 관리 조회 
			case MtEtccarWBMapping.MT_ETCCAR_4100:
				wb4 = new MT_ETCCAR_4000WB();
				((MT_ETCCAR_4000WB)wb4).mt_etccar_4100_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_4100_l.jsp";
				break;
			// 차량소모품 관리 등록/수정/삭제
			case MtEtccarWBMapping.MT_ETCCAR_4102:
				wb4 = new MT_ETCCAR_4000WB();
				((MT_ETCCAR_4000WB)wb4).mt_etccar_4102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 차량소모품 관리 콤보
			case MtEtccarWBMapping.MT_ETCCAR_4103:
				wb4 = new MT_ETCCAR_4000WB();
				((MT_ETCCAR_4000WB)wb4).mt_etccar_4103_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_4103_m.jsp";
				break;
			//	 차량소모품 관리 콤보
			case MtEtccarWBMapping.MT_ETCCAR_4104:
				wb4 = new MT_ETCCAR_4000WB();
				((MT_ETCCAR_4000WB)wb4).mt_etccar_4104_m(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			// 차량소모품 관리 조회
			case MtEtccarWBMapping.MT_ETCCAR_4200:
				wb4 = new MT_ETCCAR_4000WB();
				((MT_ETCCAR_4000WB)wb4).mt_etccar_4200_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_4200_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_5100:
				wb5 = new MT_ETCCAR_5000WB();
				((MT_ETCCAR_5000WB)wb5).mt_etccar_5100_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_5100_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_5200:
				wb5 = new MT_ETCCAR_5000WB();
				((MT_ETCCAR_5000WB)wb5).mt_etccar_5200_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_5200_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_5300:
				wb5 = new MT_ETCCAR_5000WB();
				((MT_ETCCAR_5000WB)wb5).mt_etccar_5300_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_5300_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_5400:
				wb5 = new MT_ETCCAR_5000WB();
				((MT_ETCCAR_5000WB)wb5).mt_etccar_5400_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_5400_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_5410:
				wb5 = new MT_ETCCAR_5000WB();
				((MT_ETCCAR_5000WB)wb5).mt_etccar_5410_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_5410_m.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_5420:
				wb5 = new MT_ETCCAR_5000WB();
				((MT_ETCCAR_5000WB)wb5).mt_etccar_5420_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_5500:
				wb5 = new MT_ETCCAR_5000WB();
				((MT_ETCCAR_5000WB)wb5).mt_etccar_5500_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_5500_l.jsp";
				break;
			// 유류비단가 조회 
			case MtEtccarWBMapping.MT_ETCCAR_6000:
				wb6 = new MT_ETCCAR_6000WB();
				((MT_ETCCAR_6000WB)wb6).mt_etccar_6000_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_6000_l.jsp";
				break;
			// 유류비단가 등록/삭제
			case MtEtccarWBMapping.MT_ETCCAR_6001:
				wb6 = new MT_ETCCAR_6000WB();
				((MT_ETCCAR_6000WB)wb6).mt_etccar_6001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_7001:
				wb7 = new MT_ETCCAR_7000WB();
				((MT_ETCCAR_7000WB)wb7).mt_etccar_7001_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_7001_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_7002:
				wb7 = new MT_ETCCAR_7000WB();
				((MT_ETCCAR_7000WB)wb7).mt_etccar_7002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_8001:
				wb8 = new MT_ETCCAR_8000WB();
				((MT_ETCCAR_8000WB)wb8).mt_etccar_8001_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_8001_l.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_8002:
				wb8 = new MT_ETCCAR_8000WB();
				((MT_ETCCAR_8000WB)wb8).mt_etccar_8002_a(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_8002_a.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9000:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9000_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9000_m.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9001:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9001_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9001_l.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9002:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9003:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9003_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9003_l.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9004:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9004_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9004_l.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9100:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9100_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9100_m.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9101:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9101_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9101_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9102:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9102_a(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9102_a.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9111:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9111_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9111_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9112:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9112_a(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9112_a.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9200:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9200_m(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9200_m.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9201:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9201_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9201_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9202:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9202_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9203:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9203_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9203_l.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9204:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9204_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9301:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9301_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9301_l.jsp";
				break;	
			case MtEtccarWBMapping.MT_ETCCAR_9401:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9401_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9401_l.jsp";
				break;
			case MtEtccarWBMapping.MT_ETCCAR_9501:
				wb9 = new MT_ETCCAR_9000WB();
				((MT_ETCCAR_9000WB)wb9).mt_etccar_9501_l(req, res);
				nextPage = "/jsp/mt/etccar/mt_etccar_9501_l.jsp";
				break;	
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}
}
