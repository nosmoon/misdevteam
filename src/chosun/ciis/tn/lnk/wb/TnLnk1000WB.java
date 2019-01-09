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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dao.TnLnk1000DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class TnLnk1000WB extends BaseWB {

    public void tn_lnk_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	TN_LNK_1000_MDataSet ds = null;

        // DM Setting
    	TN_LNK_1000_MDM dm = new TN_LNK_1000_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    
        dm.setCmpy_cd(cmpy_cd);
        
        dm.print();
        
        try {
        	TnLnk1000DAO dao = new TnLnk1000DAO();
            ds = dao.tn_lnk_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      

    } 
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void tn_lnk_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	TN_LNK_1010_LDataSet ds = null;

        // DM Setting
    	TN_LNK_1010_LDM dm = new TN_LNK_1010_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String frdt  	 = Util.checkString(req.getParameter("frdt"));
        String todt  = Util.checkString(req.getParameter("todt"));
        String cd_clsf  = Util.checkString(req.getParameter("cd_clsf"));
        String select_dt  = Util.checkString(req.getParameter("select_dt"));
        String srch_nm  = Util.checkString(req.getParameter("srch_nm"));
                
        dm.setCmpy_cd(cmpy_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setCd_clsf(cd_clsf);
        dm.setSelect_dt(select_dt);
        dm.setSrch_nm(srch_nm);
        
        dm.print();
        
        try {
        	TnLnk1000DAO dao = new TnLnk1000DAO();
            ds = dao.tn_lnk_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      

    }   
    
    
    public void tn_lnk_1020_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	TN_LNK_1020_SDataSet ds = null;

        // DM Setting
    	TN_LNK_1020_SDM dm = new TN_LNK_1020_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String onl_memb_idx  	 = Util.checkString(req.getParameter("onl_memb_idx"));
        String onl_prms_idx  = Util.checkString(req.getParameter("onl_prms_idx"));
        String onl_pmnt_idx  = Util.checkString(req.getParameter("onl_pmnt_idx"));
                
        dm.setCmpy_cd(cmpy_cd);
        dm.setOnl_memb_idx(onl_memb_idx);
        dm.setOnl_prms_idx(onl_prms_idx);
        dm.setOnl_pmnt_idx(onl_pmnt_idx);
        
        dm.print();
        
        try {
        	TnLnk1000DAO dao = new TnLnk1000DAO();
            ds = dao.tn_lnk_1020_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      

    } 
    
    public void tn_lnk_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	TN_LNK_1030_ADataSet ds = null;

    	String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag             = Util.checkString(req.getParameter("flag"));
    	String onl_memb_idx     = Util.checkString(req.getParameter("onl_memb_idx"));
        String onl_prms_idx     = Util.checkString(req.getParameter("onl_prms_idx"));
        String onl_pmnt_idx     = Util.checkString(req.getParameter("onl_pmnt_idx"));
        
        if("".equals(onl_memb_idx) && "".equals(onl_prms_idx) && "".equals(onl_pmnt_idx)){
        	String multiUpdateData	= Util.checkString(req.getParameter("multiUpdateData"));
        	Hashtable hash          = getHashMultiUpdateData(multiUpdateData);
        	onl_memb_idx            = Util.checkString((String)hash.get("onl_memb_idx"));
        	onl_prms_idx            = Util.checkString((String)hash.get("onl_prms_idx"));
        	onl_pmnt_idx            = Util.checkString((String)hash.get("onl_pmnt_idx"));
        }
        // DM Setting
    	TN_LNK_1030_ADM dm = new TN_LNK_1030_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFlag(flag);
    	dm.setOnl_memb_idx(onl_memb_idx);
    	dm.setOnl_prms_idx(onl_prms_idx);
    	dm.setOnl_pmnt_idx(onl_pmnt_idx);
    	
    	dm.print();
    	
        try {
        	TnLnk1000DAO dao = new TnLnk1000DAO();
            ds = dao.tn_lnk_1030_a(dm);
            req.setAttribute("ds", ds);           
        }  
        catch (AppException e) {
            throw e;
        }   	
    } 
    
    public void tn_lnk_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	TN_LNK_1040_ADataSet ds = null;

    	String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag             = Util.checkString(req.getParameter("flag"));
    	String onl_memb_idx     = Util.checkString(req.getParameter("onl_memb_idx"));
        String onl_prms_idx     = Util.checkString(req.getParameter("onl_prms_idx"));
        String onl_pmnt_idx     = Util.checkString(req.getParameter("onl_pmnt_idx"));
        String memb_cd          = Util.checkString(req.getParameter("memb_cd"));
        String prms_cd          = Util.checkString(req.getParameter("prms_cd"));
        String pmnt_cd          = Util.checkString(req.getParameter("pmnt_cd"));
        String cancl_resn       = Util.checkString(req.getParameter("cancl_resn"));
        String remk             = Util.checkString(req.getParameter("remk"));
        String incmg_pers       = Util.getSessionParameterValue(req, "emp_no", true);

        // DM Setting
    	TN_LNK_1040_ADM dm = new TN_LNK_1040_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFlag(flag);
    	dm.setOnl_memb_idx(onl_memb_idx);
    	dm.setOnl_prms_idx(onl_prms_idx);
    	dm.setOnl_pmnt_idx(onl_pmnt_idx);
    	dm.setMemb_cd(memb_cd);
    	dm.setPmnt_cd(pmnt_cd);
    	dm.setPrms_cd(prms_cd);
    	dm.setCancl_resn(cancl_resn);
    	dm.setRemk(remk);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();
    	
        try {
        	TnLnk1000DAO dao = new TnLnk1000DAO();
            ds = dao.tn_lnk_1040_a(dm);
            req.setAttribute("ds", ds);           
        }  
        catch (AppException e) {
            throw e;
        }   	
    }     
}
