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


package chosun.ciis.sp.sal.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.sp.sal.wb.SpSal1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.sp.sal.servlet.SpSalWBMapping;
import chosun.ciis.sp.sal.wb.SpSal1000WB;

public class SpSalServlet extends BaseServlet {

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
            String servletMappedUrl = "/sp/sal/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SpSalServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SpSalServlet : process : nextPage : " + nextPage);
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
	        case SpSalWBMapping.SP_SAL_1010:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1010_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1010_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1020:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1020_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1030:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_1110:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1110_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1110_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1120:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1120_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1130:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1130_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_1200:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1200_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1200_m.jsp";
	    		break;	
        	case SpSalWBMapping.SP_SAL_1210:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1210_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1210_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1220:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1220_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1230:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1230_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_1310:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1310_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1310_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1320:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1320_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1330:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1330_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	/***********************************************************/	
	        case SpSalWBMapping.SP_SAL_1400:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1400_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1400_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1410:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1410_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1410_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1420:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1420_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1430:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1430_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_1500:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1500_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1500_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1510:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1510_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1510_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1520:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1520_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1530:
	    		//workbean = new SpSal1000WB();
	    		//((SpSal1000WB)workbean).sp_sal_1530_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1530_m.jsp";
	    		break;	   
	        case SpSalWBMapping.SP_SAL_1531:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1530_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1531_l.jsp";
	    		break;	 
	        case SpSalWBMapping.SP_SAL_1532:
	    		//workbean = new SpSal1000WB();
	    		//((SpSal1000WB)workbean).sp_sal_1530_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1532_m.jsp";
	    		break;	   
	        case SpSalWBMapping.SP_SAL_1533:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1530_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1533_l.jsp";
	    		break;	 
	        case SpSalWBMapping.SP_SAL_1540:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1540_a(req, res);
	        	nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	   
	        case SpSalWBMapping.SP_SAL_1560:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1560_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	 
	        case SpSalWBMapping.SP_SAL_1570:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1570_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	       		
	    	/***********************************************************/
        	case SpSalWBMapping.SP_SAL_1600:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1600_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1600_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1610:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1610_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1610_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1620:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1620_s(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1620_s.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1630:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1630_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
	        case SpSalWBMapping.SP_SAL_1640:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1640_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_1710:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1710_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1710_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1720:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1720_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1730:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1730_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_1800:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1800_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1800_m.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1810:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1810_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_1810_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_1820:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1820_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1825:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1825_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1830:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1830_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1835:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1835_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_1840:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_1840_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
    		/***********************************************************/
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2000:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2000_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2000_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2010:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2010_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2010_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2020:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2020_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2030:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2030_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2100:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2100_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2100_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2110:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2110_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2110_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2120:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2120_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2130:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2130_s(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2130_s.jsp";
	    		break;	
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2200:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2200_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2200_m.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2210:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2210_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2210_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2220:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2220_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2220_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2230:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2230_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2240:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2240_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2250:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2250_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2260:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2260_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2270:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2270_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2300:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2300_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2300_m.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2310:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2310_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2310_l.jsp";
	    		break;		
	        case SpSalWBMapping.SP_SAL_2320:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2320_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2320_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2330:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2330_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2330_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2340:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2340_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2350:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2350_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    	/***********************************************************/	
	        case SpSalWBMapping.SP_SAL_2400:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2400_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2400_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2410:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2410_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2410_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2420:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2420_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2420_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2430:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2430_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
	        case SpSalWBMapping.SP_SAL_2440:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2440_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2510:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2510_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2510_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2520:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2520_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2530:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2530_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2600:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2600_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2600_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2610:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2610_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2610_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2620:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2620_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2620_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2630:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2630_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2630_l.jsp";
	    		break;	
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2710:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2710_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2710_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2720:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2720_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2720_l.jsp";
	    		break;	    		
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2800:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2800_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2800_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_2810:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2810_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2810_l.jsp";
	    		break;	
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_2900:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2900_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2900_m.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_2910:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_2910_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_2910_l.jsp";
	    		break;		
    		/***********************************************************/
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3110:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3110_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3110_l.jsp";
	    		break;	
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3210:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3210_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3210_l.jsp";
	    		break;
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3310:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3310_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3310_l.jsp";
	    		break;	
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3400:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3400_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3400_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_3410:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3410_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3410_l.jsp";
	    		break;	
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3510:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3510_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3510_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3520:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3520_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3520_l.jsp";
	    		break;		
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3600:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3600_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3600_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_3610:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3610_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3610_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3620:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3620_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3620_l.jsp";
	    		break;		
	        case SpSalWBMapping.SP_SAL_3630:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3630_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
	        case SpSalWBMapping.SP_SAL_3640:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3640_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3650:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3650_a(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3650_a.jsp";
	    		break;		
    		/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3700:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3700_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3700_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_3710:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3710_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3710_l.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_3720:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3720_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_3730:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3730_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	    	/***********************************************************/
	        case SpSalWBMapping.SP_SAL_3800:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3800_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3800_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_3810:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3810_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3810_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3820:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3820_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3820_l.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3825:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3825_s(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3825_s.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3830:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3830_s(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3830_s.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3840:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3840_a(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3840_a.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3850:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3850_a(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3850_a.jsp";
	    		break;	
	        case SpSalWBMapping.SP_SAL_3860:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3860_a(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3860_a.jsp";
	    		break;	
	    	/***********************************************************/

	        case SpSalWBMapping.SP_SAL_3900:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3900_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3900_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_3910:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_3910_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_3910_l.jsp";
	    		break;		   
	    		/***********************************************************/

	        case SpSalWBMapping.SP_SAL_4000:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_4000_m(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_4000_m.jsp";
	    		break;
	        case SpSalWBMapping.SP_SAL_4010:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_4010_l(req, res);
	    		nextPage = "/jsp/sp/sal/sp_sal_4010_l.jsp";
	    		break;
	    		
	        case SpSalWBMapping.SP_SAL_4020:
	    		workbean = new SpSal1000WB();
	    		((SpSal1000WB)workbean).sp_sal_4020_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	    		
	    		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
