package chosun.ciis.mc.budg.wb;

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

import chosun.ciis.fc.func.ds.FC_FUNC_2051_LDataSet;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

public class MC_BUDG_1000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_9999_LDataSet ds = null;
		MC_BUDG_9999_LDM dm = new MC_BUDG_9999_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();
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
	
	public void mc_budg_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1000_MDataSet ds = null;
		MC_BUDG_1000_MDM dm = new MC_BUDG_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1000_m(dm);
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
	
	public void mc_budg_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1001_LDataSet ds = null;
		MC_BUDG_1001_LDM dm = new MC_BUDG_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1001_l(dm);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/
	}
	
	public void mc_budg_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1002_LDataSet ds = null;
		MC_BUDG_1002_LDM dm = new MC_BUDG_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1002_l(dm);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/
	}
	
	public void mc_budg_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1003_LDataSet ds = null;
		MC_BUDG_1003_LDM dm = new MC_BUDG_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1003_l(dm);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1004_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1004_UDataSet ds = null;
		MC_BUDG_1004_UDM dm = new MC_BUDG_1004_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
		dm.prt_clsf_cd = Util.checkString(req.getParameter("prt_clsf_cd"));
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
		dm.budg_cdnm = Util.checkString(req.getParameter("budg_cdnm"));
		dm.budg_cdynm = Util.checkString(req.getParameter("budg_cdynm"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
		dm.clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
		dm.clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
		dm.clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));
		dm.gain_reso_yn = Util.checkString(req.getParameter("gain_reso_yn"));
		dm.cyov_yn = Util.checkString(req.getParameter("cyov_yn"));
		dm.lesd_yn = Util.checkString(req.getParameter("lesd_yn"));
		dm.advc_cndt_yn = Util.checkString(req.getParameter("advc_cndt_yn"));
		dm.limt_chk_yn = Util.checkString(req.getParameter("limt_chk_yn"));
		dm.posbfee_yn = Util.checkString(req.getParameter("posbfee_yn"));
		dm.fixfee_yn = Util.checkString(req.getParameter("fixfee_yn"));
		dm.medi_dstb_cd = Util.checkString(req.getParameter("medi_dstb_cd"));
		dm.dtls_medi_dstb_cd = Util.checkString(req.getParameter("dtls_medi_dstb_cd"));
		dm.whco_ndstb_cd = Util.checkString(req.getParameter("whco_ndstb_cd"));
		dm.whco_comn_cost_yn = Util.checkString(req.getParameter("whco_comn_cost_yn"));
		dm.via_dept_cd = Util.checkString(req.getParameter("via_dept_cd"));
		dm.dstb_acct_cd = Util.checkString(req.getParameter("dstb_acct_cd"));
		dm.drcr_bal_clsf = Util.checkString(req.getParameter("drcr_bal_clsf"));
		dm.use_bgn_dt = Util.checkString(req.getParameter("use_bgn_dt"));
		dm.use_end_dt = Util.checkString(req.getParameter("use_end_dt"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.mang_item_val = (String)hash.get("mang_item_val");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1004_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1004_u(dm);
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
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		dm.prt_clsf_cd = (String)hash.get("prt_clsf_cd");
		dm.budg_type_cd = (String)hash.get("budg_type_cd");
		dm.budg_cdnm = (String)hash.get("budg_cdnm");
		dm.budg_cdynm = (String)hash.get("budg_cdynm");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		dm.cyov_yn = (String)hash.get("cyov_yn");
		dm.lesd_yn = (String)hash.get("lesd_yn");
		dm.advc_cndt_yn = (String)hash.get("advc_cndt_yn");
		dm.limt_chk_yn = (String)hash.get("limt_chk_yn");
		dm.posbfee_yn = (String)hash.get("posbfee_yn");
		dm.fixfee_yn = (String)hash.get("fixfee_yn");
		dm.medi_dstb_cd = (String)hash.get("medi_dstb_cd");
		dm.dtls_medi_dstb_cd = (String)hash.get("dtls_medi_dstb_cd");
		dm.whco_ndstb_cd = (String)hash.get("whco_ndstb_cd");
		dm.whco_comn_cost_yn = (String)hash.get("whco_comn_cost_yn");
		dm.via_dept_cd = (String)hash.get("via_dept_cd");
		dm.dstb_acct_cd = (String)hash.get("dstb_acct_cd");
		dm.drcr_bal_clsf = (String)hash.get("drcr_bal_clsf");
		dm.use_bgn_dt = (String)hash.get("use_bgn_dt");
		dm.use_end_dt = (String)hash.get("use_end_dt");
		dm.use_yn = (String)hash.get("use_yn");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.mang_item_val = (String)hash.get("mang_item_val");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_clas_cd = Util.getSessionParameterValue(req,"budg_clas_cd",true);
		dm.prt_clsf_cd = Util.getSessionParameterValue(req,"prt_clsf_cd",true);
		dm.budg_type_cd = Util.getSessionParameterValue(req,"budg_type_cd",true);
		dm.budg_cdnm = Util.getSessionParameterValue(req,"budg_cdnm",true);
		dm.budg_cdynm = Util.getSessionParameterValue(req,"budg_cdynm",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		dm.clas_cd2 = Util.getSessionParameterValue(req,"clas_cd2",true);
		dm.clas_cd3 = Util.getSessionParameterValue(req,"clas_cd3",true);
		dm.clas_cd4 = Util.getSessionParameterValue(req,"clas_cd4",true);
		dm.cyov_yn = Util.getSessionParameterValue(req,"cyov_yn",true);
		dm.lesd_yn = Util.getSessionParameterValue(req,"lesd_yn",true);
		dm.advc_cndt_yn = Util.getSessionParameterValue(req,"advc_cndt_yn",true);
		dm.limt_chk_yn = Util.getSessionParameterValue(req,"limt_chk_yn",true);
		dm.posbfee_yn = Util.getSessionParameterValue(req,"posbfee_yn",true);
		dm.fixfee_yn = Util.getSessionParameterValue(req,"fixfee_yn",true);
		dm.medi_dstb_cd = Util.getSessionParameterValue(req,"medi_dstb_cd",true);
		dm.dtls_medi_dstb_cd = Util.getSessionParameterValue(req,"dtls_medi_dstb_cd",true);
		dm.whco_ndstb_cd = Util.getSessionParameterValue(req,"whco_ndstb_cd",true);
		dm.whco_comn_cost_yn = Util.getSessionParameterValue(req,"whco_comn_cost_yn",true);
		dm.via_dept_cd = Util.getSessionParameterValue(req,"via_dept_cd",true);
		dm.dstb_acct_cd = Util.getSessionParameterValue(req,"dstb_acct_cd",true);
		dm.drcr_bal_clsf = Util.getSessionParameterValue(req,"drcr_bal_clsf",true);
		dm.use_bgn_dt = Util.getSessionParameterValue(req,"use_bgn_dt",true);
		dm.use_end_dt = Util.getSessionParameterValue(req,"use_end_dt",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.dlco_clsf = Util.getSessionParameterValue(req,"dlco_clsf",true);
		dm.mang_item_cd = Util.getSessionParameterValue(req,"mang_item_cd",true);
		dm.mang_item_nm = Util.getSessionParameterValue(req,"mang_item_nm",true);
		dm.mang_item_val = Util.getSessionParameterValue(req,"mang_item_val",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1006_LDataSet ds = null;
		MC_BUDG_1006_LDM dm = new MC_BUDG_1006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.min_max = Util.checkString(req.getParameter("min_max"));
		dm.sql = req.getParameter("sql");
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1006_l(dm);
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
		dm.min_max = (String)hash.get("min_max");
		dm.sql = (String)hash.get("sql");
		*******************************************************************************************/
	}
	
	public void mc_budg_1007_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1007_IDataSet ds = null;
		MC_BUDG_1007_IDM dm = new MC_BUDG_1007_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
		dm.prt_clsf_cd = Util.checkString(req.getParameter("prt_clsf_cd"));
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
		dm.budg_cdnm = Util.checkString(req.getParameter("budg_cdnm"));
		dm.budg_cdynm = Util.checkString(req.getParameter("budg_cdynm"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
		dm.clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
		dm.clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
		dm.clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));
		dm.gain_reso_yn = Util.checkString(req.getParameter("gain_reso_yn"));
		dm.cyov_yn = Util.checkString(req.getParameter("cyov_yn"));
		dm.lesd_yn = Util.checkString(req.getParameter("lesd_yn"));
		dm.advc_cndt_yn = Util.checkString(req.getParameter("advc_cndt_yn"));
		dm.limt_chk_yn = Util.checkString(req.getParameter("limt_chk_yn"));
		dm.posbfee_yn = Util.checkString(req.getParameter("posbfee_yn"));
		dm.fixfee_yn = Util.checkString(req.getParameter("fixfee_yn"));
		dm.medi_dstb_cd = Util.checkString(req.getParameter("medi_dstb_cd"));
		dm.dtls_medi_dstb_cd = Util.checkString(req.getParameter("dtls_medi_dstb_cd"));
		dm.whco_ndstb_cd = Util.checkString(req.getParameter("whco_ndstb_cd"));
		dm.whco_comn_cost_yn = Util.checkString(req.getParameter("whco_comn_cost_yn"));
		dm.via_dept_cd = Util.checkString(req.getParameter("via_dept_cd"));
		dm.dstb_acct_cd = Util.checkString(req.getParameter("dstb_acct_cd"));
		dm.drcr_bal_clsf = Util.checkString(req.getParameter("drcr_bal_clsf"));
		dm.use_bgn_dt = Util.checkString(req.getParameter("use_bgn_dt"));
		dm.use_end_dt = Util.checkString(req.getParameter("use_end_dt"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.other_cmpy_cd = Util.checkString(req.getParameter("other_cmpy_cd"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.mang_item_val = (String)hash.get("mang_item_val");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1007_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1007_i(dm);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		dm.prt_clsf_cd = (String)hash.get("prt_clsf_cd");
		dm.budg_type_cd = (String)hash.get("budg_type_cd");
		dm.budg_cdnm = (String)hash.get("budg_cdnm");
		dm.budg_cdynm = (String)hash.get("budg_cdynm");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		dm.cyov_yn = (String)hash.get("cyov_yn");
		dm.lesd_yn = (String)hash.get("lesd_yn");
		dm.advc_cndt_yn = (String)hash.get("advc_cndt_yn");
		dm.limt_chk_yn = (String)hash.get("limt_chk_yn");
		dm.posbfee_yn = (String)hash.get("posbfee_yn");
		dm.fixfee_yn = (String)hash.get("fixfee_yn");
		dm.medi_dstb_cd = (String)hash.get("medi_dstb_cd");
		dm.dtls_medi_dstb_cd = (String)hash.get("dtls_medi_dstb_cd");
		dm.whco_ndstb_cd = (String)hash.get("whco_ndstb_cd");
		dm.whco_comn_cost_yn = (String)hash.get("whco_comn_cost_yn");
		dm.via_dept_cd = (String)hash.get("via_dept_cd");
		dm.dstb_acct_cd = (String)hash.get("dstb_acct_cd");
		dm.drcr_bal_clsf = (String)hash.get("drcr_bal_clsf");
		dm.use_bgn_dt = (String)hash.get("use_bgn_dt");
		dm.use_end_dt = (String)hash.get("use_end_dt");
		dm.use_yn = (String)hash.get("use_yn");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.mang_item_val = (String)hash.get("mang_item_val");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/
	}
	
	public void mc_budg_1008_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1008_DDataSet ds = null;
		MC_BUDG_1008_DDM dm = new MC_BUDG_1008_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.jobtag = Util.checkString(req.getParameter("jobtag"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mang_item_cd = (String)hash.get("mang_item_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1008_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1008_d(dm);
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
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.jobtag = Util.getSessionParameterValue(req,"jobtag",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.mang_item_cd = Util.getSessionParameterValue(req,"mang_item_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1020_MDataSet ds = null;
		MC_BUDG_1020_MDM dm = new MC_BUDG_1020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1020_m(dm);
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
		dm.clas_nm = (String)hash.get("clas_nm");
		*******************************************************************************************/
	}
	
	public void mc_budg_1021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1021_LDataSet ds = null;
		MC_BUDG_1021_LDM dm = new MC_BUDG_1021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_frcd = Util.checkString(req.getParameter("budg_frcd"));
		dm.budg_tocd = Util.checkString(req.getParameter("budg_tocd"));
		dm.budg_nm = Util.checkString(req.getParameter("budg_nm"));
		dm.budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1021_l(dm);
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
		dm.budg_frcd = (String)hash.get("budg_frcd");
		dm.budg_tocd = (String)hash.get("budg_tocd");
		dm.budg_nm = (String)hash.get("budg_nm");
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		*******************************************************************************************/
	}
	
	public void mc_budg_1030_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1030_LDataSet ds = null;
		MC_BUDG_1030_LDM dm = new MC_BUDG_1030_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_budg_cd = Util.checkString(req.getParameter("from_budg_cd"));
		dm.to_budg_cd = Util.checkString(req.getParameter("to_budg_cd"));
		dm.outerflag = Util.checkString(req.getParameter("outerflag"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1030_l(dm);
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
		dm.from_budg_cd = (String)hash.get("from_budg_cd");
		dm.to_budg_cd = (String)hash.get("to_budg_cd");
		dm.outerflag = (String)hash.get("outerflag");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_budg_cd = Util.getSessionParameterValue(req,"from_budg_cd",true);
		dm.to_budg_cd = Util.getSessionParameterValue(req,"to_budg_cd",true);
		dm.outerflag = Util.getSessionParameterValue(req,"outerflag",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1031_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1031_IDataSet ds = null;
		MC_BUDG_1031_IDM dm = new MC_BUDG_1031_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.insert_mode = (String)hash.get("m");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.itm_15 = (String)hash.get("itm_15");
		dm.itm_16 = (String)hash.get("itm_16");
		dm.itm_17 = (String)hash.get("itm_17");
		dm.itm_25 = (String)hash.get("itm_25");
		dm.itm_35 = (String)hash.get("itm_35");
		dm.itm_91 = (String)hash.get("itm_91");
		dm.itm_92 = (String)hash.get("itm_92");
		dm.itm_93 = (String)hash.get("itm_93");
		dm.itm_94 = (String)hash.get("itm_94");
		dm.itm_95 = (String)hash.get("itm_95");
		dm.itm_96 = (String)hash.get("itm_96");

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1031_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1031_i(dm);
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
		dm.insert_mode = (String)hash.get("insert_mode");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.itm_15 = (String)hash.get("itm_15");
		dm.itm_16 = (String)hash.get("itm_16");
		dm.itm_17 = (String)hash.get("itm_17");
		dm.itm_25 = (String)hash.get("itm_25");
		dm.itm_35 = (String)hash.get("itm_35");
		dm.itm_91 = (String)hash.get("itm_91");
		dm.itm_92 = (String)hash.get("itm_92");
		dm.itm_93 = (String)hash.get("itm_93");
		dm.itm_94 = (String)hash.get("itm_94");
		dm.itm_95 = (String)hash.get("itm_95");
		dm.itm_96 = (String)hash.get("itm_96");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insert_mode = Util.getSessionParameterValue(req,"insert_mode",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.itm_15 = Util.getSessionParameterValue(req,"itm_15",true);
		dm.itm_16 = Util.getSessionParameterValue(req,"itm_16",true);
		dm.itm_17 = Util.getSessionParameterValue(req,"itm_17",true);
		dm.itm_25 = Util.getSessionParameterValue(req,"itm_25",true);
		dm.itm_35 = Util.getSessionParameterValue(req,"itm_35",true);
		dm.itm_91 = Util.getSessionParameterValue(req,"itm_91",true);
		dm.itm_92 = Util.getSessionParameterValue(req,"itm_92",true);
		dm.itm_93 = Util.getSessionParameterValue(req,"itm_93",true);
		dm.itm_94 = Util.getSessionParameterValue(req,"itm_94",true);
		dm.itm_95 = Util.getSessionParameterValue(req,"itm_95",true);
		dm.itm_96 = Util.getSessionParameterValue(req,"itm_96",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1040_MDataSet ds = null;
		MC_BUDG_1040_MDM dm = new MC_BUDG_1040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1040_m(dm);
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
	
	public void mc_budg_1041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1041_LDataSet ds = null;
		MC_BUDG_1041_LDM dm = new MC_BUDG_1041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1041_l(dm);
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
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1051_LDataSet ds = null;
		MC_BUDG_1051_LDM dm = new MC_BUDG_1051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1051_l(dm);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1052_LDataSet ds = null;
		MC_BUDG_1052_LDM dm = new MC_BUDG_1052_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1052_l(dm);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1054_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1054_LDataSet ds = null;
		MC_BUDG_1054_LDM dm = new MC_BUDG_1054_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.min_max = Util.checkString(req.getParameter("min_max"));
		dm.sql = Util.checkString(req.getParameter("sql"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1054_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1054_l(dm);
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
		dm.min_max = (String)hash.get("min_max");
		dm.sql = (String)hash.get("sql");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.min_max = Util.getSessionParameterValue(req,"min_max",true);
		dm.sql = Util.getSessionParameterValue(req,"sql",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1055_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1055_ADataSet ds = null;
		MC_BUDG_1055_ADM dm = new MC_BUDG_1055_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.dept_cd = (String)hash.get("dept_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1055_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1055_a(dm);
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
		dm.mode = (String)hash.get("mode");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1061_LDataSet ds = null;
		MC_BUDG_1061_LDM dm = new MC_BUDG_1061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1061_l(dm);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1062_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1062_LDataSet ds = null;
		MC_BUDG_1062_LDM dm = new MC_BUDG_1062_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1062_l(dm);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1063_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1063_LDataSet ds = null;
		MC_BUDG_1063_LDM dm = new MC_BUDG_1063_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_frcd = Util.checkString(req.getParameter("budg_frcd"));
		dm.budg_tocd = Util.checkString(req.getParameter("budg_tocd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1063_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1063_l(dm);
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
		dm.budg_frcd = (String)hash.get("budg_frcd");
		dm.budg_tocd = (String)hash.get("budg_tocd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_frcd = Util.getSessionParameterValue(req,"budg_frcd",true);
		dm.budg_tocd = Util.getSessionParameterValue(req,"budg_tocd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1066_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1066_ADataSet ds = null;
		MC_BUDG_1066_ADM dm = new MC_BUDG_1066_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.budg_cd = (String)hash.get("budg_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1066_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1066_a(dm);
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
		dm.mode = (String)hash.get("mode");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1067_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1067_LDataSet ds = null;
		MC_BUDG_1067_LDM dm = new MC_BUDG_1067_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1067_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1067_l(dm);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1069_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1069_UDataSet ds = null;
		MC_BUDG_1069_UDM dm = new MC_BUDG_1069_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.new_dept_cd = Util.checkString(req.getParameter("new_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

	
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1069_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		
	}	

	
	public void mc_budg_1071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1071_LDataSet ds = null;
		MC_BUDG_1071_LDM dm = new MC_BUDG_1071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_frcd = Util.checkString(req.getParameter("budg_frcd"));
		dm.budg_tocd = Util.checkString(req.getParameter("budg_tocd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1071_l(dm);
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
		dm.budg_frcd = (String)hash.get("budg_frcd");
		dm.budg_tocd = (String)hash.get("budg_tocd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_frcd = Util.getSessionParameterValue(req,"budg_frcd",true);
		dm.budg_tocd = Util.getSessionParameterValue(req,"budg_tocd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1081_LDataSet ds = null;
		MC_BUDG_1081_LDM dm = new MC_BUDG_1081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1081_l(dm);
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
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_clas_cd = Util.getSessionParameterValue(req,"budg_clas_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1082_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1082_LDataSet ds = null;
		MC_BUDG_1082_LDM dm = new MC_BUDG_1082_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1082_l(dm);
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
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_clas_cd = Util.getSessionParameterValue(req,"budg_clas_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1083_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1083_IDataSet ds = null;
		MC_BUDG_1083_IDM dm = new MC_BUDG_1083_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		dm.clas_nm = (String)hash.get("clas_nm");
		dm.clas_abrv_nm = (String)hash.get("abrv_nm");
		dm.dtl_dstb_cd = (String)hash.get("dtls_medi_dstb_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1083_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1083_i(dm);
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
		dm.mode = (String)hash.get("mode");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		dm.clas_nm = (String)hash.get("clas_nm");
		dm.clas_abrv_nm = (String)hash.get("clas_abrv_nm");
		dm.dtl_dstb_cd = (String)hash.get("dtl_dstb_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		dm.clas_cd2 = Util.getSessionParameterValue(req,"clas_cd2",true);
		dm.clas_cd3 = Util.getSessionParameterValue(req,"clas_cd3",true);
		dm.clas_cd4 = Util.getSessionParameterValue(req,"clas_cd4",true);
		dm.clas_nm = Util.getSessionParameterValue(req,"clas_nm",true);
		dm.clas_abrv_nm = Util.getSessionParameterValue(req,"clas_abrv_nm",true);
		dm.dtl_dstb_cd = Util.getSessionParameterValue(req,"dtl_dstb_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1084_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1084_DDataSet ds = null;
		MC_BUDG_1084_DDM dm = new MC_BUDG_1084_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1084_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1084_d(dm);
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
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_clas_cd = Util.getSessionParameterValue(req,"budg_clas_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1091_LDataSet ds = null;
		MC_BUDG_1091_LDM dm = new MC_BUDG_1091_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_frcd = Util.checkString(req.getParameter("budg_frcd"));
		dm.budg_tocd = Util.checkString(req.getParameter("budg_tocd"));
		dm.prt_clsf_cd = Util.checkString(req.getParameter("prt_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1091_l(dm);
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
		dm.budg_frcd = (String)hash.get("budg_frcd");
		dm.budg_tocd = (String)hash.get("budg_tocd");
		dm.prt_clsf_cd = (String)hash.get("prt_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_frcd = Util.getSessionParameterValue(req,"budg_frcd",true);
		dm.budg_tocd = Util.getSessionParameterValue(req,"budg_tocd",true);
		dm.prt_clsf_cd = Util.getSessionParameterValue(req,"prt_clsf_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1092_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1092_ADataSet ds = null;
		MC_BUDG_1092_ADM dm = new MC_BUDG_1092_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.prt_clsf_cd = (String)hash.get("prt_clsf_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1092_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1092_a(dm);
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
		dm.mode = (String)hash.get("mode");
		dm.prt_clsf_cd = (String)hash.get("prt_clsf_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.prt_clsf_cd = Util.getSessionParameterValue(req,"prt_clsf_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1093_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1093_MDataSet ds = null;
		MC_BUDG_1093_MDM dm = new MC_BUDG_1093_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1093_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

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
	
	public void mc_budg_1010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1010_MDataSet ds = null;
		MC_BUDG_1010_MDM dm = new MC_BUDG_1010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.event_cd = Util.checkString(req.getParameter("event_cd"));


		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1010_m(dm);
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
		dm.event_cd = (String)hash.get("event_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.event_cd = Util.getSessionParameterValue(req,"event_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1011_LDataSet ds = null;
		MC_BUDG_1011_LDM dm = new MC_BUDG_1011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.event_cd = Util.checkString(req.getParameter("event_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1011_l(dm);
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
		dm.event_cd = (String)hash.get("event_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.event_cd = Util.getSessionParameterValue(req,"event_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1012_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1012_ADataSet ds = null;
		MC_BUDG_1012_ADM dm = new MC_BUDG_1012_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		String bng_dt = Util.checkString(req.getParameter("bng_dt"));
		String end_dt = Util.checkString(req.getParameter("end_dt"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_nm1 = (String)hash.get("evnt_nm1");
		dm.evnt_nm2 = (String)hash.get("evnt_nm2");
		dm.dept_cd = (String)hash.get("supv_dept_cd");
		dm.evnt_yy = evnt_yy;
		
		if(evnt_yy.equals("")){
			dm.bng_dt = bng_dt;
			dm.end_dt = end_dt;
		}else{
			dm.bng_dt = (String)hash.get("bgn_dt");
			dm.end_dt = (String)hash.get("last_dt");
		}
		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1012_a(dm);
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
		dm.mode = (String)hash.get("mode");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_nm1 = (String)hash.get("evnt_nm1");
		dm.evnt_nm2 = (String)hash.get("evnt_nm2");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.bng_dt = (String)hash.get("bng_dt");
		dm.end_dt = (String)hash.get("end_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_nm1 = Util.getSessionParameterValue(req,"evnt_nm1",true);
		dm.evnt_nm2 = Util.getSessionParameterValue(req,"evnt_nm2",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.bng_dt = Util.getSessionParameterValue(req,"bng_dt",true);
		dm.end_dt = Util.getSessionParameterValue(req,"end_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1013_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1013_LDataSet ds = null;
		MC_BUDG_1013_LDM dm = new MC_BUDG_1013_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
		dm.dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
		dm.bng_dt = Util.checkString(req.getParameter("bng_dt"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_1000EJBHome home = (MC_BUDG_1000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_1000EJB");
			MC_BUDG_1000EJB ejb = home.create();

			ds = ejb.mc_budg_1013_l(dm);
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_nm = (String)hash.get("evnt_nm");
		dm.clsf = (String)hash.get("clsf");
		dm.dept_frcd = (String)hash.get("dept_frcd");
		dm.dept_tocd = (String)hash.get("dept_tocd");
		dm.bng_dt = (String)hash.get("bng_dt");
		dm.end_dt = (String)hash.get("end_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_nm = Util.getSessionParameterValue(req,"evnt_nm",true);
		dm.clsf = Util.getSessionParameterValue(req,"clsf",true);
		dm.dept_frcd = Util.getSessionParameterValue(req,"dept_frcd",true);
		dm.dept_tocd = Util.getSessionParameterValue(req,"dept_tocd",true);
		dm.bng_dt = Util.getSessionParameterValue(req,"bng_dt",true);
		dm.end_dt = Util.getSessionParameterValue(req,"end_dt",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_1015_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_1015_MDataSet ds = null;
		MC_BUDG_1015_MDM dm = new MC_BUDG_1015_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_1015_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

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
}
