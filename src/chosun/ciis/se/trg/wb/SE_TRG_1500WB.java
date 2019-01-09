/***************************************************************************************************
 * 파일명 : SE_TRG_1500WB.java
 * 기능 : 지국평가결과관리
 * 작성일자 : 2009-04-03
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
import chosun.ciis.se.trg.dao.SE_TRG_1500DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1500_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1510_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1520_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1540_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1550_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1560_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1500_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1510_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1520_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1540_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1550_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1560_ADataSet;
/**
 * 
 */

public class SE_TRG_1500WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1500_MDataSet ds = null;
		SE_TRG_1500_MDM dm = new SE_TRG_1500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1500DAO dao = new SE_TRG_1500DAO();
            ds = dao.se_trg_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1500EJBHome home = (SE_TRG_1500EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1500EJB");
//			SE_TRG_1500EJB ejb = home.create();
//
//			ds = ejb.se_trg_1500_m(dm);
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
     * 그룹관리 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1510_LDataSet ds = null;
		SE_TRG_1510_LDM dm = new SE_TRG_1510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrgpers = Util.checkString(req.getParameter("chrgpers"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_TRG_1500DAO dao = new SE_TRG_1500DAO();
            ds = dao.se_trg_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1500EJBHome home = (SE_TRG_1500EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1500EJB");
//			SE_TRG_1500EJB ejb = home.create();
//
//			ds = ejb.se_trg_1510_l(dm);
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
     * 실적 로드
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1520_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1520_ADataSet ds = null;
		SE_TRG_1520_ADM dm = new SE_TRG_1520_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1500DAO dao = new SE_TRG_1500DAO();
            ds = dao.se_trg_1520_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1500EJBHome home = (SE_TRG_1500EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1500EJB");
//			SE_TRG_1500EJB ejb = home.create();
//
//			ds = ejb.se_trg_1520_a(dm);
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
     * 지국별 그룹수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1540_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1540_ADataSet ds = null;
		SE_TRG_1540_ADM dm = new SE_TRG_1540_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		String bo_cdseq_ar = (String)hash.get("bo_cdseq"); 
		String ufth_dedu_ar = (String)hash.get("ufth_dedu"); 
		String re_free_dedu_ar = (String)hash.get("re_free_dedu"); 
		String camp_dedu_ar = (String)hash.get("camp_dedu"); 
		String exst_rdr_dedu_ar = (String)hash.get("exst_rdr_dedu"); 
		
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = bo_cdseq_ar;
		dm.ufth_dedu_ar = ufth_dedu_ar;
		dm.re_free_dedu_ar = re_free_dedu_ar;
		dm.camp_dedu_ar = camp_dedu_ar;
		dm.exst_rdr_dedu_ar = exst_rdr_dedu_ar;

        try {
        	SE_TRG_1500DAO dao = new SE_TRG_1500DAO();
            ds = dao.se_trg_1540_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_TRG_1500EJBHome home = (SE_TRG_1500EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1500EJB");
//			SE_TRG_1500EJB ejb = home.create();
//
//			ds = ejb.se_trg_1540_a(dm);
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
     * 평가요소 수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1550_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1550_ADataSet ds = null;
		SE_TRG_1550_ADM dm = new SE_TRG_1550_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1500DAO dao = new SE_TRG_1500DAO();
            ds = dao.se_trg_1550_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
//		try {
//			SE_TRG_1500EJBHome home = (SE_TRG_1500EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1500EJB");
//			SE_TRG_1500EJB ejb = home.create();
//
//			ds = ejb.se_trg_1550_a(dm);
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
     * 평가기준 전월복사
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1560_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1560_ADataSet ds = null;
		SE_TRG_1560_ADM dm = new SE_TRG_1560_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1500DAO dao = new SE_TRG_1500DAO();
            ds = dao.se_trg_1560_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1500EJBHome home = (SE_TRG_1500EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1500EJB");
//			SE_TRG_1500EJB ejb = home.create();
//
//			ds = ejb.se_trg_1560_a(dm);
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
