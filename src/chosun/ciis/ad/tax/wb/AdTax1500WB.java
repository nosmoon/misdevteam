/***************************************************************************************************
* 파일명 : AdTax1500WB.java
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

package chosun.ciis.ad.tax.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.tax.dao.AdTax1500DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1510_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1520_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1510_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1520_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1500WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1510_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String ask_clsf = Util.checkString(req.getParameter("ask_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	
    	AD_TAX_1510_LDM dm = new AD_TAX_1510_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setFrdt(frdt);  
    	dm.setTodt(todt);
    	dm.setAsk_clsf(ask_clsf);
    	dm.setDlco_no(dlco_no);
        
    	//dm.print();

        try {
        	AdTax1500DAO	dao = new AdTax1500DAO();
            ds = dao.ad_tax_1510_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1500EJBHome home = (AdTax1500EJBHome) JNDIManager.getInstance().getHome("AdTax1500EJB");
//        try {
//        	AdTax1500EJB ejb = home.create();
//            ds = ejb.ad_tax_1510_l(dm);
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
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1520_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1520_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String slip_clsf_cd = Util.checkString((String)hash.get("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString((String)hash.get("slip_occr_dt"));
    	String slip_seq 	= Util.checkString((String)hash.get("slip_seq"));
    	String seq 			= Util.checkString((String)hash.get("seq"));
    	String ask_clsf 	= Util.checkString((String)hash.get("ask_clsf"));
    	String aft_suply_amt = Util.checkString((String)hash.get("aft_suply_amt"));
    	String resn 		= Util.checkString((String)hash.get("resn"));
    	
    	AD_TAX_1520_ADM dm = new AD_TAX_1520_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setSeq(seq);
    	dm.setAsk_clsf(ask_clsf);
    	dm.setAft_suply_amt(aft_suply_amt);
    	dm.setResn(resn);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
        
    	//dm.print();

        try {
        	AdTax1500DAO	dao = new AdTax1500DAO();
            ds = dao.ad_tax_1520_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1500EJBHome home = (AdTax1500EJBHome) JNDIManager.getInstance().getHome("AdTax1500EJB");
//        try {
//        	AdTax1500EJB ejb = home.create();
//            ds = ejb.ad_tax_1520_a(dm);
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
