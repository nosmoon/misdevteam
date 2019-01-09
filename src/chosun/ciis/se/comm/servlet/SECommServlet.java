/***************************************************************************************************
 * 파일명 :   SECommServlet.java
 * 기능 :   	 판매 공통 코드 서블릿
 * 작성일자 : 2009.01.15 
 * 작성자 :   배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.se.comm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.se.comm.wb.*;

public class SECommServlet extends BaseServlet {


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
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/se/comm/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SECommServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SECommServlet : process : nextPage : " + nextPage);
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
        BaseWB workbean = null;
        SE_COMM_1100WB wb1100 = null;
        SE_COMM_1200WB wb1200 = null;
        SE_COMM_2000WB wb2000 = null;
        SE_COMM_2100WB wb2100 = null;
        SE_COMM_2200WB wb2200 = null;
        SE_COMM_2300WB wb2300 = null;
        SE_COMM_2400WB wb2400 = null;
        SE_COMM_2500WB wb2500 = null;
        SE_COMM_2600WB wb2600 = null;
        
        switch (pid) {
			//담당자 코드검색 및 팝업
			case SECommWBMapping.SE_COMM_1005:
				workbean = new SE_COMM_1000WB();
				((SE_COMM_1000WB)workbean).se_comm_1005_s(req, res);
				nextPage = "/jsp/se/comm/se_comm_1005_s.jsp";
				break;
        	case SECommWBMapping.SE_COMM_1010:
        		workbean = new SE_COMM_1000WB();
        		((SE_COMM_1000WB)workbean).se_comm_1010_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_1010_l.jsp";
        		break;  
        	//지국 코드검색 및 팝업       
			case SECommWBMapping.SE_COMM_1100:
				workbean = new SE_COMM_1100WB();
				((SE_COMM_1100WB)workbean).se_comm_1100_m(req, res);
				nextPage = "/jsp/se/comm/se_comm_1100_m.jsp";
				break;
			case SECommWBMapping.SE_COMM_1105:
				workbean = new SE_COMM_1100WB();
				((SE_COMM_1100WB)workbean).se_comm_1105_s(req, res);
				nextPage = "/jsp/se/comm/se_comm_1105_s.jsp";
				break;
        	case SECommWBMapping.SE_COMM_1110:
        		workbean = new SE_COMM_1100WB();
        		((SE_COMM_1100WB)workbean).se_comm_1110_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_1110_l.jsp";
        		break;  
        	case SECommWBMapping.SE_COMM_1120:
        		workbean = new SE_COMM_1100WB();
        		((SE_COMM_1100WB)workbean).se_comm_1120_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_1120_l.jsp";
        		break;  
        		
        	case SECommWBMapping.SE_COMM_1210:
        		wb1200 = new SE_COMM_1200WB();
        		wb1200.se_comm_1210_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_1210_l.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_1220:
        		wb1200 = new SE_COMM_1200WB();
        		wb1200.se_comm_1220_s(req, res);
        		nextPage = "/jsp/se/comm/se_comm_1220_s.jsp";
        		break;
        	//지국장 1건검색 및 팝업	
			case SECommWBMapping.SE_COMM_1305:
				workbean = new SE_COMM_1300WB();
				((SE_COMM_1300WB)workbean).se_comm_1305_s(req, res);
				nextPage = "/jsp/se/comm/se_comm_1305_s.jsp";
				break;
        	case SECommWBMapping.SE_COMM_1310:
        		workbean = new SE_COMM_1300WB();
        		((SE_COMM_1300WB)workbean).se_comm_1310_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_1310_l.jsp";
        		break;  
        	//시도구분 1건검색 및 팝업(공통코드의 1건검색 공통으로 사용)
			case SECommWBMapping.SE_COMM_1405:
				workbean = new SE_COMM_1400WB();
				((SE_COMM_1400WB)workbean).se_comm_1405_s(req, res);
				nextPage = "/jsp/se/comm/se_comm_1405_s.jsp";
				break;
        	case SECommWBMapping.SE_COMM_1410:
        		workbean = new SE_COMM_1400WB();
        		((SE_COMM_1400WB)workbean).se_comm_1410_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_1410_l.jsp";
        		break;  
        	//담당평가팝업
			case SECommWBMapping.SE_COMM_1510:
				workbean = new SE_COMM_1500WB();
				((SE_COMM_1500WB)workbean).se_comm_1510_l(req, res);
				nextPage = "/jsp/se/comm/se_comm_1510_l.jsp";
				break;	
			//예수전표조회팝업
			case SECommWBMapping.SE_COMM_1610:
				workbean = new SE_COMM_1600WB();
				((SE_COMM_1600WB)workbean).se_comm_1610_l(req, res);
				nextPage = "/jsp/se/comm/se_comm_1610_l.jsp";
				break;	
			//계산서발행내역 팝업	
			case SECommWBMapping.SE_COMM_1710:
				workbean = new SE_COMM_1700WB();
				((SE_COMM_1700WB)workbean).se_comm_1710_l(req, res);
				nextPage = "/jsp/se/comm/se_comm_1710_l.jsp";
				break;
        		
        	case SECommWBMapping.SE_COMM_2000:
        		wb2000 = new SE_COMM_2000WB();
        		wb2000.se_comm_2000_m(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2000_m.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2010:
        		wb2000 = new SE_COMM_2000WB();
        		wb2000.se_comm_2010_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2010_l.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2020:
        		wb2000 = new SE_COMM_2000WB();
        		wb2000.se_comm_2020_s(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2020_s.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2100:
        		wb2100 = new SE_COMM_2100WB();
        		wb2100.se_comm_2100_m(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2100_m.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2110:
        		wb2100 = new SE_COMM_2100WB();
        		wb2100.se_comm_2110_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2110_l.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2200:
        		wb2200 = new SE_COMM_2200WB();
        		wb2200.se_comm_2200_m(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2200_m.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2210:
        		wb2200 = new SE_COMM_2200WB();
        		wb2200.se_comm_2210_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2210_l.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2310:
        		wb2300 = new SE_COMM_2300WB();
        		wb2300.se_comm_2310_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2310_l.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2320:
        		wb2300 = new SE_COMM_2300WB();
        		wb2300.se_comm_2310_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2320_s.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2400:
        		wb2400 = new SE_COMM_2400WB();
        		wb2400.se_comm_2400_m(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2400_m.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2410:
        		wb2400 = new SE_COMM_2400WB();
        		wb2400.se_comm_2410_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2410_l.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2510:
        		wb2500 = new SE_COMM_2500WB();
        		wb2500.se_comm_2510_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2510_l.jsp";
        		break;
        	case SECommWBMapping.SE_COMM_2610:
        		wb2600 = new SE_COMM_2600WB();
        		wb2600.se_comm_2610_l(req, res);
        		nextPage = "/jsp/se/comm/se_comm_2610_l.jsp";
        		break;        		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
