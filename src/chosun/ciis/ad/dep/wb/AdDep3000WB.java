/***************************************************************************************************
* 파일명 : AdDep3000WB.java
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
import chosun.ciis.ad.dep.dao.AdDep3000DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3010_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3010_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3010_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3010_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String medi_cd        = Util.checkString(req.getParameter("medi_cd"));
    	String vat            = Util.checkString(req.getParameter("vat"));
    	
    	AD_DEP_3010_LDM dm = new AD_DEP_3010_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setMedi_cd(medi_cd);
       
        //dm.print();       

        try {
        	AdDep3000DAO	dao = new AdDep3000DAO();
            ds = dao.ad_dep_3010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3000EJBHome home = (AdDep3000EJBHome) JNDIManager.getInstance().getHome("AdDep3000EJB");
//        try {
//        	AdDep3000EJB ejb = home.create();
//            ds = ejb.ad_dep_3010_l(dm);
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
