/***************************************************************************************************
 * 파일명 : SE_RCP_1000WB.java
 * 기능 : (가상계좌)입금확인
 * 작성일자 : 2009-04-15
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
import chosun.ciis.se.rcp.dao.SE_RCP_1000DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1000_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1010_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1020_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1030_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1000_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1010_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1020_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1030_ADataSet;
/**
 * 
 */

public class SE_RCP_1000WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1000_MDataSet ds = null;
		SE_RCP_1000_MDM dm = new SE_RCP_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1000DAO dao = new SE_RCP_1000DAO();
            ds = dao.se_rcp_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1000EJBHome home = (SE_RCP_1000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1000EJB");
//			SE_RCP_1000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1000_m(dm);
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
     * 입금확인 내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1010_LDataSet ds = null;
		SE_RCP_1010_LDM dm = new SE_RCP_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.acct_no = Util.checkString(req.getParameter("acct_no"));
		dm.rcpm_pers = Util.checkString(req.getParameter("rcpm_pers"));
		dm.cnfm_yn = Util.checkString(req.getParameter("cnfm_yn"));

        try {
        	SE_RCP_1000DAO dao = new SE_RCP_1000DAO();
            ds = dao.se_rcp_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_RCP_1000EJBHome home = (SE_RCP_1000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1000EJB");
//			SE_RCP_1000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1010_l(dm);
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
     * 총입금액 내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1020_LDataSet ds = null;
		SE_RCP_1020_LDM dm = new SE_RCP_1020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.acct_no = Util.checkString(req.getParameter("acct_no"));
		dm.rcpm_pers = Util.checkString(req.getParameter("rcpm_pers"));
		dm.cnfm_yn = Util.checkString(req.getParameter("cnfm_yn"));

        try {
        	SE_RCP_1000DAO dao = new SE_RCP_1000DAO();
            ds = dao.se_rcp_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1000EJBHome home = (SE_RCP_1000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1000EJB");
//			SE_RCP_1000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1020_l(dm);
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
     * 입금확인 처리
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1030_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1030_ADataSet ds = null;
		SE_RCP_1030_ADM dm = new SE_RCP_1030_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();

		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.biz_reg_no_ar = (String)hash.get("biz_reg_no");
		dm.bank_id_ar = (String)hash.get("bank_id");
		dm.acct_num_ar = (String)hash.get("acct_num");
		dm.tran_date_ar = (String)hash.get("tran_date");
		dm.tran_date_seq_ar = (String)hash.get("tran_date_seq");
		dm.tran_amt_ar = (String)hash.get("tran_amt");
		dm.cnfm_yn_ar = (String)hash.get("cnfm_yn");

        try {
        	SE_RCP_1000DAO dao = new SE_RCP_1000DAO();
            ds = dao.se_rcp_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_RCP_1000EJBHome home = (SE_RCP_1000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1000EJB");
//			SE_RCP_1000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1030_a(dm);
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
