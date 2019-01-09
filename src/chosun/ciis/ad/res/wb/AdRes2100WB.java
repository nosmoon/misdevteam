/***************************************************************************************************
* 파일명 : AdRes2100WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.res.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes2100DAO;
import chosun.ciis.ad.res.dm.AD_RES_2100_MDM;
import chosun.ciis.ad.res.dm.AD_RES_2110_SDM;
import chosun.ciis.ad.res.dm.AD_RES_2111_SDM;
import chosun.ciis.ad.res.dm.AD_RES_2120_ADM;
import chosun.ciis.ad.res.ds.AD_RES_2100_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2110_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2111_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2120_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes2100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2100_MDataSet ds = null;

        // DM Setting
    	AD_RES_2100_MDM dm = new AD_RES_2100_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setEmp_no(emp_no);

        try {
        	AdRes2100DAO	dao = new AdRes2100DAO();
            ds = dao.ad_res_2100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2100EJBHome home = (AdRes2100EJBHome) JNDIManager.getInstance().getHome("AdRes2100EJB");
//        try {
//        	AdRes2100EJB ejb = home.create();
//            ds = ejb.ad_res_2100_m(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2110_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2110_SDataSet ds = null;

        // DM Setting
    	AD_RES_2110_SDM dm = new AD_RES_2110_SDM();
    	String cmpy_cd    	  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		  = Util.checkString(req.getParameter("medi_cd"));
    	String preng_occr_dt  = Util.checkString(req.getParameter("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);

        try {
        	AdRes2100DAO	dao = new AdRes2100DAO();
            ds = dao.ad_res_2110_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2100EJBHome home = (AdRes2100EJBHome) JNDIManager.getInstance().getHome("AdRes2100EJB");
//        try {
//        	AdRes2100EJB ejb = home.create();
//            ds = ejb.ad_res_2110_s(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    public void ad_res_2111_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2111_SDataSet ds = null;

        // DM Setting
    	AD_RES_2111_SDM dm = new AD_RES_2111_SDM();
    	String cmpy_cd    	  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no 		  = Util.checkString(req.getParameter("dlco_no"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);

        try {
        	AdRes2100DAO	dao = new AdRes2100DAO();
            ds = dao.ad_res_2111_s(dm);
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
    public void ad_res_2120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2120_ADataSet ds = null;

        // DM Setting
    	AD_RES_2120_ADM dm = new AD_RES_2120_ADM();
    	String flag = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String pubc_side = Util.checkString(req.getParameter("pubc_side"));
    	String issu_ser_no = Util.checkString(req.getParameter("issu_ser_no"));
    	String publ_std = Util.checkString(req.getParameter("publ_std"));
    	String advt_fee = Util.checkString(req.getParameter("advt_fee"));
    	String vat = Util.checkString(req.getParameter("vat"));
    	String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
    	String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
    	String govern_advt_yn = Util.checkString(req.getParameter("govern_advt_yn"));
    	String advcs_offr_yn = Util.checkString(req.getParameter("advcs_offr_yn"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String agn = Util.checkString(req.getParameter("agn"));
    	String fee_rate = Util.checkString(req.getParameter("fee_rate"));
    	String fee = Util.checkString(req.getParameter("fee"));
    	String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
    	String coms_rate = Util.checkString(req.getParameter("coms_rate"));
    	String coms = Util.checkString(req.getParameter("coms"));
    	String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
    	String indt_clsf_nm = Util.checkString(req.getParameter("indt_clsf_nm"));
    	String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
    	String mony_kind = Util.checkString(req.getParameter("mony_kind"));
    	String type_clsf = Util.checkString(req.getParameter("type_clsf"));
    	String type_clsf_nm = Util.checkString(req.getParameter("type_clsf_nm"));
    	String exrate = Util.checkString(req.getParameter("exrate"));
    	String book_appndx_clsf = Util.checkString(req.getParameter("book_appndx_clsf"));
    	String nwsp_type_clsf = Util.checkString(req.getParameter("nwsp_type_clsf"));
    	String frex_cntr_amt = Util.checkString(req.getParameter("frex_cntr_amt"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String dept_cd = Util.checkString(req.getParameter("dept_cd"));
    	String dept_nm = Util.checkString(req.getParameter("dept_nm"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String remk = Util.checkString(req.getParameter("remk"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String tax_email = Util.checkString(req.getParameter("tax_email"));
    	String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));
    	String advt_clsf = Util.checkString(req.getParameter("advt_clsf"));
    	String patr_chrg_info = Util.checkString(req.getParameter("patr_chrg_info"));
    	
        dm.setFlag(flag);
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);
        dm.setDlco_no(dlco_no);
        dm.setPubc_side(pubc_side);
        dm.setIssu_ser_no(issu_ser_no);
        dm.setPubl_std(publ_std);
        dm.setAdvt_fee(advt_fee); 
        dm.setVat(vat);
        dm.setPubc_tot_amt(pubc_tot_amt);
        dm.setRtax_yn(rtax_yn);
        dm.setGovern_advt_yn(govern_advt_yn);
        dm.setAdvcs_offr_yn(advcs_offr_yn);
        dm.setHndl_clsf(hndl_clsf);
        dm.setAgn(agn);
        dm.setFee_rate(fee_rate);
        dm.setFee(fee);
        dm.setHndl_plac_cd(hndl_plac_cd);
        dm.setComs_rate(coms_rate);
        dm.setComs(coms);
        dm.setIndt_clsf(indt_clsf);
        dm.setIndt_clsf_nm(indt_clsf_nm);
        dm.setChro_clsf(chro_clsf);
        dm.setMony_kind(mony_kind);
        dm.setType_clsf(type_clsf);
        dm.setType_clsf_nm(type_clsf_nm);
        dm.setExrate(exrate);
        dm.setBook_appndx_clsf(book_appndx_clsf);
        dm.setNwsp_type_clsf(nwsp_type_clsf);
        dm.setFrex_cntr_amt(frex_cntr_amt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setDept_cd(dept_cd);
        dm.setDept_nm(dept_nm);
        dm.setMchrg_pers(mchrg_pers);
        dm.setAdvt_cont(advt_cont);
        dm.setRemk(remk);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        dm.setTax_email(tax_email);
        dm.setTax_clsf(tax_clsf);
        dm.setAdvt_clsf(advt_clsf);
        dm.setPatr_chrg_info(patr_chrg_info);
        ////dm.print();

        try {
        	AdRes2100DAO	dao = new AdRes2100DAO();
            ds = dao.ad_res_2120_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2100EJBHome home = (AdRes2100EJBHome) JNDIManager.getInstance().getHome("AdRes2100EJB");
//        try {
//        	AdRes2100EJB ejb = home.create();
//            ds = ejb.ad_res_2120_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

}
