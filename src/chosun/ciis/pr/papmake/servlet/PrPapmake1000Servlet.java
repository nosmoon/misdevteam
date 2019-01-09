package chosun.ciis.pr.papmake.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.common.servlet.MtCommonWBMapping;
import chosun.ciis.mt.common.wb.MT_COMMON_WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_1000WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_2000WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_3000WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_4000WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_5000WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_6000WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_7000WB;
import chosun.ciis.pr.papmake.wb.PR_PAPMAKE_8000WB;
import chosun.ciis.pr.papmake.servlet.PrPapmakeWBMapping;



public class PrPapmake1000Servlet extends BaseServlet {

 
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
            String servletMappedUrl = "/mt/papmake/";
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
        PR_PAPMAKE_1000WB wb = null;
        PR_PAPMAKE_2000WB wb2 = null;
        PR_PAPMAKE_3000WB wb3 = null;
        PR_PAPMAKE_4000WB wb4 = null;
        PR_PAPMAKE_5000WB wb5 = null;
        PR_PAPMAKE_6000WB wb6 = null;
        PR_PAPMAKE_7000WB wb7 = null;
        PR_PAPMAKE_8000WB wb8 = null;

        switch (pid) {
        
        case PrPapmakeWBMapping.PR_PAPMAKE_1001:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1001_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1001_l.jsp";
			break;
       case PrPapmakeWBMapping.PR_PAPMAKE_1005:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1005_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1005_l.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1004:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1004_a(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1004_a.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1006:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1006_a(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1006_a.jsp";
			break;
			
        case PrPapmakeWBMapping.PR_PAPMAKE_1007:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1007_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1007_l.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1008:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1008_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1008_l.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1009:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1009_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1009_l.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1010:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1010_d(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1010_d.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1000:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1000_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1000_l.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1011:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1011_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1012:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1012_u(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1012_u.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1013:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1013_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1013_l.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1014:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1014_u(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1014_u.jsp";
			break;
        case PrPapmakeWBMapping.PR_PAPMAKE_1020:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1020_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_1021:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1021_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1021_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_1030:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1030_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_1031:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1031_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1031_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_1051:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1051_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1051_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_1052:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1052_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1052_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_1053:
			wb = new PR_PAPMAKE_1000WB();
			((PR_PAPMAKE_1000WB)wb).pr_papmake_1053_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_1053_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2000:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2000_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2000_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2010:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2010_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2100:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2100_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2100_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2101:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2101_a(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2101_a.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2200:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2200_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2200_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2201:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2201_a(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2201_a.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2202:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2202_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2202_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2300:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2300_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2300_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_2301:
			wb2 = new PR_PAPMAKE_2000WB();
			((PR_PAPMAKE_2000WB)wb2).pr_papmake_2301_a(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_2301_a.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3000:
			wb3 = new PR_PAPMAKE_3000WB();
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3000_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3000_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3001:
			wb3 = new PR_PAPMAKE_3000WB();
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3001_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3001_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3010:
			wb3 = new PR_PAPMAKE_3000WB();
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3010_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3100:
			wb3 = new PR_PAPMAKE_3000WB();
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3100_m(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3100_m.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3101:
			wb3 = new PR_PAPMAKE_3000WB();
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3101_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3101_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3201:
			wb3 = new PR_PAPMAKE_3000WB(); 
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3201_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3201_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3301:
			wb3 = new PR_PAPMAKE_3000WB(); 
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3301_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3301_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3501:
			wb3 = new PR_PAPMAKE_3000WB(); 
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3501_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3501_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3502:
			wb3 = new PR_PAPMAKE_3000WB();  
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3502_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3502_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_3600:
			wb3 = new PR_PAPMAKE_3000WB();
			((PR_PAPMAKE_3000WB)wb3).pr_papmake_3600_m(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_3600_m.jsp";
			break;	
    	case PrPapmakeWBMapping.PR_PAPMAKE_4000:
			wb4 = new PR_PAPMAKE_4000WB();
			((PR_PAPMAKE_4000WB)wb4).pr_papmake_4000_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_4000_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_4010:
			wb4 = new PR_PAPMAKE_4000WB();
			((PR_PAPMAKE_4000WB)wb4).pr_papmake_4010_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_4010_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_4020:
			wb4 = new PR_PAPMAKE_4000WB();
			((PR_PAPMAKE_4000WB)wb4).pr_papmake_4020_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_4030:
			wb4 = new PR_PAPMAKE_4000WB();
			((PR_PAPMAKE_4000WB)wb4).pr_papmake_4030_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_4030_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_4040:
			wb4 = new PR_PAPMAKE_4000WB();
			((PR_PAPMAKE_4000WB)wb4).pr_papmake_4040_m(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_4040_m.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_4050:
			wb4 = new PR_PAPMAKE_4000WB();
			((PR_PAPMAKE_4000WB)wb4).pr_papmake_4050_d(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_4050_d.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_5000:
			wb5 = new PR_PAPMAKE_5000WB();
			((PR_PAPMAKE_5000WB)wb5).pr_papmake_5000_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_5000_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_5020:
			wb5 = new PR_PAPMAKE_5000WB();
			((PR_PAPMAKE_5000WB)wb5).pr_papmake_5020_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_6000:
			wb6 = new PR_PAPMAKE_6000WB();
			((PR_PAPMAKE_6000WB)wb6).pr_papmake_6000_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_6000_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_6010:
			wb6 = new PR_PAPMAKE_6000WB();
			((PR_PAPMAKE_6000WB)wb6).pr_papmake_6010_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_6030:
			wb6 = new PR_PAPMAKE_6000WB();
			((PR_PAPMAKE_6000WB)wb6).pr_papmake_6030_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_6030_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_6040:
			wb6 = new PR_PAPMAKE_6000WB();
			((PR_PAPMAKE_6000WB)wb6).pr_papmake_6040_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_6050:
			wb6 = new PR_PAPMAKE_6000WB();
			((PR_PAPMAKE_6000WB)wb6).pr_papmake_6050_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_6060:
			wb6 = new PR_PAPMAKE_6000WB();
			((PR_PAPMAKE_6000WB)wb6).pr_papmake_6060_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_7010:
			wb7 = new PR_PAPMAKE_7000WB();
			((PR_PAPMAKE_7000WB)wb7).pr_papmake_7010_m(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_7010_m.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_7011:
    		wb7 = new PR_PAPMAKE_7000WB();
			((PR_PAPMAKE_7000WB)wb7).pr_papmake_7011_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_7011_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_7012:
			wb7 = new PR_PAPMAKE_7000WB();
			((PR_PAPMAKE_7000WB)wb7).pr_papmake_7012_a(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_7012_a.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_7021:
    		wb7 = new PR_PAPMAKE_7000WB();
			((PR_PAPMAKE_7000WB)wb7).pr_papmake_7021_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_7021_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_7022:
			wb7 = new PR_PAPMAKE_7000WB();
			((PR_PAPMAKE_7000WB)wb7).pr_papmake_7022_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break; 
    	case PrPapmakeWBMapping.PR_PAPMAKE_7013:
    		wb7 = new PR_PAPMAKE_7000WB();
     		((PR_PAPMAKE_7000WB)wb7).pr_papmake_7013_m(req, res);
     		nextPage = "/jsp/pr/papmake/pr_papmake_7013_m.jsp";
			break; 
    	case PrPapmakeWBMapping.PR_PAPMAKE_7100:
    		wb7 = new PR_PAPMAKE_7000WB();
			((PR_PAPMAKE_7000WB)wb7).pr_papmake_7100_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_7100_l.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_7101: 
    		wb7 = new PR_PAPMAKE_7000WB();
			((PR_PAPMAKE_7000WB)wb7).pr_papmake_7101_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_7101_l.jsp";
			break;  
    	case PrPapmakeWBMapping.PR_PAPMAKE_8000:
			wb8 = new PR_PAPMAKE_8000WB();
			((PR_PAPMAKE_8000WB)wb8).pr_papmake_8000_m(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_8000_m.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_8011:
    		wb8 = new PR_PAPMAKE_8000WB();
			((PR_PAPMAKE_8000WB)wb8).pr_papmake_8011_l(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_8011_l.jsp";
			break;      
    	case PrPapmakeWBMapping.PR_PAPMAKE_8012:
			wb8 = new PR_PAPMAKE_8000WB();
			((PR_PAPMAKE_8000WB)wb8).pr_papmake_8012_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
    	case PrPapmakeWBMapping.PR_PAPMAKE_8070:
			wb8 = new PR_PAPMAKE_8000WB();
			((PR_PAPMAKE_8000WB)wb8).pr_papmake_8070_m(req, res);
			nextPage = "/jsp/pr/papmake/pr_papmake_8070_m.jsp";
			break;
    			
    		default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}