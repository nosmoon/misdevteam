/***************************************************************************************************
 * 파일명 : SE_RCP_1200WB.java
 * 기능 : 입금관리-입금등록
 * 작성일자 : 2009-04-22
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
import chosun.ciis.se.rcp.dao.SE_RCP_1200DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1200_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1210_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1220_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1230_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1240_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_1250_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1200_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1210_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1220_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1230_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1240_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1250_ADataSet;
/**
 * 
 */

public class SE_RCP_1200WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1200_MDataSet ds = null;
		SE_RCP_1200_MDM dm = new SE_RCP_1200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1200DAO dao = new SE_RCP_1200DAO();
            ds = dao.se_rcp_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1200EJBHome home = (SE_RCP_1200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1200EJB");
//			SE_RCP_1200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1200_m(dm);
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
     * 처리내역 조회(상단)
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1210_LDataSet ds = null;
		SE_RCP_1210_LDM dm = new SE_RCP_1210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));

        try {
        	SE_RCP_1200DAO dao = new SE_RCP_1200DAO();
            ds = dao.se_rcp_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1200EJBHome home = (SE_RCP_1200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1200EJB");
//			SE_RCP_1200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1210_l(dm);
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
     * 처리내역조회(하단)
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1220_LDataSet ds = null;
		SE_RCP_1220_LDM dm = new SE_RCP_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_RCP_1200DAO dao = new SE_RCP_1200DAO();
            ds = dao.se_rcp_1220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1200EJBHome home = (SE_RCP_1200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1200EJB");
//			SE_RCP_1200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1220_l(dm);
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
	public void se_rcp_1230_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1230_LDataSet ds = null;
		SE_RCP_1230_LDM dm = new SE_RCP_1230_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));

        try {
        	SE_RCP_1200DAO dao = new SE_RCP_1200DAO();
            ds = dao.se_rcp_1230_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1200EJBHome home = (SE_RCP_1200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1200EJB");
//			SE_RCP_1200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1230_l(dm);
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
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1240_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1240_ADataSet ds = null;
		SE_RCP_1240_ADM dm = new SE_RCP_1240_ADM();

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
		dm.amt2_ar = (String)hash.get("amt2");
		dm.amt3_ar = (String)hash.get("amt3");
		dm.amt4_ar = (String)hash.get("amt4");
		dm.amt5_ar = (String)hash.get("amt5");
		dm.amt6_ar = (String)hash.get("amt6");
		dm.amt_sum_ar = (String)hash.get("amt_tot");
		dm.rcpm_shet_no_ar = (String)hash.get("rcpm_shet_no");
		dm.rmtt_dt_ar = (String)hash.get("rmtt_dt");
		dm.rmtt_plac_ar = (String)hash.get("rmtt_plac");
		dm.biz_reg_no_ar = (String)hash.get("biz_reg_no");
		dm.bank_id_ar = (String)hash.get("bank_id");
		dm.acct_num_ar = (String)hash.get("acct_num");
		dm.tran_date_seq_ar = (String)hash.get("tran_date_seq");
		dm.tran_amt_ar = (String)hash.get("tran_amt");
		
		dm.print();

        try {
        	SE_RCP_1200DAO dao = new SE_RCP_1200DAO();
            ds = dao.se_rcp_1240_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
	
//		try {
//			SE_RCP_1200EJBHome home = (SE_RCP_1200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1200EJB");
//			SE_RCP_1200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1240_a(dm);
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
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1250_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1250_ADataSet ds = null;
		SE_RCP_1250_ADM dm = new SE_RCP_1250_ADM();

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
		dm.acpt_rcpm_reg_tot_amt_ar = (String)hash.get("acpt_rcpm_reg_tot_amt");
		dm.rcpm_amt_ar = (String)hash.get("amt_tot");

        try {
        	SE_RCP_1200DAO dao = new SE_RCP_1200DAO();
            ds = dao.se_rcp_1250_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//		try {
//			SE_RCP_1200EJBHome home = (SE_RCP_1200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1200EJB");
//			SE_RCP_1200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1250_a(dm);
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
