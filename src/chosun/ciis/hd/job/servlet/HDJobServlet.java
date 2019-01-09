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


package chosun.ciis.hd.job.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.job.wb.HD_JOB_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDJobServlet extends BaseServlet {


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
            String servletMappedUrl = "/hd/job/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDJobServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDJobServlet : process : nextPage : " + nextPage);
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
        HD_JOB_1000WB wb = null;

        switch (pid) {
			case HDJobWBMapping.HD_JOB_1000:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1000(req, res);
				nextPage = "/jsp/hd/job/hd_job_1000_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1001:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1001(req, res);
				nextPage = "/jsp/hd/job/hd_job_1001_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1002_A:
				wb = new HD_JOB_1000WB();
				((HD_JOB_1000WB)wb).hd_job_1002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1003:
				wb = new HD_JOB_1000WB();
				((HD_JOB_1000WB)wb).hd_job_1003_l(req, res);
				nextPage = "/jsp/hd/job/hd_job_1003_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1004:
				wb = new HD_JOB_1000WB();
				((HD_JOB_1000WB)wb).hd_job_1004_l(req, res);
				nextPage = "/jsp/hd/job/hd_job_1004_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1005_L:
				wb = new HD_JOB_1000WB();
				((HD_JOB_1000WB)wb).hd_job_1005_l(req, res);
				nextPage = "/jsp/hd/job/hd_job_1005_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1006:
				wb = new HD_JOB_1000WB();
				((HD_JOB_1000WB)wb).hd_job_1006_m(req, res);
				nextPage = "/jsp/hd/job/hd_job_1006_m.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1110:
				wb = new HD_JOB_1000WB();
				((HD_JOB_1000WB)wb).hd_job_1110_m(req, res);
				nextPage = "/jsp/hd/job/hd_job_1110_m.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1100_L:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1100_l(req, res);
				nextPage = "/jsp/hd/job/hd_job_1100_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1101:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1101(req, res);
				nextPage = "/jsp/hd/job/hd_job_1101_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1102:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1102(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1103:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1103(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1104_A:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1104_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1105_A:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1105_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1106:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1106_m(req, res);
				nextPage = "/jsp/hd/job/hd_job_1106_m.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1200:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1200_l(req, res);
				nextPage = "/jsp/hd/job/hd_job_1200_l.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1201:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1201_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDJobWBMapping.HD_JOB_1202:
				wb = new HD_JOB_1000WB();
				wb.hd_job_1202_m(req, res);
				nextPage = "/jsp/hd/job/hd_job_1202_m.jsp";
				break;
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
}
