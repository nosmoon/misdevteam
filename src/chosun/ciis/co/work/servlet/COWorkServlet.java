/***************************************************************************************************
* ���ϸ� : COWorkServlet.java
* ��� : �����۾�
 * �ۼ����� : 2009-06-04
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.co.work.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.work.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class COWorkServlet extends BaseServlet {

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
            String servletMappedUrl = "/co/work/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("COWorkServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            
            System.out.println("COWorkServlet : process : nextPage : " + nextPage);
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
     * COWorkWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
                                int pid) throws AppException, IOException, SQLException {
        String nextPage = null;
        BaseWB workbean = null;
        
        switch (pid) {
        	//������Ȳ��ȸ
			case COWorkWBMapping.CO_WORK_1000:
				workbean = new CO_WORK_1000WB();
				((CO_WORK_1000WB)workbean).co_work_1000_m(req, res);
				nextPage = "/jsp/co/work/co_work_1000_m.jsp";
				break;
			case COWorkWBMapping.CO_WORK_1010:
				workbean = new CO_WORK_1000WB();
				((CO_WORK_1000WB)workbean).co_work_1010_l(req, res);
				nextPage = "/jsp/co/work/co_work_1010_l.jsp";
				break;
        		
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
