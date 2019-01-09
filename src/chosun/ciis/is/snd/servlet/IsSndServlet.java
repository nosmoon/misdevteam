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


package chosun.ciis.is.snd.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.snd.wb.IsSnd1000WB;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class IsSndServlet extends BaseServlet {

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
            String servletMappedUrl = "/is/snd/";
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
        	case IsSndWBMapping.IS_SND_1000:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1000_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1000_m.jsp";
        		break;
        	case IsSndWBMapping.IS_SND_1010:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1010_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1010_l.jsp";
        		break;
        	case IsSndWBMapping.IS_SND_1020:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1100:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1100_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1100_m.jsp";
        		break;
        	case IsSndWBMapping.IS_SND_1110:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1110_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1110_l.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1120:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1120_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1120_l.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1200:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1200_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1200_m.jsp";
        		break;
        	case IsSndWBMapping.IS_SND_1210:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1210_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1210_l.jsp";
        		break;
        	case IsSndWBMapping.IS_SND_1220:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1220_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1220_l.jsp";
        		break;
        	case IsSndWBMapping.IS_SND_1230:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1230_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1230_l.jsp";
        		break;
        	case IsSndWBMapping.IS_SND_1240:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1240_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1240_l.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1250:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1250_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1250_l.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1255:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1255_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1255_l.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1260:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1260_a(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1260_a.jsp";
        		break;	
        		
        		
        		
        		
        		
        		
        		
        	
        	
        	
        	case IsSndWBMapping.IS_SND_1300:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1300_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1300_m.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1310:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1310_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1310_l.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1400:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1400_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1400_m.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1410:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1410_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1410_l.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1420:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1420_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1420_l.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1430:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1430_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1430_l.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1500:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1500_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1500_m.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1510:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1510_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1510_l.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1520:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1520_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1520_l.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1530:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1700:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1700_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1700_m.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1710:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1710_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1710_l.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1720:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1720_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
        	case IsSndWBMapping.IS_SND_1800:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1800_m(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1800_m.jsp";
        		break;		
        	case IsSndWBMapping.IS_SND_1810:
        		workbean = new IsSnd1000WB();
        		((IsSnd1000WB)workbean).is_snd_1810_l(req, res);
        		nextPage = "/jsp/is/snd/is_snd_1810_l.jsp";
        		break;		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}
