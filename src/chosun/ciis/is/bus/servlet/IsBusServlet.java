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


package chosun.ciis.is.bus.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.bus.wb.IsBus1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsBusServlet extends BaseServlet {

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
            String servletMappedUrl = "/is/bus/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("IsBusServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("IsBusServlet : process : nextPage : " + nextPage);
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
        	case IsBusWBMapping.IS_BUS_1000:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1000_m(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1000_m.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1010:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1010_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1010_l.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1020:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1020_s(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1020_s.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1030:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1030_a(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1030_a.jsp";
        		break;
        
        	/*****************************************************/	
        		
        	case IsBusWBMapping.IS_BUS_1100:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1100_m(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1100_m.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1110:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1110_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1110_l.jsp";
        		break;		
        
        	/*****************************************************/	 	
        		
        	case IsBusWBMapping.IS_BUS_1210:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1210_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1210_l.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1220:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        
        	/*****************************************************/		
        		
        	case IsBusWBMapping.IS_BUS_1300:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1300_m(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1300_m.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1310:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1310_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1310_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1320:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1330:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1330_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1330_l.jsp";
        		break;	
        	
        	/*****************************************************/	
        		
        	case IsBusWBMapping.IS_BUS_1410:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1410_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1410_l.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1420:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1420_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1420_l.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1430:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1430_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1430_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1440:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1440_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1440_l.jsp";
        		break;		
        	case IsBusWBMapping.IS_BUS_1450:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1450_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1450_l.jsp";
        		break;		
        	case IsBusWBMapping.IS_BUS_1460:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1460_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1460_l.jsp";
        		break;		
        		
        	/*****************************************************/	
        	
        	case IsBusWBMapping.IS_BUS_1510:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1510_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1510_l.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1520:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1520_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1520_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1530:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1530_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1530_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1540:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1540_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1540_l.jsp";
        		break;		
        	case IsBusWBMapping.IS_BUS_1550:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1550_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1550_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1560:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1560_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1560_l.jsp";
        		break;		
        	case IsBusWBMapping.IS_BUS_1570:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1570_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1570_l.jsp";
        		break;	
        	
           	/*****************************************************/        	
        	
        	case IsBusWBMapping.IS_BUS_1600:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1600_m(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1600_m.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1610:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1610_s(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1610_s.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1620:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;		
        
        	/*****************************************************/	
        		
        	case IsBusWBMapping.IS_BUS_1710:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1710_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1710_l.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1720:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1720_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1720_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1730:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1730_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1730_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1740:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1740_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1740_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1750:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1750_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1750_l.jsp";
        		break;	
        	
        	/*****************************************************/	
        	
        	case IsBusWBMapping.IS_BUS_1800:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1800_m(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1800_m.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1810:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1810_s(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1810_s.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1820:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;		
        		
        	/*****************************************************/	
        		
        	case IsBusWBMapping.IS_BUS_1900:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1900_m(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1900_m.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_1910:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1910_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_1910_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_1920:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_1920_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	
        	/*****************************************************/	
        		
        	case IsBusWBMapping.IS_BUS_2000:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2000_m(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2000_m.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_2010:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2010_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2010_l.jsp";
        		break;
        		
        	/*****************************************************/		
    		
        	case IsBusWBMapping.IS_BUS_2110:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2110_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2110_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_2120:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2120_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2120_l.jsp";
        		break;
        	case IsBusWBMapping.IS_BUS_2130:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2130_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2130_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_2135:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2135_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2135_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_2140:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2140_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2140_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_2145:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2145_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2145_l.jsp";
        		break;	
        	/*****************************************************/	
    		
        	case IsBusWBMapping.IS_BUS_2210:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2210_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2210_l.jsp";
        		break;	
        	case IsBusWBMapping.IS_BUS_2220:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2220_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2220_l.jsp";
        		break;	
        	/*****************************************************/
    	
        	case IsBusWBMapping.IS_BUS_2310:
        		workbean = new IsBus1000WB();
        		((IsBus1000WB)workbean).is_bus_2310_l(req, res);
        		nextPage = "/jsp/is/bus/is_bus_2310_l.jsp";
        		break;	
        	/*****************************************************/
    	
        		
        	/*****************************************************/
        		
        		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
