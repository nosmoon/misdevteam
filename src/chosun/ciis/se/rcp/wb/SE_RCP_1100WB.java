/***************************************************************************************************
 * 파일명 : SE_RCP_1100WB.java
 * 기능 : (가상계좌)입금전환
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
import chosun.ciis.se.rcp.dao.SE_RCP_1100DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1100_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1110_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1120_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1130_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_1140_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1100_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1110_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1120_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1130_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1140_ADataSet;
/**
 * 
 */

public class SE_RCP_1100WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1100_MDataSet ds = null;
		SE_RCP_1100_MDM dm = new SE_RCP_1100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1100DAO dao = new SE_RCP_1100DAO();
            ds = dao.se_rcp_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1100EJBHome home = (SE_RCP_1100EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1100EJB");
//			SE_RCP_1100EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1100_m(dm);
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
     * 입금전환 내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1110_LDataSet ds = null;
		SE_RCP_1110_LDM dm = new SE_RCP_1110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.swit_dt1 = Util.checkString(req.getParameter("swit_dt1"));
		dm.swit_dt2 = Util.checkString(req.getParameter("swit_dt2"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.cnfm_yn = Util.checkString(req.getParameter("cnfm_yn"));

        try {
        	SE_RCP_1100DAO dao = new SE_RCP_1100DAO();
            ds = dao.se_rcp_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1100EJBHome home = (SE_RCP_1100EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1100EJB");
//			SE_RCP_1100EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1110_l(dm);
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
     * 지국정보 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1120_LDataSet ds = null;
		SE_RCP_1120_LDM dm = new SE_RCP_1120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));

        try {
        	SE_RCP_1100DAO dao = new SE_RCP_1100DAO();
            ds = dao.se_rcp_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1100EJBHome home = (SE_RCP_1100EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1100EJB");
//			SE_RCP_1100EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1120_l(dm);
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
     * 입금전환 처리
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1130_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1130_ADataSet ds = null;
		SE_RCP_1130_ADM dm = new SE_RCP_1130_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.trsf_bo_cd = Util.checkString(req.getParameter("trsf_bo_cd"));
		dm.trsf_bo_seq = Util.checkString(req.getParameter("trsf_bo_seq"));
		dm.trsf_amt = Util.checkString(req.getParameter("trsf_amt"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		String acpt_bo_cdseq_ar = (String)hash.get("bo_cdseq"); 
		String acpt_amt_ar = (String)hash.get("acpt_amt"); 
		
		dm.mode_ar = mode_ar.toUpperCase();
		dm.acpt_bo_cdseq_ar = acpt_bo_cdseq_ar;
		dm.acpt_amt_ar = acpt_amt_ar;
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_RCP_1100DAO dao = new SE_RCP_1100DAO();
            ds = dao.se_rcp_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_RCP_1100EJBHome home = (SE_RCP_1100EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1100EJB");
//			SE_RCP_1100EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1130_a(dm);
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
     * 입금전환 취소
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1140_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1140_ADataSet ds = null;
		SE_RCP_1140_ADM dm = new SE_RCP_1140_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.swit_dt_ar = (String)hash.get("swit_dt");
		dm.swit_seq_ar = (String)hash.get("swit_seq");

        try {
        	SE_RCP_1100DAO dao = new SE_RCP_1100DAO();
            ds = dao.se_rcp_1140_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_RCP_1100EJBHome home = (SE_RCP_1100EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1100EJB");
//			SE_RCP_1100EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1140_a(dm);
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
		dm.mode_ar = (String)hash.get("mode_ar");
		dm.area_cd_ar = (String)hash.get("area_cd_ar");
		dm.swit_dt_ar = (String)hash.get("swit_dt_ar");
		dm.swit_seq_ar = (String)hash.get("swit_seq_ar");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		*******************************************************************************************/
	}
	
}
