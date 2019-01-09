/***************************************************************************************************
* 파일명 : AdDep2600WB.java
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
import chosun.ciis.ad.dep.dao.AdDep2800DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2810_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2810_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2800WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2810_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2810_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String pubc_dt 		  = Util.checkString(req.getParameter("pubc_dt"));
    	String vat 			  = Util.checkString(req.getParameter("vat"));

    	AD_DEP_2810_LDM dm = new AD_DEP_2810_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPubc_dt(pubc_dt);
    	dm.setVat(vat);
       
        //dm.print();  

        try {
        	AdDep2800DAO	dao = new AdDep2800DAO();
            ds = dao.ad_dep_2810_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2800EJBHome home = (AdDep2800EJBHome) JNDIManager.getInstance().getHome("AdDep2800EJB");
//        try {
//        	AdDep2800EJB ejb = home.create();
//            ds = ejb.ad_dep_2810_l(dm);
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
