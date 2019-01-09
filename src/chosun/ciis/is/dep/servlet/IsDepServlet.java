/***************************************************************************************************
 * 파일명 : 
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.is.dep.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.dep.wb.IsDep1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsDepServlet extends BaseServlet {

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
            String servletMappedUrl = "/is/dep/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("IsBasServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("IsBasServlet : process : nextPage : " + nextPage);
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
        switch (pid) {
	        case IsDepWBMapping.IS_DEP_1000:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1000_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1000_m.jsp";
	    		break;    	
	        case IsDepWBMapping.IS_DEP_1010:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1010_s(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1010_s.jsp";
	    		break;
	        case IsDepWBMapping.IS_DEP_1011:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1011_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1011_l.jsp";
	    		break;	
	        case IsDepWBMapping.IS_DEP_1012:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1012_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1012_l.jsp";
	    		break;
	        case IsDepWBMapping.IS_DEP_1013:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1013_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1013_l.jsp";
	    		break;	
	        case IsDepWBMapping.IS_DEP_1014:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1014_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1014_l.jsp";
	    		break;	
	        case IsDepWBMapping.IS_DEP_1020:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1020_a(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1020_a.jsp";
	    		break;	
	        case IsDepWBMapping.IS_DEP_1030:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case IsDepWBMapping.IS_DEP_1040:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1040_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case IsDepWBMapping.IS_DEP_1051:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1051_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1051_l.jsp";
	    		break;
	        case IsDepWBMapping.IS_DEP_1055:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1055_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        
        
        
        
        
        
        
        
        
        
        	case IsDepWBMapping.IS_DEP_1100:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1100_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1100_m.jsp";
	    		break;    	
	        case IsDepWBMapping.IS_DEP_1101:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1101_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1101_m.jsp";
	    		break;	
	        case IsDepWBMapping.IS_DEP_1110:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1110_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case IsDepWBMapping.IS_DEP_1111:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1111_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case IsDepWBMapping.IS_DEP_1120:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1120_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case IsDepWBMapping.IS_DEP_1121:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1121_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
        
        	case IsDepWBMapping.IS_DEP_1200:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1200_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1200_m.jsp";
	    		break;    	
        	case IsDepWBMapping.IS_DEP_1210:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1210_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1210_l.jsp";
	    		break;    	
        	case IsDepWBMapping.IS_DEP_1220:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1220_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case IsDepWBMapping.IS_DEP_1230:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1230_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_1310:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1310_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1310_l.jsp";
	    		break;  	
        	case IsDepWBMapping.IS_DEP_1320:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1320_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case IsDepWBMapping.IS_DEP_1400:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1400_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1400_m.jsp";
	    		break;    	
        	case IsDepWBMapping.IS_DEP_1410:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1410_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_1420:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1420_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_1500:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1500_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1500_m.jsp";
	    		break;    	
        	case IsDepWBMapping.IS_DEP_1510:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1510_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1510_l.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_1520:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1520_s(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1520_s.jsp";
	    		break; 	
        	case IsDepWBMapping.IS_DEP_1525:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1525_s(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1525_s.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_1530:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1530_a(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1530_a.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_1540:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1540_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_1600:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1600_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1600_m.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_1610:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1610_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1610_l.jsp";
	    		break; 	
        	case IsDepWBMapping.IS_DEP_1620:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1620_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1620_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_1750:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1750_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1750_m.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_1751:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1751_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1751_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_1800:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1800_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1800_m.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_1810:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1810_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1810_l.jsp";
	    		break; 	
        	case IsDepWBMapping.IS_DEP_1820:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1820_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 		
        	case IsDepWBMapping.IS_DEP_1830:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1830_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1830_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_1900:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1900_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1900_m.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_1910:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1910_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1910_l.jsp";
	    		break;  	
        	case IsDepWBMapping.IS_DEP_1920:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1920_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break; 	
        	case IsDepWBMapping.IS_DEP_1930:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_1930_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_1930_l.jsp";
	    		break;	
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
        	case IsDepWBMapping.IS_DEP_2400:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2400_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2400_m.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_2410:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2410_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2410_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2420:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2420_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2420_l.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_2430:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2430_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2430_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2440:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2440_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2440_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2500:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2500_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2500_m.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2510:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2510_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2510_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2600:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2600_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2600_m.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_2610:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2610_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2610_l.jsp";
	    		break;
        	case IsDepWBMapping.IS_DEP_2620:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2620_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2620_l.jsp";
	    		break;
	    		
	    		
	    		
	    		
	    		
	    		
	    		
        	case IsDepWBMapping.IS_DEP_2700:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2700_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2700_m.jsp";
	    		break;  
        	case IsDepWBMapping.IS_DEP_2710:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2710_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2710_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2720:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2720_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2720_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2800:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2800_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2800_m.jsp";
	    		break;  	
        	case IsDepWBMapping.IS_DEP_2810:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2810_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2810_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2900:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2900_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2900_m.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_2910:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_2910_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_2910_l.jsp";
	    		break;	
	    		
	    		
        	case IsDepWBMapping.IS_DEP_3500:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3500_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_3500_m.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_3510:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3510_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_3510_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_3520:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3520_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_3520_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_3530:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3530_a(req, res);
	    		//nextPage = "/jsp/is/dep/is_dep_3530_a.jsp";
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_3540:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3540_a(req, res);
	    		//nextPage = "/jsp/is/dep/is_dep_3540_a.jsp";
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    		
	    	
	    		
	    		
        	case IsDepWBMapping.IS_DEP_3700:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3700_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_3700_m.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_3710:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3710_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_3710_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_3715:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3715_u(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_3720:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3720_s(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_3720_s.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_3730:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3730_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_3810:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3810_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_3810_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_3820:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_3820_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    		
	   /********************************************************************************/
	    		
	    		
        	case IsDepWBMapping.IS_DEP_4000:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4000_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_4000_m.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_4010:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4010_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_4010_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_4020:
        		workbean = new IsDep1000WB();
        		((IsDep1000WB)workbean).is_dep_4020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsDepWBMapping.IS_DEP_4025:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4025_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_4030:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case IsDepWBMapping.IS_DEP_4040:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4040_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case IsDepWBMapping.IS_DEP_4045:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4045_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case IsDepWBMapping.IS_DEP_4051:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4051_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_4051_l.jsp";
	    		System.out.println("bong.svl");
	    		break;
        	case IsDepWBMapping.IS_DEP_4055:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4055_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
	    		
	    		
	   /********************************************************************************/
        	case IsDepWBMapping.IS_DEP_4300:
        		workbean = new IsDep1000WB();
        		((IsDep1000WB)workbean).is_dep_4300_m(req, res);
        		nextPage = "/jsp/is/dep/is_dep_4300_m.jsp";
        		break;
        	case IsDepWBMapping.IS_DEP_4310:
        		workbean = new IsDep1000WB();
        		((IsDep1000WB)workbean).is_dep_4310_l(req, res);
        		nextPage = "/jsp/is/dep/is_dep_4310_l.jsp";
        		break;	
        	case IsDepWBMapping.IS_DEP_4350:
        		workbean = new IsDep1000WB();
        		((IsDep1000WB)workbean).is_dep_4350_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        /********************************************************************************/    		
        	case IsDepWBMapping.IS_DEP_4500:
        		workbean = new IsDep1000WB();
        		((IsDep1000WB)workbean).is_dep_4500_m(req, res);
        		nextPage = "/jsp/is/dep/is_dep_4500_m.jsp";
        		break;
        		
        /********************************************************************************/           		
        	case IsDepWBMapping.IS_DEP_4600:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4600_m(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_4600_m.jsp";
	    		break;		
        	case IsDepWBMapping.IS_DEP_4610:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4610_l(req, res);
	    		nextPage = "/jsp/is/dep/is_dep_4610_l.jsp";
	    		break;	
        	case IsDepWBMapping.IS_DEP_4620:
        		workbean = new IsDep1000WB();
        		((IsDep1000WB)workbean).is_dep_4620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsDepWBMapping.IS_DEP_4630:
	    		workbean = new IsDep1000WB();
	    		((IsDep1000WB)workbean).is_dep_4630_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	        		
        		
        		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
