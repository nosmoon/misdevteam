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


package chosun.ciis.co.mng.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.mng.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;

public class COMngServlet extends BaseServlet {


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
            String servletMappedUrl = "/co/mng/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("COMngServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            
            System.out.println("COMngServlet : process : nextPage : " + nextPage);
        }
        catch (AppException ae) {
        	ae.printStackTrace();
            req.setAttribute("appException", ae);
            nextPage = "/common/jsp/error.jsp";
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
     * COMngWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        String acct_cd  = Util.getSessionParameterValue(req, "uid", true);
        CO_MNG_1000WB wb1000;
        CO_MNG_2000WB wb2000;
        switch (pid) {
        	case COMngWBMapping.CO_MNG_1000:
        		wb1000 = new CO_MNG_1000WB();
	    		wb1000.co_mng_1000_l(req, res);
	    		if("dit0010".equals(acct_cd)){
	    			nextPage = "/common/jsp/menu_ang.jsp";
	    		}else{
	    			nextPage = "/common/jsp/menu.jsp";
	    		}
	    		break;
        	case COMngWBMapping.CO_MNG_1010:
        		wb1000 = new CO_MNG_1000WB(); 
	    		wb1000.co_mng_1010_l(req, res);
	    		if("dit0010".equals(acct_cd)){
	    			nextPage = "/common/jsp/left_menu_ang.jsp";
	    		}else{
	    			nextPage = "/common/jsp/leftmenu.jsp";
	    		}	    		
	    		break;
        	case COMngWBMapping.CO_MNG_1020:
        		System.out.println("CO_MNG_1020..........");
        		wb1000 = new CO_MNG_1000WB();
	    		wb1000.co_mng_1020_s(req, res);
	    		nextPage = "/common/jsp/co_mng_1020_s.jsp";
	    		break;
        	case COMngWBMapping.CO_MNG_1050:
        		System.out.println("CO_MNG_1050..........");
        		wb1000 = new CO_MNG_1000WB();
	    		wb1000.co_mng_1050_l(req, res);
	    		nextPage = "/common/jsp/co_mng_1050_l.jsp";
	    		break;
        	case COMngWBMapping.CO_MNG_2000:
        		System.out.println("CO_MNG_2000..........");
        		wb2000 = new CO_MNG_2000WB();
	    		wb2000.co_mng_2000_i(req, res);
	    		nextPage = "/jsp/co/mng/co_mng_2000_i.jsp";
	    		break;	    		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
