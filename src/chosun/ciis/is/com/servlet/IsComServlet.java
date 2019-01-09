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


package chosun.ciis.is.com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.com.wb.IsCom1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsComServlet extends BaseServlet {

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
            String servletMappedUrl = "/is/com/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("IsBasServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("IsBasServlet : process : nextPage : " + nextPage);
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
        	case IsComWBMapping.IS_COM_1000:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1000_m(req, res);
        		nextPage = "/jsp/is/com/is_com_1000_m.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1010:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1010_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1010_l.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1100:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1100_m(req, res);
        		nextPage = "/jsp/is/com/is_com_1100_m.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1110:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1110_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1110_l.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1111:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1111_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1111_l.jsp";
        		break;	
        	case IsComWBMapping.IS_COM_1200:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1200_s(req, res);
        		nextPage = "/jsp/is/com/is_com_1200_s.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1201:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1201_s(req, res);
        		nextPage = "/jsp/is/com/is_com_1201_s.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1202:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1202_s(req, res);
        		nextPage = "/jsp/is/com/is_com_1202_s.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1300:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1300_m(req, res);
        		nextPage = "/jsp/is/com/is_com_1300_m.jsp";
        		break;	
        	case IsComWBMapping.IS_COM_1310:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1310_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1310_l.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1400:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1400_m(req, res);
        		nextPage = "/jsp/is/com/is_com_1400_m.jsp";
        		break;	
        	case IsComWBMapping.IS_COM_1410:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1410_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1410_l.jsp";
        		break;
        	case IsComWBMapping.IS_COM_1600:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1600_m(req, res);
        		nextPage = "/jsp/is/com/is_com_1600_m.jsp";
        		break;	
        	case IsComWBMapping.IS_COM_1610:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1610_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1610_l.jsp";
        		break;	
        	case IsComWBMapping.IS_COM_1710:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1710_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1710_l.jsp";
        		break;		
        	case IsComWBMapping.IS_COM_1810:
        		workbean = new IsCom1000WB();
        		((IsCom1000WB)workbean).is_com_1810_l(req, res);
        		nextPage = "/jsp/is/com/is_com_1810_l.jsp";
        		break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
