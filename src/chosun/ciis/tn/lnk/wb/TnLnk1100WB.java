/***************************************************************************************************
* 파일명 : TnLnk1000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김상훈
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.tn.lnk.wb;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.ArrayList;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.*;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dao.TnLnk1100DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.ad.common.wb.AttachFileVO;
/**
 * 
 */

public class TnLnk1100WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void tn_lnk_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	TN_LNK_1110_LDataSet ds = null;

        // DM Setting
    	TN_LNK_1110_LDM dm = new TN_LNK_1110_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String frdt  	 = Util.checkString(req.getParameter("frdt"));
        String todt  = Util.checkString(req.getParameter("todt"));
        String clsf_cd  = Util.checkString(req.getParameter("clsf_cd"));
        String slct_dept  = Util.checkString(req.getParameter("slct_dept"));
        String title  = Util.checkString(req.getParameter("title"));
                
        dm.setCmpy_cd(cmpy_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClsf_cd(clsf_cd);
        dm.setSlct_dept(slct_dept);
        dm.setTitle(title);
        
        dm.print();
        
        try {
        	TnLnk1100DAO dao = new TnLnk1100DAO();
            ds = dao.tn_lnk_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      

    } 
    
    public void tn_lnk_1151_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	TN_LNK_1151_LDataSet ds = null;

        // DM Setting
    	TN_LNK_1151_LDM dm = new TN_LNK_1151_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String excl_pmnt_idx  	 = Util.checkString(req.getParameter("excl_pmnt_idx"));
                
        dm.setCmpy_cd(cmpy_cd);
        dm.setExcl_pmnt_idx(excl_pmnt_idx);
        
        dm.print();
        
        try {
        	TnLnk1100DAO dao = new TnLnk1100DAO();
            ds = dao.tn_lnk_1151_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      

    } 

    public void tn_lnk_1152_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	TN_LNK_1152_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers       = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip    = req.getRemoteAddr();
    	    	
    	String dept_idx         = Util.checkString(req.getParameter("dept_idx"));
    	String excl_type        = Util.checkString(req.getParameter("excl_type"));
    	String title            = Util.checkString(req.getParameter("title"));
    	String flag             = Util.checkString(req.getParameter("flag"));
    	String excl_pmnt_idx    = Util.checkString(req.getParameter("excl_pmnt_idx"));
    	String excl_pmnt_dtl_idx    = Util.checkString(req.getParameter("excl_pmnt_dtl_idx"));
        String add_file_nm      = Util.checkString(req.getParameter("add_file_nm"));
        String add_file_size    = Util.checkString(req.getParameter("add_file_size"));
       
        String multiUpdateData	= Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash          = getHashMultiUpdateData(multiUpdateData);

    	String mode             = Util.checkString((String)hash.get("m"));
    	String row_num          = Util.checkString((String)hash.get("rownum"));
    	String input_type       = Util.checkString((String)hash.get("input_type"));
        String memb_cd          = Util.checkString((String)hash.get("memb_cd"));
        String name             = Util.checkString((String)hash.get("name"));
        String memb_type        = Util.checkString((String)hash.get("memb_type"));
        String memb_ctgr_cd     = Util.checkString((String)hash.get("memb_ctgr_cd"));
        String ern              = Util.checkString((String)hash.get("ern"));
        String prsd_nm          = Util.checkString((String)hash.get("prsd_nm"));
        String cell_no          = Util.checkString((String)hash.get("cell_no"));
        String phone            = Util.checkString((String)hash.get("phone"));
        String zip_cd           = Util.checkString((String)hash.get("zip_cd"));
        String addr             = Util.checkString((String)hash.get("addr"));
        String memb_memo        = Util.checkString((String)hash.get("memb_memo"));
        String prms_dt          = Util.checkString((String)hash.get("prms_dt"));
        String prms_amt         = Util.checkString((String)hash.get("prms_amt"));
        String use_orign        = Util.checkString((String)hash.get("use_orign"));
        String fund_idx         = Util.checkString((String)hash.get("fund_idx"));
        String suprt_idx        = Util.checkString((String)hash.get("suprt_idx"));
        String paymth_cd        = Util.checkString((String)hash.get("paymth_cd"));
        String cms_ownr_yn      = Util.checkString((String)hash.get("cms_ownr_yn"));
        String cms_bank_cd      = Util.checkString((String)hash.get("cms_bank_cd"));
        String cms_acct_no      = Util.checkString((String)hash.get("cms_acct_no"));
        String cms_ownr_nm      = Util.checkString((String)hash.get("cms_ownr_nm"));
        String cms_ern          = Util.checkString((String)hash.get("cms_ern"));
        String card_cmpy        = Util.checkString((String)hash.get("card_cmpy"));
        String card_num         = Util.checkString((String)hash.get("card_num"));
        String card_yymm        = Util.checkString((String)hash.get("card_yymm"));
        String card_idntt       = Util.checkString((String)hash.get("card_idntt"));
        String card_owner       = Util.checkString((String)hash.get("card_owner"));
        String mobl_aprv_nm     = Util.checkString((String)hash.get("mobl_aprv_nm"));
        String mobl_aprv_cmpy   = Util.checkString((String)hash.get("mobl_aprv_cmpy"));
        String mobl_aprv_num    = Util.checkString((String)hash.get("mobl_aprv_num"));
        String mobl_aprv_prn    = Util.checkString((String)hash.get("mobl_aprv_prn"));
        String prttn_type       = Util.checkString((String)hash.get("prttn_type"));
        String mon_pay_dt       = Util.checkString((String)hash.get("mon_pay_dt"));
        String mon_pay_amt      = Util.checkString((String)hash.get("mon_pay_amt"));
        String pay_frdt         = Util.checkString((String)hash.get("pay_frdt"));
        String prttn_cnt        = Util.checkString((String)hash.get("prttn_cnt"));
        String prms_memo        = Util.checkString((String)hash.get("prms_memo"));
        String pay_dt           = Util.checkString((String)hash.get("pay_dt"));
        String pay_amt          = Util.checkString((String)hash.get("pay_amt"));

        ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
            	
    	TN_LNK_1152_ADM dm = new TN_LNK_1152_ADM();System.out.println("flag::"+flag);
    	if (!"D".equals(flag)){System.out.println("attcFiles::"+attcFiles);
        	if(attcFiles != null){
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	//if(i==0){			//1번째 첨부
		        	System.out.println(attachFileVO.getAttcFilCont());
		        	    dm.setAdd_file_nm(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
			            dm.setAdd_file_size(String.valueOf(attachFileVO.getAttcFilCont().length));
		        	//}    	
		        }    
        	}
        }
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDept_idx(dept_idx);
    	dm.setExcl_type(excl_type);
    	dm.setTitle(title);
    	dm.setFlag(flag);
    	dm.setExcl_pmnt_idx(excl_pmnt_idx);
    	dm.setExcl_pmnt_dtl_idx(excl_pmnt_dtl_idx);
    	//dm.setAdd_file_nm(add_file_nm);
    	//dm.setAdd_file_size(add_file_size);
    	//dm.setAdd_file(add_file);
    	
    	dm.setRow_num(row_num);
    	dm.setInput_type(input_type);
        dm.setMemb_cd(memb_cd);
        dm.setName(name);
        dm.setMemb_type(memb_type);
        dm.setMemb_ctgr_cd(memb_ctgr_cd);
        dm.setErn(ern);
        dm.setPrsd_nm(prsd_nm);
        dm.setCell_no(cell_no);
        dm.setPhone(phone);
        dm.setZip_cd(zip_cd);
        dm.setAddr(addr);
        dm.setMemb_memo(memb_memo);
        dm.setPrms_dt(prms_dt);
        dm.setPrms_amt(prms_amt);
        dm.setUse_orign(use_orign);
        dm.setFund_idx(fund_idx);
        dm.setSuprt_idx(suprt_idx);
        dm.setPaymth_cd(paymth_cd);
        dm.setCms_ownr_yn(cms_ownr_yn);
        dm.setCms_bank_cd(cms_bank_cd);
        dm.setCms_acct_no(cms_acct_no);
        dm.setCms_ownr_nm(cms_ownr_nm);
        dm.setCms_ern(cms_ern);
        dm.setCard_cmpy(card_cmpy);
        dm.setCard_num(card_num);
        dm.setCard_yymm(card_yymm);
        dm.setCard_idntt(card_idntt);
        dm.setCard_owner(card_owner);
        dm.setMobl_aprv_nm(mobl_aprv_nm);
        dm.setMobl_aprv_cmpy(mobl_aprv_cmpy);
        dm.setMobl_aprv_num(mobl_aprv_num);
        dm.setMobl_aprv_prn(mobl_aprv_prn);
        dm.setPrttn_type(prttn_type);
        dm.setMon_pay_dt(mon_pay_dt);
        dm.setMon_pay_amt(mon_pay_amt);
        dm.setPay_frdt(pay_frdt);
        dm.setPrttn_cnt(prttn_cnt);
        dm.setPrms_memo(prms_memo);
        dm.setPay_dt(pay_dt);
        dm.setPay_amt(pay_amt);
   	
        dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setMode(mode.toUpperCase());
    	
    	//dm.print();

        try {System.out.println("dao go");
            TnLnk1100DAO dao = new TnLnk1100DAO();
            ds = dao.tn_lnk_1152_a(dm);
            System.out.println(ds.excl_pmnt_idx);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }

    public void tn_lnk_1153_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	TN_LNK_1153_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers       = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip    = req.getRemoteAddr();
    	    	
    	String dept_idx         = Util.checkString(req.getParameter("dept_idx"));
    	String excl_type        = Util.checkString(req.getParameter("excl_type"));
    	String title            = Util.checkString(req.getParameter("title"));
    	String flag             = Util.checkString(req.getParameter("flag"));
    	String excl_pmnt_idx    = Util.checkString(req.getParameter("excl_pmnt_idx"));
        String add_file_nm      = Util.checkString(req.getParameter("add_file_nm"));
        String add_file_size    = Util.checkString(req.getParameter("add_file_size"));
       
        String multiUpdateData2	= Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	Hashtable hash          = getHashMultiUpdateData(multiUpdateData2);

    	String mode             = Util.checkString((String)hash.get("m"));
    	String row_num          = Util.checkString((String)hash.get("rownum"));
        String memb_nm          = Util.checkString((String)hash.get("memb_nm"));
        String prms_cd          = Util.checkString((String)hash.get("prms_cd"));
        String bank_acct_cd     = Util.checkString((String)hash.get("bank_acct_cd"));
        String pmnt_memo        = Util.checkString((String)hash.get("pmnt_memo"));
        String pay_dt           = Util.checkString((String)hash.get("pay_dt"));
        String pay_amt          = Util.checkString((String)hash.get("pay_amt"));

        ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
            	
    	TN_LNK_1153_ADM dm = new TN_LNK_1153_ADM();System.out.println("flag::"+flag);
    	if (!"D".equals(flag)){System.out.println("attcFiles::"+attcFiles);
        	if(attcFiles != null){
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	//if(i==0){			//1번째 첨부
		        	System.out.println(attachFileVO.getAttcFilCont());
		        	    dm.setAdd_file_nm(attachFileVO.getAttcFilNm());
			            dm.setAdd_file(attachFileVO.getAttcFilCont());
			            dm.setAdd_file_size(String.valueOf(attachFileVO.getAttcFilCont().length));
		        	//}    	
		        }    
        	}
        }
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDept_idx(dept_idx);
    	dm.setExcl_type(excl_type);
    	dm.setTitle(title);
    	dm.setFlag(flag);
    	dm.setExcl_pmnt_idx(excl_pmnt_idx);
    	//dm.setAdd_file_nm(add_file_nm);
    	//dm.setAdd_file_size(add_file_size);
    	//dm.setAdd_file(add_file);
    	
    	dm.setRow_num(row_num);
    	dm.setMemb_nm(memb_nm);
    	dm.setPrms_cd(prms_cd);
    	dm.setBank_acct_cd(bank_acct_cd);
        dm.setPmnt_memo(pmnt_memo);
        dm.setPay_dt(pay_dt);
        dm.setPay_amt(pay_amt);
   	
        dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setMode(mode.toUpperCase());
    	
    	//dm.print();

        try {System.out.println("dao go");
            TnLnk1100DAO dao = new TnLnk1100DAO();
            ds = dao.tn_lnk_1153_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }  
    
    public void tn_lnk_1154_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	TN_LNK_1154_ADataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String excl_pmnt_idx = Util.checkString(req.getParameter("excl_pmnt_idx"));
   	
        // DM Setting
    	TN_LNK_1154_ADM dm = new TN_LNK_1154_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setExcl_pmnt_idx(excl_pmnt_idx);
    	
    	dm.print();
    	
        try {
        	TnLnk1100DAO dao = new TnLnk1100DAO();
            ds = dao.tn_lnk_1154_a(dm);
            req.setAttribute("ds", ds);
	        req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
	        req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.            
        }  
        catch (AppException e) {
            throw e;
        }   	
    }  
    
    public void tn_lnk_1155_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	TN_LNK_1155_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String excl_pmnt_idx = Util.checkString(req.getParameter("excl_pmnt_idx"));
    	String title         = Util.checkString(req.getParameter("title"));
    	String flag          = Util.checkString(req.getParameter("flag"));
    	
        // DM Setting
    	TN_LNK_1155_ADM dm = new TN_LNK_1155_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setExcl_pmnt_idx(excl_pmnt_idx);
    	dm.setFlag(flag);
    	dm.setTitle(title);
    	
    	dm.print();
    	
        try {
        	TnLnk1100DAO dao = new TnLnk1100DAO();
            ds = dao.tn_lnk_1155_a(dm);
            req.setAttribute("ds", ds);       
        }  
        catch (AppException e) {
            throw e;
        }   	
    } 
    
    public void tn_lnk_1156_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	TN_LNK_1156_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String excl_pmnt_idx = Util.checkString(req.getParameter("excl_pmnt_idx"));
    	String title = Util.checkString(req.getParameter("title"));
        String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	
        // DM Setting
    	TN_LNK_1156_ADM dm = new TN_LNK_1156_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setExcl_pmnt_idx(excl_pmnt_idx);
    	dm.setTitle(title);
    	dm.setIncmg_pers(incmg_pers);
    	dm.print();
    	
        try {
        	TnLnk1100DAO dao = new TnLnk1100DAO();
            ds = dao.tn_lnk_1156_a(dm);
            req.setAttribute("ds", ds);       
        }  
        catch (AppException e) {
            throw e;
        }   	
    }
}
