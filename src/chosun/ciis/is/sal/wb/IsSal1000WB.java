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

package chosun.ciis.is.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.sal.dao.IsSal1000DAO;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsSal1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_sal_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1000_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1000_MDM dm = new IS_SAL_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);	
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1000_m(dm);
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
    public void is_sal_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1010_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1010_LDM dm = new IS_SAL_1010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.rtax_yn  = Util.checkString(req.getParameter("rtax_yn")); 
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);		
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1010_l(dm);
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
    public void is_sal_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1020_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1020_LDM dm = new IS_SAL_1020_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
		dm.slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd2"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1020_l(dm);
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
    public void is_sal_1025_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1025_SDataSet ds = null;

        // DM Setting
    	IS_SAL_1025_SDM dm = new IS_SAL_1025_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd2"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd2"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt2"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq2"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1025_s(dm);
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
    public void is_sal_1030_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1030_SDataSet ds = null;

        // DM Setting
    	IS_SAL_1030_SDM dm = new IS_SAL_1030_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1030_s(dm);
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
    public void is_sal_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1040_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdataData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String a_acwr_reg_dt = Util.checkString((String)hash.get("a_acwr_reg_dt"));  
		String a_acwr_reg_seq = Util.checkString((String)hash.get("a_acwr_reg_seq"));  
		String a_tgt_suply_amt = Util.checkString((String)hash.get("a_tgt_suply_amt"));  
		
        // DM Setting
    	IS_SAL_1040_ADM dm = new IS_SAL_1040_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.rcpm_plan_dt = Util.checkString(req.getParameter("rcpm_plan_dt"));
		dm.suply_erplace_cd = Util.checkString(req.getParameter("suply_erplace_cd"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.demand_ern = Util.checkString(req.getParameter("demand_ern"));
		dm.demand_dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
		dm.demand_dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
		dm.demand_presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));		
		dm.biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd"));	/**종사업장 20120727**/	
		dm.remk = Util.checkString(req.getParameter("remk"));	/**비고 20120727**/		
		dm.remk1 = Util.checkString(req.getParameter("remk1"));	/**비고1 수금통장**/				
		dm.demand_addr = Util.checkString(req.getParameter("demand_addr"));
		dm.demand_bizcond = Util.checkString(req.getParameter("demand_bizcond"));
		dm.demand_item = Util.checkString(req.getParameter("demand_item"));
		dm.vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
		dm.tax_item = Util.checkString(req.getParameter("tax_item"));
		dm.email_id = Util.checkString(req.getParameter("email_id"));
		dm.elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.setA_acwr_reg_dt(a_acwr_reg_dt);
		dm.setA_acwr_reg_seq(a_acwr_reg_seq);
		dm.setA_suply_amt(a_tgt_suply_amt);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1040_a(dm);
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
    public void is_sal_1050_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1050_ADataSet ds = null;
    	
        // DM Setting
    	IS_SAL_1050_ADM dm = new IS_SAL_1050_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1050_a(dm);
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
    public void is_sal_1060_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1060_ADataSet ds = null;
    	
        // DM Setting
    	IS_SAL_1060_ADM dm = new IS_SAL_1060_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.email_id = Util.checkString(req.getParameter("email_id"));
		dm.elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		dm.biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd"));	/**종사업장 20120727**/	
		dm.remk = Util.checkString(req.getParameter("remk"));	/**비고 20120727**/		
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1060_a(dm);
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
    public void is_sal_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1100_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1100_MDM dm = new IS_SAL_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1100_m(dm);
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
    public void is_sal_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1110_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1110_LDM dm = new IS_SAL_1110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.purc_frdt = Util.checkString(req.getParameter("purc_frdt"));
		dm.purc_todt = Util.checkString(req.getParameter("purc_todt"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1110_l(dm);
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
    public void is_sal_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1120_ADataSet ds = null;
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String checked = Util.checkString((String)hash.get("checked"));  
    	String purc_reg_dt = Util.checkString((String)hash.get("purc_reg_dt"));  
    	String purc_reg_seq = Util.checkString((String)hash.get("purc_reg_seq"));  
    	
        // DM Setting
    	IS_SAL_1120_ADM dm = new IS_SAL_1120_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.bizcond = Util.checkString(req.getParameter("bizcond"));
		dm.item = Util.checkString(req.getParameter("item"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.purc_frdt = Util.checkString(req.getParameter("purc_frdt"));
		dm.purc_todt = Util.checkString(req.getParameter("purc_todt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.email_id = Util.checkString(req.getParameter("email_id"));
		dm.elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.setChecked(checked);
		dm.setPurc_reg_dt(purc_reg_dt);
		dm.setPurc_reg_seq(purc_reg_seq);
    	dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1120_a(dm);
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
    public void is_sal_1122_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1122_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1122_ADM dm = new IS_SAL_1122_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1122_a(dm);
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
    public void is_sal_1130_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1130_SDataSet ds = null;

        // DM Setting
    	IS_SAL_1130_SDM dm = new IS_SAL_1130_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd2"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt2"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq2"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1130_s(dm);
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
    public void is_sal_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1200_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1200_MDM dm = new IS_SAL_1200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clos_yymm = Util.checkString(req.getParameter("dd_clos_yymm")).substring(0, 6);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1200_m(dm);
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
    public void is_sal_1201_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1201_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1201_MDM dm = new IS_SAL_1201_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1201_m(dm);
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
    public void is_sal_1210_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1210_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1210_ADM dm = new IS_SAL_1210_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1210_a(dm);
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
    public void is_sal_1211_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1211_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1211_ADM dm = new IS_SAL_1211_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1211_a(dm);
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
    public void is_sal_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1300_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1300_MDM dm = new IS_SAL_1300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1300_m(dm);
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
    public void is_sal_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1310_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1310_LDM dm = new IS_SAL_1310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_year = Util.checkString(req.getParameter("clos_year"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1310_l(dm);
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
    public void is_sal_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1320_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1320_LDM dm = new IS_SAL_1320_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1320_l(dm);
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
    public void is_sal_1330_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1330_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1330_LDM dm = new IS_SAL_1330_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.quarter = Util.checkString(req.getParameter("quarter"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.clos_year = Util.checkString(req.getParameter("clos_year"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1330_l(dm);
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
    public void is_sal_1340_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1340_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1340_ADM dm = new IS_SAL_1340_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.mang_frdt = Util.checkString(req.getParameter("mang_frdt"));
		dm.mang_todt = Util.checkString(req.getParameter("mang_todt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1340_a(dm);
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
    public void is_sal_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1400_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1400_MDM dm = new IS_SAL_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1400_m(dm);
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
    public void is_sal_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1410_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1410_LDM dm = new IS_SAL_1410_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_year = Util.checkString(req.getParameter("clos_year"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1410_l(dm);
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
    public void is_sal_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1420_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1420_LDM dm = new IS_SAL_1420_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1420_l(dm);
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
    public void is_sal_1430_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1430_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1430_LDM dm = new IS_SAL_1430_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.quarter = Util.checkString(req.getParameter("quarter"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.clos_year = Util.checkString(req.getParameter("clos_year"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_1430_l(dm);
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
    public void is_sal_1440_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1440_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1440_ADM dm = new IS_SAL_1440_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.mang_frdt = Util.checkString(req.getParameter("mang_frdt"));
		dm.mang_todt = Util.checkString(req.getParameter("mang_todt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
    
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1440_a(dm);
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
    public void is_sal_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1600_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1600_MDM dm = new IS_SAL_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1600_m(dm);
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
    public void is_sal_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1610_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1610_LDM dm = new IS_SAL_1610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_dt = Util.checkString(req.getParameter("adjm_dt")).substring(0, 6);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.slip_no = Util.checkString(req.getParameter("slip_no"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1610_l(dm);
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
    public void is_sal_1620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1620_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1620_ADM dm = new IS_SAL_1620_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_dt = Util.checkString(req.getParameter("adjm_dt")).substring(0, 6);
		dm.purc_frdt = Util.checkString(req.getParameter("purc_frdt"));
		dm.purc_todt = Util.checkString(req.getParameter("purc_todt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1620_a(dm);
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
    public void is_sal_1630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1630_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode = Util.checkString((String)hash.get("m")).toUpperCase();  
    	String purc_adjm_reg_dt = Util.checkString((String)hash.get("purc_adjm_reg_dt"));  
    	String purc_adjm_reg_seq = Util.checkString((String)hash.get("purc_adjm_reg_seq"));  
    	String dlco_clsf_cd_seq = Util.checkString((String)hash.get("dlco_clsf_cd_seq"));  
    	String txn_clsf = Util.checkString((String)hash.get("txn_clsf"));  
    	String suply_amt = Util.checkString((String)hash.get("suply_amt"));  
    	String vat_amt = Util.checkString((String)hash.get("vat_amt"));  
    	String dduc_amt = Util.checkString((String)hash.get("dduc_amt"));  
    	String comp_amt = Util.checkString((String)hash.get("comp_amt"));  
    	String prom_amt = Util.checkString((String)hash.get("prom_amt")); 
    	String gds_vol_amt = Util.checkString((String)hash.get("gds_vol_amt"));  
    	String etc_amt = Util.checkString((String)hash.get("etc_amt"));  
    	String stot_amt = Util.checkString((String)hash.get("stot_amt"));
    	
        // DM Setting
    	IS_SAL_1630_ADM dm = new IS_SAL_1630_ADM();
				
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setMode(mode);
		dm.setPurc_adjm_reg_dt(purc_adjm_reg_dt);
		dm.setPurc_adjm_reg_seq(purc_adjm_reg_seq);
		dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
		dm.setTxn_clsf(txn_clsf);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setDduc_amt(dduc_amt);
		dm.setComp_amt(comp_amt);
		dm.setProm_amt(prom_amt);
		dm.setGds_vol_amt(gds_vol_amt);
		dm.setEtc_amt(etc_amt);
		dm.setStot_amt(stot_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1630_a(dm);
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
    public void is_sal_1640_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1640_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String dlco_clsf_cd_seq = Util.checkString((String)hash.get("dlco_clsf_cd_seq"));  
    	String dlco_clsf_cd_seq_nm = Util.checkString((String)hash.get("dlco_clsf_cd_seq_nm"));  
    	String comp_amt = Util.checkString((String)hash.get("comp_amt"));  
    	String prom_amt = Util.checkString((String)hash.get("prom_amt")); 
    	String gds_vol_amt = Util.checkString((String)hash.get("gds_vol_amt"));  
    	String etc_amt = Util.checkString((String)hash.get("etc_amt"));  
    	
        // DM Setting
    	IS_SAL_1640_ADM dm = new IS_SAL_1640_ADM();
				
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_dt = Util.checkString(req.getParameter("adjm_dt")).substring(0, 6);
		dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
		dm.setDlco_clsf_cd_seq_nm(dlco_clsf_cd_seq_nm);
		dm.setComp_amt(comp_amt);
		dm.setProm_amt(prom_amt);
		dm.setGds_vol_amt(gds_vol_amt);
		dm.setEtc_amt(etc_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1640_a(dm);
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
    public void is_sal_1650_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1650_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1650_ADM dm = new IS_SAL_1650_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_dt = Util.checkString(req.getParameter("adjm_dt")).substring(0, 6);
		dm.pay_plan_dd_pers = Util.checkString(req.getParameter("pay_plan_dd_pers"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1650_a(dm);
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
    public void is_sal_1660_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1660_ADataSet ds = null;

        // DM Setting
    	IS_SAL_1660_ADM dm = new IS_SAL_1660_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.adjm_dt = Util.checkString(req.getParameter("adjm_dt")).substring(0, 6);
		dm.pay_plan_dd_pers = Util.checkString(req.getParameter("pay_plan_dd_pers"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1660_a(dm);
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
    public void is_sal_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1800_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1800_MDM dm = new IS_SAL_1800_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1800_m(dm);
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
    public void is_sal_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1810_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1810_LDM dm = new IS_SAL_1810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.purc_frdt = Util.checkString(req.getParameter("purc_frdt"));
		dm.purc_todt = Util.checkString(req.getParameter("purc_todt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.purc_clsf = Util.checkString(req.getParameter("purc_clsf"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.trc_yn = Util.checkString(req.getParameter("trc_yn"));
		dm.type = Util.checkString(req.getParameter("type"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
            ds = dao.is_sal_1810_l(dm);
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
    public void is_sal_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1900_MDataSet ds = null;

        // DM Setting
    	IS_SAL_1900_MDM dm = new IS_SAL_1900_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_1900_m(dm);
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
    public void is_sal_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1910_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1910_LDM dm = new IS_SAL_1910_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
		dm.occr_todt = Util.checkString(req.getParameter("occr_todt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_1910_l(dm);
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
    public void is_sal_1920_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_1920_LDataSet ds = null;

        // DM Setting
    	IS_SAL_1920_LDM dm = new IS_SAL_1920_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_1920_l(dm);
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
    public void is_sal_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_2100_MDataSet ds = null;

        // DM Setting
    	IS_SAL_2100_MDM dm = new IS_SAL_2100_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_2100_m(dm);
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
    public void is_sal_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_2110_LDataSet ds = null;

        // DM Setting
    	IS_SAL_2110_LDM dm = new IS_SAL_2110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_2110_l(dm);
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
    public void is_sal_2200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_2200_MDataSet ds = null;

        // DM Setting
    	IS_SAL_2200_MDM dm = new IS_SAL_2200_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_2200_m(dm);
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
    public void is_sal_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_2210_LDataSet ds = null;

        // DM Setting
    	IS_SAL_2210_LDM dm = new IS_SAL_2210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
		dm.occr_todt = Util.checkString(req.getParameter("occr_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_2210_l(dm);
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
    public void is_sal_2500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SAL_2500_MDataSet ds = null;

        // DM Setting
    	IS_SAL_2500_MDM dm = new IS_SAL_2500_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsSal1000DAO dao = new IsSal1000DAO();
        	ds = dao.is_sal_2500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
}
