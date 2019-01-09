
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


package chosun.ciis.hd.saly.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.lvcmpy.servlet.HD_LVCMPY_1000WBMapping;
import chosun.ciis.hd.lvcmpy.wb.HD_LVCMPY_1000WB;
import chosun.ciis.hd.saly.wb.HD_SALY_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDSalyServlet extends BaseServlet {

 
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
            String servletMappprzrl = "/hd/saly/";
            iPid = extractPid(req, servletMappprzrl);
            
            System.out.println("HDSalyServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDSalyServlet : process : nextPage : " + nextPage);
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
        HD_SALY_1000WB wb = null;
		switch(pid) {
			case HDSalyWBMapping.HD_SALY_1000:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1000_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1000_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1001:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1002:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1002_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1002_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1003:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1003_m(req, res);  
				nextPage = "/jsp/hd/saly/hd_saly_1003_m.jsp";
				break;		
			case HDSalyWBMapping.HD_SALY_1100:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1100_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1100_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1200:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1200_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1201:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1202:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1202_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1202_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1210:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1210_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1210_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1211:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1211_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1211_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1300:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1300_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1300_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1303:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1303_m(req, res);  
				nextPage = "/jsp/hd/saly/hd_saly_1303_m.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_1301:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1302:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1302_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1302_l.jsp";
				break;
        	case HDSalyWBMapping.HD_SALY_1304:
        		wb = new HD_SALY_1000WB();
        		wb.hd_saly_1304_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
			case HDSalyWBMapping.HD_SALY_1400:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1400_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1400_334:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1400_334_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1401:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1401_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1402:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1402_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1402_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1405:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1405_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_1410:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1410_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1410_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1411:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1411_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1411_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1410_334:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1410_334_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1410_334_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1411_334:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1411_334_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1411_334_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2100:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2100_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2100_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2102:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2102_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2102_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2101:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2501:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2501_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2501_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2502:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2502_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2502_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2503:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2503_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2504:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2504_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_2600:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2600_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2600_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2601:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2601_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2601_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2602:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2602_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3000:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3000_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3000_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3001:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3002:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3002_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3002_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3100:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3100_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3100_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3101:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3102:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3102_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3102_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3103:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3103_a(req, res);
				//nextPage = "/jsp/hd/saly/hd_saly_3103_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3200:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3200_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3200_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3201:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3202:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3202_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3202_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3203:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3203_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3203_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_4000:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4000_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4000_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4001:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4001_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4001_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_4002:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4003:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4003_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4003_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4004:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4005:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4005_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4005_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4100:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4100_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4100_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_4101:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4101_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4101_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4102:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3300:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3300_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case HDSalyWBMapping.HD_SALY_3300_334:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3300_334_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case HDSalyWBMapping.HD_SALY_3300_GYSG :
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3300_a_gysg(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			case HDSalyWBMapping.HD_SALY_3302:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3302_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3303:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3303_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_3303_334: //경제아이용 급여세금계산-전표생성_20150416
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3303_334_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;					
			case HDSalyWBMapping.HD_SALY_3304:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3304_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp"; 
				break;				
			case HDSalyWBMapping.HD_SALY_3305:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3305_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDSalyWBMapping.HD_SALY_3306:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3306_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDSalyWBMapping.HD_SALY_3307:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3307_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDSalyWBMapping.HD_SALY_3308:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3308_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3309:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3309_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDSalyWBMapping.HD_SALY_3310:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3310_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3310_l.jsp";
				break;			
			case HDSalyWBMapping.HD_SALY_3311:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3311_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3311_l.jsp";
				break;				
			case HDSalyWBMapping.HD_SALY_3312:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3312_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3312_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_3313:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3313_p(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3313_p.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_3315:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3315_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_3317:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3317_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3317_l.jsp";
				break;		
			case HDSalyWBMapping.HD_SALY_3330:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3330(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3330_a.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_3331:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3331(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3331_a.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_3332:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3332_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3332_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3350:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3350_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_4103:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4103_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4103_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4302:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4302_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
			break;	
			case HDSalyWBMapping.HD_SALY_4300:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4300_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4300_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_4301:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4301_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4301_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4304:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4304_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4303:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4303_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4303_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4200:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4200_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4200_l.jsp";
				break;	
				
			case HDSalyWBMapping.HD_SALY_4500:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4500_a(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4500_a.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_3400:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3400_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3401:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3401_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3402:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3402_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3402_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_4201:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4202:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4202_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4202_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_1600:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1600_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1600_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1601:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1601_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1601_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1602:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1602_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1602_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1603:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1603_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1604:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1604_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1604_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1700:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1700_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1700_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1700_500:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1700_500_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1700_500_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1701:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1701_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1701_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1701_500:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1701_500_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1701_500_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1702:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1702_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1702_500:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1702_500_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_4203:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4203_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_4204:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_4204_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_4204_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2200:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2200_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2201:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2202:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2202_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2202_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2000:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2000(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2000_l.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2001:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2001(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2001_l.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2002:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2002(req, res);
				//nextPage = "/jsp/hd/saly/hd_saly_2002_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2003:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2003_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2003_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1500:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1500_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1500_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1501:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1501_m(req, res);  
				nextPage = "/jsp/hd/saly/hd_saly_1501_m.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_2300:
				wb = new HD_SALY_1000WB();  
				((HD_SALY_1000WB)wb).hd_saly_2300_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2300_l.jsp";
				break;	
			case HDSalyWBMapping.HD_SALY_5002:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5002_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5002_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5002_334:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5002_334_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5002_334_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5002_2006:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5002_2006_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5002_2006_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5003:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5003_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5003_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5004:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5004_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5004_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5005:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5005_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5005_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5006:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5006_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5006_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5007:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5007_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5007_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_5008:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_5008_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_5008_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3503:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3503_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3503_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3502:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3502_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3502_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3600:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3600_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3600_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3601:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3601_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3601_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3602:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3602_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3602_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3603:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3603_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3603_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3604:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3604_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3604_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3605:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3605_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3605_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3700:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3700_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3700_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3800:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3800_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3800_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3801:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3801_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3802: 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3802_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3802_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3803:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3803_a(req, res);
				//nextPage = "/jsp/hd/saly/hd_saly_3103_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3804: //개인연금정보 납부현황으로 데이터이관
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3804_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3805: //개인연금정보 전송금액 체크
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3805_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3805_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2400_A:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2400_a(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2400_a.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2401_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2401_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_2401_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_2402_A:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_2402_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6000_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6000_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6000_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6001_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6001_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6001_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6002_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6002_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6002_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6003_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6003_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6003_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6004_A:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6005_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6005_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6005_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6100_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6100_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6100_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1350_A:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1350_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_1351_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_1351_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_1351_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_3313_326_L: //개인별내역조회_뉴스프레스
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_3313_326_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_3313_326_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_7000_M:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_7000_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_7000_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_7001_L:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_7001_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_7001_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_7002_A:
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_7002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6200_M: //휘트니스사용자등록관리_회사콤보구성
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6200_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6200_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6210_L: //휘트니스사용자등록관리_조회
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6210_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_6210_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6220_A: //휘트니스사용자등록관리_CUD
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6230_A: //휘트니스사용자등록관리_전월내역복사
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6230_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_6240_A: //휘트니스사용자등록관리_전월내역복사
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_6240_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8001_M: //개인연금접수(총무팀)_회사콤보구성 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8001_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_8001_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8002_A: //개인연금접수(총무팀)_신청
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8003_L: //개인연금접수(현업)_조회
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8003_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_8003_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8004_L: //개인연금접수(개인연금 납부현황) 조회 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8004_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_8004_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8101_M: //개인연금접수(총무팀)_회사콤보구성 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8101_m(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_8101_m.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8102_L: //개인연금접수(총무팀)_조회
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8102_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_8102_l.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8103_A: //개인연금접수(총무팀)_저장/삭제 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8103_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8104_A: //개인연금접수(총무팀)_처리완료/처리취소 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8104_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8105_A: //개인연금접수(총무팀)_적용년월 일괄적용 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8105_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDSalyWBMapping.HD_SALY_8201_L: //개인연금납부내역현황(총무팀)_조회 
				wb = new HD_SALY_1000WB();
				((HD_SALY_1000WB)wb).hd_saly_8201_l(req, res);
				nextPage = "/jsp/hd/saly/hd_saly_8201_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}
}
