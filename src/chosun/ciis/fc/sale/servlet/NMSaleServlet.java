/***************************************************************************************************
 * ���ϸ� : NMSaleServlet.java
 * ��� :   �������ǸŰ��� ����
 * �ۼ����� : 
 * �ۼ��� :   
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.fc.sale.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.fc.sale.wb.NM_SALE_1000WB;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class NMSaleServlet extends BaseServlet {


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
            String servletMappedUrl = "/fc/sale/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("NMSaleServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("NMSaleServlet : process : nextPage : " + nextPage);
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
     * SEEtcWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        NM_SALE_1000WB wb1000 = null;
        
        switch (pid) {
        	case NMSaleWBMapping.NM_SALE_1000:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("NM_SALE_1000:::::::::::::::");
	    		wb1000.nm_sale_1000_m(req, res);
	    		nextPage = "/jsp/fc/sale/nm_sale_1000_m.jsp";
	    		break;
        	case NMSaleWBMapping.NM_SALE_1001:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("NM_SALE_1001:::::::::::::::");
	    		wb1000.nm_sale_1001_l(req, res);
	    		nextPage = "/jsp/fc/sale/nm_sale_1001_l.jsp";
	    		break;
        	case NMSaleWBMapping.NM_SALE_1002:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("NM_SALE_1002:::::::::::::::");
	    		wb1000.nm_sale_1002_l(req, res);
	    		nextPage = "/jsp/fc/sale/nm_sale_1002_l.jsp";
	    		break;
        	case NMSaleWBMapping.NM_SALE_1003:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("NM_SALE_1003:::::::::::::::");
	    		wb1000.nm_sale_1003_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case NMSaleWBMapping.NM_SALE_1004:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("NM_SALE_1004:::::::::::::::");
	    		wb1000.nm_sale_1004_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case NMSaleWBMapping.NM_SALE_1005:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("NM_SALE_1005:::::::::::::::");
	    		wb1000.nm_sale_1005_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
//        	case NMSaleWBMapping.NM_SALE_1060:
//        		wb1000 = new NM_SALE_1000WB();
//	            System.out.println("SE_ETC_1060:::::::::::::::");
//	    		wb1000.se_etc_1060_a(req, res);
//	    		nextPage = "/common/jsp/resultMsg.jsp";
//	    		break;
        	case NMSaleWBMapping.NM_SALE_1070:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("SE_ETC_1070:::::::::::::::");
	    		wb1000.se_etc_1070_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case NMSaleWBMapping.NM_SALE_1080:
        		wb1000 = new NM_SALE_1000WB();
	            System.out.println("SE_ETC_1090:::::::::::::::");
	    		wb1000.se_etc_1090_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
