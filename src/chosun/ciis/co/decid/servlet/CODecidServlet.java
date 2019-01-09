/***************************************************************************************************
 * ���ϸ� : CODecidServlet.java
 * ��� : ����-���ڰ���
 * �ۼ����� : 2009-03-12
 * �ۼ��� : ������
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.co.decid.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.decid.wb.CO_DECID_1000WB;
import chosun.ciis.co.base.servlet.DecidBaseServlet;

public class CODecidServlet extends DecidBaseServlet {


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
            String servletMappedUrl = "/co/decid/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("CODecidServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CODecidServlet : process : nextPage : " + nextPage);
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
     * CODecidWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
                                int pid) throws AppException, IOException, SAXException, ParserConfigurationException, SQLException {
        String nextPage = null;
        CO_DECID_1000WB wb = null;
        
        switch (pid) {
        	case CODecidWBMapping.CO_DECID_1000:
        		System.out.println("CO_DECID_1000:::::::::::::::");
        		wb = new CO_DECID_1000WB();
        		wb.co_decid_1001(req, res);
        		nextPage = "/jsp/co/decid/co_decid_1000_i.jsp";
        		break;
        	case CODecidWBMapping.CO_DECID_1001:
        		System.out.println("CO_DECID_1001:::::::::::::::");
                wb = new CO_DECID_1000WB();
                wb.co_decid_1001(req, res);
                nextPage = "/jsp/co/decid/co_decid_1001.jsp";
                break;
        	case CODecidWBMapping.CO_DECID_2000:
        		System.out.println("CO_DECID_2000:::::::::::::::");
                wb = new CO_DECID_1000WB();
                wb.co_decid_2000(req, res);
                nextPage = "/jsp/co/decid/co_decid_2000_i.jsp";
                break;
        	case CODecidWBMapping.CO_DECID_2001:
        		System.out.println("CO_DECID_2001:::::::::::::::");
                wb = new CO_DECID_1000WB();
                wb.co_decid_2001(req, res);
                nextPage = "/jsp/co/decid/co_decid_2001_l.jsp";
                break;
        	case CODecidWBMapping.CO_DECID_3000:
        		System.out.println("CO_DECID_3000:::::::::::::::");
                wb = new CO_DECID_1000WB();
                wb.co_decid_3000(req, res);
                nextPage = "/jsp/co/decid/co_decid_3000.jsp";
                break;
        	case CODecidWBMapping.CO_DECID_4000:
        		System.out.println("CO_DECID_4000:::::::::::::::");
                nextPage = "/jsp/co/decid/co_decid_4000.jsp";
                break;
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
