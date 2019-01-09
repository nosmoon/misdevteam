/***************************************************************************************************
 * 파일명   : AdComServlet.java
 * 기능     : 광고관리 - 업무연락 서블릿
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/
package chosun.ciis.ad.com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.com.wb.AdCom1400WB;
import chosun.ciis.ad.com.wb.AdCom1500WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdComServlet extends BaseServlet {

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
            String servletMappedUrl = "/ad/com/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdComServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdComServlet : process : nextPage : " + nextPage);
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
     * AdComWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        
        BaseWB workbean = null;
                
        switch (pid) {
        		
        	case AdComWBMapping.AD_COM_1410:		//광고원고수배장 / 중점확인광고리스트 조회
        		workbean = new AdCom1400WB();
        		((AdCom1400WB)workbean).ad_com_1410_l(req, res);
        		nextPage = "/jsp/ad/com/ad_com_1410_l.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1420:		//광고원고수배장 등록, 수정, 삭제
        		workbean = new AdCom1400WB();
        		((AdCom1400WB)workbean).ad_com_1420_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1430:		//중점확인광고리스트 등록, 수정, 삭제    
        		workbean = new AdCom1400WB();
        		((AdCom1400WB)workbean).ad_com_1430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1440:		//광고원고수배장 출력
        		nextPage = "/jsp/ad/com/ad_com_1440_p.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1450:		//중점확인광고리스트 출력
        		nextPage = "/jsp/ad/com/ad_com_1450_p.jsp";
        		break;        		        		

        	case AdComWBMapping.AD_COM_1510:		//공문 - 목록조회
        		workbean = new AdCom1500WB();
        		((AdCom1500WB)workbean).ad_com_1510_l(req, res);
        		nextPage = "/jsp/ad/com/ad_com_1510_l.jsp";
        		break;	  
        	case AdComWBMapping.AD_COM_1520:		//공문 - 상세조회
        		workbean = new AdCom1500WB();
        		((AdCom1500WB)workbean).ad_com_1520_s(req, res);
        		nextPage = "/jsp/ad/com/ad_com_1520_s.jsp";
        		break;	        		
        	case AdComWBMapping.AD_COM_1530:		//공문 - 등록,수정,삭제
        		workbean = new AdCom1500WB();
        		((AdCom1500WB)workbean).ad_com_1530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
