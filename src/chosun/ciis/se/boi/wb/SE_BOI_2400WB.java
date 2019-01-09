/***************************************************************************************************
 * 파일명 : SE_BOI_2400WB.java
 * 기능 : 해약관리 - 정리구좌대손처리
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
import chosun.ciis.se.boi.dao.SE_BOI_2400DAO;
import chosun.ciis.se.boi.dm.SE_BOI_2400_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_2410_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2440_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2450_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_2400_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2410_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2440_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2450_ADataSet;
/**
 * 
 */

public class SE_BOI_2400WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2400_MDataSet ds = null;
		SE_BOI_2400_MDM dm = new SE_BOI_2400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
        try {
        	SE_BOI_2400DAO dao = new SE_BOI_2400DAO();
            ds = dao.se_boi_2400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2400EJBHome home = (SE_BOI_2400EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2400EJB");
//			SE_BOI_2400EJB ejb = home.create();
//
//			ds = ejb.se_boi_2400_m(dm);
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
	public void se_boi_2410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2410_LDataSet ds = null;
		SE_BOI_2410_LDM dm = new SE_BOI_2410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_BOI_2400DAO dao = new SE_BOI_2400DAO();
            ds = dao.se_boi_2410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_BOI_2400EJBHome home = (SE_BOI_2400EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2400EJB");
//			SE_BOI_2400EJB ejb = home.create();
//
//			ds = ejb.se_boi_2410_l(dm);
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
	public void se_boi_2440_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2440_ADataSet ds = null;
		SE_BOI_2440_ADM dm = new SE_BOI_2440_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.tot_amt = Util.checkString(req.getParameter("tot_amt"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.amt3_ar = (String)hash.get("amt3");

        try {
        	SE_BOI_2400DAO dao = new SE_BOI_2400DAO();
            ds = dao.se_boi_2440_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();		
//		try {
//			SE_BOI_2400EJBHome home = (SE_BOI_2400EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2400EJB");
//			SE_BOI_2400EJB ejb = home.create();
//
//			ds = ejb.se_boi_2440_a(dm);
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
	public void se_boi_2450_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2450_ADataSet ds = null;
		SE_BOI_2450_ADM dm = new SE_BOI_2450_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");

        try {
        	SE_BOI_2400DAO dao = new SE_BOI_2400DAO();
            ds = dao.se_boi_2450_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_BOI_2400EJBHome home = (SE_BOI_2400EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2400EJB");
//			SE_BOI_2400EJB ejb = home.create();
//
//			ds = ejb.se_boi_2450_a(dm);
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
