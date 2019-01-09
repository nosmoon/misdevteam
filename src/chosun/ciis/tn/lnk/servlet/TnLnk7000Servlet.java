/***************************************************************************************************
 * 파일명 : TnLnkServlet.java
 * 기능 : 기초자료관리를  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.tn.lnk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.tn.lnk.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class TnLnk7000Servlet extends BaseServlet {

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
            String servletMappedUrl = "/tn/lnk7000/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("TnLnk7000Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("TnLnk7000Servlet : process : nextPage : " + nextPage);
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

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
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
                                int pid) throws Exception{
        String nextPage = null;
        BaseWB workbean = null;
        switch (pid) {
			case TnLnkWB7000Mapping.TN_LNK_7010:
				workbean = new TnLnk7000WB();
				((TnLnk7000WB)workbean).tn_lnk_7010_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_7010_l.jsp";
				break;
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}

