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

public class CO_COCD_1000WB extends BaseWB{

    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1000_MDataSet ds = null;

        // DM Setting
        CO_COCD_1000_MDM dm = new CO_COCD_1000_MDM();

        String cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        /*
        CO_COCD_1000EJBHome home = (CO_COCD_1000EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1000EJB");
        
        try {
        	CO_COCD_1000EJB ejb = home.create();
            ds = ejb.co_cocd_1000_m(dm);
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
        
        CO_COCD_1000_MDataSet ds 	= (CO_COCD_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        req.setAttribute("ds", ds);
    }

    /**
     * �ڵ屸�� ����Ʈ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1010_LDataSet ds = null;

        // DM Setting
        CO_COCD_1010_LDM dm = new CO_COCD_1010_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		String job_clsf = Util.checkString(req.getParameter("job_clsf"));
        
        dm.setCmpy_cd(cmpy_cd);
		dm.setJob_clsf(job_clsf);
/*        
        CO_COCD_1000EJBHome home = (CO_COCD_1000EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1000EJB");
        
        try {
        	CO_COCD_1000EJB ejb = home.create();
            ds = ejb.co_cocd_1010_l(dm);
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
        CO_COCD_1010_LDataSet ds 	= (CO_COCD_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }		
        req.setAttribute("ds", ds);
    }
    
    /**
     * �ڵ� ����Ʈ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1020_LDataSet ds = null;

        // DM Setting
        CO_COCD_1020_LDM dm = new CO_COCD_1020_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		String job_clsf = Util.checkString(req.getParameter("job_clsf"));
		String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		String cd = Util.checkString(req.getParameter("cd"));
        
        dm.setCmpy_cd(cmpy_cd);
		dm.setJob_clsf(job_clsf);
		dm.setCd_clsf(cd_clsf);
		dm.setCd(cd);
//dm.print();
/*
        CO_COCD_1000EJBHome home = (CO_COCD_1000EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1000EJB");
        
        try {
        	CO_COCD_1000EJB ejb = home.create();
            ds = ejb.co_cocd_1020_l(dm);
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
        CO_COCD_1020_LDataSet ds 	= (CO_COCD_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /**
     * �ڵ� ���/����/����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1030_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1030_ADataSet ds = null;

        // DM Setting
        CO_COCD_1030_ADM dm = new CO_COCD_1030_ADM();
	
		String g_cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String g_incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String g_mode = Util.checkString(req.getParameter("accflag"));
		String g_job_clsf = Util.checkString(req.getParameter("g_job_clsf"));
		String g_cd_clsf = Util.checkString(req.getParameter("g_cd_clsf"));
		String g_cd = Util.checkString(req.getParameter("g_cd"));
		String g_use_yn = Util.checkString(req.getParameter("g_use_yn"));
		String g_cdnm = Util.checkString(req.getParameter("g_cdnm"));
		String g_cd_abrv_nm = Util.checkString(req.getParameter("g_cd_abrv_nm"));
		String g_mang_cd_1 = Util.checkString(req.getParameter("g_mang_cd_1"));
		String g_mang_cd_2 = Util.checkString(req.getParameter("g_mang_cd_2"));
		String g_mang_cd_3 = Util.checkString(req.getParameter("g_mang_cd_3"));
		String g_mang_cd_4 = Util.checkString(req.getParameter("g_mang_cd_4"));
		String g_mang_cd_5 = Util.checkString(req.getParameter("g_mang_cd_5"));
		String g_mang_cd_6 = Util.checkString(req.getParameter("g_mang_cd_6"));
		String g_mang_cd_7 = Util.checkString(req.getParameter("g_mang_cd_7"));
		String g_mang_cd_8 = Util.checkString(req.getParameter("g_mang_cd_8"));
		String g_mang_cd_9 = Util.checkString(req.getParameter("g_mang_cd_9"));
		String g_mang_cd_10 = Util.checkString(req.getParameter("g_mang_cd_10"));
		String g_mang_cd_11 = Util.checkString(req.getParameter("g_mang_cd_11"));
		String g_mang_cd_12 = Util.checkString(req.getParameter("g_mang_cd_12"));
		String g_tbl_nm = Util.checkString(req.getParameter("g_tbl_nm"));
		String g_remk = Util.checkString(req.getParameter("g_remk"));
		String g_upd_yn = Util.checkString(req.getParameter("g_upd_yn"));
		        
        dm.setG_cmpy_cd(g_cmpy_cd);
		dm.setG_incmg_pers(g_incmg_pers);
		dm.setG_incmg_pers_ip(req.getRemoteAddr());
		dm.setG_mode(g_mode);
		dm.setG_job_clsf(g_job_clsf);
		dm.setG_cd_clsf(g_cd_clsf);
		dm.setG_cd(g_cd);
		dm.setG_use_yn(g_use_yn);
		dm.setG_cdnm(g_cdnm);
		dm.setG_cd_abrv_nm(g_cd_abrv_nm);
		dm.setG_mang_cd_1(g_mang_cd_1);
		dm.setG_mang_cd_2(g_mang_cd_2);
		dm.setG_mang_cd_3(g_mang_cd_3);
		dm.setG_mang_cd_4(g_mang_cd_4);
		dm.setG_mang_cd_5(g_mang_cd_5);
		dm.setG_mang_cd_6(g_mang_cd_6);
		dm.setG_mang_cd_7(g_mang_cd_7);
		dm.setG_mang_cd_8(g_mang_cd_8);
		dm.setG_mang_cd_9(g_mang_cd_9);
		dm.setG_mang_cd_10(g_mang_cd_10);
		dm.setG_mang_cd_11(g_mang_cd_11);
		dm.setG_mang_cd_12(g_mang_cd_12);
		dm.setG_tbl_nm(g_tbl_nm);
		dm.setG_remk(g_remk);
		dm.setG_upd_yn(g_upd_yn);

        //dm.print();
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String mode = (String)hash.get("m");
		String cd = (String)hash.get("cd");
		String use_yn = (String)hash.get("use_yn");
		String cdnm = (String)hash.get("cdnm");
		String cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		String mang_cd_1 = (String)hash.get("mang_cd_1");
		String mang_cd_2 = (String)hash.get("mang_cd_2");
		String mang_cd_3 = (String)hash.get("mang_cd_3");
		String mang_cd_4 = (String)hash.get("mang_cd_4");
		String mang_cd_5 = (String)hash.get("mang_cd_5");
		String mang_cd_6 = (String)hash.get("mang_cd_6");
		String mang_cd_7 = (String)hash.get("mang_cd_7");
		String mang_cd_8 = (String)hash.get("mang_cd_8");
		String mang_cd_9 = (String)hash.get("mang_cd_9");
		String mang_cd_10 = (String)hash.get("mang_cd_10");
		String mang_cd_11 = (String)hash.get("mang_cd_11");
		String mang_cd_12 = (String)hash.get("mang_cd_12");
		String tbl_nm = (String)hash.get("tbl_nm");
		String remk = (String)hash.get("remk");
		String upd_yn = (String)hash.get("upd_yn");

		dm.setMode(mode.toUpperCase());
		dm.setCd(cd);
		dm.setUse_yn(use_yn);
		dm.setCdnm(cdnm);
		dm.setCd_abrv_nm(cd_abrv_nm);
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
		dm.setTbl_nm(tbl_nm);
		dm.setRemk(remk);
		dm.setUpd_yn(upd_yn);
        
        dm.print();
/*        
        CO_COCD_1000EJBHome home = (CO_COCD_1000EJBHome) JNDIManager.getInstance().getHome("CO_COCD_1000EJB");
        
        try {
        	CO_COCD_1000EJB ejb = home.create();
            ds = ejb.co_cocd_1030_a(dm);
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
        CO_COCD_1030_ADataSet ds 	= (CO_COCD_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    
}
