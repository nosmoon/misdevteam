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

package chosun.ciis.is.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.bas.dao.IsBas1000DAO;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsBas1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1000_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1000_MDM dm = new IS_BAS_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1010_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1010_LDM dm = new IS_BAS_1010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.std_cd = Util.checkString(req.getParameter("std_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1020_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1020_LDM dm = new IS_BAS_1020_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.std_cd = Util.checkString(req.getParameter("std_cd"));
    	dm.seq = Util.checkString(req.getParameter("seq"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1030_ADataSet ds = null;

    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);   
    	String std_cd = Util.checkString(req.getParameter("std_cd"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode = Util.checkString((String)hash.get("m"));
    	String seq = Util.checkString((String)hash.get("seq"));
    	String rvord_uprc = Util.checkString((String)hash.get("rvord_uprc"));
    	String dstb_scat_uprc = Util.checkString((String)hash.get("dstb_scat_uprc"));
    	String build_scat_uprc = Util.checkString((String)hash.get("build_scat_uprc"));
    	String etc_scat_uprc = Util.checkString((String)hash.get("etc_scat_uprc"));
    	
    	// DM Setting
    	IS_BAS_1030_ADM dm = new IS_BAS_1030_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setStd_cd(std_cd);
    	dm.setSeq(seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setMode(mode.toUpperCase());
    	dm.setRvord_uprc(rvord_uprc);
    	dm.setDstb_scat_uprc(dstb_scat_uprc);
    	dm.setBuild_scat_uprc(build_scat_uprc);
    	dm.setEtc_scat_uprc(etc_scat_uprc);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1040_ADataSet ds = null;

    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);   
    	String std_cd = Util.checkString(req.getParameter("std_cd"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	String mode = Util.checkString((String)hash2.get("m"));
    	String advcs_cd = Util.checkString((String)hash2.get("advcs_cd"));    	
    	
    	// DM Setting
    	IS_BAS_1040_ADM dm = new IS_BAS_1040_ADM();
    	
    	dm.setMode(mode.toUpperCase());
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setStd_cd(std_cd);
    	dm.setSeq(seq);
    	dm.setAdvcs_cd(advcs_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1100_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1100_MDM dm = new IS_BAS_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1100_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1110_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1110_LDM dm = new IS_BAS_1110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1110_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1120_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1120_SDataSet ds = null;

        // DM Setting
    	IS_BAS_1120_SDM dm = new IS_BAS_1120_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1120_s(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1130_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1130_ADataSet ds = null;
    	
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));  
		String chrg_pers_seq = Util.checkString((String)hash.get("chrg_pers_seq"));  
		String chrg_pers = Util.checkString((String)hash.get("chrg_pers"));  
		String dty_cd = Util.checkString((String)hash.get("dty_cd"));  
		String chrg_clsf = Util.checkString((String)hash.get("chrg_clsf"));  
		String frdt = Util.checkString((String)hash.get("frdt"));  
		String todt = Util.checkString((String)hash.get("todt"));  
		String sub_srt_seqo = Util.checkString((String)hash.get("sub_srt_seqo"));  
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();
    	
		 // DM Setting
    	IS_BAS_1130_ADM dm = new IS_BAS_1130_ADM();
    	
    	dm.accflag = Util.checkString(req.getParameter("accflag"));
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
		dm.hdpt_cd = Util.checkString(req.getParameter("hdpt_cd"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.rslt_dept_cd = Util.checkString(req.getParameter("rslt_dept_cd"));
		dm.dept_rptv_addr = Util.checkString(req.getParameter("dept_rptv_addr"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.fax_no = Util.checkString(req.getParameter("fax_no"));
		dm.step = Util.checkString(req.getParameter("step"));
		dm.srt_seqo = Util.checkString(req.getParameter("srt_seqo"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		
		dm.setMode(mode.toUpperCase());
		dm.setChrg_pers_seq(chrg_pers_seq);
		dm.setChrg_pers(chrg_pers);
		dm.setDty_cd(dty_cd);
		dm.setChrg_clsf(chrg_clsf);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setSub_srt_seqo(sub_srt_seqo);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1130_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1140_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1140_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1140_LDM dm = new IS_BAS_1140_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1140_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1200_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1200_MDM dm = new IS_BAS_1200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1200_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1210_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1210_LDM dm = new IS_BAS_1210_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.leaf_now_chrg_pers = Util.checkString(req.getParameter("leaf_now_chrg_pers"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1210_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1220_ADataSet ds = null;
    	
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));  
		String dlco_clsf = Util.checkString((String)hash.get("dlco_clsf"));  
		String dlco_cd = Util.checkString((String)hash.get("dlco_cd"));  
		String dlco_seq = Util.checkString((String)hash.get("dlco_seq"));  
		String dept_cd = Util.checkString((String)hash.get("dept_cd"));  
		String sub_dept_cd = Util.checkString((String)hash.get("sub_dept_cd"));  
		String leaf_now_chrg_pers = Util.checkString((String)hash.get("leaf_now_chrg_pers")); 
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = req.getRemoteAddr();
    	
		 // DM Setting
    	IS_BAS_1220_ADM dm = new IS_BAS_1220_ADM();
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setMode(mode.toUpperCase());
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setDept_cd(dept_cd);
		dm.setSub_dept_cd(sub_dept_cd);
		dm.setLeaf_now_chrg_pers(leaf_now_chrg_pers);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1220_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1300_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1300_MDM dm = new IS_BAS_1300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1300_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1310_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1310_SDataSet ds = null;

        // DM Setting
    	IS_BAS_1310_SDM dm = new IS_BAS_1310_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1310_s(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1315_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1315_ADataSet ds = null;
    	
    	/**탭1.업체담당자**/
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String a_mode = Util.checkString((String)hash1.get("m"));
    	String a_dlco_chrg_pers_seq = Util.checkString((String)hash1.get("a_dlco_chrg_pers_seq"));
    	String a_chrg_job_clsf = Util.checkString((String)hash1.get("a_chrg_job_clsf"));
    	String a_chrg_pers_nm = Util.checkString((String)hash1.get("a_chrg_pers_nm"));
    	String a_dept = Util.checkString((String)hash1.get("a_dept"));
    	String a_posi = Util.checkString((String)hash1.get("a_posi"));
    	String a_ptph_no = Util.checkString((String)hash1.get("a_ptph_no"));
    	String a_tel_no_1 = Util.checkString((String)hash1.get("a_tel_no_1"));
    	String a_tel_no_2 = Util.checkString((String)hash1.get("a_tel_no_2"));
    	String a_fax_no = Util.checkString((String)hash1.get("a_fax_no"));
    	String a_email = Util.checkString((String)hash1.get("a_email"));
    	String a_tax_asp_id = Util.checkString((String)hash1.get("a_tax_asp_id"));
    	String a_kind_erplace_no = Util.checkString((String)hash1.get("a_kind_erplace_no"));
    	String a_remk_matt = Util.checkString((String)hash1.get("a_remk_matt"));

    	
    	/**탭2.계약자료**/
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
    	String b_mode = Util.checkString((String)hash2.get("m"));
    	String b_sale_item_cd = Util.checkString((String)hash2.get("b_sale_item_cd"));
    	String b_cntr_dt = Util.checkString((String)hash2.get("b_cntr_dt")); //거래시작일자
    	String b_expy_dt = Util.checkString((String)hash2.get("b_expy_dt")); //거래종료일자
    	String b_fst_clamt_mm = Util.checkString((String)hash2.get("b_fst_clamt_mm"));
    	String b_amt = Util.checkString((String)hash2.get("b_amt"));
    	String b_clamt_mthd_cd = Util.checkString((String)hash2.get("b_clamt_mthd_cd"));
    	String b_pay_cntr_clsf = Util.checkString((String)hash2.get("b_pay_cntr_clsf"));
    	String b_remk = Util.checkString((String)hash2.get("b_remk")); //비고
    	
    	
    	/**탭3.지로정보**/
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3")); 
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	
    	String c_mode = Util.checkString((String)hash3.get("m"));                       
    	String c_giro_seq = Util.checkString((String)hash3.get("c_giro_seq"));            
    	String c_giro_no = Util.checkString((String)hash3.get("c_giro_no"));              
    	String c_giro_clsf = Util.checkString((String)hash3.get("c_giro_clsf"));          
    	String c_aprv_no = Util.checkString((String)hash3.get("c_aprv_no"));              
    	String c_dnmn_pers = Util.checkString((String)hash3.get("c_dnmn_pers"));          
    	String c_bank_no = Util.checkString((String)hash3.get("c_bank_no"));              
    	String c_acct_no = Util.checkString((String)hash3.get("c_acct_no"));              
    	String c_deps_pers = Util.checkString((String)hash3.get("c_deps_pers"));    	    
    	String c_open_dt = Util.checkString((String)hash3.get("c_open_dt"));              
    	String c_cdatmaplc_dt = Util.checkString((String)hash3.get("c_cdatmaplc_dt"));    
    	String c_cdatmaprv_dt = Util.checkString((String)hash3.get("c_cdatmaprv_dt"));    
    	String c_cdatmacpn_dt = Util.checkString((String)hash3.get("c_cdatmacpn_dt"));    
    	
    	
    	/**탭4.인터넷전화**/
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4")); 
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	
    	String d_mode = Util.checkString((String)hash4.get("m"));
    	String d_intn_tel_seq = Util.checkString((String)hash4.get("d_intn_tel_seq"));
    	String d_estb_dt = Util.checkString((String)hash4.get("d_estb_dt"));
    	String d_mang_no = Util.checkString((String)hash4.get("d_mang_no"));
    	String d_tel_no = Util.checkString((String)hash4.get("d_tel_no"));
    	String d_use_yn = Util.checkString((String)hash4.get("d_use_yn"));
    	String d_remk = Util.checkString((String)hash4.get("d_remk")); //비고
    	
        // DM Setting
    	IS_BAS_1315_ADM dm = new IS_BAS_1315_ADM();
    	
    	/**탭1.업체담당자**/
    	dm.setA_mode(a_mode.toUpperCase());    
    	dm.setA_dlco_chrg_pers_seq(a_dlco_chrg_pers_seq);
    	dm.setA_chrg_job_clsf(a_chrg_job_clsf);
    	dm.setA_chrg_pers_nm(a_chrg_pers_nm);
    	dm.setA_dept(a_dept);
    	dm.setA_posi(a_posi);
    	dm.setA_ptph_no(a_ptph_no);
    	dm.setA_tel_no_1(a_tel_no_1);
    	dm.setA_tel_no_2(a_tel_no_2);
    	dm.setA_fax_no(a_fax_no);
    	dm.setA_email(a_email);
    	dm.setA_tax_asp_id(a_tax_asp_id);
    	dm.setA_kind_erplace_no(a_kind_erplace_no);
    	dm.setA_remk_matt(a_remk_matt);
    	
    	/**탭2.계약자료**/
    	dm.setB_mode(b_mode.toUpperCase());
    	dm.setB_sale_item_cd(b_sale_item_cd);
    	dm.setB_cntr_dt(b_cntr_dt);
    	dm.setB_expy_dt(b_expy_dt);
    	dm.setB_fst_clamt_mm(b_fst_clamt_mm);
    	dm.setB_amt(b_amt);
    	dm.setB_clamt_mthd_cd(b_clamt_mthd_cd);
    	dm.setB_pay_cntr_clsf(b_pay_cntr_clsf);
    	dm.setB_remk(b_remk);
    	
    	/**탭3.지로정보**/
    	dm.setC_mode(c_mode.toUpperCase());   
    	dm.setC_giro_seq(c_giro_seq); 
    	dm.setC_giro_no(c_giro_no);  
    	dm.setC_giro_clsf(c_giro_clsf);  
    	dm.setC_aprv_no(c_aprv_no);  
    	dm.setC_dnmn_pers(c_dnmn_pers);  
    	dm.setC_bank_no(c_bank_no);  
    	dm.setC_acct_no(c_acct_no);  
    	dm.setC_deps_pers(c_deps_pers);      	
    	dm.setC_open_dt(c_open_dt);       
    	dm.setC_cdatmaplc_dt(c_cdatmaplc_dt);  
    	dm.setC_cdatmaprv_dt(c_cdatmaprv_dt);  
    	dm.setC_cdatmacpn_dt(c_cdatmacpn_dt);  
    	
    	/**탭4.인터넷전화**/
    	dm.setD_mode(d_mode.toUpperCase());  
    	dm.setD_intn_tel_seq(d_intn_tel_seq);
    	dm.setD_estb_dt(d_estb_dt);
    	dm.setD_mang_no(d_mang_no);
    	dm.setD_tel_no(d_tel_no);
    	dm.setD_use_yn(d_use_yn);
    	dm.setD_remk(d_remk); 
    	
    	/**기본정보**/
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
		dm.use_sw = Util.checkString(req.getParameter("use_sw"));
		dm.leaf_open_chrg_pers = Util.checkString(req.getParameter("leaf_open_chrg_pers"));
		dm.leaf_now_chrg_pers = Util.checkString(req.getParameter("leaf_now_chrg_pers"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.bo_zip_1 = Util.checkString(req.getParameter("bo_zip_1"));
		dm.bo_zip_2 = Util.checkString(req.getParameter("bo_zip_2"));
		dm.bo_addr = Util.checkString(req.getParameter("bo_addr"));
		dm.bo_dtls_addr = Util.checkString(req.getParameter("bo_dtls_addr"));
		dm.hdqt_sell_dept_cd = Util.checkString(req.getParameter("hdqt_sell_dept_cd"));
		dm.hdqt_sell_sub_dept_cd = Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd"));
		dm.hdqt_sell_area_cd = Util.checkString(req.getParameter("hdqt_sell_area_cd"));
		dm.cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		dm.malig_yn = Util.checkString(req.getParameter("malig_yn"));
		dm.tax_stmt_cmpy_cd = Util.checkString(req.getParameter("tax_stmt_cmpy_cd"));
		dm.cu_acct_cd = Util.checkString(req.getParameter("cu_acct_cd")); //조우회계좌코드(2012.05.21)
		dm.cntr_dt = Util.checkString(req.getParameter("cntr_dt")); //거래시작일자
		dm.expy_dt = Util.checkString(req.getParameter("expy_dt")); //거래종료일자
		dm.leaf_sale_yn = Util.checkString(req.getParameter("leaf_sale_yn"));
		dm.leaf_purc_yn = Util.checkString(req.getParameter("leaf_purc_yn"));
		dm.dmang_bo_yn = Util.checkString(req.getParameter("dmang_bo_yn"));
		dm.outsd_leaf_cmpy_yn = Util.checkString(req.getParameter("outsd_leaf_cmpy_yn"));
		dm.vexc_cmpy_yn = Util.checkString(req.getParameter("vexc_cmpy_yn"));
		dm.design_cmpy_yn = Util.checkString(req.getParameter("design_cmpy_yn"));
		dm.excep_main_prt_plac_yn = Util.checkString(req.getParameter("excep_main_prt_plac_yn"));
		dm.isgrp_yn = Util.checkString(req.getParameter("isgrp_yn"));
		dm.sp_deal_yn = Util.checkString(req.getParameter("sp_deal_yn"));
		dm.jurs_dong_nm = Util.checkString(req.getParameter("jurs_dong_nm"));
		dm.jurs_apt = Util.checkString(req.getParameter("jurs_apt"));
		dm.leaf_addr = Util.checkString(req.getParameter("leaf_addr"));
		dm.adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		dm.adms_dstc_cd_nm = Util.checkString(req.getParameter("adms_dstc_cd_nm"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.asnt_dstc_cd_nm = Util.checkString(req.getParameter("asnt_dstc_cd_nm"));
		dm.dstc_seqo = Util.checkString(req.getParameter("dstc_seqo"));
		dm.srt_seqo = Util.checkString(req.getParameter("srt_seqo"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.send_qty = Util.checkString(req.getParameter("send_qty"));
		dm.acwr_rmsg_ptph = Util.checkString(req.getParameter("acwr_rmsg_ptph"));
		dm.hmpg = Util.checkString(req.getParameter("hmpg"));
		dm.remk = Util.checkString(req.getParameter("remk")); //비고
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.bizcond = Util.checkString(req.getParameter("bizcond"));
		dm.item = Util.checkString(req.getParameter("item"));
		dm.zip_1 = Util.checkString(req.getParameter("zip_1"));
		dm.zip_2 = Util.checkString(req.getParameter("zip_2"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.fax_no = Util.checkString(req.getParameter("fax_no"));
		dm.incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		
		/*
		dm.a_mode = Util.checkString(req.getParameter("a_mode"));
		dm.a_dlco_chrg_pers_seq = Util.checkString(req.getParameter("a_dlco_chrg_pers_seq"));
		dm.a_chrg_job_clsf = Util.checkString(req.getParameter("a_chrg_job_clsf"));
		dm.a_chrg_pers_nm = Util.checkString(req.getParameter("a_chrg_pers_nm"));
		dm.a_dept = Util.checkString(req.getParameter("a_dept"));
		dm.a_posi = Util.checkString(req.getParameter("a_posi"));
		dm.a_ptph_no = Util.checkString(req.getParameter("a_ptph_no"));
		dm.a_tel_no_1 = Util.checkString(req.getParameter("a_tel_no_1"));
		dm.a_tel_no_2 = Util.checkString(req.getParameter("a_tel_no_2"));
		dm.a_fax_no = Util.checkString(req.getParameter("a_fax_no"));
		dm.a_email = Util.checkString(req.getParameter("a_email"));
		dm.a_tax_asp_id = Util.checkString(req.getParameter("a_tax_asp_id"));
		dm.a_kind_erplace_no = Util.checkString(req.getParameter("a_kind_erplace_no"));
		dm.a_remk_matt = Util.checkString(req.getParameter("a_remk_matt"));
		dm.b_mode = Util.checkString(req.getParameter("b_mode"));
		dm.b_sale_item_cd = Util.checkString(req.getParameter("b_sale_item_cd"));
		dm.b_cntr_dt = Util.checkString(req.getParameter("b_cntr_dt"));
		dm.b_expy_dt = Util.checkString(req.getParameter("b_expy_dt"));
		dm.b_fst_clamt_mm = Util.checkString(req.getParameter("b_fst_clamt_mm"));
		dm.b_amt = Util.checkString(req.getParameter("b_amt"));
		dm.b_clamt_mthd_cd = Util.checkString(req.getParameter("b_clamt_mthd_cd"));
		dm.b_pay_cntr_clsf = Util.checkString(req.getParameter("b_pay_cntr_clsf"));
		dm.b_remk = Util.checkString(req.getParameter("b_remk"));
		dm.c_mode = Util.checkString(req.getParameter("c_mode"));
		dm.c_giro_seq = Util.checkString(req.getParameter("c_giro_seq"));
		dm.c_giro_no = Util.checkString(req.getParameter("c_giro_no"));
		dm.c_giro_clsf = Util.checkString(req.getParameter("c_giro_clsf"));
		dm.c_aprv_no = Util.checkString(req.getParameter("c_aprv_no"));
		dm.c_dnmn_pers = Util.checkString(req.getParameter("c_dnmn_pers"));
		dm.c_bank_no = Util.checkString(req.getParameter("c_bank_no"));
		dm.c_acct_no = Util.checkString(req.getParameter("c_acct_no"));
		dm.c_deps_pers = Util.checkString(req.getParameter("c_deps_pers"));
		dm.c_open_dt = Util.checkString(req.getParameter("c_open_dt"));
		dm.c_cdatmaplc_dt = Util.checkString(req.getParameter("c_cdatmaplc_dt"));
		dm.c_cdatmaprv_dt = Util.checkString(req.getParameter("c_cdatmaprv_dt"));
		dm.c_cdatmacpn_dt = Util.checkString(req.getParameter("c_cdatmacpn_dt"));
		dm.d_mode = Util.checkString(req.getParameter("d_mode"));
		dm.d_intn_tel_seq = Util.checkString(req.getParameter("d_intn_tel_seq"));
		dm.d_estb_dt = Util.checkString(req.getParameter("d_estb_dt"));
		dm.d_mang_no = Util.checkString(req.getParameter("d_mang_no"));
		dm.d_tel_no = Util.checkString(req.getParameter("d_tel_no"));
		dm.d_use_yn = Util.checkString(req.getParameter("d_use_yn"));
		dm.d_remk = Util.checkString(req.getParameter("d_remk"));
		*/
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1315_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1400_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1400_MDM dm = new IS_BAS_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1400_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1410_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1410_LDM dm = new IS_BAS_1410_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_cd_seq_fr = Util.checkString(req.getParameter("dlco_cd_seq_fr"));
		dm.dlco_cd_seq_to = Util.checkString(req.getParameter("dlco_cd_seq_to"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		dm.leaf_sale_yn = Util.checkString(req.getParameter("leaf_sale_yn"));
		dm.leaf_purc_yn = Util.checkString(req.getParameter("leaf_purc_yn"));
		dm.dmang_bo_yn = Util.checkString(req.getParameter("dmang_bo_yn"));
		dm.outsd_leaf_cmpy_yn = Util.checkString(req.getParameter("outsd_leaf_cmpy_yn"));
		dm.vexc_cmpy_yn = Util.checkString(req.getParameter("vexc_cmpy_yn"));
		dm.design_cmpy_yn = Util.checkString(req.getParameter("design_cmpy_yn"));
		dm.excep_main_prt_plac_yn = Util.checkString(req.getParameter("excep_main_prt_plac_yn"));
		dm.isgrp_yn = Util.checkString(req.getParameter("isgrp_yn"));
		dm.sp_deal_yn = Util.checkString(req.getParameter("sp_deal_yn"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1410_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1500_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1500_MDM dm = new IS_BAS_1500_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1510_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1510_LDM dm = new IS_BAS_1510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.advcs_nm = Util.checkString(req.getParameter("advcs_nm"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1520_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1520_SDataSet ds = null;

        // DM Setting
    	IS_BAS_1520_SDM dm = new IS_BAS_1520_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1520_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1530_ADataSet ds = null;

        // DM Setting
    	IS_BAS_1530_ADM dm = new IS_BAS_1530_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.advcs_nm = Util.checkString(req.getParameter("advcs_nm"));
		dm.eps_no = Util.checkString(req.getParameter("eps_no"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.fax_no = Util.checkString(req.getParameter("fax_no"));
		dm.sms_ptph_no = Util.checkString(req.getParameter("sms_ptph_no"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
		dm.zip_1 = Util.checkString(req.getParameter("zip_1"));
		dm.zip_2 = Util.checkString(req.getParameter("zip_2"));
		dm.bizcond = Util.checkString(req.getParameter("bizcond"));
		dm.item = Util.checkString(req.getParameter("item"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1530_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1600_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1600_MDM dm = new IS_BAS_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));    	
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1600_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1610_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1610_LDM dm = new IS_BAS_1610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_cd_seq = Util.checkString(req.getParameter("dlco_cd_seq"));
		dm.adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1700_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1700_MDM dm = new IS_BAS_1700_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));    	
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1700_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1710_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1710_LDM dm = new IS_BAS_1710_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_cd_seq = Util.checkString(req.getParameter("dlco_cd_seq"));
		dm.adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1800_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1800_MDM dm = new IS_BAS_1800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1800_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1810_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1810_LDM dm = new IS_BAS_1810_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1810_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1820_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1820_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1820_LDM dm = new IS_BAS_1820_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1820_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1830_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1830_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));  
		String decid_pers = Util.checkString((String)hash.get("decid_pers"));
		String decid_pers_dty_cd = Util.checkString((String)hash.get("decid_pers_dty_cd"));
		String aprv_step_yn = Util.checkString((String)hash.get("aprv_step_yn"));
		String decid_pre_seq = Util.checkString((String)hash.get("decid_pre_seq"));
		
        // DM Setting
    	IS_BAS_1830_ADM dm = new IS_BAS_1830_ADM();
    	
    	dm.setMode(mode.toUpperCase());
    	dm.setDecid_pers(decid_pers);
    	dm.setDecid_pers_dty_cd(decid_pers_dty_cd);
    	dm.setAprv_step_yn(aprv_step_yn);
    	dm.setDecid_pre_seq(decid_pre_seq);
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1830_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1900_MDataSet ds = null;

        // DM Setting
    	IS_BAS_1900_MDM dm = new IS_BAS_1900_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1900_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1910_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1910_LDM dm = new IS_BAS_1910_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.year = Util.checkString(req.getParameter("year")).substring(0, 4);;
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1910_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1920_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1920_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));  
		String trgt_mm = Util.checkString((String)hash.get("trgt_mm"));
		String chrg_pers = Util.checkString((String)hash.get("chrg_pers"));
		String sale_clsf = Util.checkString((String)hash.get("sale_clsf"));
		String dept_cd = Util.checkString((String)hash.get("dept_cd"));
		String sub_dept_cd = Util.checkString((String)hash.get("sub_dept_cd"));
		String trgt_sale_amt = Util.checkString((String)hash.get("trgt_sale_amt"));
		String remk = Util.checkString((String)hash.get("remk"));
    	
        // DM Setting
    	IS_BAS_1920_ADM dm = new IS_BAS_1920_ADM();
    	
    	dm.setMode(mode.toUpperCase());
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.year = Util.checkString(req.getParameter("year")).substring(0, 4);
    	dm.setTrgt_mm(trgt_mm);
    	dm.setChrg_pers(chrg_pers);
    	dm.setSale_clsf(sale_clsf);
    	dm.setDept_cd(dept_cd);
    	dm.setSub_dept_cd(sub_dept_cd);
    	dm.setTrgt_sale_amt(trgt_sale_amt);
    	dm.setRemk(remk);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1920_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_1930_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_1930_LDataSet ds = null;

        // DM Setting
    	IS_BAS_1930_LDM dm = new IS_BAS_1930_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.year = Util.checkString(req.getParameter("year")).substring(0, 4);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_1930_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2000_MDataSet ds = null;

        // DM Setting
    	IS_BAS_2000_MDM dm = new IS_BAS_2000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2000_m(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2010_LDataSet ds = null;

        // DM Setting
    	IS_BAS_2010_LDM dm = new IS_BAS_2010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.year = Util.checkString(req.getParameter("year")).substring(0, 4);;
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2010_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2020_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));  
		String trgt_mm = Util.checkString((String)hash.get("trgt_mm"));
		String chrg_pers = Util.checkString((String)hash.get("chrg_pers"));
		String dept_cd = Util.checkString((String)hash.get("dept_cd"));
		String sub_dept_cd = Util.checkString((String)hash.get("sub_dept_cd"));
		String trgt_clamt = Util.checkString((String)hash.get("trgt_clamt"));
		String remk = Util.checkString((String)hash.get("remk"));
    	
        // DM Setting
    	IS_BAS_2020_ADM dm = new IS_BAS_2020_ADM();
    	
    	dm.setMode(mode.toUpperCase());
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.year = Util.checkString(req.getParameter("year")).substring(0, 4);
    	dm.setTrgt_mm(trgt_mm);
    	dm.setChrg_pers(chrg_pers);
    	dm.setDept_cd(dept_cd);
    	dm.setSub_dept_cd(sub_dept_cd);
    	dm.setTrgt_clamt(trgt_clamt);
    	dm.setRemk(remk);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2020_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2030_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2030_LDataSet ds = null;

        // DM Setting
    	IS_BAS_2030_LDM dm = new IS_BAS_2030_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.year = Util.checkString(req.getParameter("year")).substring(0, 4);;
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2030_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2040_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2040_LDataSet ds = null;

        // DM Setting
    	IS_BAS_2040_LDM dm = new IS_BAS_2040_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.yymm = Util.checkString(req.getParameter("yymm"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2040_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2050_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2050_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
		String chrg_pers = Util.checkString((String)hash.get("chrg_pers"));
		String dept_cd = Util.checkString((String)hash.get("dept_cd"));
		String sub_dept_cd = Util.checkString((String)hash.get("sub_dept_cd"));
		String trgt_clamt = Util.checkString((String)hash.get("trgt_clamt"));
		String remk = Util.checkString((String)hash.get("remk"));
    	
        // DM Setting
    	IS_BAS_2050_ADM dm = new IS_BAS_2050_ADM();
    	
    	dm.accflag = Util.checkString(req.getParameter("accflag"));
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.trgt_yymm = Util.checkString(req.getParameter("trgt_yymm"));
    	dm.setChrg_pers(chrg_pers);
    	dm.setDept_cd(dept_cd);
    	dm.setSub_dept_cd(sub_dept_cd);
    	dm.setTrgt_clamt(trgt_clamt);
    	dm.setRemk(remk);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2050_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2100_MDataSet ds = null;

        // DM Setting
    	IS_BAS_2100_MDM dm = new IS_BAS_2100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_2100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2110_LDataSet ds = null;

        // DM Setting
    	IS_BAS_2110_LDM dm = new IS_BAS_2110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_reg_dt = Util.checkString(req.getParameter("fr_reg_dt"));
		dm.to_reg_dt = Util.checkString(req.getParameter("to_reg_dt"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2110_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2120_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
		String mode = Util.checkString((String)hash.get("m"));
    	String reg_dt = Util.checkString((String)hash.get("reg_dt"));
    	String boks_re_resn_clsf = Util.checkString((String)hash.get("boks_re_resn_clsf"));
		String frdt = Util.checkString((String)hash.get("frdt"));
		String todt = Util.checkString((String)hash.get("todt"));
		String chrg_pers = Util.checkString((String)hash.get("chrg_pers"));
		String resn = Util.checkString((String)hash.get("resn"));
		String reg_seq = Util.checkString((String)hash.get("reg_seq"));
    	
        // DM Setting
    	IS_BAS_2120_ADM dm = new IS_BAS_2120_ADM();
    	
    	dm.setMode(mode.toUpperCase());
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setReg_dt(reg_dt);
    	dm.setBoks_re_resn_clsf(boks_re_resn_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setChrg_pers(chrg_pers);
    	dm.setResn(resn);
    	dm.setReg_seq(reg_seq);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2120_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2200_MDataSet ds = null;

        // DM Setting
    	IS_BAS_2200_MDM dm = new IS_BAS_2200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_2200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2210_LDataSet ds = null;

        // DM Setting
    	IS_BAS_2210_LDM dm = new IS_BAS_2210_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.leaf_now_chrg_pers = Util.checkString(req.getParameter("leaf_now_chrg_pers"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2210_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2220_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
		String mode = Util.checkString((String)hash.get("m"));
		String send_qty = Util.checkString((String)hash.get("send_qty"));
    	String dlco_clsf = Util.checkString((String)hash.get("dlco_clsf"));
    	String dlco_cd = Util.checkString((String)hash.get("dlco_cd"));
		String dlco_seq = Util.checkString((String)hash.get("dlco_seq"));
    	
        // DM Setting
    	IS_BAS_2220_ADM dm = new IS_BAS_2220_ADM();
    	
    	dm.setMode(mode.toUpperCase());
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setSend_qty(send_qty);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_cd(dlco_cd);
    	dm.setDlco_seq(dlco_seq);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2220_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2300_MDataSet ds = null;

        // DM Setting
    	IS_BAS_2300_MDM dm = new IS_BAS_2300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_2300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2310_LDataSet ds = null;

        // DM Setting
    	IS_BAS_2310_LDM dm = new IS_BAS_2310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq")); //사용안함
		dm.adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd")); //사용안함
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.leaf_now_chrg_pers = Util.checkString(req.getParameter("leaf_now_chrg_pers")); //사용안함
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2310_l(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2320_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
		String mode = Util.checkString((String)hash.get("m"));
		String asnt_dstc_cd_aft = Util.checkString((String)hash.get("asnt_dstc_cd_aft"));
		String dstc_seqo_aft = Util.checkString((String)hash.get("dstc_seqo_aft"));
    	String dlco_clsf = Util.checkString((String)hash.get("dlco_clsf"));
    	String dlco_cd = Util.checkString((String)hash.get("dlco_cd"));
		String dlco_seq = Util.checkString((String)hash.get("dlco_seq"));
    	
        // DM Setting
    	IS_BAS_2320_ADM dm = new IS_BAS_2320_ADM();
    	
    	dm.setMode(mode.toUpperCase());
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setAsnt_dstc_cd_aft(asnt_dstc_cd_aft);
    	dm.setDstc_seqo_aft(dstc_seqo_aft);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_cd(dlco_cd);
    	dm.setDlco_seq(dlco_seq);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2320_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bas_2400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BAS_2400_MDataSet ds = null;

        // DM Setting
    	IS_BAS_2400_MDM dm = new IS_BAS_2400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
            ds = dao.is_bas_2400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void is_bas_2410_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		IS_BAS_2410_ADataSet ds = null;
		
		// DM Setting
		IS_BAS_2410_ADM dm = new IS_BAS_2410_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.bddb_clsf1 = Util.checkString(req.getParameter("bddb_clsf1"));
		dm.bddb_clsf2 = Util.checkString(req.getParameter("bddb_clsf2"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
        try {
        	IsBas1000DAO dao = new IsBas1000DAO();
        	ds = dao.is_bas_2410_a(dm) ;
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }				
	}    
    
}
