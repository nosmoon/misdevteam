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

package chosun.ciis.is.com.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.com.dao.IsCom1000DAO;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsCom1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_com_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1000_MDataSet ds = null;

        // DM Setting
    	IS_COM_1000_MDM dm = new IS_COM_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1000_m(dm);
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
    public void is_com_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1010_LDataSet ds = null;

        // DM Setting
    	IS_COM_1010_LDM dm = new IS_COM_1010_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.advcs_nm = Util.checkString(req.getParameter("advcs_nm"));
		dm.indt_cd = Util.checkString(req.getParameter("indt_cd"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1010_l(dm);
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
    public void is_com_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1100_MDataSet ds = null;

        // DM Setting
    	IS_COM_1100_MDM dm = new IS_COM_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1100_m(dm);
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
    public void is_com_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1110_LDataSet ds = null;

        // DM Setting
    	IS_COM_1110_LDM dm = new IS_COM_1110_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_cd_seq_fr = Util.checkString(req.getParameter("dlco_cd_seq_fr"));
		dm.dlco_cd_seq_to = Util.checkString(req.getParameter("dlco_cd_seq_to"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
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
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1110_l(dm);
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
    public void is_com_1111_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1111_LDataSet ds = null;

        // DM Setting
    	IS_COM_1111_LDM dm = new IS_COM_1111_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_cd_seq_fr = Util.checkString(req.getParameter("dlco_cd_seq_fr"));
		dm.dlco_cd_seq_to = Util.checkString(req.getParameter("dlco_cd_seq_to"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
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
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1111_l(dm);
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
    public void is_com_1200_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1200_SDataSet ds = null;

        // DM Setting
    	IS_COM_1200_SDM dm = new IS_COM_1200_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1200_s(dm);
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
    public void is_com_1201_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1201_SDataSet ds = null;

        // DM Setting
    	IS_COM_1201_SDM dm = new IS_COM_1201_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1201_s(dm);
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
    public void is_com_1202_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1202_SDataSet ds = null;

        // DM Setting
    	IS_COM_1202_SDM dm = new IS_COM_1202_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1202_s(dm);
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
    public void is_com_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1300_MDataSet ds = null;

        // DM Setting
    	IS_COM_1300_MDM dm = new IS_COM_1300_MDM();
    	dm.cmpy_cd = "100";//회사코드는 100으로 보냄(2012.05.02)
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1300_m(dm);
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
    public void is_com_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1310_LDataSet ds = null;

        // DM Setting
    	IS_COM_1310_LDM dm = new IS_COM_1310_LDM();
        
        dm.cmpy_cd = "100";
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
		dm.cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1310_l(dm);
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
    public void is_com_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1400_MDataSet ds = null;

        // DM Setting
    	IS_COM_1400_MDM dm = new IS_COM_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1400_m(dm);
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
    public void is_com_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1410_LDataSet ds = null;

        // DM Setting
    	IS_COM_1410_LDM dm = new IS_COM_1410_LDM();
        
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.chrg_pers_nm = Util.checkString(req.getParameter("chrg_pers_nm"));
		dm.chrg_job_clsf = Util.checkString(req.getParameter("chrg_job_clsf"));
		dm.email = Util.checkString(req.getParameter("email"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1410_l(dm);
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
    public void is_com_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1600_MDataSet ds = null;

        // DM Setting
    	IS_COM_1600_MDM dm = new IS_COM_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1600_m(dm);
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
    public void is_com_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1610_LDataSet ds = null;

        // DM Setting
    	IS_COM_1610_LDM dm = new IS_COM_1610_LDM();
        
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
		dm.issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
		dm.rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
		dm.sale_aprv_no = Util.checkString(req.getParameter("sale_aprv_no"));
		dm.note_amt = Util.checkString(req.getParameter("note_amt"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1610_l(dm);
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
    public void is_com_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1710_LDataSet ds = null;

        // DM Setting
    	IS_COM_1710_LDM dm = new IS_COM_1710_LDM();
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.send_atic_no = Util.checkString(req.getParameter("send_atic_no"));
		dm.send_atic_nm = Util.checkString(req.getParameter("send_atic_nm"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1710_l(dm);
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
    public void is_com_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_COM_1810_LDataSet ds = null;

        // DM Setting
    	IS_COM_1810_LDM dm = new IS_COM_1810_LDM();
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
        dm.print();
     
        try {
        	IsCom1000DAO dao = new IsCom1000DAO();
            ds = dao.is_com_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    
    
    
}
