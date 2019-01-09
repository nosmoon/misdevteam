/***************************************************************************************************
* 파일명 : AdPub1300WB.java
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
import chosun.ciis.ad.pub.dao.AdPub1300DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1300_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1310_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1320_UDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1300_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1310_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1320_UDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1300WB extends BaseWB {

	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1300_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1300_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1300_MDM dm = new AD_PUB_1300_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);

        try {
        	AdPub1300DAO	dao = new AdPub1300DAO();
            ds = dao.ad_pub_1300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1300EJBHome home = (AdPub1300EJBHome) JNDIManager.getInstance().getHome("AdPub1300EJB");
//        try {
//        	AdPub1300EJB ejb = home.create();
//            ds = ejb.ad_pub_1300_m(dm);
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
    public void ad_pub_1310_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1310_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1310_LDM dm = new AD_PUB_1310_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String approval = Util.checkString(req.getParameter("approval"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setApproval(approval);
        dm.setAdvt_cont(advt_cont);
        
        ////dm.print();

        try {
        	AdPub1300DAO	dao = new AdPub1300DAO();
            ds = dao.ad_pub_1310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1300EJBHome home = (AdPub1300EJBHome) JNDIManager.getInstance().getHome("AdPub1300EJB");
//        try {
//        	AdPub1300EJB ejb = home.create();
//            ds = ejb.ad_pub_1310_l(dm);
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
    public void ad_pub_1320_u(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1320_UDataSet ds = null;

        // DM Setting
    	AD_PUB_1320_UDM dm = new AD_PUB_1320_UDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd    = "110";
    	String chg_pers   = Util.getSessionParameterValue(req, "emp_no", true);
    	
	    dm.setCmpy_cd(cmpy_cd);
	    dm.setMedi_cd(medi_cd);
	    dm.setChg_pers(chg_pers);
	    
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        //System.out.println("multiUpdateData = "+ multiUpdateData);
         
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
     	
        //String mode 			= (String)hash.get("m"); 
        String pubc_dt          = (String)hash.get("pubc_dt"); 
        String seq	 			= (String)hash.get("seq"); 
        String guid_aprv_yn     = (String)hash.get("guid_aprv_yn"); 
        String advt_cont        = (String)hash.get("advt_cont"); 
        String advcs_cd         = (String)hash.get("advcs_cd"); 
        String advcs_nm         = (String)hash.get("advcs_nm"); 
        String eps_clsf_cd      = (String)hash.get("eps_clsf_cd"); 
        String pubc_side        = (String)hash.get("pubc_side");
        String arow             = (String)hash.get("arow");
        String uprc             = (String)hash.get("uprc");
        String advt_fee         = (String)hash.get("advt_fee");
        String vat              = (String)hash.get("vat");
        String guid_sec_kind_cd = (String)hash.get("guid_sec_kind_cd");
        
        
        //dm.setMode(mode.toUpperCase());
        dm.setPubc_dt(pubc_dt);
        dm.setSeq(seq);
        dm.setGuid_aprv_yn(guid_aprv_yn);
        dm.setAdvt_cont(advt_cont);
        dm.setAdvcs_cd(advcs_cd);
        dm.setAdvcs_nm(advcs_nm);
        dm.setEps_clsf_cd(eps_clsf_cd);
        dm.setPubc_side(pubc_side);
        dm.setArow(arow);
        dm.setUprc(uprc);
        dm.setAdvt_fee(advt_fee);
        dm.setVat(vat);
        dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
        
        dm.print();

        try {
        	AdPub1300DAO	dao = new AdPub1300DAO();
            ds = dao.ad_pub_1320_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1300EJBHome home = (AdPub1300EJBHome) JNDIManager.getInstance().getHome("AdPub1300EJB");
//        try {
//        	AdPub1300EJB ejb = home.create();
//            ds = ejb.ad_pub_1320_u(dm);
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
