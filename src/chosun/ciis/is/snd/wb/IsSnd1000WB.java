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

package chosun.ciis.is.snd.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.snd.dao.IsSnd1000DAO;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsSnd1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_snd_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1000_MDataSet ds = null;

        // DM Setting
    	IS_SND_1000_MDM dm = new IS_SND_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1000_m(dm);
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
    public void is_snd_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1010_LDataSet ds = null;

        // DM Setting
    	IS_SND_1010_LDM dm = new IS_SND_1010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.send_atic_no = Util.checkString(req.getParameter("send_atic_no"));
		dm.send_atic_nm = Util.checkString(req.getParameter("send_atic_nm"));
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1010_l(dm);
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
    public void is_snd_1020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1020_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));  
    	String send_atic_no = Util.checkString((String)hash.get("send_atic_no"));  
    	String send_atic_nm = Util.checkString((String)hash.get("send_atic_nm"));  
    	String reg_dd = Util.checkString((String)hash.get("reg_dd"));  
    	String car_kind = Util.checkString((String)hash.get("car_kind"));  
    	String yy_styl = Util.checkString((String)hash.get("yy_styl"));  
    	String car_no = Util.checkString((String)hash.get("car_no"));  
    	String prn = Util.checkString((String)hash.get("prn"));  
    	String tel = Util.checkString((String)hash.get("tel"));  
    	String ceph = Util.checkString((String)hash.get("ceph"));  
    	String remk = Util.checkString((String)hash.get("remk"));  
    	String wh_cd = Util.checkString((String)hash.get("wh_cd")); 
    	String driv_yn = Util.checkString((String)hash.get("driv_yn")); 
    	String zip_1 = Util.checkString((String)hash.get("zip_1"));  
    	String zip_2 = Util.checkString((String)hash.get("zip_2"));  
    	String addr = Util.checkString((String)hash.get("addr")); 
    	String dtls_addr = Util.checkString((String)hash.get("dtls_addr"));

        // DM Setting
    	IS_SND_1020_ADM dm = new IS_SND_1020_ADM();
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setMode(mode.toUpperCase());
    	dm.setSend_atic_no(send_atic_no);
    	dm.setSend_atic_nm(send_atic_nm);
    	dm.setReg_dd(reg_dd);
    	dm.setCar_kind(car_kind);
    	dm.setYy_styl(yy_styl);
    	dm.setCar_no(car_no);
    	dm.setPrn(prn);
    	dm.setTel(tel);
    	dm.setCeph(ceph);
    	dm.setRemk(remk);
    	dm.setWh_cd(wh_cd);
    	dm.setDriv_yn(driv_yn);
    	dm.setZip_1(zip_1);
    	dm.setZip_2(zip_2);
    	dm.setAddr(addr);
    	dm.setDtls_addr(dtls_addr);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1020_a(dm);
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
    public void is_snd_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1100_MDataSet ds = null;

        // DM Setting
    	IS_SND_1100_MDM dm = new IS_SND_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1100_m(dm);
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
    public void is_snd_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1110_LDataSet ds = null;

        // DM Setting
    	IS_SND_1110_LDM dm = new IS_SND_1110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt = Util.checkString(req.getParameter("scat_dt"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1110_l(dm);
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
    public void is_snd_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1120_LDataSet ds = null;

        // DM Setting
    	IS_SND_1120_LDM dm = new IS_SND_1120_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
		dm.acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));		
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1120_l(dm);
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
    public void is_snd_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1200_MDataSet ds = null;

        // DM Setting
    	IS_SND_1200_MDM dm = new IS_SND_1200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1200_m(dm);
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
    public void is_snd_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1210_LDataSet ds = null;

        // DM Setting
    	IS_SND_1210_LDM dm = new IS_SND_1210_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1210_l(dm);
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
    public void is_snd_1220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1220_LDataSet ds = null;

        // DM Setting
    	IS_SND_1220_LDM dm = new IS_SND_1220_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1220_l(dm);
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
    public void is_snd_1230_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1230_LDataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
    	String std_cd_1 = Util.checkString((String)hash1.get("cd"));  
    	String bnch_qty_1 = Util.checkString((String)hash1.get("cdnm_cd")); 
    	String cmpy_cd_2 = Util.checkString((String)hash2.get("cmpy_cd"));  
    	String asnt_dstc_cd_2 = Util.checkString((String)hash2.get("asnt_dstc_cd")); 
    	
        // DM Setting
    	IS_SND_1230_LDM dm = new IS_SND_1230_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.setStd_cd_1(std_cd_1);
		dm.setBnch_qty_1(bnch_qty_1);
		dm.setCmpy_cd_2(cmpy_cd_2);
		dm.setAsnt_dstc_cd_2(asnt_dstc_cd_2);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1230_l(dm);
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
    public void is_snd_1240_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1240_LDataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3")); 
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	
    	String std_cd_1 = Util.checkString((String)hash1.get("cd"));  
    	String bnch_qty_1 = Util.checkString((String)hash1.get("cdnm_cd")); 
    	String cmpy_cd_2 = Util.checkString((String)hash2.get("cmpy_cd"));  
    	String asnt_dstc_cd_2 = Util.checkString((String)hash2.get("asnt_dstc_cd")); 
    	String cmpy_cd_3 = Util.checkString((String)hash3.get("cmpy_cd"));
    	String acwr_reg_dt_3 = Util.checkString((String)hash3.get("acwr_reg_dt")); 
    	String acwr_reg_seq_3 = Util.checkString((String)hash3.get("acwr_reg_seq")); 
    	String bnch_qty_3 = Util.checkString((String)hash3.get("bnch_qty")); 
    	
        // DM Setting
    	IS_SND_1240_LDM dm = new IS_SND_1240_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.setStd_cd_1(std_cd_1);
		dm.setBnch_qty_1(bnch_qty_1);
		dm.setCmpy_cd_2(cmpy_cd_2);
		dm.setAsnt_dstc_cd_2(asnt_dstc_cd_2);
		dm.setCmpy_cd_3(cmpy_cd_3);
		dm.setAcwr_reg_dt_3(acwr_reg_dt_3);
		dm.setAcwr_reg_seq_3(acwr_reg_seq_3);
		dm.setBnch_qty_3(bnch_qty_3);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1240_l(dm);
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
    public void is_snd_1250_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1250_LDataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3")); 
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4")); 
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	
    	String std_cd_1 = Util.checkString((String)hash1.get("cd"));  
    	String bnch_qty_1 = Util.checkString((String)hash1.get("cdnm_cd")); 
    	String cmpy_cd_2 = Util.checkString((String)hash2.get("cmpy_cd"));  
    	String asnt_dstc_cd_2 = Util.checkString((String)hash2.get("asnt_dstc_cd")); 
    	String cmpy_cd_3 = Util.checkString((String)hash3.get("cmpy_cd"));
    	String acwr_reg_dt_3 = Util.checkString((String)hash3.get("acwr_reg_dt")); 
    	String acwr_reg_seq_3 = Util.checkString((String)hash3.get("acwr_reg_seq")); 
    	String bnch_qty_3 = Util.checkString((String)hash3.get("bnch_qty")); 
    	
    	String cmpy_cd_4 = Util.checkString((String)hash4.get("cmpy_cd"));
    	String purc_dlco_no_4 = Util.checkString((String)hash4.get("purc_dlco_no"));
    	String asnt_dstc_cd_4 = Util.checkString((String)hash4.get("asnt_dstc_cd"));

    	
        // DM Setting
    	IS_SND_1250_LDM dm = new IS_SND_1250_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd")); //
		dm.send_dt = Util.checkString(req.getParameter("send_dt"));
		dm.send_seq = Util.checkString(req.getParameter("send_seq"));
		
		if(Util.checkString(req.getParameter("send_seq")).equals("")){
			dm.flag = "I";
		}else{
			dm.flag = "";
		}
		
		
		dm.setStd_cd_1(std_cd_1);
		dm.setBnch_qty_1(bnch_qty_1);
		dm.setCmpy_cd_2(cmpy_cd_2);
		dm.setAsnt_dstc_cd_2(asnt_dstc_cd_2);
		dm.setCmpy_cd_3(cmpy_cd_3);
		dm.setAcwr_reg_dt_3(acwr_reg_dt_3);
		dm.setAcwr_reg_seq_3(acwr_reg_seq_3);
		dm.setBnch_qty_3(bnch_qty_3);
		dm.setCmpy_cd_4(cmpy_cd_4);
		dm.setPurc_dlco_no_4(purc_dlco_no_4);
		dm.setAsnt_dstc_cd_4(asnt_dstc_cd_4);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1250_l(dm);
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
    public void is_snd_1255_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1255_LDataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3")); 
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4")); 
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	
    	String std_cd_1 = Util.checkString((String)hash1.get("cd"));  
    	String bnch_qty_1 = Util.checkString((String)hash1.get("cdnm_cd")); 
    	String cmpy_cd_2 = Util.checkString((String)hash2.get("cmpy_cd"));  
    	String asnt_dstc_cd_2 = Util.checkString((String)hash2.get("asnt_dstc_cd")); 
    	String cmpy_cd_3 = Util.checkString((String)hash3.get("cmpy_cd"));
    	String acwr_reg_dt_3 = Util.checkString((String)hash3.get("acwr_reg_dt")); 
    	String acwr_reg_seq_3 = Util.checkString((String)hash3.get("acwr_reg_seq")); 
    	String bnch_qty_3 = Util.checkString((String)hash3.get("bnch_qty")); 
    	String cmpy_cd_4 = Util.checkString((String)hash4.get("cmpy_cd"));
    	String purc_dlco_no_4 = Util.checkString((String)hash4.get("purc_dlco_no"));
    	String asnt_dstc_cd_4 = Util.checkString((String)hash4.get("asnt_dstc_cd"));
    	
        // DM Setting
    	IS_SND_1255_LDM dm = new IS_SND_1255_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd")); //
		dm.send_dt = Util.checkString(req.getParameter("send_dt"));
		dm.send_seq = Util.checkString(req.getParameter("send_seq"));
		if(Util.checkString(req.getParameter("send_seq")).equals("")){
			dm.flag = "I";
		}else{
			dm.flag = "";
		}
		dm.setStd_cd_1(std_cd_1);
		dm.setBnch_qty_1(bnch_qty_1);
		dm.setCmpy_cd_2(cmpy_cd_2);
		dm.setAsnt_dstc_cd_2(asnt_dstc_cd_2);
		dm.setCmpy_cd_3(cmpy_cd_3);
		dm.setAcwr_reg_dt_3(acwr_reg_dt_3);
		dm.setAcwr_reg_seq_3(acwr_reg_seq_3);
		dm.setBnch_qty_3(bnch_qty_3);
		dm.setCmpy_cd_4(cmpy_cd_4);
		dm.setPurc_dlco_no_4(purc_dlco_no_4);
		dm.setAsnt_dstc_cd_4(asnt_dstc_cd_4);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1255_l(dm);
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
    public void is_snd_1260_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1260_ADataSet ds = null;

    	String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5")); 
    	Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
    	
    	String send_cmpy_cd = Util.checkString((String)hash5.get("send_cmpy_cd")); 
    	String advcs_cd = Util.checkString((String)hash5.get("advcs_cd")); 
    	String std_cd = Util.checkString((String)hash5.get("std_cd")); 
    	String scat_dt = Util.checkString((String)hash5.get("scat_dt")); 
    	String bnch_qty = Util.checkString((String)hash5.get("bnch_qty")); 
    	String qunt = Util.checkString((String)hash5.get("qunt")); 
    	String bnch_qunt = Util.checkString((String)hash5.get("bnch_qunt")); 
    	String asnt_dstc_cd = Util.checkString((String)hash5.get("asnt_dstc_cd")); 
    	String purc_dlco_no = Util.checkString((String)hash5.get("purc_dlco_no")); 
    	String dstc_seqo = Util.checkString((String)hash5.get("dstc_seqo")); 
    	String dept_cd = Util.checkString((String)hash5.get("dept_cd")); 
    	String sub_dept_cd = Util.checkString((String)hash5.get("sub_dept_cd")); 
    	String chrg_pers = Util.checkString((String)hash5.get("chrg_pers")); 
    	String acwr_reg_dt = Util.checkString((String)hash5.get("acwr_reg_dt")); 
    	String acwr_reg_seq = Util.checkString((String)hash5.get("acwr_reg_seq")); 
    	String purc_reg_dt = Util.checkString((String)hash5.get("purc_reg_dt")); 
    	String purc_reg_seq = Util.checkString((String)hash5.get("purc_reg_seq"));
    	String group_cnt = Util.checkString((String)hash5.get("group_cnt")); 
    	String group_order = Util.checkString((String)hash5.get("group_order")); 
    	
        // DM Setting
    	IS_SND_1260_ADM dm = new IS_SND_1260_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd2"));
		dm.send_dt = Util.checkString(req.getParameter("send_dt"));
		dm.send_seq = Util.checkString(req.getParameter("send_seq"));
		dm.send_atic_no = Util.checkString(req.getParameter("send_atic_no"));
		dm.send_atic_nm = Util.checkString(req.getParameter("send_atic_nm"));
		dm.sendclsf = Util.checkString(req.getParameter("sendclsf"));
		dm.serv_ref = Util.checkString(req.getParameter("serv_ref"));
		dm.cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
		dm.send_fee = Util.checkString(req.getParameter("send_fee"));
		dm.start_tm = Util.checkString(req.getParameter("start_tm"));
		dm.end_tm = Util.checkString(req.getParameter("end_tm"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.setSend_cmpy_cd(send_cmpy_cd);
		dm.setAdvcs_cd(advcs_cd);
		dm.setStd_cd(std_cd);
		dm.setScat_dt(scat_dt);
		dm.setBnch_qty(bnch_qty);
		dm.setQunt(qunt);
		dm.setBnch_qunt(bnch_qunt);
		dm.setAsnt_dstc_cd(asnt_dstc_cd);
		dm.setPurc_dlco_no(purc_dlco_no);
		dm.setDstc_seqo(dstc_seqo);
		dm.setDept_cd(dept_cd);
		dm.setSub_dept_cd(sub_dept_cd);
		dm.setChrg_pers(chrg_pers);
		dm.setAcwr_reg_dt(acwr_reg_dt);
		dm.setAcwr_reg_seq(acwr_reg_seq);
		dm.setPurc_reg_dt(purc_reg_dt);
		dm.setPurc_reg_seq(purc_reg_seq);
		dm.setGroup_cnt(group_cnt);
		dm.setGroup_order(group_order);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1260_a(dm);
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
    public void is_snd_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1300_MDataSet ds = null;

        // DM Setting
    	IS_SND_1300_MDM dm = new IS_SND_1300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1300_m(dm);
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
    public void is_snd_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1310_LDataSet ds = null;

        // DM Setting
    	IS_SND_1310_LDM dm = new IS_SND_1310_LDM();
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
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1310_l(dm);
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
    public void is_snd_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1400_MDataSet ds = null;

        // DM Setting
    	IS_SND_1400_MDM dm = new IS_SND_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1400_m(dm);
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
    public void is_snd_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1410_LDataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String std_kind_cd = Util.checkString((String)hash.get("cd"));  
    	String bnch_qty = Util.checkString((String)hash.get("cdnm_cd"));  

        // DM Setting
    	IS_SND_1410_LDM dm = new IS_SND_1410_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.setStd_kind_cd(std_kind_cd);
		dm.setBnch_qty(bnch_qty);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1410_l(dm);
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
    public void is_snd_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1420_LDataSet ds = null;

        // DM Setting
    	IS_SND_1420_LDM dm = new IS_SND_1420_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();;
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1420_l(dm);
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
    public void is_snd_1430_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1430_LDataSet ds = null;

        // DM Setting
    	IS_SND_1430_LDM dm = new IS_SND_1430_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();;
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1430_l(dm);
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
    public void is_snd_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1500_MDataSet ds = null;

        // DM Setting
    	IS_SND_1500_MDM dm = new IS_SND_1500_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1500_m(dm);
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
    public void is_snd_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1510_LDataSet ds = null;

        // DM Setting
    	IS_SND_1510_LDM dm = new IS_SND_1510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1510_l(dm);
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
    public void is_snd_1520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1520_LDataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String advcs_cd = Util.checkString((String)hash.get("advcs_cd"));  
    	String ariv_plan_tm = Util.checkString((String)hash.get("ariv_plan_tm"));  
    	
        // DM Setting
    	IS_SND_1520_LDM dm = new IS_SND_1520_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.setAdvcs_cd(advcs_cd);
		dm.setAriv_plan_tm(ariv_plan_tm);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1520_l(dm);
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
    public void is_snd_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1530_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String chk_000 = Util.checkString((String)hash.get("chk_000"));  
    	String ptph_no_000 = Util.checkString((String)hash.get("ptph_no_000"));  
    	String chk_010 = Util.checkString((String)hash.get("chk_010"));  
    	String ptph_no_010 = Util.checkString((String)hash.get("ptph_no_010"));
    	String chk_020 = Util.checkString((String)hash.get("chk_020"));  
    	String ptph_no_020 = Util.checkString((String)hash.get("ptph_no_020"));
    	String msg = Util.checkString((String)hash.get("msg"));
    	
        // DM Setting
    	IS_SND_1530_ADM dm = new IS_SND_1530_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.snd_tel = Util.checkString(req.getParameter("snd_tel"));
		dm.setChk_000(chk_000);
		dm.setPtph_no_000(ptph_no_000);
		dm.setChk_010(chk_010);
		dm.setPtph_no_010(ptph_no_010);
		dm.setChk_020(chk_020);
		dm.setPtph_no_020(ptph_no_020);
		dm.setMsg(msg);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1530_a(dm);
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
    public void is_snd_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1700_MDataSet ds = null;

        // DM Setting
    	IS_SND_1700_MDM dm = new IS_SND_1700_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1700_m(dm);
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
    public void is_snd_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1710_LDataSet ds = null;

        // DM Setting
    	IS_SND_1710_LDM dm = new IS_SND_1710_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.send_dt = Util.checkString(req.getParameter("send_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1710_l(dm);
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
    public void is_snd_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1720_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	//String flag = Util.checkString((String)hash.get("flag"));
    	String mode = Util.checkString((String)hash.get("m"));
    	String send_seq = Util.checkString((String)hash.get("send_seq"));
    	String send_atic_no = Util.checkString((String)hash.get("send_atic_no"));
    	String send_atic_nm = Util.checkString((String)hash.get("send_atic_nm"));
    	String sendclsf = Util.checkString((String)hash.get("sendclsf"));
    	String serv_ref = Util.checkString((String)hash.get("serv_ref"));
    	String cntc_plac = Util.checkString((String)hash.get("cntc_plac"));
    	String send_fee = Util.checkString((String)hash.get("send_fee"));
    	String start_tm = Util.checkString((String)hash.get("start_tm"));  
    	String end_tm = Util.checkString((String)hash.get("end_tm"));
    	String send_path = Util.checkString((String)hash.get("send_path"));
    	String send_advt_cont = Util.checkString((String)hash.get("send_advt_cont"));
    	String send_qunt = Util.checkString((String)hash.get("send_qunt"));
    	String remk = Util.checkString((String)hash.get("remk"));  

        // DM Setting
    	IS_SND_1720_ADM dm = new IS_SND_1720_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.send_dt = Util.checkString(req.getParameter("send_dt"));
		dm.spc_matt_1 = Util.checkString(req.getParameter("spc_matt_1"));
		//dm.spc_matt_2 = Util.checkString(req.getParameter("spc_matt_2"));
		
		//dm.setFlag(flag);
		dm.setMode(mode.toUpperCase());
		dm.setSend_seq(send_seq);		
		dm.setSend_atic_no(send_atic_no);
		dm.setSend_atic_nm(send_atic_nm);
		dm.setSendclsf(sendclsf);
		dm.setServ_ref(serv_ref);
		dm.setCntc_plac(cntc_plac);
		dm.setSend_fee(send_fee);		
		dm.setStart_tm(start_tm);
		dm.setEnd_tm(end_tm);		
		dm.setSend_path(send_path);
		dm.setSend_advt_cont(send_advt_cont);
		dm.setSend_qunt(send_qunt);		
		dm.setRemk(remk);		
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1720_a(dm);
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
    public void is_snd_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1800_MDataSet ds = null;

        // DM Setting
    	IS_SND_1800_MDM dm = new IS_SND_1800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1800_m(dm);
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
    public void is_snd_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_SND_1810_LDataSet ds = null;

        // DM Setting
    	IS_SND_1810_LDM dm = new IS_SND_1810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.wh_cd = Util.checkString(req.getParameter("wh_cd"));
		dm.advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
		dm.advt_nm = Util.checkString(req.getParameter("advt_nm"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsSnd1000DAO dao = new IsSnd1000DAO();
            ds = dao.is_snd_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    
    
    
    
    
    
}
