package chosun.ciis.hd.tmpl.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.hd.tmpl.wb.HD_TMPL_1000WB;

public class HDTmplServlet extends BaseServlet {

	public void process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		int iPid = 0;
		String nextPage = null;
		try {
			String servletMappedUrl = "/hd/tmpl/";
			iPid = extractPid(req, servletMappedUrl);

			System.out.println("HDTmplServlet : process : iPid : " + iPid);
			nextPage = executeWorker(req, res, iPid);
			System.out.println("HDTmplServlet : process : nextPage : "
					+ nextPage);
		} catch (AppException ae) {
			req.setAttribute("appException", ae);
			nextPage = "/common/jsp/app_error.jsp";
		} catch (SysException se) {
			req.setAttribute("sysException", se);
			nextPage = "/common/jsp/sys_error.jsp";
		} catch (Exception e) {
			req.setAttribute("sysException", new SysException(e));
			nextPage = "/common/jsp/sys_error.jsp";
		}

		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				nextPage);
		rd.forward(req, res);

	}

	private String executeWorker(HttpServletRequest req,
			HttpServletResponse res, int pid) throws AppException, IOException {
		String nextPage = null;
		HD_TMPL_1000WB wb = null;

		switch (pid) {
			case HDTmplWBMapping.HD_TMPL_1000_A:
				wb = new HD_TMPL_1000WB();
				((HD_TMPL_1000WB) wb).hd_trip_1000_l(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDTmplWBMapping.HD_TMPL_1001_L:
				wb = new HD_TMPL_1000WB();
				((HD_TMPL_1000WB)wb).hd_tmpl_1001_l(req, res);
				nextPage = "/jsp/hd/tmpl/hd_tmpl_1001_l.jsp";
				break;
		}
		return nextPage;
	}
}
