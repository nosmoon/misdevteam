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

public class FC_FUNC_8000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_9999_LDataSet ds = null;
		FC_FUNC_9999_LDM dm = new FC_FUNC_9999_LDM();
		
		//dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cmpy_cd = "100";
		
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
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();
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
	public void fc_func_8000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8000_MDataSet ds = null;
		FC_FUNC_8000_MDM dm = new FC_FUNC_8000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8000_m(dm);
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
	public void fc_func_8001_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8001_SDataSet ds = null;
		FC_FUNC_8001_SDM dm = new FC_FUNC_8001_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8001_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8001_s(dm);
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
	public void fc_func_8002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8002_IDataSet ds = null;
		FC_FUNC_8002_IDM dm = new FC_FUNC_8002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.uid = Util.getSessionParameterValue(req,"uid",true);
		dm.pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.pers_ipadd = req.getRemoteAddr();
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
		dm.leas_hire_clsf_cd = Util.checkString(req.getParameter("leas_hire_clsf_cd"));
		dm.leas_nm = Util.checkString(req.getParameter("leas_nm"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
		dm.won_amt = Util.checkString(req.getParameter("won_amt"));
		dm.libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
		dm.dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.re_leas_yn = Util.checkString(req.getParameter("re_leas_yn"));
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.pymt_cycl = Util.checkString(req.getParameter("pymt_cycl"));
		dm.pay_plan_tms = Util.checkString(req.getParameter("pay_plan_tms"));
		dm.libo_yn = Util.checkString(req.getParameter("libo_yn"));
		dm.usag = Util.checkString(req.getParameter("usag"));
		dm.loca = Util.checkString(req.getParameter("loca"));
		dm.fst_leas_clsf_cd = Util.checkString(req.getParameter("fst_leas_clsf_cd"));
		dm.fst_leas_no = Util.checkString(req.getParameter("fst_leas_no"));
		dm.int_calc_cd = Util.checkString(req.getParameter("int_calc_cd"));
		dm.good_curc = Util.checkString(req.getParameter("good_curc"));
		dm.good_amt = Util.checkString(req.getParameter("good_amt"));
		dm.end_aftr = Util.checkString(req.getParameter("end_aftr"));
		dm.leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));
		dm.prelae_pay_clsf_cd = Util.checkString(req.getParameter("prelae_pay_clsf_cd"));
		dm.basi_int = Util.checkString(req.getParameter("basi_int"));
		dm.leas_int_rate = Util.checkString(req.getParameter("leas_int_rate"));
		dm.prd_int_rate = Util.checkString(req.getParameter("prd_int_rate"));
		dm.tms_leas_amt = Util.checkString(req.getParameter("tms_leas_amt"));
		dm.tot_leas_fee = Util.checkString(req.getParameter("tot_leas_fee"));
		dm.decid_amt = Util.checkString(req.getParameter("decid_amt"));
		dm.prd_int = Util.checkString(req.getParameter("prd_int"));

		String multiUpdateData;
		Hashtable hash;
		
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.grid1_mode = (String)hash.get("m");
		dm.grid1_rownum = (String)hash.get("rownum");
		dm.grid1_note_no = (String)hash.get("note_no");
		dm.grid1_amt = (String)hash.get("amt");
		dm.grid1_expt_widr_dt = (String)hash.get("expt_widr_dt");	
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData2"));
		hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.grid2_mode = (String)hash.get("m");
		dm.grid2_rownum = (String)hash.get("rownum");
		dm.grid2_loss_dt = (String)hash.get("loss_dt");
		dm.grid2_expt_loss_amt = (String)hash.get("expt_loss_amt");
		dm.grid2_fix_loss_amt = (String)hash.get("fix_loss_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8002_i(dm);
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
	public void fc_func_8003_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8003_UDataSet ds = null;
		FC_FUNC_8003_UDM dm = new FC_FUNC_8003_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.uid = Util.getSessionParameterValue(req,"uid",true);
		dm.pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.pers_ipadd = req.getRemoteAddr();
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
		dm.leas_hire_clsf_cd = Util.checkString(req.getParameter("leas_hire_clsf_cd"));
		dm.leas_nm = Util.checkString(req.getParameter("leas_nm"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
		dm.won_amt = Util.checkString(req.getParameter("won_amt"));
		dm.libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
		dm.dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.re_leas_yn = Util.checkString(req.getParameter("re_leas_yn"));
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.pymt_cycl = Util.checkString(req.getParameter("pymt_cycl"));
		dm.pay_plan_tms = Util.checkString(req.getParameter("pay_plan_tms"));
		dm.libo_yn = Util.checkString(req.getParameter("libo_yn"));
		dm.usag = Util.checkString(req.getParameter("usag"));
		dm.loca = Util.checkString(req.getParameter("loca"));
		dm.fst_leas_clsf_cd = Util.checkString(req.getParameter("fst_leas_clsf_cd"));
		dm.fst_leas_no = Util.checkString(req.getParameter("fst_leas_no"));
		dm.int_calc_cd = Util.checkString(req.getParameter("int_calc_cd"));
		dm.good_curc = Util.checkString(req.getParameter("good_curc"));
		dm.good_amt = Util.checkString(req.getParameter("good_amt"));
		dm.end_aftr = Util.checkString(req.getParameter("end_aftr"));
		dm.leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));
		dm.prelae_pay_clsf_cd = Util.checkString(req.getParameter("prelae_pay_clsf_cd"));
		dm.basi_int = Util.checkString(req.getParameter("basi_int"));
		dm.leas_int_rate = Util.checkString(req.getParameter("leas_int_rate"));
		dm.prd_int_rate = Util.checkString(req.getParameter("prd_int_rate"));
		dm.tms_leas_amt = Util.checkString(req.getParameter("tms_leas_amt"));
		dm.tot_leas_fee = Util.checkString(req.getParameter("tot_leas_fee"));
		dm.decid_amt = Util.checkString(req.getParameter("decid_amt"));
		dm.prd_int = Util.checkString(req.getParameter("prd_int"));
		
		String multiUpdateData;
		Hashtable hash;
		
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.grid1_mode = (String)hash.get("m");
		dm.grid1_rownum = (String)hash.get("rownum");
		dm.grid1_note_no = (String)hash.get("note_no");
		dm.grid1_amt = (String)hash.get("amt");
		dm.grid1_expt_widr_dt = (String)hash.get("expt_widr_dt");	
		
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData2"));
		hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.grid2_mode = (String)hash.get("m");
		dm.grid2_rownum = (String)hash.get("rownum");
		dm.grid2_loss_dt = (String)hash.get("loss_dt");
		dm.grid2_expt_loss_amt = (String)hash.get("expt_loss_amt");
		dm.grid2_fix_loss_amt = (String)hash.get("fix_loss_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8003_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8003_u(dm);
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
	public void fc_func_8004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8004_DDataSet ds = null;
		FC_FUNC_8004_DDM dm = new FC_FUNC_8004_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8004_d(dm);
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
	public void fc_func_8011_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8011_ADataSet ds = null;
		FC_FUNC_8011_ADM dm = new FC_FUNC_8011_ADM();

		dm.target = Util.checkString(req.getParameter("target"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
		dm.totz_dt = Util.checkString(req.getParameter("totz_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8011_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8011_a(dm);
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
	public void fc_func_8012_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8012_IDataSet ds = null;
		FC_FUNC_8012_IDM dm = new FC_FUNC_8012_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.uid = Util.getSessionParameterValue(req,"uid",true);
		dm.pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.pers_ipadd = req.getRemoteAddr();
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
		dm.totz_dt = Util.checkString(req.getParameter("totz_dt"));
		dm.cost_amt = Util.checkString(req.getParameter("cost_amt"));
		
		String multiUpdateData;
		Hashtable hash;
		
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		hash = getHashMultiUpdateData(multiUpdateData);

		dm.grid1_mode = (String)hash.get("m");
		dm.grid1_rownum = (String)hash.get("rownum");
		dm.grid1_slip_no = (String)hash.get("slip_no");
		dm.grid1_cost_amt = (String)hash.get("cost_amt");
		dm.grid1_rmks = (String)hash.get("rmks");
		dm.grid1_fisc_dt = (String)hash.get("fisc_dt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8012_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8012_i(dm);
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
	public void fc_func_8013_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8013_DDataSet ds = null;
		FC_FUNC_8013_DDM dm = new FC_FUNC_8013_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8013_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8013_d(dm);
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
	
	public void fc_func_8014_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8014_MDataSet ds = null;
		FC_FUNC_8014_MDM dm = new FC_FUNC_8014_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8014_MDataSet)manager.executeCall(dm);

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
	
	public void fc_func_8021_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8021_SDataSet ds = null;
		FC_FUNC_8021_SDM dm = new FC_FUNC_8021_SDM();

		dm.workflag = Util.checkString(req.getParameter("workflag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8021_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8021_s(dm);
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
	public void fc_func_8022_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8022_IDataSet ds = null;
		FC_FUNC_8022_IDM dm = new FC_FUNC_8022_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.uid = Util.getSessionParameterValue(req,"uid",true);
		dm.pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.pers_ipadd = req.getRemoteAddr();
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
		dm.leas_nm = Util.checkString(req.getParameter("leas_nm"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
		dm.won_amt = Util.checkString(req.getParameter("won_amt"));
		dm.libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
		dm.dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.re_leas_yn = Util.checkString(req.getParameter("re_leas_yn"));
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.pymt_cycl = Util.checkString(req.getParameter("pymt_cycl"));
		dm.pay_plan_tms = Util.checkString(req.getParameter("pay_plan_tms"));
		dm.libo_yn = Util.checkString(req.getParameter("libo_yn"));
		dm.fst_leas_clsf_cd = Util.checkString(req.getParameter("fst_leas_clsf_cd"));
		dm.fst_leas_no = Util.checkString(req.getParameter("fst_leas_no"));
		dm.end_aftr = Util.checkString(req.getParameter("end_aftr"));
		dm.leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));
		dm.basi_int = Util.checkString(req.getParameter("basi_int"));
		dm.leas_int_rate = Util.checkString(req.getParameter("leas_int_rate"));
		dm.prd_int_rate = Util.checkString(req.getParameter("prd_int_rate"));
		dm.tms_leas_amt = Util.checkString(req.getParameter("tms_leas_amt"));
		dm.tot_leas_fee = Util.checkString(req.getParameter("tot_leas_fee"));
		dm.decid_amt = Util.checkString(req.getParameter("decid_amt"));
		dm.prd_int = Util.checkString(req.getParameter("prd_int"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8022_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8022_i(dm);
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
	public void fc_func_8023_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8023_UDataSet ds = null;
		FC_FUNC_8023_UDM dm = new FC_FUNC_8023_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.uid = Util.getSessionParameterValue(req,"uid",true);
		dm.pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.pers_ipadd = req.getRemoteAddr();
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
		dm.leas_nm = Util.checkString(req.getParameter("leas_nm"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
		dm.won_amt = Util.checkString(req.getParameter("won_amt"));
		dm.libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
		dm.dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.re_leas_yn = Util.checkString(req.getParameter("re_leas_yn"));
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.pymt_cycl = Util.checkString(req.getParameter("pymt_cycl"));
		dm.pay_plan_tms = Util.checkString(req.getParameter("pay_plan_tms"));
		dm.libo_yn = Util.checkString(req.getParameter("libo_yn"));
		dm.end_aftr = Util.checkString(req.getParameter("end_aftr"));
		dm.leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));
		dm.basi_int = Util.checkString(req.getParameter("basi_int"));
		dm.leas_int_rate = Util.checkString(req.getParameter("leas_int_rate"));
		dm.prd_int_rate = Util.checkString(req.getParameter("prd_int_rate"));
		dm.tms_leas_amt = Util.checkString(req.getParameter("tms_leas_amt"));
		dm.tot_leas_fee = Util.checkString(req.getParameter("tot_leas_fee"));
		dm.decid_amt = Util.checkString(req.getParameter("decid_amt"));
		dm.prd_int = Util.checkString(req.getParameter("prd_int"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8023_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8023_u(dm);
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
	public void fc_func_8024_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8024_DDataSet ds = null;
		FC_FUNC_8024_DDM dm = new FC_FUNC_8024_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8024_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8024_d(dm);
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
	public void fc_func_8031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8031_LDataSet ds = null;
		FC_FUNC_8031_LDM dm = new FC_FUNC_8031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8031_l(dm);
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
	public void fc_func_8032_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8032_IDataSet ds = null;
		FC_FUNC_8032_IDM dm = new FC_FUNC_8032_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_hire_clsf_cd = Util.checkString(req.getParameter("leas_hire_clsf_cd"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.grid1_mode = (String)hash.get("m");
		dm.grid1_rownum = (String)hash.get("rownum");
		dm.grid1_hsty_seq = (String)hash.get("hsty_seq");
		dm.grid1_pymt_plan_dt = (String)hash.get("pymt_plan_dt");
		dm.grid1_pymt_plan_prcp = (String)hash.get("pymt_plan_prcp");
		dm.grid1_pymt_plan_int = (String)hash.get("pymt_plan_int");
		dm.grid1_bal = (String)hash.get("bal");
		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8032_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8032_i(dm);
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
	public void fc_func_8033_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8033_DDataSet ds = null;
		FC_FUNC_8033_DDM dm = new FC_FUNC_8033_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.grid1_mode = (String)hash.get("m");
		dm.grid1_rownum = (String)hash.get("rownum");
		dm.grid1_pay_cost_clsf = (String)hash.get("pay_cost_clsf");
		dm.grid1_hsty_seq = (String)hash.get("hsty_seq");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8033_d(dm);
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
	public void fc_func_8034_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8034_IDataSet ds = null;
		FC_FUNC_8034_IDM dm = new FC_FUNC_8034_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_nm = Util.checkString(req.getParameter("leas_nm"));
		dm.flu_altn_amt = Util.checkString(req.getParameter("flu_altn_amt"));
		dm.flu_altn_dt = Util.checkString(req.getParameter("flu_altn_dt"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8034_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8034_i(dm);
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
	public void fc_func_8035_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8035_DDataSet ds = null;
		FC_FUNC_8035_DDM dm = new FC_FUNC_8035_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.flu_altn_slip_occr_dt = Util.checkString(req.getParameter("flu_altn_slip_occr_dt"));
		dm.flu_altn_slip_clsf_cd = Util.checkString(req.getParameter("flu_altn_slip_clsf_cd"));
		dm.flu_altn_slip_seq = Util.checkString(req.getParameter("flu_altn_slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8035_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8035_d(dm);
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
	
	public void fc_func_8036_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8036_MDataSet ds = null;
		FC_FUNC_8036_MDM dm = new FC_FUNC_8036_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8036_MDataSet)manager.executeCall(dm);

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
	
	public void fc_func_8071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8071_LDataSet ds = null;
		FC_FUNC_8071_LDM dm = new FC_FUNC_8071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8071_l(dm);
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
	public void fc_func_8072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8072_LDataSet ds = null;
		FC_FUNC_8072_LDM dm = new FC_FUNC_8072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8072_l(dm);
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
	
	public void fc_func_8073_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8073_MDataSet ds = null;
		FC_FUNC_8073_MDM dm = new FC_FUNC_8073_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8073_MDataSet)manager.executeCall(dm);

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
	
	public void fc_func_8131_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8131_LDataSet ds = null;
		FC_FUNC_8131_LDM dm = new FC_FUNC_8131_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8131_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8131_l(dm);
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
	public void fc_func_8132_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8132_IDataSet ds = null;
		FC_FUNC_8132_IDM dm = new FC_FUNC_8132_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.memo = Util.checkString(req.getParameter("memo"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8132_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8132_i(dm);
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
	public void fc_func_8040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8040_MDataSet ds = null;
		FC_FUNC_8040_MDM dm = new FC_FUNC_8040_MDM();

		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);


		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8040_m(dm);
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
	public void fc_func_8041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8041_LDataSet ds = null;
		FC_FUNC_8041_LDM dm = new FC_FUNC_8041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8041_l(dm);
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
	public void fc_func_8042_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8042_LDataSet ds = null;
		FC_FUNC_8042_LDM dm = new FC_FUNC_8042_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8042_l(dm);
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
	public void fc_func_8043_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8043_LDataSet ds = null;
		FC_FUNC_8043_LDM dm = new FC_FUNC_8043_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.pay_cost_clsf = Util.checkString(req.getParameter("pay_cost_clsf"));
		dm.hsty_seq = Util.checkString(req.getParameter("hsty_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8043_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8043_l(dm);
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
	public void fc_func_8044_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8044_IDataSet ds = null;
		FC_FUNC_8044_IDM dm = new FC_FUNC_8044_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.pay_cost_clsf = Util.checkString(req.getParameter("pay_cost_clsf"));
		dm.hsty_seq = Util.checkString(req.getParameter("hsty_seq"));
		dm.pymt_dt = Util.checkString(req.getParameter("pymt_dt"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
		dm.dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
		dm.pymt_prcp = Util.checkString(req.getParameter("pymt_prcp"));
		dm.pymt_int = Util.checkString(req.getParameter("pymt_int"));
		dm.won_amt = Util.checkString(req.getParameter("won_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.leimchagbcd = Util.checkString(req.getParameter("leimchagbcd"));
		dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.acctcd = Util.checkString(req.getParameter("acctcd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8044_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8044_i(dm);
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
	public void fc_func_8045_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8045_DDataSet ds = null;
		FC_FUNC_8045_DDM dm = new FC_FUNC_8045_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.pay_cost_clsf = Util.checkString(req.getParameter("pay_cost_clsf"));
		dm.hsty_seq = Util.checkString(req.getParameter("hsty_seq"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8045_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8045_d(dm);
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
	public void fc_func_8050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8050_MDataSet ds = null;
		FC_FUNC_8050_MDM dm = new FC_FUNC_8050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8050_m(dm);
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
	public void fc_func_8051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8051_LDataSet ds = null;
		FC_FUNC_8051_LDM dm = new FC_FUNC_8051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8051_l(dm);
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
	public void fc_func_8052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8052_LDataSet ds = null;
		FC_FUNC_8052_LDM dm = new FC_FUNC_8052_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8052_l(dm);
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
		dm.leas_clsf_cd = (String)hash.get("leas_clsf_cd");
		dm.leas_no = (String)hash.get("leas_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.leas_clsf_cd = Util.getSessionParameterValue(req,"leas_clsf_cd",true);
		dm.leas_no = Util.getSessionParameterValue(req,"leas_no",true);
		*******************************************************************************************/
	}
	public void fc_func_8053_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8053_IDataSet ds = null;
		FC_FUNC_8053_IDM dm = new FC_FUNC_8053_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_no = Util.checkString(req.getParameter("insr_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.insr_nm = Util.checkString(req.getParameter("insr_nm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.bhcompnm = Util.checkString(req.getParameter("bhcompnm"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.insr_amt = Util.checkString(req.getParameter("insr_amt"));
		dm.insr_rate = Util.checkString(req.getParameter("insr_rate"));
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
		dm.won_amt = Util.checkString(req.getParameter("won_amt"));
		dm.pymt_rmks = Util.checkString(req.getParameter("pymt_rmks"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8053_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8053_i(dm);
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
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.insr_no = (String)hash.get("insr_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.insr_nm = (String)hash.get("insr_nm");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.bhcompnm = (String)hash.get("bhcompnm");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.insr_amt = (String)hash.get("insr_amt");
		dm.insr_rate = (String)hash.get("insr_rate");
		dm.frex_cd = (String)hash.get("frex_cd");
		dm.exrate = (String)hash.get("exrate");
		dm.frcr_amt = (String)hash.get("frcr_amt");
		dm.won_amt = (String)hash.get("won_amt");
		dm.pymt_rmks = (String)hash.get("pymt_rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.insr_nm = Util.getSessionParameterValue(req,"insr_nm",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.bhcompnm = Util.getSessionParameterValue(req,"bhcompnm",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dtls_medi_cd = Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.insr_amt = Util.getSessionParameterValue(req,"insr_amt",true);
		dm.insr_rate = Util.getSessionParameterValue(req,"insr_rate",true);
		dm.frex_cd = Util.getSessionParameterValue(req,"frex_cd",true);
		dm.exrate = Util.getSessionParameterValue(req,"exrate",true);
		dm.frcr_amt = Util.getSessionParameterValue(req,"frcr_amt",true);
		dm.won_amt = Util.getSessionParameterValue(req,"won_amt",true);
		dm.pymt_rmks = Util.getSessionParameterValue(req,"pymt_rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_8054_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8054_DDataSet ds = null;
		FC_FUNC_8054_DDM dm = new FC_FUNC_8054_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_no = Util.checkString(req.getParameter("insr_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8054_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8054_d(dm);
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
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.insr_no = (String)hash.get("insr_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		*******************************************************************************************/
	}
	public void fc_func_8060_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8060_MDataSet ds = null;
		FC_FUNC_8060_MDM dm = new FC_FUNC_8060_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8060_m(dm);
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
	public void fc_func_8061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8061_LDataSet ds = null;
		FC_FUNC_8061_LDM dm = new FC_FUNC_8061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8061_l(dm);
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
		dm.asum_yymm = (String)hash.get("asum_yymm");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.asum_yymm = Util.getSessionParameterValue(req,"asum_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void fc_func_8062_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8062_LDataSet ds = null;
		FC_FUNC_8062_LDM dm = new FC_FUNC_8062_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8062_l(dm);
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
		dm.asum_yymm = (String)hash.get("asum_yymm");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.asum_yymm = Util.getSessionParameterValue(req,"asum_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void fc_func_8063_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8063_LDataSet ds = null;
		FC_FUNC_8063_LDM dm = new FC_FUNC_8063_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8063_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8063_l(dm);
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
		dm.asum_yymm = (String)hash.get("asum_yymm");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.asum_yymm = Util.getSessionParameterValue(req,"asum_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void fc_func_8064_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8064_IDataSet ds = null;
		FC_FUNC_8064_IDM dm = new FC_FUNC_8064_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
		dm.libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
		dm.pay_prd_from = Util.checkString(req.getParameter("pay_prd_from"));
		dm.pay_prd_to = Util.checkString(req.getParameter("pay_prd_to"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.frex_cd = (String)hash.get("frex_cd");
		dm.exrate = (String)hash.get("exrate");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8064_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8064_i(dm);
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
		dm.asum_yymm = (String)hash.get("asum_yymm");
		dm.libo_int_rate = (String)hash.get("libo_int_rate");
		dm.pay_prd_from = (String)hash.get("pay_prd_from");
		dm.pay_prd_to = (String)hash.get("pay_prd_to");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.frex_cd = (String)hash.get("frex_cd");
		dm.exrate = (String)hash.get("exrate");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.asum_yymm = Util.getSessionParameterValue(req,"asum_yymm",true);
		dm.libo_int_rate = Util.getSessionParameterValue(req,"libo_int_rate",true);
		dm.pay_prd_from = Util.getSessionParameterValue(req,"pay_prd_from",true);
		dm.pay_prd_to = Util.getSessionParameterValue(req,"pay_prd_to",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.frex_cd = Util.getSessionParameterValue(req,"frex_cd",true);
		dm.exrate = Util.getSessionParameterValue(req,"exrate",true);
		*******************************************************************************************/
	}
	public void fc_func_8065_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8065_UDataSet ds = null;
		FC_FUNC_8065_UDM dm = new FC_FUNC_8065_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8065_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8065_u(dm);
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
		dm.asum_yymm = (String)hash.get("asum_yymm");
		dm.tms = (String)hash.get("tms");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.asum_yymm = Util.getSessionParameterValue(req,"asum_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_8066_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8066_UDataSet ds = null;
		FC_FUNC_8066_UDM dm = new FC_FUNC_8066_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8066_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8066_u(dm);
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
		dm.asum_yymm = (String)hash.get("asum_yymm");
		dm.tms = (String)hash.get("tms");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.asum_yymm = Util.getSessionParameterValue(req,"asum_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_8067_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8067_DDataSet ds = null;
		FC_FUNC_8067_DDM dm = new FC_FUNC_8067_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8067_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8067_d(dm);
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
		dm.asum_yymm = (String)hash.get("asum_yymm");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.asum_yymm = Util.getSessionParameterValue(req,"asum_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void fc_func_8121_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8121_LDataSet ds = null;
		FC_FUNC_8121_LDM dm = new FC_FUNC_8121_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.leas_no1 = Util.checkString(req.getParameter("leas_no1"));
		dm.leas_no2 = Util.checkString(req.getParameter("leas_no2"));
		dm.leas_no3 = Util.checkString(req.getParameter("leas_no3"));
		dm.leas_no4 = Util.checkString(req.getParameter("leas_no4"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8121_l(dm);
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
		dm.leas_no1 = (String)hash.get("leas_no1");
		dm.leas_no2 = (String)hash.get("leas_no2");
		dm.leas_no3 = (String)hash.get("leas_no3");
		dm.leas_no4 = (String)hash.get("leas_no4");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.leas_no1 = Util.getSessionParameterValue(req,"leas_no1",true);
		dm.leas_no2 = Util.getSessionParameterValue(req,"leas_no2",true);
		dm.leas_no3 = Util.getSessionParameterValue(req,"leas_no3",true);
		dm.leas_no4 = Util.getSessionParameterValue(req,"leas_no4",true);
		*******************************************************************************************/
	}
	public void fc_func_8122_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_8122_LDataSet ds = null;
		FC_FUNC_8122_LDM dm = new FC_FUNC_8122_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_8122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_8000EJBHome home = (FC_FUNC_8000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_8000EJB");
			FC_FUNC_8000EJB ejb = home.create();

			ds = ejb.fc_func_8122_l(dm);
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
}
