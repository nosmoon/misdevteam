/***************************************************************************************************
 * 파일명 : SE_BOI_2100WB.java
 * 기능 : 해약관리 - 타지국전세보증금인수인계
 * 작성일자 : 2009-05-25
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
***************************************************************************************************/

package chosun.ciis.se.boi.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_2100DAO;
import chosun.ciis.se.boi.dm.SE_BOI_2100_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_2110_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2120_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2130_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2140_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2150_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_2100_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2110_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2120_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2130_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2140_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2150_ADataSet;
/**
 * 
 */

public class SE_BOI_2100WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2100_MDataSet ds = null;
		SE_BOI_2100_MDM dm = new SE_BOI_2100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_2100DAO dao = new SE_BOI_2100DAO();
            ds = dao.se_boi_2100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2100EJBHome home = (SE_BOI_2100EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2100EJB");
//			SE_BOI_2100EJB ejb = home.create();
//
//			ds = ejb.se_boi_2100_m(dm);
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
	public void se_boi_2110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2110_LDataSet ds = null;
		SE_BOI_2110_LDM dm = new SE_BOI_2110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_BOI_2100DAO dao = new SE_BOI_2100DAO();
            ds = dao.se_boi_2110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2100EJBHome home = (SE_BOI_2100EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2100EJB");
//			SE_BOI_2100EJB ejb = home.create();
//
//			ds = ejb.se_boi_2110_l(dm);
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
	public void se_boi_2120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2120_LDataSet ds = null;
		SE_BOI_2120_LDM dm = new SE_BOI_2120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_BOI_2100DAO dao = new SE_BOI_2100DAO();
            ds = dao.se_boi_2120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//		try {
//			SE_BOI_2100EJBHome home = (SE_BOI_2100EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2100EJB");
//			SE_BOI_2100EJB ejb = home.create();
//
//			ds = ejb.se_boi_2120_l(dm);
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
	public void se_boi_2130_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2130_LDataSet ds = null;
		SE_BOI_2130_LDM dm = new SE_BOI_2130_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bogb = Util.checkString(req.getParameter("bogb"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));

        try {
        	SE_BOI_2100DAO dao = new SE_BOI_2100DAO();
            ds = dao.se_boi_2130_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2100EJBHome home = (SE_BOI_2100EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2100EJB");
//			SE_BOI_2100EJB ejb = home.create();
//
//			ds = ejb.se_boi_2130_l(dm);
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
     * 실행/수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2140_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2140_ADataSet ds = null;
		SE_BOI_2140_ADM dm = new SE_BOI_2140_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.bo_cdseq = Util.checkString(req.getParameter("bo_cdseq"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.amt = Util.checkString(req.getParameter("amt"));
		dm.leas_sply_amt_unrcp_occr_dt = Util.checkString(req.getParameter("misudt"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq2_ar = (String)hash.get("bo_cdseq");
		dm.area_cd2_ar = (String)hash.get("area_cd");
		dm.chrg_pers2_ar = (String)hash.get("chrg_pers");
		dm.amt2_ar = (String)hash.get("amt2");

        try {
        	SE_BOI_2100DAO dao = new SE_BOI_2100DAO();
            ds = dao.se_boi_2140_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_BOI_2100EJBHome home = (SE_BOI_2100EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2100EJB");
//			SE_BOI_2100EJB ejb = home.create();
//
//			ds = ejb.se_boi_2140_a(dm);
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
     * 취소
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2150_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2150_ADataSet ds = null;
		SE_BOI_2150_ADM dm = new SE_BOI_2150_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_BOI_2100DAO dao = new SE_BOI_2100DAO();
            ds = dao.se_boi_2150_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//		try {
//			SE_BOI_2100EJBHome home = (SE_BOI_2100EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2100EJB");
//			SE_BOI_2100EJB ejb = home.create();
//
//			ds = ejb.se_boi_2150_a(dm);
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
