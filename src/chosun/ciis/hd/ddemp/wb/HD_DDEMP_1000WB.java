/***************************************************************************************************
* 파일명 : HD_DWNWRK_1000WB
* 기능 : 조출근무관리
* 작성일자 : 2009.04.23
* 작성자 : 강영슬
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.ddemp.wb;

import java.rmi.RemoteException;
import java.util.*;


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
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */
 
public class HD_DDEMP_1000WB extends BaseWB {
 
	public void hd_ddemp_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_DDEMP_1000_LDataSet ds = null;
		HD_DDEMP_1000_LDM dm = new HD_DDEMP_1000_LDM();
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));

		dm.print();

		ds = (HD_DDEMP_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1001_LDataSet ds = null;
		HD_DDEMP_1001_LDM dm = new HD_DDEMP_1001_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_DDEMP_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_ddemp_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1002_LDataSet ds = null;
		HD_DDEMP_1002_LDM dm = new HD_DDEMP_1002_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_yymm = Util.checkString(req.getParameter("s_duty_yymm"));
		dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.gubun = Util.checkString(req.getParameter("gubun"));

		dm.print();

		ds = (HD_DDEMP_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_ddemp_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1003_ADataSet ds = null;
		HD_DDEMP_1003_ADM dm = new HD_DDEMP_1003_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.mang_no = (String)hash.get("mang_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.duty_yymm = (String)hash.get("duty_yymm");
		dm.prn = (String)hash.get("prn");
		dm.emp_insr_dduc_yn = (String)hash.get("emp_insr_dduc_yn");
		dm.studt_wk_yn = (String)hash.get("studt_wk_yn");
		dm.duty_dds = (String)hash.get("duty_dds");
		dm.avg_duty_tm = (String)hash.get("avg_duty_tm");
		dm.ptph_no = (String)hash.get("ptph_no");
		dm.octgr_cd = (String)hash.get("octgr_cd");
		dm.lve_job_resn_cd = (String)hash.get("lve_job_resn_cd");
		dm.clos_yn = (String)hash.get("clos_yn");
		dm.clos_dt = (String)hash.get("clos_dt");
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.emp_insr_fee = (String)hash.get("emp_insr_fee");
		dm.hlth_insr_fee = (String)hash.get("hlth_insr_fee");
		dm.np_fee = (String)hash.get("np_fee");
		dm.dd_amt = (String)hash.get("dd_amt");
		dm.time_amt = (String)hash.get("time_amt");
		dm.incm_tax = (String)hash.get("incm_tax");
		dm.res_tax = (String)hash.get("res_tax");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.rcpt_clsf = (String)hash.get("rcpt_clsf");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.all_insr_dduc_yn = (String)hash.get("all_insr_dduc_yn");
		dm.hlth_insr_med_care_insr_fee = (String)hash.get("hlth_insr_med_care_insr_fee");
		dm.cntr_amt = (String)hash.get("cntr_amt");
		dm.day01 = (String)hash.get("day01");
		dm.day02 = (String)hash.get("day02");
		dm.day03 = (String)hash.get("day03");
		dm.day04 = (String)hash.get("day04");
		dm.day05 = (String)hash.get("day05");
		dm.day06 = (String)hash.get("day06");
		dm.day07 = (String)hash.get("day07");
		dm.day08 = (String)hash.get("day08");
		dm.day09 = (String)hash.get("day09");
		dm.day10 = (String)hash.get("day10");
		dm.day11 = (String)hash.get("day11");
		dm.day12 = (String)hash.get("day12");
		dm.day13 = (String)hash.get("day13");
		dm.day14 = (String)hash.get("day14");
		dm.day15 = (String)hash.get("day15");
		dm.day16 = (String)hash.get("day16");
		dm.day17 = (String)hash.get("day17");
		dm.day18 = (String)hash.get("day18");
		dm.day19 = (String)hash.get("day19");
		dm.day20 = (String)hash.get("day20");
		dm.day21 = (String)hash.get("day21");
		dm.day22 = (String)hash.get("day22");
		dm.day23 = (String)hash.get("day23");
		dm.day24 = (String)hash.get("day24");
		dm.day25 = (String)hash.get("day25");
		dm.day26 = (String)hash.get("day26");
		dm.day27 = (String)hash.get("day27");
		dm.day28 = (String)hash.get("day28");
		dm.day29 = (String)hash.get("day29");
		dm.day30 = (String)hash.get("day30");
		dm.day31 = (String)hash.get("day31");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.s_duty_yymm = Util.checkString(req.getParameter("s_duty_yymm"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_DDEMP_1003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_ddemp_1005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1005_ADataSet ds = null;
		HD_DDEMP_1005_ADM dm = new HD_DDEMP_1005_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_yymm = Util.checkString(req.getParameter("s_duty_yymm"));
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");

		dm.mang_no = (String)hash.get("mang_no");
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DDEMP_1005_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	
	public void hd_ddemp_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1011_LDataSet ds = null;
		HD_DDEMP_1011_LDM dm = new HD_DDEMP_1011_LDM();

		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));

		dm.print();

		ds = (HD_DDEMP_1011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1012_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1012_LDataSet ds = null;
		HD_DDEMP_1012_LDM dm = new HD_DDEMP_1012_LDM();
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));

		dm.print();

		ds = (HD_DDEMP_1012_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_ddemp_1006_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1006_DDataSet ds = null;
		HD_DDEMP_1006_DDM dm = new HD_DDEMP_1006_DDM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_yymm = Util.checkString(req.getParameter("s_duty_yymm"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));		
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DDEMP_1006_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	
	public void hd_ddemp_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1103_ADataSet ds = null;
		HD_DDEMP_1103_ADM dm = new HD_DDEMP_1103_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.mang_no = (String)hash.get("mang_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.duty_yymm = (String)hash.get("duty_yymm");
		dm.prn = (String)hash.get("prn");
		dm.emp_insr_dduc_yn = (String)hash.get("emp_insr_dduc_yn");
		dm.studt_wk_yn = (String)hash.get("studt_wk_yn");
		dm.duty_dds = (String)hash.get("duty_dds");
		dm.avg_duty_tm = (String)hash.get("avg_duty_tm");
		dm.ptph_no = (String)hash.get("ptph_no");
		dm.octgr_cd = (String)hash.get("octgr_cd");
		dm.lve_job_resn_cd = (String)hash.get("lve_job_resn_cd");
		dm.clos_yn = (String)hash.get("clos_yn");
		dm.clos_dt = (String)hash.get("clos_dt");
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.emp_insr_fee = (String)hash.get("emp_insr_fee");
		dm.hlth_insr_fee = (String)hash.get("hlth_insr_fee");
		dm.np_fee = (String)hash.get("np_fee");
		dm.dd_amt = (String)hash.get("dd_amt");
		dm.time_amt = (String)hash.get("time_amt");
		dm.incm_tax = (String)hash.get("incm_tax");
		dm.res_tax = (String)hash.get("res_tax");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.rcpt_clsf = (String)hash.get("rcpt_clsf");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.all_insr_dduc_yn = (String)hash.get("all_insr_dduc_yn");
		dm.hlth_insr_med_care_insr_fee = (String)hash.get("hlth_insr_med_care_insr_fee");
		dm.cntr_amt = (String)hash.get("cntr_amt");
		dm.day01 = (String)hash.get("day01");
		dm.day02 = (String)hash.get("day02");
		dm.day03 = (String)hash.get("day03");
		dm.day04 = (String)hash.get("day04");
		dm.day05 = (String)hash.get("day05");
		dm.day06 = (String)hash.get("day06");
		dm.day07 = (String)hash.get("day07");
		dm.day08 = (String)hash.get("day08");
		dm.day09 = (String)hash.get("day09");
		dm.day10 = (String)hash.get("day10");
		dm.day11 = (String)hash.get("day11");
		dm.day12 = (String)hash.get("day12");
		dm.day13 = (String)hash.get("day13");
		dm.day14 = (String)hash.get("day14");
		dm.day15 = (String)hash.get("day15");
		dm.day16 = (String)hash.get("day16");
		dm.day17 = (String)hash.get("day17");
		dm.day18 = (String)hash.get("day18");
		dm.day19 = (String)hash.get("day19");
		dm.day20 = (String)hash.get("day20");
		dm.day21 = (String)hash.get("day21");
		dm.day22 = (String)hash.get("day22");
		dm.day23 = (String)hash.get("day23");
		dm.day24 = (String)hash.get("day24");
		dm.day25 = (String)hash.get("day25");
		dm.day26 = (String)hash.get("day26");
		dm.day27 = (String)hash.get("day27");
		dm.day28 = (String)hash.get("day28");
		dm.day29 = (String)hash.get("day29");
		dm.day30 = (String)hash.get("day30");
		dm.day31 = (String)hash.get("day31");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.s_duty_yymm = Util.checkString(req.getParameter("s_duty_yymm"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_DDEMP_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1104_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1104_ADataSet ds = null;
		HD_DDEMP_1104_ADM dm = new HD_DDEMP_1104_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.canc_mode = Util.checkString(req.getParameter("mode"));
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.mang_no = (String)hash.get("mang_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.u_ipadd = req.getRemoteAddr();
        dm.u_id = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();

		ds = (HD_DDEMP_1104_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1105_LDataSet ds = null;
		HD_DDEMP_1105_LDM dm = new HD_DDEMP_1105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pay_amt = Util.checkString(req.getParameter("pay_amt"));
		dm.cntr_amt = Util.checkString(req.getParameter("cntr_amt"));

		dm.print();

		ds = (HD_DDEMP_1105_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1107_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1107_MDataSet ds = null;
		HD_DDEMP_1107_MDM dm = new HD_DDEMP_1107_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_DDEMP_1107_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1007_LDataSet ds = null;
		HD_DDEMP_1007_LDM dm = new HD_DDEMP_1007_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		ds = (HD_DDEMP_1007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1009_LDataSet ds = null;
		HD_DDEMP_1009_LDM dm = new HD_DDEMP_1009_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_DDEMP_1009_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_1010_LDataSet ds = null;
		HD_DDEMP_1010_LDM dm = new HD_DDEMP_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		ds = (HD_DDEMP_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_3000_LDataSet ds = null;
		HD_DDEMP_3000_LDM dm = new HD_DDEMP_3000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_yymm = Util.checkString(req.getParameter("duty_yymm"));
		dm.issu_clsf = Util.checkString(req.getParameter("issu_clsf"));

		dm.print();

		ds = (HD_DDEMP_3000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_ddemp_3001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DDEMP_3001_ADataSet ds = null;
		HD_DDEMP_3001_ADM dm = new HD_DDEMP_3001_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_yymm = Util.checkString(req.getParameter("duty_yymm"));
		dm.issu_clsf = Util.checkString(req.getParameter("issu_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DDEMP_3001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_4000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DDEMP_4000_LDataSet ds = null;
		HD_DDEMP_4000_LDM dm = new HD_DDEMP_4000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_yymm = Util.checkString(req.getParameter("duty_yymm"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.prn = Util.checkString(req.getParameter("prn"));

		dm.print();

		ds = (HD_DDEMP_4000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_ddemp_5000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		System.out.println("1111111111");
		HD_DDEMP_5000_LDataSet ds = null;
		HD_DDEMP_5000_LDM dm = new HD_DDEMP_5000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_yy = Util.checkString(req.getParameter("duty_yy"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.print();
		ds = (HD_DDEMP_5000_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
public void hd_ddemp_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		System.out.println("1111111111");
		HD_DDEMP_5001_LDataSet ds = null;
		HD_DDEMP_5001_LDM dm = new HD_DDEMP_5001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.print();
		ds = (HD_DDEMP_5001_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
public void hd_ddemp_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
	
	DBManager manager = new DBManager("MISHDL");
	HD_DDEMP_6001_LDataSet ds = null;
	HD_DDEMP_6001_LDM dm = new HD_DDEMP_6001_LDM();
	System.out.println("1111111111");
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.prn = Util.checkString(req.getParameter("prn"));
	dm.print();
	System.out.println("2222222222");
	ds = (HD_DDEMP_6001_LDataSet)manager.executeCall(dm);
	System.out.println("3333333333");
	if (!"".equals(ds.errcode)) {
    	System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
    }
	
	req.setAttribute("ds", ds);
}

public void hd_ddemp_6002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
	
	DBManager manager = new DBManager("MISHDL");
	HD_DDEMP_6002_LDataSet ds = null;
	HD_DDEMP_6002_LDM dm = new HD_DDEMP_6002_LDM();
	System.out.println("1111111111");
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
	dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
	dm.chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
	dm.flnm = Util.checkString(req.getParameter("flnm"));
	dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
	dm.thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
	dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	dm.work_yn = Util.checkString(req.getParameter("work_yn"));
	dm.chrg_posk_nm = Util.checkString(req.getParameter("chrg_posk_nm"));
	dm.print();
	System.out.println("2222222222");
	ds = (HD_DDEMP_6002_LDataSet)manager.executeCall(dm);
	System.out.println("3333333333");
	if (!"".equals(ds.errcode)) {
    	System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
    }
	
	req.setAttribute("ds", ds);
}	

public void hd_ddemp_6003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	DBManager manager = new DBManager("MISHDL");

	HD_DDEMP_6003_ADataSet ds = null;
	HD_DDEMP_6003_ADM dm = new HD_DDEMP_6003_ADM();

	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.mode = Util.checkString(req.getParameter("mode"));
	dm.frlc_no = Util.checkString(req.getParameter("frlc_no"));
	dm.mang_no = Util.checkString(req.getParameter("mang_no"));
	dm.flnm = Util.checkString(req.getParameter("flnm"));
	dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
	dm.prn = Util.checkString(req.getParameter("prn"));
	dm.tel_no = Util.checkString(req.getParameter("tel_no"));
	dm.cntr_dt = Util.checkString(req.getParameter("cntr_dt"));
	dm.cntr_expr_dt = Util.checkString(req.getParameter("cntr_expr_dt"));
	dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
	dm.work_yn = Util.checkString(req.getParameter("work_yn"));
	dm.servcost = Util.checkString(req.getParameter("servcost"));
	dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
	dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
	dm.incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
	dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
	dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
	dm.chrg_posk_nm = Util.checkString(req.getParameter("chrg_posk_nm"));
	dm.all_insr_dduc_yn = Util.checkString(req.getParameter("all_insr_dduc_yn"));
	dm.remk = Util.checkString(req.getParameter("remk"));
	
	dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

	dm.print();

	ds = (HD_DDEMP_6003_ADataSet)manager.executeCall(dm);
	
	if (!"".equals(ds.errcode)) {
    	System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
    }
	
	req.setAttribute("ds", ds);
}

public void hd_ddemp_6004_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
	DBManager manager = new DBManager("MISHDL");

	HD_DDEMP_6004_MDataSet ds = null;
	HD_DDEMP_6004_MDM dm = new HD_DDEMP_6004_MDM();

	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	//dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
	
	dm.print();
	
	

	ds = (HD_DDEMP_6004_MDataSet)manager.executeCall(dm);
	
 
	if (!"".equals(ds.errcode)) {
    	System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
    }
	
	req.setAttribute("ds", ds);
}
}