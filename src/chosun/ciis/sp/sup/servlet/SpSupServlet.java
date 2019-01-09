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


package chosun.ciis.sp.sup.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.sp.sup.wb.SpSup1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.sp.sup.servlet.SpSupWBMapping;
import chosun.ciis.sp.sup.wb.SpSup1000WB;

public class SpSupServlet extends BaseServlet {

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
            String servletMappedUrl = "/sp/sup/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SpSupServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SpSupServlet : process : nextPage : " + nextPage);
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
	        case SpSupWBMapping.SP_SUP_1000:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1000_m(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1000_m.jsp";
	    		break;
        	case SpSupWBMapping.SP_SUP_1010:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1010_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1010_l.jsp";
	    		break;
        	case SpSupWBMapping.SP_SUP_1015:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1015_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1015_l.jsp";
	    		break;
	        case SpSupWBMapping.SP_SUP_1020:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1020_s(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1020_s.jsp";	    		
	    		break;
	        case SpSupWBMapping.SP_SUP_1030:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        
        		/******************************************************************/	
	        case SpSupWBMapping.SP_SUP_1110:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1110_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1110_l.jsp";
	    		break;
	        case SpSupWBMapping.SP_SUP_1120:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1120_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1120_l.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1130:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1130_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1130_l.jsp";
	    		break;
	    		/******************************************************************/	
	        case SpSupWBMapping.SP_SUP_1200:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1200_m(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1200_m.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1210:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1210_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1210_l.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1220:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1220_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1220_l.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1230:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1230_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1230_l.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1240:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1240_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		/******************************************************************/	
	    		
	        case SpSupWBMapping.SP_SUP_1300:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1300_m(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1300_m.jsp";
	    		break;
	        case SpSupWBMapping.SP_SUP_1310:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1310_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1310_l.jsp";
	    		break;
	        case SpSupWBMapping.SP_SUP_1320:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1320_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        		/******************************************************************/	
	        case SpSupWBMapping.SP_SUP_1400:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1400_m(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1400_m.jsp";
	    		break;
	        case SpSupWBMapping.SP_SUP_1410:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1410_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1410_l.jsp";
	    		break;
	        case SpSupWBMapping.SP_SUP_1420:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1420_s(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1420_s.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1430:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1430_s(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1430_s.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1440:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1440_a(req, res);
	    		//nextPage = "/common/jsp/resultMsg.jsp";
	    		nextPage = "/jsp/sp/sup/sp_sup_1440_a.jsp";
	    		break;		
	    		
	    		/******************************************************************/	
	    		
	        case SpSupWBMapping.SP_SUP_1510:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1510_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1510_l.jsp";
	    		break;
	    		
	    		/******************************************************************/	
	    		
	        case SpSupWBMapping.SP_SUP_1600:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1600_m(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1600_m.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1610:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1610_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1610_l.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1620:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1620_s(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1620_s.jsp";
	    		break;
	        case SpSupWBMapping.SP_SUP_1630:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1630_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	    		
	    		
	        case SpSupWBMapping.SP_SUP_1700:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1700_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1701:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1701_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1701_l.jsp";
	    		break;	
	        case SpSupWBMapping.SP_SUP_1702:
	    		workbean = new SpSup1000WB();
	    		((SpSup1000WB)workbean).sp_sup_1702_l(req, res);
	    		nextPage = "/jsp/sp/sup/sp_sup_1702_l.jsp";
	    		break;
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
