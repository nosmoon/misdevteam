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


package chosun.ciis.is.bas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.bas.wb.IsBas1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsBasServlet extends BaseServlet {

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
            String servletMappedUrl = "/is/bas/";
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
        	case IsBasWBMapping.IS_BAS_1000:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1000_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1000_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1010:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1010_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1010_l.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1020:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1020_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1020_l.jsp";
        		break;		
        	case IsBasWBMapping.IS_BAS_1030:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1040:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1100:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1100_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1100_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1110:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1110_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1110_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1120:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1120_s(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1120_s.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1130:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1140:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1140_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1140_l.jsp";
        		break;	        		
        	case IsBasWBMapping.IS_BAS_1200:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1200_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1200_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1210:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1210_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1210_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1220:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1300:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1300_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1300_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1310:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1310_s(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1310_s.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1315:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1315_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1400:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1400_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1400_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1410:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1410_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1410_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1500:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1500_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1500_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1510:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1510_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1510_l.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1520:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1520_s(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1520_s.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1530:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1600:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1600_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1600_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1610:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1610_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1610_l.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1700:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1700_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1700_m.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1710:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1710_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1710_l.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1800:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1800_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1800_m.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1810:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1810_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1810_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1820:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1820_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1820_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1830:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1830_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1900:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1900_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1900_m.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1910:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1910_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1910_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_1920:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1920_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_1930:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_1930_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_1930_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2000:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2000_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2000_m.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2010:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2010_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2010_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2020:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_2030:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2030_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2030_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2040:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2040_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2040_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2050:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_2100:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2100_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2100_m.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2110:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2110_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2110_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2120:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2120_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_2200:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2200_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2200_m.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2210:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2210_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2210_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2220:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_2300:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2300_m(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2300_m.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2310:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2310_l(req, res);
        		nextPage = "/jsp/is/bas/is_bas_2310_l.jsp";
        		break;	
        	case IsBasWBMapping.IS_BAS_2320:
        		workbean = new IsBas1000WB();
        		((IsBas1000WB)workbean).is_bas_2320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsBasWBMapping.IS_BAS_2400:
        		workbean = new IsBas1000WB();
				((IsBas1000WB)workbean).is_bas_2400_m(req, res);
				nextPage = "/jsp/is/bas/is_bas_2400_m.jsp";
				break;
        	case IsBasWBMapping.IS_BAS_2410:
        		workbean = new IsBas1000WB();
				((IsBas1000WB)workbean).is_bas_2410_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
