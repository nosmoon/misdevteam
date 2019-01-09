/***************************************************************************************************
 * 파일명 : AdBasServlet.java
 * 기능 : 기초자료관리를  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
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
                String servletMappedUrl = "/ad/bas/";
                iPid = extractPid(req, servletMappedUrl);
                System.out.println("AdBasServlet : process : iPid : " + iPid);
                nextPage = executeWorker(req, res, iPid);
                System.out.println("AdBasServlet : process : nextPage : " + nextPage);
        	}else{
        		nextPage = "/common/jsp/ad_pwr_error.jsp";
        	}
        	//원복시 아래 주석 살리고 위의 구문 주석 처리함        	
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
        	case AdBasWBMapping.AD_BAS_1300: 					//대행사/지사 담보내역 조회 메인
        		workbean = new AdBas1300WB();
        		((AdBas1300WB)workbean).ad_bas_1300_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1300_m.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_1310: 					//대행사/지사 담보내역 조회 리스트
        		workbean = new AdBas1300WB();
        		((AdBas1300WB)workbean).ad_bas_1310_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1310_l.jsp";
        		break;  
        	case AdBasWBMapping.AD_BAS_1410: 					//담당별 거래처 조회 리스트
        		workbean = new AdBas1400WB();
        		((AdBas1400WB)workbean).ad_bas_1410_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1410_l.jsp";
        		break;       
        	case AdBasWBMapping.AD_BAS_1420: 					//담당별 거래처 조회 리스트
        		workbean = new AdBas1400WB();
        		((AdBas1400WB)workbean).ad_bas_1420_i(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;           		
        	case AdBasWBMapping.AD_BAS_1500:					//일일보고,일일보고등록-메인페이지
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1500_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1500_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1510:					//일일보고-거래처접촉자료 조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1510_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1510_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1511:					//일일보고-정보사항 조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1511_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1511_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1512:					//일일보고-지사업무보고 조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1512_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1512_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1520:					//일일보고-야근일지 조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1520_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1520_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1521:					//일일보고-관리정보 조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1521_l(req, res); 
        		nextPage = "/jsp/ad/bas/ad_bas_1521_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1530:					//일일보고-팀장의견  저장,삭제
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1535:					//일일보고-엑셀변환
        		nextPage = "/jsp/ad/bas/ad_bas_1535_t.jsp"; 
        		break;
        	case AdBasWBMapping.AD_BAS_1540:					//일일보고등록-상세조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1540_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1540_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1550: 					//일일보고등록-입력,수정,삭제
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1555:					//일일보고등록-첨부파일저장
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1555_a(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1555_a.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1560:  					//일일보고등록-프로필 조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1560_l(req, res);        		
        		nextPage = "/jsp/ad/bas/ad_bas_1560_p.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_1570:					//야근일지-상세조회
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1570_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1570_s.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1580: 					//야근일지-입력,수정,삭제
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1580_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_1590: 					//야근일지-인쇄
        		workbean = new AdBas1500WB();
        		((AdBas1500WB)workbean).ad_bas_1590_a(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_1590_a.jsp";
        		break;		
        		
//        	중점거래처 채권채무현황 및 관리일지-목록조회
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
 
//          중점거래처 채권채무현황 및 관리일지-채권채무현황-목록조회
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
        		

//          중점거래처 채권채무현황 및 관리일지-거래처관리현황
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
        		
//          중점거래처 채권채무현황 및 관리일지-관리담당일지
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
        		
//          대행사/지사 채권채무현황 - 목록조회
        	case AdBasWBMapping.AD_BAS_2010:					
        		workbean = new AdBas2000WB();
        		((AdBas2000WB)workbean).ad_bas_2010_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2010_l.jsp";
        		break;             		
            		
        	case AdBasWBMapping.AD_BAS_2100: 					//거래처인물정보 메인
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2100_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2100_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2110: 					//거래처인물정보 리스트
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2100_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2110_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2115: 					//거래처인물정보 고객관리내역 리스트
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2120_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2130_l.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_2120: 					//거래처인물정보 상세
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2110_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2120_s.jsp";
        		break;	
        	case AdBasWBMapping.AD_BAS_2130: 					//거래처인물정보 등록,수정,삭제
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2140: 					//거래처인물정보 고객관리내역 등록
        		workbean = new AdBas2100WB();
        		((AdBas2100WB)workbean).ad_bas_2140_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

        		
//        		영업담당별 활동내역
        	case AdBasWBMapping.AD_BAS_2210:					
        		workbean = new AdBas2200WB();
        		((AdBas2200WB)workbean).ad_bas_2210_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2210_l.jsp";
        		break;	
        		
//        		일일조중동비교 	
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
        		
        	case AdBasWBMapping.AD_BAS_2510:		//게재목표, 주간게재실적, 월간/년간 게재액, 연간 게재누적 현황   조회			
        		workbean = new AdBas2500WB();
        		((AdBas2500WB)workbean).ad_bas_2510_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2510_l.jsp";
        		break;	
        		
        		
        	case AdBasWBMapping.AD_BAS_2600:					//목표관리 초기
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2600_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2600_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2610:					//목표관리 조회(매체별)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2610_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2610_l.jsp";   		  
        		break;      
        	case AdBasWBMapping.AD_BAS_2615:  					//목표관리 조회(매체별)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2615_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2615_l.jsp";   		
        		break;        		
        	case AdBasWBMapping.AD_BAS_2620:					//목표관리 조회(파트별)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2620_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2620_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2630:					//목표관리 조회(담당별)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2630_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2630_l.jsp";        		
        		break;
        	case AdBasWBMapping.AD_BAS_2640:					//목표관리 조회(광고지사별)
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2640_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2640_l.jsp";        		   		
        		break;        		        		
        	case AdBasWBMapping.AD_BAS_2650:					//목표관리 저장
        		workbean = new AdBas2600WB();
        		((AdBas2600WB)workbean).ad_bas_2650_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_2700:					//파트관리 초기
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2700_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2700_m.jsp";
        		break;
        		
        	case AdBasWBMapping.AD_BAS_2710:					//파트관리 조회
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2710_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2710_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_2720:					//조직관리 조회
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2720_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2720_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2730:					//파트관리 입력, 수정, 삭제
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2730_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_2740:					//조직관리 입력, 수정, 삭제
        		workbean = new AdBas2700WB();
        		((AdBas2700WB)workbean).ad_bas_2740_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        		
//        		실적조회 - 담당별조회 
        	case AdBasWBMapping.AD_BAS_2800:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2800_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2800_m.jsp";
        		break;   
//        		실적조회 - 담당별조회 
        	case AdBasWBMapping.AD_BAS_2810:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2810_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2810_l.jsp";
        		break;        
//        		실적조회 - 파트별조회 
        	case AdBasWBMapping.AD_BAS_2820:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2820_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2820_l.jsp";
        		break;     
//        		실적조회 - 팀별조회 
        	case AdBasWBMapping.AD_BAS_2830:					
        		workbean = new AdBas2800WB();
        		((AdBas2800WB)workbean).ad_bas_2830_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2830_l.jsp";
        		break;   
        		
//        		출판광고실적조회 - 담당별조회 
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

        	case AdBasWBMapping.AD_BAS_3000:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3000WB();
        		((AdBas3000WB)workbean).ad_bas_3000_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3000_m.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3010:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3000WB();
        		((AdBas3000WB)workbean).ad_bas_3010_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3010_l.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3020:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3000WB();
        		((AdBas3000WB)workbean).ad_bas_3020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;  
        		
//        		출판광고실적조회 - 매체별조회 
        	case AdBasWBMapping.AD_BAS_2920:					
        		workbean = new AdBas2900WB();
        		((AdBas2900WB)workbean).ad_bas_2920_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_2920_l.jsp";
        		break;        		

//        		조중동광고정보조회
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
        		
//        		조중동광고정보입력
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
        		
        	case AdBasWBMapping.AD_BAS_3310: 					//거래처(광고주) 조회 2/13
        		workbean = new AdBas3300WB();
        		((AdBas3300WB)workbean).ad_bas_3310_l(req, res);
        		if("dit0010".equals(acct_cd)){
        			nextPage = "/jsp/ad/bas/ad_bas_3310_l_ang.jsp";
        		}else{
        			nextPage = "/jsp/ad/bas/ad_bas_3310_l.jsp";
        		}
        		break;     
        	case AdBasWBMapping.AD_BAS_3320: 					//거래처(광고주) 조회 2/13
        		workbean = new AdBas3300WB();
        		((AdBas3300WB)workbean).ad_bas_3320_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3320_l.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3400:					//목표관리(출판) 초기
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3400_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3400_m.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3410:					//목표관리(출판) 조회(매체별)
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3410_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3410_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_3420:					//목표관리(출판) 조회(당당별)
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3420_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3420_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3430:					//목표관리(출판) 저장
        		workbean = new AdBas3400WB();
        		((AdBas3400WB)workbean).ad_bas_3430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
          		
        	case AdBasWBMapping.AD_BAS_3500:					//타사매체 데이타베이스
        		workbean = new AdBas3500WB();
        		((AdBas3500WB)workbean).ad_bas_3500_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3500_m.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_3510:					//타사매체 데이타베이스
        		workbean = new AdBas3500WB();
        		((AdBas3500WB)workbean).ad_bas_3510_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3510_l.jsp";
        		break;        		
        	case AdBasWBMapping.AD_BAS_3520:					//타사매체 데이타베이스
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
        		
        	case AdBasWBMapping.AD_BAS_3700:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3700_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3700_m.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3701:					//조중동 데이타베이스- 지사평가 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3701_m(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3701_m.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3710:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3710_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3710_l.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3711:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3711_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3711_l.jsp";
        		break;   
        	case AdBasWBMapping.AD_BAS_3712:					//조중동 데이타베이스- 담당조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3712_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3712_l.jsp";
        		break;           		
        	case AdBasWBMapping.AD_BAS_3720:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3720_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3720_l.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3721:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3721_s(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3721_s.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3750:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3750_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3751:					//조중동 데이타베이스- 목록조회 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3751_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3752:					//조중동 데이타베이스- 업종/담당 저장 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3752_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case AdBasWBMapping.AD_BAS_3760:					//조중동 데이타베이스- 지사평가 저장 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3760_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdBasWBMapping.AD_BAS_3761:					//조중동 데이타베이스- 지사평가 저장 
        		workbean = new AdBas3700WB();
        		((AdBas3700WB)workbean).ad_bas_3761_l(req, res);
        		nextPage = "/jsp/ad/bas/ad_bas_3761_l.jsp";
        		break;         		        		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}

