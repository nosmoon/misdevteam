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


package chosun.ciis.as.mach.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.as.mach.wb.AS_MACH_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class AS_MACH_1000Servlet extends BaseServlet {


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
            String servletMappedUrl = "/as/mach/";
            iPid = extractPid(req, servletMappedUrl);            
            System.out.println("AS_MACH_1000Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AS_MACH_1000Servlet : process : nextPage : " + nextPage);
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
        AS_MACH_1000WB wb = null;
        
        switch (pid) {
        
			case AS_MACH_1000WBMapping.AS_MACH_1000:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1000_m(req, res);
				nextPage = "/jsp/as/mach/as_mach_1000_m.jsp";
				break;		

			case AS_MACH_1000WBMapping.AS_MACH_1005:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1005_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1005_l.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1010:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1010_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1010_l.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1015:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1015_s(req, res);
				nextPage = "/jsp/as/mach/as_mach_1015_s.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1020:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1020_a(req, res);
				nextPage = "/jsp/as/mach/as_mach_1020_a.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1030:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1030_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1030_l.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1040:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1040_a(req, res);
				nextPage = "/jsp/as/mach/as_mach_1040_a.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1100:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1100_m(req, res);
				nextPage = "/jsp/as/mach/as_mach_1100_m.jsp";
				break;

			case AS_MACH_1000WBMapping.AS_MACH_1110:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1110_l(req, res);
				nextPage = "/jsp/as/mach/as_mach_1110_l.jsp";
				break;
				
			case AS_MACH_1000WBMapping.AS_MACH_1120:
				wb = new AS_MACH_1000WB();
				((AS_MACH_1000WB)wb).as_mach_1120_a(req, res);
				nextPage = "/jsp/as/mach/as_mach_1120_a.jsp";
				break;

        	default:        	
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));        		
        }

        return nextPage;
    }
 
}
