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

package chosun.ciis.as.leas.wb;

import java.util.*;
import java.rmi.RemoteException;
import java.io.*;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */

public class AS_LEAS_1000WB extends BaseWB {
    
	public void as_leas_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1001_LDataSet ds = null;
		AS_LEAS_1001_LDM dm = new AS_LEAS_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_aset_no = Util.checkString(req.getParameter("fr_aset_no"));
		dm.to_aset_no = Util.checkString(req.getParameter("to_aset_no"));
		dm.aset_nm = Util.checkString(req.getParameter("aset_nm"));
		dm.leas_bldg_cd = Util.checkString(req.getParameter("leas_bldg_cd"));
		dm.leas_obj_good_yn = Util.checkString(req.getParameter("leas_obj_good_yn"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1001_l(dm);
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
		dm.fr_aset_no = (String)hash.get("fr_aset_no");
		dm.to_aset_no = (String)hash.get("to_aset_no");
		dm.aset_nm = (String)hash.get("aset_nm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_aset_no = Util.getSessionParameterValue(req,"fr_aset_no",true);
		dm.to_aset_no = Util.getSessionParameterValue(req,"to_aset_no",true);
		dm.aset_nm = Util.getSessionParameterValue(req,"aset_nm",true);
		*******************************************************************************************/
	}
	public void as_leas_1002_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1002_UDataSet ds = null;
		AS_LEAS_1002_UDM dm = new AS_LEAS_1002_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.leas_obj_good_yn = (String)hash.get("leas_obj_good_yn");
		dm.leas_bldg_cd = (String)hash.get("leas_bldg_cd");
		dm.aset_no = (String)hash.get("aset_no");
		dm.leas_ern_no = (String)hash.get("leas_ern_no");
		dm.leas_ref_aset_no = (String)hash.get("leas_ref_aset_no");
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1002_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1002_u(dm);
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
		dm.aset_no = (String)hash.get("aset_no");
		dm.leas_obj_good_yn = (String)hash.get("leas_obj_good_yn");
		dm.leas_bldg_cd = (String)hash.get("leas_bldg_cd");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.leas_obj_good_yn = Util.getSessionParameterValue(req,"leas_obj_good_yn",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void as_leas_1003_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1003_MDataSet ds = null;
		AS_LEAS_1003_MDM dm = new AS_LEAS_1003_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1003_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */				
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1003_m(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void as_leas_1101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1101_MDataSet ds = null;
		AS_LEAS_1101_MDM dm = new AS_LEAS_1101_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1101_m(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void as_leas_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1102_LDataSet ds = null;
		AS_LEAS_1102_LDM dm = new AS_LEAS_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.hire_dlco_nm = Util.checkString(req.getParameter("hire_dlco_nm"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
		dm.leas_fr_dt_1 = Util.checkString(req.getParameter("leas_fr_dt_1"));
		dm.leas_fr_dt_2 = Util.checkString(req.getParameter("leas_fr_dt_2"));
		dm.leas_to_dt_1 = Util.checkString(req.getParameter("leas_to_dt_1"));
		dm.leas_to_dt_2 = Util.checkString(req.getParameter("leas_to_dt_2"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1102_l(dm);
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
		dm.cntr_star = (String)hash.get("cntr_star");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_no = (String)hash.get("cntr_no");
		dm.hire_dlco_nm = (String)hash.get("hire_dlco_nm");
		dm.hire_dlco_ern = (String)hash.get("hire_dlco_ern");
		dm.leas_fr_dt_1 = (String)hash.get("leas_fr_dt_1");
		dm.leas_fr_dt_2 = (String)hash.get("leas_fr_dt_2");
		dm.leas_to_dt_1 = (String)hash.get("leas_to_dt_1");
		dm.leas_to_dt_2 = (String)hash.get("leas_to_dt_2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		dm.hire_dlco_nm = Util.getSessionParameterValue(req,"hire_dlco_nm",true);
		dm.hire_dlco_ern = Util.getSessionParameterValue(req,"hire_dlco_ern",true);
		dm.leas_fr_dt_1 = Util.getSessionParameterValue(req,"leas_fr_dt_1",true);
		dm.leas_fr_dt_2 = Util.getSessionParameterValue(req,"leas_fr_dt_2",true);
		dm.leas_to_dt_1 = Util.getSessionParameterValue(req,"leas_to_dt_1",true);
		dm.leas_to_dt_2 = Util.getSessionParameterValue(req,"leas_to_dt_2",true);
		*******************************************************************************************/
	}
	public void as_leas_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1103_ADataSet ds = null;
		AS_LEAS_1103_ADM dm = new AS_LEAS_1103_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
		dm.leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
		dm.leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
		dm.draft_no = Util.checkString(req.getParameter("draft_no"));
		dm.cntr_leas_amt = Util.checkString(req.getParameter("cntr_leas_amt"));
		dm.leas_cntr_dt = Util.checkString(req.getParameter("leas_cntr_dt"));
		dm.cntr_mang_amt = Util.checkString(req.getParameter("cntr_mang_amt"));
		dm.midw_expy_dt = Util.checkString(req.getParameter("midw_expy_dt"));
		dm.cntr_gurt_amt = Util.checkString(req.getParameter("cntr_gurt_amt"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));
		dm.leas_clam_cycl = Util.checkString(req.getParameter("leas_clam_cycl"));
		dm.mang_clam_cycl = Util.checkString(req.getParameter("mang_clam_cycl"));
		dm.pymt_clsf = Util.checkString(req.getParameter("pymt_clsf"));
		dm.expy_remk = Util.checkString(req.getParameter("expy_remk"));
		dm.good_clsf = Util.checkString(req.getParameter("good_clsf"));
		dm.ser_no = Util.checkString(req.getParameter("ser_no"));
		dm.leas_area_size = Util.checkString(req.getParameter("leas_area_size"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.gurt_dlco_ern = Util.checkString(req.getParameter("gurt_dlco_ern"));
		dm.ref_cntr_no = Util.checkString(req.getParameter("ref_cntr_no"));
		dm.leas_dlco_ern = Util.checkString(req.getParameter("leas_dlco_ern"));
		dm.hire_dlco_clsf_cd = Util.checkString(req.getParameter("hire_dlco_clsf_cd"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
		dm.end_clsf = Util.checkString(req.getParameter("end_clsf"));
		dm.vat_non_yn = Util.checkString(req.getParameter("vat_non_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.frex_rcpm_yn = Util.checkString(req.getParameter("frex_rcpm_yn"));
		dm.email = Util.checkString(req.getParameter("email"));
		dm.leas_telno1 = Util.checkString(req.getParameter("leas_telno1"));
		dm.leas_telno2 = Util.checkString(req.getParameter("leas_telno2"));
		dm.leas_telno3 = Util.checkString(req.getParameter("leas_telno3"));		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1103_a(dm);
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

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.leas_fr_dt = (String)hash.get("leas_fr_dt");
		dm.leas_to_dt = (String)hash.get("leas_to_dt");
		dm.draft_no = (String)hash.get("draft_no");
		dm.cntr_leas_amt = (String)hash.get("cntr_leas_amt");
		dm.leas_cntr_dt = (String)hash.get("leas_cntr_dt");
		dm.cntr_mang_amt = (String)hash.get("cntr_mang_amt");
		dm.midw_expy_dt = (String)hash.get("midw_expy_dt");
		dm.cntr_gurt_amt = (String)hash.get("cntr_gurt_amt");
		dm.cntr_star = (String)hash.get("cntr_star");
		dm.leas_clam_cycl = (String)hash.get("leas_clam_cycl");
		dm.mang_clam_cycl = (String)hash.get("mang_clam_cycl");
		dm.pymt_clsf = (String)hash.get("pymt_clsf");
		dm.expy_remk = (String)hash.get("expy_remk");
		dm.good_clsf = (String)hash.get("good_clsf");
		dm.ser_no = (String)hash.get("ser_no");
		dm.leas_area_size = (String)hash.get("leas_area_size");
		dm.remk = (String)hash.get("remk");
		dm.gurt_dlco_ern = (String)hash.get("gurt_dlco_ern");
		dm.ref_cntr_no = (String)hash.get("ref_cntr_no");
		dm.leas_dlco_ern = (String)hash.get("leas_dlco_ern");
		dm.hire_dlco_clsf_cd = (String)hash.get("hire_dlco_clsf_cd");
		dm.hire_dlco_ern = (String)hash.get("hire_dlco_ern");
		dm.end_clsf = (String)hash.get("end_clsf");
		dm.vat_non_yn = (String)hash.get("vat_non_yn");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.frex_rcpm_yn = (String)hash.get("frex_rcpm_yn");
		dm.email = (String)hash.get("email");
		dm.leas_telno1 = (String)hash.get("leas_telno1");
		dm.leas_telno2 = (String)hash.get("leas_telno2");
		dm.leas_telno3 = (String)hash.get("leas_telno3");		
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.leas_fr_dt = Util.getSessionParameterValue(req,"leas_fr_dt",true);
		dm.leas_to_dt = Util.getSessionParameterValue(req,"leas_to_dt",true);
		dm.draft_no = Util.getSessionParameterValue(req,"draft_no",true);
		dm.cntr_leas_amt = Util.getSessionParameterValue(req,"cntr_leas_amt",true);
		dm.leas_cntr_dt = Util.getSessionParameterValue(req,"leas_cntr_dt",true);
		dm.cntr_mang_amt = Util.getSessionParameterValue(req,"cntr_mang_amt",true);
		dm.midw_expy_dt = Util.getSessionParameterValue(req,"midw_expy_dt",true);
		dm.cntr_gurt_amt = Util.getSessionParameterValue(req,"cntr_gurt_amt",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		dm.leas_clam_cycl = Util.getSessionParameterValue(req,"leas_clam_cycl",true);
		dm.mang_clam_cycl = Util.getSessionParameterValue(req,"mang_clam_cycl",true);
		dm.pymt_clsf = Util.getSessionParameterValue(req,"pymt_clsf",true);
		dm.expy_remk = Util.getSessionParameterValue(req,"expy_remk",true);
		dm.good_clsf = Util.getSessionParameterValue(req,"good_clsf",true);
		dm.ser_no = Util.getSessionParameterValue(req,"ser_no",true);
		dm.leas_area_size = Util.getSessionParameterValue(req,"leas_area_size",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.gurt_dlco_ern = Util.getSessionParameterValue(req,"gurt_dlco_ern",true);
		dm.ref_cntr_no = Util.getSessionParameterValue(req,"ref_cntr_no",true);
		dm.leas_dlco_ern = Util.getSessionParameterValue(req,"leas_dlco_ern",true);
		dm.hire_dlco_clsf_cd = Util.getSessionParameterValue(req,"hire_dlco_clsf_cd",true);
		dm.hire_dlco_ern = Util.getSessionParameterValue(req,"hire_dlco_ern",true);
		dm.end_clsf = Util.getSessionParameterValue(req,"end_clsf",true);
		dm.vat_non_yn = Util.getSessionParameterValue(req,"vat_non_yn",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.frex_rcpm_yn = Util.getSessionParameterValue(req,"frex_rcpm_yn",true);
		dm.email = Util.getSessionParameterValue(req,"email",true);
		dm.leas_telno1 = Util.getSessionParameterValue(req,"leas_telno1",true);
		dm.leas_telno2 = Util.getSessionParameterValue(req,"leas_telno2",true);
		dm.leas_telno3 = Util.getSessionParameterValue(req,"leas_telno3",true);		
		*******************************************************************************************/
	}
	public void as_leas_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1104_LDataSet ds = null;
		AS_LEAS_1104_LDM dm = new AS_LEAS_1104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1104_l(dm);
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
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}
	public void as_leas_1105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1105_LDataSet ds = null;
		AS_LEAS_1105_LDM dm = new AS_LEAS_1105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1105_l(dm);
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		*******************************************************************************************/
	}
	public void as_leas_1106_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1106_LDataSet ds = null;
		AS_LEAS_1106_LDM dm = new AS_LEAS_1106_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1106_l(dm);
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
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}
	public void as_leas_1107_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1107_MDataSet ds = null;
		AS_LEAS_1107_MDM dm = new AS_LEAS_1107_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1107_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();
						
			ds = ejb.as_leas_1107_m(dm);
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

		*******************************************************************************************/

		/*******************************************************************************************
		*******************************************************************************************/
	}
	public void as_leas_1108_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1108_IDataSet ds = null;
		AS_LEAS_1108_IDM dm = new AS_LEAS_1108_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
		dm.leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
		dm.leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
		dm.draft_no = Util.checkString(req.getParameter("draft_no"));
		dm.cntr_leas_amt = Util.checkString(req.getParameter("cntr_leas_amt"));
		dm.leas_cntr_dt = Util.checkString(req.getParameter("leas_cntr_dt"));
		dm.cntr_mang_amt = Util.checkString(req.getParameter("cntr_mang_amt"));
		dm.midw_expy_dt = Util.checkString(req.getParameter("midw_expy_dt"));
		dm.cntr_gurt_amt = Util.checkString(req.getParameter("cntr_gurt_amt"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));
		dm.leas_clam_cycl = Util.checkString(req.getParameter("leas_clam_cycl"));
		dm.mang_clam_cycl = Util.checkString(req.getParameter("mang_clam_cycl"));
		dm.pymt_clsf = Util.checkString(req.getParameter("pymt_clsf"));
		dm.expy_remk = Util.checkString(req.getParameter("expy_remk"));
		dm.good_clsf = Util.checkString(req.getParameter("good_clsf"));
		dm.ser_no = Util.checkString(req.getParameter("ser_no"));
		dm.leas_area_size = Util.checkString(req.getParameter("leas_area_size"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.gurt_dlco_ern = Util.checkString(req.getParameter("gurt_dlco_ern"));
		dm.ref_cntr_no = Util.checkString(req.getParameter("ref_cntr_no"));
		dm.leas_dlco_ern = Util.checkString(req.getParameter("leas_dlco_ern"));
		dm.hire_dlco_clsf_cd = Util.checkString(req.getParameter("hire_dlco_clsf_cd"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
		dm.end_clsf = Util.checkString(req.getParameter("end_clsf"));
		dm.gurt_tot_amt = Util.checkString(req.getParameter("gurt_tot_amt"));
		dm.gurt_amt = Util.checkString(req.getParameter("gurt_amt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.frex_rcpm_yn = Util.checkString(req.getParameter("frex_rcpm_yn"));
		dm.email = Util.checkString(req.getParameter("email"));		

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1108_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1108_i(dm);
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.leas_fr_dt = (String)hash.get("leas_fr_dt");
		dm.leas_to_dt = (String)hash.get("leas_to_dt");
		dm.draft_no = (String)hash.get("draft_no");
		dm.cntr_leas_amt = (String)hash.get("cntr_leas_amt");
		dm.leas_cntr_dt = (String)hash.get("leas_cntr_dt");
		dm.cntr_mang_amt = (String)hash.get("cntr_mang_amt");
		dm.midw_expy_dt = (String)hash.get("midw_expy_dt");
		dm.cntr_gurt_amt = (String)hash.get("cntr_gurt_amt");
		dm.cntr_star = (String)hash.get("cntr_star");
		dm.leas_clam_cycl = (String)hash.get("leas_clam_cycl");
		dm.mang_clam_cycl = (String)hash.get("mang_clam_cycl");
		dm.pymt_clsf = (String)hash.get("pymt_clsf");
		dm.expy_remk = (String)hash.get("expy_remk");
		dm.good_clsf = (String)hash.get("good_clsf");
		dm.ser_no = (String)hash.get("ser_no");
		dm.leas_area_size = (String)hash.get("leas_area_size");
		dm.remk = (String)hash.get("remk");
		dm.gurt_dlco_ern = (String)hash.get("gurt_dlco_ern");
		dm.ref_cntr_no = (String)hash.get("ref_cntr_no");
		dm.leas_dlco_ern = (String)hash.get("leas_dlco_ern");
		dm.hire_dlco_clsf_cd = (String)hash.get("hire_dlco_clsf_cd");
		dm.hire_dlco_ern = (String)hash.get("hire_dlco_ern");
		dm.end_clsf = (String)hash.get("end_clsf");
		dm.gurt_tot_amt = (String)hash.get("gurt_tot_amt");
		dm.gurt_amt = (String)hash.get("gurt_amt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.leas_fr_dt = Util.getSessionParameterValue(req,"leas_fr_dt",true);
		dm.leas_to_dt = Util.getSessionParameterValue(req,"leas_to_dt",true);
		dm.draft_no = Util.getSessionParameterValue(req,"draft_no",true);
		dm.cntr_leas_amt = Util.getSessionParameterValue(req,"cntr_leas_amt",true);
		dm.leas_cntr_dt = Util.getSessionParameterValue(req,"leas_cntr_dt",true);
		dm.cntr_mang_amt = Util.getSessionParameterValue(req,"cntr_mang_amt",true);
		dm.midw_expy_dt = Util.getSessionParameterValue(req,"midw_expy_dt",true);
		dm.cntr_gurt_amt = Util.getSessionParameterValue(req,"cntr_gurt_amt",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		dm.leas_clam_cycl = Util.getSessionParameterValue(req,"leas_clam_cycl",true);
		dm.mang_clam_cycl = Util.getSessionParameterValue(req,"mang_clam_cycl",true);
		dm.pymt_clsf = Util.getSessionParameterValue(req,"pymt_clsf",true);
		dm.expy_remk = Util.getSessionParameterValue(req,"expy_remk",true);
		dm.good_clsf = Util.getSessionParameterValue(req,"good_clsf",true);
		dm.ser_no = Util.getSessionParameterValue(req,"ser_no",true);
		dm.leas_area_size = Util.getSessionParameterValue(req,"leas_area_size",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.gurt_dlco_ern = Util.getSessionParameterValue(req,"gurt_dlco_ern",true);
		dm.ref_cntr_no = Util.getSessionParameterValue(req,"ref_cntr_no",true);
		dm.leas_dlco_ern = Util.getSessionParameterValue(req,"leas_dlco_ern",true);
		dm.hire_dlco_clsf_cd = Util.getSessionParameterValue(req,"hire_dlco_clsf_cd",true);
		dm.hire_dlco_ern = Util.getSessionParameterValue(req,"hire_dlco_ern",true);
		dm.end_clsf = Util.getSessionParameterValue(req,"end_clsf",true);
		dm.gurt_tot_amt = Util.getSessionParameterValue(req,"gurt_tot_amt",true);
		dm.gurt_amt = Util.getSessionParameterValue(req,"gurt_amt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	
	public void as_leas_1200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1200_MDataSet ds = null;
		AS_LEAS_1200_MDM dm = new AS_LEAS_1200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void as_leas_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1201_LDataSet ds = null;
		AS_LEAS_1201_LDM dm = new AS_LEAS_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_yy = Util.checkString(req.getParameter("clam_yy"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*			
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1201_l(dm);
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
		dm.clam_yy = (String)hash.get("clam_yy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_yy = Util.getSessionParameterValue(req,"clam_yy",true);
		*******************************************************************************************/
	}
	public void as_leas_1202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1202_LDataSet ds = null;
		AS_LEAS_1202_LDM dm = new AS_LEAS_1202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1202_l(dm);
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
		dm.clam_dy = (String)hash.get("clam_dy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_dy = Util.getSessionParameterValue(req,"clam_dy",true);
		*******************************************************************************************/
	}
	public void as_leas_1203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1203_LDataSet ds = null;
		AS_LEAS_1203_LDM dm = new AS_LEAS_1203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_dt = Util.checkString(req.getParameter("clam_dt"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1203_l(dm);
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
		dm.clam_dy = (String)hash.get("clam_dy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_dy = Util.getSessionParameterValue(req,"clam_dy",true);
		*******************************************************************************************/
	}
	public void as_leas_1204_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1204_MDataSet ds = null;
		AS_LEAS_1204_MDM dm = new AS_LEAS_1204_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1204_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1204_m(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void as_leas_1205_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1205_ADataSet ds = null;
		AS_LEAS_1205_ADM dm = new AS_LEAS_1205_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println("==============================================================");
		System.out.println(multiUpdateData);
		System.out.println("==============================================================");
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.leas_clam_amt = (String)hash.get("leas_clam_amt");
		dm.mang_clam_amt = (String)hash.get("mang_clam_amt");
		dm.vat_clam_amt = (String)hash.get("vat_clam_amt");

		dm.clam_dt = Util.checkString(req.getParameter("clam_dt"));		
		dm.clam_star = (String)hash.get("clam_star");
		
		dm.last_leas_clam_dt = (String)hash.get("last_leas_clam_dt");
		dm.last_mang_clam_dt = (String)hash.get("last_mang_clam_dt");
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1205_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1205_a(dm);
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

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.leas_clam_amt = (String)hash.get("leas_clam_amt");
		dm.mang_clam_amt = (String)hash.get("mang_clam_amt");
		dm.vat_clam_amt = (String)hash.get("vat_clam_amt");
		dm.clam_dy = (String)hash.get("clam_dy");
		dm.last_leas_clam_dt = (String)hash.get("last_leas_clam_dt");
		dm.last_mang_clam_dt = (String)hash.get("last_mang_clam_dt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.leas_clam_amt = Util.getSessionParameterValue(req,"leas_clam_amt",true);
		dm.mang_clam_amt = Util.getSessionParameterValue(req,"mang_clam_amt",true);
		dm.vat_clam_amt = Util.getSessionParameterValue(req,"vat_clam_amt",true);
		dm.clam_dy = Util.getSessionParameterValue(req,"clam_dy",true);
		dm.last_leas_clam_dt = Util.getSessionParameterValue(req,"last_leas_clam_dt",true);
		dm.last_mang_clam_dt = Util.getSessionParameterValue(req,"last_mang_clam_dt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void as_leas_1206_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1206_DDataSet ds = null;
		AS_LEAS_1206_DDM dm = new AS_LEAS_1206_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1206_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1206_d(dm);
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
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		*******************************************************************************************/
	}
	public void as_leas_1207_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1207_ADataSet ds = null;
		AS_LEAS_1207_ADM dm = new AS_LEAS_1207_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1207_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1207_a(dm);
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
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}

	public void as_leas_1208_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1208_ADataSet ds = null;
		AS_LEAS_1208_ADM dm = new AS_LEAS_1208_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1208_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1208_a(dm);
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
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	
	public void as_leas_1210_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1210_IDataSet ds = null;
		AS_LEAS_1210_IDM dm = new AS_LEAS_1210_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));
		dm.leas_clam_amt = Util.checkString(req.getParameter("leas_clam_amt"));
		dm.mang_clam_amt = Util.checkString(req.getParameter("mang_clam_amt"));
		dm.vat_clam_amt = Util.checkString(req.getParameter("vat_clam_amt"));
		dm.clam_dt = Util.checkString(req.getParameter("clam_dt"));
		dm.upd_slip_yymm = Util.checkString(req.getParameter("upd_slip_yymm"));
		dm.upd_slip_dt = Util.checkString(req.getParameter("upd_slip_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1210_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1210_i(dm);
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.leas_clam_amt = (String)hash.get("leas_clam_amt");
		dm.mang_clam_amt = (String)hash.get("mang_clam_amt");
		dm.vat_clam_amt = (String)hash.get("vat_clam_amt");
		dm.clam_dt = (String)hash.get("clam_dt");
		dm.upd_slip_yymm = (String)hash.get("upd_slip_yymm");
		dm.upd_slip_dt = (String)hash.get("upd_slip_dt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.leas_clam_amt = Util.getSessionParameterValue(req,"leas_clam_amt",true);
		dm.mang_clam_amt = Util.getSessionParameterValue(req,"mang_clam_amt",true);
		dm.vat_clam_amt = Util.getSessionParameterValue(req,"vat_clam_amt",true);
		dm.clam_dt = Util.getSessionParameterValue(req,"clam_dt",true);
		dm.upd_slip_yymm = Util.getSessionParameterValue(req,"upd_slip_yymm",true);
		dm.upd_slip_dt = Util.getSessionParameterValue(req,"upd_slip_dt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}

	public void as_leas_1211_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1211_ADataSet ds = null;
		AS_LEAS_1211_ADM dm = new AS_LEAS_1211_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_dt = Util.checkString(req.getParameter("clam_dt"));
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1211_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1211_a(dm);
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
		dm.clam_dt = (String)hash.get("clam_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_dt = Util.getSessionParameterValue(req,"clam_dt",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}

	public void as_leas_1212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1212_ADataSet ds = null;
		AS_LEAS_1212_ADM dm = new AS_LEAS_1212_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_dt = Util.checkString(req.getParameter("clam_dt"));
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1212_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1212_a(dm);
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
		dm.clam_dt = (String)hash.get("clam_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_dt = Util.getSessionParameterValue(req,"clam_dt",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}

	public void as_leas_1300_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1300_MDataSet ds = null;
		AS_LEAS_1300_MDM dm = new AS_LEAS_1300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void as_leas_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1301_LDataSet ds = null;
		AS_LEAS_1301_LDM dm = new AS_LEAS_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */				
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1301_l(dm);
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
		dm.hire_dlco_ern = (String)hash.get("hire_dlco_ern");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_no = (String)hash.get("cntr_no");
		dm.leas_comp_yn = (String)hash.get("leas_comp_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.hire_dlco_ern = Util.getSessionParameterValue(req,"hire_dlco_ern",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		dm.leas_comp_yn = Util.getSessionParameterValue(req,"leas_comp_yn",true);
		*******************************************************************************************/
	}

	public void as_leas_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1302_LDataSet ds = null;
		AS_LEAS_1302_LDM dm = new AS_LEAS_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1302_l(dm);
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
		dm.occr_dt = (String)hash.get("occr_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		*******************************************************************************************/
	}
 
	public void as_leas_1303_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1303_SDataSet ds = null;
		AS_LEAS_1303_SDM dm = new AS_LEAS_1303_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1303_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1303_s(dm);
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
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_leas_1304_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1304_IDataSet ds = null;
		AS_LEAS_1304_IDM dm = new AS_LEAS_1304_IDM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		System.out.println(multiUpdateData3);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
		dm.inout_acct_clsf = Util.checkString(req.getParameter("inout_acct_clsf"));
		dm.gurt_payo_clsf = Util.checkString(req.getParameter("gurt_payo_clsf"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));
		dm.leas_rcpm_amt = Util.checkString(req.getParameter("leas_rcpm_amt"));
		dm.mang_rcpm_amt = Util.checkString(req.getParameter("mang_rcpm_amt"));
		dm.vat_rcpm_amt = Util.checkString(req.getParameter("vat_rcpm_amt"));
		
		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
		
		dm.deps_mode = Util.checkString((String)hash1.get("m")).toUpperCase();
		dm.deps_sub_seq = Util.checkString((String)hash1.get("deps_sub_seq"));
		dm.deps_rcpm_amt = Util.checkString((String)hash1.get("deps_rcpm_amt"));
		dm.deps_rmtt_dt = Util.checkString((String)hash1.get("deps_rmtt_dt"));
		dm.deps_rmtt_plac = Util.checkString((String)hash1.get("deps_rmtt_plac"));
		dm.deps_acct_mang_no = Util.checkString((String)hash1.get("deps_acct_mang_no"));
		dm.deps_coms_amt = Util.checkString((String)hash1.get("deps_coms_amt"));
		dm.deps_biz_reg_no = Util.checkString((String)hash1.get("deps_biz_reg_no"));
		dm.deps_bank_id = Util.checkString((String)hash1.get("deps_bank_id"));
		dm.deps_acct_num = Util.checkString((String)hash1.get("deps_acct_num"));
		dm.deps_tran_date = Util.checkString((String)hash1.get("deps_tran_date"));
		dm.deps_tran_date_seq = Util.checkString((String)hash1.get("deps_tran_date_seq"));
		dm.deps_acct_tonghwa_ref = Util.checkString((String)hash1.get("deps_acct_tonghwa_ref")); 
		dm.deps_frex_amt = Util.checkString((String)hash1.get("deps_frex_amt"));
		
		dm.note_mode = Util.checkString((String)hash2.get("m")).toUpperCase();
		dm.note_sub_seq = Util.checkString((String)hash2.get("note_sub_seq"));
		dm.note_bank_cd = Util.checkString((String)hash2.get("note_bank_cd"));
		dm.note_note_no = Util.checkString((String)hash2.get("note_note_no"));
		dm.note_note_clsf_cd = Util.checkString((String)hash2.get("note_note_clsf_cd"));
		dm.note_comp_dt = Util.checkString((String)hash2.get("note_comp_dt"));
		dm.note_mtry_dt = Util.checkString((String)hash2.get("note_mtry_dt"));
		dm.note_rcpm_amt = Util.checkString((String)hash2.get("note_rcpm_amt"));
		dm.note_issu_cmpy_clsf = Util.checkString((String)hash2.get("note_issu_cmpy_clsf"));
		dm.note_issu_pers_nm = Util.checkString((String)hash2.get("note_issu_pers_nm"));
		dm.note_rcpm_acct = Util.checkString((String)hash2.get("note_rcpm_acct"));
		dm.note_sale_aprv_no = Util.checkString((String)hash2.get("note_sale_aprv_no"));
		
		dm.etc_mode = Util.checkString((String)hash3.get("m")).toUpperCase();
		dm.etc_sub_seq = Util.checkString((String)hash3.get("etc_sub_seq"));
		dm.etc_budg_cd = Util.checkString((String)hash3.get("etc_budg_cd"));
		dm.etc_rcpm_amt = Util.checkString((String)hash3.get("etc_rcpm_amt"));
		dm.etc_bal_occr_slip_clsf = Util.checkString((String)hash3.get("etc_bal_occr_slip_clsf"));
		dm.etc_bal_occr_slip_no = Util.checkString((String)hash3.get("etc_bal_occr_slip_no"));

		dm.trufnd_rcpm_amt = Util.checkString(req.getParameter("trufnd_rcpm_amt"));
		dm.trufnd_dlco_clsf_cd = Util.checkString(req.getParameter("trufnd_dlco_clsf_cd"));
		dm.trufnd_dlco_ern = Util.checkString(req.getParameter("trufnd_dlco_ern"));
		dm.trufnd_slip_clsf_cd = Util.checkString(req.getParameter("trufnd_slip_clsf_cd"));		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1304_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1304_i(dm);
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
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.rcpm_dt = (String)hash.get("rcpm_dt");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.inout_clsf = (String)hash.get("inout_clsf");
		dm.inout_acct_clsf = (String)hash.get("inout_acct_clsf");
		dm.gurt_payo_clsf = (String)hash.get("gurt_payo_clsf");
		dm.remk = (String)hash.get("remk");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.leas_rcpm_amt = (String)hash.get("leas_rcpm_amt");
		dm.mang_rcpm_amt = (String)hash.get("mang_rcpm_amt");
		dm.vat_rcpm_amt = (String)hash.get("vat_rcpm_amt");
		dm.cash_sub_seq = (String)hash.get("cash_sub_seq");
		dm.cash_rcpm_amt = (String)hash.get("cash_rcpm_amt");
		dm.deps_mode = (String)hash.get("deps_mode");
		dm.deps_sub_seq = (String)hash.get("deps_sub_seq");
		dm.deps_rcpm_amt = (String)hash.get("deps_rcpm_amt");
		dm.deps_rmtt_dt = (String)hash.get("deps_rmtt_dt");
		dm.deps_rmtt_plac = (String)hash.get("deps_rmtt_plac");
		dm.deps_acct_mang_no = (String)hash.get("deps_acct_mang_no");
		dm.deps_coms_amt = (String)hash.get("deps_coms_amt");
		dm.deps_biz_reg_no = (String)hash.get("deps_biz_reg_no");
		dm.deps_bank_id = (String)hash.get("deps_bank_id");
		dm.deps_acct_num = (String)hash.get("deps_acct_num");
		dm.deps_tran_date = (String)hash.get("deps_tran_date");
		dm.deps_tran_date_seq = (String)hash.get("deps_tran_date_seq");
		dm.note_mode = (String)hash.get("note_mode");
		dm.note_sub_seq = (String)hash.get("note_sub_seq");
		dm.note_bank_cd = (String)hash.get("note_bank_cd");
		dm.note_note_no = (String)hash.get("note_note_no");
		dm.note_note_clsf_cd = (String)hash.get("note_note_clsf_cd");
		dm.note_comp_dt = (String)hash.get("note_comp_dt");
		dm.note_mtry_dt = (String)hash.get("note_mtry_dt");
		dm.note_rcpm_amt = (String)hash.get("note_rcpm_amt");
		dm.note_issu_cmpy_clsf = (String)hash.get("note_issu_cmpy_clsf");
		dm.note_issu_pers_nm = (String)hash.get("note_issu_pers_nm");
		dm.note_rcpm_acct = (String)hash.get("note_rcpm_acct");
		dm.note_sale_aprv_no = (String)hash.get("note_sale_aprv_no");
		dm.etc_mode = (String)hash.get("etc_mode");
		dm.etc_sub_seq = (String)hash.get("etc_sub_seq");
		dm.etc_budg_cd = (String)hash.get("etc_budg_cd");
		dm.etc_rcpm_amt = (String)hash.get("etc_rcpm_amt");
		dm.etc_bal_occr_slip_clsf = (String)hash.get("etc_bal_occr_slip_clsf");
		dm.etc_bal_occr_slip_no = (String)hash.get("etc_bal_occr_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.rcpm_dt = Util.getSessionParameterValue(req,"rcpm_dt",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.inout_clsf = Util.getSessionParameterValue(req,"inout_clsf",true);
		dm.inout_acct_clsf = Util.getSessionParameterValue(req,"inout_acct_clsf",true);
		dm.gurt_payo_clsf = Util.getSessionParameterValue(req,"gurt_payo_clsf",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.leas_rcpm_amt = Util.getSessionParameterValue(req,"leas_rcpm_amt",true);
		dm.mang_rcpm_amt = Util.getSessionParameterValue(req,"mang_rcpm_amt",true);
		dm.vat_rcpm_amt = Util.getSessionParameterValue(req,"vat_rcpm_amt",true);
		dm.cash_sub_seq = Util.getSessionParameterValue(req,"cash_sub_seq",true);
		dm.cash_rcpm_amt = Util.getSessionParameterValue(req,"cash_rcpm_amt",true);
		dm.deps_mode = Util.getSessionParameterValue(req,"deps_mode",true);
		dm.deps_sub_seq = Util.getSessionParameterValue(req,"deps_sub_seq",true);
		dm.deps_rcpm_amt = Util.getSessionParameterValue(req,"deps_rcpm_amt",true);
		dm.deps_rmtt_dt = Util.getSessionParameterValue(req,"deps_rmtt_dt",true);
		dm.deps_rmtt_plac = Util.getSessionParameterValue(req,"deps_rmtt_plac",true);
		dm.deps_acct_mang_no = Util.getSessionParameterValue(req,"deps_acct_mang_no",true);
		dm.deps_coms_amt = Util.getSessionParameterValue(req,"deps_coms_amt",true);
		dm.deps_biz_reg_no = Util.getSessionParameterValue(req,"deps_biz_reg_no",true);
		dm.deps_bank_id = Util.getSessionParameterValue(req,"deps_bank_id",true);
		dm.deps_acct_num = Util.getSessionParameterValue(req,"deps_acct_num",true);
		dm.deps_tran_date = Util.getSessionParameterValue(req,"deps_tran_date",true);
		dm.deps_tran_date_seq = Util.getSessionParameterValue(req,"deps_tran_date_seq",true);
		dm.note_mode = Util.getSessionParameterValue(req,"note_mode",true);
		dm.note_sub_seq = Util.getSessionParameterValue(req,"note_sub_seq",true);
		dm.note_bank_cd = Util.getSessionParameterValue(req,"note_bank_cd",true);
		dm.note_note_no = Util.getSessionParameterValue(req,"note_note_no",true);
		dm.note_note_clsf_cd = Util.getSessionParameterValue(req,"note_note_clsf_cd",true);
		dm.note_comp_dt = Util.getSessionParameterValue(req,"note_comp_dt",true);
		dm.note_mtry_dt = Util.getSessionParameterValue(req,"note_mtry_dt",true);
		dm.note_rcpm_amt = Util.getSessionParameterValue(req,"note_rcpm_amt",true);
		dm.note_issu_cmpy_clsf = Util.getSessionParameterValue(req,"note_issu_cmpy_clsf",true);
		dm.note_issu_pers_nm = Util.getSessionParameterValue(req,"note_issu_pers_nm",true);
		dm.note_rcpm_acct = Util.getSessionParameterValue(req,"note_rcpm_acct",true);
		dm.note_sale_aprv_no = Util.getSessionParameterValue(req,"note_sale_aprv_no",true);
		dm.etc_mode = Util.getSessionParameterValue(req,"etc_mode",true);
		dm.etc_sub_seq = Util.getSessionParameterValue(req,"etc_sub_seq",true);
		dm.etc_budg_cd = Util.getSessionParameterValue(req,"etc_budg_cd",true);
		dm.etc_rcpm_amt = Util.getSessionParameterValue(req,"etc_rcpm_amt",true);
		dm.etc_bal_occr_slip_clsf = Util.getSessionParameterValue(req,"etc_bal_occr_slip_clsf",true);
		dm.etc_bal_occr_slip_no = Util.getSessionParameterValue(req,"etc_bal_occr_slip_no",true);
		*******************************************************************************************/
	}

	public void as_leas_1305_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1305_ADataSet ds = null;
		AS_LEAS_1305_ADM dm = new AS_LEAS_1305_ADM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		System.out.println(multiUpdateData3);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));		
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));
		dm.leas_rcpm_amt = Util.checkString(req.getParameter("leas_rcpm_amt"));
		dm.mang_rcpm_amt = Util.checkString(req.getParameter("mang_rcpm_amt"));
		dm.vat_rcpm_amt = Util.checkString(req.getParameter("vat_rcpm_amt"));
		
		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
		
		dm.deps_mode = Util.checkString((String)hash1.get("m")).toUpperCase();
		dm.deps_sub_seq = Util.checkString((String)hash1.get("deps_sub_seq"));
		dm.deps_rcpm_amt = Util.checkString((String)hash1.get("deps_rcpm_amt"));
		dm.deps_rmtt_dt = Util.checkString((String)hash1.get("deps_rmtt_dt"));
		dm.deps_rmtt_plac = Util.checkString((String)hash1.get("deps_rmtt_plac"));
		dm.deps_acct_mang_no = Util.checkString((String)hash1.get("deps_acct_mang_no"));
		dm.deps_coms_amt = Util.checkString((String)hash1.get("deps_coms_amt"));
		dm.deps_biz_reg_no = Util.checkString((String)hash1.get("deps_biz_reg_no"));
		dm.deps_bank_id = Util.checkString((String)hash1.get("deps_bank_id"));
		dm.deps_acct_num = Util.checkString((String)hash1.get("deps_acct_num"));
		dm.deps_tran_date = Util.checkString((String)hash1.get("deps_tran_date"));
		dm.deps_tran_date_seq = Util.checkString((String)hash1.get("deps_tran_date_seq"));
		dm.deps_acct_tonghwa_ref = Util.checkString((String)hash1.get("deps_acct_tonghwa_ref"));
		dm.deps_frex_amt = Util.checkString((String)hash1.get("deps_frex_amt"));		
		
		dm.note_mode = Util.checkString((String)hash2.get("m")).toUpperCase();
		dm.note_sub_seq = Util.checkString((String)hash2.get("note_sub_seq"));
		dm.note_bank_cd = Util.checkString((String)hash2.get("note_bank_cd"));
		dm.note_note_no = Util.checkString((String)hash2.get("note_note_no"));
		dm.note_note_clsf_cd = Util.checkString((String)hash2.get("note_note_clsf_cd"));
		dm.note_comp_dt = Util.checkString((String)hash2.get("note_comp_dt"));
		dm.note_mtry_dt = Util.checkString((String)hash2.get("note_mtry_dt"));
		dm.note_rcpm_amt = Util.checkString((String)hash2.get("note_rcpm_amt"));
		dm.note_issu_cmpy_clsf = Util.checkString((String)hash2.get("note_issu_cmpy_clsf"));
		dm.note_issu_pers_nm = Util.checkString((String)hash2.get("note_issu_pers_nm"));
		dm.note_rcpm_acct = Util.checkString((String)hash2.get("note_rcpm_acct"));
		dm.note_sale_aprv_no = Util.checkString((String)hash2.get("note_sale_aprv_no"));
		
		dm.etc_mode = Util.checkString((String)hash3.get("m")).toUpperCase();
		dm.etc_sub_seq = Util.checkString((String)hash3.get("etc_sub_seq"));
		dm.etc_budg_cd = Util.checkString((String)hash3.get("etc_budg_cd"));
		dm.etc_rcpm_amt = Util.checkString((String)hash3.get("etc_rcpm_amt"));
		dm.etc_bal_occr_slip_clsf = Util.checkString((String)hash3.get("etc_bal_occr_slip_clsf"));
		dm.etc_bal_occr_slip_no = Util.checkString((String)hash3.get("etc_bal_occr_slip_no"));

		dm.trufnd_rcpm_amt = Util.checkString(req.getParameter("trufnd_rcpm_amt"));
		dm.trufnd_dlco_clsf_cd = Util.checkString(req.getParameter("trufnd_dlco_clsf_cd"));
		dm.trufnd_dlco_ern = Util.checkString(req.getParameter("trufnd_dlco_ern"));
		dm.trufnd_slip_clsf_cd = Util.checkString(req.getParameter("trufnd_slip_clsf_cd"));	
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1305_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
				
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1305_a(dm);
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

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.rcpm_dt = (String)hash.get("rcpm_dt");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.inout_clsf = (String)hash.get("inout_clsf");
		dm.remk = (String)hash.get("remk");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.leas_rcpm_amt = (String)hash.get("leas_rcpm_amt");
		dm.mang_rcpm_amt = (String)hash.get("mang_rcpm_amt");
		dm.vat_rcpm_amt = (String)hash.get("vat_rcpm_amt");
		dm.cash_sub_seq = (String)hash.get("cash_sub_seq");
		dm.cash_rcpm_amt = (String)hash.get("cash_rcpm_amt");
		dm.deps_mode = (String)hash.get("deps_mode");
		dm.deps_sub_seq = (String)hash.get("deps_sub_seq");
		dm.deps_rcpm_amt = (String)hash.get("deps_rcpm_amt");
		dm.deps_rmtt_dt = (String)hash.get("deps_rmtt_dt");
		dm.deps_rmtt_plac = (String)hash.get("deps_rmtt_plac");
		dm.deps_acct_mang_no = (String)hash.get("deps_acct_mang_no");
		dm.deps_coms_amt = (String)hash.get("deps_coms_amt");
		dm.deps_biz_reg_no = (String)hash.get("deps_biz_reg_no");
		dm.deps_bank_id = (String)hash.get("deps_bank_id");
		dm.deps_acct_num = (String)hash.get("deps_acct_num");
		dm.deps_tran_date = (String)hash.get("deps_tran_date");
		dm.deps_tran_date_seq = (String)hash.get("deps_tran_date_seq");
		dm.note_mode = (String)hash.get("note_mode");
		dm.note_sub_seq = (String)hash.get("note_sub_seq");
		dm.note_bank_cd = (String)hash.get("note_bank_cd");
		dm.note_note_no = (String)hash.get("note_note_no");
		dm.note_note_clsf_cd = (String)hash.get("note_note_clsf_cd");
		dm.note_comp_dt = (String)hash.get("note_comp_dt");
		dm.note_mtry_dt = (String)hash.get("note_mtry_dt");
		dm.note_rcpm_amt = (String)hash.get("note_rcpm_amt");
		dm.note_issu_cmpy_clsf = (String)hash.get("note_issu_cmpy_clsf");
		dm.note_issu_pers_nm = (String)hash.get("note_issu_pers_nm");
		dm.note_rcpm_acct = (String)hash.get("note_rcpm_acct");
		dm.note_sale_aprv_no = (String)hash.get("note_sale_aprv_no");
		dm.etc_mode = (String)hash.get("etc_mode");
		dm.etc_sub_seq = (String)hash.get("etc_sub_seq");
		dm.etc_budg_cd = (String)hash.get("etc_budg_cd");
		dm.etc_rcpm_amt = (String)hash.get("etc_rcpm_amt");
		dm.etc_bal_occr_slip_clsf = (String)hash.get("etc_bal_occr_slip_clsf");
		dm.etc_bal_occr_slip_no = (String)hash.get("etc_bal_occr_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.rcpm_dt = Util.getSessionParameterValue(req,"rcpm_dt",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.inout_clsf = Util.getSessionParameterValue(req,"inout_clsf",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.leas_rcpm_amt = Util.getSessionParameterValue(req,"leas_rcpm_amt",true);
		dm.mang_rcpm_amt = Util.getSessionParameterValue(req,"mang_rcpm_amt",true);
		dm.vat_rcpm_amt = Util.getSessionParameterValue(req,"vat_rcpm_amt",true);
		dm.cash_sub_seq = Util.getSessionParameterValue(req,"cash_sub_seq",true);
		dm.cash_rcpm_amt = Util.getSessionParameterValue(req,"cash_rcpm_amt",true);
		dm.deps_mode = Util.getSessionParameterValue(req,"deps_mode",true);
		dm.deps_sub_seq = Util.getSessionParameterValue(req,"deps_sub_seq",true);
		dm.deps_rcpm_amt = Util.getSessionParameterValue(req,"deps_rcpm_amt",true);
		dm.deps_rmtt_dt = Util.getSessionParameterValue(req,"deps_rmtt_dt",true);
		dm.deps_rmtt_plac = Util.getSessionParameterValue(req,"deps_rmtt_plac",true);
		dm.deps_acct_mang_no = Util.getSessionParameterValue(req,"deps_acct_mang_no",true);
		dm.deps_coms_amt = Util.getSessionParameterValue(req,"deps_coms_amt",true);
		dm.deps_biz_reg_no = Util.getSessionParameterValue(req,"deps_biz_reg_no",true);
		dm.deps_bank_id = Util.getSessionParameterValue(req,"deps_bank_id",true);
		dm.deps_acct_num = Util.getSessionParameterValue(req,"deps_acct_num",true);
		dm.deps_tran_date = Util.getSessionParameterValue(req,"deps_tran_date",true);
		dm.deps_tran_date_seq = Util.getSessionParameterValue(req,"deps_tran_date_seq",true);
		dm.note_mode = Util.getSessionParameterValue(req,"note_mode",true);
		dm.note_sub_seq = Util.getSessionParameterValue(req,"note_sub_seq",true);
		dm.note_bank_cd = Util.getSessionParameterValue(req,"note_bank_cd",true);
		dm.note_note_no = Util.getSessionParameterValue(req,"note_note_no",true);
		dm.note_note_clsf_cd = Util.getSessionParameterValue(req,"note_note_clsf_cd",true);
		dm.note_comp_dt = Util.getSessionParameterValue(req,"note_comp_dt",true);
		dm.note_mtry_dt = Util.getSessionParameterValue(req,"note_mtry_dt",true);
		dm.note_rcpm_amt = Util.getSessionParameterValue(req,"note_rcpm_amt",true);
		dm.note_issu_cmpy_clsf = Util.getSessionParameterValue(req,"note_issu_cmpy_clsf",true);
		dm.note_issu_pers_nm = Util.getSessionParameterValue(req,"note_issu_pers_nm",true);
		dm.note_rcpm_acct = Util.getSessionParameterValue(req,"note_rcpm_acct",true);
		dm.note_sale_aprv_no = Util.getSessionParameterValue(req,"note_sale_aprv_no",true);
		dm.etc_mode = Util.getSessionParameterValue(req,"etc_mode",true);
		dm.etc_sub_seq = Util.getSessionParameterValue(req,"etc_sub_seq",true);
		dm.etc_budg_cd = Util.getSessionParameterValue(req,"etc_budg_cd",true);
		dm.etc_rcpm_amt = Util.getSessionParameterValue(req,"etc_rcpm_amt",true);
		dm.etc_bal_occr_slip_clsf = Util.getSessionParameterValue(req,"etc_bal_occr_slip_clsf",true);
		dm.etc_bal_occr_slip_no = Util.getSessionParameterValue(req,"etc_bal_occr_slip_no",true);
		*******************************************************************************************/
	}

	public void as_leas_1306_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1306_LDataSet ds = null;
		AS_LEAS_1306_LDM dm = new AS_LEAS_1306_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1306_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1306_l(dm);
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.hire_dlco_ern = (String)hash.get("hire_dlco_ern");
		dm.cntr_no = (String)hash.get("cntr_no");
		dm.cntr_star = (String)hash.get("cntr_star");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.hire_dlco_ern = Util.getSessionParameterValue(req,"hire_dlco_ern",true);
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		*******************************************************************************************/
	}

	public void as_leas_1307_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1307_LDataSet ds = null;
		AS_LEAS_1307_LDM dm = new AS_LEAS_1307_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1307_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1307_l(dm);
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
		dm.cntr_no = (String)hash.get("cntr_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		*******************************************************************************************/
	}

	public void as_leas_1308_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1308_IDataSet ds = null;
		AS_LEAS_1308_IDM dm = new AS_LEAS_1308_IDM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		System.out.println(multiUpdateData3);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
		dm.inout_acct_clsf = Util.checkString(req.getParameter("inout_acct_clsf"));
		dm.gurt_payo_clsf = Util.checkString(req.getParameter("gurt_payo_clsf"));		
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.gurt_rcpm_amt = Util.checkString(req.getParameter("gurt_rcpm_amt"));
		dm.precpt_rcpm_amt = Util.checkString(req.getParameter("precpt_rcpm_amt"));
		dm.trufnd_rcpm_amt = Util.checkString(req.getParameter("trufnd_rcpm_amt"));
		dm.trufnd_dlco_clsf_cd = Util.checkString(req.getParameter("trufnd_dlco_clsf_cd"));
		dm.trufnd_dlco_ern = Util.checkString(req.getParameter("trufnd_dlco_ern"));
		dm.trufnd_slip_clsf_cd = Util.checkString(req.getParameter("trufnd_slip_clsf_cd"));

		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));

		dm.deps_mode = Util.checkString((String)hash1.get("m")).toUpperCase();
		dm.deps_sub_seq = Util.checkString((String)hash1.get("deps_sub_seq"));
		dm.deps_rcpm_amt = Util.checkString((String)hash1.get("deps_rcpm_amt"));
		dm.deps_rmtt_dt = Util.checkString((String)hash1.get("deps_rmtt_dt"));
		dm.deps_rmtt_plac = Util.checkString((String)hash1.get("deps_rmtt_plac"));
		dm.deps_acct_mang_no = Util.checkString((String)hash1.get("deps_acct_mang_no"));
		dm.deps_coms_amt = Util.checkString((String)hash1.get("deps_coms_amt"));
		dm.deps_biz_reg_no = Util.checkString((String)hash1.get("deps_biz_reg_no"));
		dm.deps_bank_id = Util.checkString((String)hash1.get("deps_bank_id"));
		dm.deps_acct_num = Util.checkString((String)hash1.get("deps_acct_num"));
		dm.deps_tran_date = Util.checkString((String)hash1.get("deps_tran_date"));
		dm.deps_tran_date_seq = Util.checkString((String)hash1.get("deps_tran_date_seq"));
		dm.deps_acct_tonghwa_ref = Util.checkString((String)hash1.get("deps_acct_tonghwa_ref"));
		dm.deps_frex_amt = Util.checkString((String)hash1.get("deps_frex_amt"));
		
		dm.note_mode = Util.checkString((String)hash2.get("m")).toUpperCase();
		dm.note_sub_seq = Util.checkString((String)hash2.get("note_sub_seq"));
		dm.note_bank_cd = Util.checkString((String)hash2.get("note_bank_cd"));
		dm.note_note_no = Util.checkString((String)hash2.get("note_note_no"));
		dm.note_note_clsf_cd = Util.checkString((String)hash2.get("note_note_clsf_cd"));
		dm.note_comp_dt = Util.checkString((String)hash2.get("note_comp_dt"));
		dm.note_mtry_dt = Util.checkString((String)hash2.get("note_mtry_dt"));
		dm.note_rcpm_amt = Util.checkString((String)hash2.get("note_rcpm_amt"));
		dm.note_issu_cmpy_clsf = Util.checkString((String)hash2.get("note_issu_cmpy_clsf"));
		dm.note_issu_pers_nm = Util.checkString((String)hash2.get("note_issu_pers_nm"));
		dm.note_rcpm_acct = Util.checkString((String)hash2.get("note_rcpm_acct"));
		dm.note_sale_aprv_no = Util.checkString((String)hash2.get("note_sale_aprv_no"));
		
		dm.etc_mode = Util.checkString((String)hash3.get("m")).toUpperCase();
		dm.etc_sub_seq = Util.checkString((String)hash3.get("etc_sub_seq"));
		dm.etc_budg_cd = Util.checkString((String)hash3.get("etc_budg_cd"));
		dm.etc_rcpm_amt = Util.checkString((String)hash3.get("etc_rcpm_amt"));
		dm.etc_bal_occr_slip_clsf = Util.checkString((String)hash3.get("etc_bal_occr_slip_clsf"));
		dm.etc_bal_occr_slip_no = Util.checkString((String)hash3.get("etc_bal_occr_slip_no"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1308_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1308_i(dm);
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
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.inout_clsf = (String)hash.get("inout_clsf");
		dm.inout_acct_clsf = (String)hash.get("inout_acct_clsf");
		dm.gurt_payo_clsf = (String)hash.get("gurt_payo_clsf");
		dm.remk = (String)hash.get("remk");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.gurt_rcpm_amt = (String)hash.get("gurt_rcpm_amt");
		dm.precpt_rcpm_amt = (String)hash.get("precpt_rcpm_amt");
		dm.trufnd_rcpm_amt = (String)hash.get("trufnd_rcpm_amt");
		dm.trufnd_dlco_clsf_cd = (String)hash.get("trufnd_dlco_clsf_cd");
		dm.trufnd_dlco_ern = (String)hash.get("trufnd_dlco_ern");
		dm.trufnd_slip_clsf_cd = (String)hash.get("trufnd_slip_clsf_cd");
		dm.cash_sub_seq = (String)hash.get("cash_sub_seq");
		dm.cash_rcpm_amt = (String)hash.get("cash_rcpm_amt");
		dm.deps_mode = (String)hash.get("deps_mode");
		dm.deps_sub_seq = (String)hash.get("deps_sub_seq");
		dm.deps_rcpm_amt = (String)hash.get("deps_rcpm_amt");
		dm.deps_rmtt_dt = (String)hash.get("deps_rmtt_dt");
		dm.deps_rmtt_plac = (String)hash.get("deps_rmtt_plac");
		dm.deps_acct_mang_no = (String)hash.get("deps_acct_mang_no");
		dm.deps_coms_amt = (String)hash.get("deps_coms_amt");
		dm.deps_biz_reg_no = (String)hash.get("deps_biz_reg_no");
		dm.deps_bank_id = (String)hash.get("deps_bank_id");
		dm.deps_acct_num = (String)hash.get("deps_acct_num");
		dm.deps_tran_date = (String)hash.get("deps_tran_date");
		dm.deps_tran_date_seq = (String)hash.get("deps_tran_date_seq");
		dm.note_mode = (String)hash.get("note_mode");
		dm.note_sub_seq = (String)hash.get("note_sub_seq");
		dm.note_bank_cd = (String)hash.get("note_bank_cd");
		dm.note_note_no = (String)hash.get("note_note_no");
		dm.note_note_clsf_cd = (String)hash.get("note_note_clsf_cd");
		dm.note_comp_dt = (String)hash.get("note_comp_dt");
		dm.note_mtry_dt = (String)hash.get("note_mtry_dt");
		dm.note_rcpm_amt = (String)hash.get("note_rcpm_amt");
		dm.note_issu_cmpy_clsf = (String)hash.get("note_issu_cmpy_clsf");
		dm.note_issu_pers_nm = (String)hash.get("note_issu_pers_nm");
		dm.note_rcpm_acct = (String)hash.get("note_rcpm_acct");
		dm.note_sale_aprv_no = (String)hash.get("note_sale_aprv_no");
		dm.etc_mode = (String)hash.get("etc_mode");
		dm.etc_sub_seq = (String)hash.get("etc_sub_seq");
		dm.etc_budg_cd = (String)hash.get("etc_budg_cd");
		dm.etc_rcpm_amt = (String)hash.get("etc_rcpm_amt");
		dm.etc_bal_occr_slip_clsf = (String)hash.get("etc_bal_occr_slip_clsf");
		dm.etc_bal_occr_slip_no = (String)hash.get("etc_bal_occr_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.inout_clsf = Util.getSessionParameterValue(req,"inout_clsf",true);
		dm.inout_acct_clsf = Util.getSessionParameterValue(req,"inout_acct_clsf",true);
		dm.gurt_payo_clsf = Util.getSessionParameterValue(req,"gurt_payo_clsf",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.gurt_rcpm_amt = Util.getSessionParameterValue(req,"gurt_rcpm_amt",true);
		dm.precpt_rcpm_amt = Util.getSessionParameterValue(req,"precpt_rcpm_amt",true);
		dm.trufnd_rcpm_amt = Util.getSessionParameterValue(req,"trufnd_rcpm_amt",true);
		dm.trufnd_dlco_clsf_cd = Util.getSessionParameterValue(req,"trufnd_dlco_clsf_cd",true);
		dm.trufnd_dlco_ern = Util.getSessionParameterValue(req,"trufnd_dlco_ern",true);
		dm.trufnd_slip_clsf_cd = Util.getSessionParameterValue(req,"trufnd_slip_clsf_cd",true);
		dm.cash_sub_seq = Util.getSessionParameterValue(req,"cash_sub_seq",true);
		dm.cash_rcpm_amt = Util.getSessionParameterValue(req,"cash_rcpm_amt",true);
		dm.deps_mode = Util.getSessionParameterValue(req,"deps_mode",true);
		dm.deps_sub_seq = Util.getSessionParameterValue(req,"deps_sub_seq",true);
		dm.deps_rcpm_amt = Util.getSessionParameterValue(req,"deps_rcpm_amt",true);
		dm.deps_rmtt_dt = Util.getSessionParameterValue(req,"deps_rmtt_dt",true);
		dm.deps_rmtt_plac = Util.getSessionParameterValue(req,"deps_rmtt_plac",true);
		dm.deps_acct_mang_no = Util.getSessionParameterValue(req,"deps_acct_mang_no",true);
		dm.deps_coms_amt = Util.getSessionParameterValue(req,"deps_coms_amt",true);
		dm.deps_biz_reg_no = Util.getSessionParameterValue(req,"deps_biz_reg_no",true);
		dm.deps_bank_id = Util.getSessionParameterValue(req,"deps_bank_id",true);
		dm.deps_acct_num = Util.getSessionParameterValue(req,"deps_acct_num",true);
		dm.deps_tran_date = Util.getSessionParameterValue(req,"deps_tran_date",true);
		dm.deps_tran_date_seq = Util.getSessionParameterValue(req,"deps_tran_date_seq",true);
		dm.note_mode = Util.getSessionParameterValue(req,"note_mode",true);
		dm.note_sub_seq = Util.getSessionParameterValue(req,"note_sub_seq",true);
		dm.note_bank_cd = Util.getSessionParameterValue(req,"note_bank_cd",true);
		dm.note_note_no = Util.getSessionParameterValue(req,"note_note_no",true);
		dm.note_note_clsf_cd = Util.getSessionParameterValue(req,"note_note_clsf_cd",true);
		dm.note_comp_dt = Util.getSessionParameterValue(req,"note_comp_dt",true);
		dm.note_mtry_dt = Util.getSessionParameterValue(req,"note_mtry_dt",true);
		dm.note_rcpm_amt = Util.getSessionParameterValue(req,"note_rcpm_amt",true);
		dm.note_issu_cmpy_clsf = Util.getSessionParameterValue(req,"note_issu_cmpy_clsf",true);
		dm.note_issu_pers_nm = Util.getSessionParameterValue(req,"note_issu_pers_nm",true);
		dm.note_rcpm_acct = Util.getSessionParameterValue(req,"note_rcpm_acct",true);
		dm.note_sale_aprv_no = Util.getSessionParameterValue(req,"note_sale_aprv_no",true);
		dm.etc_mode = Util.getSessionParameterValue(req,"etc_mode",true);
		dm.etc_sub_seq = Util.getSessionParameterValue(req,"etc_sub_seq",true);
		dm.etc_budg_cd = Util.getSessionParameterValue(req,"etc_budg_cd",true);
		dm.etc_rcpm_amt = Util.getSessionParameterValue(req,"etc_rcpm_amt",true);
		dm.etc_bal_occr_slip_clsf = Util.getSessionParameterValue(req,"etc_bal_occr_slip_clsf",true);
		dm.etc_bal_occr_slip_no = Util.getSessionParameterValue(req,"etc_bal_occr_slip_no",true);
		*******************************************************************************************/
	}

	public void as_leas_1309_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1309_ADataSet ds = null;
		AS_LEAS_1309_ADM dm = new AS_LEAS_1309_ADM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		System.out.println(multiUpdateData3);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.gurt_rcpm_amt = Util.checkString(req.getParameter("gurt_rcpm_amt"));
		dm.precpt_rcpm_amt = Util.checkString(req.getParameter("precpt_rcpm_amt"));
		dm.trufnd_rcpm_amt = Util.checkString(req.getParameter("trufnd_rcpm_amt"));
		dm.trufnd_dlco_clsf_cd = Util.checkString(req.getParameter("trufnd_dlco_clsf_cd"));
		dm.trufnd_dlco_ern = Util.checkString(req.getParameter("trufnd_dlco_ern"));
		dm.trufnd_slip_clsf_cd = Util.checkString(req.getParameter("trufnd_slip_clsf_cd"));
		
		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
		
		dm.deps_mode = Util.checkString((String)hash1.get("m")).toUpperCase();
		dm.deps_sub_seq = Util.checkString((String)hash1.get("deps_sub_seq"));
		dm.deps_rcpm_amt = Util.checkString((String)hash1.get("deps_rcpm_amt"));
		dm.deps_rmtt_dt = Util.checkString((String)hash1.get("deps_rmtt_dt"));
		dm.deps_rmtt_plac = Util.checkString((String)hash1.get("deps_rmtt_plac"));
		dm.deps_acct_mang_no = Util.checkString((String)hash1.get("deps_acct_mang_no"));
		dm.deps_coms_amt = Util.checkString((String)hash1.get("deps_coms_amt"));
		dm.deps_biz_reg_no = Util.checkString((String)hash1.get("deps_biz_reg_no"));
		dm.deps_bank_id = Util.checkString((String)hash1.get("deps_bank_id"));
		dm.deps_acct_num = Util.checkString((String)hash1.get("deps_acct_num"));
		dm.deps_tran_date = Util.checkString((String)hash1.get("deps_tran_date"));
		dm.deps_tran_date_seq = Util.checkString((String)hash1.get("deps_tran_date_seq"));
		dm.deps_acct_tonghwa_ref = Util.checkString(req.getParameter("deps_acct_tonghwa_ref"));
		dm.deps_frex_amt = Util.checkString(req.getParameter("deps_frex_amt"));
		
		dm.note_mode = Util.checkString((String)hash2.get("m")).toUpperCase();
		dm.note_sub_seq = Util.checkString((String)hash2.get("note_sub_seq"));
		dm.note_bank_cd = Util.checkString((String)hash2.get("note_bank_cd"));
		dm.note_note_no = Util.checkString((String)hash2.get("note_note_no"));
		dm.note_note_clsf_cd = Util.checkString((String)hash2.get("note_note_clsf_cd"));
		dm.note_comp_dt = Util.checkString((String)hash2.get("note_comp_dt"));
		dm.note_mtry_dt = Util.checkString((String)hash2.get("note_mtry_dt"));
		dm.note_rcpm_amt = Util.checkString((String)hash2.get("note_rcpm_amt"));
		dm.note_issu_cmpy_clsf = Util.checkString((String)hash2.get("note_issu_cmpy_clsf"));
		dm.note_issu_pers_nm = Util.checkString((String)hash2.get("note_issu_pers_nm"));
		dm.note_rcpm_acct = Util.checkString((String)hash2.get("note_rcpm_acct"));
		dm.note_sale_aprv_no = Util.checkString((String)hash2.get("note_sale_aprv_no"));
		
		dm.etc_mode = Util.checkString((String)hash3.get("m")).toUpperCase();
		dm.etc_sub_seq = Util.checkString((String)hash3.get("etc_sub_seq"));
		dm.etc_budg_cd = Util.checkString((String)hash3.get("etc_budg_cd"));
		dm.etc_rcpm_amt = Util.checkString((String)hash3.get("etc_rcpm_amt"));
		dm.etc_bal_occr_slip_clsf = Util.checkString((String)hash3.get("etc_bal_occr_slip_clsf"));
		dm.etc_bal_occr_slip_no = Util.checkString((String)hash3.get("etc_bal_occr_slip_no"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1309_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1309_a(dm);
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

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.inout_clsf = (String)hash.get("inout_clsf");
		dm.remk = (String)hash.get("remk");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.gurt_rcpm_amt = (String)hash.get("gurt_rcpm_amt");
		dm.precpt_rcpm_amt = (String)hash.get("precpt_rcpm_amt");
		dm.trufnd_rcpm_amt = (String)hash.get("trufnd_rcpm_amt");
		dm.trufnd_dlco_clsf_cd = (String)hash.get("trufnd_dlco_clsf_cd");
		dm.trufnd_dlco_ern = (String)hash.get("trufnd_dlco_ern");
		dm.trufnd_slip_clsf_cd = (String)hash.get("trufnd_slip_clsf_cd");
		dm.cash_sub_seq = (String)hash.get("cash_sub_seq");
		dm.cash_rcpm_amt = (String)hash.get("cash_rcpm_amt");
		dm.deps_mode = (String)hash.get("deps_mode");
		dm.deps_sub_seq = (String)hash.get("deps_sub_seq");
		dm.deps_rcpm_amt = (String)hash.get("deps_rcpm_amt");
		dm.deps_rmtt_dt = (String)hash.get("deps_rmtt_dt");
		dm.deps_rmtt_plac = (String)hash.get("deps_rmtt_plac");
		dm.deps_acct_mang_no = (String)hash.get("deps_acct_mang_no");
		dm.deps_coms_amt = (String)hash.get("deps_coms_amt");
		dm.deps_biz_reg_no = (String)hash.get("deps_biz_reg_no");
		dm.deps_bank_id = (String)hash.get("deps_bank_id");
		dm.deps_acct_num = (String)hash.get("deps_acct_num");
		dm.deps_tran_date = (String)hash.get("deps_tran_date");
		dm.deps_tran_date_seq = (String)hash.get("deps_tran_date_seq");
		dm.note_mode = (String)hash.get("note_mode");
		dm.note_sub_seq = (String)hash.get("note_sub_seq");
		dm.note_bank_cd = (String)hash.get("note_bank_cd");
		dm.note_note_no = (String)hash.get("note_note_no");
		dm.note_note_clsf_cd = (String)hash.get("note_note_clsf_cd");
		dm.note_comp_dt = (String)hash.get("note_comp_dt");
		dm.note_mtry_dt = (String)hash.get("note_mtry_dt");
		dm.note_rcpm_amt = (String)hash.get("note_rcpm_amt");
		dm.note_issu_cmpy_clsf = (String)hash.get("note_issu_cmpy_clsf");
		dm.note_issu_pers_nm = (String)hash.get("note_issu_pers_nm");
		dm.note_rcpm_acct = (String)hash.get("note_rcpm_acct");
		dm.note_sale_aprv_no = (String)hash.get("note_sale_aprv_no");
		dm.etc_mode = (String)hash.get("etc_mode");
		dm.etc_sub_seq = (String)hash.get("etc_sub_seq");
		dm.etc_budg_cd = (String)hash.get("etc_budg_cd");
		dm.etc_rcpm_amt = (String)hash.get("etc_rcpm_amt");
		dm.etc_bal_occr_slip_clsf = (String)hash.get("etc_bal_occr_slip_clsf");
		dm.etc_bal_occr_slip_no = (String)hash.get("etc_bal_occr_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.inout_clsf = Util.getSessionParameterValue(req,"inout_clsf",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.gurt_rcpm_amt = Util.getSessionParameterValue(req,"gurt_rcpm_amt",true);
		dm.precpt_rcpm_amt = Util.getSessionParameterValue(req,"precpt_rcpm_amt",true);
		dm.trufnd_rcpm_amt = Util.getSessionParameterValue(req,"trufnd_rcpm_amt",true);
		dm.trufnd_dlco_clsf_cd = Util.getSessionParameterValue(req,"trufnd_dlco_clsf_cd",true);
		dm.trufnd_dlco_ern = Util.getSessionParameterValue(req,"trufnd_dlco_ern",true);
		dm.trufnd_slip_clsf_cd = Util.getSessionParameterValue(req,"trufnd_slip_clsf_cd",true);
		dm.cash_sub_seq = Util.getSessionParameterValue(req,"cash_sub_seq",true);
		dm.cash_rcpm_amt = Util.getSessionParameterValue(req,"cash_rcpm_amt",true);
		dm.deps_mode = Util.getSessionParameterValue(req,"deps_mode",true);
		dm.deps_sub_seq = Util.getSessionParameterValue(req,"deps_sub_seq",true);
		dm.deps_rcpm_amt = Util.getSessionParameterValue(req,"deps_rcpm_amt",true);
		dm.deps_rmtt_dt = Util.getSessionParameterValue(req,"deps_rmtt_dt",true);
		dm.deps_rmtt_plac = Util.getSessionParameterValue(req,"deps_rmtt_plac",true);
		dm.deps_acct_mang_no = Util.getSessionParameterValue(req,"deps_acct_mang_no",true);
		dm.deps_coms_amt = Util.getSessionParameterValue(req,"deps_coms_amt",true);
		dm.deps_biz_reg_no = Util.getSessionParameterValue(req,"deps_biz_reg_no",true);
		dm.deps_bank_id = Util.getSessionParameterValue(req,"deps_bank_id",true);
		dm.deps_acct_num = Util.getSessionParameterValue(req,"deps_acct_num",true);
		dm.deps_tran_date = Util.getSessionParameterValue(req,"deps_tran_date",true);
		dm.deps_tran_date_seq = Util.getSessionParameterValue(req,"deps_tran_date_seq",true);
		dm.note_mode = Util.getSessionParameterValue(req,"note_mode",true);
		dm.note_sub_seq = Util.getSessionParameterValue(req,"note_sub_seq",true);
		dm.note_bank_cd = Util.getSessionParameterValue(req,"note_bank_cd",true);
		dm.note_note_no = Util.getSessionParameterValue(req,"note_note_no",true);
		dm.note_note_clsf_cd = Util.getSessionParameterValue(req,"note_note_clsf_cd",true);
		dm.note_comp_dt = Util.getSessionParameterValue(req,"note_comp_dt",true);
		dm.note_mtry_dt = Util.getSessionParameterValue(req,"note_mtry_dt",true);
		dm.note_rcpm_amt = Util.getSessionParameterValue(req,"note_rcpm_amt",true);
		dm.note_issu_cmpy_clsf = Util.getSessionParameterValue(req,"note_issu_cmpy_clsf",true);
		dm.note_issu_pers_nm = Util.getSessionParameterValue(req,"note_issu_pers_nm",true);
		dm.note_rcpm_acct = Util.getSessionParameterValue(req,"note_rcpm_acct",true);
		dm.note_sale_aprv_no = Util.getSessionParameterValue(req,"note_sale_aprv_no",true);
		dm.etc_mode = Util.getSessionParameterValue(req,"etc_mode",true);
		dm.etc_sub_seq = Util.getSessionParameterValue(req,"etc_sub_seq",true);
		dm.etc_budg_cd = Util.getSessionParameterValue(req,"etc_budg_cd",true);
		dm.etc_rcpm_amt = Util.getSessionParameterValue(req,"etc_rcpm_amt",true);
		dm.etc_bal_occr_slip_clsf = Util.getSessionParameterValue(req,"etc_bal_occr_slip_clsf",true);
		dm.etc_bal_occr_slip_no = Util.getSessionParameterValue(req,"etc_bal_occr_slip_no",true);
		*******************************************************************************************/
	}

	public void as_leas_1310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1310_LDataSet ds = null;
		AS_LEAS_1310_LDM dm = new AS_LEAS_1310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1310_l(dm);
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
		dm.cntr_no = (String)hash.get("cntr_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		*******************************************************************************************/
	}

	public void as_leas_1311_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1311_IDataSet ds = null;
		AS_LEAS_1311_IDM dm = new AS_LEAS_1311_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
		dm.inout_acct_clsf = Util.checkString(req.getParameter("inout_acct_clsf"));
		dm.gurt_payo_clsf = Util.checkString(req.getParameter("gurt_payo_clsf"));		
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.gurt_rcpm_amt = Util.checkString(req.getParameter("gurt_rcpm_amt"));

		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
		dm.adpay_expn_no = Util.checkString(req.getParameter("adpay_expn_no"));

		dm.mode = Util.checkString((String)hash.get("m")).toUpperCase();
		dm.clam_yymm = Util.checkString((String)hash.get("clam_yymm"));
		dm.clam_seq = Util.checkString((String)hash.get("clam_seq"));
		dm.leas_rcpm_amt = Util.checkString((String)hash.get("leas_rcpm_amt"));
		dm.mang_rcpm_amt = Util.checkString((String)hash.get("mang_rcpm_amt"));
		dm.vat_rcpm_amt = Util.checkString((String)hash.get("vat_rcpm_amt"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1311_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1311_i(dm);
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
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.inout_clsf = (String)hash.get("inout_clsf");
		dm.inout_acct_clsf = (String)hash.get("inout_acct_clsf");
		dm.gurt_payo_clsf = (String)hash.get("gurt_payo_clsf");
		dm.remk = (String)hash.get("remk");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.gurt_rcpm_amt = (String)hash.get("gurt_rcpm_amt");
		dm.cash_sub_seq = (String)hash.get("cash_sub_seq");
		dm.cash_rcpm_amt = (String)hash.get("cash_rcpm_amt");
		dm.mode = (String)hash.get("mode");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.leas_rcpm_amt = (String)hash.get("leas_rcpm_amt");
		dm.mang_rcpm_amt = (String)hash.get("mang_rcpm_amt");
		dm.vat_rcpm_amt = (String)hash.get("vat_rcpm_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.inout_clsf = Util.getSessionParameterValue(req,"inout_clsf",true);
		dm.inout_acct_clsf = Util.getSessionParameterValue(req,"inout_acct_clsf",true);
		dm.gurt_payo_clsf = Util.getSessionParameterValue(req,"gurt_payo_clsf",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.gurt_rcpm_amt = Util.getSessionParameterValue(req,"gurt_rcpm_amt",true);
		dm.cash_sub_seq = Util.getSessionParameterValue(req,"cash_sub_seq",true);
		dm.cash_rcpm_amt = Util.getSessionParameterValue(req,"cash_rcpm_amt",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.leas_rcpm_amt = Util.getSessionParameterValue(req,"leas_rcpm_amt",true);
		dm.mang_rcpm_amt = Util.getSessionParameterValue(req,"mang_rcpm_amt",true);
		dm.vat_rcpm_amt = Util.getSessionParameterValue(req,"vat_rcpm_amt",true);
		*******************************************************************************************/
	}

	public void as_leas_1312_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1312_ADataSet ds = null;
		AS_LEAS_1312_ADM dm = new AS_LEAS_1312_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
		dm.cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
		dm.gurt_rcpm_amt = Util.checkString(req.getParameter("gurt_rcpm_amt"));

		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));

		dm.mode = Util.checkString((String)hash.get("m")).toUpperCase();
		dm.clam_yymm = Util.checkString((String)hash.get("clam_yymm"));
		dm.clam_seq = Util.checkString((String)hash.get("clam_seq"));
		dm.leas_rcpm_amt = Util.checkString((String)hash.get("leas_rcpm_amt"));
		dm.mang_rcpm_amt = Util.checkString((String)hash.get("mang_rcpm_amt"));
		dm.vat_rcpm_amt = Util.checkString((String)hash.get("vat_rcpm_amt"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1312_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1312_a(dm);
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

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.inout_clsf = (String)hash.get("inout_clsf");
		dm.remk = (String)hash.get("remk");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_yy = (String)hash.get("cntr_yy");
		dm.cntr_seq = (String)hash.get("cntr_seq");
		dm.gurt_rcpm_amt = (String)hash.get("gurt_rcpm_amt");
		dm.cash_sub_seq = (String)hash.get("cash_sub_seq");
		dm.cash_rcpm_amt = (String)hash.get("cash_rcpm_amt");
		dm.mode = (String)hash.get("mode");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		dm.leas_rcpm_amt = (String)hash.get("leas_rcpm_amt");
		dm.mang_rcpm_amt = (String)hash.get("mang_rcpm_amt");
		dm.vat_rcpm_amt = (String)hash.get("vat_rcpm_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.inout_clsf = Util.getSessionParameterValue(req,"inout_clsf",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_yy = Util.getSessionParameterValue(req,"cntr_yy",true);
		dm.cntr_seq = Util.getSessionParameterValue(req,"cntr_seq",true);
		dm.gurt_rcpm_amt = Util.getSessionParameterValue(req,"gurt_rcpm_amt",true);
		dm.cash_sub_seq = Util.getSessionParameterValue(req,"cash_sub_seq",true);
		dm.cash_rcpm_amt = Util.getSessionParameterValue(req,"cash_rcpm_amt",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		dm.leas_rcpm_amt = Util.getSessionParameterValue(req,"leas_rcpm_amt",true);
		dm.mang_rcpm_amt = Util.getSessionParameterValue(req,"mang_rcpm_amt",true);
		dm.vat_rcpm_amt = Util.getSessionParameterValue(req,"vat_rcpm_amt",true);
		*******************************************************************************************/
	}

	public void as_leas_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1401_LDataSet ds = null;
		AS_LEAS_1401_LDM dm = new AS_LEAS_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_yy = Util.checkString(req.getParameter("basi_yy"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1401_l(dm);
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

		dm.basi_yy = (String)hash.get("basi_yy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.basi_yy = Util.getSessionParameterValue(req,"basi_yy",true);
		*******************************************************************************************/
	}
	public void as_leas_1402_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1402_ADataSet ds = null;
		AS_LEAS_1402_ADM dm = new AS_LEAS_1402_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_yy = Util.checkString(req.getParameter("basi_yy"));
		dm.basi_qq = Util.checkString(req.getParameter("basi_qq"));
		dm.basi_int_rate = Util.checkString(req.getParameter("basi_int_rate"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1402_a(dm);
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

		dm.mode = (String)hash.get("mode");
		dm.basi_yy = (String)hash.get("basi_yy");
		dm.basi_qq = (String)hash.get("basi_qq");
		dm.basi_int_rate = (String)hash.get("basi_int_rate");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.basi_yy = Util.getSessionParameterValue(req,"basi_yy",true);
		dm.basi_qq = Util.getSessionParameterValue(req,"basi_qq",true);
		dm.basi_int_rate = Util.getSessionParameterValue(req,"basi_int_rate",true);
		*******************************************************************************************/
	}
	
	public void as_leas_1501_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1501_MDataSet ds = null;
		AS_LEAS_1501_MDM dm = new AS_LEAS_1501_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1501_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1501_m(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void as_leas_1502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1502_LDataSet ds = null;
		AS_LEAS_1502_LDM dm = new AS_LEAS_1502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.leas_to_dt1 = Util.checkString(req.getParameter("leas_to_dt1"));
		dm.leas_to_dt2 = Util.checkString(req.getParameter("leas_to_dt2"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1502_l(dm);
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
		dm.leas_to_dt1 = (String)hash.get("leas_to_dt1");
		dm.leas_to_dt2 = (String)hash.get("leas_to_dt2");
		dm.bldg_cd = (String)hash.get("bldg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.leas_to_dt1 = Util.getSessionParameterValue(req,"leas_to_dt1",true);
		dm.leas_to_dt2 = Util.getSessionParameterValue(req,"leas_to_dt2",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		*******************************************************************************************/
	}
    
	public void as_leas_1801_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1801_LDataSet ds = null;
		AS_LEAS_1801_LDM dm = new AS_LEAS_1801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
				
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1801_l(dm);
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
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		*******************************************************************************************/
	}

	public void as_leas_1802_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1802_ADataSet ds = null;
		AS_LEAS_1802_ADM dm = new AS_LEAS_1802_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.job_mode = Util.checkString(req.getParameter("job_mode"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_remk = Util.checkString(req.getParameter("slip_remk"));		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.occr_dt = Util.checkString((String)hash.get("occr_dt"));
//		dm.occr_seq = Util.checkString((String)hash.get("occr_seq"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1802_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
				
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1802_a(dm);
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

		dm.job_mode = (String)hash.get("job_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.slip_remk = (String)hash.get("slip_remk");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.job_mode = Util.getSessionParameterValue(req,"job_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.slip_remk = Util.getSessionParameterValue(req,"slip_remk",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/

	}

	public void as_leas_1901_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1901_LDataSet ds = null;
		AS_LEAS_1901_LDM dm = new AS_LEAS_1901_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
						
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1901_l(dm);
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.hire_dlco_ern = (String)hash.get("hire_dlco_ern");
		dm.cntr_no = (String)hash.get("cntr_no");
		dm.cntr_star = (String)hash.get("cntr_star");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.hire_dlco_ern = Util.getSessionParameterValue(req,"hire_dlco_ern",true);
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		*******************************************************************************************/
	}

	public void as_leas_1902_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAS_1902_SDataSet ds = null;
		AS_LEAS_1902_SDM dm = new AS_LEAS_1902_SDM();

		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
		dm.clam_seq = Util.checkString(req.getParameter("clam_seq"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAS_1902_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
							
/*		
		try {
			AS_LEAS_1000EJBHome home = (AS_LEAS_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAS_1000EJB");
			AS_LEAS_1000EJB ejb = home.create();

			ds = ejb.as_leas_1902_s(dm);
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

		dm.cntr_no = (String)hash.get("cntr_no");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clam_yymm = (String)hash.get("clam_yymm");
		dm.clam_seq = (String)hash.get("clam_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_yymm = Util.getSessionParameterValue(req,"clam_yymm",true);
		dm.clam_seq = Util.getSessionParameterValue(req,"clam_seq",true);
		*******************************************************************************************/
	}

}
