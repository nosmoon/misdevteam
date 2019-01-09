/***************************************************************************************************
* 파일명 : HDDwnwrkServlet
* 기능 : 조출근무관리
* 작성일자 : 2009.04.23
* 작성자 : 강영슬
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.hd.ddemp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.ddemp.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDDdempServlet extends BaseServlet {

 
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
        	
            String servletMappedUrl = "/hd/ddemp/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDDdempServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDDdempServlet : process : nextPage : " + nextPage);
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
        
        HD_DDEMP_1000WB wb = null;
        switch (pid) {
        case HDDdempWBMapping.HD_DDEMP_1000:
        	wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1000_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1000_l.jsp";
			break;
        case HDDdempWBMapping.HD_DDEMP_1001:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1001_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1001_l.jsp";
			break;	
        case HDDdempWBMapping.HD_DDEMP_1002:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1002_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1002_l.jsp";
			break;	
        case HDDdempWBMapping.HD_DDEMP_1003:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1003_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			//nextPage = "/jsp/hd/ddemp/hd_ddemp_1003_a.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_1005:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1005_a(req, res);
			//nextPage = "/common/jsp/resultMsg.jsp";
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1005_a.jsp";
			break;		
		case HDDdempWBMapping.HD_DDEMP_1006:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1006_d(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			//nextPage = "/jsp/hd/ddemp/hd_ddemp_1006_d.jsp";
			break;			
		case HDDdempWBMapping.HD_DDEMP_1007:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1007_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1007_l.jsp";
			break;	
		case HDDdempWBMapping.HD_DDEMP_1009:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1009_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1009_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_1010:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1010_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1010_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_1011:
        	wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1011_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1011_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_1012:
        	wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1012_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1012_l.jsp";
			break;
        case HDDdempWBMapping.HD_DDEMP_1103:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1103_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			//nextPage = "/jsp/hd/ddemp/hd_ddemp_1103_a.jsp";
			break;	
        case HDDdempWBMapping.HD_DDEMP_1104:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1104_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			//nextPage = "/jsp/hd/ddemp/hd_ddemp_1104_a.jsp";
			break;	
		case HDDdempWBMapping.HD_DDEMP_1105:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1105_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1105_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_1107:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_1107_m(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_1107_m.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_3000:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_3000_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_3000_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_3001:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_3001_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_4000_L:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_4000_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_4000_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_5000_L:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_5000_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_5000_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_5001_L:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_5001_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_5001_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_6001_L:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_6001_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_6001_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_6002_L:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_6002_l(req, res);
			nextPage = "/jsp/hd/ddemp/hd_ddemp_6002_l.jsp";
			break;
		case HDDdempWBMapping.HD_DDEMP_6003_A:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_6003_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDDdempWBMapping.HD_DDEMP_6004_M:
			wb = new HD_DDEMP_1000WB();
			((HD_DDEMP_1000WB)wb).hd_ddemp_6004_m(req, res);

			nextPage = "/jsp/hd/ddemp/hd_ddemp_6004_m.jsp";
			break;
        default:
			throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
	    }

        
        System.out.println("nextPage="+nextPage);
        return nextPage;
    }
}
