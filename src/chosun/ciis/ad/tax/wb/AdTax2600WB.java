/***************************************************************************************************
* 파일명 : AdTax2600WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 강봉수
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.tax.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;

import chosun.ciis.ad.tax.dao.AdTax2600DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2600_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2601_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2610_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_2611_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_2600_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2601_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2610_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2611_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */
public class AdTax2600WB extends BaseWB 
{
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2600_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException 
    {	
    	AD_TAX_2600_MDataSet ds = null;
        // DM Setting
    	AD_TAX_2600_MDM dm = new AD_TAX_2600_MDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String clos_yymm   = Util.checkString(req.getParameter("dd_clos_yymm"));
    	String work_clsf   = Util.checkString(req.getParameter("medi_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setClos_yymm(clos_yymm.substring(0,6));
        dm.setWork_clsf(work_clsf);         
       
        dm.print();
        try
        {
        	AdTax2600DAO	dao = new AdTax2600DAO();
            ds = dao.ad_tax_2600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }  
//        
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1100_m(dm);
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

    public void ad_tax_2601_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException 
    {	
    	AD_TAX_2601_MDataSet ds = null;
        // DM Setting
    	AD_TAX_2601_MDM dm = new AD_TAX_2601_MDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
       
        //dm.print();
        try
        {
        	AdTax2600DAO	dao = new AdTax2600DAO();
            ds = dao.ad_tax_2601_m(dm); 
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }  
//        
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1100_m(dm);
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
    public void ad_tax_2610_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException
    {	
    	AD_TAX_2610_ADataSet ds = null;
        // DM Setting
    	AD_TAX_2610_ADM dm = new AD_TAX_2610_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd 	= Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try
        {
        	AdTax2600DAO	dao = new AdTax2600DAO();
            ds = dao.ad_tax_2610_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }  
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1110_a(dm);
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
    
	public void ad_tax_2611_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException
	{   	
    	AD_TAX_2611_ADataSet ds = null;
        // DM Setting
    	AD_TAX_2611_ADM dm = new AD_TAX_2611_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd 	= Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try
        {
        	AdTax2600DAO	dao = new AdTax2600DAO();
            ds = dao.ad_tax_2611_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }
	}
}
