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


package chosun.ciis.is.sal.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.sal.wb.IsSal1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsSalServlet extends BaseServlet {

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
            String servletMappedUrl = "/is/sal/";
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
        	case IsSalWBMapping.IS_SAL_1000:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1000_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1000_m.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_1010:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1010_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1010_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1020:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1020_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1020_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1025:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1025_s(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1025_s.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1030:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1030_s(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1030_s.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1040:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1040_a(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1040_a.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1050:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1050_a(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1050_a.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1060:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1060_a(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1060_a.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_1100:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1100_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1100_m.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_1110:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1110_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1110_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1120:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1120_a(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1120_a.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1122:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1122_a(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1122_a.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1130:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1130_s(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1130_s.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_1200:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1200_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1200_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1201:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1201_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1201_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1210:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1210_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_1211:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1211_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1300:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1300_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1300_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1310:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1310_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1310_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1320:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1320_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1320_l.jsp";
        		break;		
        	case IsSalWBMapping.IS_SAL_1330:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1330_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1330_l.jsp";
        		break;		
        	case IsSalWBMapping.IS_SAL_1340:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1340_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1400:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1400_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1400_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1410:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1410_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1410_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1420:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1420_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1420_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1430:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1430_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1430_l.jsp";
        		break;		
        	case IsSalWBMapping.IS_SAL_1440:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1440_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1600:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1600_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1600_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1610:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1610_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1610_l.jsp";
        		break;		
        	case IsSalWBMapping.IS_SAL_1620:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        	
        	case IsSalWBMapping.IS_SAL_1630:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1630_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_1640:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1640_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1650:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1650_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_1660:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1660_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1800:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1800_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1800_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1810:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1810_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1810_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1900:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1900_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1900_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1910:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1910_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1910_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_1920:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_1920_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_1920_l.jsp";
        		break;
        	case IsSalWBMapping.IS_SAL_2100:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_2100_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_2100_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_2110:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_2110_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_2110_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_2200:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_2200_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_2200_m.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_2210:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_2210_l(req, res);
        		nextPage = "/jsp/is/sal/is_sal_2210_l.jsp";
        		break;	
        	case IsSalWBMapping.IS_SAL_2500:
        		workbean = new IsSal1000WB();
        		((IsSal1000WB)workbean).is_sal_2500_m(req, res);
        		nextPage = "/jsp/is/sal/is_sal_2500_m.jsp";
        		break;	
        		
        		
        		
        		
        		
        		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
