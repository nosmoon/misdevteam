package chosun.ciis.as.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.test.wb.AS_TEST_1000WB;
import chosun.ciis.as.test.servlet.AsTestWBMapping;



public class AsTestServlet extends BaseServlet {


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
     */ 

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/as/test/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AsTest1000Servlet : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AsTest1000Servlet : nextPage : " + nextPage);
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
        String nextPage = null;
        AS_TEST_1000WB wb = null;

        System.out.println("1111111111111111111111::::::::::");
        switch (pid) {
	    	case AsTestWBMapping.AS_TEST_1000:
				wb = new AS_TEST_1000WB();
				((AS_TEST_1000WB)wb).as_test_1000_m(req, res);
				nextPage = "/jsp/as/test/as_test_1000_m.jsp";
				break; 
        	case AsTestWBMapping.AS_TEST_1001:
				wb = new AS_TEST_1000WB();
				((AS_TEST_1000WB)wb).as_test_1001_m(req, res);
				nextPage = "/jsp/as/test/as_test_1001_m.jsp";
				break; 
        	case AsTestWBMapping.AS_TEST_1002:
				wb = new AS_TEST_1000WB();
				((AS_TEST_1000WB)wb).as_test_1002_l(req, res);
				nextPage = "/jsp/as/test/as_test_1002_l.jsp";
				break;
				/*
        	case MtCommatrWBMapping.MT_COMMATR_5020:
				wb5 = new MT_COMMATR_5000WB();
				wb5.mt_commatr_5020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_5030:
				wb5 = new MT_COMMATR_5000WB();
				((MT_COMMATR_5000WB)wb5).mt_commatr_5030_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_5030_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_5040:
				wb5 = new MT_COMMATR_5000WB();
				wb5.mt_commatr_5040_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;*/
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
}