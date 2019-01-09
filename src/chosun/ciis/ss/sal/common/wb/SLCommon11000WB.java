/**************************************************************************************************
* 파일명    : SLCommon11000WB.java
* 기능      : Servlet에서 받은 parameter를 이용하여 dm을 set하고
*             EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
* 작성일자  : 2003-11-19
* 작성자    : 김영윤
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;

/**
 * Servlet에서 받은 parameter를 이용하여 dm을 set하고 EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 */
public class SLCommon11000WB {


	/**
	 * 우편번호검색(목록조회)
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 * @throws SysException
	 */
	public void mo_selectNewAddrList(HttpServletRequest req, HttpServletResponse res) //모바일용
		throws AppException, SysException {

		// parameter requesting 하고 DM에 값을 Setting
		String bocd = req.getParameter("bocd"); // 지국지사코드
		String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido"))); //
		String gugun = Util.Uni2Ksc(Util.checkString(req.getParameter("gugun"))); //
		String rdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdnm"))); //
		String bldgnn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnn1"))); //
		String bldgnn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnn2"))); //
		String dong = Util.Uni2Ksc(Util.checkString(req.getParameter("dong"))); //
		String localnn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("localnn1"))); //
		String localnn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("localnn2"))); //
		String bldgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnm"))); //
		String job_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("job_flag"))); //
		String orderby = Util.Uni2Ksc(Util.checkString(req.getParameter("orderby"))); //
		String pageno = Util.checkString(req.getParameter("pageno")); // 현재 페이지
		String pagesize = Util.checkString(req.getParameter("pagesize")); // 페이지사이즈

		CO_MO_L_NEW_ADDRDM dm = new CO_MO_L_NEW_ADDRDM();
		dm.setBocd(bocd); // 지국지사코드
		dm.setSido(sido);
		dm.setGugun(gugun);
		dm.setRdnm(rdnm);
		dm.setBldgnn1(bldgnn1);
		dm.setBldgnn2(bldgnn2);
		dm.setDong(dong);
		dm.setBnji1(localnn1);
		dm.setBnji2(localnn2);
		dm.setBldgnm(bldgnm);
		dm.setJob_flag(job_flag);
		dm.setOrderby(orderby);
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));

		dm.print();

		CO_MO_L_NEW_ADDRDataSet ds = null;

		SLCommon11000DAO dao = new SLCommon11000DAO();
		ds = dao.mo_selectNewAddrList(dm);
		req.setAttribute("ds", ds);

	}
	
	

	/**
	 * 우편번호검색(구군목록)
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 * @throws SysException
	 */
	public void mo_selectNewGugunList(HttpServletRequest req, HttpServletResponse res) //모바일용
		throws AppException, SysException {
	// parameter requesting 하고 DM에 값을 Setting

		String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido"))); // 시/도


		CO_L_NEWGUGUNDM dm = new CO_L_NEWGUGUNDM();
		dm.setSearchgb("2");
		dm.setSearchnm(sido);

		dm.print();

		CO_L_NEWGUGUNDataSet ds = null;

		SLCommon11000DAO dao = new SLCommon11000DAO();
	    ds = dao.mo_selectNewGugunList(dm);
	    req.setAttribute("ds", ds);

	}

	
}

