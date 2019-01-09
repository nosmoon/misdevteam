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


package chosun.ciis.co.cocd.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.cocd.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class COCocdServlet extends BaseServlet {

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
            String servletMappedUrl = "/co/cocd/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("COCocdServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            
            System.out.println("COCocdServlet : process : nextPage : " + nextPage);
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
     * COCocdWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
                                int pid) throws AppException, IOException, SQLException {
        String nextPage = null;
        BaseWB workbean = null;
        
        switch (pid) {
        	case COCocdWBMapping.CO_COCD_1000:
         		workbean = new CO_COCD_1000WB();
         		((CO_COCD_1000WB)workbean).co_cocd_1000_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1000_m.jsp";
        		break;       
        	case COCocdWBMapping.CO_COCD_1010:
         		workbean = new CO_COCD_1000WB();
         		((CO_COCD_1000WB)workbean).co_cocd_1010_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1010_l.jsp";
        		break;       
        	case COCocdWBMapping.CO_COCD_1020:
         		workbean = new CO_COCD_1000WB();
         		((CO_COCD_1000WB)workbean).co_cocd_1020_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1020_l.jsp";
        		break;      
        	case COCocdWBMapping.CO_COCD_1030:
         		workbean = new CO_COCD_1000WB();
         		((CO_COCD_1000WB)workbean).co_cocd_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;       
        		
        	case COCocdWBMapping.CO_COCD_1100:
         		System.out.println("CO_COCD_1100:::::::::::::");
        		workbean = new CO_COCD_1100WB();
         		((CO_COCD_1100WB)workbean).co_cocd_1100_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1100_m.jsp";
        		break;       
        	case COCocdWBMapping.CO_COCD_1110:
        		System.out.println("CO_COCD_1110:::::::::::::");
         		workbean = new CO_COCD_1100WB();
         		((CO_COCD_1100WB)workbean).co_cocd_1110_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1110_l.jsp";
        		break;       
        	case COCocdWBMapping.CO_COCD_1120:
         		workbean = new CO_COCD_1100WB();
         		((CO_COCD_1100WB)workbean).co_cocd_1120_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1120_l.jsp";
        		break;       
        		
        	case COCocdWBMapping.CO_COCD_1200:
         		workbean = new CO_COCD_1200WB();
         		((CO_COCD_1200WB)workbean).co_cocd_1200_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1200_m.jsp";
        		break;   
        	case COCocdWBMapping.CO_COCD_1210:
         		workbean = new CO_COCD_1200WB();
         		((CO_COCD_1200WB)workbean).co_cocd_1210_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1210_l.jsp";
        		break;  
        	case COCocdWBMapping.CO_COCD_1250:
         		workbean = new CO_COCD_1200WB();
         		((CO_COCD_1200WB)workbean).co_cocd_1250_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1250_m.jsp";
        		break;
        	case COCocdWBMapping.CO_COCD_1300:
        		System.out.println("CO_COCD_1300::::::::::::::");
         		workbean = new CO_COCD_1300WB();
         		((CO_COCD_1300WB)workbean).co_cocd_1300_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1300_m.jsp";
        		break;
        	case COCocdWBMapping.CO_COCD_1310:
        		System.out.println("CO_COCD_1310::::::::::::::");
         		workbean = new CO_COCD_1300WB();
         		((CO_COCD_1300WB)workbean).co_cocd_1310_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1310_l.jsp";
        		break;
        	case COCocdWBMapping.CO_COCD_1320:
        		System.out.println("CO_COCD_1320::::::::::::::");
         		workbean = new CO_COCD_1300WB();
         		((CO_COCD_1300WB)workbean).co_cocd_1320_i(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1320_i.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_1330:
        		System.out.println("CO_COCD_1330::::::::::::::");
         		workbean = new CO_COCD_1300WB();
         		((CO_COCD_1300WB)workbean).co_cocd_1330_u(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1330_u.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_1340:
        		System.out.println("CO_COCD_1340::::::::::::::");
         		workbean = new CO_COCD_1300WB();
         		((CO_COCD_1300WB)workbean).co_cocd_1340_d(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1340_d.jsp";
        		break;
        	case COCocdWBMapping.CO_COCD_1350:
        		System.out.println("CO_COCD_1350::::::::::::::");
         		workbean = new CO_COCD_1300WB();
         		((CO_COCD_1300WB)workbean).co_cocd_1350_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1350_m.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_1400:
         		workbean = new CO_COCD_1400WB();
         		((CO_COCD_1400WB)workbean).co_cocd_1400_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1400_m.jsp";
        		break;   
        	case COCocdWBMapping.CO_COCD_1410:
         		workbean = new CO_COCD_1400WB();
         		((CO_COCD_1400WB)workbean).co_cocd_1410_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1410_l.jsp";
        		break;          		
        	case COCocdWBMapping.CO_COCD_1600:
        		System.out.println("CO_COCD_1600::::::::::::::");
         		workbean = new CO_COCD_1600WB();
         		((CO_COCD_1600WB)workbean).co_cocd_1600_m(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1600_m.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_1610:
        		System.out.println("CO_COCD_1610::::::::::::::");
         		workbean = new CO_COCD_1600WB();
         		((CO_COCD_1600WB)workbean).co_cocd_1610_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1610_l.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_1620:
        		System.out.println("CO_COCD_1620::::::::::::::");
         		workbean = new CO_COCD_1600WB();
         		((CO_COCD_1600WB)workbean).co_cocd_1620_a(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1620_a.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_1640:
        		System.out.println("CO_COCD_1640::::::::::::::");
         		workbean = new CO_COCD_1600WB();
         		((CO_COCD_1600WB)workbean).co_cocd_1640_l(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1640_l.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_1650:
        		System.out.println("CO_COCD_1650::::::::::::::");
         		workbean = new CO_COCD_1600WB();
         		((CO_COCD_1600WB)workbean).co_cocd_1650_a(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_1650_a.jsp";
        		break;	
        	case COCocdWBMapping.CO_COCD_2000:
         		workbean = new CO_COCD_2000WB();
         		((CO_COCD_2000WB)workbean).CO_COCD_2000_M(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_2000_m.jsp";
        		break;    
        	case COCocdWBMapping.CO_COCD_2010:
         		workbean = new CO_COCD_2000WB();
         		((CO_COCD_2000WB)workbean).CO_COCD_2010_S(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_2010_s.jsp";
        		break;    
        	case COCocdWBMapping.CO_COCD_2020:
         		workbean = new CO_COCD_2000WB();
         		((CO_COCD_2000WB)workbean).CO_COCD_2020_S(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_2020_s.jsp";
        		break;           		
        	case COCocdWBMapping.CO_COCD_2030:
         		workbean = new CO_COCD_2000WB();
         		((CO_COCD_2000WB)workbean).CO_COCD_2030_S(req, res);
        		nextPage = "/jsp/co/cocd/co_cocd_2030_s.jsp";
        		break;       		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
