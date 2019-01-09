/***************************************************************************************************
* 파일명 : AdRes1100WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes1200DAO;
import chosun.ciis.ad.res.dm.AD_RES_1200_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1201_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1202_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1203_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1204_DDM;
import chosun.ciis.ad.res.dm.AD_RES_1210_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1220_ADM;
import chosun.ciis.ad.res.dm.AD_RES_1230_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1250_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1260_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1270_SDM;
import chosun.ciis.ad.res.ds.AD_RES_1200_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1201_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1202_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1203_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1204_DDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1210_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1220_ADataSet;
import chosun.ciis.ad.res.ds.AD_RES_1230_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1250_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1260_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1270_SDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1200_MDataSet ds = null;

        // DM Setting
    	AD_RES_1200_MDM dm = new AD_RES_1200_MDM();
    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no	= Util.getSessionParameterValue(req, "emp_no", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEmp_no(emp_no);

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1200_m(dm);
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
    public void ad_res_1210_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1210_SDataSet ds = null;

        // DM Setting
    	AD_RES_1210_SDM dm = new AD_RES_1210_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
    	String acct_cd    = Util.getSessionParameterValue(req, "uid", true);
    	String emp_no     = Util.getSessionParameterValue(req, "emp_no", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);
        dm.setAcct_cd(acct_cd);
        dm.setEmp_no(emp_no);
        
        dm.print();

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1210_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1210_s(dm);
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
    public void ad_res_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1220_ADataSet ds = null;

    	String flag = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
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
    	String pubc_side = StringUtil.nvl(req.getParameter("pubc_side"), "0");
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

    	String ext01 = Util.checkString(req.getParameter("bool_ext01"));
    	String srch_dt = Util.checkString(req.getParameter("srch_dt"));
    	String srch_plac = Util.checkString(req.getParameter("srch_plac"));
    	String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
    	String tm = Util.checkString(req.getParameter("tm"));
    	String sect_clsf = Util.checkString(req.getParameter("sect_clsf"));
    	String ext02 = Util.checkString(req.getParameter("bool_ext02"));
    	String cnfm_matt = Util.checkString(req.getParameter("cnfm_matt"));

    	String org_preng_occr_dt = Util.checkString(req.getParameter("org_preng_occr_dt"));
    	String org_preng_occr_seq = Util.checkString(req.getParameter("org_preng_occr_seq"));
    	String nwsp_type_yn	 = Util.checkString(req.getParameter("nwsp_type_yn"));
    	String nwsp_side_type	 = Util.checkString(req.getParameter("nwsp_side_type"));
    	String pre_issu_yn	 = Util.checkString(req.getParameter("pre_issu_yn"));
    	
    	String ast_pers	 = Util.checkString(req.getParameter("asist_pers"));
    	String ast_pers_nm	 = Util.checkString(req.getParameter("asist_pers_nm"));
    	String pubc_frdt	 = Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt	 = Util.checkString(req.getParameter("pubc_todt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String sect_cd  = "";
    	String sect_seq = "";
    	

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode 	  	  = Util.checkString((String)hash.get("m"));
    	String bus_seq  	  = Util.checkString((String)hash.get("bus_seq"));
    	String bus_plc 		  = Util.checkString((String)hash.get("bus_plc"));
    	String bus_clsf       = Util.checkString((String)hash.get("bus_clsf"));
    	
    	//대행료/수수료 부가세 추가 
    	String fee_vat	 = Util.checkString(req.getParameter("fee_vat"));
    	String coms_vat	 = Util.checkString(req.getParameter("coms_vat"));    	
    	
    	//20160202 방일국요청 입금정보입력 추가
    	String rcpm_yn = Util.checkString(req.getParameter("rcpm_yn"));
    	String unrcpm_yn = Util.checkString(req.getParameter("unrcpm_yn"));
    	String acct_num = Util.checkString(req.getParameter("acct_num"));
    	String tran_nm = Util.checkString(req.getParameter("tran_nm"));
    	String tran_amt = Util.checkString(req.getParameter("tran_amt"));
    	String tran_dt = Util.checkString(req.getParameter("tran_dt"));
    	String tran_schd_dt = Util.checkString(req.getParameter("tran_schd_dt"));
    	String advt_emp_nm = Util.checkString(req.getParameter("advt_emp_nm"));
    	String advt_email = Util.checkString(req.getParameter("advt_email"));
    	String advt_telno = Util.checkString(req.getParameter("advt_telno"));
    	
    	//20160323 원승식 홍보대행사 경유
    	String pragn_yn = Util.checkString(req.getParameter("pragn_yn"));
    	
    	//20170531 디지털 추가로 항목 추가
    	String dtls_medi_cd	 = Util.checkString(req.getParameter("dtls_medi_cd"));
    	
    	//20170721 임광현 행사 추가
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	String emode             = Util.checkString((String)hash2.get("mode"));
    	String evnt_nm           = Util.checkString((String)hash2.get("evnt_cd"));
    	String eamt              = Util.checkString((String)hash2.get("amt"));
    	String evat              = Util.checkString((String)hash2.get("vat"));
    	String etot_amt          = Util.checkString((String)hash2.get("tot_amt"));
    	String efee              = Util.checkString((String)hash2.get("fee"));
    	String efee_vat          = Util.checkString((String)hash2.get("fee_vat"));
    	String etot_fee          = Util.checkString((String)hash2.get("tot_feet"));
    	
    	try{
    		sect_cd  = sect_nm.substring(0,1);
    		sect_seq = sect_nm.substring(1);
    	}catch(Exception ignore){}
    	

        // DM Setting
    	AD_RES_1220_ADM dm = new AD_RES_1220_ADM();


    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
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
    	dm.setExt01(ext01);
    	dm.setSrch_dt(srch_dt);
    	dm.setSrch_plac(srch_plac);
    	dm.setCntc_plac(cntc_plac);
    	dm.setTm(tm);
    	dm.setSect_clsf(sect_clsf);
    	dm.setExt02(ext02);
    	dm.setCnfm_matt(cnfm_matt);
    	dm.setNwsp_side_type(nwsp_side_type);
    	dm.setOrg_preng_occr_dt(org_preng_occr_dt);
    	dm.setOrg_preng_occr_seq(org_preng_occr_seq);
    	dm.setNwsp_type_yn(nwsp_type_yn);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setPre_issu_yn(pre_issu_yn);
    	dm.setAst_pers(ast_pers);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	dm.setMode(mode);
    	dm.setBus_seq(bus_seq);
    	dm.setBus_plc(bus_plc);
    	dm.setBus_clsf(bus_clsf);
    	dm.setFee_vat(fee_vat);
    	dm.setComs_vat(coms_vat);
    	//20160202 방일구요청사항 추가
    	dm.setRcpm_yn(rcpm_yn);
    	dm.setUnrcpm_yn(unrcpm_yn);
    	dm.setAcct_num(acct_num);
    	dm.setTran_amt(tran_amt);
    	dm.setTran_nm(tran_nm);
    	dm.setTran_dt(tran_dt);
    	dm.setTran_schd_dt(tran_schd_dt);
    	dm.setAdvt_emp_nm(advt_emp_nm);
    	dm.setAdvt_email(advt_email);
    	dm.setAdvt_telno(advt_telno);
    	//20160323 원승식 홍보대행사경유추가
    	dm.setPragn_yn(pragn_yn);
    	//20170531 디지털 추가로 항목 추가
    	dm.setDtls_medi_cd(dtls_medi_cd);
    	//20170721 행사 추가
    	dm.setEmode(emode);
    	dm.setEvnt_nm(evnt_nm);
    	dm.setEamt(eamt);
    	dm.setEvat(evat);
    	dm.setEtot_amt(etot_amt);
    	dm.setEfee(efee);
    	dm.setEfee_vat(efee_vat);
    	dm.setEtot_fee(etot_fee);
    	
        dm.print();

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1220_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1220_a(dm);
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
    public void ad_res_1230_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1230_SDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String sect_nm = Util.checkString(req.getParameter("sect_nm"));
    	
    	String sect_cd  = "";
    	String sect_seq = "";
    	
    	try{
    		sect_cd  = sect_nm.substring(0,1);
    		sect_seq = sect_nm.substring(1);
    		
    	}catch(Exception ignore){}

        // DM Setting
    	
        AD_RES_1230_SDM dm = new AD_RES_1230_SDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setSect_cd(sect_cd);
        dm.setSect_seq(sect_seq);
        
        //dm.print();

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1230_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1230_s(dm);
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
    public void ad_res_1250_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1250_LDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no    = Util.getSessionParameterValue(req, "emp_no", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	
//    	emp_no	=	"208002";
        // DM Setting
        AD_RES_1250_LDM dm = new AD_RES_1250_LDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setIncmg_pers(emp_no);

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1250_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1250_l(dm);
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
    public void ad_res_1260_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1260_SDataSet ds = null;
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
    	String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
    	
        // DM Setting
        AD_RES_1260_SDM dm = new AD_RES_1260_SDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_occr_dt(pubc_occr_dt);
        dm.setPubc_occr_seq(pubc_occr_seq);
        
        dm.print();

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1260_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1260_s(dm);
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
    public void ad_res_1270_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1270_SDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

        // DM Setting
    	
        AD_RES_1270_SDM dm = new AD_RES_1270_SDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        
        dm.print();

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1270_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1230_s(dm);
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
    public void ad_res_1201_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1201_MDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no	  = Util.getSessionParameterValue(req, "emp_no", true);
    	
        // DM Setting
        AD_RES_1201_MDM dm = new AD_RES_1201_MDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setEmp_no(emp_no);

        try 
        {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1201_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) 
        {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1201_m(dm);
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
    public void ad_res_1202_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1202_LDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String appv_clsf = Util.checkString(req.getParameter("appv_clsf"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	 
        // DM Setting
        AD_RES_1202_LDM dm = new AD_RES_1202_LDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setAppv_clsf(appv_clsf);
        dm.setPubc_dt(pubc_dt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setIncmg_pers(incmg_pers);

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1202_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1202_l(dm);
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
    public void ad_res_1203_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1203_UDataSet ds = null;
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String medi_cd 	  	  = Util.checkString((String)hash.get("medi_cd"));
    	String preng_occr_dt  = Util.checkString((String)hash.get("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString((String)hash.get("preng_occr_seq"));
    	String chrg_aprv      = Util.checkString((String)hash.get("chrg_aprv"));
    	String apr_advt_fee   = Util.checkString((String)hash.get("apr_advt_fee"));
       
    	// DM Setting
        AD_RES_1203_UDM dm = new AD_RES_1203_UDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);
        dm.setChrg_aprv(chrg_aprv);
        dm.setApr_advt_fee(apr_advt_fee);
        dm.setIncmg_pers(incmg_pers);
          
        dm.print();

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1203_u(dm);
            req.setAttribute("ds", ds);
            
            if("".equals(ds.errcode)){
            	req.setAttribute("resultMsg", "정상적으로 처리되었습니다.\n\n저장(O) : " + ds.aprv_cnt + "개 , 저장(X): " + ds.unaprv_cnt + "개");
            }
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1203_u(dm);
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
    public void ad_res_1204_d(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1204_DDataSet ds = null;
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String medi_cd 	  	  = Util.checkString((String)hash.get("medi_cd"));
    	String preng_occr_dt  = Util.checkString((String)hash.get("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString((String)hash.get("preng_occr_seq"));
    	String checked     	 = Util.checkString((String)hash.get("checked"));
       
    	// DM Setting
        AD_RES_1204_DDM dm = new AD_RES_1204_DDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);
        dm.setChecked(checked);
        dm.setIncmg_pers(incmg_pers);
          
        dm.print();
        

        try {
        	AdRes1200DAO	dao = new AdRes1200DAO();
            ds = dao.ad_res_1204_d(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1200EJBHome home = (AdRes1200EJBHome) JNDIManager.getInstance().getHome("AdRes1200EJB");
//        try {
//        	AdRes1200EJB ejb = home.create();
//            ds = ejb.ad_res_1204_d(dm);
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
