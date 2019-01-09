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

package chosun.ciis.sp.sup.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.sp.sup.dao.SpSup1000DAO;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

import chosun.ciis.co.base.util.StreamUtil;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class SpSup1000WB extends BaseWB {
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1000_MDataSet ds = null;

        // DM Setting
    	SP_SUP_1000_MDM dm = new SP_SUP_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1000_m(dm);
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
    public void sp_sup_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1010_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1010_LDM dm = new SP_SUP_1010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dt = Util.checkString(req.getParameter("dt"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1010_l(dm);
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
    public void sp_sup_1015_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1015_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1015_LDM dm = new SP_SUP_1015_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1015_l(dm);
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
    public void sp_sup_1020_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1020_SDataSet ds = null;

        // DM Setting
    	SP_SUP_1020_SDM dm = new SP_SUP_1020_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	//dm.dt = Util.checkString(req.getParameter("dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1020_s(dm);
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
    public void sp_sup_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1030_ADataSet ds = null;

        // DM Setting
    	SP_SUP_1030_ADM dm = new SP_SUP_1030_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.dt = Util.checkString(req.getParameter("dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.vist_bgn_tm = Util.checkString(req.getParameter("vist_bgn_hh"))+Util.checkString(req.getParameter("vist_bgn_mm"));
		dm.vist_end_tm = Util.checkString(req.getParameter("vist_end_hh"))+Util.checkString(req.getParameter("vist_end_mm"));
		dm.vist_obj_clsf = Util.checkString(req.getParameter("vist_obj_clsf"));
		dm.vist_clsf = Util.checkString(req.getParameter("vist_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.callcoms = Util.checkString(req.getParameter("callcoms"));
		dm.job_cont = Util.checkString(req.getParameter("job_cont"));
		dm.job_clas = Util.checkString(req.getParameter("job_clas"));	/**트리체크박스데이타**/
		dm.incmg_pers_ip = req.getRemoteAddr();;
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
	/**********************************************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1110_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1110_LDM dm = new SP_SUP_1110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1110_l(dm);
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
    public void sp_sup_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1120_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1120_LDM dm = new SP_SUP_1120_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1120_l(dm);
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
    public void sp_sup_1130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1130_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1130_LDM dm = new SP_SUP_1130_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1130_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************************************/
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1200_MDataSet ds = null;

        // DM Setting
    	SP_SUP_1200_MDM dm = new SP_SUP_1200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1200_m(dm);
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
    public void sp_sup_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1210_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1210_LDM dm = new SP_SUP_1210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chrg_pers_clsf = Util.checkString(req.getParameter("chrg_pers_clsf"));
		dm.sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1210_l(dm);
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
    public void sp_sup_1220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1220_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1220_LDM dm = new SP_SUP_1220_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acctregdt_fr = Util.checkString(req.getParameter("acctregdt_fr"));
		dm.acctregdt_to = Util.checkString(req.getParameter("acctregdt_to"));
		dm.leaf_open_chrg_pers_clsf = Util.checkString(req.getParameter("leaf_open_chrg_pers_clsf"));
		dm.leaf_open_chrg_pers = Util.checkString(req.getParameter("leaf_open_chrg_pers"));
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1220_l(dm);
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
    public void sp_sup_1230_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1230_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1230_LDM dm = new SP_SUP_1230_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1230_l(dm);
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
    public void sp_sup_1240_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1240_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
    	
    	
    	String rv_acwr_rmsg_ptph = "";
    	if( Util.checkString((String)hash1.get("ptph_no")) != "" &&  Util.checkString((String)hash2.get("ptph_no")) != "" ){
    		rv_acwr_rmsg_ptph = Util.checkString((String)hash1.get("ptph_no"))+"#"+Util.checkString((String)hash2.get("ptph_no"));
    	}else if(Util.checkString((String)hash1.get("ptph_no")) != "" && Util.checkString((String)hash2.get("ptph_no")) == ""){
    		rv_acwr_rmsg_ptph = Util.checkString((String)hash1.get("ptph_no"));
    	}else if(Util.checkString((String)hash1.get("ptph_no")) == "" && Util.checkString((String)hash2.get("ptph_no")) != ""){
    		rv_acwr_rmsg_ptph = Util.checkString((String)hash2.get("ptph_no"));
    	}
    	
    	
    		
        // DM Setting
    	SP_SUP_1240_ADM dm = new SP_SUP_1240_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.send_clsf = Util.checkString(req.getParameter("send_clsf"));
		/**예약일자시간 시작**/
		String send_dt = Util.checkString(req.getParameter("send_dt"));
		String send_hh = Util.checkString(req.getParameter("send_hh"));
		String send_mm = Util.checkString(req.getParameter("send_mm"));
		dm.snd_date = send_dt+send_hh+send_mm;
		/**예약일자시간 종료**/
		
		dm.sms_content = Util.checkString(req.getParameter("cont"));
		dm.sms_callback = Util.checkString(req.getParameter("send_ptph_no"));
		dm.setRv_acwr_rmsg_ptph(rv_acwr_rmsg_ptph);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1240_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**********************************************************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1300_MDataSet ds = null;

        // DM Setting
    	SP_SUP_1300_MDM dm = new SP_SUP_1300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1300_m(dm);
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
    public void sp_sup_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1310_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1310_LDM dm = new SP_SUP_1310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1310_l(dm);
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
    public void sp_sup_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1320_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String mode = Util.checkString((String)hash1.get("m"));
    	String clsf_cd = Util.checkString((String)hash1.get("clsf_cd"));
    	String cont = Util.checkString((String)hash1.get("cont"));
    	String seq = Util.checkString((String)hash1.get("seq"));

        // DM Setting
    	SP_SUP_1320_ADM dm = new SP_SUP_1320_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setMode(mode.toUpperCase());    
    	dm.setClsf_cd(clsf_cd);
    	dm.setCont(cont);
    	dm.setSeq(seq);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1320_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**********************************************************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1400_MDataSet ds = null;

        // DM Setting
    	SP_SUP_1400_MDM dm = new SP_SUP_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1400_m(dm);
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
    public void sp_sup_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1410_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1410_LDM dm = new SP_SUP_1410_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acpn_frdt = Util.checkString(req.getParameter("acpn_frdt"));
		dm.acpn_todt = Util.checkString(req.getParameter("acpn_todt"));
		dm.cns_clsf = Util.checkString(req.getParameter("cns_clsf"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.cont = Util.checkString(req.getParameter("cont"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1410_l(dm);
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
    public void sp_sup_1420_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1420_SDataSet ds = null;

        // DM Setting
    	SP_SUP_1420_SDM dm = new SP_SUP_1420_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.rdr_nm = Util.checkString(req.getParameter("rdr_nm"));
		dm.acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
		dm.acpn_no = Util.checkString(req.getParameter("acpn_no"));
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1420_s(dm);
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
    public void sp_sup_1430_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1430_SDataSet ds = null;

        // DM Setting
    	SP_SUP_1430_SDM dm = new SP_SUP_1430_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1430_s(dm);
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
    public void sp_sup_1440_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1440_ADataSet ds = null;

        // DM Setting
    	SP_SUP_1440_ADM dm = new SP_SUP_1440_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.flag = Util.checkString(req.getParameter("flag"));
		dm.acpn_no = Util.checkString(req.getParameter("acpn_no"));
		dm.cns_clsf = Util.checkString(req.getParameter("cns_clsf"));
		dm.acpn_pers = Util.checkString(req.getParameter("acpn_per_no"));	/**접수자 사번**/
		
		dm.acpn_dt = Util.checkString(req.getParameter("acpn_dt_s")).substring(0,4)+
		   			 Util.checkString(req.getParameter("acpn_dt_s")).substring(5,7)+
		   			 Util.checkString(req.getParameter("acpn_dt_s")).substring(8,10); //상담일자
		dm.acpn_bgn_tm = Util.checkString(req.getParameter("acpn_dt_s")).substring(12,14)+
						 Util.checkString(req.getParameter("acpn_dt_s")).substring(15,17);
						 
		dm.acpn_end_tm = Util.checkString(req.getParameter("acpn_end_tm"));
		dm.acpn_clsf = Util.checkString(req.getParameter("acpn_clsf"));		/**접수구분**/
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_no")).substring(0,1);	/**거래처코드**/
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_no")).substring(1,6);		/**거래처코드**/
		dm.dlco_seq = Util.checkString(req.getParameter("dlco_no")).substring(6,9);		/**거래처코드**/
		dm.rdr_nm = Util.checkString(req.getParameter("rdr_nm_s"));  /**독자명**/
		dm.type_cd = Util.checkString(req.getParameter("type_cd"));
		dm.cns_ptcr = Util.checkString(req.getParameter("cns_ptcr_s"));	/**상세내역**/
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.end_dt_tm = Util.checkString(req.getParameter("end_dt_tm"));
		dm.cns_cont_clsf_1 = Util.checkString(req.getParameter("cns_cont_clsf_1"));
		dm.cns_cont_clsf_2 = Util.checkString(req.getParameter("cns_cont_clsf_2"));
		dm.cns_cont_clsf_3 = Util.checkString(req.getParameter("cns_cont_clsf_3"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1440_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**********************************************************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1510_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1510_LDM dm = new SP_SUP_1510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**********************************************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1600_MDataSet ds = null;

        // DM Setting
    	SP_SUP_1600_MDM dm = new SP_SUP_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1600_m(dm);
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
    public void sp_sup_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1610_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1610_LDM dm = new SP_SUP_1610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.cont = Util.checkString(req.getParameter("cont"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1610_l(dm);
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
    public void sp_sup_1620_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1620_SDataSet ds = null;

        // DM Setting
    	SP_SUP_1620_SDM dm = new SP_SUP_1620_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.seq = Util.checkString(req.getParameter("seq"));		
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1620_s(dm);
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
    public void sp_sup_1630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1630_ADataSet ds = null;

        // DM Setting
    	SP_SUP_1630_ADM dm = new SP_SUP_1630_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = Util.checkString(req.getParameter("seq_s"));
		dm.proc_pers = Util.checkString(req.getParameter("proc_pers"));
		dm.proc_dt = Util.checkString(req.getParameter("proc_dt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat_s"));
		dm.proc_cont = Util.checkString(req.getParameter("proc_cont"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1630_a(dm);
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
    public void sp_sup_1700_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
    	DBManager manager = new DBManager("MISISP");
		Hashtable ht = new Hashtable();
		byte[] img = new byte[10485760]; //10Mb
		String file_name = "";
		String file_size = "";
		
		int sizeLimit = 10 * 1024 * 1024 ;

        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB

		SP_SUP_1700_ADataSet ds = null;
		SP_SUP_1700_ADM dm = new SP_SUP_1700_ADM();

		Part part; 
				
		while ((part = mp.readNextPart()) != null) {
				
		    String name  = part.getName();
		    	
			if (part.isParam()) {
				ht.put(part.getName(), ((ParamPart)part).getStringValue());
		    }else if (part.isFile()) {
		        FilePart filePart = (FilePart) part;
		        file_name = filePart.getFileName();
		        
		        if ( file_name != null ) {		        	
		        	InputStream in = filePart.getInputStream();
					dm.img = StreamUtil.readFromStream(in);
					file_size = String.valueOf(img.length);
		    		dm.file_size = file_size;
		        }
		    }
		}
		try {
			manager.getConnection();
	        manager.m_conn.setAutoCommit(false);
	     
	        CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
	        dm.dlco_no = ht.get("dlco_no").toString();
	        //dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
			dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ip = Util.checkString(req.getRemoteAddr());
			
			
	        // 파라미터 설정
	        cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setString(3, dm.cmpy_cd);
			cstmt.setString(4, dm.dlco_no);
			cstmt.setBytes(5,  "1010".getBytes());
			cstmt.setString(6, dm.file_size);
			cstmt.setString(7, dm.incmg_pers);
			cstmt.setString(8, dm.incmg_pers_ip);
	        
			
			
	        // 실행
	        cstmt.execute();
	        
	        // 결과
	        ds = (SP_SUP_1700_ADataSet)dm.createDataSetObject();               
	        
	        ds.getValues(cstmt);
	        System.out.println("..... status..1");
	        if(!"".equals(ds.errcode)){
	        	System.out.println("..... error..1");
	        	System.out.println(ds.errmsg);
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
		
	        Statement stmt = manager.m_conn.createStatement();
	        
	       	//첫번째 첨부파일
	       	if(dm.img != null && dm.img.length != 0){
	       		System.out.println("..... status..2");
	           	String blobQuery1 =	"SELECT IMG " +
	               					"  FROM TAISM_DLCOIMG " +
	               					" WHERE DLCO_NO  	= '" + dm.dlco_no + "' " +
	               					"FOR UPDATE";
	           	
	           	System.out.println("blobQuery1=" + blobQuery1);
	           	
	           	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);	               	
	           	if (rset1.next()) { 
	           		System.out.println("..... status..3");
	               weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	               BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
         	   		//레진용(ep1)
         	   		//oracle.sql.BLOB oracle_blob1 = (BLOB)rset1.getBlob(1);		               
	               OutputStream os1 = oracle_blob1.getBinaryOutputStream();
	               // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	               for(int i=0; i<dm.img.length; i++){
	                   os1.write(dm.img[i]);
	               }
	               os1.close();
	           	}
	           	System.out.println("..... status..4");
	       	}
	       	
	       	stmt.close();
            manager.disConnection();
            
		} catch(Exception e){
			System.out.println("..... error..2");
			try{
     		   	manager.m_conn.rollback();
     	   	}catch(SQLException se){
     	   		throw new SysException(se);
     	   	}
     	   	manager.disConnection();
     	   throw new AppException(e.getMessage(), "9999");
		}
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sup_1701_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1701_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1701_LDM dm = new SP_SUP_1701_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_no_fr = Util.checkString(req.getParameter("dlco_no_fr"));
		dm.dlco_no_to = Util.checkString(req.getParameter("dlco_no_to"));
		dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1701_l(dm);
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
    public void sp_sup_1702_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SUP_1702_LDataSet ds = null;

        // DM Setting
    	SP_SUP_1702_LDM dm = new SP_SUP_1702_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.print();
     
        try {
        	SpSup1000DAO dao = new SpSup1000DAO();
            ds = dao.sp_sup_1702_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
}
