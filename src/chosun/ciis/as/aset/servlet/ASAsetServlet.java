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


package chosun.ciis.as.aset.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.aset.wb.AS_ASET_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class ASAsetServlet extends BaseServlet {


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
            String servletMappedUrl = "/as/aset/";
            iPid = extractPid(req, servletMappedUrl);            
            System.out.println("ASAsetServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("ASAsetServlet : process : nextPage : " + nextPage);
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
        AS_ASET_1000WB wb = null;
        
        switch (pid) {
			case ASAsetWBMapping.AS_ASET_1001:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1001_m(req, res);
				nextPage = "/jsp/as/aset/as_aset_1001_m.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1002:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1002_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1002_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1003:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1003_s(req, res);
				nextPage = "/jsp/as/aset/as_aset_1003_s.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1004:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1004_s(req, res);
				nextPage = "/jsp/as/aset/as_aset_1004_s.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1005:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1005_s(req, res);
				nextPage = "/jsp/as/aset/as_aset_1005_s.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1006:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1006_s(req, res);
				nextPage = "/jsp/as/aset/as_aset_1006_s.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1007:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1007_s(req, res);
				nextPage = "/jsp/as/aset/as_aset_1007_s.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1008:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1008_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1009:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1009_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1009_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1010:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1010_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1010_l.jsp";
				break;

			case ASAsetWBMapping.AS_ASET_1101:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1101_m(req, res);
				nextPage = "/jsp/as/aset/as_aset_1101_m.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1102:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1102_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1102_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1103:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1103_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1103_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1104:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1104_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1104_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1106:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1106_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1106_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1107:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1107_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1107_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1108:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1108_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1108_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1109:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1109_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1109_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1110:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1110_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

			case ASAsetWBMapping.AS_ASET_1201:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1201_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1201_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1202:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1202_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1202_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1203:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1203_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1203_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1204:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1204_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1205:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1205_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1300:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1300_m(req, res);
				System.out.println("AS_ASET_1300:::::::::::::::");
				nextPage = "/jsp/as/aset/as_aset_1300_m.jsp";
				break; 
			case ASAsetWBMapping.AS_ASET_1301:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1301_l(req, res);
				System.out.println("AS_ASET_1301:::::::::::::::");
				nextPage = "/jsp/as/aset/as_aset_1301_l.jsp";
				break; 
			case ASAsetWBMapping.AS_ASET_1302:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1302_i(req, res);
				System.out.println("AS_ASET_1302:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1303:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1303_a(req, res);
				System.out.println("AS_ASET_1303:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1304:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1304_l(req, res);
				System.out.println("AS_ASET_1304:::::::::::::::");
				nextPage = "/jsp/as/aset/as_aset_1304_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1305:
				wb = new AS_ASET_1000WB();
				System.out.println("AS_ASET_1305:::::::::::::::");
				((AS_ASET_1000WB)wb).as_aset_1305_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1305_l.jsp";
				break;
				
			case ASAsetWBMapping.AS_ASET_1401:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1401_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1401_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1402:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1402_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1402_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1403:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1403_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1403_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1404:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1404_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1405:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1405_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case ASAsetWBMapping.AS_ASET_1500:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1500_m(req, res);
				nextPage = "/jsp/as/aset/as_aset_1500_m.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1501:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1501_l(req, res);
//				System.out.println("AS_ASET_1501:::::::::::::::");
				nextPage = "/jsp/as/aset/as_aset_1501_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1502:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1502_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1502_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1503:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1503_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1504:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1504_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case ASAsetWBMapping.AS_ASET_1601:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1601_l(req, res);
				System.out.println("AS_ASET_1601:::::::::::::::");
				nextPage = "/jsp/as/aset/as_aset_1601_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1602:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1602_l(req, res);
				System.out.println("AS_ASET_1602:::::::::::::::");
				nextPage = "/jsp/as/aset/as_aset_1602_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1603:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1603_i(req, res);
				System.out.println("AS_ASET_1603:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1605:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1605_a(req, res);
				System.out.println("AS_ASET_1605:::::::::::::::");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			
			case ASAsetWBMapping.AS_ASET_1701:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1701_m(req, res);
				nextPage = "/jsp/as/aset/as_aset_1701_m.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1702:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1702_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1702_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1703:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1703_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1703_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1704:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1704_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1704_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1705:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1705_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1708:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1708_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1709:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1709_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1709_l.jsp";
				break;

			case ASAsetWBMapping.AS_ASET_1801:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1801_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1801_l.jsp";
				break;
			case ASAsetWBMapping.AS_ASET_1802:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1802_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

			case ASAsetWBMapping.AS_ASET_1901:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1901_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1901_l.jsp";
				break;

			case ASAsetWBMapping.AS_ASET_1902:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1902_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1902_l.jsp";
				break;

			case ASAsetWBMapping.AS_ASET_1903:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1903_l(req, res);
				nextPage = "/jsp/as/aset/as_aset_1903_l.jsp";
				break;
				
			case ASAsetWBMapping.AS_ASET_1904:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1904_a(req, res);
				nextPage = "/jsp/as/aset/as_aset_1904_a.jsp";
				break;
				
			case ASAsetWBMapping.AS_ASET_1906:
				wb = new AS_ASET_1000WB();
				((AS_ASET_1000WB)wb).as_aset_1906_m(req, res);
				nextPage = "/jsp/as/aset/as_aset_1906_m.jsp";
				break;
				
			default:        	
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));        		
        }

        return nextPage;
    }
 
}
