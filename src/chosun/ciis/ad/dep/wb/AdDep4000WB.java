/***************************************************************************************************
* 파일명 : AdDep4000WB.java
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
import chosun.ciis.ad.dep.dao.AdDep4000DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_4010_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_4010_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep4000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_4010_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_4010_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String unrcp_amt1 = Util.checkString(req.getParameter("unrcp_amt1"));
    	String unrcp_amt2 = Util.checkString(req.getParameter("unrcp_amt2"));
    	String unrcp_amt3 = Util.checkString(req.getParameter("unrcp_amt3"));
    	String unrcp_amt4 = Util.checkString(req.getParameter("unrcp_amt4"));
    	String unrcp_amt5 = Util.checkString(req.getParameter("unrcp_amt5"));
    	String unrcp_amt6 = Util.checkString(req.getParameter("unrcp_amt6"));
    	String unrcp_amt7 = Util.checkString(req.getParameter("unrcp_amt7"));

    	AD_DEP_4010_ADM dm = new AD_DEP_4010_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setUnrcp_amt1(unrcp_amt1);
    	dm.setUnrcp_amt2(unrcp_amt2);
    	dm.setUnrcp_amt3(unrcp_amt3);
    	dm.setUnrcp_amt4(unrcp_amt4);
    	dm.setUnrcp_amt5(unrcp_amt5);
    	dm.setUnrcp_amt6(unrcp_amt6);
    	dm.setUnrcp_amt7(unrcp_amt7);
       
    	//dm.print();    
        try {
        	AdDep4000DAO	dao = new AdDep4000DAO();
            ds = dao.ad_dep_4010_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep4000EJBHome home = (AdDep4000EJBHome) JNDIManager.getInstance().getHome("AdDep4000EJB");
//        try {
//        	AdDep4000EJB ejb = home.create();
//            ds = ejb.ad_dep_4010_a(dm);
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
