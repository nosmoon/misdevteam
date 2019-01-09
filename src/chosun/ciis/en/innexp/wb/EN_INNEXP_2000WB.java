/***************************************************************************************************
* 파일명 : EN_INNEXP_2000WB.java
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

package chosun.ciis.en.innexp.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;
/**
 * 
 */

public class EN_INNEXP_2000WB extends BaseWB {

	public void en_innexp_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_2001_LDataSet ds = null;
		EN_INNEXP_2001_LDM dm = new EN_INNEXP_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		ds = (EN_INNEXP_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_2000EJBHome home = (EN_INNEXP_2000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_2000EJB");
			EN_INNEXP_2000EJB ejb = home.create();

			ds = ejb.en_innexp_2001_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.basi_dt = (String)hash.get("basi_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.basi_dt = Util.getSessionParameterValue(req,"basi_dt",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void en_innexp_2002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_2002_LDataSet ds = null;
		EN_INNEXP_2002_LDM dm = new EN_INNEXP_2002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.tab_mode = Util.checkString(req.getParameter("tab_mode"));

		dm.print();

		ds = (EN_INNEXP_2002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_2000EJBHome home = (EN_INNEXP_2000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_2000EJB");
			EN_INNEXP_2000EJB ejb = home.create();

			ds = ejb.en_innexp_2002_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.basi_dt = (String)hash.get("basi_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tab_mode = (String)hash.get("tab_mode");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.basi_dt = Util.getSessionParameterValue(req,"basi_dt",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tab_mode = Util.getSessionParameterValue(req,"tab_mode",true);
		*******************************************************************************************/
	}

}