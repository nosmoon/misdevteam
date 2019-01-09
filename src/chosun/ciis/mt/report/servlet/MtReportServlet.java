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


package chosun.ciis.mt.report.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.report.wb.MT_REPORT_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MtReportServlet extends BaseServlet {


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
            String servletMappedUrl = "/mt/report/";
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
        MT_REPORT_1000WB wb = null;
        
        switch (pid) {
	        case MtReportWBMapping.MT_REPORT_1105:
				wb = new MT_REPORT_1000WB();
				((MT_REPORT_1000WB)wb).mt_report_1105_p(req, res);
				nextPage = "/jsp/mt/report/mt_report_1105_p.jsp";
				System.out.println("MT_REPORT_1105:::::::::::::::");
				break;
	        case MtReportWBMapping.MT_REPORT_1003:
				wb = new MT_REPORT_1000WB();
				((MT_REPORT_1000WB)wb).mt_report_1003_l(req, res);
				nextPage = "/jsp/mt/report/mt_report_1003_l.jsp";
				System.out.println("MT_REPORT_1003:::::::::::::::");
				break;	
	        case MtReportWBMapping.MT_REPORT_1103:
				wb = new MT_REPORT_1000WB();
				((MT_REPORT_1000WB)wb).mt_report_1103_l(req, res);
				nextPage = "/jsp/mt/report/mt_report_1103_l.jsp";
				System.out.println("MT_REPORT_1103:::::::::::::::");
				break;	
	        case MtReportWBMapping.MT_REPORT_1701_500:
				wb = new MT_REPORT_1000WB();
				((MT_REPORT_1000WB)wb).mt_report_1701_500_m(req, res);
				nextPage = "/jsp/mt/report/mt_report_1701_500_m.jsp";
				System.out.println("MT_REPORT_1103:::::::::::::::");
				break;	
        	default:        	
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));        		
        }

        return nextPage;
    }
 
}
