/***************************************************************************************************
 * ���ϸ�   : AdBrnServlet.java
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
package chosun.ciis.ad.brn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.brn.wb.AdBrn1000WB;
import chosun.ciis.ad.brn.wb.AdBrn1100WB;
import chosun.ciis.ad.brn.wb.AdBrn1200WB;
import chosun.ciis.ad.brn.wb.AdBrn1300WB;
import chosun.ciis.ad.brn.wb.AdBrn1400WB;
import chosun.ciis.ad.brn.wb.AdBrn1600WB;
import chosun.ciis.ad.brn.wb.AdBrn1700WB;
import chosun.ciis.ad.brn.wb.AdBrn1800WB;
import chosun.ciis.ad.brn.wb.AdBrn1900WB;
import chosun.ciis.ad.brn.wb.AdBrn2000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdBrnServlet extends BaseServlet {

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
            String servletMappedUrl = "/ad/brn/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdBrnServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdBrnServlet : process : nextPage : " + nextPage);
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
     * AdBrnWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
//			������        
    		case AdBrnWBMapping.AD_BRN_1000:
    			workbean = new AdBrn1000WB();
    			((AdBrn1000WB)workbean).ad_brn_1000_m(req, res);
    			nextPage = "/jsp/ad/brn/ad_brn_1000_m.jsp";
    			break;	        	
    		case AdBrnWBMapping.AD_BRN_1010:
    			workbean = new AdBrn1000WB();
    			((AdBrn1000WB)workbean).ad_brn_1010_s(req, res);
    			nextPage = "/jsp/ad/brn/ad_brn_1010_s.jsp";
    			break;	        	
    		case AdBrnWBMapping.AD_BRN_1020:
    			workbean = new AdBrn1000WB();
    			((AdBrn1000WB)workbean).ad_brn_1020_a(req, res);
    			nextPage = "/jsp/ad/brn/ad_brn_1020_a.jsp";
    			break;	        	
    		case AdBrnWBMapping.AD_BRN_1030:  
    			workbean = new AdBrn1000WB();
    			((AdBrn1000WB)workbean).ad_brn_1030_l(req, res);
    			nextPage = "/jsp/ad/brn/ad_brn_1030_l.jsp";
    			break;	

//    		���系��     
    		case AdBrnWBMapping.AD_BRN_1110:
    			workbean = new AdBrn1100WB();
    			((AdBrn1100WB)workbean).ad_brn_1110_l(req, res);
    			nextPage = "/jsp/ad/brn/ad_brn_1110_l.jsp";
    			break;	 
    		case AdBrnWBMapping.AD_BRN_1120:
    			workbean = new AdBrn1100WB();
    			((AdBrn1100WB)workbean).ad_brn_1120_l(req, res);
    			nextPage = "/jsp/ad/brn/ad_brn_1120_l.jsp";
    			break;	
    		case AdBrnWBMapping.AD_BRN_1130:
    			workbean = new AdBrn1100WB();
    			((AdBrn1100WB)workbean).ad_brn_1130_l(req, res);
    			nextPage = "/jsp/ad/brn/ad_brn_1130_l.jsp";
    			break;	
//        		�ŷ���ǥ   
        	case AdBrnWBMapping.AD_BRN_1200:
        		workbean = new AdBrn1200WB();
        		((AdBrn1200WB)workbean).ad_brn_1200_m(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1200_m.jsp";
        		break;	        	  
        	case AdBrnWBMapping.AD_BRN_1210:
        		workbean = new AdBrn1200WB();
        		((AdBrn1200WB)workbean).ad_brn_1210_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1210_l.jsp";
        		break;	  

//        		���ݰ�꼭����
        	case AdBrnWBMapping.AD_BRN_1300:
        		workbean = new AdBrn1300WB();
        		((AdBrn1300WB)workbean).ad_brn_1300_m(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1300_m.jsp";
        		break;	             		
        	case AdBrnWBMapping.AD_BRN_1310:
        		workbean = new AdBrn1300WB();
        		((AdBrn1300WB)workbean).ad_brn_1310_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1310_l.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_1311:
        		workbean = new AdBrn1300WB();
        		((AdBrn1300WB)workbean).ad_brn_1311_s(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1311_s.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_1320:
        		workbean = new AdBrn1300WB();
        		((AdBrn1300WB)workbean).ad_brn_1320_a(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1320_a.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_1321:
        		workbean = new AdBrn1300WB();
        		((AdBrn1300WB)workbean).ad_brn_1321_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_1322:
        		workbean = new AdBrn1300WB();
        		((AdBrn1300WB)workbean).ad_brn_1322_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_1330:
        		workbean = new AdBrn1300WB();
        		((AdBrn1300WB)workbean).ad_brn_1330_s(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1330_s.jsp";
        		break;

//        		���ݰ�꼭���೻��
        	case AdBrnWBMapping.AD_BRN_1400:
        		workbean = new AdBrn1400WB();
        		((AdBrn1400WB)workbean).ad_brn_1400_m(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1400_m.jsp";
        		break;	     
        	case AdBrnWBMapping.AD_BRN_1410:
        		workbean = new AdBrn1400WB();
        		((AdBrn1400WB)workbean).ad_brn_1410_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1410_l.jsp";
        		break;	    	  

//        		��������������
        	case AdBrnWBMapping.AD_BRN_1600:
        		workbean = new AdBrn1600WB();
        		((AdBrn1600WB)workbean).ad_brn_1600_m(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1600_m.jsp";
        		break;	         
        	case AdBrnWBMapping.AD_BRN_1610:
        		workbean = new AdBrn1600WB();
        		((AdBrn1600WB)workbean).ad_brn_1610_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1610_l.jsp";
        		break;	         
        	case AdBrnWBMapping.AD_BRN_1620:
        		workbean = new AdBrn1600WB();
        		((AdBrn1600WB)workbean).ad_brn_1620_s(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1620_s.jsp";
        		break;	         
        	case AdBrnWBMapping.AD_BRN_1630:
        		workbean = new AdBrn1600WB();
        		((AdBrn1600WB)workbean).ad_brn_1630_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1630_l.jsp";
        		break;	         
        	case AdBrnWBMapping.AD_BRN_1650:
        		workbean = new AdBrn1600WB();
        		((AdBrn1600WB)workbean).ad_brn_1650_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	     
        		
        	case AdBrnWBMapping.AD_BRN_1710:		//�������� �����ȸ
        		workbean = new AdBrn1700WB();
        		((AdBrn1700WB)workbean).ad_brn_1710_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1710_l.jsp";
        		break;
    		case AdBrnWBMapping.AD_BRN_1715:		//�������� ������ȸ
        		workbean = new AdBrn1700WB();
        		((AdBrn1700WB)workbean).ad_brn_1715_s(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1715_s.jsp";
        		break;
    		case AdBrnWBMapping.AD_BRN_1740:		//�������ô亯  �Է�, ����, ����
        		workbean = new AdBrn1700WB();
        		((AdBrn1700WB)workbean).ad_brn_1740_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	  
    		case AdBrnWBMapping.AD_BRN_1770:		//�������� ÷������ �ٿ�ε�
        		workbean = new AdBrn1700WB();
        		((AdBrn1700WB)workbean).ad_brn_1770_a(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1770_a.jsp";
        		break;     

        	case AdBrnWBMapping.AD_BRN_1810:		//������Ȳ  �����ȸ
        		workbean = new AdBrn1800WB();
        		((AdBrn1800WB)workbean).ad_brn_1810_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1810_l.jsp";
        		break;        		
        	case AdBrnWBMapping.AD_BRN_1820:		//������Ȳ  ����ó��
        		workbean = new AdBrn1800WB();
        		((AdBrn1800WB)workbean).ad_brn_1820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		

        	case AdBrnWBMapping.AD_BRN_1900:		//������Ȳ  �����ȸ
        		workbean = new AdBrn1900WB();
        		((AdBrn1900WB)workbean).ad_brn_1900_m(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1900_m.jsp";
        		break;        		
        	case AdBrnWBMapping.AD_BRN_1910:		//������Ȳ  �����ȸ
        		workbean = new AdBrn1900WB();
        		((AdBrn1900WB)workbean).ad_brn_1910_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_1910_l.jsp";
        		break;        		
        	case AdBrnWBMapping.AD_BRN_1920:		//������Ȳ  ����ó��
        		workbean = new AdBrn1900WB();
        		((AdBrn1900WB)workbean).ad_brn_1920_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		

        	case AdBrnWBMapping.AD_BRN_2000:					//���Ϻ���,���Ϻ�����-����������
        		workbean = new AdBrn2000WB();
        		((AdBrn2000WB)workbean).ad_brn_2000_m(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_2000_m.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_2012:					//���Ϻ���-����������� ��ȸ
        		workbean = new AdBrn2000WB();
        		((AdBrn2000WB)workbean).ad_brn_2012_l(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_2012_l.jsp";
        		break;        		
        	case AdBrnWBMapping.AD_BRN_2030:					//���Ϻ���-�����ǰ�  ����,����
        		workbean = new AdBrn2000WB();
        		((AdBrn2000WB)workbean).ad_brn_2030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_2035:					//���Ϻ���-������ȯ
        		nextPage = "/jsp/ad/brn/ad_brn_2035_t.jsp"; 
        		break;
        	case AdBrnWBMapping.AD_BRN_2040:					//���Ϻ�����-����ȸ
        		workbean = new AdBrn2000WB();
        		((AdBrn2000WB)workbean).ad_brn_2040_s(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_2040_s.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_2050: 					//���Ϻ�����-�Է�,����,����
        		workbean = new AdBrn2000WB();
        		((AdBrn2000WB)workbean).ad_brn_2050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBrnWBMapping.AD_BRN_2055:					//���Ϻ�����-÷����������
        		workbean = new AdBrn2000WB();
        		((AdBrn2000WB)workbean).ad_brn_2055_a(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_2055_a.jsp";
        		break;        		
        	case AdBrnWBMapping.AD_BRN_2090: 					//�߱�����-�μ�
        		workbean = new AdBrn2000WB();
        		((AdBrn2000WB)workbean).ad_brn_2090_a(req, res);
        		nextPage = "/jsp/ad/brn/ad_brn_2090_a.jsp";
        		break;	        		
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
