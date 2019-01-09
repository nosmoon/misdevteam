/***************************************************************************************************
 * 파일명 : AdCommonServlet.java
 * 기능 : 광고 공통  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ad.common.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.common.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class AdCommonServlet extends BaseServlet {

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
            String servletMappedUrl = "/ad/common/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdCommonServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdCommonServlet : process : nextPage : " + nextPage);
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
     * PilotWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        AdCommonWB workbean = null;
        
        switch (pid) {
        	case AdCommonWBMapping.AD_CO_1000:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1000_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1000_l.jsp";
        		break;   
        	case AdCommonWBMapping.AD_CO_1001: 
        		workbean = new AdCommonWB();
        		workbean.ad_co_1001_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1001_l.jsp";
        		break;    
        	case AdCommonWBMapping.AD_CO_1100:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1100_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1100_l.jsp";
        		break;   
        	case AdCommonWBMapping.AD_CO_1101: 
        		workbean = new AdCommonWB();
        		workbean.ad_co_1101_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1101_l.jsp";
        		break;   
        	case AdCommonWBMapping.AD_CO_1200:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1200_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1200_l.jsp";
        		break;        
        	case AdCommonWBMapping.AD_CO_1300:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1300_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1300_l.jsp";
        		break; 	  
        	case AdCommonWBMapping.AD_CO_1400:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1400_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1400_l.jsp";
        		break; 
        	case AdCommonWBMapping.AD_CO_1410:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1410_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdCommonWBMapping.AD_CO_1510:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1510_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1510_l.jsp";
        		break;	
        	case AdCommonWBMapping.AD_CO_1700:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1700_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1700_l.jsp";
        		break;          		
        	case AdCommonWBMapping.AD_CO_9000:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9000_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9000_s.jsp";
        		break; 	     
        	case AdCommonWBMapping.AD_CO_9001:
        		workbean = new AdCommonWB(); 
        		workbean.ad_co_9001_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9001_s.jsp";
        		break; 	     
        	case AdCommonWBMapping.AD_CO_9002:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9002_s(req, res); 
        		nextPage = "/jsp/ad/common/ad_co_9002_s.jsp";
        		break; 	    
        	case AdCommonWBMapping.AD_CO_9003:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9003_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9003_s.jsp";
        		break; 	    
        	case AdCommonWBMapping.AD_CO_9007:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9007_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9007_s.jsp";
        		break; 	 	    
        	case AdCommonWBMapping.AD_CO_9008:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9008_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9008_s.jsp";
        		break; 	 	    
        	case AdCommonWBMapping.AD_CO_9009:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9009_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9009_s.jsp";
        		break; 	  
        	case AdCommonWBMapping.AD_CO_9010:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9010_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9010_s.jsp";
        		break;
        	case AdCommonWBMapping.AD_CO_9100:
        		workbean = new AdCommonWB();
        		workbean.ad_co_9100_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_9100_s.jsp";
        		break; 
        	case AdCommonWBMapping.AD_CO_8000:
        		AdCommon8000WB workbean8000 = new AdCommon8000WB();
        		workbean8000.ad_co_8000_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
        	case AdCommonWBMapping.AD_CO_1600:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1600_m(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1600_m.jsp";
        		break; 	
        	case AdCommonWBMapping.AD_CO_1610:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1610_l(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1610_l.jsp";
        		break; 	
        	case AdCommonWBMapping.AD_CO_1800:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1800_m(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1800_m.jsp";
        		break; 	   
        	case AdCommonWBMapping.AD_CO_1810:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1810_s(req, res);
        		nextPage = "/jsp/ad/common/ad_co_1810_s.jsp";
        		break; 	 
        	case AdCommonWBMapping.AD_CO_1820:
        		workbean = new AdCommonWB();
        		workbean.ad_co_1820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 	 
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
