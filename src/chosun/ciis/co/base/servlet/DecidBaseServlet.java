/***************************************************************************************************
 * 파일명 : DecidBaseServlet.java
 * 기능 : 독자우대 홈페이지 구현의 기본 서블릿
 * 작성일자 : 2003-04-10
 * 작성자 : 양정녕
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.co.base.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

import somo.framework.expt.SysException;
import somo.framework.servlet.ControllerServlet;

public abstract class DecidBaseServlet extends ControllerServlet {

	public void checkAuthority() {
    }
    public int extractPid(HttpServletRequest req, String servletMappedUrl) {

        int iPid = 0;
        try {
            String requestURI = req.getRequestURI();
            String strPid = requestURI.substring(servletMappedUrl.length());
        	iPid = Integer.parseInt(strPid);
        } catch (Exception e) {
            throw new SysException(e);
        }
        return iPid;
    }

    /**
     * JSP페이지 Context를 리턴한다.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @return PageContext
     */
    protected PageContext getPageContext(HttpServletRequest req,
                                         HttpServletResponse res) {
        return JspFactory.getDefaultFactory().getPageContext(this, req, res, null, false, JspWriter.DEFAULT_BUFFER, true);
    }
    
}
