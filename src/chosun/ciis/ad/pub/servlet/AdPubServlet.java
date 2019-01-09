/***************************************************************************************************
 * 파일명 : AdPubServlet.java
 * 기능 : 게재관리를  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.pub.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.wb.AdPub1000WB;
import chosun.ciis.ad.pub.wb.AdPub1100WB;
import chosun.ciis.ad.pub.wb.AdPub1200WB;
import chosun.ciis.ad.pub.wb.AdPub1300WB;
import chosun.ciis.ad.pub.wb.AdPub1400WB;
import chosun.ciis.ad.pub.wb.AdPub1500WB;
import chosun.ciis.ad.pub.wb.AdPub1600WB;
import chosun.ciis.ad.pub.wb.AdPub1700WB;
import chosun.ciis.ad.pub.wb.AdPub1800WB;
import chosun.ciis.ad.pub.wb.AdPub1850WB;
import chosun.ciis.ad.pub.wb.AdPub1900WB;
import chosun.ciis.ad.pub.wb.AdPub2000WB;
import chosun.ciis.ad.pub.wb.AdPub2100WB;
import chosun.ciis.ad.pub.wb.AdPub2200WB;
import chosun.ciis.ad.pub.wb.AdPub2300WB;
import chosun.ciis.ad.pub.wb.AdPub2400WB;
import chosun.ciis.ad.pub.wb.AdPub2500WB;
import chosun.ciis.ad.pub.wb.AdPub2600WB;
import chosun.ciis.ad.pub.wb.AdPub2700WB;
import chosun.ciis.ad.pub.wb.AdPub2900WB;
import chosun.ciis.ad.pub.wb.AdPub3000WB;
import chosun.ciis.ad.pub.wb.AdPub3200WB;
import chosun.ciis.ad.pub.wb.AdPub3300WB;
import chosun.ciis.ad.pub.wb.AdPub3400WB;
import chosun.ciis.ad.pub.wb.AdPub3500WB;
import chosun.ciis.ad.pub.wb.AdPub3600WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;



public class AdPubServlet extends BaseServlet {
	
    /**
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
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
        	//IAM 광고관리매체 권한 체크 단, 조선일보만
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
	            String servletMappedUrl = "/ad/pub/";
	            iPid = extractPid(req, servletMappedUrl);
	            System.out.println("AdPubServlet : process : iPid : " + iPid);
	            nextPage = executeWorker(req, res, iPid);
	            System.out.println("AdPubServlet : process : nextPage : " + nextPage);
        	}else{
        		nextPage = "/common/jsp/ad_pwr_error.jsp";
        	}
        	//원복시 아래 주석 살리고 위의 구문 주석 처리함
//            String servletMappedUrl = "/ad/pub/";
//            iPid = extractPid(req, servletMappedUrl);
//            System.out.println("AdPubServlet : process : iPid : " + iPid);
//            nextPage = executeWorker(req, res, iPid);
//            System.out.println("AdPubServlet : process : nextPage : " + nextPage);        	
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
     * PilotWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        BaseWB workbean = null;
        
        switch (pid) {
        	case AdPubWBMapping.AD_PUB_1000:
        		workbean = new AdPub1000WB();
        		((AdPub1000WB)workbean).ad_pub_1000_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1000_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1010:
        		workbean = new AdPub1000WB();
        		((AdPub1000WB)workbean).ad_pub_1010_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1010_s.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1020:
        		workbean = new AdPub1000WB(); 
        		((AdPub1000WB)workbean).ad_pub_1020_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1020_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1025:
        		workbean = new AdPub1000WB();
        		((AdPub1000WB)workbean).ad_pub_1025_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1025_s.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1030: 
        		workbean = new AdPub1000WB();
        		((AdPub1000WB)workbean).ad_pub_1030_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1030_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1035:
        		workbean = new AdPub1000WB();
        		((AdPub1000WB)workbean).ad_pub_1035_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1035_s.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1050:
        		workbean = new AdPub1000WB();
        		((AdPub1000WB)workbean).ad_pub_1050_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1050_a.jsp";
        		break;
//안내광고전표등록 
        	case AdPubWBMapping.AD_PUB_1100:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1100_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1100_m.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1110:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1110_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1110_l.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1115:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1115_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1115_l.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1120:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1120_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1125:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1125_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1150:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1150_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1150_m.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1160:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1160_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1160_s.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1165:
        		workbean = new AdPub1100WB();
        		((AdPub1100WB)workbean).ad_pub_1165_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1165_a.jsp";
        		break; 	

        	case AdPubWBMapping.AD_PUB_1200:
        		workbean = new AdPub1200WB();
        		((AdPub1200WB)workbean).ad_pub_1200_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1200_m.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_1210:
        		workbean = new AdPub1200WB();
        		((AdPub1200WB)workbean).ad_pub_1210_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1210_s.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_1220:
        		workbean = new AdPub1200WB();
        		((AdPub1200WB)workbean).ad_pub_1220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        		
        	case AdPubWBMapping.AD_PUB_1300:
        		workbean = new AdPub1300WB();
        		((AdPub1300WB)workbean).ad_pub_1300_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1300_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1310:
        		workbean = new AdPub1300WB();
        		((AdPub1300WB)workbean).ad_pub_1310_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1310_l.jsp";
        		break; 	
        	case AdPubWBMapping.AD_PUB_1320:
        		workbean = new AdPub1300WB();
        		((AdPub1300WB)workbean).ad_pub_1320_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        		
        	case AdPubWBMapping.AD_PUB_1400:
        		workbean = new AdPub1400WB();
        		((AdPub1400WB)workbean).ad_pub_1400_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1400_m.jsp";
        		break;    
      		
        	case AdPubWBMapping.AD_PUB_1410:
        		workbean = new AdPub1400WB();
        		((AdPub1400WB)workbean).ad_pub_1410_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   		
        	case AdPubWBMapping.AD_PUB_1420:
        		workbean = new AdPub1400WB();
        		((AdPub1400WB)workbean).ad_pub_1420_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1430:
        		workbean = new AdPub1400WB();
        		((AdPub1400WB)workbean).ad_pub_1430_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1430_l.jsp";
        		break;     
//조정증감사유서        		
        	case AdPubWBMapping.AD_PUB_1500:
        		workbean = new AdPub1500WB();
        		((AdPub1500WB)workbean).ad_pub_1500_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1500_m.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_1510:
        		workbean = new AdPub1500WB();
        		((AdPub1500WB)workbean).ad_pub_1510_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1510_l.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_1520:
        		workbean = new AdPub1500WB();
        		((AdPub1500WB)workbean).ad_pub_1520_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1520_s.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1530:
        		workbean = new AdPub1500WB();
        		((AdPub1500WB)workbean).ad_pub_1530_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1530_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1550:
        		workbean = new AdPub1500WB();
        		((AdPub1500WB)workbean).ad_pub_1550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_1560:
        		workbean = new AdPub1500WB();
        		((AdPub1500WB)workbean).ad_pub_1560_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        		
        	case AdPubWBMapping.AD_PUB_1600:
        		workbean = new AdPub1600WB();
        		((AdPub1600WB)workbean).ad_pub_1600_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1600_m.jsp";
        		break;        
        	case AdPubWBMapping.AD_PUB_1610:
        		workbean = new AdPub1600WB();
        		((AdPub1600WB)workbean).ad_pub_1610_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1610_s.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1620:
        		workbean = new AdPub1600WB();
        		((AdPub1600WB)workbean).ad_pub_1620_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1620_l.jsp";
        		break;   
        	case AdPubWBMapping.AD_PUB_1625:
        		workbean = new AdPub1600WB(); 
        		((AdPub1600WB)workbean).ad_pub_1625_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1625_s.jsp";
        		break;     
        	case AdPubWBMapping.AD_PUB_1630:
        		workbean = new AdPub1600WB();
        		((AdPub1600WB)workbean).ad_pub_1630_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1630_l.jsp";
        		break;  
        	case AdPubWBMapping.AD_PUB_1635:
        		workbean = new AdPub1600WB();
        		((AdPub1600WB)workbean).ad_pub_1635_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1635_s.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1650:
        		workbean = new AdPub1600WB();  
        		((AdPub1600WB)workbean).ad_pub_1650_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1650_a.jsp";
        		break;  

        	case AdPubWBMapping.AD_PUB_1700:
        		workbean = new AdPub1700WB();
        		((AdPub1700WB)workbean).ad_pub_1700_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1700_m.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_1710:
        		workbean = new AdPub1700WB();
        		((AdPub1700WB)workbean).ad_pub_1710_s(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1710_s.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_1720:
        		workbean = new AdPub1700WB();
        		((AdPub1700WB)workbean).ad_pub_1720_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        		
        		
        	case AdPubWBMapping.AD_PUB_1800:
        		workbean = new AdPub1800WB();
        		((AdPub1800WB)workbean).ad_pub_1800_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1800_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1810:
        		workbean = new AdPub1800WB();
        		((AdPub1800WB)workbean).ad_pub_1810_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1810_l.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_1811:
        		workbean = new AdPub1800WB();
        		((AdPub1800WB)workbean).ad_pub_1811_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1811_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1812:
        		workbean = new AdPub1800WB();
        		((AdPub1800WB)workbean).ad_pub_1812_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1812_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1813:
        		workbean = new AdPub1800WB();
        		((AdPub1800WB)workbean).ad_pub_1813_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1813_l.jsp";
        		break;       		
        		
        	case AdPubWBMapping.AD_PUB_1850:
        		workbean = new AdPub1850WB();
        		((AdPub1850WB)workbean).ad_pub_1850_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1850_m.jsp";
        		break;
        		
        	case AdPubWBMapping.AD_PUB_1851:
        		workbean = new AdPub1850WB();
        		((AdPub1850WB)workbean).ad_pub_1851_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1851_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1853:
        		workbean = new AdPub1850WB();
        		((AdPub1850WB)workbean).ad_pub_1853_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1853_l.jsp";
        		break;
        		
        		
        	case AdPubWBMapping.AD_PUB_1900:
        		workbean = new AdPub1900WB();
        		((AdPub1900WB)workbean).ad_pub_1900_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1900_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_1910:
        		workbean = new AdPub1900WB();
        		((AdPub1900WB)workbean).ad_pub_1910_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_1910_l.jsp";
        		break;
        	
        	case AdPubWBMapping.AD_PUB_2000:
        		workbean = new AdPub2000WB();
        		((AdPub2000WB)workbean).ad_pub_2000_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2000_m.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_2010:
        		workbean = new AdPub2000WB();
        		((AdPub2000WB)workbean).ad_pub_2010_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2010_l.jsp";
        		break;	
        		
        	case AdPubWBMapping.AD_PUB_2100:
        		workbean = new AdPub2100WB();
        		((AdPub2100WB)workbean).ad_pub_2100_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2100_m.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_2110:
        		workbean = new AdPub2100WB();
        		((AdPub2100WB)workbean).ad_pub_2110_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2110_l.jsp";
        		break;
        		
        	case AdPubWBMapping.AD_PUB_2210:
        		workbean = new AdPub2200WB();
        		((AdPub2200WB)workbean).ad_pub_2210_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2210_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_2220:
        		workbean = new AdPub2200WB();
        		((AdPub2200WB)workbean).ad_pub_2220_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2220_l.jsp";
        		break;	
        		
        	case AdPubWBMapping.AD_PUB_2300:
        		workbean = new AdPub2300WB();
        		((AdPub2300WB)workbean).ad_pub_2300_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2300_m.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_2310:
        		workbean = new AdPub2300WB();
        		((AdPub2300WB)workbean).ad_pub_2310_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2310_l.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_2311:
        		workbean = new AdPub2300WB();
        		((AdPub2300WB)workbean).ad_pub_2311_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2311_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_2313:
        		workbean = new AdPub2300WB();
        		((AdPub2300WB)workbean).ad_pub_2313_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		
        	case AdPubWBMapping.AD_PUB_2400:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2400_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2400_m.jsp";
        		break;         		
        	case AdPubWBMapping.AD_PUB_2420:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2420_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2420_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_2410:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2410_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2410_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_2430:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_2440:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2440_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2440_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_2450:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2450_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_2460:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2460_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2460_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_2470:
        		workbean = new AdPub2400WB();
        		((AdPub2400WB)workbean).ad_pub_2470_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2470_l.jsp";
        		break; 
        		
        	case AdPubWBMapping.AD_PUB_2500:
        		workbean = new AdPub2500WB();
        		((AdPub2500WB)workbean).ad_pub_2500_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2500_m.jsp";
        		break;	
        		
        	case AdPubWBMapping.AD_PUB_2510:
        		workbean = new AdPub2500WB();
        		((AdPub2500WB)workbean).ad_pub_2510_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2510_l.jsp";
        		break; 
        		
        	case AdPubWBMapping.AD_PUB_2600:
        		workbean = new AdPub2600WB();
        		((AdPub2600WB)workbean).ad_pub_2600_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2600_m.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_2610:
        		workbean = new AdPub2600WB();
        		((AdPub2600WB)workbean).ad_pub_2610_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2610_l.jsp";
        		break;         		

        	case AdPubWBMapping.AD_PUB_2700:
        		workbean = new AdPub2700WB();
        		((AdPub2700WB)workbean).ad_pub_2700_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2700_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_2710:
        		workbean = new AdPub2700WB();
        		((AdPub2700WB)workbean).ad_pub_2710_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2710_l.jsp";
        		break;	
        	
        	case AdPubWBMapping.AD_PUB_2900:
        		workbean = new AdPub2900WB();
        		((AdPub2900WB)workbean).ad_pub_2900_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2900_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_2910:
        		workbean = new AdPub2900WB();
        		((AdPub2900WB)workbean).ad_pub_2910_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_2910_l.jsp";
        		break;
        		
        	case AdPubWBMapping.AD_PUB_3000:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3000_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3000_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3010:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3010_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3010_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3011:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3011_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3011_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3012:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3012_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3012_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3013:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3013_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3013_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3014:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3014_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3014_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3015:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3015_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3015_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3016:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3016_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3016_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3017:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3017_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3017_l.jsp";
        		break;   
        	case AdPubWBMapping.AD_PUB_3018:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3018_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3018_l.jsp";
        		break;         		
        	case AdPubWBMapping.AD_PUB_3020:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3020_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3020_m.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_3021:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3021_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3021_a.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_3026:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3026_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3026_a.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_3027:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3027_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3027_a.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_3051:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3051_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3051_l.jsp";
        		break;        		
        	case AdPubWBMapping.AD_PUB_3052:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3052_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3052_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3053:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3053_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3053_l.jsp";
        		break;  
        	case AdPubWBMapping.AD_PUB_3100:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3100_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3100_m.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3110:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3110_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3110_l.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_3120:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3120_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3120_l.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_3130:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3130_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3130_a.jsp";
        		break;	
        	case AdPubWBMapping.AD_PUB_3150:
        		workbean = new AdPub3000WB();
        		((AdPub3000WB)workbean).ad_pub_3150_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3150_a.jsp";
        		break;	
        		
        	case AdPubWBMapping.AD_PUB_3200:
        		workbean = new AdPub3200WB();
        		((AdPub3200WB)workbean).ad_pub_3200_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3200_m.jsp";
        		break;	
        		
        	case AdPubWBMapping.AD_PUB_3210:
        		workbean = new AdPub3200WB();
        		((AdPub3200WB)workbean).ad_pub_3210_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3210_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3220:
        		workbean = new AdPub3200WB();
        		((AdPub3200WB)workbean).ad_pub_3220_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3220_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3310:
        		workbean = new AdPub3300WB();
        		((AdPub3300WB)workbean).ad_pub_3310_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3310_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3330:
        		workbean = new AdPub3300WB();
        		((AdPub3300WB)workbean).ad_pub_3330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;          		
        	case AdPubWBMapping.AD_PUB_3350:
        		workbean = new AdPub3300WB();
        		((AdPub3300WB)workbean).ad_pub_3350_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   
        	case AdPubWBMapping.AD_PUB_3400:
        		workbean = new AdPub3400WB();
        		((AdPub3400WB)workbean).ad_pub_3400_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3400_m.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3410:
        		workbean = new AdPub3400WB();
        		((AdPub3400WB)workbean).ad_pub_3410_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3410_l.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3420:
        		workbean = new AdPub3400WB();
        		((AdPub3400WB)workbean).ad_pub_3420_a(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3420_a.jsp";
        		break;  
        	case AdPubWBMapping.AD_PUB_3430:
        		workbean = new AdPub3400WB();
        		((AdPub3400WB)workbean).ad_pub_3430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3500:
        		workbean = new AdPub3500WB();
        		((AdPub3500WB)workbean).ad_pub_3500_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3500_m.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3510:
        		workbean = new AdPub3500WB();
        		((AdPub3500WB)workbean).ad_pub_3510_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3510_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3530:
        		workbean = new AdPub3500WB();
        		((AdPub3500WB)workbean).ad_pub_3530_p(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3530_p.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3550:
        		workbean = new AdPub3500WB();
        		((AdPub3500WB)workbean).ad_pub_3550_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3550_l.jsp";
        		break;
        	case AdPubWBMapping.AD_PUB_3600:
        		workbean = new AdPub3600WB();
        		((AdPub3600WB)workbean).ad_pub_3600_m(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3600_m.jsp";
        		break; 
        	case AdPubWBMapping.AD_PUB_3610:
        		workbean = new AdPub3600WB();
        		((AdPub3600WB)workbean).ad_pub_3610_l(req, res);
        		nextPage = "/jsp/ad/pub/ad_pub_3610_l.jsp";
        		break;    
        	case AdPubWBMapping.AD_PUB_3620:
        		workbean = new AdPub3600WB();
        		((AdPub3600WB)workbean).ad_pub_3620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;         		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
