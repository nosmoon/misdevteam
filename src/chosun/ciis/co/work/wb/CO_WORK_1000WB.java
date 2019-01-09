/***************************************************************************************************
* 파일명 : CO_WORK_1000WB.java
* 기능 : 마감작업
 * 작성일자 : 2009-06-04
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.co.work.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.work.dm.*;
import chosun.ciis.co.work.ds.*;

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

public class CO_WORK_1000WB extends BaseWB{

    /**
     * 초기화면
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void co_work_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		//CO_WORK_1000_MDataSet ds = null;
		CO_WORK_1000_MDM dm = new CO_WORK_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
/*
		try {
			CO_WORK_1000EJBHome home = (CO_WORK_1000EJBHome)JNDIManager.getInstance().getHome("CO_WORK_1000EJB");
			CO_WORK_1000EJB ejb = home.create();

			ds = ejb.co_work_1000_m(dm);
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
		DBManager manager = new DBManager("MISSEL");
		CO_WORK_1000_MDataSet ds = (CO_WORK_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}		
		req.setAttribute("ds", ds);
	}

    /**
     * 리스트
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void co_work_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		//CO_WORK_1010_LDataSet ds = null;
		CO_WORK_1010_LDM dm = new CO_WORK_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
//dm.print();
	
/*
		try {
			CO_WORK_1000EJBHome home = (CO_WORK_1000EJBHome)JNDIManager.getInstance().getHome("CO_WORK_1000EJB");
			CO_WORK_1000EJB ejb = home.create();

			ds = ejb.co_work_1010_l(dm);
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
		DBManager manager = new DBManager("MISSEL");
		CO_WORK_1010_LDataSet ds = (CO_WORK_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}			
		req.setAttribute("ds", ds);
	}
    
    
}
