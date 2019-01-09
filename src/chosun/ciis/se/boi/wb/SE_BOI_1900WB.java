/***************************************************************************************************
 * 파일명 : SE_BOI_1900WB.java
 * 기능 : 해약관리 - 전세보증금인수인계
 * 작성일자 : 2009-05-22
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
***************************************************************************************************/

package chosun.ciis.se.boi.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_1900DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1900_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1910_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1920_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1930_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1940_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_1900_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1910_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1920_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1930_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1940_ADataSet;
/**
 * 
 */

public class SE_BOI_1900WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1900_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1900_MDataSet ds = null;
		SE_BOI_1900_MDM dm = new SE_BOI_1900_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_1900DAO dao = new SE_BOI_1900DAO();
            ds = dao.se_boi_1900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1900EJBHome home = (SE_BOI_1900EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1900EJB");
//			SE_BOI_1900EJB ejb = home.create();
//
//			ds = ejb.se_boi_1900_m(dm);
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
	public void se_boi_1910_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1910_LDataSet ds = null;
		SE_BOI_1910_LDM dm = new SE_BOI_1910_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_BOI_1900DAO dao = new SE_BOI_1900DAO();
            ds = dao.se_boi_1910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1900EJBHome home = (SE_BOI_1900EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1900EJB");
//			SE_BOI_1900EJB ejb = home.create();
//
//			ds = ejb.se_boi_1910_l(dm);
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
     * 상세 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1920_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1920_LDataSet ds = null;
		SE_BOI_1920_LDM dm = new SE_BOI_1920_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));

        try {
        	SE_BOI_1900DAO dao = new SE_BOI_1900DAO();
            ds = dao.se_boi_1920_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1900EJBHome home = (SE_BOI_1900EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1900EJB");
//			SE_BOI_1900EJB ejb = home.create();
//
//			ds = ejb.se_boi_1920_l(dm);
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
     * 처리대상 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1930_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1930_LDataSet ds = null;
		SE_BOI_1930_LDM dm = new SE_BOI_1930_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_cd = bo_cd.substring(0,5);

        try {
        	SE_BOI_1900DAO dao = new SE_BOI_1900DAO();
            ds = dao.se_boi_1930_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1900EJBHome home = (SE_BOI_1900EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1900EJB");
//			SE_BOI_1900EJB ejb = home.create();
//
//			ds = ejb.se_boi_1930_l(dm);
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
     * 실행/취소
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1940_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1940_ADataSet ds = null;
		SE_BOI_1940_ADM dm = new SE_BOI_1940_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.bo_cdseq_g = Util.checkString(req.getParameter("bo_cdseq_g"));
		dm.bo_cdseq_s = Util.checkString(req.getParameter("bo_cdseq_s"));
		dm.amt = Util.checkString(req.getParameter("amt"));
		dm.leas_sply_amt_unrcp_occr_dt = Util.checkString(req.getParameter("leas_sply_amt_unrcp_occr_dt"));

        try {
        	SE_BOI_1900DAO dao = new SE_BOI_1900DAO();
            ds = dao.se_boi_1940_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1900EJBHome home = (SE_BOI_1900EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1900EJB");
//			SE_BOI_1900EJB ejb = home.create();
//
//			ds = ejb.se_boi_1940_a(dm);
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
