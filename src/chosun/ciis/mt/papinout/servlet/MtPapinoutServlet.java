package chosun.ciis.mt.papinout.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.papinout.wb.*;
import chosun.ciis.mt.papinout.servlet.MtPapinoutWBMapping;



public class MtPapinoutServlet extends BaseServlet {


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
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;

        try {
            String servletMappedUrl = "/mt/papinout/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("");
            System.out.println("############### Servlet Start ###############");
            System.out.println("MtpapinoutSevlet : req  : " + req);
            System.out.println("MtpapinoutSevlet : res  : " + res);
            System.out.println("MtpapinoutSevlet : iPid : " + iPid);
            System.out.println("MtpapinoutSevlet : nextPage : " + nextPage);

            nextPage = executeWorker(req, res, iPid);

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
        MT_PAPINOUT_1000WB wb = null;
        MT_PAPINOUT_1100WB wb1 = null;
        MT_PAPINOUT_2000WB wb2 = null;
        MT_PAPINOUT_3000WB wb3 = null;
        MT_PAPINOUT_4000WB wb4 = null;
        MT_PAPINOUT_5000WB wb5 = null;
        MT_PAPINOUT_6000WB wb6 = null;
        MT_PAPINOUT_8000WB wb8 = null;
        MT_PAPINOUT_9000WB wb9 = null;

        switch (pid) {
        	case MtPapinoutWBMapping.MT_PAPINOUT_1001:

	    		System.out.println("MT_PAPINOUT_1001:::::::::::::::");

	    		wb = new MT_PAPINOUT_1000WB();
	    		wb.mt_papinout_1001(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_1001_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_1002:

	    		System.out.println("MT_PAPINOUT_1002:::::::::::::::");

	    		wb = new MT_PAPINOUT_1000WB();
	    		wb.mt_papinout_1002(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_1002_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_1003:

	    		System.out.println("MT_PAPINOUT_1003:::::::::::::::");

	    		wb = new MT_PAPINOUT_1000WB();
	    		wb.mt_papinout_1003(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_1003_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_1100:
        		
	    		System.out.println("MT_PAPINOUT_1100:::::::::::::::");
	    		
	    		wb1 = new MT_PAPINOUT_1100WB();
	    		wb1.mt_papinout_1100_m(req, res);
	    		
	    		nextPage = "/jsp/mt/papinout/mt_papinout_1100_m.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_1110:
        		
	    		System.out.println("MT_PAPINOUT_1100:::::::::::::::");
	    		
	    		wb1 = new MT_PAPINOUT_1100WB();
	    		wb1.mt_papinout_1110_l(req, res);
	    		
	    		nextPage = "/jsp/mt/papinout/mt_papinout_1110_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_1120:
        		
	    		System.out.println("MT_PAPINOUT_1120:::::::::::::::");
	    		
	    		wb1 = new MT_PAPINOUT_1100WB();
	    		wb1.mt_papinout_1120_a(req, res);
	    		
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_1130:
        		
	    		System.out.println("MT_PAPINOUT_1130:::::::::::::::");
	    		
	    		wb1 = new MT_PAPINOUT_1100WB();
	    		wb1.mt_papinout_1130_l(req, res);
	    		
	    		nextPage = "/jsp/mt/papinout/mt_papinout_1130_l.jsp";
	    		break;	
        	case MtPapinoutWBMapping.MT_PAPINOUT_2100:
	    		System.out.println("MT_PAPINOUT_2100:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2100(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2100_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2101:
	    		System.out.println("MT_PAPINOUT_2100:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2101(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2101_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2102:
	    		System.out.println("MT_PAPINOUT_2100:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2102(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2102_a.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2103:
	    		System.out.println("MT_PAPINOUT_2103:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2103(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2103_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2104:
	    		System.out.println("MT_PAPINOUT_2104:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2104(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2104_a.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2105:
	    		System.out.println("MT_PAPINOUT_2105:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2105(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2105_a.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2200:
	    		System.out.println("MT_PAPINOUT_2100:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2200(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2200_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2201:
	    		System.out.println("MT_PAPINOUT_2201:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2201(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2202:

	    		System.out.println("MT_PAPINOUT_2202:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2202(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2203:

	    		System.out.println("MT_PAPINOUT_2203:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2203(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2204:

	    		System.out.println("MT_PAPINOUT_2204:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2204(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2205:

	    		System.out.println("MT_PAPINOUT_2205:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2205(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2205_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2206:
	    		System.out.println("MT_PAPINOUT_2206:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2206(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2206_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2207:

	    		System.out.println("MT_PAPINOUT_2207:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2207(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2207_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2208:

	    		System.out.println("MT_PAPINOUT_2208:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2208(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2208_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2209:

	    		System.out.println("MT_PAPINOUT_2208:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2209(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2209_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2210:

	    		System.out.println("MT_PAPINOUT_2210:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2210(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2210_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2211:

	    		System.out.println("MT_PAPINOUT_2211:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2211(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2211_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2212:

	    		System.out.println("MT_PAPINOUT_2212:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2212(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2213:

	    		System.out.println("MT_PAPINOUT_2213:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2213(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2214:

	    		System.out.println("MT_PAPINOUT_2214:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2214(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2214_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2216:

	    		System.out.println("MT_PAPINOUT_2216:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2216(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2216_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2217:

	    		System.out.println("MT_PAPINOUT_2217:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2217(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2218:
	    		System.out.println("MT_PAPINOUT_2218:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2218(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2218_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2219:

	    		System.out.println("MT_PAPINOUT_2219:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2219(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2219_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2220:

	    		System.out.println("MT_PAPINOUT_2220:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2220(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2220_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2223:

	    		System.out.println("MT_PAPINOUT_2223:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2223(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2223_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2224:
	    		System.out.println("MT_PAPINOUT_2224:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2224(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2224_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2225:
	    		System.out.println("MT_PAPINOUT_2225:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2225(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2225_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2226:
	    		System.out.println("MT_PAPINOUT_2226:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2226(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2226_a.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2300:
	    		System.out.println("MT_PAPINOUT_2100:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2300(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2300_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2301:
	    		System.out.println("MT_PAPINOUT_2100:::::::::::::::");
	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2301(req, res);
	    		nextPage = "/jsp/mt/papinout/mt_papinout_2301_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2302:

	    		System.out.println("MT_PAPINOUT_2302:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2302(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2303:

	    		System.out.println("MT_PAPINOUT_2100:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2303(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2304:

	    		System.out.println("MT_PAPINOUT_2304:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2304(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2305:

	    		System.out.println("MT_PAPINOUT_2305:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2305(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2306:

	    		System.out.println("MT_PAPINOUT_2306:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2306(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2307:

	    		System.out.println("MT_PAPINOUT_2307:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2307(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2400:

	    		System.out.println("MT_PAPINOUT_2400:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2400(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2400_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2401:

	    		System.out.println("MT_PAPINOUT_2401:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2401(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2401_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2402:

	    		System.out.println("MT_PAPINOUT_2402:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2402(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2402_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2500:

	    		System.out.println("MT_PAPINOUT_2500:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2500(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2500_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2501:

	    		System.out.println("MT_PAPINOUT_2500:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2501(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2501_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2502:

	    		System.out.println("MT_PAPINOUT_2502:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2502(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2503:

	    		System.out.println("MT_PAPINOUT_2503:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2503(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2600:

	    		System.out.println("MT_PAPINOUT_2600:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2600(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2600_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2601:

	    		System.out.println("MT_PAPINOUT_2601:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2601(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2601_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2700:

	    		System.out.println("MT_PAPINOUT_2700:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2700(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2700_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2701:

	    		System.out.println("MT_PAPINOUT_2701:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2701(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2701_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2702:

	    		System.out.println("MT_PAPINOUT_2702:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2702(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_2702_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2703:

	    		System.out.println("MT_PAPINOUT_2703:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2703(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_2704:

	    		System.out.println("MT_PAPINOUT_2704:::::::::::::::");

	    		wb2 = new MT_PAPINOUT_2000WB();
	    		wb2.mt_papinout_2704(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3001:

	    		System.out.println("MT_PAPINOUT_3001:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3001(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3001_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3002:

	    		System.out.println("MT_PAPINOUT_3002:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3002(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3002_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3003:

	    		System.out.println("MT_PAPINOUT_3003:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3003(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3003_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3004:

	    		System.out.println("MT_PAPINOUT_3004:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3004(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3005:

	    		System.out.println("MT_PAPINOUT_3005:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3005(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3006:

	    		System.out.println("MT_PAPINOUT_3006:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3006(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3006_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3007:

	    		System.out.println("MT_PAPINOUT_3007:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3007(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3008:

	    		System.out.println("MT_PAPINOUT_3008:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3008(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3008_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3010:

	    		System.out.println("MT_PAPINOUT_3010:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3010(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3010_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3012:

	    		System.out.println("MT_PAPINOUT_3012:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3012(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3013:

	    		System.out.println("MT_PAPINOUT_3013:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3013(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3014:

	    		System.out.println("MT_PAPINOUT_3014:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3014(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3017:

	    		System.out.println("MT_PAPINOUT_3017:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3017(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3017_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3018:

	    		System.out.println("MT_PAPINOUT_3018:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3018(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3018_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3100:

	    		System.out.println("MT_PAPINOUT_3100:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3100(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3100_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3101:

	    		System.out.println("MT_PAPINOUT_3101:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3101(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_3101_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3102:

	    		System.out.println("MT_PAPINOUT_3102:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3102(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_3103:

	    		System.out.println("MT_PAPINOUT_3103:::::::::::::::");

	    		wb3 = new MT_PAPINOUT_3000WB();
	    		wb3.mt_papinout_3103(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4000:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4000_m(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4000_m.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4001:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4001_m(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4001_m.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4100:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4100_a(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4100_a.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4101:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4101_l(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4101_l.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4200:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4200_l(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4200_l.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4300:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4300_a(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4300_a.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4301:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4301_l(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4301_l.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4400:
        		wb4 = new MT_PAPINOUT_4000WB();
        		((MT_PAPINOUT_4000WB)wb4).mt_papinout_4400_l(req, res);
        		nextPage = "/jsp/mt/papinout/mt_papinout_4400_l.jsp";
        		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_4500:
        		wb4 = new MT_PAPINOUT_4000WB();
				((MT_PAPINOUT_4000WB)wb4).mt_papinout_4500_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_4500_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5000:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5000_m(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5000_m.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5100:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5100_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5100_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5101:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5101_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5101_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5102:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5102_i(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5102_i.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5103:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5103_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5103_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5104:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5104_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5104_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5105:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5105_u(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5105_u.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5106:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5106_d(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5106_d.jsp";
				break;
			case MtPapinoutWBMapping.MT_PAPINOUT_5107:
        		wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5107_a(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5107_a.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5108:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5108_a(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5108_a.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5200:
        		wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5200_a(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5200_a.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5201:
        		wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5201_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5201_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5300:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5300_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5300_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5400:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5400_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5400_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_5401:
				wb5 = new MT_PAPINOUT_5000WB();
				((MT_PAPINOUT_5000WB)wb5).mt_papinout_5401_l(req, res);
				nextPage = "/jsp/mt/papinout/mt_papinout_5401_l.jsp";
				break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6101:

	    		System.out.println("MT_PAPINOUT_6101:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6101(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_6101_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6102:

	    		System.out.println("MT_PAPINOUT_6102:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6102(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_6102_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6103:

	    		System.out.println("MT_PAPINOUT_6103:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6103(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_6103_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6104:

	    		System.out.println("MT_PAPINOUT_6104:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6104(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6105:

	    		System.out.println("MT_PAPINOUT_6105:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6105(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6106:

	    		System.out.println("MT_PAPINOUT_6106:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6106(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_6106_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6107:

	    		System.out.println("MT_PAPINOUT_6107:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6107(req, res);

	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6201:

	    		System.out.println("MT_PAPINOUT_6201:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6201(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_6201_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_6202:

	    		System.out.println("MT_PAPINOUT_6202:::::::::::::::");

	    		wb6 = new MT_PAPINOUT_6000WB();
	    		wb6.mt_papinout_6202(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_6202_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8001:

	    		System.out.println("MT_PAPINOUT_8001:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8001(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8001_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8002:

	    		System.out.println("MT_PAPINOUT_8002:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8002(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8002_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8003:

	    		System.out.println("MT_PAPINOUT_8003:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8003(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8003_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8004:

	    		System.out.println("MT_PAPINOUT_8004:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8004(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8004_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8005:

	    		System.out.println("MT_PAPINOUT_8005:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8005(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8005_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8006:

	    		System.out.println("MT_PAPINOUT_8006:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8006(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8006_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8007:

	    		System.out.println("MT_PAPINOUT_8007:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8007(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8007_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8008:

	    		System.out.println("MT_PAPINOUT_8008:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8008(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8008_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8009:

	    		System.out.println("MT_PAPINOUT_8009:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8009(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8009_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8010:

	    		System.out.println("MT_PAPINOUT_8010:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8010(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8010_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_8011:

	    		System.out.println("MT_PAPINOUT_8011:::::::::::::::");

	    		wb8 = new MT_PAPINOUT_8000WB();
	    		wb8.mt_papinout_8011(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_8011_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9101:

	    		System.out.println("MT_PAPINOUT_9101:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9101(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9101_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9102:

	    		System.out.println("MT_PAPINOUT_9102:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9102(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9102_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9103:

	    		System.out.println("MT_PAPINOUT_9103:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9103(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9103_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9104:

	    		System.out.println("MT_PAPINOUT_9104:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9104(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9104_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9105:

	    		System.out.println("MT_PAPINOUT_9105:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9105(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9105_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9106:

	    		System.out.println("MT_PAPINOUT_9106:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9106(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9106_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9107:

	    		System.out.println("MT_PAPINOUT_9107:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9107(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9107_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9108:

	    		System.out.println("MT_PAPINOUT_9108:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9108(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9108_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9109:

	    		System.out.println("MT_PAPINOUT_9109:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9109(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9109_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9110:

	    		System.out.println("MT_PAPINOUT_9110:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9110(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9110_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9111:

	    		System.out.println("MT_PAPINOUT_9111:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9111(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9111_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9112:

	    		System.out.println("MT_PAPINOUT_9112:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9112(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9112_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9113:

	    		System.out.println("MT_PAPINOUT_9113:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9113(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9113_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9114:

	    		System.out.println("MT_PAPINOUT_9114:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9114(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9114_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9115:

	    		System.out.println("MT_PAPINOUT_9115:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9115(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9115_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9116:

	    		System.out.println("MT_PAPINOUT_9116:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9116(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9116_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9117:

	    		System.out.println("MT_PAPINOUT_9117:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9117(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9117_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9118:

	    		System.out.println("MT_PAPINOUT_9118:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9118(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9118_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9119:

	    		System.out.println("MT_PAPINOUT_9119:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9119(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9119_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9201:

	    		System.out.println("MT_PAPINOUT_9201:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9201(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9201_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9202:

	    		System.out.println("MT_PAPINOUT_9202:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9202(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9202_l.jsp";
	    		break;
        	case MtPapinoutWBMapping.MT_PAPINOUT_9203:

	    		System.out.println("MT_PAPINOUT_9203:::::::::::::::");

	    		wb9 = new MT_PAPINOUT_9000WB();
	    		wb9.mt_papinout_9203(req, res);

	    		nextPage = "/jsp/mt/papinout/mt_papinout_9203_l.jsp";
	    		break;
	    	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}