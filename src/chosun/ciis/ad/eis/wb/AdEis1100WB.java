/***************************************************************************************************
* 파일명 : AdEis1000WB.java
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

package chosun.ciis.ad.eis.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.eis.dao.AdEis1100DAO;
import chosun.ciis.ad.eis.dm.AD_EIS_1110_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1120_ADM;
import chosun.ciis.ad.eis.ds.AD_EIS_1110_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1120_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdEis1100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_eis_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1110_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
    	
    	// DM Setting
    	AD_EIS_1110_LDM dm = new AD_EIS_1110_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setBasi_yymm(basi_yymm);

        try {
        	AdEis1100DAO	dao = new AdEis1100DAO();
            ds = dao.ad_eis_1110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1100EJBHome home = (AdEis1100EJBHome) JNDIManager.getInstance().getHome("AdEis1100EJB");
//        try {
//        	AdEis1100EJB ejb = home.create();
//            ds = ejb.ad_eis_1110_l(dm);
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
    public void ad_eis_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1120_ADataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode 	= Util.checkString((String)hash.get("m"));
    	String dlco_no  = Util.checkString((String)hash.get("dlco_no"));
    	String advt_amt = Util.checkString((String)hash.get("advt_amt"));
    	
    	// DM Setting
    	AD_EIS_1120_ADM dm = new AD_EIS_1120_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setBasi_yymm(basi_yymm);
    	dm.setMode(mode.toUpperCase());
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_amt(StringUtil.strip(advt_amt, ","));
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
//    	//dm.print();

        try {
        	AdEis1100DAO	dao = new AdEis1100DAO();
            ds = dao.ad_eis_1120_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1100EJBHome home = (AdEis1100EJBHome) JNDIManager.getInstance().getHome("AdEis1100EJB");
//        try {
//        	AdEis1100EJB ejb = home.create();
//            ds = ejb.ad_eis_1120_a(dm);
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
