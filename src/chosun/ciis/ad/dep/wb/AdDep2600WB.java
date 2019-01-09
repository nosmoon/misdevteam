/***************************************************************************************************
* 파일명 : AdDep2600WB.java
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

package chosun.ciis.ad.dep.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep2600DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2600_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2610_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2620_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2600_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2610_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2620_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2600WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2600_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2600_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_2600_MDM dm = new AD_DEP_2600_MDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();      

        try {
        	AdDep2600DAO	dao = new AdDep2600DAO();
            ds = dao.ad_dep_2600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2600EJBHome home = (AdDep2600EJBHome) JNDIManager.getInstance().getHome("AdDep2600EJB");
//        try {
//        	AdDep2600EJB ejb = home.create();
//            ds = ejb.ad_dep_2600_m(dm);
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
    public void ad_dep_2610_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2610_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String hndl_clsf      = Util.checkString(req.getParameter("hndl_clsf"));
    	String medi_cd        = Util.checkString(req.getParameter("medi_cd"));
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	String basic_dt       = Util.checkString(req.getParameter("basic_dt"));
    	String security_dt    = Util.checkString(req.getParameter("security_dt"));
    	String misu_clsf      = Util.checkString(req.getParameter("misu"));

    	AD_DEP_2610_LDM dm = new AD_DEP_2610_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBasic_dt(basic_dt);
    	dm.setSecurity_dt(security_dt);
    	dm.setMisu_clsf(misu_clsf);
       
        //dm.print(); 

        try {
        	AdDep2600DAO	dao = new AdDep2600DAO();
            ds = dao.ad_dep_2610_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2600EJBHome home = (AdDep2600EJBHome) JNDIManager.getInstance().getHome("AdDep2600EJB");
//        try {
//        	AdDep2600EJB ejb = home.create();
//            ds = ejb.ad_dep_2610_l(dm);
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
    public void ad_dep_2620_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2620_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	String medi_cd        = Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf      = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no        = Util.checkString(req.getParameter("dlco_no"));

    	AD_DEP_2620_LDM dm = new AD_DEP_2620_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
       
        //dm.print();    

        try {
        	AdDep2600DAO	dao = new AdDep2600DAO();
            ds = dao.ad_dep_2620_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2600EJBHome home = (AdDep2600EJBHome) JNDIManager.getInstance().getHome("AdDep2600EJB");
//        try {
//        	AdDep2600EJB ejb = home.create();
//            ds = ejb.ad_dep_2620_l(dm);
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
