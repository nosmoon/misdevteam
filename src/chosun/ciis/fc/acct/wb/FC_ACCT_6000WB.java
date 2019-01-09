package chosun.ciis.fc.acct.wb;

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

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*; 

public class FC_ACCT_6000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9999_LDataSet ds = null;
		FC_ACCT_9999_LDM dm = new FC_ACCT_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC"); 
		ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();
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
	public void fc_acct_6000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6000_MDataSet ds = null;
		FC_ACCT_6000_MDM dm = new FC_ACCT_6000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC"); 
		ds = (FC_ACCT_6000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6001_LDataSet ds = null;
		FC_ACCT_6001_LDM dm = new FC_ACCT_6001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}

	public void fc_acct_6002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6002_IDataSet ds = null;
		FC_ACCT_6002_IDM dm = new FC_ACCT_6002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.ernm = Util.checkString(req.getParameter("ernm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.erplace_addr = Util.checkString(req.getParameter("erplace_addr"));
		dm.erplace_bizcond = Util.checkString(req.getParameter("erplace_bizcond"));
		dm.erplace_item = Util.checkString(req.getParameter("erplace_item"));
		dm.taxoff = Util.checkString(req.getParameter("taxoff"));
		dm.corp_reg_no = Util.checkString(req.getParameter("corp_reg_no"));
		dm.intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.ernm_tax = Util.checkString(req.getParameter("ernm_tax"));
		dm.erplace_cd_tax = Util.checkString(req.getParameter("erplace_cd_tax"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6002_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.erplace_cd = (String)hash.get("erplace_cd");
		dm.ernm = (String)hash.get("ernm");
		dm.ern = (String)hash.get("ern");
		dm.presi_nm = (String)hash.get("presi_nm");
		dm.erplace_addr = (String)hash.get("erplace_addr");
		dm.erplace_bizcond = (String)hash.get("erplace_bizcond");
		dm.erplace_item = (String)hash.get("erplace_item");
		dm.taxoff = (String)hash.get("taxoff");
		dm.corp_reg_no = (String)hash.get("corp_reg_no");
		dm.intg_dlco_cd = (String)hash.get("intg_dlco_cd");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.use_yn = (String)hash.get("use_yn");		
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_dt_tm = (String)hash.get("incmg_dt_tm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		dm.ernm = Util.getSessionParameterValue(req,"ernm",true);
		dm.ern = Util.getSessionParameterValue(req,"ern",true);
		dm.presi_nm = Util.getSessionParameterValue(req,"presi_nm",true);
		dm.erplace_addr = Util.getSessionParameterValue(req,"erplace_addr",true);
		dm.erplace_bizcond = Util.getSessionParameterValue(req,"erplace_bizcond",true);
		dm.erplace_item = Util.getSessionParameterValue(req,"erplace_item",true);
		dm.taxoff = Util.getSessionParameterValue(req,"taxoff",true);
		dm.corp_reg_no = Util.getSessionParameterValue(req,"corp_reg_no",true);
		dm.intg_dlco_cd = Util.getSessionParameterValue(req,"intg_dlco_cd",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);		
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_dt_tm = Util.getSessionParameterValue(req,"incmg_dt_tm",true);
		*******************************************************************************************/
	}
	public void fc_acct_6003_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6003_UDataSet ds = null;
		FC_ACCT_6003_UDM dm = new FC_ACCT_6003_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.ernm = Util.checkString(req.getParameter("ernm"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.erplace_addr = Util.checkString(req.getParameter("erplace_addr"));
		dm.erplace_bizcond = Util.checkString(req.getParameter("erplace_bizcond"));
		dm.erplace_item = Util.checkString(req.getParameter("erplace_item"));
		dm.taxoff = Util.checkString(req.getParameter("taxoff"));
		dm.corp_reg_no = Util.checkString(req.getParameter("corp_reg_no"));
		dm.intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.ernm_tax = Util.checkString(req.getParameter("ernm_tax"));
		dm.erplace_cd_tax = Util.checkString(req.getParameter("erplace_cd_tax"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6003_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6003_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.erplace_cd = (String)hash.get("erplace_cd");
		dm.ernm = (String)hash.get("ernm");
		dm.ern = (String)hash.get("ern");
		dm.presi_nm = (String)hash.get("presi_nm");
		dm.erplace_addr = (String)hash.get("erplace_addr");
		dm.erplace_bizcond = (String)hash.get("erplace_bizcond");
		dm.erplace_item = (String)hash.get("erplace_item");
		dm.taxoff = (String)hash.get("taxoff");
		dm.corp_reg_no = (String)hash.get("corp_reg_no");
		dm.intg_dlco_cd = (String)hash.get("intg_dlco_cd");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.use_yn = (String)hash.get("use_yn");		
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		dm.ernm = Util.getSessionParameterValue(req,"ernm",true);
		dm.ern = Util.getSessionParameterValue(req,"ern",true);
		dm.presi_nm = Util.getSessionParameterValue(req,"presi_nm",true);
		dm.erplace_addr = Util.getSessionParameterValue(req,"erplace_addr",true);
		dm.erplace_bizcond = Util.getSessionParameterValue(req,"erplace_bizcond",true);
		dm.erplace_item = Util.getSessionParameterValue(req,"erplace_item",true);
		dm.taxoff = Util.getSessionParameterValue(req,"taxoff",true);
		dm.corp_reg_no = Util.getSessionParameterValue(req,"corp_reg_no",true);
		dm.intg_dlco_cd = Util.getSessionParameterValue(req,"intg_dlco_cd",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);		
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void fc_acct_6004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6004_DDataSet ds = null;
		FC_ACCT_6004_DDM dm = new FC_ACCT_6004_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6004_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
  public void fc_acct_6010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
      FC_ACCT_6010_MDataSet ds = null;
      FC_ACCT_6010_MDM dm = new FC_ACCT_6010_MDM();

      dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

      dm.print();
      
      /* EJB 수정후 시작 */
      DBManager manager = new DBManager("MISFNC");
      ds = (FC_ACCT_6010_MDataSet)manager.executeCall(dm);

      if(!ds.getErrcode().equals("")) {
      	throw new AppException(ds.getErrcode(), ds.getErrmsg());
      }

      req.setAttribute("ds", ds);
      /* EJB 수정후 끝 */

      /* EJB 수정전 시작
      try {
          FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
          FC_ACCT_6000EJB ejb = home.create();

          ds = ejb.fc_acct_6010_m(dm);
          req.setAttribute("ds", ds);
      }
      catch (CreateException e) {
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

    public void fc_acct_6011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
        FC_ACCT_6011_LDataSet ds = null;
        FC_ACCT_6011_LDM dm = new FC_ACCT_6011_LDM();

        dm.kind = Util.checkString(req.getParameter("kind"));
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
        dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
        dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
        dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
        dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
        dm.slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));

        dm.print();
        
        /* EJB 수정후 시작 */
        DBManager manager = new DBManager("MISFNC");
        ds = (FC_ACCT_6011_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
        	throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        req.setAttribute("ds", ds);
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작
        try {
            FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
            FC_ACCT_6000EJB ejb = home.create();

            ds = ejb.fc_acct_6011_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
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

        dm.kind = (String)hash.get("kind");
        dm.cmpy_cd = (String)hash.get("cmpy_cd");
        dm.prof_type_cd = (String)hash.get("prof_type_cd");
        dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
        dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
        dm.slip_seq = (String)hash.get("slip_seq");
        dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
        dm.slip_arow_no = (String)hash.get("slip_arow_no");
        *******************************************************************************************/
	}

    public void fc_acct_6012_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
        FC_ACCT_6012_ADataSet ds = null;
        FC_ACCT_6012_ADM dm = new FC_ACCT_6012_ADM();

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
        dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
        dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
        dm.make_dt = Util.checkString(req.getParameter("make_dt"));
        dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
        dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
        dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
        dm.deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
        dm.ern = Util.checkString(req.getParameter("ern"));
        dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
        dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
        dm.addr = Util.checkString(req.getParameter("addr"));
        dm.bizcond = Util.checkString(req.getParameter("bizcond"));
        dm.item = Util.checkString(req.getParameter("item"));
        dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
        dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
        dm.tax_stmt_aprv_yn = Util.checkString(req.getParameter("tax_stmt_aprv_yn"));
        dm.decl_yn = Util.checkString(req.getParameter("decl_yn"));
        dm.decl_qq = Util.checkString(req.getParameter("decl_qq"));
        dm.issu_pers_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
		dm.elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		dm.email_id = Util.checkString(req.getParameter("email_id"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd")); 
		dm.remk1 = Util.checkString(req.getParameter("remk1"));

        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        dm.mode = (String)hash.get("m");
        dm.slip_arow_no = (String)hash.get("slip_arow_no");
        dm.mmdd = (String)hash.get("mmdd");
        dm.item1 = (String)hash.get("item");
        dm.std = (String)hash.get("std");
        dm.qunt = (String)hash.get("qunt");
        dm.uprc = (String)hash.get("uprc");
        dm.suply_amt1 = (String)hash.get("suply_amt");
        dm.vat_amt1 = (String)hash.get("vat_amt");

        dm.print();

        /* EJB 수정후 시작 */
        DBManager manager = new DBManager("MISFNC");
        ds = (FC_ACCT_6012_ADataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
        	throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        req.setAttribute("ds", ds);
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작
        try {
            FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
            FC_ACCT_6000EJB ejb = home.create();

            ds = ejb.fc_acct_6012_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
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
        dm.prof_type_cd = (String)hash.get("prof_type_cd");
        dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
        dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
        dm.make_dt = (String)hash.get("make_dt");
        dm.erplace_cd = (String)hash.get("erplace_cd");
        dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
        dm.dlco_cd = (String)hash.get("dlco_cd");
        dm.deal_clsf = (String)hash.get("deal_clsf");
        dm.ern = (String)hash.get("ern");
        dm.dlco_nm = (String)hash.get("dlco_nm");
        dm.presi_nm = (String)hash.get("presi_nm");
        dm.addr = (String)hash.get("addr");
        dm.bizcond = (String)hash.get("bizcond");
        dm.item = (String)hash.get("item");
        dm.suply_amt = (String)hash.get("suply_amt");
        dm.vat_amt = (String)hash.get("vat_amt");
        dm.tax_stmt_aprv_yn = (String)hash.get("tax_stmt_aprv_yn");
        dm.decl_yn = (String)hash.get("decl_yn");
        dm.decl_qq = (String)hash.get("decl_qq");
        dm.issu_pers_emp_no = (String)hash.get("issu_pers_emp_no");
        dm.incmg_dt_tm = (String)hash.get("incmg_dt_tm");
        dm.incmg_pers = (String)hash.get("incmg_pers");
        dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
        dm.mode = (String)hash.get("mode");
        dm.slip_arow_no = (String)hash.get("slip_arow_no");
        dm.mmdd = (String)hash.get("mmdd");
        dm.item1 = (String)hash.get("item1");
        dm.std = (String)hash.get("std");
        dm.qunt = (String)hash.get("qunt");
        dm.uprc = (String)hash.get("uprc");
        dm.suply_amt1 = (String)hash.get("suply_amt1");
        dm.vat_amt1 = (String)hash.get("vat_amt1");
        *******************************************************************************************/
	}

    public void fc_acct_6013_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
       FC_ACCT_6013_ADataSet ds = null;
       FC_ACCT_6013_ADM dm = new FC_ACCT_6013_ADM();

       dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
       dm.prof_type_cd_in = Util.checkString(req.getParameter("prof_type_cd"));
       dm.slip_clsf_cd_in = Util.checkString(req.getParameter("slip_clsf_cd"));
       dm.slip_occr_dt_in = Util.checkString(req.getParameter("slip_occr_dt"));
       dm.slip_seq_in = Util.checkString(req.getParameter("slip_seq"));
       dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
       dm.occr_slip_occr_dt = Util.checkString(req.getParameter("occr_slip_occr_dt"));
       dm.occr_slip_clsf_cd = Util.checkString(req.getParameter("occr_slip_clsf_cd"));
       dm.occr_slip_seq = Util.checkString(req.getParameter("occr_slip_seq"));
       dm.occr_slip_sub_seq = Util.checkString(req.getParameter("occr_slip_sub_seq"));
       dm.occr_slip_arow_no = Util.checkString(req.getParameter("occr_slip_arow_no"));
       dm.make_dt = Util.checkString(req.getParameter("make_dt"));
       dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
       dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
       dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
       dm.deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
       dm.ern = Util.checkString(req.getParameter("ern"));
       dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
       dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
       dm.addr = Util.checkString(req.getParameter("addr"));
       dm.bizcond = Util.checkString(req.getParameter("bizcond"));
       dm.item = Util.checkString(req.getParameter("item"));
       dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
       dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
       dm.tax_stmt_aprv_yn = Util.checkString(req.getParameter("tax_stmt_aprv_yn"));
       dm.decl_yn = Util.checkString(req.getParameter("decl_yn"));
       dm.decl_qq = Util.checkString(req.getParameter("decl_qq"));
       dm.make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
       dm.upd_tms = Util.checkString(req.getParameter("upd_tms"));
       dm.last_upd_dd = Util.checkString(req.getParameter("last_upd_dd"));
       dm.issu_pers_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
       dm.issu_tms = Util.checkString(req.getParameter("issu_tms"));
       dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
       dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
       dm.incmg_pers_ipadd = req.getRemoteAddr();
       dm.canc_yn = Util.checkString(req.getParameter("canc_yn"));
       dm.canc_dt = Util.checkString(req.getParameter("canc_dt"));
       dm.del_resn = Util.checkString(req.getParameter("del_resn"));
      
       String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
       Hashtable hash = getHashMultiUpdateData(multiUpdateData);

       dm.mode = (String)hash.get("m");
       dm.slip_arow_no = (String)hash.get("slip_arow_no");
       dm.mmdd = (String)hash.get("mmdd");
       dm.item1 = (String)hash.get("item");
       dm.std = (String)hash.get("std");
       dm.qunt = (String)hash.get("qunt");
       dm.uprc = (String)hash.get("uprc");
       dm.suply_amt1 = (String)hash.get("suply_amt");
       dm.vat_amt1 = (String)hash.get("vat_amt");
       
	   dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
	   dm.elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
	   dm.email_id = Util.checkString(req.getParameter("email_id"));       
	   dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
	   dm.biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd"));
	   dm.remk1 = Util.checkString(req.getParameter("remk1"));
       dm.print();

       /* EJB 수정후 시작 */
       DBManager manager = new DBManager("MISFNC");
       ds = (FC_ACCT_6013_ADataSet)manager.executeCall(dm);

       if(!ds.getErrcode().equals("")) {
       	throw new AppException(ds.getErrcode(), ds.getErrmsg());
       }

       req.setAttribute("ds", ds);
       /* EJB 수정후 끝 */

       /* EJB 수정전 시작
       try {
           FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
           FC_ACCT_6000EJB ejb = home.create();

           ds = ejb.fc_acct_6013_a(dm);
           req.setAttribute("ds", ds);
       }
       catch (CreateException e) {
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
       dm.prof_type_cd_in = (String)hash.get("prof_type_cd_in");
       dm.slip_clsf_cd_in = (String)hash.get("slip_clsf_cd_in");
       dm.slip_occr_dt_in = (String)hash.get("slip_occr_dt_in");
       dm.slip_seq_in = (String)hash.get("slip_seq_in");
       dm.prof_type_cd = (String)hash.get("prof_type_cd");
       dm.occr_slip_occr_dt = (String)hash.get("occr_slip_occr_dt");
       dm.occr_slip_clsf_cd = (String)hash.get("occr_slip_clsf_cd");
       dm.occr_slip_seq = (String)hash.get("occr_slip_seq");
       dm.occr_slip_sub_seq = (String)hash.get("occr_slip_sub_seq");
       dm.occr_slip_arow_no = (String)hash.get("occr_slip_arow_no");
       dm.make_dt = (String)hash.get("make_dt");
       dm.erplace_cd = (String)hash.get("erplace_cd");
       dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
       dm.dlco_cd = (String)hash.get("dlco_cd");
       dm.deal_clsf = (String)hash.get("deal_clsf");
       dm.ern = (String)hash.get("ern");
       dm.dlco_nm = (String)hash.get("dlco_nm");
       dm.presi_nm = (String)hash.get("presi_nm");
       dm.addr = (String)hash.get("addr");
       dm.bizcond = (String)hash.get("bizcond");
       dm.item = (String)hash.get("item");
       dm.suply_amt = (String)hash.get("suply_amt");
       dm.vat_amt = (String)hash.get("vat_amt");
       dm.tax_stmt_aprv_yn = (String)hash.get("tax_stmt_aprv_yn");
       dm.decl_yn = (String)hash.get("decl_yn");
       dm.decl_qq = (String)hash.get("decl_qq");
       dm.make_upd_dt = (String)hash.get("make_upd_dt");
       dm.upd_tms = (String)hash.get("upd_tms");
       dm.last_upd_dd = (String)hash.get("last_upd_dd");
       dm.issu_pers_emp_no = (String)hash.get("issu_pers_emp_no");
       dm.issu_tms = (String)hash.get("issu_tms");
       dm.incmg_dt_tm = (String)hash.get("incmg_dt_tm");
       dm.incmg_pers = (String)hash.get("incmg_pers");
       dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
       dm.canc_yn = (String)hash.get("canc_yn");
       dm.canc_dt = (String)hash.get("canc_dt");
       dm.del_resn = (String)hash.get("del_resn");
       dm.mode = (String)hash.get("mode");
       dm.slip_arow_no = (String)hash.get("slip_arow_no");
       dm.mmdd = (String)hash.get("mmdd");
       dm.item1 = (String)hash.get("item1");
       dm.std = (String)hash.get("std");
       dm.qunt = (String)hash.get("qunt");
       dm.uprc = (String)hash.get("uprc");
       dm.suply_amt1 = (String)hash.get("suply_amt1");
       dm.vat_amt1 = (String)hash.get("vat_amt1");
       *******************************************************************************************/
	}
    public void fc_acct_6014_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
        FC_ACCT_6014_UDataSet ds = null;
        FC_ACCT_6014_UDM dm = new FC_ACCT_6014_UDM();

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
        dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
        dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
        dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

        dm.print();
        
        /* EJB 수정후 시작 */
        DBManager manager = new DBManager("MISFNC");
        ds = (FC_ACCT_6014_UDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
        	throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        req.setAttribute("ds", ds);
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작
        try {
            FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
            FC_ACCT_6000EJB ejb = home.create();

            ds = ejb.fc_acct_6014_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
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
        dm.elec_tax_bill_yn = (String)hash.get("elec_tax_bill_yn");
        dm.chg_pers = (String)hash.get("chg_pers");
        dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
        dm.prof_type_cd = (String)hash.get("prof_type_cd");
        dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
        dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
        dm.slip_seq = (String)hash.get("slip_seq");
        *******************************************************************************************/
	}
	public void fc_acct_6015_e(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6015_EDataSet ds = null;
		FC_ACCT_6015_EDM dm = new FC_ACCT_6015_EDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6015_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6015_e(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_seq = (String)hash.get("slip_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		*******************************************************************************************/
	}    
	public void fc_acct_6020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6020_MDataSet ds = null;
		FC_ACCT_6020_MDM dm = new FC_ACCT_6020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6021_LDataSet ds = null;
		FC_ACCT_6021_LDM dm = new FC_ACCT_6021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6022_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6022_LDataSet ds = null;
		FC_ACCT_6022_LDM dm = new FC_ACCT_6022_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6022_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		*******************************************************************************************/
	}
	public void fc_acct_6023_e(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6023_EDataSet ds = null;
		FC_ACCT_6023_EDM dm = new FC_ACCT_6023_EDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_dt = Util.checkString(req.getParameter("from_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.ndduc_rate = Util.checkString(req.getParameter("ndduc_rate"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6023_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6023_e(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_dt = (String)hash.get("from_dt");
		dm.to_dt = (String)hash.get("to_dt");
		dm.ndduc_rate = (String)hash.get("ndduc_rate");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_dt = Util.getSessionParameterValue(req,"from_dt",true);
		dm.to_dt = Util.getSessionParameterValue(req,"to_dt",true);
		dm.ndduc_rate = Util.getSessionParameterValue(req,"ndduc_rate",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}	
	public void fc_acct_6024_e(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6024_EDataSet ds = null;
		FC_ACCT_6024_EDM dm = new FC_ACCT_6024_EDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_dt = Util.checkString(req.getParameter("from_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.ndduc_rate = Util.checkString(req.getParameter("ndduc_rate"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6024_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6024_e(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_dt = (String)hash.get("from_dt");
		dm.to_dt = (String)hash.get("to_dt");
		dm.ndduc_rate = (String)hash.get("ndduc_rate");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_dt = Util.getSessionParameterValue(req,"from_dt",true);
		dm.to_dt = Util.getSessionParameterValue(req,"to_dt",true);
		dm.ndduc_rate = Util.getSessionParameterValue(req,"ndduc_rate",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void fc_acct_6025_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6025_UDataSet ds = null;
		FC_ACCT_6025_UDM dm = new FC_ACCT_6025_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = (String)hash.get("m");
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.slip_mang_clsf = (String)hash.get("slip_mang_clsf");
		dm.ndduc_rate = (String)hash.get("ndduc_rate");
		dm.ndduc_amt = (String)hash.get("ndduc_amt");
		dm.acml_amt1 = (String)hash.get("acml_amt1");
		dm.acml_amt2 = (String)hash.get("acml_amt2");
		dm.orgy_ndduc_amt = (String)hash.get("orgy_ndduc_amt");
		dm.comn_ndduc_amt = (String)hash.get("comn_ndduc_amt");
		dm.non_dduc_stot = (String)hash.get("non_dduc_stot");
		dm.orgy_dduc_amt = (String)hash.get("orgy_dduc_amt");
		dm.comn_dduc_amt = (String)hash.get("comn_dduc_amt");
		dm.dduc_stot = (String)hash.get("dduc_stot");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6025_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6025_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.slip_mang_clsf = (String)hash.get("slip_mang_clsf");
		dm.ndduc_rate = (String)hash.get("ndduc_rate");
		dm.ndduc_amt = (String)hash.get("ndduc_amt");
		dm.acml_amt1 = (String)hash.get("acml_amt1");
		dm.acml_amt2 = (String)hash.get("acml_amt2");
		dm.orgy_ndduc_amt = (String)hash.get("orgy_ndduc_amt");
		dm.comn_ndduc_amt = (String)hash.get("comn_ndduc_amt");
		dm.non_dduc_stot = (String)hash.get("non_dduc_stot");
		dm.orgy_dduc_amt = (String)hash.get("orgy_dduc_amt");
		dm.comn_dduc_amt = (String)hash.get("comn_dduc_amt");
		dm.dduc_stot = (String)hash.get("dduc_stot");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.clam_dept_cd = Util.getSessionParameterValue(req,"clam_dept_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.slip_mang_clsf = Util.getSessionParameterValue(req,"slip_mang_clsf",true);
		dm.ndduc_rate = Util.getSessionParameterValue(req,"ndduc_rate",true);
		dm.ndduc_amt = Util.getSessionParameterValue(req,"ndduc_amt",true);
		dm.acml_amt1 = Util.getSessionParameterValue(req,"acml_amt1",true);
		dm.acml_amt2 = Util.getSessionParameterValue(req,"acml_amt2",true);
		dm.orgy_ndduc_amt = Util.getSessionParameterValue(req,"orgy_ndduc_amt",true);
		dm.comn_ndduc_amt = Util.getSessionParameterValue(req,"comn_ndduc_amt",true);
		dm.non_dduc_stot = Util.getSessionParameterValue(req,"non_dduc_stot",true);
		dm.orgy_dduc_amt = Util.getSessionParameterValue(req,"orgy_dduc_amt",true);
		dm.comn_dduc_amt = Util.getSessionParameterValue(req,"comn_dduc_amt",true);
		dm.dduc_stot = Util.getSessionParameterValue(req,"dduc_stot",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void fc_acct_6026_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6026_ADataSet ds = null;
		FC_ACCT_6026_ADM dm = new FC_ACCT_6026_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.in_budg_cd = Util.checkString(req.getParameter("in_budg_cd"));
		dm.in_medi_cd = Util.checkString(req.getParameter("in_medi_cd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.canc_flag = Util.checkString(req.getParameter("canc_flag"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.hclam_dept_cd = Util.checkString(req.getParameter("hclam_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6026_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6026_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.in_budg_cd = (String)hash.get("in_budg_cd");
		dm.in_medi_cd = (String)hash.get("in_medi_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.canc_flag = (String)hash.get("canc_flag");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.hclam_dept_cd = (String)hash.get("hclam_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.in_budg_cd = Util.getSessionParameterValue(req,"in_budg_cd",true);
		dm.in_medi_cd = Util.getSessionParameterValue(req,"in_medi_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.canc_flag = Util.getSessionParameterValue(req,"canc_flag",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.hclam_dept_cd = Util.getSessionParameterValue(req,"hclam_dept_cd",true);
		*******************************************************************************************/
	}

	public void fc_acct_6027_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6027_UDataSet ds = null;
		FC_ACCT_6027_UDM dm = new FC_ACCT_6027_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.slip_occr_dt1 = Util.checkString(req.getParameter("slip_occr_dt1"));
		dm.slip_clsf_cd1 = Util.checkString(req.getParameter("slip_clsf_cd1"));
		dm.slip_seq1 = Util.checkString(req.getParameter("slip_seq1"));
		dm.slip_sub_seq1 = Util.checkString(req.getParameter("slip_sub_seq1"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.canc_flag = Util.checkString(req.getParameter("canc_flag"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6027_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6027_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_occr_dt1 = (String)hash.get("slip_occr_dt1");
		dm.slip_clsf_cd1 = (String)hash.get("slip_clsf_cd1");
		dm.slip_seq1 = (String)hash.get("slip_seq1");
		dm.slip_sub_seq1 = (String)hash.get("slip_sub_seq1");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.canc_flag = (String)hash.get("canc_flag");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_occr_dt1 = Util.getSessionParameterValue(req,"slip_occr_dt1",true);
		dm.slip_clsf_cd1 = Util.getSessionParameterValue(req,"slip_clsf_cd1",true);
		dm.slip_seq1 = Util.getSessionParameterValue(req,"slip_seq1",true);
		dm.slip_sub_seq1 = Util.getSessionParameterValue(req,"slip_sub_seq1",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.canc_flag = Util.getSessionParameterValue(req,"canc_flag",true);
		*******************************************************************************************/
	}	
	public void fc_acct_6030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6030_MDataSet ds = null;
		FC_ACCT_6030_MDM dm = new FC_ACCT_6030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6031_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6031_IDataSet ds = null;
		FC_ACCT_6031_IDM dm = new FC_ACCT_6031_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.fr_slip_occr_dt = Util.checkString(req.getParameter("fr_slip_occr_dt"));
		dm.to_slip_occr_dt = Util.checkString(req.getParameter("to_slip_occr_dt"));
		dm.gssgb1 = Util.checkString(req.getParameter("gssgb1"));
		dm.jobgb = Util.checkString(req.getParameter("jobgb"));		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.std_dt = Util.checkString(req.getParameter("std_dt"));	

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6031_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6031_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.erplace_cd = (String)hash.get("erplace_cd");
		dm.fr_slip_occr_dt = (String)hash.get("fr_slip_occr_dt");
		dm.to_slip_occr_dt = (String)hash.get("to_slip_occr_dt");
		dm.gssgb1 = (String)hash.get("gssgb1");
		dm.jobgb = (String)hash.get("jobgb");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		dm.fr_slip_occr_dt = Util.getSessionParameterValue(req,"fr_slip_occr_dt",true);
		dm.to_slip_occr_dt = Util.getSessionParameterValue(req,"to_slip_occr_dt",true);
		dm.gssgb1 = Util.getSessionParameterValue(req,"gssgb1",true);
		dm.jobgb = Util.getSessionParameterValue(req,"jobgb",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void fc_acct_6032_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6032_LDataSet ds = null;
		FC_ACCT_6032_LDM dm = new FC_ACCT_6032_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.fr_slip_occr_dt = req.getParameter("fr_slip_occr_dt");
		dm.to_slip_occr_dt = req.getParameter("to_slip_occr_dt");	
		dm.std_dt = req.getParameter("std_dt");	

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6032_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6033_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6033_LDataSet ds = null;
		FC_ACCT_6033_LDM dm = new FC_ACCT_6033_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6033_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6033_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6034_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6034_LDataSet ds = null;
		FC_ACCT_6034_LDM dm = new FC_ACCT_6034_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.fr_slip_occr_dt = Util.checkString(req.getParameter("fr_slip_occr_dt"));
		dm.to_slip_occr_dt = Util.checkString(req.getParameter("to_slip_occr_dt"));		
		dm.std_dt = Util.checkString(req.getParameter("std_dt"));		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6034_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6034_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6035_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6035_SDataSet ds = null;
		FC_ACCT_6035_SDM dm = new FC_ACCT_6035_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6035_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6035_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	
	public void fc_acct_6036_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6036_UDataSet ds = null;
		FC_ACCT_6036_UDM dm = new FC_ACCT_6036_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	dm.mode = Util.checkString((String)hash.get("m"));
		dm.data_clsf = Util.checkString((String)hash.get("data_clsf"));
		dm.suply_pers_reg_no = Util.checkString((String)hash.get("suply_pers_reg_no"));
		dm.rec_suply_reg_no = Util.checkString((String)hash.get("rec_suply_reg_no"));
		dm.seq = Util.checkString((String)hash.get("seq"));
		dm.nosh = Util.checkString((String)hash.get("nosh"));
		dm.deal_cnt = Util.checkString((String)hash.get("deal_cnt"));
		dm.suply_amt = Util.checkString((String)hash.get("suply_amt"));
		dm.vat_amt = Util.checkString((String)hash.get("vat_amt"));
		

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6036_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6037_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6037_UDataSet ds = null;
		FC_ACCT_6037_UDM dm = new FC_ACCT_6037_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	dm.mode = Util.checkString((String)hash.get("m"));
		dm.data_clsf = Util.checkString((String)hash.get("data_clsf"));
		dm.suply_pers_reg_no = Util.checkString((String)hash.get("suply_pers_reg_no"));
		dm.seq = Util.checkString((String)hash.get("seq"));
		dm.nosh = Util.checkString((String)hash.get("nosh"));
		dm.nul_cnt = Util.checkString((String)hash.get("nul_cnt"));
		dm.suply_amt = Util.checkString((String)hash.get("suply_amt"));
		dm.vat_amt = Util.checkString((String)hash.get("vat_amt"));
		

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6037_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_6038_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6038_UDataSet ds = null;
		FC_ACCT_6038_UDM dm = new FC_ACCT_6038_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	dm.mode = Util.checkString((String)hash.get("m"));
		dm.data_clsf = Util.checkString((String)hash.get("data_clsf"));
		dm.recd_clsf = Util.checkString((String)hash.get("recd_clsf"));
		dm.seq = Util.checkString((String)hash.get("seq"));
		dm.taxoff = Util.checkString((String)hash.get("taxoff"));
		dm.subm_ern = Util.checkString((String)hash.get("subm_ern"));
		dm.sale_dlco_ern = Util.checkString((String)hash.get("sale_dlco_ern"));
		dm.stmt_nosh = Util.checkString((String)hash.get("stmt_nosh"));
		dm.minus_indc = Util.checkString((String)hash.get("minus_indc"));
		dm.sale_amt = Util.checkString((String)hash.get("sale_amt"));
		

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6038_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_6040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6040_MDataSet ds = null;
		FC_ACCT_6040_MDM dm = new FC_ACCT_6040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6040_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6090_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6090_MDataSet ds = null;
		FC_ACCT_6090_MDM dm = new FC_ACCT_6090_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6090_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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

	public void fc_acct_6091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	long start_tm = System.currentTimeMillis();
		
		FC_ACCT_6091_LDataSet ds = null;
		FC_ACCT_6091_LDM dm = new FC_ACCT_6091_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd_fr = Util.checkString(req.getParameter("slip_clsf_cd_fr"));
		dm.slip_clsf_cd_to = Util.checkString(req.getParameter("slip_clsf_cd_to"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.suply_amt_fr = Util.checkString(req.getParameter("suply_amt_fr"));
		dm.suply_amt_to = Util.checkString(req.getParameter("suply_amt_to"));
		dm.vat_amt_fr = Util.checkString(req.getParameter("vat_amt_fr"));
		dm.vat_amt_to = Util.checkString(req.getParameter("vat_amt_to"));
		dm.elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6091_l(dm);
			req.setAttribute("ds", ds);
			
            long end_tm = System.currentTimeMillis();
            
            System.out.println("elapsed = " + (end_tm - start_tm));
            
		}
		catch (CreateException e) {
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		dm.make_dt_fr = (String)hash.get("make_dt_fr");
		dm.make_dt_to = (String)hash.get("make_dt_to");
		dm.prof_type_cd = (String)hash.get("prof_type_cd");
		dm.slip_clsf_cd_fr = (String)hash.get("slip_clsf_cd_fr");
		dm.slip_clsf_cd_to = (String)hash.get("slip_clsf_cd_to");
		dm.ern = (String)hash.get("ern");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		dm.suply_amt_fr = (String)hash.get("suply_amt_fr");
		dm.suply_amt_to = (String)hash.get("suply_amt_to");
		dm.vat_amt_fr = (String)hash.get("vat_amt_fr");
		dm.vat_amt_to = (String)hash.get("vat_amt_to");
		dm.elec_tax_bill_yn = (String)hash.get("elec_tax_bill_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		dm.make_dt_fr = Util.getSessionParameterValue(req,"make_dt_fr",true);
		dm.make_dt_to = Util.getSessionParameterValue(req,"make_dt_to",true);
		dm.prof_type_cd = Util.getSessionParameterValue(req,"prof_type_cd",true);
		dm.slip_clsf_cd_fr = Util.getSessionParameterValue(req,"slip_clsf_cd_fr",true);
		dm.slip_clsf_cd_to = Util.getSessionParameterValue(req,"slip_clsf_cd_to",true);
		dm.ern = Util.getSessionParameterValue(req,"ern",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		dm.suply_amt_fr = Util.getSessionParameterValue(req,"suply_amt_fr",true);
		dm.suply_amt_to = Util.getSessionParameterValue(req,"suply_amt_to",true);
		dm.vat_amt_fr = Util.getSessionParameterValue(req,"vat_amt_fr",true);
		dm.vat_amt_to = Util.getSessionParameterValue(req,"vat_amt_to",true);
		dm.elec_tax_bill_yn = Util.getSessionParameterValue(req,"elec_tax_bill_yn",true);
		*******************************************************************************************/
	}		

	public void fc_acct_6092_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	long start_tm = System.currentTimeMillis();
		
		FC_ACCT_6092_LDataSet ds = null;
		FC_ACCT_6092_LDM dm = new FC_ACCT_6092_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd_fr = Util.checkString(req.getParameter("slip_clsf_cd_fr"));
		dm.slip_clsf_cd_to = Util.checkString(req.getParameter("slip_clsf_cd_to"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.suply_amt_fr = Util.checkString(req.getParameter("suply_amt_fr"));
		dm.suply_amt_to = Util.checkString(req.getParameter("suply_amt_to"));
		dm.vat_amt_fr = Util.checkString(req.getParameter("vat_amt_fr"));
		dm.vat_amt_to = Util.checkString(req.getParameter("vat_amt_to"));
		dm.elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6092_l(dm);
			req.setAttribute("ds", ds);
			
            long end_tm = System.currentTimeMillis();
            
            System.out.println("elapsed = " + (end_tm - start_tm));
            
		}
		catch (CreateException e) {
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
		dm.make_dt_fr = (String)hash.get("make_dt_fr");
		dm.make_dt_to = (String)hash.get("make_dt_to");
		dm.prof_type_cd = (String)hash.get("prof_type_cd");
		dm.slip_clsf_cd_fr = (String)hash.get("slip_clsf_cd_fr");
		dm.slip_clsf_cd_to = (String)hash.get("slip_clsf_cd_to");
		dm.ern = (String)hash.get("ern");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		dm.suply_amt_fr = (String)hash.get("suply_amt_fr");
		dm.suply_amt_to = (String)hash.get("suply_amt_to");
		dm.vat_amt_fr = (String)hash.get("vat_amt_fr");
		dm.vat_amt_to = (String)hash.get("vat_amt_to");
		dm.elec_tax_bill_yn = (String)hash.get("elec_tax_bill_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.make_dt_fr = Util.getSessionParameterValue(req,"make_dt_fr",true);
		dm.make_dt_to = Util.getSessionParameterValue(req,"make_dt_to",true);
		dm.prof_type_cd = Util.getSessionParameterValue(req,"prof_type_cd",true);
		dm.slip_clsf_cd_fr = Util.getSessionParameterValue(req,"slip_clsf_cd_fr",true);
		dm.slip_clsf_cd_to = Util.getSessionParameterValue(req,"slip_clsf_cd_to",true);
		dm.ern = Util.getSessionParameterValue(req,"ern",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		dm.suply_amt_fr = Util.getSessionParameterValue(req,"suply_amt_fr",true);
		dm.suply_amt_to = Util.getSessionParameterValue(req,"suply_amt_to",true);
		dm.vat_amt_fr = Util.getSessionParameterValue(req,"vat_amt_fr",true);
		dm.vat_amt_to = Util.getSessionParameterValue(req,"vat_amt_to",true);
		dm.elec_tax_bill_yn = Util.getSessionParameterValue(req,"elec_tax_bill_yn",true);
		*******************************************************************************************/
	}	
	public void fc_acct_6111_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6111_ADataSet ds = null;
		FC_ACCT_6111_ADM dm = new FC_ACCT_6111_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stmt_fr = Util.checkString(req.getParameter("stmt_fr"));
		dm.stmt_to = Util.checkString(req.getParameter("stmt_to"));
		dm.kind = Util.checkString(req.getParameter("kind"));
		dm.qq = Util.checkString(req.getParameter("qq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6111_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6111_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.stmt_fr = (String)hash.get("stmt_fr");
		dm.stmt_to = (String)hash.get("stmt_to");
		dm.kind = (String)hash.get("kind");
		dm.qq = (String)hash.get("qq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stmt_fr = Util.getSessionParameterValue(req,"stmt_fr",true);
		dm.stmt_to = Util.getSessionParameterValue(req,"stmt_to",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		dm.qq = Util.getSessionParameterValue(req,"qq",true);
		*******************************************************************************************/
	}
	public void fc_acct_6120_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6120_MDataSet ds = null;
		FC_ACCT_6120_MDM dm = new FC_ACCT_6120_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6120_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6121_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6121_LDataSet ds = null;
		FC_ACCT_6121_LDM dm = new FC_ACCT_6121_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6121_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6130_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6130_MDataSet ds = null;
		FC_ACCT_6130_MDM dm = new FC_ACCT_6130_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6130_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6130_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6131_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6131_LDataSet ds = null;
		FC_ACCT_6131_LDM dm = new FC_ACCT_6131_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.vat_decl_yymm = Util.checkString(req.getParameter("vat_decl_yymm"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6131_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6131_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.vat_decl_yymm = (String)hash.get("vat_decl_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.vat_decl_yymm = Util.getSessionParameterValue(req,"vat_decl_yymm",true);
		*******************************************************************************************/
	}	
	public void fc_acct_6132_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6132_IDataSet ds = null;
		FC_ACCT_6132_IDM dm = new FC_ACCT_6132_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_gb = Util.checkString(req.getParameter("work_gb"));
		dm.fr_cymd = Util.checkString(req.getParameter("fr_cymd"));
		dm.to_cymd = Util.checkString(req.getParameter("to_cymd"));
		dm.bugi_fr_cymd = Util.checkString(req.getParameter("bugi_fr_cymd"));
		dm.bugi_to_cymd = Util.checkString(req.getParameter("bugi_to_cymd"));
		dm.bangi_fr_cymd = Util.checkString(req.getParameter("bangi_fr_cymd"));
		dm.bangi_to_cymd = Util.checkString(req.getParameter("bangi_to_cymd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6132_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6132_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.work_gb = (String)hash.get("work_gb");
		dm.fr_cymd = (String)hash.get("fr_cymd");
		dm.to_cymd = (String)hash.get("to_cymd");
		dm.bugi_fr_cymd = (String)hash.get("bugi_fr_cymd");
		dm.bugi_to_cymd = (String)hash.get("bugi_to_cymd");
		dm.bangi_fr_cymd = (String)hash.get("bangi_fr_cymd");
		dm.bangi_to_cymd = (String)hash.get("bangi_to_cymd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_gb = Util.getSessionParameterValue(req,"work_gb",true);
		dm.fr_cymd = Util.getSessionParameterValue(req,"fr_cymd",true);
		dm.to_cymd = Util.getSessionParameterValue(req,"to_cymd",true);
		dm.bugi_fr_cymd = Util.getSessionParameterValue(req,"bugi_fr_cymd",true);
		dm.bugi_to_cymd = Util.getSessionParameterValue(req,"bugi_to_cymd",true);
		dm.bangi_fr_cymd = Util.getSessionParameterValue(req,"bangi_fr_cymd",true);
		dm.bangi_to_cymd = Util.getSessionParameterValue(req,"bangi_to_cymd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}	
	public void fc_acct_6133_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6133_UDataSet ds = null;
		FC_ACCT_6133_UDM dm = new FC_ACCT_6133_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.vat_decl_yymm = Util.checkString(req.getParameter("vat_decl_yymm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6133_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6133_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.clos_yn = (String)hash.get("clos_yn");
		dm.vat_decl_yymm = (String)hash.get("vat_decl_yymm");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_yn = Util.getSessionParameterValue(req,"clos_yn",true);
		dm.vat_decl_yymm = Util.getSessionParameterValue(req,"vat_decl_yymm",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void fc_acct_6134_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6134_UDataSet ds = null;
		FC_ACCT_6134_UDM dm = new FC_ACCT_6134_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.decl_amt1 = Util.checkString(req.getParameter("decl_amt1"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.vat_decl_yymm = Util.checkString(req.getParameter("vat_decl_yymm"));
		dm.purc_sale_clsf_cd = Util.checkString(req.getParameter("purc_sale_clsf_cd"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6134_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6134_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.decl_amt1 = (String)hash.get("decl_amt1");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.vat_decl_yymm = (String)hash.get("vat_decl_yymm");
		dm.purc_sale_clsf_cd = (String)hash.get("purc_sale_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.decl_amt1 = Util.getSessionParameterValue(req,"decl_amt1",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.vat_decl_yymm = Util.getSessionParameterValue(req,"vat_decl_yymm",true);
		dm.purc_sale_clsf_cd = Util.getSessionParameterValue(req,"purc_sale_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6136_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6136_SDataSet ds = null;
		FC_ACCT_6136_SDM dm = new FC_ACCT_6136_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.vat_decl_yymm = Util.checkString(req.getParameter("vat_decl_yymm"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6136_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6136_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.vat_decl_yymm = (String)hash.get("vat_decl_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.vat_decl_yymm = Util.getSessionParameterValue(req,"vat_decl_yymm",true);
		*******************************************************************************************/
	}
	public void fc_acct_6138_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6138_SDataSet ds = null;
		FC_ACCT_6138_SDM dm = new FC_ACCT_6138_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6138_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6138_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6150_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6150_MDataSet ds = null;
		FC_ACCT_6150_MDM dm = new FC_ACCT_6150_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6150_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6150_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6151_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6151_LDataSet ds = null;
		FC_ACCT_6151_LDM dm = new FC_ACCT_6151_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6151_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6152_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6152_LDataSet ds = null;
		FC_ACCT_6152_LDM dm = new FC_ACCT_6152_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6152_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6152_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6160_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6160_MDataSet ds = null;
		FC_ACCT_6160_MDM dm = new FC_ACCT_6160_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6160_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6160_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_6161_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6161_LDataSet ds = null;
		FC_ACCT_6161_LDM dm = new FC_ACCT_6161_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6161_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_6162_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6162_LDataSet ds = null;
		FC_ACCT_6162_LDM dm = new FC_ACCT_6162_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6162_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작

		try {
			FC_ACCT_6000EJBHome home = (FC_ACCT_6000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_6000EJB");
			FC_ACCT_6000EJB ejb = home.create();

			ds = ejb.fc_acct_6162_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}	
	
	
	
	public void fc_acct_6170_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6170_LDataSet ds = null;
		FC_ACCT_6170_LDM dm = new FC_ACCT_6170_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr")).replaceAll("-", "");
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to")).replaceAll("-", "");
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6170_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}	
	
	   public void fc_acct_6171_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		      // NR : 매출계산서, NP : 매입계산서, AR : 매출세금계산서, AP : 매입세금계산서 //
		      String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		       Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		       
		       String cmpycd  = Util.getSessionParameterValue(req,"cmpycd",true);      //회사코드
		       String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));      //구분
		       String make_dt      = Util.checkString((String)hash.get("col2"));       //작성일자
		       String seq      = Util.checkString((String)hash.get("col3"));         //승인번호
		       String issue_dt      = Util.checkString((String)hash.get("col4"));      //발급일자
		       String trans_dt      = Util.checkString((String)hash.get("col5"));      //전송일자
		       String ern      = null;                                       //공급자사업자등록번호(매입) / 공급받는자사업자등록번호(매출)
		       String clsf_1 = tax_clsf.substring(1,2);
               if(clsf_1.equals("P")) { //구분이 매입일경우
                  ern = Util.checkString((String)hash.get("col6"));
               } else {
                  ern = Util.checkString((String)hash.get("col11")); //공급받는자사업자등록번호 10->11 변경 20161114 봉은정수정
               }
		       String ern_nm   = null;                                       //상호(공급자)(매입) / 상호(공급받는자)(매출)
		       //if(tax_clsf.equals("AP")) { //구분이 매입일경우
		       if(clsf_1.equals("P")) { //구분이 매입일경우
		          ern_nm = Util.checkString((String)hash.get("col8"));
		       } else {
		          ern_nm = Util.checkString((String)hash.get("col13"));
		       }

		       String total_amt = Util.checkString((String)hash.get("col16"));         //합계금액
		       String suply_amt = Util.checkString((String)hash.get("col17"));         //공급가액 20161114 봉은정 수정

		       String vat_amt = null;
		       String clsf = tax_clsf.substring(0,1);
		       if(clsf.equals("A")) {
		    	   vat_amt  = Util.checkString((String)hash.get("col18"));  //20160921 봉은정수정 /17->18 20161114봉은정수정
		       } else {
		           vat_amt  = Util.checkString((String)hash.get("col18"));
		       }
 
		       //String tax_number= Util.checkString((String)hash.get("col1"));         //원본엑셀의 번호
		       
		       String cmpy_ern    = null;                                    //공급받는자사업자등록번호(매입) / 공급자사업자등록번호(매출)
		       //if(tax_clsf.equals("AP")) { //구분이 매입일경우
	           if(clsf_1.equals("P")) { //구분이 매입일경우
	              cmpy_ern = Util.checkString((String)hash.get("col11"));
	           } else {
	              cmpy_ern = Util.checkString((String)hash.get("col6"));
	           }
		       
		      FC_ACCT_6171_ADataSet ds = null;
		      FC_ACCT_6171_ADM dm = new FC_ACCT_6171_ADM();

		      dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		      dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		      dm.tax_clsf = tax_clsf;
		      dm.make_dt = make_dt;
		      dm.seq = seq;
		      dm.issue_dt = issue_dt;
		      dm.trans_dt = trans_dt;
		      dm.ern = ern;
		      dm.ern_nm = ern_nm;
		      dm.total_amt = total_amt;
		      dm.suply_amt = suply_amt;
		      dm.vat_amt = vat_amt;
		      //dm.tax_number = tax_number;
		      dm.cmpy_ern = cmpy_ern;
		      
		      //delete 조건을 위한 원본엑셀 번호의 시작, 종료 번호
		      //String[] tax_number_array = tax_number.split(COL_SEPARATOR);
		      //dm.tax_number_start = tax_number_array[0];                        
		      //dm.tax_number_end   = tax_number_array[tax_number_array.length-1];
		     // dm.print();
		    

		      /* EJB 수정후 시작 */
		      DBManager manager = new DBManager("MISFNC");
		      ds = (FC_ACCT_6171_ADataSet)manager.executeCall(dm);
		      
		      if(!ds.getErrcode().equals("")) {
		         throw new AppException(ds.getErrcode(), ds.getErrmsg());      
		      }
		      req.setAttribute("ds", ds);
}   
		   
	
	public void fc_acct_6172_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6172_MDataSet ds = null;
		FC_ACCT_6172_MDM dm = new FC_ACCT_6172_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6172_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	public void fc_acct_6173_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6173_ADataSet ds = null;
		FC_ACCT_6173_ADM dm = new FC_ACCT_6173_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr")).replaceAll("-", "");
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to")).replaceAll("-", "");
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6173_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

	public void fc_acct_6210_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("fc_acct_6210_m wb start!!");
		FC_ACCT_6210_MDataSet ds = null;
		FC_ACCT_6210_MDM dm = new FC_ACCT_6210_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6210_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	public void fc_acct_6211_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6211_SDataSet ds = null;
		FC_ACCT_6211_SDM dm = new FC_ACCT_6211_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6211_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	

	public void fc_acct_6212_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6212_ADataSet ds = null;
		FC_ACCT_6212_ADM dm = new FC_ACCT_6212_ADM();
//		System.out.println("==============================================");
		dm.flag                = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers          = Util.getSessionParameterValue(req,"emp_no",true);
		//dm.incmg_pers_ipadd    = req.getRemoteAddr();
		dm.cmpy_cd             = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd          = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm         = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm         = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		
//		System.out.println("==============================================1");
		dm.ma_amt_01 = Util.unFormatLong(req.getParameter("ma_amt_01"));
		dm.ma_vat_01 = Util.unFormatLong(req.getParameter("ma_vat_01"));
		dm.ma_amt_02 = Util.unFormatLong(req.getParameter("ma_amt_02"));
		dm.ma_vat_02 = Util.unFormatLong(req.getParameter("ma_vat_02"));
		dm.ma_amt_03 = Util.unFormatLong(req.getParameter("ma_amt_03"));
		dm.ma_vat_03 = Util.unFormatLong(req.getParameter("ma_vat_03"));
		dm.ma_amt_04 = Util.unFormatLong(req.getParameter("ma_amt_04"));
		dm.ma_vat_04 = Util.unFormatLong(req.getParameter("ma_vat_04"));
		dm.ma_amt_05 = Util.unFormatLong(req.getParameter("ma_amt_05"));
		dm.ma_amt_06 = Util.unFormatLong(req.getParameter("ma_amt_06"));
		dm.ma_amt_07 = Util.unFormatLong(req.getParameter("ma_amt_07"));
		dm.ma_vat_07 = Util.unFormatLong(req.getParameter("ma_vat_07"));
		dm.ma_amt_08 = Util.unFormatLong(req.getParameter("ma_amt_08"));
		dm.ma_vat_08 = Util.unFormatLong(req.getParameter("ma_vat_08"));
		dm.ma_amt_09 = Util.unFormatLong(req.getParameter("ma_amt_09"));
		dm.ma_vat_09 = Util.unFormatLong(req.getParameter("ma_vat_09"));
		dm.mb_amt_10 = Util.unFormatLong(req.getParameter("mb_amt_10"));
		dm.mb_vat_10 = Util.unFormatLong(req.getParameter("mb_vat_10"));
		dm.mb_amt_11 = Util.unFormatLong(req.getParameter("mb_amt_11"));
		dm.mb_vat_11 = Util.unFormatLong(req.getParameter("mb_vat_11"));
		dm.mb_amt_12 = Util.unFormatLong(req.getParameter("mb_amt_12"));
		dm.mb_vat_12 = Util.unFormatLong(req.getParameter("mb_vat_12"));
		dm.mb_amt_13 = Util.unFormatLong(req.getParameter("mb_amt_13"));
		dm.mb_vat_13 = Util.unFormatLong(req.getParameter("mb_vat_13"));
		dm.mb_amt_14 = Util.unFormatLong(req.getParameter("mb_amt_14"));
		dm.mb_vat_14 = Util.unFormatLong(req.getParameter("mb_vat_14"));
		dm.mb_amt_15 = Util.unFormatLong(req.getParameter("mb_amt_15"));
		dm.mb_vat_15 = Util.unFormatLong(req.getParameter("mb_vat_15"));
		dm.mb_amt_16 = Util.unFormatLong(req.getParameter("mb_amt_16"));
		dm.mb_vat_16 = Util.unFormatLong(req.getParameter("mb_vat_16"));
		dm.mb_amt_17 = Util.unFormatLong(req.getParameter("mb_amt_17"));
		dm.mb_vat_17 = Util.unFormatLong(req.getParameter("mb_vat_17"));
		dm.mb_vat_17_d = Util.unFormatLong(req.getParameter("mb_vat_17_d"));
//		System.out.println("==============================================2");
		dm.mc_vat_18 = Util.unFormatLong(req.getParameter("mc_vat_18"));
		dm.mc_amt_19 = Util.unFormatLong(req.getParameter("mc_amt_19"));
		dm.mc_vat_19 = Util.unFormatLong(req.getParameter("mc_vat_19"));
		dm.mc_vat_20 = Util.unFormatLong(req.getParameter("mc_vat_20"));
		dm.mc_vat_21 = Util.unFormatLong(req.getParameter("mc_vat_21"));
		dm.mc_vat_22 = Util.unFormatLong(req.getParameter("mc_vat_22"));
		dm.mc_vat_23 = Util.unFormatLong(req.getParameter("mc_vat_23"));
		dm.mc_vat_24 = Util.unFormatLong(req.getParameter("mc_vat_24"));
		dm.mc_vat_25 = Util.unFormatLong(req.getParameter("mc_vat_25"));
//		System.out.println("==============================================3");
		dm.md_vat_26_b = Util.unFormatLong(req.getParameter("md_vat_26_b"));
//		System.out.println("==============================================4");
		dm.me_amt_31 = Util.unFormatLong(req.getParameter("me_amt_31"));
//		System.out.println("==============================================5");
		dm.mg_amt_32 = Util.unFormatLong(req.getParameter("mg_amt_32"));
		dm.mg_vat_32 = Util.unFormatLong(req.getParameter("mg_vat_32"));
		dm.mg_amt_33 = Util.unFormatLong(req.getParameter("mg_amt_33"));
		dm.mg_vat_33 = Util.unFormatLong(req.getParameter("mg_vat_33"));
		dm.mg_amt_34 = Util.unFormatLong(req.getParameter("mg_amt_34"));
		dm.mg_amt_35 = Util.unFormatLong(req.getParameter("mg_amt_35"));
		dm.mg_amt_36 = Util.unFormatLong(req.getParameter("mg_amt_36"));
		dm.mg_vat_36 = Util.unFormatLong(req.getParameter("mg_vat_36"));
//		System.out.println("==============================================6");
		dm.mg_amt_37 = Util.unFormatLong(req.getParameter("mg_amt_37"));
		dm.mg_vat_37 = Util.unFormatLong(req.getParameter("mg_vat_37"));
		dm.mg_amt_38 = Util.unFormatLong(req.getParameter("mg_amt_38"));
		dm.mg_vat_38 = Util.unFormatLong(req.getParameter("mg_vat_38"));
		dm.mg_amt_39 = Util.unFormatLong(req.getParameter("mg_amt_39"));
		dm.mg_vat_39 = Util.unFormatLong(req.getParameter("mg_vat_39"));
//		System.out.println("==============================================7");
		dm.mh_amt_40 = Util.unFormatLong(req.getParameter("mh_amt_40"));
		dm.mh_vat_40 = Util.unFormatLong(req.getParameter("mh_vat_40"));
		dm.mh_amt_41 = Util.unFormatLong(req.getParameter("mh_amt_41"));
		dm.mh_vat_41 = Util.unFormatLong(req.getParameter("mh_vat_41"));
		dm.mh_amt_42 = Util.unFormatLong(req.getParameter("mh_amt_42"));
		dm.mh_vat_42 = Util.unFormatLong(req.getParameter("mh_vat_42"));
		dm.mh_amt_43 = Util.unFormatLong(req.getParameter("mh_amt_43"));
		dm.mh_vat_43 = Util.unFormatLong(req.getParameter("mh_vat_43"));
		dm.mh_amt_44 = Util.unFormatLong(req.getParameter("mh_amt_44"));
		dm.mh_vat_44 = Util.unFormatLong(req.getParameter("mh_vat_44"));
		dm.mh_vat_45 = Util.unFormatLong(req.getParameter("mh_vat_45"));
		dm.mh_vat_46 = Util.unFormatLong(req.getParameter("mh_vat_46"));
		dm.mh_vat_47 = Util.unFormatLong(req.getParameter("mh_vat_47"));
		dm.mh_amt_48 = Util.unFormatLong(req.getParameter("mh_amt_48"));
		dm.mh_vat_48 = Util.unFormatLong(req.getParameter("mh_vat_48"));
//		System.out.println("==============================================8");
		dm.mi_amt_49 = Util.unFormatLong(req.getParameter("mi_amt_49"));
		dm.mi_vat_49 = Util.unFormatLong(req.getParameter("mi_vat_49"));
		dm.mi_amt_50 = Util.unFormatLong(req.getParameter("mi_amt_50"));
		dm.mi_vat_50 = Util.unFormatLong(req.getParameter("mi_vat_50"));
		dm.mi_amt_51 = Util.unFormatLong(req.getParameter("mi_amt_51"));
		dm.mi_vat_51 = Util.unFormatLong(req.getParameter("mi_vat_51"));
		dm.mi_amt_52 = Util.unFormatLong(req.getParameter("mi_amt_52"));
		dm.mi_vat_52 = Util.unFormatLong(req.getParameter("mi_vat_52"));
//		System.out.println("==============================================9");
		dm.mj_vat_53 = Util.unFormatLong(req.getParameter("mj_vat_53"));
		dm.mj_vat_54 = Util.unFormatLong(req.getParameter("mj_vat_54"));
		dm.mj_vat_55 = Util.unFormatLong(req.getParameter("mj_vat_55"));
		dm.mj_vat_56 = Util.unFormatLong(req.getParameter("mj_vat_56"));
		dm.mj_vat_57 = Util.unFormatLong(req.getParameter("mj_vat_57"));
		dm.mj_vat_58 = Util.unFormatLong(req.getParameter("mj_vat_58"));
//		System.out.println("==============================================10");
		dm.mk_amt_59 = Util.unFormatLong(req.getParameter("mk_amt_59"));
		dm.mk_vat_59 = Util.unFormatLong(req.getParameter("mk_vat_59"));
		dm.mk_amt_60 = Util.unFormatLong(req.getParameter("mk_amt_60"));
		dm.mk_vat_60 = Util.unFormatLong(req.getParameter("mk_vat_60"));
		dm.mk_amt_61 = Util.unFormatLong(req.getParameter("mk_amt_61"));
		dm.mk_vat_61 = Util.unFormatLong(req.getParameter("mk_vat_61"));
		dm.mk_amt_62 = Util.unFormatLong(req.getParameter("mk_amt_62"));
		dm.mk_vat_62 = Util.unFormatLong(req.getParameter("mk_vat_62"));
		dm.mk_amt_63 = Util.unFormatLong(req.getParameter("mk_amt_63"));
		dm.mk_vat_63 = Util.unFormatLong(req.getParameter("mk_vat_63"));
		dm.mk_amt_64 = Util.unFormatLong(req.getParameter("mk_amt_64"));
		dm.mk_vat_64 = Util.unFormatLong(req.getParameter("mk_vat_64"));
		dm.mk_amt_65 = Util.unFormatLong(req.getParameter("mk_amt_65"));
		dm.mk_vat_65 = Util.unFormatLong(req.getParameter("mk_vat_65"));
		dm.mk_amt_66 = Util.unFormatLong(req.getParameter("mk_amt_66"));
		dm.mk_vat_66 = Util.unFormatLong(req.getParameter("mk_vat_66"));
		dm.mk_amt_67 = Util.unFormatLong(req.getParameter("mk_amt_67"));
		dm.mk_vat_67 = Util.unFormatLong(req.getParameter("mk_vat_67"));
		dm.mk_amt_68 = Util.unFormatLong(req.getParameter("mk_amt_68"));
		dm.mk_vat_68 = Util.unFormatLong(req.getParameter("mk_vat_68"));
		dm.mk_amt_69 = Util.unFormatLong(req.getParameter("mk_amt_69"));
		dm.mk_vat_69 = Util.unFormatLong(req.getParameter("mk_vat_69"));
		dm.mk_amt_70 = Util.unFormatLong(req.getParameter("mk_amt_70"));
		dm.mk_vat_70 = Util.unFormatLong(req.getParameter("mk_vat_70"));
		dm.mk_amt_71 = Util.unFormatLong(req.getParameter("mk_amt_71"));
		dm.mk_vat_71 = Util.unFormatLong(req.getParameter("mk_vat_71"));
		dm.mk_amt_72 = Util.unFormatLong(req.getParameter("mk_amt_72"));
		dm.mk_vat_72 = Util.unFormatLong(req.getParameter("mk_vat_72"));
		dm.mk_amt_73 = Util.unFormatLong(req.getParameter("mk_amt_73"));
		dm.mk_vat_73 = Util.unFormatLong(req.getParameter("mk_vat_73"));
		dm.mk_amt_74 = Util.unFormatLong(req.getParameter("mk_amt_74"));
		dm.mk_vat_74 = Util.unFormatLong(req.getParameter("mk_vat_74"));
		dm.mk_amt_75 = Util.unFormatLong(req.getParameter("mk_amt_75"));
		dm.mk_vat_75 = Util.unFormatLong(req.getParameter("mk_vat_75"));
		dm.mk_amt_76 = Util.unFormatLong(req.getParameter("mk_amt_76"));
		dm.mk_vat_76 = Util.unFormatLong(req.getParameter("mk_vat_76"));
//		System.out.println("==============================================11");
		dm.mk_vat_77 = Util.unFormatLong(req.getParameter("mk_vat_77"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6212_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_6218_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6218_SDataSet ds = null;
		FC_ACCT_6218_SDM dm = new FC_ACCT_6218_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6218_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	

	public void fc_acct_6219_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_6219_ADataSet ds = null;
		FC_ACCT_6219_ADM dm = new FC_ACCT_6219_ADM();
		
		dm.flag                = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers          = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd    = req.getRemoteAddr();
		dm.cmpy_cd             = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd          = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm         = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm         = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		dm.clsf_cd             = Util.checkString(req.getParameter("clsf_cd"));            //신고구분코드
		dm.md_rmk_26_e = Util.checkString(req.getParameter("md_rmk_26_e"));
		dm.md_rmk_26_f = Util.checkString(req.getParameter("md_rmk_26_f"));
		dm.md_rmk_26_g = Util.checkString(req.getParameter("md_rmk_26_g"));
		dm.md_rmk_26_h = Util.checkString(req.getParameter("md_rmk_26_h"));
		dm.md_rmk_26_i = Util.checkString(req.getParameter("md_rmk_26_i"));
		dm.md_rmk_26_j = Util.checkString(req.getParameter("md_rmk_26_j"));
		dm.me_bizcond_27 = Util.checkString(req.getParameter("me_bizcond_27"));
		dm.me_item_27 = Util.checkString(req.getParameter("me_item_27"));
		dm.me_indt_27 = Util.checkString(req.getParameter("me_indt_27"));
		dm.me_amt_27 = Util.unFormatLong(req.getParameter("me_amt_27"));
		dm.me_bizcond_28 = Util.checkString(req.getParameter("me_bizcond_28"));
		dm.me_item_28 = Util.checkString(req.getParameter("me_item_28"));
		dm.me_indt_28 = Util.checkString(req.getParameter("me_indt_28"));
		dm.me_amt_28 = Util.unFormatLong(req.getParameter("me_amt_28"));
		dm.me_bizcond_29 = Util.checkString(req.getParameter("me_bizcond_29"));
		dm.me_item_29 = Util.checkString(req.getParameter("me_item_29"));
		dm.me_indt_29 = Util.checkString(req.getParameter("me_indt_29"));
		dm.me_amt_29 = Util.unFormatLong(req.getParameter("me_amt_29"));
		dm.me_bizcond_30 = Util.checkString(req.getParameter("me_bizcond_30"));
		dm.me_item_30 = Util.checkString(req.getParameter("me_item_30"));
		dm.me_indt_30 = Util.checkString(req.getParameter("me_indt_30"));
		dm.me_amt_30 = Util.unFormatLong(req.getParameter("me_amt_30"));
		dm.me_amt_31 = Util.unFormatLong(req.getParameter("me_amt_31"));
		dm.mf_tax_agnt_nm = Util.checkString(req.getParameter("mf_tax_agnt_nm"));
		dm.mf_tax_agnt_ern = Util.checkString(req.getParameter("mf_tax_agnt_ern"));
		dm.mf_tax_agnt_tel_no = Util.checkString(req.getParameter("mf_tax_agnt_tel_no"));
		dm.ml_bizcond_78 = Util.checkString(req.getParameter("ml_bizcond_78"));
		dm.ml_item_78 = Util.checkString(req.getParameter("ml_item_78"));
		dm.ml_indt_78 = Util.checkString(req.getParameter("ml_indt_78"));
		dm.ml_amt_78 = Util.unFormatLong(req.getParameter("ml_amt_78"));
		dm.ml_bizcond_79 = Util.checkString(req.getParameter("ml_bizcond_79"));
		dm.ml_item_79 = Util.checkString(req.getParameter("ml_item_79"));
		dm.ml_indt_79 = Util.checkString(req.getParameter("ml_indt_79"));
		dm.ml_amt_79 = Util.unFormatLong(req.getParameter("ml_amt_79"));
		dm.ml_bizcond_80 = Util.checkString(req.getParameter("ml_bizcond_80"));
		dm.ml_item_80 = Util.checkString(req.getParameter("ml_item_80"));
		dm.ml_indt_80 = Util.checkString(req.getParameter("ml_indt_80"));
		dm.ml_amt_80 = Util.unFormatLong(req.getParameter("ml_amt_80"));
		dm.ml_amt_81 = Util.unFormatLong(req.getParameter("ml_amt_81"));
		dm.mm_amt_82 = Util.unFormatLong(req.getParameter("mm_amt_82"));
		dm.mm_amt_83 = Util.unFormatLong(req.getParameter("mm_amt_83"));
		dm.decl_dt = Util.checkString(req.getParameter("decl_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6219_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
		
	/* 회계관리_부가세관리_부동산임대공급가액명세서 콤보구성_최호정
	 * 2014.06.22 최호정
	 * 호출SP : SP_FC_ACCT_6220_M
	 */
	public void fc_acct_6220_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6220_m 수행 중");
		FC_ACCT_6220_MDataSet ds = null;
		FC_ACCT_6220_MDM dm = new FC_ACCT_6220_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6220_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_부동산임대공급가액명세서 검색_최호정
	 * 2014.06.22 최호정
	 * 호출SP : SP_FC_ACCT_6221_S
	 */
	public void fc_acct_6221_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6221_s 수행 중");
		FC_ACCT_6221_SDataSet ds = null;
		FC_ACCT_6221_SDM dm = new FC_ACCT_6221_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6221_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6221_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_부동산임대공급가액명세서_생성,수정,삭제_최호정
	 * 2014.06.22 최호정
	 * 호출SP : SP_FC_ACCT_6222_A
	 */
	public void fc_acct_6222_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6222_a 수행 중");
		FC_ACCT_6222_ADataSet ds = null;
		FC_ACCT_6222_ADM dm = new FC_ACCT_6222_ADM();
		System.out.println("최호정 6000wb_fc_acct_6222_a flag ===> "+Util.checkString(req.getParameter("flag")));
		
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));			
		
		String chk_cud = Util.checkString(req.getParameter("flag"));
		if(chk_cud.equals("U")){
			//multiUpdateData
			String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			String mode = (String)hash.get("m");
			System.out.println("최호정 6000wb_fc_acct_6222_a sub_flag_ary ===> "+mode);
			dm.sub_flag_ary = (mode.toUpperCase()); //그리드 행추가, 삭제, 수정 플래그
			dm.seq = (String)hash.get("seq");
			dm.flor_cnt = (String)hash.get("seq");
			dm.ser_no = (String)hash.get("seq");
			dm.cntr_size = (String)hash.get("seq");
			dm.intg_dlco_cd = (String)hash.get("seq");
			dm.dlco_clsf_cd = (String)hash.get("seq");
			dm.dlco_cd = (String)hash.get("seq");
			dm.hire_firm_nm = (String)hash.get("seq");
			dm.hire_dlco_ern = (String)hash.get("seq");
			dm.leas_fr_dt = (String)hash.get("seq");
			dm.leas_to_dt = (String)hash.get("seq");
			dm.cntr_gurt_amt = (String)hash.get("seq");
			dm.cntr_leas_amt = (String)hash.get("seq");
			dm.cntr_mang_amt = (String)hash.get("seq");
			dm.rent_impt_amt = (String)hash.get("seq");
			dm.rent_gurt_amt_int = (String)hash.get("seq");
			dm.rent_mms_rcpm_amt = (String)hash.get("seq");
			dm.mang_rcpm_amt = (String)hash.get("seq");
			dm.nwsp_dn_yn = (String)hash.get("seq");
			dm.leas_dlco_ern = (String)hash.get("seq");
			dm.dong = (String)hash.get("seq");
			dm.renw_dt = (String)hash.get("seq");
		}	
		/*형 변환
		String qunt_etc = (String)hash.get("qunt_etc");
		dm.qunt_etc = Long.parseLong(qunt_etc);
		
		String frcr_amt_etc = (String)hash.get("frcr_amt_etc");
		dm.frcr_amt_etc = Long.parseLong(frcr_amt_etc);
		
		String won_amt_etc = (String)hash.get("won_amt_etc");
		dm.won_amt_etc = Long.parseLong(won_amt_etc);
		*/
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6222_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/* 회계관리_부가세관리_영세율매출명세서의 사업장을 조회한다.
	 * 2014.06.09 최호정
	 * 호출SP : SP_FC_ACCT_6270_M
	 */
	public void fc_acct_6270_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6270_m 수행 중");
		FC_ACCT_6270_MDataSet ds = null;
		FC_ACCT_6270_MDM dm = new FC_ACCT_6270_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6270_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_영세율매출명세서 검색결과를 조회한다.
	 * 2014.06.10 최호정
	 * 호출SP : SP_FC_ACCT_6271_S
	 */
	public void fc_acct_6271_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6271_s 수행 중");
		FC_ACCT_6271_SDataSet ds = null;
		FC_ACCT_6271_SDM dm = new FC_ACCT_6271_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6271_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6271_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_영세율매출명세서_생성/수정/삭제_최호정
	 * 2014.06.10 최호정
	 * 호출SP : SP_FC_ACCT_6272_A
	 */
	public void fc_acct_6272_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6272_a 수행 중");
		FC_ACCT_6272_ADataSet ds = null;
		FC_ACCT_6272_ADM dm = new FC_ACCT_6272_ADM();
		System.out.println("최호정 6000wb_fc_acct_6272_a flag ===> "+Util.checkString(req.getParameter("flag")));
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		dm.v_secn_21_010 = Util.unFormatLong(req.getParameter("v_secn_21_010"));
		dm.v_secn_21_020 = Util.unFormatLong(req.getParameter("v_secn_21_020"));
		dm.v_secn_21_030 = Util.unFormatLong(req.getParameter("v_secn_21_030"));
		dm.v_secn_21_040 = Util.unFormatLong(req.getParameter("v_secn_21_040"));
		dm.v_secn_21_050 = Util.unFormatLong(req.getParameter("v_secn_21_050"));
		dm.v_secn_22_010 = Util.unFormatLong(req.getParameter("v_secn_22_010"));
		dm.v_secn_23_010 = Util.unFormatLong(req.getParameter("v_secn_23_010"));
		dm.v_secn_23_020 = Util.unFormatLong(req.getParameter("v_secn_23_020"));
		dm.v_secn_24_010 = Util.unFormatLong(req.getParameter("v_secn_24_010"));
		dm.v_secn_24_020 = Util.unFormatLong(req.getParameter("v_secn_24_020"));
		dm.v_secn_24_030 = Util.unFormatLong(req.getParameter("v_secn_24_030"));
		dm.v_secn_24_040 = Util.unFormatLong(req.getParameter("v_secn_24_040"));
		dm.v_secn_24_050 = Util.unFormatLong(req.getParameter("v_secn_24_050"));
		dm.v_secn_24_060 = Util.unFormatLong(req.getParameter("v_secn_24_060"));
		dm.v_secn_24_070 = Util.unFormatLong(req.getParameter("v_secn_24_070"));
		dm.v_secn_24_080 = Util.unFormatLong(req.getParameter("v_secn_24_080"));
		dm.v_secn_tot_amt = Util.unFormatLong(req.getParameter("v_secn_tot_amt"));
		dm.j_secn_105_1_1 = Util.unFormatLong(req.getParameter("j_secn_105_1_1"));
		dm.j_secn_105_1_3 = Util.unFormatLong(req.getParameter("j_secn_105_1_3"));
		dm.j_secn_105_1_32 = Util.unFormatLong(req.getParameter("j_secn_105_1_32"));
		dm.j_secn_105_1_4 = Util.unFormatLong(req.getParameter("j_secn_105_1_4"));
		dm.j_secn_105_1_5 = Util.unFormatLong(req.getParameter("j_secn_105_1_5"));
		dm.j_secn_107 = Util.unFormatLong(req.getParameter("j_secn_107"));
		dm.j_secn_121_13 = Util.unFormatLong(req.getParameter("j_secn_121_13"));
		dm.j_secn_tot_amt = Util.unFormatLong(req.getParameter("j_secn_tot_amt"));
		dm.tot_amt = Util.unFormatLong(req.getParameter("tot_amt"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6272_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/* 회계관리_부가세관리_수출실적명세서의 사업장을 조회한다_최호정
	 * 2014.06.09 최호정
	 * 호출SP : SP_FC_ACCT_6230_M
	 */
	public void fc_acct_6230_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6230_m 수행 중");
		FC_ACCT_6230_MDataSet ds = null;
		FC_ACCT_6230_MDM dm = new FC_ACCT_6230_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6230_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_수출실적명세서의  검색 결과를 조회한다.
	 * 2014.06.10 최호정
	 * 호출SP : SP_FC_ACCT_6231_S
	 */
	public void fc_acct_6231_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6231_s 수행 중");
		FC_ACCT_6231_SDataSet ds = null;
		FC_ACCT_6231_SDM dm = new FC_ACCT_6231_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6231_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6231_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_수출실적명세서_생성/수정/삭제_최호정
	 * 2014.06.16 최호정
	 * 호출SP : SP_FC_ACCT_6232_A
	 */
	public void fc_acct_6232_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6232_a 수행 중");
		FC_ACCT_6232_ADataSet ds = null;
		FC_ACCT_6232_ADM dm = new FC_ACCT_6232_ADM();

		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		dm.qunt_etc = Util.unFormatLong(req.getParameter("qunt_etc"));
		dm.frcr_amt_etc = Util.unFormatLong(req.getParameter("frcr_amt_etc"));
		dm.won_amt_etc = Util.unFormatLong(req.getParameter("won_amt_etc"));		
		
		String chk_cud = Util.checkString(req.getParameter("flag"));
		System.out.println("WB_fc_acct_6232_a flag ===> "+Util.checkString(req.getParameter("flag")));

		if(chk_cud.equals("U")){
			System.out.println("WB_fc_acct_6232_a 수정 multiUpdate");
			//multiUpdateData
			String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			String mode = (String)hash.get("m");
			System.out.println("WB_fc_acct_6232_a sub_flag_ary ===> "+mode);
			dm.sub_flag_ary = (mode.toUpperCase()); //그리드 행추가, 삭제, 수정 플래그
			dm.seq = (String)hash.get("seq");
			dm.exp_decl_no = (String)hash.get("exp_decl_no");
			dm.ship_dt = (String)hash.get("ship_dt");
			dm.frcr_clsf_cd = (String)hash.get("frcr_clsf_cd");
			dm.exrate = (String)hash.get("exrate");
			dm.frcr_amt = (String)hash.get("frcr_amt");
			dm.won_amt = (String)hash.get("won_amt");
		}
		/*형 변환
		String qunt_etc = (String)hash.get("qunt_etc");
		dm.qunt_etc = Long.parseLong(qunt_etc);
		
		String frcr_amt_etc = (String)hash.get("frcr_amt_etc");
		dm.frcr_amt_etc = Long.parseLong(frcr_amt_etc);
		
		String won_amt_etc = (String)hash.get("won_amt_etc");
		dm.won_amt_etc = Long.parseLong(won_amt_etc);
		*/
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6232_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/* 회계관리_부가세관리_건물등감가상각_콤보구성_최호정
	 * 2014.06.20 최호정
	 * 호출SP : SP_FC_ACCT_6240_M
	 */
	public void fc_acct_6240_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6240_m 수행 중");
		FC_ACCT_6240_MDataSet ds = null;
		FC_ACCT_6240_MDM dm = new FC_ACCT_6240_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6240_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_건물등감가상각_조회_최호정
	 * 2014.06.20 최호정
	 * 호출SP : SP_FC_ACCT_6241_S
	 */
	public void fc_acct_6241_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6241_s 수행 중");
		FC_ACCT_6241_SDataSet ds = null;
		FC_ACCT_6241_SDM dm = new FC_ACCT_6241_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6241_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_건물등감가상각_생성/수정/삭제_최호정
	 * 2014.06.22 최호정
	 * 호출SP : SP_FC_ACCT_6242_A
	 */
	public void fc_acct_6242_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6242_a 수행 중");
		FC_ACCT_6242_ADataSet ds = null;
		FC_ACCT_6242_ADM dm = new FC_ACCT_6242_ADM();
		System.out.println("최호정 6000wb_fc_acct_6242_a flag ===> "+Util.checkString(req.getParameter("flag")));
		
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		
		String chk_cud = Util.checkString(req.getParameter("flag"));
		if(chk_cud.equals("U")){
			//multiUpdateData
			String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			String mode = (String)hash.get("m");
			System.out.println("최호정 6000wb_fc_acct_6242_a sub_flag ===> "+mode);
			dm.sub_flag_ary = (mode.toUpperCase()); //그리드 행추가, 삭제, 수정 플래그
			dm.seq = (String)hash.get("seq");
			dm.vat_aset_clsf = (String)hash.get("vat_aset_clsf");
			dm.acqr_dt = (String)hash.get("acqr_dt");
			dm.intg_dlco_cd = (String)hash.get("intg_dlco_cd");
			dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
			dm.dlco_cd = (String)hash.get("dlco_cd");
			dm.dlco_nm = (String)hash.get("dlco_nm");
			dm.ern = (String)hash.get("ern");
			dm.item = (String)hash.get("item");
			dm.suply_amt = (String)hash.get("suply_amt");
			dm.vat_amt = (String)hash.get("vat_amt");
			dm.qunt = (String)hash.get("qunt");
		}
		/*형 변환
		String qunt_etc = (String)hash.get("qunt_etc");
		dm.qunt_etc = Long.parseLong(qunt_etc);
		
		String frcr_amt_etc = (String)hash.get("frcr_amt_etc");
		dm.frcr_amt_etc = Long.parseLong(frcr_amt_etc);
		
		String won_amt_etc = (String)hash.get("won_amt_etc");
		dm.won_amt_etc = Long.parseLong(won_amt_etc);
		*/
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6242_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/* 회계관리_부가세관리_매입세액불공제내역_최호정
	 * 2014.06.16 최호정
	 * 호출SP : SP_FC_ACCT_6250_M
	 */
	public void fc_acct_6250_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6230_m 수행 중");
		FC_ACCT_6250_MDataSet ds = null;
		FC_ACCT_6250_MDM dm = new FC_ACCT_6250_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6250_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_매입세액불공제내역  검색 결과를 조회한다.
	 * 2014.06.17 최호정
	 * 호출SP : SP_FC_ACCT_6251_S
	 */
	public void fc_acct_6251_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6251_s 수행 중");
		FC_ACCT_6251_SDataSet ds = null;
		FC_ACCT_6251_SDM dm = new FC_ACCT_6251_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6251_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6251_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_매입세액불공제내역_생성/수정/삭제_최호정
	 * 2014.06.18 최호정
	 * 호출SP : SP_FC_ACCT_6252_A
	 */
	public void fc_acct_6252_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6252_a 수행 중");
		FC_ACCT_6252_ADataSet ds = null;
		FC_ACCT_6252_ADM dm = new FC_ACCT_6252_ADM();
		System.out.println("최호정 6000wb_fc_acct_6252_a flag ===> "+Util.checkString(req.getParameter("flag")));
		
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		dm.comn_purc_suply_amt = Util.unFormatLong(req.getParameter("comn_purc_suply_amt"));
		dm.comn_purc_vat_amt = Util.unFormatLong(req.getParameter("comn_purc_vat_amt"));
		dm.suply_amt_etc = Util.unFormatLong(req.getParameter("suply_amt_etc"));
		dm.rtax_suply_amt_etc = Util.unFormatLong(req.getParameter("rtax_suply_amt_etc"));
		dm.rtax_enpr_ratio = Util.unFormatLong(req.getParameter("rtax_enpr_ratio"));
		dm.non_dduc_purc_vat_amt = Util.unFormatLong(req.getParameter("non_dduc_purc_vat_amt"));
		dm.calc_aft_suply_amt = Util.unFormatLong(req.getParameter("calc_aft_suply_amt"));
		dm.tot_comn_purc_vat_amt = Util.unFormatLong(req.getParameter("tot_comn_purc_vat_amt"));
		dm.tot_suply_amt_etc = Util.unFormatLong(req.getParameter("tot_suply_amt_etc"));
		dm.tot_rtax_suply_amt_etc = Util.unFormatLong(req.getParameter("tot_rtax_suply_amt_etc"));
		dm.rtax_enpr_fix_ratio = Util.unFormatLong(req.getParameter("rtax_enpr_fix_ratio"));
		dm.tot_non_dduc_purc_vat_amt = Util.unFormatLong(req.getParameter("tot_non_dduc_purc_vat_amt"));
		dm.pre_non_dduc_purc_vat_amt = Util.unFormatLong(req.getParameter("pre_non_dduc_purc_vat_amt"));
		dm.add_non_dduc_purc_vat_amt = Util.unFormatLong(req.getParameter("add_non_dduc_purc_vat_amt"));
		dm.tot_calc_aft_suply_amt = Util.unFormatLong(req.getParameter("tot_calc_aft_suply_amt"));
		dm.gds_purc_vat_amt = Util.unFormatLong(req.getParameter("gds_purc_vat_amt"));
		dm.ck_rate = Util.unFormatLong(req.getParameter("ck_rate"));
		dm.txn_prd_cnt = Util.unFormatLong(req.getParameter("txn_prd_cnt"));
		dm.redu_ratio_pymt_re_calc = Util.unFormatLong(req.getParameter("redu_ratio_pymt_re_calc"));
		dm.incr_redu_rtax_enpr_ratio = Util.unFormatLong(req.getParameter("incr_redu_rtax_enpr_ratio"));
		dm.adjm_add_non_dduc_purc_vat = Util.unFormatLong(req.getParameter("adjm_add_non_dduc_purc_vat"));
		dm.adjm_calc_aft_suply_amt = Util.unFormatLong(req.getParameter("adjm_calc_aft_suply_amt"));
		
		String chk_cud = Util.checkString(req.getParameter("flag"));
		if(chk_cud.equals("U")){
			System.out.println("wb_fc_acct_6252_a multiUpdateData");
			//multiUpdateData
			String multiUpdateData = Util.checkString(req.getParameter("multiUpDate1"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			String mode = (String)hash.get("m");
			System.out.println("최호정 6000wb_fc_acct_6252_a mode ===> "+mode);
			dm.non_dduc_resn_clsf = (String)hash.get("non_dduc_resn_clsf");
			dm.tax_stmt_num_shet = (String)hash.get("tax_stmt_num_shet");
			dm.suply_amt = (String)hash.get("suply_amt");
			dm.vat_amt = (String)hash.get("vat_amt");
		}
		/*형 변환
		String qunt_etc = (String)hash.get("qunt_etc");
		dm.qunt_etc = Long.parseLong(qunt_etc);
		
		String frcr_amt_etc = (String)hash.get("frcr_amt_etc");
		dm.frcr_amt_etc = Long.parseLong(frcr_amt_etc);
		
		String won_amt_etc = (String)hash.get("won_amt_etc");
		dm.won_amt_etc = Long.parseLong(won_amt_etc);
		*/
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6252_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/* 회계관리_부가세관리_신용카드수취명세서 구분 및 사업장 콤보 구성_최호정
	 * 2014.06.16 최호정
	 * 호출SP : SP_FC_ACCT_6260_M
	 */
	public void fc_acct_6260_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6230_m 수행 중");
		FC_ACCT_6260_MDataSet ds = null;
		FC_ACCT_6260_MDM dm = new FC_ACCT_6260_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6260_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_신용카드수취명세서 정보를 조회한다._최호정
	 * 2014.06.17 최호정
	 * 호출SP : SP_FC_ACCT_6261_S
	 */
	public void fc_acct_6261_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6261_s 수행 중");
		FC_ACCT_6261_SDataSet ds = null;
		FC_ACCT_6261_SDM dm = new FC_ACCT_6261_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6261_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6261_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_신용카드수취명세서_생성 수정 삭제_최호정
	 * 2014.06.23 최호정
	 * 호출SP : SP_FC_ACCT_6262_A
	 */
	public void fc_acct_6262_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6262_a 수행 중");
		FC_ACCT_6262_ADataSet ds = null;
		FC_ACCT_6262_ADM dm = new FC_ACCT_6262_ADM();
		System.out.println("최호정 6000wb_fc_acct_6262_a flag ===> "+Util.checkString(req.getParameter("flag")));
		
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm")).replaceAll("-", "");
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm")).replaceAll("-", "");
		
		String chk_cud = Util.checkString(req.getParameter("flag"));
		if(chk_cud.equals("U")){
			//multiUpdateData
			String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			
			String mode = (String)hash.get("m");
			System.out.println("최호정 6000wb_fc_acct_6262_a mode ===> "+mode);
			dm.sub_flag_ary = (mode.toUpperCase()); //그리드 행추가, 삭제, 수정 플래그
			dm.seq = (String)hash.get("seq");
			dm.acq_dt = (String)hash.get("acq_dt");
			dm.qunt = (String)hash.get("qunt");
			dm.suply_amt = (String)hash.get("suply_amt");
			dm.vat_amt = (String)hash.get("vat_amt");
			dm.intg_dlco_cd = (String)hash.get("intg_dlco_cd");
			dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
			dm.dlco_cd = (String)hash.get("dlco_cd");
			dm.dlco_nm = (String)hash.get("dlco_nm");
			dm.ern = (String)hash.get("ern");
			dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
			dm.crdt_card_nm = (String)hash.get("crdt_card_nm");
			dm.crdt_card_no = (String)hash.get("crdt_card_no");
		}

		/*형 변환
		String qunt_etc = (String)hash.get("qunt_etc");
		dm.qunt_etc = Long.parseLong(qunt_etc);
		
		String frcr_amt_etc = (String)hash.get("frcr_amt_etc");
		dm.frcr_amt_etc = Long.parseLong(frcr_amt_etc);
		
		String won_amt_etc = (String)hash.get("won_amt_etc");
		dm.won_amt_etc = Long.parseLong(won_amt_etc);
		*/
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6262_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/* 회계관리_부가세관리_전자신고_콤보구성_최호정
	 * 2014.06.20 최호정
	 * 호출SP : SP_FC_ACCT_6280_M
	 */
	public void fc_acct_6280_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6280_m 수행 중");
		FC_ACCT_6280_MDataSet ds = null;
		FC_ACCT_6280_MDM dm = new FC_ACCT_6280_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6280_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_전자신고 조회_최호정
	 * 2014.06.17 최호정
	 * 호출SP : SP_FC_ACCT_6281_S
	 */
	public void fc_acct_6281_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6281_s 수행 중");
		FC_ACCT_6281_SDataSet ds = null;
		FC_ACCT_6281_SDM dm = new FC_ACCT_6281_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.decl_unit_clsf_cd = Util.checkString(req.getParameter("decl_unit_clsf_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6281_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6281_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_전자신고 상세 조회_최호정
	 * 2014.06.17 최호정
	 * 호출SP : SP_FC_ACCT_6282_S
	 */
	public void fc_acct_6282_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6282_s 수행 중");
		FC_ACCT_6282_SDataSet ds = null;
		FC_ACCT_6282_SDM dm = new FC_ACCT_6282_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.decl_unit_clsf_cd = Util.checkString(req.getParameter("decl_unit_clsf_cd"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6282_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6282_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_전자신고 신고파일 생성_최호정
	 * 2014.06.24 최호정
	 * 호출SP : SP_FC_ACCT_6282_S
	 */
	public void fc_acct_6283_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6283_s 수행 중");
		FC_ACCT_6283_SDataSet ds = null;
		FC_ACCT_6283_SDM dm = new FC_ACCT_6283_SDM();

		//조회 후 더블클릭으로 인한 상세 데이터 파라미터가 넘어와야 함.
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.decl_unit_clsf_cd = Util.checkString(req.getParameter("decl_unit_clsf_cd"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.rpt_make_dt = Util.checkString(req.getParameter("rpt_make_dt"));
		dm.vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6283_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("최호정 6000wb_fc_acct_6283_s 익셉션 떨어진다");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
	
	/* 회계관리_부가세관리_사업장별과세표준_조회_최호정
	 * 2014.06.30 최호정
	 * 호출SP : SP_FC_ACCT_6291_S
	 */
	public void fc_acct_6291_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		System.out.println("최호정 6000wb_fc_acct_6291_s 수행 중");
		FC_ACCT_6291_SDataSet ds = null;
		FC_ACCT_6291_SDM dm = new FC_ACCT_6291_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.vat_fr_yymm = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.vat_to_yymm = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.rpt_make_dt = Util.checkString(req.getParameter("rpt_make_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_6291_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
}
