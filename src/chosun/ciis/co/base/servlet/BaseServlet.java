/***************************************************************************************************
 * 파일명 : PriBaseServlet.java
 * 기능 : 독자우대 홈페이지 구현의 기본 서블릿
 * 작성일자 : 2003-04-10
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
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

		//20161206 장선희 추가 모바일용
		String device = Util.checkString(req.getParameter("device"));

		if (
				((Util.checkString(req.getHeader("User-Agent")).toLowerCase().indexOf("android") > -1)
				&& (Util.checkString(req.getHeader("device")).toLowerCase().equals("mobile")))
				|| (device.equals("ANDROID_TEST"))) { // 개발기간동안만 사용하기 (test할때나)
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
	 * JSP페이지 Context를 리턴한다.
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
