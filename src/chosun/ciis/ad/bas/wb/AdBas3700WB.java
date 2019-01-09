package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas3700DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3700_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3701_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3710_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3711_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3712_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3720_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3721_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3750_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3751_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3752_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3760_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3761_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_3700_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3701_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3710_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3711_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3712_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3720_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3721_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3750_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3751_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3752_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3760_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3761_LDataSet; 
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

public class AdBas3700WB extends BaseWB {
 
	public void ad_bas_3700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3700_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_BAS_3700_MDM dm = new AD_BAS_3700_MDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setEmp_no(emp_no);
    	dm.print();
    	
        try
        {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3700_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
    }	
	public void ad_bas_3701_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3701_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_BAS_3701_MDM dm = new AD_BAS_3701_MDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setEmp_no(emp_no);
    	dm.print();
    	
        try
        {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3701_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
    }	
	public void ad_bas_3710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3710_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf 	= Util.checkString(req.getParameter("oth_clsf"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));    	
    	String pubc_asse_cd = Util.checkString(req.getParameter("pubc_asse_cd"));
    	String chk_asse 	= Util.checkString(req.getParameter("chk_asse"));
    	String advt_cont 	= Util.checkString(req.getParameter("advt_cont"));
    	String sect_nm_cd	= Util.checkString(req.getParameter("sect_nm_cd"));
    	String sect_nm_detail	= Util.checkString(req.getParameter("sect_nm_detail"));
    	String remk			= Util.checkString(req.getParameter("remk"));
    	System.out.print("WB start!!");
    	AD_BAS_3710_LDM dm = new AD_BAS_3710_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setPubc_asse_cd(pubc_asse_cd);
    	dm.setChk_asse(chk_asse);
    	dm.setAdvt_cont(advt_cont);
    	dm.setSect_nm_cd(sect_nm_cd);
    	dm.setSect_nm_detail(sect_nm_detail);
    	dm.setRemk(remk);

        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3710_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
    }

	public void ad_bas_3711_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3711_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf 	= Util.checkString(req.getParameter("oth_clsf"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));    	
    	String pubc_asse_cd = Util.checkString(req.getParameter("pubc_asse_cd"));
    	String chk_asse 	= Util.checkString(req.getParameter("chk_asse"));
    	String advt_cont 	= Util.checkString(req.getParameter("advt_cont"));
    	String sect_nm_cd	= Util.checkString(req.getParameter("sect_nm_cd"));
    	String sect_nm_detail	= Util.checkString(req.getParameter("sect_nm_detail"));
    	String remk			= Util.checkString(req.getParameter("remk"));
    	//System.out.print("WB start!!");
    	AD_BAS_3711_LDM dm = new AD_BAS_3711_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setPubc_asse_cd(pubc_asse_cd);
    	dm.setChk_asse(chk_asse);
    	dm.setAdvt_cont(advt_cont);
    	dm.setSect_nm_cd(sect_nm_cd);
    	dm.setSect_nm_detail(sect_nm_detail);
    	dm.setRemk(remk);
    	dm.print();
        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3711_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
    }

	
	public void ad_bas_3712_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3712_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String pubc_dt 		= Util.checkString(req.getParameter("pubc_dt"));    	
    	String advt_cont    = Util.checkString(req.getParameter("advt_cont"));
    	//System.out.print("WB start!!");
    	AD_BAS_3712_LDM dm = new AD_BAS_3712_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPubc_dt(pubc_dt);
    	dm.setAdvt_cont(advt_cont);
    	dm.print();

        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3712_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
    }
	
	public void ad_bas_3720_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3720_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf 	= Util.checkString(req.getParameter("oth_clsf"));
    	String issu_yymm	= Util.checkString(req.getParameter("issu_yymm"));
    	
    	AD_BAS_3720_LDM dm = new AD_BAS_3720_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setIssu_yymm(issu_yymm);    	
    	dm.print();
        try 
        {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3720_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
    }

	public void ad_bas_3721_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
	
		AD_BAS_3721_SDataSet ds = null;
	
	    // DM Setting
		String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
		String oth_clsf 	= Util.checkString(req.getParameter("oth_clsf"));
		String pubc_dt		= Util.checkString(req.getParameter("pubc_dt"));
		
		AD_BAS_3721_SDM dm = new AD_BAS_3721_SDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setOth_clsf(oth_clsf);
		dm.setPubc_dt(pubc_dt);
	
	    try {
	    	AdBas3700DAO dao = new AdBas3700DAO();
	        ds = dao.ad_bas_3721_s(dm);
	        req.setAttribute("ds", ds);
	    }  
	    catch (AppException e) {
	        throw e;
	    } 
	}


	public void ad_bas_3750_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3750_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf		= Util.checkString(req.getParameter("oth_clsf"));
    	
    	String incmg_pers_ip= req.getRemoteAddr();
    	String incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String flag 		= Util.checkString((String)hash.get("m"));
    	
    	String medi_cd		= Util.checkString((String)hash.get("medi_cd"));
    	String pubc_dt_key 	= StringUtil.strip(Util.checkString((String)hash.get("pubc_dt_key")), "-") ;    	
    	String pubc_seq 	= Util.checkString((String)hash.get("pubc_seq"));
    	
    	String pubc_dt 		= StringUtil.strip(Util.checkString((String)hash.get("pubc_dt")), "-") ;    	
    	String sect 		= Util.checkString((String)hash.get("sect"));
    	String sect_nm_cd 	= Util.checkString((String)hash.get("sect_nm_cd"));
    	String advt_cont 	= Util.checkString((String)hash.get("advt_cont"));
    	String dn 			= Util.checkString((String)hash.get("dn"));
    	String cm 			= Util.checkString((String)hash.get("cm"));
    	String pubc_asse_cd	= Util.checkString((String)hash.get("pubc_asse_cd"));
    	
    	String remk 		= Util.checkString((String)hash.get("remk"));
    	String slcrg_nm  	= Util.checkString((String)hash.get("slcrg_nm"));
    	String indt_clsf	= Util.checkString((String)hash.get("indt_clsf"));
    	
    	AD_BAS_3750_ADM dm = new AD_BAS_3750_ADM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setOth_clsf(oth_clsf);
    	
    	dm.setFlag(flag.toUpperCase());
    	
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_dt_key(pubc_dt_key);
    	dm.setPubc_seq(pubc_seq);
    	
    	dm.setPubc_dt(pubc_dt);
    	dm.setSect(sect);
    	dm.setSect_nm_cd(sect_nm_cd);
    	dm.setAdvt_cont(advt_cont);
    	dm.setDn(dn);
    	dm.setCm(cm);
    	dm.setPubc_asse_cd(pubc_asse_cd);
    	dm.setRemk(remk);
    	dm.setSlcrg_pers(slcrg_nm);
    	dm.setIndt_clsf(indt_clsf);
    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();
        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3750_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
    }
	
	public void ad_bas_3751_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3751_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf			= Util.checkString(req.getParameter("oth_clsf"));
    	String pubc_dt			= Util.checkString(req.getParameter("pubc_dt"));
    	String asum_pubc_amt	= Util.checkString(req.getParameter("asum_pubc_amt"));
    	String advt_ocpy_rate	= Util.checkString(req.getParameter("advt_ocpy_rate"));
    	
    	String incmg_pers_ip= req.getRemoteAddr();
    	String incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode 			= Util.checkString((String)hash.get("m"));
    	
    	String seq				= Util.checkString((String)hash.get("seq"));
    	String sect_nm_cd 		= Util.checkString((String)hash.get("sect_nm_cd"));
    	String sect_nm_detail 	= Util.checkString((String)hash.get("sect_nm_detail"));
    	String sect_cd 			= Util.checkString((String)hash.get("sect_cd"));
    	String tot_pcnt			= Util.checkString((String)hash.get("tot_pcnt"));
    	String tot_dn 			= Util.checkString((String)hash.get("tot_dn"));
    	String tot_clr_dn 		= Util.checkString((String)hash.get("tot_clr_dn"));
    	String tot_pubc_amt		= Util.checkString((String)hash.get("tot_pubc_amt"));
    	
    	AD_BAS_3751_ADM dm = new AD_BAS_3751_ADM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	dm.setAsum_pubc_amt(asum_pubc_amt);
    	dm.setAdvt_ocpy_rate(advt_ocpy_rate);
    	
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setSect_nm_cd(sect_nm_cd);
    	dm.setSect_nm_detail(sect_nm_detail);
    	dm.setSect_cd(sect_cd);
    	dm.setTot_pcnt(tot_pcnt);
    	dm.setTot_dn(tot_dn);
    	dm.setTot_clr_dn(tot_clr_dn);
    	dm.setTot_pubc_amt(tot_pubc_amt);
    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();
        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3751_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
    }
	
	public void ad_bas_3752_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3752_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt			= Util.checkString(req.getParameter("frdt"));
    	String todt			= Util.checkString(req.getParameter("todt"));
    	
    	AD_BAS_3752_ADM dm = new AD_BAS_3752_ADM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	dm.print();
        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3752_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
    }	
	
	public void ad_bas_3760_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3760_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	String incmg_pers_ip= req.getRemoteAddr();
    	String incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String flag 		= Util.checkString((String)hash.get("m"));
    	
    	String medi_cd		= Util.checkString((String)hash.get("medi_cd"));
    	String pubc_dt_key 	= StringUtil.strip(Util.checkString((String)hash.get("pubc_dt_key")), "-") ;    	
    	String pubc_seq 	= Util.checkString((String)hash.get("pubc_seq"));
    	
    	String pubc_dt 		= StringUtil.strip(Util.checkString((String)hash.get("pubc_dt")), "-") ;    	
    	String sect 		= Util.checkString((String)hash.get("sect"));
    	String hndl_nm_cd 	= Util.checkString((String)hash.get("hndl_nm_cd"));
    	String advt_cont 	= Util.checkString((String)hash.get("advt_cont"));
    	String dn 			= Util.checkString((String)hash.get("dn"));
    	String cm 			= Util.checkString((String)hash.get("cm"));
    	String hndl_evlt	= Util.checkString((String)hash.get("hndl_evlt"));
    	
    	
    	String points 		= Util.checkString((String)hash.get("points"));
    	String other 		= Util.checkString((String)hash.get("other"));
    	String remk 		= Util.checkString((String)hash.get("remk"));
    	String slcrg_nm  	= Util.checkString((String)hash.get("slcrg_nm"));
    	String slcrg_remk   = Util.checkString((String)hash.get("slcrg_remk"));
    	
    	AD_BAS_3760_ADM dm = new AD_BAS_3760_ADM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setFlag(flag.toUpperCase());
    	
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_dt_key(pubc_dt_key);
    	dm.setPubc_seq(pubc_seq);
    	
    	dm.setPubc_dt(pubc_dt);
    	dm.setSect(sect);
    	dm.setHndl_nm_cd(hndl_nm_cd);
    	dm.setAdvt_cont(advt_cont);
    	dm.setDn(dn);
    	dm.setCm(cm);
    	dm.setHndl_evlt(hndl_evlt);
    	dm.setPoints(points);
    	dm.setOther(other);
    	dm.setRemk(remk);
    	dm.setSlcrg_pers(slcrg_nm);
    	dm.setSlcrg_remk(slcrg_remk);
    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();
        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3760_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
    }	
	public void ad_bas_3761_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3761_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));    	
    	String pubc_asse_cd = Util.checkString(req.getParameter("hndl_evlt_cd"));
    	String chk_asse 	= Util.checkString(req.getParameter("chk_asse"));
    	String advt_cont 	= Util.checkString(req.getParameter("advt_cont"));
    	String sect_nm_cd	= Util.checkString(req.getParameter("hndl_nm_cd"));
    	String sect_nm_detail	= Util.checkString(req.getParameter("slcrg_remk"));
    	String remk			= Util.checkString(req.getParameter("remk"));
    	String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
    	//System.out.print("WB start!!");
    	AD_BAS_3761_LDM dm = new AD_BAS_3761_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setPubc_asse_cd(pubc_asse_cd);
    	dm.setChk_asse(chk_asse);
    	dm.setAdvt_cont(advt_cont);
    	dm.setSect_nm_cd(sect_nm_cd);
    	dm.setSect_nm_detail(sect_nm_detail);
    	dm.setRemk(remk);
    	dm.setSlcrg_pers(slcrg_pers);

        try {
        	AdBas3700DAO dao = new AdBas3700DAO();
            ds = dao.ad_bas_3761_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
    }

		
}


