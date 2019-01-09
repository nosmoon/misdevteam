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


package chosun.ciis.hd.card.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.card.wb.HD_CARD_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDCardServlet extends BaseServlet {


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
            String servletMappedUrl = "/hd/card/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDCardServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDCardServlet : process : nextPage : " + nextPage);
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        HD_CARD_1000WB wb = null;
        
        switch (pid) {
        	case HDCardWBMapping.HD_CARD_1000:
				wb = new HD_CARD_1000WB();
				((HD_CARD_1000WB)wb).hd_card_1000_l(req, res);
				nextPage = "/jsp/hd/card/hd_card_1000_l.jsp";	
				break;
        	case HDCardWBMapping.HD_CARD_1020:
				wb = new HD_CARD_1000WB();
				((HD_CARD_1000WB)wb).hd_card_1020_M(req, res);
				nextPage = "/jsp/hd/card/hd_card_1020_m.jsp";	
				break;
	        case HDCardWBMapping.HD_CARD_1100:
				wb = new HD_CARD_1000WB();
				
				((HD_CARD_1000WB)wb).hd_card_1100_l(req, res);
				nextPage = "/jsp/hd/card/hd_card_1100_l.jsp";
				break;
	        case HDCardWBMapping.HD_CARD_1101:
				wb = new HD_CARD_1000WB();
				((HD_CARD_1000WB)wb).hd_card_1101_l(req, res);
				nextPage = "/jsp/hd/card/hd_card_1101_l.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}
