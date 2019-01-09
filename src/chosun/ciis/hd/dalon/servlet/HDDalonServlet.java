
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


package chosun.ciis.hd.dalon.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.dalon.wb.HD_DALON_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDDalonServlet extends BaseServlet {

 
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
            String servletMappprzrl = "/hd/dalon/";
            iPid = extractPid(req, servletMappprzrl);
            
            System.out.println("HDDalonServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDDalonServlet : process : nextPage : " + nextPage);
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
        HD_DALON_1000WB wb = null;
		switch(pid) {
			case HDDalonWBMapping.HD_DALON_1000:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1000(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1000_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1001:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1001(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1002:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1002(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1002_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1010:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1010_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1010_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1050_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1050_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1050_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1052_A:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1052_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1053:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1053_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1053_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1100:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1100(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1100_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1101:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1101(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1102:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1102(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1102_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1200:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1200(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1200_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1201:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1201(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1201_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1202:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1202(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1300:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1300(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1300_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1301:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1301(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1301_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1302:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1302(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1400:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1400(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1400_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1401:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1401(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1401_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1402:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1402(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1402_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1403:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1403(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1404:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1404(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1404_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1405:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1405(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1406:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1406(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1406_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1407_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1407(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1407_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1408:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1408(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1408_l.jsp";
				break;					
			case HDDalonWBMapping.HD_DALON_1409:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1409_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1409_m.jsp";
				break;					
			case HDDalonWBMapping.HD_DALON_1500:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1500(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1500_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1501:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1501(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1502:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1502(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1503_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1503_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1503_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1504_M:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1504_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1504_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1505_A:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1505_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1506:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1506_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1506_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1510_A:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1510_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1550_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1550(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1550_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1551_M:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1551_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1551_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1552_A:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1552_a(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1552_a.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1600:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1600(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1600_l.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_1700:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1700(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1700_l.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1701:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1701(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1701_l.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_1702:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1702(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1702_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1703_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1703_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1703_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1704:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1704(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_1705:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1705_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1705_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1706:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1706_a(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/dalon/hd_dalon_1706_a.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1707:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1707_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1708:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1708_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1708_m.jsp";
				break;		
			case HDDalonWBMapping.HD_DALON_1800:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1800(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1800_l.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_1801:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1801_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1801_l.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1802:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1802_a(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/dalon/hd_dalon_1802_a.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1803:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1803_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1804:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1804_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1804_l.jsp";
				break;		
			case HDDalonWBMapping.HD_DALON_1806:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1806_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1806_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1900:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1900(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1900_l.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_1901:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1901(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1901_l.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1902:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1902(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1902_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_1903:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1903(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_1904:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1904_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1904_l.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1905:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1905_a(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1905_a.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1906:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1906_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_1907:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1907_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1907_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1908:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1908_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1908_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1909_D:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1909_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2000:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2000(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2000_l.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_2001:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2001(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2001_l.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_2002:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2002(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2002_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_2003:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2003(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_2004:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2004_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2004_l.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_2005:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2005_a(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2005_a.jsp";
				break;				
			case HDDalonWBMapping.HD_DALON_2006:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2006_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2007:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2007_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2007_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1805:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1805_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1805_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1911_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1911_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1911_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1912_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1912_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1912_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1913_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1913_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1913_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1914_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1914_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1914_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1915_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1915_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1915_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_1915_344_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_1915_344_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_1915_344_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2030_M:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2030_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2030_m.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2031_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2031_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2031_l.jsp";
				break;			
			case HDDalonWBMapping.HD_DALON_2032_A:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2032_a(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2032_a.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2040_M:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2040_m(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2040_m.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_2041_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2041_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2041_l.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_2043_A:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2043_a(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2043_a.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2045_A:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2045_a(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2045_a.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2046_D:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2046_d(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2046_d.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2047_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2047_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2047_l.jsp";
				break;
			case HDDalonWBMapping.HD_DALON_2049_D:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2049_d(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2049_d.jsp";
				break;	
			case HDDalonWBMapping.HD_DALON_2042_L:
				wb = new HD_DALON_1000WB();
				((HD_DALON_1000WB)wb).hd_dalon_2042_l(req, res);
				nextPage = "/jsp/hd/dalon/hd_dalon_2042_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}    
	
}
