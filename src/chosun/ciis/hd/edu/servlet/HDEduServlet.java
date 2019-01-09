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


package chosun.ciis.hd.edu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.edu.wb.HD_EDU_1000WB;
import chosun.ciis.hd.trip.servlet.HDTripWBMapping;
import chosun.ciis.hd.trip.wb.HD_TRIP_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDEduServlet extends BaseServlet {

 
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
   
    public void process(HttpServletRequest req, HttpServletResponse res) 
      throws ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/hd/edu/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDEduServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDEduServlet : process : nextPage : " + nextPage);
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


    
	public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
		String nextPage = null;
        HD_EDU_1000WB wb = null;

		switch(pid) {
			case HDEduWBMapping.HD_EDU_1000:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1000(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1000_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1010_L:
				System.out.println("1111111111111");
				wb = new HD_EDU_1000WB();
				System.out.println("2222222222");
				((HD_EDU_1000WB)wb).hd_edu_1010_l(req, res);
				System.out.println("333333333333");
				nextPage = "/jsp/hd/edu/hd_edu_1010_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1001:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1001(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1001_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1011:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1011(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1100:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1100(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1100_l.jsp";
				break;		
			case HDEduWBMapping.HD_EDU_1101:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1101(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1101_l.jsp";
				break;			
			case HDEduWBMapping.HD_EDU_1102:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1102(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1102_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1103_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1103(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1104:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1104_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1104_m.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1200:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1200(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1200_l.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1201:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1201(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1201_l.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1202:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1202(req, res);
				//nextPage = "/jsp/hd/edu/hd_edu_1202_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1203:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1203(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1203_l.jsp";
				break;					
			case HDEduWBMapping.HD_EDU_1500:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1500(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1500_l.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1501:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1501(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1501_l.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1502:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1502(req, res);
				//nextPage = "/jsp/hd/edu/hd_edu_1502_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1503:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1503(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1503_l.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1504:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1504_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1504_m.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1600:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1600(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1600_l.jsp";
				break;				
			case HDEduWBMapping.HD_EDU_1601:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1601(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1601_l.jsp";
				break;	
				/* 테스트 용 
			case HDEduWBMapping.HD_EDU_1610:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1610(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1610_l.jsp";
				break;	
			case HDEduWBMapping.HD_EDU_1620:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1620_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDEduWBMapping.HD_EDU_1630:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1630_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			*/
			case HDEduWBMapping.HD_EDU_1700:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1700(req, res);
				nextPage =  "/common/jsp/resultMsg.jsp";
				break;	
			case HDEduWBMapping.HD_EDU_1701:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1701(req, res);
				nextPage =  "/jsp/hd/edu/hd_edu_1701_l.jsp";
				break;	
			case HDEduWBMapping.HD_EDU_1710_L:
				System.out.println("1111111111111");
				wb = new HD_EDU_1000WB();
				System.out.println("2222222222");
				((HD_EDU_1000WB)wb).hd_edu_1710_l(req, res);
				System.out.println("333333333333");
				nextPage = "/jsp/hd/edu/hd_edu_1710_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1711:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1711(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1801:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1801(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1801_l.jsp";
				break;		
			case HDEduWBMapping.HD_EDU_1803:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1803(req, res);
				nextPage =  "/common/jsp/resultMsg.jsp";
				System.out.println("bong.svl");
				break;		
			case HDEduWBMapping.HD_EDU_1300:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1300(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1300_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1301:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1301(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1301_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1302:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1302(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1302_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1303:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1303(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1303_l.jsp";
				break;		
			case HDEduWBMapping.HD_EDU_1304:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1304(req, res);
				nextPage =  "/common/jsp/resultMsg.jsp";
				break;		
			case HDEduWBMapping.HD_EDU_1310:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1310_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1310_m.jsp";
				break;		
			case HDEduWBMapping.HD_EDU_1320:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1320_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1320_m.jsp";
				break;		
			case HDEduWBMapping.HD_EDU_1401:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1401(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1401_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1402:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1402(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1402_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1403:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1403(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1403_l.jsp";
				break;		
			case HDEduWBMapping.HD_EDU_1404:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1404(req, res);
				//nextPage = "/jsp/hd/edu/hd_edu_1404_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1110_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1110_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1111_D:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1111_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1211_D:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1211_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1210_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1112_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1112_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1112_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_1212_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_1212_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_1212_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2010_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2010_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2010_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2000_M:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2000_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2000_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2003_M:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2003_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2003_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2020_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2020_a(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2020_a.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2030_D:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2030_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2100_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2100_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2100_l.jsp";
				break; 
			case HDEduWBMapping.HD_EDU_2101:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2101_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2101_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2110_U:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2110_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2001_M:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2001_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2001_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2002_M:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2002_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2002_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2200_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2200_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2200_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2201:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2201_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2201_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2210_U:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2210_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2230_D:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2230_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2220_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2240_U:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2240_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2300_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2300_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2300_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2301_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2301_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_2301_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_2302_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_2302_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5000_M:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_5000_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_5000_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5001_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_5001_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_5001_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5002_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_5002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5004_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_5004_l(req, res);
				System.out.println("444444444444444444");
				nextPage = "/jsp/hd/edu/hd_edu_5004_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5005:
				wb = new HD_EDU_1000WB();		
				((HD_EDU_1000WB)wb).hd_edu_5005(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5100_M:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_5100_m(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_5100_m.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5101_L:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_5101_l(req, res);
				nextPage = "/jsp/hd/edu/hd_edu_5101_l.jsp";
				break;
			case HDEduWBMapping.HD_EDU_5102_A:
				wb = new HD_EDU_1000WB();
				((HD_EDU_1000WB)wb).hd_edu_5102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}    
}
