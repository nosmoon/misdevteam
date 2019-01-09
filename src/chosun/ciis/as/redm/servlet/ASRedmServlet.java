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


package chosun.ciis.as.redm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.redm.wb.AS_REDM_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class ASRedmServlet extends BaseServlet {


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
            String servletMappedUrl = "/as/redm/";
            iPid = extractPid(req, servletMappedUrl);            
            System.out.println("ASBaseServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("ASBaseServlet : process : nextPage : " + nextPage);
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
        AS_REDM_1000WB wb = null;
        
        switch (pid) {
        
	        case ASRedmWBMapping.AS_REDM_1000:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1000_l(req, res);
				System.out.println("AS_REDM_1000:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1000_l.jsp";
				break;
	        case ASRedmWBMapping.AS_REDM_1001:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1001_m(req, res);
				System.out.println("AS_REDM_1001:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1001_m.jsp";
				break;
			case ASRedmWBMapping.AS_REDM_1002:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1002_a(req, res);
				System.out.println("AS_REDM_1002:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1002_a.jsp";
				break;
			case ASRedmWBMapping.AS_REDM_1003:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1003_a(req, res);
				System.out.println("AS_REDM_1003:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1003_a.jsp";
				break;            
			case ASRedmWBMapping.AS_REDM_1004:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1004_l(req, res);
				System.out.println("AS_REDM_1004:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1004_l.jsp";
				break;				
	        case ASRedmWBMapping.AS_REDM_1201:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1201_l(req, res);
				System.out.println("AS_REDM_1201:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1201_l.jsp";
				break;
	        case ASRedmWBMapping.AS_REDM_1202:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1202_u(req, res);
				System.out.println("AS_REDM_1202:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1202_u.jsp";
				break;
	        case ASRedmWBMapping.AS_REDM_1301:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1301_m(req, res);
				System.out.println("AS_REDM_1301:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1301_m.jsp";
				break;
            case ASRedmWBMapping.AS_REDM_1302:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1302_l(req, res);
                System.out.println("AS_REDM_1302:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1302_l.jsp";
				break;
            case ASRedmWBMapping.AS_REDM_1303:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1303_m(req, res);
				System.out.println("AS_REDM_1303:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1303_m.jsp";
				break;
            case ASRedmWBMapping.AS_REDM_1304:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1304_a(req, res);
				System.out.println("AS_REDM_1304:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
            case ASRedmWBMapping.AS_REDM_1305:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1305_m(req, res);
				System.out.println("AS_REDM_1305:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1305_m.jsp";
				break;
            case ASRedmWBMapping.AS_REDM_1401:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1401_m(req, res);
				System.out.println("AS_REDM_1401:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1401_m.jsp";
				break;
	        case ASRedmWBMapping.AS_REDM_1501:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1501_m(req, res);
				System.out.println("AS_REDM_1501:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1501_m.jsp";
				break;
	        case ASRedmWBMapping.AS_REDM_1502:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1502_l(req, res);
				System.out.println("AS_REDM_1502:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1502_l.jsp";
				break;
			case ASRedmWBMapping.AS_REDM_1503:
				wb = new AS_REDM_1000WB();
				((AS_REDM_1000WB)wb).as_redm_1503_a(req, res);
				System.out.println("AS_REDM_1002:::::::::::::::");
				nextPage = "/jsp/as/redm/as_redm_1503_a.jsp";
				break;
				
        	default:        	
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));        		
        }

        return nextPage;
    }
 
}
