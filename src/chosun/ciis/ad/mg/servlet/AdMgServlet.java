/***************************************************************************************************
 * 파일명 : AdMgServlet.java
 * 기능 : 마감작업  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ad.mg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.mg.wb.AdMg1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdMgServlet extends BaseServlet {
	
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
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ad/mg/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdMgServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdMgServlet : process : nextPage : " + nextPage);
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
     * AdMgWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        	case AdMgWBMapping.AD_MG_1010:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1010_l(req, res);
        		nextPage = "/jsp/ad/mg/ad_mg_1010_l.jsp";
        		break;     
        	case AdMgWBMapping.AD_MG_1020:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
        	case AdMgWBMapping.AD_MG_1030:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
        	case AdMgWBMapping.AD_MG_1040:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    
        	case AdMgWBMapping.AD_MG_1050:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    
        	case AdMgWBMapping.AD_MG_1060:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1060_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
            		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
