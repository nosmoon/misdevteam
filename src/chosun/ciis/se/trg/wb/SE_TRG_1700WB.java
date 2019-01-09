/***************************************************************************************************
 * 파일명 : SE_TRG_1700WB.java
 * 기능 : 담당평가기준관리
 * 작성일자 : 2009-04-06
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
import chosun.ciis.se.trg.dao.SE_TRG_1700DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1710_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1720_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1730_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1740_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1750_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1710_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1720_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1730_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1740_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1750_ADataSet;
/**
 * 
 */

public class SE_TRG_1700WB extends BaseWB {

    /**
     * 평가내역 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1710_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1710_LDataSet ds = null;
		SE_TRG_1710_LDM dm = new SE_TRG_1710_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yy1 = Util.checkString(req.getParameter("yy1"));
		dm.yy2 = Util.checkString(req.getParameter("yy2"));

        try {
        	SE_TRG_1700DAO dao = new SE_TRG_1700DAO();
            ds = dao.se_trg_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1700EJBHome home = (SE_TRG_1700EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1700EJB");
//			SE_TRG_1700EJB ejb = home.create();
//
//			ds = ejb.se_trg_1710_l(dm);
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
     * 평가기준 내역조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1720_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1720_LDataSet ds = null;
		SE_TRG_1720_LDM dm = new SE_TRG_1720_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));

        try {
        	SE_TRG_1700DAO dao = new SE_TRG_1700DAO();
            ds = dao.se_trg_1720_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1700EJBHome home = (SE_TRG_1700EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1700EJB");
//			SE_TRG_1700EJB ejb = home.create();
//
//			ds = ejb.se_trg_1720_l(dm);
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
     * 평가기준 저장
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1730_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1730_ADataSet ds = null;
		SE_TRG_1730_ADM dm = new SE_TRG_1730_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));
		dm.evlu_nm = Util.checkString(req.getParameter("evlu_nm"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
		
    	String mode_ar = (String)hash.get("m"); 
		String evlu_clsf_ar = (String)hash.get("evlu_clsf"); 
		String bgn_yymm_ar = (String)hash.get("bgn_yymm"); 
		String end_yymm_ar = (String)hash.get("end_yymm"); 
		String psdo_midl_val_ar = (String)hash.get("psdo_midl_val"); 
		String remk_ar = (String)hash.get("remk"); 
		
		dm.mode_ar = mode_ar.toUpperCase();
		dm.evlu_clsf_ar = evlu_clsf_ar;
		dm.bgn_yymm_ar = bgn_yymm_ar;
		dm.end_yymm_ar = end_yymm_ar;
		dm.psdo_midl_val_ar = psdo_midl_val_ar;
		dm.remk_ar = remk_ar;

        try {
        	SE_TRG_1700DAO dao = new SE_TRG_1700DAO();
            ds = dao.se_trg_1730_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1700EJBHome home = (SE_TRG_1700EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1700EJB");
//			SE_TRG_1700EJB ejb = home.create();
//
//			ds = ejb.se_trg_1730_a(dm);
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
     * 평가실행
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1740_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1740_ADataSet ds = null;
		SE_TRG_1740_ADM dm = new SE_TRG_1740_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));

        try {
        	SE_TRG_1700DAO dao = new SE_TRG_1700DAO();
            ds = dao.se_trg_1740_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//		try {
//			SE_TRG_1700EJBHome home = (SE_TRG_1700EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1700EJB");
//			SE_TRG_1700EJB ejb = home.create();
//
//			ds = ejb.se_trg_1740_a(dm);
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
     * 마감/마감취소
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1750_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1750_ADataSet ds = null;
		SE_TRG_1750_ADM dm = new SE_TRG_1750_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));

        try {
        	SE_TRG_1700DAO dao = new SE_TRG_1700DAO();
            ds = dao.se_trg_1750_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1700EJBHome home = (SE_TRG_1700EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1700EJB");
//			SE_TRG_1700EJB ejb = home.create();
//
//			ds = ejb.se_trg_1750_a(dm);
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
