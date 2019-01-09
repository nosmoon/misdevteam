package chosun.ciis.mt.common.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.as.com.servlet.ASComWBMapping;
import chosun.ciis.as.com.wb.AS_COM_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.cocd.servlet.COCocdWBMapping;
import chosun.ciis.co.cocd.wb.CO_COCD_1000WB;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
//import chosun.ciis.mt.submatrin.wb.*;
import chosun.ciis.mt.common.wb.MT_COMMON_WB;
import chosun.ciis.mt.common.servlet.MtCommonWBMapping;

public class MtCommonServlet extends BaseServlet {


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
            String servletMappedUrl = "/mt/common/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("MtCommonSevlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MtCommonSevlet : process : nextPage : " + nextPage);
        }
        catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/comm/jsp/app_error.jsp";
        }
        catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/comm/jsp/sys_error.jsp";
        }
        catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/comm/jsp/sys_error.jsp";
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
        MT_COMMON_WB wb = null;

        switch (pid) {
        	case MtCommonWBMapping.MT_COM_1000:
				wb = new MT_COMMON_WB();
				((MT_COMMON_WB)wb).mt_com_1000_s(req, res);
				nextPage = "/jsp/mt/common/mt_com_1000_s.jsp";
				break;
		
        	case MtCommonWBMapping.MT_COMMON_0001:
        		System.out.println("MT_COMMON_0001:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0001(req, res);
        		nextPage = "/jsp/mt/common/mt_common_dept_0001_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_0002:
        		System.out.println("MT_COMMON_0002:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0002(req, res);
        		nextPage = "/jsp/mt/common/mt_common_dlco_0001_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_0003:
        		System.out.println("MT_COMMON_0003:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0003(req, res);
        		nextPage = "/jsp/mt/common/mt_common_matr_0003_l.jsp";

        		break;
        	case MtCommonWBMapping.MT_COMMON_0004:
        		System.out.println("MT_COMMON_0004:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0004(req, res);
        		nextPage = "/jsp/mt/common/mt_common_dlco_0002_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_1001:
        		System.out.println("MT_COMMON_0009:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0009(req, res);
        		nextPage = "/jsp/mt/common/mt_common_dlco_0003_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_0005:
        		System.out.println("MT_COMMON_0005:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0005(req, res);
        		nextPage = "/jsp/mt/common/mt_common_emp_0001_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_0006:
        		System.out.println("MT_COMMON_0006:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0006(req, res);
        		nextPage = "/jsp/mt/common/mt_common_matr_0002_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_0007:
        		System.out.println("MT_COMMON_0007:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0007(req, res);
        		nextPage = "/jsp/mt/common/mt_common_matr_0004_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_1008:
        		System.out.println("MT_COMMON_1008:::::::::::::::");
        	    wb = new MT_COMMON_WB();

        		wb.mt_common_0008(req, res);
        		nextPage = "/jsp/mt/common/mt_common_matr_0005_l.jsp";
        		break;
        	case MtCommonWBMapping.MT_COMMON_1000:
				wb = new MT_COMMON_WB();
				((MT_COMMON_WB)wb).mt_com_1000_l(req, res);
				nextPage = "/jsp/mt/common/mt_common_1000_l.jsp";
				break;
        	case MtCommonWBMapping.MT_COMMON_2000:
				wb = new MT_COMMON_WB();
				((MT_COMMON_WB)wb).mt_com_2000_l(req, res);
				nextPage = "/jsp/mt/common/mt_common_2000_l.jsp";
				break;
//        	case MtCommonWBMapping.MT_COMMON_3001:
//				wb = new MT_COMMON_WB();
//				((MT_COMMON_WB)wb).mt_common_3001_l(req, res);
//				nextPage = "/jsp/mt/common/mt_common_3001_l.jsp";
//				break;
        	case MtCommonWBMapping.MT_COMMON_COCD_1000:
        		System.out.println(MtCommonWBMapping.MT_COMMON_COCD_1000);
         		wb = new MT_COMMON_WB();
         		System.out.println("##");
         		((MT_COMMON_WB)wb).mt_common_cocd_1000_l(req, res);
        		nextPage = "/jsp/mt/common/mt_common_cocd_1000_l.jsp";
        		break;       
        		
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }

}