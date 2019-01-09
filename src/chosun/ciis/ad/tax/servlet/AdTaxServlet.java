/***************************************************************************************************
 * 파일명 : AdTaxServlet.java
 * 기능 : 세금계산서관리  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ad.tax.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.tax.wb.AdTax1000WB;
import chosun.ciis.ad.tax.wb.AdTax1100WB;
import chosun.ciis.ad.tax.wb.AdTax1200WB;
import chosun.ciis.ad.tax.wb.AdTax1300WB;
import chosun.ciis.ad.tax.wb.AdTax1400WB;
import chosun.ciis.ad.tax.wb.AdTax1500WB;
import chosun.ciis.ad.tax.wb.AdTax1600WB;
import chosun.ciis.ad.tax.wb.AdTax1700WB;
import chosun.ciis.ad.tax.wb.AdTax1800WB;
import chosun.ciis.ad.tax.wb.AdTax1900WB;
import chosun.ciis.ad.tax.wb.AdTax2000WB;
import chosun.ciis.ad.tax.wb.AdTax2100WB;
import chosun.ciis.ad.tax.wb.AdTax2200WB;
import chosun.ciis.ad.tax.wb.AdTax2300WB;
import chosun.ciis.ad.tax.wb.AdTax2400WB;
import chosun.ciis.ad.tax.wb.AdTax2500WB;
import chosun.ciis.ad.tax.wb.AdTax2600WB;
import chosun.ciis.ad.tax.wb.AdTax2700WB;
import chosun.ciis.ad.tax.wb.AdTax2800WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdTaxServlet extends BaseServlet {

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
                String servletMappedUrl = "/ad/tax/";
                iPid = extractPid(req, servletMappedUrl);
                System.out.println("AdTaxServlet : process : iPid : " + iPid);
                nextPage = executeWorker(req, res, iPid);
                System.out.println("AdTaxServlet : process : nextPage : " + nextPage);
        	}else{
        		nextPage = "/common/jsp/ad_pwr_error.jsp";
        	}
        	//원복시 아래 주석 살리고 위의 구문 주석 처리함    
//            String servletMappedUrl = "/ad/tax/";
//            iPid = extractPid(req, servletMappedUrl);
//            System.out.println("AdTaxServlet : process : iPid : " + iPid);
//            nextPage = executeWorker(req, res, iPid);
//            System.out.println("AdTaxServlet : process : nextPage : " + nextPage);
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
     * AdTaxWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        	case AdTaxWBMapping.AD_TAX_1000:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1000_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1000_m.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1010:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1010_l(req, res);
       			nextPage = "/jsp/ad/tax/ad_tax_1010_l.jsp";
       			break;
        	case AdTaxWBMapping.AD_TAX_1050:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1050_l(req, res);
       			nextPage = "/jsp/ad/tax/ad_tax_1050_l.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1060:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1060_l(req, res);
       			nextPage = "/jsp/ad/tax/ad_tax_1060_l.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1011:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1011_s(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1011_s.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1012:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1012_s(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1012_s.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1020:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1020_a(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1020_a.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1021:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1021_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1022:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1022_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1023:
        		workbean = new AdTax1000WB(); 
        		((AdTax1000WB)workbean).ad_tax_1023_a(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1023_a.jsp";
        		break;       		
        	case AdTaxWBMapping.AD_TAX_1030:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1030_s(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1030_s.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1040:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1040_a(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1040_a.jsp";
        		break;  
        	case AdTaxWBMapping.AD_TAX_1041:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1041_a(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1041_a.jsp";
        		break;  
        	case AdTaxWBMapping.AD_TAX_1070:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1070_a(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1070_a.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1071:
        		workbean = new AdTax1000WB();
        		((AdTax1000WB)workbean).ad_tax_1071_a(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1071_a.jsp";
        		break; 
        	case AdTaxWBMapping.AD_TAX_1100:
        		workbean = new AdTax1100WB();
        		((AdTax1100WB)workbean).ad_tax_1100_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1100_m.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1105:
        		workbean = new AdTax1100WB();
        		((AdTax1100WB)workbean).ad_tax_1105_s(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1105_s.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1110:
        		workbean = new AdTax1100WB();
        		((AdTax1100WB)workbean).ad_tax_1110_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1110_l.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1120:
        		workbean = new AdTax1100WB();
        		((AdTax1100WB)workbean).ad_tax_1120_a(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1120_a.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1121:
        		workbean = new AdTax1100WB();
        		((AdTax1100WB)workbean).ad_tax_1121_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1122:
        		workbean = new AdTax1100WB();
        		((AdTax1100WB)workbean).ad_tax_1122_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_1130:
        		workbean = new AdTax1100WB();
        		((AdTax1100WB)workbean).ad_tax_1130_s(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1130_s.jsp";
        		break;


        	case AdTaxWBMapping.AD_TAX_1200:
        		workbean = new AdTax1200WB();
        		((AdTax1200WB)workbean).ad_tax_1200_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1200_m.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1210:
        		workbean = new AdTax1200WB();
        		((AdTax1200WB)workbean).ad_tax_1210_s(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1210_s.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1215:
        		workbean = new AdTax1200WB();
        		((AdTax1200WB)workbean).ad_tax_1215_s(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1215_s.jsp";
        		break;        
        	case AdTaxWBMapping.AD_TAX_1220:
        		workbean = new AdTax1200WB();
        		((AdTax1200WB)workbean).ad_tax_1220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
        	case AdTaxWBMapping.AD_TAX_1230:
        		workbean = new AdTax1200WB();
        		((AdTax1200WB)workbean).ad_tax_1230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;         
        	case AdTaxWBMapping.AD_TAX_1250:
        		workbean = new AdTax1200WB();
        		((AdTax1200WB)workbean).ad_tax_1250_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1250_l.jsp";
        		break;  
        		
//        	매입세금계산서마감  
        	case AdTaxWBMapping.AD_TAX_1300:
        		workbean = new AdTax1300WB();
        		((AdTax1300WB)workbean).ad_tax_1300_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1300_m.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1310:
        		workbean = new AdTax1300WB();
        		((AdTax1300WB)workbean).ad_tax_1310_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1310_l.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1320:
        		workbean = new AdTax1300WB();
        		((AdTax1300WB)workbean).ad_tax_1320_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1320_l.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1330:
        		workbean = new AdTax1300WB();
        		((AdTax1300WB)workbean).ad_tax_1330_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1330_l.jsp";
        		break;    
        	case AdTaxWBMapping.AD_TAX_1340:
        		workbean = new AdTax1300WB();
        		((AdTax1300WB)workbean).ad_tax_1340_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        		
//    		매출세금계산서마감
        	case AdTaxWBMapping.AD_TAX_1400:
        		workbean = new AdTax1400WB();
        		((AdTax1400WB)workbean).ad_tax_1400_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1400_m.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1410:
        		workbean = new AdTax1400WB();
        		((AdTax1400WB)workbean).ad_tax_1410_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1410_l.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1420:
        		workbean = new AdTax1400WB();
        		((AdTax1400WB)workbean).ad_tax_1420_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1420_l.jsp";
        		break;     
        	case AdTaxWBMapping.AD_TAX_1430:
        		workbean = new AdTax1400WB();
        		((AdTax1400WB)workbean).ad_tax_1430_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1430_l.jsp";
        		break;    
        	case AdTaxWBMapping.AD_TAX_1440:
        		workbean = new AdTax1400WB();
        		((AdTax1400WB)workbean).ad_tax_1440_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
        		

//        	삭제,재발행의뢰서
        	case AdTaxWBMapping.AD_TAX_1510:
        		workbean = new AdTax1500WB();
        		((AdTax1500WB)workbean).ad_tax_1510_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1510_l.jsp";
        		break;       
        	case AdTaxWBMapping.AD_TAX_1520:
        		workbean = new AdTax1500WB();
        		((AdTax1500WB)workbean).ad_tax_1520_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;             		
        		  
//			영세율증빙처리 
        	case AdTaxWBMapping.AD_TAX_1600:
        		workbean = new AdTax1600WB();
        		((AdTax1600WB)workbean).ad_tax_1600_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1600_m.jsp";
        		break;    
        	case AdTaxWBMapping.AD_TAX_1610:
        		workbean = new AdTax1600WB();
        		((AdTax1600WB)workbean).ad_tax_1610_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1610_l.jsp";
        		break;         
        	case AdTaxWBMapping.AD_TAX_1620:
        		workbean = new AdTax1600WB();
        		((AdTax1600WB)workbean).ad_tax_1620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        		
//    		대행료지불준비
        	case AdTaxWBMapping.AD_TAX_1700:
        		workbean = new AdTax1700WB();
        		((AdTax1700WB)workbean).ad_tax_1700_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1700_m.jsp";
        		break;    
        	case AdTaxWBMapping.AD_TAX_1710:
        		workbean = new AdTax1700WB();
        		((AdTax1700WB)workbean).ad_tax_1710_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1710_l.jsp";
        		break;    
        	case AdTaxWBMapping.AD_TAX_1720:
        		workbean = new AdTax1700WB();
        		((AdTax1700WB)workbean).ad_tax_1720_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    
        	case AdTaxWBMapping.AD_TAX_1730:
        		workbean = new AdTax1700WB();
        		((AdTax1700WB)workbean).ad_tax_1730_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1730_l.jsp";
        		break;    

//    		대행료대체지불처리
        	case AdTaxWBMapping.AD_TAX_1800:
        		workbean = new AdTax1800WB();
        		((AdTax1800WB)workbean).ad_tax_1800_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1800_m.jsp";
        		break;      
        	case AdTaxWBMapping.AD_TAX_1810:
        		workbean = new AdTax1800WB();
        		((AdTax1800WB)workbean).ad_tax_1810_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1810_l.jsp";
        		break;        
        	case AdTaxWBMapping.AD_TAX_1820:
        		workbean = new AdTax1800WB();
        		((AdTax1800WB)workbean).ad_tax_1820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;  
        		

//        	매입세금계산서 상계내역
        	case AdTaxWBMapping.AD_TAX_1900:
        		workbean = new AdTax1900WB(); 
        		((AdTax1900WB)workbean).ad_tax_1900_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1900_m.jsp";
        		break;              		
        	case AdTaxWBMapping.AD_TAX_1910:
        		workbean = new AdTax1900WB();
        		((AdTax1900WB)workbean).ad_tax_1910_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1910_l.jsp";
        		break;              		
        	case AdTaxWBMapping.AD_TAX_1920:
        		workbean = new AdTax1900WB();
        		((AdTax1900WB)workbean).ad_tax_1920_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_1920_l.jsp";
        		break;              		

//          대행료 대체입금 조회           		
        	case AdTaxWBMapping.AD_TAX_2000:
        		workbean = new AdTax2000WB();
        		((AdTax2000WB)workbean).ad_tax_2000_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2000_m.jsp";
        		break;  
        	case AdTaxWBMapping.AD_TAX_2010:
        		workbean = new AdTax2000WB();
        		((AdTax2000WB)workbean).ad_tax_2010_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2010_l.jsp";
        		break;   

//          대행료 지불조회
        	case AdTaxWBMapping.AD_TAX_2100:
        		workbean = new AdTax2100WB();
        		((AdTax2100WB)workbean).ad_tax_2100_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2100_m.jsp";
        		break;       
        	case AdTaxWBMapping.AD_TAX_2110:
        		workbean = new AdTax2100WB();
        		((AdTax2100WB)workbean).ad_tax_2110_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2110_l.jsp";
        		break;       
        	case AdTaxWBMapping.AD_TAX_2120:
        		workbean = new AdTax2100WB();
        		((AdTax2100WB)workbean).ad_tax_2120_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;       
            		
        		
//          세금계산서번호조회
        	case AdTaxWBMapping.AD_TAX_2200:
        		workbean = new AdTax2200WB();
        		((AdTax2200WB)workbean).ad_tax_2200_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2200_m.jsp";
        		break;        		
        	case AdTaxWBMapping.AD_TAX_2210:
        		workbean = new AdTax2200WB();
        		((AdTax2200WB)workbean).ad_tax_2210_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2210_l.jsp";
        		break;  

//          세금계산서미발행내역
        	case AdTaxWBMapping.AD_TAX_2300:
        		workbean = new AdTax2300WB();
        		((AdTax2300WB)workbean).ad_tax_2300_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2300_m.jsp";
        		break;              
        	case AdTaxWBMapping.AD_TAX_2310:
        		workbean = new AdTax2300WB();
        		((AdTax2300WB)workbean).ad_tax_2310_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2310_l.jsp";
        		break;              
        	case AdTaxWBMapping.AD_TAX_2320:
        		workbean = new AdTax2300WB();
        		((AdTax2300WB)workbean).ad_tax_2320_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2320_l.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_2330:
        		workbean = new AdTax2300WB();
        		((AdTax2300WB)workbean).ad_tax_2330_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2330_l.jsp";
        	break;

        		
//          광고거래명세표발행
        	case AdTaxWBMapping.AD_TAX_2400:
        		workbean = new AdTax2400WB();
        		((AdTax2400WB)workbean).ad_tax_2400_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2400_m.jsp";
        		break;        	        	
        	case AdTaxWBMapping.AD_TAX_2410:
        		workbean = new AdTax2400WB();
        		((AdTax2400WB)workbean).ad_tax_2410_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2410_l.jsp";
        		break;        	        		
        		

//          출력
        	case AdTaxWBMapping.AD_TAX_2500:
        		workbean = new AdTax2500WB();
        		((AdTax2500WB)workbean).ad_tax_2500_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2500_m.jsp";
        		break;

//			계산서 일마감        		
        	case AdTaxWBMapping.AD_TAX_2600:
        		System.out.println("AD_TAX_2600::::::::::::::::::::::::");
        		workbean = new AdTax2600WB();
        		((AdTax2600WB)workbean).ad_tax_2600_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2600_m.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_2601:
        		System.out.println("AD_TAX_2601::::::::::::::::::::::::");
        		workbean = new AdTax2600WB();
        		((AdTax2600WB)workbean).ad_tax_2601_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2601_m.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_2610:
        		workbean = new AdTax2600WB();
        		((AdTax2600WB)workbean).ad_tax_2610_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_2611:
        		workbean = new AdTax2600WB();
        		((AdTax2600WB)workbean).ad_tax_2611_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

//			위수탁세금계산서 업로드
        	case AdTaxWBMapping.AD_TAX_2700:
        		workbean = new AdTax2700WB();
        		((AdTax2700WB)workbean).ad_tax_2700_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2700_m.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_2710:
        		workbean = new AdTax2700WB();
        		((AdTax2700WB)workbean).ad_tax_2710_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2710_l.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_2750:
        		workbean = new AdTax2700WB();
        		((AdTax2700WB)workbean).ad_tax_2750_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdTaxWBMapping.AD_TAX_2751:
        		workbean = new AdTax2700WB();
        		((AdTax2700WB)workbean).ad_tax_2751_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2751_l.jsp";
        		break;

//              세금계산서 게재상계내역조회
        	case AdTaxWBMapping.AD_TAX_2800:
        		workbean = new AdTax2800WB();
        		((AdTax2800WB)workbean).ad_tax_2800_m(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2800_m.jsp";
        		break;        		
        	case AdTaxWBMapping.AD_TAX_2810:
        		workbean = new AdTax2800WB();
        		((AdTax2800WB)workbean).ad_tax_2810_l(req, res);
        		nextPage = "/jsp/ad/tax/ad_tax_2810_l.jsp";
        		break;  
        		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
