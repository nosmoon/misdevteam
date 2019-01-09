/***************************************************************************************************
* ���ϸ� : SE_QTY_2100WB.java
 * ��� : �μ�����
 * �ۼ����� : ���Ϻ����μ� ��������
 * �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.qty.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_2100DAO;
import chosun.ciis.se.qty.dm.SE_QTY_2100_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_2105_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2110_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2120_SDM;
import chosun.ciis.se.qty.dm.SE_QTY_2130_ADM;
import chosun.ciis.se.qty.ds.SE_QTY_2100_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2105_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2110_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2120_SDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2130_ADataSet;
/**
 * 
 */

public class SE_QTY_2100WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2100_MDataSet ds = null;
		SE_QTY_2100_MDM dm = new SE_QTY_2100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_2100DAO dao = new SE_QTY_2100DAO();
            ds = dao.se_qty_2100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2100EJBHome home = (SE_QTY_2100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2100EJB");
//			SE_QTY_2100EJB ejb = home.create();
//
//			ds = ejb.se_qty_2100_m(dm);
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
     * ���� ��ü,���� ����Ʈ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2105_LDataSet ds = null;
		SE_QTY_2105_LDM dm = new SE_QTY_2105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));

        try {
        	SE_QTY_2100DAO dao = new SE_QTY_2100DAO();
            ds = dao.se_qty_2105_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2100EJBHome home = (SE_QTY_2100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2100EJB");
//			SE_QTY_2100EJB ejb = home.create();
//
//			ds = ejb.se_qty_2105_l(dm);
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
     * ��û���� ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2110_LDataSet ds = null;
		SE_QTY_2110_LDM dm = new SE_QTY_2110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt1 = Util.checkString(req.getParameter("issu_dt1"));
		dm.issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));

        try {
        	SE_QTY_2100DAO dao = new SE_QTY_2100DAO();
            ds = dao.se_qty_2110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
		
//		try {
//			SE_QTY_2100EJBHome home = (SE_QTY_2100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2100EJB");
//			SE_QTY_2100EJB ejb = home.create();
//
//			ds = ejb.se_qty_2110_l(dm);
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
     * ��û���� ����ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2120_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2120_SDataSet ds = null;
		SE_QTY_2120_SDM dm = new SE_QTY_2120_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.reg_seq = Util.checkString(req.getParameter("reg_seq"));

        try {
        	SE_QTY_2100DAO dao = new SE_QTY_2100DAO();
            ds = dao.se_qty_2120_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();

//		try {
//			SE_QTY_2100EJBHome home = (SE_QTY_2100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2100EJB");
//			SE_QTY_2100EJB ejb = home.create();
//
//			ds = ejb.se_qty_2120_s(dm);
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
     * ���/����/����
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2130_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2130_ADataSet ds = null;
		SE_QTY_2130_ADM dm = new SE_QTY_2130_ADM();

		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.reg_seq = Util.checkString(req.getParameter("reg_seq"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.qty = Util.checkString(req.getParameter("qty"));
		dm.aplc_pers_nm = Util.checkString(req.getParameter("aplc_pers_nm"));
		dm.aplc_pers_tel_no_1 = Util.checkString(req.getParameter("aplc_pers_tel_no_1"));
		dm.aplc_pers_tel_no_2 = Util.checkString(req.getParameter("aplc_pers_tel_no_2"));
		dm.aplc_pers_tel_no_3 = Util.checkString(req.getParameter("aplc_pers_tel_no_3"));
		dm.aplc_pers_ptph_no_1 = Util.checkString(req.getParameter("aplc_pers_ptph_no_1"));
		dm.aplc_pers_ptph_no_2 = Util.checkString(req.getParameter("aplc_pers_ptph_no_2"));
		dm.aplc_pers_ptph_no_3 = Util.checkString(req.getParameter("aplc_pers_ptph_no_3"));
		dm.dlv_zip_1 = Util.checkString(req.getParameter("dlv_zip_1"));
		dm.dlv_zip_2 = Util.checkString(req.getParameter("dlv_zip_2"));
		dm.dlv_dtls_addr = Util.checkString(req.getParameter("dlv_dtls_addr"));
		dm.dlv_addr = Util.checkString(req.getParameter("dlv_addr"));
		String stmt_issu_req_yn = Util.checkString(req.getParameter("stmt_issu_req_yn"));
		if(!"Y".equals(stmt_issu_req_yn)) stmt_issu_req_yn = "N";
		dm.stmt_issu_req_yn = stmt_issu_req_yn;
		dm.sell_clsf = Util.checkString(req.getParameter("sell_clsf"));
		dm.setl_acct_no = Util.checkString(req.getParameter("setl_acct_no"));
		dm.amt = Util.checkString(req.getParameter("amt"));
		dm.arvl_clsf = Util.checkString(req.getParameter("arvl_clsf"));
		String bo_cdseq = Util.checkString(req.getParameter("bo_cd"));
		String bo_cd = "";
		String send_plac_seq = "";
		if(bo_cdseq.length()==8){
			bo_cd = bo_cdseq.substring(0,5);
			send_plac_seq = bo_cdseq.substring(5,8);
		}
		dm.bo_cd = bo_cd;
		dm.send_plac_seq = send_plac_seq;
		dm.prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
		dm.ledt_cd = Util.checkString(req.getParameter("ledt_cd"));
		dm.ecnt_cd = Util.checkString(req.getParameter("ecnt_cd"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.acpn_chrg_pers = Util.checkString(req.getParameter("acpn_chrg_pers"));
		dm.acpn_chrg_pers_nm = Util.checkString(req.getParameter("acpn_chrg_pers_nm"));
		dm.acpn_chrg_pers_cntc_plac = Util.checkString(req.getParameter("acpn_chrg_pers_cntc_plac"));
		dm.acpn_chrg_pers_cmpy_cd = Util.checkString(req.getParameter("acpn_chrg_pers_cmpy_cd"));
		dm.acpn_chrg_pers_dept_cd = Util.checkString(req.getParameter("acpn_chrg_pers_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_QTY_2100DAO dao = new SE_QTY_2100DAO();
            ds = dao.se_qty_2130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_2100EJBHome home = (SE_QTY_2100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2100EJB");
//			SE_QTY_2100EJB ejb = home.create();
//
//			ds = ejb.se_qty_2130_a(dm);
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
