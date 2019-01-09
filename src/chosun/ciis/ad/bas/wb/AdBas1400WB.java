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
import chosun.ciis.ad.bas.dao.AdBas1400DAO;
import chosun.ciis.ad.bas.dao.AdBas2600DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1410_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1420_IDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2650_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1410_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1420_IDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2650_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1410_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1410_LDM dm = new AD_BAS_1410_LDM();
    	String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
    	String mchrg_nm   = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_nm")));
    	String chrg_clsf  = Util.checkString(req.getParameter("chrg_clsf"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no    = Util.checkString(req.getParameter("dlco_no"));
    	
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setMchrg_nm(mchrg_nm);
    	dm.setChrg_clsf(chrg_clsf);
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        
        dm.print(); 
//    	AdBas1400EJBHome home = (AdBas1400EJBHome) JNDIManager.getInstance().getHome("AdBas1400EJB");
        try {
        	AdBas1400DAO dao = new AdBas1400DAO();
            ds = dao.ad_bas_1410_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
/*        
    	AdBas1400EJBHome home = (AdBas1400EJBHome) JNDIManager.getInstance().getHome("AdBas1400EJB");
        try {
        	AdBas1400EJB ejb = home.create();
            ds = ejb.ad_bas_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    } 
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void ad_bas_1420_i(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1420_IDataSet ds = null;

        // DM Setting
    	AD_BAS_1420_IDM dm = new AD_BAS_1420_IDM();   	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd", true);
    	String medi_clsf = Util.getSessionParameterValue(req,"dealmedicd", true);
    	
    	//String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	//String chrg_area = Util.checkString(req.getParameter("chrg_area"));
    	
    	String multiUpdateData	= Util.checkString(req.getParameter("multiUpdateData"));
    	
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        String flag 	 	= Util.checkString((String)hash.get("m"));
        String mchrg_pers	= Util.checkString((String)hash.get("mchrg_pers"));
        String chrg_area	= Util.checkString((String)hash.get("chrg_area"));

    	
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.setIncmg_pers(incmg_pers);    	
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMchrg_pers(mchrg_pers);
        dm.setMedi_clsf(medi_clsf);
        dm.setChrg_area(chrg_area);
        dm.setIncmg_pers_ip(incmg_pers_ip);

//    	//dm.print(); 
        try {
        	AdBas1400DAO dao = new AdBas1400DAO();
            ds = dao.ad_bas_1420_i(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
          
//        AdBas1400EJBHome home = (AdBas1400EJBHome) JNDIManager.getInstance().getHome("AdBas1400EJB");
//        try {
//        	AdBas1400EJB ejb = home.create();
//            ds = ejb.ad_bas_1420_i(dm);
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
