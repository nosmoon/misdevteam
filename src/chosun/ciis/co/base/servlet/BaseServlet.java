/***************************************************************************************************
 * ���ϸ� : PriBaseServlet.java
 * ��� : ���ڿ�� Ȩ������ ������ �⺻ ����
 * �ۼ����� : 2003-04-10
 * �ۼ��� : ���±�
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.co.base.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;

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
import somo.framework.util.Util;

public abstract class BaseServlet extends ControllerServlet {

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

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	       Enumeration headerNames = req.getHeaderNames();
	        while(headerNames.hasMoreElements()){
	            String name = (String)headerNames.nextElement();
	            String value = req.getHeader(name);
	            System.out.println(name + " : " + value + "<br>");
	        }
		HttpSession session = req.getSession(false);

		//20161206 �弱�� �߰� ����Ͽ�
		String device = Util.checkString(req.getParameter("device"));

		if (
				((Util.checkString(req.getHeader("User-Agent")).toLowerCase().indexOf("android") > -1)
				&& (Util.checkString(req.getHeader("device")).toLowerCase().equals("mobile")))
				|| (device.equals("ANDROID_TEST"))) { // ���߱Ⱓ���ȸ� ����ϱ� (test�Ҷ���)
			process(req, res);
		} else {
			if (session == null) {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/common/jsp/session_out.jsp");
				rd.forward(req, res);
			} else {
				process(req, res);
			}
		}
	}


	/**
	 * JSP������ Context�� �����Ѵ�.
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @return PageContext
	 */
	protected PageContext getPageContext(HttpServletRequest req,
			HttpServletResponse res) {
		return JspFactory.getDefaultFactory().getPageContext(this, req, res,
				null, false, JspWriter.DEFAULT_BUFFER, true);
	}

}
