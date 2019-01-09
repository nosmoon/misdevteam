/***************************************************************************************************
 * 파일명 : SEBasServlet.java
 * 기능 :  기준정보서블릿
 * 작성일자 : 2009.01.13
 * 작성자 :   배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.se.bas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.se.bas.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class SEBasServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/bas/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("SEBasServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SEBasServlet : process : nextPage : " + nextPage);
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
        SE_BAS_1000WB wb1000 = null;
        SE_BAS_1100WB wb1100 = null;
        SE_BAS_1200WB wb1200 = null;
        SE_BAS_1300WB wb1300 = null;
        SE_BAS_1400WB wb1400 = null;
        SE_BAS_1500WB wb1500 = null;
        SE_BAS_1600WB wb1600 = null;
        SE_BAS_1700WB wb1700 = null;
        
        switch (pid) {
	    	case SEBasWBMapping.SE_BAS_1000:
	//    		wb1000 = new SE_BAS_1000WB();
	//    		wb1000.initPage(req, res);
	//    		nextPage = "/jsp/se/bas/se_bas_1000.jsp";
	    		break;        
	    	case SEBasWBMapping.SE_BAS_1010:
	    		wb1000 = new SE_BAS_1000WB();
	    		wb1000.getList(req, res);
	    		nextPage = "/jsp/se/bas/se_bas_1010_l.jsp";
	    		break;   
	    	case SEBasWBMapping.SE_BAS_1020:
	    		wb1000 = new SE_BAS_1000WB();
	    		wb1000.getDetail(req, res);
	    		nextPage = "/jsp/se/bas/se_bas_1020_s.jsp";
	    		break;    
	    	case SEBasWBMapping.SE_BAS_1030:
	    		wb1000 = new SE_BAS_1000WB();
	    		wb1000.multiExec(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;    
	    	case SEBasWBMapping.SE_BAS_1040:
	    		wb1000 = new SE_BAS_1000WB();
	    		wb1000.se_bas_1040_m(req, res);
	    		nextPage = "/jsp/se/bas/se_bas_1040_m.jsp";
	    		break;    	
        	case SEBasWBMapping.SE_BAS_1100:
        		wb1100 = new SE_BAS_1100WB();
        		wb1100.se_bas_1100_m(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1100_m.jsp";
        		break;   
        	case SEBasWBMapping.SE_BAS_1110:
        		wb1100 = new SE_BAS_1100WB();
        		wb1100.se_bas_1110_l(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1110_l.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1120:
        		wb1100 = new SE_BAS_1100WB();
        		wb1100.se_bas_1120_l(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1120_l.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1130:
        		wb1100 = new SE_BAS_1100WB();
        		wb1100.se_bas_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1200:
        		wb1200 = new SE_BAS_1200WB();
        		wb1200.se_bas_1200_m(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1200_m.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1210:
        		wb1200 = new SE_BAS_1200WB();
        		wb1200.se_bas_1210_l(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1210_l.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1220:
        		wb1200 = new SE_BAS_1200WB();
        		wb1200.se_bas_1220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1300:
        		wb1300 = new SE_BAS_1300WB();
        		wb1300.se_bas_1300_m(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1300_m.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1310:
        		wb1300 = new SE_BAS_1300WB();
        		wb1300.se_bas_1310_l(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1310_l.jsp";
        	
        		break;
        	case SEBasWBMapping.SE_BAS_1400:
        		wb1400 = new SE_BAS_1400WB();
        		wb1400.se_bas_1400_m(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1400_m.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1410:
        		wb1400 = new SE_BAS_1400WB();
        		wb1400.se_bas_1410_l(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1410_l.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1420:
        		wb1400 = new SE_BAS_1400WB();
        		wb1400.se_bas_1420_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        	
        	//담당월업무처리현황
        	case SEBasWBMapping.SE_BAS_1500:
        		wb1500 = new SE_BAS_1500WB();
        		wb1500.se_bas_1500_m(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1500_m.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1510:
        		wb1500 = new SE_BAS_1500WB();
        		wb1500.se_bas_1510_l(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1510_l.jsp";
        		
        		break;

        	//소년편입률관리
			case SEBasWBMapping.SE_BAS_1600:
				wb1600 = new SE_BAS_1600WB();
				wb1600.se_bas_1600_m(req, res);
				nextPage = "/jsp/se/bas/se_bas_1600_m.jsp";
				break;
			case SEBasWBMapping.SE_BAS_1610:
				wb1600 = new SE_BAS_1600WB();
				wb1600.se_bas_1610_l(req, res);
				nextPage = "/jsp/se/bas/se_bas_1610_l.jsp";
				break;
			case SEBasWBMapping.SE_BAS_1620:
				wb1600 = new SE_BAS_1600WB();
				wb1600.se_bas_1620_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			
			//자율관리 매체단가등록
			case SEBasWBMapping.SE_BAS_1700:
        		wb1700 = new SE_BAS_1700WB();
        		wb1700.se_bas_1700_m(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1700_m.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1710:
        		wb1700 = new SE_BAS_1700WB();
        		wb1700.se_bas_1710_l(req, res);
        		nextPage = "/jsp/se/bas/se_bas_1710_l.jsp";
        		
        		break;
        	case SEBasWBMapping.SE_BAS_1720:
        		wb1700 = new SE_BAS_1700WB();
        		wb1700.se_bas_1720_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";	
        		break;
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
