/***************************************************************************************************
* 파일명 : 
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

package chosun.ciis.co.mng.wb;

import java.rmi.RemoteException;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.mng.dao.CO_MNG_1000DAO;
import chosun.ciis.co.mng.dm.CO_MNG_1000_LDM;
import chosun.ciis.co.mng.dm.CO_MNG_1010_LDM;
import chosun.ciis.co.mng.dm.CO_MNG_1020_SDM;
import chosun.ciis.co.mng.dm.CO_MNG_1050_LDM;
import chosun.ciis.co.mng.ds.CO_MNG_1000_LDataSet;
import chosun.ciis.co.mng.ds.CO_MNG_1010_LDataSet;
import chosun.ciis.co.mng.ds.CO_MNG_1020_SDataSet;
import chosun.ciis.co.mng.ds.CO_MNG_1050_LDataSet;
//import chosun.ciis.co.mng.ejb.CO_MNG_1000EJB;
//import chosun.ciis.co.mng.ejb.CO_MNG_1000EJBHome;
/**
 * 
 */

public class CO_MNG_1000WB extends BaseWB{

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_mng_1000_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        //CO_MNG_1000_LDataSet ds = null;

        // DM Setting
        CO_MNG_1000_LDM dm = new CO_MNG_1000_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String acct_cd  = Util.getSessionParameterValue(req, "uid", true);
        	
        dm.setCmpy_cd(cmpy_cd);
        dm.setAcct_cd(acct_cd);
        
        dm.print();
/*        
        CO_MNG_1000EJBHome home = (CO_MNG_1000EJBHome) JNDIManager.getInstance().getHome("CO_MNG_1000EJB");
        
        try {
        	CO_MNG_1000EJB ejb = home.create();
            ds = ejb.co_mng_1000_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/
        DBManager manager 			= new DBManager("MISCOM");
        CO_MNG_1000_LDataSet ds 	= (CO_MNG_1000_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }      
        req.setAttribute("ds", ds);
    }
    
    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_mng_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        //CO_MNG_1010_LDataSet ds = null;

        // DM Setting
        CO_MNG_1010_LDM dm = new CO_MNG_1010_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String acct_cd  = Util.getSessionParameterValue(req, "uid", true);
        String job_clsf 	= Util.checkString(req.getParameter("mainID"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setAcct_cd(acct_cd);
        dm.setJob_clsf(job_clsf);
        
        dm.print();
/*        
        CO_MNG_1000EJBHome home = (CO_MNG_1000EJBHome) JNDIManager.getInstance().getHome("CO_MNG_1000EJB");
        
        try {
        	CO_MNG_1000EJB ejb = home.create();
            ds = ejb.co_mng_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/
        DBManager manager 			= new DBManager("MISCOM");
        CO_MNG_1010_LDataSet ds 	= (CO_MNG_1010_LDataSet) manager.executeCall(dm);
        ds.setMenuId(dm.getJob_clsf());
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }  
        req.setAttribute("ds", ds);
    }

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_mng_1020_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        //CO_MNG_1020_SDataSet ds = null;

        // DM Setting

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String acct_cd  	= Util.getSessionParameterValue(req, "uid", true);
        String page_id 	    = Util.checkString(req.getParameter("page_id"));
        
        CO_MNG_1020_SDM dm = new CO_MNG_1020_SDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setAcct_cd(acct_cd);
        dm.setPage_id(page_id);
        
        dm.print();
/*        
        CO_MNG_1000EJBHome home = (CO_MNG_1000EJBHome) JNDIManager.getInstance().getHome("CO_MNG_1000EJB");
        
        try {
        	CO_MNG_1000EJB ejb = home.create();
            ds = ejb.co_mng_1020_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/
        DBManager manager 			= new DBManager("MISCOM");
        
        CO_MNG_1020_SDataSet ds 	= (CO_MNG_1020_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    

    public void co_mng_1050_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
      CO_MNG_1050_LDataSet ds = null;

      String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      String acct_cd = Util.getSessionParameterValue(req, "uid", true);

      String info_emp_no = Util.checkString(req.getParameter("info_emp_no"));

      CO_MNG_1050_LDM dm = new CO_MNG_1050_LDM();

      dm.setCmpy_cd(cmpy_cd);
      dm.setAcct_cd(acct_cd);
      dm.setInfo_emp_no(info_emp_no);

      dm.print();
      try
      {
        CO_MNG_1000DAO dao = new CO_MNG_1000DAO();
        ds = dao.co_mng_1050_l(dm);
      } catch (SysException se) {
        throw se;
      } catch (AppException e) {
        throw e;
      }

      if (!"".equals(ds.errcode)) {
        throw new AppException(ds.errcode, ds.errmsg);
      }
      req.setAttribute("ds", ds);
    }
    
}
 