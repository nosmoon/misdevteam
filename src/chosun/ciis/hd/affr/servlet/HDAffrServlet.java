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


package chosun.ciis.hd.affr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.affr.wb.HD_AFFR_1000WB;
import chosun.ciis.hd.affr.wb.HD_AFFR_2000WB;
import chosun.ciis.hd.affr.wb.HD_AFFR_3000WB;
import chosun.ciis.hd.affr.wb.HD_AFFR_5000WB;
import chosun.ciis.hd.affr.wb.HD_AFFR_6000WB;
import chosun.ciis.hd.affr.wb.HD_AFFR_7000WB;
import chosun.ciis.hd.affr.wb.HD_AFFR_8000WB;
import chosun.ciis.hd.affr.wb.HD_AFFR_9000WB;
import chosun.ciis.hd.edu.servlet.HDEduWBMapping;
import chosun.ciis.hd.edu.wb.HD_EDU_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDAffrServlet extends BaseServlet {
 
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
            String servletMappedUrl = "/hd/affr/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDAffrServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDAffrServlet : process : nextPage : " + nextPage);
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
        HD_AFFR_1000WB wb = null;
        HD_AFFR_2000WB wb2 = null;
        HD_AFFR_3000WB wb3 = null;
        HD_AFFR_5000WB wb_5000 = null;
        HD_AFFR_6000WB wb_6000 = null;
        HD_AFFR_7000WB wb_7000 = null;
        HD_AFFR_8000WB wb_8000 = null;
        HD_AFFR_9000WB wb_9000 = null;
        
        switch (pid) {
        
			case HDAffrWBMapping.HD_AFFR_1000_L:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1000_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1000_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1001:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1001(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1001_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_1002:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1002(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1002_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_1002_500:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1002_500(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1002_500_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_1003:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1003(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1003_500:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1003_500(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1004:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1004_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1004_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1100:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1100(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1100_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_11000:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_11000_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_11000_m.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1101:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1101(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1101_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1102:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1102(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1102_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1103:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1103(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1104:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1104_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1104_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1105:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1105_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1105_a.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1106:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1106_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1108:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1108_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1108_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1109:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1109_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1200:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1200(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1200_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1201:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1201(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_1202:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1202(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1202_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_1203:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1203_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1203_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1204:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1204_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1204_m.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1300:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1300(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1300_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1301:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1301(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1301_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1302:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1302(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1302_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1303:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1303(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1410:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1410(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1410_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1411:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1411(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1411_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1412:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1412(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1412_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1413:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1413(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1414:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1414(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1414_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1415:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1415_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1415_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1416:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1416_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1416_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1417:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1417_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1418:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1418_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1418_m.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1420:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1420(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1420_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1500:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1500(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1500_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1501:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1501(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1502:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1502(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1502_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1600:  
				wb = new HD_AFFR_1000WB(); 
				((HD_AFFR_1000WB)wb).hd_affr_1600(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1600_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_1601:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1601(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1601_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1602:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1602(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1610:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1610_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1610_m.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1611:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1611(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1611_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1612:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1612(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1612_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1613:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1613(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1614:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1614(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1614_m.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1700:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1700(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1700_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1701:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1701(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1701_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1703:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1703(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1703_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_1710:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1710_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1710_m.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1712:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1712_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1712_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1714:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1714(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_1714_500:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1714_500(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_1715:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1715_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1715_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1716:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1716_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1716_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1717:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1717_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1720:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1720_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_1721:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1721(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1721_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1800:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1800(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1800_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_1810:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1810(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1810_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_1820:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1820(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_1900:
				wb = new HD_AFFR_1000WB();
				((HD_AFFR_1000WB)wb).hd_affr_1900(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_1900_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2011:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2011(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2011_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2010:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2010(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2010_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2012:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2012(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2013:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2013_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2013_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2014:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2014_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2014_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_2015:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2015_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2017:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2017_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2018:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2018_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2018_m.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2020:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2020(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2020_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_2100:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2100_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2100_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_2110:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2110(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2120:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2120(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2120_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_2200:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2200(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2200_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2210:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2210(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2210_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2211:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2211(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2212:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2212_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2212_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2220:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2220(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2220_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2310:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2310(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2310_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_2312:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2312(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2312_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2313:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2313(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2313_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2314:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2314(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2315:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2315_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2315_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2316:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2316_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2316_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2317:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2317_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2319:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2319_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2319_m.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2320:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2320(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2320_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_2321:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2321(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2321_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2322:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2322(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2322_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_2323:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2323(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2323_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2400:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2400(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2400_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_24000:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_24000_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_24000_m.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2401:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2401(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2401_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2402:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2402(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2402_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2403:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2403(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2404:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2404(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2404_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2405:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2405(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2405_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2406:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2406_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2406_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2407:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2407_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2407_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2408:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2408_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_2411:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2411_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2412:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2412(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2412_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2413:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2413(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2413_m.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_2414:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2414(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2414_m.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_2500:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2500(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2500_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_2501:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2501(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2501_l.jsp";
				break;
				
			case HDAffrWBMapping.HD_AFFR_2502:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2502(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2502_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2503:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2503(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
				
			case HDAffrWBMapping.HD_AFFR_2600:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2600(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2600_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2700:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2700(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2700_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2701:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2701(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2701_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2702:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2702(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2702_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2703:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2703(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2704:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2704(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2704_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2705:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2705_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2705_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2706:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2706_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2708:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2708_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2708_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2709:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2709_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2709_m.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2800:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2800(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2800_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_2801:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2801(req, res);
				//nextPage = "/jsp/hd/affr/hd_affr_2801_i.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2802:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2802_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2802_m.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2900:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2900(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2900_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_2901:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2901(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2901_l.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_2902:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2902(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_2903:
				wb2 = new HD_AFFR_2000WB();
				((HD_AFFR_2000WB)wb2).hd_affr_2903_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_2903_m.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_3000:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3000(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3000_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_3001:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3001(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3001_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_3002:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3002(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_3100:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3100(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3100_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_3101:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3101(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_3102:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3102(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3102_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_3200:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3200(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3200_l.jsp";
				break;				
			case HDAffrWBMapping.HD_AFFR_3201:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3201(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;					
			case HDAffrWBMapping.HD_AFFR_3202:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3202(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3202_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_3300:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3300_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3300_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_3301:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;					
			case HDAffrWBMapping.HD_AFFR_3302:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3302(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3302_l.jsp";
				break;						
			case HDAffrWBMapping.HD_AFFR_3003:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3003_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3003_l.jsp";
				break;		
				
				
			//증명서발급관리 - 강영슬	
			case HDAffrWBMapping.HD_AFFR_4000:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4000_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4000_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_4001:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4001_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4001_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_4002:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_4100:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4100_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4100_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_4101:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_4102:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4102_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4102_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_4103:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4103_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4103_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_4104:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4104_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4104_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_4200:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4200_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4200_l.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_4201:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_5000:
	    		wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_5000(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_5000_l.jsp";
				break;
				
			case HDAffrWBMapping.HD_AFFR_5010:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_5010_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_5010_l.jsp";
				break;
				
	    	case HDAffrWBMapping.HD_AFFR_5011:
	    		wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_5011_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_5012:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_5012_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_5012_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_5020:
	    		wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_5020_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_5020_l.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_5021:
				wb_5000 = new HD_AFFR_5000WB();
				System.out.println("555555555555555555555555");
				((HD_AFFR_5000WB)wb_5000).hd_affr_5021(req, res);
				System.out.println("6666666666666666666666");
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_6000:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6000_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6000_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_6003_M:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6003_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6003_m.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_6011:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6011_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_6010:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6010_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6010_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_6012:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6012_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_6013:
				wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6013_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6013_l.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_6021:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6021_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6021_l.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_6022:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6022_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6022_l.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_6023:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6023_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6023_l.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_6024:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6024_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_6100:
	    		wb_6000 = new HD_AFFR_6000WB();
				((HD_AFFR_6000WB)wb_6000).hd_affr_6100_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_6100_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_6101:
	    		wb_6000 = new HD_AFFR_6000WB();
	    		((HD_AFFR_6000WB)wb_6000).hd_affr_6101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_7000:
	    		wb_7000 = new HD_AFFR_7000WB();
				((HD_AFFR_7000WB)wb_7000).hd_affr_7000_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_7000_l.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_7010:
	    		wb_7000 = new HD_AFFR_7000WB();
				((HD_AFFR_7000WB)wb_7000).hd_affr_7010_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_7010_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_7011:
	    		wb_7000 = new HD_AFFR_7000WB();
				((HD_AFFR_7000WB)wb_7000).hd_affr_7011_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_4300:
	    		wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4300_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4300_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_4301:
	    		wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4301_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4301_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_4302:
	    		wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4302_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_4400:
				wb_5000 = new HD_AFFR_5000WB();
				((HD_AFFR_5000WB)wb_5000).hd_affr_4400_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_4400_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_7012:
	    		wb_7000 = new HD_AFFR_7000WB();
				((HD_AFFR_7000WB)wb_7000).hd_affr_7012_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_7012_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3501:
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3501_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3501_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3502:
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3502_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3502_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3503:
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3503_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3503_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_8010:
	    		wb_8000 = new HD_AFFR_8000WB();
				((HD_AFFR_8000WB)wb_8000).hd_affr_8010(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_8011:
	    		wb_8000 = new HD_AFFR_8000WB();
				((HD_AFFR_8000WB)wb_8000).hd_affr_8011(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_8011_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_8020:
	    		wb_8000 = new HD_AFFR_8000WB();
				((HD_AFFR_8000WB)wb_8000).hd_affr_8020(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_8020_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_8021:
	    		wb_8000 = new HD_AFFR_8000WB();
				((HD_AFFR_8000WB)wb_8000).hd_affr_8021(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_8021_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3700:  //단체보험금지급관리-보험사콤보_20150630 
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3700_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3700_m.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3710:
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3710_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3720:
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3720_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3720_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_3711:
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3711_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3730:
	    		wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3730_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_3800:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3800_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_3901:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3901_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_3902:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3902(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3902_l.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_3903:
				wb3 = new HD_AFFR_3000WB();
				((HD_AFFR_3000WB)wb3).hd_affr_3903(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_3903_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9000:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9000_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9000_m.jsp";
				break;				
					
	    	case HDAffrWBMapping.HD_AFFR_9001:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9002:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9003:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9003_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_9010:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9010_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9010_m.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_9011:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9011_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9011_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9012:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9012_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9013:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9013_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_9030:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9030_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9030_m.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_9031:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9031_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9031_l.jsp";
				break;
	    	case HDAffrWBMapping.HD_AFFR_9032:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9032_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9033:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9033_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDAffrWBMapping.HD_AFFR_9050:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9050_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9050_m.jsp";
				break;	
	    	case HDAffrWBMapping.HD_AFFR_9051:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9051_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9051_l.jsp";
				break;			
			case HDAffrWBMapping.HD_AFFR_9100:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9100_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9100_m.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9101:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9101_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9101_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9102:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9110:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9110_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9110_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9500:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9500_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9500_m.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_9501:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9501_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9501_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9502:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9502_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_9503:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9503_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9503_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9600:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9600_m(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9600_m.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_9601:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9601_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9601_l.jsp";
				break;		
	    	case HDAffrWBMapping.HD_AFFR_9602:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9602_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;			
	    	case HDAffrWBMapping.HD_AFFR_9603:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9603_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_9604:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9604_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9604_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_9605:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9605_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9605_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_9701:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9701_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9701_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_9700:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9700_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9700_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_9703:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9703_a(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9703_a.jsp";
				break;		
			case HDAffrWBMapping.HD_AFFR_9704:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9704_l(req, res);
				System.out.println("1111111111111111113333333333");
				nextPage = "/jsp/hd/affr/hd_affr_9704_l.jsp";
				break;
			case HDAffrWBMapping.HD_AFFR_9707:
	    		wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9707_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
			break;	
			case HDAffrWBMapping.HD_AFFR_9708:
				wb_9000 = new HD_AFFR_9000WB();
				((HD_AFFR_9000WB)wb_9000).hd_affr_9708_l(req, res);
				nextPage = "/jsp/hd/affr/hd_affr_9708_l.jsp";
			break;	
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}
