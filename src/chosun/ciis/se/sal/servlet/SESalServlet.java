/***************************************************************************************************
 * 파일명 : SESalServlet.java
 * 기능 :   매출관리 서블릿
 * 작성일자 : 2009.03.31
 * 작성자 :   김대준
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.se.sal.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
//import chosun.ciis.co.smtb.servlet.CO_SMTB_1000WBMapping;
//import chosun.ciis.se.sal.wb.CO_SMTB_1000WB;
import chosun.ciis.se.sal.wb.*;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class SESalServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/sal/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("SESalServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SESalServlet : process : nextPage : " + nextPage);
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
     * SESalWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        SE_SAL_1000WB wb1000 = null;
        SE_SAL_1100WB wb1100 = null;
        SE_SAL_1200WB wb1200 = null;
        SE_SAL_1300WB wb1300 = null;
        SE_SAL_1400WB wb1400 = null;
        SE_SAL_1500WB wb1500 = null;
        SE_SAL_1600WB wb1600 = null;
        SE_SAL_1700WB wb1700 = null;
        SE_SAL_1800WB wb1800 = null;
        SE_SAL_2000WB wb2000 = null;
        SE_SAL_2100WB wb2100 = null;
        SE_SAL_2200WB wb2200 = null;
        SE_SAL_2300WB wb2300 = null;
        SE_SAL_2400WB wb2400 = null;
        SE_SAL_2500WB wb2500 = null;
        SE_SAL_2600WB wb2600 = null;
/*        SE_SAL_2700WB wb2700 = null;
        SE_SAL_2800WB wb2800 = null;
        SE_SAL_2900WB wb2900 = null;
*/
        SE_SAL_12300WB wb12300 = null;

        switch (pid) {
	        case SESalWBMapping.SE_SAL_1000:
	        	wb1000 = new SE_SAL_1000WB();
	    		wb1000.se_sal_1000_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1000_m.jsp";
	    		break;
	        case SESalWBMapping.SE_SAL_1010:
	        	wb1000 = new SE_SAL_1000WB();
	    		wb1000.se_sal_1010_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1010_l.jsp";
	    		break;
	        case SESalWBMapping.SE_SAL_1020:
	        	wb1000 = new SE_SAL_1000WB();
	    		wb1000.se_sal_1020_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1020_l.jsp";
	    		break;
	        case SESalWBMapping.SE_SAL_1030:
	        	wb1000 = new SE_SAL_1000WB();
	    		wb1000.se_sal_1030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SESalWBMapping.SE_SAL_1040:
	        	wb1000 = new SE_SAL_1000WB();
	    		wb1000.se_sal_1040_d(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	        case SESalWBMapping.SE_SAL_1050:
	        	wb1000 = new SE_SAL_1000WB();
	            System.out.println("SE_SAL_1050:::::::::::::::");
	    		wb1000.se_sal_1050_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1050_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1105:
				wb1100 = new SE_SAL_1100WB();
				wb1100.se_sal_1105_l(req, res);
				nextPage = "/jsp/se/sal/se_sal_1105_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_1110:
				wb1100 = new SE_SAL_1100WB();
				wb1100.se_sal_1110_l(req, res);
				nextPage = "/jsp/se/sal/se_sal_1110_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_1120:
				wb1100 = new SE_SAL_1100WB();
				wb1100.se_sal_1120_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESalWBMapping.SE_SAL_1200:
	        	wb1200 = new SE_SAL_1200WB();
	    		wb1200.se_sal_1200_m(req, res);
				nextPage = "/jsp/se/sal/se_sal_1200_m.jsp";
				break;
			case SESalWBMapping.SE_SAL_1210:
	        	wb1200 = new SE_SAL_1200WB();
	    		wb1200.se_sal_1210_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1210_l.jsp";
	    		break;
			case SESalWBMapping.SE_SAL_1220:
	        	wb1200 = new SE_SAL_1200WB();
	    		wb1200.se_sal_1220_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	    	case SESalWBMapping.SE_SAL_1300:
	        	wb1300 = new SE_SAL_1300WB();
        		wb1300.se_sal_1300_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1300_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1310:
	        	wb1300 = new SE_SAL_1300WB();
        		wb1300.se_sal_1310_s(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1310_s.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1320:
	        	wb1300 = new SE_SAL_1300WB();
        		wb1300.se_sal_1320_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1320_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1330:
	        	wb1300 = new SE_SAL_1300WB();
        		wb1300.se_sal_1330_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1340:
	        	wb1300 = new SE_SAL_1300WB();
        		wb1300.se_sal_1340_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1350:
	        	wb1300 = new SE_SAL_1300WB();
        		wb1300.se_sal_1350_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1400:
        		wb1400 = new SE_SAL_1400WB();
        		wb1400.se_sal_1400_m(req, res);
        		nextPage = "/jsp/se/sal/se_sal_1400_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1410:
	        	wb1400 = new SE_SAL_1400WB();
        		wb1400.se_sal_1410_s(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1410_s.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1420:
	        	wb1400 = new SE_SAL_1400WB();
        		wb1400.se_sal_1420_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1500:
        		wb1500 = new SE_SAL_1500WB();
				wb1500.se_sal_1500_m(req, res);
				nextPage = "/jsp/se/sal/se_sal_1500_m.jsp";
				break;
        	case SESalWBMapping.SE_SAL_1510:
	        	wb1500 = new SE_SAL_1500WB();
        		wb1500.se_sal_1510_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1510_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1520:
	        	wb1500 = new SE_SAL_1500WB();
        		wb1500.se_sal_1520_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1600:
	        	wb1600 = new SE_SAL_1600WB();
        		wb1600.se_sal_1600_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1600_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1610:
	        	wb1600 = new SE_SAL_1600WB();
        		wb1600.se_sal_1610_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1610_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1620:
	        	wb1600 = new SE_SAL_1600WB();
        		wb1600.se_sal_1620_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1630:
	        	wb1600 = new SE_SAL_1600WB();
        		wb1600.se_sal_1630_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1700:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1700_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1700_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1710:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1710_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1710_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1720:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1720_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1730:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1730_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1730_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1740:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1740_a(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1740_a.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1750:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1750_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1750_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1760:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1760_a(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1760_a.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1770:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1770_u(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1780:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1780_a(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1780_a.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1785:
	        	wb1700 = new SE_SAL_1700WB();
        		wb1700.se_sal_1785_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1800:
	        	wb1800 = new SE_SAL_1800WB();
        		wb1800.se_sal_1800_m(req, res);
				nextPage = "/jsp/se/sal/se_sal_1800_m.jsp";
				break;
        	case SESalWBMapping.SE_SAL_1810:
	        	wb1800 = new SE_SAL_1800WB();
        		wb1800.se_sal_1810_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_1810_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_1820:
	        	wb1800 = new SE_SAL_1800WB();
        		wb1800.se_sal_1820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2000:
        		wb2000 = new SE_SAL_2000WB();
                wb2000.se_sal_2000_m(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2000_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2010:
	        	wb2000 = new SE_SAL_2000WB();
        		wb2000.se_sal_2010_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2010_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2100:
	        	wb2100 = new SE_SAL_2100WB();
        		wb2100.se_sal_2100_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2100_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2110:
	        	wb2100 = new SE_SAL_2100WB();
        		wb2100.se_sal_2110_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2110_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2200:
	        	wb2200 = new SE_SAL_2200WB();
        		wb2200.se_sal_2200_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2200_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2210:
	        	wb2200 = new SE_SAL_2200WB();
        		wb2200.se_sal_2210_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2210_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2300:
	        	wb2300 = new SE_SAL_2300WB();
        		wb2300.se_sal_2300_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2300_m.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2310:
	        	wb2300 = new SE_SAL_2300WB();
        		wb2300.se_sal_2310_s(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2310_s.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2320:
	        	wb2300 = new SE_SAL_2300WB();
        		wb2300.se_sal_2320_l(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2320_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_2400:
	        	wb2400 = new SE_SAL_2400WB();
        		wb2400.se_sal_2400_m(req, res);
	    		nextPage = "/jsp/se/sal/se_sal_2400_m.jsp";
	    		break;
	    	//계산서단건등록
			case SESalWBMapping.SE_SAL_2500:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2500_m(req, res);
				nextPage = "/jsp/se/sal/se_sal_2500_m.jsp";
				break;
			case SESalWBMapping.SE_SAL_2510:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2510_l(req, res);
				nextPage = "/jsp/se/sal/se_sal_2510_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2520:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2520_l(req, res);
				nextPage = "/jsp/se/sal/se_sal_2520_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2530:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2530_l(req, res);
				nextPage = "/jsp/se/sal/se_sal_2530_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2535:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2535_l(req, res);
				nextPage = "/jsp/se/sal/se_sal_2535_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2537:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2537_s(req, res);
				nextPage = "/jsp/se/sal/se_sal_2537_s.jsp";
				break;
			case SESalWBMapping.SE_SAL_2540:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2540_a(req, res);
				nextPage = "/jsp/se/sal/se_sal_2540_a.jsp";
				break;
			case SESalWBMapping.SE_SAL_2550:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESalWBMapping.SE_SAL_2560:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2560_a(req, res);
				nextPage = "/jsp/se/sal/se_sal_2560_a.jsp";
				break;
			case SESalWBMapping.SE_SAL_2570:
				wb2500 = new SE_SAL_2500WB();
				wb2500.se_sal_2570_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESalWBMapping.SE_SAL_2600:
				wb2600 = new SE_SAL_2600WB();
				wb2600.se_sal_2600_m(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2600_m.jsp";
				break;
			case SESalWBMapping.SE_SAL_2610:
				wb2600 = new SE_SAL_2600WB();
				wb2600.se_sal_2610_l(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2610_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2620:
				wb2600 = new SE_SAL_2600WB();
				wb2600.se_sal_2620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESalWBMapping.SE_SAL_2630:
				wb2600 = new SE_SAL_2600WB();
				wb2600.se_sal_2630_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
/*			case SESalWBMapping.SE_SAL_2700:
				wb2700 = new SE_SAL_2700WB();
				wb2700.se_sal_2700_m(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2700_m.jsp";
				break;
			case SESalWBMapping.SE_SAL_2710:
				wb2700 = new SE_SAL_2700WB();
				wb2700.se_sal_2710_l(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2710_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2720:
				wb2700 = new SE_SAL_2700WB();
				wb2700.se_sal_2720_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESalWBMapping.SE_SAL_2730:
				wb2700 = new SE_SAL_2700WB();
				wb2700.se_sal_2730_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESalWBMapping.SE_SAL_2800:
				wb2800 = new SE_SAL_2800WB();
				wb2800.se_sal_2800_l(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2800_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2810:
				wb2800 = new SE_SAL_2800WB();
				wb2800.se_sal_2810_l(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2810_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2815:
				wb2800 = new SE_SAL_2800WB();
				wb2800.se_sal_2815_l(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2815_l.jsp";
				break;
			case SESalWBMapping.SE_SAL_2820:
				wb2800 = new SE_SAL_2800WB();
				wb2800.se_sal_2820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESalWBMapping.SE_SAL_2910:
				wb2900 = new SE_SAL_2900WB();
				wb2900.se_sal_2910_l(req, res);
        		nextPage = "/jsp/se/sal/se_sal_2910_l.jsp";
				break;
*/

/*******************************************모바일용******************************************************************/

        	case SESalWBMapping.SE_SAL_12320: // 매출관리-출장전자료조회-조회리스트-> / 모바일) 지대마감-지대청구
	        	wb12300 = new SE_SAL_12300WB();
        		wb12300.se_sal_12320_l(req, res);
	    		nextPage = "/jsp/se/sal/mo_se_sal_12320_l.jsp";
	    		break;
        	case SESalWBMapping.SE_SAL_12321: // 입금관리-지대입금관리-지대입금률현황 NEW / 모바일) 지대마감-지대입금률현황
        		wb12300 = new SE_SAL_12300WB();
        		wb12300.se_mo_rcp_2510_l(req, res);
        		nextPage = "/jsp/se/sal/mo_se_sal_12321_l.jsp";
        		break;
        	case SESalWBMapping.SE_SAL_12322: // 입금관리-지대입금관리-입금확인(가상계좌) / 모바일) 지대마감-입금확인(가상계좌)
        		wb12300 = new SE_SAL_12300WB();
        		wb12300.se_rcp_1010_l(req, res);
        		nextPage = "/jsp/se/sal/mo_se_sal_12322_l.jsp";
        		break;
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }

}
