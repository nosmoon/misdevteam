/***************************************************************************************************
* 파일명 : SE_BNS_2100WB.java
* 기능 : 판촉물관리 - 판촉물 입금등록
* 작성일자 : 2009-05-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_2100DAO;
import chosun.ciis.se.bns.dm.SE_BNS_2100_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_2110_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_2120_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_2130_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_2140_ADM;
import chosun.ciis.se.bns.dm.SE_BNS_2150_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_2100_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2110_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2120_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2130_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2140_ADataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2150_ADataSet;
/**
 * 
 */

public class SE_BNS_2100WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bns_2100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BNS_2100_MDataSet ds = null;
		SE_BNS_2100_MDM dm = new SE_BNS_2100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BNS_2100DAO dao = new SE_BNS_2100DAO();
            ds = dao.se_bns_2100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BNS_2100EJBHome home = (SE_BNS_2100EJBHome)JNDIManager.getInstance().getHome("SE_BNS_2100EJB");
//			SE_BNS_2100EJB ejb = home.create();
//
//			ds = ejb.se_bns_2100_m(dm);
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
     * 상단 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bns_2110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BNS_2110_LDataSet ds = null;
		SE_BNS_2110_LDM dm = new SE_BNS_2110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.divn_dt1 = Util.checkString(req.getParameter("divn_dt1"));
		dm.divn_dt2 = Util.checkString(req.getParameter("divn_dt2"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));

        try {
        	SE_BNS_2100DAO dao = new SE_BNS_2100DAO();
            ds = dao.se_bns_2110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BNS_2100EJBHome home = (SE_BNS_2100EJBHome)JNDIManager.getInstance().getHome("SE_BNS_2100EJB");
//			SE_BNS_2100EJB ejb = home.create();
//
//			ds = ejb.se_bns_2110_l(dm);
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
     * 하단 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bns_2120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BNS_2120_LDataSet ds = null;
		SE_BNS_2120_LDM dm = new SE_BNS_2120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_BNS_2100DAO dao = new SE_BNS_2100DAO();
            ds = dao.se_bns_2120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BNS_2100EJBHome home = (SE_BNS_2100EJBHome)JNDIManager.getInstance().getHome("SE_BNS_2100EJB");
//			SE_BNS_2100EJB ejb = home.create();
//
//			ds = ejb.se_bns_2120_l(dm);
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
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bns_2130_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BNS_2130_LDataSet ds = null;
		SE_BNS_2130_LDM dm = new SE_BNS_2130_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.divn_dt1 = Util.checkString(req.getParameter("divn_dt1"));
		dm.divn_dt2 = Util.checkString(req.getParameter("divn_dt2"));

        try {
        	SE_BNS_2100DAO dao = new SE_BNS_2100DAO();
            ds = dao.se_bns_2130_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_BNS_2100EJBHome home = (SE_BNS_2100EJBHome)JNDIManager.getInstance().getHome("SE_BNS_2100EJB");
//			SE_BNS_2100EJB ejb = home.create();
//
//			ds = ejb.se_bns_2130_l(dm);
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
     * 입금등록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bns_2140_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BNS_2140_ADataSet ds = null;
		SE_BNS_2140_ADM dm = new SE_BNS_2140_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.acct_tot_ar = (String)hash.get("acct_rcpm_rem_amt");
		dm.acpt_tot_ar = (String)hash.get("acpt_rcpm_reg_tot_amt");
		dm.amt1_ar = (String)hash.get("amt1");
		dm.bns_item_cd_ar = (String)hash.get("bns_item_cd");
		dm.divn_dt_ar = (String)hash.get("divn_dt");
		dm.ewh_seq_ar = (String)hash.get("ewh_seq");
		dm.rcpm_shet_no_ar = (String)hash.get("rcpm_shet_no");
		dm.rmtt_dt_ar = (String)hash.get("rmtt_dt");
		dm.rmtt_plac_ar = (String)hash.get("rmtt_plac");
		dm.biz_reg_no_ar = (String)hash.get("biz_reg_no");
		dm.bank_id_ar = (String)hash.get("bank_id");
		dm.acct_num_ar = (String)hash.get("acct_num");
		dm.tran_date_seq_ar = (String)hash.get("tran_date_seq");
		dm.tran_amt_ar = (String)hash.get("tran_amt");

        try {
        	SE_BNS_2100DAO dao = new SE_BNS_2100DAO();
            ds = dao.se_bns_2140_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_BNS_2100EJBHome home = (SE_BNS_2100EJBHome)JNDIManager.getInstance().getHome("SE_BNS_2100EJB");
//			SE_BNS_2100EJB ejb = home.create();
//
//			ds = ejb.se_bns_2140_a(dm);
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
     * 입금취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bns_2150_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BNS_2150_ADataSet ds = null;
		SE_BNS_2150_ADM dm = new SE_BNS_2150_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.amt1_ar = (String)hash.get("amt1");
		
        try {
        	SE_BNS_2100DAO dao = new SE_BNS_2100DAO();
            ds = dao.se_bns_2150_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BNS_2100EJBHome home = (SE_BNS_2100EJBHome)JNDIManager.getInstance().getHome("SE_BNS_2100EJB");
//			SE_BNS_2100EJB ejb = home.create();
//
//			ds = ejb.se_bns_2150_a(dm);
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
