/***************************************************************************************************
 * 파일명 : AdTax1000WB.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.tax.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;
import chosun.ciis.ad.tax.dao.AdTax1000DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1000_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1010_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1011_SDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1020_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1021_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1022_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1023_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1030_SDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1040_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1041_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1050_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1060_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1070_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1071_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1000_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1010_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1011_SDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1020_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1021_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1022_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1023_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1030_SDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1040_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1041_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1050_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1060_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1070_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1071_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 
 */

public class AdTax1000WB extends BaseWB {

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1000_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1000_MDataSet ds = null;

		// DM Setting
		AD_TAX_1000_MDM dm = new AD_TAX_1000_MDM();
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String dealmedicd = Util.getSessionParameterValue(req, "dealmedicd", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setDealmedicd(dealmedicd);

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1000_m(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1010_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1010_LDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String frdt = Util.checkString(req.getParameter("frdt"));
		String todt = Util.checkString(req.getParameter("todt"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String agn = Util.checkString(req.getParameter("agn"));
		String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));

		// DM Setting
		AD_TAX_1010_LDM dm = new AD_TAX_1010_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setAgn(agn);
		dm.setChnl_clsf_cd(chnl_clsf_cd);

//		dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1010_l(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1011_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1011_SDataSet ds = null;

		// DM Setting
		AD_TAX_1011_SDM dm = new AD_TAX_1011_SDM();
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));

		dm.setCmpy_cd(cmpy_cd);
		dm.setDlco_no(dlco_no);

		// dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1011_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1011_s(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1012_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_CO_9004_SDataSet ds = null;

		// DM Setting
		AD_CO_9004_SDM dm = new AD_CO_9004_SDM();
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String dlco_no = Util.checkString(req.getParameter("agn"));

		dm.setCmpy_cd(cmpy_cd);
		dm.setDlco_no(dlco_no);
		
		dm.print();
		
		try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1012_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1012_s(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1020_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1020_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));
		String ern = Util.checkString(req.getParameter("demand_ern"));
		String dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
		String dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
		String presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));
		String addr = Util.checkString(req.getParameter("demand_addr"));
		String bizcond = Util.checkString(req.getParameter("demand_bizcond"));
		String item = Util.checkString(req.getParameter("demand_item"));
		String vexc_cmpy_cd = Util.checkString(req.getParameter("trust_dlco_no"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String checked = StringUtil.nvl((String) hash.get("checked"));
		String pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
		String pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));
		
		String email_id = Util.checkString(req.getParameter("email_id"));
		String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		String semuro_no = Util.checkString(req.getParameter("semuro_no"));		
		
		AD_TAX_1020_ADM dm = new AD_TAX_1020_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setErn(ern);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setPresi_nm(presi_nm);
		dm.setAddr(addr);
		dm.setBizcond(bizcond);
		dm.setItem(item);
		dm.setVexc_cmpy_cd(vexc_cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setPubc_dt(pubc_dt);
		dm.setEmail_id(email_id);
		dm.setElec_tax_comp_cd(elec_tax_comp_cd);
		dm.setSemuro_no(semuro_no);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);
		dm.setChnl_clsf_cd(chnl_clsf_cd);

		dm.print();


        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1020_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1020_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1021_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1021_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String tax_item = Util.checkString(req.getParameter("tax_item"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String checked = StringUtil.nvl((String) hash.get("checked"));
		String pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
		String pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));

		AD_TAX_1021_ADM dm = new AD_TAX_1021_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setTax_item(tax_item);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setPubc_dt(pubc_dt);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);

		// dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1021_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1021_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1022_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1022_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));

		AD_TAX_1022_ADM dm = new AD_TAX_1022_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);

		// dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1022_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1022_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1023_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1023_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));
		String ern = Util.checkString(req.getParameter("demand_ern"));
		String dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
		String dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
		String presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));
		String addr = Util.checkString(req.getParameter("demand_addr"));
		String bizcond = Util.checkString(req.getParameter("demand_bizcond"));
		String item = Util.checkString(req.getParameter("demand_item"));
		String vexc_cmpy_cd = Util.checkString(req.getParameter("trust_dlco_no"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String checked = StringUtil.nvl((String) hash.get("checked"));
		String pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
		String pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));
		
		String email_id = Util.checkString(req.getParameter("email_id"));
		String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		String semuro_no = Util.checkString(req.getParameter("semuro_no"));		
		
		AD_TAX_1023_ADM dm = new AD_TAX_1023_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setErn(ern);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setPresi_nm(presi_nm);
		dm.setAddr(addr);
		dm.setBizcond(bizcond);
		dm.setItem(item);
		dm.setVexc_cmpy_cd(vexc_cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setPubc_dt(pubc_dt);
		dm.setEmail_id(email_id);
		dm.setElec_tax_comp_cd(elec_tax_comp_cd);
		dm.setSemuro_no(semuro_no);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);
		dm.setChnl_clsf_cd(chnl_clsf_cd);

		dm.print();


        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1023_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1023_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}
	
	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1030_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1030_SDataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);
		String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));

		AD_TAX_1030_SDM dm = new AD_TAX_1030_SDM();

		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setHndl_clsf(hndl_clsf);
		dm.setProf_type_cd(prof_type_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);

		dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1030_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1030_s(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1040_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1040_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq    = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));
		String ern = Util.checkString(req.getParameter("demand_ern"));
		String dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
		String dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
		String presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));
		String addr = Util.checkString(req.getParameter("demand_addr"));
		String bizcond = Util.checkString(req.getParameter("demand_bizcond"));
		String item = Util.checkString(req.getParameter("demand_item"));
		String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));

		String re_issu_resn_cd = Util.checkString(req.getParameter("re_issu_resn_cd"));
		String issu_tms = Util.checkString(req.getParameter("issu_tms"));
		String tax_item = Util.checkString(req.getParameter("tax_item"));

		String biz_plc_cd = Util.checkString(req.getParameter("demand_biz_plc"));
		String remk = Util.checkString(req.getParameter("remk")); 
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String checked			=	"";
		String pubc_slip_no		=	"";
		String pubc_dt			=	"";
		if(!"".equals(multiUpdateData)){
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
			checked = StringUtil.nvl((String) hash.get("checked"));
			pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
			pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));
		}
		
		String email_id = Util.checkString(req.getParameter("email_id"));
		String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		String semuro_no = Util.checkString(req.getParameter("semuro_no"));

		AD_TAX_1040_ADM dm = new AD_TAX_1040_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setErn(ern);
		dm.setDlco_clsf_cd(dlco_clsf_cd);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setPresi_nm(presi_nm);
		dm.setAddr(addr);
		dm.setBizcond(bizcond);
		dm.setItem(item);
		dm.setMedi_cd(medi_cd);
		dm.setRe_issu_resn_cd(re_issu_resn_cd);
		dm.setIssu_tms(issu_tms);
		dm.setTax_item(tax_item);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setPubc_dt(pubc_dt);
		dm.setEmail_id(email_id);
		dm.setElec_tax_comp_cd(elec_tax_comp_cd);
		dm.setSemuro_no(semuro_no);
		dm.setBiz_plc_cd(biz_plc_cd);
		dm.setRemk(remk);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);
		dm.setChnl_clsf_cd(chnl_clsf_cd);

		dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1040_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1040_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1041_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1041_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq    = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String minus_mkdt = Util.checkString(req.getParameter("make_dt2"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));
		String ern = Util.checkString(req.getParameter("demand_ern"));
		String dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
		String dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
		String presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));
		String addr = Util.checkString(req.getParameter("demand_addr"));
		String bizcond = Util.checkString(req.getParameter("demand_bizcond"));
		String item = Util.checkString(req.getParameter("demand_item"));
		String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		
		String re_issu_resn_cd = Util.checkString(req.getParameter("re_issu_resn_cd"));
		String issu_tms = Util.checkString(req.getParameter("issu_tms"));
		String tax_item = Util.checkString(req.getParameter("tax_item"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String checked			=	"";
		String pubc_slip_no		=	"";
		String pubc_dt			=	"";
		if(!"".equals(multiUpdateData)){
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
			checked = StringUtil.nvl((String) hash.get("checked"));
			pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
			pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));
		}
		
		String email_id = Util.checkString(req.getParameter("email_id"));
		String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		String semuro_no = Util.checkString(req.getParameter("semuro_no"));

		String biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd"));
		String remk = Util.checkString(req.getParameter("remk"));
		
		AD_TAX_1041_ADM dm = new AD_TAX_1041_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setErn(ern);
		dm.setDlco_clsf_cd(dlco_clsf_cd);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setPresi_nm(presi_nm);
		dm.setAddr(addr);
		dm.setBizcond(bizcond);
		dm.setItem(item);
		dm.setMedi_cd(medi_cd);
		dm.setRe_issu_resn_cd(re_issu_resn_cd);
		dm.setIssu_tms(issu_tms);
		dm.setTax_item(tax_item);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setPubc_dt(pubc_dt);
		dm.setEmail_id(email_id);
		dm.setElec_tax_comp_cd(elec_tax_comp_cd);
		dm.setSemuro_no(semuro_no);
		dm.setBiz_plc_cd(biz_plc_cd);
		dm.setRemk(remk);
		
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);
		dm.setMinus_mkdt(minus_mkdt);
		dm.setChnl_clsf_cd(chnl_clsf_cd);
		dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1041_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1040_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}	
	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1050_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1050_LDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String frdt = Util.checkString(req.getParameter("frdt"));
		String todt = Util.checkString(req.getParameter("todt"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
		String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		String advt_clas1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas1")));
		String advt_clas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas2")));
		String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		
		// DM Setting
		AD_TAX_1050_LDM dm = new AD_TAX_1050_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setHndl_clsf(hndl_clsf);
		dm.setChrg_pers(chrg_pers);
		dm.setAdvt_clas1(advt_clas1);
		dm.setAdvt_clas2(advt_clas2);
		dm.setChnl_clsf_cd(chnl_clsf_cd);

		dm.print();
        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1050_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1050_l(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}
	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1060_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1060_LDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String frdt = Util.checkString(req.getParameter("frdt"));
		String todt = Util.checkString(req.getParameter("todt"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String hndl_plac_cd = Util.checkString(req.getParameter("agn"));
		String advt_clas1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas1")));
		String advt_clas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas2")));

		// DM Setting
		AD_TAX_1060_LDM dm = new AD_TAX_1060_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setHndl_plac_cd(hndl_plac_cd);
		dm.setAdvt_clas1(advt_clas1);
		dm.setAdvt_clas2(advt_clas2);

		//dm.print();
        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1060_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1060_l(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1070_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1070_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq    = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));
		String ern = Util.checkString(req.getParameter("demand_ern"));
		String dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
		String dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
		String presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));
		String addr = Util.checkString(req.getParameter("demand_addr"));
		String bizcond = Util.checkString(req.getParameter("demand_bizcond"));
		String item = Util.checkString(req.getParameter("demand_item"));
		String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));

		String re_issu_resn_cd = Util.checkString(req.getParameter("re_issu_resn_cd"));
		String issu_tms = Util.checkString(req.getParameter("issu_tms"));
		String tax_item = Util.checkString(req.getParameter("tax_item"));
		String trust_dlco_no = Util.checkString(req.getParameter("trust_dlco_no"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String checked			=	"";
		String pubc_slip_no		=	"";
		String pubc_dt			=	"";
		if(!"".equals(multiUpdateData)){
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
			checked = StringUtil.nvl((String) hash.get("checked"));
			pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
			pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));
		}
		
		String email_id = Util.checkString(req.getParameter("email_id"));
		String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		String semuro_no = Util.checkString(req.getParameter("semuro_no"));

		AD_TAX_1070_ADM dm = new AD_TAX_1070_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setErn(ern);
		dm.setDlco_clsf_cd(dlco_clsf_cd);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setPresi_nm(presi_nm);
		dm.setAddr(addr);
		dm.setBizcond(bizcond);
		dm.setItem(item);
		dm.setMedi_cd(medi_cd);
		dm.setRe_issu_resn_cd(re_issu_resn_cd);
		dm.setIssu_tms(issu_tms);
		dm.setTax_item(tax_item);
		dm.setTrust_dlco_no(trust_dlco_no);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setPubc_dt(pubc_dt);
		dm.setEmail_id(email_id);
		dm.setElec_tax_comp_cd(elec_tax_comp_cd);
		dm.setSemuro_no(semuro_no);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);

		dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1070_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1070_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}		
	
	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_tax_1071_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_TAX_1071_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq    = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));
		String ern = Util.checkString(req.getParameter("demand_ern"));
		String dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
		String dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
		String presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));
		String addr = Util.checkString(req.getParameter("demand_addr"));
		String bizcond = Util.checkString(req.getParameter("demand_bizcond"));
		String item = Util.checkString(req.getParameter("demand_item"));
		String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));

		String re_issu_resn_cd = Util.checkString(req.getParameter("re_issu_resn_cd"));
		String issu_tms = Util.checkString(req.getParameter("issu_tms"));
		String tax_item = Util.checkString(req.getParameter("tax_item"));
		String trust_dlco_no = Util.checkString(req.getParameter("trust_dlco_no"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String checked			=	"";
		String pubc_slip_no		=	"";
		String pubc_dt			=	"";
		if(!"".equals(multiUpdateData)){
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
			checked = StringUtil.nvl((String) hash.get("checked"));
			pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
			pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));
		}
		
		String email_id = Util.checkString(req.getParameter("email_id"));
		String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		String semuro_no = Util.checkString(req.getParameter("semuro_no"));

		AD_TAX_1071_ADM dm = new AD_TAX_1071_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMake_dt(make_dt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setErn(ern);
		dm.setDlco_clsf_cd(dlco_clsf_cd);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setPresi_nm(presi_nm);
		dm.setAddr(addr);
		dm.setBizcond(bizcond);
		dm.setItem(item);
		dm.setMedi_cd(medi_cd);
		dm.setRe_issu_resn_cd(re_issu_resn_cd);
		dm.setIssu_tms(issu_tms);
		dm.setTax_item(tax_item);
		dm.setTrust_dlco_no(trust_dlco_no);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setPubc_dt(pubc_dt);
		dm.setEmail_id(email_id);
		dm.setElec_tax_comp_cd(elec_tax_comp_cd);
		dm.setSemuro_no(semuro_no);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);

		dm.print();

        try {
        	AdTax1000DAO	dao = new AdTax1000DAO();
            ds = dao.ad_tax_1071_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdTax1000EJBHome home = (AdTax1000EJBHome) JNDIManager.getInstance().getHome("AdTax1000EJB");
//		try {
//			AdTax1000EJB ejb = home.create();
//			ds = ejb.ad_tax_1071_a(dm);
//			req.setAttribute("ds", ds);
//		} catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		} catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}	
}
