/***************************************************************************************************
 * 파일명 : SESndServlet.java
 * 기능 :   발송관리 서블릿
 * 작성일자 : 2009.01.20
 * 작성자 :   김대준
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.se.snd.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.se.snd.wb.*;
import chosun.ciis.ss.sls.rdr.servlet.SSReaderWBMapping;
import chosun.ciis.ss.sls.rdr.wb.SSReader11000WB;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class SESndServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/snd/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("SESndServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SESndServlet : process : nextPage : " + nextPage);
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
     * SESndWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        SE_SND_1000WB wb1000 = null;
        SE_SND_1100WB wb1100 = null;
        SE_SND_1200WB wb1200 = null;
        SE_SND_1300WB wb1300 = null;
        SE_SND_1400WB wb1400 = null;
        SE_SND_1500WB wb1500 = null;
        SE_SND_1600WB wb1600 = null;
        SE_SND_1800WB wb1800 = null;
        SE_SND_1900WB wb1900 = null;
        SE_SND_2000WB wb2000 = null;
        SE_SND_2200WB wb2200 = null;
        SE_SND_2300WB wb2300 = null;
        SE_SND_2400WB wb2400 = null;
        SE_SND_2500WB wb2500 = null;
        SE_SND_2600WB wb2600 = null;
        SE_SND_2700WB wb2700 = null;
        SE_SND_2800WB wb2800 = null;
        SE_SND_2900WB wb2900 = null;
        SE_SND_3000WB wb3000 = null;
        SE_SND_3400WB wb3400 = null;
        SE_SND_3500WB wb3500 = null;
        SE_SND_3600WB wb3600 = null;

        SE_SND_11800WB wb11800 = null;


        switch (pid) {
        	case SESndWBMapping.SE_SND_1000:
	        	wb1000 = new SE_SND_1000WB();
	            System.out.println("SE_SND_1000:::::::::::::::");
	    		wb1000.se_snd_1000_m(req, res);
	    		nextPage = "/jsp/se/snd/se_snd_1000_m.jsp";
	    		break;
        	case SESndWBMapping.SE_SND_1010:
	        	wb1000 = new SE_SND_1000WB();
	            System.out.println("SE_SND_1010:::::::::::::::");
	    		wb1000.se_snd_1010_l(req, res);
	    		nextPage = "/jsp/se/snd/se_snd_1010_l.jsp";
	    		break;
        	case SESndWBMapping.SE_SND_1020:
	        	wb1000 = new SE_SND_1000WB();
	            System.out.println("SE_SND_1020:::::::::::::::");
	    		wb1000.se_snd_1020_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESndWBMapping.SE_SND_1030:
	        	wb1000 = new SE_SND_1000WB();
	            System.out.println("SE_SND_1030:::::::::::::::");
	    		wb1000.se_snd_1030_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case SESndWBMapping.SE_SND_1040:
	        	wb1000 = new SE_SND_1000WB();
	            System.out.println("SE_SND_1040:::::::::::::::");
	    		wb1000.se_snd_1040_l(req, res);
	    		nextPage = "/jsp/se/snd/se_snd_1040_l.jsp";
	    		break;
	        case SESndWBMapping.SE_SND_1100:
	        	wb1100 = new SE_SND_1100WB();
                System.out.println("SE_SND_1210:::::::::::::::");
        		wb1100.se_snd_1100_m(req, res);
	    		nextPage = "/jsp/se/snd/se_snd_1100_m.jsp";
	    		break;
	        case SESndWBMapping.SE_SND_1110:
        		wb1100 = new SE_SND_1100WB();
                System.out.println("SE_SND_1110:::::::::::::::");
        		wb1100.se_snd_1110_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1110_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1120:
        		wb1100 = new SE_SND_1100WB();
                System.out.println("SE_SND_1120:::::::::::::::");
        		wb1100.se_snd_1120_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1120_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1130:
        		wb1100 = new SE_SND_1100WB();
                System.out.println("SE_SND_1130:::::::::::::::");
                wb1100.se_snd_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1140:
        		wb1100 = new SE_SND_1100WB();
                System.out.println("SE_SND_1140:::::::::::::::");
        		wb1100.se_snd_1140_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1140_l.jsp";
        		break;
        	case SESndWBMapping.SE_SND_1200:
        		nextPage = "/jsp/se/snd/se_snd_1200.jsp";
        		break;
        	case SESndWBMapping.SE_SND_1210:
        		wb1200 = new SE_SND_1200WB();
                System.out.println("SE_SND_1210:::::::::::::::");
        		wb1200.se_snd_1210_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1210_l.jsp";
        		break;
        	case SESndWBMapping.SE_SND_1220:
        		wb1200 = new SE_SND_1200WB();
                System.out.println("SE_SND_1220:::::::::::::::");
                wb1200.se_snd_1220_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case SESndWBMapping.SE_SND_1230:
        		wb1200 = new SE_SND_1200WB();
                System.out.println("SE_SND_1230:::::::::::::::");
        		wb1200.se_snd_1230_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1230_l.jsp";
        		break;
        	case SESndWBMapping.SE_SND_1240:
        		wb1200 = new SE_SND_1200WB();
                System.out.println("SE_SND_1240:::::::::::::::");
                wb1200.se_snd_1240_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case SESndWBMapping.SE_SND_1300:
	        	wb1300 = new SE_SND_1300WB();
                System.out.println("SE_SND_1300:::::::::::::::");
        		wb1300.se_snd_1300_m(req, res);
	    		nextPage = "/jsp/se/snd/se_snd_1300_m.jsp";
	    		break;
	        case SESndWBMapping.SE_SND_1310:
        		wb1300 = new SE_SND_1300WB();
                System.out.println("SE_SND_1310:::::::::::::::");
        		wb1300.se_snd_1310_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1310_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1320:
        		wb1300 = new SE_SND_1300WB();
                System.out.println("SE_SND_1320:::::::::::::::");
        		wb1300.se_snd_1320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1400:
	        	wb1400 = new SE_SND_1400WB();
                System.out.println("SE_SND_1400:::::::::::::::");
        		wb1400.se_snd_1400_m(req, res);
	    		nextPage = "/jsp/se/snd/se_snd_1400_m.jsp";
	    		break;
	        case SESndWBMapping.SE_SND_1410:
        		wb1400 = new SE_SND_1400WB();
                System.out.println("SE_SND_1410:::::::::::::::");
        		wb1400.se_snd_1410_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1410_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1420:
        		wb1400 = new SE_SND_1400WB();
                System.out.println("SE_SND_1420:::::::::::::::");
        		wb1400.se_snd_1420_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1420_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1500:
	        	wb1500 = new SE_SND_1500WB();
                System.out.println("SE_SND_1500:::::::::::::::");
        		wb1500.se_snd_1500_m(req, res);
	    		nextPage = "/jsp/se/snd/se_snd_1500_m.jsp";
	    		break;
	        case SESndWBMapping.SE_SND_1510:
        		wb1500 = new SE_SND_1500WB();
                System.out.println("SE_SND_1510:::::::::::::::");
        		wb1500.se_snd_1510_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1510_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1520:
        		wb1500 = new SE_SND_1500WB();
                System.out.println("SE_SND_1520:::::::::::::::");
        		wb1500.se_snd_1520_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1520_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1600:
        		wb1600 = new SE_SND_1600WB();
                System.out.println("SE_SND_1600:::::::::::::::");
        		wb1600.se_snd_1600_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1600_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1610:
        		wb1600 = new SE_SND_1600WB();
                System.out.println("SE_SND_1610:::::::::::::::");
        		wb1600.se_snd_1610_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1610_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1800:
        		wb1800 = new SE_SND_1800WB();
                System.out.println("SE_SND_1800:::::::::::::::");
        		wb1800.se_snd_1800_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1800_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1810:
        		wb1800 = new SE_SND_1800WB();
                System.out.println("SE_SND_1810:::::::::::::::");
        		wb1800.se_snd_1810_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1810_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1900:
        		wb1900 = new SE_SND_1900WB();
                System.out.println("SE_SND_1900:::::::::::::::");
        		wb1900.se_snd_1900_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1900_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1910:
        		wb1900 = new SE_SND_1900WB();
                System.out.println("SE_SND_1910:::::::::::::::");
        		wb1900.se_snd_1910_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1910_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1920:
        		wb1900 = new SE_SND_1900WB();
                System.out.println("SE_SND_1920:::::::::::::::");
        		wb1900.se_snd_1920_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1920_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1930:
        		wb1900 = new SE_SND_1900WB();
                System.out.println("SE_SND_1930:::::::::::::::");
        		wb1900.se_snd_1930_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_1930_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1940:
        		wb1900 = new SE_SND_1900WB();
                System.out.println("SE_SND_1940:::::::::::::::");
        		wb1900.se_snd_1940_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_1950:
        		wb1900 = new SE_SND_1900WB();
                System.out.println("SE_SND_1950:::::::::::::::");
        		wb1900.se_snd_1950_d(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2000:
        		wb2000 = new SE_SND_2000WB();
                System.out.println("SE_SND_2000:::::::::::::::");
        		wb2000.se_snd_2000_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2000_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2010:
        		wb2000 = new SE_SND_2000WB();
                System.out.println("SE_SND_2010:::::::::::::::");
        		wb2000.se_snd_2010_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2010_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2020:
        		wb2000 = new SE_SND_2000WB();
                System.out.println("SE_SND_2020:::::::::::::::");
        		wb2000.se_snd_2020_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2200:
        		wb2200 = new SE_SND_2200WB();
                System.out.println("SE_SND_2200:::::::::::::::");
        		wb2200.se_snd_2200_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2200_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2300:
        		wb2300 = new SE_SND_2300WB();
                System.out.println("SE_SND_2300:::::::::::::::");
        		wb2300.se_snd_2300_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2300_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2310:
        		wb2300 = new SE_SND_2300WB();
                System.out.println("SE_SND_2310:::::::::::::::");
        		wb2300.se_snd_2310_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2310_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2320:
        		wb2300 = new SE_SND_2300WB();
                System.out.println("SE_SND_2320:::::::::::::::");
        		wb2300.se_snd_2320_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2320_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2330:
        		wb2300 = new SE_SND_2300WB();
                System.out.println("SE_SND_2330:::::::::::::::");
        		wb2300.se_snd_2330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2340:
        		wb2300 = new SE_SND_2300WB();
                System.out.println("SE_SND_2340:::::::::::::::");
        		wb2300.se_snd_2340_s(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2340_s.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2400:
        		wb2400 = new SE_SND_2400WB();
                System.out.println("SE_SND_2400:::::::::::::::");
        		wb2400.se_snd_2400_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2400_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2410:
        		wb2400 = new SE_SND_2400WB();
                System.out.println("SE_SND_2410:::::::::::::::");
        		wb2400.se_snd_2410_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2410_l.jsp";
        		break;
        	case SESndWBMapping.SE_SND_2420:
        		wb2400 = new SE_SND_2400WB();
                System.out.println("SE_SND_2420:::::::::::::::");
        		wb2400.se_snd_2420_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2420_l.jsp";
        		break;
       		case SESndWBMapping.SE_SND_2430:
        		wb2400 = new SE_SND_2400WB();
                System.out.println("SE_SND_2430:::::::::::::::");
        		wb2400.se_snd_2430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2500:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2500:::::::::::::::");
        		wb2500.se_snd_2500_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2500_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2510:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2510:::::::::::::::");
        		wb2500.se_snd_2510_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2510_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2520:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2520:::::::::::::::");
        		wb2500.se_snd_2520_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2520_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2530:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2530:::::::::::::::");
        		wb2500.se_snd_2530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2540:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2540:::::::::::::::");
        		wb2500.se_snd_2540_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2550:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2550:::::::::::::::");
        		wb2500.se_snd_2550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2560:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2560:::::::::::::::");
        		wb2500.se_snd_2560_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2580:
        		wb2500 = new SE_SND_2500WB();
                System.out.println("SE_SND_2580:::::::::::::::");
        		wb2500.se_snd_2580_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2580_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2600:
        		wb2600 = new SE_SND_2600WB();
                System.out.println("SE_SND_2600:::::::::::::::");
        		wb2600.se_snd_2600_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2600_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2610:
        		wb2600 = new SE_SND_2600WB();
                System.out.println("SE_SND_2410:::::::::::::::");
        		wb2600.se_snd_2610_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2610_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2620:
        		wb2600 = new SE_SND_2600WB();
                System.out.println("SE_SND_2620:::::::::::::::");
        		wb2600.se_snd_2620_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2620_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2700:
        		wb2700 = new SE_SND_2700WB();
                System.out.println("SE_SND_2700:::::::::::::::");
        		wb2700.se_snd_2700_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2700_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2710:
        		wb2700 = new SE_SND_2700WB();
                System.out.println("SE_SND_2710:::::::::::::::");
        		wb2700.se_snd_2710_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2710_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2800:
        		System.out.println("SE_SND_2800:::::::::::::::");
        		nextPage = "/jsp/se/snd/se_snd_2800_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2810:
        		wb2800 = new SE_SND_2800WB();
                System.out.println("SE_SND_2810:::::::::::::::");
        		wb2800.se_snd_2810_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2810_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2820:
        		wb2800 = new SE_SND_2800WB();
                System.out.println("SE_SND_2820:::::::::::::::");
        		wb2800.se_snd_2820_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2820_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_2830:
        		wb2800 = new SE_SND_2800WB();
                System.out.println("SE_SND_2830:::::::::::::::");
        		wb2800.se_snd_2830_a(req, res);
        		nextPage = "/jsp/se/snd/se_snd_2830_a.jsp";
        		break;
        	//특판부수발송관리
			case SESndWBMapping.SE_SND_2900:
				wb2900 = new SE_SND_2900WB();
				wb2900.se_snd_2900_m(req, res);
				nextPage = "/jsp/se/snd/se_snd_2900_m.jsp";
				break;
			case SESndWBMapping.SE_SND_2910:
				wb2900 = new SE_SND_2900WB();
				wb2900.se_snd_2910_l(req, res);
				nextPage = "/jsp/se/snd/se_snd_2910_l.jsp";
				break;
			case SESndWBMapping.SE_SND_2920:
				wb2900 = new SE_SND_2900WB();
				wb2900.se_snd_2920_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SESndWBMapping.SE_SND_3000:
				wb3000 = new SE_SND_3000WB();
				nextPage = "/jsp/se/snd/se_snd_3000_m.jsp";
				break;
			case SESndWBMapping.SE_SND_3010:
				wb3000 = new SE_SND_3000WB();
				wb3000.se_snd_3010_l(req, res);
				nextPage = "/jsp/se/snd/se_snd_3010_l.jsp";
				break;
	        case SESndWBMapping.SE_SND_3400:
        		wb3400 = new SE_SND_3400WB();
                System.out.println("SE_SND_3400:::::::::::::::");
        		wb3400.se_snd_3400_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_3400_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3410:
        		wb3400 = new SE_SND_3400WB();
                System.out.println("SE_SND_3410:::::::::::::::");
        		wb3400.se_snd_3410_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_3410_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3420:
        		wb3400 = new SE_SND_3400WB();
                System.out.println("SE_SND_3420:::::::::::::::");
        		wb3400.se_snd_3420_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_3420_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3430:
        		wb3400 = new SE_SND_3400WB();
                System.out.println("SE_SND_3430:::::::::::::::");
        		wb3400.se_snd_3430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3500:
        		wb3500 = new SE_SND_3500WB();
                System.out.println("SE_SND_3500:::::::::::::::");
        		wb3500.se_snd_3500_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_3500_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3510:
        		wb3500 = new SE_SND_3500WB();
                System.out.println("SE_SND_3500:::::::::::::::");
        		wb3500.se_snd_3510_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_3510_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3520:
        		wb3500 = new SE_SND_3500WB();
                System.out.println("SE_SND_3500:::::::::::::::");
        		wb3500.se_snd_3520_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3600:
        		wb3600 = new SE_SND_3600WB();
                System.out.println("SE_SND_3500:::::::::::::::");
        		wb3600.se_snd_3600_m(req, res);
        		nextPage = "/jsp/se/snd/se_snd_3600_m.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3610:
        		wb3600 = new SE_SND_3600WB();
                System.out.println("SE_SND_3600:::::::::::::::");
        		wb3600.se_snd_3610_l(req, res);
        		nextPage = "/jsp/se/snd/se_snd_3610_l.jsp";
        		break;
	        case SESndWBMapping.SE_SND_3620:
	        	wb3600 = new SE_SND_3600WB();
                System.out.println("SE_SND_3500:::::::::::::::");
                wb3600.se_snd_3620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

/*******************************************모바일용******************************************************************/
	        case SESndWBMapping.SE_SND_11811:  //노선조회_모바일용 (agency_DELIVERY_11115)
        		wb11800 = new SE_SND_11800WB();
                System.out.println("SE_SND_1811:::::::::::::::");
        		wb11800.mo_se_snd_1811_l(req, res);
        		nextPage = "/jsp/se/snd/mo_se_snd_11811_l.jsp";
        		break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }

}
