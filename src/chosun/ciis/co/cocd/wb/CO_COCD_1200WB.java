/***************************************************************************************************
* ���ϸ� : CO_COCD_1200WB
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
import chosun.ciis.co.cocd.dm.CO_COCD_1200_MDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1210_LDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1250_MDM;
import chosun.ciis.co.cocd.ds.CO_COCD_1200_MDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1210_LDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1250_MDataSet;
//import chosun.ciis.co.cocd.ejb.CO_COCD_1200EJB;
//import chosun.ciis.co.cocd.ejb.CO_COCD_1200EJBHome;
/**
 * 
 */

public class CO_COCD_1200WB extends BaseWB{

    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1200_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1200_MDataSet ds = null;

        // DM Setting
        CO_COCD_1200_MDM dm = new CO_COCD_1200_MDM();

        String cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        
        /*
        CO_COCD_1200EJBHome home = (CO_COCD_1200EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1200EJB");
        
        try {
        	CO_COCD_1200EJB ejb = home.create();
            ds = ejb.co_cocd_1200_m(dm);
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
        
        CO_COCD_1200_MDataSet ds 	= (CO_COCD_1200_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1210_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1210_LDataSet ds = null;

        // DM Setting
        CO_COCD_1210_LDM dm = new CO_COCD_1210_LDM();

        String cmpy_cd 	=Util.getSessionParameterValue(req, "cmpycd", true);
        String job_clsf = Util.checkString(req.getParameter("job_clsf"));
        String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
        String cd = Util.checkString(req.getParameter("cd"));
        String cdnm = Util.checkString(req.getParameter("cdnm"));
        String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
        String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));
        String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
        String mang_cd_4 = Util.checkString(req.getParameter("mang_cd_4"));
        String mang_cd_5 = Util.checkString(req.getParameter("mang_cd_5"));
        String mang_cd_6 = Util.checkString(req.getParameter("mang_cd_6"));
        String mang_cd_7 = Util.checkString(req.getParameter("mang_cd_7"));
        String mang_cd_8 = Util.checkString(req.getParameter("mang_cd_8"));
        String mang_cd_9 = Util.checkString(req.getParameter("mang_cd_9"));
        String mang_cd_10 = Util.checkString(req.getParameter("mang_cd_10"));
        String mang_cd_11 = Util.checkString(req.getParameter("mang_cd_11"));
        String mang_cd_12 = Util.checkString(req.getParameter("mang_cd_12"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCd_clsf(cd_clsf);
        dm.setCd(cd);
        dm.setCdnm(cdnm);
        dm.setMang_cd_1(mang_cd_1);
        dm.setMang_cd_2(mang_cd_2);
        dm.setMang_cd_3(mang_cd_3);
        dm.setMang_cd_4(mang_cd_4);
        dm.setMang_cd_5(mang_cd_5);
        dm.setMang_cd_6(mang_cd_6);
        dm.setMang_cd_7(mang_cd_7);
        dm.setMang_cd_8(mang_cd_8);
        dm.setMang_cd_9(mang_cd_9);
        dm.setMang_cd_10(mang_cd_10);
        dm.setMang_cd_11(mang_cd_11);
        dm.setMang_cd_12(mang_cd_12);
        dm.print();
        
        /*
        CO_COCD_1200EJBHome home = (CO_COCD_1200EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1200EJB");
        
        try {
        	CO_COCD_1200EJB ejb = home.create();
            ds = ejb.co_cocd_1210_l(dm);
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
        
        CO_COCD_1210_LDataSet ds 	= (CO_COCD_1210_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        req.setAttribute("ds", ds);
    }
    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1250_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1250_MDataSet ds = null;

        // DM Setting
        CO_COCD_1250_MDM dm = new CO_COCD_1250_MDM();

        String cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
        String job_clsf = Util.checkString(req.getParameter("job_clsf"));
        String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCd_clsf(cd_clsf);
        
        /*
        CO_COCD_1200EJBHome home = (CO_COCD_1200EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1200EJB");
        
        try {
        	CO_COCD_1200EJB ejb = home.create();
            ds = ejb.co_cocd_1250_m(dm);
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
        
        CO_COCD_1250_MDataSet ds 	= (CO_COCD_1250_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        req.setAttribute("ds", ds);
    }
    
}
