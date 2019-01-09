/***************************************************************************************************
* 파일명 : AdDep3300WB.java
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
import chosun.ciis.ad.dep.dao.AdDep3300DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3310_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3310_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3310_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String dlco_clsf      = Util.checkString(req.getParameter("dlco_clsf"));
    	
    	AD_DEP_3310_LDM dm = new AD_DEP_3310_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setDlco_clsf(dlco_clsf);
       
        //dm.print();  

        try {
        	AdDep3300DAO	dao = new AdDep3300DAO();
            ds = dao.ad_dep_3310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3300EJBHome home = (AdDep3300EJBHome) JNDIManager.getInstance().getHome("AdDep3300EJB");
//        try {
//        	AdDep3300EJB ejb = home.create();
//            ds = ejb.ad_dep_3310_l(dm);
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
