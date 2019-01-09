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


package chosun.ciis.co.dlco.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.dlco.wb.CO_DLCO_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class CODlcoServlet extends BaseServlet {


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
            String servletMappedUrl = "/co/dlco/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("CODlcoServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CODlcoServlet : process : nextPage : " + nextPage);
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
                                int pid) throws AppException, IOException, SQLException {
        String nextPage = null;
        CO_DLCO_1000WB wb = null;
        
        switch (pid) {
        	case CODlcoWBMapping.CO_DLCO_1000:
        		System.out.println("CO_DLCO_1000:::::::::::::::");
        		wb = new CO_DLCO_1000WB();
        		wb.co_dlco_1000(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1000_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1001:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1001:::::::::::::::");
        		wb.co_dlco_1001(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1001_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1002:
        		wb = new CO_DLCO_1000WB();
        		System.out.println("CO_DLCO_1002:::::::::::::::");
        		wb.co_dlco_1002(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1002_a.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1003:
        		wb = new CO_DLCO_1000WB();
        		System.out.println("CO_DLCO_1003:::::::::::::::");
        		wb.co_dlco_1003(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1003_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1004:
        		wb = new CO_DLCO_1000WB();
        		System.out.println("CO_DLCO_1004:::::::::::::::");
        		wb.co_dlco_1004(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1004_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1005:
        		wb = new CO_DLCO_1000WB();
        		System.out.println("CO_DLCO_1005:::::::::::::::");
        		wb.co_dlco_1005(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1005_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1006:
        		wb = new CO_DLCO_1000WB();
        		System.out.println("CO_DLCO_1006:::::::::::::::");
        		wb.co_dlco_1006(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1006_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1100:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1100:::::::::::::::");
        		wb.co_dlco_1100(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1100_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1008:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1008:::::::::::::::");
        		wb.co_dlco_1008(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1008_a.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1009:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1009:::::::::::::::");
        		wb.co_dlco_1009(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1010:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1010:::::::::::::::");
        		wb.co_dlco_1010(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1010_s.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1011:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1011:::::::::::::::");
        		wb.co_dlco_1011(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1011_l.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1012:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1012:::::::::::::::");
        		wb.co_dlco_1012(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1013:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1013:::::::::::::::");
        		wb.co_dlco_1013(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case CODlcoWBMapping.CO_DLCO_1015:
        		wb = new CO_DLCO_1000WB();
                System.out.println("CO_DLCO_1015:::::::::::::::");
        		wb.co_dlco_1015(req, res);
        		nextPage = "/jsp/co/dlco/co_dlco_1015_l.jsp";
        		break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
