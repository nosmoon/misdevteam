/***************************************************************************************************
* 파일명   : AdBas3500WB.java
* 기능     : Servlet에서 받은 parameter를 이용하여 dm을 set하고
*            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas3500DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3500_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3510_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3520_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3500_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3510_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3520_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;


public class AdBas3500WB extends BaseWB {


	public void ad_bas_3500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3500_MDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
    	AD_BAS_3500_MDM dm = new AD_BAS_3500_MDM();
    	
        dm.setCmpy_cd(cmpy_cd);
        

        try {
        	AdBas3500DAO dao = new AdBas3500DAO();
            ds = dao.ad_bas_3500_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3500EJBHome home = (AdBas3500EJBHome) JNDIManager.getInstance().getHome("AdBas3500EJB");
//        try {        
//       		AdBas3500EJB ejb = home.create();
//            ds = ejb.ad_bas_3500_m(dm);        
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
	public void ad_bas_3510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3510_LDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String advcs = Util.checkString(req.getParameter("advcs"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String indt_nm = Util.checkString(req.getParameter("indt_nm"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));

        // DM Setting
    	AD_BAS_3510_LDM dm = new AD_BAS_3510_LDM();
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setOth_clsf(oth_clsf);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setAdvcs(advcs);
        dm.setAdvt_cont(advt_cont);
        dm.setIndt_nm(indt_nm);
        dm.setSlcrg_pers(slcrg_pers);
        
//        //dm.print();
        

        try {
        	AdBas3500DAO dao = new AdBas3500DAO();
            ds = dao.ad_bas_3510_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3500EJBHome home = (AdBas3500EJBHome) JNDIManager.getInstance().getHome("AdBas3500EJB");
//        try {        
//       		AdBas3500EJB ejb = home.create();
//            ds = ejb.ad_bas_3510_l(dm);        
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

	public void ad_bas_3520_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3520_ADataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));
    	String oth_clsf = Util.checkString((String)hash.get("oth_clsf"));
    	String pubc_dt = Util.checkString((String)hash.get("pubc_dt"));
    	String pubc_seq = Util.checkString((String)hash.get("pubc_seq"));
    	String pubc_side = Util.checkString((String)hash.get("pubc_side"));
    	String issu_ser_no = Util.checkString((String)hash.get("issu_ser_no"));
    	String std = Util.checkString((String)hash.get("std"));
    	String advcs = Util.checkString((String)hash.get("advcs"));
    	String advt_cont = Util.checkString((String)hash.get("advt_cont"));
    	String indt_clsf = Util.checkString((String)hash.get("indt_clsf"));
    	String slcrg_pers = Util.checkString((String)hash.get("slcrg_pers"));
    	String pubc_amt = Util.checkString((String)hash.get("pubc_amt"));

        // DM Setting
    	AD_BAS_3520_ADM dm = new AD_BAS_3520_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMode(mode.toUpperCase());
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(StringUtil.strip(pubc_dt,"-"));
    	dm.setPubc_seq(pubc_seq);
    	dm.setPubc_side(pubc_side);
    	dm.setIssu_ser_no(issu_ser_no);
    	dm.setStd(std);
    	dm.setAdvcs(advcs);
    	dm.setAdvt_cont(advt_cont);
    	dm.setIndt_clsf(indt_clsf);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setPubc_amt(pubc_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
        
//        //dm.print();

        try {
        	AdBas3500DAO dao = new AdBas3500DAO();
            ds = dao.ad_bas_3520_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3500EJBHome home = (AdBas3500EJBHome) JNDIManager.getInstance().getHome("AdBas3500EJB");
//        try {        
//       		AdBas3500EJB ejb = home.create();
//            ds = ejb.ad_bas_3520_a(dm);        
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
