/***************************************************************************************************
* 파일명 : AdPub1600WB.java
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

package chosun.ciis.ad.pub.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub1600DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1600_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1610_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1620_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1625_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1630_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1635_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1650_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1600_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1610_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1620_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1625_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1630_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1635_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1650_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1600WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1600_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1600_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1600_MDM dm = new AD_PUB_1600_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dept_cd    = Util.getSessionParameterValue(req, "deptcd", true); 

        dm.setCmpy_cd(cmpy_cd);
        dm.setDept_cd(dept_cd);

        try {
        	AdPub1600DAO	dao = new AdPub1600DAO();
            ds = dao.ad_pub_1600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1600EJBHome home = (AdPub1600EJBHome) JNDIManager.getInstance().getHome("AdPub1600EJB");
//        try {
//        	AdPub1600EJB ejb = home.create();
//            ds = ejb.ad_pub_1600_m(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1620_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1620_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1620_LDM dm = new AD_PUB_1620_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String search_dt = Util.checkString(req.getParameter("search_dt"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSearch_dt(search_dt);
        

        try {
        	AdPub1600DAO	dao = new AdPub1600DAO();
            ds = dao.ad_pub_1620_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1600EJBHome home = (AdPub1600EJBHome) JNDIManager.getInstance().getHome("AdPub1600EJB");
//        try {
//        	AdPub1600EJB ejb = home.create();
//            ds = ejb.ad_pub_1620_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1625_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1625_SDataSet ds = null;

        // DM Setting
    	AD_PUB_1625_SDM dm = new AD_PUB_1625_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);

        try {
        	AdPub1600DAO	dao = new AdPub1600DAO();
            ds = dao.ad_pub_1625_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1600EJBHome home = (AdPub1600EJBHome) JNDIManager.getInstance().getHome("AdPub1600EJB");
//        try {
//        	AdPub1600EJB ejb = home.create();
//            ds = ejb.ad_pub_1625_s(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1630_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1630_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1630_LDM dm = new AD_PUB_1630_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String search_dt = Util.checkString(req.getParameter("search_dt"));    	
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSearch_dt(search_dt);
        

        try {
        	AdPub1600DAO	dao = new AdPub1600DAO();
            ds = dao.ad_pub_1630_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1600EJBHome home = (AdPub1600EJBHome) JNDIManager.getInstance().getHome("AdPub1600EJB");
//        try {
//        	AdPub1600EJB ejb = home.create();
//            ds = ejb.ad_pub_1630_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1635_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1635_SDataSet ds = null;

        // DM Setting
    	AD_PUB_1635_SDM dm = new AD_PUB_1635_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
    	String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_occr_seq(pubc_occr_seq);
        dm.setPubc_occr_dt(pubc_occr_dt);

        try {
        	AdPub1600DAO	dao = new AdPub1600DAO();
            ds = dao.ad_pub_1635_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1600EJBHome home = (AdPub1600EJBHome) JNDIManager.getInstance().getHome("AdPub1600EJB");
//        try {
//        	AdPub1600EJB ejb = home.create();
//            ds = ejb.ad_pub_1635_s(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1650_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1650_ADataSet ds = null;

    	String flag = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt = Util.checkString(req.getParameter("proc_dt"));
    	String pubc_occr_seq =Util.checkString(req.getParameter("pubc_occr_seq"));
    	String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String pubc_side = Util.checkString(req.getParameter("pubc_side"));
    	String issu_ser_no = Util.checkString(req.getParameter("issu_ser_no"));
    	String publ_std = Util.checkString(req.getParameter("publ_std"));
    	String advt_fee = Util.checkString(req.getParameter("advt_fee"));
    	String vat = Util.checkString(req.getParameter("vat"));
    	String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
    	String agn = Util.checkString(req.getParameter("agn"));
    	String fee_rate = Util.checkString(req.getParameter("fee_rate"));
    	String fee = Util.checkString(req.getParameter("fee"));
    	String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
    	String coms_rate = Util.checkString(req.getParameter("coms_rate"));
    	String coms = Util.checkString(req.getParameter("coms"));
    	String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
    	String indt_clsf_nm = Util.checkString(req.getParameter("indt_clsf_nm"));
    	String mony_kind = Util.checkString(req.getParameter("mony_kind"));
    	String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
    	String type_clsf = Util.checkString(req.getParameter("type_clsf"));
    	String type_clsf_nm = Util.checkString(req.getParameter("type_clsf_nm"));
    	String exrate = Util.checkString(req.getParameter("exrate"));
    	String nwsp_type_clsf = Util.checkString(req.getParameter("nwsp_type_clsf"));
    	String frex_cntr_amt = Util.checkString(req.getParameter("frex_cntr_amt"));
    	String book_appndx_clsf = Util.checkString(req.getParameter("book_appndx_clsf"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String dept_cd = Util.checkString(req.getParameter("dept_cd"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
    	String upd_resn = Util.checkString(req.getParameter("upd_resn"));
    	String govern_advt_yn = Util.checkString(req.getParameter("govern_advt_yn"));
    	String upd_cont = Util.checkString(req.getParameter("upd_cont"));
    	String remk = Util.checkString(req.getParameter("remk"));
    	String advcs_offr_yn = Util.checkString(req.getParameter("advcs_offr_yn"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
    	String tax_email = Util.checkString(req.getParameter("tax_email"));
    	String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));
    	String advt_clsf = Util.checkString(req.getParameter("advt_clsf"));
    	String patr_chrg_info = Util.checkString(req.getParameter("patr_chrg_info"));
    	String page = Util.checkString(req.getParameter("page"));
    	String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
    	
        // DM Setting
    	AD_PUB_1650_ADM dm = new AD_PUB_1650_ADM();
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_cont(advt_cont);
    	dm.setPubc_side(pubc_side);
    	dm.setIssu_ser_no(issu_ser_no);
    	dm.setPubl_std(publ_std);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setPubc_tot_amt(pubc_tot_amt);
    	dm.setAgn(agn);
    	dm.setFee_rate(fee_rate);
    	dm.setFee(fee);
    	dm.setHndl_plac_cd(hndl_plac_cd);
    	dm.setComs_rate(coms_rate);
    	dm.setComs(coms);
    	dm.setIndt_clsf(indt_clsf);
    	dm.setIndt_clsf_nm(indt_clsf_nm);
    	dm.setMony_kind(mony_kind);
    	dm.setChro_clsf(chro_clsf);
    	dm.setType_clsf(type_clsf);
    	dm.setType_clsf_nm(type_clsf_nm);
    	dm.setExrate(exrate);
    	dm.setNwsp_type_clsf(nwsp_type_clsf);
    	dm.setFrex_cntr_amt(frex_cntr_amt);
    	dm.setBook_appndx_clsf(book_appndx_clsf);
    	dm.setGrp_cmpy_cd(grp_cmpy_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setDept_cd(dept_cd);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setRtax_yn(rtax_yn);
    	dm.setUpd_resn(upd_resn);
    	dm.setGovern_advt_yn(govern_advt_yn);
    	dm.setUpd_cont(upd_cont);
    	dm.setRemk(remk);
    	dm.setAdvcs_offr_yn(advcs_offr_yn);
    	dm.setPatr_chrg_info(patr_chrg_info);
    	dm.setPubc_dt(pubc_dt);
    	dm.setIncmg_pers_ip(req.getRemoteAddr());
    	dm.setIncmg_pers(incmg_pers);
    	dm.setPreng_occr_dt(preng_occr_dt);
    	dm.setPreng_occr_seq(preng_occr_seq);
    	dm.setTax_email(tax_email);
    	dm.setTax_clsf(tax_clsf);
    	dm.setAdvt_clsf(advt_clsf);
    	dm.setPage(page);
    	dm.setPre_issu_yn(pre_issu_yn);
    	
        dm.print(); 
 
        try {
        	AdPub1600DAO	dao = new AdPub1600DAO();
            ds = dao.ad_pub_1650_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1600EJBHome home = (AdPub1600EJBHome) JNDIManager.getInstance().getHome("AdPub1600EJB");
//        try {
//        	AdPub1600EJB ejb = home.create();
//            ds = ejb.ad_pub_1650_a(dm);
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
	 * @param pub HttpServletResponse
	 * @throws AppException
	 */
	public void ad_pub_1610_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		
		AD_PUB_1610_SDataSet ds = null;
	
	    // DM Setting
		AD_PUB_1610_SDM dm = new AD_PUB_1610_SDM();
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String proc_dt = Util.checkString(req.getParameter("proc_dt"));
		String proc_seq = Util.checkString(req.getParameter("proc_seq"));		
	
	    dm.setCmpy_cd(cmpy_cd);
	    dm.setMedi_cd(medi_cd);
	    dm.setProc_dt(proc_dt);
	    dm.setProc_seq(proc_seq);
	   	   	    

        try {
        	AdPub1600DAO	dao = new AdPub1600DAO();
            ds = dao.ad_pub_1610_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//	    AdPub1600EJBHome home = (AdPub1600EJBHome) JNDIManager.getInstance().getHome("AdPub1600EJB");
//	    try {
//	    	AdPub1600EJB ejb = home.create();
//	        ds = ejb.ad_pub_1610_s(dm);
//	        req.setAttribute("ds", ds);
//	    }
//	    catch (CreateException e) {
//	        SysException se = new SysException(e);
//	        LogManager.getInstance().log(se);
//	        throw se;
//	    }
//	    catch (RemoteException e) {
//	        SysException se = new SysException(e);
//	        LogManager.getInstance().log(se);
//	        throw se;
//	    }
	}    

}
