/***************************************************************************************************
 * 파일명 : AdBasServlet.java
 * 기능 : 예약관리를  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ad.res.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.wb.AdRes1000WB;
import chosun.ciis.ad.res.wb.AdRes1100WB;
import chosun.ciis.ad.res.wb.AdRes1200WB;
import chosun.ciis.ad.res.wb.AdRes1300WB;
import chosun.ciis.ad.res.wb.AdRes1400WB;
import chosun.ciis.ad.res.wb.AdRes1500WB;
import chosun.ciis.ad.res.wb.AdRes1600WB;
import chosun.ciis.ad.res.wb.AdRes1700WB;
import chosun.ciis.ad.res.wb.AdRes1800WB;
import chosun.ciis.ad.res.wb.AdRes1900WB;
import chosun.ciis.ad.res.wb.AdRes2000WB;
import chosun.ciis.ad.res.wb.AdRes2100WB;
import chosun.ciis.ad.res.wb.AdRes2200WB;
import chosun.ciis.ad.res.wb.AdRes2300WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdResServlet extends BaseServlet {

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
                String servletMappedUrl = "/ad/res/";
                iPid = extractPid(req, servletMappedUrl);
                System.out.println("AdResServlet : process : iPid : " + iPid);
                nextPage = executeWorker(req, res, iPid);
                System.out.println("AdResServlet : process : nextPage : " + nextPage);
        	}else{
        		nextPage = "/common/jsp/ad_pwr_error.jsp";
        	}
        	//원복시 아래 주석 살리고 위의 구문 주석 처리함    
//            String servletMappedUrl = "/ad/res/";
//            iPid = extractPid(req, servletMappedUrl);
//            System.out.println("AdResServlet : process : iPid : " + iPid);
//            nextPage = executeWorker(req, res, iPid);
//            System.out.println("AdResServlet : process : nextPage : " + nextPage);
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
        	case AdResWBMapping.AD_RES_1000:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1000_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1000_m.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1010:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1010_s(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1010_s.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1020:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1020_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1020_l.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1025:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1025_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1025_l.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1030:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1030_i(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1040:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1050:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1050_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1060:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1060_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1065:
        		workbean = new AdRes1000WB();
        		((AdRes1000WB)workbean).ad_res_1065_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
 
        	case AdResWBMapping.AD_RES_1100:
        		workbean = new AdRes1100WB();
        		((AdRes1100WB)workbean).ad_res_1100_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1100_m.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_1110:
        		workbean = new AdRes1100WB();
        		((AdRes1100WB)workbean).ad_res_1110_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1110_l.jsp";
        		break;     
        	case AdResWBMapping.AD_RES_1120:
        		workbean = new AdRes1100WB();
        		((AdRes1100WB)workbean).ad_res_1120_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   
        	case AdResWBMapping.AD_RES_1130:
        		workbean = new AdRes1100WB();
        		((AdRes1100WB)workbean).ad_res_1130_i(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        		
        		
        	case AdResWBMapping.AD_RES_1200:
        		workbean = new AdRes1200WB();
        		((AdRes1200WB)workbean).ad_res_1200_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1200_m.jsp";
        		break;      

        	case AdResWBMapping.AD_RES_1210:
        		workbean = new AdRes1200WB();
        		((AdRes1200WB)workbean).ad_res_1210_s(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1210_s.jsp";
        		break;            	
        	case AdResWBMapping.AD_RES_1220:
        		workbean = new AdRes1200WB();
        		((AdRes1200WB)workbean).ad_res_1220_a(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1220_a.jsp";
        		break;             	
        	case AdResWBMapping.AD_RES_1230:
        		workbean = new AdRes1200WB();
        		((AdRes1200WB)workbean).ad_res_1230_s(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1230_s.jsp";
        		break;              	
        	case AdResWBMapping.AD_RES_1250:
        		workbean = new AdRes1200WB(); 
        		((AdRes1200WB)workbean).ad_res_1250_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1250_l.jsp";
        		break;              	
        	case AdResWBMapping.AD_RES_1260:
        		workbean = new AdRes1200WB(); 
        		((AdRes1200WB)workbean).ad_res_1260_s(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1260_s.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_1270:
        		workbean = new AdRes1200WB(); 
        		((AdRes1200WB)workbean).ad_res_1270_s(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1270_s.jsp";
        		break;   
        	case AdResWBMapping.AD_RES_1201:
        		workbean = new AdRes1200WB(); 
        		((AdRes1200WB)workbean).ad_res_1201_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1201_m.jsp";
        		break;               	
        	case AdResWBMapping.AD_RES_1202:
        		workbean = new AdRes1200WB(); 
        		((AdRes1200WB)workbean).ad_res_1202_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1202_l.jsp";
        		break;            		
        	case AdResWBMapping.AD_RES_1203:
        		workbean = new AdRes1200WB(); 
        		((AdRes1200WB)workbean).ad_res_1203_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;           		
        	case AdResWBMapping.AD_RES_1204:
        		workbean = new AdRes1200WB(); 
        		((AdRes1200WB)workbean).ad_res_1204_d(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;       
        	
        	case AdResWBMapping.AD_RES_1300:
        		workbean = new AdRes1300WB();
        		((AdRes1300WB)workbean).ad_res_1300_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1300_m.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_1310:
        		workbean = new AdRes1300WB();
        		((AdRes1300WB)workbean).ad_res_1310_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1310_l.jsp";
        		break;            	
        	case AdResWBMapping.AD_RES_1320:
        		workbean = new AdRes1300WB();
        		((AdRes1300WB)workbean).ad_res_1320_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        		
        	case AdResWBMapping.AD_RES_1400:
        		workbean = new AdRes1400WB();
        		((AdRes1400WB)workbean).ad_res_1400_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1400_m.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_1410:
        		workbean = new AdRes1400WB();
        		((AdRes1400WB)workbean).ad_res_1410_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1410_l.jsp";
        		break;            	
        	case AdResWBMapping.AD_RES_1420:
        		workbean = new AdRes1400WB();
        		((AdRes1400WB)workbean).ad_res_1420_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1420_l.jsp";
        		break;        	
        	case AdResWBMapping.AD_RES_1430:
        		workbean = new AdRes1400WB();
        		((AdRes1400WB)workbean).ad_res_1430_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    	
        	case AdResWBMapping.AD_RES_1440:
        		workbean = new AdRes1400WB();
        		((AdRes1400WB)workbean).ad_res_1440_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	
        	case AdResWBMapping.AD_RES_1500:
        		workbean = new AdRes1500WB();
        		((AdRes1500WB)workbean).ad_res_1500_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1500_m.jsp";
        		break;	
        	case AdResWBMapping.AD_RES_1510:
        		workbean = new AdRes1500WB();
        		((AdRes1500WB)workbean).ad_res_1510_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1510_l.jsp";
        		break;
        	
        	case AdResWBMapping.AD_RES_1600:
        		workbean = new AdRes1600WB();
        		((AdRes1600WB)workbean).ad_res_1600_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1600_m.jsp";
        		break;	
        	case AdResWBMapping.AD_RES_1610:
        		workbean = new AdRes1600WB();
        		((AdRes1600WB)workbean).ad_res_1610_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1610_l.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1620:
        		workbean = new AdRes1600WB();
        		((AdRes1600WB)workbean).ad_res_1620_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1620_l.jsp";
        		break;     
        	case AdResWBMapping.AD_RES_1621:
        		workbean = new AdRes1600WB();
        		((AdRes1600WB)workbean).ad_res_1621_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;           		
        	case AdResWBMapping.AD_RES_1710:
        		workbean = new AdRes1700WB();
        		((AdRes1700WB)workbean).ad_res_1710_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1710_l.jsp";
        		break;	
        		
        	case AdResWBMapping.AD_RES_1800:
        		workbean = new AdRes1800WB();
        		((AdRes1800WB)workbean).ad_res_1800_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1800_m.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_1810:
        		workbean = new AdRes1800WB();
        		((AdRes1800WB)workbean).ad_res_1810_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1810_l.jsp";
        		break;	
        	
        	case AdResWBMapping.AD_RES_1900:
        		workbean = new AdRes1900WB();
        		((AdRes1900WB)workbean).ad_res_1900_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1900_m.jsp";
        		break;	
        	case AdResWBMapping.AD_RES_1910:
        		workbean = new AdRes1900WB();
        		((AdRes1900WB)workbean).ad_res_1910_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1910_l.jsp";
        		break;		
        	case AdResWBMapping.AD_RES_1911:
        		workbean = new AdRes1900WB();
        		((AdRes1900WB)workbean).ad_res_1911_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1911_l.jsp";
        		break;	
        	case AdResWBMapping.AD_RES_1920:
        		workbean = new AdRes1900WB();
        		((AdRes1900WB)workbean).ad_res_1920_i(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case AdResWBMapping.AD_RES_1921:
        		workbean = new AdRes1900WB();
        		((AdRes1900WB)workbean).ad_res_1921_i(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case AdResWBMapping.AD_RES_1930:
        		workbean = new AdRes1900WB();
        		((AdRes1900WB)workbean).ad_res_1930_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case AdResWBMapping.AD_RES_1940:
        		workbean = new AdRes1900WB();
        		((AdRes1900WB)workbean).ad_res_1940_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_1940_l.jsp";
        		break;

        	case AdResWBMapping.AD_RES_2010:
        		workbean = new AdRes2000WB();
        		((AdRes2000WB)workbean).ad_res_2010_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2010_l.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_2020:
        		workbean = new AdRes2000WB();
        		((AdRes2000WB)workbean).ad_res_2020_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;    
        		 
        	case AdResWBMapping.AD_RES_2100:
        		workbean = new AdRes2100WB();
        		((AdRes2100WB)workbean).ad_res_2100_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2100_m.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_2110:
        		workbean = new AdRes2100WB();
        		((AdRes2100WB)workbean).ad_res_2110_s(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2110_s.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_2111:
        		workbean = new AdRes2100WB();
        		((AdRes2100WB)workbean).ad_res_2111_s(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2111_s.jsp";
        		break;            		
        	case AdResWBMapping.AD_RES_2120:
        		workbean = new AdRes2100WB();
        		((AdRes2100WB)workbean).ad_res_2120_a(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2120_a.jsp";
        		break;        
        		
        	case AdResWBMapping.AD_RES_2200:
        		workbean = new AdRes2200WB();
        		((AdRes2200WB)workbean).ad_res_2200_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2200_m.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_2210:
        		workbean = new AdRes2200WB();
        		((AdRes2200WB)workbean).ad_res_2210_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2210_l.jsp";
        		break;            	
        	case AdResWBMapping.AD_RES_2220:
        		workbean = new AdRes2200WB();
        		((AdRes2200WB)workbean).ad_res_2220_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	

        	case AdResWBMapping.AD_RES_2300:
        		workbean = new AdRes2300WB();
        		((AdRes2300WB)workbean).ad_res_2300_m(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2300_m.jsp";
        		break;    
        	case AdResWBMapping.AD_RES_2310:
        		workbean = new AdRes2300WB();
        		((AdRes2300WB)workbean).ad_res_2310_l(req, res);
        		nextPage = "/jsp/ad/res/ad_res_2310_l.jsp";
        		break;            	
        	case AdResWBMapping.AD_RES_2320:
        		workbean = new AdRes2300WB();
        		((AdRes2300WB)workbean).ad_res_2320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
