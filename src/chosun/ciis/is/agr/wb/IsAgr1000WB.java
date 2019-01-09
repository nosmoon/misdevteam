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

package chosun.ciis.is.agr.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.agr.dao.IsAgr1000DAO;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsAgr1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_agr_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1000_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1000_MDM dm = new IS_AGR_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1000_m(dm);
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
    public void is_agr_1010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1010_SDataSet ds = null;

        // DM Setting
    	IS_AGR_1010_SDM dm = new IS_AGR_1010_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
		dm.acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1010_s(dm);
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
    public void is_agr_1015_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1015_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	
        // DM Setting
    	IS_AGR_1015_ADM dm = new IS_AGR_1015_ADM();
    	
    	dm.flag = Util.checkString(req.getParameter("flag"));
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
		dm.acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
		dm.rvord_dt = Util.checkString(req.getParameter("rvord_dt"));
		dm.scat_dt = Util.checkString(req.getParameter("scat_dt"));
		dm.rvord_type = Util.checkString(req.getParameter("rvord_type"));
		dm.advcs_tel_no = Util.checkString(req.getParameter("advcs_tel_no"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.advcs_cd_nm = Util.checkString(req.getParameter("advcs_cd_nm"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.indt_cd_nm = Util.checkString(req.getParameter("indt_cd_nm"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.std_cd_nm = Util.checkString(req.getParameter("std_cd_nm"));
		dm.sms_send_req_yn = Util.checkString(req.getParameter("sms_send_req_yn"));
		dm.sms_ptph_no = Util.checkString(req.getParameter("sms_ptph_no"));
		dm.prof_docu_clsf = Util.checkString(req.getParameter("prof_docu_clsf"));
		dm.trust_letter_resn = Util.checkString(req.getParameter("trust_letter_resn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.chrg_pers_nm = Util.checkString(req.getParameter("chrg_pers_nm"));
		dm.vatclsf = Util.checkString(req.getParameter("vatclsf"));
		dm.rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
		dm.uprc_clsf = Util.checkString(req.getParameter("uprc_clsf"));
		dm.qunt = Util.checkString(req.getParameter("qunt"));
		dm.std_uprc = Util.checkString(req.getParameter("std_uprc"));
		dm.uprc = Util.checkString(req.getParameter("uprc"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.tot_rvord_amt = Util.checkString(req.getParameter("tot_rvord_amt"));
		dm.suply_pers_erplace_cd = Util.checkString(req.getParameter("suply_pers_erplace_cd"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.feed_req_matt = Util.checkString(req.getParameter("feed_req_matt"));
		dm.fix_yn = Util.checkString(req.getParameter("fix_yn"));
		dm.isewh_yn = Util.checkString(req.getParameter("isewh_yn"));
		dm.bnch_qty = Util.checkString(req.getParameter("bnch_qty"));
		dm.reg_point_unrcp_pass_dds = Util.checkString(req.getParameter("reg_point_unrcp_pass_dds"));
		dm.reg_point_unrcp_amt = Util.checkString(req.getParameter("reg_point_unrcp_amt"));
		dm.deal_resn = Util.checkString(req.getParameter("deal_resn"));
		dm.clamt_mthd = Util.checkString(req.getParameter("clamt_mthd"));
		dm.clamt_plan_dt = Util.checkString(req.getParameter("clamt_plan_dt")); 	/**수금예정일자**/
		dm.no_purc_yn = Util.checkString(req.getParameter("no_purc_yn")); 	/**배포내역없음.**/
		
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
    	String a_mode = Util.checkString((String)hash1.get("m"));
    	String a_asnt_dstc_cd = Util.checkString((String)hash1.get("a_asnt_dstc_cd"));
    	String a_dlco_clsf_cd_seq = Util.checkString((String)hash1.get("a_dlco_clsf_cd_seq"));
    	String a_purc_clsf = Util.checkString((String)hash1.get("a_purc_clsf"));
    	String a_uprc = Util.checkString((String)hash1.get("a_uprc"));
    	String a_send_qty = Util.checkString((String)hash1.get("a_send_qty"));    
    	String a_send_rate = Util.checkString((String)hash1.get("a_send_rate"));   /**배정율**/ 
    	String a_qunt = Util.checkString((String)hash1.get("a_qunt"));
    	String a_purc_amt = Util.checkString((String)hash1.get("a_purc_amt"));
    	String a_trc_yn = Util.checkString((String)hash1.get("a_trc_yn"));
    	String a_send_yn = Util.checkString((String)hash1.get("a_send_yn"));
    	String a_remk = Util.checkString((String)hash1.get("a_remk"));
    	String a_purc_reg_dt = Util.checkString((String)hash1.get("a_purc_reg_dt"));
    	String a_purc_reg_seq = Util.checkString((String)hash1.get("a_purc_reg_seq"));
		
    	dm.setA_mode(a_mode.toUpperCase());
    	dm.setA_asnt_dstc_cd(a_asnt_dstc_cd);
    	dm.setA_dlco_clsf_cd_seq(a_dlco_clsf_cd_seq);
    	dm.setA_purc_clsf(a_purc_clsf);
    	dm.setA_uprc(a_uprc);
    	dm.setA_send_qty(a_send_qty);
    	dm.setA_send_rate(a_send_rate); /**배정율**/
    	dm.setA_qunt(a_qunt);
    	dm.setA_purc_amt(a_purc_amt);
    	dm.setA_trc_yn(a_trc_yn);
    	dm.setA_send_yn(a_send_yn);
    	dm.setA_remk(a_remk);
    	dm.setA_purc_reg_dt(a_purc_reg_dt);
    	dm.setA_purc_reg_seq(a_purc_reg_seq);
    	dm.print();
    	/*
    	dm.setA_mode(a_mode.toUpperCase());    
    	dm.setA_purc_reg_dt(a_purc_reg_dt);
    	dm.setA_purc_reg_seq(a_purc_reg_seq);
    	dm.setA_asnt_dstc_cd(a_asnt_dstc_cd);
    	dm.setA_dlco_clsf_cd_seq(a_dlco_clsf_cd_seq);
    	dm.setA_purc_clsf(a_purc_clsf);
    	dm.setA_uprc(a_uprc);    	
    	dm.setA_send_qty(a_send_qty);    	
    	dm.setA_qunt(a_qunt);
    	dm.setA_purc_amt(a_purc_amt);
    	dm.setA_trc_yn(a_trc_yn);
    	dm.setA_send_yn(a_send_yn);
    	dm.setA_remk(a_remk);
    	dm.print();
     	*/
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1015_a(dm);
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
    public void is_agr_1030_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1030_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1030_LDM dm = new IS_AGR_1030_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd")); /**구역코드**/
    	dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1030_l(dm);
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
    public void is_agr_1031_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1031_SDataSet ds = null;

        // DM Setting
    	IS_AGR_1031_SDM dm = new IS_AGR_1031_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
    	dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1031_s(dm);
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
    public void is_agr_1032_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1032_SDataSet ds = null;

        // DM Setting
    	IS_AGR_1032_SDM dm = new IS_AGR_1032_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.uprc_clsf = Util.checkString(req.getParameter("uprc_clsf"));
    	dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1032_s(dm);
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
    public void is_agr_1040_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1040_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1040_LDM dm = new IS_AGR_1040_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.rvord_type = Util.checkString(req.getParameter("rvord_type"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1040_l(dm);
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
    public void is_agr_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1100_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1100_MDM dm = new IS_AGR_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1100_m(dm);
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
    public void is_agr_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1110_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1110_LDM dm = new IS_AGR_1110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.rvord_type = Util.checkString(req.getParameter("rvord_type"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.suply_pers_erplace_cd = Util.checkString(req.getParameter("suply_pers_erplace_cd"));
		dm.fix_yn = Util.checkString(req.getParameter("fix_yn"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1110_l(dm);
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
    public void is_agr_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1200_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1200_MDM dm = new IS_AGR_1200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1200_m(dm);
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
    public void is_agr_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1310_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1310_LDM dm = new IS_AGR_1310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1310_l(dm);
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
    public void is_agr_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1320_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1320_LDM dm = new IS_AGR_1320_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1320_l(dm);
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
    public void is_agr_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1400_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1400_MDM dm = new IS_AGR_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1400_m(dm);
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
    public void is_agr_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1410_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1410_LDM dm = new IS_AGR_1410_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1410_l(dm);
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
    public void is_agr_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1420_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1420_LDM dm = new IS_AGR_1420_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1420_l(dm);
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
    public void is_agr_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1510_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1510_LDM dm = new IS_AGR_1510_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1510_l(dm);
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
    public void is_agr_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1600_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1600_MDM dm = new IS_AGR_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1600_m(dm);
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
    public void is_agr_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1610_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1610_LDM dm = new IS_AGR_1610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.cmpy_div = Util.checkString(req.getParameter("cmpy_div"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1610_l(dm);
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
    public void is_agr_1620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1620_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1620_LDM dm = new IS_AGR_1620_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.scat_dt_year = Util.checkString(req.getParameter("scat_dt_year"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1620_l(dm);
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
    public void is_agr_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1700_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1700_MDM dm = new IS_AGR_1700_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1700_m(dm);
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
    public void is_agr_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1710_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1710_LDM dm = new IS_AGR_1710_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.cmpy_div = Util.checkString(req.getParameter("cmpy_div"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1710_l(dm);
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
    public void is_agr_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1800_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1800_MDM dm = new IS_AGR_1800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1800_m(dm);
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
    public void is_agr_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1810_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1810_LDM dm = new IS_AGR_1810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1810_l(dm);
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
    public void is_agr_1820_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1820_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1820_LDM dm = new IS_AGR_1820_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1820_l(dm);
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
    public void is_agr_1830_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1830_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1830_LDM dm = new IS_AGR_1830_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1830_l(dm);
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
    public void is_agr_1840_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1840_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1840_LDM dm = new IS_AGR_1840_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1840_l(dm);
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
    public void is_agr_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1900_MDataSet ds = null;

        // DM Setting
    	IS_AGR_1900_MDM dm = new IS_AGR_1900_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1900_m(dm);
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
    public void is_agr_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1910_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1910_LDM dm = new IS_AGR_1910_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1910_l(dm);
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
    public void is_agr_1920_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1920_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1920_LDM dm = new IS_AGR_1920_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1920_l(dm);
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
    public void is_agr_1930_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1930_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1930_LDM dm = new IS_AGR_1930_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1930_l(dm);
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
    public void is_agr_1940_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_1940_LDataSet ds = null;

        // DM Setting
    	IS_AGR_1940_LDM dm = new IS_AGR_1940_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_1940_l(dm);
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
    public void is_agr_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2000_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2000_MDM dm = new IS_AGR_2000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2000_m(dm);
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
    public void is_agr_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2010_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2010_LDM dm = new IS_AGR_2010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2010_l(dm);
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
    public void is_agr_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2100_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2100_MDM dm = new IS_AGR_2100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2100_m(dm);
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
    public void is_agr_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2110_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2110_LDM dm = new IS_AGR_2110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2110_l(dm);
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
    public void is_agr_2120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2120_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2120_LDM dm = new IS_AGR_2120_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2120_l(dm);
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
    public void is_agr_2200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2200_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2200_MDM dm = new IS_AGR_2200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2200_m(dm);
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
    public void is_agr_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2210_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2210_LDM dm = new IS_AGR_2210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2210_l(dm);
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
    public void is_agr_2220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2220_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2220_LDM dm = new IS_AGR_2220_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2220_l(dm);
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
    public void is_agr_2300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2300_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2300_MDM dm = new IS_AGR_2300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2300_m(dm);
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
    public void is_agr_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2310_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2310_LDM dm = new IS_AGR_2310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2310_l(dm);
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
    public void is_agr_2320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2320_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2320_LDM dm = new IS_AGR_2320_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2320_l(dm);
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
    public void is_agr_2330_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2330_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2330_LDM dm = new IS_AGR_2330_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2330_l(dm);
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
    public void is_agr_2400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2400_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2400_MDM dm = new IS_AGR_2400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2400_m(dm);
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
    public void is_agr_2410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2410_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2410_LDM dm = new IS_AGR_2410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2410_l(dm);
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
    public void is_agr_2420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2420_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2420_LDM dm = new IS_AGR_2420_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2420_l(dm);
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
    public void is_agr_2430_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2430_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2430_LDM dm = new IS_AGR_2430_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2430_l(dm);
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
    public void is_agr_2440_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2440_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2440_LDM dm = new IS_AGR_2440_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2440_l(dm);
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
    public void is_agr_2610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2610_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2610_LDM dm = new IS_AGR_2610_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2610_l(dm);
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
    public void is_agr_2700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2700_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2700_MDM dm = new IS_AGR_2700_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2700_m(dm);
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
    public void is_agr_2710_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2710_SDataSet ds = null;

        // DM Setting
    	IS_AGR_2710_SDM dm = new IS_AGR_2710_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_ask_reg_dt = Util.checkString(req.getParameter("make_ask_reg_dt"));
		dm.make_ask_reg_seq = Util.checkString(req.getParameter("make_ask_reg_seq"));
		dm.acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
		dm.acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2710_s(dm);
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
    public void is_agr_2715_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2715_ADataSet ds = null;

        // DM Setting
    	IS_AGR_2715_ADM dm = new IS_AGR_2715_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_ask_reg_dt = Util.checkString(req.getParameter("make_ask_reg_dt"));
		dm.make_ask_reg_seq = Util.checkString(req.getParameter("make_ask_reg_seq"));
		dm.acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
		dm.acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
		dm.dlco_chrg_pers_nm = Util.checkString(req.getParameter("dlco_chrg_pers_nm"));
		dm.dlco_chrg_pers_cntc_plac = Util.checkString(req.getParameter("dlco_chrg_pers_cntc_plac"));
		dm.dlco_chrg_pers_email = Util.checkString(req.getParameter("dlco_chrg_pers_email"));
		dm.dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.dlvs_plac_addr = Util.checkString(req.getParameter("dlvs_plac_addr"));
		dm.clr_cd = Util.checkString(req.getParameter("clr_cd"));
		dm.prt_paper_cd = Util.checkString(req.getParameter("prt_paper_cd"));
		dm.incmp_design_yn = Util.checkString(req.getParameter("incmp_design_yn"));
		dm.advcs_make_yn = Util.checkString(req.getParameter("advcs_make_yn"));
		dm.pcnt_clsf = Util.checkString(req.getParameter("pcnt_clsf"));
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.prt_plan_dt = Util.checkString(req.getParameter("prt_plan_dt"));
		dm.prz_rate_clsf = Util.checkString(req.getParameter("prz_rate_clsf"));
		dm.prz_amt = Util.checkString(req.getParameter("prz_amt"));
		dm.prz_phb_saly_boks = Util.checkString(req.getParameter("prz_phb_saly_boks"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2715_a(dm);
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
    public void is_agr_2800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2800_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2800_MDM dm = new IS_AGR_2800_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2800_m(dm);
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
    public void is_agr_2810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2810_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2810_LDM dm = new IS_AGR_2810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_ask_reg_dt_fr = Util.checkString(req.getParameter("make_ask_reg_dt_fr"));
		dm.make_ask_reg_dt_to = Util.checkString(req.getParameter("make_ask_reg_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlvs_dt_fr = Util.checkString(req.getParameter("dlvs_dt_fr"));
		dm.dlvs_dt_to = Util.checkString(req.getParameter("dlvs_dt_to"));
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.clr_cd = Util.checkString(req.getParameter("clr_cd"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2810_l(dm);
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
    public void is_agr_2900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2900_MDataSet ds = null;

        // DM Setting
    	IS_AGR_2900_MDM dm = new IS_AGR_2900_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2900_m(dm);
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
    public void is_agr_2910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2910_LDataSet ds = null;

        // DM Setting
    	IS_AGR_2910_LDM dm = new IS_AGR_2910_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rcpm_dt_fr = Util.checkString(req.getParameter("rcpm_dt_fr"));
		dm.rcpm_dt_to = Util.checkString(req.getParameter("rcpm_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlvs_dt_fr = Util.checkString(req.getParameter("dlvs_dt_fr"));
		dm.dlvs_dt_to = Util.checkString(req.getParameter("dlvs_dt_to"));
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.clr_cd = Util.checkString(req.getParameter("clr_cd"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2910_l(dm);
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
    public void is_agr_2920_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_2920_ADataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String mode = Util.checkString((String)hash1.get("m"));
    	String make_ask_reg_dt = Util.checkString((String)hash1.get("make_ask_reg_dt"));
    	String make_ask_reg_seq = Util.checkString((String)hash1.get("make_ask_reg_seq"));
    	String prz_amt = Util.checkString((String)hash1.get("prz_amt"));
    	String prz_phb_saly_boks = Util.checkString((String)hash1.get("prz_phb_saly_boks"));
    	
        // DM Setting
    	IS_AGR_2920_ADM dm = new IS_AGR_2920_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setMode(mode.toUpperCase());    
    	dm.setMake_ask_reg_dt(make_ask_reg_dt);
    	dm.setMake_ask_reg_seq(make_ask_reg_seq);
    	dm.setPrz_amt(prz_amt);
    	dm.setPrz_phb_saly_boks(prz_phb_saly_boks);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_2920_a(dm);
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
    public void is_agr_3100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_3100_MDataSet ds = null;

        // DM Setting
    	IS_AGR_3100_MDM dm = new IS_AGR_3100_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_3100_m(dm);
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
    public void is_agr_3110_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_3110_SDataSet ds = null;

        // DM Setting
    	IS_AGR_3110_SDM dm = new IS_AGR_3110_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_ask_reg_dt = Util.checkString(req.getParameter("make_ask_reg_dt"));
		dm.make_ask_reg_seq = Util.checkString(req.getParameter("make_ask_reg_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_3110_s(dm);
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
    public void is_agr_3115_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_3115_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String a_mode = Util.checkString((String)hash1.get("m"));
    	String a_make_ask_dtls_seq = Util.checkString((String)hash1.get("a_make_ask_dtls_seq"));
    	String a_dlco_clsf_cd_seq = Util.checkString((String)hash1.get("a_dlco_clsf_cd_seq"));
    	String a_purc_clsf = Util.checkString((String)hash1.get("a_purc_clsf"));
    	String a_uprc = Util.checkString((String)hash1.get("a_uprc"));
    	String a_qunt = Util.checkString((String)hash1.get("a_qunt"));
    	String a_purc_amt = Util.checkString((String)hash1.get("a_purc_amt"));
    	String a_stmt_recp_yn = Util.checkString((String)hash1.get("a_stmt_recp_yn"));
    	String a_remk = Util.checkString((String)hash1.get("a_remk"));
    	
        // DM Setting
    	IS_AGR_3115_ADM dm = new IS_AGR_3115_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_ask_reg_dt = Util.checkString(req.getParameter("make_ask_reg_dt"));
		dm.make_ask_reg_seq = Util.checkString(req.getParameter("make_ask_reg_seq"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.dlco_chrg_pers_nm = Util.checkString(req.getParameter("dlco_chrg_pers_nm"));
		dm.dlco_chrg_pers_cntc_plac = Util.checkString(req.getParameter("dlco_chrg_pers_cntc_plac"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.draft_end_dt = Util.checkString(req.getParameter("draft_end_dt"));
		dm.dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
		dm.acwr_incmg_dt_tm = Util.checkString(req.getParameter("acwr_incmg_dt_tm"));
		dm.work_kind = Util.checkString(req.getParameter("work_kind"));
		dm.make_clsf = Util.checkString(req.getParameter("make_clsf"));
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.clr_cd = Util.checkString(req.getParameter("clr_cd"));
		dm.prt_paper = Util.checkString(req.getParameter("prt_paper"));
		dm.rvord_qunt = Util.checkString(req.getParameter("rvord_qunt"));
		dm.rvord_uprc = Util.checkString(req.getParameter("rvord_uprc"));
		dm.rvord_amt = Util.checkString(req.getParameter("rvord_amt"));
		dm.dlvs_plac = Util.checkString(req.getParameter("dlvs_plac"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.chrg_pers_tel_no = Util.checkString(req.getParameter("chrg_pers_tel_no"));
		dm.plan_chrg_ptph_no = Util.checkString(req.getParameter("plan_chrg_ptph_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.setA_mode(a_mode.toUpperCase());    
    	dm.setA_make_ask_dtls_seq(a_make_ask_dtls_seq);
    	dm.setA_dlco_clsf_cd_seq(a_dlco_clsf_cd_seq);
    	dm.setA_purc_clsf(a_purc_clsf);
    	dm.setA_uprc(a_uprc);
    	dm.setA_qunt(a_qunt);
    	dm.setA_purc_amt(a_purc_amt);
    	dm.setA_stmt_recp_yn(a_stmt_recp_yn);
    	dm.setA_remk(a_remk);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_3115_a(dm);
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
    public void is_agr_3200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_3200_MDataSet ds = null;

        // DM Setting
    	IS_AGR_3200_MDM dm = new IS_AGR_3200_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_3200_m(dm);
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
    public void is_agr_3210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_3210_LDataSet ds = null;

        // DM Setting
    	IS_AGR_3210_LDM dm = new IS_AGR_3210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_ask_reg_dt_fr = Util.checkString(req.getParameter("make_ask_reg_dt_fr"));
		dm.make_ask_reg_dt_to = Util.checkString(req.getParameter("make_ask_reg_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlvs_dt_fr = Util.checkString(req.getParameter("dlvs_dt_fr"));
		dm.dlvs_dt_to = Util.checkString(req.getParameter("dlvs_dt_to"));
		dm.work_kind = Util.checkString(req.getParameter("work_kind"));
		dm.make_clsf = Util.checkString(req.getParameter("make_clsf"));
		dm.std_cd = Util.checkString(req.getParameter("std_cd"));
		dm.clr_cd = Util.checkString(req.getParameter("clr_cd"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_3210_l(dm);
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
    public void is_agr_3300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_3300_MDataSet ds = null;

        // DM Setting
    	IS_AGR_3300_MDM dm = new IS_AGR_3300_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_3300_m(dm);
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
    public void is_agr_3310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_AGR_3310_LDataSet ds = null;
    	
        // DM Setting
    	IS_AGR_3310_LDM dm = new IS_AGR_3310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
		dm.cmpy_div = Util.checkString(req.getParameter("cmpy_div"));
        dm.print();
     
        try {
        	IsAgr1000DAO dao = new IsAgr1000DAO();
            ds = dao.is_agr_3310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }        
    
    
    
    
    
    
    
    
}
