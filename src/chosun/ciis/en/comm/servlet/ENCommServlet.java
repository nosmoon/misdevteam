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


package chosun.ciis.en.comm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.en.comm.wb.EN_COMM_1000WB;

public class ENCommServlet extends BaseServlet {


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
            String servletMappedUrl = "/en/comm/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("nextPage : " + nextPage);
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
        EN_COMM_1000WB wb = null;
        
        switch (pid) {
			case ENCommWBMapping.EN_COMM_1001:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1001_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1001_l.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1002:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1002_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1002_l.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1003:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1003_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1003_l.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1004:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1004_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1004_l.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1005:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1005_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1005_l.jsp";
				break;

			case ENCommWBMapping.EN_COMM_1100:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1100_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1100_l.jsp";
				break;

			case ENCommWBMapping.EN_COMM_1200:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1200_m(req, res);
				nextPage = "/jsp/en/comm/en_comm_1200_m.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1201:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1201_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1201_l.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1202:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1202_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1202_l.jsp";
				break;

			case ENCommWBMapping.EN_COMM_1301:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1301_m(req, res);
				nextPage = "/jsp/en/comm/en_comm_1301_m.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1302:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1302_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1302_l.jsp";
				break;

			case ENCommWBMapping.EN_COMM_1401:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1401_m(req, res);
				nextPage = "/jsp/en/comm/en_comm_1401_m.jsp";
				break;
			case ENCommWBMapping.EN_COMM_1402:
				wb = new EN_COMM_1000WB();
				((EN_COMM_1000WB)wb).en_comm_1402_l(req, res);
				nextPage = "/jsp/en/comm/en_comm_1402_l.jsp";
				break;

			default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}