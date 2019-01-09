package chosun.ciis.mt.submatrin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.submatrin.wb.MT_SUBMATRIN_1000WB;
import chosun.ciis.mt.submatrin.servlet.MtSubmatrinWBMapping;




public class MtSubmatrinServlet extends BaseServlet {


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
            String servletMappedUrl = "/mt/submatrin/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("MtSubmatrinSevlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MtSubmatrinSevlet : process : nextPage : " + nextPage);
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
        MT_SUBMATRIN_1000WB wb = null;

        switch (pid) {
        	
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1100:
        		System.out.println("MT_SUBMATRIN_1100:::::::::::::::");
        		wb = new MT_SUBMATRIN_1000WB();
        		((MT_SUBMATRIN_1000WB)wb).mt_submatrin_1100_m(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1100_m.jsp";
        		break;
    		case MtSubmatrinWBMapping.MT_SUBMATRIN_1101:
        		System.out.println("MT_SUBMATRIN_1101:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();
        	    wb.mt_submatrin_1101(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1101_l.jsp";
        		break;
    		case MtSubmatrinWBMapping.MT_SUBMATRIN_1102:
        		System.out.println("MT_SUBMATRIN_1102:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1102(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1102_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1114:
        		System.out.println("MT_SUBMATRIN_1114:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1114(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1114_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1103:
        		System.out.println("MT_SUBMATRIN_1103:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1103(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1103_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1104:
        		System.out.println("MT_SUBMATRIN_1104:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1104(req, res);

        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1104_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1105:
        		System.out.println("MT_SUBMATRIN_1104:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1105(req, res);

        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1105_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1106:
        		System.out.println("MT_SUBMATRIN_1106:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1106(req, res);

        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1110:
        		System.out.println("MT_SUBMATRIN_1110:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1110(req, res);

        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1116:
        		System.out.println("MT_SUBMATRIN_1116:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1116(req, res);

        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1116_500:
        		System.out.println("MT_SUBMATRIN_1116_500:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1116_500(req, res);

        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1117:
        		System.out.println("MT_SUBMATRIN_1117:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1117(req, res);

        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1117_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1118:
        		System.out.println("MT_SUBMATRIN_1118:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1118(req, res);

        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1118_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1119:
        		System.out.println("MT_SUBMATRIN_1119:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1119(req, res);

        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1119_500:
        		System.out.println("MT_SUBMATRIN_1119_500:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1119_500(req, res);

        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1120:
        		System.out.println("MT_SUBMATRIN_1120:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1120(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1120_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1201:
        		System.out.println("MT_SUBMATRIN_1201:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1201(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1201_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1202:
        		System.out.println("MT_SUBMATRIN_1202:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1202(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1202_l.jsp";

        		break;
//        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1203:
//        		System.out.println("MT_SUBMATRIN_1203:::::::::::::::");
//        	    wb = new MT_SUBMATRIN_1000WB();
//
//        		wb.mt_submatrin_1203(req, res);
//        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1203_l.jsp";
//
//        		break;
//        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1204:
//        		System.out.println("MT_SUBMATRIN_1204:::::::::::::::");
//        	    wb = new MT_SUBMATRIN_1000WB();
//
//        		wb.mt_submatrin_1204(req, res);
//        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1204_l.jsp";
//
//        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1301:
        		System.out.println("MT_SUBMATRIN_1301:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1301(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1301_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1303:
        		System.out.println("MT_SUBMATRIN_1303:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1303(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1303_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1304:
        		System.out.println("MT_SUBMATRIN_1304:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1304(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1304_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1305:
        		System.out.println("MT_SUBMATRIN_1305:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1305(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1305_l.jsp";

        		break;
        	case MtSubmatrinWBMapping.MT_SUBMATRIN_1400:
        		System.out.println("MT_SUBMATRIN_1400:::::::::::::::");
        	    wb = new MT_SUBMATRIN_1000WB();

        		wb.mt_submatrin_1400(req, res);
        		nextPage = "/jsp/mt/submatrin/mt_submatrin_1400_l.jsp";

        		break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }

}