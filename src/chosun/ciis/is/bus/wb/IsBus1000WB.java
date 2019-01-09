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

package chosun.ciis.is.bus.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.bus.dao.IsBus1000DAO;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsBus1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1000_MDataSet ds = null;

        // DM Setting
    	IS_BUS_1000_MDM dm = new IS_BUS_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1000_m(dm);
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
    public void is_bus_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1010_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1010_LDM dm = new IS_BUS_1010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1010_l(dm);
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
    public void is_bus_1020_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1020_SDataSet ds = null;

        // DM Setting
    	IS_BUS_1020_SDM dm = new IS_BUS_1020_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.make_seq = Util.checkString(req.getParameter("make_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1020_s(dm);
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
    public void is_bus_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1030_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	
    	String b_mode = Util.checkString((String)hash1.get("m"));
    	String b_make_dtls_seq = Util.checkString((String)hash1.get("b_make_dtls_seq"));
    	String b_dlco = Util.checkString((String)hash1.get("b_dlco"));
    	String b_cns_tm = Util.checkString((String)hash1.get("b_cns_tm"));
    	String b_chrg_pers = Util.checkString((String)hash1.get("b_chrg_pers"));
    	String b_tel_no = Util.checkString((String)hash1.get("b_tel_no"));
    	String b_clsf = Util.checkString((String)hash1.get("b_clsf"));
    	String b_vist_purp = Util.checkString((String)hash1.get("b_vist_purp"));
    	String b_remk = Util.checkString((String)hash1.get("b_remk"));
    	String c_mode = Util.checkString((String)hash2.get("m"));
    	String c_make_dtls_seq = Util.checkString((String)hash2.get("c_make_dtls_seq"));
    	String c_dlco = Util.checkString((String)hash2.get("c_dlco"));
    	String c_cns_tm = Util.checkString((String)hash2.get("c_cns_tm"));
    	String c_chrg_pers = Util.checkString((String)hash2.get("c_chrg_pers"));
    	String c_tel_no = Util.checkString((String)hash2.get("c_tel_no"));
    	String c_clsf = Util.checkString((String)hash2.get("c_clsf"));
    	String c_vist_purp = Util.checkString((String)hash2.get("c_vist_purp"));
    	String c_remk = Util.checkString((String)hash2.get("c_remk"));
    	
    	
        // DM Setting
    	IS_BUS_1030_ADM dm = new IS_BUS_1030_ADM();
		
		
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.make_seq = Util.checkString(req.getParameter("make_seq"));
		dm.chrg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		/*
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		
		dm.same = Util.checkString(req.getParameter("same"));
		dm.istt_dd = Util.checkString(req.getParameter("istt_dd"));
		dm.etc = Util.checkString(req.getParameter("etc"));
		dm.thdd_rvord = Util.checkString(req.getParameter("thdd_rvord"));
		dm.nxtdd_plan = Util.checkString(req.getParameter("nxtdd_plan"));
		dm.cash_clamt = Util.checkString(req.getParameter("cash_clamt"));
		dm.note_clamt = Util.checkString(req.getParameter("note_clamt"));
		dm.incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
		
		*/
		dm.setB_mode(b_mode.toUpperCase());
		dm.setB_make_dtls_seq(b_make_dtls_seq);
		dm.setB_dlco(b_dlco);
		dm.setB_cns_tm(b_cns_tm);
		dm.setB_chrg_pers(b_chrg_pers);
		dm.setB_tel_no(b_tel_no);
		dm.setB_clsf(b_clsf);
		dm.setB_vist_purp(b_vist_purp);
		dm.setB_remk(b_remk);
		dm.setC_mode(c_mode.toUpperCase());
		dm.setC_make_dtls_seq(c_make_dtls_seq);
		dm.setC_dlco(c_dlco);
		dm.setC_cns_tm(c_cns_tm);
		dm.setC_chrg_pers(c_chrg_pers);
		dm.setC_tel_no(c_tel_no);
		dm.setC_clsf(c_clsf);
		dm.setC_vist_purp(c_vist_purp);
		dm.setC_remk(c_remk);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1100_MDataSet ds = null;

        // DM Setting
    	IS_BUS_1100_MDM dm = new IS_BUS_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1100_m(dm);
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
    public void is_bus_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1110_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1110_LDM dm = new IS_BUS_1110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.search = Util.checkString(req.getParameter("search"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1210_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1210_LDM dm = new IS_BUS_1210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1210_l(dm);
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
    public void is_bus_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1220_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String mode = Util.checkString((String)hash1.get("m"));
    	String yymm = Util.checkString((String)hash1.get("yymm"));
    	String wkcd = Util.checkString((String)hash1.get("wkcd"));
    	String frdt = Util.checkString((String)hash1.get("frdt"));
    	String todt = Util.checkString((String)hash1.get("todt"));
    	String sale_rfl_ratio = Util.checkString((String)hash1.get("sale_rfl_ratio"));
    	String clamt_rfl_ratio = Util.checkString((String)hash1.get("clamt_rfl_ratio"));
    	
        // DM Setting
    	IS_BUS_1220_ADM dm = new IS_BUS_1220_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setMode(mode.toUpperCase()); 
		dm.setYymm(yymm);
		dm.setWkcd(wkcd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setSale_rfl_ratio(sale_rfl_ratio);
		dm.setClamt_rfl_ratio(clamt_rfl_ratio);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1300_MDataSet ds = null;

        // DM Setting
    	IS_BUS_1300_MDM dm = new IS_BUS_1300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1300_m(dm);
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
    public void is_bus_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1310_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1310_LDM dm = new IS_BUS_1310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm").substring(0, 6));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1310_l(dm);
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
    public void is_bus_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1320_ADataSet ds = null;

        // DM Setting
    	IS_BUS_1320_ADM dm = new IS_BUS_1320_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.vip_busn_acty_rept = Util.checkString(req.getParameter("vip_busn_acty_rept"));
		dm.vip_busn_plan = Util.checkString(req.getParameter("vip_busn_plan"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1320_a(dm);
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
    public void is_bus_1330_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1330_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1330_LDM dm = new IS_BUS_1330_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm").substring(0, 6));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1330_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 

    /**********************************************************************************/

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1410_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1410_LDM dm = new IS_BUS_1410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1410_l(dm);
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
    public void is_bus_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1420_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1420_LDM dm = new IS_BUS_1420_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1420_l(dm);
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
    public void is_bus_1430_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1430_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1430_LDM dm = new IS_BUS_1430_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1430_l(dm);
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
    public void is_bus_1440_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1440_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1440_LDM dm = new IS_BUS_1440_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1440_l(dm);
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
    public void is_bus_1450_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1450_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1450_LDM dm = new IS_BUS_1450_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1450_l(dm);
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
    public void is_bus_1460_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1460_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1460_LDM dm = new IS_BUS_1460_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.wkcd = Util.checkString(req.getParameter("wkcd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1460_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }

    /**********************************************************************************/    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1510_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1510_LDM dm = new IS_BUS_1510_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1510_l(dm);
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
    public void is_bus_1520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1520_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1520_LDM dm = new IS_BUS_1520_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1520_l(dm);
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
    public void is_bus_1530_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1530_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1530_LDM dm = new IS_BUS_1530_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1530_l(dm);
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
    public void is_bus_1540_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1540_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1540_LDM dm = new IS_BUS_1540_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1540_l(dm);
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
    public void is_bus_1550_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1550_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1550_LDM dm = new IS_BUS_1550_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1550_l(dm);
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
    public void is_bus_1560_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1560_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1560_LDM dm = new IS_BUS_1560_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1560_l(dm);
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
    public void is_bus_1570_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1570_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1570_LDM dm = new IS_BUS_1570_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1570_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1600_MDataSet ds = null;

        // DM Setting
    	IS_BUS_1600_MDM dm = new IS_BUS_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1600_m(dm);
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
    public void is_bus_1610_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1610_SDataSet ds = null;

        // DM Setting
    	IS_BUS_1610_SDM dm = new IS_BUS_1610_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
		dm.rept_dt = Util.checkString(req.getParameter("rept_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1610_s(dm);
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
    public void is_bus_1620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1620_ADataSet ds = null;

        // DM Setting
    	IS_BUS_1620_ADM dm = new IS_BUS_1620_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rept_dt = Util.checkString(req.getParameter("rept_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.vip_busn_acty_rept = Util.checkString(req.getParameter("vip_busn_acty_rept"));
		dm.vip_busn_plan = Util.checkString(req.getParameter("vip_busn_plan"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1620_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1710_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1710_LDM dm = new IS_BUS_1710_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1710_l(dm);
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
    public void is_bus_1720_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1720_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1720_LDM dm = new IS_BUS_1720_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1720_l(dm);
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
    public void is_bus_1730_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1730_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1730_LDM dm = new IS_BUS_1730_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1730_l(dm);
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
    public void is_bus_1740_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1740_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1740_LDM dm = new IS_BUS_1740_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1740_l(dm);
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
    public void is_bus_1750_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1750_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1750_LDM dm = new IS_BUS_1750_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1750_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1800_MDataSet ds = null;

        // DM Setting
    	IS_BUS_1800_MDM dm = new IS_BUS_1800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1800_m(dm);
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
    public void is_bus_1810_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1810_SDataSet ds = null;

        // DM Setting
    	IS_BUS_1810_SDM dm = new IS_BUS_1810_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.preng_dt = Util.checkString(req.getParameter("preng_dt"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1810_s(dm);
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
    public void is_bus_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1820_ADataSet ds = null;

        // DM Setting
    	IS_BUS_1820_ADM dm = new IS_BUS_1820_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.preng_dt = Util.checkString(req.getParameter("preng_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.area_nm = Util.checkString(req.getParameter("area_nm"));
		dm.advcs_nm = Util.checkString(req.getParameter("advcs_nm"));
		dm.remk_matt = Util.checkString(req.getParameter("remk_matt"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.make_pers = Util.checkString(req.getParameter("make_pers"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1820_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1900_MDataSet ds = null;

        // DM Setting
    	IS_BUS_1900_MDM dm = new IS_BUS_1900_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1900_m(dm);
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
    public void is_bus_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1910_LDataSet ds = null;

        // DM Setting
    	IS_BUS_1910_LDM dm = new IS_BUS_1910_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.preng_dt = Util.checkString(req.getParameter("preng_dt"));
		dm.spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1910_l(dm);
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
    public void is_bus_1920_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_1920_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String mode = Util.checkString((String)hash1.get("m"));
    	String preng_dt = Util.checkString((String)hash1.get("preng_dt"));
    	String seq = Util.checkString((String)hash1.get("seq"));
    	String sale_clsf = "@";
    	String spcsale_clsf = Util.checkString((String)hash1.get("spcsale_clsf"));
    	String medi_cd = Util.checkString((String)hash1.get("medi_cd"));
    	String area_nm = Util.checkString((String)hash1.get("area_nm"));
    	String advcs_nm = Util.checkString((String)hash1.get("advcs_nm"));
    	String remk_matt = Util.checkString((String)hash1.get("remk_matt"));
    	String area_cd = Util.checkString((String)hash1.get("area_cd"));
    	String dept_cd = Util.checkString((String)hash1.get("dept_cd"));
    	String sub_dept_cd = Util.checkString((String)hash1.get("sub_dept_cd"));
    	String make_pers = Util.checkString((String)hash1.get("make_pers"));
    	
        // DM Setting
    	IS_BUS_1920_ADM dm = new IS_BUS_1920_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setMode(mode.toUpperCase());
		dm.setPreng_dt(preng_dt);
		dm.setSeq(seq);
		dm.setSale_clsf(sale_clsf);
		dm.setSpcsale_clsf(spcsale_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setArea_nm(area_nm);
		dm.setAdvcs_nm(advcs_nm);
		dm.setRemk_matt(remk_matt);
		dm.setArea_cd(area_cd);
		dm.setDept_cd(dept_cd);
		dm.setSub_dept_cd(sub_dept_cd);
		dm.setMake_pers(make_pers);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_1920_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  

    /**********************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2000_MDataSet ds = null;

        // DM Setting
    	IS_BUS_2000_MDM dm = new IS_BUS_2000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2000_m(dm);
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
    public void is_bus_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2010_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2010_LDM dm = new IS_BUS_2010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.feed_frdt = Util.checkString(req.getParameter("feed_frdt"));
		dm.feed_todt = Util.checkString(req.getParameter("feed_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
		dm.sido = Util.checkString(req.getParameter("sido"));
		dm.gu = Util.checkString(req.getParameter("gu"));
		dm.incmg_pers_clsf_010 = Util.checkString(req.getParameter("incmg_pers_clsf_010"));
		dm.incmg_pers_clsf_020 = Util.checkString(req.getParameter("incmg_pers_clsf_020"));
		dm.incmg_pers_clsf_030 = Util.checkString(req.getParameter("incmg_pers_clsf_030"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**********************************************************************************/ 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2110_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2110_LDM dm = new IS_BUS_2110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.feed_frdt = Util.checkString(req.getParameter("feed_frdt"));
		dm.feed_todt = Util.checkString(req.getParameter("feed_todt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2110_l(dm);
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
    public void is_bus_2120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2120_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2120_LDM dm = new IS_BUS_2120_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.feed_dt = Util.checkString(req.getParameter("feed_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2120_l(dm);
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
    public void is_bus_2130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2130_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2130_LDM dm = new IS_BUS_2130_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.feed_dt = Util.checkString(req.getParameter("feed_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2130_l(dm);
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
    public void is_bus_2135_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2135_LDataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	String bo_cd = Util.checkString((String)hash1.get("bo_cd"));
    	
        // DM Setting
    	IS_BUS_2135_LDM dm = new IS_BUS_2135_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.feed_dt = Util.checkString(req.getParameter("feed_dt3"));
		dm.setBo_cd(bo_cd);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2135_l(dm);
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
    public void is_bus_2140_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2140_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2140_LDM dm = new IS_BUS_2140_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.feed_frdt = Util.checkString(req.getParameter("feed_frdt4"));
		dm.feed_todt = Util.checkString(req.getParameter("feed_todt4"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2140_l(dm);
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
    public void is_bus_2145_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2145_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2145_LDM dm = new IS_BUS_2145_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.feed_frdt = Util.checkString(req.getParameter("feed_frdt4"));
		dm.feed_todt = Util.checkString(req.getParameter("feed_todt4"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2145_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**********************************************************************************/ 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_bus_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2210_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2210_LDM dm = new IS_BUS_2210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.feed_frdt = Util.checkString(req.getParameter("feed_frdt"));
		dm.feed_todt = Util.checkString(req.getParameter("feed_todt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2210_l(dm);
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
    public void is_bus_2220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2220_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2220_LDM dm = new IS_BUS_2220_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.feed_frdt = Util.checkString(req.getParameter("feed_frdt"));
		dm.feed_todt = Util.checkString(req.getParameter("feed_todt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2220_l(dm);
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
    public void is_bus_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_BUS_2310_LDataSet ds = null;

        // DM Setting
    	IS_BUS_2310_LDM dm = new IS_BUS_2310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.feed_frdt = Util.checkString(req.getParameter("feed_frdt"));
		dm.feed_todt = Util.checkString(req.getParameter("feed_todt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsBus1000DAO dao = new IsBus1000DAO();
            ds = dao.is_bus_2310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    
    
    
    
    
    
    /**********************************************************************************/ 
    /**********************************************************************************/ 
    /**********************************************************************************/ 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
