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

package chosun.ciis.hd.dwnwrk.wb;

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
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.ds.*;

/**
 * 
 */
 
public class HD_DWNWRK_1000WB extends BaseWB {
 
	public void hd_dwnwrk_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1000_LDataSet ds = null;
		HD_DWNWRK_1000_LDM dm = new HD_DWNWRK_1000_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_DWNWRK_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dwnwrk_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1001_LDataSet ds = null;
		HD_DWNWRK_1001_LDM dm = new HD_DWNWRK_1001_LDM();

		
		
		dm.aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (HD_DWNWRK_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dwnwrk_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1002_ADataSet ds = null;
		HD_DWNWRK_1002_ADM dm = new HD_DWNWRK_1002_ADM();

		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;
		    
		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		String new_aply_basi_dt = Util.checkString(req.getParameter("n_aply_basi_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));
		}
		
		System.out.println("new_aply_basi_dt="+new_aply_basi_dt);
		
		String mode					= converted[0];
		String erl_prsnt_alon_clsf	= converted[2];
		String aply_duty_tm			= converted[3];
		String alon_amt				= converted[4];
		//String cmpy_cd				= converted[5];
		String aply_basi_dt			= converted[6];
		String seq					= converted[7];
		
		
		dm.setMode(mode.toUpperCase());
		dm.setErl_prsnt_alon_clsf(erl_prsnt_alon_clsf);
		dm.setAply_duty_tm(aply_duty_tm);
		dm.setAlon_amt(alon_amt);
		//dm.setCmpy_cd(cmpy_cd);
		dm.setAply_basi_dt(aply_basi_dt);
		dm.setSeq(seq);
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_aply_basi_dt = Util.checkString(new_aply_basi_dt);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_DWNWRK_1002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dwnwrk_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1100_LDataSet ds = null;
		HD_DWNWRK_1100_LDM dm = new HD_DWNWRK_1100_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_DWNWRK_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dwnwrk_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1101_LDataSet ds = null;
		HD_DWNWRK_1101_LDM dm = new HD_DWNWRK_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_DWNWRK_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dwnwrk_1102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DWNWRK_1102_ADataSet ds = null;
		HD_DWNWRK_1102_ADM dm = new HD_DWNWRK_1102_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.erl_prsnt_bgn_tm = (String)hash.get("erl_prsnt_bgn_tm");
		dm.erl_prsnt_end_tm = (String)hash.get("erl_prsnt_end_tm");
		dm.erl_prsnt_duty_tm = (String)hash.get("erl_prsnt_duty_tm");
		dm.prsnt_tm = (String)hash.get("prsnt_tm");
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");
		dm.finish_tm = (String)hash.get("finish_tm");
		dm.duty_resn = (String)hash.get("duty_resn");
		dm.u_ipadd = req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));

		dm.print();

		ds = (HD_DWNWRK_1102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dwnwrk_1103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1103_LDataSet ds = null;
		HD_DWNWRK_1103_LDM dm = new HD_DWNWRK_1103_LDM();

		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_DWNWRK_1103_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dwnwrk_1104_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1104_ADataSet ds = null;
		HD_DWNWRK_1104_ADM dm = new HD_DWNWRK_1104_ADM();

		dm.app_emp_no 			= Util.checkString(req.getParameter("app_emp_no"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode				= ((String)hash.get("m")).toUpperCase();
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_DWNWRK_1104_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dwnwrk_1105_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_DWNWRK_1105_MDataSet ds = null;
		HD_DWNWRK_1105_MDM dm = new HD_DWNWRK_1105_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_DWNWRK_1105_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	public void hd_dwnwrk_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1200_LDataSet ds = null;
		HD_DWNWRK_1200_LDM dm = new HD_DWNWRK_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DWNWRK_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dwnwrk_1201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1201_ADataSet ds = null;
		HD_DWNWRK_1201_ADM dm = new HD_DWNWRK_1201_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode					= ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt	= (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq	= (String)hash.get("slip_proc_mang_seq");
		
		dm.cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.ss_emp_no 			= Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd  	= req.getRemoteAddr();
		
		dm.emp_no_tm 			= (String)hash.get("emp_no_tm");
		dm.ep_seq 				= (String)hash.get("ep_seq");

		dm.print();

		ds = (HD_DWNWRK_1201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_dwnwrk_1202_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_DWNWRK_1202_MDataSet ds = null;
		HD_DWNWRK_1202_MDM dm = new HD_DWNWRK_1202_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_DWNWRK_1202_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	public void hd_dwnwrk_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1300_LDataSet ds = null;
		HD_DWNWRK_1300_LDM dm = new HD_DWNWRK_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		
		dm.print();

		ds = (HD_DWNWRK_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dwnwrk_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1301_LDataSet ds = null;
		HD_DWNWRK_1301_LDM dm = new HD_DWNWRK_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_DWNWRK_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_dwnwrk_1302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1302_ADataSet ds = null;
		HD_DWNWRK_1302_ADM dm = new HD_DWNWRK_1302_ADM();

		//조출데이터
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode					= ((String)hash.get("m")).toUpperCase();
		dm.emp_no				= (String)hash.get("emp_no");
		dm.dept_cd				= (String)hash.get("dept_cd");
		dm.duty_dt				= (String)hash.get("duty_dt");
		dm.alon_amt				= (String)hash.get("alon_amt");
		dm.slip_proc_mang_dt	= (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq	= (String)hash.get("slip_proc_mang_seq");
		
		//결제데이터
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		
		dm.s_mode				= ((String)hash1.get("m")).toUpperCase();
		dm.s_duty_dds			= (String)hash1.get("s_duty_dds");
		dm.s_emp_no				= (String)hash1.get("s_emp_no");
		dm.s_total_alon_amt		= (String)hash1.get("s_total_alon_amt");
		
		dm.s_pay_dt 			= Util.checkString(req.getParameter("s_pay_dt"));
		dm.cmpy_cd				= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.ss_emp_no			= Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd		= req.getRemoteAddr();	

		dm.print();

		ds = (HD_DWNWRK_1302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_dwnwrk_1303_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1303_ADataSet ds = null;
		HD_DWNWRK_1303_ADM dm = new HD_DWNWRK_1303_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);		
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.s_total_alon_amt = (String)hash.get("alon_amt");
		dm.s_emp_no = (String)hash.get("emp_no");
		dm.s_flnm = (String)hash.get("nm_korn");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.duty_dt = (String)hash.get("duty_dt");
		
		String s_total_amt           = Util.checkString(req.getParameter("s_total_amt"));
		String s_total_peple         = Util.checkString(req.getParameter("s_total_peple"));   
		dm.setS_total_amt(s_total_amt);
		dm.setS_total_peple(s_total_peple);
		
		dm.print();

		ds = (HD_DWNWRK_1303_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dwnwrk_1304_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1304_DDataSet ds = null;
		HD_DWNWRK_1304_DDM dm = new HD_DWNWRK_1304_DDM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		String mode 				  =	converted[0];
		String slip_proc_mang_dt      = converted[20];
		String slip_proc_mang_seq     = converted[21];
		dm.setMode(mode.toUpperCase());
		dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
		dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
		
		
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));
		
		dm.setSlip_seq(slip_seq);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_incmg_pers(slip_incmg_pers);
		dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);
		
		dm.print();

		ds = (HD_DWNWRK_1304_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_dwnwrk_1305_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_DWNWRK_1305_MDataSet ds = null;
		HD_DWNWRK_1305_MDM dm = new HD_DWNWRK_1305_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_DWNWRK_1305_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dwnwrk_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DWNWRK_1400_LDataSet ds = null;
		HD_DWNWRK_1400_LDM dm = new HD_DWNWRK_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.fr_duty_dt = Util.checkString(req.getParameter("fr_duty_dt"));
		dm.to_duty_dt = Util.checkString(req.getParameter("to_duty_dt"));

		dm.print();

		ds = (HD_DWNWRK_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
}