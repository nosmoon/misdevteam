/***************************************************************************************************
* 파일명 : AdDep2700WB.java
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
import chosun.ciis.ad.dep.dao.AdDep2700DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2710_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2710_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2700WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2710_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2710_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));

    	AD_DEP_2710_LDM dm = new AD_DEP_2710_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
       
        //dm.print();

        try {
        	AdDep2700DAO	dao = new AdDep2700DAO();
            ds = dao.ad_dep_2710_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2700EJBHome home = (AdDep2700EJBHome) JNDIManager.getInstance().getHome("AdDep2700EJB");
//        try {
//        	AdDep2700EJB ejb = home.create();
//            ds = ejb.ad_dep_2710_l(dm);
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
