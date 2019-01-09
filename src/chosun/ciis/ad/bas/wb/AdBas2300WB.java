/***************************************************************************************************
* 파일명 : .java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
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
import chosun.ciis.ad.bas.dao.AdBas2300DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2300_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2310_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2320_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2300_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2310_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2320_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas2300WB extends BaseWB {


    /**
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2300_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	AD_BAS_2300_MDM dm = new AD_BAS_2300_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	

        try {
        	AdBas2300DAO dao = new AdBas2300DAO();
            ds = dao.ad_bas_2300_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas2300EJBHome home = (AdBas2300EJBHome) JNDIManager.getInstance().getHome("AdBas2300EJB");
//        try {
//        	AdBas2300EJB ejb = home.create();
//            ds = ejb.ad_bas_2300_m(dm);
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
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
    	
    	AD_BAS_2310_LDM dm = new AD_BAS_2310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setAdvt_cont(advt_cont);
    	dm.setPubc_clsf(pubc_clsf);
    	

        try {
        	AdBas2300DAO dao = new AdBas2300DAO();
            ds = dao.ad_bas_2310_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas2300EJBHome home = (AdBas2300EJBHome) JNDIManager.getInstance().getHome("AdBas2300EJB");
//        try {
//        	AdBas2300EJB ejb = home.create();
//            ds = ejb.ad_bas_2310_l(dm);
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
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2320_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode 		= Util.checkString((String)hash.get("m"));
    	String pubc_dt 		= Util.checkString((String)hash.get("pubc_dt"));
    	String pubc_seq 	= Util.checkString((String)hash.get("pubc_seq"));
    	String pubc_side	= Util.checkString((String)hash.get("pubc_side"));
    	String sect 		= Util.checkString((String)hash.get("sect"));
    	String advt_cont 	= Util.checkString((String)hash.get("advt_cont"));
    	String advt_size 	= Util.checkString((String)hash.get("advt_size"));
    	String pubc_clsf 	= Util.checkString((String)hash.get("pubc_clsf"));
    	String chrg_pers 	= Util.checkString((String)hash.get("chrg_pers"));
    	String remk 		= Util.checkString((String)hash.get("remk"));
    	
    	AD_BAS_2320_ADM dm = new AD_BAS_2320_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setMode(mode.toUpperCase());
    	dm.setPubc_dt(StringUtil.strip(pubc_dt, "-"));
    	dm.setPubc_seq(pubc_seq);
    	dm.setPubc_side(pubc_side);
    	dm.setSect(sect);
    	dm.setAdvt_cont(advt_cont);
    	dm.setAdvt_size(advt_size);
    	dm.setPubc_clsf(pubc_clsf);
    	dm.setChrg_pers(chrg_pers);
    	dm.setRemk(remk);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
//    	//dm.print();

        try {
        	AdBas2300DAO dao = new AdBas2300DAO();
            ds = dao.ad_bas_2320_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas2300EJBHome home = (AdBas2300EJBHome) JNDIManager.getInstance().getHome("AdBas2300EJB");
//        try {
//        	AdBas2300EJB ejb = home.create();
//            ds = ejb.ad_bas_2320_a(dm);
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
