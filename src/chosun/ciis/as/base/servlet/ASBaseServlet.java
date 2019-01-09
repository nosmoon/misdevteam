/***************************************************************************************************
 * ���ϸ� : 
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.as.base.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.base.wb.AS_BASE_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class ASBaseServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
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
            String servletMappedUrl = "/as/base/";
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
     * SEBasWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        AS_BASE_1000WB wb = null;
        
        switch (pid) {
        
        
			case ASBaseWBMapping.AS_BASE_1001:
				wb = new AS_BASE_1000WB();
				wb.as_base_1001_l(req, res);
				System.out.println("AS_BASE_1001:::::::::::::::");
				nextPage = "/jsp/as/base/as_base_1001_l.jsp";
				break;
			
			case ASBaseWBMapping.AS_BASE_1002:
				System.out.println("AS_BASE_1002:::::::::::::::");
				wb = new AS_BASE_1000WB();
				wb.as_base_1002_l(req, res);
				nextPage = "/jsp/as/base/as_base_1002_l.jsp";
				break;
			
			case ASBaseWBMapping.AS_BASE_1003:
				System.out.println("AS_BASE_1003:::::::::::::::");
				wb = new AS_BASE_1000WB();
				wb.as_base_1003_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        /*
        	case ASBaseWBMapping.AS_BASE_1101:
	    		System.out.println("AS_BASE_1101:::::::::::::::");
	    		wb = new AS_BASE_1000WB();
	    		wb.as_base_1101_l(req, res);
	    		nextPage = "/jsp/as/base/as_base_1101_l.jsp";
	    		break;
	    */
        	case ASBaseWBMapping.AS_BASE_1101:
				wb = new AS_BASE_1000WB();
				wb.as_base_1101_m(req, res);
				System.out.println("AS_BASE_1101_M:::::::::::::::");
				nextPage = "/jsp/as/base/as_base_1101_m.jsp";
				break;
    		
	        case ASBaseWBMapping.AS_BASE_1102:
				wb = new AS_BASE_1000WB();
				wb.as_base_1102_l(req, res);
				System.out.println("AS_BASE_1102:::::::::::::::");
				nextPage = "/jsp/as/base/as_base_1102_l.jsp";
				break;
				
	        case ASBaseWBMapping.AS_BASE_1103:
				wb = new AS_BASE_1000WB();
				wb.as_base_1103_a(req, res);
				System.out.println("AS_BASE_1103:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
        	default:        	
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));        		
        }

        return nextPage;
    }
 
}
