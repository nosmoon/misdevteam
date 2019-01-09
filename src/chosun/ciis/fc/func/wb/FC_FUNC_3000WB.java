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

public class FC_FUNC_3000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_9999_LDataSet ds = null;
		FC_FUNC_9999_LDM dm = new FC_FUNC_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
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
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();
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
	
	public void fc_func_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3000_LDataSet ds = null;
		FC_FUNC_3000_LDM dm = new FC_FUNC_3000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.base_amt = Util.checkString(req.getParameter("base_amt"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3000_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.base_amt = (String)hash.get("base_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.base_amt = Util.getSessionParameterValue(req,"base_amt",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3020_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3020_LDataSet ds = null;
		FC_FUNC_3020_LDM dm = new FC_FUNC_3020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.base_amt = Util.checkString(req.getParameter("base_amt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3020_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.yyyy = (String)hash.get("yyyy");
		dm.base_amt = (String)hash.get("base_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.base_amt = Util.getSessionParameterValue(req,"base_amt",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3040_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3040_LDataSet ds = null;
		FC_FUNC_3040_LDM dm = new FC_FUNC_3040_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.base_amt = Util.checkString(req.getParameter("base_amt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3040_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3040_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.yyyy = (String)hash.get("yyyy");
		dm.base_amt = (String)hash.get("base_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.base_amt = Util.getSessionParameterValue(req,"base_amt",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3060_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3060_IDataSet ds = null;
		FC_FUNC_3060_IDM dm = new FC_FUNC_3060_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_yymm = Util.checkString(req.getParameter("from_yymm"));
		dm.to_yymm = Util.checkString(req.getParameter("to_yymm"));
		dm.newsp_advert_amt = Util.checkString(req.getParameter("newsp_advert_amt"));
		dm.newsp_rate_cash = Util.checkString(req.getParameter("newsp_rate_cash"));
		dm.newsp_rate_90 = Util.checkString(req.getParameter("newsp_rate_90"));
		dm.newsp_rate_120 = Util.checkString(req.getParameter("newsp_rate_120"));
		dm.newsp_rate_125 = Util.checkString(req.getParameter("newsp_rate_125"));
		dm.publis_advert_amt = Util.checkString(req.getParameter("publis_advert_amt"));
		dm.publis_rate_cash = Util.checkString(req.getParameter("publis_rate_cash"));
		dm.publis_rate_90 = Util.checkString(req.getParameter("publis_rate_90"));
		dm.publis_rate_120 = Util.checkString(req.getParameter("publis_rate_120"));
		dm.publis_rate_125 = Util.checkString(req.getParameter("publis_rate_125"));
		dm.newsp_sale_amt = Util.checkString(req.getParameter("newsp_sale_amt"));
		dm.newsp_sale_dd = Util.checkString(req.getParameter("newsp_sale_dd"));
		dm.publis_sale_amt = Util.checkString(req.getParameter("publis_sale_amt"));
		dm.publis_sale_dd = Util.checkString(req.getParameter("publis_sale_dd"));
		dm.lent_proceeds_amt = Util.checkString(req.getParameter("lent_proceeds_amt"));
		dm.lent_proceeds_dd = Util.checkString(req.getParameter("lent_proceeds_dd"));
		dm.etc_even_amt = Util.checkString(req.getParameter("etc_even_amt"));
		dm.etc_odd_amt = Util.checkString(req.getParameter("etc_odd_amt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3060_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3060_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_yymm = (String)hash.get("from_yymm");
		dm.to_yymm = (String)hash.get("to_yymm");
		dm.newsp_advert_amt = (String)hash.get("newsp_advert_amt");
		dm.newsp_rate_cash = (String)hash.get("newsp_rate_cash");
		dm.newsp_rate_90 = (String)hash.get("newsp_rate_90");
		dm.newsp_rate_120 = (String)hash.get("newsp_rate_120");
		dm.newsp_rate_125 = (String)hash.get("newsp_rate_125");
		dm.publis_advert_amt = (String)hash.get("publis_advert_amt");
		dm.publis_rate_cash = (String)hash.get("publis_rate_cash");
		dm.publis_rate_90 = (String)hash.get("publis_rate_90");
		dm.publis_rate_120 = (String)hash.get("publis_rate_120");
		dm.publis_rate_125 = (String)hash.get("publis_rate_125");
		dm.newsp_sale_amt = (String)hash.get("newsp_sale_amt");
		dm.newsp_sale_dd = (String)hash.get("newsp_sale_dd");
		dm.publis_sale_amt = (String)hash.get("publis_sale_amt");
		dm.publis_sale_dd = (String)hash.get("publis_sale_dd");
		dm.lent_proceeds_amt = (String)hash.get("lent_proceeds_amt");
		dm.lent_proceeds_dd = (String)hash.get("lent_proceeds_dd");
		dm.etc_even_amt = (String)hash.get("etc_even_amt");
		dm.etc_odd_amt = (String)hash.get("etc_odd_amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_yymm = Util.getSessionParameterValue(req,"from_yymm",true);
		dm.to_yymm = Util.getSessionParameterValue(req,"to_yymm",true);
		dm.newsp_advert_amt = Util.getSessionParameterValue(req,"newsp_advert_amt",true);
		dm.newsp_rate_cash = Util.getSessionParameterValue(req,"newsp_rate_cash",true);
		dm.newsp_rate_90 = Util.getSessionParameterValue(req,"newsp_rate_90",true);
		dm.newsp_rate_120 = Util.getSessionParameterValue(req,"newsp_rate_120",true);
		dm.newsp_rate_125 = Util.getSessionParameterValue(req,"newsp_rate_125",true);
		dm.publis_advert_amt = Util.getSessionParameterValue(req,"publis_advert_amt",true);
		dm.publis_rate_cash = Util.getSessionParameterValue(req,"publis_rate_cash",true);
		dm.publis_rate_90 = Util.getSessionParameterValue(req,"publis_rate_90",true);
		dm.publis_rate_120 = Util.getSessionParameterValue(req,"publis_rate_120",true);
		dm.publis_rate_125 = Util.getSessionParameterValue(req,"publis_rate_125",true);
		dm.newsp_sale_amt = Util.getSessionParameterValue(req,"newsp_sale_amt",true);
		dm.newsp_sale_dd = Util.getSessionParameterValue(req,"newsp_sale_dd",true);
		dm.publis_sale_amt = Util.getSessionParameterValue(req,"publis_sale_amt",true);
		dm.publis_sale_dd = Util.getSessionParameterValue(req,"publis_sale_dd",true);
		dm.lent_proceeds_amt = Util.getSessionParameterValue(req,"lent_proceeds_amt",true);
		dm.lent_proceeds_dd = Util.getSessionParameterValue(req,"lent_proceeds_dd",true);
		dm.etc_even_amt = Util.getSessionParameterValue(req,"etc_even_amt",true);
		dm.etc_odd_amt = Util.getSessionParameterValue(req,"etc_odd_amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3061_LDataSet ds = null;
		FC_FUNC_3061_LDM dm = new FC_FUNC_3061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_yymm = Util.checkString(req.getParameter("from_yymm"));
		dm.to_yymm = Util.checkString(req.getParameter("to_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_yymm = (String)hash.get("from_yymm");
		dm.to_yymm = (String)hash.get("to_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_yymm = Util.getSessionParameterValue(req,"from_yymm",true);
		dm.to_yymm = Util.getSessionParameterValue(req,"to_yymm",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3062_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3062_IDataSet ds = null;
		FC_FUNC_3062_IDM dm = new FC_FUNC_3062_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.rcpm_dd = (String)hash.get("rcpm_dd");
		dm.newspap_cash = (String)hash.get("newspap_cash");
		dm.newspap_bill_90 = (String)hash.get("newspap_bill_90");
		dm.newspap_bill_120 = (String)hash.get("newspap_bill_120");
		dm.newspap_bill_125 = (String)hash.get("newspap_bill_125");
		dm.publis_cash = (String)hash.get("publis_cash");
		dm.publis_bill_90 = (String)hash.get("publis_bill_90");
		dm.publis_bill_120 = (String)hash.get("publis_bill_120");
		dm.publis_bill_125 = (String)hash.get("publis_bill_125");
		dm.newspap_sale = (String)hash.get("newspap_sale");
		dm.publis_sale = (String)hash.get("publis_sale");
		dm.lent_amt = (String)hash.get("lent_amt");
		dm.etc_amt = (String)hash.get("etc_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3062_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3062_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.rcpm_dd = (String)hash.get("rcpm_dd");
		dm.newspap_cash = (String)hash.get("newspap_cash");
		dm.newspap_bill_90 = (String)hash.get("newspap_bill_90");
		dm.newspap_bill_120 = (String)hash.get("newspap_bill_120");
		dm.newspap_bill_125 = (String)hash.get("newspap_bill_125");
		dm.publis_cash = (String)hash.get("publis_cash");
		dm.publis_bill_90 = (String)hash.get("publis_bill_90");
		dm.publis_bill_120 = (String)hash.get("publis_bill_120");
		dm.publis_bill_125 = (String)hash.get("publis_bill_125");
		dm.newspap_sale = (String)hash.get("newspap_sale");
		dm.publis_sale = (String)hash.get("publis_sale");
		dm.lent_amt = (String)hash.get("lent_amt");
		dm.etc_amt = (String)hash.get("etc_amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpm_dd = Util.getSessionParameterValue(req,"rcpm_dd",true);
		dm.newspap_cash = Util.getSessionParameterValue(req,"newspap_cash",true);
		dm.newspap_bill_90 = Util.getSessionParameterValue(req,"newspap_bill_90",true);
		dm.newspap_bill_120 = Util.getSessionParameterValue(req,"newspap_bill_120",true);
		dm.newspap_bill_125 = Util.getSessionParameterValue(req,"newspap_bill_125",true);
		dm.publis_cash = Util.getSessionParameterValue(req,"publis_cash",true);
		dm.publis_bill_90 = Util.getSessionParameterValue(req,"publis_bill_90",true);
		dm.publis_bill_120 = Util.getSessionParameterValue(req,"publis_bill_120",true);
		dm.publis_bill_125 = Util.getSessionParameterValue(req,"publis_bill_125",true);
		dm.newspap_sale = Util.getSessionParameterValue(req,"newspap_sale",true);
		dm.publis_sale = Util.getSessionParameterValue(req,"publis_sale",true);
		dm.lent_amt = Util.getSessionParameterValue(req,"lent_amt",true);
		dm.etc_amt = Util.getSessionParameterValue(req,"etc_amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3063_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3063_MDataSet ds = null;
		FC_FUNC_3063_MDM dm = new FC_FUNC_3063_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3063_MDataSet)manager.executeCall(dm);

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
	
	public void fc_func_3070_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3070_LDataSet ds = null;
		FC_FUNC_3070_LDM dm = new FC_FUNC_3070_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3070_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3070_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	
	public void fc_func_3071_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3071_IDataSet ds = null;
		FC_FUNC_3071_IDM dm = new FC_FUNC_3071_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_yymm = Util.checkString(req.getParameter("from_yymm"));
		dm.to_yymm = Util.checkString(req.getParameter("to_yymm"));;
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.fund_cd = (String)hash.get("fund_cd");
		dm.expn_amt = (String)hash.get("pay_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3071_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3071_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_yymm = (String)hash.get("from_yymm");
		dm.to_yymm = (String)hash.get("to_yymm");
		dm.fund_cd = (String)hash.get("fund_cd");
		dm.expn_amt = (String)hash.get("expn_amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_yymm = Util.getSessionParameterValue(req,"from_yymm",true);
		dm.to_yymm = Util.getSessionParameterValue(req,"to_yymm",true);
		dm.fund_cd = Util.getSessionParameterValue(req,"fund_cd",true);
		dm.expn_amt = Util.getSessionParameterValue(req,"expn_amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3073_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3073_LDataSet ds = null;
		FC_FUNC_3073_LDM dm = new FC_FUNC_3073_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_cd = Util.checkString(req.getParameter("fund_cd"));
		dm.from_expn_yymm = Util.checkString(req.getParameter("from_expn_yymm"));
		dm.to_expn_yymm = Util.checkString(req.getParameter("to_expn_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3073_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3073_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fund_cd = (String)hash.get("fund_cd");
		dm.from_expn_yymm = (String)hash.get("from_expn_yymm");
		dm.to_expn_yymm = (String)hash.get("to_expn_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_cd = Util.getSessionParameterValue(req,"fund_cd",true);
		dm.from_expn_yymm = Util.getSessionParameterValue(req,"from_expn_yymm",true);
		dm.to_expn_yymm = Util.getSessionParameterValue(req,"to_expn_yymm",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3074_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3074_IDataSet ds = null;
		FC_FUNC_3074_IDM dm = new FC_FUNC_3074_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_cd = Util.checkString(req.getParameter("fund_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();;
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.expn_yymm = (String)hash.get("expn_yymm");
		dm.expn_dt = (String)hash.get("expn_dt");
		dm.expn_dt_u = (String)hash.get("expn_dt_u");
		dm.expn_amt = (String)hash.get("expn_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3074_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3074_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fund_cd = (String)hash.get("fund_cd");
		dm.expn_yymm = (String)hash.get("expn_yymm");
		dm.expn_dt = (String)hash.get("expn_dt");
		dm.expn_dt_u = (String)hash.get("expn_dt_u");
		dm.expn_amt = (String)hash.get("expn_amt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_cd = Util.getSessionParameterValue(req,"fund_cd",true);
		dm.expn_yymm = Util.getSessionParameterValue(req,"expn_yymm",true);
		dm.expn_dt = Util.getSessionParameterValue(req,"expn_dt",true);
		dm.expn_dt_u = Util.getSessionParameterValue(req,"expn_dt_u",true);
		dm.expn_amt = Util.getSessionParameterValue(req,"expn_amt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3075_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3075_DDataSet ds = null;
		FC_FUNC_3075_DDM dm = new FC_FUNC_3075_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_cd = Util.checkString(req.getParameter("fund_cd"));
		dm.expn_yymm = Util.checkString(req.getParameter("expn_yymm"));
		dm.expn_dt = Util.checkString(req.getParameter("expn_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3075_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3075_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fund_cd = (String)hash.get("fund_cd");
		dm.expn_yymm = (String)hash.get("expn_yymm");
		dm.expn_dt = (String)hash.get("expn_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_cd = Util.getSessionParameterValue(req,"fund_cd",true);
		dm.expn_yymm = Util.getSessionParameterValue(req,"expn_yymm",true);
		dm.expn_dt = Util.getSessionParameterValue(req,"expn_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_3080_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3080_LDataSet ds = null;
		FC_FUNC_3080_LDM dm = new FC_FUNC_3080_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
		dm.to_yymm = Util.checkString(req.getParameter("to_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3080_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3080_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fr_yymm = (String)hash.get("fr_yymm");
		dm.to_yymm = (String)hash.get("to_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_yymm = Util.getSessionParameterValue(req,"fr_yymm",true);
		dm.to_yymm = Util.getSessionParameterValue(req,"to_yymm",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3090_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3090_LDataSet ds = null;
		FC_FUNC_3090_LDM dm = new FC_FUNC_3090_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
		dm.to_yymm = Util.checkString(req.getParameter("to_yymm"));
		dm.flag = Util.checkString(req.getParameter("flag"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3090_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3090_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fr_yymm = (String)hash.get("fr_yymm");
		dm.to_yymm = (String)hash.get("to_yymm");
		dm.flag = (String)hash.get("flag");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_yymm = Util.getSessionParameterValue(req,"fr_yymm",true);
		dm.to_yymm = Util.getSessionParameterValue(req,"to_yymm",true);
		dm.flag = Util.getSessionParameterValue(req,"flag",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3091_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3091_IDataSet ds = null;
		FC_FUNC_3091_IDM dm = new FC_FUNC_3091_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.clsf = (String)hash.get("clsf");
		dm.prd_from = (String)hash.get("prd_from");
		dm.prd_end = (String)hash.get("prd_end");
		dm.int_rate = (String)hash.get("int_rate");
		dm.yymm = (String)hash.get("yymm");
		dm.seq = (String)hash.get("seq");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3091_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3091_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.clsf = (String)hash.get("clsf");
		dm.prd_from = (String)hash.get("prd_from");
		dm.prd_end = (String)hash.get("prd_end");
		dm.int_rate = (String)hash.get("int_rate");
		dm.yymm = (String)hash.get("yymm");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.deps_isav_clsf_cd = Util.getSessionParameterValue(req,"deps_isav_clsf_cd",true);
		dm.deps_isav_no = Util.getSessionParameterValue(req,"deps_isav_no",true);
		dm.clsf = Util.getSessionParameterValue(req,"clsf",true);
		dm.prd_from = Util.getSessionParameterValue(req,"prd_from",true);
		dm.prd_end = Util.getSessionParameterValue(req,"prd_end",true);
		dm.int_rate = Util.getSessionParameterValue(req,"int_rate",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_3092_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3092_IDataSet ds = null;
		FC_FUNC_3092_IDM dm = new FC_FUNC_3092_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.prd_from = Util.checkString(req.getParameter("comp_dt"));
		dm.prd_end = Util.checkString(req.getParameter("mtry_dt"));
		dm.amt = Util.checkString(req.getParameter("tot_pymt_amt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3092_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3092_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.prd_from = (String)hash.get("prd_from");
		dm.prd_end = (String)hash.get("prd_end");
		dm.amt = (String)hash.get("amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.prd_from = Util.getSessionParameterValue(req,"prd_from",true);
		dm.prd_end = Util.getSessionParameterValue(req,"prd_end",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_3093_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3093_DDataSet ds = null;
		FC_FUNC_3093_DDM dm = new FC_FUNC_3093_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.prd_end = Util.checkString(req.getParameter("mtry_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3093_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_FUNC_3000EJBHome home = (FC_FUNC_3000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_3000EJB");
			FC_FUNC_3000EJB ejb = home.create();

			ds = ejb.fc_func_3093_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.prd_end = (String)hash.get("prd_end");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.prd_end = Util.getSessionParameterValue(req,"prd_end",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void fc_func_3094_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_3094_MDataSet ds = null;
		FC_FUNC_3094_MDM dm = new FC_FUNC_3094_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_3094_MDataSet)manager.executeCall(dm);

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
