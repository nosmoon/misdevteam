/***************************************************************************************************
 * 파일명 : AdDepServlet.java
 * 기능 : 입금관리를  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
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
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
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
                String servletMappedUrl = "/ad/dep/";
                iPid = extractPid(req, servletMappedUrl);
                System.out.println("AdDepServlet : process : iPid : " + iPid);
                nextPage = executeWorker(req, res, iPid);
                System.out.println("AdDepServlet : process : nextPage : " + nextPage);
        	}else{
        		nextPage = "/common/jsp/ad_pwr_error.jsp";
        	}
        	//원복시 아래 주석 살리고 위의 구문 주석 처리함    
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
        		
//        		거래처별 대손처리: 초기화면
        	case AdDepWBMapping.AD_DEP_1300:
        		workbean = new AdDep1300WB();
        		((AdDep1300WB)workbean).ad_dep_1300_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1300_m.jsp";
        		break;
//        		거래처별 대손처리: 게재조회        		
        	case AdDepWBMapping.AD_DEP_1310:
        		workbean = new AdDep1300WB();
        		((AdDep1300WB)workbean).ad_dep_1310_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1310_l.jsp";
        		break;
//        		거래처별 대손처리: 대손처리        		
        	case AdDepWBMapping.AD_DEP_1320:
        		workbean = new AdDep1300WB();
        		((AdDep1300WB)workbean).ad_dep_1320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

//        		환불처리: 초기화면
        	case AdDepWBMapping.AD_DEP_1500:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1500_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1500_m.jsp";
        		break;        		
//        		환불처리: 목록조회
        	case AdDepWBMapping.AD_DEP_1510:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1510_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1510_l.jsp";
        		break;          	 	
//        		환불처리: 상세조회
        	case AdDepWBMapping.AD_DEP_1520:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1520_s(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1520_s.jsp";
        		break;          		
//        		환불처리: 선수금잔액조회
        	case AdDepWBMapping.AD_DEP_1525:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1525_s(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1525_s.jsp";
        		break;          		
//        		환불처리: 입력,수정,삭제
        	case AdDepWBMapping.AD_DEP_1530:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1530_a(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1530_a.jsp";
        		break;           		
//        		환불처리: 현업전표생성, 취소
        	case AdDepWBMapping.AD_DEP_1540:
        		workbean = new AdDep1500WB();
        		((AdDep1500WB)workbean).ad_dep_1540_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;          	
          		
//        		대손전표처리: 초기화면
        	case AdDepWBMapping.AD_DEP_1400:
        		workbean = new AdDep1400WB();
        		((AdDep1400WB)workbean).ad_dep_1400_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1400_m.jsp";
        		break;          	
//        		대손전표처리: 처리
        	case AdDepWBMapping.AD_DEP_1410:
        		workbean = new AdDep1400WB();
        		((AdDep1400WB)workbean).ad_dep_1410_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;          	
//        		대손전표처리: 취소
        	case AdDepWBMapping.AD_DEP_1420:
        		workbean = new AdDep1400WB();
        		((AdDep1400WB)workbean).ad_dep_1420_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   
        		
//        		선수금 및 선수금대체내역: 초기화면
        	case AdDepWBMapping.AD_DEP_1600:
        		workbean = new AdDep1600WB();
        		((AdDep1600WB)workbean).ad_dep_1600_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1600_m.jsp";
        		break;
//        		선수금 및 선수금대처내역: 대체내역 조회
        	case AdDepWBMapping.AD_DEP_1610:
        		workbean = new AdDep1600WB();
        		((AdDep1600WB)workbean).ad_dep_1610_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1610_l.jsp";
        		break; 
//        		선수금 및 선수금대처내역: 선수금잔액 조회
        	case AdDepWBMapping.AD_DEP_1620:
        		workbean = new AdDep1600WB();
        		((AdDep1600WB)workbean).ad_dep_1620_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1620_l.jsp";
        		break; 
        		
//        		입금내역: 초기화면
        	case AdDepWBMapping.AD_DEP_1700:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1700_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1700_m.jsp";
        		break;         	
//        		입금내역: 목록조회
        	case AdDepWBMapping.AD_DEP_1710:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1710_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1710_l.jsp";
        		break;  
        		
//        		입금내역: 초기화면
        	case AdDepWBMapping.AD_DEP_1750:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1750_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1750_m.jsp";
        		break;         	
//        		입금내역: 목록조회
        	case AdDepWBMapping.AD_DEP_1751:  
        		workbean = new AdDep1700WB();
        		((AdDep1700WB)workbean).ad_dep_1751_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1751_l.jsp";
        		break;
        		
//        		대행사/지사 월별게재 및 입금실적: 초기화면
        	case AdDepWBMapping.AD_DEP_1800:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1800_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1800_m.jsp";
        		break; 
//        		대행사/지사 월별게재 및 입금실적: 대행사/지사 평균기일 
        	case AdDepWBMapping.AD_DEP_1810:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1810_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1810_l.jsp";
        		break; 
//        		대항사/지사 월별게재 및 입금실적 : 목록조회  
        	case AdDepWBMapping.AD_DEP_1820:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1820_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1820_l.jsp";
        		break; 
//        		대항사/지사 월별게재 및 입금실적 : 게재내역목록조회  
        	case AdDepWBMapping.AD_DEP_1830:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1830_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1830_l.jsp";
        		break;
//        		대항사/지사 월별게재 및 입금실적 : 입금내역목록조회  
        	case AdDepWBMapping.AD_DEP_1840:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1840_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1840_l.jsp";
        		break;
//        		대항사/지사 월별게재 및 입금실적 : 미수금내역목록조회  
        	case AdDepWBMapping.AD_DEP_1850:  
        		workbean = new AdDep1800WB();
        		((AdDep1800WB)workbean).ad_dep_1850_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_1850_l.jsp";
        		break;
        		
        		
//        	불분명입금표처리 
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

//    		통장입금확인 : 목록조회
        	case AdDepWBMapping.AD_DEP_2010:  
        		workbean = new AdDep2000WB();
        		((AdDep2000WB)workbean).ad_dep_2010_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2010_l.jsp";
        		break;   
            		
//			광고지사별 보증금 내역: 목록조회
        	case AdDepWBMapping.AD_DEP_2110:  
        		workbean = new AdDep2100WB();
        		((AdDep2100WB)workbean).ad_dep_2110_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2110_l.jsp";
        		break;         		

//    		전자결제 등록 거래처: 초기화면
        	case AdDepWBMapping.AD_DEP_2200:  
        		workbean = new AdDep2200WB();
        		((AdDep2200WB)workbean).ad_dep_2200_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2200_m.jsp";
        		break;  
//        	전자결제 등록 거래처: 목록조회
        	case AdDepWBMapping.AD_DEP_2210:  
        		workbean = new AdDep2200WB();
        		((AdDep2200WB)workbean).ad_dep_2210_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2210_l.jsp";
        		break;
//        	전자결제 등록 거래처: 등록/수정/삭제
        	case AdDepWBMapping.AD_DEP_2220:  
        		workbean = new AdDep2200WB();
        		((AdDep2200WB)workbean).ad_dep_2220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
//        		입금현황: 초기화면
        	case AdDepWBMapping.AD_DEP_2300:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2300_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2300_m.jsp";
        		break;        		
//        		입금현황: 담당별
        	case AdDepWBMapping.AD_DEP_2310:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2310_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2310_l.jsp";
        		break; 
//        		입금현황: 입금일보별
        	case AdDepWBMapping.AD_DEP_2320:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2320_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2320_l.jsp";
        		break;
//        		입금현황: 관리담당별
        	case AdDepWBMapping.AD_DEP_2330:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2330_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2330_l.jsp";
        		break;
//        		입금현황: 기간별
        	case AdDepWBMapping.AD_DEP_2340:
        		workbean = new AdDep2300WB();
        		((AdDep2300WB)workbean).ad_dep_2340_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2340_l.jsp";
        		break; 
        		
//        		어음현황: 초기화면
        	case AdDepWBMapping.AD_DEP_2400:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2400_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2400_m.jsp";
        		break; 
//        		어음현황: 입금처별 
        	case AdDepWBMapping.AD_DEP_2410:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2410_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2410_l.jsp";
        		break; 
//        		어음현황: 부도어음현황
        	case AdDepWBMapping.AD_DEP_2420:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2420_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2420_l.jsp";
        		break;
//        		어음현황: 교환어음
        	case AdDepWBMapping.AD_DEP_2430:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2430_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2430_l.jsp";
        		break;
//        		부동어음현황: 소멸내역
        	case AdDepWBMapping.AD_DEP_2440:
        		workbean = new AdDep2400WB();
        		((AdDep2400WB)workbean).ad_dep_2440_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2440_l.jsp";
        		break;

//        		당월부도어음현황: 초기화면   
        	case AdDepWBMapping.AD_DEP_2500:  
        		workbean = new AdDep2500WB();
        		((AdDep2500WB)workbean).ad_dep_2500_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2500_m.jsp";
        		break;   
        		
//        		당월부도어음현황: 목록조회   
        	case AdDepWBMapping.AD_DEP_2510:  
        		workbean = new AdDep2500WB();
        		((AdDep2500WB)workbean).ad_dep_2510_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2510_l.jsp";
        		break;   
        		
//        		취급처별게재및입금현황: 초기화면
        	case AdDepWBMapping.AD_DEP_2600:
        		workbean = new AdDep2600WB();
        		((AdDep2600WB)workbean).ad_dep_2600_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2600_m.jsp";
        		break;
//        		취급처별게재및입금현황: 목록조회 
        	case AdDepWBMapping.AD_DEP_2610:
        		workbean = new AdDep2600WB();
        		((AdDep2600WB)workbean).ad_dep_2610_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2610_l.jsp";
        		break;
//        		취급처별게재및입금현황: 미수이월금내역 
        	case AdDepWBMapping.AD_DEP_2620:
        		workbean = new AdDep2600WB();
        		((AdDep2600WB)workbean).ad_dep_2620_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2620_l.jsp";
        		break;

//        		출판광고 입금실적현황: 목록조회 
        	case AdDepWBMapping.AD_DEP_2710:
        		workbean = new AdDep2700WB();
        		((AdDep2700WB)workbean).ad_dep_2710_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2710_l.jsp";
        		break;
        		
//        		주간조선게재액과입금액: 목록조회 
        	case AdDepWBMapping.AD_DEP_2810:
        		workbean = new AdDep2800WB();
        		((AdDep2800WB)workbean).ad_dep_2810_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2810_l.jsp";
        		break;
        		
//        		게재입금총괄: 목록조회 
        	case AdDepWBMapping.AD_DEP_2910:
        		workbean = new AdDep2900WB();
        		((AdDep2900WB)workbean).ad_dep_2910_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_2910_l.jsp";
        		break;
//        		실입금율 분석 및 추이: 목록조회 
        	case AdDepWBMapping.AD_DEP_3010:
        		workbean = new AdDep3000WB();
        		((AdDep3000WB)workbean).ad_dep_3010_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3010_l.jsp";
        		break;
//        		게재월별 입금구성: 초기화면 
        	case AdDepWBMapping.AD_DEP_3100:
        		workbean = new AdDep3100WB();
        		((AdDep3100WB)workbean).ad_dep_3100_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3100_m.jsp";
        		break;
//        		게재월별 입금구성: 당월,월별,년별  목록조회
        	case AdDepWBMapping.AD_DEP_3110:
        		workbean = new AdDep3100WB();
        		((AdDep3100WB)workbean).ad_dep_3110_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3110_l.jsp";
        		break;        		
//        		결재종류별입금구성: 초기화면 
        	case AdDepWBMapping.AD_DEP_3200:
        		workbean = new AdDep3200WB();
        		((AdDep3200WB)workbean).ad_dep_3200_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3200_m.jsp";
        		break;
//        		결재종류별입금구성: 목록조회
        	case AdDepWBMapping.AD_DEP_3210:
        		workbean = new AdDep3200WB();
        		((AdDep3200WB)workbean).ad_dep_3210_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3210_l.jsp";
        		break;        		
//        		주요거래처별게재입금실적: 목록조회
        	case AdDepWBMapping.AD_DEP_3310:
        		workbean = new AdDep3300WB();
        		((AdDep3300WB)workbean).ad_dep_3310_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3310_l.jsp";
        		break;
        		
        		
//        		취급별 미수금현황: 초기화면 
        	case AdDepWBMapping.AD_DEP_3400:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3400_m(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3400_m.jsp";
        		break;        		
//        		취급별 미수금현황: 당월 목록조회 
        	case AdDepWBMapping.AD_DEP_3410:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3410_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3410_l.jsp";
        		break; 
//        		취급별 미수금현황: 월별 목록조회
        	case AdDepWBMapping.AD_DEP_3420:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3420_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3420_l.jsp";
        		break; 
//        		취급별 미수금현황: 년별 목록조회
        	case AdDepWBMapping.AD_DEP_3430:
        		workbean = new AdDep3400WB();
        		((AdDep3400WB)workbean).ad_dep_3430_l(req, res);
        		nextPage = "/jsp/ad/dep/ad_dep_3430_l.jsp";
        		break; 
        		
//        		부실채권편입
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

//        		부실채권보고서
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

//        		부실채권현황표
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

//        		대손 세액공제 처리
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
        		
        		
//        		출력
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

//        		채권채무조회서(광고)
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

//        		전자어음업로드
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
        		
//        		관리담당별게재일람표
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
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
