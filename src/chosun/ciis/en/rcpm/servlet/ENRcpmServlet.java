/***************************************************************************************************
 * ���ϸ� : EN_RCPM_1000Servlet.java
 * ��� : �Ա�ǥ���� ���� Servlet
 * �ۼ����� : 2009.02.11
 * �ۼ��� : �ֽ±�
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.en.rcpm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.en.rcpm.wb.EN_RCPM_1000WB;

public class ENRcpmServlet extends BaseServlet {


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
            String servletMappedUrl = "/en/rcpm/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("Servlet : process : nextPage : " + nextPage);
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
        EN_RCPM_1000WB wb = null;
        
        switch (pid) {
			case ENRcpmWBMapping.EN_RCPM_1001:
				wb = new EN_RCPM_1000WB();
				((EN_RCPM_1000WB)wb).en_rcpm_1001_m(req, res);
				nextPage = "/jsp/en/rcpm/en_rcpm_1001_m.jsp";
				break;
			case ENRcpmWBMapping.EN_RCPM_1002:
				wb = new EN_RCPM_1000WB();
				((EN_RCPM_1000WB)wb).en_rcpm_1002_l(req, res);
				nextPage = "/jsp/en/rcpm/en_rcpm_1002_l.jsp";
				break;
			case ENRcpmWBMapping.EN_RCPM_1003:
				wb = new EN_RCPM_1000WB();
				((EN_RCPM_1000WB)wb).en_rcpm_1003_s(req, res);
				nextPage = "/jsp/en/rcpm/en_rcpm_1003_s.jsp";
				break;
			case ENRcpmWBMapping.EN_RCPM_1004:
				wb = new EN_RCPM_1000WB();
				((EN_RCPM_1000WB)wb).en_rcpm_1004_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				//nextPage = "/jsp/en/rcpm/en_rcpm_1004_i.jsp";
				break;
			case ENRcpmWBMapping.EN_RCPM_1005:
				wb = new EN_RCPM_1000WB();
				((EN_RCPM_1000WB)wb).en_rcpm_1005_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				//nextPage = "/jsp/en/rcpm/en_rcpm_1005_u.jsp";
				break;
       	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
