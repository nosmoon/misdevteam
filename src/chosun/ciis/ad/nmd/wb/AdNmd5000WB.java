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
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;
import chosun.ciis.ad.nmd.dao.AdNmd5000DAO;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 
 */

public class AdNmd5000WB extends BaseWB {

	/**
	 * 
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void ad_nmd_5000_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5000_MDataSet ds = null;

		// DM Setting
		AD_NMD_5000_MDM dm = new AD_NMD_5000_MDM();
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String dealmedicd = Util.getSessionParameterValue(req, "dealmedicd", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setDealmedicd(dealmedicd);

        try {
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5000_m(dm);
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
	public void ad_nmd_5010_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5010_LDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String frdt = Util.checkString(req.getParameter("frdt"));
		String todt = Util.checkString(req.getParameter("todt"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String agn = Util.checkString(req.getParameter("agn"));
		String user_id = Util.checkString(req.getParameter("user_id")); 

		// DM Setting
		AD_NMD_5010_LDM dm = new AD_NMD_5010_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setAgn(agn);
		dm.setUser_id(user_id);

//		dm.print();

        try {
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5010_l(dm);
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
	public void ad_nmd_5011_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5011_SDataSet ds = null;

		// DM Setting
		AD_NMD_5011_SDM dm = new AD_NMD_5011_SDM();
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));

		dm.setCmpy_cd(cmpy_cd);
		dm.setDlco_no(dlco_no);

		// dm.print();

        try {
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5011_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5011_s(dm);
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
	public void ad_nmd_5012_s(HttpServletRequest req, HttpServletResponse res)
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
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5012_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5012_s(dm);
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
	public void ad_nmd_5021_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5021_ADataSet ds = null;

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

		AD_NMD_5021_ADM dm = new AD_NMD_5021_ADM();
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
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5021_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5021_a(dm);
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
	public void ad_nmd_5022_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5022_ADataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();

		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));

		AD_NMD_5022_ADM dm = new AD_NMD_5022_ADM();
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
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5022_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5022_a(dm);
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
	public void ad_nmd_5030_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5030_SDataSet ds = null;

		// DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);
		String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
		String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));

		AD_NMD_5030_SDM dm = new AD_NMD_5030_SDM();

		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setHndl_clsf(hndl_clsf);
		dm.setProf_type_cd(prof_type_cd);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);

		dm.print();

        try {
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5030_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5030_s(dm);
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
	public void ad_nmd_5040_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5040_ADataSet ds = null;

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

		AD_NMD_5040_ADM dm = new AD_NMD_5040_ADM();
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

		dm.print();

        try {
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5040_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5040_a(dm);
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
	public void ad_nmd_5041_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5041_ADataSet ds = null;

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
		
		AD_NMD_5041_ADM dm = new AD_NMD_5041_ADM();
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
		dm.print();

        try {
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5041_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//		AdNmd1000EJBHome home = (AdNmd1000EJBHome) JNDIManager.getInstance().getHome("AdNmd1000EJB");
//		try {
//			AdNmd1000EJB ejb = home.create();
//			ds = ejb.ad_nmd_5040_a(dm);
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
	public void ad_nmd_5050_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		AD_NMD_5050_LDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String frdt = Util.checkString(req.getParameter("frdt"));
		String todt = Util.checkString(req.getParameter("todt"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String user_id = Util.checkString(req.getParameter("user_id"));
		String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
		String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		String advt_clas1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas1")));
		String advt_clas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas2")));

		// DM Setting
		AD_NMD_5050_LDM dm = new AD_NMD_5050_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setUser_id(user_id);
		dm.setHndl_clsf(hndl_clsf);
		dm.setChrg_pers(chrg_pers);
		dm.setAdvt_clas1(advt_clas1);
		dm.setAdvt_clas2(advt_clas2);

		dm.print();
        try {
        	AdNmd5000DAO	dao = new AdNmd5000DAO();
            ds = dao.ad_nmd_5050_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
	}

}
