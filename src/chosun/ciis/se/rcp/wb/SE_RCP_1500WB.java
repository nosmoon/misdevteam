/***************************************************************************************************
 * 파일명 : SE_RCP_1500WB.java
 * 기능 : 입금관리-입금정정
 * 작성일자 : 2009-05-04
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
import chosun.ciis.se.rcp.dao.SE_RCP_1500DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1500_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1510_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1520_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1530_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1540_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_1550_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1500_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1510_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1520_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1530_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1540_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1550_ADataSet;
/**
 * 
 */

public class SE_RCP_1500WB extends BaseWB {

	
    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1500_MDataSet ds = null;
		SE_RCP_1500_MDM dm = new SE_RCP_1500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1500DAO dao = new SE_RCP_1500DAO();
            ds = dao.se_rcp_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1500EJBHome home = (SE_RCP_1500EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1500EJB");
//			SE_RCP_1500EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1500_m(dm);
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
	public void se_rcp_1510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1510_LDataSet ds = null;
		SE_RCP_1510_LDM dm = new SE_RCP_1510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_RCP_1500DAO dao = new SE_RCP_1500DAO();
            ds = dao.se_rcp_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1500EJBHome home = (SE_RCP_1500EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1500EJB");
//			SE_RCP_1500EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1510_l(dm);
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
	public void se_rcp_1520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1520_LDataSet ds = null;
		SE_RCP_1520_LDM dm = new SE_RCP_1520_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));

        try {
        	SE_RCP_1500DAO dao = new SE_RCP_1500DAO();
            ds = dao.se_rcp_1520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1500EJBHome home = (SE_RCP_1500EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1500EJB");
//			SE_RCP_1500EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1520_l(dm);
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
	public void se_rcp_1530_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1530_LDataSet ds = null;
		SE_RCP_1530_LDM dm = new SE_RCP_1530_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cdseq = Util.checkString(req.getParameter("bo_cdseq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_RCP_1500DAO dao = new SE_RCP_1500DAO();
            ds = dao.se_rcp_1530_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1500EJBHome home = (SE_RCP_1500EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1500EJB");
//			SE_RCP_1500EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1530_l(dm);
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
	public void se_rcp_1540_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1540_ADataSet ds = null;
		SE_RCP_1540_ADM dm = new SE_RCP_1540_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.amt1_ar = (String)hash.get("amt1");
		dm.amt2_ar = (String)hash.get("amt2");
		dm.amt3_ar = (String)hash.get("amt3");
		dm.remk_ar = (String)hash.get("remk");

        try {
        	SE_RCP_1500DAO dao = new SE_RCP_1500DAO();
            ds = dao.se_rcp_1540_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	//dm.print();

//		try {
//			SE_RCP_1500EJBHome home = (SE_RCP_1500EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1500EJB");
//			SE_RCP_1500EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1540_a(dm);
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
	public void se_rcp_1550_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1550_ADataSet ds = null;
		SE_RCP_1550_ADM dm = new SE_RCP_1550_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.occr_dt_ar = (String)hash.get("occr_dt");
		dm.slip_clsf_ar = (String)hash.get("slip_clsf");
		dm.seq_ar = (String)hash.get("seq");

        try {
        	SE_RCP_1500DAO dao = new SE_RCP_1500DAO();
            ds = dao.se_rcp_1550_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	//dm.print();

//		try {
//			SE_RCP_1500EJBHome home = (SE_RCP_1500EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1500EJB");
//			SE_RCP_1500EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1550_a(dm);
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
