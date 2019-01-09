/***************************************************************************************************
* 파일명 : .java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
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
import chosun.ciis.ad.bas.dao.AdBas1600DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1610_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1611_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1612_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1613_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1615_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1616_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1617_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1618_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1610_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1611_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1612_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1613_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1615_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1616_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1617_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1618_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1600WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1610_LDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String srch_yymm  = Util.checkString(req.getParameter("srch_yymm"));
    	String dlco_clsf  = Util.checkString(req.getParameter("dlco_clsf"));
    	
    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}
    	
        // DM Setting
    	AD_BAS_1610_LDM dm = new AD_BAS_1610_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setSrch_yymm(srch_yymm);
    	dm.setDlco_clsf(dlco_clsf);
        
    	dm.print(); 
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1610_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 	
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1610_l(dm);
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
    public void ad_bas_1611_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1611_LDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String srch_yymm  = Util.checkString(req.getParameter("srch_yymm"));
    	String dlco_clsf  = Util.checkString(req.getParameter("dlco_clsf"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}
    	
        // DM Setting
    	AD_BAS_1611_LDM dm = new AD_BAS_1611_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setSrch_yymm(srch_yymm);
    	dm.setDlco_clsf(dlco_clsf);
        
//    	//dm.print(); 
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1611_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }    	
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1611_l(dm);
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
    public void ad_bas_1612_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1612_LDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String srch_yymm = Util.checkString(req.getParameter("srch_yymm"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}

        // DM Setting
    	AD_BAS_1612_LDM dm = new AD_BAS_1612_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setSrch_yymm(srch_yymm);
    	dm.setBasi_dt(basi_dt);
        
    	dm.print(); 
    	
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1612_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  	
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1612_l(dm);
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
    public void ad_bas_1613_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1613_ADataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String incmg_pers  = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip  = req.getRemoteAddr();
    	String basi_dt 		= Util.checkString(req.getParameter("basi_dt"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String checked 		= Util.checkString((String)hash.get("checked"));
    	String dlco_no 		= Util.checkString((String)hash.get("dlco_no"));
    	String pre_basi_dt 	= Util.checkString((String)hash.get("pre_basi_dt"));
    	
        // DM Setting
    	AD_BAS_1613_ADM dm = new AD_BAS_1613_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setBasi_dt(basi_dt);
    	dm.setChecked(checked);
    	dm.setDlco_no(dlco_no);
    	dm.setPre_basi_dt(pre_basi_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
        
    	dm.print(); 
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1613_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
        
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1613_a(dm);
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
    public void ad_bas_1615_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1615_SDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String dlco_no    = Util.checkString(req.getParameter("dlco_no"));
    	String make_dt    = Util.checkString(req.getParameter("make_dt"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


        // DM Setting
    	AD_BAS_1615_SDM dm = new AD_BAS_1615_SDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setMake_dt(make_dt);
        
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1615_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }   	
    	//dm.print(); 
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1615_s(dm);
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
    public void ad_bas_1616_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1616_SDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


        // DM Setting
    	AD_BAS_1616_SDM dm = new AD_BAS_1616_SDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setBasi_dt(basi_dt);
        
    	dm.print();
    	
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1616_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }     	
//    	//dm.print(); 
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1616_s(dm);
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
    public void ad_bas_1617_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1617_LDataSet ds = null;
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String srch_yymm 	= Util.checkString(req.getParameter("srch_yymm"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


        // DM Setting
    	AD_BAS_1617_LDM dm = new AD_BAS_1617_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setSrch_yymm(srch_yymm);
    	dm.setDlco_no(dlco_no);
        
    	dm.print();
    	
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1617_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }       	
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1617_l(dm);
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
    public void ad_bas_1618_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1618_LDataSet ds = null;
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String srch_yymm 	= Util.checkString(req.getParameter("srch_yymm"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


        // DM Setting
    	AD_BAS_1618_LDM dm = new AD_BAS_1618_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setSrch_yymm(srch_yymm);
    	dm.setDlco_no(dlco_no);
        
    	dm.print();
    	
        try {
        	AdBas1600DAO dao = new AdBas1600DAO();
            ds = dao.ad_bas_1618_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }       	
//    	AdBas1600EJBHome home = (AdBas1600EJBHome) JNDIManager.getInstance().getHome("AdBas1600EJB");
//        try {
//        	AdBas1600EJB ejb = home.create();
//            ds = ejb.ad_bas_1618_l(dm);
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
