/***************************************************************************************************
* 파일명 : AdDep2100WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
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
import chosun.ciis.ad.dep.dao.AdDep2100DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2110_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2110_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2110_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2110_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true); 
    	String from_dt    = Util.checkString(req.getParameter("from_dt"));
    	String to_dt      = Util.checkString(req.getParameter("to_dt"));
    	String dlco_no    = Util.checkString(req.getParameter("dlco_no"));
    	
    	AD_DEP_2110_LDM dm = new AD_DEP_2110_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrom_dt(from_dt);
    	dm.setTo_dt(to_dt);
    	dm.setDlco_no(dlco_no);
        //dm.print();        
        

        try {
        	AdDep2100DAO	dao = new AdDep2100DAO();
            ds = dao.ad_dep_2110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2100EJBHome home = (AdDep2100EJBHome) JNDIManager.getInstance().getHome("AdDep2100EJB");
//        
//        try {
//        	AdDep2100EJB ejb = home.create();
//            ds = ejb.ad_dep_2110_l(dm);
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
