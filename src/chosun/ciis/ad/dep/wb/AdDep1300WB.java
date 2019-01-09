/***************************************************************************************************
* 파일명 : AdDep1300WB.java
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

package chosun.ciis.ad.dep.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep1300DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1300_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1310_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1320_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1300_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1310_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1320_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1300_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1300_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd        = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_1300_MDM dm = new AD_DEP_1300_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();
        

        try {
        	AdDep1300DAO	dao = new AdDep1300DAO();
            ds = dao.ad_dep_1300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1300EJBHome home = (AdDep1300EJBHome) JNDIManager.getInstance().getHome("AdDep1300EJB");
//        try {
//        	AdDep1300EJB ejb = home.create();
//            ds = ejb.ad_dep_1300_m(dm);
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
    public void ad_dep_1310_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 	= Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String bddb_proc_clsf = Util.checkString(req.getParameter("bddb_proc_clsf"));

    	AD_DEP_1310_LDM dm = new AD_DEP_1310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	dm.setBasi_dt(basi_dt);
    	dm.setBddb_proc_clsf(bddb_proc_clsf);
       
        //dm.print();

        try {
        	AdDep1300DAO	dao = new AdDep1300DAO();
            ds = dao.ad_dep_1310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1300EJBHome home = (AdDep1300EJBHome) JNDIManager.getInstance().getHome("AdDep1300EJB");
//        try {
//        	AdDep1300EJB ejb = home.create();
//            ds = ejb.ad_dep_1310_l(dm);
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
    public void ad_dep_1320_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1320_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd		 = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);

    	String flag     = Util.checkString(req.getParameter("flag"));
    	
    	String multiUpdateData	= Util.checkString(req.getParameter("multiUpdateData"));	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String pubc_slip_no 	= Util.checkString((String)hash.get("pubc_slip_no"));
    	String advt_fee 		= Util.checkString((String)hash.get("advt_fee"));
    	String vat 				= Util.checkString((String)hash.get("vat"));
    	String unpaid_amt 		= Util.checkString((String)hash.get("unpaid_amt"));
    	String hndl_clsf 		= Util.checkString((String)hash.get("hndl_clsf"));
    	String dlco_no 			= Util.checkString((String)hash.get("dlco_no"));
    	String agn 				= Util.checkString((String)hash.get("agn"));
    	String hndl_plac_cd 	= Util.checkString((String)hash.get("hndl_plac_cd"));
    	String bddb_proc_clsf 	= Util.checkString((String)hash.get("bddb_proc_clsf"));

    	AD_DEP_1320_ADM dm = new AD_DEP_1320_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setUnpaid_amt(unpaid_amt);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setAgn(agn);
    	dm.setHndl_plac_cd(hndl_plac_cd);
    	dm.setBddb_proc_clsf(bddb_proc_clsf);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
        //dm.print();

        try {
        	AdDep1300DAO	dao = new AdDep1300DAO();
            ds = dao.ad_dep_1320_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1300EJBHome home = (AdDep1300EJBHome) JNDIManager.getInstance().getHome("AdDep1300EJB");
//        try {
//        	AdDep1300EJB ejb = home.create();
//            ds = ejb.ad_dep_1320_a(dm);
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
