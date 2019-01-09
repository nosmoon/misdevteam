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


package chosun.ciis.hd.dwnwrk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.dwnwrk.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDDwnwrkServlet extends BaseServlet {

 
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
		//System.out.println(" HDJobServlet.java ");
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/hd/dwnwrk/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDDwnwrkServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDDwnwrkServlet : process : nextPage : " + nextPage);
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
        
        HD_DWNWRK_1000WB wb = null;
       
        switch (pid) {
        case HDDwnwrkWBMapping.HD_DWNWRK_1000:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1000_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1000_l.jsp";
			break;
        case HDDwnwrkWBMapping.HD_DWNWRK_1001:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1001_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1001_l.jsp";
			break;
        case HDDwnwrkWBMapping.HD_DWNWRK_1002:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1002_a(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1002_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
        case HDDwnwrkWBMapping.HD_DWNWRK_1100:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1100_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1100_l.jsp";
			break;	
        case HDDwnwrkWBMapping.HD_DWNWRK_1101:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1101_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1101_l.jsp";
			break;	
        case HDDwnwrkWBMapping.HD_DWNWRK_1102:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1102_a(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1102_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
        case HDDwnwrkWBMapping.HD_DWNWRK_1103:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1103_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1103_l.jsp";
			break;	
        case HDDwnwrkWBMapping.HD_DWNWRK_1104:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1104_a(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1104_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
        case HDDwnwrkWBMapping.HD_DWNWRK_1105:
        	wb = new HD_DWNWRK_1000WB();
        	((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1105_m(req, res);
        	//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1104_a.jsp";
        	nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1105_m.jsp";
        	break;	
		case HDDwnwrkWBMapping.HD_DWNWRK_1200:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1200_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1200_l.jsp";
			break;		
		case HDDwnwrkWBMapping.HD_DWNWRK_1201:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1201_a(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1201_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDDwnwrkWBMapping.HD_DWNWRK_1202:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1202_m(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1201_a.jsp";
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1202_m.jsp";
			break;	
		case HDDwnwrkWBMapping.HD_DWNWRK_1300:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1300_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1300_l.jsp";
			break;			
		case HDDwnwrkWBMapping.HD_DWNWRK_1301:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1301_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1301_l.jsp";
			break;			
		case HDDwnwrkWBMapping.HD_DWNWRK_1302:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1302_a(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1302_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;		
		case HDDwnwrkWBMapping.HD_DWNWRK_1303:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1303_a(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1303_a.jsp";
			break;		
		case HDDwnwrkWBMapping.HD_DWNWRK_1304:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1304_d(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1304_d.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;			
		case HDDwnwrkWBMapping.HD_DWNWRK_1305:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1305_m(req, res);
			//nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1304_d.jsp";
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1305_m.jsp";
			break;			
		case HDDwnwrkWBMapping.HD_DWNWRK_1400:
			wb = new HD_DWNWRK_1000WB();
			((HD_DWNWRK_1000WB)wb).hd_dwnwrk_1400_l(req, res);
			nextPage = "/jsp/hd/dwnwrk/hd_dwnwrk_1400_l.jsp";
			break;			
    	default:
			throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
	    }

        
        System.out.println("nextPage="+nextPage);
        return nextPage;
    }
}
