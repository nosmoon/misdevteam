package chosun.ciis.ad.evlu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.evlu.wb.AdEVLU1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdEVLUServlet extends BaseServlet {
	
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
            String servletMappedUrl = "/ad/evlu/";
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
        AdEVLU1000WB wb = null;
		
        switch (pid) {
        	case AdEVLUWBMapping.AD_EVLU_1000_L:
        		wb = new AdEVLU1000WB();
        		((AdEVLU1000WB)wb).ad_evlu_1000_l(req, res);
        		nextPage = "/jsp/ad/evlu/ad_evlu_1000_l.jsp";
        		break;
        	case AdEVLUWBMapping.AD_EVLU_1001_M:
				wb = new AdEVLU1000WB();
				((AdEVLU1000WB)wb).ad_evlu_1001_m(req, res);
				nextPage = "/jsp/ad/evlu/ad_evlu_1001_m.jsp";
				break;
        	case AdEVLUWBMapping.AD_EVLU_1010_A:
				wb = new AdEVLU1000WB();
				((AdEVLU1000WB)wb).ad_evlu_1010_a(req, res);
				nextPage = "/jsp/ad/evlu/ad_evlu_1010_a.jsp";
				break;
        	case AdEVLUWBMapping.AD_EVLU_1100_L:
        		wb = new AdEVLU1000WB();
        		((AdEVLU1000WB)wb).ad_evlu_1100_l(req, res);
        		nextPage = "/jsp/ad/evlu/ad_evlu_1100_l.jsp";
        		break;
        	case AdEVLUWBMapping.AD_EVLU_2000_L:
        		wb = new AdEVLU1000WB();
        		((AdEVLU1000WB)wb).ad_evlu_2000_l(req, res);
        		nextPage = "/jsp/ad/evlu/ad_evlu_2000_l.jsp";
        		break;
        	
        		
        		
        		
        		
        		
        	case AdEVLUWBMapping.AD_EVLU_1110_L:
				wb = new AdEVLU1000WB();
				((AdEVLU1000WB)wb).ad_evlu_1110_l(req, res);
				nextPage = "/jsp/ad/evlu/ad_evlu_1110_l.jsp";
				break;
        	case AdEVLUWBMapping.AD_EVLU_2100_L:
				wb = new AdEVLU1000WB();
				((AdEVLU1000WB)wb).ad_evlu_2100_l(req, res);
				nextPage = "/jsp/ad/evlu/ad_evlu_2100_l.jsp";
				break;
        	case AdEVLUWBMapping.AD_EVLU_2200_L:
				wb = new AdEVLU1000WB();
				((AdEVLU1000WB)wb).ad_evlu_2200_l(req, res);
				nextPage = "/jsp/ad/evlu/ad_evlu_2200_l.jsp";
				break;
        	case AdEVLUWBMapping.AD_EVLU_2210_L:
				wb = new AdEVLU1000WB();
				((AdEVLU1000WB)wb).ad_evlu_2210_l(req, res);
				nextPage = "/jsp/ad/evlu/ad_evlu_2210_l.jsp";
				break;
        	case AdEVLUWBMapping.AD_EVLU_1020_L:
				wb = new AdEVLU1000WB();
				((AdEVLU1000WB)wb).ad_evlu_1020_l(req, res);
				nextPage = "/jsp/ad/evlu/ad_evlu_1020_l.jsp";
				break;
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
