/***************************************************************************************************
 * ���ϸ� : SSHealthServlet.java
 * ��� : �ｺ���� ����
 * �ۼ����� : 2014-12-23
 * �ۼ��� : ������
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.health.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.wb.*;
import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * �Ǹű� �������� �ｺ���� Servlet
 */

public class SSHealthServlet extends ChosunServlet {

    private static final String CONTENT_TYPE = "text/html; charset=KSC5601";
    //Initialize global variables
    public void init() throws ServletException {
    }

    //Clean up resources
    public void destroy() {
    }

    public void checkAuthority() {
    }

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws IOException
     * @throws ServletException
     */
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/health/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSHealthServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSHealthServlet : process : nextPage : " + nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SSExtnWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException { 

        String nextPage = null;
        SSHealth1000WB wb1000 = null; //��ũ�� ����
        SSHealth1100WB wb1100 = null; //��ũ�� ����
       
        switch (pid) {
            case SSHealthWBMapping.HEALTH_1000: //��ũ�� ���� �ʱ�
                wb1000 = new SSHealth1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/health/ss_health_1000_a.jsp";
                break;
            case SSHealthWBMapping.HEALTH_1010: //��ũ�� ���� ����Ʈ
                wb1000 = new SSHealth1000WB();
                wb1000.selectWorkbook(req, res);
                nextPage = "/jsp/ss/health/ss_health_1010_l.jsp";
                break;  
            case SSHealthWBMapping.HEALTH_1020: //��ũ�� ���� ��
                wb1000 = new SSHealth1000WB();
                wb1000.detailWorkbook(req, res);
                nextPage = "/jsp/ss/health/ss_health_1020_s.jsp";
                break;      
            case SSHealthWBMapping.HEALTH_1030: //��ũ�� ���� �Ա� ����
                wb1000 = new SSHealth1000WB();
                wb1000.saveWorkbook(req, res);
                nextPage = "/jsp/ss/health/ss_health_1030_u.jsp";
                break;  
                
            case SSHealthWBMapping.HEALTH_1100: //��ũ�� ���� �ʱ�
                nextPage = "/jsp/ss/health/ss_health_1100_a.jsp";
                break;   
            case SSHealthWBMapping.HEALTH_1110: //��ũ�� ���� ����Ʈ
                wb1100 = new SSHealth1100WB();
                wb1100.selectWorkbookSend(req, res);
                nextPage = "/jsp/ss/health/ss_health_1110_l.jsp";
                break; 
            case SSHealthWBMapping.HEALTH_1120: //��ũ�� ���� �󼼸���Ʈ
            	wb1100 = new SSHealth1100WB();
                wb1100.detailWorkbookSend(req, res);
                nextPage = "/jsp/ss/health/ss_health_1120_s.jsp";
                break; 
            case SSHealthWBMapping.HEALTH_1130: //��ũ�� ���� ����ó��
            	wb1100 = new SSHealth1100WB();
                wb1100.saveWorkbookSend(req, res);
                nextPage = "/jsp/ss/health/ss_health_1130_u.jsp";
                break;     
            
            default:	
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
