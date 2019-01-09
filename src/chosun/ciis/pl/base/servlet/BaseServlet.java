/***************************************************************************************************
 * ���ϸ� : BaseServlet.java
 * ��� : �⺻ ����
 * �ۼ����� : 2009-02-11
 * �ۼ��� : ���±�
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.base.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

import somo.framework.expt.SysException;
import somo.framework.servlet.ControllerServlet;

public class BaseServlet extends ControllerServlet {

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
     * JSP������ Context�� �����Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @return PageContext
     */
    protected PageContext getPageContext(HttpServletRequest req,
                                         HttpServletResponse res) {
        return JspFactory.getDefaultFactory().getPageContext(this, req, res, null, false, JspWriter.DEFAULT_BUFFER, true);
    }
	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
