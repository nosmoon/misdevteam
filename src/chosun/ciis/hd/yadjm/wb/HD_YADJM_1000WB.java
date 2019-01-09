/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.yadjm.wb;


import java.util.*;
import java.io.*;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.ad.bas.dao.AdBas1500DAO;
import chosun.ciis.ad.common.wb.AttachFileVO;
import chosun.ciis.ad.res.dao.AdRes1800DAO;
import chosun.ciis.co.base.util.*;
import chosun.ciis.hd.yadjm.dao.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.cost.dm.HD_COST_1404_MDM;
import chosun.ciis.hd.cost.ds.HD_COST_1404_MDataSet;
import chosun.ciis.hd.vaca.ds.HD_VACA_2000_LDataSet;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;


/**
 * 
 */
 


public class HD_YADJM_1000WB extends BaseWB {
 
    /**
     * 멀티레코드처리 row 구분자
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    //public final String COL_SEPARATOR = "#";
  
    /**
     * 발령관련된 코드
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */

 
	public void hd_yadjm_1000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1000_ADataSet ds = null;
		HD_YADJM_1000_ADM dm = new HD_YADJM_1000_ADM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_yy = Util.checkString(req.getParameter("adjm_yy"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers	= Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.slf_dduc_amt = Util.checkString(req.getParameter("slf_dduc_amt"));
		dm.spos_dduc_amt = Util.checkString(req.getParameter("spos_dduc_amt"));
		dm.child_dduc_amt = Util.checkString(req.getParameter("child_dduc_amt"));
		dm.child_dduc_basi_yy = Util.checkString(req.getParameter("child_dduc_basi_yy"));
		dm.prnt_dduc_amt_1 = Util.checkString(req.getParameter("prnt_dduc_amt_1"));
		dm.prnt_dduc_basi_yy_1 = Util.checkString(req.getParameter("prnt_dduc_basi_yy_1"));
		dm.prnt_dduc_amt_2 = Util.checkString(req.getParameter("prnt_dduc_amt_2"));
		dm.prnt_dduc_basi_yy_2 = Util.checkString(req.getParameter("prnt_dduc_basi_yy_2"));
		dm.brth_istt_amt_1 = Util.checkString(req.getParameter("brth_istt_amt_1"));
		dm.brth_istt_basi_yy_1 = Util.checkString(req.getParameter("brth_istt_basi_yy_1"));
		dm.brth_istt_amt_2 = Util.checkString(req.getParameter("brth_istt_amt_2"));
		dm.brth_istt_basi_yy_2 = Util.checkString(req.getParameter("brth_istt_basi_yy_2"));
		dm.brth_istt_amt_3 = Util.checkString(req.getParameter("brth_istt_amt_3"));
		dm.brth_istt_basi_yy_3 = Util.checkString(req.getParameter("brth_istt_basi_yy_3"));
		dm.rspc_dduc_amt_1 = Util.checkString(req.getParameter("rspc_dduc_amt_1"));
		dm.rspc_dduc_basi_yy_1_fr = Util.checkString(req.getParameter("rspc_dduc_basi_yy_1_fr"));
		dm.rspc_dduc_basi_yy_1_to = Util.checkString(req.getParameter("rspc_dduc_basi_yy_1_to"));
		dm.rspc_dduc_amt_2 = Util.checkString(req.getParameter("rspc_dduc_amt_2"));
		dm.rspc_dduc_basi_yy_2 = Util.checkString(req.getParameter("rspc_dduc_basi_yy_2"));
		dm.obcl_pers_dduc_amt = Util.checkString(req.getParameter("obcl_pers_dduc_amt"));
		dm.fml_dduc_amt = Util.checkString(req.getParameter("fml_dduc_amt"));
		dm.child_care_fee_dduc_amt = Util.checkString(req.getParameter("child_care_fee_dduc_amt"));
		dm.mlt_chld_basi_dduc_amt = Util.checkString(req.getParameter("mlt_chld_basi_dduc_amt"));
		dm.mlt_chld_pers_dduc_amt = Util.checkString(req.getParameter("mlt_chld_pers_dduc_amt"));
		dm.mlt_chld_birth_dduc_amt = Util.checkString(req.getParameter("mlt_chld_birth_dduc_amt"));
		dm.one_paren_dduc_amt = Util.checkString(req.getParameter("one_paren_dduc_amt")); 
		
		dm.gnr_insr_limt_amt = Util.checkString(req.getParameter("gnr_insr_limt_amt"));
		dm.obcl_pers_insr_limt_amt = Util.checkString(req.getParameter("obcl_pers_insr_limt_amt"));
		dm.hosp_fee_basi_ratio = Util.checkString(req.getParameter("hosp_fee_basi_ratio"));
		dm.hosp_fee_limt_amt = Util.checkString(req.getParameter("hosp_fee_limt_amt"));
		dm.baby_edu_fee = Util.checkString(req.getParameter("baby_edu_fee"));
		dm.elmihi_edu_fee = Util.checkString(req.getParameter("elmihi_edu_fee"));
		dm.univ_edu_fee = Util.checkString(req.getParameter("univ_edu_fee"));
		dm.hous_savg_aply_ratio = Util.checkString(req.getParameter("hous_savg_aply_ratio"));
		dm.hous_savg_aply_limt_amt = Util.checkString(req.getParameter("hous_savg_aply_limt_amt"));
		dm.hous_hire_aply_ratio = Util.checkString(req.getParameter("hous_hire_aply_ratio"));
		dm.hous_hire_aply_limt_amt = Util.checkString(req.getParameter("hous_hire_aply_limt_amt"));
		dm.ltrm_hous_loan_limt_amt_1 = Util.checkString(req.getParameter("ltrm_hous_loan_amt_limt_amt_1"));
		dm.ltrm_hous_loan_limt_amt_2 = Util.checkString(req.getParameter("ltrm_hous_loan_amt_limt_amt_2"));
		dm.ltrm_hous_loan_limt_amt_3 = Util.checkString(req.getParameter("ltrm_hous_loan_amt_limt_amt_3"));
		dm.wedd_fnrl_movm_widr_amt = Util.checkString(req.getParameter("wedd_fnrl_movm_widr_amt"));
		dm.wedd_fnrl_movm_tot_saly_amt = Util.checkString(req.getParameter("wedd_fnrl_movm_tot_saly_amt"));
		dm.wedd_fnrl_movm_incm_amt = Util.checkString(req.getParameter("wedd_fnrl_movm_dduc_incm_amt"));
		dm.std_dduc_amt = Util.checkString(req.getParameter("std_dduc_amt"));
		dm.prsn_pens_savg_ratio = Util.checkString(req.getParameter("prsn_pens_savg_ratio"));
		dm.prsn_pens_savg_limt_amt = Util.checkString(req.getParameter("prsn_pens_savg_limt_amt"));
		dm.pens_savg_limt_amt = Util.checkString(req.getParameter("pens_savg_limt_amt"));
		dm.invsm_cmpd_invsm_ratio = Util.checkString(req.getParameter("invsm_cmpd_invsm_ratio"));
		dm.lvcmpy_pens_limt_amt = Util.checkString(req.getParameter("lvcmpy_pens_limt_amt"));
		dm.emp_stok_ownr_limt_amt = Util.checkString(req.getParameter("emp_stok_ownr_limt_amt"));
		dm.crdt_card_tot_saly_ratio = Util.checkString(req.getParameter("crdt_card_tot_saly_ratio"));
		dm.crdt_card_excs_amt_ratio = Util.checkString(req.getParameter("crdt_card_excs_amt_ratio"));
		dm.crdt_card_limt_amt = Util.checkString(req.getParameter("crdt_card_limt_amt"));
		dm.monthly_rent_amt_ratio = Util.checkString(req.getParameter("monthly_rent_amt_ratio"));
		dm.no_lar_sum_lease_limt_amt = Util.checkString(req.getParameter("no_lar_sum_lease_limt_amt"));
		dm.no_lar_sum_lease_limt_ratio = Util.checkString(req.getParameter("no_lar_sum_lease_limt_ratio"));

		dm.print();
		
		ds = (HD_YADJM_1000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111000_MDataSet ds = null;
		HD_YADJM_111000_MDM dm = new HD_YADJM_111000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_YADJM_111000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1001_LDataSet ds = null;
		HD_YADJM_1001_LDM dm = new HD_YADJM_1001_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_yy = Util.checkString(req.getParameter("adjm_yy"));

		dm.print();
		
		ds = (HD_YADJM_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1100_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1100_ADataSet ds = null;
		HD_YADJM_1100_ADM dm = new HD_YADJM_1100_ADM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_yy       = Util.checkString(req.getParameter("adjm_yy"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode_1              = ((String)hash1.get("m")).toUpperCase();
		dm.seq_1               = ((String)hash1.get("seq"));
		dm.tot_saly_sctn_1     = ((String)hash1.get("tot_saly_sctn_1"));
		dm.tot_saly_sctn_2     = ((String)hash1.get("tot_saly_sctn_2"));
		dm.labr_incm_add_amt   = ((String)hash1.get("labr_incm_add_amt"));
		dm.labr_incm_dedu_amt  = ((String)hash1.get("labr_incm_dedu_amt"));
		dm.labr_incm_dduc_rate = ((String)hash1.get("labr_incm_dduc_rate"));

		dm.mode_2         = ((String)hash2.get("m")).toUpperCase();
		dm.seq_2          = ((String)hash2.get("seq"));
		dm.txn_std_sctn_1 = ((String)hash2.get("txn_std_sctn_1"));
		dm.txn_std_sctn_2 = ((String)hash2.get("txn_std_sctn_2"));
		dm.rate           = ((String)hash2.get("rate"));
		dm.dedu_amt       = ((String)hash2.get("dedu_amt"));

		dm.print();
		
		ds = (HD_YADJM_1100_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1101_LDataSet ds = null;
		HD_YADJM_1101_LDM dm = new HD_YADJM_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_yy = Util.checkString(req.getParameter("adjm_yy"));

		dm.print();
		
		ds = (HD_YADJM_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_1201_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1201_MDataSet ds = null;
		HD_YADJM_1201_MDM dm = new HD_YADJM_1201_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		ds = (HD_YADJM_1201_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1210(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1210_LDataSet ds = null;
		HD_YADJM_1210_LDM dm = new HD_YADJM_1210_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_YADJM_1210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1211(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1211_ADataSet ds = null;
		HD_YADJM_1211_ADM dm = new HD_YADJM_1211_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_nm = (String)hash.get("cmpy_nm");
		dm.ern = (String)hash.get("ern");
		dm.in_cmpy_dt = (String)hash.get("in_cmpy_dt");
		dm.lvcmpy_dt = (String)hash.get("lvcmpy_dt");
		dm.impt_saly = (String)hash.get("impt_saly");
		dm.non_tax_prod = (String)hash.get("non_tax_prod");
		dm.non_tax_frnc = (String)hash.get("non_tax_frnc");
		dm.deci_incm_tax = (String)hash.get("deci_incm_tax");
		dm.deci_res_tax = (String)hash.get("deci_res_tax");
		dm.impt_bns = (String)hash.get("impt_bns");
		dm.bns_incm_tax_tot_amt = (String)hash.get("bns_incm_tax_tot_amt");
		dm.bns_res_tax_tot_amt = (String)hash.get("bns_res_tax_tot_amt");
		dm.bns_deci_farm_spc_tax = (String)hash.get("bns_deci_farm_spc_tax");
		dm.aprv_bns_tot_amt = (String)hash.get("aprv_bns_tot_amt");
		dm.stok_num_shet_prft_amt = (String)hash.get("stok_num_shet_prft_amt");
		dm.np_pymt_amt = (String)hash.get("np_pymt_amt");
		dm.hosp_insr_fee = (String)hash.get("hosp_insr_fee");
		dm.emp_insr_fee = (String)hash.get("emp_insr_fee");
		dm.etc_insr_fee = (String)hash.get("etc_insr_fee");
		dm.input_not = (String)hash.get("input_not");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.adjm_rvrs_yy = (String)hash.get("adjm_rvrs_yy");
		dm.seq = (String)hash.get("seq");
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_1211_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1220_LDataSet ds = null;
		HD_YADJM_1220_LDM dm = new HD_YADJM_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_YADJM_1220_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1221_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1221_ADataSet ds = null;
		HD_YADJM_1221_ADM dm = new HD_YADJM_1221_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.hous_hire_rcpm_won_li_amt = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		dm.ltrm_hous_mogg_loan_amt_int = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		dm.wedd_tms = Util.checkString(req.getParameter("wedd_tms"));
		dm.wedd_fee = Util.checkString(req.getParameter("wedd_fee"));
		dm.movm_tms = Util.checkString(req.getParameter("movm_tms"));
		dm.movm_fee = Util.checkString(req.getParameter("movm_fee"));
		dm.fnrl_tms = Util.checkString(req.getParameter("fnrl_tms"));
		dm.fnrl_fee = Util.checkString(req.getParameter("fnrl_fee"));
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.emp_stok_ownr_out_pens = Util.checkString(req.getParameter("emp_stok_ownr_out_pens"));
		dm.lvcmpy_pens_incm_dduc = Util.checkString(req.getParameter("lvcmpy_pens_incm_dduc"));
		dm.plac_cmpy_trad_authr_inc = Util.checkString(req.getParameter("plac_cmpy_plac_trad_authr_inc"));
		dm.ltrm_stok_savg_incm_dduc = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc"));
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.tax_paymt_cmpd_dduc = Util.checkString(req.getParameter("tax_paymt_cmpd_dduc"));
		dm.dona_polt_fund = Util.checkString(req.getParameter("dona_polt_fund"));
		dm.forn_duty_plac = Util.checkString(req.getParameter("forn_duty_plac"));
		dm.forn_duty_dty = Util.checkString(req.getParameter("forn_duty_dty"));
		dm.forn_duty_prd_frdt = Util.checkString(req.getParameter("forn_duty_prd_frdt"));
		dm.forn_duty_prd_todt = Util.checkString(req.getParameter("forn_duty_prd_todt"));
		dm.forn_duty_tot_saly = Util.checkString(req.getParameter("forn_duty_tot_saly"));
		dm.tax_paymt_offi_nm = Util.checkString(req.getParameter("tax_paymt_offi_nm"));
		dm.tax_paymt_amt_frex = Util.checkString(req.getParameter("tax_paymt_amt_frex"));
		dm.tax_paymt_amt_won = Util.checkString(req.getParameter("tax_paymt_amt_won"));
		dm.forn_duty_clsf = Util.checkString(req.getParameter("forn_duty_clsf"));
		dm.txn_obj_addm_amt = Util.checkString(req.getParameter("txn_obj_addm_amt"));
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_YADJM_1221_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1222_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1222_LDataSet ds = null;
		HD_YADJM_1222_LDM dm = new HD_YADJM_1222_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_YADJM_1222_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1223_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1223_ADataSet ds = null;
		HD_YADJM_1223_ADM dm = new HD_YADJM_1223_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = (String)hash.get("adjm_rvrs_yy");
		dm.emp_no = (String)hash.get("emp_no");
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.hosp_cost_slf_onta = (String)hash.get("hosp_cost_slf_onta");
		dm.hosp_cost_slf_etc = (String)hash.get("hosp_cost_slf_etc");
		dm.hosp_fee_onta = (String)hash.get("hosp_fee_onta");
		dm.hosp_fee_etc = (String)hash.get("hosp_fee_etc");
		dm.lgl_dona_amt_onta = (String)hash.get("lgl_dona_amt_onta");
		dm.lgl_dona_amt_etc = (String)hash.get("lgl_dona_amt_etc");
		dm.spc_case_dona_amt_onta = (String)hash.get("spc_case_dona_amt_onta");
		dm.spc_case_dona_amt_etc = (String)hash.get("spc_case_dona_amt_etc");
		dm.emp_stok_ownr_onta = (String)hash.get("emp_stok_ownr_onta");
		dm.emp_stok_ownr_etc = (String)hash.get("emp_stok_ownr_etc");
		dm.appm_dona_amt_onta = (String)hash.get("appm_dona_amt_onta");
		dm.appm_dona_amt_etc = (String)hash.get("appm_dona_amt_etc");
		dm.relg_appm_dona_amt_onta = (String)hash.get("relg_appm_dona_amt_onta");
		dm.relg_appm_dona_amt_etc = (String)hash.get("relg_appm_dona_amt_etc");
		dm.edu_cost_slf_sclgg_onta = (String)hash.get("edu_cost_slf_sclgg_onta");
		dm.edu_cost_slf_sclgg_etc = (String)hash.get("edu_cost_slf_sclgg_etc");
		dm.edu_cost_slf_onta = (String)hash.get("edu_cost_slf_onta");
		dm.edu_cost_slf_etc = (String)hash.get("edu_cost_slf_etc");
		dm.edu_cost_ent_scl_onta = (String)hash.get("edu_cost_ent_scl_onta");
		dm.edu_cost_ent_scl_etc = (String)hash.get("edu_cost_ent_scl_etc");
		dm.edu_cost_elmihi_onta = (String)hash.get("edu_cost_elmihi_onta");
		dm.edu_cost_elmihi_etc = (String)hash.get("edu_cost_elmihi_etc");
		dm.edu_cost_univ_onta = (String)hash.get("edu_cost_univ_onta");
		dm.edu_cost_univ_etc = (String)hash.get("edu_cost_univ_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.edu_cost_giro_pymt_onta = (String)hash.get("edu_cost_giro_pymt_onta");
		dm.edu_cost_giro_pymt_etc = (String)hash.get("edu_cost_giro_pymt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.connect_ip = req.getRemoteAddr();
        dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();
		
		ds = (HD_YADJM_1223_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error."+ ds.errmsg + ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1224_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1224_LDataSet ds = null;
		HD_YADJM_1224_LDM dm = new HD_YADJM_1224_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_YADJM_1224_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_1225(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1225_ADataSet ds = null;
		HD_YADJM_1225_ADM dm = new HD_YADJM_1225_ADM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd							= Util.checkString(req.getParameter("cmpy_cd"));    // 회사코드     
		dm.adjm_rvrs_yy						= Util.checkString(req.getParameter("adjm_rvrs_yy"));    // 연말정산년도 
		dm.emp_no							= Util.checkString(req.getParameter("emp_no"));    // 연말정산년도 
		dm.connect_ip						= Util.checkString(req.getParameter("connect_ip"));    // 접속아이피                 
		dm.connect_userid					= Util.checkString(req.getParameter("connect_userid"));    // 접속아이디              
		dm.hous_hire						= Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));    // 본인      
		dm.ltrm_hous						= Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));    // 본인      

		dm.print();		
		
		ds = (HD_YADJM_1225_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_yadjm_1230(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1230_LDataSet ds = null;
		HD_YADJM_1230_LDM dm = new HD_YADJM_1230_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_YADJM_1230_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_yadjm_1231(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1231_ADataSet ds = null;
		HD_YADJM_1231_ADM dm = new HD_YADJM_1231_ADM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd							= Util.checkString(req.getParameter("cmpy_cd"));     //                                                           
		dm.adjm_rvrs_yy                  	= Util.checkString(req.getParameter("adjm_rvrs_yy"));     //                                                     
		dm.emp_no                        	= Util.checkString(req.getParameter("emp_no"));     //                                                            
		dm.wedd_tms							= Util.checkString(req.getParameter("wedd_tms"));     // 혼인횟수                                                 
		dm.movm_tms							= Util.checkString(req.getParameter("movm_tms"));     // 이사횟수                                                 
		dm.fnrl_tms							= Util.checkString(req.getParameter("fnrl_tms"));     // 장례횟수                                                 
		dm.prsn_pens_2000yy_aft				= Util.checkString(req.getParameter("prsn_pens_2000yy_aft"));     // 개인연금(2000년 이후)                        
		dm.pens_low_out_2001yy_aft			= Util.checkString(req.getParameter("pens_low_out_2001yy_aft"));     // 연금저축(2001년 이후)                     
		dm.invsm_cmpd_invsm_amt				= Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));     // 투자조합출자액                               
		dm.emp_stok_ownr_out_pens			= Util.checkString(req.getParameter("emp_stok_ownr_out_pens"));     // 우리사주출연금                             
		dm.lvcmpy_pens_incm_dduc			= Util.checkString(req.getParameter("lvcmpy_pens_incm_dduc"));     // 퇴직연금소득공제                            
		dm.plac_inc							= Util.checkString(req.getParameter("plac_cmpy_plac_trad_authr_inc"));     // 소기업소상공공인소득공제            
		dm.ltrm_dduc						= Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc"));     // 장기주식형저축소득공제              
		dm.hous_loan_amt_int				= Util.checkString(req.getParameter("hous_loan_amt_int"));     // 주택차입금이자                                  
		dm.tax_paymt_cmpd_dduc				= Util.checkString(req.getParameter("tax_paymt_cmpd_dduc"));     // 납세조항공제                                  
		dm.dona_polt_fund_10				= Util.checkString(req.getParameter("dona_polt_fund_10"));     // 기부정치자금(10만원)                            
		dm.forn_duty_plac					= Util.checkString(req.getParameter("forn_duty_plac"));     // 국외근무처                                         
		dm.forn_duty_dty					= Util.checkString(req.getParameter("forn_duty_dty"));     // 국외근무직책                                        
		dm.forn_duty_prd_frdt				= Util.checkString(req.getParameter("forn_duty_prd_frdt"));     // 국외근무기간(시작일자)                         
		dm.forn_duty_prd_todt				= Util.checkString(req.getParameter("forn_duty_prd_todt"));     // 국외근무기간(종료일자)                         
		dm.forn_duty_tot_saly				= Util.checkString(req.getParameter("forn_duty_tot_saly"));     // 국외근무총급여                                 
		dm.tax_paymt_offi_nm				= Util.checkString(req.getParameter("tax_paymt_offi_nm"));     // 납세국명                                        
		dm.tax_paymt_amt_frex				= Util.checkString(req.getParameter("tax_paymt_amt_frex"));     // 납세액(외화)                                   
		dm.tax_paymt_amt_won				= Util.checkString(req.getParameter("tax_paymt_amt_won"));     // 납세액(원화)                                    
		dm.forn_duty_clsf					= Util.checkString(req.getParameter("forn_duty_clsf"));     // 국외근무구분                                       
		dm.txn_obj_addm_amt					= Util.checkString(req.getParameter("txn_obj_addm_amt"));     // 과세대상추가금액                                 
		dm.ltrm_dduc1						= Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));     // 장기주식형저축고득공제_1년차       
		dm.ltrm_dduc2						= Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));     // 장기주식형저축소득공제_2년차       
		dm.ltrm_dduc3						= Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));     // 장기주식형저축소득공제_3년차       
		dm.hous_subc_savg					= Util.checkString(req.getParameter("hous_subc_savg"));     // 주책청약저축                                       
		dm.labr_hous_savg					= Util.checkString(req.getParameter("labr_hous_savg"));     // 근로자주택마련저축                                 
		dm.ltrm_hous_savg					= Util.checkString(req.getParameter("ltrm_hous_savg"));     // 장기주택마련저축                                   

        dm.print();		
		
		ds = (HD_YADJM_1231_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1400(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1400_ADataSet ds = null;
		HD_YADJM_1400_ADM dm = new HD_YADJM_1400_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy	= Util.checkString(req.getParameter("adjm_rvrs_yy"));   // 연말정산년도     
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));    			// 사번     
		dm.flnm	= Util.checkString(req.getParameter("flnm"));    				// 성명    
		dm.connect_ip = req.getRemoteAddr();
        dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();		
		
		ds = (HD_YADJM_1400_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1500_LDataSet ds = null;
		HD_YADJM_1500_LDM dm = new HD_YADJM_1500_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1600(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1600_LDataSet ds = null;
		HD_YADJM_1600_LDM dm = new HD_YADJM_1600_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		dm.print();
		
		ds = (HD_YADJM_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1601_LDataSet ds = null;
		HD_YADJM_1601_LDM dm = new HD_YADJM_1601_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();
		
		ds = (HD_YADJM_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_1602_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1602_LDataSet ds = null;
		HD_YADJM_1602_LDM dm = new HD_YADJM_1602_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_YADJM_1602_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_1603_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1603_LDataSet ds = null;
		HD_YADJM_1603_LDM dm = new HD_YADJM_1603_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_YADJM_1603_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_1604_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1604_LDataSet ds = null;
		HD_YADJM_1604_LDM dm = new HD_YADJM_1604_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();
		
		ds = (HD_YADJM_1604_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1800(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1800_LDataSet ds = null;
		HD_YADJM_1800_LDM dm = new HD_YADJM_1800_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		dm.print();
		
		ds = (HD_YADJM_1800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1810(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1810_LDataSet ds = null;
		HD_YADJM_1810_LDM dm = new HD_YADJM_1810_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.obj_pers_flnm = Util.checkString(req.getParameter("obj_pers_flnm"));
		dm.yyyy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		
		dm.print();
		
		ds = (HD_YADJM_1810_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1820(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1820_LDataSet ds = null;
		HD_YADJM_1820_LDM dm = new HD_YADJM_1820_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy	= Util.checkString(req.getParameter("adjm_rvrs_yy"));
			
		dm.print();
		
		ds = (HD_YADJM_1820_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1830(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1830_LDataSet ds = null;
		HD_YADJM_1830_LDM dm = new HD_YADJM_1830_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		
		dm.print();
		
		ds = (HD_YADJM_1830_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1840(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_YADJM_1840_ADataSet ds = null;
		HD_YADJM_1840_ADM dm = new HD_YADJM_1840_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));
		
        dm.print();
		
		ds = (HD_YADJM_1840_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1900(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1900_LDataSet ds = null;
		HD_YADJM_1900_LDM dm = new HD_YADJM_1900_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();
		
		ds = (HD_YADJM_1900_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_1930(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1930_LDataSet ds = null;
		HD_YADJM_1930_LDM dm = new HD_YADJM_1930_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		
		dm.print();
		
		ds = (HD_YADJM_1930_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_yadjm_1940(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_YADJM_1940_ADataSet ds = null;
		HD_YADJM_1940_ADM dm = new HD_YADJM_1940_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));

		dm.print();
		
		ds = (HD_YADJM_1940_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2000_ADataSet ds = null;
		HD_YADJM_2000_ADM dm = new HD_YADJM_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2003_LDataSet ds = null;
		HD_YADJM_2003_LDM dm = new HD_YADJM_2003_LDM();
		
		ds = (HD_YADJM_2003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2004_LDataSet ds = null;
		HD_YADJM_2004_LDM dm = new HD_YADJM_2004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		ds = (HD_YADJM_2004_LDataSet)manager.executeCall(dm);
		dm.print();	
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
			
		req.setAttribute("ds", ds);
	}
	public void hd_yadjm_3000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3000_LDataSet ds = null;
		HD_YADJM_3000_LDM dm = new HD_YADJM_3000_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_YADJM_3000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_3001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3001_LDataSet ds = null;
		HD_YADJM_3001_LDM dm = new HD_YADJM_3001_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_YADJM_3001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

	}

	public void hd_yadjm_3002(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3002_LDataSet ds = null;
		HD_YADJM_3002_LDM dm = new HD_YADJM_3002_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_YADJM_3002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_yadjm_3003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3003_ADataSet ds = null;
		HD_YADJM_3003_ADM dm = new HD_YADJM_3003_ADM();
		//System.out.println("11111111111");
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		//System.out.println("2222222222"+multiUpdateData);
//		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
//		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
//		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
//		dm.flnm          = Util.checkString(req.getParameter("flnm"));
//		dm.incmg_pers_ip = req.getRemoteAddr();
//		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
//		dm.mode                  = ((String)hash.get("m")).toUpperCase();
//		dm.faml_seq              = ((String)hash.get("faml_seq"));
//		dm.faml_rshp_cd          = ((String)hash.get("faml_rshp_cd"));
//		dm.faml_rshp_nm          = ((String)hash.get("faml_rshp_nm"));
//		dm.faml_flnm             = ((String)hash.get("faml_flnm"));
//		dm.faml_prn              = ((String)hash.get("faml_prn"));
//		dm.dth_dt                = ((String)hash.get("dth_dt"));
//		dm.spos_dduc_obj_yn      = ((String)hash.get("spos_dduc_obj_yn"));
//		dm.child_dduc_obj_yn     = ((String)hash.get("child_dduc_obj_yn"));
//		dm.oldg_dduc_obj_yn      = ((String)hash.get("oldg_dduc_obj_yn"));
//		dm.rspc_dduc_obj_yn      = ((String)hash.get("rspc_dduc_obj_yn"));
//		dm.obcl_pers_dduc_obj_yn = ((String)hash.get("obcl_pers_dduc_obj_yn"));
//		dm.fml_hshd_dduc_yn      = ((String)hash.get("fml_hshd_dduc_yn"));
//		dm.care_fee_dduc_yn      = ((String)hash.get("care_fee_dduc_yn"));
//		dm.adopt_dt              = (String)hash.get("adopt_dt");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = (String)hash.get("flnm");
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_rshp_nm = (String)hash.get("faml_rshp_nm");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.nmat_yn = (String)hash.get("nmat_yn");
		dm.ocpn_cd = (String)hash.get("ocpn_cd");
		dm.offi_nm = (String)hash.get("offi_nm");
		dm.posi = (String)hash.get("posi");
		dm.schir_cd = (String)hash.get("schir_cd");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.spos_dduc_obj_yn = (String)hash.get("spos_dduc_obj_yn");
		dm.child_dduc_obj_yn = (String)hash.get("child_dduc_obj_yn");
		dm.oldg_dduc_obj_yn = (String)hash.get("oldg_dduc_obj_yn");
		dm.rspc_dduc_obj_yn = (String)hash.get("rspc_dduc_obj_yn");
		dm.obcl_pers_dduc_obj_yn = (String)hash.get("obcl_pers_dduc_obj_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");

		dm.print();
		
		ds = (HD_YADJM_3003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_yadjm_3004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3004_LDataSet ds = null;
		HD_YADJM_3004_LDM dm = new HD_YADJM_3004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("to_emp_no"));

		dm.print();
		
		ds = (HD_YADJM_3004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_3005_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3005_MDataSet ds = null;
		HD_YADJM_3005_MDM dm = new HD_YADJM_3005_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_YADJM_3005_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_3006_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3006_MDataSet ds = null;
		HD_YADJM_3006_MDM dm = new HD_YADJM_3006_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		ds = (HD_YADJM_3006_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_yadjm_3007_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3007_ADataSet ds = null;
		HD_YADJM_3007_ADM dm = new HD_YADJM_3007_ADM();
		//System.out.println("11111111111");
	//	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
	//	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_3007_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5100_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5100_ADataSet ds = null;
		HD_YADJM_5100_ADM dm = new HD_YADJM_5100_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.zip_1_1 = Util.checkString(req.getParameter("zip_1_1"));
		dm.zip_2_1 = Util.checkString(req.getParameter("zip_2_1"));
		dm.addr_1 = Util.checkString(req.getParameter("addr_1"));
		dm.dtls_addr_1 = Util.checkString(req.getParameter("dtls_addr_1"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_5100_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5101_LDataSet ds = null;
		HD_YADJM_5101_LDM dm = new HD_YADJM_5101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();


		ds = (HD_YADJM_5101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5102_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5102_MDataSet ds = null;
		HD_YADJM_5102_MDM dm = new HD_YADJM_5102_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		ds = (HD_YADJM_5102_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5200_LDataSet ds = null;
		HD_YADJM_5200_LDM dm = new HD_YADJM_5200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_5200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5201_LDataSet ds = null;
		HD_YADJM_5201_LDM dm = new HD_YADJM_5201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_5201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5202_ADataSet ds = null;
		HD_YADJM_5202_ADM dm = new HD_YADJM_5202_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = (String)hash.get("m");
		dm.adjm_rvrs_yy = (String)hash.get("adjm_rvrs_yy");
		dm.emp_no = (String)hash.get("emp_no");
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.child_dduc_yn = (String)hash.get("child_dduc_yn");
		dm.oldg_dduc_yn = (String)hash.get("oldg_dduc_yn");
		dm.spos_dduc_yn = (String)hash.get("spos_dduc_yn");
		dm.rspc_dduc_yn = (String)hash.get("rspc_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.nmat_yn = (String)hash.get("nmat_yn");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.hosp_cost_slf_onta = (String)hash.get("hosp_cost_slf_onta");
		dm.hosp_cost_slf_etc = (String)hash.get("hosp_cost_slf_etc");
		dm.hosp_cost_onta = (String)hash.get("hosp_cost_onta");
		dm.hosp_cost_etc = (String)hash.get("hosp_cost_etc");
		dm.dduc_polt_fund = (String)hash.get("dduc_polt_fund");
		dm.lgl_dona_amt_etc = (String)hash.get("lgl_dona_amt_etc");
		dm.spc_case_dona_amt_etc = (String)hash.get("spc_case_dona_amt_etc");
		dm.appm_dona_amt_etc = (String)hash.get("appm_dona_amt_etc");
		dm.relg_appm_dona_amt_etc = (String)hash.get("relg_appm_dona_amt_etc");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.edu_cost_giro_pymt_onta = (String)hash.get("edu_cost_giro_pymt_onta");
		dm.edu_cost_giro_pymt_etc = (String)hash.get("edu_cost_giro_pymt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_YADJM_5202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5203_LDataSet ds = null;
		HD_YADJM_5203_LDM dm = new HD_YADJM_5203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_5203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101220_LDataSet ds = null;
		HD_YADJM_101220_LDM dm = new HD_YADJM_101220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_101220_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101210_ADataSet ds = null;
		HD_YADJM_101210_ADM dm = new HD_YADJM_101210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.edu_cost_giro_pymt_onta = (String)hash.get("edu_cost_giro_pymt_onta");
		dm.edu_cost_giro_pymt_etc = (String)hash.get("edu_cost_giro_pymt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_YADJM_101210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101212_ADataSet ds = null;
		HD_YADJM_101212_ADM dm = new HD_YADJM_101212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));

		dm.print();

		ds = (HD_YADJM_101212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101213_ADataSet ds = null;
		HD_YADJM_101213_ADM dm = new HD_YADJM_101213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));

		dm.print();
		
		ds = (HD_YADJM_101213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101230_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101230_LDataSet ds = null;
		HD_YADJM_101230_LDM dm = new HD_YADJM_101230_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_YADJM_101230_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101231_LDataSet ds = null;
		HD_YADJM_101231_LDM dm = new HD_YADJM_101231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		ds = (HD_YADJM_101231_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101232_ADataSet ds = null;
		HD_YADJM_101232_ADM dm = new HD_YADJM_101232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_101232_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101214_LDataSet ds = null;
		HD_YADJM_101214_LDM dm = new HD_YADJM_101214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_101214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101221_LDataSet ds = null;
		HD_YADJM_101221_LDM dm = new HD_YADJM_101221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_101221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101250_LDataSet ds = null;
		HD_YADJM_101250_LDM dm = new HD_YADJM_101250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_101250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101251_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101250_LDataSet ds = null;
		HD_YADJM_101250_LDM dm = new HD_YADJM_101250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_YADJM_101250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_101233_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_101233_LDataSet ds = null;
		HD_YADJM_101233_LDM dm = new HD_YADJM_101233_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		ds = (HD_YADJM_101233_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_106000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_106000_LDataSet ds = null;
		HD_YADJM_106000_LDM dm = new HD_YADJM_106000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_106000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_106001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_106001_ADataSet ds = null;
		HD_YADJM_106001_ADM dm = new HD_YADJM_106001_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));

		dm.print();

		ds = (HD_YADJM_106001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_106003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_106003_LDataSet ds = null;
		HD_YADJM_106003_LDM dm = new HD_YADJM_106003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_106003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_102000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_102000_ADataSet ds = null;
		HD_YADJM_102000_ADM dm = new HD_YADJM_102000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_102000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	// 2011년  연말정산 
	public void hd_yadjm_111220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111220_LDataSet ds = null;
		HD_YADJM_111220_LDM dm = new HD_YADJM_111220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_111220_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111210_ADataSet ds = null;
		HD_YADJM_111210_ADM dm = new HD_YADJM_111210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.edu_cost_giro_pymt_onta = (String)hash.get("edu_cost_giro_pymt_onta");
		dm.edu_cost_giro_pymt_etc = (String)hash.get("edu_cost_giro_pymt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_YADJM_111210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111212_ADataSet ds = null;
		HD_YADJM_111212_ADM dm = new HD_YADJM_111212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));

		dm.print();

		ds = (HD_YADJM_111212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111213_ADataSet ds = null;
		HD_YADJM_111213_ADM dm = new HD_YADJM_111213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_111213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111230_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111230_LDataSet ds = null;
		HD_YADJM_111230_LDM dm = new HD_YADJM_111230_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_YADJM_111230_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111231_LDataSet ds = null;
		HD_YADJM_111231_LDM dm = new HD_YADJM_111231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		ds = (HD_YADJM_111231_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111232_ADataSet ds = null;
		HD_YADJM_111232_ADM dm = new HD_YADJM_111232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_111232_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111214_LDataSet ds = null;
		HD_YADJM_111214_LDM dm = new HD_YADJM_111214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_111214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111221_LDataSet ds = null;
		HD_YADJM_111221_LDM dm = new HD_YADJM_111221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_111221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111250_LDataSet ds = null;
		HD_YADJM_111250_LDM dm = new HD_YADJM_111250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_111250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111251_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111250_LDataSet ds = null;
		HD_YADJM_111250_LDM dm = new HD_YADJM_111250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_YADJM_111250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_111233_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_111233_LDataSet ds = null;
		HD_YADJM_111233_LDM dm = new HD_YADJM_111233_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		ds = (HD_YADJM_111233_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_115200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_115200_MDataSet ds = null;
		HD_YADJM_115200_MDM dm = new HD_YADJM_115200_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_YADJM_115200_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	public void hd_yadjm_115600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_115600_MDataSet ds = null;
		HD_YADJM_115600_MDM dm = new HD_YADJM_115600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_YADJM_115600_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	//수정자 : 이태식 - 장기집합투자증권저축 환경변수 추가
	public void hd_yadjm_115700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_115700_MDataSet ds = null;
		HD_YADJM_115700_MDM dm = new HD_YADJM_115700_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_YADJM_115700_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_116000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_116000_LDataSet ds = null;
		HD_YADJM_116000_LDM dm = new HD_YADJM_116000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_116000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_116001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_116001_ADataSet ds = null;
		HD_YADJM_116001_ADM dm = new HD_YADJM_116001_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));

		dm.print();

		ds = (HD_YADJM_116001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_116003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_116003_LDataSet ds = null;
		HD_YADJM_116003_LDM dm = new HD_YADJM_116003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_116003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_6003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_6003_LDataSet ds = null;
		HD_YADJM_2012_6003_LDM dm = new HD_YADJM_2012_6003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_2012_6003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_112000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_112000_ADataSet ds = null;
		HD_YADJM_112000_ADM dm = new HD_YADJM_112000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_112000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1210_ADataSet ds = null;
		HD_YADJM_2012_1210_ADM dm = new HD_YADJM_2012_1210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.edu_cost_giro_pymt_onta = (String)hash.get("edu_cost_giro_pymt_onta");
		dm.edu_cost_giro_pymt_etc = (String)hash.get("edu_cost_giro_pymt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.trad_mrkt_onta = (String)hash.get("trad_mrkt_onta");
		dm.trad_mrkt_etc = (String)hash.get("trad_mrkt_etc");		
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));	
		dm.smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		
		ds = (HD_YADJM_2012_1210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1212_ADataSet ds = null;
		HD_YADJM_2012_1212_ADM dm = new HD_YADJM_2012_1212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));

		dm.print();

		ds = (HD_YADJM_2012_1212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1213_ADataSet ds = null;
		HD_YADJM_2012_1213_ADM dm = new HD_YADJM_2012_1213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_2012_1213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1214_LDataSet ds = null;
		HD_YADJM_2012_1214_LDM dm = new HD_YADJM_2012_1214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2012_1214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	// 2012년  연말정산 
	public void hd_yadjm_2012_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1220_LDataSet ds = null;
		HD_YADJM_2012_1220_LDM dm = new HD_YADJM_2012_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2012_1220_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1221_LDataSet ds = null;
		HD_YADJM_2012_1221_LDM dm = new HD_YADJM_2012_1221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2012_1221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1231_LDataSet ds = null;
		HD_YADJM_2012_1231_LDM dm = new HD_YADJM_2012_1231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print(); 

		ds = (HD_YADJM_2012_1231_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1232_ADataSet ds = null;
		HD_YADJM_2012_1232_ADM dm = new HD_YADJM_2012_1232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_2012_1232_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1233_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1233_LDataSet ds = null;
		HD_YADJM_2012_1233_LDM dm = new HD_YADJM_2012_1233_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		ds = (HD_YADJM_2012_1233_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1250_LDataSet ds = null;
		HD_YADJM_2012_1250_LDM dm = new HD_YADJM_2012_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2012_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_1251_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1250_LDataSet ds = null;
		HD_YADJM_2012_1250_LDM dm = new HD_YADJM_2012_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_YADJM_2012_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_2000_ADataSet ds = null;
		HD_YADJM_2012_2000_ADM dm = new HD_YADJM_2012_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2012_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_6000_LDataSet ds = null;
		HD_YADJM_2012_6000_LDM dm = new HD_YADJM_2012_6000_LDM();
	     System.out.println("dddd");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
	    
		dm.print();

		ds = (HD_YADJM_2012_6000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_6001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_6001_ADataSet ds = null;
		HD_YADJM_2012_6001_ADM dm = new HD_YADJM_2012_6001_ADM();
     System.out.println("dddd");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));

		dm.print();

		ds = (HD_YADJM_2012_6001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_127001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_YADJM_127001_ADataSet ds = null;
		HD_YADJM_127001_ADM dm = new HD_YADJM_127001_ADM();
		

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원
		
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	//String add_file_no1 =  Util.checkString(req.getParameter("add_file_no1"));
    	ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");

    	
//      삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag)){
        	if(attcFiles != null){
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
//			            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
//			            	dm.setAdd_file_no1(add_file_no1);
//			            }
		        	}
		        }    
        	}
        }
		
        if ("".equals(flag) && !"it0022".equals(dm.incmg_pers)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "해당 사용자는 본화면에서 업로드 할 수 없습니다. [ERP]에서 업로드하세요.");
        }
      
        String multiUpdateData = Util.checkString(req.getParameter("xml"));
        System.out.println("등록:"+ flag);
        System.out.println(multiUpdateData);
		if ("I".equals(flag)){
			String[] converted      = convertMultiUpdateData(multiUpdateData);
			String doc_type	= converted[0];	
			String seq 	 	= converted[1];
			String att_year	= converted[2];
			String form_cd 	= converted[3];	
			String resid 	= converted[4];
			String name 	= converted[5];
			String dat_cd 	= converted[6];
			String busnid	= converted[7];
			String trade_nm = converted[8];
			String acc_no 	= converted[9];
			String use_place_cd	= converted[10];
			String donation_cd = converted[11];
			String course_cd = converted[12];            
			String subject_nm = converted[13];           
			String start_dt = converted[14];             
			String end_dt = converted[15];              
			String com_cd = converted[16];               
			String pension_cd = converted[17];           
			String goods_nm = converted[18];             
			String lend_dt = converted[19];              
			String lend_kd = converted[20];              
			String house_take_dt = converted[21];       
			String mort_setup_dt = converted[22];        
			String repay_years = converted[23];            
			String lend_goods_nm = converted[24];        
			String debt = converted[25];                   
			String fixed_rate_debt = converted[26];        
			String not_defer_debt = converted[27];         
			String this_year_rede_amt = converted[28];     
			String saving_gubn = converted[29];          
			String reg_dt = converted[30];               
			String pay_method = converted[31];           
			String insu1_resid = converted[32];          
			String insu1_nm = converted[33];             
			String insu2_resid1 = converted[34];          
			String insu2_nm1 = converted[35];             
	        String insu2_resid2 = converted[36];          
			String insu2_nm2 = converted[37];
			String insu2_resid3 = converted[38];          
			String insu2_nm3 = converted[39];
			String amt = converted[40];
			String sum = converted[41];
			String mm = converted[42];
			String dd = converted[43];
			String fix_cd = converted[44];
			String date = converted[45];
			String annual = converted[46];
			String sum_y1 = converted[47];
			String sum_y2 = converted[48];
			String sum_y3 = converted[49];
			String ddct = converted[50];
			
			dm.setDoc_type(doc_type);
			dm.setSeq(seq);
			dm.setAtt_year(att_year);
			dm.setForm_cd(form_cd);
			dm.setResid(resid);
			dm.setName(name);
			dm.setDat_cd(dat_cd);
			dm.setBusnid(busnid);
			dm.setTrade_nm(trade_nm);
			dm.setAcc_no(acc_no);
			dm.setUse_place_cd(use_place_cd);
			dm.setDonation_cd(donation_cd);
			dm.setCourse_cd(course_cd);
			dm.setSubject_nm(subject_nm);
			dm.setStart_dt(start_dt);
			dm.setEnd_dt(end_dt);
			dm.setCom_cd(com_cd);
			dm.setPension_cd(pension_cd);
			dm.setGoods_nm(goods_nm);
			dm.setLend_dt(lend_dt);
			dm.setLend_kd(lend_kd);
			dm.setHouse_take_dt(house_take_dt);
			dm.setMort_setup_dt(mort_setup_dt);
			dm.setRepay_years(repay_years);
			dm.setLend_goods_nm(lend_goods_nm);
			dm.setDebt(debt);
			dm.setFixed_rate_debt(fixed_rate_debt);
			dm.setNot_defer_debt(not_defer_debt);
			dm.setThis_year_rede_amt(this_year_rede_amt);
			dm.setSaving_gubn(saving_gubn);
			dm.setReg_dt(reg_dt);
			dm.setPay_method(pay_method);
			dm.setInsu1_resid(insu1_resid);
			dm.setInsu1_nm(insu1_nm);
			dm.setInsu2_resid1(insu2_resid1);
			dm.setInsu2_nm1(insu2_nm1);
			dm.setInsu2_resid2(insu2_resid2);
			dm.setInsu2_nm2(insu2_nm2);
			dm.setInsu2_resid3(insu2_resid3);
			dm.setInsu2_nm3(insu2_nm3);
			dm.setAmt(amt);
			dm.setSum(sum);
			dm.setMm(mm);
			dm.setDd(dd);
			dm.setFix_cd(fix_cd);
			dm.setDate(date);
			dm.setAnnual(annual);
			dm.setSum_y1(sum_y1);
			dm.setSum_y2(sum_y2);
			dm.setSum_y3(sum_y3);
			dm.setDdct(ddct);
		}
		
		
		
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		//dm.add_file_no1	= Util.checkString(req.getParameter("add_file_no1"));
		dm.flag = Util.checkString(req.getParameter("flag"));
    	
		dm.print();

        try {
        	HD_YADJM_1000DAO dao = new HD_YADJM_1000DAO();
            ds = dao.hd_yadjm_127001_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
        /*
		ds = (HD_YADJM_127001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_conv_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_CONV_ADataSet ds = null;
		HD_YADJM_2012_CONV_ADM dm = new HD_YADJM_2012_CONV_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.incmg_pers_ip  = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_YADJM_2012_CONV_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2012_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_7000_LDataSet ds = null;
		HD_YADJM_2012_7000_LDM dm = new HD_YADJM_2012_7000_LDM();
	   
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.doc_type = Util.checkString(req.getParameter("doc_type"));
		dm.form_cd = Util.checkString(req.getParameter("form_cd"));
	    
		dm.print();
 
		ds = (HD_YADJM_2012_7000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_yadjm_2012_7002_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_7002_SDataSet ds = null;
		HD_YADJM_2012_7002_SDM dm = new HD_YADJM_2012_7002_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.doc_type = Util.checkString(req.getParameter("doc_type"));
		dm.form_cd = Util.checkString(req.getParameter("form_cd"));
   	
    	dm.print();
    	
        
    	ds = (HD_YADJM_2012_7002_SDataSet)manager.executeCall(dm);
        
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
        req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
        req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.            
               
    }
	
	//2013년도 연말정산 
	
//	수정자: 이태식 - 주택유형, 주택면적 추가 조회
	public void hd_yadjm_5400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5400_LDataSet ds = null;
		HD_YADJM_5400_LDM dm = new HD_YADJM_5400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_5400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	//수정자: 이태식 - 주택유형, 주택면적 추가
	public void hd_yadjm_5401_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5401_ADataSet ds = null;
		HD_YADJM_5401_ADM dm = new HD_YADJM_5401_ADM();
     System.out.println("dddd");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.leas_flnm = Util.checkString(req.getParameter("leas_flnm"));
		dm.leas_prn = Util.checkString(req.getParameter("leas_prn"));
		dm.leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
		dm.leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.month_rent_amt = Util.checkString(req.getParameter("month_rent_amt"));
		dm.resi_clsf_cd = Util.checkString(req.getParameter("resi_clsf_cd"));
		dm.hous_cntr_sqr = Util.checkString(req.getParameter("hous_cntr_sqr"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_YADJM_5401_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5402_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5402_ADataSet ds = null;
		HD_YADJM_5402_ADM dm = new HD_YADJM_5402_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_YADJM_5402_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1210_ADataSet ds = null;
		HD_YADJM_2013_1210_ADM dm = new HD_YADJM_2013_1210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.one_paren_dduc_yn = (String)hash.get("one_paren_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.obcl_pers_clsf = (String)hash.get("obcl_pers_clsf");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.trad_mrkt_onta = (String)hash.get("trad_mrkt_onta");
		dm.trad_mrkt_etc = (String)hash.get("trad_mrkt_etc");	
		dm.public_trans_amt_onta = (String)hash.get("public_trans_amt_onta");
		dm.public_trans_amt_etc = (String)hash.get("public_trans_amt_etc");
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));	
		dm.smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
		dm.larg_sum_no_lease_house = Util.checkString(req.getParameter("larg_sum_no_lease_house"));
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		
		ds = (HD_YADJM_2013_1210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1212_ADataSet ds = null;
		HD_YADJM_2013_1212_ADM dm = new HD_YADJM_2013_1212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));

		dm.print();

		ds = (HD_YADJM_2013_1212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1213_ADataSet ds = null;
		HD_YADJM_2013_1213_ADM dm = new HD_YADJM_2013_1213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_2013_1213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1214_LDataSet ds = null;
		HD_YADJM_2013_1214_LDM dm = new HD_YADJM_2013_1214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2013_1214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2013_1220_LDataSet ds = null;
		HD_YADJM_2013_1220_LDM dm = new HD_YADJM_2013_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2013_1220_LDataSet)manager.executeCall(dm);
		
		
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1221_LDataSet ds = null;
		HD_YADJM_2013_1221_LDM dm = new HD_YADJM_2013_1221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2013_1221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1231_LDataSet ds = null;
		HD_YADJM_2013_1231_LDM dm = new HD_YADJM_2013_1231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		try {
			 
			ds = (HD_YADJM_2013_1231_LDataSet)manager.executeCall(dm);
			
			 System.out.print("ddd");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
        	
        }
        catch (AppException e) {
            throw e;
        } 
//        
	
		
		req.setAttribute("ds", ds);
	}
	//수정자 이태식: 변경사항 없음 (오토젠작업)
	public void hd_yadjm_2014_1231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1231_LDataSet ds = null;
		HD_YADJM_2014_1231_LDM dm = new HD_YADJM_2014_1231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		try {
			 
			ds = (HD_YADJM_2014_1231_LDataSet)manager.executeCall(dm);
			
			 System.out.print("ddd");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
        	
        }
        catch (AppException e) {
            throw e;
        } 
//        
	
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1232_ADataSet ds = null;
		HD_YADJM_2013_1232_ADM dm = new HD_YADJM_2013_1232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_2013_1232_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1233_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1233_LDataSet ds = null;
		HD_YADJM_2013_1233_LDM dm = new HD_YADJM_2013_1233_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		ds = (HD_YADJM_2013_1233_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1234_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1234_LDataSet ds = null;
		HD_YADJM_2013_1234_LDM dm = new HD_YADJM_2013_1234_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2013_1234_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_1250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1250_LDataSet ds = null;
		HD_YADJM_2013_1250_LDM dm = new HD_YADJM_2013_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2013_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_2000_ADataSet ds = null;
		HD_YADJM_2013_2000_ADM dm = new HD_YADJM_2013_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2013_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_6000_LDataSet ds = null;
		HD_YADJM_2013_6000_LDM dm = new HD_YADJM_2013_6000_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
	     
		dm.print();

		ds = (HD_YADJM_2013_6000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_6001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_6001_ADataSet ds = null;
		HD_YADJM_2013_6001_ADM dm = new HD_YADJM_2013_6001_ADM();
     
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));

		dm.print();

		ds = (HD_YADJM_2013_6001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_6003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_6003_LDataSet ds = null;
		HD_YADJM_2013_6003_LDM dm = new HD_YADJM_2013_6003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_2013_6003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_yadjm_137001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_YADJM_137001_ADataSet ds = null;
		HD_YADJM_137001_ADM dm = new HD_YADJM_137001_ADM();
		
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원
		
		
		//dm.print();
		
		
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	//String add_file_no1 =  Util.checkString(req.getParameter("add_file_no1"));
    	ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");

    	//System.out.println("flag 나와라 " + flag );
    	 //System.out.println(attcFiles);
//      삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag)){
        	if(attcFiles != null){
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
//			            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
//			            	dm.setAdd_file_no1(add_file_no1);
//			            }
		        	}
		        }    
        	}
        }
		
        if ("".equals(flag) && !"it0022".equals(dm.incmg_pers)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "해당 사용자는 본화면에서 업로드 할 수 없습니다. [ERP]에서 업로드하세요. ");
        }
        if ("204".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "비밀번호가 틀립니다. 다시 입력해주세요 .");
        }
       /* if ("101".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 진본성 ");
            throw new AppException("진본성 검증 초기화에 문제가 있습니다.");
        }
        */
        String multiUpdateData = Util.checkString(req.getParameter("xml"));
        System.out.println("$$$ hd_yadjm_137001_a WB 의 multiUpdateData===>"+multiUpdateData);
      //  System.out.println("등록:"+ multiUpdateData);
        
		if ("I".equals(flag)){
			// System.out.println("학교 종이 " + multiUpdateData);
			String[] converted      = convertMultiUpdateData(multiUpdateData);
			System.out.println(" 댕댕   :  " + converted.length );
			String doc_type	= converted[0];
			String seq 	 	= converted[1];
			String att_year	= converted[2];
			String form_cd 	= converted[3];	
			String resid 	= converted[4];
			String name 	= converted[5];
			String dat_cd 	= converted[6];
			
			String busnid	= converted[7];
			String trade_nm = converted[8];
			String acc_no 	= converted[9];
			String use_place_cd	= converted[10];
			String donation_cd = converted[11];
			String course_cd = converted[12];            
			String subject_nm = converted[13];           
			String start_dt = converted[14];             
			String end_dt = converted[15];              
			String com_cd = converted[16];               
			String pension_cd = converted[17];           
			String goods_nm = converted[18];             
			String lend_dt = converted[19];              
			String lend_kd = converted[20];              
			String house_take_dt = converted[21];       
			String mort_setup_dt = converted[22];        
			String repay_years = converted[23];            
			String lend_goods_nm = converted[24];        
			String debt = converted[25];      
			String fixed_rate_debt = converted[26];        
			String not_defer_debt = converted[27];         
			String this_year_rede_amt = converted[28];     
			String saving_gubn = converted[29];          
			String reg_dt = converted[30];               
			String pay_method = converted[31];           
			String insu1_resid = converted[32];          
			String insu1_nm = converted[33];             
			String insu2_resid1 = converted[34];          
			String insu2_nm1 = converted[35];             
	        String insu2_resid2 = converted[36];          
			String insu2_nm2 = converted[37];
			String insu2_resid3 = converted[38];          
			String insu2_nm3 = converted[39];
			String amt = converted[40];
			String sum = converted[41];
			String mm = converted[42];
			String dd = converted[43];
			String fix_cd = converted[44];
			String date = converted[45];
			String annual = converted[46];
			String sum_y1 = converted[47];
			String sum_y2 = converted[48];
			String sum_y3 = converted[49];
			 System.out.println("땡땡" + converted[50]);
			String ann_tot_amt = converted[50];
			String tax_year_amt = converted[51];
			String ddct_bs_ass_amt = converted[52];
			String ddct = converted[53];
			
			dm.setDoc_type(doc_type);
			dm.setSeq(seq);
			dm.setAtt_year(att_year);
			dm.setForm_cd(form_cd);
			dm.setResid(resid);
			dm.setName(name);
			dm.setDat_cd(dat_cd);
			dm.setBusnid(busnid);
			dm.setTrade_nm(trade_nm);
			dm.setAcc_no(acc_no);
			dm.setUse_place_cd(use_place_cd);
			dm.setDonation_cd(donation_cd);
			dm.setCourse_cd(course_cd);
			dm.setSubject_nm(subject_nm);
			dm.setStart_dt(start_dt);
			dm.setEnd_dt(end_dt);
			dm.setCom_cd(com_cd);
			dm.setPension_cd(pension_cd);
			dm.setGoods_nm(goods_nm);
			dm.setLend_dt(lend_dt);
			dm.setLend_kd(lend_kd);
			dm.setHouse_take_dt(house_take_dt);
			dm.setMort_setup_dt(mort_setup_dt);
			dm.setRepay_years(repay_years);
			dm.setLend_goods_nm(lend_goods_nm);
			dm.setDebt(debt);
			dm.setFixed_rate_debt(fixed_rate_debt);
			dm.setNot_defer_debt(not_defer_debt);
			dm.setThis_year_rede_amt(this_year_rede_amt);
			dm.setSaving_gubn(saving_gubn);
			dm.setReg_dt(reg_dt);
			dm.setPay_method(pay_method);
			dm.setInsu1_resid(insu1_resid);
			dm.setInsu1_nm(insu1_nm);
			dm.setInsu2_resid1(insu2_resid1);
			dm.setInsu2_nm1(insu2_nm1);
			dm.setInsu2_resid2(insu2_resid2);
			dm.setInsu2_nm2(insu2_nm2);
			dm.setInsu2_resid3(insu2_resid3);
			dm.setInsu2_nm3(insu2_nm3);
			dm.setAmt(amt);
			dm.setSum(sum);
			dm.setMm(mm);
			dm.setDd(dd);
			dm.setFix_cd(fix_cd);
			dm.setDate(date);
			dm.setAnnual(annual);
			dm.setSum_y1(sum_y1);
			dm.setSum_y2(sum_y2);
			dm.setSum_y3(sum_y3);
			dm.setDdct(ddct);
			dm.setAnn_tot_amt(ann_tot_amt);
			dm.setTax_year_amt(tax_year_amt);
			dm.setDdct_bs_ass_amt(ddct_bs_ass_amt);
		}
		
		
		System.out.println("어서모이 ");
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		//dm.add_file_no1	= Util.checkString(req.getParameter("add_file_no1"));
		dm.flag = Util.checkString(req.getParameter("flag"));
    	
		dm.print();

        try {
        	HD_YADJM_1000DAO dao = new HD_YADJM_1000DAO();
            ds = dao.hd_yadjm_137001_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
        /*
		ds = (HD_YADJM_137001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
		
		req.setAttribute("ds", ds);
	}
	
//수정자 : 이태식 -장애인공제 콤보박스리스트 수정
	public void hd_yadjm_5900_m (HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_YADJM_5900_MDataSet ds = null;
		HD_YADJM_5900_MDM dm = new HD_YADJM_5900_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		ds = (HD_YADJM_5900_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5901_l (HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_YADJM_5901_LDataSet ds = null;
		HD_YADJM_5901_LDM dm = new HD_YADJM_5901_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.faml_seq = Util.checkString(req.getParameter("faml_seq"));
		
		ds = (HD_YADJM_5901_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_5902_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5902_ADataSet ds = null;
		HD_YADJM_5902_ADM dm = new HD_YADJM_5902_ADM();
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.faml_flnm  = Util.checkString(req.getParameter("faml_flnm"));
		dm.faml_seq = Util.checkString(req.getParameter("faml_seq"));
		dm.obcl_pers_clsf  = Util.checkString(req.getParameter("obcl_pers_clsf"));
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
	    
		ds = (HD_YADJM_5902_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_conv_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_CONV_ADataSet ds = null;
		HD_YADJM_2013_CONV_ADM dm = new HD_YADJM_2013_CONV_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.incmg_pers_ip  = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_YADJM_2013_CONV_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_2013_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_7000_LDataSet ds = null;
		HD_YADJM_2013_7000_LDM dm = new HD_YADJM_2013_7000_LDM();
	   
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.doc_type = Util.checkString(req.getParameter("doc_type"));
		dm.form_cd = Util.checkString(req.getParameter("form_cd"));
	    
		dm.print();
 
		ds = (HD_YADJM_2013_7000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_yadjm_2013_7002_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_7002_SDataSet ds = null;
		HD_YADJM_2013_7002_SDM dm = new HD_YADJM_2013_7002_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.doc_type = Util.checkString(req.getParameter("doc_type"));
		dm.form_cd = Util.checkString(req.getParameter("form_cd"));
   	
    	dm.print();
    	
        
    	ds = (HD_YADJM_2013_7002_SDataSet)manager.executeCall(dm);
        
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
        req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
        req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.            
               
    }
	
	/* 2014년 연말정산개발
	 * 작업일자 : 2014.12.10
	 * 특이사항 : 
	 * */		
	//2014년 연말정산-화면권한여부
	public void hd_yadjm_2014_6003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_6003_LDataSet ds = null;
		HD_YADJM_2013_6003_LDM dm = new HD_YADJM_2013_6003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_2013_6003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산-지급조서파일생성-파일생성
	public void hd_yadjm_2014_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_2000_ADataSet ds = null;
		HD_YADJM_2014_2000_ADM dm = new HD_YADJM_2014_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2014_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산자료등록 임시저장 , 저장시에 동시에 호출됨
	public void hd_yadjm_2014_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1210_ADataSet ds = null;
		HD_YADJM_2014_1210_ADM dm = new HD_YADJM_2014_1210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.one_paren_dduc_yn = (String)hash.get("one_paren_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.obcl_pers_clsf = (String)hash.get("obcl_pers_clsf");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.trad_mrkt_onta = (String)hash.get("trad_mrkt_onta");
		dm.trad_mrkt_etc = (String)hash.get("trad_mrkt_etc");	
		dm.public_trans_amt_onta = (String)hash.get("public_trans_amt_onta");
		dm.public_trans_amt_etc = (String)hash.get("public_trans_amt_etc");
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.ltrm_invsm_stock_amt = Util.checkString(req.getParameter("ltrm_invsm_stock_amt"));
		
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));	
		dm.smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
		dm.larg_sum_no_lease_house = Util.checkString(req.getParameter("larg_sum_no_lease_house"));
		
	    dm.debit_card_1st_amt_onta  = (String)hash.get("debit_card_1st_amt_onta");
		dm.debit_card_2nd_amt_onta  = (String)hash.get("debit_card_2nd_amt_onta");
		dm.debit_card_1st_amt_etc   = (String)hash.get("debit_card_1st_amt_etc");
		dm.debit_card_2nd_amt_etc   = (String)hash.get("debit_card_2nd_amt_etc");
		dm.cash_rcpt_1st_onta       = (String)hash.get("cash_rcpt_1st_onta");
		dm.cash_rcpt_2nd_onta       = (String)hash.get("cash_rcpt_2nd_onta");
		dm.trad_all_1st_amt_onta    = (String)hash.get("trad_all_1st_amt_onta");
		dm.trad_all_2nd_amt_onta    = (String)hash.get("trad_all_2nd_amt_onta");
		dm.trad_all_1st_amt_etc     = (String)hash.get("trad_all_1st_amt_etc");
		dm.trad_all_2nd_amt_etc     = (String)hash.get("trad_all_2nd_amt_etc");
		dm.trans_all_1st_amt_onta   = (String)hash.get("trans_all_1st_amt_onta");
		dm.trans_all_2nd_amt_onta   = (String)hash.get("trans_all_2nd_amt_onta");
		dm.trans_all_1st_amt_etc    = (String)hash.get("trans_all_1st_amt_etc");
		dm.trans_all_2nd_amt_etc    = (String)hash.get("trans_all_2nd_amt_etc");
		dm.crdt_card_incd_pre_onta  = (String)hash.get("crdt_card_incd_pre_onta");
		dm.crdt_card_incd_pre_etc   = (String)hash.get("crdt_card_incd_pre_etc");
		dm.debit_card_incd_pre_onta = (String)hash.get("debit_card_incd_pre_onta");
		dm.debit_card_incd_pre_etc  = (String)hash.get("debit_card_incd_pre_etc");
		dm.cash_rcpt_incd_pre_onta  = (String)hash.get("cash_rcpt_incd_pre_onta");
		dm.trad_pre_amt_onta  = (String)hash.get("trad_pre_amt_onta");
		dm.trad_pre_amt_etc  = (String)hash.get("trad_pre_amt_etc");
		dm.trans_pre_amt_onta  = (String)hash.get("trans_pre_amt_onta");
		dm.trans_pre_amt_etc  = (String)hash.get("trans_pre_amt_etc");
		
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		
		ds = (HD_YADJM_2014_1210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산자료등록-연말정산 조회
	public void hd_yadjm_2014_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2014_1220_LDataSet ds = null;
		HD_YADJM_2014_1220_LDM dm = new HD_YADJM_2014_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2014_1220_LDataSet)manager.executeCall(dm);
		
		
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산자료등록-파일업로드
	public void hd_yadjm_2014_conv_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_CONV_ADataSet ds = null;
		HD_YADJM_2013_CONV_ADM dm = new HD_YADJM_2013_CONV_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.incmg_pers_ip  = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_YADJM_2013_CONV_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산자료등록-연말정산 조회(팝업리프레쉬)
	public void hd_yadjm_2014_1221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1221_LDataSet ds = null;
		HD_YADJM_2014_1221_LDM dm = new HD_YADJM_2014_1221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2014_1221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산파일다운로드 - 사용하는지 나중에 확인이 필요함
	public void hd_yadjm_2014_7002_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_7002_SDataSet ds = null;
		HD_YADJM_2013_7002_SDM dm = new HD_YADJM_2013_7002_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.doc_type = Util.checkString(req.getParameter("doc_type"));
		dm.form_cd = Util.checkString(req.getParameter("form_cd"));
   	
    	dm.print();
    	
        
    	ds = (HD_YADJM_2013_7002_SDataSet)manager.executeCall(dm);
        
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
        req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
        req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.                          
    }
	
	//2014년 연말정산자료등록-정산결과조회 
	public void hd_yadjm_2014_1250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1250_LDataSet ds = null;
		HD_YADJM_2014_1250_LDM dm = new HD_YADJM_2014_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2014_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산자료등록-연금저축 저장/수정/삭제 (장기집합투자증권저축  추가)
	public void hd_yadjm_2014_1232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1232_ADataSet ds = null;
		HD_YADJM_2014_1232_ADM dm = new HD_YADJM_2014_1232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_2014_1232_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}
	
	//연금저축41 총합계
	public void hd_yadjm_2014_1233_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1233_LDataSet ds = null;
		HD_YADJM_2013_1233_LDM dm = new HD_YADJM_2013_1233_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		ds = (HD_YADJM_2013_1233_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산 의료비 팝업 저장버튼
	public void hd_yadjm_2014_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1212_ADataSet ds = null;
		HD_YADJM_2014_1212_ADM dm = new HD_YADJM_2014_1212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));

		dm.print();

		ds = (HD_YADJM_2014_1212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산 기부금팝업저장버튼
	public void hd_yadjm_2014_1213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1213_ADataSet ds = null;
		HD_YADJM_2014_1213_ADM dm = new HD_YADJM_2014_1213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_2014_1213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014년 연말정산 기부금 READY부분
	public void hd_yadjm_2014_1214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2014_1214_LDataSet ds = null;
		HD_YADJM_2014_1214_LDM dm = new HD_YADJM_2014_1214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2014_1214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//복지기금개인연금 조회
	public void hd_yadjm_2014_1234_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1234_LDataSet ds = null;
		HD_YADJM_2013_1234_LDM dm = new HD_YADJM_2013_1234_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2013_1234_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014연말정산파일다운로드-조회
	public void hd_yadjm_2014_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_7000_LDataSet ds = null;
		HD_YADJM_2013_7000_LDM dm = new HD_YADJM_2013_7000_LDM();
	   
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.doc_type = Util.checkString(req.getParameter("doc_type"));
		dm.form_cd = Util.checkString(req.getParameter("form_cd"));
	    
		dm.print(); 
 
		ds = (HD_YADJM_2013_7000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2014연말정산파일업로드
	public void hd_yadjm_147001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_YADJM_147001_ADataSet ds = null;
		HD_YADJM_147001_ADM dm = new HD_YADJM_147001_ADM();
		
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원
		
		
		//dm.print();
		System.out.println("$$$ 2014 연말정산 hd_yadjm_147001_a WB 시작!! $$$");
		
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	//String add_file_no1 =  Util.checkString(req.getParameter("add_file_no1"));
    	ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
    	System.out.println("$$$ hd_yadjm_147001_a WB 의 flag===>"+flag);
    	System.out.println("$$$ hd_yadjm_147001_a WB 의 attcFiles===>"+attcFiles);
    	
//      삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag)){
        	if(attcFiles != null){
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
//			            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
//			            	dm.setAdd_file_no1(add_file_no1);
//			            }
		        	}
		        }    
        	}
        }
		
        if ("".equals(flag) && !"it0022".equals(dm.incmg_pers)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "해당 사용자는 본화면에서 업로드 할 수 없습니다. [ERP]에서 업로드하세요. ");
        }
        if ("204".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "비밀번호가 틀립니다. 다시 입력해주세요 .");
        }
       /* if ("101".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 진본성 ");
            throw new AppException("진본성 검증 초기화에 문제가 있습니다.");
        }
        */
        String multiUpdateData = Util.checkString(req.getParameter("xml"));
        System.out.println("$$$ hd_yadjm_147001_a WB 의 multiUpdateData===>"+multiUpdateData);
        
		if ("I".equals(flag)){
			 System.out.println("multiUpdateData 값은? ==> " + multiUpdateData);
			String[] converted      = convertMultiUpdateData(multiUpdateData);
			System.out.println(" converted 갯수는===>   :  " + converted.length );
			String doc_type	= converted[0];
			String seq 	 	= converted[1];
			String att_year	= converted[2];
			String form_cd 	= converted[3];	
			String resid 	= converted[4];
			String name 	= converted[5];			
			String pre_tot_amt 	= converted[6]; //2014년 추가
			String pre_market_tot_amt 	= converted[7]; //2014년 추가
			String pre_tmoney_tot_amt 	= converted[8]; //2014년 추가
			String dat_cd 	= converted[9];
			String busnid	= converted[10];
			String trade_nm = converted[11];
			String acc_no 	= converted[12];
			String edu_tp 	= converted[13]; //2014년 추가
			String use_place_cd	= converted[14];
			String donation_cd = converted[15];
			String first_tot_amt = converted[16]; //2014년 추가
			String second_tot_amt = converted[17]; //2014년 추가
			String secu_no = converted[18]; //2014년 추가
			String course_cd = converted[19];  
			String subject_nm = converted[20];
			String start_dt = converted[21];     
			String end_dt = converted[22];     
			String com_cd = converted[23];     
			String pension_cd = converted[24]; 
			String goods_nm = converted[25];  
			String lend_dt = converted[26];      
			String lend_kd = converted[27];      
			String house_take_dt = converted[28];
			String mort_setup_dt = converted[29];
			String repay_years = converted[30];            
			String lend_goods_nm = converted[31];
			String debt = converted[32];      
			String fixed_rate_debt = converted[33];
			String not_defer_debt = converted[34];
			String this_year_rede_amt = converted[35];
			String saving_gubn = converted[36];
			String reg_dt = converted[37];       
			String pay_method = converted[38];           
			String insu1_resid = converted[39]; 
			String insu1_nm = converted[40];   
			String insu2_resid1 = converted[41];
			String insu2_nm1 = converted[42];  
	        String insu2_resid2 = converted[43];
			String insu2_nm2 = converted[44];
			String insu2_resid3 = converted[45];          
			String insu2_nm3 = converted[46];
			String amt = converted[47];
			String sum = converted[48];
			String mm = converted[49];
			String dd = converted[50];
			String fix_cd = converted[51];
			String date = converted[52];
			String annual = converted[53];
			String sum_y1 = converted[54];
			String sum_y2 = converted[55];
			String sum_y3 = converted[56];
			String ann_tot_amt = converted[57];
			String tax_year_amt = converted[58];
			String ddct_bs_ass_amt = converted[59];
			String fund_nm = converted[60]; //2014년 추가
			String ddct = converted[61];		
			
			
			System.out.println(" converted 값을 DM에 set 하기 시작한다");
			dm.setDoc_type(doc_type);
			dm.setSeq(seq);
			dm.setAtt_year(att_year);
			dm.setForm_cd(form_cd);
			dm.setResid(resid);
			dm.setName(name);
			dm.setDat_cd(dat_cd);
			dm.setBusnid(busnid);
			dm.setTrade_nm(trade_nm);
			dm.setAcc_no(acc_no);
			dm.setUse_place_cd(use_place_cd);
			dm.setDonation_cd(donation_cd);
			dm.setCourse_cd(course_cd);
			dm.setSubject_nm(subject_nm);
			dm.setStart_dt(start_dt);
			dm.setEnd_dt(end_dt);
			dm.setCom_cd(com_cd);
			dm.setPension_cd(pension_cd);
			dm.setGoods_nm(goods_nm);
			dm.setLend_dt(lend_dt);
			dm.setLend_kd(lend_kd);
			dm.setHouse_take_dt(house_take_dt);
			dm.setMort_setup_dt(mort_setup_dt);
			dm.setRepay_years(repay_years);
			dm.setLend_goods_nm(lend_goods_nm);
			dm.setDebt(debt);
			dm.setFixed_rate_debt(fixed_rate_debt);
			dm.setNot_defer_debt(not_defer_debt);
			dm.setThis_year_rede_amt(this_year_rede_amt);
			dm.setSaving_gubn(saving_gubn);
			dm.setReg_dt(reg_dt);
			dm.setPay_method(pay_method);
			dm.setInsu1_resid(insu1_resid);
			dm.setInsu1_nm(insu1_nm);
			dm.setInsu2_resid1(insu2_resid1);
			dm.setInsu2_nm1(insu2_nm1);
			dm.setInsu2_resid2(insu2_resid2);
			dm.setInsu2_nm2(insu2_nm2);
			dm.setInsu2_resid3(insu2_resid3);
			dm.setInsu2_nm3(insu2_nm3);
			dm.setAmt(amt);
			dm.setSum(sum);
			dm.setMm(mm);
			dm.setDd(dd);
			dm.setFix_cd(fix_cd);
			dm.setDate(date);
			dm.setAnnual(annual);
			dm.setSum_y1(sum_y1);
			dm.setSum_y2(sum_y2);
			dm.setSum_y3(sum_y3);
			dm.setDdct(ddct);
			dm.setAnn_tot_amt(ann_tot_amt);
			dm.setTax_year_amt(tax_year_amt);
			dm.setDdct_bs_ass_amt(ddct_bs_ass_amt);
			dm.setPre_tot_amt(pre_tot_amt);
			dm.setPre_market_tot_amt(pre_market_tot_amt);
			dm.setPre_tmoney_tot_amt(pre_tmoney_tot_amt);
			dm.setEdu_tp(edu_tp);
			dm.setFirst_tot_amt(first_tot_amt);
			dm.setSecond_tot_amt(second_tot_amt);
			dm.setSecu_no(secu_no);
			dm.setFund_nm(fund_nm);
		}
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		//dm.add_file_no1	= Util.checkString(req.getParameter("add_file_no1"));
		dm.flag = Util.checkString(req.getParameter("flag"));
    	
		dm.print();

        try {
        	HD_YADJM_1000DAO dao = new HD_YADJM_1000DAO();
        	System.out.println("=== 2014연말정산 DAO 호출 시작 ====");
            ds = dao.hd_yadjm_147001_a(dm);
            System.out.println("=== 2014연말정산 DAO 호출 종료 ====");
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
        /*
		ds = (HD_YADJM_147001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
		
		req.setAttribute("ds", ds);
	}
	
	/*****************************************************
	 * 2015 연말정산 WB 생성작업 시작
	 * 작업시작일 : 2015.11.30
	 * 작업자 : 최호정
	 * ****************************************************/	
	//2015년 연말정산자료등록 임시저장 , 저장시에 동시에 호출됨
	public void hd_yadjm_2015_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1210_ADataSet ds = null;  //오토젠 돌려야함
		HD_YADJM_2015_1210_ADM dm = new HD_YADJM_2015_1210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.one_paren_dduc_yn = (String)hash.get("one_paren_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.obcl_pers_clsf = (String)hash.get("obcl_pers_clsf");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.trad_mrkt_onta = (String)hash.get("trad_mrkt_onta");
		dm.trad_mrkt_etc = (String)hash.get("trad_mrkt_etc");	
		dm.public_trans_amt_onta = (String)hash.get("public_trans_amt_onta");
		dm.public_trans_amt_etc = (String)hash.get("public_trans_amt_etc");
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.ltrm_invsm_stock_amt = Util.checkString(req.getParameter("ltrm_invsm_stock_amt"));
		
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));	
		dm.smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
		dm.larg_sum_no_lease_house = Util.checkString(req.getParameter("larg_sum_no_lease_house"));
		
	    dm.debit_card_1st_amt_onta  = (String)hash.get("debit_card_1st_amt_onta");
		dm.debit_card_2nd_amt_onta  = (String)hash.get("debit_card_2nd_amt_onta");
		dm.debit_card_1st_amt_etc   = (String)hash.get("debit_card_1st_amt_etc");
		dm.debit_card_2nd_amt_etc   = (String)hash.get("debit_card_2nd_amt_etc");
		dm.cash_rcpt_1st_onta       = (String)hash.get("cash_rcpt_1st_onta");
		dm.cash_rcpt_2nd_onta       = (String)hash.get("cash_rcpt_2nd_onta");
		dm.trad_all_1st_amt_onta    = (String)hash.get("trad_all_1st_amt_onta");
		dm.trad_all_2nd_amt_onta    = (String)hash.get("trad_all_2nd_amt_onta");
		dm.trad_all_1st_amt_etc     = (String)hash.get("trad_all_1st_amt_etc");
		dm.trad_all_2nd_amt_etc     = (String)hash.get("trad_all_2nd_amt_etc");
		dm.trans_all_1st_amt_onta   = (String)hash.get("trans_all_1st_amt_onta");
		dm.trans_all_2nd_amt_onta   = (String)hash.get("trans_all_2nd_amt_onta");
		dm.trans_all_1st_amt_etc    = (String)hash.get("trans_all_1st_amt_etc");
		dm.trans_all_2nd_amt_etc    = (String)hash.get("trans_all_2nd_amt_etc");
		dm.crdt_card_incd_pre_onta  = (String)hash.get("crdt_card_incd_pre_onta");
		dm.crdt_card_incd_pre_etc   = (String)hash.get("crdt_card_incd_pre_etc");
		dm.debit_card_incd_pre_onta = (String)hash.get("debit_card_incd_pre_onta");
		dm.debit_card_incd_pre_etc  = (String)hash.get("debit_card_incd_pre_etc");
		dm.cash_rcpt_incd_pre_onta  = (String)hash.get("cash_rcpt_incd_pre_onta");
		dm.trad_pre_amt_onta  		= (String)hash.get("trad_pre_amt_onta");
		dm.trad_pre_amt_etc  		= (String)hash.get("trad_pre_amt_etc");
		dm.trans_pre_amt_onta  		= (String)hash.get("trans_pre_amt_onta");
		dm.trans_pre_amt_etc  		= (String)hash.get("trans_pre_amt_etc");
		dm.ftyr_crdt_card_onta 		= (String)hash.get("ftyr_crdt_card_onta"); //여기부터 2015년 연말정산 항목 추가 
	    dm.ftyr_crdt_card_etc  		= (String)hash.get("ftyr_crdt_card_etc");
	    dm.ftyr_debit_card_onta     = (String)hash.get("ftyr_debit_card_onta"); 
	    dm.ftyr_debit_card_etc 		= (String)hash.get("ftyr_debit_card_etc");
	    dm.ftyr_cash_rcpt_onta 		= (String)hash.get("ftyr_cash_rcpt_onta");
	    dm.ftyr_trad_amt_onta 		= (String)hash.get("ftyr_trad_amt_onta");
	    dm.ftyr_trad_amt_etc 		= (String)hash.get("ftyr_trad_amt_etc");
	    dm.ftyr_trans_amt_onta 		= (String)hash.get("ftyr_trans_amt_onta");
	    dm.ftyr_trans_amt_etc 		= (String)hash.get("ftyr_trans_amt_etc");
		
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		
		ds = (HD_YADJM_2015_1210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015 년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
	public void hd_yadjm_2015_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2015_1220_LDataSet ds = null;
		HD_YADJM_2015_1220_LDM dm = new HD_YADJM_2015_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2015_1220_LDataSet)manager.executeCall(dm);
		
		
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2015연말정산파일업로드
	public void hd_yadjm_157001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_YADJM_157001_ADataSet ds = null;  //오토젠 완료
		HD_YADJM_157001_ADM dm = new HD_YADJM_157001_ADM();		
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원		
		
		//dm.print();
		System.out.println("$$$ 2015 연말정산 hd_yadjm_157001_a WB 시작!! $$$");
		
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	//String add_file_no1 =  Util.checkString(req.getParameter("add_file_no1"));
    	ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
    	System.out.println("$$$ hd_yadjm_157001_a WB 의 flag===>"+flag);
    	System.out.println("$$$ hd_yadjm_157001_a WB 의 attcFiles===>"+attcFiles);
    	
    	//삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag)){
        	System.out.println("$$$ flag 가 D가 아니면 탄다. $$$");
        	if(attcFiles != null){
        		System.out.println("$$$ 첨부파일을 setAdd 한다 $$$");
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
//				            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
//				            	dm.setAdd_file_no1(add_file_no1);
//				            }
		        	}
		        }    
        	}
        }
		
        /*if ("".equals(flag) && !"it0022".equals(dm.incmg_pers)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "해당 사용자는 본화면에서 업로드 할 수 없습니다. [ERP]에서 업로드하세요. ");
        }
        if ("F101".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 진본성 ");
            throw new AppException("진본성 검증 초기화에 문제가 있습니다.");
        }
        if ("F102".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 표준문서 검증오류 ");
            throw new AppException("연말정산간소화 표준 전자문서가 아닙니다.");
        }
        if ("F103".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 비밀번호오류");
            throw new AppException("PDF 문서의 비밀번호가 틀립니다. 다시 확인하세요.");
        }
        if ("F104".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: PDF 문서오류");
            throw new AppException("PDF문서가 아니거나 손상된 문서입니다. PDF 문서를 편집/수정하지 말고 홈택스의 조회한 항목 한번에 PDF 다운로드한 파일을 업로드 하시기 바랍니다.");
        }
        if ("F105".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 기타오류");
            throw new AppException("국세청 PDF 데이터 추출에 실패하였습니다.");
        }*/
        
        String multiUpdateData = Util.checkString(req.getParameter("xml"));
        System.out.println("$$$ hd_yadjm_157001_a WB 의 multiUpdateData===>"+multiUpdateData);
        
		if ("I".equals(flag)){
			System.out.println("multiUpdateData 값은? ==> " + multiUpdateData);
			String[] converted      = convertYadjmMultiUpdateData(multiUpdateData); //convertYadjmMultiUpdateData 로 호출바꿔야함
			System.out.println(" converted 갯수는===>   :  " + converted.length );
			String doc_type	= converted[0];		//문서종류
			String seq 	 	= converted[1];			//일련번호 					
			String att_year	= converted[2];		//귀속년도			
			String att_frmmm	= converted[3];		//조회기간시작월_2015년추가
			String att_tomm	= converted[4];		//조회기간종료월_2015년추가
			String att_inqrmm	= converted[5];		//조회월_2015년추가
			String form_cd 	= converted[6];		//서식코드
			String resid 	= converted[7];			//인별_주민등록번호
			String name 	= converted[8];			//인별_성명
			String pre_tot_amt 	= converted[9]; 	//직전년_일반공제대상금액합계_2014년 추가
			String pre_market_tot_amt 	= converted[10];	//직전년_전통시장공제대상금액합계_2014년 추가
			String pre_tmoney_tot_amt 	= converted[11];	//직전년_대중교통공제대상금액합계_2014년 추가
			String ftyr_tot_amt 	= converted[12];	//전전년도_일반공제대상금액합계_2015년추가
			String ftyr_market_tot_amt 	= converted[13];	//전전년도_전통시장공제대상금액합계_2015년추가
			String ftyr_tmoney_tot_amt 	= converted[14];	//전전년도_대중교통공제대상금액합계_2015년추가
			String dat_cd 	= converted[15];			//자료코드
			String busnid	= converted[16];			//사업자번호
			String trade_nm = converted[17];		//상호
			String acc_no 	= converted[18];			//계좌번호
			String edu_tp 	= converted[19]; 		//교육비종류_2014년 추가
			String use_place_cd	= converted[20];	//종류
			String donation_cd = converted[21];	//기부유형
			String first_tot_amt = converted[22]; //상반기_대상금액합계_2014년 추가
			String second_tot_amt = converted[23]; //하반기_대상금액합계_2014년 추가
			String secu_no = converted[24]; 		//계좌번호_2014년 추가			
			String first_year_tot_amt = converted[25]; 		//귀속년도_상반기_대상금액합계_2015년추가
			String second_year_tot_amt = converted[26]; 		//귀속년도_하반기_대상금액합계_2015년추가
			String inqr_strt_mm = converted[27]; 		//조회기간 시작월_2015년추가
			String inqr_end_mm = converted[28]; 		//조회기간 종료월_2015년추가			
			String course_cd = converted[29]; 		//과정코드
			String subject_nm = converted[30];	//과정명
			String start_dt = converted[31];     	//계약시작일
			String end_dt = converted[32];     		//계약종료일
			String com_cd = converted[33];     	//금융회사등코드
			String pension_cd = converted[34]; 	//계좌유형
			String goods_nm = converted[35];  	//상품명
			String lend_dt = converted[36];      	//대출일
			String lend_kd = converted[37];      	//대출종류
			String house_take_dt = converted[38]; 	//주택취득일
			String mort_setup_dt = converted[39];	//저당권설정일
			String repay_years = converted[40];   	//상환기간연수
			String lend_goods_nm = converted[41];	//상품명
			String debt = converted[42];      			//차입금
			String fixed_rate_debt = converted[43];	//고정금리차입금
			String not_defer_debt = converted[44];	//비거치식상환차입금
			String this_year_rede_amt = converted[45];	//당해년원금상환액
			String saving_gubn = converted[46];	//저축구분
			String reg_dt = converted[47];       	//가입일자
			String pay_method = converted[48];	//납입방법
			String insu1_resid = converted[49]; 	//주민등록번호_주피보험자
			String insu1_nm = converted[50];   	//성명_주피보험자
			String insu2_resid1 = converted[51];	//주민등록번호_종피보험자_1
			String insu2_nm1 = converted[52];  	//성명_종피보험자_1
	        String insu2_resid2 = converted[53];	//주민등록번호_종피보험자_2
			String insu2_nm2 = converted[54];		//성명_종피보험자_2
			String insu2_resid3 = converted[55];	//주민등록번호_종피보험자_3          
			String insu2_nm3 = converted[56];		//성명_종피보험자_3
			String amt = converted[57];				//납입금액
			String sum = converted[58];				//납입금액계
			String mm = converted[59];				//납입월
			String dd = converted[60];				//날짜
			String fix_cd = converted[61];			//확정구분코드
			String date = converted[62];				//납입일자
			String annual = converted[63];
			String sum_y1 = converted[64];
			String sum_y2 = converted[65];
			String sum_y3 = converted[66];
			String ann_tot_amt = converted[67];	//당해연도납입금액
			String tax_year_amt = converted[68];	//당해연도인출금액
			String ddct_bs_ass_amt = converted[69];	//순납입금액
			String fund_nm = converted[70]; 			//펀드명_2014년 추가			
			String lend_loan_amt = converted[71]; 	//대출원금_2015년추가			
			String ddct = converted[72];					//소득공제대상액	
						
			System.out.println(" converted 값을 DM에 set 하기 시작한다");
			dm.setDoc_type(doc_type);
			dm.setSeq(seq);
			dm.setAtt_year(att_year);			
			dm.setAtt_frmmm(att_frmmm); //2015년 추가
			dm.setAtt_tomm(att_tomm);	  //2015년 추가
			dm.setAtt_inqrmm(att_inqrmm); //2015년 추가
			dm.setForm_cd(form_cd);
			dm.setResid(resid);
			dm.setName(name);
			dm.setPre_tot_amt(pre_tot_amt);
			dm.setPre_market_tot_amt(pre_market_tot_amt);
			dm.setPre_tmoney_tot_amt(pre_tmoney_tot_amt);			
			dm.setFtyr_tot_amt(ftyr_tot_amt);  //2015년 추가
			dm.setFtyr_market_tot_amt(ftyr_market_tot_amt); //2015년 추가
			dm.setFtyr_tmoney_tot_amt(ftyr_tmoney_tot_amt); //2015년 추가			
			dm.setDat_cd(dat_cd);
			dm.setBusnid(busnid);
			dm.setTrade_nm(trade_nm);
			dm.setAcc_no(acc_no);
			dm.setEdu_tp(edu_tp);
			dm.setUse_place_cd(use_place_cd);
			dm.setDonation_cd(donation_cd);
			dm.setFirst_tot_amt(first_tot_amt);
			dm.setSecond_tot_amt(second_tot_amt);
			dm.setSecu_no(secu_no);			
			dm.setFirst_year_tot_amt(first_year_tot_amt); //2015년 추가
			dm.setSecond_year_tot_amt(second_year_tot_amt); //2015년 추가
			dm.setInqr_strt_mm(inqr_strt_mm); //2015년 추가
			dm.setInqr_end_mm(inqr_end_mm); //2015년 추가			
			dm.setCourse_cd(course_cd);
			dm.setSubject_nm(subject_nm);
			dm.setStart_dt(start_dt);
			dm.setEnd_dt(end_dt);
			dm.setCom_cd(com_cd);
			dm.setPension_cd(pension_cd);
			dm.setGoods_nm(goods_nm);
			dm.setLend_dt(lend_dt);
			dm.setLend_kd(lend_kd);
			dm.setHouse_take_dt(house_take_dt);
			dm.setMort_setup_dt(mort_setup_dt);
			dm.setRepay_years(repay_years);
			dm.setLend_goods_nm(lend_goods_nm);
			dm.setDebt(debt);
			dm.setFixed_rate_debt(fixed_rate_debt);
			dm.setNot_defer_debt(not_defer_debt);
			dm.setThis_year_rede_amt(this_year_rede_amt);
			dm.setSaving_gubn(saving_gubn);
			dm.setReg_dt(reg_dt);
			dm.setPay_method(pay_method);
			dm.setInsu1_resid(insu1_resid);
			dm.setInsu1_nm(insu1_nm);
			dm.setInsu2_resid1(insu2_resid1);
			dm.setInsu2_nm1(insu2_nm1);
			dm.setInsu2_resid2(insu2_resid2);
			dm.setInsu2_nm2(insu2_nm2);
			dm.setInsu2_resid3(insu2_resid3);
			dm.setInsu2_nm3(insu2_nm3);
			dm.setAmt(amt);
			dm.setSum(sum);
			dm.setMm(mm);
			dm.setDd(dd);
			dm.setFix_cd(fix_cd);
			dm.setDate(date);
			dm.setAnnual(annual);
			dm.setSum_y1(sum_y1);
			dm.setSum_y2(sum_y2);
			dm.setSum_y3(sum_y3);			
			dm.setAnn_tot_amt(ann_tot_amt);
			dm.setTax_year_amt(tax_year_amt);
			dm.setDdct_bs_ass_amt(ddct_bs_ass_amt);
			dm.setFund_nm(fund_nm);
			dm.setLend_loan_amt(lend_loan_amt); //2015년 추가
			dm.setDdct(ddct);
			
		}
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		//dm.add_file_no1	= Util.checkString(req.getParameter("add_file_no1"));
		dm.flag = Util.checkString(req.getParameter("flag"));
    	
		dm.print();

        try {
        	HD_YADJM_1000DAO dao = new HD_YADJM_1000DAO();
        	System.out.println("=== 2015연말정산 DAO 호출 시작 ====");
            ds = dao.hd_yadjm_157001_a(dm);
            System.out.println("=== 2015연말정산 DAO 호출 종료 ====");
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
	public void hd_yadjm_2015_1221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1221_LDataSet ds = null; //오토젠돌려야함
		HD_YADJM_2015_1221_LDM dm = new HD_YADJM_2015_1221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2015_1221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-연금팝업창_저장/삭제버튼
	public void hd_yadjm_2015_1232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1232_ADataSet ds = null;  //오토젠해야함
		HD_YADJM_2015_1232_ADM dm = new HD_YADJM_2015_1232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_2015_1232_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 본인공제입력 연금팝업창-연금저축 조회
	public void hd_yadjm_2015_1231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1231_LDataSet ds = null; //오토젠 필요
		HD_YADJM_2015_1231_LDM dm = new HD_YADJM_2015_1231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		try {
			 
			ds = (HD_YADJM_2015_1231_LDataSet)manager.executeCall(dm);
			
			 System.out.print("ddd");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
        	
        }
        catch (AppException e) {
            throw e;
        } 
	
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
	public void hd_yadjm_2015_1234_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1234_LDataSet ds = null; //오토젠필요
		HD_YADJM_2015_1234_LDM dm = new HD_YADJM_2015_1234_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2015_1234_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 의료비 팝업 저장버튼
	public void hd_yadjm_2015_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1212_ADataSet ds = null; //오토젠다시
		HD_YADJM_2015_1212_ADM dm = new HD_YADJM_2015_1212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));
		dm.subf_treat_yn     = ((String)hash.get("subf_treat_yn"));

		dm.print();

		ds = (HD_YADJM_2015_1212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 기부금팝업저장버튼
	public void hd_yadjm_2015_1213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1213_ADataSet ds = null; //오토젠필요
		HD_YADJM_2015_1213_ADM dm = new HD_YADJM_2015_1213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_2015_1213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 기부금 READY 조회 및 콤보구성
	public void hd_yadjm_2015_1214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL"); 
		HD_YADJM_2015_1214_LDataSet ds = null; //오토젠필요
		HD_YADJM_2015_1214_LDM dm = new HD_YADJM_2015_1214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2015_1214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-정산결과조회
	public void hd_yadjm_2015_1250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_1250_LDataSet ds = null; //오토젠필요
		HD_YADJM_2015_1250_LDM dm = new HD_YADJM_2015_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2015_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산-지급조서파일생성-파일생성
	public void hd_yadjm_2015_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_2000_ADataSet ds = null; //오토젠필요
		HD_YADJM_2015_2000_ADM dm = new HD_YADJM_2015_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2015_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	//	2015년 연말정산자료등록 -장기주택저당차입금 조회
	public void hd_yadjm_2015_5100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_5100_LDataSet ds = null; //오토젠필요
		HD_YADJM_2015_5100_LDM dm = new HD_YADJM_2015_5100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2015_5100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	//2015년 연말정산자료등록-연금팝업창_저장/삭제버튼
	public void hd_yadjm_2015_5101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2015_5101_ADataSet ds = null;  //오토젠해야함
		HD_YADJM_2015_5101_ADM dm = new HD_YADJM_2015_5101_ADM();
		
		//String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//System.out.println("multiUpdateData=" + multiUpdateData );
		//Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy 	= Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no 			= Util.checkString(req.getParameter("emp_no"));
		dm.flag				= Util.checkString(req.getParameter("flag"));
		dm.hous_loan_amt_int  	= Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.hous_loan_amt_int_1  = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 	 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2  = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		dm.hous_loan_amt_int_15_15y_fn  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y_fn"));
		dm.hous_loan_amt_int_15_15y  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y"));
		dm.hous_loan_amt_int_15_15y_e  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y_etc"));
		dm.hous_loan_amt_int_15_10y  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_10y"));
		dm.ltrm_hous_mogg_loan_amt_int  = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		//dm.mode = ((String) hash.get("m")).toUpperCase();
		

		dm.print();
	    
		ds = (HD_YADJM_2015_5101_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}
	
	/*****************************************************
	 * 2016 연말정산 WB 생성작업 시작
	 * 작업시작일 : 2016.11.30
	 * 작업자 : 이가연 
	 * ****************************************************/	
	//2016년 연말정산자료등록 임시저장 , 저장시에 동시에 호출됨
	public void hd_yadjm_2016_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1210_ADataSet ds = null;  //오토젠 돌려야함
		HD_YADJM_2016_1210_ADM dm = new HD_YADJM_2016_1210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.one_paren_dduc_yn = (String)hash.get("one_paren_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.obcl_pers_clsf = (String)hash.get("obcl_pers_clsf");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.trad_mrkt_onta = (String)hash.get("trad_mrkt_onta");
		dm.trad_mrkt_etc = (String)hash.get("trad_mrkt_etc");	
		dm.public_trans_amt_onta = (String)hash.get("public_trans_amt_onta");
		dm.public_trans_amt_etc = (String)hash.get("public_trans_amt_etc");
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.ltrm_invsm_stock_amt = Util.checkString(req.getParameter("ltrm_invsm_stock_amt"));
		
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));	
		dm.smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
		dm.larg_sum_no_lease_house = Util.checkString(req.getParameter("larg_sum_no_lease_house"));
		
	    dm.debit_card_1st_amt_onta  = (String)hash.get("debit_card_1st_amt_onta");
		dm.debit_card_2nd_amt_onta  = (String)hash.get("debit_card_2nd_amt_onta");
		dm.debit_card_1st_amt_etc   = (String)hash.get("debit_card_1st_amt_etc");
		dm.debit_card_2nd_amt_etc   = (String)hash.get("debit_card_2nd_amt_etc");
		dm.cash_rcpt_1st_onta       = (String)hash.get("cash_rcpt_1st_onta");
		dm.cash_rcpt_2nd_onta       = (String)hash.get("cash_rcpt_2nd_onta");
		dm.trad_all_1st_amt_onta    = (String)hash.get("trad_all_1st_amt_onta");
		dm.trad_all_2nd_amt_onta    = (String)hash.get("trad_all_2nd_amt_onta");
		dm.trad_all_1st_amt_etc     = (String)hash.get("trad_all_1st_amt_etc");
		dm.trad_all_2nd_amt_etc     = (String)hash.get("trad_all_2nd_amt_etc");
		dm.trans_all_1st_amt_onta   = (String)hash.get("trans_all_1st_amt_onta");
		dm.trans_all_2nd_amt_onta   = (String)hash.get("trans_all_2nd_amt_onta");
		dm.trans_all_1st_amt_etc    = (String)hash.get("trans_all_1st_amt_etc");
		dm.trans_all_2nd_amt_etc    = (String)hash.get("trans_all_2nd_amt_etc");
		dm.crdt_card_incd_pre_onta  = (String)hash.get("crdt_card_incd_pre_onta");
		dm.crdt_card_incd_pre_etc   = (String)hash.get("crdt_card_incd_pre_etc");
		dm.debit_card_incd_pre_onta = (String)hash.get("debit_card_incd_pre_onta");
		dm.debit_card_incd_pre_etc  = (String)hash.get("debit_card_incd_pre_etc");
		dm.cash_rcpt_incd_pre_onta  = (String)hash.get("cash_rcpt_incd_pre_onta");
		dm.trad_pre_amt_onta  		= (String)hash.get("trad_pre_amt_onta");
		dm.trad_pre_amt_etc  		= (String)hash.get("trad_pre_amt_etc");
		dm.trans_pre_amt_onta  		= (String)hash.get("trans_pre_amt_onta");
		dm.trans_pre_amt_etc  		= (String)hash.get("trans_pre_amt_etc");
		dm.ftyr_crdt_card_onta 		= (String)hash.get("ftyr_crdt_card_onta"); //여기부터 2015년 연말정산 항목 추가 
	    dm.ftyr_crdt_card_etc  		= (String)hash.get("ftyr_crdt_card_etc");
	    dm.ftyr_debit_card_onta     = (String)hash.get("ftyr_debit_card_onta"); 
	    dm.ftyr_debit_card_etc 		= (String)hash.get("ftyr_debit_card_etc");
	    dm.ftyr_cash_rcpt_onta 		= (String)hash.get("ftyr_cash_rcpt_onta");
	    dm.ftyr_trad_amt_onta 		= (String)hash.get("ftyr_trad_amt_onta");
	    dm.ftyr_trad_amt_etc 		= (String)hash.get("ftyr_trad_amt_etc");
	    dm.ftyr_trans_amt_onta 		= (String)hash.get("ftyr_trans_amt_onta");
	    dm.ftyr_trans_amt_etc 		= (String)hash.get("ftyr_trans_amt_etc");
		
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		
		ds = (HD_YADJM_2016_1210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
	public void hd_yadjm_2016_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2016_1220_LDataSet ds = null;
		HD_YADJM_2016_1220_LDM dm = new HD_YADJM_2016_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2016_1220_LDataSet)manager.executeCall(dm);
		
		
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2016연말정산파일업로드
	public void hd_yadjm_167001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_YADJM_167001_ADataSet ds = null;  //오토젠 완료
		HD_YADJM_167001_ADM dm = new HD_YADJM_167001_ADM();		
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원		
		
		//dm.print();
		System.out.println("$$$ 2016 연말정산 hd_yadjm_167001_a WB 시작!! $$$");
		
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	//String add_file_no1 =  Util.checkString(req.getParameter("add_file_no1"));
    	ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
    	System.out.println("$$$ hd_yadjm_167001_a WB 의 flag===>"+flag);
    	System.out.println("$$$ hd_yadjm_167001_a WB 의 attcFiles===>"+attcFiles);
    	
    	//삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag)){
        	System.out.println("$$$ flag 가 D가 아니면 탄다. $$$");
        	if(attcFiles != null){
        		System.out.println("$$$ 첨부파일을 setAdd 한다 $$$");
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
//				            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
//				            	dm.setAdd_file_no1(add_file_no1);
//				            }
		        	}
		        }    
        	}
        }
		
        /*if ("".equals(flag) && !"it0022".equals(dm.incmg_pers)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "해당 사용자는 본화면에서 업로드 할 수 없습니다. [ERP]에서 업로드하세요. ");
        }
        if ("F101".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 진본성 ");
            throw new AppException("진본성 검증 초기화에 문제가 있습니다.");
        }
        if ("F102".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 표준문서 검증오류 ");
            throw new AppException("연말정산간소화 표준 전자문서가 아닙니다.");
        }
        if ("F103".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 비밀번호오류");
            throw new AppException("PDF 문서의 비밀번호가 틀립니다. 다시 확인하세요.");
        }
        if ("F104".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: PDF 문서오류");
            throw new AppException("PDF문서가 아니거나 손상된 문서입니다. PDF 문서를 편집/수정하지 말고 홈택스의 조회한 항목 한번에 PDF 다운로드한 파일을 업로드 하시기 바랍니다.");
        }
        if ("F105".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 기타오류");
            throw new AppException("국세청 PDF 데이터 추출에 실패하였습니다.");
        }*/
        
        String multiUpdateData = Util.checkString(req.getParameter("xml"));
        System.out.println("$$$ hd_yadjm_167001_a WB 의 multiUpdateData===>"+multiUpdateData);
		if ("I".equals(flag)){
			System.out.println("multiUpdateData 값은? ==> " + multiUpdateData);
			String[] converted      = convertYadjmMultiUpdateData(multiUpdateData); //convertYadjmMultiUpdateData 로 호출바꿔야함
			System.out.println(" converted 갯수는===>   :  " + converted.length );
			String doc_type	= converted[0];		//문서종류
			String seq 	 	= converted[1];			//일련번호 					
			String att_year	= converted[2];		//귀속년도			
			String att_frmmm	= converted[3];		//조회기간시작월_2015년추가
			String att_tomm	= converted[4];		//조회기간종료월_2015년추가
			String att_inqrmm	= converted[5];		//조회월_2015년추가
			String form_cd 	= converted[6];		//서식코드
			String resid 	= converted[7];			//인별_주민등록번호
			String name 	= converted[8];			//인별_성명
			String pre_tot_amt 	= converted[9]; 	//직전년_일반공제대상금액합계_2014년 추가
			String pre_market_tot_amt 	= converted[10];	//직전년_전통시장공제대상금액합계_2014년 추가
			String pre_tmoney_tot_amt 	= converted[11];	//직전년_대중교통공제대상금액합계_2014년 추가
			String ftyr_tot_amt 	= converted[12];	//전전년도_일반공제대상금액합계_2015년추가
			String ftyr_market_tot_amt 	= converted[13];	//전전년도_전통시장공제대상금액합계_2015년추가
			String ftyr_tmoney_tot_amt 	= converted[14];	//전전년도_대중교통공제대상금액합계_2015년추가
			String dat_cd 	= converted[15];			//자료코드
			String busnid	= converted[16];			//사업자번호
			String trade_nm = converted[17];		//상호
			String acc_no 	= converted[18];			//계좌번호
			String edu_tp 	= converted[19]; 		//교육비종류_2014년 추가
			String use_place_cd	= converted[20];	//종류
			String donation_cd = converted[21];	//기부유형
			String first_tot_amt = converted[22]; //상반기_대상금액합계_2014년 추가
			String second_tot_amt = converted[23]; //하반기_대상금액합계_2014년 추가
			String secu_no = converted[24]; 		//계좌번호_2014년 추가			
			String first_year_tot_amt = converted[25]; 		//귀속년도_상반기_대상금액합계_2015년추가
			String second_year_tot_amt = converted[26]; 		//귀속년도_하반기_대상금액합계_2015년추가
			String inqr_strt_mm = converted[27]; 		//조회기간 시작월_2015년추가
			String inqr_end_mm = converted[28]; 		//조회기간 종료월_2015년추가			
			String course_cd = converted[29]; 		//과정코드
			String subject_nm = converted[30];	//과정명
			String start_dt = converted[31];     	//계약시작일
			String end_dt = converted[32];     		//계약종료일
			String com_cd = converted[33];     	//금융회사등코드
			String pension_cd = converted[34]; 	//계좌유형
			String goods_nm = converted[35];  	//상품명
			String lend_dt = converted[36];      	//대출일
			String lend_kd = converted[37];      	//대출종류
			String house_take_dt = converted[38]; 	//주택취득일
			String mort_setup_dt = converted[39];	//저당권설정일
			String repay_years = converted[40];   	//상환기간연수
			String lend_goods_nm = converted[41];	//상품명
			String debt = converted[42];      			//차입금
			String fixed_rate_debt = converted[43];	//고정금리차입금
			String not_defer_debt = converted[44];	//비거치식상환차입금
			String this_year_rede_amt = converted[45];	//당해년원금상환액
			String saving_gubn = converted[46];	//저축구분
			String reg_dt = converted[47];       	//가입일자
			String pay_method = converted[48];	//납입방법
			String insu1_resid = converted[49]; 	//주민등록번호_주피보험자
			String insu1_nm = converted[50];   	//성명_주피보험자
			String insu2_resid1 = converted[51];	//주민등록번호_종피보험자_1
			String insu2_nm1 = converted[52];  	//성명_종피보험자_1
	        String insu2_resid2 = converted[53];	//주민등록번호_종피보험자_2
			String insu2_nm2 = converted[54];		//성명_종피보험자_2
			String insu2_resid3 = converted[55];	//주민등록번호_종피보험자_3          
			String insu2_nm3 = converted[56];		//성명_종피보험자_3
			String amt = converted[57];				//납입금액
			String sum = converted[58];				//납입금액계
			String mm = converted[59];				//납입월
			String dd = converted[60];				//날짜
			String fix_cd = converted[61];			//확정구분코드
			String date = converted[62];				//납입일자
			String annual = converted[63];
			String sum_y1 = converted[64];
			String sum_y2 = converted[65];
			String sum_y3 = converted[66];
			String ann_tot_amt = converted[67];	//당해연도납입금액
			String tax_year_amt = converted[68];	//당해연도인출금액
			String ddct_bs_ass_amt = converted[69];	//순납입금액
			String fund_nm = converted[70]; 			//펀드명_2014년 추가			
			String lend_loan_amt = converted[71]; 	//대출원금_2015년추가	
			String sbdy_apln_sum = converted[72];					//기부장려금신청금액 2016년추가	
			String conb_sum = converted[73];					//기부금액합계	2016년추가
			String ddct = converted[74];					
			//String hi_yrs = converted[73];					//건강보험연말정산금액 2016년추가	
			//String ltrm_yrs = converted[74];				//장기요양연말정산금액	2016년추가
			//String hi_ntf = converted[73];					//건강보험(보수월액)고지금액합계	2016년추가
			//String ltrm_ntf = converted[74];				//장기요양(보수월액)고지금액합계	2016년추가
			//String hi_pmt = converted[75];					//건강보험(소득월액)납부금액합계	2016년추가
			//String ltrm_pmt = converted[76];				//장기요양(소득월액)납부금액합계	2016년추가
			//String spym = converted[79];					//추납보험료납부금액 2016년추가	
			//String jlc = converted[80];					//실업크레딧납부금액 2016년추가	
			//String ntf = converted[81];					//직장가입자 고지금액 합계 2016년추가	
			//String pmt = converted[82];					//지역가입자 등 납부금액 합계 2016년추가	
			//String wrkp_ntf = converted[73];					//직장가입자 고지금액 2016년추가	
			//String rgn_pmt = converted[74];					//지역가입자 등 납부금액	2016년추가
			//String apln = converted[85];					//일별기부장려금신청금액	 2016년추가
			
	
			
						
			System.out.println(" converted 값을 DM에 set 하기 시작한다");
			dm.setDoc_type(doc_type);
			dm.setSeq(seq);
			dm.setAtt_year(att_year);			
			dm.setAtt_frmmm(att_frmmm); //2015년 추가
			dm.setAtt_tomm(att_tomm);	  //2015년 추가
			dm.setAtt_inqrmm(att_inqrmm); //2015년 추가
			dm.setForm_cd(form_cd);
			dm.setResid(resid);
			dm.setName(name);
			dm.setPre_tot_amt(pre_tot_amt);
			dm.setPre_market_tot_amt(pre_market_tot_amt);
			dm.setPre_tmoney_tot_amt(pre_tmoney_tot_amt);			
			dm.setFtyr_tot_amt(ftyr_tot_amt);  //2015년 추가
			dm.setFtyr_market_tot_amt(ftyr_market_tot_amt); //2015년 추가
			dm.setFtyr_tmoney_tot_amt(ftyr_tmoney_tot_amt); //2015년 추가			
			dm.setDat_cd(dat_cd);
			dm.setBusnid(busnid);
			dm.setTrade_nm(trade_nm);
			dm.setAcc_no(acc_no);
			dm.setEdu_tp(edu_tp);
			dm.setUse_place_cd(use_place_cd);
			dm.setDonation_cd(donation_cd);
			dm.setFirst_tot_amt(first_tot_amt);
			dm.setSecond_tot_amt(second_tot_amt);
			dm.setSecu_no(secu_no);			
			dm.setFirst_year_tot_amt(first_year_tot_amt); //2015년 추가
			dm.setSecond_year_tot_amt(second_year_tot_amt); //2015년 추가
			dm.setInqr_strt_mm(inqr_strt_mm); //2015년 추가
			dm.setInqr_end_mm(inqr_end_mm); //2015년 추가			
			dm.setCourse_cd(course_cd);
			dm.setSubject_nm(subject_nm);
			dm.setStart_dt(start_dt);
			dm.setEnd_dt(end_dt);
			dm.setCom_cd(com_cd);
			dm.setPension_cd(pension_cd);
			dm.setGoods_nm(goods_nm);
			dm.setLend_dt(lend_dt);
			dm.setLend_kd(lend_kd);
			dm.setHouse_take_dt(house_take_dt);
			dm.setMort_setup_dt(mort_setup_dt);
			dm.setRepay_years(repay_years);
			dm.setLend_goods_nm(lend_goods_nm);
			dm.setDebt(debt);
			dm.setFixed_rate_debt(fixed_rate_debt);
			dm.setNot_defer_debt(not_defer_debt);
			dm.setThis_year_rede_amt(this_year_rede_amt);
			dm.setSaving_gubn(saving_gubn);
			dm.setReg_dt(reg_dt);
			dm.setPay_method(pay_method);
			dm.setInsu1_resid(insu1_resid);
			dm.setInsu1_nm(insu1_nm);
			dm.setInsu2_resid1(insu2_resid1);
			dm.setInsu2_nm1(insu2_nm1);
			dm.setInsu2_resid2(insu2_resid2);
			dm.setInsu2_nm2(insu2_nm2);
			dm.setInsu2_resid3(insu2_resid3);
			dm.setInsu2_nm3(insu2_nm3);
			dm.setAmt(amt);
			dm.setSum(sum);
			dm.setMm(mm);
			dm.setDd(dd);
			dm.setFix_cd(fix_cd);
			dm.setDate(date);
			dm.setAnnual(annual);
			dm.setSum_y1(sum_y1);
			dm.setSum_y2(sum_y2);
			dm.setSum_y3(sum_y3);			
			dm.setAnn_tot_amt(ann_tot_amt);
			dm.setTax_year_amt(tax_year_amt);
			dm.setDdct_bs_ass_amt(ddct_bs_ass_amt);
			dm.setFund_nm(fund_nm);
			dm.setLend_loan_amt(lend_loan_amt); //2015년 추가
			dm.setSbdy_apln_sum(sbdy_apln_sum);	//2016년 추가
			dm.setConb_sum(conb_sum);	//2016년 추가
			dm.setDdct(ddct);           
			//dm.setHi_yrs(hi_yrs); 		//2016년 추가
			//dm.setLtrm_yrs(ltrm_yrs);	//2016년 추가
			//dm.setHi_ntf(hi_ntf);		//2016년 추가
			//dm.setLtrm_ntf(ltrm_ntf);	//2016년 추가
			//dm.setHi_pmt(hi_pmt);		//2016년 추가
			//dm.setLtrm_pmt(ltrm_pmt);	//2016년 추가
			//dm.setSpym(spym);			//2016년 추가
			//dm.setJlc(jlc);				//2016년 추가
			//dm.setNtf(ntf);				//2016년 추가
			//dm.setPmt(pmt);				//2016년 추가
			//dm.setWrkp_ntf(wrkp_ntf);	//2016년 추가
			//dm.setRgn_pmt(rgn_pmt);		//2016년 추가
			//dm.setApln(apln);			//2016년 추가
			
			
		}
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		//dm.add_file_no1	= Util.checkString(req.getParameter("add_file_no1"));
		dm.flag = Util.checkString(req.getParameter("flag"));
    	
		dm.print();

        try {
        	HD_YADJM_1000DAO dao = new HD_YADJM_1000DAO();
        	System.out.println("=== 2016연말정산 DAO 호출 시작 ====");
            ds = dao.hd_yadjm_167001_a(dm);
            System.out.println("=== 2016연말정산 DAO 호출 종료 ====");
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
	public void hd_yadjm_2016_1221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1221_LDataSet ds = null; //오토젠돌려야함
		HD_YADJM_2016_1221_LDM dm = new HD_YADJM_2016_1221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2016_1221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-연금팝업창_저장/삭제버튼
	public void hd_yadjm_2016_1232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1232_ADataSet ds = null;  //오토젠해야함
		HD_YADJM_2016_1232_ADM dm = new HD_YADJM_2016_1232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_2016_1232_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 본인공제입력 연금팝업창-연금저축 조회
	public void hd_yadjm_2016_1231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1231_LDataSet ds = null; //오토젠 필요
		HD_YADJM_2016_1231_LDM dm = new HD_YADJM_2016_1231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		try {
			 
			ds = (HD_YADJM_2016_1231_LDataSet)manager.executeCall(dm);
			
			 System.out.print("ddd");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
        	
        }
        catch (AppException e) {
            throw e;
        } 
	
		req.setAttribute("ds", ds);
	}
	
	//2016년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
	public void hd_yadjm_2016_1234_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1234_LDataSet ds = null; //오토젠필요
		HD_YADJM_2016_1234_LDM dm = new HD_YADJM_2016_1234_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2016_1234_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2016년 연말정산 의료비 팝업 저장버튼
	public void hd_yadjm_2016_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1212_ADataSet ds = null; //오토젠다시
		HD_YADJM_2016_1212_ADM dm = new HD_YADJM_2016_1212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));
		dm.subf_treat_yn     = ((String)hash.get("subf_treat_yn"));

		dm.print();

		ds = (HD_YADJM_2016_1212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2016년 연말정산 기부금팝업저장버튼
	public void hd_yadjm_2016_1213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1213_ADataSet ds = null; //오토젠필요
		HD_YADJM_2016_1213_ADM dm = new HD_YADJM_2016_1213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_2016_1213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 기부금 READY 조회 및 콤보구성
	public void hd_yadjm_2016_1214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL"); 
		HD_YADJM_2016_1214_LDataSet ds = null; //오토젠필요
		HD_YADJM_2016_1214_LDM dm = new HD_YADJM_2016_1214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2016_1214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2016년 연말정산자료등록-정산결과조회
	public void hd_yadjm_2016_1250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_1250_LDataSet ds = null; //오토젠필요
		HD_YADJM_2016_1250_LDM dm = new HD_YADJM_2016_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2016_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2016년 연말정산-지급조서파일생성-파일생성
	public void hd_yadjm_2016_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_2000_ADataSet ds = null; //오토젠필요
		HD_YADJM_2016_2000_ADM dm = new HD_YADJM_2016_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2016_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	//	2016년 연말정산자료등록 -장기주택저당차입금 조회
	public void hd_yadjm_2016_5100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_5100_LDataSet ds = null; //오토젠필요
		HD_YADJM_2016_5100_LDM dm = new HD_YADJM_2016_5100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2016_5100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	//2016년 연말정산자료등록-연금팝업창_저장/삭제버튼
	public void hd_yadjm_2016_5101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2016_5101_ADataSet ds = null;  //오토젠해야함
		HD_YADJM_2016_5101_ADM dm = new HD_YADJM_2016_5101_ADM();
		
		//String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//System.out.println("multiUpdateData=" + multiUpdateData );
		//Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy 	= Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no 			= Util.checkString(req.getParameter("emp_no"));
		dm.flag				= Util.checkString(req.getParameter("flag"));
		dm.hous_loan_amt_int  	= Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.hous_loan_amt_int_1  = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 	 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2  = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		dm.hous_loan_amt_int_15_15y_fn  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y_fn"));
		dm.hous_loan_amt_int_15_15y  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y"));
		dm.hous_loan_amt_int_15_15y_e  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y_etc"));
		dm.hous_loan_amt_int_15_10y  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_10y"));
		dm.ltrm_hous_mogg_loan_amt_int  = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		//dm.mode = ((String) hash.get("m")).toUpperCase();
		

		dm.print();
	    
		ds = (HD_YADJM_2016_5101_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}
	
	
	
	//연말정산 권한 설정(통합화면 만들) 2017.12.12일 이가연 :기존에 각년도 마다 만들었던 것을 하나로 통합으로 쓸꺼임 
	public void hd_yadjm_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_6000_LDataSet ds = null;
		HD_YADJM_6000_LDM dm = new HD_YADJM_6000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));

		dm.print();

		ds = (HD_YADJM_6000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_yadjm_6001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_6001_ADataSet ds = null;
		HD_YADJM_6001_ADM dm = new HD_YADJM_6001_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));

		dm.print();

		ds = (HD_YADJM_6001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	/*****************************************************
	 * 2017 연말정산 WB 생성작업 시작
	 * 작업시작일 : 2017.12.22
	 * 작업자 : 한현재 
	 * ****************************************************/	
	//2017년 연말정산자료등록 임시저장 , 저장시에 동시에 호출됨
	public void hd_yadjm_2017_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1210_ADataSet ds = null;  //오토젠 돌려야함
		HD_YADJM_2017_1210_ADM dm = new HD_YADJM_2017_1210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.one_paren_dduc_yn = (String)hash.get("one_paren_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.obcl_pers_clsf = (String)hash.get("obcl_pers_clsf");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.trad_mrkt_onta = (String)hash.get("trad_mrkt_onta");
		dm.trad_mrkt_etc = (String)hash.get("trad_mrkt_etc");	
		dm.public_trans_amt_onta = (String)hash.get("public_trans_amt_onta");
		dm.public_trans_amt_etc = (String)hash.get("public_trans_amt_etc");
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.ltrm_invsm_stock_amt = Util.checkString(req.getParameter("ltrm_invsm_stock_amt"));
		
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));	
		dm.smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
		dm.larg_sum_no_lease_house = Util.checkString(req.getParameter("larg_sum_no_lease_house"));
		
	    dm.debit_card_1st_amt_onta  = (String)hash.get("debit_card_1st_amt_onta");
		dm.debit_card_2nd_amt_onta  = (String)hash.get("debit_card_2nd_amt_onta");
		dm.debit_card_1st_amt_etc   = (String)hash.get("debit_card_1st_amt_etc");
		dm.debit_card_2nd_amt_etc   = (String)hash.get("debit_card_2nd_amt_etc");
		dm.cash_rcpt_1st_onta       = (String)hash.get("cash_rcpt_1st_onta");
		dm.cash_rcpt_2nd_onta       = (String)hash.get("cash_rcpt_2nd_onta");
		dm.trad_all_1st_amt_onta    = (String)hash.get("trad_all_1st_amt_onta");
		dm.trad_all_2nd_amt_onta    = (String)hash.get("trad_all_2nd_amt_onta");
		dm.trad_all_1st_amt_etc     = (String)hash.get("trad_all_1st_amt_etc");
		dm.trad_all_2nd_amt_etc     = (String)hash.get("trad_all_2nd_amt_etc");
		dm.trans_all_1st_amt_onta   = (String)hash.get("trans_all_1st_amt_onta");
		dm.trans_all_2nd_amt_onta   = (String)hash.get("trans_all_2nd_amt_onta");
		dm.trans_all_1st_amt_etc    = (String)hash.get("trans_all_1st_amt_etc");
		dm.trans_all_2nd_amt_etc    = (String)hash.get("trans_all_2nd_amt_etc");
		dm.crdt_card_incd_pre_onta  = (String)hash.get("crdt_card_incd_pre_onta");
		dm.crdt_card_incd_pre_etc   = (String)hash.get("crdt_card_incd_pre_etc");
		dm.debit_card_incd_pre_onta = (String)hash.get("debit_card_incd_pre_onta");
		dm.debit_card_incd_pre_etc  = (String)hash.get("debit_card_incd_pre_etc");
		dm.cash_rcpt_incd_pre_onta  = (String)hash.get("cash_rcpt_incd_pre_onta");
		dm.trad_pre_amt_onta  		= (String)hash.get("trad_pre_amt_onta");
		dm.trad_pre_amt_etc  		= (String)hash.get("trad_pre_amt_etc");
		dm.trans_pre_amt_onta  		= (String)hash.get("trans_pre_amt_onta");
		dm.trans_pre_amt_etc  		= (String)hash.get("trans_pre_amt_etc");
		dm.ftyr_crdt_card_onta 		= (String)hash.get("ftyr_crdt_card_onta"); //여기부터 2015년 연말정산 항목 추가 
	    dm.ftyr_crdt_card_etc  		= (String)hash.get("ftyr_crdt_card_etc");
	    dm.ftyr_debit_card_onta     = (String)hash.get("ftyr_debit_card_onta"); 
	    dm.ftyr_debit_card_etc 		= (String)hash.get("ftyr_debit_card_etc");
	    dm.ftyr_cash_rcpt_onta 		= (String)hash.get("ftyr_cash_rcpt_onta");
	    dm.ftyr_trad_amt_onta 		= (String)hash.get("ftyr_trad_amt_onta");
	    dm.ftyr_trad_amt_etc 		= (String)hash.get("ftyr_trad_amt_etc");
	    dm.ftyr_trans_amt_onta 		= (String)hash.get("ftyr_trans_amt_onta");
	    dm.ftyr_trans_amt_etc 		= (String)hash.get("ftyr_trans_amt_etc");
		
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		
		ds = (HD_YADJM_2017_1210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
	public void hd_yadjm_2017_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2017_1220_LDataSet ds = null;
		HD_YADJM_2017_1220_LDM dm = new HD_YADJM_2017_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2017_1220_LDataSet)manager.executeCall(dm);
		
		
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2017연말정산파일업로드
	public void hd_yadjm_177001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_YADJM_177001_ADataSet ds = null;  //오토젠 완료
		HD_YADJM_177001_ADM dm = new HD_YADJM_177001_ADM();		
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원		
		
		//dm.print();
		System.out.println("$$$ 2017 연말정산 hd_yadjm_177001_a WB 시작!! $$$");
		
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	//String add_file_no1 =  Util.checkString(req.getParameter("add_file_no1"));
    	ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
    	System.out.println("$$$ hd_yadjm_177001_a WB 의 flag===>"+flag);
    	System.out.println("$$$ hd_yadjm_177001_a WB 의 attcFiles===>"+attcFiles);
    	
    	//삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag)){
        	System.out.println("$$$ flag 가 D가 아니면 탄다. $$$");
        	if(attcFiles != null){
        		System.out.println("$$$ 첨부파일을 setAdd 한다 $$$");
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
//				            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
//				            	dm.setAdd_file_no1(add_file_no1);
//				            }
		        	}
		        }    
        	}
        }
		
        /*if ("".equals(flag) && !"it0022".equals(dm.incmg_pers)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "해당 사용자는 본화면에서 업로드 할 수 없습니다. [ERP]에서 업로드하세요. ");
        }
        if ("F101".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 진본성 ");
            throw new AppException("진본성 검증 초기화에 문제가 있습니다.");
        }
        if ("F102".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 표준문서 검증오류 ");
            throw new AppException("연말정산간소화 표준 전자문서가 아닙니다.");
        }
        if ("F103".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 비밀번호오류");
            throw new AppException("PDF 문서의 비밀번호가 틀립니다. 다시 확인하세요.");
        }
        if ("F104".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: PDF 문서오류");
            throw new AppException("PDF문서가 아니거나 손상된 문서입니다. PDF 문서를 편집/수정하지 말고 홈택스의 조회한 항목 한번에 PDF 다운로드한 파일을 업로드 하시기 바랍니다.");
        }
        if ("F105".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 기타오류");
            throw new AppException("국세청 PDF 데이터 추출에 실패하였습니다.");
        }*/
        
        String multiUpdateData = Util.checkString(req.getParameter("xml"));
        System.out.println("$$$ hd_yadjm_177001_a WB 의 multiUpdateData===>"+multiUpdateData);
		if ("I".equals(flag)){
			System.out.println("multiUpdateData 값은? ==> " + multiUpdateData);
			String[] converted      = convertYadjmMultiUpdateData(multiUpdateData); //convertYadjmMultiUpdateData 로 호출바꿔야함
			System.out.println(" converted 갯수는===>   :  " + converted.length );
			String doc_type	= converted[0];		//문서종류
			String seq 	 	= converted[1];			//일련번호 					
			String att_year	= converted[2];		//귀속년도			
			String att_frmmm	= converted[3];		//조회기간시작월_2015년추가
			String att_tomm	= converted[4];		//조회기간종료월_2015년추가
			String att_inqrmm	= converted[5];		//조회월_2015년추가
			String form_cd 	= converted[6];		//서식코드
			String resid 	= converted[7];			//인별_주민등록번호
			String name 	= converted[8];			//인별_성명
			String pre_tot_amt 	= converted[9]; 	//직전년_일반공제대상금액합계_2014년 추가
			String pre_market_tot_amt 	= converted[10];	//직전년_전통시장공제대상금액합계_2014년 추가
			String pre_tmoney_tot_amt 	= converted[11];	//직전년_대중교통공제대상금액합계_2014년 추가
			String ftyr_tot_amt 	= converted[12];	//전전년도_일반공제대상금액합계_2015년추가
			String ftyr_market_tot_amt 	= converted[13];	//전전년도_전통시장공제대상금액합계_2015년추가
			String ftyr_tmoney_tot_amt 	= converted[14];	//전전년도_대중교통공제대상금액합계_2015년추가
			String dat_cd 	= converted[15];			//자료코드
			String busnid	= converted[16];			//사업자번호
			String trade_nm = converted[17];		//상호
			String acc_no 	= converted[18];			//계좌번호
			String edu_tp 	= converted[19]; 		//교육비종류_2014년 추가
			String edu_cl 	= converted[20]; 		//교육비구분_2017년 추가
			String use_place_cd	= converted[21];	//종류
			String donation_cd = converted[22];	//기부유형
			String first_tot_amt = converted[23]; //상반기_대상금액합계_2014년 추가
			String second_tot_amt = converted[24]; //하반기_대상금액합계_2014년 추가
			String secu_no = converted[25]; 		//계좌번호_2014년 추가			
			String first_year_tot_amt = converted[26]; 		//귀속년도_상반기_대상금액합계_2015년추가
			String second_year_tot_amt = converted[27]; 		//귀속년도_하반기_대상금액합계_2015년추가
			String inqr_strt_mm = converted[28]; 		//조회기간 시작월_2015년추가
			String inqr_end_mm = converted[29]; 		//조회기간 종료월_2015년추가			
			String course_cd = converted[30]; 		//과정코드
			String subject_nm = converted[31];	//과정명
			String start_dt = converted[32];     	//계약시작일
			String end_dt = converted[33];     		//계약종료일
			String com_cd = converted[34];     	//금융회사등코드
			String pension_cd = converted[35]; 	//계좌유형
			String goods_nm = converted[36];  	//상품명
			String lend_dt = converted[37];      	//대출일
			String lend_kd = converted[38];      	//대출종류
			String house_take_dt = converted[39]; 	//주택취득일
			String mort_setup_dt = converted[40];	//저당권설정일
			String repay_years = converted[41];   	//상환기간연수
			String lend_goods_nm = converted[42];	//상품명
			String debt = converted[43];      			//차입금
			String fixed_rate_debt = converted[44];	//고정금리차입금
			String not_defer_debt = converted[45];	//비거치식상환차입금
			String this_year_rede_amt = converted[46];	//당해년원금상환액
			String saving_gubn = converted[47];	//저축구분
			String reg_dt = converted[48];       	//가입일자
			String pay_method = converted[49];	//납입방법
			String insu1_resid = converted[50]; 	//주민등록번호_주피보험자
			String insu1_nm = converted[51];   	//성명_주피보험자
			String insu2_resid1 = converted[52];	//주민등록번호_종피보험자_1
			String insu2_nm1 = converted[53];  	//성명_종피보험자_1
	        String insu2_resid2 = converted[54];	//주민등록번호_종피보험자_2
			String insu2_nm2 = converted[55];		//성명_종피보험자_2
			String insu2_resid3 = converted[56];	//주민등록번호_종피보험자_3          
			String insu2_nm3 = converted[57];		//성명_종피보험자_3
			String amt = converted[58];				//납입금액
			String sum = converted[59];				//납입금액계
			String mm = converted[60];				//납입월
			String dd = converted[61];				//날짜
			String fix_cd = converted[62];			//확정구분코드
			String date = converted[63];				//납입일자
			String annual = converted[64];
			String sum_y1 = converted[65];
			String sum_y2 = converted[66];
			String sum_y3 = converted[67];
			String ann_tot_amt = converted[68];	//당해연도납입금액
			String tax_year_amt = converted[69];	//당해연도인출금액
			String ddct_bs_ass_amt = converted[70];	//순납입금액
			String fund_nm = converted[71]; 			//펀드명_2014년 추가			
			String lend_loan_amt = converted[72]; 	//대출원금_2015년추가	
			String sbdy_apln_sum = converted[73];					//기부장려금신청금액 2016년추가	
			String conb_sum = converted[74];					//기부금액합계	2016년추가
			String ddct = converted[75];					
			//String hi_yrs = converted[73];					//건강보험연말정산금액 2016년추가	
			//String ltrm_yrs = converted[74];				//장기요양연말정산금액	2016년추가
			//String hi_ntf = converted[73];					//건강보험(보수월액)고지금액합계	2016년추가
			//String ltrm_ntf = converted[74];				//장기요양(보수월액)고지금액합계	2016년추가
			//String hi_pmt = converted[75];					//건강보험(소득월액)납부금액합계	2016년추가
			//String ltrm_pmt = converted[76];				//장기요양(소득월액)납부금액합계	2016년추가
			//String spym = converted[79];					//추납보험료납부금액 2016년추가	
			//String jlc = converted[80];					//실업크레딧납부금액 2016년추가	
			//String ntf = converted[81];					//직장가입자 고지금액 합계 2016년추가	
			//String pmt = converted[82];					//지역가입자 등 납부금액 합계 2016년추가	
			//String wrkp_ntf = converted[73];					//직장가입자 고지금액 2016년추가	
			//String rgn_pmt = converted[74];					//지역가입자 등 납부금액	2016년추가
			//String apln = converted[85];					//일별기부장려금신청금액	 2016년추가
			
	
			
						
			System.out.println(" converted 값을 DM에 set 하기 시작한다");
			dm.setDoc_type(doc_type);
			dm.setSeq(seq);
			dm.setAtt_year(att_year);			
			dm.setAtt_frmmm(att_frmmm); //2015년 추가
			dm.setAtt_tomm(att_tomm);	  //2015년 추가
			dm.setAtt_inqrmm(att_inqrmm); //2015년 추가
			dm.setForm_cd(form_cd);
			dm.setResid(resid);
			dm.setName(name);
			dm.setPre_tot_amt(pre_tot_amt);
			dm.setPre_market_tot_amt(pre_market_tot_amt);
			dm.setPre_tmoney_tot_amt(pre_tmoney_tot_amt);			
			dm.setFtyr_tot_amt(ftyr_tot_amt);  //2015년 추가
			dm.setFtyr_market_tot_amt(ftyr_market_tot_amt); //2015년 추가
			dm.setFtyr_tmoney_tot_amt(ftyr_tmoney_tot_amt); //2015년 추가			
			dm.setDat_cd(dat_cd);
			dm.setBusnid(busnid);
			dm.setTrade_nm(trade_nm);
			dm.setAcc_no(acc_no);
			dm.setEdu_tp(edu_tp);
			dm.setEdu_cl(edu_cl);  //2017년 추가
			dm.setUse_place_cd(use_place_cd);
			dm.setDonation_cd(donation_cd);
			dm.setFirst_tot_amt(first_tot_amt);
			dm.setSecond_tot_amt(second_tot_amt);
			dm.setSecu_no(secu_no);			
			dm.setFirst_year_tot_amt(first_year_tot_amt); //2015년 추가
			dm.setSecond_year_tot_amt(second_year_tot_amt); //2015년 추가
			dm.setInqr_strt_mm(inqr_strt_mm); //2015년 추가
			dm.setInqr_end_mm(inqr_end_mm); //2015년 추가			
			dm.setCourse_cd(course_cd);
			dm.setSubject_nm(subject_nm);
			dm.setStart_dt(start_dt);
			dm.setEnd_dt(end_dt);
			dm.setCom_cd(com_cd);
			dm.setPension_cd(pension_cd);
			dm.setGoods_nm(goods_nm);
			dm.setLend_dt(lend_dt);
			dm.setLend_kd(lend_kd);
			dm.setHouse_take_dt(house_take_dt);
			dm.setMort_setup_dt(mort_setup_dt);
			dm.setRepay_years(repay_years);
			dm.setLend_goods_nm(lend_goods_nm);
			dm.setDebt(debt);
			dm.setFixed_rate_debt(fixed_rate_debt);
			dm.setNot_defer_debt(not_defer_debt);
			dm.setThis_year_rede_amt(this_year_rede_amt);
			dm.setSaving_gubn(saving_gubn);
			dm.setReg_dt(reg_dt);
			dm.setPay_method(pay_method);
			dm.setInsu1_resid(insu1_resid);
			dm.setInsu1_nm(insu1_nm);
			dm.setInsu2_resid1(insu2_resid1);
			dm.setInsu2_nm1(insu2_nm1);
			dm.setInsu2_resid2(insu2_resid2);
			dm.setInsu2_nm2(insu2_nm2);
			dm.setInsu2_resid3(insu2_resid3);
			dm.setInsu2_nm3(insu2_nm3);
			dm.setAmt(amt);
			dm.setSum(sum);
			dm.setMm(mm);
			dm.setDd(dd);
			dm.setFix_cd(fix_cd);
			dm.setDate(date);
			dm.setAnnual(annual);
			dm.setSum_y1(sum_y1);
			dm.setSum_y2(sum_y2);
			dm.setSum_y3(sum_y3);			
			dm.setAnn_tot_amt(ann_tot_amt);
			dm.setTax_year_amt(tax_year_amt);
			dm.setDdct_bs_ass_amt(ddct_bs_ass_amt);
			dm.setFund_nm(fund_nm);
			dm.setLend_loan_amt(lend_loan_amt); //2015년 추가
			dm.setSbdy_apln_sum(sbdy_apln_sum);	//2016년 추가
			dm.setConb_sum(conb_sum);	//2016년 추가
			dm.setDdct(ddct);           
			//dm.setHi_yrs(hi_yrs); 		//2016년 추가
			//dm.setLtrm_yrs(ltrm_yrs);	//2016년 추가
			//dm.setHi_ntf(hi_ntf);		//2016년 추가
			//dm.setLtrm_ntf(ltrm_ntf);	//2016년 추가
			//dm.setHi_pmt(hi_pmt);		//2016년 추가
			//dm.setLtrm_pmt(ltrm_pmt);	//2016년 추가
			//dm.setSpym(spym);			//2016년 추가
			//dm.setJlc(jlc);				//2016년 추가
			//dm.setNtf(ntf);				//2016년 추가
			//dm.setPmt(pmt);				//2016년 추가
			//dm.setWrkp_ntf(wrkp_ntf);	//2016년 추가
			//dm.setRgn_pmt(rgn_pmt);		//2016년 추가
			//dm.setApln(apln);			//2016년 추가
			
			
		}
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		//dm.add_file_no1	= Util.checkString(req.getParameter("add_file_no1"));
		dm.flag = Util.checkString(req.getParameter("flag"));
    	
		dm.print();

        try {
        	HD_YADJM_1000DAO dao = new HD_YADJM_1000DAO();
        	System.out.println("=== 2017연말정산 DAO 호출 시작 ====");
            ds = dao.hd_yadjm_177001_a(dm);
            System.out.println("=== 2017연말정산 DAO 호출 종료 ====");
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
	public void hd_yadjm_2017_1221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1221_LDataSet ds = null; //오토젠돌려야함
		HD_YADJM_2017_1221_LDM dm = new HD_YADJM_2017_1221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2017_1221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}

	//2015년 연말정산자료등록-연금팝업창_저장/삭제버튼
	public void hd_yadjm_2017_1232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1232_ADataSet ds = null;  //오토젠해야함
		HD_YADJM_2017_1232_ADM dm = new HD_YADJM_2017_1232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_2017_1232_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 본인공제입력 연금팝업창-연금저축 조회
	public void hd_yadjm_2017_1231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1231_LDataSet ds = null; //오토젠 필요
		HD_YADJM_2017_1231_LDM dm = new HD_YADJM_2017_1231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		try {
			 
			ds = (HD_YADJM_2017_1231_LDataSet)manager.executeCall(dm);
			
			 System.out.print("ddd");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
        	
        }
        catch (AppException e) {
            throw e;
        } 
	
		req.setAttribute("ds", ds);
	}
	
	//2017년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
	public void hd_yadjm_2017_1234_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1234_LDataSet ds = null; //오토젠필요
		HD_YADJM_2017_1234_LDM dm = new HD_YADJM_2017_1234_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2017_1234_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2017년 연말정산 의료비 팝업 저장버튼
	public void hd_yadjm_2017_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1212_ADataSet ds = null; //오토젠다시
		HD_YADJM_2017_1212_ADM dm = new HD_YADJM_2017_1212_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

		dm.mode              = ((String)hash.get("m")).toUpperCase();
		dm.pay_dt            = ((String)hash.get("pay_dt"));
		dm.ern               = ((String)hash.get("ern"));
		dm.firmnm            = ((String)hash.get("firmnm"));
		dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
		dm.prn               = ((String)hash.get("prn"));
		dm.rshp              = ((String)hash.get("rshp"));
		dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
		dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
		dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
		dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
		dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
		dm.hosp_prof         = ((String)hash.get("hosp_prof"));
		dm.seq               = ((String)hash.get("seq"));
		dm.subf_treat_yn     = ((String)hash.get("subf_treat_yn"));

		dm.print();

		ds = (HD_YADJM_2017_1212_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2017년 연말정산 기부금팝업저장버튼
	public void hd_yadjm_2017_1213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1213_ADataSet ds = null; //오토젠필요
		HD_YADJM_2017_1213_ADM dm = new HD_YADJM_2017_1213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_2017_1213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 기부금 READY 조회 및 콤보구성
	public void hd_yadjm_2017_1214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL"); 
		HD_YADJM_2017_1214_LDataSet ds = null; //오토젠필요
		HD_YADJM_2017_1214_LDM dm = new HD_YADJM_2017_1214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2017_1214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2017년 연말정산자료등록-정산결과조회
	public void hd_yadjm_2017_1250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_1250_LDataSet ds = null; //오토젠필요
		HD_YADJM_2017_1250_LDM dm = new HD_YADJM_2017_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2017_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2017년 연말정산-지급조서파일생성-파일생성
	public void hd_yadjm_2017_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_2000_ADataSet ds = null; //오토젠필요
		HD_YADJM_2017_2000_ADM dm = new HD_YADJM_2017_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2017_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	//	2017년 연말정산자료등록 -장기주택저당차입금 조회
	public void hd_yadjm_2017_5100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_5100_LDataSet ds = null; //오토젠필요
		HD_YADJM_2017_5100_LDM dm = new HD_YADJM_2017_5100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2017_5100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	//2017년 연말정산자료등록-연금팝업창_저장/삭제버튼
	public void hd_yadjm_2017_5101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2017_5101_ADataSet ds = null;  //오토젠해야함
		HD_YADJM_2017_5101_ADM dm = new HD_YADJM_2017_5101_ADM();
		
		//String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//System.out.println("multiUpdateData=" + multiUpdateData );
		//Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy 	= Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no 			= Util.checkString(req.getParameter("emp_no"));
		dm.flag				= Util.checkString(req.getParameter("flag"));
		dm.hous_loan_amt_int  	= Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.hous_loan_amt_int_1  = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 	 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2  = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		dm.hous_loan_amt_int_15_15y_fn  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y_fn"));
		dm.hous_loan_amt_int_15_15y  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y"));
		dm.hous_loan_amt_int_15_15y_e  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_15y_etc"));
		dm.hous_loan_amt_int_15_10y  = Util.checkString(req.getParameter("hous_loan_amt_int_2015_10y"));
		dm.ltrm_hous_mogg_loan_amt_int  = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		//dm.mode = ((String) hash.get("m")).toUpperCase();
		

		dm.print();
	    
		ds = (HD_YADJM_2017_5101_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}

	/*****************************************************
	 * 2018 연말정산 WB 생성작업 시작
	 * 작업시작일 : 2018.12.06
	 * 작업자 : 이가연 
	 * ****************************************************/	
	//2018년 연말정산자료등록 임시저장 , 저장시에 동시에 호출됨
	public void hd_yadjm_2018_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_1210_ADataSet ds = null;  //오토젠 돌려야함 
		HD_YADJM_2018_1210_ADM dm = new HD_YADJM_2018_1210_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.base_dduc_yn = (String)hash.get("base_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.one_paren_dduc_yn = (String)hash.get("one_paren_dduc_yn");
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.obcl_pers_clsf = (String)hash.get("obcl_pers_clsf");
		dm.edu_fee_clsf_cd = (String)hash.get("edu_fee_clsf_cd");
		dm.edu_cost_onta = (String)hash.get("edu_cost_onta");
		dm.edu_cost_etc = (String)hash.get("edu_cost_etc");
		dm.edu_splen_pers_onta = (String)hash.get("edu_splen_pers_onta");
		dm.edu_splen_pers_etc = (String)hash.get("edu_splen_pers_etc");
		dm.asrc_prpn_insr_fee_onta = (String)hash.get("asrc_prpn_insr_fee_onta");
		dm.asrc_prpn_insr_fee_etc = (String)hash.get("asrc_prpn_insr_fee_etc");
		dm.obcl_pers_insr_onta = (String)hash.get("obcl_pers_insr_onta");
		dm.obcl_pers_insr_etc = (String)hash.get("obcl_pers_insr_etc");
		dm.crdt_card_tot_amt_onta = (String)hash.get("crdt_card_tot_amt_onta");
		dm.crdt_card_tot_amt_etc = (String)hash.get("crdt_card_tot_amt_etc");
		dm.debit_card_tot_amt_onta = (String)hash.get("debit_card_tot_amt_onta");
		dm.debit_card_tot_amt_etc = (String)hash.get("debit_card_tot_amt_etc");
		dm.cash_rcpt_onta = (String)hash.get("cash_rcpt_onta");
		dm.trad_mrkt_onta = (String)hash.get("trad_mrkt_onta");
		dm.trad_mrkt_etc = (String)hash.get("trad_mrkt_etc");	
		dm.public_trans_amt_onta = (String)hash.get("public_trans_amt_onta");
		dm.public_trans_amt_etc = (String)hash.get("public_trans_amt_etc");
		dm.book_show_use_onta = (String)hash.get("book_show_use_onta"); //2018년도 연말정산 추가 
		dm.book_show_use_etc = (String)hash.get("book_show_use_etc");//2018년도 연말정산 추가 
		
		dm.prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
		dm.pens_savg = Util.checkString(req.getParameter("pens_savg"));
		dm.invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
		dm.multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
		dm.ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
		dm.labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
		//변수명축소 - 아래한개
		dm.hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt_repa"));
		
		dm.monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
		dm.hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
		dm.hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
		dm.hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
		//변수명축소 - 아래 한개
		dm.ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int_re"));
		
		dm.hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
		dm.ltrm_invsm_stock_amt = Util.checkString(req.getParameter("ltrm_invsm_stock_amt"));
		
		//변수명축소 - 아래3개
		dm.ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc1"));
		dm.ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc2"));
		dm.ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm_dduc3"));
		dm.lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));	
		dm.smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
		dm.larg_sum_no_lease_house = Util.checkString(req.getParameter("larg_sum_no_lease_house"));
		
	    dm.debit_card_1st_amt_onta  = (String)hash.get("debit_card_1st_amt_onta");
		dm.debit_card_2nd_amt_onta  = (String)hash.get("debit_card_2nd_amt_onta");
		dm.debit_card_1st_amt_etc   = (String)hash.get("debit_card_1st_amt_etc");
		dm.debit_card_2nd_amt_etc   = (String)hash.get("debit_card_2nd_amt_etc");
		dm.cash_rcpt_1st_onta       = (String)hash.get("cash_rcpt_1st_onta");
		dm.cash_rcpt_2nd_onta       = (String)hash.get("cash_rcpt_2nd_onta");
		dm.trad_all_1st_amt_onta    = (String)hash.get("trad_all_1st_amt_onta");
		dm.trad_all_2nd_amt_onta    = (String)hash.get("trad_all_2nd_amt_onta");
		dm.trad_all_1st_amt_etc     = (String)hash.get("trad_all_1st_amt_etc");
		dm.trad_all_2nd_amt_etc     = (String)hash.get("trad_all_2nd_amt_etc");
		dm.trans_all_1st_amt_onta   = (String)hash.get("trans_all_1st_amt_onta");
		dm.trans_all_2nd_amt_onta   = (String)hash.get("trans_all_2nd_amt_onta");
		dm.trans_all_1st_amt_etc    = (String)hash.get("trans_all_1st_amt_etc");
		dm.trans_all_2nd_amt_etc    = (String)hash.get("trans_all_2nd_amt_etc");
		dm.crdt_card_incd_pre_onta  = (String)hash.get("crdt_card_incd_pre_onta");
		dm.crdt_card_incd_pre_etc   = (String)hash.get("crdt_card_incd_pre_etc");
		dm.debit_card_incd_pre_onta = (String)hash.get("debit_card_incd_pre_onta");
		dm.debit_card_incd_pre_etc  = (String)hash.get("debit_card_incd_pre_etc");
		dm.cash_rcpt_incd_pre_onta  = (String)hash.get("cash_rcpt_incd_pre_onta");
		dm.trad_pre_amt_onta  		= (String)hash.get("trad_pre_amt_onta");
		dm.trad_pre_amt_etc  		= (String)hash.get("trad_pre_amt_etc");
		dm.trans_pre_amt_onta  		= (String)hash.get("trans_pre_amt_onta");
		dm.trans_pre_amt_etc  		= (String)hash.get("trans_pre_amt_etc");
		dm.ftyr_crdt_card_onta 		= (String)hash.get("ftyr_crdt_card_onta"); //여기부터 2015년 연말정산 항목 추가 
	    dm.ftyr_crdt_card_etc  		= (String)hash.get("ftyr_crdt_card_etc");
	    dm.ftyr_debit_card_onta     = (String)hash.get("ftyr_debit_card_onta"); 
	    dm.ftyr_debit_card_etc 		= (String)hash.get("ftyr_debit_card_etc");
	    dm.ftyr_cash_rcpt_onta 		= (String)hash.get("ftyr_cash_rcpt_onta");
	    dm.ftyr_trad_amt_onta 		= (String)hash.get("ftyr_trad_amt_onta");
	    dm.ftyr_trad_amt_etc 		= (String)hash.get("ftyr_trad_amt_etc");
	    dm.ftyr_trans_amt_onta 		= (String)hash.get("ftyr_trans_amt_onta");
	    dm.ftyr_trans_amt_etc 		= (String)hash.get("ftyr_trans_amt_etc");
		
		
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		
		ds = (HD_YADJM_2018_1210_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2018년 연말정산 의료비 팝업 저장버튼 
		public void hd_yadjm_2018_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
			DBManager manager = new DBManager("MISHDL");
			HD_YADJM_2018_1212_ADataSet ds = null; //오토젠다시
			HD_YADJM_2018_1212_ADM dm = new HD_YADJM_2018_1212_ADM();

			String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
			System.out.println("multiUpdateData=" + multiUpdateData );
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
			dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
			dm.flnm = Util.checkString(req.getParameter("flnm"));
			dm.incmg_pers_ip = req.getRemoteAddr();
			dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

			dm.mode              = ((String)hash.get("m")).toUpperCase();
			dm.pay_dt            = ((String)hash.get("pay_dt"));
			dm.ern               = ((String)hash.get("ern"));
			dm.firmnm            = ((String)hash.get("firmnm"));
			dm.obj_pers_flnm     = ((String)hash.get("obj_pers_flnm"));
			dm.prn               = ((String)hash.get("prn"));
			dm.rshp              = ((String)hash.get("rshp"));
			dm.obcl_pers_rspc_yn = ((String)hash.get("obcl_pers_rspc_yn"));
			dm.pay_noit          = ((String)hash.get("pay_noit_crdt_card_cash_rcpt"));
			dm.pay_amt           = ((String)hash.get("pay_amt_crdt_card_cash_rcpt"));
			dm.pay_noit_cash     = ((String)hash.get("pay_noit_cash"));
			dm.pay_amt_cash      = ((String)hash.get("pay_amt_cash"));
			dm.hosp_prof         = ((String)hash.get("hosp_prof"));
			dm.seq               = ((String)hash.get("seq"));
			dm.subf_treat_yn     = ((String)hash.get("subf_treat_yn"));

			dm.print();

			ds = (HD_YADJM_2018_1212_ADataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			req.setAttribute("ds", ds);
		}
		
	//2018년 연말정산 기부금팝업저장버튼
	public void hd_yadjm_2018_1213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_1213_ADataSet ds = null; //오토젠필요
		HD_YADJM_2018_1213_ADM dm = new HD_YADJM_2018_1213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy  = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no        = Util.checkString(req.getParameter("emp_no"));
		dm.flnm          = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

        dm.mode                  = ((String)hash.get("m")).toUpperCase();
        dm.ern                   = ((String)hash.get("ern"));
        dm.firmnm                = ((String)hash.get("firmnm"));
        dm.dona_plac_clsf        = ((String)hash.get("dona_plac_clsf"));
        dm.dona_yymm             = ((String)hash.get("dona_yymm"));
        dm.dona_ptcr_noit        = ((String)hash.get("dona_ptcr_noit"));
        dm.dona_ptcr_amt         = ((String)hash.get("dona_ptcr_amt"));
        dm.rmks                  = ((String)hash.get("rmks"));
        dm.rshp                  = ((String)hash.get("rshp"));
        dm.obj_pers_flnm         = ((String)hash.get("obj_pers_flnm"));
        dm.prn                   = ((String)hash.get("prn"));
        dm.corr_txn_prd_dduc_amt = ((String)hash.get("corr_txn_prd_dduc_amt"));
        dm.cyov_amt              = ((String)hash.get("cyov_amt"));
        dm.seq                   = ((String)hash.get("seq"));
        dm.lastyear_cyov_amt     = ((String)hash.get("lastyear_cyov_amt"));

		dm.print();
		
		ds = (HD_YADJM_2018_1213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2018년 연말정산 기부금 READY 조회 및 콤보구성
	public void hd_yadjm_2018_1214_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL"); 
		HD_YADJM_2018_1214_LDataSet ds = null; //오토젠필요
		HD_YADJM_2018_1214_LDM dm = new HD_YADJM_2018_1214_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2018_1214_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-연말정산 조회(주소,본인,가족공제,가족관계코드)
	public void hd_yadjm_2018_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2018_1220_LDataSet ds = null;
		HD_YADJM_2018_1220_LDM dm = new HD_YADJM_2018_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2018_1220_LDataSet)manager.executeCall(dm);
		
		
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	
	//2018연말정산파일업로드
	public void hd_yadjm_187001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_YADJM_187001_ADataSet ds = null;  //오토젠 완료
		HD_YADJM_187001_ADM dm = new HD_YADJM_187001_ADM();		
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원		
		
		//dm.print();
		System.out.println("$$$ 2018 연말정산 hd_yadjm_187001_a WB 시작!! $$$");
		
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	//String add_file_no1 =  Util.checkString(req.getParameter("add_file_no1"));
    	ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
    	System.out.println("$$$ hd_yadjm_187001_a WB 의 flag===>"+flag);
    	System.out.println("$$$ hd_yadjm_187001_a WB 의 attcFiles===>"+attcFiles);
    	
    	//삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag)){
        	System.out.println("$$$ flag 가 D가 아니면 탄다. $$$");
        	if(attcFiles != null){
        		System.out.println("$$$ 첨부파일을 setAdd 한다 $$$");
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
//				            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
//				            	dm.setAdd_file_no1(add_file_no1);
//				            }
		        	}
		        }    
        	}
        }
		
        /*if ("".equals(flag) && !"it0022".equals(dm.incmg_pers)) {
        	System.out.println("FLAG_NULL_ERROR.");
            throw new AppException("등록실패", "해당 사용자는 본화면에서 업로드 할 수 없습니다. [ERP]에서 업로드하세요. ");
        }
        if ("F101".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 진본성 ");
            throw new AppException("진본성 검증 초기화에 문제가 있습니다.");
        }
        if ("F102".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 표준문서 검증오류 ");
            throw new AppException("연말정산간소화 표준 전자문서가 아닙니다.");
        }
        if ("F103".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 비밀번호오류");
            throw new AppException("PDF 문서의 비밀번호가 틀립니다. 다시 확인하세요.");
        }
        if ("F104".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: PDF 문서오류");
            throw new AppException("PDF문서가 아니거나 손상된 문서입니다. PDF 문서를 편집/수정하지 말고 홈택스의 조회한 항목 한번에 PDF 다운로드한 파일을 업로드 하시기 바랍니다.");
        }
        if ("F105".equals(flag)) {
        	System.out.println("FLAG_NULL_ERROR.: 기타오류");
            throw new AppException("국세청 PDF 데이터 추출에 실패하였습니다.");
        }*/
        
        String multiUpdateData = Util.checkString(req.getParameter("xml"));
        System.out.println("$$$ hd_yadjm_187001_a WB 의 multiUpdateData===>"+multiUpdateData);
		if ("I".equals(flag)){
			System.out.println("multiUpdateData 값은? ==> " + multiUpdateData);
			String[] converted      = convertYadjmMultiUpdateData(multiUpdateData); //convertYadjmMultiUpdateData 로 호출바꿔야함
			System.out.println(" converted 갯수는===>   :  " + converted.length );
			String doc_type	= converted[0];		//문서종류
			String seq 	 	= converted[1];			//일련번호 					
			String att_year	= converted[2];		//귀속년도			
			String att_frmmm	= converted[3];		//조회기간시작월_2015년추가
			String att_tomm	= converted[4];		//조회기간종료월_2015년추가
			String att_inqrmm	= converted[5];		//조회월_2015년추가
			String form_cd 	= converted[6];		//서식코드
			String resid 	= converted[7];			//인별_주민등록번호
			String name 	= converted[8];			//인별_성명
			String pre_tot_amt 	= converted[9]; 	//직전년_일반공제대상금액합계_2014년 추가
			String pre_market_tot_amt 	= converted[10];	//직전년_전통시장공제대상금액합계_2014년 추가
			String pre_tmoney_tot_amt 	= converted[11];	//직전년_대중교통공제대상금액합계_2014년 추가
			String ftyr_tot_amt 	= converted[12];	//전전년도_일반공제대상금액합계_2015년추가
			String ftyr_market_tot_amt 	= converted[13];	//전전년도_전통시장공제대상금액합계_2015년추가
			String ftyr_tmoney_tot_amt 	= converted[14];	//전전년도_대중교통공제대상금액합계_2015년추가
			String dat_cd 	= converted[15];			//자료코드
			String busnid	= converted[16];			//사업자번호
			String trade_nm = converted[17];		//상호
			String acc_no 	= converted[18];			//계좌번호
			String edu_tp 	= converted[19]; 		//교육비종류_2014년 추가
			String edu_cl 	= converted[20]; 		//교육비구분_2018년 추가
			String use_place_cd	= converted[21];	//종류
			String donation_cd = converted[22];	//기부유형
			String first_tot_amt = converted[23]; //상반기_대상금액합계_2014년 추가
			String second_tot_amt = converted[24]; //하반기_대상금액합계_2014년 추가
			String secu_no = converted[25]; 		//계좌번호_2014년 추가			
			String first_year_tot_amt = converted[26]; 		//귀속년도_상반기_대상금액합계_2015년추가
			String second_year_tot_amt = converted[27]; 		//귀속년도_하반기_대상금액합계_2015년추가
			String inqr_strt_mm = converted[28]; 		//조회기간 시작월_2015년추가
			String inqr_end_mm = converted[29]; 		//조회기간 종료월_2015년추가			
			String course_cd = converted[30]; 		//과정코드
			String subject_nm = converted[31];	//과정명
			String start_dt = converted[32];     	//계약시작일
			String end_dt = converted[33];     		//계약종료일
			String com_cd = converted[34];     	//금융회사등코드
			String pension_cd = converted[35]; 	//계좌유형
			String goods_nm = converted[36];  	//상품명
			String lend_dt = converted[37];      	//대출일
			String lend_kd = converted[38];      	//대출종류
			String house_take_dt = converted[39]; 	//주택취득일
			String mort_setup_dt = converted[40];	//저당권설정일
			String repay_years = converted[41];   	//상환기간연수
			String lend_goods_nm = converted[42];	//상품명
			String debt = converted[43];      			//차입금
			String fixed_rate_debt = converted[44];	//고정금리차입금
			String not_defer_debt = converted[45];	//비거치식상환차입금
			String this_year_rede_amt = converted[46];	//당해년원금상환액
			String saving_gubn = converted[47];	//저축구분
			String reg_dt = converted[48];       	//가입일자
			String pay_method = converted[49];	//납입방법
			String insu1_resid = converted[50]; 	//주민등록번호_주피보험자
			String insu1_nm = converted[51];   	//성명_주피보험자
			String insu2_resid1 = converted[52];	//주민등록번호_종피보험자_1
			String insu2_nm1 = converted[53];  	//성명_종피보험자_1
	        String insu2_resid2 = converted[54];	//주민등록번호_종피보험자_2
			String insu2_nm2 = converted[55];		//성명_종피보험자_2
			String insu2_resid3 = converted[56];	//주민등록번호_종피보험자_3          
			String insu2_nm3 = converted[57];		//성명_종피보험자_3
			String amt = converted[58];				//납입금액
			String sum = converted[59];				//납입금액계
			String mm = converted[60];				//납입월
			String dd = converted[61];				//날짜
			String fix_cd = converted[62];			//확정구분코드
			String date = converted[63];				//납입일자
			String annual = converted[64];
			String sum_y1 = converted[65];
			String sum_y2 = converted[66];
			String sum_y3 = converted[67];
			String ann_tot_amt = converted[68];	//당해연도납입금액
			String tax_year_amt = converted[69];	//당해연도인출금액
			String ddct_bs_ass_amt = converted[70];	//순납입금액
			String fund_nm = converted[71]; 			//펀드명_2014년 추가			
			String lend_loan_amt = converted[72]; 	//대출원금_2015년추가	
			String sbdy_apln_sum = converted[73];					//기부장려금신청금액 2016년추가	
			String conb_sum = converted[74];					//기부금액합계	2016년추가
			String ddct = converted[75];					
			//String hi_yrs = converted[73];					//건강보험연말정산금액 2016년추가	
			//String ltrm_yrs = converted[74];				//장기요양연말정산금액	2016년추가
			//String hi_ntf = converted[73];					//건강보험(보수월액)고지금액합계	2016년추가
			//String ltrm_ntf = converted[74];				//장기요양(보수월액)고지금액합계	2016년추가
			//String hi_pmt = converted[75];					//건강보험(소득월액)납부금액합계	2016년추가
			//String ltrm_pmt = converted[76];				//장기요양(소득월액)납부금액합계	2016년추가
			//String spym = converted[79];					//추납보험료납부금액 2016년추가	
			//String jlc = converted[80];					//실업크레딧납부금액 2016년추가	
			//String ntf = converted[81];					//직장가입자 고지금액 합계 2016년추가	
			//String pmt = converted[82];					//지역가입자 등 납부금액 합계 2016년추가	
			//String wrkp_ntf = converted[73];					//직장가입자 고지금액 2016년추가	
			//String rgn_pmt = converted[74];					//지역가입자 등 납부금액	2016년추가
			//String apln = converted[85];					//일별기부장려금신청금액	 2016년추가
			
	
			
						
			System.out.println(" converted 값을 DM에 set 하기 시작한다");
			dm.setDoc_type(doc_type);
			dm.setSeq(seq);
			dm.setAtt_year(att_year);			
			dm.setAtt_frmmm(att_frmmm); //2015년 추가
			dm.setAtt_tomm(att_tomm);	  //2015년 추가
			dm.setAtt_inqrmm(att_inqrmm); //2015년 추가
			dm.setForm_cd(form_cd);
			dm.setResid(resid);
			dm.setName(name);
			dm.setPre_tot_amt(pre_tot_amt);
			dm.setPre_market_tot_amt(pre_market_tot_amt);
			dm.setPre_tmoney_tot_amt(pre_tmoney_tot_amt);			
			dm.setFtyr_tot_amt(ftyr_tot_amt);  //2015년 추가
			dm.setFtyr_market_tot_amt(ftyr_market_tot_amt); //2015년 추가
			dm.setFtyr_tmoney_tot_amt(ftyr_tmoney_tot_amt); //2015년 추가			
			dm.setDat_cd(dat_cd);
			dm.setBusnid(busnid);
			dm.setTrade_nm(trade_nm);
			dm.setAcc_no(acc_no);
			dm.setEdu_tp(edu_tp);
			dm.setEdu_cl(edu_cl);  //2018년 추가
			dm.setUse_place_cd(use_place_cd);
			dm.setDonation_cd(donation_cd);
			dm.setFirst_tot_amt(first_tot_amt);
			dm.setSecond_tot_amt(second_tot_amt);
			dm.setSecu_no(secu_no);			
			dm.setFirst_year_tot_amt(first_year_tot_amt); //2015년 추가
			dm.setSecond_year_tot_amt(second_year_tot_amt); //2015년 추가
			dm.setInqr_strt_mm(inqr_strt_mm); //2015년 추가
			dm.setInqr_end_mm(inqr_end_mm); //2015년 추가			
			dm.setCourse_cd(course_cd);
			dm.setSubject_nm(subject_nm);
			dm.setStart_dt(start_dt);
			dm.setEnd_dt(end_dt);
			dm.setCom_cd(com_cd);
			dm.setPension_cd(pension_cd);
			dm.setGoods_nm(goods_nm);
			dm.setLend_dt(lend_dt);
			dm.setLend_kd(lend_kd);
			dm.setHouse_take_dt(house_take_dt);
			dm.setMort_setup_dt(mort_setup_dt);
			dm.setRepay_years(repay_years);
			dm.setLend_goods_nm(lend_goods_nm);
			dm.setDebt(debt);
			dm.setFixed_rate_debt(fixed_rate_debt);
			dm.setNot_defer_debt(not_defer_debt);
			dm.setThis_year_rede_amt(this_year_rede_amt);
			dm.setSaving_gubn(saving_gubn);
			dm.setReg_dt(reg_dt);
			dm.setPay_method(pay_method);
			dm.setInsu1_resid(insu1_resid);
			dm.setInsu1_nm(insu1_nm);
			dm.setInsu2_resid1(insu2_resid1);
			dm.setInsu2_nm1(insu2_nm1);
			dm.setInsu2_resid2(insu2_resid2);
			dm.setInsu2_nm2(insu2_nm2);
			dm.setInsu2_resid3(insu2_resid3);
			dm.setInsu2_nm3(insu2_nm3);
			dm.setAmt(amt);
			dm.setSum(sum);
			dm.setMm(mm);
			dm.setDd(dd);
			dm.setFix_cd(fix_cd);
			dm.setDate(date);
			dm.setAnnual(annual);
			dm.setSum_y1(sum_y1);
			dm.setSum_y2(sum_y2);
			dm.setSum_y3(sum_y3);			
			dm.setAnn_tot_amt(ann_tot_amt);
			dm.setTax_year_amt(tax_year_amt);
			dm.setDdct_bs_ass_amt(ddct_bs_ass_amt);
			dm.setFund_nm(fund_nm);
			dm.setLend_loan_amt(lend_loan_amt); //2015년 추가
			dm.setSbdy_apln_sum(sbdy_apln_sum);	//2016년 추가
			dm.setConb_sum(conb_sum);	//2016년 추가
			dm.setDdct(ddct);           
			//dm.setHi_yrs(hi_yrs); 		//2016년 추가
			//dm.setLtrm_yrs(ltrm_yrs);	//2016년 추가
			//dm.setHi_ntf(hi_ntf);		//2016년 추가
			//dm.setLtrm_ntf(ltrm_ntf);	//2016년 추가
			//dm.setHi_pmt(hi_pmt);		//2016년 추가
			//dm.setLtrm_pmt(ltrm_pmt);	//2016년 추가
			//dm.setSpym(spym);			//2016년 추가
			//dm.setJlc(jlc);				//2016년 추가
			//dm.setNtf(ntf);				//2016년 추가
			//dm.setPmt(pmt);				//2016년 추가
			//dm.setWrkp_ntf(wrkp_ntf);	//2016년 추가
			//dm.setRgn_pmt(rgn_pmt);		//2016년 추가
			//dm.setApln(apln);			//2016년 추가
			
			
		}
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		//dm.add_file_no1	= Util.checkString(req.getParameter("add_file_no1"));
		dm.flag = Util.checkString(req.getParameter("flag"));
    	
		dm.print();

        try {
        	HD_YADJM_1000DAO dao = new HD_YADJM_1000DAO();
        	System.out.println("=== 2018연말정산 DAO 호출 시작 ====");
            ds = dao.hd_yadjm_187001_a(dm);
            System.out.println("=== 2018연말정산 DAO 호출 종료 ====");
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산자료등록-공제입력팝업 조회(팝업리프레쉬)
	public void hd_yadjm_2018_1221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_1221_LDataSet ds = null; //오토젠돌려야함
		HD_YADJM_2018_1221_LDM dm = new HD_YADJM_2018_1221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2018_1221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}
	

	//2018년 연말정산자료등록-연금팝업창_저장/삭제버튼
	public void hd_yadjm_2018_1232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_1232_ADataSet ds = null;  //오토젠해야함
		HD_YADJM_2018_1232_ADM dm = new HD_YADJM_2018_1232_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.account_no = (String)hash.get("account_no");
		dm.payment = (String)hash.get("payment");
		dm.deduct_amt = (String)hash.get("deduct_amt");

		dm.print();
	    
		ds = (HD_YADJM_2018_1232_ADataSet)manager.executeCall(dm);
		// System.out.print(ds)
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		
		req.setAttribute("ds", ds);
	}
	
	//2015년 연말정산 본인공제입력 연금팝업창-연금저축 조회
	public void hd_yadjm_2018_1231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_1231_LDataSet ds = null; //오토젠 필요
		HD_YADJM_2018_1231_LDM dm = new HD_YADJM_2018_1231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));

		dm.print();

		try {
			 
			ds = (HD_YADJM_2018_1231_LDataSet)manager.executeCall(dm);
			
			 System.out.print("ddd");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
        	
        }
        catch (AppException e) {
            throw e;
        } 
	
		req.setAttribute("ds", ds);
	}
	
	//2018년 연말정산 본인공제입력 연금팝업창-조선일보전용 개인연금복지기금액 조회
	public void hd_yadjm_2018_1234_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_1234_LDataSet ds = null; //오토젠필요
		HD_YADJM_2018_1234_LDM dm = new HD_YADJM_2018_1234_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2018_1234_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//2018년 연말정산자료등록-정산결과조회
	public void hd_yadjm_2018_1250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_1250_LDataSet ds = null; //오토젠필요
		HD_YADJM_2018_1250_LDM dm = new HD_YADJM_2018_1250_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_YADJM_2018_1250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	//2018년 연말정산-지급조서파일생성-파일생성
	public void hd_yadjm_2018_2000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2018_2000_ADataSet ds = null; //오토젠필요
		HD_YADJM_2018_2000_ADM dm = new HD_YADJM_2018_2000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yadjm_yy = Util.checkString(req.getParameter("yadjm_yy"));
		dm.yadjm_clsf = Util.checkString(req.getParameter("yadjm_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_YADJM_2018_2000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
}