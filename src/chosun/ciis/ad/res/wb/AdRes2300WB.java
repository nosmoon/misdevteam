/***************************************************************************************************
* 파일명 : AdRes2200WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.res.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes2300DAO;
import chosun.ciis.ad.res.dm.AD_RES_2300_MDM;
import chosun.ciis.ad.res.dm.AD_RES_2310_LDM;
import chosun.ciis.ad.res.dm.AD_RES_2320_ADM;
import chosun.ciis.ad.res.ds.AD_RES_2300_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2310_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2320_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes2300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2300_MDataSet ds = null;

        // DM Setting
    	AD_RES_2300_MDM dm = new AD_RES_2300_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        
        //dm.print();

        try {
        	AdRes2300DAO	dao = new AdRes2300DAO();
            ds = dao.ad_res_2300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }    
    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2310_LDataSet ds = null;

        // DM Setting
    	AD_RES_2310_LDM dm = new AD_RES_2310_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt   	= Util.checkString(req.getParameter("pubc_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);
        
        //dm.print();

        try {
        	AdRes2300DAO	dao = new AdRes2300DAO();
            ds = dao.ad_res_2310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2320_ADataSet ds = null;
    	System.out.println("0");
        // DM Setting
    	AD_RES_2320_ADM dm = new AD_RES_2320_ADM();
    	System.out.println("1");
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String flag = Util.checkString(req.getParameter("flag"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	System.out.println("2");
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        System.out.println("multiUpdateData = "+ multiUpdateData);
         
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
//     	String mode 			= (String)hash.get("m"); 
//     	String mode             = Util.checkString((String)hash.get("flag"));
        String preng_occr_seq   = Util.checkString((String)hash.get("preng_occr_seq")); 
        String sect_cd          = Util.checkString((String)hash.get("sect_nm")); 
        String sect_seq         = "";//Util.checkString((String)hash.get("sect_nm")).substring(1,2); 
        String cm               = Util.checkString((String)hash.get("cm")); 
        String dn               = Util.checkString((String)hash.get("dn")); 
        String advt_cont        = Util.checkString((String)hash.get("advt_cont")); 
        String uprc             = Util.checkString((String)hash.get("uprc")); 
        String advt_fee         = Util.checkString((String)hash.get("advt_fee")); 
        String vat              = Util.checkString((String)hash.get("vat"));
        String dlco_no          = Util.checkString((String)hash.get("dlco_no"));
        String slcrg_pers       = Util.checkString((String)hash.get("slcrg_pers")); 
        String mchrg_pers       = Util.checkString((String)hash.get("mchrg_pers")); 
        String issu_side        = Util.checkString((String)hash.get("pubc_side")); 
        
     	dm.setMode1(flag.toUpperCase());
     	dm.setPreng_occr_seq1(preng_occr_seq);
     	dm.setSect_cd1(sect_cd);
     	dm.setSect_seq1(sect_seq);
     	dm.setCm1(cm);
     	dm.setDn1(dn);
     	dm.setAdvt_cont1(advt_cont);
     	dm.setUprc1(uprc);
     	dm.setAdvt_fee1(advt_fee);
     	dm.setVat1(vat);
     	dm.setDlco_no1(dlco_no);
     	dm.setSlcrg_pers1(slcrg_pers);
     	dm.setMchrg_pers1(mchrg_pers);
     	dm.setIssu_side1(issu_side);

        dm.print();

        try {
        	AdRes2300DAO	dao = new AdRes2300DAO();
            ds = dao.ad_res_2320_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 

    } 
}
