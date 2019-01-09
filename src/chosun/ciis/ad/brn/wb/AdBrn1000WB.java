/***************************************************************************************************
* 파일명 : AdBrn1000WB.java
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

package chosun.ciis.ad.brn.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.brn.dao.AdBrn1000DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1000_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1010_SDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1020_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1030_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1000_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1010_SDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1020_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1030_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBrn1000WB extends BaseWB {
	
	public static final String PRENG_ADVT_BO = "00038160";
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	AD_BRN_1000_MDataSet ds = null;

        String cmpy_cd    	 = Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo = Util.getSessionParameterValue(req, "emp_no", true);
        
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
        // DM Setting
        AD_BRN_1000_MDM dm = new AD_BRN_1000_MDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setPreng_advt_bo(preng_advt_bo);
        

        try {
        	AdBrn1000DAO dao = new AdBrn1000DAO();
            ds = dao.ad_brn_1000_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1000EJBHome home = (AdBrn1000EJBHome) JNDIManager.getInstance().getHome("AdBrn1000EJB");
//        try {
//        	AdBrn1000EJB ejb = home.create();
//            ds = ejb.ad_brn_1000_m(dm);
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
    public void ad_brn_1010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	AD_BRN_1010_SDataSet ds = null;

        String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
        String medi_cd 		 	= Util.checkString(req.getParameter("medi_cd"));
        String preng_occr_dt 	= Util.checkString(req.getParameter("preng_occr_dt"));
        String preng_occr_seq 	= Util.checkString(req.getParameter("preng_occr_seq"));


        // DM Setting
        AD_BRN_1010_SDM dm = new AD_BRN_1010_SDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_advt_bo(preng_advt_bo);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);
        
//        //dm.print();

        try {
        	AdBrn1000DAO dao = new AdBrn1000DAO();
            ds = dao.ad_brn_1010_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1000EJBHome home = (AdBrn1000EJBHome) JNDIManager.getInstance().getHome("AdBrn1000EJB");
//        try {
//        	AdBrn1000EJB ejb = home.create();
//            ds = ejb.ad_brn_1010_s(dm);
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
	public void ad_brn_1020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1020_ADataSet ds = null;
	
		String flag = Util.checkString(req.getParameter("flag"));
		String cmpy_cd    	 	= Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers_ip 	= req.getRemoteAddr();
		String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
		
        String preng_advt_bo = Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
		String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String sect_nm = Util.checkString(req.getParameter("sect_nm"));
		String cm = Util.checkString(req.getParameter("cm"));
		String dn = Util.checkString(req.getParameter("dn"));
		String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
		String uprc = Util.checkString(req.getParameter("uprc"));
		String advt_fee = Util.checkString(req.getParameter("advt_fee"));
		String vat = Util.checkString(req.getParameter("vat"));
		String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
		String pubc_side = Util.checkString(req.getParameter("pubc_side"));
		String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
		String tabl_yn = Util.checkString(req.getParameter("tabl_yn"));
		String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
		String agn = Util.checkString(req.getParameter("agn"));
		String fee_rate = Util.checkString(req.getParameter("fee_rate"));
		String fee = Util.checkString(req.getParameter("fee"));
		String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
		String coms_rate = Util.checkString(req.getParameter("coms_rate"));
		String coms = Util.checkString(req.getParameter("coms"));
		String advt_clas = Util.checkString(req.getParameter("advt_clas"));
		String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
		String indt_clsf_nm = Util.checkString(req.getParameter("indt_clsf_nm"));
		String mony_kind = Util.checkString(req.getParameter("mony_kind"));
		String type_clsf = Util.checkString(req.getParameter("type_clsf"));
		String type_clsf_nm = Util.checkString(req.getParameter("type_clsf_nm"));
		String exrate = Util.checkString(req.getParameter("exrate"));
		String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
		String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
		String frex_cntr_amt = Util.checkString(req.getParameter("frex_cntr_amt"));
		String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
		String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
		String dept_cd = Util.checkString(req.getParameter("dept_cd"));
		String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
		String advt_cont = Util.checkString(req.getParameter("advt_cont"));
		String remk = Util.checkString(req.getParameter("remk"));
		String org_preng_occr_dt = Util.checkString(req.getParameter("org_preng_occr_dt"));
		String org_preng_occr_seq = Util.checkString(req.getParameter("org_preng_occr_seq"));
		
		String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		String ast_pers = Util.checkString(req.getParameter("ast_pers"));
		String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
		String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
		
		String sect_cd  = "";
		String sect_seq = "";
		
		try{
			sect_cd  = sect_nm.substring(0,1);
			sect_seq = sect_nm.substring(1);
		}catch(Exception ignore){}
		

	    // DM Setting
		AD_BRN_1020_ADM dm = new AD_BRN_1020_ADM();


		dm.setFlag(flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setPreng_occr_dt(preng_occr_dt);
		dm.setPreng_occr_seq(preng_occr_seq);
		dm.setDlco_no(dlco_no);
		dm.setSect_cd(sect_cd);
		dm.setSect_seq(sect_seq);
		dm.setCm(cm);
		dm.setDn(dn);
		dm.setChro_clsf(chro_clsf);
		dm.setUprc(uprc);
		dm.setAdvt_fee(advt_fee);
		dm.setVat(vat);
		dm.setPubc_tot_amt(pubc_tot_amt);
		dm.setPubc_side(pubc_side);
		dm.setRtax_yn(rtax_yn);
		dm.setTabl_yn(tabl_yn);
		dm.setHndl_clsf(hndl_clsf);
		dm.setAgn(agn);
		dm.setFee_rate(fee_rate);
		dm.setFee(fee);
		dm.setHndl_plac_cd(hndl_plac_cd);
		dm.setComs_rate(coms_rate);
		dm.setComs(coms);
		dm.setAdvt_clas(advt_clas);
		dm.setIndt_clsf(indt_clsf);
		dm.setIndt_clsf_nm(indt_clsf_nm);
		dm.setMony_kind(mony_kind);
		dm.setType_clsf(type_clsf);
		dm.setType_clsf_nm(type_clsf_nm);
		dm.setExrate(exrate);
		dm.setPubc_clsf(pubc_clsf);
		dm.setGrp_cmpy_cd(grp_cmpy_cd);
		dm.setFrex_cntr_amt(frex_cntr_amt);
		dm.setEdt_clsf(edt_clsf);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setDept_cd(dept_cd);
		dm.setMchrg_pers(mchrg_pers);
		dm.setAdvt_cont(advt_cont);
		dm.setRemk(remk);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);
		dm.setOrg_preng_occr_dt(org_preng_occr_dt);
		dm.setOrg_preng_occr_seq(org_preng_occr_seq);
		dm.setDtls_medi_cd(dtls_medi_cd);
		dm.setAst_pers(ast_pers);
		dm.setPubc_frdt(pubc_frdt);
		dm.setPubc_todt(pubc_todt);
		dm.print();
	    

        try {
        	AdBrn1000DAO dao = new AdBrn1000DAO();
            ds = dao.ad_brn_1020_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1000EJBHome home = (AdBrn1000EJBHome) JNDIManager.getInstance().getHome("AdBrn1000EJB");
//	    try {
//	    	AdBrn1000EJB ejb = home.create();
//	        ds = ejb.ad_brn_1020_a(dm);
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

	/**
	 * 
	 *
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1030_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1030_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        
		String preng_advt_bo = Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
		String bo_chrg_aprv 	= Util.checkString(req.getParameter("bo_chrg_aprv"));
		String pubc_dt 			= Util.checkString(req.getParameter("pubc_dt"));
	
	    // DM Setting
		AD_BRN_1030_LDM dm = new AD_BRN_1030_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setBo_chrg_aprv(bo_chrg_aprv);
		dm.setPubc_dt(pubc_dt);  
	    
		//dm.print();

        try {
        	AdBrn1000DAO dao = new AdBrn1000DAO();
            ds = dao.ad_brn_1030_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1000EJBHome home = (AdBrn1000EJBHome) JNDIManager.getInstance().getHome("AdBrn1000EJB");
//	    try {
//	    	AdBrn1000EJB ejb = home.create();
//	        ds = ejb.ad_brn_1030_l(dm);
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
