/***************************************************************************************************
* 파일명 : AdPub1000WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub1000DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1000_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1010_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1020_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1025_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1030_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1035_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1050_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1000_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1010_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1020_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1025_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1030_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1035_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1050_ADataSet;
import chosun.ciis.co.base.util.PubcPrengInfo;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1000_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1000_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1000_MDM dm = new AD_PUB_1000_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        

        try {
        	AdPub1000DAO	dao = new AdPub1000DAO();
            ds = dao.ad_pub_1000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1000EJBHome home = (AdPub1000EJBHome) JNDIManager.getInstance().getHome("AdPub1000EJB");
//        try {
//        	AdPub1000EJB ejb = home.create();
//            ds = ejb.ad_pub_1000_m(dm);
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
    public void ad_pub_1020_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1020_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1020_LDM dm = new AD_PUB_1020_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String search_dt = Util.checkString(req.getParameter("search_dt"));    	
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSearch_dt(search_dt);
        dm.print();
        try {
        	AdPub1000DAO	dao = new AdPub1000DAO();
            ds = dao.ad_pub_1020_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1000EJBHome home = (AdPub1000EJBHome) JNDIManager.getInstance().getHome("AdPub1000EJB");
//        try {
//        	AdPub1000EJB ejb = home.create();
//            ds = ejb.ad_pub_1020_l(dm);
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
    public void ad_pub_1025_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1025_SDataSet ds = null;

        // DM Setting
    	AD_PUB_1025_SDM dm = new AD_PUB_1025_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);

        try {
        	AdPub1000DAO	dao = new AdPub1000DAO();
            ds = dao.ad_pub_1025_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1000EJBHome home = (AdPub1000EJBHome) JNDIManager.getInstance().getHome("AdPub1000EJB");
//        try {
//        	AdPub1000EJB ejb = home.create();
//            ds = ejb.ad_pub_1025_s(dm);
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
    public void ad_pub_1030_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1030_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1030_LDM dm = new AD_PUB_1030_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String search_dt = Util.checkString(req.getParameter("search_dt"));    	
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSearch_dt(search_dt);

        try {
        	AdPub1000DAO	dao = new AdPub1000DAO();
            ds = dao.ad_pub_1030_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1000EJBHome home = (AdPub1000EJBHome) JNDIManager.getInstance().getHome("AdPub1000EJB");
//        try {
//        	AdPub1000EJB ejb = home.create();
//            ds = ejb.ad_pub_1030_l(dm);
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
    public void ad_pub_1010_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1010_SDataSet ds = null;
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt = Util.checkString(req.getParameter("proc_dt"));
    	String proc_seq = Util.checkString(req.getParameter("proc_seq"));    
    	
        // DM Setting
    	AD_PUB_1010_SDM dm = new AD_PUB_1010_SDM();	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setProc_seq(proc_seq);
        dm.print();
        
        try {
        	AdPub1000DAO	dao = new AdPub1000DAO();
            ds = dao.ad_pub_1010_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1000EJBHome home = (AdPub1000EJBHome) JNDIManager.getInstance().getHome("AdPub1000EJB");
//        try {
//        	AdPub1000EJB ejb = home.create();
//            ds = ejb.ad_pub_1010_s(dm);
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
    public void ad_pub_1050_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1050_ADataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String flag = Util.checkString(req.getParameter("flag"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt = Util.checkString(req.getParameter("proc_dt"));
    	String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
    	String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String sect_nm = Util.checkString(req.getParameter("sect_nm"));
    	String cm = Util.checkString(req.getParameter("cm"));
    	String dn = Util.checkString(req.getParameter("dn"));
    	String uprc = Util.checkString(req.getParameter("uprc"));
    	String advt_fee = Util.checkString(req.getParameter("advt_fee"));
    	String vat = Util.checkString(req.getParameter("vat"));
    	String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
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
    	String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
    	String type_clsf = Util.checkString(req.getParameter("type_clsf"));
    	String type_clsf_nm = Util.checkString(req.getParameter("type_clsf_nm"));
    	String exrate = Util.checkString(req.getParameter("exrate"));
    	String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
    	String appndx_clsf = Util.checkString(req.getParameter("appndx_clsf"));
    	String frex_cntr_amt = Util.checkString(req.getParameter("frex_cntr_amt"));
    	String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String slcrg_pers_nm = Util.checkString(req.getParameter("slcrg_pers_nm"));
    	String dept_cd = Util.checkString(req.getParameter("dept_cd"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String mchrg_pers_nm = Util.checkString(req.getParameter("mchrg_pers_nm"));
    	String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
    	String upd_resn = Util.checkString(req.getParameter("upd_resn"));
    	String govern_advt_yn = Util.checkString(req.getParameter("govern_advt_yn"));
    	String upd_cont = Util.checkString(req.getParameter("upd_cont"));
    	String tabl_yn = Util.checkString(req.getParameter("tabl_yn"));
    	String remk = Util.checkString(req.getParameter("remk"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String pre_pubc_slip_no = Util.checkString(req.getParameter("pre_pubc_slip_no"));
    	String pubc_side = Util.checkString(req.getParameter("pubc_side"));
    	String std_clsf = Util.checkString(req.getParameter("std_clsf"));
    	String pubc_prd = Util.checkString(req.getParameter("pubc_prd"));
    	String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
    	String hp_edt_clsf = Util.checkString(req.getParameter("hp_edt_clsf"));
    	String brdg_advt_yn = Util.checkString(req.getParameter("brdg_advt_yn"));
    	String nwsp_advt_yn = Util.checkString(req.getParameter("nwsp_advt_yn"));
    	String nwsp_side_type = Util.checkString(req.getParameter("nwsp_side_type"));
    	String dtls_medi_cd = "";
    	if("350".equals(medi_cd)){
    		dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
    	}else if("550".equals(medi_cd)){
    		dtls_medi_cd = Util.checkString(req.getParameter("dtev_medi_cd"));
    	}else if("590".equals(medi_cd)){
    		dtls_medi_cd = Util.checkString(req.getParameter("dtob_medi_cd"));
    	}else{
    		dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
    	}
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
    	String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
    	String pre_day_issu = Util.checkString(req.getParameter("pre_day_issu"));
    	String ast_pers = Util.checkString(req.getParameter("asist_pers")); 
    	//System.out.print("preng_occr_seq::"+preng_occr_seq); 
    	String fee_vat = Util.checkString(req.getParameter("fee_vat"));
    	String coms_vat = Util.checkString(req.getParameter("coms_vat"));
    	String pragn_yn = Util.checkString(req.getParameter("pragn_yn"));
    	
    	String sect_cd  = "";
    	String sect_seq = "";
    	if("110".equals(medi_cd)){
	    	try{
	    		sect_cd  = sect_nm.substring(0,1);
	    		sect_seq = sect_nm.substring(1);    		
	    	}catch(Exception ignore){}
    	}else{
//    		sect_cd 	= sect_nm;
    		sect_seq	= sect_nm;
    	}
    	
    	//해시 
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode   		 	= Util.checkString((String)hash.get("mode"));
    	String bus_seq   		= Util.checkString((String)hash.get("bus_seq"));
    	String bus_plc   		= Util.checkString((String)hash.get("bus_plc"));
    	String bus_clsf   		= Util.checkString((String)hash.get("bus_clsf"));
    	
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	String emode             = Util.checkString((String)hash2.get("m"));
    	String eseq              = Util.checkString((String)hash2.get("seq"));
    	String evnt_nm           = Util.checkString((String)hash2.get("evnt_cd"));
    	String eamt              = Util.checkString((String)hash2.get("amt"));
    	String evat              = Util.checkString((String)hash2.get("vat"));
    	String etot_amt          = Util.checkString((String)hash2.get("tot_amt"));
    	String efee              = Util.checkString((String)hash2.get("fee"));
    	String efee_vat          = Util.checkString((String)hash2.get("fee_vat"));
    	String etot_fee          = Util.checkString((String)hash2.get("tot_feet"));
        // DM Setting
    	AD_PUB_1050_ADM dm = new AD_PUB_1050_ADM();

    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_cont(advt_cont);
    	dm.setSect_cd(sect_cd);
    	dm.setSect_seq(sect_seq);
    	dm.setCm(cm);
    	dm.setDn(dn);
    	dm.setUprc(uprc);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setPubc_tot_amt(pubc_tot_amt);
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
    	dm.setChro_clsf(chro_clsf);
    	dm.setType_clsf(type_clsf);
    	dm.setType_clsf_nm(type_clsf_nm);
    	dm.setExrate(exrate);
    	dm.setPubc_clsf(pubc_clsf);
    	dm.setAppndx_clsf(appndx_clsf);
    	dm.setFrex_cntr_amt(frex_cntr_amt);
    	dm.setEdt_clsf(edt_clsf);
    	dm.setGrp_cmpy_cd(grp_cmpy_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setDept_cd(dept_cd);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setRtax_yn(rtax_yn);
    	dm.setUpd_resn(upd_resn);
    	dm.setGovern_advt_yn(govern_advt_yn);
    	dm.setUpd_cont(upd_cont);
    	dm.setTabl_yn(tabl_yn);
    	dm.setRemk(remk);
    	dm.setPubc_dt(pubc_dt);
    	dm.setPre_pubc_slip_no(pre_pubc_slip_no);
    	dm.setPubc_side(pubc_side);
    	dm.setStd_clsf(std_clsf);
    	dm.setPubc_prd(pubc_prd);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	dm.setHp_edt_clsf(hp_edt_clsf);
    	dm.setBrdg_advt_yn(brdg_advt_yn);
    	dm.setNwsp_advt_yn(nwsp_advt_yn);
    	dm.setNwsp_side_type(nwsp_side_type);
    	dm.setDtls_medi_cd(dtls_medi_cd);
    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setPreng_occr_dt(preng_occr_dt);
    	dm.setPreng_occr_seq(preng_occr_seq);
    	dm.setPre_issu_yn(pre_issu_yn);
    	dm.setPre_day_issu(pre_day_issu);
    	dm.setAst_pers(ast_pers);
    	dm.setFee_vat(fee_vat);
    	dm.setComs_vat(coms_vat);
    	
    	dm.setMode(mode);
    	dm.setBus_seq(bus_seq);
    	dm.setBus_plc(bus_plc);
    	dm.setBus_clsf(bus_clsf);
    	
    	dm.setEmode(emode);
    	dm.setEseq(eseq);
    	dm.setEvnt_nm(evnt_nm);
    	dm.setEamt(eamt);
    	dm.setEvat(evat);
    	dm.setEtot_amt(etot_amt);
    	dm.setEfee(efee);
    	dm.setEfee_vat(efee_vat);
    	dm.setEtot_fee(etot_fee);
    	
    	dm.setPragn_yn(pragn_yn);

    	dm.print(); 

        try {
        	AdPub1000DAO	dao = new AdPub1000DAO();
            ds = dao.ad_pub_1050_a(dm);
            req.setAttribute("ds", ds);  
            PubcPrengInfo.instance().setSlcrgPersInfo(dlco_no, slcrg_pers, slcrg_pers_nm);	
            PubcPrengInfo.instance().setMchrgPersInfo(dlco_no, mchrg_pers, mchrg_pers_nm);
        }
        catch (AppException e) {
            throw e;
        }  
//        
//    	AdPub1000EJBHome home = (AdPub1000EJBHome) JNDIManager.getInstance().getHome("AdPub1000EJB");
//        try {
//        	AdPub1000EJB ejb = home.create();
//            ds = ejb.ad_pub_1050_a(dm);
//            req.setAttribute("ds", ds);
//            
//            PubcPrengInfo.instance().setSlcrgPersInfo(dlco_no, slcrg_pers, slcrg_pers_nm);	
//            PubcPrengInfo.instance().setMchrgPersInfo(dlco_no, mchrg_pers, mchrg_pers_nm);	
//            
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
	public void ad_pub_1035_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		
		AD_PUB_1035_SDataSet ds = null;
	
	    // DM Setting
		AD_PUB_1035_SDM dm = new AD_PUB_1035_SDM();
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
		String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));		
	
	    dm.setCmpy_cd(cmpy_cd);
	    dm.setMedi_cd(medi_cd);
	    dm.setPubc_occr_seq(pubc_occr_seq);
	    dm.setPubc_occr_dt(pubc_occr_dt);
	    
	    //dm.print();

        try {
        	AdPub1000DAO	dao = new AdPub1000DAO();
            ds = dao.ad_pub_1035_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdPub1000EJBHome home = (AdPub1000EJBHome) JNDIManager.getInstance().getHome("AdPub1000EJB");
//	    try {
//	    	AdPub1000EJB ejb = home.create();
//	        ds = ejb.ad_pub_1035_s(dm);
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
