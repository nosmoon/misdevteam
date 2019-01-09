/***************************************************************************************************
 * 파일명 : SE_RCP_4000WB.java
 * 기능 : 입금관리-스포츠입금등록
 * 작성일자 : 2009-05-08
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
import chosun.ciis.se.rcp.dao.SE_RCP_4000DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_4000_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_4010_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_4020_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_4030_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_4040_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_4050_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_4000_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4010_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4020_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4030_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4040_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4050_ADataSet;
/**
 * 
 */

public class SE_RCP_4000WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_4000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4000_MDataSet ds = null;
		SE_RCP_4000_MDM dm = new SE_RCP_4000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_4000DAO dao = new SE_RCP_4000DAO();
            ds = dao.se_rcp_4000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4000EJBHome home = (SE_RCP_4000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4000EJB");
//			SE_RCP_4000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4000_m(dm);
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
	public void se_rcp_4010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4010_LDataSet ds = null;
		SE_RCP_4010_LDM dm = new SE_RCP_4010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));

        try {
        	SE_RCP_4000DAO dao = new SE_RCP_4000DAO();
            ds = dao.se_rcp_4010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4000EJBHome home = (SE_RCP_4000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4000EJB");
//			SE_RCP_4000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4010_l(dm);
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
	public void se_rcp_4020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4020_LDataSet ds = null;
		SE_RCP_4020_LDM dm = new SE_RCP_4020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_RCP_4000DAO dao = new SE_RCP_4000DAO();
            ds = dao.se_rcp_4020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_RCP_4000EJBHome home = (SE_RCP_4000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4000EJB");
//			SE_RCP_4000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4020_l(dm);
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
	public void se_rcp_4030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4030_LDataSet ds = null;
		SE_RCP_4030_LDM dm = new SE_RCP_4030_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));

        try {
        	SE_RCP_4000DAO dao = new SE_RCP_4000DAO();
            ds = dao.se_rcp_4030_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4000EJBHome home = (SE_RCP_4000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4000EJB");
//			SE_RCP_4000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4030_l(dm);
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
	public void se_rcp_4040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4040_ADataSet ds = null;
		SE_RCP_4040_ADM dm = new SE_RCP_4040_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
		dm.rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.net_sale_amt_ar = (String)hash.get("net_sale_amt");
		dm.sp_amt_ar = (String)hash.get("sp_amt");
		dm.amt1_ar = (String)hash.get("amt1");
		dm.amt2_ar = (String)hash.get("amt2");
		dm.amt3_ar = (String)hash.get("amt3");
		dm.amt_tot_ar = (String)hash.get("amt_tot");

        try {
        	SE_RCP_4000DAO dao = new SE_RCP_4000DAO();
            ds = dao.se_rcp_4040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4000EJBHome home = (SE_RCP_4000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4000EJB");
//			SE_RCP_4000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4040_a(dm);
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
	public void se_rcp_4050_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4050_ADataSet ds = null;
		SE_RCP_4050_ADM dm = new SE_RCP_4050_ADM();

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
		dm.amt_tot_ar = (String)hash.get("amt_tot");

        try {
        	SE_RCP_4000DAO dao = new SE_RCP_4000DAO();
            ds = dao.se_rcp_4050_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4000EJBHome home = (SE_RCP_4000EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4000EJB");
//			SE_RCP_4000EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4050_a(dm);
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
