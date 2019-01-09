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

package chosun.ciis.ad.nmd.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.nmd.dao.AdNmd5100DAO;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 
 */

public class AdNmd5100WB extends BaseWB {

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_nmd_5100_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5100_MDataSet ds = null;

		// DM Setting
		AD_NMD_5100_MDM dm = new AD_NMD_5100_MDM();
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String dealmedicd = Util.getSessionParameterValue(req, "dealmedicd", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setDealmedicd(dealmedicd);

        try {
        	AdNmd5100DAO	dao = new AdNmd5100DAO();
            ds = dao.ad_nmd_5100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
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
	public void ad_nmd_5110_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5110_LDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
		String pubc_todt = Util.checkString(req.getParameter("pubc_todt")); 

		// DM Setting
		AD_NMD_5110_LDM dm = new AD_NMD_5110_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setPubc_frdt(pubc_frdt);
		dm.setPubc_todt(pubc_todt);
		dm.setDlco_no(dlco_no);
		dm.setHndl_clsf(hndl_clsf);

//		dm.print();

        try {
        	AdNmd5100DAO	dao = new AdNmd5100DAO();
            ds = dao.ad_nmd_5110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
	}
	public void ad_nmd_5120_a(HttpServletRequest req, HttpServletResponse res)
	        throws AppException {
	
	AD_NMD_5120_ADataSet ds = null;
	
	// DM Setting
	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	String incmg_pers_ip = req.getRemoteAddr();
	
	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
	String make_dt = Util.checkString(req.getParameter("make_dt"));
	String suply_amt = Util.checkString(req.getParameter("suply_amt"));
	String vat_amt = Util.checkString(req.getParameter("vat_amt"));
	String ern = Util.checkString(req.getParameter("ern"));
	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
	String presi_nm = Util.checkString(req.getParameter("presi_nm"));
	String addr = Util.checkString(req.getParameter("addr"));
	String bizcond = Util.checkString(req.getParameter("bizcond"));
	String item = Util.checkString(req.getParameter("item"));
	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
	String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
	String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
	String email_id = Util.checkString(req.getParameter("email_id"));
	String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
	String semuro_no = Util.checkString(req.getParameter("semuro_no"));
	
	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
	
	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
	String checked = StringUtil.nvl((String) hash.get("checked"));
	String pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
	
	AD_NMD_5120_ADM dm = new AD_NMD_5120_ADM();
	dm.setCmpy_cd(cmpy_cd);
	dm.setSlip_clsf_cd(slip_clsf_cd);
	dm.setSlip_occr_dt(slip_occr_dt);
	dm.setMake_dt(make_dt);
	dm.setSuply_amt(suply_amt);
	dm.setVat_amt(vat_amt);
	dm.setErn(ern);
	dm.setDlco_no(dlco_no);
	dm.setDlco_nm(dlco_nm);
	dm.setPresi_nm(presi_nm);
	dm.setBizcond(bizcond);
	dm.setItem(item);
	dm.setMedi_cd(medi_cd);
	dm.setPubc_frdt(pubc_frdt);
	dm.setPubc_todt(pubc_todt);
	dm.setChecked(checked);
	dm.setPubc_slip_no(pubc_slip_no);
	dm.setEmail_id(email_id);
	dm.setElec_tax_comp_cd(elec_tax_comp_cd);
	dm.setSemuro_no(semuro_no);
	dm.setIncmg_pers_ip(incmg_pers_ip);
	dm.setIncmg_pers(incmg_pers);
	
	dm.print();
	
	try {
		AdNmd5100DAO	dao = new AdNmd5100DAO();
	    ds = dao.ad_nmd_5120_a(dm);
	    req.setAttribute("ds", ds);  
	}
	catch (AppException e) {
	    throw e;
	} 
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
	public void ad_nmd_5121_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5121_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		String suply_amt = Util.checkString(req.getParameter("suply_amt"));
		String vat_amt = Util.checkString(req.getParameter("vat_amt"));
		String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
		String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String checked = StringUtil.nvl((String) hash.get("checked"));
		String pubc_slip_no = StringUtil.nvl((String) hash.get("pubc_slip_no"));
		String pubc_dt = StringUtil.nvl((String) hash.get("pubc_dt"));

		AD_NMD_5121_ADM dm = new AD_NMD_5121_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.setProf_type_cd(prof_type_cd);
		dm.setMedi_cd(medi_cd);
		dm.setDlco_no(dlco_no);
		dm.setMake_dt(make_dt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setPubc_frdt(pubc_frdt);
		dm.setPubc_todt(pubc_todt);
		dm.setChecked(checked);
		dm.setPubc_slip_no(pubc_slip_no);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);

		// dm.print();

        try {
        	AdNmd5100DAO	dao = new AdNmd5100DAO();
            ds = dao.ad_nmd_5121_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
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
	public void ad_nmd_5122_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5122_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));

		AD_NMD_5122_ADM dm = new AD_NMD_5122_ADM();
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
        	AdNmd5100DAO	dao = new AdNmd5100DAO();
            ds = dao.ad_nmd_5122_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 

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
	public void ad_nmd_5130_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5130_SDataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));

		AD_NMD_5130_SDM dm = new AD_NMD_5130_SDM();

		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);

		dm.print();

        try {
        	AdNmd5100DAO	dao = new AdNmd5100DAO();
            ds = dao.ad_nmd_5130_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 

	}
}
