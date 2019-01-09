package chosun.ciis.co.semuro.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chosun.ciis.co.base.servlet.DecidBaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
//import chosun.ciis.mt.submatrin.wb.*;
import chosun.ciis.co.semuro.wb.CO_SEMURO_1000WB;
import chosun.ciis.co.semuro.servlet.CoSemuro1000WBMapping;

public class CoSemuro1000Sevlet extends DecidBaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
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
            String servletMappedUrl = "/co/semuro/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("CoSemuro1000Sevlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CoSemuro1000Sevlet : process : nextPage : " + nextPage);
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
     * SEBasWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException, SQLException {
        String nextPage = null;
        CO_SEMURO_1000WB wb = null;

        switch (pid) {
        	case CoSemuro1000WBMapping.CO_SEMURO_1000:
	    		System.out.println("CO_SEMURO_1000:::::::::::::::");
	    	    wb = new CO_SEMURO_1000WB();
	    		wb.co_semuro_1000(req, res);
	    		nextPage = "/jsp/co/semuro/co_semuro_1000_l.jsp";
	    		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1001:
        		System.out.println("CO_SEMURO_1001:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();
        		wb.co_semuro_1001(req, res);
        		nextPage = "/jsp/co/semuro/co_semuro_1001_a.jsp";
        		break;
    		case CoSemuro1000WBMapping.CO_SEMURO_1100:
        		System.out.println("CO_SEMURO_1100:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1100(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1200:
        		System.out.println("CO_SEMURO_1200:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1200(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1300:
        		System.out.println("CO_SEMURO_1300:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1300(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1301:
        		System.out.println("CO_SEMURO_1301:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1301(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1400:
        		System.out.println("CO_SEMURO_1400:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1400(req, res);
        		nextPage = "/jsp/co/semuro/co_semuro_1400_l.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1500:
        		System.out.println("CO_SEMURO_1500:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1500(req, res);
        		  System.out.println("112222");
        		nextPage = "/jsp/co/semuro/co_semuro_1500_l.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1600:
        		System.out.println("CO_SEMURO_1600:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1600(req, res);

        		nextPage = "/common/jsp/resultMsg.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1700:
        		System.out.println("CO_SEMURO_1900:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1700(req, res);
        		nextPage = "/jsp/co/semuro/co_semuro_1700_l.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1800:
        		System.out.println("CO_SEMURO_1800:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1800(req, res);
        		nextPage = "/jsp/co/semuro/co_semuro_1800_l.jsp";

        		break;
        	case CoSemuro1000WBMapping.CO_SEMURO_1900:
        		System.out.println("CO_SEMURO_1900:::::::::::::::");
        	    wb = new CO_SEMURO_1000WB();

        		wb.co_semuro_1900(req, res);
        		nextPage = "/jsp/co/semuro/co_semuro_1900_l.jsp";

        		break;
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }

}