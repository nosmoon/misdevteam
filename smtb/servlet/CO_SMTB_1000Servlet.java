package chosun.ciis.co.smtb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chosun.ciis.co.base.servlet.*;
import chosun.ciis.co.base.wb.*;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
//import chosun.ciis.mt.submatrin.wb.*;
import chosun.ciis.co.smtb.wb.CO_SMTB_1000WB;
import chosun.ciis.co.smtb.servlet.CO_SMTB_1000WBMapping;

public class CO_SMTB_1000Servlet extends BaseServlet {


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
            String servletMappedUrl = "/co/smtb/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("CO_SMTB_1000Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CO_SMTB_1000Servlet : process : nextPage : " + nextPage);
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

	public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException 
	{
		String nextPage = null;
		BaseWB wb = null;

		switch(pid) 
		{
			case CO_SMTB_1000WBMapping.CO_SMTB_1020:
				System.out.println("CO_SMTB_1020:::::::::::::::");
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1020_u(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1020_u.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1021:
				System.out.println("CO_SMTB_1021:::::::::::::::");
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1021_u(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1021_u.jsp";
				break;				
			case CO_SMTB_1000WBMapping.CO_SMTB_1030:
				System.out.println("CO_SMTB_1030:::::::::::::::");
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1030_m(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1030_m.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1031:
				System.out.println("CO_SMTB_1031:::::::::::::::");
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1031_l(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1031_l.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1060:
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1060_l(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1060_l.jsp";
				break;	
			case CO_SMTB_1000WBMapping.CO_SMTB_1061:
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1061_u(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1061_u.jsp";
				break;	
			case CO_SMTB_1000WBMapping.CO_SMTB_1070:
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1070_l(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1070_l.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1071:
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1071_s(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1071_s.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1072:
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1072_i(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1072_i.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1073:
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1073_u(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1073_u.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1074:
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1074_d(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1074_d.jsp";
				break;
			case CO_SMTB_1000WBMapping.CO_SMTB_1101:
				System.out.println("CO_SMTB_1101:::::::::::::::");
				wb = new CO_SMTB_1000WB();
				((CO_SMTB_1000WB)wb).co_smtb_1101_l(req, res);
				nextPage = "/jsp/co/smtb/co_smtb_1101_l.jsp";
				break;						
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
		}
		return nextPage;
	}

}