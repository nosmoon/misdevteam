/***************************************************************************************************
* 파일명 : AdDep2900WB.java
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
import chosun.ciis.ad.dep.dao.AdDep2900DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2910_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2910_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2900WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2910_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2910_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String medi_clsf      = Util.checkString(req.getParameter("medi_clsf"));
    	String vat            = Util.checkString(req.getParameter("vat"));
    	
    	AD_DEP_2910_LDM dm = new AD_DEP_2910_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setVat(vat);
       
        //dm.print();        

        try {
        	AdDep2900DAO	dao = new AdDep2900DAO();
            ds = dao.ad_dep_2910_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2900EJBHome home = (AdDep2900EJBHome) JNDIManager.getInstance().getHome("AdDep2900EJB");
//        try {
//        	AdDep2900EJB ejb = home.create();
//            ds = ejb.ad_dep_2910_l(dm);
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
