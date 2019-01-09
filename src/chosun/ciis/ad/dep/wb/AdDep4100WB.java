/***************************************************************************************************
* 파일명 : AdDep4100WB.java
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
import chosun.ciis.ad.dep.dao.AdDep4100DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_4110_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_4110_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep4100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_4110_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_4110_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    	= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip	= req.getRemoteAddr();
    	
    	String na_frdt = Util.checkString(req.getParameter("na_frdt"));
    	String na_todt = Util.checkString(req.getParameter("na_todt"));
    	String ma_frdt = Util.checkString(req.getParameter("ma_frdt"));
    	String ma_todt = Util.checkString(req.getParameter("ma_todt"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));

    	AD_DEP_4110_ADM dm = new AD_DEP_4110_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setNa_frdt(na_frdt);
    	dm.setNa_todt(na_todt);
    	dm.setMa_frdt(ma_frdt);
    	dm.setMa_todt(ma_todt);
    	dm.setBasi_dt(basi_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
    	//dm.print();    
    	   
        try {
        	AdDep4100DAO	dao = new AdDep4100DAO();
            ds = dao.ad_dep_4110_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep4100EJBHome home = (AdDep4100EJBHome) JNDIManager.getInstance().getHome("AdDep4100EJB");
//        try {
//        	AdDep4100EJB ejb = home.create();
//            ds = ejb.ad_dep_4110_a(dm);
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
