package chosun.ciis.co.smtb.wb;

import java.rmi.*;
import java.util.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.util.*;
import utils.system;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;

import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;
import chosun.ciis.co.smtb.ejb.*;
import chosun.ciis.co.smtb.wb.SecurityBean;


public class CO_SMTB_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

	public void co_smtb_1020_u(HttpServletRequest req, HttpServletResponse res) throws AppException 
	{
		CO_SMTB_1020_UDataSet ds = null;
		CO_SMTB_1020_UDM dm = new CO_SMTB_1020_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.interface_batch_id = Util.checkString(req.getParameter("batch_id"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1020_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		try 
		{
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1020_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) 
		{
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) 
		{
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		*/

		/*******************************************************************************************
		 String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		 Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		 dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 dm.interface_batch_id = (String)hash.get("interface_batch_id");
		 dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		 dm.incmg_pers = (String)hash.get("incmg_pers");
		 *******************************************************************************************/

		/*******************************************************************************************
		 dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 dm.interface_batch_id = Util.getSessionParameterValue(req,"interface_batch_id",true);
		 dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		 dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 *******************************************************************************************/
	} 

	public void co_smtb_1021_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1021_UDataSet ds = null;
		CO_SMTB_1021_UDM dm = new CO_SMTB_1021_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ip = req.getRemoteAddr();		

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		//System.out.println(hash);
		dm.conversation_id = (String)hash.get("conversation_id");		

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1021_UDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);	
		/* EJB 수정후 끝 */		
/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1021_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.conversation_id = (String)hash.get("conversation_id");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.conversation_id = Util.getSessionParameterValue(req,"conversation_id",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}	
	
	public void co_smtb_1030_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1030_MDataSet ds = null;
		CO_SMTB_1030_MDM dm = new CO_SMTB_1030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}	

	public void co_smtb_1031_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1031_LDataSet ds = null;
		CO_SMTB_1031_LDM dm = new CO_SMTB_1031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.supbuy_type = Util.checkString(req.getParameter("supbuy_type"));
		dm.direction = Util.checkString(req.getParameter("direction"));
		dm.dti_status = Util.checkString(req.getParameter("dti_status"));
		dm.sup_bizplace_code = Util.checkString(req.getParameter("sup_bizplace_code"));
		dm.dti_wdate_fr = Util.checkString(req.getParameter("dti_wdate_fr"));
		dm.dti_wdate_to = Util.checkString(req.getParameter("dti_wdate_to"));
		dm.com_regno = Util.checkString(req.getParameter("com_regno"));
		dm.com_name = Util.checkString(req.getParameter("com_name"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
		dm.dti_type = Util.checkString(req.getParameter("dti_type"));
		dm.dtt_yn = Util.checkString(req.getParameter("dtt_yn"));		
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.search_type = Util.checkString(req.getParameter("search_type"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.supbuy_type = (String)hash.get("supbuy_type");
		dm.direction = (String)hash.get("direction");
		dm.dti_status = (String)hash.get("dti_status");
		dm.sup_bizplace_code = (String)hash.get("sup_bizplace_code");
		dm.dti_wdate_fr = (String)hash.get("dti_wdate_fr");
		dm.dti_wdate_to = (String)hash.get("dti_wdate_to");
		dm.com_regno = (String)hash.get("com_regno");
		dm.com_name = (String)hash.get("com_name");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_occr_dt_fr = (String)hash.get("slip_occr_dt_fr");
		dm.slip_occr_dt_to = (String)hash.get("slip_occr_dt_to");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.supbuy_type = Util.getSessionParameterValue(req,"supbuy_type",true);
		dm.direction = Util.getSessionParameterValue(req,"direction",true);
		dm.dti_status = Util.getSessionParameterValue(req,"dti_status",true);
		dm.sup_bizplace_code = Util.getSessionParameterValue(req,"sup_bizplace_code",true);
		dm.dti_wdate_fr = Util.getSessionParameterValue(req,"dti_wdate_fr",true);
		dm.dti_wdate_to = Util.getSessionParameterValue(req,"dti_wdate_to",true);
		dm.com_regno = Util.getSessionParameterValue(req,"com_regno",true);
		dm.com_name = Util.getSessionParameterValue(req,"com_name",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_occr_dt_fr = Util.getSessionParameterValue(req,"slip_occr_dt_fr",true);
		dm.slip_occr_dt_to = Util.getSessionParameterValue(req,"slip_occr_dt_to",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void co_smtb_1060_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1060_LDataSet ds = null;
		CO_SMTB_1060_LDM dm = new CO_SMTB_1060_LDM();

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1060_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1060_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		*******************************************************************************************/

		/*******************************************************************************************
		*******************************************************************************************/
	}
	
	public void co_smtb_1061_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1061_UDataSet ds = null;
		CO_SMTB_1061_UDM dm = new CO_SMTB_1061_UDM();

		dm.cert_regno = Util.checkString(req.getParameter("cert_regno"));
		dm.cert_comname = Util.checkString(req.getParameter("cert_comname"));
		dm.userdn = Util.checkString(req.getParameter("userdn"));
		dm.userinfo = Util.checkString(req.getParameter("userinfo"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1061_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1061_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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

		dm.cert_regno = (String)hash.get("cert_regno");
		dm.cert_comname = (String)hash.get("cert_comname");
		dm.userdn = (String)hash.get("userdn");
		dm.userinfo = (String)hash.get("userinfo");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cert_regno = Util.getSessionParameterValue(req,"cert_regno",true);
		dm.cert_comname = Util.getSessionParameterValue(req,"cert_comname",true);
		dm.userdn = Util.getSessionParameterValue(req,"userdn",true);
		dm.userinfo = Util.getSessionParameterValue(req,"userinfo",true);
		*******************************************************************************************/
	}
	
	public void co_smtb_1070_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1070_LDataSet ds = null;
		CO_SMTB_1070_LDM dm = new CO_SMTB_1070_LDM();

		dm.fnd_user = Util.checkString(req.getParameter("srch_fnd_user"));
		dm.fnd_user_name = Util.checkString(req.getParameter("srch_fnd_user_name"));
		dm.smart_id = Util.checkString(req.getParameter("srch_smart_id"));
		dm.smart_email = Util.checkString(req.getParameter("srch_smart_email"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1070_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1070_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.fnd_user = (String)hash.get("fnd_user");
		dm.fnd_user_name = (String)hash.get("fnd_user_name");
		dm.smart_id = (String)hash.get("smart_id");
		dm.smart_email = (String)hash.get("smart_email");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.fnd_user = Util.getSessionParameterValue(req,"fnd_user",true);
		dm.fnd_user_name = Util.getSessionParameterValue(req,"fnd_user_name",true);
		dm.smart_id = Util.getSessionParameterValue(req,"smart_id",true);
		dm.smart_email = Util.getSessionParameterValue(req,"smart_email",true);
		*******************************************************************************************/
	}
	
	public void co_smtb_1071_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1071_SDataSet ds = null;
		CO_SMTB_1071_SDM dm = new CO_SMTB_1071_SDM();

		dm.fnd_user = Util.checkString(req.getParameter("fnd_user"));
		dm.fnd_regno = Util.checkString(req.getParameter("fnd_regno"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1071_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1071_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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

		dm.fnd_user = (String)hash.get("fnd_user");
		dm.fnd_regno = (String)hash.get("fnd_regno");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.fnd_user = Util.getSessionParameterValue(req,"fnd_user",true);
		dm.fnd_regno = Util.getSessionParameterValue(req,"fnd_regno",true);
		*******************************************************************************************/
	}
	
	public void co_smtb_1072_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1072_IDataSet ds = null;
		CO_SMTB_1072_IDM dm = new CO_SMTB_1072_IDM();

		dm.fnd_user = Util.checkString(req.getParameter("fnd_user"));
		dm.fnd_regno = Util.checkString(req.getParameter("fnd_regno"));
		dm.fnd_user_name = Util.checkString(req.getParameter("fnd_user_name"));
		dm.smart_id = Util.checkString(req.getParameter("smart_id"));
		dm.smart_password = Util.checkString(req.getParameter("smart_password"));
		dm.smart_email = Util.checkString(req.getParameter("smart_email"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1072_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1072_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.fnd_user = (String)hash.get("fnd_user");
		dm.fnd_regno = (String)hash.get("fnd_regno");
		dm.fnd_user_name = (String)hash.get("fnd_user_name");
		dm.smart_id = (String)hash.get("smart_id");
		dm.smart_password = (String)hash.get("smart_password");
		dm.smart_email = (String)hash.get("smart_email");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.fnd_user = Util.getSessionParameterValue(req,"fnd_user",true);
		dm.fnd_regno = Util.getSessionParameterValue(req,"fnd_regno",true);
		dm.fnd_user_name = Util.getSessionParameterValue(req,"fnd_user_name",true);
		dm.smart_id = Util.getSessionParameterValue(req,"smart_id",true);
		dm.smart_password = Util.getSessionParameterValue(req,"smart_password",true);
		dm.smart_email = Util.getSessionParameterValue(req,"smart_email",true);
		*******************************************************************************************/
	}
	
	public void co_smtb_1073_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1073_UDataSet ds = null;
		CO_SMTB_1073_UDM dm = new CO_SMTB_1073_UDM();

		dm.fnd_user = Util.checkString(req.getParameter("fnd_user"));
		dm.fnd_regno = Util.checkString(req.getParameter("fnd_regno"));
		dm.fnd_user_name = Util.checkString(req.getParameter("fnd_user_name"));
		dm.smart_id = Util.checkString(req.getParameter("smart_id"));
		dm.smart_password = Util.checkString(req.getParameter("smart_password"));
		dm.smart_email = Util.checkString(req.getParameter("smart_email"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1073_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1073_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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

		dm.fnd_user = (String)hash.get("fnd_user");
		dm.fnd_regno = (String)hash.get("fnd_regno");
		dm.fnd_user_name = (String)hash.get("fnd_user_name");
		dm.smart_id = (String)hash.get("smart_id");
		dm.smart_password = (String)hash.get("smart_password");
		dm.smart_email = (String)hash.get("smart_email");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.fnd_user = Util.getSessionParameterValue(req,"fnd_user",true);
		dm.fnd_regno = Util.getSessionParameterValue(req,"fnd_regno",true);
		dm.fnd_user_name = Util.getSessionParameterValue(req,"fnd_user_name",true);
		dm.smart_id = Util.getSessionParameterValue(req,"smart_id",true);
		dm.smart_password = Util.getSessionParameterValue(req,"smart_password",true);
		dm.smart_email = Util.getSessionParameterValue(req,"smart_email",true);
		*******************************************************************************************/
	}
	
	public void co_smtb_1074_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1074_DDataSet ds = null;
		CO_SMTB_1074_DDM dm = new CO_SMTB_1074_DDM();

		dm.fnd_user = Util.checkString(req.getParameter("fnd_user"));
		dm.fnd_regno = Util.checkString(req.getParameter("fnd_regno"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1074_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1074_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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

		dm.fnd_user = (String)hash.get("fnd_user");
		dm.fnd_regno = (String)hash.get("fnd_regno");
		dm.fnd_user_name = (String)hash.get("fnd_user_name");
		dm.smart_id = (String)hash.get("smart_id");
		dm.smart_password = (String)hash.get("smart_password");
		dm.smart_email = (String)hash.get("smart_email");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.fnd_user = Util.getSessionParameterValue(req,"fnd_user",true);
		dm.fnd_regno = Util.getSessionParameterValue(req,"fnd_regno",true);
		dm.fnd_user_name = Util.getSessionParameterValue(req,"fnd_user_name",true);
		dm.smart_id = Util.getSessionParameterValue(req,"smart_id",true);
		dm.smart_password = Util.getSessionParameterValue(req,"smart_password",true);
		dm.smart_email = Util.getSessionParameterValue(req,"smart_email",true);
		*******************************************************************************************/
	}
	
	public void co_smtb_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_SMTB_1101_LDataSet ds = null;
		CO_SMTB_1101_LDM dm = new CO_SMTB_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dti_wdate_fr = Util.checkString(req.getParameter("dti_wdate_fr"));
		dm.dti_wdate_to = Util.checkString(req.getParameter("dti_wdate_to"));
		dm.sup_bizplace_code = Util.checkString(req.getParameter("sup_bizplace_code"));
		dm.com_regno = Util.checkString(req.getParameter("com_regno"));
		dm.com_name = Util.checkString(req.getParameter("com_name"));
		dm.dti_type = Util.checkString(req.getParameter("dti_type"));
		dm.dtt_yn = Util.checkString(req.getParameter("dtt_yn"));
		dm.slip_yn = Util.checkString(req.getParameter("slip_yn"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISCOM");
		ds = (CO_SMTB_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		/*
		try {
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1101_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.dti_wdate_fr = (String)hash.get("dti_wdate_fr");
		dm.dti_wdate_to = (String)hash.get("dti_wdate_to");
		dm.sup_bizplace_code = (String)hash.get("sup_bizplace_code");
		dm.com_regno = (String)hash.get("com_regno");
		dm.com_name = (String)hash.get("com_name");
		dm.dti_type = (String)hash.get("dti_type");
		dm.dtt_yn = (String)hash.get("dtt_yn");
		dm.slip_yn = (String)hash.get("slip_yn");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dti_wdate_fr = Util.getSessionParameterValue(req,"dti_wdate_fr",true);
		dm.dti_wdate_to = Util.getSessionParameterValue(req,"dti_wdate_to",true);
		dm.sup_bizplace_code = Util.getSessionParameterValue(req,"sup_bizplace_code",true);
		dm.com_regno = Util.getSessionParameterValue(req,"com_regno",true);
		dm.com_name = Util.getSessionParameterValue(req,"com_name",true);
		dm.dti_type = Util.getSessionParameterValue(req,"dti_type",true);
		dm.dtt_yn = Util.getSessionParameterValue(req,"dtt_yn",true);
		dm.slip_yn = Util.getSessionParameterValue(req,"slip_yn",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}	
}