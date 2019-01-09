/***************************************************************************************************
 * ���ϸ� : AdBasServlet.java
 * ��� : �����ڷ������  ���� �̺�Ʈ �б�
 * �ۼ����� : 2009-01-02
 * �ۼ��� : ���±�
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.ad.bas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.wb.AdBas1000WB;
import chosun.ciis.ad.bas.wb.AdBas1100WB;
import chosun.ciis.ad.bas.wb.AdBas1200WB;
import chosun.ciis.ad.bas.wb.AdBas1300WB;
import chosun.ciis.ad.bas.wb.AdBas1400WB;
import chosun.ciis.ad.bas.wb.AdBas1500WB;
import chosun.ciis.ad.bas.wb.AdBas1600WB;
import chosun.ciis.ad.bas.wb.AdBas1700WB;
import chosun.ciis.ad.bas.wb.AdBas1800WB;
import chosun.ciis.ad.bas.wb.AdBas1900WB;
import chosun.ciis.ad.bas.wb.AdBas2000WB;
import chosun.ciis.ad.bas.wb.AdBas2100WB;
import chosun.ciis.ad.bas.wb.AdBas2200WB;
import chosun.ciis.ad.bas.wb.AdBas2300WB;
import chosun.ciis.ad.bas.wb.AdBas2500WB;
import chosun.ciis.ad.bas.wb.AdBas2600WB;
import chosun.ciis.ad.bas.wb.AdBas2700WB;
import chosun.ciis.ad.bas.wb.AdBas2800WB;
import chosun.ciis.ad.bas.wb.AdBas2900WB;
import chosun.ciis.ad.bas.wb.AdBas3000WB;
import chosun.ciis.ad.bas.wb.AdBas3100WB;
import chosun.ciis.ad.bas.wb.AdBas3200WB;
import chosun.ciis.ad.bas.wb.AdBas3300WB;
import chosun.ciis.ad.bas.wb.AdBas3400WB;
import chosun.ciis.ad.bas.wb.AdBas3500WB;
import chosun.ciis.ad.bas.wb.AdBas3600WB;
import chosun.ciis.ad.bas.wb.AdBas3700WB;
import chosun.ciis.ad.pub.wb.AdPub1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdBasServlet extends BaseServlet {

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
                String servletMappedUrl = "/ad/bas/";
                iPid = extractPid(req, servletMappedUrl);
                System.out.println("AdBasServlet : process : iPid : " + iPid);
                nextPage = executeWorker(req, res, iPid);
                System.out.println("AdBasServlet : process : nextPage : " + nextPage);
        	}else{
        		nextPage = "/common/jsp/ad_pwr_error.jsp";
        	}
        	//������ �Ʒ� �ּ� �츮�� ���� ���� �ּ� ó����        	
//            String servletMappedUrl = "/ad/bas/";
//            iPid = extractPid(req, servletMappedUrl);
//            System.out.println("AdBasServlet : process : iPid : " + iPid);
//            nextPage = executeWorker(req, res, iPid);
//            System.out.println("AdBasServlet : process : nextPage : " + nextPage);
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
                                int pid) throws Exception{
        String nextPage = null;
        BaseWB workbean = null;
        String acct_cd  = Util.getSessionParameterValue(req, "uid", true);        
        switch (pid) {
        	case AdBasWBMapping.AD_BAS_1000:
        		workbean = new AdBas1000WB();
        		((AdBas1000WB)workbean).ad_bas_1000_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1000_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1010:
        		workbean = new AdBas1000WB();
        		((AdBas1000WB)workbean).ad_bas_1010_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1010_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1030:
        		workbean = new AdBas1000WB(); 
        		((AdBas1000WB)workbean).ad_bas_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1050:
        		workbean = new AdBas1000WB();
        		((AdBas1000WB)workbean).ad_bas_1050_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1050_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1051:
        		workbean = new AdBas1000WB();
        		((AdBas1000WB)workbean).ad_bas_1051_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1051_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1055:
        		workbean = new AdBas1000WB();
        		((AdBas1000WB)workbean).ad_bas_1055_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1100:
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1100_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1100_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1110:
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1110_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1110_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1120:
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1120_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1120_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1150:
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1150_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp"; 
        		break;
        	case AdBasWBMapping.AD_BAS_1130:
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp"; 
        		break;
        	case AdBasWBMapping.AD_BAS_1160:
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1160_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1170: 
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1170_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1180:  
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1180_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1180_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1190: 
        		workbean = new AdBas1100WB();
        		((AdBas1100WB)workbean).ad_bas_1190_i(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1210: 
        		workbean = new AdBas1200WB();
        		((AdBas1200WB)workbean).ad_bas_1210_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1210_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1220: 
        		workbean = new AdBas1200WB();
        		((AdBas1200WB)workbean).ad_bas_1220_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1220_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1230: 
        		workbean = new AdBas1200WB();  
        		((AdBas1200WB)workbean).ad_bas_1230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1300: 					//�����/���� �㺸���� ��ȸ ����
        		workbean = new AdBas1300WB();
        		((AdBas1300WB)workbean).ad_bas_1300_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1300_m.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_1310: 					//�����/���� �㺸���� ��ȸ ����Ʈ
        		workbean = new AdBas1300WB();
        		((AdBas1300WB)workbean).ad_bas_1310_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1310_l.jsp";
        		break;  
        	case AdBasWBMapping.AD_BAS_1410: 					//��纰 �ŷ�ó ��ȸ ����Ʈ
        		workbean = new AdBas1400WB();
        		((AdBas1400WB)workbean).ad_bas_1410_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1410_l.jsp";
        		break;       
        	case AdBasWBMapping.AD_BAS_1420: 					//��纰 �ŷ�ó ��ȸ ����Ʈ
        		workbean = new AdBas1400WB();
        		((AdBas1400WB)workbean).ad_bas_1420_i(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;           		
        	case AdBasWBMapping.AD_BAS_1500:					//���Ϻ���,���Ϻ�����-����������
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1500_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1500_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1510:					//���Ϻ���-�ŷ�ó�����ڷ� ��ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1510_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1510_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1511:					//���Ϻ���-�������� ��ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1511_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1511_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1512:					//���Ϻ���-����������� ��ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1512_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1512_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1520:					//���Ϻ���-�߱����� ��ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1520_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1520_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1521:					//���Ϻ���-�������� ��ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1521_l(req, res); 
        		nextPage = "/jsp/ad/bas/ad_bas_1521_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1530:					//���Ϻ���-�����ǰ�  ����,����
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1535:					//���Ϻ���-������ȯ
        		nextPage = "/jsp/ad/bas/ad_bas_1535_t.jsp"; 
        		break;
        	case AdBasWBMapping.AD_BAS_1540:					//���Ϻ�����-����ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1540_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1540_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1550: 					//���Ϻ�����-�Է�,����,����
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1555:					//���Ϻ�����-÷����������
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1555_a(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1555_a.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1560:  					//���Ϻ�����-������ ��ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1560_l(req, res);        		
        		nextPage = "/jsp/ad/bas/ad_bas_1560_p.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1570:					//�߱�����-����ȸ
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1570_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1570_s.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1580: 					//�߱�����-�Է�,����,����
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1580_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1590: 					//�߱�����-�μ�
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1590_a(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1590_a.jsp";
        		break;		
        		
//        	�����ŷ�ó ä��ä����Ȳ �� ��������-�����ȸ
        	case AdBasWBMapping.AD_BAS_1610:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1610_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1610_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1611:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1611_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1611_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1612:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1612_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1612_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1613:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1613_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1615:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1615_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1615_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1616:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1616_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1616_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1617:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1617_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1617_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1618:					
        		workbean = new AdBas1600WB();
        		((AdBas1600WB)workbean).ad_bas_1618_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1618_l.jsp";
        		break;
 
//          �����ŷ�ó ä��ä����Ȳ �� ��������-ä��ä����Ȳ-�����ȸ
        	case AdBasWBMapping.AD_BAS_1710:					
        		workbean = new AdBas1700WB();
        		((AdBas1700WB)workbean).ad_bas_1710_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1710_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1711:					
        		workbean = new AdBas1700WB();
        		((AdBas1700WB)workbean).ad_bas_1710_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1711_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1720:					
        		workbean = new AdBas1700WB();
        		((AdBas1700WB)workbean).ad_bas_1720_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		

//          �����ŷ�ó ä��ä����Ȳ �� ��������-�ŷ�ó������Ȳ
        	case AdBasWBMapping.AD_BAS_1810:					
        		workbean = new AdBas1800WB();
        		((AdBas1800WB)workbean).ad_bas_1810_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1810_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1820:					
        		workbean = new AdBas1800WB();
        		((AdBas1800WB)workbean).ad_bas_1820_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1820_s.jsp";
        		break;         		
        	case AdBasWBMapping.AD_BAS_1830:					
        		workbean = new AdBas1800WB();
        		((AdBas1800WB)workbean).ad_bas_1830_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        	
        		
//          �����ŷ�ó ä��ä����Ȳ �� ��������-�����������
        	case AdBasWBMapping.AD_BAS_1910:					
        		workbean = new AdBas1900WB();
        		((AdBas1900WB)workbean).ad_bas_1910_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1910_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1920:					
        		workbean = new AdBas1900WB();
        		((AdBas1900WB)workbean).ad_bas_1920_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1920_s.jsp";
        		break;         		
        	case AdBasWBMapping.AD_BAS_1930:					
        		workbean = new AdBas1900WB();
        		((AdBas1900WB)workbean).ad_bas_1930_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     		
        	case AdBasWBMapping.AD_BAS_1951:					
        		workbean = new AdBas1900WB();
        		((AdBas1900WB)workbean).ad_bas_1951_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1951_l.jsp";
        		break;   		
        	case AdBasWBMapping.AD_BAS_1952:					
        		workbean = new AdBas1900WB();
        		((AdBas1900WB)workbean).ad_bas_1952_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1952_l.jsp";
        		break;  
        	case AdBasWBMapping.AD_BAS_1953:					
        		workbean = new AdBas1900WB();
        		((AdBas1900WB)workbean).ad_bas_1953_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1953_s.jsp";
        		break;  
        		
//          �����/���� ä��ä����Ȳ - �����ȸ
        	case AdBasWBMapping.AD_BAS_2010:					
        		workbean = new AdBas2000WB();
        		((AdBas2000WB)workbean).ad_bas_2010_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2010_l.jsp";
        		break;             		
            		
        	case AdBasWBMapping.AD_BAS_2100: 					//�ŷ�ó�ι����� ����
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2100_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2100_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2110: 					//�ŷ�ó�ι����� ����Ʈ
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2100_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2110_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2115: 					//�ŷ�ó�ι����� ���������� ����Ʈ
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2120_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2130_l.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_2120: 					//�ŷ�ó�ι����� ��
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2110_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2120_s.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_2130: 					//�ŷ�ó�ι����� ���,����,����
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2140: 					//�ŷ�ó�ι����� ���������� ���
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2140_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

        		
//        		������纰 Ȱ������
        	case AdBasWBMapping.AD_BAS_2210:					
        		workbean = new AdBas2200WB();
        		((AdBas2200WB)workbean).ad_bas_2210_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2210_l.jsp";
        		break;	
        		
//        		�������ߵ��� 	
        	case AdBasWBMapping.AD_BAS_2300:					
        		workbean = new AdBas2300WB();
        		((AdBas2300WB)workbean).ad_bas_2300_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2300_m.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_2310:					
        		workbean = new AdBas2300WB();
        		((AdBas2300WB)workbean).ad_bas_2310_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2310_l.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_2320:					
        		workbean = new AdBas2300WB();
        		((AdBas2300WB)workbean).ad_bas_2320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        		
        	case AdBasWBMapping.AD_BAS_2510:		//�����ǥ, �ְ��������, ����/�Ⱓ �����, ���� ���紩�� ��Ȳ   ��ȸ			
        		workbean = new AdBas2500WB();
        		((AdBas2500WB)workbean).ad_bas_2510_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2510_l.jsp";
        		break;	
        		
        		
        	case AdBasWBMapping.AD_BAS_2600:					//��ǥ���� �ʱ�
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2600_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2600_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2610:					//��ǥ���� ��ȸ(��ü��)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2610_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2610_l.jsp";   		  
        		break;      
        	case AdBasWBMapping.AD_BAS_2615:  					//��ǥ���� ��ȸ(��ü��)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2615_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2615_l.jsp";   		
        		break;        		
        	case AdBasWBMapping.AD_BAS_2620:					//��ǥ���� ��ȸ(��Ʈ��)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2620_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2620_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2630:					//��ǥ���� ��ȸ(��纰)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2630_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2630_l.jsp";        		
        		break;
        	case AdBasWBMapping.AD_BAS_2640:					//��ǥ���� ��ȸ(�������纰)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2640_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2640_l.jsp";        		   		
        		break;        		        		
        	case AdBasWBMapping.AD_BAS_2650:					//��ǥ���� ����
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2650_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_2700:					//��Ʈ���� �ʱ�
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2700_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2700_m.jsp";
        		break;
        		
        	case AdBasWBMapping.AD_BAS_2710:					//��Ʈ���� ��ȸ
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2710_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2710_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_2720:					//�������� ��ȸ
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2720_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2720_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2730:					//��Ʈ���� �Է�, ����, ����
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2730_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2740:					//�������� �Է�, ����, ����
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2740_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        		
//        		������ȸ - ��纰��ȸ 
        	case AdBasWBMapping.AD_BAS_2800:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2800_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2800_m.jsp";
        		break;   
//        		������ȸ - ��纰��ȸ 
        	case AdBasWBMapping.AD_BAS_2810:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2810_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2810_l.jsp";
        		break;        
//        		������ȸ - ��Ʈ����ȸ 
        	case AdBasWBMapping.AD_BAS_2820:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2820_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2820_l.jsp";
        		break;     
//        		������ȸ - ������ȸ 
        	case AdBasWBMapping.AD_BAS_2830:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2830_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2830_l.jsp";
        		break;   
        		
//        		���Ǳ��������ȸ - ��纰��ȸ 
        	case AdBasWBMapping.AD_BAS_2900:					
        		workbean = new AdBas2900WB();
        		((AdBas2900WB)workbean).ad_bas_2900_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2900_m.jsp";
        		break;      
        	case AdBasWBMapping.AD_BAS_2910:					
        		workbean = new AdBas2900WB();
        		((AdBas2900WB)workbean).ad_bas_2910_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2910_l.jsp";
        		break;      

        	case AdBasWBMapping.AD_BAS_3000:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3000WB();
        		((AdBas3000WB)workbean).ad_bas_3000_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3000_m.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3010:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3000WB();
        		((AdBas3000WB)workbean).ad_bas_3010_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3010_l.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3020:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3000WB();
        		((AdBas3000WB)workbean).ad_bas_3020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;  
        		
//        		���Ǳ��������ȸ - ��ü����ȸ 
        	case AdBasWBMapping.AD_BAS_2920:					
        		workbean = new AdBas2900WB();
        		((AdBas2900WB)workbean).ad_bas_2920_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2920_l.jsp";
        		break;        		

//        		���ߵ�����������ȸ
        	case AdBasWBMapping.AD_BAS_3110: 					
        		workbean = new AdBas3100WB();
        		((AdBas3100WB)workbean).ad_bas_3110_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3110_l.jsp";
        		break;        
        	case AdBasWBMapping.AD_BAS_3120: 					
        		workbean = new AdBas3100WB();
        		((AdBas3100WB)workbean).ad_bas_3120_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3120_l.jsp";
        		break;        
        	case AdBasWBMapping.AD_BAS_3130: 					
        		workbean = new AdBas3100WB();
        		((AdBas3100WB)workbean).ad_bas_3130_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3130_l.jsp";
        		break;        
        	case AdBasWBMapping.AD_BAS_3140: 					
        		workbean = new AdBas3100WB();
        		((AdBas3100WB)workbean).ad_bas_3140_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3140_l.jsp";
        		break;        
        	case AdBasWBMapping.AD_BAS_3150: 					
        		workbean = new AdBas3100WB();
        		((AdBas3100WB)workbean).ad_bas_3150_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3150_l.jsp";
        		break;        
        		
//        		���ߵ����������Է�
        	case AdBasWBMapping.AD_BAS_3200: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3200_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3200_m.jsp";
        		break;        
        	case AdBasWBMapping.AD_BAS_3210: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3210_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3210_l.jsp";
        		break;        
        	case AdBasWBMapping.AD_BAS_3211: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3211_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3211_l.jsp";
        		break;       
        	case AdBasWBMapping.AD_BAS_3212: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3212_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3212_l.jsp";
        		break;                
        	case AdBasWBMapping.AD_BAS_3213: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3213_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3213_l.jsp";
        		break;       	       
        	case AdBasWBMapping.AD_BAS_3221: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3221_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	     	       
        	case AdBasWBMapping.AD_BAS_3222: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3222_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	     	       
        	case AdBasWBMapping.AD_BAS_3223: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3223_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;		     	       
        	case AdBasWBMapping.AD_BAS_3224: 					
        		workbean = new AdBas3200WB();
        		((AdBas3200WB)workbean).ad_bas_3224_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        		
        	case AdBasWBMapping.AD_BAS_3310: 					//�ŷ�ó(������) ��ȸ 2/13
        		workbean = new AdBas3300WB();
        		((AdBas3300WB)workbean).ad_bas_3310_l(req, res);
        		if("dit0010".equals(acct_cd)){
        			nextPage = "/jsp/ad/bas/ad_bas_3310_l_ang.jsp";
        		}else{
        			nextPage = "/jsp/ad/bas/ad_bas_3310_l.jsp";
        		}
        		break;     
        	case AdBasWBMapping.AD_BAS_3320: 					//�ŷ�ó(������) ��ȸ 2/13
        		workbean = new AdBas3300WB();
        		((AdBas3300WB)workbean).ad_bas_3320_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3320_l.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3400:					//��ǥ����(����) �ʱ�
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3400_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3400_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3410:					//��ǥ����(����) ��ȸ(��ü��)
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3410_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3410_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_3420:					//��ǥ����(����) ��ȸ(��纰)
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3420_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3420_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3430:					//��ǥ����(����) ����
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
          		
        	case AdBasWBMapping.AD_BAS_3500:					//Ÿ���ü ����Ÿ���̽�
        		workbean = new AdBas3500WB();
        		((AdBas3500WB)workbean).ad_bas_3500_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3500_m.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_3510:					//Ÿ���ü ����Ÿ���̽�
        		workbean = new AdBas3500WB();
        		((AdBas3500WB)workbean).ad_bas_3510_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3510_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_3520:					//Ÿ���ü ����Ÿ���̽�
        		workbean = new AdBas3500WB();
        		((AdBas3500WB)workbean).ad_bas_3520_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	
        	case AdBasWBMapping.AD_BAS_3600:
        		workbean = new AdBas3600WB();
        		((AdBas3600WB)workbean).ad_bas_3600_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3600_m.jsp";
        		break;
        		
        	case AdBasWBMapping.AD_BAS_3601:
        		workbean = new AdBas3600WB();
        		((AdBas3600WB)workbean).ad_bas_3601_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3601_l.jsp";
        		break;
        		        		
        	case AdBasWBMapping.AD_BAS_3605:
        		workbean = new AdBas3600WB();
        		((AdBas3600WB)workbean).ad_bas_3605_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
        	case AdBasWBMapping.AD_BAS_3610:
        		workbean = new AdBas3600WB();
        		((AdBas3600WB)workbean).ad_bas_3610_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3610_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3611:
        		workbean = new AdBas3600WB();
        		((AdBas3600WB)workbean).ad_bas_3611_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3611_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3612:
        		workbean = new AdBas3600WB();
        		((AdBas3600WB)workbean).ad_bas_3612_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3612_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3615:
        		workbean = new AdBas3600WB();
        		((AdBas3600WB)workbean).ad_bas_3615_a(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3615_a.jsp";
        		break;
        		
        	case AdBasWBMapping.AD_BAS_3700:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3700_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3700_m.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3701:					//���ߵ� ����Ÿ���̽�- ������ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3701_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3701_m.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3710:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3710_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3710_l.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3711:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3711_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3711_l.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3712:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3712_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3712_l.jsp";
        		break;           		
        	case AdBasWBMapping.AD_BAS_3720:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3720_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3720_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3721:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3721_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3721_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3750:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3750_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3751:					//���ߵ� ����Ÿ���̽�- �����ȸ 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3751_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3752:					//���ߵ� ����Ÿ���̽�- ����/��� ���� 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3752_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3760:					//���ߵ� ����Ÿ���̽�- ������ ���� 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3760_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3761:					//���ߵ� ����Ÿ���̽�- ������ ���� 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3761_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3761_l.jsp";
        		break;         		        		
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
	        
        return nextPage;
    }
 
}

