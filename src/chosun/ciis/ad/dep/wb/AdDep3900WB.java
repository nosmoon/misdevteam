/***************************************************************************************************
* 파일명 : AdDep3900WB.java
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
import chosun.ciis.ad.dep.dao.AdDep3900DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3900_MDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3900_MDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3900WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3900_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3900_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_3900_MDM dm = new AD_DEP_3900_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();    

        try {
        	AdDep3900DAO	dao = new AdDep3900DAO();
            ds = dao.ad_dep_3900_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3900EJBHome home = (AdDep3900EJBHome) JNDIManager.getInstance().getHome("AdDep3900EJB");
//        try {
//        	AdDep3900EJB ejb = home.create();
//            ds = ejb.ad_dep_3900_m(dm);
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
