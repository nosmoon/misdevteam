/***************************************************************************************************
 * ���ϸ� : AdDepServlet.java
 * ��� : �Աݰ�����  ���� �̺�Ʈ �б�
 * �ۼ����� : 2009-01-02
 * �ۼ��� : ���±�
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.ad.dep.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.wb.AdDep1000WB;
import chosun.ciis.ad.dep.wb.AdDep1100WB;
import chosun.ciis.ad.dep.wb.AdDep1200WB;
import chosun.ciis.ad.dep.wb.AdDep1300WB;
import chosun.ciis.ad.dep.wb.AdDep1400WB;
import chosun.ciis.ad.dep.wb.AdDep1500WB;
import chosun.ciis.ad.dep.wb.AdDep1600WB;
import chosun.ciis.ad.dep.wb.AdDep1700WB;
import chosun.ciis.ad.dep.wb.AdDep1800WB;
import chosun.ciis.ad.dep.wb.AdDep1900WB;
import chosun.ciis.ad.dep.wb.AdDep2000WB;
import chosun.ciis.ad.dep.wb.AdDep2100WB;
import chosun.ciis.ad.dep.wb.AdDep2200WB;
import chosun.ciis.ad.dep.wb.AdDep2300WB;
import chosun.ciis.ad.dep.wb.AdDep2400WB;
import chosun.ciis.ad.dep.wb.AdDep2500WB;
import chosun.ciis.ad.dep.wb.AdDep2600WB;
import chosun.ciis.ad.dep.wb.AdDep2700WB;
import chosun.ciis.ad.dep.wb.AdDep2800WB;
import chosun.ciis.ad.dep.wb.AdDep2900WB;
import chosun.ciis.ad.dep.wb.AdDep3000WB;
import chosun.ciis.ad.dep.wb.AdDep3100WB;
import chosun.ciis.ad.dep.wb.AdDep3200WB;
import chosun.ciis.ad.dep.wb.AdDep3300WB;
import chosun.ciis.ad.dep.wb.AdDep3400WB;
import chosun.ciis.ad.dep.wb.AdDep3500WB;
import chosun.ciis.ad.dep.wb.AdDep3600WB;
import chosun.ciis.ad.dep.wb.AdDep3700WB;
import chosun.ciis.ad.dep.wb.AdDep3800WB;
import chosun.ciis.ad.dep.wb.AdDep3900WB;
import chosun.ciis.ad.dep.wb.AdDep4000WB;
import chosun.ciis.ad.dep.wb.AdDep4100WB;
import chosun.ciis.ad.dep.wb.AdDep4200WB;
import chosun.ciis.ad.dep.wb.AdDep4300WB;
import chosun.ciis.ad.dep.wb.AdDep4400WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdDepServlet extends BaseServlet {
	
    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
     *
     * @param req request
     * @param res responsen
     * @throws IOException
     * @throws ServletException
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        String rslt_yn = null;
        try {
        	//IAM ���������ü ���� üũ ��, �����Ϻ���
        	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        	String medi_cd = "";
        	try{
        		medi_cd = Util.getSessionParameterValue(req, "dealmedicd", true);
        	}catch (SysException se) {
        		 medi_cd = "";
        	}
        	if("100".equals(cmpy_cd)){
        		if("".equals(medi_cd)){
        			rslt_yn = "N";
        		}else{
        			rslt_yn = "Y";
        		}
        	}else{
        		rslt_yn = "Y";
        	}
        	if("Y".equals(rslt_yn)){
                String servletMappedUrl = "/ad/dep/";
                iPid = extractPid(req, servletMappedUrl);
                System.out.println("AdDepServlet : process : iPid : " + iPid);
                nextPage = executeWorker(req, res, iPid);
                System.out.println("AdDepServlet : process : nextPage : " + nextPage);
        	}else{
        		nextPage = "/common/jsp/ad_pwr_error.jsp";
        	}
        	//������ �Ʒ� �ּ� �츮�� ���� ���� �ּ� ó����    
//            String servletMappedUrl = "/ad/dep/";
//            iPid = extractPid(req, servletMappedUrl);
//            System.out.println("AdDepServlet : process : iPid : " + iPid);
//            nextPage = executeWorker(req, res, iPid);
//            System.out.println("AdDepServlet : process : nextPage : " + nextPage);
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
     * PilotWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        	case AdDepWBMapping.AD_DEP_1000:
        		workbean = new AdDep1000WB();
        		((AdDep1000WB)workbean).ad_dep_1000_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1000_m.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1010:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1010_s(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1010_s.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1011:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1011_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1011_l.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1012:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1012_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1012_l.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1013:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1013_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1013_l.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1020:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1020_a(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1020_a.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1030:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1040:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
        	case AdDepWBMapping.AD_DEP_1050:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1050_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1050_m.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1051:
        		workbean = new AdDep1000WB();  
        		((AdDep1000WB)workbean).ad_dep_1051_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1051_l.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1055:
        		workbean = new AdDep1000WB();   
        		((AdDep1000WB)workbean).ad_dep_1055_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
        	case AdDepWBMapping.AD_DEP_1100:
        		workbean = new AdDep1100WB();
        		((AdDep1100WB)workbean).ad_dep_1100_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1100_m.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1101:
        		workbean = new AdDep1100WB();
        		((AdDep1100WB)workbean).ad_dep_1101_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1101_m.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1110:
        		workbean = new AdDep1100WB();
        		((AdDep1100WB)workbean).ad_dep_1110_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1111:
        		workbean = new AdDep1100WB();
        		((AdDep1100WB)workbean).ad_dep_1111_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1120:
        		workbean = new AdDep1100WB();
        		((AdDep1100WB)workbean).ad_dep_1120_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1121:
        		workbean = new AdDep1100WB();
        		((AdDep1100WB)workbean).ad_dep_1121_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		
        	case AdDepWBMapping.AD_DEP_1200:
        		workbean = new AdDep1200WB();  
        		((AdDep1200WB)workbean).ad_dep_1200_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1200_m.jsp";
        		break;        	
        	
        	case AdDepWBMapping.AD_DEP_1210:
        		workbean = new AdDep1200WB();  
        		((AdDep1200WB)workbean).ad_dep_1210_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1210_l.jsp";
        		break;        	
        	case AdDepWBMapping.AD_DEP_1220:
        		workbean = new AdDep1200WB();  
        		((AdDep1200WB)workbean).ad_dep_1220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdDepWBMapping.AD_DEP_1230:
        		workbean = new AdDep1200WB();  
        		((AdDep1200WB)workbean).ad_dep_1230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
//        		�ŷ�ó�� ���ó��: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_1300:
        		workbean = new AdDep1300WB();
        		((AdDep1300WB)workbean).ad_dep_1300_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1300_m.jsp";
        		break;
//        		�ŷ�ó�� ���ó��: ������ȸ        		
        	case AdDepWBMapping.AD_DEP_1310:
        		workbean = new AdDep1300WB();
        		((AdDep1300WB)workbean).ad_dep_1310_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1310_l.jsp";
        		break;
//        		�ŷ�ó�� ���ó��: ���ó��        		
        	case AdDepWBMapping.AD_DEP_1320:
        		workbean = new AdDep1300WB();
        		((AdDep1300WB)workbean).ad_dep_1320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

//        		ȯ��ó��: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_1500:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1500_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1500_m.jsp";
        		break;        		
//        		ȯ��ó��: �����ȸ
        	case AdDepWBMapping.AD_DEP_1510:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1510_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1510_l.jsp";
        		break;          	 	
//        		ȯ��ó��: ����ȸ
        	case AdDepWBMapping.AD_DEP_1520:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1520_s(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1520_s.jsp";
        		break;          		
//        		ȯ��ó��: �������ܾ���ȸ
        	case AdDepWBMapping.AD_DEP_1525:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1525_s(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1525_s.jsp";
        		break;          		
//        		ȯ��ó��: �Է�,����,����
        	case AdDepWBMapping.AD_DEP_1530:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1530_a(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1530_a.jsp";
        		break;           		
//        		ȯ��ó��: ������ǥ����, ���
        	case AdDepWBMapping.AD_DEP_1540:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1540_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;          	
          		
//        		�����ǥó��: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_1400:
        		workbean = new AdDep1400WB();
        		((AdDep1400WB)workbean).ad_dep_1400_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1400_m.jsp";
        		break;          	
//        		�����ǥó��: ó��
        	case AdDepWBMapping.AD_DEP_1410:
        		workbean = new AdDep1400WB();
        		((AdDep1400WB)workbean).ad_dep_1410_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;          	
//        		�����ǥó��: ���
        	case AdDepWBMapping.AD_DEP_1420:
        		workbean = new AdDep1400WB();
        		((AdDep1400WB)workbean).ad_dep_1420_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   
        		
//        		������ �� �����ݴ�ü����: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_1600:
        		workbean = new AdDep1600WB();
        		((AdDep1600WB)workbean).ad_dep_1600_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1600_m.jsp";
        		break;
//        		������ �� �����ݴ�ó����: ��ü���� ��ȸ
        	case AdDepWBMapping.AD_DEP_1610:
        		workbean = new AdDep1600WB();
        		((AdDep1600WB)workbean).ad_dep_1610_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1610_l.jsp";
        		break; 
//        		������ �� �����ݴ�ó����: �������ܾ� ��ȸ
        	case AdDepWBMapping.AD_DEP_1620:
        		workbean = new AdDep1600WB();
        		((AdDep1600WB)workbean).ad_dep_1620_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1620_l.jsp";
        		break; 
        		
//        		�Աݳ���: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_1700:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1700_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1700_m.jsp";
        		break;         	
//        		�Աݳ���: �����ȸ
        	case AdDepWBMapping.AD_DEP_1710:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1710_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1710_l.jsp";
        		break;  
        		
//        		�Աݳ���: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_1750:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1750_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1750_m.jsp";
        		break;         	
//        		�Աݳ���: �����ȸ
        	case AdDepWBMapping.AD_DEP_1751:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1751_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1751_l.jsp";
        		break;
        		
//        		�����/���� �������� �� �Աݽ���: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_1800:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1800_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1800_m.jsp";
        		break; 
//        		�����/���� �������� �� �Աݽ���: �����/���� ��ձ��� 
        	case AdDepWBMapping.AD_DEP_1810:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1810_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1810_l.jsp";
        		break; 
//        		���׻�/���� �������� �� �Աݽ��� : �����ȸ  
        	case AdDepWBMapping.AD_DEP_1820:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1820_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1820_l.jsp";
        		break; 
//        		���׻�/���� �������� �� �Աݽ��� : ���系�������ȸ  
        	case AdDepWBMapping.AD_DEP_1830:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1830_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1830_l.jsp";
        		break;
//        		���׻�/���� �������� �� �Աݽ��� : �Աݳ��������ȸ  
        	case AdDepWBMapping.AD_DEP_1840:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1840_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1840_l.jsp";
        		break;
//        		���׻�/���� �������� �� �Աݽ��� : �̼��ݳ��������ȸ  
        	case AdDepWBMapping.AD_DEP_1850:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1850_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1850_l.jsp";
        		break;
        		
        		
//        	�Һи��Ա�ǥó�� 
        	case AdDepWBMapping.AD_DEP_1900:  
        		workbean = new AdDep1900WB();
        		((AdDep1900WB)workbean).ad_dep_1900_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1900_m.jsp";
        		break;     
        	case AdDepWBMapping.AD_DEP_1910:  
        		workbean = new AdDep1900WB();
        		((AdDep1900WB)workbean).ad_dep_1910_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     

//    		�����Ա�Ȯ�� : �����ȸ
        	case AdDepWBMapping.AD_DEP_2010:  
        		workbean = new AdDep2000WB();
        		((AdDep2000WB)workbean).ad_dep_2010_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2010_l.jsp";
        		break;   
            		
//			�������纰 ������ ����: �����ȸ
        	case AdDepWBMapping.AD_DEP_2110:  
        		workbean = new AdDep2100WB();
        		((AdDep2100WB)workbean).ad_dep_2110_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2110_l.jsp";
        		break;         		

//    		���ڰ��� ��� �ŷ�ó: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_2200:  
        		workbean = new AdDep2200WB();
        		((AdDep2200WB)workbean).ad_dep_2200_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2200_m.jsp";
        		break;  
//        	���ڰ��� ��� �ŷ�ó: �����ȸ
        	case AdDepWBMapping.AD_DEP_2210:  
        		workbean = new AdDep2200WB();
        		((AdDep2200WB)workbean).ad_dep_2210_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2210_l.jsp";
        		break;
//        	���ڰ��� ��� �ŷ�ó: ���/����/����
        	case AdDepWBMapping.AD_DEP_2220:  
        		workbean = new AdDep2200WB();
        		((AdDep2200WB)workbean).ad_dep_2220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
//        		�Ա���Ȳ: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_2300:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2300_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2300_m.jsp";
        		break;        		
//        		�Ա���Ȳ: ��纰
        	case AdDepWBMapping.AD_DEP_2310:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2310_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2310_l.jsp";
        		break; 
//        		�Ա���Ȳ: �Ա��Ϻ���
        	case AdDepWBMapping.AD_DEP_2320:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2320_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2320_l.jsp";
        		break;
//        		�Ա���Ȳ: ������纰
        	case AdDepWBMapping.AD_DEP_2330:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2330_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2330_l.jsp";
        		break;
//        		�Ա���Ȳ: �Ⱓ��
        	case AdDepWBMapping.AD_DEP_2340:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2340_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2340_l.jsp";
        		break; 
        		
//        		������Ȳ: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_2400:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2400_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2400_m.jsp";
        		break; 
//        		������Ȳ: �Ա�ó�� 
        	case AdDepWBMapping.AD_DEP_2410:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2410_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2410_l.jsp";
        		break; 
//        		������Ȳ: �ε�������Ȳ
        	case AdDepWBMapping.AD_DEP_2420:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2420_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2420_l.jsp";
        		break;
//        		������Ȳ: ��ȯ����
        	case AdDepWBMapping.AD_DEP_2430:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2430_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2430_l.jsp";
        		break;
//        		�ε�������Ȳ: �Ҹ곻��
        	case AdDepWBMapping.AD_DEP_2440:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2440_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2440_l.jsp";
        		break;

//        		����ε�������Ȳ: �ʱ�ȭ��   
        	case AdDepWBMapping.AD_DEP_2500:  
        		workbean = new AdDep2500WB();
        		((AdDep2500WB)workbean).ad_dep_2500_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2500_m.jsp";
        		break;   
        		
//        		����ε�������Ȳ: �����ȸ   
        	case AdDepWBMapping.AD_DEP_2510:  
        		workbean = new AdDep2500WB();
        		((AdDep2500WB)workbean).ad_dep_2510_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2510_l.jsp";
        		break;   
        		
//        		���ó��������Ա���Ȳ: �ʱ�ȭ��
        	case AdDepWBMapping.AD_DEP_2600:
        		workbean = new AdDep2600WB();
        		((AdDep2600WB)workbean).ad_dep_2600_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2600_m.jsp";
        		break;
//        		���ó��������Ա���Ȳ: �����ȸ 
        	case AdDepWBMapping.AD_DEP_2610:
        		workbean = new AdDep2600WB();
        		((AdDep2600WB)workbean).ad_dep_2610_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2610_l.jsp";
        		break;
//        		���ó��������Ա���Ȳ: �̼��̿��ݳ��� 
        	case AdDepWBMapping.AD_DEP_2620:
        		workbean = new AdDep2600WB();
        		((AdDep2600WB)workbean).ad_dep_2620_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2620_l.jsp";
        		break;

//        		���Ǳ��� �Աݽ�����Ȳ: �����ȸ 
        	case AdDepWBMapping.AD_DEP_2710:
        		workbean = new AdDep2700WB();
        		((AdDep2700WB)workbean).ad_dep_2710_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2710_l.jsp";
        		break;
        		
//        		�ְ���������װ��Աݾ�: �����ȸ 
        	case AdDepWBMapping.AD_DEP_2810:
        		workbean = new AdDep2800WB();
        		((AdDep2800WB)workbean).ad_dep_2810_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2810_l.jsp";
        		break;
        		
//        		�����Ա��Ѱ�: �����ȸ 
        	case AdDepWBMapping.AD_DEP_2910:
        		workbean = new AdDep2900WB();
        		((AdDep2900WB)workbean).ad_dep_2910_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2910_l.jsp";
        		break;
//        		���Ա��� �м� �� ����: �����ȸ 
        	case AdDepWBMapping.AD_DEP_3010:
        		workbean = new AdDep3000WB();
        		((AdDep3000WB)workbean).ad_dep_3010_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3010_l.jsp";
        		break;
//        		������� �Աݱ���: �ʱ�ȭ�� 
        	case AdDepWBMapping.AD_DEP_3100:
        		workbean = new AdDep3100WB();
        		((AdDep3100WB)workbean).ad_dep_3100_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3100_m.jsp";
        		break;
//        		������� �Աݱ���: ���,����,�⺰  �����ȸ
        	case AdDepWBMapping.AD_DEP_3110:
        		workbean = new AdDep3100WB();
        		((AdDep3100WB)workbean).ad_dep_3110_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3110_l.jsp";
        		break;        		
//        		�����������Աݱ���: �ʱ�ȭ�� 
        	case AdDepWBMapping.AD_DEP_3200:
        		workbean = new AdDep3200WB();
        		((AdDep3200WB)workbean).ad_dep_3200_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3200_m.jsp";
        		break;
//        		�����������Աݱ���: �����ȸ
        	case AdDepWBMapping.AD_DEP_3210:
        		workbean = new AdDep3200WB();
        		((AdDep3200WB)workbean).ad_dep_3210_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3210_l.jsp";
        		break;        		
//        		�ֿ�ŷ�ó�������Աݽ���: �����ȸ
        	case AdDepWBMapping.AD_DEP_3310:
        		workbean = new AdDep3300WB();
        		((AdDep3300WB)workbean).ad_dep_3310_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3310_l.jsp";
        		break;
        		
        		
//        		��޺� �̼�����Ȳ: �ʱ�ȭ�� 
        	case AdDepWBMapping.AD_DEP_3400:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3400_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3400_m.jsp";
        		break;        		
//        		��޺� �̼�����Ȳ: ��� �����ȸ 
        	case AdDepWBMapping.AD_DEP_3410:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3410_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3410_l.jsp";
        		break; 
//        		��޺� �̼�����Ȳ: ���� �����ȸ
        	case AdDepWBMapping.AD_DEP_3420:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3420_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3420_l.jsp";
        		break; 
//        		��޺� �̼�����Ȳ: �⺰ �����ȸ
        	case AdDepWBMapping.AD_DEP_3430:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3430_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3430_l.jsp";
        		break; 
        		
//        		�ν�ä������
        	case AdDepWBMapping.AD_DEP_3500:  
        		workbean = new AdDep3500WB();
        		((AdDep3500WB)workbean).ad_dep_3500_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3500_m.jsp";
        		break;   
        	case AdDepWBMapping.AD_DEP_3510:  
        		workbean = new AdDep3500WB();
        		((AdDep3500WB)workbean).ad_dep_3510_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3510_l.jsp";
        		break;         		
        	case AdDepWBMapping.AD_DEP_3520:  
        		workbean = new AdDep3500WB();
        		((AdDep3500WB)workbean).ad_dep_3520_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3520_l.jsp";
        		break;         		
        	case AdDepWBMapping.AD_DEP_3530:  
        		workbean = new AdDep3500WB();
        		((AdDep3500WB)workbean).ad_dep_3530_a(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3530_a.jsp";
        		break;         		
        	case AdDepWBMapping.AD_DEP_3540:  
        		workbean = new AdDep3500WB();
        		((AdDep3500WB)workbean).ad_dep_3540_a(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3540_a.jsp";
        		break;         		

//        		�ν�ä�Ǻ���
        	case AdDepWBMapping.AD_DEP_3610:  
        		workbean = new AdDep3600WB();
        		((AdDep3600WB)workbean).ad_dep_3610_s(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3610_s.jsp";
        		break;           
        	case AdDepWBMapping.AD_DEP_3620:  
        		workbean = new AdDep3600WB();
        		((AdDep3600WB)workbean).ad_dep_3620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    

//        		�ν�ä����Ȳǥ
        	case AdDepWBMapping.AD_DEP_3700:  
        		workbean = new AdDep3700WB();
        		((AdDep3700WB)workbean).ad_dep_3700_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3700_m.jsp";
        		break;   
        	case AdDepWBMapping.AD_DEP_3710:  
        		workbean = new AdDep3700WB();
        		((AdDep3700WB)workbean).ad_dep_3710_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3710_l.jsp";
        		break;    
        	case AdDepWBMapping.AD_DEP_3715:  
        		workbean = new AdDep3700WB();
        		((AdDep3700WB)workbean).ad_dep_3715_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   
        	case AdDepWBMapping.AD_DEP_3720:  
        		workbean = new AdDep3700WB();
        		((AdDep3700WB)workbean).ad_dep_3720_s(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3720_s.jsp";
        		break;   
        	case AdDepWBMapping.AD_DEP_3730:  
        		workbean = new AdDep3700WB();
        		((AdDep3700WB)workbean).ad_dep_3730_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 

//        		��� ���װ��� ó��
        	case AdDepWBMapping.AD_DEP_3800:  
        		workbean = new AdDep3800WB();
        		((AdDep3800WB)workbean).ad_dep_3800_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3800_m.jsp";
        		break;      
        	case AdDepWBMapping.AD_DEP_3810:  
        		workbean = new AdDep3800WB();
        		((AdDep3800WB)workbean).ad_dep_3810_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3810_l.jsp";
        		break;       
        	case AdDepWBMapping.AD_DEP_3820:  
        		workbean = new AdDep3800WB();
        		((AdDep3800WB)workbean).ad_dep_3820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;         		
        		
        		
//        		���
        	case AdDepWBMapping.AD_DEP_3900:
        		workbean = new AdDep3900WB();
        		((AdDep3900WB)workbean).ad_dep_3900_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3900_m.jsp";
        		break;       

        	case AdDepWBMapping.AD_DEP_4010:
        		workbean = new AdDep4000WB();
        		((AdDep4000WB)workbean).ad_dep_4010_a(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_4010_a.jsp";
        		break;  

        	case AdDepWBMapping.AD_DEP_4110:
        		workbean = new AdDep4100WB();
        		((AdDep4100WB)workbean).ad_dep_4110_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 

//        		ä��ä����ȸ��(����)
        	case AdDepWBMapping.AD_DEP_4200:  
        		workbean = new AdDep4200WB();
        		((AdDep4200WB)workbean).ad_dep_4200_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_4200_m.jsp";
        		break;   
        	case AdDepWBMapping.AD_DEP_4210:  
        		workbean = new AdDep4200WB();
        		((AdDep4200WB)workbean).ad_dep_4210_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_4210_l.jsp";
        		break;         		
        	case AdDepWBMapping.AD_DEP_4220:  
        		workbean = new AdDep4200WB();
        		((AdDep4200WB)workbean).ad_dep_4220_a(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_4220_a.jsp";
        		break;         		
        	case AdDepWBMapping.AD_DEP_4221:  
        		workbean = new AdDep4200WB();
        		((AdDep4200WB)workbean).ad_dep_4221_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;          		

//        		���ھ������ε�
        	case AdDepWBMapping.AD_DEP_4300:  
        		workbean = new AdDep4300WB();
        		((AdDep4300WB)workbean).ad_dep_4300_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_4300_m.jsp";
        		break;   
        	case AdDepWBMapping.AD_DEP_4310:  
        		workbean = new AdDep4300WB();
        		((AdDep4300WB)workbean).ad_dep_4310_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_4310_l.jsp";
        		break;         		
        	case AdDepWBMapping.AD_DEP_4350:  
        		workbean = new AdDep4300WB();
        		((AdDep4300WB)workbean).ad_dep_4350_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
//        		������纰�����϶�ǥ
        	case AdDepWBMapping.AD_DEP_4410:  
        		workbean = new AdDep4400WB();
        		((AdDep4400WB)workbean).ad_dep_4410_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_4410_l.jsp";
        		break;         		
        	case AdDepWBMapping.AD_DEP_4450:  
        		workbean = new AdDep4400WB();
        		((AdDep4400WB)workbean).ad_dep_4450_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;  
        		
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
