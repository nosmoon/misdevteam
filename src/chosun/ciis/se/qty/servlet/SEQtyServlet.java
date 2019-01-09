/***************************************************************************************************
 * 파일명 : SEQtyServlet.java
 * 기능 : 부수관리
 * 작성일자 : 2009-02-12
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.se.qty.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.se.qty.wb.*;

public class SEQtyServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

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
        try {
            String servletMappedUrl = "/se/qty/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SEQtyServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SEQtyServlet : process : nextPage : " + nextPage);
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
     * SEBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        	//일계표이월
        	case SEQtyWBMapping.SE_QTY_1000:
         		workbean = new SE_QTY_1000WB();
         		((SE_QTY_1000WB)workbean).se_qty_1000_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1000_m.jsp";
        		break;        
        	case SEQtyWBMapping.SE_QTY_1010:
        		workbean = new SE_QTY_1000WB();
        		((SE_QTY_1000WB)workbean).se_qty_1010_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1010_l.jsp";
        		break;  
        	case SEQtyWBMapping.SE_QTY_1020:
        		workbean = new SE_QTY_1000WB();
        		((SE_QTY_1000WB)workbean).se_qty_1020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	//지역별 일계표작업	  
        	case SEQtyWBMapping.SE_QTY_1100:
        		workbean = new SE_QTY_1100WB();
        		((SE_QTY_1100WB)workbean).se_qty_1100_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1100_m.jsp";
        		break;    
        	case SEQtyWBMapping.SE_QTY_1110:
        		workbean = new SE_QTY_1100WB();
        		((SE_QTY_1100WB)workbean).se_qty_1110_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1110_l.jsp";
        		break;  
        	case SEQtyWBMapping.SE_QTY_1120:
        		workbean = new SE_QTY_1100WB();
        		((SE_QTY_1100WB)workbean).se_qty_1120_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;  
			case SEQtyWBMapping.SE_QTY_1130:
				workbean = new SE_QTY_1100WB();
				((SE_QTY_1100WB)workbean).se_qty_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break; 
        	//일계표 부수조회	  
        	case SEQtyWBMapping.SE_QTY_1300:
        		workbean = new SE_QTY_1300WB();
        		((SE_QTY_1300WB)workbean).se_qty_1300_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1300_m.jsp";
        		break;    
        	case SEQtyWBMapping.SE_QTY_1310:
        		workbean = new SE_QTY_1300WB();
        		((SE_QTY_1300WB)workbean).se_qty_1310_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1310_l.jsp";
        		break;  
        	//연간일계표조회	  
        	case SEQtyWBMapping.SE_QTY_1400:
        		workbean = new SE_QTY_1400WB();
        		((SE_QTY_1400WB)workbean).se_qty_1400_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1400_m.jsp";
        		break;    
        	case SEQtyWBMapping.SE_QTY_1410:
        		workbean = new SE_QTY_1400WB();
        		((SE_QTY_1400WB)workbean).se_qty_1410_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1410_l.jsp";
        		break;  
        	//유가부수대비자료	  
        	case SEQtyWBMapping.SE_QTY_1500:
        		workbean = new SE_QTY_1500WB();
        		((SE_QTY_1500WB)workbean).se_qty_1500_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1500_m.jsp";
        		break;    
        	case SEQtyWBMapping.SE_QTY_1510:
        		workbean = new SE_QTY_1500WB();
        		((SE_QTY_1500WB)workbean).se_qty_1510_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1510_l.jsp";
        		break;  
        	//전월대비유가발송부수조회	  
        	case SEQtyWBMapping.SE_QTY_1600:
        		workbean = new SE_QTY_1600WB();
        		((SE_QTY_1600WB)workbean).se_qty_1600_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1600_m.jsp";
        		break;    
        	case SEQtyWBMapping.SE_QTY_1610:
        		workbean = new SE_QTY_1600WB();
        		((SE_QTY_1600WB)workbean).se_qty_1610_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1610_l.jsp";
        		break;  
        		
        	//발송부수 증감	  
        	case SEQtyWBMapping.SE_QTY_1900:
        		workbean = new SE_QTY_1900WB();
        		((SE_QTY_1900WB)workbean).se_qty_1900_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1900_m.jsp";
        		break;    
        	case SEQtyWBMapping.SE_QTY_1910:
        		workbean = new SE_QTY_1900WB();
        		((SE_QTY_1900WB)workbean).se_qty_1910_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1910_l.jsp";
        		break;  
        	case SEQtyWBMapping.SE_QTY_1920:
        		workbean = new SE_QTY_1900WB();
        		((SE_QTY_1900WB)workbean).se_qty_1920_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;   
        	case SEQtyWBMapping.SE_QTY_1930:
        		workbean = new SE_QTY_1900WB();
        		((SE_QTY_1900WB)workbean).se_qty_1930_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1930_l.jsp";
        		break;  
        	case SEQtyWBMapping.SE_QTY_1950:
        		workbean = new SE_QTY_1900WB();
        		((SE_QTY_1900WB)workbean).se_qty_1950_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_1950_l.jsp";
        		break;
        	//일일발송부수 증감내역	  
        	case SEQtyWBMapping.SE_QTY_2000:
        		workbean = new SE_QTY_2000WB();
        		((SE_QTY_2000WB)workbean).se_qty_2000_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_2000_m.jsp";
        		break;    
        	case SEQtyWBMapping.SE_QTY_2010:
        		workbean = new SE_QTY_2000WB();
        		((SE_QTY_2000WB)workbean).se_qty_2010_l(req, res);
        		nextPage = "/jsp/se/qty/se_qty_2010_l.jsp";
        		break;  
        	//특판부수신청
        	case SEQtyWBMapping.SE_QTY_2100:
        		workbean = new SE_QTY_2100WB();
        		((SE_QTY_2100WB)workbean).se_qty_2100_m(req, res);
        		nextPage = "/jsp/se/qty/se_qty_2100_m.jsp";
        		break;    
			case SEQtyWBMapping.SE_QTY_2105:
				workbean = new SE_QTY_2100WB();
				((SE_QTY_2100WB)workbean).se_qty_2105_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2105_l.jsp";
				break;	
			case SEQtyWBMapping.SE_QTY_2110:
				workbean = new SE_QTY_2100WB();
				((SE_QTY_2100WB)workbean).se_qty_2110_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2110_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2120:
				workbean = new SE_QTY_2100WB();
				((SE_QTY_2100WB)workbean).se_qty_2120_s(req, res);
				nextPage = "/jsp/se/qty/se_qty_2120_s.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2130:
				workbean = new SE_QTY_2100WB();
				((SE_QTY_2100WB)workbean).se_qty_2130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//특판부수신청관리	
			case SEQtyWBMapping.SE_QTY_2200:
				workbean = new SE_QTY_2200WB();
				((SE_QTY_2200WB)workbean).se_qty_2200_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2200_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2210:
				workbean = new SE_QTY_2200WB();
				((SE_QTY_2200WB)workbean).se_qty_2210_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2210_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2220:
				workbean = new SE_QTY_2200WB();
				((SE_QTY_2200WB)workbean).se_qty_2220_s(req, res);
				nextPage = "/jsp/se/qty/se_qty_2220_s.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2230:
				workbean = new SE_QTY_2200WB();
				((SE_QTY_2200WB)workbean).se_qty_2230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2240:
				workbean = new SE_QTY_2200WB();
				((SE_QTY_2200WB)workbean).se_qty_2240_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//일일증감부수마감	
			case SEQtyWBMapping.SE_QTY_2300:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2300_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2300_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2305:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2305_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2305_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2306:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2306_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2306_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2310:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2310_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2310_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2320:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2320_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2320_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2330:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2340:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2340_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2350:
				workbean = new SE_QTY_2300WB();
				((SE_QTY_2300WB)workbean).se_qty_2350_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//마감후증감부수재마감	
			case SEQtyWBMapping.SE_QTY_2400:
				workbean = new SE_QTY_2400WB();
				((SE_QTY_2400WB)workbean).se_qty_2400_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2400_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2410:
				workbean = new SE_QTY_2400WB();
				((SE_QTY_2400WB)workbean).se_qty_2410_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2410_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2420:
				workbean = new SE_QTY_2400WB();
				((SE_QTY_2400WB)workbean).se_qty_2420_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2420_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2430:
				workbean = new SE_QTY_2400WB();
				((SE_QTY_2400WB)workbean).se_qty_2430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2440:
				workbean = new SE_QTY_2400WB();
				((SE_QTY_2400WB)workbean).se_qty_2440_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2450:
				workbean = new SE_QTY_2400WB();
				((SE_QTY_2400WB)workbean).se_qty_2450_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2460:
				workbean = new SE_QTY_2400WB();
				((SE_QTY_2400WB)workbean).se_qty_2460_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2460_l.jsp";
				break;
				
				
				
			//노선발송부수현황
			case SEQtyWBMapping.SE_QTY_2500:
				workbean = new SE_QTY_2500WB();
				((SE_QTY_2500WB)workbean).se_qty_2500_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2500_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2510:
				workbean = new SE_QTY_2500WB();
				((SE_QTY_2500WB)workbean).se_qty_2510_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2510_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2520:
				workbean = new SE_QTY_2500WB();
				((SE_QTY_2500WB)workbean).se_qty_2520_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2520_l.jsp";
				break;
			//부수관련발행
			case SEQtyWBMapping.SE_QTY_2600:
				workbean = new SE_QTY_2600WB();
				((SE_QTY_2600WB)workbean).se_qty_2600_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2600_m.jsp";
				break;	
			//부수증감신청서출력
			case SEQtyWBMapping.SE_QTY_2700:
				workbean = new SE_QTY_2700WB();
				((SE_QTY_2700WB)workbean).se_qty_2700_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2700_m.jsp";
				break;
			//본지일자별발행부수
			case SEQtyWBMapping.SE_QTY_2800:
				workbean = new SE_QTY_2800WB();
				((SE_QTY_2800WB)workbean).se_qty_2800_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2800_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2810:
				workbean = new SE_QTY_2800WB();
				((SE_QTY_2800WB)workbean).se_qty_2810_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2810_l.jsp";
				break;
			//발송부수변동현황
			case SEQtyWBMapping.SE_QTY_2900:
				workbean = new SE_QTY_2900WB();
				((SE_QTY_2900WB)workbean).se_qty_2900_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_2900_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_2910:
				workbean = new SE_QTY_2900WB();
				((SE_QTY_2900WB)workbean).se_qty_2910_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_2910_l.jsp";
				break;
			//일일발송부수 증감현황
			case SEQtyWBMapping.SE_QTY_3000:
				workbean = new SE_QTY_3000WB();
				((SE_QTY_3000WB)workbean).se_qty_3000_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_3000_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_3010:
				workbean = new SE_QTY_3000WB();
				((SE_QTY_3000WB)workbean).se_qty_3010_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_3010_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_3020:
				workbean = new SE_QTY_3000WB();
				((SE_QTY_3000WB)workbean).se_qty_3020_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_3020_l.jsp";
				break;
			//발송부수증감검색
			case SEQtyWBMapping.SE_QTY_3100:
				workbean = new SE_QTY_3100WB();
				((SE_QTY_3100WB)workbean).se_qty_3100_m(req, res);
				nextPage = "/jsp/se/qty/se_qty_3100_m.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_3110:
				workbean = new SE_QTY_3100WB();
				((SE_QTY_3100WB)workbean).se_qty_3110_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_3110_l.jsp";
				break;
			case SEQtyWBMapping.SE_QTY_3120:
				workbean = new SE_QTY_3100WB();
				((SE_QTY_3100WB)workbean).se_qty_3120_l(req, res);
				nextPage = "/jsp/se/qty/se_qty_3120_l.jsp";
				break;
        				
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
