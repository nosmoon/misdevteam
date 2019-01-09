/***************************************************************************************************
 * 파일명 : SE_BOI_2300WB.java
 * 기능 : 해약관리 - 정리구좌이월
 * 작성일자 : 2009-05-27
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
import chosun.ciis.se.boi.dao.SE_BOI_2300DAO;
import chosun.ciis.se.boi.dm.SE_BOI_2300_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_2310_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2320_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2340_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_2300_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2310_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2320_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2340_ADataSet;
/**
 * 
 */

public class SE_BOI_2300WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2300_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2300_MDataSet ds = null;
		SE_BOI_2300_MDM dm = new SE_BOI_2300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_2300DAO dao = new SE_BOI_2300DAO();
            ds = dao.se_boi_2300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2300EJBHome home = (SE_BOI_2300EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2300EJB");
//			SE_BOI_2300EJB ejb = home.create();
//
//			ds = ejb.se_boi_2300_m(dm);
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
     * 내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2310_LDataSet ds = null;
		SE_BOI_2310_LDM dm = new SE_BOI_2310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_BOI_2300DAO dao = new SE_BOI_2300DAO();
            ds = dao.se_boi_2310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2300EJBHome home = (SE_BOI_2300EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2300EJB");
//			SE_BOI_2300EJB ejb = home.create();
//
//			ds = ejb.se_boi_2310_l(dm);
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
     * 대상 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2320_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2320_LDataSet ds = null;
		SE_BOI_2320_LDM dm = new SE_BOI_2320_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));

        try {
        	SE_BOI_2300DAO dao = new SE_BOI_2300DAO();
            ds = dao.se_boi_2320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2300EJBHome home = (SE_BOI_2300EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2300EJB");
//			SE_BOI_2300EJB ejb = home.create();
//
//			ds = ejb.se_boi_2320_l(dm);
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
	public void se_boi_2340_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2340_ADataSet ds = null;
		SE_BOI_2340_ADM dm = new SE_BOI_2340_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.bo_cdseq_ar = (String)hash.get("bo_cd");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.occr_dt_ar = (String)hash.get("occr_dt");
		dm.slip_clsf_ar = (String)hash.get("slip_clsf");
		dm.seq_ar = (String)hash.get("seq");
		dm.amt1_ar = (String)hash.get("amt1");
		dm.amt2_ar = (String)hash.get("amt2");
		dm.amt3_ar = (String)hash.get("amt3");

        try {
        	SE_BOI_2300DAO dao = new SE_BOI_2300DAO();
            ds = dao.se_boi_2340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();		
//		try {
//			SE_BOI_2300EJBHome home = (SE_BOI_2300EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2300EJB");
//			SE_BOI_2300EJB ejb = home.create();
//
//			ds = ejb.se_boi_2340_a(dm);
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
