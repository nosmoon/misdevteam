/***************************************************************************************************
* 파일명 : SE_SAL_2500WB.java
* 기능 : 판매 - 매출관리 - 단건계산서등록
* 작성일자 : 2009-07-20
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_2500DAO;
import chosun.ciis.se.sal.dm.SE_SAL_2500_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2510_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_2520_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_2530_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_2535_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_2537_SDM;
import chosun.ciis.se.sal.dm.SE_SAL_2540_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_2550_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_2560_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_2570_UDM;
import chosun.ciis.se.sal.ds.SE_SAL_2500_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2510_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2520_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2530_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2535_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2537_SDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2540_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2550_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2560_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2570_UDataSet;
/**
 * 
 */

public class SE_SAL_2500WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2500_MDataSet ds = null;
		SE_SAL_2500_MDM dm = new SE_SAL_2500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2500_m(dm);
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
     * 전표내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2510_LDataSet ds = null;
		SE_SAL_2510_LDM dm = new SE_SAL_2510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2510_l(dm);
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
     * 입금내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2520_LDataSet ds = null;
		SE_SAL_2520_LDM dm = new SE_SAL_2520_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2520_l(dm);
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
     * 입금대상 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2530_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2530_LDataSet ds = null;
		SE_SAL_2530_LDM dm = new SE_SAL_2530_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2530_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2530_l(dm);
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
     * 계산서 상세조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2535_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2535_LDataSet ds = null;
		SE_SAL_2535_LDM dm = new SE_SAL_2535_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.tax_no = Util.checkString(req.getParameter("tax_no"));

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2535_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2535_l(dm);
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

	public void se_sal_2537_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2537_SDataSet ds = null;
		SE_SAL_2537_SDM dm = new SE_SAL_2537_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2537_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2537_s(dm);
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
     * 입금,계산서 저장
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2540_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2540_ADataSet ds = null;
		SE_SAL_2540_ADM dm = new SE_SAL_2540_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.acct_mang_no = Util.checkString(req.getParameter("acct_mang_no"));
		dm.rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
		dm.rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
		dm.corp_clsf = Util.checkString(req.getParameter("corp_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
		dm.elec_tax_issu_dt = Util.checkString(req.getParameter("elec_tax_issu_dt"));
		dm.rcpm_yymm = Util.checkString(req.getParameter("rcpm_yymm"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.acct_tot_ar = (String)hash.get("acct_rcpm_rem_amt");
		dm.acpt_tot_ar = (String)hash.get("acpt_rcpm_reg_tot_amt");
		dm.amt1_ar = (String)hash.get("amt1");
		dm.amt2_ar = (String)hash.get("amt2");
		dm.amt3_ar = (String)hash.get("amt3");
		dm.amt4_ar = (String)hash.get("amt4");
		dm.amt5_ar = (String)hash.get("amt5");
		dm.amt_sum_ar = (String)hash.get("amt_tot");
		dm.rcpm_shet_no_ar = (String)hash.get("rcpm_shet_no");
		dm.biz_reg_no_ar = (String)hash.get("biz_reg_no");
		dm.bank_id_ar = (String)hash.get("bank_id");
		dm.acct_num_ar = (String)hash.get("acct_num");
		dm.tran_date_seq_ar = (String)hash.get("tran_date_seq");
		dm.tran_amt_ar = (String)hash.get("tran_amt");
		dm.print();
		
        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2540_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2540_a(dm);
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
     * 입금,계산서 저장취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2550_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2550_ADataSet ds = null;
		SE_SAL_2550_ADM dm = new SE_SAL_2550_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		
		dm.bo_cdseq_ar = (String)hash.get("bo_cdseq");
		dm.acpt_rcpm_reg_tot_amt_ar = (String)hash.get("acpt_rcpm_reg_tot_amt");
		dm.rcpm_amt_ar = (String)hash.get("amt_tot");

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2550_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2550_a(dm);
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
     * 전자 계산서 발행
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2560_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2560_ADataSet ds = null;
		SE_SAL_2560_ADM dm = new SE_SAL_2560_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.tmsg_type = Util.checkString(req.getParameter("tmsg_type"));
		dm.stmt_clsf = Util.checkString(req.getParameter("stmt_clsf"));
		dm.pers_clsf = Util.checkString(req.getParameter("pers_clsf"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.semuro_id = Util.checkString(req.getParameter("semuro_id"));

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2560_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2560_a(dm);
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

	public void se_sal_2570_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2570_UDataSet ds = null;
		SE_SAL_2570_UDM dm = new SE_SAL_2570_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));

        try {
        	SE_SAL_2500DAO dao = new SE_SAL_2500DAO();
            ds = dao.se_sal_2570_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_SAL_2500EJBHome home = (SE_SAL_2500EJBHome)JNDIManager.getInstance().getHome("SE_SAL_2500EJB");
//			SE_SAL_2500EJB ejb = home.create();
//
//			ds = ejb.se_sal_2570_u(dm);
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
