/***************************************************************************************************
 * 파일명 : SE_BOI_2000WB.java
 * 기능 : 해약관리 - 타지국인수인계
 * 작성일자 : 2009-05-25
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
***************************************************************************************************/

package chosun.ciis.se.boi.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_2000DAO;
import chosun.ciis.se.boi.dm.SE_BOI_2000_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_2010_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2020_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2030_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2040_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2050_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_2000_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2010_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2020_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2030_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2040_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2050_ADataSet;
/**
 * 
 */

public class SE_BOI_2000WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2000_MDataSet ds = null;
		SE_BOI_2000_MDM dm = new SE_BOI_2000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_2000DAO dao = new SE_BOI_2000DAO();
            ds = dao.se_boi_2000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2000EJBHome home = (SE_BOI_2000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2000EJB");
//			SE_BOI_2000EJB ejb = home.create();
//
//			ds = ejb.se_boi_2000_m(dm);
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
     * 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2010_LDataSet ds = null;
		SE_BOI_2010_LDM dm = new SE_BOI_2010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_BOI_2000DAO dao = new SE_BOI_2000DAO();
            ds = dao.se_boi_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2000EJBHome home = (SE_BOI_2000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2000EJB");
//			SE_BOI_2000EJB ejb = home.create();
//
//			ds = ejb.se_boi_2010_l(dm);
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
     * 상세 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2020_LDataSet ds = null;
		SE_BOI_2020_LDM dm = new SE_BOI_2020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_BOI_2000DAO dao = new SE_BOI_2000DAO();
            ds = dao.se_boi_2020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2000EJBHome home = (SE_BOI_2000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2000EJB");
//			SE_BOI_2000EJB ejb = home.create();
//
//			ds = ejb.se_boi_2020_l(dm);
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
	public void se_boi_2030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2030_LDataSet ds = null;
		SE_BOI_2030_LDM dm = new SE_BOI_2030_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String callgb = Util.checkString(req.getParameter("callgb"));
		String bo_cdseq = "";
		if("1".equals(callgb)){
			bo_cdseq = Util.checkString(req.getParameter("bo_cdseq1"));
		}else{
			bo_cdseq = Util.checkString(req.getParameter("bo_cdseq2"));
		}
	
		dm.bo_cd = bo_cdseq.substring(0,5);
		dm.bo_seq = bo_cdseq.substring(5,8);

        try {
        	SE_BOI_2000DAO dao = new SE_BOI_2000DAO();
            ds = dao.se_boi_2030_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_BOI_2000EJBHome home = (SE_BOI_2000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2000EJB");
//			SE_BOI_2000EJB ejb = home.create();
//
//			ds = ejb.se_boi_2030_l(dm);
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
	public void se_boi_2040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2040_ADataSet ds = null;
		SE_BOI_2040_ADM dm = new SE_BOI_2040_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.bo_cdseq1 = Util.checkString(req.getParameter("bo_cdseq1"));
		dm.area_cd1 = Util.checkString(req.getParameter("area_cd1"));
		dm.chrg_pers1 = Util.checkString(req.getParameter("chrg_pers1"));
		dm.bo_cdseq2 = Util.checkString(req.getParameter("bo_cdseq2"));
		dm.area_cd2 = Util.checkString(req.getParameter("area_cd2"));
		dm.chrg_pers2 = Util.checkString(req.getParameter("chrg_pers2"));
		dm.amt1 = Util.checkString(req.getParameter("amt1"));
		dm.amt2 = Util.checkString(req.getParameter("amt2"));

        try {
        	SE_BOI_2000DAO dao = new SE_BOI_2000DAO();
            ds = dao.se_boi_2040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2000EJBHome home = (SE_BOI_2000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2000EJB");
//			SE_BOI_2000EJB ejb = home.create();
//
//			ds = ejb.se_boi_2040_a(dm);
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
	public void se_boi_2050_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2050_ADataSet ds = null;
		SE_BOI_2050_ADM dm = new SE_BOI_2050_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_BOI_2000DAO dao = new SE_BOI_2000DAO();
            ds = dao.se_boi_2050_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2000EJBHome home = (SE_BOI_2000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2000EJB");
//			SE_BOI_2000EJB ejb = home.create();
//
//			ds = ejb.se_boi_2050_a(dm);
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
