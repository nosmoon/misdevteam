/***************************************************************************************************
 * 파일명 : SE_TRG_1900WB.java
 * 기능 : 부실확장등록
 * 작성일자 : 2009-04-010
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.trg.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.trg.dao.SE_TRG_1900DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1900_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1910_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1915_SDM;
import chosun.ciis.se.trg.dm.SE_TRG_1920_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1900_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1910_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1915_SDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1920_ADataSet;
/**
 * 
 */

public class SE_TRG_1900WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1900_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1900_MDataSet ds = null;
		SE_TRG_1900_MDM dm = new SE_TRG_1900_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1900DAO dao = new SE_TRG_1900DAO();
            ds = dao.se_trg_1900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1900EJBHome home = (SE_TRG_1900EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1900EJB");
//			SE_TRG_1900EJB ejb = home.create();
//
//			ds = ejb.se_trg_1900_m(dm);
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
     * 부실내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1910_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1910_LDataSet ds = null;
		SE_TRG_1910_LDM dm = new SE_TRG_1910_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yymm1 = Util.checkString(req.getParameter("yymm1"));
		dm.yymm2 = Util.checkString(req.getParameter("yymm2"));

        try {
        	SE_TRG_1900DAO dao = new SE_TRG_1900DAO();
            ds = dao.se_trg_1910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1900EJBHome home = (SE_TRG_1900EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1900EJB");
//			SE_TRG_1900EJB ejb = home.create();
//
//			ds = ejb.se_trg_1910_l(dm);
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

	public void se_trg_1915_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1915_SDataSet ds = null;
		SE_TRG_1915_SDM dm = new SE_TRG_1915_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));

        try {
        	SE_TRG_1900DAO dao = new SE_TRG_1900DAO();
            ds = dao.se_trg_1915_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1900EJBHome home = (SE_TRG_1900EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1900EJB");
//			SE_TRG_1900EJB ejb = home.create();
//
//			ds = ejb.se_trg_1915_s(dm);
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
     * 부실 저장
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1920_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1920_ADataSet ds = null;
		SE_TRG_1920_ADM dm = new SE_TRG_1920_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.yymm_ar = (String)hash.get("yymm");
		dm.bo_cd_ar = (String)hash.get("bo_cd");
		dm.ufth_dedu_ar = (String)hash.get("ufth_dedu");
		dm.remk_ar = (String)hash.get("remk");

        try {
        	SE_TRG_1900DAO dao = new SE_TRG_1900DAO();
            ds = dao.se_trg_1920_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_TRG_1900EJBHome home = (SE_TRG_1900EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1900EJB");
//			SE_TRG_1900EJB ejb = home.create();
//
//			ds = ejb.se_trg_1920_a(dm);
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
