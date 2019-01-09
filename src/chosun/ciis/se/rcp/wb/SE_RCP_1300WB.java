/***************************************************************************************************
 * 파일명 : SE_RCP_1300WB.java
 * 기능 : 입금관리-대체입금등록
 * 작성일자 : 2009-04-29
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
import chosun.ciis.se.rcp.dao.SE_RCP_1300DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1300_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1310_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1320_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1330_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1340_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_1350_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1300_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1310_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1320_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1330_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1340_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1350_ADataSet;
/**
 * 
 */

public class SE_RCP_1300WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1300_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1300_MDataSet ds = null;
		SE_RCP_1300_MDM dm = new SE_RCP_1300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1300DAO dao = new SE_RCP_1300DAO();
            ds = dao.se_rcp_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1300EJBHome home = (SE_RCP_1300EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1300EJB");
//			SE_RCP_1300EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1300_m(dm);
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
	public void se_rcp_1310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1310_LDataSet ds = null;
		SE_RCP_1310_LDM dm = new SE_RCP_1310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_RCP_1300DAO dao = new SE_RCP_1300DAO();
            ds = dao.se_rcp_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1300EJBHome home = (SE_RCP_1300EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1300EJB");
//			SE_RCP_1300EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1310_l(dm);
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
	public void se_rcp_1320_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1320_LDataSet ds = null;
		SE_RCP_1320_LDM dm = new SE_RCP_1320_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_RCP_1300DAO dao = new SE_RCP_1300DAO();
            ds = dao.se_rcp_1320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();	
//		try {
//			SE_RCP_1300EJBHome home = (SE_RCP_1300EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1300EJB");
//			SE_RCP_1300EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1320_l(dm);
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
	public void se_rcp_1330_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1330_LDataSet ds = null;
		SE_RCP_1330_LDM dm = new SE_RCP_1330_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.altn_trgt = Util.checkString(req.getParameter("altn_trgt"));

        try {
        	SE_RCP_1300DAO dao = new SE_RCP_1300DAO();
            ds = dao.se_rcp_1330_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1300EJBHome home = (SE_RCP_1300EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1300EJB");
//			SE_RCP_1300EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1330_l(dm);
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
	public void se_rcp_1340_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1340_ADataSet ds = null;
		SE_RCP_1340_ADM dm = new SE_RCP_1340_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.altn_trgt = Util.checkString(req.getParameter("altn_trgt"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.amt1_ar = (String)hash.get("amt1");
		dm.amt2_ar = (String)hash.get("amt2");
		dm.amt3_ar = (String)hash.get("amt3");
		dm.amt4_ar = (String)hash.get("amt4");
		dm.amt5_ar = (String)hash.get("amt5");
		dm.amt6_ar = (String)hash.get("amt6");
		dm.misuamt_ar = (String)hash.get("misuamt");
		dm.occr_slip_clsf_ar = (String)hash.get("occr_slip_clsf");
		dm.occr_slip_no_ar = (String)hash.get("occr_slip_no");

        try {
        	SE_RCP_1300DAO dao = new SE_RCP_1300DAO();
            ds = dao.se_rcp_1340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();		
//		try {
//			SE_RCP_1300EJBHome home = (SE_RCP_1300EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1300EJB");
//			SE_RCP_1300EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1340_a(dm);
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
	public void se_rcp_1350_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1350_ADataSet ds = null;
		SE_RCP_1350_ADM dm = new SE_RCP_1350_ADM();

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

        try {
        	SE_RCP_1300DAO dao = new SE_RCP_1300DAO();
            ds = dao.se_rcp_1350_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_RCP_1300EJBHome home = (SE_RCP_1300EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1300EJB");
//			SE_RCP_1300EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1350_a(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.area_cd = (String)hash.get("area_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.slip_clsf = (String)hash.get("slip_clsf");
		dm.seq = (String)hash.get("seq");
		dm.rcpm_dt = (String)hash.get("rcpm_dt");
		dm.mode_ar = (String)hash.get("mode_ar");
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq_ar");
		dm.rcpm_amt_ar = (String)hash.get("rcpm_amt_ar");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		*******************************************************************************************/
	}

}
