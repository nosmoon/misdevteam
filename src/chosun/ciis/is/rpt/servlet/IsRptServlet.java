/***************************************************************************************************
 * ���ϸ� : 
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.is.rpt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.rpt.wb.IsRpt1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsRptServlet extends BaseServlet {

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
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
            String servletMappedUrl = "/is/rpt/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("IsRptServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("IsRptServlet : process : nextPage : " + nextPage);
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
     * PilotWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws Exception{
        String nextPage = null;
        BaseWB workbean = null;
        switch (pid) {
	        case IsRptWBMapping.IS_RPT_1000:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1000_m(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1000_m.jsp";
	    		break;  
        	case IsRptWBMapping.IS_RPT_1010:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1010_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1010_l.jsp";
	    		break;    	
	        case IsRptWBMapping.IS_RPT_1020:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1020_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1020_l.jsp";
	    		break;
	        case IsRptWBMapping.IS_RPT_1030:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1030_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1030_l.jsp";
	    		break;
	        case IsRptWBMapping.IS_RPT_1040:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1040_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1040_l.jsp";
	    		break;
	        case IsRptWBMapping.IS_RPT_1050:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1050_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1050_l.jsp";
	    		break; 
	        case IsRptWBMapping.IS_RPT_1060:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1060_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1060_l.jsp";
	    		break; 
	        case IsRptWBMapping.IS_RPT_1210:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1210_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1210_l.jsp";
	    		break;    	
	        case IsRptWBMapping.IS_RPT_1220:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1220_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1220_l.jsp";
	    		break;    	
	        case IsRptWBMapping.IS_RPT_1230:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1220_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1230_l.jsp";
	    		break;    	
	        case IsRptWBMapping.IS_RPT_1240:
	    		workbean = new IsRpt1000WB();
	    		((IsRpt1000WB)workbean).is_rpt_1220_l(req, res);
	    		nextPage = "/jsp/is/rpt/is_rpt_1240_l.jsp";
	    		break;    	
	        case IsRptWBMapping.IS_RPT_1110:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1110_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1110_l.jsp";
        		break;
        	case IsRptWBMapping.IS_RPT_1310:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1310_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1310_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_1410:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1410_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1410_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_1420:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1420_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1420_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_1600:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1600_m(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1600_m.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_1610:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1610_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1610_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_1710:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1710_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1710_l.jsp";
        		break;		
        	case IsRptWBMapping.IS_RPT_1720:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1720_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1720_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_1810:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1810_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1810_l.jsp";
        		break;		
        	case IsRptWBMapping.IS_RPT_1910:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_1910_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_1910_l.jsp";
        		break;		
        	case IsRptWBMapping.IS_RPT_2010:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2010_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2010_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_2020:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2020_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2020_l.jsp";
        		break;		
        	case IsRptWBMapping.IS_RPT_2310:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2310_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2310_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_2320:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2320_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2320_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_2410:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2410_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2410_l.jsp";
        		break;		
        	case IsRptWBMapping.IS_RPT_2420:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2420_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2420_l.jsp";
        		break;	
        	case IsRptWBMapping.IS_RPT_2500:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2500_m(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2500_m.jsp";
        		break;		
        	case IsRptWBMapping.IS_RPT_2510:
        		workbean = new IsRpt1000WB();
        		((IsRpt1000WB)workbean).is_rpt_2510_l(req, res);
        		nextPage = "/jsp/is/rpt/is_rpt_2510_l.jsp";
        		break;		
        		
        		
        		
        		
        		
        		
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
	        
        return nextPage;
    }
 
}
