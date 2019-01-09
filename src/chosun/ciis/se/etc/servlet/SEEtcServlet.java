/***************************************************************************************************
 * 파일명 : SEEtcServlet.java
 * 기능 :   기타관리 서블릿
 * 작성일자 : 2009.03.02
 * 작성자 :   김대준
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.se.etc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.se.etc.wb.SE_ETC_1000WB;
import chosun.ciis.se.etc.wb.SE_ETC_1100WB;
import chosun.ciis.se.etc.wb.SE_ETC_1200WB;
import chosun.ciis.se.etc.wb.SE_ETC_1300WB;
import chosun.ciis.se.etc.wb.SE_ETC_1400WB;
import chosun.ciis.se.etc.wb.SE_ETC_1500WB;
import chosun.ciis.se.etc.wb.SE_ETC_1600WB;
import chosun.ciis.se.etc.wb.SE_ETC_1700WB;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class SEEtcServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/etc/";
            iPid = extractPid(req, servletMappedUrl); 
            
            System.out.println("SEEtcServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SEEtcServlet : process : nextPage : " + nextPage);
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
     * SEEtcWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        SE_ETC_1000WB wb1000 = null;
        SE_ETC_1100WB wb1100 = null;
        SE_ETC_1200WB wb1200 = null;
        SE_ETC_1300WB wb1300 = null;
        SE_ETC_1400WB wb1400 = null;
        SE_ETC_1500WB wb1500 = null;
        SE_ETC_1600WB wb1600 = null;
        SE_ETC_1700WB wb1700 = null;
        
        switch (pid) {
        	case SEEtcWBMapping.SE_ETC_1000:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1000:::::::::::::::");
	    		wb1000.se_etc_1000_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1000_m.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1010:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1010:::::::::::::::");
	    		wb1000.se_etc_1010_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1010_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1020:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1020:::::::::::::::");
	    		wb1000.se_etc_1020_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1020_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1030:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1030:::::::::::::::");
	    		wb1000.se_etc_1030_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1030_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1040:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1040:::::::::::::::");
	    		wb1000.se_etc_1040_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1050:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1050:::::::::::::::");
	    		wb1000.se_etc_1050_u(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1060:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1060:::::::::::::::");
	    		wb1000.se_etc_1060_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1070:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1070:::::::::::::::");
	    		wb1000.se_etc_1070_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1090:
        		wb1000 = new SE_ETC_1000WB();
	            System.out.println("SE_ETC_1090:::::::::::::::");
	    		wb1000.se_etc_1090_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1100:
        		wb1100 = new SE_ETC_1100WB();
	            System.out.println("SE_ETC_1100:::::::::::::::");
	    		wb1100.se_etc_1100_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1100_m.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1110:
        		wb1100 = new SE_ETC_1100WB();
	            System.out.println("SE_ETC_1110:::::::::::::::");
	    		wb1100.se_etc_1110_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1110_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1200:
        		wb1200 = new SE_ETC_1200WB();
	            System.out.println("SE_ETC_1200:::::::::::::::");
	    		wb1200.se_etc_1200_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1200_m.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1210:
        		wb1200 = new SE_ETC_1200WB();
	            System.out.println("SE_ETC_1210:::::::::::::::");
	    		wb1200.se_etc_1210_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1210_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1220:
        		wb1200 = new SE_ETC_1200WB();
	            System.out.println("SE_ETC_1220:::::::::::::::");
	    		wb1200.se_etc_1220_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1220_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1230:
        		wb1200 = new SE_ETC_1200WB();
	            System.out.println("SE_ETC_1230:::::::::::::::");
	    		wb1200.se_etc_1230_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1240:
        		wb1200 = new SE_ETC_1200WB();
	            System.out.println("SE_ETC_1240:::::::::::::::");
	    		wb1200.se_etc_1240_u(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1300:
        		wb1300 = new SE_ETC_1300WB();
	            System.out.println("SE_ETC_1300:::::::::::::::");
	    		wb1300.se_etc_1300_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1300_m.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1310:
        		wb1300 = new SE_ETC_1300WB();
	            System.out.println("SE_ETC_1310:::::::::::::::");
	    		wb1300.se_etc_1310_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1310_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1320:
        		wb1300 = new SE_ETC_1300WB();
	            System.out.println("SE_ETC_1320:::::::::::::::");
	    		wb1300.se_etc_1320_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1330:
        		wb1300 = new SE_ETC_1300WB();
	            System.out.println("SE_ETC_1330:::::::::::::::");
	    		wb1300.se_etc_1330_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        	case SEEtcWBMapping.SE_ETC_1340:
        		wb1300 = new SE_ETC_1300WB();
	            System.out.println("SE_ETC_1340:::::::::::::::");
	    		wb1300.se_etc_1340_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;		
        	case SEEtcWBMapping.SE_ETC_1400:
        		wb1400 = new SE_ETC_1400WB();
	            System.out.println("SE_ETC_1400:::::::::::::::");
	    		wb1400.se_etc_1400_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1400_m.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1500:
        		wb1500 = new SE_ETC_1500WB();
	            System.out.println("SE_ETC_1500:::::::::::::::");
	    		wb1500.se_etc_1500_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1500_m.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1510:
        		wb1500 = new SE_ETC_1500WB();
	            System.out.println("SE_ETC_1510:::::::::::::::");
	    		wb1500.se_etc_1510_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1510_l.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1520:
        		wb1500 = new SE_ETC_1500WB();
	            System.out.println("SE_ETC_1520:::::::::::::::");
	    		wb1500.se_etc_1520_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1530:
        		wb1500 = new SE_ETC_1500WB();
	            System.out.println("SE_ETC_1530:::::::::::::::");
	    		wb1500.se_etc_1530_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1600:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1600:::::::::::::::");
	    		wb1600.se_etc_1600_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1600_m.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1610:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1610:::::::::::::::");
	    		wb1600.se_etc_1610_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1610_l.jsp";
	    		break;	
        	case SEEtcWBMapping.SE_ETC_1620:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1620:::::::::::::::");
	    		wb1600.se_etc_1620_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SEEtcWBMapping.SE_ETC_1630:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1630:::::::::::::::");
	    		wb1600.se_etc_1630_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
        	case SEEtcWBMapping.SE_ETC_1640:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1640:::::::::::::::");
	    		wb1600.se_etc_1640_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
            case SEEtcWBMapping.SE_ETC_1650:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1650:::::::::::::::");
	    		wb1600.se_etc_1650_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
            case SEEtcWBMapping.SE_ETC_1660:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1660:::::::::::::::");
	    		wb1600.se_etc_1660_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
            case SEEtcWBMapping.SE_ETC_1670:
        		wb1600 = new SE_ETC_1600WB();
	            System.out.println("SE_ETC_1670:::::::::::::::");
	    		wb1600.se_etc_1670_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;	
            case SEEtcWBMapping.SE_ETC_1700:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1700:::::::::::::::");
	    		wb1700.se_etc_1700_m(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1700_m.jsp";
	    		break;	
            case SEEtcWBMapping.SE_ETC_1710:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1710:::::::::::::::");
	    		wb1700.se_etc_1710_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1710_l.jsp";
	    		break;
            case SEEtcWBMapping.SE_ETC_1720:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1720:::::::::::::::");
	    		wb1700.se_etc_1720_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1720_l.jsp";
	    		break;
            case SEEtcWBMapping.SE_ETC_1730:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1730:::::::::::::::");
	    		wb1700.se_etc_1730_l(req, res);
	    		nextPage = "/jsp/se/etc/se_etc_1730_l.jsp";
	    		break;
            case SEEtcWBMapping.SE_ETC_1740:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1740:::::::::::::::");
	    		wb1700.se_etc_1740_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;        
            case SEEtcWBMapping.SE_ETC_1750:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1750:::::::::::::::");
	    		wb1700.se_etc_1750_u(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
            case SEEtcWBMapping.SE_ETC_1760:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1760:::::::::::::::");
	    		wb1700.se_etc_1760_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
            case SEEtcWBMapping.SE_ETC_1770:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1770:::::::::::::::");
	    		wb1700.se_etc_1770_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
            case SEEtcWBMapping.SE_ETC_1790:
        		wb1700 = new SE_ETC_1700WB();
	            System.out.println("SE_ETC_1790:::::::::::::::");
	    		wb1700.se_etc_1790_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
