package chosun.ciis.mt.commatr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.ad.bas.servlet.AdBasWBMapping;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_1000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_2000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_3000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_4000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_5000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_6000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_7000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_8000WB;
import chosun.ciis.mt.commatr.servlet.MtCommatrWBMapping;
import chosun.ciis.mt.papinout.servlet.MtPapinoutWBMapping;
import chosun.ciis.mt.papinout.wb.MT_PAPINOUT_5000WB;
import chosun.ciis.mt.commatr.wb.MT_COMMATR_9000WB;
import chosun.ciis.mt.etccar.servlet.MtEtccarWBMapping;
import chosun.ciis.mt.etccar.wb.MT_ETCCAR_9000WB;



public class MtCommatr1000Servlet extends BaseServlet {


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
            String servletMappedUrl = "/mt/commatr/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("");
            System.out.println("############### Servlet Start ###############");
            System.out.println("MtCommatr1000Servlet : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MtCommatr1000Servlet : nextPage : " + nextPage);
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
        MT_COMMATR_1000WB wb = null;
        MT_COMMATR_2000WB wb2 = null;
        MT_COMMATR_3000WB wb3 = null;
        MT_COMMATR_4000WB wb4 = null;
        MT_COMMATR_5000WB wb5 = null;
        MT_COMMATR_6000WB wb6 = null;
        MT_COMMATR_7000WB wb7 = null;
        MT_COMMATR_8000WB wb8 = null;
        MT_COMMATR_9000WB wb9 = null;

        switch (pid) {
            case MtCommatrWBMapping.MT_COMMATR_1100:

    		    System.out.println("MT_COMMATR_1100:::::::::::::::");

    		    wb = new MT_COMMATR_1000WB();
    		    wb.mt_commatr_1100(req, res);

    		    nextPage = "/jsp/mt/commatr/mt_commatr_1100_l.jsp";
    		    break;
            case MtCommatrWBMapping.MT_COMMATR_1101:

    		    System.out.println("MT_COMMATR_1101:::::::::::::::");

    		    wb = new MT_COMMATR_1000WB();
    		    wb.mt_commatr_1101(req, res);

    		    nextPage = "/jsp/mt/commatr/mt_commatr_1101_l.jsp";
    		    break;
            case MtCommatrWBMapping.MT_COMMATR_1102:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1102_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1102_l.jsp";
				break;
            case MtCommatrWBMapping.MT_COMMATR_1103:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1103_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				//nextPage = "/jsp/mt/commatr/mt_commatr_1103_a.jsp";
				break;
			case MtCommatrWBMapping.MT_COMMATR_1104:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1104_m(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1104_m.jsp";
				break;
			case MtCommatrWBMapping.MT_COMMATR_1110:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1110_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1110_l.jsp";
				break;
			case MtCommatrWBMapping.MT_COMMATR_1201:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1201_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1201_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_1301:

        		System.out.println("MT_COMMATR_1301:::::::::::::::");

        		wb = new MT_COMMATR_1000WB();
        		wb.mt_commatr_1301(req, res);

        		nextPage = "/jsp/mt/commatr/mt_commatr_1301_l.jsp";
        		break;
        	case MtCommatrWBMapping.MT_COMMATR_1302:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1302_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1302_l.jsp";
				break;

        	case MtCommatrWBMapping.MT_COMMATR_1303:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1303_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_1400:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1400_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1400_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_1401:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1401_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1401_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_1410:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1410_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
        	case MtCommatrWBMapping.MT_COMMATR_1601:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1601_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1601_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_1602:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1602_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1602_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_1603:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1603_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
        	case MtCommatrWBMapping.MT_COMMATR_1604:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1604_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
        	case MtCommatrWBMapping.MT_COMMATR_1610:
				wb = new MT_COMMATR_1000WB();
				((MT_COMMATR_1000WB)wb).mt_commatr_1610_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_1610_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_2100:
				wb2 = new MT_COMMATR_2000WB();
				((MT_COMMATR_2000WB)wb2).mt_commatr_2100_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_2100_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_2110:
				wb2 = new MT_COMMATR_2000WB();
				((MT_COMMATR_2000WB)wb2).mt_commatr_2110_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_2200:
				wb2 = new MT_COMMATR_2000WB();
				((MT_COMMATR_2000WB)wb2).mt_commatr_2200_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_2200_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_2210:
				wb2 = new MT_COMMATR_2000WB();
				((MT_COMMATR_2000WB)wb2).mt_commatr_2210_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_2210_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_2220:
				wb2 = new MT_COMMATR_2000WB();
				((MT_COMMATR_2000WB)wb2).mt_commatr_2220_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_2220_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3000:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3000_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3000_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3001:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3002:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3002_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3002_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3003:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3003_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3004:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3005:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3005_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3006:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3006_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3006_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3007:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3007_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3007_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3008:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3008_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3008_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3010:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3010_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3010_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3100:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3100_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3100_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3200:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3200_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3200_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3210:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3300:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3300_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3300_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3310:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3310_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3400:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3400_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_3400_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_3410:
				wb3 = new MT_COMMATR_3000WB();
				((MT_COMMATR_3000WB)wb3).mt_commatr_3410_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_4000:
				wb4 = new MT_COMMATR_4000WB();
				((MT_COMMATR_4000WB)wb4).mt_commatr_4000_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_4000_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_4001:
				wb4 = new MT_COMMATR_4000WB();
				((MT_COMMATR_4000WB)wb4).mt_commatr_4001_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_4001_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_4002:
				wb4 = new MT_COMMATR_4000WB();
				((MT_COMMATR_4000WB)wb4).mt_commatr_4002_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_4002_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_4003:
				wb4 = new MT_COMMATR_4000WB();
				((MT_COMMATR_4000WB)wb4).mt_commatr_4003_a(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_4003_a.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_5000:
				wb5 = new MT_COMMATR_5000WB();
				((MT_COMMATR_5000WB)wb5).mt_commatr_5000_m(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_5000_m.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_5010:
				wb5 = new MT_COMMATR_5000WB();
				((MT_COMMATR_5000WB)wb5).mt_commatr_5010_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_5010_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_5020:
				wb5 = new MT_COMMATR_5000WB();
				wb5.mt_commatr_5020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_5030:
				wb5 = new MT_COMMATR_5000WB();
				((MT_COMMATR_5000WB)wb5).mt_commatr_5030_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_5030_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_5040:
				wb5 = new MT_COMMATR_5000WB();
				wb5.mt_commatr_5040_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6000:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6000_m(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6000_m.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6010:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6010_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6010_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6110:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6110_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6110_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6210:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6210_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6210_l.jsp";
				break;
			case MtCommatrWBMapping.MT_COMMATR_6120:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6120_s(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6120_s.jsp";
				break; 
        	case MtCommatrWBMapping.MT_COMMATR_6020:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6020_a(req, res);
				//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/mt/commatr/mt_commatr_6030_a.jsp";
				break;	
        	case MtCommatrWBMapping.MT_COMMATR_7000:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7000_m(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_7000_m.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_7010:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7010_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_7010_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_7110:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7110_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_7110_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_7210:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7210_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_7210_l.jsp";
				break;
			case MtCommatrWBMapping.MT_COMMATR_8101:
				wb8 = new MT_COMMATR_8000WB();
				((MT_COMMATR_8000WB)wb8).mt_commatr_8101_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_8101_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_8102:
				wb8 = new MT_COMMATR_8000WB();
				((MT_COMMATR_8000WB)wb8).mt_commatr_8102_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_8102_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_8103:
				wb8 = new MT_COMMATR_8000WB();
				((MT_COMMATR_8000WB)wb8).mt_commatr_8103_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_8103_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_8104:
				wb8 = new MT_COMMATR_8000WB();
				((MT_COMMATR_8000WB)wb8).mt_commatr_8104_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_8104_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_9101:
				wb9 = new MT_COMMATR_9000WB();
				((MT_COMMATR_9000WB)wb9).mt_commatr_9101_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_9101_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_9102:
        		wb9 = new MT_COMMATR_9000WB();
				((MT_COMMATR_9000WB)wb9).mt_commatr_9102_a(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_9102_a.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6500:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6500_m(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6500_m.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6510:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6510_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6510_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6520:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6520_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6520_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_6610:
				wb6 = new MT_COMMATR_6000WB();
				((MT_COMMATR_6000WB)wb6).mt_commatr_6610_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_6610_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_7310:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7310_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_7310_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_7320:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7320_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case MtCommatrWBMapping.MT_COMMATR_7330:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7330_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case MtCommatrWBMapping.MT_COMMATR_7410:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7410_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_7410_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_7510:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7510_l(req, res);
				nextPage = "/jsp/mt/commatr/mt_commatr_7510_l.jsp";
				break;
        	case MtCommatrWBMapping.MT_COMMATR_7520:
				wb7 = new MT_COMMATR_7000WB();
				((MT_COMMATR_7000WB)wb7).mt_commatr_7520_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}