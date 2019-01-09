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


package chosun.ciis.as.asrd.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.asrd.wb.AS_ASRD_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class ASAsrdServlet extends BaseServlet {


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
            String servletMappedUrl = "/as/asrd/";
            iPid = extractPid(req, servletMappedUrl);            
            System.out.println("ASBaseServlet : process : iPid : " + iPid);
            System.out.println("1");
            nextPage = executeWorker(req, res, iPid);
            System.out.println("2");
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
        AS_ASRD_1000WB wb = null;
        
        switch (pid) {
	        case ASAsrdWBMapping.AS_ASRD_1301:
				wb = new AS_ASRD_1000WB();
				((AS_ASRD_1000WB)wb).as_asrd_1301_m(req, res);
				System.out.println("AS_ASRD_1301:::::::::::::::");
				nextPage = "/jsp/as/asrd/as_asrd_1301_m.jsp";
				break;
 
			case ASAsrdWBMapping.AS_ASRD_1302:
				wb = new AS_ASRD_1000WB();
				((AS_ASRD_1000WB)wb).as_asrd_1302_l(req, res);
				nextPage = "/jsp/as/asrd/as_asrd_1302_l.jsp";
				break;				
				
			case ASAsrdWBMapping.AS_ASRD_1401:
				wb = new AS_ASRD_1000WB();
				((AS_ASRD_1000WB)wb).as_asrd_1401_l(req, res);
				System.out.println("AS_ASRD_1401:::::::::::::::");
				nextPage = "/jsp/as/asrd/as_asrd_1401_l.jsp";
				break;
				
			case ASAsrdWBMapping.AS_ASRD_1402:
				System.out.println("AS_ASRD_1402:::::::::::::::");
				wb = new AS_ASRD_1000WB();
				wb.as_asrd_1402_l(req, res);
				nextPage = "/jsp/as/asrd/as_asrd_1402_l.jsp";
				break;
			
			case ASAsrdWBMapping.AS_ASRD_1501:
				wb = new AS_ASRD_1000WB();
				wb.as_asrd_1501_m(req, res);
				System.out.println("AS_ASRD_1501:::::::::::::::");
				nextPage = "/jsp/as/asrd/as_asrd_1501_m.jsp";
				break;
				
			case ASAsrdWBMapping.AS_ASRD_1600:
				wb = new AS_ASRD_1000WB();
				wb.as_asrd_1600_l(req, res);
				System.out.println("AS_ASRD_1600:::::::::::::::");
				nextPage = "/jsp/as/asrd/as_asrd_1600_l.jsp";
				break;
				
			case ASAsrdWBMapping.AS_ASRD_1700:
				wb = new AS_ASRD_1000WB();
				wb.as_asrd_1700_l(req, res);
				System.out.println("AS_ASRD_1700:::::::::::::::");
				nextPage = "/jsp/as/asrd/as_asrd_1700_l.jsp";
				break;
				
			case ASAsrdWBMapping.AS_ASRD_1800:
				wb = new AS_ASRD_1000WB();
				wb.as_asrd_1800_l(req, res);
				System.out.println("AS_ASRD_1800:::::::::::::::");
				nextPage = "/jsp/as/asrd/as_asrd_1800_l.jsp";
				break;
			case ASAsrdWBMapping.AS_ASRD_1901:
				wb = new AS_ASRD_1000WB();
				((AS_ASRD_1000WB)wb).as_asrd_1901_l(req, res);
				nextPage = "/jsp/as/asrd/as_asrd_1901_l.jsp";
				break;
				
        	default:        	
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));        		
        }

        return nextPage;
    }
 
}
