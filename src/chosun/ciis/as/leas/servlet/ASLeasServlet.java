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


package chosun.ciis.as.leas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.leas.wb.AS_LEAS_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class ASLeasServlet extends BaseServlet {


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
            String servletMappedUrl = "/as/leas/";
            iPid = extractPid(req, servletMappedUrl);            
            System.out.println("ASBaseServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("ASBaseServlet : process : nextPage : " + nextPage);
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
        AS_LEAS_1000WB wb = null;
        
        switch (pid) {
        
	        case ASLeasWBMapping.AS_LEAS_1001:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1001_l(req, res);
				System.out.println("AS_LEAS_1001:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1001_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1002:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1002_u(req, res);
				System.out.println("AS_LEAS_1002:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1003:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1003_m(req, res);
				System.out.println("AS_LEAS_1003:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1003_m.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1101:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1101_m(req, res);
				System.out.println("AS_LEAS_1101:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1101_m.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1102:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1102_l(req, res);
				System.out.println("AS_LEAS_1102:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1102_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1103:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1103_a(req, res);
				System.out.println("AS_LEAS_1103:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1104:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1104_l(req, res);
				System.out.println("AS_LEAS_1104:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1104_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1105:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1105_l(req, res);
				System.out.println("AS_LEAS_1105:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1105_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1106:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1106_l(req, res);
				System.out.println("AS_LEAS_1106:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1106_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1107:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1107_m(req, res);
				System.out.println("AS_LEAS_1107:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1107_m.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1108:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1108_i(req, res);
				System.out.println("AS_LEAS_1108:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1200:
	        	wb = new AS_LEAS_1000WB();
	        	((AS_LEAS_1000WB)wb).as_leas_1200_m(req, res);
	        	nextPage = "/jsp/as/leas/as_leas_1200_m.jsp";
	        	break;
	        case ASLeasWBMapping.AS_LEAS_1201:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1201_l(req, res);
				System.out.println("AS_LEAS_1201:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1201_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1202:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1202_l(req, res);
				System.out.println("AS_LEAS_1202:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1202_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1203:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1203_l(req, res);
				System.out.println("AS_LEAS_1203:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1203_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1204:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1204_m(req, res);
				System.out.println("AS_LEAS_1204:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1204_m.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1205:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1205_a(req, res);
				System.out.println("AS_LEAS_1205:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1206:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1206_d(req, res);
				System.out.println("AS_LEAS_1206:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1207:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1207_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case ASLeasWBMapping.AS_LEAS_1208:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1208_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case ASLeasWBMapping.AS_LEAS_1210:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1210_i(req, res);
				System.out.println("AS_LEAS_1210:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1211:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1211_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1212:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case ASLeasWBMapping.AS_LEAS_1300:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1300_m(req, res);
				nextPage = "/jsp/as/leas/as_leas_1300_m.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1301:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1301_l(req, res);
				nextPage = "/jsp/as/leas/as_leas_1301_l.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1302:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1302_l(req, res);
				nextPage = "/jsp/as/leas/as_leas_1302_l.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1303:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1303_s(req, res);
				nextPage = "/jsp/as/leas/as_leas_1303_s.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1304:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1304_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1305:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1305_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1306:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1306_l(req, res);
				nextPage = "/jsp/as/leas/as_leas_1306_l.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1307:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1307_l(req, res);
				nextPage = "/jsp/as/leas/as_leas_1307_l.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1308:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1308_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1309:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1309_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1310:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1310_l(req, res);
				nextPage = "/jsp/as/leas/as_leas_1310_l.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1311:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1311_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1312:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1312_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

	        case ASLeasWBMapping.AS_LEAS_1401:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1401_l(req, res);
				System.out.println("AS_LEAS_1401:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1401_l.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1402:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1402_a(req, res);
				System.out.println("AS_LEAS_1402:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1501:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1501_m(req, res);
				System.out.println("AS_LEAS_1501:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1501_m.jsp";
				break;
	        case ASLeasWBMapping.AS_LEAS_1502:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1502_l(req, res);
				System.out.println("AS_LEAS_1502:::::::::::::::");
				nextPage = "/jsp/as/leas/as_leas_1502_l.jsp";
				break;
	        
			case ASLeasWBMapping.AS_LEAS_1801:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1801_l(req, res);
				nextPage = "/jsp/as/leas/as_leas_1801_l.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1802:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1802_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case ASLeasWBMapping.AS_LEAS_1901:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1901_l(req, res);
				nextPage = "/jsp/as/leas/as_leas_1901_l.jsp";
				break;
			case ASLeasWBMapping.AS_LEAS_1902:
				wb = new AS_LEAS_1000WB();
				((AS_LEAS_1000WB)wb).as_leas_1902_s(req, res);
				nextPage = "/jsp/as/leas/as_leas_1902_s.jsp";
				break;

			default:        	
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));        		
        }

        return nextPage;
    }
 
}
