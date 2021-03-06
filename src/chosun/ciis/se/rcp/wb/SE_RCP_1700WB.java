/***************************************************************************************************
 * 파일명 : SE_RCP_1700WB.java
 * 기능 : 입금관리-전세지원금환입
 * 작성일자 : 2009-05-14
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
import chosun.ciis.se.rcp.dao.SE_RCP_1700DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1700_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1710_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1720_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1730_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1740_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_1750_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1700_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1710_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1720_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1730_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1740_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1750_ADataSet;
/**
 * 
 */

public class SE_RCP_1700WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1700_MDataSet ds = null;
		SE_RCP_1700_MDM dm = new SE_RCP_1700_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1700DAO dao = new SE_RCP_1700DAO();
            ds = dao.se_rcp_1700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1700EJBHome home = (SE_RCP_1700EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1700EJB");
//			SE_RCP_1700EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1700_m(dm);
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
	public void se_rcp_1710_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1710_LDataSet ds = null;
		SE_RCP_1710_LDM dm = new SE_RCP_1710_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));

        try {
        	SE_RCP_1700DAO dao = new SE_RCP_1700DAO();
            ds = dao.se_rcp_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1700EJBHome home = (SE_RCP_1700EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1700EJB");
//			SE_RCP_1700EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1710_l(dm);
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
	public void se_rcp_1720_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1720_LDataSet ds = null;
		SE_RCP_1720_LDM dm = new SE_RCP_1720_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_RCP_1700DAO dao = new SE_RCP_1700DAO();
            ds = dao.se_rcp_1720_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1700EJBHome home = (SE_RCP_1700EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1700EJB");
//			SE_RCP_1700EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1720_l(dm);
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
	public void se_rcp_1730_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1730_LDataSet ds = null;
		SE_RCP_1730_LDM dm = new SE_RCP_1730_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));

        try {
        	SE_RCP_1700DAO dao = new SE_RCP_1700DAO();
            ds = dao.se_rcp_1730_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1700EJBHome home = (SE_RCP_1700EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1700EJB");
//			SE_RCP_1700EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1730_l(dm);
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
	public void se_rcp_1740_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1740_ADataSet ds = null;
		SE_RCP_1740_ADM dm = new SE_RCP_1740_ADM();

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
		dm.rcpm_shet_no_ar = (String)hash.get("rcpm_shet_no");
		dm.rmtt_dt_ar = (String)hash.get("rmtt_dt");
		dm.rmtt_plac_ar = (String)hash.get("rmtt_plac");
		dm.biz_reg_no_ar = (String)hash.get("biz_reg_no");
		dm.bank_id_ar = (String)hash.get("bank_id");
		dm.acct_num_ar = (String)hash.get("acct_num");
		dm.tran_date_seq_ar = (String)hash.get("tran_date_seq");
		dm.tran_amt_ar = (String)hash.get("tran_amt");

        try {
        	SE_RCP_1700DAO dao = new SE_RCP_1700DAO();
            ds = dao.se_rcp_1740_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_RCP_1700EJBHome home = (SE_RCP_1700EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1700EJB");
//			SE_RCP_1700EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1740_a(dm);
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
	public void se_rcp_1750_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1750_ADataSet ds = null;
		SE_RCP_1750_ADM dm = new SE_RCP_1750_ADM();

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
		dm.amt2_ar = (String)hash.get("amt2");

        try {
        	SE_RCP_1700DAO dao = new SE_RCP_1700DAO();
            ds = dao.se_rcp_1750_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1700EJBHome home = (SE_RCP_1700EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1700EJB");
//			SE_RCP_1700EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1750_a(dm);
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
