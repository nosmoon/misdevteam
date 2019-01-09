/***************************************************************************************************
 * ���ϸ� : SEBasServlet.java
 * ��� :  ������������
 * �ۼ����� : 2009.01.13
 * �ۼ��� :   ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.se.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;
//import chosun.ciis.se.snd.servlet.SESndWBMapping;
//import chosun.ciis.se.snd.wb.SE_SND_1000WB;
import chosun.ciis.se.test.wb.*;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class SETestServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/test/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SETestServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SETestServlet : process : nextPage : " + nextPage);
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
        SE_TEST_1000WB wb1000 = null;
        switch (pid) {   
	        case SETestWBMapping.SE_TEST_1010:
	        	wb1000 = new SE_TEST_1000WB();
	            System.out.println("SE_TEST_1010:::::::::::::::");
	    		wb1000.se_test_1010_l(req, res);
	    		nextPage = "/jsp/se/test/se_test_1010_l.jsp";
	    	break; 
	        case SETestWBMapping.SE_TEST_1020:
	        	wb1000 = new SE_TEST_1000WB();
	            System.out.println("SE_TEST_1020:::::::::::::::");
	    		wb1000.se_test_1020_l(req, res);
	    		nextPage = "/jsp/se/test/se_test_1020_l.jsp";
	    	break; 
	        case SETestWBMapping.SE_TEST_1000:
	        	wb1000 = new SE_TEST_1000WB();
	            System.out.println("SE_TEST_1000:::::::::::::::");
	    		wb1000.se_test_1000_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    	break; 	    	
	        case SETestWBMapping.SE_TEST_1040:
	        	wb1000 = new SE_TEST_1000WB();
	            System.out.println("SE_TEST_1040:::::::::::::::");
	    		wb1000.se_test_1040_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    	break; 
	        case SETestWBMapping.SE_TEST_1050:
	        	wb1000 = new SE_TEST_1000WB();
	            System.out.println("SE_TEST_1050:::::::::::::::");
	    		wb1000.se_test_1050_l(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    	break; 
        default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
