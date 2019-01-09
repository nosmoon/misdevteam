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


package chosun.ciis.as.mach.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.mach.wb.AS_MACH_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class AS_MACH_1000Servlet extends BaseServlet {


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
            String servletMappedUrl = "/as/mach/";
            iPid = extractPid(req, servletMappedUrl);            
            System.out.println("AS_MACH_1000Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AS_MACH_1000Servlet : process : nextPage : " + nextPage);
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
        AS_MACH_1000WB wb = null;
        
        switch (pid) {
        
			case AS_MACH_1000WBMapping.AS_MACH_1000:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1000_m(req, res);
				nextPage = "/jsp/as/mach/as_mach_1000_m.jsp";
				break;		

			case AS_MACH_1000WBMapping.AS_MACH_1005:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1005_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1005_l.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1010:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1010_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1010_l.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1015:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1015_s(req, res);
				nextPage = "/jsp/as/mach/as_mach_1015_s.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1020:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1020_a(req, res);
				nextPage = "/jsp/as/mach/as_mach_1020_a.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1030:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1030_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1030_l.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1040:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1040_a(req, res);
				nextPage = "/jsp/as/mach/as_mach_1040_a.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1100:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1100_m(req, res);
				nextPage = "/jsp/as/mach/as_mach_1100_m.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1110:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1110_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1110_l.jsp";
				break;
				
			case AS_MACH_1000WBMapping.AS_MACH_1120:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1120_a(req, res);
				nextPage = "/jsp/as/mach/as_mach_1120_a.jsp";
				break;

        	default:        	
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));        		
        }

        return nextPage;
    }
 
}
