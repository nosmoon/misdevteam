/***************************************************************************************************
* 파일명 : AdRes2000WB.java
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

package chosun.ciis.ad.res.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes2000DAO;
import chosun.ciis.ad.res.dm.AD_RES_2010_LDM;
import chosun.ciis.ad.res.dm.AD_RES_2020_UDM;
import chosun.ciis.ad.res.ds.AD_RES_2010_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2020_UDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes2000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2010_LDataSet ds = null;

        // DM Setting
    	AD_RES_2010_LDM dm = new AD_RES_2010_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);


        try {
        	AdRes2000DAO	dao = new AdRes2000DAO();
            ds = dao.ad_res_2010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2000EJBHome home = (AdRes2000EJBHome) JNDIManager.getInstance().getHome("AdRes2000EJB");
//        try {
//        	AdRes2000EJB ejb = home.create();
//            ds = ejb.ad_res_2010_l(dm);
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
    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2020_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2020_UDataSet ds = null;

        // DM Setting
    	AD_RES_2020_UDM dm = new AD_RES_2020_UDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String remk = Util.checkString(req.getParameter("remk"));
    	String job_trsf = Util.checkString(req.getParameter("job_trsf"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);
        dm.setRemk(remk);
        dm.setJob_trsf(job_trsf);
        dm.setIncmg_pers(incmg_pers);
        
        ////dm.print();

        try {
        	AdRes2000DAO	dao = new AdRes2000DAO();
            ds = dao.ad_res_2020_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2000EJBHome home = (AdRes2000EJBHome) JNDIManager.getInstance().getHome("AdRes2000EJB");
//        try {
//        	AdRes2000EJB ejb = home.create();
//            ds = ejb.ad_res_2020_u(dm);
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
