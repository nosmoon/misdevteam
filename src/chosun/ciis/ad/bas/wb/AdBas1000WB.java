/***************************************************************************************************
* 파일명 : AdBas1000WB.java
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

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1000DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1000_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1010_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1030_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1050_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1051_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1055_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1000_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1010_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1030_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1050_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1051_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1055_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	AD_BAS_1000_MDataSet ds = null; 

        // DM Setting
    	AD_BAS_1000_MDM dm = new AD_BAS_1000_MDM();
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
     
        try {
        	AdBas1000DAO dao = new AdBas1000DAO();
            ds = dao.ad_bas_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
        
//        AdBas1000EJBHome home = (AdBas1000EJBHome) JNDIManager.getInstance().getHome("AdBas1000EJB");
//        try {
//        	AdBas1000EJB ejb = home.create();
//            ds = ejb.ad_bas_1000_m(dm);
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
    public void ad_bas_1010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1010_SDataSet ds = null;

        // DM Setting
    	AD_BAS_1010_SDM dm = new AD_BAS_1010_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String dlco_no  	 = Util.checkString(req.getParameter("dlco_no"));
        String dlco_abrv_nm  = Util.checkString(req.getParameter("dlco_abrv_nm"));
                
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        dm.setDlco_abrv_nm(dlco_abrv_nm);
        
//        //dm.print();
        
        try {
        	AdBas1000DAO dao = new AdBas1000DAO();
            ds = dao.ad_bas_1010_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      
//        AdBas1000EJBHome home = (AdBas1000EJBHome) JNDIManager.getInstance().getHome("AdBas1000EJB");
//        try {
//        	AdBas1000EJB ejb = home.create();
//            ds = ejb.ad_bas_1010_s(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
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
    public void ad_bas_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1030_ADataSet ds = null;
    	
    	String flag = Util.checkString(req.getParameter("flag"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
    	String eps_clsf_cd = Util.checkString(req.getParameter("eps_clsf_cd"));
    	String cntr_yn = Util.checkString(req.getParameter("cntr_yn"));
    	String mang_clsf = Util.checkString(req.getParameter("mang_clsf"));
    	String oth_cmpy_dlco_yn = Util.checkString(req.getParameter("oth_cmpy_dlco_yn"));
    	String govern_advt_yn = Util.checkString(req.getParameter("govern_advt_yn"));
    	String cntr_type = Util.checkString(req.getParameter("cntr_type"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String slcrg_pers_nm = Util.checkString(req.getParameter("slcrg_pers_nm"));
    	String mchrg_pers_nm = Util.checkString(req.getParameter("mchrg_pers_nm"));
    	String indt_cd = Util.checkString(req.getParameter("indt_cd"));
    	String type_cd = Util.checkString(req.getParameter("type_cd"));
    	String fndt_dt = Util.checkString(req.getParameter("fndt_dt"));
    	String dhon_dt = Util.checkString(req.getParameter("dhon_dt"));
    	String capt_amt = Util.checkString(req.getParameter("capt_amt"));
    	String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
    	String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
    	String agn_yn = Util.checkString(req.getParameter("agn_yn"));
    	String nmd_agn_yn = Util.checkString(req.getParameter("nmd_agn_yn"));//20121207 추가
    	String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
    	String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
    	String del_yn = Util.checkString(req.getParameter("del_yn"));
    	String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
    	String email_id = Util.checkString(req.getParameter("email_id"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
        String mode 		= Util.checkString((String)hash.get("m"));
        String seq	 		= Util.checkString((String)hash.get("seq"));
        String job_clsf 	= Util.checkString((String)hash.get("job_clsf"));
        String advcs_feat 	= Util.checkString((String)hash.get("advcs_feat"));
        String chrg_pers	= Util.checkString((String)hash.get("chrg_pers"));
        String tel_no		= Util.checkString((String)hash.get("tel_no"));

    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
        String mode2 		= Util.checkString((String)hash2.get("m"));
        String seq2	 		= Util.checkString((String)hash2.get("seq"));
        String insrt_dt 	= Util.checkString((String)hash2.get("insrt_dt"));
        String dlco_info 	= Util.checkString((String)hash2.get("dlco_info"));
        //String chrg_pers2	= Util.checkString((String)hash2.get("chrg_pers"));
        
        String preng_yn = Util.checkString(req.getParameter("preng_yn"));
        // DM Setting
    	AD_BAS_1030_ADM dm = new AD_BAS_1030_ADM();
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_abrv_nm(dlco_abrv_nm);
    	dm.setGrp_cmpy_cd(grp_cmpy_cd);
    	dm.setEps_clsf_cd(eps_clsf_cd);
    	dm.setCntr_yn(cntr_yn);
    	dm.setMang_clsf(mang_clsf);
    	dm.setOth_cmpy_dlco_yn(oth_cmpy_dlco_yn);
    	dm.setGovern_advt_yn(govern_advt_yn);
    	dm.setCntr_type(cntr_type);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setSlcrg_pers_nm(slcrg_pers_nm);
    	dm.setMchrg_pers_nm(mchrg_pers_nm);
    	dm.setIndt_cd(indt_cd);
    	dm.setType_cd(type_cd);
    	dm.setFndt_dt(StringUtil.strip(fndt_dt));
    	dm.setDhon_dt(StringUtil.strip(dhon_dt));
    	dm.setCapt_amt(capt_amt);
    	dm.setGnr_advcs_yn(gnr_advcs_yn);
    	dm.setArow_advcs_yn(arow_advcs_yn);
    	dm.setAgn_yn(agn_yn);
    	dm.setNmd_agn_yn(nmd_agn_yn);//20121207 추가
    	dm.setAdvt_bo_yn(advt_bo_yn);
    	dm.setBo_bof_yn(bo_bof_yn);
    	dm.setDel_yn(del_yn);
    	dm.setElec_tax_comp_cd(elec_tax_comp_cd);
    	dm.setEmail_id(email_id);
    	
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setJob_clsf(job_clsf);
    	dm.setAdvcs_feat(advcs_feat);
    	dm.setChrg_pers(chrg_pers);
    	dm.setTel_no(tel_no);  

    	dm.setMode2(mode2.toUpperCase());
    	dm.setSeq2(seq2);
    	dm.setInsrt_dt(insrt_dt);
    	dm.setDlco_info(dlco_info);
    	//dm.setChrg_pers2(chrg_pers2);    	
    	dm.setChrg_pers2(incmg_pers);
    	
    	dm.setIncmg_pers_ip(req.getRemoteAddr());
    	dm.setIncmg_pers(incmg_pers);
    	dm.setPreng_yn(preng_yn);
    	
    	dm.print();
    	
        try {
        	AdBas1000DAO dao = new AdBas1000DAO();
            ds = dao.ad_bas_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }  	
//        AdBas1000EJBHome home = (AdBas1000EJBHome) JNDIManager.getInstance().getHome("AdBas1000EJB");
//        try { 
//        	AdBas1000EJB ejb = home.create();
//            ds = ejb.ad_bas_1030_a(dm);
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
    
    
    public void ad_bas_1050_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	AD_BAS_1050_MDataSet ds = null;

        // DM Setting
    	AD_BAS_1050_MDM dm = new AD_BAS_1050_MDM();
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        try {
        	AdBas1000DAO dao = new AdBas1000DAO();
            ds = dao.ad_bas_1050_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }

	public void ad_bas_1051_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException
	{	
		AD_BAS_1051_LDataSet ds = null;
	
		String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
		String frdt			= Util.checkString(req.getParameter("frdt"));
		String todt			= Util.checkString(req.getParameter("todt"));
		String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
		String dlco_nm 		= Util.checkString(req.getParameter("dlco_nm"));
		String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
		String indt_clsf	= Util.checkString(req.getParameter("indt_clsf"));
		String type_clsf	= Util.checkString(req.getParameter("type_clsf"));
		String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
		String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
	
	    // DM Setting
		AD_BAS_1051_LDM dm = new AD_BAS_1051_LDM();
	
		dm.setCmpy_cd(cmpy_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setDlco_nm(dlco_nm);
		dm.setGrp_cmpy(grp_cmpy);
		dm.setIndt_clsf(indt_clsf);
		dm.setType_clsf(type_clsf);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setMchrg_pers(mchrg_pers);
	
	    try
	    {
	    	AdBas1000DAO	dao = new AdBas1000DAO();
	        ds = dao.ad_bas_1051_l(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e)
	    {
	        throw e;
	    }
	}
	
	public void ad_bas_1055_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1055_ADataSet ds = null;
    	
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag 			= Util.checkString(req.getParameter("flag"));
    	String grp_cmpy_yn		= Util.checkString(req.getParameter("grp_cmpy_yn"));
    	String grp_cmpy			= Util.checkString(req.getParameter("grp_cmpy_upd"));
    	String indt_clsf_yn		= Util.checkString(req.getParameter("indt_yn"));
    	String indt_clsf		= Util.checkString(req.getParameter("indt_upd"));
    	String type_clsf_yn		= Util.checkString(req.getParameter("type_yn"));
    	String type_clsf		= Util.checkString(req.getParameter("type_upd"));
    	String slcrg_pers_yn	= Util.checkString(req.getParameter("slcrg_yn"));
    	String slcrg_pers 		= Util.checkString(req.getParameter("slcrg_upd"));
    	String mchrg_pers_yn	= Util.checkString(req.getParameter("mchrg_yn"));
    	String mchrg_pers 		= Util.checkString(req.getParameter("mchrg_upd"));
    	
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash 			= getHashMultiUpdateData(multiUpdateData);
        String dlco_no 			= Util.checkString((String)hash.get("dlco_no"));
        
        String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	
        // DM Setting
    	AD_BAS_1055_ADM dm = new AD_BAS_1055_ADM();
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setGrp_cmpy_yn(grp_cmpy_yn);
    	dm.setGrp_cmpy(grp_cmpy);
    	dm.setIndt_clsf_yn(indt_clsf_yn);
    	dm.setIndt_clsf(indt_clsf);
    	dm.setType_clsf_yn(type_clsf_yn);
    	dm.setType_clsf(type_clsf);
    	dm.setSlcrg_pers_yn(slcrg_pers_yn);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers_yn(mchrg_pers_yn);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	
    	dm.print();
    	
        try {
        	AdBas1000DAO dao = new AdBas1000DAO();
            ds = dao.ad_bas_1055_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }

}
