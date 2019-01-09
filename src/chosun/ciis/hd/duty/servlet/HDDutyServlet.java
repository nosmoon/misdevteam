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


package chosun.ciis.hd.duty.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.hd.duty.wb.HD_DUTY_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDDutyServlet extends BaseServlet {

 
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
            String servletMappedUrl = "/hd/duty/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDDutyServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDDutyServlet : process : nextPage : " + nextPage);
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
        HD_DUTY_1000WB wb = null;

        switch (pid) {
			case HDDutyWBMapping.HD_DUTY_1000:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1000_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				//nextPage = "/jsp/hd/duty/hd_duty_1000_a.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1001:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1001_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1001_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1002:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1002_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1002_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1003:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1003_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1004:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1004_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1004_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1107:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1107_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1107_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1100:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1100_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1100_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1101:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1101_m(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1101_m.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1102:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1102_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1102_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1103:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1103_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1104:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1104_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1104_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1105:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1105_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1105_l.jsp";
				break;
	/*			
			case HDDutyWBMapping.HD_DUTY_1105_A:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1105_a(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1105_a.jsp";
				break;
*/
			case HDDutyWBMapping.HD_DUTY_1106:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1106_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1200:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1200_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1200_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1201:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1201_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1202:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1202_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1202_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1203:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1203_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1203_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1204:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1204_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1204_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1205:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1205_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1205_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1206:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1206_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1206_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1207:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1207_m(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1207_m.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1209:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1209_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1209_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1300:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1300_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1300_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1301:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	  /*
			case HDDutyWBMapping.HD_DUTY_1301_344:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1301_344_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
		*/
			case HDDutyWBMapping.HD_DUTY_1302:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1302_u(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/duty/hd_duty_1302_u.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1303_L:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1303_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1303_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1304:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1304_m(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1304_m.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1400:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1400_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1400_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1401:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1401_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1401_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1402:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1402_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
		/*
			case HDDutyWBMapping.HD_DUTY_1402_344:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1402_344_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
		*/
			case HDDutyWBMapping.HD_DUTY_1403:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1403_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1404:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1404_m(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1404_m.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1500:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1500_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1500_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1501:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1501_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1502:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1502_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1600:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1600_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1600_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1601:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1601_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1601_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1700:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1700_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1700_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1109_L:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1109_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1109_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1108_A:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1108_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1110_A:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1110_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1111_L:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1111_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1111_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1112_D:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1112_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1113_L:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1113_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1113_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1114_L:
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1114_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1114_l.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_1801: // 2018.06.12 추가  주 52시간 조회 화면  
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_1801_l(req, res);
				nextPage = "/jsp/hd/duty/hd_duty_1801_l.jsp";
				break;
				// PC 및 모바일 일 근태  2018.07.04  
			case HDDutyWBMapping.HD_DUTY_WORK_1001:  
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_work_1001_l(req, res);
				//nextPage = "/jsp/hd/duty/hd_duty_1111_l.jsp";
				if(Util.checkString(req.getParameter("clsf")).equals("M")) {
					nextPage = "/jsp/hd/duty/working_time_list_m.jsp";	//mobile
				} else {
					nextPage = "/jsp/hd/duty/working_time_list.jsp";	//pc web
				}
				break;
			case HDDutyWBMapping.HD_DUTY_WORK_1002 :
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_work_1002_a(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/duty/working_done.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_WORK_1003 :
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_work_1003_d(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/duty/working_done.jsp";
				break;
			case HDDutyWBMapping.HD_DUTY_WORK_1004:  
				wb = new HD_DUTY_1000WB();
				((HD_DUTY_1000WB)wb).hd_duty_work_1001_l(req, res);
				//nextPage = "/jsp/hd/duty/hd_duty_1111_l.jsp";
				if(Util.checkString(req.getParameter("clsf")).equals("M")) {				
					nextPage = "/jsp/hd/duty/working_time_m_init.jsp";	//pc web
				} else {
					nextPage = "/jsp/hd/duty/working_time_init.jsp";	//pc web
				}
				break;
				
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        System.out.print("다다다다다" +  nextPage);
        return nextPage;
    }
}
