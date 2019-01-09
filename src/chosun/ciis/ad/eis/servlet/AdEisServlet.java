/***************************************************************************************************
 * ���ϸ� : AdEisServlet.java
 * ��� : ���ݰ�꼭����  ���� �̺�Ʈ �б�
 * �ۼ����� : 2009-01-02
 * �ۼ��� : ���±�
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.ad.eis.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.eis.wb.AdEis1000WB;
import chosun.ciis.ad.eis.wb.AdEis1100WB;
import chosun.ciis.ad.eis.wb.AdEis1200WB;
import chosun.ciis.ad.eis.wb.AdEis1300WB;
import chosun.ciis.ad.eis.wb.AdEis1400WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdEisServlet extends BaseServlet {

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
            String servletMappedUrl = "/ad/eis/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdEisServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdEisServlet : process : nextPage : " + nextPage);
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
     * AdEisWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
//			����50�뱤���ֱ������        
        	case AdEisWBMapping.AD_EIS_1010:
        		workbean = new AdEis1000WB();
        		((AdEis1000WB)workbean).ad_eis_1010_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1010_l.jsp";
        		break;
        	case AdEisWBMapping.AD_EIS_1020:
        		workbean = new AdEis1000WB();
        		((AdEis1000WB)workbean).ad_eis_1020_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1020_l.jsp";
        		break;
        		
//			����50�뱤���ֹ�۱����Է�
        	case AdEisWBMapping.AD_EIS_1110:
        		workbean = new AdEis1100WB();
        		((AdEis1100WB)workbean).ad_eis_1110_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1110_l.jsp";
        		break;
        	case AdEisWBMapping.AD_EIS_1120:
        		workbean = new AdEis1100WB();
        		((AdEis1100WB)workbean).ad_eis_1120_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

//    		���Ǽ��Ǻ� ���ϰ���׹׹�����
        	case AdEisWBMapping.AD_EIS_1200:
        		workbean = new AdEis1200WB();
        		((AdEis1200WB)workbean).ad_eis_1200_m(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1200_m.jsp";
        		break;        		
        	case AdEisWBMapping.AD_EIS_1210:
        		workbean = new AdEis1200WB();
        		((AdEis1200WB)workbean).ad_eis_1210_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1210_l.jsp";
        		break;   

//        		����� �� ������ - ���� 
            case AdEisWBMapping.AD_EIS_1310:
            	workbean = new AdEis1300WB();
            	((AdEis1300WB)workbean).ad_eis_1310_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1310_l.jsp";
            	break;
//        		����� �� ������ - �⺰ 
            case AdEisWBMapping.AD_EIS_1320:
            	workbean = new AdEis1300WB();
            	((AdEis1300WB)workbean).ad_eis_1320_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1320_l.jsp";
            	break;
        		
//    		�������м�
            case AdEisWBMapping.AD_EIS_1400:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1400_m(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1400_m.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1410:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1410_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1410_l.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1420:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1420_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1420_l.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1425:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1425_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1425_l.jsp";
            	break;      		
            case AdEisWBMapping.AD_EIS_1430:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1430_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1430_l.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1440:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1440_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1440_l.jsp";
            	break;       		
            case AdEisWBMapping.AD_EIS_1450:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1450_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1450_l.jsp";
            	break;  
            	
            case AdEisWBMapping.AD_EIS_1600:
            	String pubc_dt	=	Util.checkString(req.getParameter("pubc_dt"));
            	nextPage = "/xrw/ad/eis/ad_eis_1600.jsp?pubc_dt="+pubc_dt;
            	break;        		            	

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
