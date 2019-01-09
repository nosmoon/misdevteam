/***************************************************************************************************
 * ���ϸ� : SEAngServlet.java
 * ��� :  ����
 * �ۼ����� : 
 * �ۼ��� :
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.se.ang.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.ang.wb.*;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class SEAngServlet extends BaseServlet {


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

    public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/se/ang/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SEAngServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SEAngServlet : process : nextPage : " + nextPage);
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
        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SEAngWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
    	String nextPage = null;
        SE_ANG_1000WB wb = null;
        switch (pid) {       
	        case SEAngWBMapping.SE_ANG_1010:
				wb = new SE_ANG_1000WB();			
				((SE_ANG_1000WB)wb).se_ang_1010_l(req, res);
				nextPage = "/jsp/se/ang/se_ang_1010_l.jsp";
				break;
			case SEAngWBMapping.SE_ANG_1020:
				wb = new SE_ANG_1000WB();
				((SE_ANG_1000WB)wb).se_ang_1020_l(req, res);
				nextPage = "/jsp/se/ang/se_ang_1020_l.jsp";
				break;
			case SEAngWBMapping.SE_ANG_1030:
				wb = new SE_ANG_1000WB();
				((SE_ANG_1000WB)wb).se_ang_1030_u(req, res);
				nextPage = "/jsp/se/ang/se_ang_1030_u.jsp";
				break;
        default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
