/***************************************************************************************************
* ���ϸ� : 
* ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.cocd.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.StringTokenizer;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;
//import chosun.ciis.co.cocd.ejb.*;
import chosun.ciis.co.base.wb.BaseWB;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
/**
 * 
 */

public class CO_COCD_1100WB extends BaseWB{

    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1100_MDataSet ds = null;

        // DM Setting
        CO_COCD_1100_MDM dm = new CO_COCD_1100_MDM();

        String cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        /*
        CO_COCD_1100EJBHome home = (CO_COCD_1100EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1100EJB");
        
        try {
        	CO_COCD_1100EJB ejb = home.create();
            ds = ejb.co_cocd_1100_m(dm);
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
        CO_COCD_1100_MDataSet ds 	= (CO_COCD_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**
     * �̷� ����Ʈ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1110_LDataSet ds = null;

        // DM Setting
        CO_COCD_1110_LDM dm = new CO_COCD_1110_LDM();
        
        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String job_clsf = Util.checkString(req.getParameter("job_clsf"));
        String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
        String cd = Util.checkString(req.getParameter("cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCd_clsf(cd_clsf);
        dm.setCd(cd);
        
        dm.print();
/*        
        CO_COCD_1100EJBHome home = (CO_COCD_1100EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1100EJB");
        
        try {
        	CO_COCD_1100EJB ejb = home.create();
            ds = ejb.co_cocd_1110_l(dm);
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
        CO_COCD_1110_LDataSet ds 	= (CO_COCD_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);        
    }
    
    /**
     * �ڵ帮��Ʈ �˾�
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
     
    public void co_cocd_1120_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1120_LDataSet ds = null;

        // DM Setting
        CO_COCD_1120_LDM dm = new CO_COCD_1120_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String job_clsf = Util.checkString(req.getParameter("job_clsf"));
        String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
        String cd = Util.checkString(req.getParameter("cd"));
        String cdnm = Util.checkString(req.getParameter("cdnm"));
        String use_yn = Util.checkString(req.getParameter("use_yn"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCd_clsf(cd_clsf);
        dm.setCd(cd);
        dm.setCdnm(cdnm);
        dm.setUse_yn(use_yn);
  dm.print();      
/*  
        CO_COCD_1100EJBHome home = (CO_COCD_1100EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1100EJB");
        
        try {
        	CO_COCD_1100EJB ejb = home.create();
            ds = ejb.co_cocd_1120_l(dm);
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
		  CO_COCD_1120_LDataSet ds 	= (CO_COCD_1120_LDataSet) manager.executeCall(dm);
		  if (!"".equals(ds.errcode)) {
		      throw new AppException(ds.errcode, ds.errmsg);
		  }  
    }
    
    
}
