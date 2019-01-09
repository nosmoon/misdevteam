/***************************************************************************************************
 * 파일명 : SE_RCP_1600WB.java
 * 기능 : 가상계좌등록
 * 작성일자 : 2009-05-06
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
import chosun.ciis.se.rcp.dao.SE_RCP_1600DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1600_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1610_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1620_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1630_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1600_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1610_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1620_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1630_ADataSet;
/**
 * 
 */

public class SE_RCP_1600WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1600_MDataSet ds = null;
		SE_RCP_1600_MDM dm = new SE_RCP_1600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1600DAO dao = new SE_RCP_1600DAO();
            ds = dao.se_rcp_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1600EJBHome home = (SE_RCP_1600EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1600EJB");
//			SE_RCP_1600EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1600_m(dm);
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
     * 등록내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1610_LDataSet ds = null;
		SE_RCP_1610_LDM dm = new SE_RCP_1610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));

        try {
        	SE_RCP_1600DAO dao = new SE_RCP_1600DAO();
            ds = dao.se_rcp_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1600EJBHome home = (SE_RCP_1600EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1600EJB");
//			SE_RCP_1600EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1610_l(dm);
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
     * 등록대상 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1620_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1620_LDataSet ds = null;
		SE_RCP_1620_LDM dm = new SE_RCP_1620_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));

        try {
        	SE_RCP_1600DAO dao = new SE_RCP_1600DAO();
            ds = dao.se_rcp_1620_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1600EJBHome home = (SE_RCP_1600EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1600EJB");
//			SE_RCP_1600EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1620_l(dm);
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
     * 등록/삭제 처리
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1630_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1630_ADataSet ds = null;
		SE_RCP_1630_ADM dm = new SE_RCP_1630_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.acct_no_ar = (String)hash.get("acct_no");

        try {
        	SE_RCP_1600DAO dao = new SE_RCP_1600DAO();
            ds = dao.se_rcp_1630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_RCP_1600EJBHome home = (SE_RCP_1600EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1600EJB");
//			SE_RCP_1600EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1630_a(dm);
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
