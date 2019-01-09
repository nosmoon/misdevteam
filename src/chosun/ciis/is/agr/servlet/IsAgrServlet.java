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


package chosun.ciis.is.agr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.agr.wb.IsAgr1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsAgrServlet extends BaseServlet {

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
            String servletMappedUrl = "/is/agr/";
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
        	case IsAgrWBMapping.IS_AGR_1000:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1000_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1000_m.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1010:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1010_s(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1010_s.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1015:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1015_a(req, res);
        		//nextPage = "/common/jsp/resultMsg.jsp";
        		nextPage = "/jsp/is/agr/is_agr_1015_a.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_1030:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1030_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1030_l.jsp";
        		break;        		
        	case IsAgrWBMapping.IS_AGR_1031:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1031_s(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1031_s.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1032:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1032_s(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1032_s.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1040:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1040_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1040_l.jsp";
        		break; 
    
        	/******************************************************************/ 		
        	
        	case IsAgrWBMapping.IS_AGR_1100:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1100_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1100_m.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1110:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1110_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1110_l.jsp";
        		break;	
        	
        	/******************************************************************/
        		
        	case IsAgrWBMapping.IS_AGR_1200:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1200_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1200_m.jsp";
        		break;	
       
       		/******************************************************************/		
        	
        	case IsAgrWBMapping.IS_AGR_1310:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1310_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1310_l.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1320:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1320_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1320_l.jsp";
        		break;
        		
       		/******************************************************************/ 		
        		
        	case IsAgrWBMapping.IS_AGR_1400:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1400_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1400_m.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1410:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1410_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1410_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_1420:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1420_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1420_l.jsp";
        		break;	
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_1510:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1510_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1510_l.jsp";
        		break;	
        		
       		/******************************************************************/ 		
        		
        	case IsAgrWBMapping.IS_AGR_1600:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1600_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1600_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_1610:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1610_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1610_l.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_1620:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1620_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1620_l.jsp";
        		break;		
        		
       		/******************************************************************/  		
        		
        	case IsAgrWBMapping.IS_AGR_1700:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1700_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1700_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_1710:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1710_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1710_l.jsp";
        		break;		
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_1800:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1800_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1800_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_1810:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1810_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1810_l.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_1820:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1820_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1820_l.jsp";
        		break;
        	case IsAgrWBMapping.IS_AGR_1830:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1830_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1830_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_1840:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1840_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1840_l.jsp";
        		break;	
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_1900:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1900_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1900_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_1910:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1910_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1910_l.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_1920:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1920_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1920_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_1930:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1930_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1930_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_1940:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_1940_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_1940_l.jsp";
        		break;	
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_2000:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2000_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2000_m.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_2010:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2010_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2010_l.jsp";
        		break;		
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_2100:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2100_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2100_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2110:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2110_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2110_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_2120:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2120_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2120_l.jsp";
        		break;		
        		
        	/******************************************************************/	
        		
        	case IsAgrWBMapping.IS_AGR_2200:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2200_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2200_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2210:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2210_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2210_l.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2220:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2220_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2220_l.jsp";
        		break;		
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_2300:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2300_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2300_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2310:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2310_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2310_l.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2320:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2320_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2320_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_2330:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2330_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2330_l.jsp";
        		break;	
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_2400:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2400_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2400_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2410:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2410_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2410_l.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2420:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2420_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2420_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_2430:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2430_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2430_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_2440:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2440_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2440_l.jsp";
        		break;	
        		
        	/******************************************************************/	
        		
        	case IsAgrWBMapping.IS_AGR_2610:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2610_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2610_l.jsp";
        		break;		
        		
        	/******************************************************************/		
        		
        	case IsAgrWBMapping.IS_AGR_2700:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2700_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2700_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2710:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2710_s(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2710_s.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2715:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2715_a(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2715_a.jsp";
        		break;		
        		
       		/******************************************************************/ 		
        		
        	case IsAgrWBMapping.IS_AGR_2800:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2800_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2800_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2810:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2810_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2810_l.jsp";
        		break;	
        		
       		/******************************************************************/  		
        		
        	case IsAgrWBMapping.IS_AGR_2900:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2900_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2900_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_2910:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2910_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_2910_l.jsp";
        		break;	
        	case IsAgrWBMapping.IS_AGR_2920:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_2920_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;		
        		
       		/******************************************************************/ 		
        		
        	case IsAgrWBMapping.IS_AGR_3100:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_3100_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_3100_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_3110:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_3110_s(req, res);
        		nextPage = "/jsp/is/agr/is_agr_3110_s.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_3115:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_3115_a(req, res);
        		nextPage = "/jsp/is/agr/is_agr_3115_a.jsp";
        		break;	
        		
        	/******************************************************************/	
        		
        	case IsAgrWBMapping.IS_AGR_3200:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_3200_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_3200_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_3210:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_3210_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_3210_l.jsp";
        		break;		
        	/******************************************************************/	
        		
        	case IsAgrWBMapping.IS_AGR_3300:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_3300_m(req, res);
        		nextPage = "/jsp/is/agr/is_agr_3300_m.jsp";
        		break;		
        	case IsAgrWBMapping.IS_AGR_3310:
        		workbean = new IsAgr1000WB();
        		((IsAgr1000WB)workbean).is_agr_3310_l(req, res);
        		nextPage = "/jsp/is/agr/is_agr_3310_l.jsp";
        		break;		
        	/******************************************************************/	        		
        		
        		
        		
        		
        	
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
