/***************************************************************************************************
* 파일명 : AdDep2000WB.java
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
import chosun.ciis.ad.dep.dao.AdDep2000DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2010_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2010_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2000WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2010_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2010_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true); 
    	String acct_num = Util.checkString(req.getParameter("acct_num"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String remark = Util.checkString(req.getParameter("remark"));
    	String tran_amt = Util.checkString(req.getParameter("tran_amt"));
    	String rcpm_proc_yn = Util.checkString(req.getParameter("rcpm_proc_yn"));
    	
    	AD_DEP_2010_LDM dm = new AD_DEP_2010_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAcct_num(acct_num);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setRemark(remark);
    	dm.setTran_amt(tran_amt);
    	dm.setRcpm_proc_yn(rcpm_proc_yn);
    	
        dm.print();        

        try {
        	AdDep2000DAO	dao = new AdDep2000DAO();
            ds = dao.ad_dep_2010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2000EJBHome home = (AdDep2000EJBHome) JNDIManager.getInstance().getHome("AdDep2000EJB");
//        
//        try {
//        	AdDep2000EJB ejb = home.create();
//            ds = ejb.ad_dep_2010_l(dm);
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
