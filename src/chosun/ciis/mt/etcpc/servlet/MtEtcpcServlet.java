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


package chosun.ciis.mt.etcpc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.etcpc.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MtEtcpcServlet extends BaseServlet {

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
            String servletMappedUrl = "/mt/etcpc/";
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
		MT_ETCPC_1000WB wb = null;
		MT_ETCPC_2000WB wb2 = null;
		MT_ETCPC_3000WB wb3 = null;
		MT_ETCPC_4000WB wb4 = null;
		MT_ETCPC_6000WB wb6 = null;
		
		switch(pid) {
			case MtEtcpcWBMapping.MT_ETCPC_1101:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1101_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1101_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1100:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1100_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1100_l.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1105:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1105_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1201:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1201_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1201_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1200:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1200_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1200_l.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1202:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1202_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1203:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1203_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1203_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1301:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1301_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1301_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1302:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1302_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1302_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1303:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1303_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1303_l.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1304:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1304_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1305:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1305_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1305_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_2001:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2001_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2001_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_2002:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2002_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2002_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_2003:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2003_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2003_l.jsp";
				break;
			
			// 기기등록 조회	
			case MtEtcpcWBMapping.MT_ETCPC_2000:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2000_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2000_l.jsp";
				break;
			// 기기등록,수정,삭제
			case MtEtcpcWBMapping.MT_ETCPC_2103:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2103_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//기기등록 H/W 조회
			case MtEtcpcWBMapping.MT_ETCPC_2200:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2200_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2200_l.jsp";
				break;
			//기기등록 H/W 저장/수정/삭제
			case MtEtcpcWBMapping.MT_ETCPC_2201:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
            //기기등록 S/W 조회 및 설치라이센스 , 보유라이센스
			case MtEtcpcWBMapping.MT_ETCPC_2300:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2300_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2300_l.jsp";
				break;
            // 기기등록 S/W 저장/삭제
			case MtEtcpcWBMapping.MT_ETCPC_2301:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			
			//S/W라이센스 팝업 조회
			case MtEtcpcWBMapping.MT_ETCPC_3001:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3001_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_3001_m.jsp";
				break;
			//S/W라이센스 조회
			case MtEtcpcWBMapping.MT_ETCPC_3000:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3000_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_3000_l.jsp";
				break;
			//S/W 라이센스 입력/수정/삭제	
			case MtEtcpcWBMapping.MT_ETCPC_3002:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
            //S/W 라이센스 S/W명 콤보 조회
			case MtEtcpcWBMapping.MT_ETCPC_3003:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3003_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_3003_m.jsp";
				break;
            //전산기기 사용내역
			case MtEtcpcWBMapping.MT_ETCPC_4100:
				wb4 = new MT_ETCPC_4000WB();
				((MT_ETCPC_4000WB)wb4).mt_etcpc_4100_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_4100_l.jsp";
				break;
			//설치 s/w 팝업	
			case MtEtcpcWBMapping.MT_ETCPC_4201:
				wb4 = new MT_ETCPC_4000WB();
				((MT_ETCPC_4000WB)wb4).mt_etcpc_4201_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_4201_m.jsp";
				break;
			//소프트웨어 사용내역 조회	
			case MtEtcpcWBMapping.MT_ETCPC_4200:
				wb4 = new MT_ETCPC_4000WB();
				((MT_ETCPC_4000WB)wb4).mt_etcpc_4200_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_4200_l.jsp";
				break;
			//모델/사용처 사용현황 조회
			case MtEtcpcWBMapping.MT_ETCPC_6000:
				wb6 = new MT_ETCPC_6000WB();
				((MT_ETCPC_6000WB)wb6).mt_etcpc_6000_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_6000_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}
    
    
 
}
