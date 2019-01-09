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

package chosun.ciis.hd.affr.wb;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.prefs.Preferences;


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
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;
/**
 *
 */

public class HD_AFFR_8000WB extends chosun.ciis.co.base.wb.BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    //public final String COL_SEPARATOR = "#";

    /**
     * 발령관련된 코드
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void hd_affr_8010(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_8010_ADataSet ds = null;
		HD_AFFR_8010_ADM dm = new HD_AFFR_8010_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
	//	dm.faml_seq = (String)hash.get("faml_seq");
		dm.hospz_med_exam_pers_flnm = (String)hash.get("hospz_med_exam_pers_flnm");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.real_ward_fee = (String)hash.get("real_ward_fee");
		dm.sply_ward_fee = (String)hash.get("sply_ward_fee");
		dm.hospz_med_exam_frdt = (String)hash.get("hospz_med_exam_frdt");
		dm.hospz_med_exam_todt = (String)hash.get("hospz_med_exam_todt");
		dm.hospz_med_exam_dds = (String)hash.get("hospz_med_exam_dds");
		dm.disea_cont = (String)hash.get("disea_cont");
		dm.hospz_med_exam_hosp_nm = (String)hash.get("hospz_med_exam_hosp_nm");
		dm.emp_clsf = (String)hash.get("emp_clsf");

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		dm.print();

		ds = (HD_AFFR_8010_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_8011(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_8011_LDataSet ds = null;
		HD_AFFR_8011_LDM dm = new HD_AFFR_8011_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt =  Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.hospz_med_exam_frdt = Util.checkString(req.getParameter("hospz_med_exam_frdt"));
		dm.hospz_med_exam_todt = Util.checkString(req.getParameter("hospz_med_exam_todt"));
		dm.sply_clsf_cd		   = Util.checkString(req.getParameter("faml_rshp_cd"));
	//	dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
	//	dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
	//	dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
	//	dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.print();

		ds = (HD_AFFR_8011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_8020(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_8020_LDataSet ds = null;
		HD_AFFR_8020_LDM dm = new HD_AFFR_8020_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_yy = Util.checkString(req.getParameter("occr_yy"));
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);	
	//	dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
	//	dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
	//	dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
	//	dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.print();

		ds = (HD_AFFR_8020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_8021(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_8021_LDataSet ds = null;
		HD_AFFR_8021_LDM dm = new HD_AFFR_8021_LDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.hospz_med_exam_frdt = (String)hash.get("hospz_med_exam_frdt");
		dm.hospz_med_exam_todt = (String)hash.get("hospz_med_exam_todt");
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setCmpy_cd(cmpy_cd);

		dm.print();

		ds = (HD_AFFR_8021_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

}
