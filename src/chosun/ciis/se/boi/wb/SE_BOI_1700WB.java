/***************************************************************************************************
 * 파일명 : SE_BOI_1700WB.java
 * 기능 : 해약관리 - 인수인계처리
 * 작성일자 : 2009-05-20
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
import chosun.ciis.se.boi.dao.SE_BOI_1700DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1700_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1710_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1720_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1740_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_1700_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1710_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1720_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1740_ADataSet;
/**
 * 
 */

public class SE_BOI_1700WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1700_MDataSet ds = null;
		SE_BOI_1700_MDM dm = new SE_BOI_1700_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_1700DAO dao = new SE_BOI_1700DAO();
            ds = dao.se_boi_1700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1700EJBHome home = (SE_BOI_1700EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1700EJB");
//			SE_BOI_1700EJB ejb = home.create();
//
//			ds = ejb.se_boi_1700_m(dm);
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
	public void se_boi_1710_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1710_LDataSet ds = null;
		SE_BOI_1710_LDM dm = new SE_BOI_1710_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_BOI_1700DAO dao = new SE_BOI_1700DAO();
            ds = dao.se_boi_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1700EJBHome home = (SE_BOI_1700EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1700EJB");
//			SE_BOI_1700EJB ejb = home.create();
//
//			ds = ejb.se_boi_1710_l(dm);
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
	public void se_boi_1720_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1720_LDataSet ds = null;
		SE_BOI_1720_LDM dm = new SE_BOI_1720_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		if(bo_cd.length()==8) bo_cd = bo_cd.substring(0,5); 
		dm.bo_cd = bo_cd;

        try {
        	SE_BOI_1700DAO dao = new SE_BOI_1700DAO();
            ds = dao.se_boi_1720_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1700EJBHome home = (SE_BOI_1700EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1700EJB");
//			SE_BOI_1700EJB ejb = home.create();
//
//			ds = ejb.se_boi_1720_l(dm);
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
     * 인수인계 실행/취소
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1740_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1740_ADataSet ds = null;
		SE_BOI_1740_ADM dm = new SE_BOI_1740_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_cdseq_g = Util.checkString(req.getParameter("bo_cdseq_g"));
		dm.bo_cdseq_s = Util.checkString(req.getParameter("bo_cdseq_s"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.jd_amt_g = Util.checkString(req.getParameter("jd_amt_g"));
		dm.gy_amt_g = Util.checkString(req.getParameter("gy_amt_g"));

        try {
        	SE_BOI_1700DAO dao = new SE_BOI_1700DAO();
            ds = dao.se_boi_1740_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();		
//		try {
//			SE_BOI_1700EJBHome home = (SE_BOI_1700EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1700EJB");
//			SE_BOI_1700EJB ejb = home.create();
//
//			ds = ejb.se_boi_1740_a(dm);
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
