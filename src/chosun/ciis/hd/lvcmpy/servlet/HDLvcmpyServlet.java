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


package chosun.ciis.hd.lvcmpy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.lvcmpy.wb.HD_LVCMPY_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
 
public class HDLvcmpyServlet extends BaseServlet {


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
            String servletMappedUrl = "/hd/lvcmpy/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDLvcmpyServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDLvcmpyServlet : process : nextPage : " + nextPage);
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
        HD_LVCMPY_1000WB wb = null;
        
        System.out.println(HD_LVCMPY_1000WBMapping.HD_LVCMPY_3600_L+" : "+pid);
        
        switch (pid) {
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1000:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1000_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1000_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1001:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1001_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1001_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1002:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1002_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1002_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1003:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1003_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1003_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1004:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1004_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1004_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1005:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1005_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1006:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1006_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1006_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1007:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1007_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1007_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1009:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1009_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1009_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1010:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1010_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1010_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1011:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1011_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1011_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1050:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1050_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1050_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1100:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1100_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1100_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1101:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1101_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1101_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1104:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1104_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1104_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1105:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1105_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1109:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1109_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1109_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1300:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1300_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1301:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1301_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1302:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1302_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1302_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1303:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1303_m(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1303_m.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2000:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2000_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2000_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2001:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2001_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2002:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2002_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2002_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2003:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2003_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2004:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2004_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2004_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2100:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2100_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2100_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2101:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2101_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2101_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2102:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2102_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2103:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2103_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2200:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2200_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2200_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2201:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2201_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2202:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2202_m(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2202_m.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2300:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2300_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2300_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2301:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2301_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2400:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2400_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2500:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2500_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2500_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2501:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2501_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2502:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2502_m(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2502_m.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2600:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2600_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2601:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2601_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2601_2013:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2601_2013_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2602:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2602_m(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2602_m.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2605:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2605_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2606:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2606_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2606_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2700:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2700_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2700_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2701:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2701_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2704:				
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2704_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2704_l.jsp";
				break;				
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2705:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2705_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2706:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2706_d(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2707:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2707_m(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2707_m.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2800:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2800_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2800_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2801:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2801_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2801_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_2802:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_2802_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_2802_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3100:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3100_m(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3100_m.jsp";
				break;				
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3103:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3103_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3104:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3104_d(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3000:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3000_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3001:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3001_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3200:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3200_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3200_l.jsp";
				break;	
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3300:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3300_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3300_l.jsp";
				break;	
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3400:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3400_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3400_l.jsp";
				break;	
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3500:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3500_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3502:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3502_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3502_l.jsp";
				break;	
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3503:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3503_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3503_l.jsp";
				break;	
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3504:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3504_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3505:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3505_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3002:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3003:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3003_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1017:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1017_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1017_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_1018:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_1018_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_1018_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3600_L: 
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3600_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3600_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3601_L:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3601_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3601_l.jsp";
				break;
			case HD_LVCMPY_1000WBMapping.HD_LVCMPY_3401_L:
				wb = new HD_LVCMPY_1000WB();
				((HD_LVCMPY_1000WB)wb).hd_lvcmpy_3401_l(req, res);
				nextPage = "/jsp/hd/lvcmpy/hd_lvcmpy_3401_l.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
