/***************************************************************************************************
* 파일명 : AdPub1700WB.java
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
import chosun.ciis.ad.pub.dao.AdPub1700DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1700_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1710_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1720_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1700_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1710_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1720_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1700WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1700_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1700_MDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);

        // DM Setting
    	AD_PUB_1700_MDM dm = new AD_PUB_1700_MDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);

        try {
        	AdPub1700DAO	dao = new AdPub1700DAO();
            ds = dao.ad_pub_1700_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1700EJBHome home = (AdPub1700EJBHome) JNDIManager.getInstance().getHome("AdPub1700EJB");
//        try {
//        	AdPub1700EJB ejb = home.create();
//            ds = ejb.ad_pub_1700_m(dm);
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
    public void ad_pub_1710_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1710_SDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt = Util.checkString(req.getParameter("proc_dt"));
    	String proc_seq = Util.checkString(req.getParameter("proc_seq"));

        // DM Setting
    	AD_PUB_1710_SDM dm = new AD_PUB_1710_SDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setProc_seq(proc_seq);

        try {
        	AdPub1700DAO	dao = new AdPub1700DAO();
            ds = dao.ad_pub_1710_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1700EJBHome home = (AdPub1700EJBHome) JNDIManager.getInstance().getHome("AdPub1700EJB");
//        try {
//        	AdPub1700EJB ejb = home.create();
//            ds = ejb.ad_pub_1710_s(dm);
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
    public void ad_pub_1720_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1720_ADataSet ds = null;

    	String flag = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
    	String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
    	String proc_dt = Util.checkString(req.getParameter("proc_dt"));
    	String proc_seq = Util.checkString(req.getParameter("proc_seq"));
    	String div_dt = Util.checkString(req.getParameter("div_dt"));
    	
    	String dlco_no 				= "";
    	String advt_cont 			= ""; 
    	String advt_fee 			= "";
    	String vat 					= "";
    	String pubc_tot_amt 		= "";
    	String fee 					= "";
    	String coms 				= "";
    	String div_pubc_occr_dt 	= "";
    	String div_pubc_occr_seq 	= "";
    	
    	if(!"D".equals(flag)){
	    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
	    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	    	
	    	dlco_no 			= Util.checkString((String)hash.get("dlco_no"));
	    	advt_cont 			= Util.checkString((String)hash.get("advt_cont"));
	    	advt_fee 			= Util.checkString((String)hash.get("advt_fee"));
	    	vat 				= Util.checkString((String)hash.get("vat"));
	    	pubc_tot_amt 		= Util.checkString((String)hash.get("pubc_tot_amt"));
	    	fee 				= Util.checkString((String)hash.get("fee"));
	    	coms 				= Util.checkString((String)hash.get("coms"));
	    	div_pubc_occr_dt 	= Util.checkString((String)hash.get("div_pubc_occr_dt"));
	    	div_pubc_occr_seq 	= Util.checkString((String)hash.get("div_pubc_occr_seq"));
    	}
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));

        // DM Setting
    	AD_PUB_1720_ADM dm = new AD_PUB_1720_ADM();

    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);
    	dm.setProc_dt(proc_dt);
    	dm.setProc_seq(proc_seq);
    	dm.setDiv_dt(div_dt);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_cont(advt_cont);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setPubc_tot_amt(pubc_tot_amt);
    	dm.setFee(fee);
    	dm.setComs(coms);
    	dm.setDiv_pubc_occr_dt(div_pubc_occr_dt);
    	dm.setDiv_pubc_occr_seq(div_pubc_occr_seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdPub1700DAO	dao = new AdPub1700DAO();
            ds = dao.ad_pub_1720_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1700EJBHome home = (AdPub1700EJBHome) JNDIManager.getInstance().getHome("AdPub1700EJB");
//        try {
//        	AdPub1700EJB ejb = home.create();
//            ds = ejb.ad_pub_1720_a(dm);
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
