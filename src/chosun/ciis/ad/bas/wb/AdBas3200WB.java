package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas3200DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3200_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3210_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3211_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3212_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3213_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3221_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3222_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3223_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3224_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3200_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3210_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3211_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3212_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3213_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3221_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3222_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3223_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3224_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 */
public class AdBas3200WB extends BaseWB {

	public void ad_bas_3200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3200_MDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	AD_BAS_3200_MDM dm = new AD_BAS_3200_MDM();
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3200_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3200_m(dm);
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


	public void ad_bas_3211_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3211_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	
    	AD_BAS_3211_LDM dm = new AD_BAS_3211_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	
//    	//dm.print();
        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3211_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//    	
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3211_l(dm);
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
	


	public void ad_bas_3210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3210_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	
    	AD_BAS_3210_LDM dm = new AD_BAS_3210_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	
//    	//dm.print();
        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3210_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//    	
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3210_l(dm);
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
	


	public void ad_bas_3212_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3212_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	
    	AD_BAS_3212_LDM dm = new AD_BAS_3212_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	
//    	//dm.print();
        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3212_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//    	
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3212_l(dm);
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

	public void ad_bas_3213_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3213_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	
    	AD_BAS_3213_LDM dm = new AD_BAS_3213_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	
//    	//dm.print();
        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3213_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//    	
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3213_l(dm);
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


	public void ad_bas_3221_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3221_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String oth_clsf		= 	"01";//Util.checkString(req.getParameter("oth_clsf"));    	
    	String pubc_dt 		=	Util.checkString(req.getParameter("pubc_dt"));    	    	
    	String diff_amt 	= 	Util.checkString(req.getParameter("diff_amt"));
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	
    	String mode 			= Util.checkString((String)hash.get("m"));
    	String seq 				= Util.checkString((String)hash.get("seq"));
    	String tot_pcnt 		= Util.checkString((String)hash.get("tot_pcnt"));
    	String tot_cell 		= Util.checkString((String)hash.get("tot_cell"));
    	String clr_cell 		= Util.checkString((String)hash.get("clr_cell"));
    	String asum_pubc_amt 	= Util.checkString((String)hash.get("asum_pubc_amt"));
    	String c0101_pcnt 		= Util.checkString((String)hash.get("c0101_pcnt"));
    	String c0102_pcnt 		= Util.checkString((String)hash.get("c0102_pcnt"));
    	String c0103_pcnt 		= Util.checkString((String)hash.get("c0103_pcnt"));
    	String c0104_pcnt 		= Util.checkString((String)hash.get("c0104_pcnt"));  
    	String c0105_pcnt 		= Util.checkString((String)hash.get("c0105_pcnt"));
    	String c0106_pcnt 		= Util.checkString((String)hash.get("c0106_pcnt"));
    	String c0107_pcnt 		= Util.checkString((String)hash.get("c0107_pcnt"));
    	String c0108_sect_nm 	= Util.checkString((String)hash.get("c0108_sect_nm"));
    	String c0108_pcnt 		= Util.checkString((String)hash.get("c0108_pcnt"));
    	String c0109_sect_nm 	= Util.checkString((String)hash.get("c0109_sect_nm"));
    	String c0109_pcnt 		= Util.checkString((String)hash.get("c0109_pcnt"));
    	String c0110_sect_nm 	= Util.checkString((String)hash.get("c0110_sect_nm"));
    	String c0110_out_clsf 	= Util.checkString((String)hash.get("c0110_out_clsf"));
    	String c0111_sect_nm 	= Util.checkString((String)hash.get("c0111_sect_nm"));
    	String c0111_out_clsf 	= Util.checkString((String)hash.get("c0111_out_clsf"));
    	String c0112_sect_nm 	= Util.checkString((String)hash.get("c0112_sect_nm"));
    	String c0112_out_clsf 	= Util.checkString((String)hash.get("c0112_out_clsf"));
    	String advt_ocpy_rate 	= Util.checkString((String)hash.get("advt_ocpy_rate"));
    	
    	AD_BAS_3221_ADM dm = new AD_BAS_3221_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setTot_pcnt(tot_pcnt);
    	dm.setTot_cell(tot_cell);
    	dm.setClr_cell(clr_cell);
    	dm.setAsum_pubc_amt(asum_pubc_amt);
    	dm.setC0101_pcnt(c0101_pcnt);
    	dm.setC0102_pcnt(c0102_pcnt);
    	dm.setC0103_pcnt(c0103_pcnt);
    	dm.setC0104_pcnt(c0104_pcnt);
    	dm.setC0105_pcnt(c0105_pcnt);
    	dm.setC0106_pcnt(c0106_pcnt);
    	dm.setC0107_pcnt(c0107_pcnt);
    	dm.setC0108_sect_nm(c0108_sect_nm);
    	dm.setC0108_pcnt(c0108_pcnt);
    	dm.setC0109_sect_nm(c0109_sect_nm);
    	dm.setC0109_pcnt(c0109_pcnt);
    	dm.setC0110_sect_nm(c0110_sect_nm);
    	dm.setC0110_out_clsf(c0110_out_clsf);
    	dm.setC0111_sect_nm(c0111_sect_nm);
    	dm.setC0111_out_clsf(c0111_out_clsf);
    	dm.setC0112_sect_nm(c0112_sect_nm);
    	dm.setC0112_out_clsf(c0112_out_clsf);
    	dm.setAdvt_ocpy_rate(advt_ocpy_rate);
    	dm.setDiff_amt(diff_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();
        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3221_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//    	
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3221_a(dm);
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

	public void ad_bas_3222_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3222_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String oth_clsf 	   = "02";//Util.checkString(req.getParameter("oth_clsf"));    	
    	String pubc_dt 			= Util.checkString(req.getParameter("pubc_dt"));     	
    	String diff_amt 		= Util.checkString(req.getParameter("diff_amt"));    	
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	
    	String mode = Util.checkString((String)hash.get("m"));
    	String seq = Util.checkString((String)hash.get("seq"));
    	String tot_pcnt = Util.checkString((String)hash.get("tot_pcnt"));
    	String tot_clas = Util.checkString((String)hash.get("tot_clas"));
    	String clr_clas = Util.checkString((String)hash.get("clr_clas"));
    	String asum_pubc_amt = Util.checkString((String)hash.get("asum_pubc_amt"));
    	String c0201_pcnt = Util.checkString((String)hash.get("c0201_pcnt"));
    	String c0202_pcnt = Util.checkString((String)hash.get("c0202_pcnt"));
    	String c0203_pcnt = Util.checkString((String)hash.get("c0203_pcnt"));
    	String c0204_pcnt = Util.checkString((String)hash.get("c0204_pcnt"));
    	String c0205_pcnt = Util.checkString((String)hash.get("c0205_pcnt"));
    	String c0206_pcnt = Util.checkString((String)hash.get("c0206_pcnt"));
    	String c0207_sect_nm = Util.checkString((String)hash.get("c0207_sect_nm"));
    	String c0207_pcnt = Util.checkString((String)hash.get("c0207_pcnt"));
    	String c0208_sect_nm = Util.checkString((String)hash.get("c0208_sect_nm"));
    	String c0208_pcnt = Util.checkString((String)hash.get("c0208_pcnt"));
    	String c0209_sect_nm = Util.checkString((String)hash.get("c0209_sect_nm"));
    	String c0209_out_clsf = Util.checkString((String)hash.get("c0209_out_clsf"));
    	String c0210_sect_nm = Util.checkString((String)hash.get("c0210_sect_nm"));
    	String c0210_out_clsf = Util.checkString((String)hash.get("c0210_out_clsf"));
    	String c0211_sect_nm = Util.checkString((String)hash.get("c0211_sect_nm"));
    	String c0211_out_clsf = Util.checkString((String)hash.get("c0211_out_clsf"));
    	String advt_ocpy_rate = Util.checkString((String)hash.get("advt_ocpy_rate"));
    	
    	AD_BAS_3222_ADM dm = new AD_BAS_3222_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setTot_pcnt(tot_pcnt);
    	dm.setTot_clas(tot_clas);
    	dm.setClr_clas(clr_clas);
    	dm.setAsum_pubc_amt(asum_pubc_amt);
    	dm.setC0201_pcnt(c0201_pcnt);
    	dm.setC0202_pcnt(c0202_pcnt);
    	dm.setC0203_pcnt(c0203_pcnt);
    	dm.setC0204_pcnt(c0204_pcnt);
    	dm.setC0205_pcnt(c0205_pcnt);
    	dm.setC0206_pcnt(c0206_pcnt);
    	dm.setC0207_sect_nm(c0207_sect_nm);
    	dm.setC0207_pcnt(c0207_pcnt);
    	dm.setC0208_sect_nm(c0208_sect_nm);
    	dm.setC0208_pcnt(c0208_pcnt);
    	dm.setC0209_sect_nm(c0209_sect_nm);
    	dm.setC0209_out_clsf(c0209_out_clsf);
    	dm.setC0210_sect_nm(c0210_sect_nm);
    	dm.setC0210_out_clsf(c0210_out_clsf);
    	dm.setC0211_sect_nm(c0211_sect_nm);
    	dm.setC0211_out_clsf(c0211_out_clsf);
    	dm.setAdvt_ocpy_rate(advt_ocpy_rate);
    	dm.setDiff_amt(diff_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
//    	//dm.print();

        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3222_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3222_a(dm);
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


	public void ad_bas_3223_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3223_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String oth_clsf 	   = "03";//Util.checkString(req.getParameter("oth_clsf"));    	
    	String pubc_dt 			=Util.checkString(req.getParameter("pubc_dt"));  	
    	String diff_amt 		= Util.checkString(req.getParameter("diff_amt"));     	
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData3"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));
    	String seq = Util.checkString((String)hash.get("seq"));

    	String tot_pcnt = Util.checkString((String)hash.get("tot_pcnt"));
    	String tot_cell = Util.checkString((String)hash.get("tot_cell"));
    	String clr_cell = Util.checkString((String)hash.get("clr_cell"));
    	String asum_pubc_amt = Util.checkString((String)hash.get("asum_pubc_amt"));
    	String c0301_pcnt = Util.checkString((String)hash.get("c0301_pcnt"));
    	String c0302_pcnt = Util.checkString((String)hash.get("c0302_pcnt"));
    	String c0303_sect_nm = Util.checkString((String)hash.get("c0303_sect_nm"));
    	String c0303_pcnt = Util.checkString((String)hash.get("c0303_pcnt"));
    	String c0304_sect_nm = Util.checkString((String)hash.get("c0304_sect_nm"));
    	String c0304_pcnt = Util.checkString((String)hash.get("c0304_pcnt"));
    	String advt_ocpy_rate = Util.checkString((String)hash.get("advt_ocpy_rate"));
    	
    	AD_BAS_3223_ADM dm = new AD_BAS_3223_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setTot_pcnt(tot_pcnt);
    	dm.setTot_cell(tot_cell);
    	dm.setClr_cell(clr_cell);
    	dm.setAsum_pubc_amt(asum_pubc_amt);
    	dm.setC0301_pcnt(c0301_pcnt);
    	dm.setC0302_pcnt(c0302_pcnt);
    	dm.setC0303_sect_nm(c0303_sect_nm);
    	dm.setC0303_pcnt(c0303_pcnt);
    	dm.setC0304_sect_nm(c0304_sect_nm);
    	dm.setC0304_pcnt(c0304_pcnt);
    	dm.setAdvt_ocpy_rate(advt_ocpy_rate);
    	dm.setDiff_amt(diff_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
//    	//dm.print();
        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3223_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//    	
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3223_a(dm);
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

	public void ad_bas_3224_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3224_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    		=	Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip 	= 	req.getRemoteAddr();
    	String incmg_pers 		= 	Util.getSessionParameterValue(req, "emp_no", true);

    	String oth_clsf			= 	"04";//Util.checkString(req.getParameter("oth_clsf"));    	
    	String pubc_dt			=	Util.checkString(req.getParameter("pubc_dt"));  	
    	
    	String multiUpdateData 	= 	Util.checkString(req.getParameter("multiUpdateData4"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));
    	String seq 	= Util.checkString((String)hash.get("seq"));

    	String tot_pcnt 		= Util.checkString((String)hash.get("tot_pcnt"));
    	String tot_clas 		= Util.checkString((String)hash.get("tot_clas"));
    	String asum_pubc_amt 	= Util.checkString((String)hash.get("asum_pubc_amt"));
    	
    	AD_BAS_3224_ADM dm = new AD_BAS_3224_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);  
    	dm.setTot_pcnt(tot_pcnt);
    	dm.setTot_clas(tot_clas);
    	dm.setAsum_pubc_amt(asum_pubc_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();
        try {
        	AdBas3200DAO dao = new AdBas3200DAO();
            ds = dao.ad_bas_3224_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//    	
//        AdBas3200EJBHome home = (AdBas3200EJBHome) JNDIManager.getInstance().getHome("AdBas3200EJB");
//        try {
//        	AdBas3200EJB ejb = home.create();
//            ds = ejb.ad_bas_3224_a(dm);
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

}
