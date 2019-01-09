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

package chosun.ciis.as.com.wb;

import java.rmi.RemoteException;
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
import chosun.ciis.as.base.ds.AS_BASE_1001_LDataSet;
import chosun.ciis.as.com.dm.*;
import chosun.ciis.as.com.ds.*;

/**
 * 
 */

public class AS_COM_1000WB extends BaseWB {
    /**
     * 멀티레코드처리 row 구분자
     */
//    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
//    public final String COL_SEPARATOR = "#";
    
	
	public void as_com_1000_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_COM_1000_SDataSet ds = null;
		AS_COM_1000_SDM dm = new AS_COM_1000_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_COM_1000_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
				
/*
		try {
			AS_COM_1000EJBHome home = (AS_COM_1000EJBHome)JNDIManager.getInstance().getHome("AS_COM_1000EJB");
			AS_COM_1000EJB ejb = home.create();

			ds = ejb.as_com_1000_s(dm);
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
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}

	public void as_com_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_COM_1100_LDataSet ds = null;
		AS_COM_1100_LDM dm = new AS_COM_1100_LDM();

		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_COM_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
				
/*		
		try {
			AS_COM_1000EJBHome home = (AS_COM_1000EJBHome)JNDIManager.getInstance().getHome("AS_COM_1000EJB");
			AS_COM_1000EJB ejb = home.create();

			ds = ejb.as_com_1100_l(dm);
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
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.dlco_no = (String)hash.get("dlco_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		*******************************************************************************************/
	}

	public void as_com_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_COM_1200_LDataSet ds = null;
		AS_COM_1200_LDM dm = new AS_COM_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.srch_budg_cd = Util.checkString(req.getParameter("srch_budg_cd"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_COM_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
								
/*		
		try {
			AS_COM_1000EJBHome home = (AS_COM_1000EJBHome)JNDIManager.getInstance().getHome("AS_COM_1000EJB");
			AS_COM_1000EJB ejb = home.create();

			ds = ejb.as_com_1200_l(dm);
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
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/
	}
	
	public void as_com_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_COM_1300_LDataSet ds = null;
		AS_COM_1300_LDM dm = new AS_COM_1300_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.srch_dept_cd = Util.checkString(req.getParameter("srch_dept_cd"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_COM_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_COM_1000EJBHome home = (AS_COM_1000EJBHome)JNDIManager.getInstance().getHome("AS_COM_1000EJB");
			AS_COM_1000EJB ejb = home.create();

			ds = ejb.as_com_1300_l(dm);
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
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.srch_dept_cd = (String)hash.get("srch_dept_cd");
		*******************************************************************************************/
	}
	
	public void as_com_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_COM_1600_LDataSet ds = null;
		AS_COM_1600_LDM dm = new AS_COM_1600_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.srch_aset_no = Util.checkString(req.getParameter("srch_aset_no"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_COM_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
		
/*		
		try {
			AS_COM_1000EJBHome home = (AS_COM_1000EJBHome)JNDIManager.getInstance().getHome("AS_COM_1000EJB");
			AS_COM_1000EJB ejb = home.create();

			ds = ejb.as_com_1600_l(dm);
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
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.srch_aset_no = (String)hash.get("srch_aset_no");
		*******************************************************************************************/
	}
	
	public void as_com_1800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_COM_1800_LDataSet ds = null;
		AS_COM_1800_LDM dm = new AS_COM_1800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.srch_bund_cd = Util.checkString(req.getParameter("srch_bund_cd"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_COM_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
				
/*		
		try {
			AS_COM_1000EJBHome home = (AS_COM_1000EJBHome)JNDIManager.getInstance().getHome("AS_COM_1000EJB");
			AS_COM_1000EJB ejb = home.create();

			ds = ejb.as_com_1800_l(dm);
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
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.srch_bund_cd = (String)hash.get("srch_bund_cd");
		*******************************************************************************************/
	}
    
	public void as_com_1900_l(HttpServletRequest req, HttpServletResponse res) throws AppException {

		AS_COM_1900_LDataSet ds = null;
		AS_COM_1900_LDM dm = new AS_COM_1900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_COM_1900_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
/*		
		try {
			AS_COM_1000EJBHome home = (AS_COM_1000EJBHome)JNDIManager.getInstance().getHome("AS_COM_1000EJB");
			AS_COM_1000EJB ejb = home.create();

			ds = ejb.as_com_1900_l(dm);
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
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		*******************************************************************************************/
	}

}
