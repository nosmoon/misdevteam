/***************************************************************************************************
 * 파일명 : SEBoiServlet.java
 * 기능 : 지국관리
 * 작성일자 : 2009-01-05
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.se.boi.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.se.boi.wb.*;

public class SEBoiServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/boi/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SEBoiServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SEBoiServlet : process : nextPage : " + nextPage);
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        BaseWB workbean = null;

        switch (pid) {
        	//지국정보관리
        	case SEBoiWBMapping.SE_BOI_1000:
         		workbean = new SE_BOI_1000WB();
         		((SE_BOI_1000WB)workbean).se_boi_1000_m(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1000_m.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1010:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1010_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1010_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1020:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1020_s(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1020_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1030:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1030_s(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1030_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1035:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1035_s(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1035_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1040:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1040_s(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1040_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1050:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1050_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1050_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1055:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1055_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1055_l.jsp";
        		break;
			case SEBoiWBMapping.SE_BOI_1056:
				workbean = new SE_BOI_1000WB();
				((SE_BOI_1000WB)workbean).se_boi_1056_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1056_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1057:
				workbean = new SE_BOI_1000WB();
				((SE_BOI_1000WB)workbean).se_boi_1057_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1057_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1058:
				workbean = new SE_BOI_1000WB();
				((SE_BOI_1000WB)workbean).se_boi_1058_s(req, res);
				nextPage = "/jsp/se/boi/se_boi_1058_s.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1059:
				workbean = new SE_BOI_1000WB();
				((SE_BOI_1000WB)workbean).se_boi_1059_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1059_l.jsp";
				break;
        	case SEBoiWBMapping.SE_BOI_1060:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1060_a(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1060_a.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1070:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1070_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1080:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1080_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1090:
        		workbean = new SE_BOI_1000WB();
        		((SE_BOI_1000WB)workbean).se_boi_1090_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
			case SEBoiWBMapping.SE_BOI_1091:
				workbean = new SE_BOI_1000WB();
				((SE_BOI_1000WB)workbean).se_boi_1091_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1092: //2017-04-27 장선희추가. 센터대표사진
				workbean = new SE_BOI_1000WB();
				((SE_BOI_1000WB)workbean).se_boi_1092_s(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1092_s.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1093: //2017-05-15 장선희추가 test용
				workbean = new SE_BOI_1000WB();
				((SE_BOI_1000WB)workbean).se_boi_1093_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1093_l.jsp";
				break;
        	//지역정보관리
        	case SEBoiWBMapping.SE_BOI_1100:
        		workbean = new SE_BOI_1100WB();
        		((SE_BOI_1100WB)workbean).se_boi_1100_m(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1100_m.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1110:
        		workbean = new SE_BOI_1100WB();
        		((SE_BOI_1100WB)workbean).se_boi_1110_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1110_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1120:
        		workbean = new SE_BOI_1100WB();
        		((SE_BOI_1100WB)workbean).se_boi_1120_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	//지국주소일괄변경
        	case SEBoiWBMapping.SE_BOI_1200:
        		workbean = new SE_BOI_1200WB();
        		((SE_BOI_1200WB)workbean).se_boi_1200_m(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1200_m.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1210:
        		workbean = new SE_BOI_1200WB();
        		((SE_BOI_1200WB)workbean).se_boi_1210_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1210_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1220:
        		workbean = new SE_BOI_1200WB();
        		((SE_BOI_1200WB)workbean).se_boi_1220_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	//지국현황조회
        	case SEBoiWBMapping.SE_BOI_1300:
        		workbean = new SE_BOI_1300WB();
        		((SE_BOI_1300WB)workbean).se_boi_1300_m(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1300_m.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1310:
        		workbean = new SE_BOI_1300WB();
        		((SE_BOI_1300WB)workbean).se_boi_1310_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1310_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1320:
        		workbean = new SE_BOI_1300WB();
        		((SE_BOI_1300WB)workbean).se_boi_1320_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1320_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1330:
        		workbean = new SE_BOI_1300WB();
        		((SE_BOI_1300WB)workbean).se_boi_1330_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1330_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1340:
        		workbean = new SE_BOI_1300WB();
        		((SE_BOI_1300WB)workbean).se_boi_1340_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1340_l.jsp";
        		break;
        	//지국장 현황조회
        	case SEBoiWBMapping.SE_BOI_1400:
        		workbean = new SE_BOI_1400WB();
        		((SE_BOI_1400WB)workbean).se_boi_1400_m(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1400_m.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1410:
        		workbean = new SE_BOI_1400WB();
        		((SE_BOI_1400WB)workbean).se_boi_1410_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1410_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1420:
        		workbean = new SE_BOI_1400WB();
        		((SE_BOI_1400WB)workbean).se_boi_1420_s(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1420_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1430:
        		workbean = new SE_BOI_1400WB();
        		((SE_BOI_1400WB)workbean).se_boi_1430_s(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1430_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1440:
        		workbean = new SE_BOI_1400WB();
        		((SE_BOI_1400WB)workbean).se_boi_1440_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1440_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1450:
        		workbean = new SE_BOI_1400WB();
        		((SE_BOI_1400WB)workbean).se_boi_1450_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1450_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_1460:
        		workbean = new SE_BOI_1400WB();
        		((SE_BOI_1400WB)workbean).se_boi_1460_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_1460_l.jsp";
        		break;
        	//주소관련발행
			case SEBoiWBMapping.SE_BOI_1500:
				workbean = new SE_BOI_1500WB();
				((SE_BOI_1500WB)workbean).se_boi_1500_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_1500_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1510:
				nextPage = "/jsp/se/boi/se_boi_1510_p.jsp";
				break;

			//인수인계처리
			case SEBoiWBMapping.SE_BOI_1700:
				workbean = new SE_BOI_1700WB();
				((SE_BOI_1700WB)workbean).se_boi_1700_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_1700_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1710:
				workbean = new SE_BOI_1700WB();
				((SE_BOI_1700WB)workbean).se_boi_1710_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1710_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1720:
				workbean = new SE_BOI_1700WB();
				((SE_BOI_1700WB)workbean).se_boi_1720_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1720_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1740:
				workbean = new SE_BOI_1700WB();
				((SE_BOI_1700WB)workbean).se_boi_1740_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//환불처리
			case SEBoiWBMapping.SE_BOI_1800:
				workbean = new SE_BOI_1800WB();
				((SE_BOI_1800WB)workbean).se_boi_1800_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_1800_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1810:
				workbean = new SE_BOI_1800WB();
				((SE_BOI_1800WB)workbean).se_boi_1810_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1810_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1820:
				workbean = new SE_BOI_1800WB();
				((SE_BOI_1800WB)workbean).se_boi_1820_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1820_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1830:
				workbean = new SE_BOI_1800WB();
				((SE_BOI_1800WB)workbean).se_boi_1830_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1830_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1840:
				workbean = new SE_BOI_1800WB();
				((SE_BOI_1800WB)workbean).se_boi_1840_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1850:
				workbean = new SE_BOI_1800WB();
				((SE_BOI_1800WB)workbean).se_boi_1850_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//전세보증금인수인계
			case SEBoiWBMapping.SE_BOI_1900:
				workbean = new SE_BOI_1900WB();
				((SE_BOI_1900WB)workbean).se_boi_1900_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_1900_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1910:
				workbean = new SE_BOI_1900WB();
				((SE_BOI_1900WB)workbean).se_boi_1910_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1910_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1920:
				workbean = new SE_BOI_1900WB();
				((SE_BOI_1900WB)workbean).se_boi_1920_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1920_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1930:
				workbean = new SE_BOI_1900WB();
				((SE_BOI_1900WB)workbean).se_boi_1930_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_1930_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_1940:
				workbean = new SE_BOI_1900WB();
				((SE_BOI_1900WB)workbean).se_boi_1940_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//타지국인수인계
			case SEBoiWBMapping.SE_BOI_2000:
				workbean = new SE_BOI_2000WB();
				((SE_BOI_2000WB)workbean).se_boi_2000_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2000_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2010:
				workbean = new SE_BOI_2000WB();
				((SE_BOI_2000WB)workbean).se_boi_2010_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2010_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2020:
				workbean = new SE_BOI_2000WB();
				((SE_BOI_2000WB)workbean).se_boi_2020_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2020_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2030:
				workbean = new SE_BOI_2000WB();
				((SE_BOI_2000WB)workbean).se_boi_2030_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2030_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2040:
				workbean = new SE_BOI_2000WB();
				((SE_BOI_2000WB)workbean).se_boi_2040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2050:
				workbean = new SE_BOI_2000WB();
				((SE_BOI_2000WB)workbean).se_boi_2050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//타지국전세보증금인수인계
			case SEBoiWBMapping.SE_BOI_2100:
				workbean = new SE_BOI_2100WB();
				((SE_BOI_2100WB)workbean).se_boi_2100_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2100_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2110:
				workbean = new SE_BOI_2100WB();
				((SE_BOI_2100WB)workbean).se_boi_2110_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2110_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2120:
				workbean = new SE_BOI_2100WB();
				((SE_BOI_2100WB)workbean).se_boi_2120_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2120_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2130:
				workbean = new SE_BOI_2100WB();
				((SE_BOI_2100WB)workbean).se_boi_2130_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2130_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2140:
				workbean = new SE_BOI_2100WB();
				((SE_BOI_2100WB)workbean).se_boi_2140_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2150:
				workbean = new SE_BOI_2100WB();
				((SE_BOI_2100WB)workbean).se_boi_2150_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
	        	//지국인구구성
			case SEBoiWBMapping.SE_BOI_2210:
        		workbean = new SE_BOI_2200WB();
        		((SE_BOI_2200WB)workbean).se_boi_2210_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_2210_l.jsp";
        		break;
			case SEBoiWBMapping.SE_BOI_2220:
        		workbean = new SE_BOI_2200WB();
        		((SE_BOI_2200WB)workbean).se_boi_2220_l(req, res);
        		nextPage = "/jsp/se/boi/se_boi_2220_l.jsp";
        		break;
			case SEBoiWBMapping.SE_BOI_2240:
				workbean = new SE_BOI_2200WB();
				((SE_BOI_2200WB)workbean).se_boi_2240_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2250:
				workbean = new SE_BOI_2200WB();
				((SE_BOI_2200WB)workbean).se_boi_2250_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2260:
			    workbean = new SE_BOI_2200WB();
			    ((SE_BOI_2200WB)workbean).se_boi_2260_a(req, res);
			          nextPage = "/common/jsp/resultMsg.jsp";
			    break;
			//정리구좌이월
			case SEBoiWBMapping.SE_BOI_2300:
				workbean = new SE_BOI_2300WB();
				((SE_BOI_2300WB)workbean).se_boi_2300_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2300_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2310:
				workbean = new SE_BOI_2300WB();
				((SE_BOI_2300WB)workbean).se_boi_2310_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2310_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2320:
				workbean = new SE_BOI_2300WB();
				((SE_BOI_2300WB)workbean).se_boi_2320_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2320_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2340:
				workbean = new SE_BOI_2300WB();
				((SE_BOI_2300WB)workbean).se_boi_2340_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//정리구좌대손처리
			case SEBoiWBMapping.SE_BOI_2400:
				workbean = new SE_BOI_2400WB();
				((SE_BOI_2400WB)workbean).se_boi_2400_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2400_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2410:
				workbean = new SE_BOI_2400WB();
				((SE_BOI_2400WB)workbean).se_boi_2410_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2410_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2440:
				workbean = new SE_BOI_2400WB();
				((SE_BOI_2400WB)workbean).se_boi_2440_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2450:
				workbean = new SE_BOI_2400WB();
				((SE_BOI_2400WB)workbean).se_boi_2450_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//정리구좌입금
			case SEBoiWBMapping.SE_BOI_2500:
				workbean = new SE_BOI_2500WB();
				((SE_BOI_2500WB)workbean).se_boi_2500_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2500_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2510:
				workbean = new SE_BOI_2500WB();
				((SE_BOI_2500WB)workbean).se_boi_2510_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2510_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2520:
				workbean = new SE_BOI_2500WB();
				((SE_BOI_2500WB)workbean).se_boi_2520_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2520_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2530:
				workbean = new SE_BOI_2500WB();
				((SE_BOI_2500WB)workbean).se_boi_2530_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2530_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2540:
				workbean = new SE_BOI_2500WB();
				((SE_BOI_2500WB)workbean).se_boi_2540_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2550:
				workbean = new SE_BOI_2500WB();
				((SE_BOI_2500WB)workbean).se_boi_2550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//정리구좌검색
			case SEBoiWBMapping.SE_BOI_2600:
				workbean = new SE_BOI_2600WB();
				((SE_BOI_2600WB)workbean).se_boi_2600_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2600_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2610:
				workbean = new SE_BOI_2600WB();
				((SE_BOI_2600WB)workbean).se_boi_2610_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2610_l.jsp";
				break;
			//센터종합정보
			case SEBoiWBMapping.SE_BOI_2700:
				workbean = new SE_BOI_2700WB();
				((SE_BOI_2700WB)workbean).se_boi_2700_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2700_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2710:
				workbean = new SE_BOI_2700WB();
				((SE_BOI_2700WB)workbean).se_boi_2710_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2710_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2720:
				workbean = new SE_BOI_2700WB();
				((SE_BOI_2700WB)workbean).se_boi_2720_s(req, res);
				nextPage = "/jsp/se/boi/se_boi_2720_s.jsp";
				break;

			//신문대금담보조회
			case SEBoiWBMapping.SE_BOI_2800:
				workbean = new SE_BOI_2800WB();
				((SE_BOI_2800WB)workbean).se_boi_2800_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2800_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2810:
				workbean = new SE_BOI_2800WB();
				((SE_BOI_2800WB)workbean).se_boi_2810_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2810_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2820:
				workbean = new SE_BOI_2800WB();
				((SE_BOI_2800WB)workbean).se_boi_2820_s(req, res);
				nextPage = "/jsp/se/boi/se_boi_2820_s.jsp";
				break;

			//보증계약통보
			case SEBoiWBMapping.SE_BOI_2900:
				workbean = new SE_BOI_2900WB();
				((SE_BOI_2900WB)workbean).se_boi_2900_m(req, res);
				nextPage = "/jsp/se/boi/se_boi_2900_m.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2910:
				workbean = new SE_BOI_2900WB();
				((SE_BOI_2900WB)workbean).se_boi_2910_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_2910_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_2920:
				workbean = new SE_BOI_2900WB();
				((SE_BOI_2900WB)workbean).se_boi_2920_s(req, res);
				nextPage = "/jsp/se/boi/se_boi_2920_s.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_3000: // 모바일 개선사항 - 초기화면
				workbean = new SE_BOI_3000WB();
				((SE_BOI_3000WB)workbean).se_boi_3000_a(req, res);
				nextPage = "/jsp/se/boi/se_boi_3000_a.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_3010: // 모바일 개선사항 - 리스트 조회
				workbean = new SE_BOI_3000WB();
				((SE_BOI_3000WB)workbean).se_boi_3010_l(req, res);
				nextPage = "/jsp/se/boi/se_boi_3010_l.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_3020: // 모바일 개선사항 - 상세 조회
				workbean = new SE_BOI_3000WB();
				((SE_BOI_3000WB)workbean).se_boi_3020_s(req, res);
				nextPage = "/jsp/se/boi/se_boi_3020_s.jsp";
				break;
			case SEBoiWBMapping.SE_BOI_3030: // 모바일 개선사항 - 수정
				workbean = new SE_BOI_3000WB();
				((SE_BOI_3000WB)workbean).se_boi_3030_u(req, res);
				nextPage = "/jsp/se/boi/se_boi_3030_u.jsp";
				break;

/*******************************************모바일용******************************************************************/
			//센터정보관리
        	case SEBoiWBMapping.SE_BOI_11000:		// 센터정보관리-초기화면
         		workbean = new SE_BOI_11000WB();
         		((SE_BOI_11000WB)workbean).se_boi_1000_m(req, res);
        		nextPage = "/jsp/se/boi/mo_se_boi_11000_m.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_11010:    //센터검색리스트
        		workbean = new SE_BOI_11000WB();
        		((SE_BOI_11000WB)workbean).se_boi_1010_l(req, res);
        		nextPage = "/jsp/se/boi/mo_se_boi_11010_l.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_11020:	 //센터기본정보상세
        		workbean = new SE_BOI_11000WB();
        		((SE_BOI_11000WB)workbean).se_boi_1020_s(req, res);
        		nextPage = "/jsp/se/boi/mo_se_boi_11020_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_11030:	//센터대표정보
        		workbean = new SE_BOI_11000WB();
        		((SE_BOI_11000WB)workbean).se_boi_1030_s(req, res);
        		nextPage = "/jsp/se/boi/mo_se_boi_11030_s.jsp";
        		break;
        	case SEBoiWBMapping.SE_BOI_11040: //센터보증인정보
        		workbean = new SE_BOI_11000WB();
        		((SE_BOI_11000WB)workbean).se_boi_1040_s(req, res);
        		nextPage = "/jsp/se/boi/mo_se_boi_11040_s.jsp";
        		break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }

}
