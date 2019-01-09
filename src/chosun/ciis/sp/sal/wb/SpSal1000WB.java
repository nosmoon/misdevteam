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

package chosun.ciis.sp.sal.wb;

import java.sql.CallableStatement;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.sp.sal.dao.SpSal1000DAO;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

import java.sql.SQLException;
import somo.framework.expt.SysException;
/**
 * 
 */

public class SpSal1000WB extends BaseWB {
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1010_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1010_LDM dm = new SP_SAL_1010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1020_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1020_ADM dm = new SP_SAL_1020_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1020_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1030_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1030_ADM dm = new SP_SAL_1030_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	/*****************************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1110_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1110_LDM dm = new SP_SAL_1110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1120_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String sale_yymm = Util.checkString ((String )hash1.get("sale_yymm"));
    	String dlco_cd = Util.checkString ((String )hash1.get("dlco_cd"));
    	String sale_item = Util.checkString ((String )hash1.get("sale_item"));
    	String ordr_no = Util.checkString ((String )hash1.get("ordr_no"));
    	String sale_cost = Util.checkString ((String )hash1.get("sale_cost"));
    	String qunt = Util.checkString ((String )hash1.get("qunt"));
    	String clamt_mthd = Util.checkString ((String )hash1.get("clamt_mthd"));
    	String suply_amt = Util.checkString ((String )hash1.get("suply_amt"));
    	String vat_amt = Util.checkString ((String )hash1.get("vat_amt"));
    	String ordr_amt = Util.checkString ((String )hash1.get("ordr_amt"));
    	String ipln_amt = Util.checkString ((String )hash1.get("ipln_amt"));
    	String ipln_meda_amt = Util.checkString ((String )hash1.get("ipln_meda_amt"));
    	String gds_no = Util.checkString ((String )hash1.get("gds_no"));
    	String gds_nm = Util.checkString ((String )hash1.get("gds_nm"));
    	String ordr_dt = Util.checkString ((String )hash1.get("ordr_dt"));
    	String suply_pers_ern = Util.checkString ((String )hash1.get("suply_pers_ern"));
    	String suply_pers_nm = Util.checkString ((String )hash1.get("suply_pers_nm"));

    	
        // DM Setting
    	SP_SAL_1120_ADM dm = new SP_SAL_1120_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.setSale_yymm(sale_yymm);
		dm.setDlco_cd(dlco_cd);
		dm.setSale_item(sale_item);
		dm.setOrdr_no(ordr_no);
		dm.setSale_cost(sale_cost);
		dm.setQunt(qunt);
		dm.setClamt_mthd(clamt_mthd);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setOrdr_amt(ordr_amt);
		dm.setIpln_amt(ipln_amt);
		dm.setIpln_meda_amt(ipln_meda_amt);
		dm.setGds_no(gds_no);
		dm.setGds_nm(gds_nm);
		dm.setOrdr_dt(ordr_dt);
		dm.setSuply_pers_ern(suply_pers_ern);
		dm.setSuply_pers_nm(suply_pers_nm);		
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
        	 ds = dao.sp_sal_1120_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1130_d(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1130_DDataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String seq = Util.checkString((String)hash1.get("seq"));

        // DM Setting
    	SP_SAL_1130_DDM dm = new SP_SAL_1130_DDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.setSeq(seq);       
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1130_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	/*****************************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1310_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1310_LDM dm = new SP_SAL_1310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1320_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
		String sell_dept_nm = Util.checkString((String)hash1.get("sell_dept_nm"));
		String sell_area_cd = Util.checkString((String)hash1.get("sell_area_cd"));
		String sell_area_nm = Util.checkString((String)hash1.get("sell_area_nm"));
		String bo_nm = Util.checkString((String)hash1.get("bo_nm"));
		String acol_no = Util.checkString((String)hash1.get("acol_no"));
		String dlco_no = Util.checkString((String)hash1.get("dlco_no"));
		String clam_apt = Util.checkString((String)hash1.get("clam_apt"));
		String clam_hous = Util.checkString((String)hash1.get("clam_hous"));
		String clam_shop_etc = Util.checkString((String)hash1.get("clam_shop_etc"));
		String ufth_apt = Util.checkString((String)hash1.get("ufth_apt"));
		String ufth_hous = Util.checkString((String)hash1.get("ufth_hous"));
		String ufth_shop_etc = Util.checkString((String)hash1.get("ufth_shop_etc"));
		String cnfm_apt = Util.checkString((String)hash1.get("cnfm_apt"));
		String cnfm_hous = Util.checkString((String)hash1.get("cnfm_hous"));
		String cnfm_shop_etc = Util.checkString((String)hash1.get("cnfm_shop_etc"));
		String alon_clam_qty = Util.checkString((String)hash1.get("alon_clam_qty"));
		String rdr_extn_alon = Util.checkString((String)hash1.get("rdr_extn_alon"));
		String pay_amt = Util.checkString((String)hash1.get("pay_amt"));
		

    	
        // DM Setting
    	SP_SAL_1320_ADM dm = new SP_SAL_1320_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.setSell_dept_nm(sell_dept_nm);   
		dm.setSell_area_cd(sell_area_cd);   
		dm.setSell_area_nm(sell_area_nm);   
		dm.setBo_nm(bo_nm);                 
		dm.setAcol_no(acol_no);             
		dm.setDlco_no(dlco_no);             
		dm.setClam_apt(clam_apt);           
		dm.setClam_hous(clam_hous);         
		dm.setClam_shop_etc(clam_shop_etc); 
		dm.setUfth_apt(ufth_apt);           
		dm.setUfth_hous(ufth_hous);         
		dm.setUfth_shop_etc(ufth_shop_etc); 
		dm.setCnfm_apt(cnfm_apt);           
		dm.setCnfm_hous(cnfm_hous);         
		dm.setCnfm_shop_etc(cnfm_shop_etc); 
		dm.setAlon_clam_qty(alon_clam_qty); 
		dm.setRdr_extn_alon(rdr_extn_alon); 
		dm.setPay_amt(pay_amt); 
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
        	 ds = dao.sp_sal_1320_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1330_d(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1330_DDataSet ds = null;

        // DM Setting
    	SP_SAL_1330_DDM dm = new SP_SAL_1330_DDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1330_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /*****************************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1200_MDataSet ds = null;

        // DM Setting
    	SP_SAL_1200_MDM dm = new SP_SAL_1200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1210_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1210_LDM dm = new SP_SAL_1210_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		//dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	DBManager manager        = null; //ERP
       	CallableStatement cstmt  = null;
       	
       	SP_SAL_1220_ADataSet ds = null;
       	SP_SAL_1220_ADM dm = new SP_SAL_1220_ADM();
    	
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    
    	
    	String[] mang_no = Util.checkString((String)hash1.get("mang_no")).split("#");							//서비스번호(엑셀컬럼명)
    	String[] entr_fee = Util.checkString((String)hash1.get("entr_fee")).split("#");							//가입비                
    	String[] phon_hdqt_fee = Util.checkString((String)hash1.get("phon_hdqt_fee")).split("#");				//기본료                
    	String[] rent = Util.checkString((String)hash1.get("rent")).split("#");									//전화기임대료          
    	String[] hzone_use_fee = Util.checkString((String)hash1.get("hzone_use_fee")).split("#");				//홈존지역통화료        
    	String[] ictry_tel_fee = Util.checkString((String)hash1.get("ictry_tel_fee")).split("#");				//유선전화통화료        
    	String[] p00755tel_fee = Util.checkString((String)hash1.get("p00755tel_fee")).split("#");				//전화료_00755          
    	String[] intl_tel_fee = Util.checkString((String)hash1.get("intl_tel_fee")).split("#");					//국제전화통화료        
    	String[] movm_tel_fee = Util.checkString((String)hash1.get("movm_tel_fee")).split("#");					//이동전화통화료        
    	String[] onnet_curc_fee = Util.checkString((String)hash1.get("onnet_curc_fee")).split("#");				//온넷사용료            
    	String[] p070curc_fee = Util.checkString((String)hash1.get("p070curc_fee")).split("#");					//통화료_070            
    	String[] in_pre_curc_fee = Util.checkString((String)hash1.get("in_pre_curc_fee")).split("#");			//내선통화료      ....      
    	String[] appm_curc_fee = Util.checkString((String)hash1.get("appm_curc_fee")).split("#");				//지정통화료            
    	String[] img_curc_fee = Util.checkString((String)hash1.get("img_curc_fee")).split("#");					//영상통화료            
    	String[] sms_use_fee = Util.checkString((String)hash1.get("sms_use_fee")).split("#");					//SMS사용료             
    	String[] supl_use_fee = Util.checkString((String)hash1.get("supl_use_fee")).split("#");					//부가이용료            
    	String[] sound_src_make_fee = Util.checkString((String)hash1.get("sound_src_make_fee")).split("#");		//음원제작비            
    	String[] frft = Util.checkString((String)hash1.get("frft")).split("#");									//위약금                
    	String[] entr_fee_dscn = Util.checkString((String)hash1.get("entr_fee_dscn")).split("#");				//가입비할인            
    	String[] base_fee_dscn = Util.checkString((String)hash1.get("base_fee_dscn")).split("#");				//기본료할인            
    	String[] rent_dscn = Util.checkString((String)hash1.get("rent_dscn")).split("#");						//임대료할인            
    	String[] ictry_tel_dscn = Util.checkString((String)hash1.get("ictry_tel_dscn")).split("#");				//유선전화요금할인      
    	String[] hzone_dscn = Util.checkString((String)hash1.get("hzone_dscn")).split("#");						//홈존통화요금할인      
    	String[] movm_tel_dscn = Util.checkString((String)hash1.get("movm_tel_dscn")).split("#");				//이동전화요금할인      
    	String[] intl_tel_dscn = Util.checkString((String)hash1.get("intl_tel_dscn")).split("#");				//국제전화요금할인      
    	String[] p00755dscn = Util.checkString((String)hash1.get("p00755dscn")).split("#");						//할인_00755            
    	String[] p070curc_dscn = Util.checkString((String)hash1.get("p070curc_dscn")).split("#");				//통화할인_070          
    	String[] in_pre_curc_dscn = Util.checkString((String)hash1.get("in_pre_curc_dscn")).split("#");			//내선통화할인          
    	String[] appm_curc_dscn = Util.checkString((String)hash1.get("appm_curc_dscn")).split("#");				//지정통화할인          
    	String[] cntr_prd_dscn = Util.checkString((String)hash1.get("cntr_prd_dscn")).split("#");				//계약기간할인          
    	String[] midl_plac_cmpy_dscn = Util.checkString((String)hash1.get("midl_plac_cmpy_dscn")).split("#");	//중소기업할인          
    	String[] onnet_dscn = Util.checkString((String)hash1.get("onnet_dscn")).split("#");						//온넷할인              
    	String[] etc_dscn = Util.checkString((String)hash1.get("etc_dscn")).split("#");							//기타할인              
    	String[] auto_shift_dscn = Util.checkString((String)hash1.get("auto_shift_dscn")).split("#");			//자동이체할인          
    	String[] use_fee_tot = Util.checkString((String)hash1.get("use_fee_tot")).split("#");					//합계                  
    	String[] use_pers = Util.checkString((String)hash1.get("use_pers")).split("#");							//전화번호              
    	String[] use_prd = Util.checkString((String)hash1.get("use_prd")).split("#");							//이용기간              
    	String[] chg_matt = Util.checkString((String)hash1.get("chg_matt")).split("#");							//변동사항              
        	
    	try {
			//0.DB연결
	    	manager = new DBManager("MISISP");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	
	       	for( int row=0; row<mang_no.length; row++){
	       		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
	    		dm.setMang_no(mang_no[row]);       
	    		
	    		dm.setEntr_fee(entr_fee[row]);                      
	    		dm.setPhon_hdqt_fee(phon_hdqt_fee[row]);            
	    		dm.setRent(rent[row]);                              
	    		dm.setHzone_use_fee(hzone_use_fee[row]);            
	    		dm.setIctry_tel_fee(ictry_tel_fee[row]);            
	    		dm.setP00755tel_fee(p00755tel_fee[row]);            
	    		dm.setIntl_tel_fee(intl_tel_fee[row]);              
	    		dm.setMovm_tel_fee(movm_tel_fee[row]);              
	    		dm.setOnnet_curc_fee(onnet_curc_fee[row]);          
	    		dm.setP070curc_fee(p070curc_fee[row]);     
	    		dm.setIn_pre_curc_fee(in_pre_curc_fee[row]);    
	    		dm.setAppm_curc_fee(appm_curc_fee[row]);     
	    		dm.setImg_curc_fee(img_curc_fee[row]);        
	    		dm.setSms_use_fee(sms_use_fee[row]);                
	    		dm.setSupl_use_fee(supl_use_fee[row]);              
	    		dm.setSound_src_make_fee(sound_src_make_fee[row]);  
	    		dm.setFrft(frft[row]);      
	    		dm.setEntr_fee_dscn(entr_fee_dscn[row]);            
	    		dm.setBase_fee_dscn(base_fee_dscn[row]);            
	    		dm.setRent_dscn(rent_dscn[row]);                    
	    		dm.setIctry_tel_dscn(ictry_tel_dscn[row]);          
	    		dm.setHzone_dscn(hzone_dscn[row]);                  
	    		dm.setMovm_tel_dscn(movm_tel_dscn[row]);            
	    		dm.setIntl_tel_dscn(intl_tel_dscn[row]);            
	    		dm.setP00755dscn(p00755dscn[row]);                  
	    		dm.setP070curc_dscn(p070curc_dscn[row]);     
	    		dm.setIn_pre_curc_dscn(in_pre_curc_dscn[row]); 
	    		dm.setAppm_curc_dscn(appm_curc_dscn[row]);     
	    		dm.setCntr_prd_dscn(cntr_prd_dscn[row]);            
	    		dm.setMidl_plac_cmpy_dscn(midl_plac_cmpy_dscn[row]);
	    		dm.setOnnet_dscn(onnet_dscn[row]);        
	    		dm.setEtc_dscn(etc_dscn[row]); 
	    		dm.setAuto_shift_dscn(auto_shift_dscn[row]);  
	    		dm.setUse_fee_tot(use_fee_tot[row]);
	    		dm.setUse_pers(use_pers[row]);   
	    		dm.setUse_prd(use_prd[row]);  
	    		//dm.setChg_matt(chg_matt[row]); 
	    		dm.incmg_pers_ip = req.getRemoteAddr();
	    		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	            //dm.print();
	       		
				cstmt = manager.m_conn.prepareCall(dm.getSQL());
		       	// 파라미터 설정
		       	dm.setParams(cstmt,dm);
		       	// 실행
		       	cstmt.execute();		       		

			    //System.out.println("SP_SAL_1220_ADataSet 실행전");		       	
		        // 결과
		       	ds = (SP_SAL_1220_ADataSet) dm.createDataSetObject();
		       	ds.getValues(cstmt);
		       	cstmt.close();
		       	if (!"".equals(ds.errcode)) {
			            throw new AppException(ds.errcode, ds.errmsg);
		        }
	 
		       	manager.commit();	
		    }
		       	
		}
	    catch (AppException e) {
	    	  if (manager != null)
		          manager.rollback();	
             throw e;   
		}catch (SQLException e) {
			if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
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
    public void sp_sal_1230_d(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1230_DDataSet ds = null;

        // DM Setting
    	SP_SAL_1230_DDM dm = new SP_SAL_1230_DDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1230_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	/*****************************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1400_MDataSet ds = null;

        // DM Setting
    	SP_SAL_1400_MDM dm = new SP_SAL_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1410_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1410_LDM dm = new SP_SAL_1410_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1420_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1420_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	//String mode = Util.checkString((String)hash1.get("m"));        		              
    	String dlco_no = Util.checkString((String)hash1.get("dlco_no")); 
    	String medi_nm = Util.checkString((String)hash1.get("medi_nm")); 
    	String qty = Util.checkString((String)hash1.get("qty")); 
    	String uprc = Util.checkString((String)hash1.get("uprc")); 
    	String amt = Util.checkString((String)hash1.get("amt")); 
    	String sale_seq = Util.checkString((String)hash1.get("sale_seq")); 
    	
    	
        // DM Setting
    	SP_SAL_1420_ADM dm = new SP_SAL_1420_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		//dm.setMode(mode.toUpperCase());    
    	dm.setDlco_no(dlco_no);
    	dm.setMedi_nm(medi_nm);
    	dm.setQty(qty);
    	dm.setUprc(uprc);
    	dm.setAmt(amt);
    	dm.setSale_seq(sale_seq);		
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1420_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1430_d(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1430_DDataSet ds = null;

        // DM Setting
    	SP_SAL_1430_DDM dm = new SP_SAL_1430_DDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1430_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	/*****************************************************************************************/
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1500_MDataSet ds = null;

        // DM Setting
    	SP_SAL_1500_MDM dm = new SP_SAL_1500_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1510_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1510_LDM dm = new SP_SAL_1510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
    	dm.cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1520_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1520_ADataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	String cmpy_dlco_no = Util.checkString((String)hash1.get("cmpy_dlco_no")); 
    	String cmpy_dlco_nm = Util.checkString((String)hash1.get("cmpy_dlco_nm")); 
    	String qty = Util.checkString((String)hash1.get("qty")); 
    	String sale_amt = Util.checkString((String)hash1.get("sale_amt")); 
    	String dlco_no = Util.checkString((String)hash1.get("dlco_no")); 
    	String dlco_nm = Util.checkString((String)hash1.get("dlco_nm")); 
    	String qty_2 = Util.checkString((String)hash1.get("qty_2")); 
    	String dlv_fee = Util.checkString((String)hash1.get("dlv_fee")); 
    	
        // DM Setting
    	SP_SAL_1520_ADM dm = new SP_SAL_1520_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));		
		dm.setCmpy_dlco_no(cmpy_dlco_no);
		dm.setCmpy_dlco_nm(cmpy_dlco_nm);
		dm.setQty(qty);
		dm.setSale_amt(sale_amt);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setQty_2(qty_2);
		dm.setDlv_fee(dlv_fee);
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1520_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1530_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1530_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1530_LDM dm = new SP_SAL_1530_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));    	
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
    	dm.cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
      
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1530_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }
    }

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1540_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1540_ADataSet ds = null;

    	
        // DM Setting
    	SP_SAL_1540_ADM dm = new SP_SAL_1540_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));		
 
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1540_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1560_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1560_ADataSet ds = null;

    	
        // DM Setting
    	SP_SAL_1560_ADM dm = new SP_SAL_1560_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));		
 
		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));		
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1560_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1570_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1570_ADataSet ds = null;

    	
        // DM Setting
    	SP_SAL_1570_ADM dm = new SP_SAL_1570_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));		

		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));		
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
      
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1570_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  
    
    /*****************************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1600_MDataSet ds = null;

        // DM Setting
    	SP_SAL_1600_MDM dm = new SP_SAL_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1610_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1610_LDM dm = new SP_SAL_1610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_no = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1620_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1620_SDataSet ds = null;

        // DM Setting
    	SP_SAL_1620_SDM dm = new SP_SAL_1620_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.seq = Util.checkString(req.getParameter("seq"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_seq = Util.checkString(req.getParameter("dlco_seq"));

        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1620_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1630_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1630_ADM dm = new SP_SAL_1630_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1640_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1640_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
		String mode = Util.checkString((String)hash1.get("m"));        		              
    	String seq = Util.checkString((String)hash1.get("seq"));             			
    	String dlco_clsf = Util.checkString((String)hash1.get("dlco_clsf"));            
    	String dlco_cd = Util.checkString((String)hash1.get("dlco_cd"));             	
    	String dlco_seq = Util.checkString((String)hash1.get("dlco_seq"));             	
    	String car_no = Util.checkString((String)hash1.get("car_no"));             		
    	String car_ownr_nm = Util.checkString((String)hash1.get("car_ownr_nm"));    	
    	String prn = Util.checkString((String)hash1.get("prn"));             			
    	String tel_no = Util.checkString((String)hash1.get("tel_no"));             	
    	String ptph_no = Util.checkString((String)hash1.get("ptph_no"));             	
    	String fax_no = Util.checkString((String)hash1.get("fax_no"));             		
    	String email = Util.checkString((String)hash1.get("email"));             		
    	String zip_1 = Util.checkString((String)hash1.get("zip_1"));             		
    	String zip_2 = Util.checkString((String)hash1.get("zip_2"));             		
    	String addr = Util.checkString((String)hash1.get("addr"));             			
    	String dtls_addr = Util.checkString((String)hash1.get("dtls_addr"));            
    	String yy_styl = Util.checkString((String)hash1.get("yy_styl"));             	
    	String engn_dsplt = Util.checkString((String)hash1.get("engn_dsplt"));          
    	String car_clsf = Util.checkString((String)hash1.get("car_clsf"));             	
    	String insr_entr_hope_yn = Util.checkString((String)hash1.get("insr_entr_hope_yn"));
    	String insr_rmtt_plan_dt = Util.checkString((String)hash1.get("insr_rmtt_plan_dt"));
    	String bank_nm = Util.checkString((String)hash1.get("bank_nm"));            
    	String rcpm_pers_nm = Util.checkString((String)hash1.get("rcpm_pers_nm"));  
    	String proc_clsf = Util.checkString((String)hash1.get("proc_clsf"));        
    	String insr_cmpy_nm = Util.checkString((String)hash1.get("insr_cmpy_nm"));  
    	String reg_dt = Util.checkString((String)hash1.get("reg_dt"));             	
    	String remk = Util.checkString((String)hash1.get("remk")); 
    	

        // DM Setting
    	SP_SAL_1640_ADM dm = new SP_SAL_1640_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setMode(mode.toUpperCase());    
    	dm.setSeq(seq);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_cd(dlco_cd);
    	dm.setDlco_seq(dlco_seq);
    	dm.setCar_no(car_no);
    	dm.setCar_ownr_nm(car_ownr_nm);
    	dm.setPrn(prn);
    	dm.setTel_no(tel_no);
    	dm.setPtph_no(ptph_no);
    	dm.setFax_no(fax_no);
    	dm.setEmail(email);
    	dm.setZip_1(zip_1);
    	dm.setZip_2(zip_2);
    	dm.setAddr(addr);
    	dm.setDtls_addr(dtls_addr);
    	dm.setYy_styl(yy_styl);
    	dm.setEngn_dsplt(engn_dsplt);
    	dm.setCar_clsf(car_clsf);
    	dm.setInsr_entr_hope_yn(insr_entr_hope_yn);    	
    	dm.setInsr_rmtt_plan_dt(insr_rmtt_plan_dt);
    	dm.setBank_nm(bank_nm);
    	dm.setRcpm_pers_nm(rcpm_pers_nm);
    	dm.setProc_clsf(proc_clsf);
    	dm.setInsr_cmpy_nm(insr_cmpy_nm);
    	dm.setReg_dt(reg_dt);
    	dm.setRemk(remk);    	
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1640_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1710_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1710_LDM dm = new SP_SAL_1710_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_sale_yymm = Util.checkString(req.getParameter("fr_sale_yymm"));
		dm.to_sale_yymm = Util.checkString(req.getParameter("to_sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1720_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1720_ADM dm = new SP_SAL_1720_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
    	dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1730_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1730_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1730_ADM dm = new SP_SAL_1730_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
    	dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1730_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1800_MDataSet ds = null;

        // DM Setting
    	SP_SAL_1800_MDM dm = new SP_SAL_1800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1800_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1810_LDataSet ds = null;

        // DM Setting
    	SP_SAL_1810_LDM dm = new SP_SAL_1810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
		dm.staf_nm = Util.checkString(req.getParameter("staf_nm"));
		dm.acty_area = Util.checkString(req.getParameter("acty_area"));
		dm.pay_plan_dt = Util.checkString(req.getParameter("pay_plan_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1820_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1820_ADM dm = new SP_SAL_1820_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
		dm.pay_plan_dt = Util.checkString(req.getParameter("pay_plan_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1820_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1825_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1825_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1825_ADM dm = new SP_SAL_1825_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
		dm.pay_plan_dt = Util.checkString(req.getParameter("pay_plan_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1825_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1830_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1830_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1830_ADM dm = new SP_SAL_1830_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
		dm.pay_plan_dt = Util.checkString(req.getParameter("pay_plan_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1830_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1835_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1835_ADataSet ds = null;

        // DM Setting
    	SP_SAL_1835_ADM dm = new SP_SAL_1835_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
		dm.pay_plan_dt = Util.checkString(req.getParameter("pay_plan_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1835_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_1840_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_1840_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	String mode = Util.checkString((String )hash1.get("m"));                                                 
    	String seq = Util.checkString((String )hash1.get("seq"));                                                
    	String staf_no = Util.checkString((String )hash1.get("staf_no"));                                        
    	String staf_nm = Util.checkString((String )hash1.get("staf_nm"));                                        
    	String acty_area = Util.checkString((String )hash1.get("acty_area"));                                    
    	String prn = Util.checkString((String )hash1.get("prn"));                                                
    	String a_hous_rdr_extn_qty = Util.checkString((String )hash1.get("a_hous_rdr_extn_qty"));                
    	String a_apt_rdr_extn_qty = Util.checkString((String )hash1.get("a_apt_rdr_extn_qty"));                  
    	String a_shop_rdr_extn_qty = Util.checkString((String )hash1.get("a_shop_rdr_extn_qty"));                
    	String a_hous_ufth_qty = Util.checkString((String )hash1.get("a_hous_ufth_qty"));                        
    	String a_apt_ufth_qty = Util.checkString((String )hash1.get("a_apt_ufth_qty"));                          
    	String a_shop_ufth_qty = Util.checkString((String )hash1.get("a_shop_ufth_qty"));                        
    	String a_hous_fix_qty = Util.checkString((String )hash1.get("a_hous_fix_qty"));                          
    	String a_apt_fix_qty = Util.checkString((String )hash1.get("a_apt_fix_qty"));                            
    	String a_shop_fix_qty = Util.checkString((String )hash1.get("a_shop_fix_qty"));                          
    	String b_hous_rdr_extn_qty = Util.checkString((String )hash1.get("b_hous_rdr_extn_qty"));                
    	String b_apt_rdr_extn_qty = Util.checkString((String )hash1.get("b_apt_rdr_extn_qty"));                  
    	String b_shop_rdr_extn_qty = Util.checkString((String )hash1.get("b_shop_rdr_extn_qty"));                
    	String b_hous_ufth_qty = Util.checkString((String )hash1.get("b_hous_ufth_qty"));                        
    	String b_apt_ufth_qty = Util.checkString((String )hash1.get("b_apt_ufth_qty"));                          
    	String b_shop_ufth_qty = Util.checkString((String )hash1.get("b_shop_ufth_qty"));                        
    	String b_hous_fix_qty = Util.checkString((String )hash1.get("b_hous_fix_qty"));                          
    	String b_apt_fix_qty = Util.checkString((String )hash1.get("b_apt_fix_qty"));                            
    	String b_shop_fix_qty = Util.checkString((String )hash1.get("b_shop_fix_qty"));                          
    	String rdr_extn_alon = Util.checkString((String )hash1.get("rdr_extn_alon"));                            
    	String leader_alon = Util.checkString((String )hash1.get("leader_alon"));                                
    	String jungbuhonam_spc_acty_cost = Util.checkString((String )hash1.get("jungbuhonam_spc_acty_cost"));    
    	String mvin_team_spc_acty_cost = Util.checkString((String )hash1.get("mvin_team_spc_acty_cost"));        
    	String no_val_shrt_fee = Util.checkString((String )hash1.get("no_val_shrt_fee"));                        
    	String rdr_extn_sctn_clsi_fee = Util.checkString((String )hash1.get("rdr_extn_sctn_clsi_fee"));          
    	String etc_alon_1 = Util.checkString((String )hash1.get("etc_alon_1"));                                  
    	String etc_alon_2 = Util.checkString((String )hash1.get("etc_alon_2"));                                  
    	String etc_alon_3 = Util.checkString((String )hash1.get("etc_alon_3"));                                  
    	String pre_pay_dduc = Util.checkString((String )hash1.get("pre_pay_dduc"));                              
    	String etc_dduc_1 = Util.checkString((String )hash1.get("etc_dduc_1"));                                  
    	String etc_dduc_2 = Util.checkString((String )hash1.get("etc_dduc_2"));                                  
    	String etc_dduc_3 = Util.checkString((String )hash1.get("etc_dduc_3"));                                  
    	String stot_amt = Util.checkString((String )hash1.get("stot_amt"));                                      
    	String tax_amt_dduc = Util.checkString((String )hash1.get("tax_amt_dduc"));                              
    	String res_tax_dduc = Util.checkString((String )hash1.get("res_tax_dduc"));                              
    	String real_pay_amt = Util.checkString((String )hash1.get("real_pay_amt"));                                
    	String wclam_subm_yn = Util.checkString((String )hash1.get("wclam_subm_yn"));                              
    	String clos_yn = Util.checkString((String )hash1.get("clos_yn"));                                          
    	String dlco_clsf_cd = Util.checkString((String )hash1.get("dlco_clsf_cd"));                                
    	String dlco_cd = Util.checkString((String )hash1.get("dlco_cd"));                                          
    	String setl_bank = Util.checkString((String )hash1.get("setl_bank_nm"));                                      
    	String rcpm_main_nm = Util.checkString((String )hash1.get("rcpm_main_nm"));                                
    	String acct_no = Util.checkString((String )hash1.get("acct_no"));                                          
    	String pay_plan_dt = Util.checkString((String )hash1.get("pay_plan_dt"));                                  
    	String remk = Util.checkString((String )hash1.get("remk"));     		              
    	
    	
        // DM Setting
    	SP_SAL_1840_ADM dm = new SP_SAL_1840_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
		dm.setMode(mode.toUpperCase()); 
		dm.setSeq(seq);
		dm.setStaf_no(staf_no);
		dm.setStaf_nm(staf_nm);
		dm.setActy_area(acty_area);
		dm.setPrn(prn);
		dm.setA_hous_rdr_extn_qty(a_hous_rdr_extn_qty);
		dm.setA_apt_rdr_extn_qty(a_apt_rdr_extn_qty);
		dm.setA_shop_rdr_extn_qty(a_shop_rdr_extn_qty);
		dm.setA_hous_ufth_qty(a_hous_ufth_qty);
		dm.setA_apt_ufth_qty(a_apt_ufth_qty);
		dm.setA_shop_ufth_qty(a_shop_ufth_qty);
		dm.setA_hous_fix_qty(a_hous_fix_qty);
		dm.setA_apt_fix_qty(a_apt_fix_qty);
		dm.setA_shop_fix_qty(a_shop_fix_qty);
		dm.setB_hous_rdr_extn_qty(b_hous_rdr_extn_qty);
		dm.setB_apt_rdr_extn_qty(b_apt_rdr_extn_qty);
		dm.setB_shop_rdr_extn_qty(b_shop_rdr_extn_qty);
		dm.setB_hous_ufth_qty(b_hous_ufth_qty);
		dm.setB_apt_ufth_qty(b_apt_ufth_qty);
		dm.setB_shop_ufth_qty(b_shop_ufth_qty);
		dm.setB_hous_fix_qty(b_hous_fix_qty);
		dm.setB_apt_fix_qty(b_apt_fix_qty);
		dm.setB_shop_fix_qty(b_shop_fix_qty);
		dm.setRdr_extn_alon(rdr_extn_alon);
		dm.setLeader_alon(leader_alon);
		dm.setJungbuhonam_spc_acty_cost(jungbuhonam_spc_acty_cost);
		dm.setMvin_team_spc_acty_cost(mvin_team_spc_acty_cost);
		dm.setNo_val_shrt_fee(no_val_shrt_fee);
		dm.setRdr_extn_sctn_clsi_fee(rdr_extn_sctn_clsi_fee);
		dm.setEtc_alon_1(etc_alon_1);
		dm.setEtc_alon_2(etc_alon_2);
		dm.setEtc_alon_3(etc_alon_3);
		dm.setPre_pay_dduc(pre_pay_dduc);
		dm.setEtc_dduc_1(etc_dduc_1);
		dm.setEtc_dduc_2(etc_dduc_2);
		dm.setEtc_dduc_3(etc_dduc_3);
		dm.setStot_amt(stot_amt);
		dm.setTax_amt_dduc(tax_amt_dduc);
		dm.setRes_tax_dduc(res_tax_dduc);
		dm.setReal_pay_amt(real_pay_amt);
		dm.setWclam_subm_yn(wclam_subm_yn);
		dm.setClos_yn(clos_yn);
		dm.setDlco_clsf_cd(dlco_clsf_cd);
		dm.setDlco_cd(dlco_cd);
		dm.setSetl_bank(setl_bank);
		dm.setRcpm_main_nm(rcpm_main_nm);
		dm.setAcct_no(acct_no);
		dm.setPay_plan_dt(pay_plan_dt);
		dm.setRemk(remk);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_1840_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2000_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2000_MDM dm = new SP_SAL_2000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2010_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2010_LDM dm = new SP_SAL_2010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2020_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
		String dlco_no = Util.checkString((String)hash1.get("dlco_no"));
		String qunt = Util.checkString((String)hash1.get("qunt"));
		String sale_cost = Util.checkString((String)hash1.get("sale_cost"));
		String sale_amt = Util.checkString((String)hash1.get("sale_amt"));

    	
        // DM Setting
    	SP_SAL_2020_ADM dm = new SP_SAL_2020_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.setDlco_no(dlco_no);   
		dm.setQunt(qunt); 
		dm.setSale_cost(sale_cost);
		dm.setSale_amt(sale_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
        	 ds = dao.sp_sal_2020_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2030_d(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2030_DDataSet ds = null;

        // DM Setting
    	SP_SAL_2030_DDM dm = new SP_SAL_2030_DDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2030_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2100_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2100_MDM dm = new SP_SAL_2100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2110_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2110_LDM dm = new SP_SAL_2110_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2120_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	String mode = Util.checkString((String)hash1.get("m")); 
    	String sale_yymm = Util.checkString((String)hash1.get("sale_yymm"));
    	String sale_seq = Util.checkString((String)hash1.get("sale_seq"));
    	String sale_item_cd = Util.checkString((String)hash1.get("sale_item_cd"));
    	String dlco_no = Util.checkString((String)hash1.get("dlco_no"));
    	String qunt = Util.checkString((String)hash1.get("qunt"));
    	String sale_cost = Util.checkString((String)hash1.get("sale_cost"));
    	String tot_rvord_amt = Util.checkString((String)hash1.get("tot_rvord_amt"));
    	String rcpm_clsf = Util.checkString((String)hash1.get("rcpm_clsf"));
    	String suply_amt = Util.checkString((String)hash1.get("suply_amt"));
    	String vat_amt = Util.checkString((String)hash1.get("vat_amt"));
    	
    	
        // DM Setting
    	SP_SAL_2120_ADM dm = new SP_SAL_2120_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.setMode(mode.toUpperCase());  
		dm.setSale_yymm(sale_yymm);
		dm.setSale_seq(sale_seq);  
		dm.setSale_item_cd(sale_item_cd);  
		dm.setDlco_no(dlco_no);  
		dm.setQunt(qunt);  
		dm.setSale_cost(sale_cost);
		dm.setTot_rvord_amt(tot_rvord_amt);
		dm.setRcpm_clsf(rcpm_clsf);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2120_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2130_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2130_SDataSet ds = null;

        // DM Setting
    	SP_SAL_2130_SDM dm = new SP_SAL_2130_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2130_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2200_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2200_MDM dm = new SP_SAL_2200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2210_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2210_LDM dm = new SP_SAL_2210_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("b_dlco_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2220_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2220_LDM dm = new SP_SAL_2220_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
		dm.reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
		dm.c_dlco_no = Util.checkString(req.getParameter("c_dlco_no"));
		dm.b_dlco_no = Util.checkString(req.getParameter("b_dlco_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	DBManager manager        = null; //ERP
       	CallableStatement cstmt  = null;
       	
		SP_SAL_2230_ADataSet ds = null;
		SP_SAL_2230_ADM dm = new SP_SAL_2230_ADM();
    	 
		SP_SAL_2235_ADataSet ds1 = null;
		SP_SAL_2235_ADM dm1 = new SP_SAL_2235_ADM();
		
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
System.out.println("multiUpdateData1::"+multiUpdateData1);   	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	
//    	String rcpm_dt = Util.checkString((String)hash1.get("rcpm_dt"));      
//    	String c_dlco_no = Util.checkString((String)hash1.get("c_dlco_no"));      
//    	String b_dlco_no = Util.checkString((String)hash1.get("b_dlco_no"));      
//    	String amt = Util.checkString((String)hash1.get("amt"));      
//    	String rdr_nm = Util.checkString((String)hash1.get("rdr_nm"));      
//    	String rdr_addr = Util.checkString((String)hash1.get("rdr_addr"));  
    	
    	
    	String[]  rcpm_dt   =  Util.checkString((String)hash1.get("rcpm_dt" )).split("#" );  	//
    	String[]  c_dlco_no =  Util.checkString((String)hash1.get("c_dlco_no" )).split("#" );  	//
    	String[]  b_dlco_no =  Util.checkString((String)hash1.get("b_dlco_no" )).split("#" );  	//
    	String[]  amt    	=  Util.checkString((String)hash1.get("amt" )).split("#" );  		//
    	String[]  rdr_nm    =  Util.checkString((String)hash1.get("rdr_nm" )).split("#" );  	//
    	String[]  rdr_addr  =  Util.checkString((String)hash1.get("rdr_addr" )).split("#" );  	//
    	
    	
    	System.out.println("rcpm_dt.length:"+rcpm_dt.length);	   	
    	try {
			//0.DB연결
	    	manager = new DBManager("MISISP");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	
	       	for( int row=0; row<rcpm_dt.length; row++){
	       		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
	    		dm.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
	    		dm.reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
	    		dm.setRcpm_dt(rcpm_dt[row]);
	    		dm.setC_dlco_no(c_dlco_no[row]);
	    		dm.setB_dlco_no(b_dlco_no[row]);
	    		dm.setAmt(amt[row]);
	    		dm.setRdr_nm(rdr_nm[row]);
	    		dm.setRdr_addr(rdr_addr[row]);
	    		dm.incmg_pers_ip = req.getRemoteAddr();
	    		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	            //dm.print();
	       		
				cstmt = manager.m_conn.prepareCall(dm.getSQL());
		       	// 파라미터 설정
		       	dm.setParams(cstmt,dm);
		       	
		       	// 실행
		       	cstmt.execute();		       		

			    //System.out.println("SP_SAL_2230_ADataSet 실행전");		       	
		        // 결과
		       	ds = (SP_SAL_2230_ADataSet) dm.createDataSetObject();
		       	ds.getValues(cstmt);
		       	cstmt.close();
		       	if (!"".equals(ds.errcode)) {
		       		System.out.println("SP_SAL_2230_ADataSet 오류남");		       		
			            throw new AppException(ds.errcode, ds.errmsg);
		        }
	 
		       	
		    }
	       	
       		dm1.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    		dm1.work_yymm = Util.checkString(req.getParameter("work_yymm"));
    		dm1.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
    		dm1.reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
    		dm1.incmg_pers_ip = req.getRemoteAddr();
    		dm1.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

			cstmt = manager.m_conn.prepareCall(dm1.getSQL());
	       	// 파라미터 설정
	       	dm1.setParams(cstmt,dm1);
	       	
	       	// 실행
	       	cstmt.execute();		       		

		    //System.out.println("SP_SAL_2235_ADataSet 실행전");		       	
	        // 결과
	       	ds1 = (SP_SAL_2235_ADataSet) dm1.createDataSetObject();
	       	ds1.getValues(cstmt);
	       	cstmt.close();
	       	if (!"".equals(ds1.errcode)) {
	       		System.out.println("SP_SAL_2235_ADataSet 오류남");			       		
		            throw new AppException(ds1.errcode, ds1.errmsg);
	        }
	       	
    		manager.commit();	
		       	
		}
	    catch (AppException e) {
	    	  if (manager != null)
		          manager.rollback();	
             throw e;   
		}catch (SQLException e) {
			if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    
	    req.setAttribute("ds", ds);
		
	}
    	
        // DM Setting
//    	SP_SAL_2230_ADM dm = new SP_SAL_2230_ADM();
//		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
//		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
//		dm.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
//		dm.reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
//		dm.setRcpm_dt(rcpm_dt);
//		dm.setC_dlco_no(c_dlco_no);
//		dm.setB_dlco_no(b_dlco_no);
//		dm.setAmt(amt);
//		dm.setRdr_nm(rdr_nm);
//		dm.setRdr_addr(rdr_addr);
//		dm.incmg_pers_ip = req.getRemoteAddr();
//		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
//        dm.print();
//        
//        
//        try {
//        	SpSal1000DAO dao = new SpSal1000DAO();
//            ds = dao.sp_sal_2230_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (AppException e) {
//            throw e;
//        }
//    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2240_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2240_ADataSet ds = null;
    	
        // DM Setting
    	SP_SAL_2240_ADM dm = new SP_SAL_2240_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
		dm.reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2240_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2250_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2250_ADataSet ds = null;
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData2);
    	
    	
    	String mode = Util.checkString((String)hash1.get("m")); 
    	String purc_adjm_reg_dt = Util.checkString((String)hash1.get("purc_adjm_reg_dt")); 
    	String purc_adjm_reg_seq = Util.checkString((String)hash1.get("purc_adjm_reg_seq")); 
    	String dlco_clsf_cd_seq = Util.checkString((String)hash1.get("dlco_no")); 
    	String txn_clsf = Util.checkString((String)hash1.get("txn_clsf")); 
    	String suply_amt = Util.checkString((String)hash1.get("suply_amt")); 
    	String vat_amt = Util.checkString((String)hash1.get("vat_amt")); 
    	String dduc_amt = Util.checkString((String)hash1.get("dduc_amt"));
    	String stot_amt = Util.checkString((String)hash1.get("stot_amt"));
    	
    	
        // DM Setting
    	SP_SAL_2250_ADM dm = new SP_SAL_2250_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.setMode(mode.toUpperCase()); 
		dm.setPurc_adjm_reg_dt(purc_adjm_reg_dt);
		dm.setPurc_adjm_reg_seq(purc_adjm_reg_seq);
		dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
		dm.setTxn_clsf(txn_clsf);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.setDduc_amt(dduc_amt);
		dm.setStot_amt(stot_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2250_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2260_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2260_ADataSet ds = null;
    	
        // DM Setting
    	SP_SAL_2260_ADM dm = new SP_SAL_2260_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
		dm.pay_plan_dd_pers = Util.checkString(req.getParameter("pay_plan_dd_pers"));
		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2260_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2270_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2270_ADataSet ds = null;
    	
        // DM Setting
    	SP_SAL_2270_ADM dm = new SP_SAL_2270_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
		dm.pay_plan_dd_pers = Util.checkString(req.getParameter("pay_plan_dd_pers"));
		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2270_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2300_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2300_MDM dm = new SP_SAL_2300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2310_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2310_LDM dm = new SP_SAL_2310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2320_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2320_LDM dm = new SP_SAL_2320_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2330_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2330_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2330_LDM dm = new SP_SAL_2330_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2330_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2340_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2340_ADataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	
    	String bank_nm = Util.checkString((String)hash1.get("bank_nm")); 
    	String bank_cd = Util.checkString((String)hash1.get("bank_cd")); 
    	String acct_no = Util.checkString((String)hash1.get("acct_no")); 
    	String amt = Util.checkString((String)hash1.get("amt")); 
    	String deps_pers = Util.checkString((String)hash1.get("deps_pers")); 
    	String bo_nm = Util.checkString((String)hash1.get("bo_nm")); 
    	String bo_cd = Util.checkString((String)hash1.get("bo_cd")); 
    	String dept_nm = Util.checkString((String)hash1.get("dept_nm")); 
    	String area_nm = Util.checkString((String)hash1.get("area_nm")); 
    	String bo_nm_1 = Util.checkString((String)hash1.get("bo_nm_1")); 
    	String shft_noit = Util.checkString((String)hash1.get("shft_noit")); 
    	String payo_amt = Util.checkString((String)hash1.get("payo_amt")); 
    	String coms = Util.checkString((String)hash1.get("coms")); 
    	
        // DM Setting
    	SP_SAL_2340_ADM dm = new SP_SAL_2340_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
		dm.setBank_nm(bank_nm);
		dm.setBank_cd(bank_cd);
		dm.setAcct_no(acct_no);
		dm.setAmt(amt);
		dm.setDeps_pers(deps_pers);
		dm.setBo_nm(bo_nm);
		dm.setBo_cd(bo_cd);
		dm.setDept_nm(dept_nm);
		dm.setArea_nm(area_nm);
		dm.setBo_nm_1(bo_nm_1);
		dm.setShft_noit(shft_noit);
		dm.setPayo_amt(payo_amt);
		dm.setComs(coms);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2350_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2350_ADataSet ds = null;

        // DM Setting
    	SP_SAL_2350_ADM dm = new SP_SAL_2350_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2350_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2400_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2400_MDM dm = new SP_SAL_2400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2410_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2410_LDM dm = new SP_SAL_2410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = "A";	/**구분:지로이체**/
		dm.dduc_clsf = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2420_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2420_LDM dm = new SP_SAL_2420_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2430_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	String dduc_clsf_e = Util.checkString((String)hash1.get("dduc_clsf_e"));
    	String bo_nm = Util.checkString((String)hash1.get("bo_nm"));
    	String bo_cd = Util.checkString((String)hash1.get("bo_cd"));
    	String req_amt = Util.checkString((String)hash1.get("req_amt"));
    	
    	
        // DM Setting
    	SP_SAL_2430_ADM dm = new SP_SAL_2430_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = "A";	/**구분:지로이체**/
		dm.dduc_clsf = Util.checkString(req.getParameter("sale_item_cd"));
		dm.setDduc_clsf_e(dduc_clsf_e);
		dm.setBo_nm(bo_nm);
		dm.setBo_cd(bo_cd);
		dm.setReq_amt(req_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2440_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2440_ADataSet ds = null;
    	
    	
        // DM Setting
    	SP_SAL_2440_ADM dm = new SP_SAL_2440_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mappli = Util.checkString(req.getParameter("mappli"));
		dm.auto_shift_clsf = "A";	/**구분:지로이체**/
		dm.dduc_clsf = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2440_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2600_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2600_MDM dm = new SP_SAL_2600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2610_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2610_LDM dm = new SP_SAL_2610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
    	dm.sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
		dm.hdqt_sell_dept_cd = Util.checkString(req.getParameter("hdqt_sell_dept_cd"));
		dm.hdqt_sell_sub_dept_cd = Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd"));
		dm.hdqt_sell_area_cd = Util.checkString(req.getParameter("hdqt_sell_area_cd"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2620_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2620_LDM dm = new SP_SAL_2620_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
    	dm.sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
		dm.hdqt_sell_dept_cd = Util.checkString(req.getParameter("hdqt_sell_dept_cd"));
		dm.hdqt_sell_sub_dept_cd = Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd"));
		dm.hdqt_sell_area_cd = Util.checkString(req.getParameter("hdqt_sell_area_cd"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2620_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2630_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2630_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2630_LDM dm = new SP_SAL_2630_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
    	dm.sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
		dm.hdqt_sell_dept_cd = Util.checkString(req.getParameter("hdqt_sell_dept_cd"));
		dm.hdqt_sell_sub_dept_cd = Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd"));
		dm.hdqt_sell_area_cd = Util.checkString(req.getParameter("hdqt_sell_area_cd"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2630_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2510_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2510_LDM dm = new SP_SAL_2510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2520_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2520_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String dlco_cd = Util.checkString((String)hash1.get("dlco_cd"));
		String clam = Util.checkString((String)hash1.get("clam"));
		String clam_amt = Util.checkString((String)hash1.get("clam_amt"));
		String qunt = Util.checkString((String)hash1.get("qunt"));
		String amt = Util.checkString((String)hash1.get("amt"));
		String card_qunt = Util.checkString((String)hash1.get("card_qunt"));
		String card_coms = Util.checkString((String)hash1.get("card_coms"));
		String card_amt = Util.checkString((String)hash1.get("card_amt"));
		

        // DM Setting
    	SP_SAL_2520_ADM dm = new SP_SAL_2520_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.setDlco_cd(dlco_cd);
		dm.setClam(clam);
		dm.setClam_amt(clam_amt);
		dm.setQunt(qunt);
		dm.setAmt(amt);
		dm.setCard_qunt(card_qunt);
		dm.setCard_coms(card_coms);
		dm.setCard_amt(card_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2520_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2530_d(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2530_DDataSet ds = null;

        // DM Setting
    	SP_SAL_2530_DDM dm = new SP_SAL_2530_DDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2530_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2710_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2710_LDM dm = new SP_SAL_2710_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
    	dm.sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2720_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2720_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2720_LDM dm = new SP_SAL_2720_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
    	dm.sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
    	dm.sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
		dm.sale_item_kind = Util.checkString(req.getParameter("sale_item_kind"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2720_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2800_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2800_MDM dm = new SP_SAL_2800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2800_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2810_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2810_LDM dm = new SP_SAL_2810_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2900_MDataSet ds = null;

        // DM Setting
    	SP_SAL_2900_MDM dm = new SP_SAL_2900_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_2910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_2910_LDataSet ds = null;

        // DM Setting
    	SP_SAL_2910_LDM dm = new SP_SAL_2910_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_2910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3110_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3110_LDM dm = new SP_SAL_3110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3210_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3210_LDM dm = new SP_SAL_3210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
		dm.ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3310_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3310_LDM dm = new SP_SAL_3310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
		dm.ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3400_MDataSet ds = null;

        // DM Setting
    	SP_SAL_3400_MDM dm = new SP_SAL_3400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3410_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3410_LDM dm = new SP_SAL_3410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3510_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3510_LDM dm = new SP_SAL_3510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_yymm = Util.checkString(req.getParameter("work_yymm")).substring(0,6);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3520_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3520_LDM dm = new SP_SAL_3520_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_yymm = Util.checkString(req.getParameter("work_yymm")).substring(0,6);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3600_MDataSet ds = null;

        // DM Setting
    	SP_SAL_3600_MDM dm = new SP_SAL_3600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3610_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3610_LDM dm = new SP_SAL_3610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.elec_trsm_yn = Util.checkString(req.getParameter("elec_trsm_yn"));
		dm.vat_gubun = Util.checkString(req.getParameter("vat_gubun"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3620_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3620_LDM dm = new SP_SAL_3620_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3620_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3630_ADataSet ds = null;

        // DM Setting
    	SP_SAL_3630_ADM dm = new SP_SAL_3630_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3640_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3640_ADataSet ds = null;

        // DM Setting
    	SP_SAL_3640_ADM dm = new SP_SAL_3640_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3640_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3650_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3650_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String slip_clsf_cd = Util.checkString ((String )hash1.get("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString ((String )hash1.get("slip_occr_dt"));
    	String slip_seq = Util.checkString ((String )hash1.get("slip_seq"));

        // DM Setting
    	SP_SAL_3650_ADM dm = new SP_SAL_3650_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_seq(slip_seq);
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3650_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3700_MDataSet ds = null;

        // DM Setting
    	SP_SAL_3700_MDM dm = new SP_SAL_3700_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3710_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3710_LDM dm = new SP_SAL_3710_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3720_ADataSet ds = null;

        String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
		String dlco_no = Util.checkString((String)hash1.get("dlco_no"));
		String qunt = Util.checkString((String)hash1.get("qunt"));
		String sale_cost = Util.checkString((String)hash1.get("sale_cost"));
		String sale_amt = Util.checkString((String)hash1.get("sale_amt"));

    	
        // DM Setting
		SP_SAL_3720_ADM dm = new SP_SAL_3720_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.setDlco_no(dlco_no);   
		dm.setQunt(qunt); 
		dm.setSale_cost(sale_cost);
		dm.setSale_amt(sale_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3730_d(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3730_DDataSet ds = null;

    	
        // DM Setting
		SP_SAL_3730_DDM dm = new SP_SAL_3730_DDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);;
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3730_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3800_MDataSet ds = null;

        // DM Setting
    	SP_SAL_3800_MDM dm = new SP_SAL_3800_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3800_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3810_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3810_LDM dm = new SP_SAL_3810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm_fr = Util.checkString(req.getParameter("scat_dt_fr"));
		dm.sale_yymm_to = Util.checkString(req.getParameter("scat_dt_to"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3820_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3820_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3820_LDM dm = new SP_SAL_3820_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
		dm.slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3820_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3825_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3825_SDataSet ds = null;

        // DM Setting
    	SP_SAL_3825_SDM dm = new SP_SAL_3825_SDM();
		dm.hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd2"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd2"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt2"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq2"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3825_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3830_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3830_SDataSet ds = null;

        // DM Setting
    	SP_SAL_3830_SDM dm = new SP_SAL_3830_SDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3830_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3840_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3840_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdataData")); 
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	System.out.println("::::::::::::::::::>>"+multiUpdateData);
    	
    	String a_sale_yymm = Util.checkString((String)hash.get("a_sale_yymm"));  
		String a_sale_seq = Util.checkString((String)hash.get("a_sale_seq"));  
				
        // DM Setting
    	SP_SAL_3840_ADM dm = new SP_SAL_3840_ADM();
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
		dm.setA_sale_yymm(a_sale_yymm);
		dm.setA_sale_seq(a_sale_seq);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3840_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3850_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3850_ADataSet ds = null;

        // DM Setting
    	SP_SAL_3850_ADM dm = new SP_SAL_3850_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3850_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3860_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3860_ADataSet ds = null;

        // DM Setting
    	SP_SAL_3860_ADM dm = new SP_SAL_3860_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.email_id = Util.checkString(req.getParameter("email_id"));
		dm.elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		dm.biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3860_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/

    /**********************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3900_MDataSet ds = null;

        // DM Setting
    	SP_SAL_3900_MDM dm = new SP_SAL_3900_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_3910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_3910_LDataSet ds = null;

        // DM Setting
    	SP_SAL_3910_LDM dm = new SP_SAL_3910_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.prt_clsf = Util.checkString(req.getParameter("prt_clsf"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_3910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_4000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_4000_MDataSet ds = null;

        // DM Setting
    	SP_SAL_4000_MDM dm = new SP_SAL_4000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_4000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_4010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_4010_LDataSet ds = null;

        // DM Setting
    	SP_SAL_4010_LDM dm = new SP_SAL_4010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_fr_yymm = Util.checkString(req.getParameter("sale_fr_yymm"));
    	dm.sale_to_yymm = Util.checkString(req.getParameter("sale_to_yymm"));
    	dm.proc_gubun = Util.checkString(req.getParameter("proc_gubun"));
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
		dm.purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_4010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_sal_4020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_SAL_4020_ADataSet ds = null;
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    	String mode = Util.checkString((String)hash1.get("m")); 
		String checked = Util.checkString((String)hash1.get("checked"));            
		String sale_yymm = Util.checkString((String)hash1.get("sale_yymm"));        
		String sale_seq = Util.checkString((String)hash1.get("sale_seq"));          
		String sale_item_cd = Util.checkString((String)hash1.get("sale_item_cd"));  
		String dlco_no = Util.checkString((String)hash1.get("dlco_no"));            
		String sale_cost = Util.checkString((String)hash1.get("sale_cost"));        
		String qunt = Util.checkString((String)hash1.get("qunt"));                  
		String suply_amt = Util.checkString((String)hash1.get("suply_amt"));        
		String vat_amt = Util.checkString((String)hash1.get("vat_amt"));            		                                                                            
		String tot_rvord_amt = Util.checkString((String)hash1.get("tot_rvord_amt"));
    	
        // DM Setting
    	SP_SAL_4020_ADM dm = new SP_SAL_4020_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_yymm = Util.checkString(req.getParameter("work_yymm"));
		dm.proc_gubun = Util.checkString(req.getParameter("proc_gubun"));
		dm.setChecked(checked);  
		dm.setSale_yymm(sale_yymm);
		dm.setSale_seq(sale_seq);  
		dm.setSale_item_cd(sale_item_cd);  
		dm.setDlco_no(dlco_no);  
		dm.setQunt(qunt);  
		dm.setSale_cost(sale_cost);
		dm.setTot_rvord_amt(tot_rvord_amt);
		dm.setSuply_amt(suply_amt);
		dm.setVat_amt(vat_amt);
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpSal1000DAO dao = new SpSal1000DAO();
            ds = dao.sp_sal_4020_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
}
