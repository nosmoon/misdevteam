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

public class HD_AFFR_2000WB extends chosun.ciis.co.base.wb.BaseWB {

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


	public void hd_affr_2010(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2010_LDataSet ds = null;
		HD_AFFR_2010_LDM dm = new HD_AFFR_2010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.sply_yymm = Util.checkString(req.getParameter("sply_yymm"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.print();

		ds = (HD_AFFR_2010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2011(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2011_LDataSet ds = null;
		HD_AFFR_2011_LDM dm = new HD_AFFR_2011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.child_flnm = Util.checkString(req.getParameter("child_flnm"));
		dm.print();

		ds = (HD_AFFR_2011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2012(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2012_ADataSet ds = null;
		HD_AFFR_2012_ADM dm = new HD_AFFR_2012_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.child_flnm = (String)hash.get("child_flnm");
		dm.child_seqo = (String)hash.get("child_seqo");
		dm.sply_amt = (String)hash.get("sply_amt");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.pay_plac_clsf = (String)hash.get("pay_plac_clsf");
		dm.ch_occr_dt = (String)hash.get("ch_occr_dt");
		dm.ch_seq = (String)hash.get("ch_seq");

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.print();

		ds = (HD_AFFR_2012_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2013_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2013_LDataSet ds = null;
		HD_AFFR_2013_LDM dm = new HD_AFFR_2013_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.sply_yymm = Util.checkString(req.getParameter("sply_yymm"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();

		ds = (HD_AFFR_2013_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2014_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2014_ADataSet ds = null;
		HD_AFFR_2014_ADM dm = new HD_AFFR_2014_ADM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.s_mode = ((String)hash1.get("m")).toUpperCase();

		dm.tmp_dr_amt = ((String)hash1.get("tmp_dr_amt"));
		dm.flnm = ((String)hash1.get("flnm"));
		dm.dept_cd = ((String)hash1.get("dept_cd"));
		dm.emp_no = ((String)hash1.get("emp_no"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));

		dm.occr_dt =  ((String)hash1.get("occr_dt"));
		dm.seq =  ((String)hash1.get("seq"));

		dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));

		dm.print();

		ds = (HD_AFFR_2014_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2015_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2015_DDataSet ds = null;
		HD_AFFR_2015_DDM dm = new HD_AFFR_2015_DDM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash1.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));

		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_2015_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2017_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2017_IDataSet ds = null;
		HD_AFFR_2017_IDM dm = new HD_AFFR_2017_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.sply_yymm = Util.checkString(req.getParameter("sply_yymm"));
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_2017_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2018_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_2018_MDataSet ds = null;
		HD_AFFR_2018_MDM dm = new HD_AFFR_2018_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_2018_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_2020(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2020_LDataSet ds = null;
		HD_AFFR_2020_LDM dm = new HD_AFFR_2020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.sply_strt_yymm_ft = Util.checkString(req.getParameter("sply_strt_yymm_ft"));
		dm.sply_strt_yymm_to = Util.checkString(req.getParameter("sply_strt_yymm_to"));
		dm.print();
		
		ds = (HD_AFFR_2020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2100_LDataSet ds = null;
		HD_AFFR_2100_LDM dm = new HD_AFFR_2100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_AFFR_2100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2110(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2110_ADataSet ds = null;
		HD_AFFR_2110_ADM dm = new HD_AFFR_2110_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_lcls_cd = (String)hash.get("emp_lcls_cd");
		dm.congr_condl_cd = (String)hash.get("congr_condl_cd");
		dm.aply_basi_dt = (String)hash.get("aply_basi_dt");
		dm.congr_condl_fee = (String)hash.get("congr_condl_fee");
		dm.art_flower = (String)hash.get("art_flower");
		dm.ofcr_congr_condl_fee = (String)hash.get("ofcr_congr_condl_fee");
		dm.ofcr_art_flower = (String)hash.get("ofcr_art_flower");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_AFFR_2110_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2120(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2120_LDataSet ds = null;
		HD_AFFR_2120_LDM dm = new HD_AFFR_2120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_lcls_cd = Util.checkString(req.getParameter("emp_lcls_cd"));
		dm.print();

		ds = (HD_AFFR_2120_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2200(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2200_LDataSet ds = null;
		HD_AFFR_2200_LDM dm = new HD_AFFR_2200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		if(dm.emp_no.equals("")){
			dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		}

		dm.print();

		ds = (HD_AFFR_2200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2210(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2210_LDataSet ds = null;
		HD_AFFR_2210_LDM dm = new HD_AFFR_2210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		ds = (HD_AFFR_2210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2211(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2211_ADataSet ds = null;
		HD_AFFR_2211_ADM dm = new HD_AFFR_2211_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.ofcr_clsf = (String)hash.get("ofcr_clsf");
		dm.pay_plac_clsf = (String)hash.get("pay_plac_clsf");
		dm.congr_condl_dt = (String)hash.get("congr_condl_dt");
		dm.congr_condl_cd = (String)hash.get("congr_condl_cd");
		dm.congr_condl_fee = (String)hash.get("congr_condl_fee");
		dm.art_flower = (String)hash.get("art_flower");
		dm.ofcr_congr_condl_fee = (String)hash.get("ofcr_congr_condl_fee");
		dm.ofcr_art_flower = (String)hash.get("ofcr_art_flower");
		dm.remk = (String)hash.get("remk");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.genl_affrs_clsf = Util.checkString(req.getParameter("genl_affrs_clsf"));
		dm.print();

		ds = (HD_AFFR_2211_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2212_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2212_LDataSet ds = null;
		HD_AFFR_2212_LDM dm = new HD_AFFR_2212_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.congr_condl_dt = Util.checkString(req.getParameter("congr_condl_dt"));

		dm.print();

		ds = (HD_AFFR_2212_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2220(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2220_LDataSet ds = null;
		HD_AFFR_2220_LDM dm = new HD_AFFR_2220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);	

		ds = (HD_AFFR_2220_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2310(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2310_LDataSet ds = null;
		HD_AFFR_2310_LDM dm = new HD_AFFR_2310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt_ft = Util.checkString(req.getParameter("occr_dt_ft"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.congr_condl_dt_ft = Util.checkString(req.getParameter("congr_condl_dt_ft"));
		dm.congr_condl_dt_to = Util.checkString(req.getParameter("congr_condl_dt_to"));
		dm.congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);	
		dm.print();

		ds = (HD_AFFR_2310_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2312(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2312_LDataSet ds = null;
		HD_AFFR_2312_LDM dm = new HD_AFFR_2312_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_2312_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2313(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2313_LDataSet ds = null;
		HD_AFFR_2313_LDM dm = new HD_AFFR_2313_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_2313_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2314(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2314_ADataSet ds = null;
		HD_AFFR_2314_ADM dm = new HD_AFFR_2314_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData);
		System.out.println("multiUpdateData1 == " + multiUpdateData);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		String mode 				  =	((String)hash1.get("m")).toUpperCase();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());

		String emp_no              	  = ((String)hash1.get("emp_no"));
		String occr_dt                = ((String)hash1.get("occr_dt"));
		String seq                    = ((String)hash1.get("seq"));
		String flnm                   = ((String)hash1.get("flnm"));
		String dept_cd                = ((String)hash1.get("dept_cd"));
		String dty_cd                 = ((String)hash1.get("dty_cd"));
		String posi_cd                = ((String)hash1.get("posi_cd"));
		String ofcr_clsf              = ((String)hash1.get("ofcr_clsf"));
		String congr_condl_dt         = ((String)hash1.get("congr_condl_dt"));
		String congr_condl_cd         = ((String)hash1.get("congr_condl_cd"));
		String congr_condl_fee        = ((String)hash1.get("congr_condl_fee"));
		String art_flower             = ((String)hash1.get("art_flower"));
		String ofcr_congr_condl_fee   = ((String)hash1.get("ofcr_congr_condl_fee"));
		String ofcr_art_flower        = ((String)hash1.get("ofcr_art_flower"));
		String remk                   = ((String)hash1.get("remk"));
		String slip_proc_mang_dt      = ((String)hash1.get("slip_proc_mang_dt"));
		String slip_proc_mang_seq     = ((String)hash1.get("slip_proc_mang_seq"));
		String pay_plac_clsf		  = ((String)hash1.get("pay_plac_clsf"));

		dm.setEmp_no(emp_no);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setFlnm(flnm);
		dm.setDept_cd(dept_cd);
		dm.setDty_cd(dty_cd);
		dm.setPosi_cd(posi_cd);
		dm.setOfcr_clsf(ofcr_clsf);
		dm.setCongr_condl_dt(congr_condl_dt);
		dm.setCongr_condl_cd(congr_condl_cd);
		dm.setCongr_condl_fee(congr_condl_fee);
		dm.setArt_flower(art_flower);
		dm.setOfcr_congr_condl_fee(ofcr_congr_condl_fee);
		dm.setOfcr_art_flower(ofcr_art_flower);
		dm.setRemk(remk);
		dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
		dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
		dm.setPay_plac_clsf(pay_plac_clsf);
		dm.print();

		ds = (HD_AFFR_2314_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2315_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2315_LDataSet ds = null;
		HD_AFFR_2315_LDM dm = new HD_AFFR_2315_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt_ft = Util.checkString(req.getParameter("occr_dt_ft"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.congr_condl_dt_ft = Util.checkString(req.getParameter("congr_condl_dt_ft"));
		dm.congr_condl_dt_to = Util.checkString(req.getParameter("congr_condl_dt_to"));
		dm.congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();

		ds = (HD_AFFR_2315_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2316_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2316_ADataSet ds = null;
		HD_AFFR_2316_ADM dm = new HD_AFFR_2316_ADM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = ((String)hash1.get("tmp_dr_amt"));
		dm.flnm =  ((String)hash1.get("flnm"));
		dm.dept_cd =  ((String)hash1.get("dept_cd"));
		dm.emp_no = ((String)hash1.get("emp_no"));
		dm.titl2 =  ((String)hash1.get("titl2"));
		dm.cmpy_welf_fund_clsf =  ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_proc_mang_dt =  ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq =  ((String)hash1.get("slip_proc_mang_seq"));

		dm.occr_dt =  ((String)hash1.get("occr_dt"));
		dm.seq =  ((String)hash1.get("seq"));
		
		dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));


		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_AFFR_2316_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2317_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2317_DDataSet ds = null;
		HD_AFFR_2317_DDM dm = new HD_AFFR_2317_DDM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash1.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));

		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_2317_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2319_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_2319_MDataSet ds = null;
		HD_AFFR_2319_MDM dm = new HD_AFFR_2319_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_2319_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2320(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2320_LDataSet ds = null;
		HD_AFFR_2320_LDM dm = new HD_AFFR_2320_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.congr_condl_dt_ft = Util.checkString(req.getParameter("congr_condl_dt_ft"));
		dm.congr_condl_dt_to = Util.checkString(req.getParameter("congr_condl_dt_to"));
		dm.congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));

		ds = (HD_AFFR_2320_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2321(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2321_LDataSet ds = null;
		HD_AFFR_2321_LDM dm = new HD_AFFR_2321_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		ds = (HD_AFFR_2321_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

	}

	public void hd_affr_2322(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2322_LDataSet ds = null;
		HD_AFFR_2322_LDM dm = new HD_AFFR_2322_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		ds = (HD_AFFR_2322_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2323(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2323_LDataSet ds = null;
		HD_AFFR_2323_LDM dm = new HD_AFFR_2323_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_2323_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2400(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2400_LDataSet ds = null;
		HD_AFFR_2400_LDM dm = new HD_AFFR_2400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
		dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.chk_dt = Util.checkString(req.getParameter("chk_dt"));
		dm.chk_obj_pers_rshp = Util.checkString(req.getParameter("chk_obj_pers_rshp"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_2400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_24000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_24000_MDataSet ds = null;
		HD_AFFR_24000_MDM dm = new HD_AFFR_24000_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_24000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2401(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2401_LDataSet ds = null;
		HD_AFFR_2401_LDM dm = new HD_AFFR_2401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (HD_AFFR_2401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2402(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2402_LDataSet ds = null;
		HD_AFFR_2402_LDM dm = new HD_AFFR_2402_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_2402_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2403(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2403_ADataSet ds = null;
		HD_AFFR_2403_ADM dm = new HD_AFFR_2403_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.chk_dt = (String)hash.get("chk_dt");
		dm.prn = (String)hash.get("prn");
		dm.chk_obj_pers_rshp = (String)hash.get("chk_obj_pers_rshp");
		dm.chk_pers_nm = (String)hash.get("chk_pers_nm");
		dm.chk_hosp_nm = (String)hash.get("chk_hosp_nm");
		dm.real_chk_fee = (String)hash.get("real_chk_fee");
		dm.sply_chk_fee = (String)hash.get("sply_chk_fee");
		dm.ocom_subm_yn = (String)hash.get("ocom_subm_yn");
		dm.remk = (String)hash.get("remk");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.pay_plac_clsf = (String)hash.get("pay_plac_clsf");
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		dm.print();

		ds = (HD_AFFR_2403_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2404(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2404_LDataSet ds = null;
		HD_AFFR_2404_LDM dm = new HD_AFFR_2404_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_2404_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2405(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2405_LDataSet ds = null;
		HD_AFFR_2405_LDM dm = new HD_AFFR_2405_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chk_dt = Util.checkString(req.getParameter("srch_chk_dt"));
		dm.faml_prn = Util.checkString(req.getParameter("faml_prn"));

		dm.print();

		ds = (HD_AFFR_2405_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2406_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2406_LDataSet ds = null;
		HD_AFFR_2406_LDM dm = new HD_AFFR_2406_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
		dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.chk_dt = Util.checkString(req.getParameter("chk_dt"));
		dm.chk_obj_pers_rshp = Util.checkString(req.getParameter("chk_obj_pers_rshp"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();

		ds = (HD_AFFR_2406_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2407_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2407_ADataSet ds = null;
		HD_AFFR_2407_ADM dm = new HD_AFFR_2407_ADM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = ((String)hash1.get("tmp_dr_amt"));
		dm.flnm =  ((String)hash1.get("flnm"));
		dm.dept_cd =  ((String)hash1.get("dept_cd"));
		dm.emp_no =  ((String)hash1.get("emp_no"));
		dm.titl2 =  ((String)hash1.get("titl2"));
		dm.cmpy_welf_fund_clsf =  ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_proc_mang_dt =  ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq =  ((String)hash1.get("slip_proc_mang_seq"));

		dm.occr_dt =  ((String)hash1.get("occr_dt"));
		dm.seq =  ((String)hash1.get("seq"));

		dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));


		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_AFFR_2407_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}



	public void hd_affr_2408_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2408_DDataSet ds = null;
		HD_AFFR_2408_DDM dm = new HD_AFFR_2408_DDM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash1.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		dm.cmpy_welf_fund_clsf =  ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));

		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_2408_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2411_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2411_ADataSet ds = null;
		HD_AFFR_2411_ADM dm = new HD_AFFR_2411_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.chk_hosp_nm  = (String)hash.get("chk_hosp_nm");
		dm.real_chk_fee = (String)hash.get("real_chk_fee");
		dm.sply_chk_fee = (String)hash.get("sply_chk_fee");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.pay_plac_clsf = (String)hash.get("pay_plac_clsf");
		dm.chk_pers_nm = (String)hash.get("hospz_med_exam_pers_flnm");
		dm.chk_obj_pers_rshp = (String)hash.get("faml_rshp_cd");
		dm.prn = (String)hash.get("faml_prn");
		dm.chk_dt = (String)hash.get("chk_dt");
		dm.remk = (String)hash.get("remk");

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.print();

		ds = (HD_AFFR_2411_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2412(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2412_LDataSet ds = null;
		HD_AFFR_2412_LDM dm = new HD_AFFR_2412_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_yy = Util.checkString(req.getParameter("search_year"));
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);	

		dm.print();

		ds = (HD_AFFR_2412_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error."+ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2413(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2413_MDataSet ds = null;
		HD_AFFR_2413_MDM dm = new HD_AFFR_2413_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_AFFR_2413_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_2414(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2414_MDataSet ds = null;
		HD_AFFR_2414_MDM dm = new HD_AFFR_2414_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_AFFR_2414_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_2500(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2500_LDataSet ds = null;
		HD_AFFR_2500_LDM dm = new HD_AFFR_2500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chk_yy = Util.checkString(req.getParameter("chk_yy"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));

		dm.print();

		ds = (HD_AFFR_2500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2501(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2501_LDataSet ds = null;
		HD_AFFR_2501_LDM dm = new HD_AFFR_2501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_2501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2502(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2502_LDataSet ds = null;
		HD_AFFR_2502_LDM dm = new HD_AFFR_2502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_2502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2503(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2503_ADataSet ds = null;
		HD_AFFR_2503_ADM dm = new HD_AFFR_2503_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.chk_dt = (String)hash.get("chk_dt");
		dm.chk_hosp_nm = (String)hash.get("chk_hosp_nm");
		dm.kidny = (String)hash.get("kidny");
		dm.wgt = (String)hash.get("wgt");
		dm.std_wgt = (String)hash.get("std_wgt");
		dm.fatt_prov = (String)hash.get("fatt_prov");
		dm.blod_pres_high = (String)hash.get("blod_pres_high");
		dm.blod_pres_low = (String)hash.get("blod_pres_low");
		dm.puls = (String)hash.get("puls");
		dm.nkd_sght_lft = (String)hash.get("nkd_sght_lft");
		dm.nkd_sght_rht = (String)hash.get("nkd_sght_rht");
		dm.rvis_sght_lft = (String)hash.get("rvis_sght_lft");
		dm.rvis_sght_rht = (String)hash.get("rvis_sght_rht");
		dm.spc_idea = (String)hash.get("spc_idea");
		dm.cmpt_idea_ill_nm_cd_1 = (String)hash.get("cmpt_idea_ill_nm_cd_1");
		dm.cmpt_idea_remk_1 = (String)hash.get("cmpt_idea_remk_1");
		dm.cmpt_idea_ill_nm_cd_2 = (String)hash.get("cmpt_idea_ill_nm_cd_2");
		dm.cmpt_idea_remk_2 = (String)hash.get("cmpt_idea_remk_2");
		dm.cmpt_idea_ill_nm_cd_3 = (String)hash.get("cmpt_idea_ill_nm_cd_3");
		dm.cmpt_idea_remk_3 = (String)hash.get("cmpt_idea_remk_3");
		dm.cmpt_idea_ill_nm_cd_4 = (String)hash.get("cmpt_idea_ill_nm_cd_4");
		dm.cmpt_idea_remk_4 = (String)hash.get("cmpt_idea_remk_4");
		dm.cmpt_idea_ill_nm_cd_5 = (String)hash.get("cmpt_idea_ill_nm_cd_5");
		dm.cmpt_idea_remk_5 = (String)hash.get("cmpt_idea_remk_5");
		dm.blod_sug	= (String)hash.get("blod_sug");
		dm.a_blod_hep = (String)hash.get("a_blod_hep");
		dm.b_blod_hep = (String)hash.get("b_blod_hep");
		dm.adv_cont	= (String)hash.get("adv_cont");
		dm.prn = (String)hash.get("prn");
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.print();


		ds = (HD_AFFR_2503_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2600(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2600_LDataSet ds = null;
		HD_AFFR_2600_LDM dm = new HD_AFFR_2600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chk_yy = Util.checkString(req.getParameter("chk_yy"));
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.faml_prn = Util.checkString(req.getParameter("faml_prn"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));

		dm.print();

		ds = (HD_AFFR_2600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2700(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2700_LDataSet ds = null;
		HD_AFFR_2700_LDM dm = new HD_AFFR_2700_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
		dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);	
		dm.print();

		ds = (HD_AFFR_2700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2701(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2701_LDataSet ds = null;
		HD_AFFR_2701_LDM dm = new HD_AFFR_2701_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("grid_emp_no"));
		dm.flnm = Util.checkString(req.getParameter("grid_flnm"));

		dm.print();

		ds = (HD_AFFR_2701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2702(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2702_LDataSet ds = null;
		HD_AFFR_2702_LDM dm = new HD_AFFR_2702_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("grid_emp_no"));
		dm.hospz_med_exam_pers_flnm = Util.checkString(req.getParameter("hospz_med_exam_pers_flnm"));

		dm.print();

		ds = (HD_AFFR_2702_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2703(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2703_ADataSet ds = null;
		HD_AFFR_2703_ADM dm = new HD_AFFR_2703_ADM();

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
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.hospz_med_exam_pers_flnm = (String)hash.get("hospz_med_exam_pers_flnm");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.real_ward_fee = (String)hash.get("real_ward_fee");
		dm.sply_ward_fee = (String)hash.get("sply_ward_fee");
		dm.real_hospz_med_exam_fee = (String)hash.get("real_hospz_med_exam_fee");
		dm.sply_hospz_med_exam_fee = (String)hash.get("sply_hospz_med_exam_fee");
		dm.hospz_med_exam_frdt = (String)hash.get("hospz_med_exam_frdt");
		dm.hospz_med_exam_todt = (String)hash.get("hospz_med_exam_todt");
		dm.hospz_med_exam_dds = (String)hash.get("hospz_med_exam_dds");
		dm.disea_cont = (String)hash.get("disea_cont");
		dm.hospz_med_exam_hosp_nm = (String)hash.get("hospz_med_exam_hosp_nm");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.emp_clsf = (String)hash.get("pay_plac_clsf");

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		dm.print();

		ds = (HD_AFFR_2703_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2704(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2704_LDataSet ds = null;
		HD_AFFR_2704_LDM dm = new HD_AFFR_2704_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.hospz_med_exam_todt = Util.checkString(req.getParameter("hospz_med_exam_todt"));
		dm.faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));

		dm.print();

		ds = (HD_AFFR_2704_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2705_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2705_ADataSet ds = null;
		HD_AFFR_2705_ADM dm = new HD_AFFR_2705_ADM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.s_mode = ((String)hash1.get("m")).toUpperCase();

		dm.tmp_dr_amt = ((String)hash1.get("tmp_dr_amt"));
		dm.flnm = ((String)hash1.get("flnm"));
		dm.dept_cd = ((String)hash1.get("dept_cd"));
		dm.emp_no =  ((String)hash1.get("emp_no"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));

		dm.occr_dt =  ((String)hash1.get("occr_dt"));
		dm.seq =  ((String)hash1.get("seq"));

		dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));

		dm.print();

		ds = (HD_AFFR_2705_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2706_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2706_DDataSet ds = null;
		HD_AFFR_2706_DDM dm = new HD_AFFR_2706_DDM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash1.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));

		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_2706_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2708_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2708_LDataSet ds = null;
		HD_AFFR_2708_LDM dm = new HD_AFFR_2708_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.hospz_med_exam_todt = Util.checkString(req.getParameter("hospz_med_exam_todt"));
		dm.sply_clsf_cd = Util.checkString(req.getParameter("sply_clsf_cd"));

		dm.print();

		ds = (HD_AFFR_2708_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2709_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_2709_MDataSet ds = null;
		HD_AFFR_2709_MDM dm = new HD_AFFR_2709_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_2709_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2800(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2800_LDataSet ds = null;
		HD_AFFR_2800_LDM dm = new HD_AFFR_2800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        if(dm.emp_no.equals("")){
            dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		}
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_2800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2801(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2801_IDataSet ds = null;
		HD_AFFR_2801_IDM dm = new HD_AFFR_2801_IDM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ipadd  = req.getRemoteAddr();

        String mode = (String)hash.get("m");

        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.flnm = (String)hash.get("flnm");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.dty_cd = (String)hash.get("dty_cd");
        dm.posi_cd = (String)hash.get("posi_cd");
        dm.qunt_side_clam_qunt = (String)hash.get("qunt_side_clam_qunt");
        dm.dn_side_clam_qunt = (String)hash.get("dn_side_clam_qunt");
        //dm.aplc_flnm = (String)hash.get("aplc_flnm");
        //dm.aplc_engl_flnm = (String)hash.get("aplc_engl_flnm");
        //dm.aplc_dty_nm = (String)hash.get("aplc_dty_nm");
        dm.nm_engl = (String)hash.get("nm_engl");
        dm.dty_nm = (String)hash.get("dty_nm");
        dm.aplc_offi_nm = (String)hash.get("aplc_offi_nm");
        //dm.aplc_dept_nm = (String)hash.get("aplc_dept_nm");
        dm.dept_nm = (String)hash.get("dept_nm");
        dm.tel_no = (String)hash.get("tel_no");
        dm.fax_no = (String)hash.get("fax_no");
        dm.ptph_no = (String)hash.get("ptph_no");
        dm.email_id = (String)hash.get("email_id");
        dm.zip_1 = (String)hash.get("zip_1");
        dm.zip_2 = (String)hash.get("zip_2");
        dm.addr = (String)hash.get("addr");
        dm.dtls_addr = (String)hash.get("dtls_addr");
        dm.remk = (String)hash.get("remk");
        dm.aplc_cnfm_yn = (String)hash.get("aplc_cnfm_yn");
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setSs_emp_no(ss_emp_no);
        dm.setCmpy_cd(cmpy_cd);

		dm.print();

		ds = (HD_AFFR_2801_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_2802_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_2802_MDataSet ds = null;
		HD_AFFR_2802_MDM dm = new HD_AFFR_2802_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_2802_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_2900(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2900_LDataSet ds = null;
		HD_AFFR_2900_LDM dm = new HD_AFFR_2900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
		dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
		dm.aplc_cnfm_yn = Util.checkString(req.getParameter("aplc_cnfm_yn"));

		dm.print();

		ds = (HD_AFFR_2900_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2901(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2901_LDataSet ds = null;
		HD_AFFR_2901_LDM dm = new HD_AFFR_2901_LDM();
		String chkEmp,chkFlnm;

		chkEmp = Util.checkString(req.getParameter("emp_no"));
		chkFlnm = Util.checkString(req.getParameter("flnm"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("grid_emp_no"));
		dm.flnm = Util.checkString(req.getParameter("grid_flnm"));
		dm.print();

		ds = (HD_AFFR_2901_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2902(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_2902_ADataSet ds = null;
		HD_AFFR_2902_ADM dm = new HD_AFFR_2902_ADM();

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();

        dm.setCmpy_cd(cmpy_cd);
		dm.setSs_emp_no(ss_emp_no);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);

        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        System.out.println("multiUpdateData : " + multiUpdateData);
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        dm.mode = (String)hash.get("m");
        dm.emp_no = (String)hash.get("emp_no");
        dm.flnm = (String)hash.get("flnm");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.dty_cd = (String)hash.get("dty_cd");
        dm.posi_cd = (String)hash.get("posi_cd");
        dm.qunt_side_clam_qunt = (String)hash.get("qunt_side_clam_qunt");
        dm.dn_side_clam_qunt = (String)hash.get("dn_side_clam_qunt");
        dm.aplc_flnm = (String)hash.get("aplc_flnm");
        dm.aplc_engl_flnm = (String)hash.get("aplc_engl_flnm");
        dm.aplc_dty_nm = (String)hash.get("aplc_dty_nm");
        dm.aplc_offi_nm = (String)hash.get("aplc_offi_nm");
        dm.aplc_dept_nm = (String)hash.get("aplc_dept_nm");
        dm.tel_no = (String)hash.get("tel_no");
        dm.fax_no = (String)hash.get("fax_no");
        dm.ceph_no = (String)hash.get("ceph_no");
        dm.email = (String)hash.get("email");
        dm.zip_1 = (String)hash.get("zip_1");
        dm.zip_2 = (String)hash.get("zip_2");
        dm.addr = (String)hash.get("addr");
        dm.dtls_addr = (String)hash.get("dtls_addr");
        dm.remk = (String)hash.get("remk");
        dm.aplc_cnfm_yn = (String)hash.get("aplc_cnfm_yn");
        dm.seq = (String)hash.get("seq");
        dm.occr_dt = (String)hash.get("occr_dt");

        dm.print();

		ds = (HD_AFFR_2902_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_2903_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_2903_MDataSet ds = null;
		HD_AFFR_2903_MDM dm = new HD_AFFR_2903_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_2903_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
}
