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


package chosun.ciis.hd.yadjm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.cost.servlet.HDCostWBMapping;
import chosun.ciis.hd.cost.wb.HD_COST_1000WB;
import chosun.ciis.hd.yadjm.wb.HD_YADJM_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDYadjmServlet extends BaseServlet {

 
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
            String servletMappprzrl = "/hd/yadjm/";
            iPid = extractPid(req, servletMappprzrl);
            
            System.out.println("HDYadjmServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDYadjmServlet : process : nextPage : " + nextPage);
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

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
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
        HD_YADJM_1000WB wb = null;
		switch(pid) {
			case HDYadjmWBMapping.HD_YADJM_1000: //연말정산공제기준표(항목별공제)저장, 2014년 연말정산시 사용
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1000_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1000_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111000_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111000_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1001: //연말정산공제기준표(항목별공제)조회, 2014년 연말정산시 사용
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1001_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1001_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1100:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1100_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1100_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1101: //연말정산공제기준표(근로소득공제/과세표준)조회 , 2014년 연말정산시 사용
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1101_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1101_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1201:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1201_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1201_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1210: //종전근무지소득조회 , 2014년 연말정산시 사용 , 2015년 사용(작업보류)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1210(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1210_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1211: //종전근무지소득입력 , 2014년 연말정산시 사용
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1211(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1211_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1220:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1221:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1221_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1221_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1222:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1222_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1222_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1223:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1223_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1223_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1224:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1224_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1224_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1225:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1225(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1225_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1230:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1230(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1230_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1231:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1231(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1231_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1400:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1400(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1400_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1500_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1500_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1500_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1600:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1600(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1600_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1601:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1601_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1601_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1602:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1602_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1602_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1603:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1603_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1603_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1604:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1604_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1604_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1800:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1800(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1800_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1810:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1810(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1810_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1820:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1820(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1820_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1830:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1830(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1830_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1840:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1840(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1840_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1900:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1900(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1900_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1930:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1930(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1930_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1940:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1940(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1940_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2003:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2004:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2004_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2004_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3000(req, res);
				System.out.println("-----------------------------------------");
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3001:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3001(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3001_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3002:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3002(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3002_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3003_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3003_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_3003_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3004:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3004_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3004_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3005_M:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3005_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3005_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3006:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3006_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3006_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3007_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3007_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5100_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5100_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5101_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5101_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5101_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5102:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5102_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5102_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5200_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5200_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5200_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5201_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5201_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5201_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5202_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5202_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5202_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5203_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5203_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5203_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101230_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101230_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101230_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101214_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101251_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_106000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_106000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_106000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_106001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_106001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_106003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_106003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_106003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_102000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_102000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
			
			case HDYadjmWBMapping.HD_YADJM_111220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111230_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111230_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111230_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111214_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111251_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_115200:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_115200_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_115200_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_115600:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_115600_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_115600_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_115700:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_115700_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_115700_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_116000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_116000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_116000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_116001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_116001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_116003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_116003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_116003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_112000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_112000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_6003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_6003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_6003_l.jsp";
				break;
			
			case HDYadjmWBMapping.HD_YADJM_2012_1210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_2000_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_6000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_6000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_6000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_6001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_6001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_127001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_127001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDYadjmWBMapping.HD_YADJM_2012_CONV_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_conv_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_7000_L:
				wb = new HD_YADJM_1000WB(); 
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_7000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_7000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_7002_S: 					//야근일지-인쇄
				wb = new HD_YADJM_1000WB();
        		((HD_YADJM_1000WB)wb).hd_yadjm_2012_7002_s(req, res);
        		nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_7002_s.jsp";
        		break;	
			case HDYadjmWBMapping.HD_YADJM_5400_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5400_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5400_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5401_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5401_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5402_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5402_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1210_a(req, res); //맵핑ID와 별개의 WB를 호출함. 주의
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1221_l(req, res);
				System.out.print("되라 좀 ");
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1221_l.jsp";
				System.out.print("왜 안됨   ");
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1234_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_2000_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_6000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_6000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_6000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_6001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_6001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_6003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_6003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_6003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_137001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_137001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_CONV_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_conv_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_7000_L:
				wb = new HD_YADJM_1000WB(); 
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_7000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_7000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_7002_S: 					//야근일지-인쇄
				wb = new HD_YADJM_1000WB();
        		((HD_YADJM_1000WB)wb).hd_yadjm_2013_7002_s(req, res);
        		nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_7002_s.jsp";
        		break;	
			case HDYadjmWBMapping.HD_YADJM_5900_M :
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5900_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5900_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5901_L :
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5901_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5901_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5902_A :
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5902_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5902_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_6003_L: //2014년 연말정산-화면권한여부
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_6003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_6003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_2000_A: //2014년 연말정산-지급조서파일생성-파일생성
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1119_A: //2014년 연말정산자료등록 임시저장
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1210_A: //2014년 연말정산자료등록 저장
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1220_L: //2014년 연말정산자료등록-연말정산 조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_CONV_A: //2014년 연말정산자료등록-파일업로드
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_conv_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1221_L: //2014년 연말정산자료등록-연말정산 조회(팝업리프레쉬)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_7002_S: //2014년 연말정산파일다운로드-사용하는지 파악필요
				wb = new HD_YADJM_1000WB();
        		((HD_YADJM_1000WB)wb).hd_yadjm_2014_7002_s(req, res);
        		nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_7002_s.jsp";
        		break;
			case HDYadjmWBMapping.HD_YADJM_2014_1250_L: //2014년 연말정산자료등록-정산결과조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1251_L: //2014년 연말정산자료등록-정산결과조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1250_l.jsp";
				break;	
			case HDYadjmWBMapping.HD_YADJM_2014_1232_A: //2014년 연말정산자료등록-연금저축 저장/수정/삭제
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1233_L: //연금저축41 총합계
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1231_l(req, res); //연금(팝업) 조회
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1212_A: //2014년 연말정산 의료비 팝업 저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1213_A: //2014년 연말정산 기부금팝업저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1214_L: //2014년 연말정산 기부금 READY부분
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1234_L: //복지기금개인연금 조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_7000_L: //2014연말정산파일다운로드-조회
				wb = new HD_YADJM_1000WB(); 
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_7000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_7000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_147001_A: //2014연말정산파일업로드 
				System.out.println("$$$ HD_YADJM_147001_A 서블릿 호출 됨!! $$$ ");
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_147001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1119_A: //2015년 연말정산자료등록-임시저장
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1210_A: //2015년 연말정산자료등록-저장
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1220_L: //2015년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1220_l(req, res);
				System.out.println("2015jsp 입니다. ");
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1220_l.jsp";
				System.out.println("끝  입니다. ");
				break;
			case HDYadjmWBMapping.HD_YADJM_157001_A: //2015연말정산파일업로드 
				System.out.println("$$$ HD_YADJM_157001_A 서블릿 호출 됨!! $$$ ");
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_157001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1221_L: //2015년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1232_A: //2015년 연말정산자료등록-연금팝업창_저장/삭제버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1231_l(req, res); //2015년 연말정산 본인공제입력 연금팝업창-연금저축 조회
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1234_L: //2015년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1212_A: //2015년 연말정산 의료비 팝업 저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1213_A: //2015년 연말정산 기부금팝업저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1214_L: //2015년 연말정산 기부금 READY 조회 및 콤보구성
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1250_L: //2015년 연말정산자료등록-정산결과조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1251_L: //2015년 연말정산자료등록-정산결과조회(안쓰이는거 같음)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_2000_A: //2015년 연말정산 지급조서파일생성-파일생성
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_5100_L: //2015년 연말정산 본인공제입력 장기주택저당차임금 팝업 -  조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_5100_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_5100_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_5101_A: //2015년 연말정산 장기주택저당차입금 팝업 저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_5101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//         2016년 연말정산 
			case HDYadjmWBMapping.HD_YADJM_2016_1119_A: //2016년 연말정산자료등록-임시저장
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1210_A: //2016년 연말정산자료등록-저장
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1220_L: //2016년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1220_l.jsp";
				System.out.println("끝  입니다. ");
				break;
			case HDYadjmWBMapping.HD_YADJM_167001_A: //2016연말정산파일업로드 
				System.out.println("$$$ HD_YADJM_167001_A 서블릿 호출 됨!! $$$ ");
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_167001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1221_L: //2016년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1232_A: //2016년 연말정산자료등록-연금팝업창_저장/삭제버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1231_l(req, res); //2016년 연말정산 본인공제입력 연금팝업창-연금저축 조회
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1234_L: //2016년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1212_A: //2016년 연말정산 의료비 팝업 저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1213_A: //2016년 연말정산 기부금팝업저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1214_L: //2016년 연말정산 기부금 READY 조회 및 콤보구성
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1250_L: //2016년 연말정산자료등록-정산결과조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1251_L: //2016년 연말정산자료등록-정산결과조회(안쓰이는거 같음)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1250_l.jsp"; 
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_2000_A: //2016년 연말정산 지급조서파일생성-파일생성
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_5100_L: //2016년 연말정산 본인공제입력 장기주택저당차임금 팝업 -  조회
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_5100_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_5100_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_5101_A: //2016년 연말정산 장기주택저당차입금 팝업 저장버튼
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_5101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//2017년 연말정산 
					case HDYadjmWBMapping.HD_YADJM_2017_1119_A: //2017년 연말정산자료등록-임시저장
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1210_a(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1210_a.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1210_A: //2017년 연말정산자료등록-저장
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1210_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1220_L: //2017년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1220_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1220_l.jsp";
						System.out.println("끝  입니다. ");
						break;
					case HDYadjmWBMapping.HD_YADJM_177001_A: //2017연말정산파일업로드 
						System.out.println("$$$ HD_YADJM_177001_A 서블릿 호출 됨!! $$$ ");
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_177001_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1221_L: //2017년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1221_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1221_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1232_A: //2017년 연말정산자료등록-연금팝업창_저장/삭제버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1232_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1231_L:
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1231_l(req, res); //2017년 연말정산 본인공제입력 연금팝업창-연금저축 조회
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1231_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1234_L: //2017년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1234_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1234_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1212_A: //2017년 연말정산 의료비 팝업 저장버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1212_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1213_A: //2017년 연말정산 기부금팝업저장버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1213_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1214_L: //2017년 연말정산 기부금 READY 조회 및 콤보구성
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1214_l  (req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1214_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1250_L: //2017년 연말정산자료등록-정산결과조회
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1250_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1251_L: //2017년 연말정산자료등록-정산결과조회(안쓰이는거 같음)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1250_l.jsp"; 
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_2000_A: //2017년 연말정산 지급조서파일생성-파일생성
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_2000_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_5100_L: //2017년 연말정산 본인공제입력 장기주택저당차임금 팝업 -  조회
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_5100_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_5100_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_5101_A: //2017년 연말정산 장기주택저당차입금 팝업 저장버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_5101_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
						
				//2018년 연말정산 
					case HDYadjmWBMapping.HD_YADJM_2018_1119_A: //2018년 연말정산자료등록-임시저장
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1210_a(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1210_a.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1210_A: //2018년 연말정산자료등록-저장
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1210_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1213_A: //2018년 연말정산 기부금팝업저장버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1213_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1214_L: //2018년 연말정산 기부금 READY 조회 및 콤보구성
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1214_l  (req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1214_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1220_L: //2018년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1220_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1220_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_187001_A: //2018연말정산파일업로드 
						System.out.println("$$$ HD_YADJM_187001_A 서블릿 호출 됨!! $$$ ");
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_187001_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1221_L: //2018년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1221_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1221_l.jsp";
						break;		
					case HDYadjmWBMapping.HD_YADJM_2018_1231_L:
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1231_l(req, res); //2018년 연말정산 본인공제입력 연금팝업창-연금저축 조회
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1231_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1232_A: //2017년 연말정산자료등록-연금팝업창_저장/삭제버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1232_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1234_L: //2018년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1234_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1234_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1250_L: //2018년 연말정산자료등록-정산결과조회
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1250_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1251_L: //2018년 연말정산자료등록-정산결과조회(eip사용 )
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1250_l.jsp"; 
						break;	
					case HDYadjmWBMapping.HD_YADJM_2018_2000_A: //2017년 연말정산 지급조서파일생성-파일생성
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_2000_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
						
				/*  아래 멥핑은  2018년에 로직이 변경 된것이 없어서  기존 쿼리를 타도록 처리함   */
					case HDYadjmWBMapping.HD_YADJM_2018_1212_A: //2018년 연말정산 의료비 팝업 저장버튼
						wb = new HD_YADJM_1000WB(); 
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1212_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_5100_L: //2018년 연말정산 본인공제입력 장기주택저당차임금 팝업 -  조회
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2016_5100_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_5100_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_5101_A: //2018년 연말정산 장기주택저당차입금 팝업 저장버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2016_5101_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
				/*--------------------------------------------------------------*/		
						
					case HDYadjmWBMapping.HD_YADJM_6000_L: //2017년 연말정산 장기주택저당차입금 팝업 저장버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_6000_l(req, res);
						nextPage =  "/jsp/hd/yadjm/hd_yadjm_6000_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_6001_A: //2017년 연말정산 장기주택저당차입금 팝업 저장버튼
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_6001_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
						
						
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			} 
		return nextPage;
	}    
	
}
