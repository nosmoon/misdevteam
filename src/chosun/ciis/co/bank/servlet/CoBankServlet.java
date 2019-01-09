/***************************************************************************************************
 * 파일명   : CoBankServlet.java
 * 기능     : 공통-통장입금내역  서블릿
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/
package chosun.ciis.co.bank.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.bank.wb.CoBank1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class CoBankServlet extends BaseServlet {

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
            String servletMappedUrl = "/co/bank/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("CoBankServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CoBankServlet : process : nextPage : " + nextPage);
        }
        catch (AppException ae) {
        	ae.printStackTrace();
            req.setAttribute("appException", ae);
            nextPage = "/common/jsp/app_error.jsp";
        }
        catch (SysException se) {
        	se.printStackTrace();
            req.setAttribute("sysException", se);
            nextPage = "/common/jsp/sys_error.jsp";
        }
        catch (Exception e) {
        	e.printStackTrace();
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/common/jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
            nextPage);
        rd.forward(req, res);
    }

    /**
     * CoBankWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
                                int pid) throws AppException, IOException, SQLException {
        String nextPage = null;
        
        BaseWB workbean = null;
                
        switch (pid) {
	    	case CoBankWBMapping.CO_BANK_1000:		//통장입금내역 초기
	    		workbean = new CoBank1000WB();
	    		((CoBank1000WB)workbean).co_bank_1000_m(req, res);
	    		nextPage = "/jsp/co/bank/co_bank_1000_m.jsp";
	    		break;
        	case CoBankWBMapping.CO_BANK_1010:		//통장입금내역 목록조회
        		workbean = new CoBank1000WB();
        		((CoBank1000WB)workbean).co_bank_1010_l(req, res);
        		nextPage = "/jsp/co/bank/co_bank_1010_l.jsp";
        		break;
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
