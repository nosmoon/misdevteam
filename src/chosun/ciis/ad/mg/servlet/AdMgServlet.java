/***************************************************************************************************
 * ���ϸ� : AdMgServlet.java
 * ��� : �����۾�  ���� �̺�Ʈ �б�
 * �ۼ����� : 2009-01-02
 * �ۼ��� : ���±�
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.ad.mg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.mg.wb.AdMg1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdMgServlet extends BaseServlet {
	
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
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ad/mg/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdMgServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdMgServlet : process : nextPage : " + nextPage);
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
     * AdMgWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        BaseWB workbean = null;
		
        switch (pid) {
        	case AdMgWBMapping.AD_MG_1010:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1010_l(req, res);
        		nextPage = "/jsp/ad/mg/ad_mg_1010_l.jsp";
        		break;     
        	case AdMgWBMapping.AD_MG_1020:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
        	case AdMgWBMapping.AD_MG_1030:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
        	case AdMgWBMapping.AD_MG_1040:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    
        	case AdMgWBMapping.AD_MG_1050:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    
        	case AdMgWBMapping.AD_MG_1060:
        		workbean = new AdMg1000WB();
        		((AdMg1000WB)workbean).ad_mg_1060_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
            		
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
