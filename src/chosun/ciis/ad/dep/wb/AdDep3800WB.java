/***************************************************************************************************
* 파일명 : AdDep3800WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep3800DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3800_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3810_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3820_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3800_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3810_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3820_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3800WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3800_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3800_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_3800_MDM dm = new AD_DEP_3800_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);

        try {
        	AdDep3800DAO	dao = new AdDep3800DAO();
            ds = dao.ad_dep_3800_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3800EJBHome home = (AdDep3800EJBHome) JNDIManager.getInstance().getHome("AdDep3800EJB");
//        try {
//        	AdDep3800EJB ejb = home.create();
//            ds = ejb.ad_dep_3800_m(dm);
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
    public void ad_dep_3810_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3810_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));

    	AD_DEP_3810_LDM dm = new AD_DEP_3810_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
       
    	//dm.print();

        try {
        	AdDep3800DAO	dao = new AdDep3800DAO();
            ds = dao.ad_dep_3810_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3800EJBHome home = (AdDep3800EJBHome) JNDIManager.getInstance().getHome("AdDep3800EJB");
//        try {
//        	AdDep3800EJB ejb = home.create();
//            ds = ejb.ad_dep_3810_l(dm);
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
    public void ad_dep_3820_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3820_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData		= Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String bddb_proc_clsf = Util.checkString((String)hash.get("bddb_proc_clsf"));
    	String pubc_slip_no   = Util.checkString((String)hash.get("pubc_slip_no"));
    	String unrcp_vat      = Util.checkString((String)hash.get("unrcp_vat"));

    	AD_DEP_3820_ADM dm = new AD_DEP_3820_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setBddb_proc_clsf(bddb_proc_clsf);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setUnrcp_vat(unrcp_vat);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
    	//dm.print();

        try {
        	AdDep3800DAO	dao = new AdDep3800DAO();
            ds = dao.ad_dep_3820_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3800EJBHome home = (AdDep3800EJBHome) JNDIManager.getInstance().getHome("AdDep3800EJB");
//        try {
//        	AdDep3800EJB ejb = home.create();
//            ds = ejb.ad_dep_3820_a(dm);
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
