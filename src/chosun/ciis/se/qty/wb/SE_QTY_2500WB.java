/***************************************************************************************************
* 파일명 : SE_QTY_2500WB.java
* 기능 : 부수관리 - 발송부수 - 노선별발송부수현황
* 작성일자 : 2009-03-06
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.qty.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_2500DAO;
import chosun.ciis.se.qty.dm.SE_QTY_2500_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_2510_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2520_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_2500_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2510_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2520_LDataSet;
/**
 * 
 */

public class SE_QTY_2500WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2500_MDataSet ds = null;
		SE_QTY_2500_MDM dm = new SE_QTY_2500_MDM();

		dm.setCmpy_cd	(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		
        try {
        	SE_QTY_2500DAO dao = new SE_QTY_2500DAO();
            ds = dao.se_qty_2500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2500EJBHome home = (SE_QTY_2500EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2500EJB");
//			SE_QTY_2500EJB ejb = home.create();
//
//			ds = ejb.se_qty_2500_m(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
    
	/**
     * 라이트 그리드 컬럼
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2510_LDataSet ds = null;
		SE_QTY_2510_LDM dm = new SE_QTY_2510_LDM();

		dm.setCmpy_cd	(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		
        try {
        	SE_QTY_2500DAO dao = new SE_QTY_2500DAO();
            ds = dao.se_qty_2510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2500EJBHome home = (SE_QTY_2500EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2500EJB");
//			SE_QTY_2500EJB ejb = home.create();
//
//			ds = ejb.se_qty_2510_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
	
	/**
     * 노선발송부수현황 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2520_LDataSet ds = null;
		SE_QTY_2520_LDM dm = new SE_QTY_2520_LDM();

		String route_clsf		= Util.checkString(req.getParameter("route_clsf"	));
		String route_cd			= Util.checkString(req.getParameter("route_cd"		));
		String bo_cd			= Util.checkString(req.getParameter("bo_cd"			));
		String send_plac_seq	= Util.checkString(req.getParameter("send_plac_seq"	));
		String area_cd			= Util.checkString(req.getParameter("area_cd"		));
		
		dm.setCmpy_cd			(Util.getSessionParameterValue(req, "cmpycd", true	));
		dm.setIncmg_pers		(Util.getSessionParameterValue(req, "emp_no"	, true	));
		dm.setRoute_clsf		(route_clsf											);
		dm.setRoute_cd			(route_cd											);
		dm.setBo_cd				(bo_cd												);
		dm.setSend_plac_seq		(send_plac_seq										);
		dm.setArea_cd			(area_cd											);
		
        try {
        	SE_QTY_2500DAO dao = new SE_QTY_2500DAO();
            ds = dao.se_qty_2520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
		
//		try {
//			SE_QTY_2500EJBHome home = (SE_QTY_2500EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2500EJB");
//			SE_QTY_2500EJB ejb = home.create();
//
//			ds = ejb.se_qty_2520_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
}
