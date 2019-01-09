/***************************************************************************************************
 * ���ϸ�   : AdComServlet.java
 * ���     : ������� - �������� ����
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/
package chosun.ciis.ad.com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.com.wb.AdCom1400WB;
import chosun.ciis.ad.com.wb.AdCom1500WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdComServlet extends BaseServlet {

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
            String servletMappedUrl = "/ad/com/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdComServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdComServlet : process : nextPage : " + nextPage);
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
     * AdComWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        		
        	case AdComWBMapping.AD_COM_1410:		//������������ / ����Ȯ�α�����Ʈ ��ȸ
        		workbean = new AdCom1400WB();
        		((AdCom1400WB)workbean).ad_com_1410_l(req, res);
        		nextPage = "/jsp/ad/com/ad_com_1410_l.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1420:		//������������ ���, ����, ����
        		workbean = new AdCom1400WB();
        		((AdCom1400WB)workbean).ad_com_1420_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1430:		//����Ȯ�α�����Ʈ ���, ����, ����    
        		workbean = new AdCom1400WB();
        		((AdCom1400WB)workbean).ad_com_1430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1440:		//������������ ���
        		nextPage = "/jsp/ad/com/ad_com_1440_p.jsp";
        		break;
        	case AdComWBMapping.AD_COM_1450:		//����Ȯ�α�����Ʈ ���
        		nextPage = "/jsp/ad/com/ad_com_1450_p.jsp";
        		break;        		        		

        	case AdComWBMapping.AD_COM_1510:		//���� - �����ȸ
        		workbean = new AdCom1500WB();
        		((AdCom1500WB)workbean).ad_com_1510_l(req, res);
        		nextPage = "/jsp/ad/com/ad_com_1510_l.jsp";
        		break;	  
        	case AdComWBMapping.AD_COM_1520:		//���� - ����ȸ
        		workbean = new AdCom1500WB();
        		((AdCom1500WB)workbean).ad_com_1520_s(req, res);
        		nextPage = "/jsp/ad/com/ad_com_1520_s.jsp";
        		break;	        		
        	case AdComWBMapping.AD_COM_1530:		//���� - ���,����,����
        		workbean = new AdCom1500WB();
        		((AdCom1500WB)workbean).ad_com_1530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
