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


package chosun.ciis.sp.dep.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.sp.dep.wb.SpDep1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.sp.dep.servlet.SpDepWBMapping;
import chosun.ciis.sp.dep.wb.SpDep1000WB;

public class SpDepServlet extends BaseServlet {

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
            String servletMappedUrl = "/sp/dep/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SpDepServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SpDepServlet : process : nextPage : " + nextPage);
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

	        /***********************************************************/
	        case SpDepWBMapping.SP_DEP_1000:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1000_m(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1000_m.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1010:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1010_s(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1010_s.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1011:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1011_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1011_l.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1012:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1012_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1012_l.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1013:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1013_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1013_l.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1014:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1014_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1014_l.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1020:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1020_a(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1020_a.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1030:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1040:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1040_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1051:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1051_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1051_l.jsp";
	    		break;	    
	        case SpDepWBMapping.SP_DEP_1055:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1055_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
	        /***********************************************************/
	        case SpDepWBMapping.SP_DEP_1100:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1100_m(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1100_m.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1101:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1101_m(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1101_m.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1110:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1110_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1111:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1111_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1120:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1120_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1121:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1121_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        	/***********************************************************/
	        case SpDepWBMapping.SP_DEP_1300:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1300_m(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1300_m.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1310:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1310_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1310_l.jsp";
	    		break;	
	    	/***********************************************************/
	        case SpDepWBMapping.SP_DEP_1510:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1510_a(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1510_a.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1520:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1520_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1520_l.jsp";
	    		break;
	        case SpDepWBMapping.SP_DEP_1530:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1530_a(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1530_a.jsp";
	    		break;	
	    	/***********************************************************/
	        case SpDepWBMapping.SP_DEP_1750:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1750_m(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1750_m.jsp";
	    		break;	
	        case SpDepWBMapping.SP_DEP_1751:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_1751_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_1751_l.jsp";
	    		break;		
    		/***********************************************************/
          		
        	case SpDepWBMapping.SP_DEP_4600:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_4600_m(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_4600_m.jsp";
	    		break;		
        	case SpDepWBMapping.SP_DEP_4610:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_4610_l(req, res);
	    		nextPage = "/jsp/sp/dep/sp_dep_4610_l.jsp";
	    		break;	
        	case SpDepWBMapping.SP_DEP_4620:
        		workbean = new SpDep1000WB();
        		((SpDep1000WB)workbean).sp_dep_4620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case SpDepWBMapping.SP_DEP_4630:
	    		workbean = new SpDep1000WB();
	    		((SpDep1000WB)workbean).sp_dep_4630_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	     
	    		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
