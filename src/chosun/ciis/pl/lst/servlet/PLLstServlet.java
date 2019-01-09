/***************************************************************************************************
 * 파일명 : PLLstServlet.java
 * 기능 :  출력관리서블릿
 * 작성일자 : 2009.05.25
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.lst.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.lst.wb.PL_LST_1000WB;
import chosun.ciis.pl.lst.wb.PL_LST_3000WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLLstServlet extends BaseServlet {


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
//        String requestURI = null;
//        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/pl/lst/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLLstServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLLstServlet : process : nextPage : " + nextPage);
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
     * PLLstWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        PL_LST_1000WB wb1000 = null;
        PL_LST_3000WB wb3000 = null;
        
        switch (pid) {
        	//거래내역 메인
        	case PLLstWBMapping.PL_LST_1000:
        		wb1000 = new PL_LST_1000WB();
                System.out.println("PL_LST_1000:::::::::::::::");
                wb1000.pl_lst_1000_m(req, res);
				nextPage = "/jsp/pl/lst/pl_lst_1000_m.jsp";
				break;

        	//대행사 UPLOAD용 엑셀 DOWNLOAD
        	case PLLstWBMapping.PL_LST_1710:
        		wb1000 = new PL_LST_1000WB();
                System.out.println("PL_LST_1710:::::::::::::::");
                wb1000.pl_lst_1710_p(req, res);
				nextPage = "/jsp/pl/lst/pl_lst_1710_p.jsp";
				break;

        	//마감내역 메인
        	case PLLstWBMapping.PL_LST_3000:
        		wb3000 = new PL_LST_3000WB();
                System.out.println("PL_LST_3000:::::::::::::::");
                wb3000.pl_lst_3000_m(req, res);
				nextPage = "/jsp/pl/lst/pl_lst_3000_m.jsp";
				break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
