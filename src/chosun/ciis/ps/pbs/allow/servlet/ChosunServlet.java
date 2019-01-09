/***************************************************************************************************
* 파일명   : ChosunServlet.java
* 기능     : 출판국 수당 대표 서블릿
* 작성일자 : 2004-02-24
* 작성자   : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import somo.framework.servlet.*;
import somo.framework.expt.*;

/**
 * 출판업무지원 수당메뉴 서블릿
 */
public abstract class ChosunServlet extends ControllerServlet {

    public abstract void checkAuthority();

    /**
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,
     * 리턴된 nextPage로 request를 forward한다.
     *
     * @param req request
     * @param res response
     * @throws IOException
     * @throws ServletException
     */
    public abstract void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException;

    /**
     * PSAllowWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,
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
    public abstract String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws SysException, AppException;

    public int extractPid(HttpServletRequest req, String servletMappedUrl) {
        int iPid = 0;
        try {
            String requestURI = req.getRequestURI();                         // (예 : "/allow/1100")
            String strPid = requestURI.substring(servletMappedUrl.length()); // PID 값 (예 : "1100")
            iPid = Integer.parseInt(strPid);
        } catch (Exception e) {
            throw new SysException(e);
        }
        return iPid;
    }

}
