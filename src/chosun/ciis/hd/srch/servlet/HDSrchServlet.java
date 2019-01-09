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


package chosun.ciis.hd.srch.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.srch.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDSrchServlet extends BaseServlet {

 
    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
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
		//System.out.println(" HDJobServlet.java ");
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/hd/srch/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDSrchServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDSrchServlet : process : nextPage : " + nextPage);
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

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
            nextPage);
        rd.forward(req, res);
    }

    /**
     * SEBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
                                int pid) throws AppException, IOException {
        String nextPage = null;
        
        HD_SRCH_1000WB wb = null;
       
        switch (pid) {
		case HDSrchWBMapping.HD_SRCH_1000:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1000_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1000_l.jsp";
			break;
		case HDSrchWBMapping.HD_SRCH_1010:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1010_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1010_l.jsp";
			break;	
		case HDSrchWBMapping.HD_SRCH_1030:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1030_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1030_l.jsp";
			break;
		case HDSrchWBMapping.HD_SRCH_1020:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1020_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1020_l.jsp";
			break;
		case HDSrchWBMapping.HD_SRCH_1200:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1200_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1200_l.jsp";
			break;			
		case HDSrchWBMapping.HD_SRCH_1300_L:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1300_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1300_l.jsp";
			break;		
		case HDSrchWBMapping.HD_SRCH_1300_100_L:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1300_100_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1300_100_l.jsp";
			break;		
		case HDSrchWBMapping.HD_SRCH_1400:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1400_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1400_l.jsp";
			break;	
		case HDSrchWBMapping.HD_SRCH_1400_100:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1400_100_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1400_100_l.jsp";
			break;	
		case HDSrchWBMapping.HD_SRCH_1500:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1500_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1500_l.jsp";
			break;	
		case HDSrchWBMapping.HD_SRCH_1600:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1600_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1600_l.jsp";	
			break;
		case HDSrchWBMapping.HD_SRCH_1601_L:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1601_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1601_l.jsp";
			break;
		case HDSrchWBMapping.HD_SRCH_1602:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1602_m(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1602_m.jsp";
			break; 
		case HDSrchWBMapping.HD_SRCH_1700_L:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1700_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1700_l.jsp";
			break;	
		case HDSrchWBMapping.HD_SRCH_1800:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1800_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1800_l.jsp";
			break;
		case HDSrchWBMapping.HD_SRCH_1100:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1100_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1100_l.jsp";
			break;
		case HDSrchWBMapping.HD_SRCH_1101:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_1101_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_1101_l.jsp";
			break;			

		case HDSrchWBMapping.HD_SRCH_2000:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_2000_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_2000_l.jsp";
			break;
			
		case HDSrchWBMapping.HD_SRCH_3000:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_3000_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_3000_l.jsp";
			break;
		
	    // tv조선 월말보고서  		 
			
	    case HDSrchWBMapping.HD_SRCH_5101:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5101_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5101_l.jsp";
			break;
	    case HDSrchWBMapping.HD_SRCH_5111:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5111_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5111_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5112:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5112_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5114:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5114_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5114_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5121:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5121_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5121_l.jsp";
			break;  
			
		case HDSrchWBMapping.HD_SRCH_5122:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5122_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5123:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5123_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5123_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5131:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5131_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5131_l.jsp";
			break;  
			
		case HDSrchWBMapping.HD_SRCH_5132:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5132_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5133:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5133_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5133_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5211:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5211_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5211_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5212:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5212_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5213:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5213_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5213_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5221:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5221_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5221_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5222:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5222_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5223:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5223_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5223_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5231:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5231_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5231_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5232:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5232_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5233:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5233_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5233_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5311:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5311_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5311_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5312:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5312_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5313:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5313_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5313_l.jsp";
			break;
			
			
	    case HDSrchWBMapping.HD_SRCH_5321:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5321_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5321_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5322:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5322_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5323:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5323_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5323_l.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5332:
	 			wb = new HD_SRCH_1000WB();
	 			((HD_SRCH_1000WB)wb).hd_srch_5332_a(req, res);
	 			nextPage = "/common/jsp/resultMsg.jsp";
	 			break;
	 			
	    case HDSrchWBMapping.HD_SRCH_5333:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5333_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5333_l.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5411:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5411_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5411_l.jsp";
			break;

			
	    case HDSrchWBMapping.HD_SRCH_5412:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5412_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5413:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5413_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5413_l.jsp";
			break;

	    case HDSrchWBMapping.HD_SRCH_5511:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5511_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5511_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5512:
				wb = new HD_SRCH_1000WB();
				((HD_SRCH_1000WB)wb).hd_srch_5512_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

	    case HDSrchWBMapping.HD_SRCH_5513:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5513_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5513_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5521:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5521_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5521_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5522:
				wb = new HD_SRCH_1000WB();
				((HD_SRCH_1000WB)wb).hd_srch_5522_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

	    case HDSrchWBMapping.HD_SRCH_5523:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5523_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5523_l.jsp";
			break;
			
				
	    case HDSrchWBMapping.HD_SRCH_5531:
			wb = new HD_SRCH_1000WB();
			((HD_SRCH_1000WB)wb).hd_srch_5531_l(req, res);
			nextPage = "/jsp/hd/srch/hd_srch_5531_l.jsp";
			break;
			
	    case HDSrchWBMapping.HD_SRCH_5532:
				wb = new HD_SRCH_1000WB();
				((HD_SRCH_1000WB)wb).hd_srch_5532_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
	    case HDSrchWBMapping.HD_SRCH_5533:
				wb = new HD_SRCH_1000WB();
				((HD_SRCH_1000WB)wb).hd_srch_5533_l(req, res);
				nextPage = "/jsp/hd/srch/hd_srch_5533_l.jsp";
				break;
				
			
	    case HDSrchWBMapping.HD_SRCH_5541:
				wb = new HD_SRCH_1000WB();
				((HD_SRCH_1000WB)wb).hd_srch_5541_l(req, res);
				nextPage = "/jsp/hd/srch/hd_srch_5541_l.jsp";
				break; 
			
	    case HDSrchWBMapping.HD_SRCH_5542:
				wb = new HD_SRCH_1000WB();
				((HD_SRCH_1000WB)wb).hd_srch_5542_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
	    case HDSrchWBMapping.HD_SRCH_5543:
				wb = new HD_SRCH_1000WB();
				((HD_SRCH_1000WB)wb).hd_srch_5543_l(req, res);
				nextPage = "/jsp/hd/srch/hd_srch_5543_l.jsp";
				break;
				
				
	  

		default:
			throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
	    }

        
        System.out.println("nextPage="+nextPage);
        return nextPage;
    }
}
