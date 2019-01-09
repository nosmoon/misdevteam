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

package chosun.ciis.is.rpt.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.rpt.dao.IsRpt1000DAO;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsRpt1000WB extends BaseWB {
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_rpt_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1000_MDataSet ds = null;

        // DM Setting
    	IS_RPT_1000_MDM dm = new IS_RPT_1000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1000_m(dm);
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
    public void is_rpt_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1010_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1010_LDM dm = new IS_RPT_1010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_l = Util.checkString(req.getParameter("cmpy_l"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1010_l(dm);
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
    public void is_rpt_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1020_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1020_LDM dm = new IS_RPT_1020_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1020_l(dm);
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
    public void is_rpt_1030_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1030_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1030_LDM dm = new IS_RPT_1030_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1030_l(dm);
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
    public void is_rpt_1040_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1040_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1040_LDM dm = new IS_RPT_1040_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1040_l(dm);
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
    public void is_rpt_1050_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1050_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1050_LDM dm = new IS_RPT_1050_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1050_l(dm);
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
    public void is_rpt_1060_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1060_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1060_LDM dm = new IS_RPT_1060_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1060_l(dm);
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
    public void is_rpt_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1210_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1210_LDM dm = new IS_RPT_1210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1210_l(dm);
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
    public void is_rpt_1220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1220_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1220_LDM dm = new IS_RPT_1220_LDM();
		
    	String clsf = Util.checkString(req.getParameter("clsf"));
    	
    	if(clsf.endsWith("A")){
    		dm.cmpy_cd = "207";	//본사
    	}else if(clsf.endsWith("B")){
    		dm.cmpy_cd = "209";	//부산법인
    	}else if(clsf.endsWith("C")){
    		dm.cmpy_cd = "322";	//조선AD
    	}
    	
    	
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1220_l(dm);
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
    public void is_rpt_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1110_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1110_LDM dm = new IS_RPT_1110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1110_l(dm);
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
    public void is_rpt_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1310_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1310_LDM dm = new IS_RPT_1310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm")).substring(0, 6);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1310_l(dm);
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
    public void is_rpt_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1410_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1410_LDM dm = new IS_RPT_1410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm")).substring(0, 6);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1410_l(dm);
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
    public void is_rpt_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1420_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1420_LDM dm = new IS_RPT_1420_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm")).substring(0, 6);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1420_l(dm);
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
    public void is_rpt_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1600_MDataSet ds = null;

        // DM Setting
    	IS_RPT_1600_MDM dm = new IS_RPT_1600_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1600_m(dm);
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
    public void is_rpt_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1610_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1610_LDM dm = new IS_RPT_1610_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1610_l(dm);
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
    public void is_rpt_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1710_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1710_LDM dm = new IS_RPT_1710_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1710_l(dm);
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
    public void is_rpt_1720_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1720_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1720_LDM dm = new IS_RPT_1720_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.amt_clsf1 = Util.checkString(req.getParameter("amt_clsf1"));
		dm.amt_clsf2 = Util.checkString(req.getParameter("amt_clsf2"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1720_l(dm);
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
    public void is_rpt_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1810_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1810_LDM dm = new IS_RPT_1810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm")).substring(0, 6);
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1810_l(dm);
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
    public void is_rpt_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_1910_LDataSet ds = null;

        // DM Setting
    	IS_RPT_1910_LDM dm = new IS_RPT_1910_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_clsf = Util.checkString(req.getParameter("cmpy_clsf"));
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr")).substring(0, 6);
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to")).substring(0, 6);
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_1910_l(dm);
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
    public void is_rpt_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2010_LDataSet ds = null;

        // DM Setting
    	IS_RPT_2010_LDM dm = new IS_RPT_2010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_clsf = Util.checkString(req.getParameter("cmpy_clsf"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy")).substring(0, 4);
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.spc_sale_clsf_n = Util.checkString(req.getParameter("spc_sale_clsf_n"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_2010_l(dm);
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
    public void is_rpt_2020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2020_LDataSet ds = null;

        // DM Setting
    	IS_RPT_2020_LDM dm = new IS_RPT_2020_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_clsf = Util.checkString(req.getParameter("cmpy_clsf"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy")).substring(0, 4);
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.spc_sale_clsf_n = Util.checkString(req.getParameter("spc_sale_clsf_n"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_2020_l(dm);
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
    public void is_rpt_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2310_LDataSet ds = null;

        // DM Setting
    	IS_RPT_2310_LDM dm = new IS_RPT_2310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_clsf = Util.checkString(req.getParameter("cmpy_clsf"));
		dm.yymm = Util.checkString(req.getParameter("yymm")).substring(0,6);
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
        	 ds = dao.is_rpt_2310_l(dm);
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
    public void is_rpt_2320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2320_LDataSet ds = null;

        // DM Setting
    	IS_RPT_2320_LDM dm = new IS_RPT_2320_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_clsf = Util.checkString(req.getParameter("cmpy_clsf"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy")).substring(0,4);
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
        	 ds = dao.is_rpt_2320_l(dm);
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
    public void is_rpt_2410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2410_LDataSet ds = null;

        // DM Setting
    	IS_RPT_2410_LDM dm = new IS_RPT_2410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy")).substring(0, 4);
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.spc_sale_clsf_n = Util.checkString(req.getParameter("spc_sale_clsf_n"));
		dm.type = Util.checkString(req.getParameter("type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
        	 ds = dao.is_rpt_2410_l(dm);
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
    public void is_rpt_2420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2420_LDataSet ds = null;

        // DM Setting
    	IS_RPT_2420_LDM dm = new IS_RPT_2420_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy")).substring(0, 4);
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.spc_sale_clsf_n = Util.checkString(req.getParameter("spc_sale_clsf_n"));
		dm.type = Util.checkString(req.getParameter("type"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
        	 ds = dao.is_rpt_2420_l(dm);
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
    public void is_rpt_2500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2500_MDataSet ds = null;

        // DM Setting
    	IS_RPT_2500_MDM dm = new IS_RPT_2500_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_2500_m(dm);
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
    public void is_rpt_2510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_RPT_2510_LDataSet ds = null;

        // DM Setting
    	IS_RPT_2510_LDM dm = new IS_RPT_2510_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.spc_sale_clsf_n = Util.checkString(req.getParameter("spc_sale_clsf_n"));
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.purc_dlco_clsf = Util.checkString(req.getParameter("purc_dlco_clsf"));
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsRpt1000DAO dao = new IsRpt1000DAO();
            ds = dao.is_rpt_2510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
