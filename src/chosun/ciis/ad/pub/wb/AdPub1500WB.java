/***************************************************************************************************
* 파일명 : AdPub1500WB.java
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

package chosun.ciis.ad.pub.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub1500DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1500_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1510_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1520_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1530_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1550_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1560_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1500_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1510_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1520_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1530_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1550_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1560_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1500WB extends BaseWB {

	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1500_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException 
    {	
    	AD_PUB_1500_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1500_MDM dm 	= new AD_PUB_1500_MDM();
    	String cmpy_cd     	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf   	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setEmpno(emp_no);
        
        //dm.print();

        try
        {
        	AdPub1500DAO	dao = new AdPub1500DAO();
            ds = dao.ad_pub_1500_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        } 
//        
//        AdPub1500EJBHome home = (AdPub1500EJBHome) JNDIManager.getInstance().getHome("AdPub1500EJB");
//        try {
//        	AdPub1500EJB ejb = home.create();
//            ds = ejb.ad_pub_1500_m(dm);
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
    public void ad_pub_1510_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1510_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1510_LDM dm = new AD_PUB_1510_LDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd     = Util.checkString(req.getParameter("medi_cd"));
    	String frdt        = Util.checkString(req.getParameter("frdt"));
    	String todt        = Util.checkString(req.getParameter("todt"));
    	String icdt_clsf   = Util.checkString(req.getParameter("icdt_clsf"));
    	String dlco_no     = Util.checkString(req.getParameter("dlco_no"));
    	String slcrg_pers  = Util.checkString(req.getParameter("slcrg_pers"));
    	
    	String acct_cd		= Util.getSessionParameterValue(req, "uid", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setIcdt_clsf(icdt_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setAcct_cd(acct_cd);
    	dm.setEmp_no(emp_no);
        
        //dm.print();

        try {
        	AdPub1500DAO	dao = new AdPub1500DAO();
            ds = dao.ad_pub_1510_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1500EJBHome home = (AdPub1500EJBHome) JNDIManager.getInstance().getHome("AdPub1500EJB");
//        try {
//        	AdPub1500EJB ejb = home.create();
//            ds = ejb.ad_pub_1510_l(dm);
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
    public void ad_pub_1520_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1520_SDataSet ds = null;

        // DM Setting
    	AD_PUB_1520_SDM dm = new AD_PUB_1520_SDM();
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd       = Util.checkString(req.getParameter("medi_cd"));
    	String seq           = Util.checkString(req.getParameter("seq"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setSeq(seq);
        
        //dm.print();

        try {
        	AdPub1500DAO	dao = new AdPub1500DAO();
            ds = dao.ad_pub_1520_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1500EJBHome home = (AdPub1500EJBHome) JNDIManager.getInstance().getHome("AdPub1500EJB");
//        try {
//        	AdPub1500EJB ejb = home.create();
//            ds = ejb.ad_pub_1520_s(dm);
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
    public void ad_pub_1530_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1530_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1530_LDM dm = new AD_PUB_1530_LDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String medi_cd     = Util.checkString(req.getParameter("medi_cd"));
    	String frdt        = Util.checkString(req.getParameter("frdt"));
    	String todt        = Util.checkString(req.getParameter("todt"));
    	String dlco_no     = Util.checkString(req.getParameter("dlco_no"));
    	String pers        = Util.checkString(req.getParameter("pers"));
    	String pers_clsf   = Util.checkString(req.getParameter("pers_clsf"));
    	String search_mode   = Util.checkString(req.getParameter("search_mode"));
    	
    	String acct_cd		= Util.getSessionParameterValue(req, "uid", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_no(dlco_no);
    	dm.setPers(pers);
    	dm.setPers_clsf(pers_clsf);
    	dm.setSearch_mode(search_mode);
    	dm.setAcct_cd(acct_cd);
    	dm.setEmp_no(emp_no);
        
        //dm.print();

        try {
        	AdPub1500DAO	dao = new AdPub1500DAO();
            ds = dao.ad_pub_1530_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1500EJBHome home = (AdPub1500EJBHome) JNDIManager.getInstance().getHome("AdPub1500EJB");
//        try {
//        	AdPub1500EJB ejb = home.create();
//            ds = ejb.ad_pub_1530_l(dm);
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
    public void ad_pub_1550_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1550_ADataSet ds = null;

        // DM Setting
    	AD_PUB_1550_ADM dm = new AD_PUB_1550_ADM();
    	String flag 	     = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd       = Util.checkString(req.getParameter("medi_cd"));
    	String seq	 	     = Util.checkString(req.getParameter("seq"));  
    	String icdc_clsf     = Util.checkString(req.getParameter("icdc_clsf"));
    	String upd_prv_amt   = Util.checkString(req.getParameter("upd_prv_amt"));
    	String upd_aft_amt   = Util.checkString(req.getParameter("upd_aft_amt"));
    	String icdc_amt      = Util.checkString(req.getParameter("icdc_amt"));
    	String resn          = Util.checkString(req.getParameter("resn"));
    	String dept_cd       = Util.checkString(req.getParameter("dept_cd"));
    	String chrg_pers     = Util.checkString(req.getParameter("chrg_pers"));
    	String dlco_no       = Util.checkString(req.getParameter("dlco_no"));
    	String make_dt       = Util.checkString(req.getParameter("make_dt"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIcdc_clsf(icdc_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setSeq(seq);
    	dm.setUpd_prv_amt(upd_prv_amt);
    	dm.setUpd_aft_amt(upd_aft_amt);
    	dm.setIcdc_amt(icdc_amt);
    	dm.setResn(resn);
    	dm.setDept_cd(dept_cd);
    	dm.setChrg_pers(chrg_pers);
    	dm.setDlco_no(dlco_no);
    	dm.setMake_dt(make_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);       
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        //System.out.println("multiUpdateData = "+ multiUpdateData);
         
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

     	String mode 			= Util.checkString((String)hash.get("m")); 
     	String icdcpubc_yn      = Util.checkString((String)hash.get("icdcpubc_yn")); 
        String pubc_occr_dt	 	= Util.checkString((String)hash.get("pubc_occr_dt"));
        String pubc_occr_seq	= Util.checkString((String)hash.get("pubc_occr_seq"));
        
     	dm.setMode(mode.toUpperCase());
     	dm.setIcdcpubc_yn(icdcpubc_yn);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);    	
    	
        //dm.print();

        try {
        	AdPub1500DAO	dao = new AdPub1500DAO();
            ds = dao.ad_pub_1550_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1500EJBHome home = (AdPub1500EJBHome) JNDIManager.getInstance().getHome("AdPub1500EJB");
//        try {
//        	AdPub1500EJB ejb = home.create();
//            ds = ejb.ad_pub_1550_a(dm);
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
    public void ad_pub_1560_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1560_ADataSet ds = null;

    	String cmpy_cd         = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip   = req.getRemoteAddr();
    	String incmg_pers      = Util.getSessionParameterValue(req, "emp_no", true);
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String medi_cd 		= Util.checkString((String)hash.get("medi_cd"));
    	String seq 			= Util.checkString((String)hash.get("seq"));
    	String chrg_aprv 	= Util.checkString((String)hash.get("chrg_aprv"));

        // DM Setting
    	AD_PUB_1560_ADM dm = new AD_PUB_1560_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setSeq(seq);
    	dm.setChrg_aprv(chrg_aprv);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setIncmg_pers_ip(incmg_pers_ip);   
    	
        dm.print();

        try {
        	AdPub1500DAO	dao = new AdPub1500DAO();
            ds = dao.ad_pub_1560_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1500EJBHome home = (AdPub1500EJBHome) JNDIManager.getInstance().getHome("AdPub1500EJB");
//        try {
//        	AdPub1500EJB ejb = home.create();
//            ds = ejb.ad_pub_1560_a(dm);
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
