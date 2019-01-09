/***************************************************************************************************
 * 파일명 : AdNmdServlet.java
 * 기능 : 마감작업  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ad.nmd.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.nmd.wb.AdNmd1000WB;
import chosun.ciis.ad.nmd.wb.AdNmd4100WB;
import chosun.ciis.ad.nmd.wb.AdNmd4200WB;
import chosun.ciis.ad.nmd.wb.AdNmd4300WB;
import chosun.ciis.ad.nmd.wb.AdNmd4400WB;
import chosun.ciis.ad.nmd.wb.AdNmd5000WB;
import chosun.ciis.ad.nmd.wb.AdNmd5100WB;
import chosun.ciis.ad.nmd.wb.AdNmd5200WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdNmdServlet extends BaseServlet {
	
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
        try {
            String servletMappedUrl = "/ad/nmd/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdNmdServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdNmdServlet : process : nextPage : " + nextPage);
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
        System.out.println("servlet end1");
        rd.forward(req, res);
        System.out.println("servlet end2");
    }

    /**
     * AdMgWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
	    	case AdNmdWBMapping.AD_NMD_1010:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_1010_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_1011:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_1011_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;  	    		
        	case AdNmdWBMapping.AD_NMD_1020:
        		workbean = new AdNmd1000WB();
        		((AdNmd1000WB)workbean).ad_nmd_1020_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_1020_l.jsp";
        		break;     
	    	case AdNmdWBMapping.AD_NMD_1030:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_1030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_1040:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_1040_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	    	case AdNmdWBMapping.AD_NMD_1050:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_1050_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	    		
	    	case AdNmdWBMapping.AD_NMD_1051:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_1051_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    	case AdNmdWBMapping.AD_NMD_2010:
        		workbean = new AdNmd1000WB();
        		 System.out.println("bong.svl");
        		((AdNmd1000WB)workbean).ad_nmd_2010_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_2010_l.jsp";
        		break;   
	    	case AdNmdWBMapping.AD_NMD_2020:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_2020_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_2030:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_2030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;  	
        	case AdNmdWBMapping.AD_NMD_3010:
        		workbean = new AdNmd1000WB();
        		 System.out.println("bong.svl");
        		((AdNmd1000WB)workbean).ad_nmd_3010_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_3010_l.jsp";
        		break;   
	    	case AdNmdWBMapping.AD_NMD_3020:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_3020_a(req, res); 
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_3030:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_3030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case AdNmdWBMapping.AD_NMD_4000:
        		workbean = new AdNmd1000WB();
        		 System.out.println("bong.svl");
        		((AdNmd1000WB)workbean).ad_nmd_4000_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4000_m.jsp";
        		break;   	    		
        	case AdNmdWBMapping.AD_NMD_4010:
        		workbean = new AdNmd1000WB();
        		 System.out.println("bong.svl_AD_NMD_4010_1");
        		((AdNmd1000WB)workbean).ad_nmd_4010_a(req, res);
        		System.out.println("bong.svl_AD_NMD_4010_2");
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   
	    	case AdNmdWBMapping.AD_NMD_4020:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4020_l(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_4020_l.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_4021:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4021_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 	  	    		
	    	case AdNmdWBMapping.AD_NMD_4030:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 	  
	    	case AdNmdWBMapping.AD_NMD_4040:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4040_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 
	    	case AdNmdWBMapping.AD_NMD_4061:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4061_l(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_4061_l.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_4062:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4062_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 	  	    		
	    	case AdNmdWBMapping.AD_NMD_4063:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4063_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 
	    	case AdNmdWBMapping.AD_NMD_4070:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4070_l(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_4070_l.jsp";
	    		break;   	    	
	    	case AdNmdWBMapping.AD_NMD_4080:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4080_m(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_4080_m.jsp";
	    		break; 
        	case AdNmdWBMapping.AD_NMD_4081:
        		workbean = new AdNmd1000WB();
        		((AdNmd1000WB)workbean).ad_nmd_4081_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4081_l.jsp";
        		break;	
	    	case AdNmdWBMapping.AD_NMD_4082:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4082_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;    
	    	case AdNmdWBMapping.AD_NMD_4083:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4083_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;  
	    	case AdNmdWBMapping.AD_NMD_4084:
	    		workbean = new AdNmd1000WB();
	    		((AdNmd1000WB)workbean).ad_nmd_4084_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;  	    		
        	case AdNmdWBMapping.AD_NMD_4100:
        		workbean = new AdNmd4100WB();
        		((AdNmd4100WB)workbean).ad_nmd_4100_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4100_m.jsp";
        		break; 
        	case AdNmdWBMapping.AD_NMD_4110:
        		workbean = new AdNmd4100WB();
        		((AdNmd4100WB)workbean).ad_nmd_4110_s(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4110_s.jsp";
        		break;
        	case AdNmdWBMapping.AD_NMD_4111:
        		workbean = new AdNmd4100WB();
        		((AdNmd4100WB)workbean).ad_nmd_4111_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4111_l.jsp";
        		break;  
        	case AdNmdWBMapping.AD_NMD_4112:
        		workbean = new AdNmd4100WB();
        		((AdNmd4100WB)workbean).ad_nmd_4112_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4112_l.jsp";
        		break;
        	case AdNmdWBMapping.AD_NMD_4113:
        		workbean = new AdNmd4100WB();
        		((AdNmd4100WB)workbean).ad_nmd_4113_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4113_l.jsp";
        		break; 
	    	case AdNmdWBMapping.AD_NMD_4120:
	    		workbean = new AdNmd4100WB();
	    		((AdNmd4100WB)workbean).ad_nmd_4120_a(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_4120_a.jsp";
	    		break; 	  
	    	case AdNmdWBMapping.AD_NMD_4130:
	    		workbean = new AdNmd4100WB();
	    		((AdNmd4100WB)workbean).ad_nmd_4130_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_4140:
	    		workbean = new AdNmd4100WB();
	    		((AdNmd4100WB)workbean).ad_nmd_4140_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;  
        	case AdNmdWBMapping.AD_NMD_4150:
        		workbean = new AdNmd4100WB();
        		((AdNmd4100WB)workbean).ad_nmd_4150_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4150_m.jsp";
        		break; 
        	case AdNmdWBMapping.AD_NMD_4151:
        		workbean = new AdNmd4100WB();
        		((AdNmd4100WB)workbean).ad_nmd_4151_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4151_l.jsp";
        		break; 
	    	case AdNmdWBMapping.AD_NMD_4155:
	    		workbean = new AdNmd4100WB();
	    		((AdNmd4100WB)workbean).ad_nmd_4155_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 
        	case AdNmdWBMapping.AD_NMD_4200:
        		workbean = new AdNmd4200WB();
        		((AdNmd4200WB)workbean).ad_nmd_4200_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4200_m.jsp";
        		break; 
	    	case AdNmdWBMapping.AD_NMD_4210:
	    		workbean = new AdNmd4200WB();
	    		((AdNmd4200WB)workbean).ad_nmd_4210_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 	
	    	case AdNmdWBMapping.AD_NMD_4220:
	    		workbean = new AdNmd4200WB();
	    		((AdNmd4200WB)workbean).ad_nmd_4220_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 
//        		환불처리: 초기화면
        	case AdNmdWBMapping.AD_NMD_4300:
        		workbean = new AdNmd4300WB();
        		((AdNmd4300WB)workbean).ad_nmd_4300_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4300_m.jsp";
        		break;        		
//        		환불처리: 목록조회
        	case AdNmdWBMapping.AD_NMD_4310:
        		workbean = new AdNmd4300WB();
        		((AdNmd4300WB)workbean).ad_nmd_4310_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4310_l.jsp";
        		break;          	 	
//        		환불처리: 상세조회
        	case AdNmdWBMapping.AD_NMD_4320:
        		workbean = new AdNmd4300WB();
        		((AdNmd4300WB)workbean).ad_nmd_4320_s(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4320_s.jsp";
        		break;          		
//        		환불처리: 선수금잔액조회
        	case AdNmdWBMapping.AD_NMD_4325:
        		workbean = new AdNmd4300WB();
        		((AdNmd4300WB)workbean).ad_nmd_4325_s(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4325_s.jsp";
        		break;          		
//        		환불처리: 입력,수정,삭제
        	case AdNmdWBMapping.AD_NMD_4330:
        		workbean = new AdNmd4300WB();
        		((AdNmd4300WB)workbean).ad_nmd_4330_a(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4330_a.jsp";
        		break;           		
//        		환불처리: 현업전표생성, 취소
        	case AdNmdWBMapping.AD_NMD_4340:
        		workbean = new AdNmd4300WB();
        		((AdNmd4300WB)workbean).ad_nmd_4340_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break; 	 
//        		입금내역: 초기화면
        	case AdNmdWBMapping.AD_NMD_4400:  
        		workbean = new AdNmd4400WB();
        		((AdNmd4400WB)workbean).ad_nmd_4400_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4400_m.jsp";
        		break;         	
//        		입금내역: 목록조회
        	case AdNmdWBMapping.AD_NMD_4410:  
        		workbean = new AdNmd4400WB();
        		((AdNmd4400WB)workbean).ad_nmd_4410_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4410_l.jsp";
        		break;  
//        		입금내역: 초기화면
        	case AdNmdWBMapping.AD_NMD_4450:  
        		workbean = new AdNmd4400WB();
        		((AdNmd4400WB)workbean).ad_nmd_4450_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4450_m.jsp";
        		break;         	
//        		입금내역: 목록조회
        	case AdNmdWBMapping.AD_NMD_4451:  
        		workbean = new AdNmd4400WB();
        		((AdNmd4400WB)workbean).ad_nmd_4451_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_4451_l.jsp";
        		break;   
        		
	    	case AdNmdWBMapping.AD_NMD_5000:
	    		workbean = new AdNmd5000WB();
	    		((AdNmd5000WB)workbean).ad_nmd_5000_m(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_5000_m.jsp";
	    		break;  
	    	case AdNmdWBMapping.AD_NMD_5010:
	    		workbean = new AdNmd5000WB();
	    		((AdNmd5000WB)workbean).ad_nmd_5010_l(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_5010_l.jsp";
	    		break; 
        	case AdNmdWBMapping.AD_NMD_5011:
        		workbean = new AdNmd5000WB();
        		((AdNmd5000WB)workbean).ad_nmd_5011_s(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_5011_s.jsp";
        		break;	
	    	case AdNmdWBMapping.AD_NMD_5021:
	    		workbean = new AdNmd5000WB();
	    		((AdNmd5000WB)workbean).ad_nmd_5021_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;    
	    	case AdNmdWBMapping.AD_NMD_5022:
	    		workbean = new AdNmd5000WB();
	    		((AdNmd5000WB)workbean).ad_nmd_5022_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 
        	case AdNmdWBMapping.AD_NMD_5030:
        		workbean = new AdNmd5000WB();
        		((AdNmd5000WB)workbean).ad_nmd_5030_s(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_5030_s.jsp";
        		break;	
	    	case AdNmdWBMapping.AD_NMD_5040:
	    		workbean = new AdNmd5000WB();
	    		((AdNmd5000WB)workbean).ad_nmd_5040_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 
	    	case AdNmdWBMapping.AD_NMD_5041:
	    		workbean = new AdNmd5000WB();
	    		((AdNmd5000WB)workbean).ad_nmd_5041_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;  
	    	case AdNmdWBMapping.AD_NMD_5050:
	    		workbean = new AdNmd5000WB();
	    		((AdNmd5000WB)workbean).ad_nmd_5050_l(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_5050_l.jsp";
	    		break; 		    		
	    	case AdNmdWBMapping.AD_NMD_5100:
	    		workbean = new AdNmd5100WB();
	    		((AdNmd5100WB)workbean).ad_nmd_5100_m(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_5100_m.jsp";
	    		break;  
	    	case AdNmdWBMapping.AD_NMD_5110:
	    		workbean = new AdNmd5100WB();
	    		((AdNmd5100WB)workbean).ad_nmd_5110_l(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_5110_l.jsp";
	    		break; 
	    	case AdNmdWBMapping.AD_NMD_5120:
	    		workbean = new AdNmd5100WB();
	    		((AdNmd5100WB)workbean).ad_nmd_5120_a(req, res);
	    		nextPage = "/jsp/ad/nmd/ad_nmd_5120_l.jsp";
	    		break;   
	    	case AdNmdWBMapping.AD_NMD_5121:
	    		workbean = new AdNmd5100WB();
	    		((AdNmd5100WB)workbean).ad_nmd_5121_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;    
	    	case AdNmdWBMapping.AD_NMD_5122:
	    		workbean = new AdNmd5100WB();
	    		((AdNmd5100WB)workbean).ad_nmd_5122_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 
        	case AdNmdWBMapping.AD_NMD_5130:
        		workbean = new AdNmd5100WB();
        		((AdNmd5100WB)workbean).ad_nmd_5130_s(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_5130_s.jsp";
        		break;	    		
//              세금계산서번호조회
        	case AdNmdWBMapping.AD_NMD_5200:
        		workbean = new AdNmd5200WB();
        		((AdNmd5200WB)workbean).ad_nmd_5200_m(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_5200_m.jsp";
        		break;        		
        	case AdNmdWBMapping.AD_NMD_5210:
        		workbean = new AdNmd5200WB();
        		((AdNmd5200WB)workbean).ad_nmd_5210_l(req, res);
        		nextPage = "/jsp/ad/nmd/ad_nmd_5210_l.jsp";
        		break;   
        		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
