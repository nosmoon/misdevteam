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


package chosun.ciis.hd.trip.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.trip.wb.HD_TRIP_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
 
public class HDTripServlet extends BaseServlet {


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
            String servletMappedUrl = "/hd/trip/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDTripServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDTripServlet : process : nextPage : " + nextPage);
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
        HD_TRIP_1000WB wb = null;

        switch (pid) {
			case HDTripWBMapping.HD_TRIP_1000:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1000_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1000_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1001:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1001_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1001_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1002:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
		/* 2017.11.21 사용 안하는거 같아서 막음  
			case HDTripWBMapping.HD_TRIP_1002_344:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1002_344_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
		*/
			case HDTripWBMapping.HD_TRIP_1003:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1003_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1003_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1004:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1004_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1004_l.jsp";
				break;
		 /* 2017.11.21 사용 안하는거 같아서 막음  
			case HDTripWBMapping.HD_TRIP_1004_344:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1004_344_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1004_344_l.jsp";
				break;
		 */
			case HDTripWBMapping.HD_TRIP_1005:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1005_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1005_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1006:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1006_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1006_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1010_L:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1010_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1010_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1011:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1011(req, res);
				//nextPage = "/jsp/hd/trip/hd_trip_1105_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1100:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1100_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1100_l.jsp";
				break;
		/* 2017.11.21 사용 안하는거 같아서 막음  
			case HDTripWBMapping.HD_TRIP_1100_344:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1100_344_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1100_344_l.jsp";
				break;
		*/
			case HDTripWBMapping.HD_TRIP_1101:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1101_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1101_l.jsp";
				break;
		/* 2017.11.21 사용 안하는거 같아서 막음  
			case HDTripWBMapping.HD_TRIP_1101_344:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1101_344_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1101_344_l.jsp";
				break;
		*/
			case HDTripWBMapping.HD_TRIP_1102:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1102_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1102_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1103:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1103_a(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/trip/hd_trip_1103_a.jsp";
				break;
		 /* 2017.11.21 사용 안하는거 같아서 막음  
			case HDTripWBMapping.HD_TRIP_1103_344:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1103_344_a(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/trip/hd_trip_1103_344_a.jsp";
				break;
		*/
			case HDTripWBMapping.HD_TRIP_1104:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1104_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1104_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1105:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1105_a(req, res);
				//nextPage = "/jsp/hd/trip/hd_trip_1105_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1106:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1106_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1106_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1107:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1107_a(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1107_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDTripWBMapping.HD_TRIP_1108:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1108_d(req, res);
				//nextPage = "/jsp/hd/trip/hd_trip_1108_d.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1109:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1109_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;			
			case HDTripWBMapping.HD_TRIP_1200:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1200_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1200_l.jsp";
				break;	
		/* 2017.11.21 사용 안하는거 같아서 막음  
			case HDTripWBMapping.HD_TRIP_1200_344:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1200_344_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1200_344_l.jsp";
				break;	
		*/		
			case HDTripWBMapping.HD_TRIP_1201:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1201_a(req, res);
				//nextPage = "/jsp/hd/trip/hd_trip_1201_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDTripWBMapping.HD_TRIP_1203:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1203_m(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1203_m.jsp";
				break;				
			case HDTripWBMapping.HD_TRIP_1300:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1300_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1300_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1301:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1301_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1301_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1302:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1302_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1303:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1303_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1303_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1304:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1304_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1304_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1305:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1305_a(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1305_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1307:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1307_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1307_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1402:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1402_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1403:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1403_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1403_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1405:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1405_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1500:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1500_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1500_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1501:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1501_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1501_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1502:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1502_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1502_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1503:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1503_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1504:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1504_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1510:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1510_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1510_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1600:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1600_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1600_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1601:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1601_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1700:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1700_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1700_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1701:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1701_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1701_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1702:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1702_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1703:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1703_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1703_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1704:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1704_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1705:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1705_m(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1705_m.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1800:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1800_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1800_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1801:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1801_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1900:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1900_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1900_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1901:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1901_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1902:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1902_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1902_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_1903:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1903_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1903_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1904:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1904_a(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_1904_a.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_1905:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_1905_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDTripWBMapping.HD_TRIP_2020:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_2020_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_2020_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_2021:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_2021_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_2021_l.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_2022:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_2022_a(req, res);
				nextPage ="/common/jsp/resultMsg.jsp";
				break;	
			case HDTripWBMapping.HD_TRIP_9996:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_9996_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_9996_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_9997:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_9997_a(req, res);
				//wb = new HD_TRIP_9000WB();
				//((HD_TRIP_9000WB)wb).hd_trip_9997_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_9998:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_9998_l(req, res);
				//wb = new HD_TRIP_9000WB();
				//((HD_TRIP_9000WB)wb).hd_trip_9998_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_9998_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_9999:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_9999_l(req, res);
//				wb = new HD_TRIP_9000WB();
//				((HD_TRIP_9000WB)wb).hd_trip_9999_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_9999_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_2100_L:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_2100_l(req, res);
				nextPage = "/jsp/hd/trip/hd_trip_2100_l.jsp";
				break;
			case HDTripWBMapping.HD_TRIP_2110_A:
				wb = new HD_TRIP_1000WB();
				((HD_TRIP_1000WB)wb).hd_trip_2110_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
