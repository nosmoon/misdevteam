package chosun.ciis.fc.func.wb; 

import java.rmi.*;
import java.sql.SQLException;
import java.util.*;

import javax.ejb.*;
import javax.servlet.http.*;

import somo.framework.db.DBManager;
import somo.framework.expt.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

public class FC_FUNC_1000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_9999_LDataSet ds = null;
		FC_FUNC_9999_LDM dm = new FC_FUNC_9999_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();
			ds = ejb.getDummyList(dm);
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
		EJB 수정전 끝 */
	}
	
	public void fc_func_1120_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1120_MDataSet ds = null;
		FC_FUNC_1120_MDM dm = new FC_FUNC_1120_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);


		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1120_m(dm);
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
		EJB 수정전 끝 */
	}
	public void fc_func_1121_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1121_LDataSet ds = null;
		FC_FUNC_1121_LDM dm = new FC_FUNC_1121_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr1 = Util.checkString(req.getParameter("fr1"));
		dm.to1 = Util.checkString(req.getParameter("to1"));
		dm.fr2 = Util.checkString(req.getParameter("fr2"));
		dm.to2 = Util.checkString(req.getParameter("to2"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1121_l(dm);
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
		EJB 수정전 끝 */
	}
		public void fc_func_1122_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1122_LDataSet ds = null;
			FC_FUNC_1122_LDM dm = new FC_FUNC_1122_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.fr1 = Util.checkString(req.getParameter("fr1"));
			dm.to1 = Util.checkString(req.getParameter("to1"));
			dm.fr2 = Util.checkString(req.getParameter("fr2"));
			dm.to2 = Util.checkString(req.getParameter("to2"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1122_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1122_l(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1151_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1151_LDataSet ds = null;
			FC_FUNC_1151_LDM dm = new FC_FUNC_1151_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1151_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1151_l(dm);
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
			EJB 수정전 끝 */

			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			dm.stlm_dt = (String)hash.get("stlm_dt");
			*******************************************************************************************/
		}
		public void fc_func_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1000_MDataSet ds = null;
			FC_FUNC_1000_MDM dm = new FC_FUNC_1000_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1000_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1000_m(dm);
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
			EJB 수정전 끝 */

			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			*******************************************************************************************/
		}
		public void fc_func_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1001_LDataSet ds = null;
			FC_FUNC_1001_LDM dm = new FC_FUNC_1001_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1001_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1001_l(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1002_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1002_UDataSet ds = null;
			FC_FUNC_1002_UDM dm = new FC_FUNC_1002_UDM();
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
			dm.rcpm_slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
			dm.rcpm_seq = Util.checkString(req.getParameter("rcpm_seq"));
			dm.rcpm_sub_seq = Util.checkString(req.getParameter("rcpm_sub_seq"));
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
			dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.note_amt = Util.checkString(req.getParameter("note_amt"));
			dm.pay_plac_cd = Util.checkString(req.getParameter("pay_plac_cd"));
			dm.note_clehous_cd = Util.checkString(req.getParameter("note_clehous_cd"));
			dm.issu_cmpy_clsf_cd = Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
			dm.issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
			dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
			dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
			dm.sale_dscn_amt = Util.checkString(req.getParameter("sale_dscn_amt"));
			dm.note_clsf_cd2 = Util.checkString(req.getParameter("note_clsf_cd2"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1002_UDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */		

			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1002_u(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1020_LDataSet ds = null;
			FC_FUNC_1020_LDM dm = new FC_FUNC_1020_LDM();

			dm.cmpy_cd 			= Util.getSessionParameterValue(req,"cmpycd",true);
			dm.now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
			dm.note_amt 		= Util.checkString(req.getParameter("note_amt"));
			dm.pch_cymd1fr 		= Util.checkString(req.getParameter("pch_cymd1fr"));
			dm.pch_cymd1to 		= Util.checkString(req.getParameter("pch_cymd1to"));
			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1020_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1020_l(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1021_LDataSet ds = null;
			FC_FUNC_1021_LDM dm = new FC_FUNC_1021_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1021_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1021_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1022_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1022_IDataSet ds = null;
			FC_FUNC_1022_IDM dm = new FC_FUNC_1022_IDM();
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			dm.bank_cd = (String)hash.get("bank_cd");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_seq");
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1022_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1022_i(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1023_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1023_DDataSet ds = null;
			FC_FUNC_1023_DDM dm = new FC_FUNC_1023_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			dm.bank_cd = (String)hash.get("bank_cd");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_seq");
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1023_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1023_d(dm);
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
			EJB 수정전 끝 */
		}
		
		public void fc_func_1024_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1024_MDataSet ds = null;
			FC_FUNC_1024_MDM dm = new FC_FUNC_1024_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1024_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);

			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			dm.incmg_pers = (String)hash.get("incmg_pers");
			*******************************************************************************************/

			/*******************************************************************************************
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
			*******************************************************************************************/
		}

		public void fc_func_1030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1030_MDataSet ds = null;
			FC_FUNC_1030_MDM dm = new FC_FUNC_1030_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1030_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1030_m(dm);
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
			EJB 수정전 끝 */
		}

		public void fc_func_1031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1031_LDataSet ds = null;
			FC_FUNC_1031_LDM dm = new FC_FUNC_1031_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1031_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1031_l(dm);
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
			EJB 수정전 끝 */
		}

		public void fc_func_1032_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1032_IDataSet ds = null;
			FC_FUNC_1032_IDM dm = new FC_FUNC_1032_IDM();

			dm.clsf = Util.checkString(req.getParameter("clsf"));
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.dlco_cdnm = Util.checkString(req.getParameter("dlco_cdnm"));
			dm.deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.deptcd = Util.getSessionParameterValue(req,"deptcd",true);			
			
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			dm.row_no = (String)hash.get("row_no");
			dm.bank_cd = (String)hash.get("bank_cd");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_seq");
			dm.rcpay_amt = (String)hash.get("note_amt");
			dm.coms = (String)hash.get("coms");
			dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
			dm.mtry_dt = (String)hash.get("mtry_dt");
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1032_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1032_i(dm);
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
			EJB 수정전 끝 */
		}

		public void fc_func_1033_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1033_DDataSet ds = null;
			FC_FUNC_1033_DDM dm = new FC_FUNC_1033_DDM();

			String slip_no = Util.checkString(req.getParameter("slip_no"));
			
			dm.clsf = Util.checkString(req.getParameter("clsf"));
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.slip_occr_dt = slip_no.substring(0,8);
			dm.slip_clsf_cd = slip_no.substring(9,11);
			dm.slip_seq = slip_no.substring(12);
			dm.row_no = Util.checkString(req.getParameter("row_no"));
			dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
		
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1033_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */	
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1033_d(dm);
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
			EJB 수정전 끝 */
		}
		
		public void fc_func_1040_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1040_LDataSet ds = null;
			FC_FUNC_1040_LDM dm = new FC_FUNC_1040_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
			dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1040_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1040_l(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1041_LDataSet ds = null;
			FC_FUNC_1041_LDM dm = new FC_FUNC_1041_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.pch_sql = req.getParameter("pch_sql");
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1041_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1041_l(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1042_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1042_IDataSet ds = null;
			FC_FUNC_1042_IDM dm = new FC_FUNC_1042_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
			dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
			dm.pch_amt = Util.checkString(req.getParameter("pch_amt"));

			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			dm.bank_cd = (String)hash.get("bank_cd");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_seq");
			dm.note_amt = (String)hash.get("note_amt");
			dm.coms = (String)hash.get("coms");
			dm.comp_dt = (String)hash.get("comp_dt");
			dm.mtry_dt = (String)hash.get("mtry_dt");
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1042_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1042_i(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1043_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1043_DDataSet ds = null;
			FC_FUNC_1043_DDM dm = new FC_FUNC_1043_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.pch_count = Util.checkString(req.getParameter("pch_count"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1043_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1043_d(dm);
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
			EJB 수정전 끝 */
		}
		
		public void fc_func_1044_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1044_MDataSet ds = null;
			FC_FUNC_1044_MDM dm = new FC_FUNC_1044_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			dm.print();

			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1044_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}
			
			req.setAttribute("ds", ds);

			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			dm.incmg_pers = (String)hash.get("incmg_pers");
			*******************************************************************************************/

			/*******************************************************************************************
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
			*******************************************************************************************/
		}
		
		public void fc_func_1050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1050_MDataSet ds = null;
			FC_FUNC_1050_MDM dm = new FC_FUNC_1050_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1050_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */		
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1050_m(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1051_LDataSet ds = null;
			FC_FUNC_1051_LDM dm = new FC_FUNC_1051_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
			dm.kind = Util.checkString(req.getParameter("kind"));

			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1051_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1051_l(dm);
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
			EJB 수정전 끝 */
			
			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			dm.now_note_stat_cd = (String)hash.get("now_note_stat_cd");
			dm.mtry_dt = (String)hash.get("mtry_dt");
			dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
			dm.dlco_cd = (String)hash.get("dlco_cd");
			dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
			dm.kind = (String)hash.get("kind");
			*******************************************************************************************/

			/*******************************************************************************************
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
			dm.now_note_stat_cd = Util.getSessionParameterValue(req,"now_note_stat_cd",true);
			dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
			dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
			dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
			dm.note_clsf_cd = Util.getSessionParameterValue(req,"note_clsf_cd",true);
			dm.kind = Util.getSessionParameterValue(req,"kind",true);
			*******************************************************************************************/
		}
		public void fc_func_1052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1052_LDataSet ds = null;
			FC_FUNC_1052_LDM dm = new FC_FUNC_1052_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.pch_sql = Util.checkString(req.getParameter("pch_sql"));
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1052_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1052_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1053_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1053_IDataSet ds = null;
			FC_FUNC_1053_IDM dm = new FC_FUNC_1053_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
			dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
			dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
			dm.exrate = Util.checkString(req.getParameter("exrate"));
			dm.deps_dt = Util.checkString(req.getParameter("deps_dt"));
			dm.hjphwamt = Util.checkString(req.getParameter("hjphwamt"));
			dm.biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
			dm.bank_id = Util.checkString(req.getParameter("bank_id"));
			dm.acct_num = Util.checkString(req.getParameter("acct_num"));
			dm.tran_date = Util.checkString(req.getParameter("tran_date"));
			dm.tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
			dm.tran_amt = Util.checkString(req.getParameter("tran_amt"));			
			
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			dm.bank_cd = (String)hash.get("bank_cd");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_seq");
			dm.rcpay_amt = (String)hash.get("note_amt2");
			dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
			dm.mtry_dt = (String)hash.get("mtry_dt");
			dm.pch_amt = (String)hash.get("note_amt");
			dm.frcr_amt = (String)hash.get("frex_amt");
			dm.coms = (String)hash.get("coms");
			
			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1053_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1053_i(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1054_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1054_DDataSet ds = null;
			FC_FUNC_1054_DDM dm = new FC_FUNC_1054_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.pch_count = Util.checkString(req.getParameter("pch_count"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1054_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */	
			
			/* EJB 수정전 시작			
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1054_d(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1420_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1420_MDataSet ds = null;
			FC_FUNC_1420_MDM dm = new FC_FUNC_1420_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1420_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1420_m(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1421_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1421_LDataSet ds = null;
			FC_FUNC_1421_LDM dm = new FC_FUNC_1421_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.fr_befo_note_stat_dt = Util.checkString(req.getParameter("fr_befo_note_stat_dt"));
			dm.to_befo_note_stat_dt = Util.checkString(req.getParameter("to_befo_note_stat_dt"));
			dm.note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1421_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1421_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1430_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1430_LDataSet ds = null;
			FC_FUNC_1430_LDM dm = new FC_FUNC_1430_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.opt = Util.checkString(req.getParameter("opt"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1430_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1430_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1440_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1440_MDataSet ds = null;
			FC_FUNC_1440_MDM dm = new FC_FUNC_1440_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1440_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1440_m(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1441_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1441_LDataSet ds = null;
			FC_FUNC_1441_LDM dm = new FC_FUNC_1441_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt1 = Util.checkString(req.getParameter("stat_dt1"));
			dm.stat_dt2 = Util.checkString(req.getParameter("stat_dt2"));
			dm.stat_cd1 = Util.checkString(req.getParameter("stat_cd1"));
			dm.stat_cd2 = Util.checkString(req.getParameter("stat_cd2"));
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1441_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1441_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1060_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1060_MDataSet ds = null;
			FC_FUNC_1060_MDM dm = new FC_FUNC_1060_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1060_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1060_m(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1061_LDataSet ds = null;
			FC_FUNC_1061_LDM dm = new FC_FUNC_1061_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.setoff_reserv_dt = Util.checkString(req.getParameter("setoff_reserv_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.pch_sql = Util.checkString(req.getParameter("pch_sql"));
		
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1061_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1061_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1062_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1062_LDataSet ds = null;
			FC_FUNC_1062_LDM dm = new FC_FUNC_1062_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.note_amt = Util.checkString(req.getParameter("note_amt"));
			dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
			dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1062_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1062_l(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1063_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1063_LDataSet ds = null;
			FC_FUNC_1063_LDM dm = new FC_FUNC_1063_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1063_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1063_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1064_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1064_IDataSet ds = null;
			FC_FUNC_1064_IDM dm = new FC_FUNC_1064_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.pch_amt1 = Util.checkString(req.getParameter("pch_amt1"));
			dm.pch_amt2 = Util.checkString(req.getParameter("pch_amt2"));
			dm.pch_amt3 = Util.checkString(req.getParameter("pch_amt3"));
			dm.pch_sql = Util.checkString(req.getParameter("pch_sql"));
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
			dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
			dm.pch_amt4 = Util.checkString(req.getParameter("pch_amt4"));
			dm.pch_amt5 = Util.checkString(req.getParameter("pch_amt5"));
			
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			dm.bank_cd = (String)hash.get("bank_cd");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_seq");
			dm.rcpay_amt = (String)hash.get("note_amt");
			dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
			dm.mtry_dt = (String)hash.get("mtry_dt");
			
			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1064_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1064_i(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1065_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1065_DDataSet ds = null;
			FC_FUNC_1065_DDM dm = new FC_FUNC_1065_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.pch_count = Util.checkString(req.getParameter("pch_count"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1065_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1065_d(dm);
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
			EJB 수정전 끝 */

		}
//		
//		DBManager manager = new DBManager("MISFNC");
//		FC_FUNC_1070_MDataSet ds = (FC_FUNC_1070_MDataSet)manager.executeCall(dm);
//
//		if(!ds.getErrcode().equals("")) {
//			throw new AppException(ds.getErrcode(), ds.getErrmsg());
//		}
//
//		return ds;
//		
		
		public void fc_func_1070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1070_MDataSet ds = null;
			FC_FUNC_1070_MDM dm = new FC_FUNC_1070_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1070_MDataSet)manager.executeCall(dm);
	
			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}
	
			req.setAttribute("ds", ds);

			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			dm.incmg_pers = (String)hash.get("incmg_pers");
			*******************************************************************************************/

			/*******************************************************************************************
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
			*******************************************************************************************/
		}
		
		public void fc_func_1071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1071_LDataSet ds = null;
			FC_FUNC_1071_LDM dm = new FC_FUNC_1071_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
			dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1071_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1071_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1074_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1074_LDataSet ds = null;
			FC_FUNC_1074_LDM dm = new FC_FUNC_1074_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			
			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1074_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1074_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1075_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1075_LDataSet ds = null;
			FC_FUNC_1075_LDM dm = new FC_FUNC_1075_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1075_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1075_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1072_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1072_IDataSet ds = null;
			FC_FUNC_1072_IDM dm = new FC_FUNC_1072_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1072_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1072_i(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1073_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1073_DDataSet ds = null;
			FC_FUNC_1073_DDM dm = new FC_FUNC_1073_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.pch_count = Util.checkString(req.getParameter("pch_count"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1073_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1073_d(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1080_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1080_MDataSet ds = null;
			FC_FUNC_1080_MDM dm = new FC_FUNC_1080_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1080_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1080_m(dm);
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
			EJB 수정전 끝 */
			
		}

		public void fc_func_1081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1081_LDataSet ds = null;
			FC_FUNC_1081_LDM dm = new FC_FUNC_1081_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.chkpjee = Util.checkString(req.getParameter("chkpjee"));
			dm.place = Util.checkString(req.getParameter("place"));

			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1081_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1081_l(dm);
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
			EJB 수정전 끝 */
			
			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			dm.mtry_dt = (String)hash.get("mtry_dt");
			dm.chkpjee = (String)hash.get("chkpjee");
			dm.place = (String)hash.get("place");
			*******************************************************************************************/

			/*******************************************************************************************
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
			dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
			dm.chkpjee = Util.getSessionParameterValue(req,"chkpjee",true);
			dm.place = Util.getSessionParameterValue(req,"place",true);
			*******************************************************************************************/
		}

		public void fc_func_1082_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1082_LDataSet ds = null;
			FC_FUNC_1082_LDM dm = new FC_FUNC_1082_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			
			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1082_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1082_l(dm);
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
			EJB 수정전 끝 */

		}

		public void fc_func_1083_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1083_IDataSet ds = null;
			FC_FUNC_1083_IDM dm = new FC_FUNC_1083_IDM();

			dm.clsf = Util.checkString(req.getParameter("clsf"));
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.dlco_cdnm = Util.checkString(req.getParameter("dlco_cdnm"));
			dm.deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.deptcd = Util.getSessionParameterValue(req,"deptcd",true);
			dm.row_no = Util.checkString(req.getParameter("row_no"));
			dm.place = Util.checkString(req.getParameter("place"));
			dm.biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
			dm.bank_id = Util.checkString(req.getParameter("bank_id"));
			dm.acct_num = Util.checkString(req.getParameter("acct_num"));
			dm.tran_date = Util.checkString(req.getParameter("tran_date"));
			dm.tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
			dm.tran_amt = Util.checkString(req.getParameter("tran_amt"));
			
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.note_amt = (String)hash.get("note_amt");		
			dm.bank_cd = (String)hash.get("note_no");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_no");
			dm.rcpay_amt = (String)hash.get("rcpay_amt");
			dm.corp_tax = (String)hash.get("corp_tax");
			dm.etc_prft = (String)hash.get("etc_prft");
			dm.note_clsf_cd = (String)hash.get("note_clsf_cdnm");
			dm.mtry_dt = (String)hash.get("mtry_dt");
			dm.comp_dt = (String)hash.get("comp_dt");
			
			dm.print();
						
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1083_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1083_i(dm);
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
			EJB 수정전 끝 */
			
		}

		public void fc_func_1084_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1084_DDataSet ds = null;
			FC_FUNC_1084_DDM dm = new FC_FUNC_1084_DDM();

			String slip_no = Util.checkString(req.getParameter("slip_no"));
			
			dm.clsf = Util.checkString(req.getParameter("clsf"));
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.row_no = Util.checkString(req.getParameter("row_no"));
			dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();

			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1084_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1084_d(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1085_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1085_LDataSet ds = null;
			FC_FUNC_1085_LDM dm = new FC_FUNC_1085_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));

			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1085_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1085_l(dm);
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
			EJB 수정전 끝 */

			/*******************************************************************************************
			String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.cmpy_cd = (String)hash.get("cmpy_cd");
			dm.note_no = (String)hash.get("note_no");
			dm.note_seq = (String)hash.get("note_seq");
			*******************************************************************************************/

			/*******************************************************************************************
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
			dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
			dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
			*******************************************************************************************/
		}		
		public void fc_func_1091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1091_LDataSet ds = null;
			FC_FUNC_1091_LDM dm = new FC_FUNC_1091_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1091_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1091_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1092_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1092_LDataSet ds = null;
			FC_FUNC_1092_LDM dm = new FC_FUNC_1092_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1092_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1092_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1090_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1090_MDataSet ds = null;
			FC_FUNC_1090_MDM dm = new FC_FUNC_1090_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1090_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1090_m(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1093_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1093_LDataSet ds = null;
			FC_FUNC_1093_LDM dm = new FC_FUNC_1093_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1093_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1093_l(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1094_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1094_LDataSet ds = null;
			FC_FUNC_1094_LDM dm = new FC_FUNC_1094_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1094_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1094_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1097_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1097_LDataSet ds = null;
			FC_FUNC_1097_LDM dm = new FC_FUNC_1097_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.repl_dt = Util.checkString(req.getParameter("repl_dt"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1097_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1097_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1095_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1095_IDataSet ds = null;
			FC_FUNC_1095_IDM dm = new FC_FUNC_1095_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
//			System.out.println("WB : 1");
			String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
			Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
			dm.b_bank_cd = (String)hash1.get("b_bank_cd");
			dm.b_note_no = (String)hash1.get("b_note_no");
			dm.b_note_seq = (String)hash1.get("b_note_seq");
			dm.b_rcpay_amt = (String)hash1.get("b_rcpay_amt");
			dm.b_pch_cymd1to = (String)hash1.get("b_pch_cymd1to");
//			System.out.println("WB : 2");
			String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
			Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
//			System.out.println("WB : 2_1");
			dm.a_bank_cd = (String)hash3.get("a_bank_cd");
			dm.a_note_no = (String)hash3.get("a_note_no");
			dm.a_note_clsf_cd = (String)hash3.get("a_note_clsf_cd");
			dm.a_note_amt = (String)hash3.get("a_note_amt");
			dm.a_comp_dt = (String)hash3.get("a_comp_dt");
			dm.a_mtry_dt = (String)hash3.get("a_mtry_dt");
			dm.a_issu_cmpy_clsf_cd = (String)hash3.get("a_issu_cmpy_clsf_cd");
			dm.a_issu_pers_nm = (String)hash3.get("a_issu_pers_nm");
			dm.a_rcpm_acct = (String)hash3.get("a_rcpm_acct");
			dm.a_sale_aprv_no = (String)hash3.get("a_sale_aprv_no");
			dm.a_note_clsf_cd2 = (String)hash3.get("a_note_clsf_cd2");
//			System.out.println("WB : 2_3");
//			System.out.println("WB : 3");
			String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5"));
			Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
			dm.c_budg_cd = (String)hash5.get("c_budg_cd");
			dm.c_repl_amt = (String)hash5.get("cashamt");
			dm.c_deps_clsf_cd = (String)hash5.get("c_deps_clsf_cd");
			dm.c_deps_dt = (String)hash5.get("c_deps_dt");
			dm.c_frex_cd = (String)hash5.get("c_frex_cd");
			dm.c_exrate = (String)hash5.get("c_exrate");
			dm.c_frex_amt = (String)hash5.get("c_frex_amt");
			dm.c_trufnd_slip_clsf = (String)hash5.get("c_trufnd_slip_clsf");
			dm.c_trufnd_slip_no = (String)hash5.get("c_trufnd_slip_no");
//			System.out.println("WB : 4");
			String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
			Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
			dm.p_budg_cd = (String)hash2.get("p_budg_cd");
			dm.p_repl_amt = (String)hash2.get("p_repl_amt");
			dm.p_deps_clsf_cd = (String)hash2.get("p_deps_clsf_cd");
			dm.p_deps_dt = (String)hash2.get("p_deps_dt");
			dm.p_frex_cd = (String)hash2.get("p_frex_cd");
			dm.p_exrate = (String)hash2.get("p_exrate");
			dm.p_frex_amt = (String)hash2.get("p_frex_amt");
			dm.p_trufnd_slip_clsf = (String)hash2.get("p_trufnd_slip_clsf");
			dm.p_trufnd_slip_no = (String)hash2.get("p_trufnd_slip_no");
			dm.biz_reg_no = (String)hash2.get("biz_reg_no");
			dm.bank_id = (String)hash2.get("bank_id");
			dm.acct_num = (String)hash2.get("acct_num");
			dm.tran_date_seq = (String)hash2.get("tran_date_seq");			
//			System.out.println("WB : 5");
			String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
			Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
			dm.y_budg_cd = (String)hash4.get("budg_cd");
			dm.y_repl_amt = (String)hash4.get("repl_amt");
			dm.y_deps_clsf_cd = (String)hash4.get("y_deps_clsf_cd");
			dm.y_deps_dt = (String)hash4.get("y_deps_dt");
			dm.y_frex_cd = (String)hash4.get("y_frex_cd");
			dm.y_exrate = (String)hash4.get("y_exrate");
			dm.y_frex_amt = (String)hash4.get("y_frex_amt");
			dm.y_trufnd_slip_clsf = (String)hash4.get("trufnd_slip_clsf");
			dm.y_trufnd_slip_no = (String)hash4.get("trufnd_slip_no");
//			System.out.println("WB : 6");
			dm.jobamt = Util.checkString(req.getParameter("jobamt"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1095_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1095_i(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1096_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1096_DDataSet ds = null;
			FC_FUNC_1096_DDM dm = new FC_FUNC_1096_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1096_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1096_d(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1361_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1361_LDataSet ds = null;
			FC_FUNC_1361_LDM dm = new FC_FUNC_1361_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			
			dm.print();

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1361_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1361_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1100_LDataSet ds = null;
			FC_FUNC_1100_LDM dm = new FC_FUNC_1100_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1100_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1100_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1103_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1103_MDataSet ds = null;
			FC_FUNC_1103_MDM dm = new FC_FUNC_1103_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1103_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1103_m(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1104_LDataSet ds = null;
			FC_FUNC_1104_LDM dm = new FC_FUNC_1104_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));

			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1104_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1104_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1101_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1101_IDataSet ds = null;
			FC_FUNC_1101_IDM dm = new FC_FUNC_1101_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers =	Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipad = req.getRemoteAddr();
			dm.use_dept_cd = Util.getSessionParameterValue(req, "deptcd",true);
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
			dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
			dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
			dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
			dm.deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
			dm.patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
			dm.deps_dt = Util.checkString(req.getParameter("deps_dt"));
			dm.dhon_resn_cd = Util.checkString(req.getParameter("dhon_resn_cd"));
			dm.dhon_occr_dt = Util.checkString(req.getParameter("dhon_occr_dt"));
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.pch_budosayunm = Util.checkString(req.getParameter("pch_budosayunm"));
			dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
			dm.exrate = Util.checkString(req.getParameter("exrate"));
			dm.frex_amt = Util.checkString(req.getParameter("frex_amt"));
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1101_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */		
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1101_i(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1102_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1102_DDataSet ds = null;
			FC_FUNC_1102_DDM dm = new FC_FUNC_1102_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipad = req.getRemoteAddr();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1102_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */

			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1102_d(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1110_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1110_MDataSet ds = null;
			FC_FUNC_1110_MDM dm = new FC_FUNC_1110_MDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1110_MDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1110_m(dm);
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
			EJB 수정전 끝 */
		}
		public void fc_func_1111_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1111_LDataSet ds = null;
			FC_FUNC_1111_LDM dm = new FC_FUNC_1111_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1111_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1111_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1112_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1112_LDataSet ds = null;
			FC_FUNC_1112_LDM dm = new FC_FUNC_1112_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1112_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1112_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1113_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1113_LDataSet ds = null;
			FC_FUNC_1113_LDM dm = new FC_FUNC_1113_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.tms = Util.checkString(req.getParameter("tms"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1113_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1113_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1114_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1114_LDataSet ds = null;
			FC_FUNC_1114_LDM dm = new FC_FUNC_1114_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1114_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1114_l(dm);
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
			EJB 수정전 끝 */

		}
		public void fc_func_1115_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1115_IDataSet ds = null;
			FC_FUNC_1115_IDM dm = new FC_FUNC_1115_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));
			dm.extnc_ptcr = Util.checkString(req.getParameter("extnc_ptcr"));
			dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
			dm.use_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);

			String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5"));
			Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
			dm.budg_cd = "001100";
			dm.dr_amt = (String)hash5.get("c_repl_amt");
			
			String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
			Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
			dm.p_budg_cd = (String)hash2.get("p_budg_cd");
			dm.p_repl_amt = (String)hash2.get("p_repl_amt");
			dm.p_deps_clsf_cd = (String)hash2.get("p_deps_clsf_cd");
			dm.p_deps_dt = (String)hash2.get("p_deps_dt");
			dm.p_frex_cd = (String)hash2.get("p_frex_cd");
			dm.p_exrate = (String)hash2.get("p_exrate");
			dm.p_frex_amt = (String)hash2.get("p_frex_amt");
			dm.p_trufnd_slip_clsf = (String)hash2.get("p_trufnd_slip_clsf");
			dm.p_trufnd_slip_no = (String)hash2.get("p_trufnd_slip_no");
			dm.biz_reg_no = (String)hash2.get("biz_reg_no");
			dm.bank_id = (String)hash2.get("bank_id");
			dm.acct_num = (String)hash2.get("acct_num");
			dm.tran_date_seq = (String)hash2.get("tran_date_seq");
			
			String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
			Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);			
			dm.y_budg_cd = (String)hash4.get("y_budg_cd");
			dm.y_repl_amt = (String)hash4.get("y_repl_amt");
			dm.y_deps_clsf_cd = (String)hash4.get("y_deps_clsf_cd");
			dm.y_deps_dt = (String)hash4.get("y_deps_dt");
			dm.y_frex_cd = (String)hash4.get("y_frex_cd");
			dm.y_exrate = (String)hash4.get("y_exrate");
			dm.y_frex_amt = (String)hash4.get("y_frex_amt");
			dm.y_trufnd_slip_clsf = (String)hash4.get("y_trufnd_slip_clsf");
			dm.y_trufnd_slip_no = (String)hash4.get("y_trufnd_slip_no");

			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1115_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */			
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1115_i(dm);
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
			EJB 수정전 끝 */
			
		}		
		public void fc_func_1116_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1116_DDataSet ds = null;
			FC_FUNC_1116_DDM dm = new FC_FUNC_1116_DDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
			dm.note_no = Util.checkString(req.getParameter("note_no"));
			dm.note_seq = Util.checkString(req.getParameter("note_seq"));
			dm.tms = Util.checkString(req.getParameter("tms"));
			dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
			dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
			dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1116_DDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */		
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1116_d(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1200_LDataSet ds = null;
			FC_FUNC_1200_LDM dm = new FC_FUNC_1200_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1200_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1200_l(dm);
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
			EJB 수정전 끝 */
			
		}
		public void fc_func_1201_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			FC_FUNC_1201_IDataSet ds = null;
			FC_FUNC_1201_IDM dm = new FC_FUNC_1201_IDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();
			
			dm.print();
			
			/* EJB 수정후 시작 */
			DBManager manager = new DBManager("MISFNC");
			ds = (FC_FUNC_1201_IDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
			/* EJB 수정후 끝 */
			
			/* EJB 수정전 시작
			try {
				FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
				FC_FUNC_1000EJB ejb = home.create();

				ds = ejb.fc_func_1201_i(dm);
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
			EJB 수정전 끝 */
			
		}

    public void fc_func_1130_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

        FC_FUNC_1130_LDataSet ds = null;

        // DM Setting
        FC_FUNC_1130_LDM dm = new FC_FUNC_1130_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String bank_cd  = Util.checkString(req.getParameter("bank_cd"));
        String note_no   = Util.checkString(req.getParameter("note_no"));
        String note_seq   = Util.checkString(req.getParameter("note_seq"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setBank_cd(bank_cd);
        dm.setNote_no(note_no);
        dm.setNote_seq(note_seq);
        
        /* EJB 수정후 시작 */
        DBManager manager = new DBManager("MISFNC");
        ds = (FC_FUNC_1130_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
        	throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        req.setAttribute("ds", ds);
        /* EJB 수정후 끝 */        
        
        /* EJB 수정전 시작
        try {
        	FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome) JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");        
        	FC_FUNC_1000EJB ejb = home.create();
            ds = ejb.fc_func_1130_l(dm);
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
        EJB 수정전 끝 */
        
    }


    public void fc_func_1140_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

        FC_FUNC_1140_LDataSet ds = null;

        // DM Setting
        FC_FUNC_1140_LDM dm = new FC_FUNC_1140_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String totz_dt   = Util.checkString(req.getParameter("totz_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setTotz_dt(totz_dt);
        
        /* EJB 수정후 시작 */
        DBManager manager = new DBManager("MISFNC");
        ds = (FC_FUNC_1140_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
        	throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        req.setAttribute("ds", ds);
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작
        try {
        	FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome) JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");        
            FC_FUNC_1000EJB ejb = home.create();
            ds = ejb.fc_func_1140_l(dm);
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
        EJB 수정전 끝 */
        
    }

    public void fc_func_1160_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

        FC_FUNC_1160_LDataSet ds = null;

        // DM Setting
        FC_FUNC_1160_LDM dm = new FC_FUNC_1160_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String rcpay_dt   = Util.checkString(req.getParameter("rcpay_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setRcpay_dt(rcpay_dt);
        
        /* EJB 수정후 시작 */
        DBManager manager = new DBManager("MISFNC");
        ds = (FC_FUNC_1160_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
        	throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        req.setAttribute("ds", ds);
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작
        try {
            FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome) JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");        
            FC_FUNC_1000EJB ejb = home.create();
            ds = ejb.fc_func_1160_l(dm);
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
        EJB 수정전 끝 */
        
    }

    public void fc_func_1170_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

        FC_FUNC_1170_LDataSet ds = null;

        // DM Setting
        FC_FUNC_1170_LDM dm = new FC_FUNC_1170_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String now_note_stat_cd   = Util.checkString(req.getParameter("now_note_stat_cd"));
        String now_note_stat_dt   = Util.checkString(req.getParameter("now_note_stat_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setNow_note_stat_cd(now_note_stat_cd);
        dm.setNow_note_stat_dt(now_note_stat_dt);
        
        dm.print();
        
        /* EJB 수정후 시작 */
        DBManager manager = new DBManager("MISFNC");
        ds = (FC_FUNC_1170_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
        	throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        req.setAttribute("ds", ds);
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작        
        try {
            FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome) JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
            FC_FUNC_1000EJB ejb = home.create();
            ds = ejb.fc_func_1170_l(dm);
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
        EJB 수정전 끝 */
    }
	public void fc_func_1171_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1171_LDataSet ds = null;
		FC_FUNC_1171_LDM dm = new FC_FUNC_1171_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.now_note_stat_dt = Util.checkString(req.getParameter("now_note_stat_dt"));
		dm.now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1171_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1171_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.now_note_stat_dt = (String)hash.get("now_note_stat_dt");
		dm.now_note_stat_cd = (String)hash.get("now_note_stat_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.now_note_stat_dt = Util.getSessionParameterValue(req,"now_note_stat_dt",true);
		dm.now_note_stat_cd = Util.getSessionParameterValue(req,"now_note_stat_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_1172_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1172_MDataSet ds = null;
		FC_FUNC_1172_MDM dm = new FC_FUNC_1172_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1172_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
    public void fc_func_1400_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1400_MDataSet ds = null;
		FC_FUNC_1400_MDM dm = new FC_FUNC_1400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1400_m(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1401_LDataSet ds = null;
		FC_FUNC_1401_LDM dm = new FC_FUNC_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
		dm.fr_mtry_dt = Util.checkString(req.getParameter("fr_mtry_dt"));
		dm.to_mtry_dt = Util.checkString(req.getParameter("to_mtry_dt"));
		dm.fr_stat_dt = Util.checkString(req.getParameter("fr_stat_dt"));
		dm.to_stat_dt = Util.checkString(req.getParameter("to_stat_dt"));
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
		dm.bcomp = Util.checkString(req.getParameter("bcomp"));
		dm.scomp = Util.checkString(req.getParameter("scomp"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1401_LDataSet)manager.executeCall(dm);

		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		

		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1401_l(dm);
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
		EJB 수정전 끝 */
		
	}
    public void fc_func_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1003_LDataSet ds = null;
		FC_FUNC_1003_LDM dm = new FC_FUNC_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1003_l(dm);
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
		EJB 수정전 끝 */
		
	}
    public void fc_func_1180_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1180_LDataSet ds = null;
		FC_FUNC_1180_LDM dm = new FC_FUNC_1180_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1180_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1180_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1181_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1181_LDataSet ds = null;
		FC_FUNC_1181_LDM dm = new FC_FUNC_1181_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1181_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1181_l(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		*******************************************************************************************/
	}
    public void fc_func_1183_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1183_DDataSet ds = null;
		FC_FUNC_1183_DDM dm = new FC_FUNC_1183_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Util.checkString(req.getParameter("pch_count"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1183_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1183_d(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.pch_count = (String)hash.get("pch_count");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.pch_count = Util.getSessionParameterValue(req,"pch_count",true);
		*******************************************************************************************/
	}
    public void fc_func_1184_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1184_IDataSet ds = null;
		FC_FUNC_1184_IDM dm = new FC_FUNC_1184_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.sbbsamt = Util.checkString(req.getParameter("sbbsamt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1184_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1184_i(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.pch_compnm = (String)hash.get("pch_compnm");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.sbbsamt = (String)hash.get("sbbsamt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.pch_compnm = Util.getSessionParameterValue(req,"pch_compnm",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.sbbsamt = Util.getSessionParameterValue(req,"sbbsamt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1185_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1185_MDataSet ds = null;
		FC_FUNC_1185_MDM dm = new FC_FUNC_1185_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1185_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}

    
    public void fc_func_1190_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1190_LDataSet ds = null;
		FC_FUNC_1190_LDM dm = new FC_FUNC_1190_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dhon_occr_dt = Util.checkString(req.getParameter("dhon_occr_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1190_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1190_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dhon_occr_dt = (String)hash.get("dhon_occr_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dhon_occr_dt = Util.getSessionParameterValue(req,"dhon_occr_dt",true);
		*******************************************************************************************/
	}
    public void fc_func_1191_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1191_LDataSet ds = null;
		FC_FUNC_1191_LDM dm = new FC_FUNC_1191_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1191_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1191_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpay_dt = (String)hash.get("rcpay_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpay_dt = Util.getSessionParameterValue(req,"rcpay_dt",true);
		*******************************************************************************************/
	}
    public void fc_func_1192_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1192_IDataSet ds = null;
		FC_FUNC_1192_IDM dm = new FC_FUNC_1192_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));
		dm.extnc_ptcr = Util.checkString(req.getParameter("extnc_ptcr"));
		dm.pch_amt1 = Util.checkString(req.getParameter("pch_amt1"));
		dm.pch_amt2 = Util.checkString(req.getParameter("pch_amt2"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		//dm.rcpay_amt = (String)hash.get("rcpay_amt");
		dm.rcpay_amt = (String)hash.get("daesonamt");

		dm.dhon_occr_dt = (String)hash.get("dhon_occr_dt");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.pch_compnm = (String)hash.get("pch_compnm");
		dm.mtry_dt = (String)hash.get("mtry_dt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1192_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1192_i(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpay_dt = (String)hash.get("rcpay_dt");
		dm.extnc_ptcr = (String)hash.get("extnc_ptcr");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.rcpay_amt = (String)hash.get("rcpay_amt");
		dm.dhon_occr_dt = (String)hash.get("dhon_occr_dt");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.pch_compnm = (String)hash.get("pch_compnm");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.pch_amt1 = (String)hash.get("pch_amt1");
		dm.pch_amt2 = (String)hash.get("pch_amt2");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpay_dt = Util.getSessionParameterValue(req,"rcpay_dt",true);
		dm.extnc_ptcr = Util.getSessionParameterValue(req,"extnc_ptcr",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.rcpay_amt = Util.getSessionParameterValue(req,"rcpay_amt",true);
		dm.dhon_occr_dt = Util.getSessionParameterValue(req,"dhon_occr_dt",true);
		dm.note_clsf_cd = Util.getSessionParameterValue(req,"note_clsf_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.pch_compnm = Util.getSessionParameterValue(req,"pch_compnm",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.pch_amt1 = Util.getSessionParameterValue(req,"pch_amt1",true);
		dm.pch_amt2 = Util.getSessionParameterValue(req,"pch_amt2",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1193_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1193_DDataSet ds = null;
		FC_FUNC_1193_DDM dm = new FC_FUNC_1193_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.pch_count = Util.checkString(req.getParameter("pch_count"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1193_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1193_d(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpay_dt = (String)hash.get("rcpay_dt");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.pch_count = (String)hash.get("pch_count");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpay_dt = Util.getSessionParameterValue(req,"rcpay_dt",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.pch_count = Util.getSessionParameterValue(req,"pch_count",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
    public void fc_func_1210_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1210_LDataSet ds = null;
		FC_FUNC_1210_LDM dm = new FC_FUNC_1210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dhon_occr_dt = Util.checkString(req.getParameter("dhon_occr_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1210_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dhon_occr_dt = (String)hash.get("dhon_occr_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dhon_occr_dt = Util.getSessionParameterValue(req,"dhon_occr_dt",true);
		*******************************************************************************************/
	}
    public void fc_func_1211_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1211_LDataSet ds = null;
		FC_FUNC_1211_LDM dm = new FC_FUNC_1211_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1211_l(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpay_dt = (String)hash.get("rcpay_dt");
		*******************************************************************************************/
		
		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpay_dt = Util.getSessionParameterValue(req,"rcpay_dt",true);
		*******************************************************************************************/
	}
    public void fc_func_1212_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1212_IDataSet ds = null;
		FC_FUNC_1212_IDM dm = new FC_FUNC_1212_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.inpuy_dt = Util.checkString(req.getParameter("inpuy_dt"));
		dm.rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));
		dm.extnc_ptcr = Util.checkString(req.getParameter("extnc_ptcr"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.rcpay_amt = (String)hash.get("bmsbamt");
		dm.dhon_occr_dt = (String)hash.get("dhon_occr_dt");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.pch_compnm = (String)hash.get("pch_compnm");
		dm.obj_amt = (String)hash.get("bmdsamt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1212_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1212_i(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.inpuy_dt = (String)hash.get("inpuy_dt");
		dm.rcpay_dt = (String)hash.get("rcpay_dt");
		dm.extnc_ptcr = (String)hash.get("extnc_ptcr");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.rcpay_amt = (String)hash.get("rcpay_amt");
		dm.dhon_occr_dt = (String)hash.get("dhon_occr_dt");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.pch_compnm = (String)hash.get("pch_compnm");
		dm.obj_amt = (String)hash.get("obj_amt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.inpuy_dt = Util.getSessionParameterValue(req,"inpuy_dt",true);
		dm.rcpay_dt = Util.getSessionParameterValue(req,"rcpay_dt",true);
		dm.extnc_ptcr = Util.getSessionParameterValue(req,"extnc_ptcr",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.rcpay_amt = Util.getSessionParameterValue(req,"rcpay_amt",true);
		dm.dhon_occr_dt = Util.getSessionParameterValue(req,"dhon_occr_dt",true);
		dm.note_clsf_cd = Util.getSessionParameterValue(req,"note_clsf_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.pch_compnm = Util.getSessionParameterValue(req,"pch_compnm",true);
		dm.obj_amt = Util.getSessionParameterValue(req,"obj_amt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1213_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1213_DDataSet ds = null;
		FC_FUNC_1213_DDM dm = new FC_FUNC_1213_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.pch_count = Util.checkString(req.getParameter("pch_count"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1213_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);		
		/* EJB 수정후 끝 */		

		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1213_d(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpay_dt = (String)hash.get("rcpay_dt");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.pch_count = (String)hash.get("pch_count");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpay_dt = Util.getSessionParameterValue(req,"rcpay_dt",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.pch_count = Util.getSessionParameterValue(req,"pch_count",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_1280_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1280_MDataSet ds = null;
		FC_FUNC_1280_MDM dm = new FC_FUNC_1280_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1280_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1280_m(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_1290_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1290_MDataSet ds = null;
		FC_FUNC_1290_MDM dm = new FC_FUNC_1290_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1290_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1290_m(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1410_LDataSet ds = null;
		FC_FUNC_1410_LDM dm = new FC_FUNC_1410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1410_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.now_note_stat_cd = (String)hash.get("now_note_stat_cd");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.now_note_stat_cd = Util.getSessionParameterValue(req,"now_note_stat_cd",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		*******************************************************************************************/
	}
    public void fc_func_1411_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1411_LDataSet ds = null;
		FC_FUNC_1411_LDM dm = new FC_FUNC_1411_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1411_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1411_l(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.stat_cd = (String)hash.get("stat_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1412_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1412_IDataSet ds = null;
		FC_FUNC_1412_IDM dm = new FC_FUNC_1412_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.rcpm_acct = (String)hash.get("rcpm_acct");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.compnm = (String)hash.get("compnm");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.bank_cd_nm = (String)hash.get("bank_cd_nm");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.note_amt = (String)hash.get("note_amt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.coms = (String)hash.get("coms");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1412_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1412_i(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rcpm_acct = (String)hash.get("rcpm_acct");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.compnm = (String)hash.get("compnm");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.bank_cd_nm = (String)hash.get("bank_cd_nm");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.note_amt = (String)hash.get("note_amt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.coms = (String)hash.get("coms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.rcpm_acct = Util.getSessionParameterValue(req,"rcpm_acct",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.compnm = Util.getSessionParameterValue(req,"compnm",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.bank_cd_nm = Util.getSessionParameterValue(req,"bank_cd_nm",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.note_clsf_cd = Util.getSessionParameterValue(req,"note_clsf_cd",true);
		dm.note_amt = Util.getSessionParameterValue(req,"note_amt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.coms = Util.getSessionParameterValue(req,"coms",true);
		*******************************************************************************************/
	}
    public void fc_func_1413_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1413_DDataSet ds = null;
		FC_FUNC_1413_DDM dm = new FC_FUNC_1413_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.pch_count = Util.checkString(req.getParameter("pch_count"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1413_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1413_d(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.stat_cd = (String)hash.get("stat_cd");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.pch_count = (String)hash.get("pch_count");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.pch_count = Util.getSessionParameterValue(req,"pch_count",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1414_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1414_MDataSet ds = null;
		FC_FUNC_1414_MDM dm = new FC_FUNC_1414_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1414_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1450_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1450_LDataSet ds = null;
		FC_FUNC_1450_LDM dm = new FC_FUNC_1450_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.note_no = Util.checkString(req.getParameter("note_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1450_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);							
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1450_l(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.note_no = (String)hash.get("note_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		*******************************************************************************************/
	}
    public void fc_func_1451_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1451_LDataSet ds = null;
		FC_FUNC_1451_LDM dm = new FC_FUNC_1451_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.note_no = Util.checkString(req.getParameter("note_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1451_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1451_l(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.note_no = (String)hash.get("note_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		*******************************************************************************************/
	}
    public void fc_func_1452_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1452_LDataSet ds = null;
		FC_FUNC_1452_LDM dm = new FC_FUNC_1452_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_reg_dt = Util.checkString(req.getParameter("fr_reg_dt"));
		dm.to_reg_dt = Util.checkString(req.getParameter("to_reg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1452_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1452_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.fr_reg_dt = (String)hash.get("fr_reg_dt");
		dm.to_reg_dt = (String)hash.get("to_reg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_reg_dt = Util.getSessionParameterValue(req,"fr_reg_dt",true);
		dm.to_reg_dt = Util.getSessionParameterValue(req,"to_reg_dt",true);
		*******************************************************************************************/
	}
    public void fc_func_1453_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1453_IDataSet ds = null;
		FC_FUNC_1453_IDM dm = new FC_FUNC_1453_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1453_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1453_i(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.reg_dt = (String)hash.get("reg_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.reg_dt = Util.getSessionParameterValue(req,"reg_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
    public void fc_func_1454_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1454_DDataSet ds = null;
		FC_FUNC_1454_DDM dm = new FC_FUNC_1454_DDM();		

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.bank_cd = (String)hash.get("bank_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1454_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1454_d(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
    public void fc_func_1455_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1455_LDataSet ds = null;
		FC_FUNC_1455_LDM dm = new FC_FUNC_1455_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1455_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1455_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1010_MDataSet ds = null;
		FC_FUNC_1010_MDM dm = new FC_FUNC_1010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1010_m(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1011_LDataSet ds = null;
		FC_FUNC_1011_LDM dm = new FC_FUNC_1011_LDM();

		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.note_seq = Util.checkString(req.getParameter("note_seq"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1011_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1012_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1012_LDataSet ds = null;
		FC_FUNC_1012_LDM dm = new FC_FUNC_1012_LDM();

		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.note_seq = Util.checkString(req.getParameter("note_seq"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1012_l(dm);
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
		EJB 수정전 끝 */		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1013_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1013_LDataSet ds = null;
		FC_FUNC_1013_LDM dm = new FC_FUNC_1013_LDM();

		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.note_seq = Util.checkString(req.getParameter("note_seq"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1013_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_cd = (String)hash.get("stat_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1014_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1014_LDataSet ds = null;
		FC_FUNC_1014_LDM dm = new FC_FUNC_1014_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1014_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1014_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.pubc_slip_no = (String)hash.get("pubc_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pubc_slip_no = Util.getSessionParameterValue(req,"pubc_slip_no",true);
		*******************************************************************************************/
	}
    public void fc_func_1015_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1015_IDataSet ds = null;
		FC_FUNC_1015_IDM dm = new FC_FUNC_1015_IDM();

		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.note_seq = Util.checkString(req.getParameter("note_seq"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1015_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1015_i(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpm_acct = (String)hash.get("rcpm_acct");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpm_acct = Util.getSessionParameterValue(req,"rcpm_acct",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
    public void fc_func_1370_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1370_MDataSet ds = null;
		FC_FUNC_1370_MDM dm = new FC_FUNC_1370_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1370_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1370_m(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1380_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1380_MDataSet ds = null;
		FC_FUNC_1380_MDM dm = new FC_FUNC_1380_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1380_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1380_m(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void fc_func_1390_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1390_MDataSet ds = null;
		FC_FUNC_1390_MDM dm = new FC_FUNC_1390_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1390_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1390_m(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1221_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1221_MDataSet ds = null;
		FC_FUNC_1221_MDM dm = new FC_FUNC_1221_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1221_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1230_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1230_MDataSet ds = null;
		FC_FUNC_1230_MDM dm = new FC_FUNC_1230_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1230_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1230_m(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1240_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1240_MDataSet ds = null;
		FC_FUNC_1240_MDM dm = new FC_FUNC_1240_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1240_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1240_m(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1250_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1250_MDataSet ds = null;
		FC_FUNC_1250_MDM dm = new FC_FUNC_1250_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1250_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1250_m(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    
    public void fc_func_1260_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1260_MDataSet ds = null;
		FC_FUNC_1260_MDM dm = new FC_FUNC_1260_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1260_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1260_m(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_1461_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1461_LDataSet ds = null;
		FC_FUNC_1461_LDM dm = new FC_FUNC_1461_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.chkpjee = Util.checkString(req.getParameter("chkpjee"));
		dm.place = Util.checkString(req.getParameter("place"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1461_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1461_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.chkpjee = (String)hash.get("chkpjee");
		dm.place = (String)hash.get("place");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.chkpjee = Util.getSessionParameterValue(req,"chkpjee",true);
		dm.place = Util.getSessionParameterValue(req,"place",true);
		*******************************************************************************************/
	}
	public void fc_func_1462_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1462_LDataSet ds = null;
		FC_FUNC_1462_LDM dm = new FC_FUNC_1462_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1462_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1462_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_1463_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1463_IDataSet ds = null;
		FC_FUNC_1463_IDM dm = new FC_FUNC_1463_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.place = Util.checkString(req.getParameter("place"));		
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.note_amt = (String)hash.get("note_amt");
		dm.sale_dscn_amt = (String)hash.get("sale_dscn_amt");
		dm.dlco_clsf_cd1 = (String)hash.get("dlco_clsf_cd1");
		dm.dlco_cd1 = (String)hash.get("dlco_cd1");
		dm.bank_cd_nm = (String)hash.get("bank_cd_nm");
		dm.deps_clsf_cd = (String)hash.get("deps_clsf_cd");
		dm.rcpay_amt = (String)hash.get("rcpay_amt");
		dm.corp_tax = (String)hash.get("corp_tax");
		dm.etc_prft = (String)hash.get("etc_prft");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.dlco_cdnm = (String)hash.get("dlco_cdnm");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.coms = (String)hash.get("coms");
		dm.deps_dt = (String)hash.get("deps_dt");
		dm.corp_local_tax = (String)hash.get("corp_local_tax");

		dm.biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
		dm.bank_id = Util.checkString(req.getParameter("bank_id"));
		dm.acct_num = Util.checkString(req.getParameter("acct_num"));
		dm.tran_date = Util.checkString(req.getParameter("tran_date"));
		dm.tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
		dm.tran_amt = Util.checkString(req.getParameter("save_tran_amt"));
		dm.chnl_clsf = Util.checkString(req.getParameter("chnl_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1463_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1463_i(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.deptcd = (String)hash.get("deptcd");
		dm.place = (String)hash.get("place");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		dm.note_amt = (String)hash.get("note_amt");
		dm.sale_dscn_amt = (String)hash.get("sale_dscn_amt");
		dm.dlco_clsf_cd1 = (String)hash.get("dlco_clsf_cd1");
		dm.dlco_cd1 = (String)hash.get("dlco_cd1");
		dm.bank_cd_nm = (String)hash.get("bank_cd_nm");
		dm.deps_clsf_cd = (String)hash.get("deps_clsf_cd");
		dm.rcpay_amt = (String)hash.get("rcpay_amt");
		dm.corp_tax = (String)hash.get("corp_tax");
		dm.etc_prft = (String)hash.get("etc_prft");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.dlco_cdnm = (String)hash.get("dlco_cdnm");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.coms = (String)hash.get("coms");
		dm.biz_reg_no = (String)hash.get("biz_reg_no");
		dm.bank_id = (String)hash.get("bank_id");
		dm.acct_num = (String)hash.get("acct_num");
		dm.tran_date = (String)hash.get("tran_date");
		dm.tran_date_seq = (String)hash.get("tran_date_seq");
		dm.tran_amt = (String)hash.get("tran_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.deptcd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.place = Util.getSessionParameterValue(req,"place",true);
		dm.note_clsf_cd = Util.getSessionParameterValue(req,"note_clsf_cd",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		dm.note_amt = Util.getSessionParameterValue(req,"note_amt",true);
		dm.sale_dscn_amt = Util.getSessionParameterValue(req,"sale_dscn_amt",true);
		dm.dlco_clsf_cd1 = Util.getSessionParameterValue(req,"dlco_clsf_cd1",true);
		dm.dlco_cd1 = Util.getSessionParameterValue(req,"dlco_cd1",true);
		dm.bank_cd_nm = Util.getSessionParameterValue(req,"bank_cd_nm",true);
		dm.deps_clsf_cd = Util.getSessionParameterValue(req,"deps_clsf_cd",true);
		dm.rcpay_amt = Util.getSessionParameterValue(req,"rcpay_amt",true);
		dm.corp_tax = Util.getSessionParameterValue(req,"corp_tax",true);
		dm.etc_prft = Util.getSessionParameterValue(req,"etc_prft",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.dlco_cdnm = Util.getSessionParameterValue(req,"dlco_cdnm",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.coms = Util.getSessionParameterValue(req,"coms",true);
		dm.biz_reg_no = Util.getSessionParameterValue(req,"biz_reg_no",true);
		dm.bank_id = Util.getSessionParameterValue(req,"bank_id",true);
		dm.acct_num = Util.getSessionParameterValue(req,"acct_num",true);
		dm.tran_date = Util.getSessionParameterValue(req,"tran_date",true);
		dm.tran_date_seq = Util.getSessionParameterValue(req,"tran_date_seq",true);
		dm.tran_amt = Util.getSessionParameterValue(req,"tran_amt",true);
		*******************************************************************************************/
	}
	public void fc_func_1464_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1464_DDataSet ds = null;
		FC_FUNC_1464_DDM dm = new FC_FUNC_1464_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1464_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1464_d(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.stat_cd = (String)hash.get("stat_cd");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}	
	public void fc_func_1465_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_1465_LDataSet ds = null;
		FC_FUNC_1465_LDM dm = new FC_FUNC_1465_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.note_seq = Util.checkString(req.getParameter("note_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_1465_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_1000EJBHome home = (FC_FUNC_1000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_1000EJB");
			FC_FUNC_1000EJB ejb = home.create();

			ds = ejb.fc_func_1465_l(dm);
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
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.note_no = (String)hash.get("note_no");
		dm.note_seq = (String)hash.get("note_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_seq = Util.getSessionParameterValue(req,"note_seq",true);
		*******************************************************************************************/
	}
	
}
