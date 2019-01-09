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


package chosun.ciis.as.lear.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.lear.wb.AS_LEAR_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class ASLearServlet extends BaseServlet {


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
            String servletMappedUrl = "/as/lear/";
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
        AS_LEAR_1000WB wb = null;
        
        switch (pid) {
        
	        case ASLearWBMapping.AS_LEAR_1001:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1001_m(req, res);
				System.out.println("AS_LEAR_1001:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1001_m.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1002:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1002_l(req, res);
				System.out.println("AS_LEAR_1002:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1002_l.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1003:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1003_l(req, res);
				System.out.println("AS_LEAR_1003:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1003_l.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1004:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1004_l(req, res);
				System.out.println("AS_LEAR_1004:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1004_l.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1201:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1201_l(req, res);
				System.out.println("AS_LEAR_1201:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1201_l.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1202:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1202_m(req, res);
				System.out.println("AS_LEAR_1202:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1202_m.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1301:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1301_l(req, res);
				System.out.println("AS_LEAR_1301:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1301_l.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1302:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1302_m(req, res);
				System.out.println("AS_LEAR_1302:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1302_m.jsp";
				break;
	        case ASLearWBMapping.AS_LEAR_1401:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1401_l(req, res);
				System.out.println("AS_LEAR_1303:::::::::::::::");
				nextPage = "/jsp/as/lear/as_lear_1401_l.jsp";
				break;
			case ASLearWBMapping.AS_LEAR_1501:
				wb = new AS_LEAR_1000WB();
				((AS_LEAR_1000WB)wb).as_lear_1501_l(req, res);
				nextPage = "/jsp/as/lear/as_lear_1501_l.jsp";
				break;				
				
        	default:        	
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));        		
        }

        return nextPage;
    }
 
}
