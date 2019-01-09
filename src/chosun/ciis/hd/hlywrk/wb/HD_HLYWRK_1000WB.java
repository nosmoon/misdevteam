/***************************************************************************************************
* 파일명 : HD_HLYWRK_1000WB
* 기능 : 휴일근무관리
* 작성일자 : 2009.04.20
* 작성자 : 강영슬
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.hlywrk.wb;

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
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.ds.*;

/**
 * 
 */
 
public class HD_HLYWRK_1000WB extends BaseWB {
 
	public void hd_hlywrk_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1000_LDataSet ds = null;
		HD_HLYWRK_1000_LDM dm = new HD_HLYWRK_1000_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);


		dm.print();

		ds = (HD_HLYWRK_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	/*
	public void hd_hlywrk_1000_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1000_344_LDataSet ds = null;
		HD_HLYWRK_1000_344_LDM dm = new HD_HLYWRK_1000_344_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);


		dm.print();

		ds = (HD_HLYWRK_1000_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	*/
	public void hd_hlywrk_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1001_LDataSet ds = null;
		HD_HLYWRK_1001_LDM dm = new HD_HLYWRK_1001_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));

		dm.print();

		ds = (HD_HLYWRK_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	/*
	public void hd_hlywrk_1001_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1001_344_LDataSet ds = null;
		HD_HLYWRK_1001_344_LDM dm = new HD_HLYWRK_1001_344_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));

		dm.print();

		ds = (HD_HLYWRK_1001_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	*/
	public void hd_hlywrk_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1002_ADataSet ds = null;
		HD_HLYWRK_1002_ADM dm = new HD_HLYWRK_1002_ADM();

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
		
		String mode		= converted[0];

		String hody_clsf		= converted[2];
		String obj_clsf			= converted[3];
		String base_alon		= converted[4];
		String cmpn_alon		= converted[5];
		String tot_alon			= converted[6];
		String cmpy_cd			= converted[7];
		String aply_basi_dt		= converted[8];
		String seq				= converted[9];
		
		dm.setMode(mode.toUpperCase());
		dm.setHody_clsf(hody_clsf);
		dm.setObj_clsf(obj_clsf);
		dm.setBase_alon(base_alon);
		dm.setCmpn_alon(cmpn_alon);
//		dm.setCmpy_cd(cmpy_cd);
		dm.setAply_basi_dt(aply_basi_dt);
		dm.setSeq(seq);
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_aply_basi_dt = Util.checkString(new_aply_basi_dt);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_HLYWRK_1002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	/*
	public void hd_hlywrk_1002_344_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1002_344_ADataSet ds = null;
		HD_HLYWRK_1002_344_ADM dm = new HD_HLYWRK_1002_344_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		int idx = 0;
		    
		String new_aply_basi_dt = Util.checkString(req.getParameter("n_aply_basi_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));
		}
		
		
		System.out.println("new_aply_basi_dt="+new_aply_basi_dt);
		
		dm.mode		= ((String)hash.get("m")).toUpperCase();

		dm.hody_clsf		= (String)hash.get("hody_clsf");
		dm.obj_clsf			= (String)hash.get("obj_clsf");
		dm.prsnt_hody_clsf		= (String)hash.get("prsnt_hody_clsf");
		dm.finish_hody_clsf		= (String)hash.get("finish_hody_clsf");
		dm.prsnt_tm			= (String)hash.get("prsnt_tm");
		dm.finish_tm		= (String)hash.get("finish_tm");
		dm.finish_dd_clsf	= (String)hash.get("finish_dd_clsf");
		dm.duty_tm		    = (String)hash.get("duty_tm");
		
		dm.base_alon		= (String)hash.get("base_alon");
		dm.cmpn_alon		= (String)hash.get("cmpn_alon");
    	dm.alvc_occr_yn	    = (String)hash.get("alvc_occr_yn");
		dm.cmpy_cd			= (String)hash.get("cmpy_cd");
		dm.aply_basi_dt		= (String)hash.get("aply_basi_dt");
		dm.seq				= (String)hash.get("seq");
		dm.cmpy_cd			= (String)hash.get("cmpy_cd");
	
//		dm.setMode(mode.toUpperCase());
//		dm.setHody_clsf(hody_clsf);
//		dm.setObj_clsf(obj_clsf);
//		dm.setBase_alon(base_alon);
//		dm.setCmpn_alon(cmpn_alon);
//		dm.setCmpy_cd(cmpy_cd);
//		dm.setAply_basi_dt(aply_basi_dt);
//		dm.setSeq(seq);
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_aply_basi_dt = Util.checkString(new_aply_basi_dt);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_HLYWRK_1002_344_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	*/
	public void hd_hlywrk_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1100_LDataSet ds = null;
		HD_HLYWRK_1100_LDM dm = new HD_HLYWRK_1100_LDM();

		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.now_date = Util.checkString(req.getParameter("now_date"));
		
		dm.print();

		ds = (HD_HLYWRK_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1101_LDataSet ds = null;
		HD_HLYWRK_1101_LDM dm = new HD_HLYWRK_1101_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_HLYWRK_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1102_ADataSet ds = null;
		HD_HLYWRK_1102_ADM dm = new HD_HLYWRK_1102_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.obj_clsf = (String)hash.get("");
		dm.hody_clsf = (String)hash.get("hody_clsf");
		dm.prsnt_tm = (String)hash.get("prsnt_tm");
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");
		dm.finish_tm = (String)hash.get("finish_tm");
		dm.tot_duty_tm = (String)hash.get("tot_duty_tm");
		dm.alvc_use_dt = (String)hash.get("alvc_use_dt");
		dm.alvc_use_yn = (String)hash.get("alvc_use_yn");
		dm.alvc_plan_dt = (String)hash.get("alvc_plan_dt");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.now_date = Util.checkString(req.getParameter("now_date"));

		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_HLYWRK_1102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_hlywrk_1103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1103_LDataSet ds = null;
		HD_HLYWRK_1103_LDM dm = new HD_HLYWRK_1103_LDM();

		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
		dm.now_date = Util.checkString(req.getParameter("now_date"));
		dm.print();
		System.out.println("dd");

		ds = (HD_HLYWRK_1103_LDataSet)manager.executeCall(dm);

		System.out.println("11");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1104_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1104_ADataSet ds = null;
		HD_HLYWRK_1104_ADM dm = new HD_HLYWRK_1104_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.actu_emp_no = Util.checkString(req.getParameter("actu_emp_no"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_HLYWRK_1104_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1105_LDataSet ds = null;
		HD_HLYWRK_1105_LDM dm = new HD_HLYWRK_1105_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.now_date = Util.checkString(req.getParameter("now_date"));
		dm.print();

		ds = (HD_HLYWRK_1105_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1106_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1106_MDataSet ds = null;
		HD_HLYWRK_1106_MDM dm = new HD_HLYWRK_1106_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_HLYWRK_1106_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1200_LDataSet ds = null;
		HD_HLYWRK_1200_LDM dm = new HD_HLYWRK_1200_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_HLYWRK_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1201_ADataSet ds = null;
		HD_HLYWRK_1201_ADM dm = new HD_HLYWRK_1201_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;
		    
		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		String mode				= converted[0];
		String cmpy_cd			= converted[16];
		String duty_dt			= converted[6];
		String emp_no			= converted[3];
		String emp_no_tm		= converted[17];
		String ep_seq			= converted[18];

		dm.setMode(mode.toUpperCase());
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setDuty_dt(duty_dt);
		dm.setEmp_no(emp_no);
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setEmp_no_tm(emp_no_tm);
		dm.setEp_seq(ep_seq);
		
		dm.print();

		ds = (HD_HLYWRK_1201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1202_ADataSet ds = null;
		HD_HLYWRK_1202_ADM dm = new HD_HLYWRK_1202_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;
		    
		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		String mode				= converted[0];
		String cmpy_cd			= converted[16];
		String duty_dt			= converted[6];
		String emp_no			= converted[3];
		String emp_no_tm		= converted[17];
		String ep_seq			= converted[18];

		dm.setMode(mode.toUpperCase());
		dm.setCmpy_cd(cmpy_cd);
		dm.setDuty_dt(duty_dt);
		dm.setEmp_no(emp_no);
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setEmp_no_tm(emp_no_tm);
		dm.setEp_seq(ep_seq);
		
		dm.print();
		
		ds = (HD_HLYWRK_1202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_hlywrk_1203_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1203_MDataSet ds = null;
		HD_HLYWRK_1203_MDM dm = new HD_HLYWRK_1203_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_HLYWRK_1203_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1300_LDataSet ds = null;
		HD_HLYWRK_1300_LDM dm = new HD_HLYWRK_1300_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_HLYWRK_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_hlywrk_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1301_LDataSet ds = null;
		HD_HLYWRK_1301_LDM dm = new HD_HLYWRK_1301_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.alon_pay_mm = Util.checkString(req.getParameter("alon_pay_mm"));
		dm.st_duty_dt = Util.checkString(req.getParameter("st_duty_dt"));
		dm.et_duty_dt = Util.checkString(req.getParameter("et_duty_dt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
		dm.duty_dt_ck = Util.checkString(req.getParameter("duty_dt_ck"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));

		dm.print();

		ds = (HD_HLYWRK_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1302_ADataSet ds = null;
		HD_HLYWRK_1302_ADM dm = new HD_HLYWRK_1302_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.re_chk = (String)hash.get("re_chk");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.alvc_plan_dt = (String)hash.get("alvc_plan_dt");
		dm.alvc_use_dt = (String)hash.get("alvc_use_dt");
		dm.alvc_use_yn = (String)hash.get("alvc_use_yn");
		dm.base_alon = (String)hash.get("base_alon");
		dm.cmpn_alon = (String)hash.get("cmpn_alon");
		dm.alon_pay_mm = (String)hash.get("alon_pay_mm");
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_HLYWRK_1302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_hlywrk_1303_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1303_ADataSet ds = null;
		HD_HLYWRK_1303_ADM dm = new HD_HLYWRK_1303_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.re_chk = (String)hash.get("re_chk");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.alvc_plan_dt = (String)hash.get("alvc_plan_dt");
		dm.alvc_use_dt = (String)hash.get("alvc_use_dt");
		dm.alvc_use_yn = (String)hash.get("alvc_use_yn");
		dm.base_alon = (String)hash.get("base_alon");
		dm.cmpn_alon = (String)hash.get("cmpn_alon");
		dm.alon_pay_mm = (String)hash.get("alon_pay_mm");
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_HLYWRK_1303_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	/*
	public void hd_hlywrk_1304_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1304_344_LDataSet ds = null;
		HD_HLYWRK_1304_344_LDM dm = new HD_HLYWRK_1304_344_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
		dm.hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
		dm.prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
		dm.finish_tm = Util.checkString(req.getParameter("finish_tm"));
		dm.tot_duty_tm = Util.checkString(req.getParameter("tot_duty_tm"));

		dm.print();

		ds = (HD_HLYWRK_1304_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	*/
	public void hd_hlywrk_1304_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1304_LDataSet ds = null;
		HD_HLYWRK_1304_LDM dm = new HD_HLYWRK_1304_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
		dm.hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
	    dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));


		dm.print();

		ds = (HD_HLYWRK_1304_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_hlywrk_1305_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_HLYWRK_1305_MDataSet ds = null;
		HD_HLYWRK_1305_MDM dm = new HD_HLYWRK_1305_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_HLYWRK_1305_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
}