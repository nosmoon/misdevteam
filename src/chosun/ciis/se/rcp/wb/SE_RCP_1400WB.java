/***************************************************************************************************
 * 파일명 : SE_RCP_1400WB.java
 * 기능 : 입금관리-외환입금등록
 * 작성일자 : 2009-04-30
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_1400DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_1400_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1410_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1420_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1430_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_1440_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_1450_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_1400_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1410_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1420_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1430_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1440_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_1450_ADataSet;
/**
 * 
 */

public class SE_RCP_1400WB extends BaseWB {

	
    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_1400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1400_MDataSet ds = null;
		SE_RCP_1400_MDM dm = new SE_RCP_1400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_1400DAO dao = new SE_RCP_1400DAO();
            ds = dao.se_rcp_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1400EJBHome home = (SE_RCP_1400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1400EJB");
//			SE_RCP_1400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1400_m(dm);
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
	public void se_rcp_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1410_LDataSet ds = null;
		SE_RCP_1410_LDM dm = new SE_RCP_1410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cdseq = Util.checkString(req.getParameter("bo_cdseq"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_RCP_1400DAO dao = new SE_RCP_1400DAO();
            ds = dao.se_rcp_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1400EJBHome home = (SE_RCP_1400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1400EJB");
//			SE_RCP_1400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1410_l(dm);
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
	public void se_rcp_1420_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1420_LDataSet ds = null;
		SE_RCP_1420_LDM dm = new SE_RCP_1420_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_RCP_1400DAO dao = new SE_RCP_1400DAO();
            ds = dao.se_rcp_1420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
	
//		try {
//			SE_RCP_1400EJBHome home = (SE_RCP_1400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1400EJB");
//			SE_RCP_1400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1420_l(dm);
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
	public void se_rcp_1430_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1430_LDataSet ds = null;
		SE_RCP_1430_LDM dm = new SE_RCP_1430_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cdseq = Util.checkString(req.getParameter("bo_cdseq"));

        try {
        	SE_RCP_1400DAO dao = new SE_RCP_1400DAO();
            ds = dao.se_rcp_1430_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_1400EJBHome home = (SE_RCP_1400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1400EJB");
//			SE_RCP_1400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1430_l(dm);
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
	public void se_rcp_1440_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1440_ADataSet ds = null;
		SE_RCP_1440_ADM dm = new SE_RCP_1440_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.bo_cdseq = Util.checkString(req.getParameter("bo_cdseq"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.hjamt = Util.checkString(req.getParameter("hjamt"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
		dm.rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
		dm.yhcs = Util.checkString(req.getParameter("yhcs"));
		dm.yhci = Util.checkString(req.getParameter("yhci"));
		dm.biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
		dm.bank_id = Util.checkString(req.getParameter("bank_id"));
		dm.acct_num = Util.checkString(req.getParameter("acct_num"));
		dm.tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
		dm.tran_amt = Util.checkString(req.getParameter("flex_amt"));
		dm.acct_tonghwa = Util.checkString(req.getParameter("acct_tonghwa"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_RCP_1400DAO dao = new SE_RCP_1400DAO();
            ds = dao.se_rcp_1440_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_RCP_1400EJBHome home = (SE_RCP_1400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1400EJB");
//			SE_RCP_1400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1440_a(dm);
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
	public void se_rcp_1450_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_1450_ADataSet ds = null;
		SE_RCP_1450_ADM dm = new SE_RCP_1450_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));

        try {
        	SE_RCP_1400DAO dao = new SE_RCP_1400DAO();
            ds = dao.se_rcp_1450_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_RCP_1400EJBHome home = (SE_RCP_1400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_1400EJB");
//			SE_RCP_1400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_1450_a(dm);
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
