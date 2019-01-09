/***************************************************************************************************
 * 파일명 : SE_BOI_1800WB.java
 * 기능 : 해약관리 - 환불처리
 * 작성일자 : 2009-05-22
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
import chosun.ciis.se.boi.dao.SE_BOI_1800DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1800_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1810_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1820_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1830_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1840_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_1850_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_1800_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1810_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1820_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1830_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1840_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1850_ADataSet;
/**
 * 
 */

public class SE_BOI_1800WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1800_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1800_MDataSet ds = null;
		SE_BOI_1800_MDM dm = new SE_BOI_1800_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_1800DAO dao = new SE_BOI_1800DAO();
            ds = dao.se_boi_1800_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1800EJBHome home = (SE_BOI_1800EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1800EJB");
//			SE_BOI_1800EJB ejb = home.create();
//
//			ds = ejb.se_boi_1800_m(dm);
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
	public void se_boi_1810_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1810_LDataSet ds = null;
		SE_BOI_1810_LDM dm = new SE_BOI_1810_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_BOI_1800DAO dao = new SE_BOI_1800DAO();
            ds = dao.se_boi_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1800EJBHome home = (SE_BOI_1800EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1800EJB");
//			SE_BOI_1800EJB ejb = home.create();
//
//			ds = ejb.se_boi_1810_l(dm);
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
	public void se_boi_1820_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1820_LDataSet ds = null;
		SE_BOI_1820_LDM dm = new SE_BOI_1820_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_BOI_1800DAO dao = new SE_BOI_1800DAO();
            ds = dao.se_boi_1820_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1800EJBHome home = (SE_BOI_1800EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1800EJB");
//			SE_BOI_1800EJB ejb = home.create();
//
//			ds = ejb.se_boi_1820_l(dm);
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
	public void se_boi_1830_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1830_LDataSet ds = null;
		SE_BOI_1830_LDM dm = new SE_BOI_1830_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_cd = bo_cd.substring(0,5);
		dm.bo_seq = bo_cd.substring(5,8);

        try {
        	SE_BOI_1800DAO dao = new SE_BOI_1800DAO();
            ds = dao.se_boi_1830_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1800EJBHome home = (SE_BOI_1800EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1800EJB");
//			SE_BOI_1800EJB ejb = home.create();
//
//			ds = ejb.se_boi_1830_l(dm);
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
	public void se_boi_1840_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1840_ADataSet ds = null;
		SE_BOI_1840_ADM dm = new SE_BOI_1840_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.bo_cdseq = Util.checkString(req.getParameter("bo_cd"));
		dm.amt1 = Util.checkString(req.getParameter("amt1"));
		dm.amt2 = Util.checkString(req.getParameter("amt2"));

        try {
        	SE_BOI_1800DAO dao = new SE_BOI_1800DAO();
            ds = dao.se_boi_1840_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//	dm.print();
//		try {
//			SE_BOI_1800EJBHome home = (SE_BOI_1800EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1800EJB");
//			SE_BOI_1800EJB ejb = home.create();
//
//			ds = ejb.se_boi_1840_a(dm);
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
	public void se_boi_1850_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1850_ADataSet ds = null;
		SE_BOI_1850_ADM dm = new SE_BOI_1850_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_BOI_1800DAO dao = new SE_BOI_1800DAO();
            ds = dao.se_boi_1850_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1800EJBHome home = (SE_BOI_1800EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1800EJB");
//			SE_BOI_1800EJB ejb = home.create();
//
//			ds = ejb.se_boi_1850_a(dm);
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
