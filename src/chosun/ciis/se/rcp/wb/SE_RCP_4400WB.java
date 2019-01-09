/***************************************************************************************************
 * 파일명 : SE_RCP_4400WB.java
 * 기능 : 스포츠조정액(마감일)등록
 * 작성일자 : 2009-05-18
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_4400DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_4400_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_4410_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_4420_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_4430_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_4400_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4410_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4420_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4430_ADataSet;
/**
 * 
 */

public class SE_RCP_4400WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_4400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4400_MDataSet ds = null;
		SE_RCP_4400_MDM dm = new SE_RCP_4400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_4400DAO dao = new SE_RCP_4400DAO();
            ds = dao.se_rcp_4400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4400EJBHome home = (SE_RCP_4400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4400EJB");
//			SE_RCP_4400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4400_m(dm);
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
     * 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_4410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4410_LDataSet ds = null;
		SE_RCP_4410_LDM dm = new SE_RCP_4410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_RCP_4400DAO dao = new SE_RCP_4400DAO();
            ds = dao.se_rcp_4410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_RCP_4400EJBHome home = (SE_RCP_4400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4400EJB");
//			SE_RCP_4400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4410_l(dm);
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
     * 등록/수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_4420_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4420_ADataSet ds = null;
		SE_RCP_4420_ADM dm = new SE_RCP_4420_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.bgn_rcpm_dt = Util.checkString(req.getParameter("bgn_rcpm_dt"));
		dm.end_rcpm_dt = Util.checkString(req.getParameter("end_rcpm_dt"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.dept_cd_ar = (String)hash.get("dept_cd");
		dm.part_cd_ar = (String)hash.get("part_cd");
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.meda_amt_ar = (String)hash.get("meda_amt");

        try {
        	SE_RCP_4400DAO dao = new SE_RCP_4400DAO();
            ds = dao.se_rcp_4420_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_RCP_4400EJBHome home = (SE_RCP_4400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4400EJB");
//			SE_RCP_4400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4420_a(dm);
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
     

	public void se_rcp_4430_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4430_ADataSet ds = null;
		SE_RCP_4430_ADM dm = new SE_RCP_4430_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.print();

        try {
        	SE_RCP_4400DAO dao = new SE_RCP_4400DAO();
            ds = dao.se_rcp_4430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		/*
		try {
			SE_RCP_4000EJBHome home = (SE_RCP_4000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4000EJB");
			SE_RCP_4000EJB ejb = home.create();

			ds = ejb.se_rcp_4430_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		*/
	}

	
}
