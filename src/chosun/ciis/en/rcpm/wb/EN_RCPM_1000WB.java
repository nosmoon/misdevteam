/***************************************************************************************************
 * 파일명 : EN_RCPM_1000WB.java
 * 기능 : 입금표관리 관련 WorkBean 
 * 작성일자 : 2009.02.11
 * 작성자 : 최승구
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.en.rcpm.wb;

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
import chosun.ciis.en.rcpm.dm.*;
import chosun.ciis.en.rcpm.ds.*;
import chosun.ciis.en.rcpm.dao.*;

/**
 * 
 */

public class EN_RCPM_1000WB extends BaseWB {
    
	public void en_rcpm_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		EN_RCPM_1001_MDataSet ds = null;
		EN_RCPM_1001_MDM dm = new EN_RCPM_1001_MDM();

		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();

		EN_RCPM_1000DAO dao = new EN_RCPM_1000DAO();
		ds = dao.en_rcpm_1001_m(dm);

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/
	}
	
	public void en_rcpm_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		EN_RCPM_1002_LDataSet ds = null;
		EN_RCPM_1002_LDM dm = new EN_RCPM_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.print();

		EN_RCPM_1000DAO dao = new EN_RCPM_1000DAO();
		ds = dao.en_rcpm_1002_l(dm);
		

		req.setAttribute("ds", ds);


		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpm_shet_kind = (String)hash.get("rcpm_shet_kind");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		*******************************************************************************************/
	}

	public void en_rcpm_1003_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		EN_RCPM_1003_SDataSet ds = null;
		EN_RCPM_1003_SDM dm = new EN_RCPM_1003_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.print();

			
		EN_RCPM_1000DAO dao = new EN_RCPM_1000DAO();
		ds = dao.en_rcpm_1003_s(dm);
		
		req.setAttribute("ds", ds);


		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpm_shet_kind = (String)hash.get("rcpm_shet_kind");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		*******************************************************************************************/
	}

	public void en_rcpm_1004_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		EN_RCPM_1004_IDataSet ds = null;
		EN_RCPM_1004_IDM dm = new EN_RCPM_1004_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		//dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();

		EN_RCPM_1000DAO dao = new EN_RCPM_1000DAO();
		ds = dao.en_rcpm_1004_i(dm);
		
		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpm_shet_kind = (String)hash.get("rcpm_shet_kind");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}

	public void en_rcpm_1005_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		EN_RCPM_1005_UDataSet ds = null;
		EN_RCPM_1005_UDM dm = new EN_RCPM_1005_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.widr_resn = Util.checkString(req.getParameter("widr_resn"));
		dm.rcpm_shet_stat = Util.checkString(req.getParameter("rcpm_shet_stat"));
		dm.issu_pers_emp_no = Util.checkString(req.getParameter("issu_pers_emp_no"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();

		try {
			
			EN_RCPM_1000DAO dao = new EN_RCPM_1000DAO();
			
			ds = dao.en_rcpm_1005_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (AppException e) {
			LogManager.getInstance().log(e);
			throw e;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpm_shet_kind = (String)hash.get("rcpm_shet_kind");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.widr_resn = (String)hash.get("widr_resn");
		dm.rcpm_shet_stat = (String)hash.get("rcpm_shet_stat");
		dm.issu_pers_emp_no = (String)hash.get("issu_pers_emp_no");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}

}
