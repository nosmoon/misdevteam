/***************************************************************************************************
 * 파일명 : SE_BOI_2500WB.java
 * 기능 : 해약관리 - 정리구좌입금
 * 작성일자 : 2009-05-28
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
import chosun.ciis.se.boi.dao.SE_BOI_2500DAO;
import chosun.ciis.se.boi.dm.SE_BOI_2500_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_2510_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2520_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2530_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2540_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2550_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_2500_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2510_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2520_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2530_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2540_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2550_ADataSet;
/**
 * 
 */

public class SE_BOI_2500WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2500_MDataSet ds = null;
		SE_BOI_2500_MDM dm = new SE_BOI_2500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_2500DAO dao = new SE_BOI_2500DAO();
            ds = dao.se_boi_2500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2500EJBHome home = (SE_BOI_2500EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2500EJB");
//			SE_BOI_2500EJB ejb = home.create();
//
//			ds = ejb.se_boi_2500_m(dm);
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
	public void se_boi_2510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2510_LDataSet ds = null;
		SE_BOI_2510_LDM dm = new SE_BOI_2510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));

        try {
        	SE_BOI_2500DAO dao = new SE_BOI_2500DAO();
            ds = dao.se_boi_2510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2500EJBHome home = (SE_BOI_2500EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2500EJB");
//			SE_BOI_2500EJB ejb = home.create();
//
//			ds = ejb.se_boi_2510_l(dm);
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
	public void se_boi_2520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2520_LDataSet ds = null;
		SE_BOI_2520_LDM dm = new SE_BOI_2520_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_BOI_2500DAO dao = new SE_BOI_2500DAO();
            ds = dao.se_boi_2520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2500EJBHome home = (SE_BOI_2500EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2500EJB");
//			SE_BOI_2500EJB ejb = home.create();
//
//			ds = ejb.se_boi_2520_l(dm);
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
	public void se_boi_2530_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2530_LDataSet ds = null;
		SE_BOI_2530_LDM dm = new SE_BOI_2530_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));

        try {
        	SE_BOI_2500DAO dao = new SE_BOI_2500DAO();
            ds = dao.se_boi_2530_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2500EJBHome home = (SE_BOI_2500EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2500EJB");
//			SE_BOI_2500EJB ejb = home.create();
//
//			ds = ejb.se_boi_2530_l(dm);
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
	public void se_boi_2540_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2540_ADataSet ds = null;
		SE_BOI_2540_ADM dm = new SE_BOI_2540_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.amt4_ar = (String)hash.get("amt4");
		dm.rcpm_shet_no_ar = (String)hash.get("rcpm_shet_no");
		dm.rmtt_dt_ar = (String)hash.get("rmtt_dt");
		dm.rmtt_plac_ar = (String)hash.get("rmtt_plac");
		dm.biz_reg_no_ar = (String)hash.get("biz_reg_no");
		dm.bank_id_ar = (String)hash.get("bank_id");
		dm.acct_num_ar = (String)hash.get("acct_num");
		dm.tran_date_seq_ar = (String)hash.get("tran_date_seq");
		dm.tran_amt_ar = (String)hash.get("tran_amt");

        try {
        	SE_BOI_2500DAO dao = new SE_BOI_2500DAO();
            ds = dao.se_boi_2540_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_BOI_2500EJBHome home = (SE_BOI_2500EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2500EJB");
//			SE_BOI_2500EJB ejb = home.create();
//
//			ds = ejb.se_boi_2540_a(dm);
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
	public void se_boi_2550_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2550_ADataSet ds = null;
		SE_BOI_2550_ADM dm = new SE_BOI_2550_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");

        try {
        	SE_BOI_2500DAO dao = new SE_BOI_2500DAO();
            ds = dao.se_boi_2550_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_BOI_2500EJBHome home = (SE_BOI_2500EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2500EJB");
//			SE_BOI_2500EJB ejb = home.create();
//
//			ds = ejb.se_boi_2550_a(dm);
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
