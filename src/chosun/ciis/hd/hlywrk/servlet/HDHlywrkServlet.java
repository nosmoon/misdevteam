/***************************************************************************************************
* 파일명 : HDHlywrkServlet
* 기능 : 휴일근무관리
* 작성일자 : 2009.04.20
* 작성자 : 강영슬
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.hd.hlywrk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.hlywrk.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDHlywrkServlet extends BaseServlet {

 
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
            String servletMappedUrl = "/hd/hlywrk/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDHlywrkServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDHlywrkServlet : process : nextPage : " + nextPage);
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
        
        HD_HLYWRK_1000WB wb = null;
       
        switch (pid) {
		case HDHlywrkWBMapping.HD_HLYWRK_1000:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1000_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1000_l.jsp";
			break;
			/*
		case HDHlywrkWBMapping.HD_HLYWRK_1000_344:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1000_344_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1000_344_l.jsp";
			break;
			*/
		case HDHlywrkWBMapping.HD_HLYWRK_1001:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1001_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1001_l.jsp";
			break;	
			/*
		case HDHlywrkWBMapping.HD_HLYWRK_1001_344:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1001_344_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1001_344_l.jsp";
			break;	
			*/
		case HDHlywrkWBMapping.HD_HLYWRK_1002:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1002_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		/*
		case HDHlywrkWBMapping.HD_HLYWRK_1002_344:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1002_344_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		*/
		case HDHlywrkWBMapping.HD_HLYWRK_1100:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1100_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1100_l.jsp";
			break;
		case HDHlywrkWBMapping.HD_HLYWRK_1101:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1101_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1101_l.jsp";
			break;
		case HDHlywrkWBMapping.HD_HLYWRK_1102:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1102_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1103:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1103_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1103_l.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1104:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1104_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDHlywrkWBMapping.HD_HLYWRK_1105:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1105_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1105_l.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1106:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1106_m(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1106_m.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1200:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1200_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1200_l.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1201:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1201_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1202:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1202_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1203:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1203_m(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1203_m.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1300:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1300_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1300_l.jsp";
			break;
		case HDHlywrkWBMapping.HD_HLYWRK_1301:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1301_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1301_l.jsp";
			break;
		case HDHlywrkWBMapping.HD_HLYWRK_1302:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1302_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1303:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1303_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDHlywrkWBMapping.HD_HLYWRK_1304:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1304_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1304_l.jsp";
			break;
		/*
		case HDHlywrkWBMapping.HD_HLYWRK_1304_344:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1304_344_l(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1304_344_l.jsp";
			break;
	    */
		case HDHlywrkWBMapping.HD_HLYWRK_1305:
			wb = new HD_HLYWRK_1000WB();
			((HD_HLYWRK_1000WB)wb).hd_hlywrk_1305_m(req, res);
			nextPage = "/jsp/hd/hlywrk/hd_hlywrk_1305_m.jsp";
			break;
			
    	default:
			throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
	    }

        
        System.out.println("nextPage="+nextPage);
        return nextPage;
    }
}
