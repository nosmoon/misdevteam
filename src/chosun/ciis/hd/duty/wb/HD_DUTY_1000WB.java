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

package chosun.ciis.hd.duty.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.lang.*;
import java.util.StringTokenizer;

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
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;
/**
 * 
 */
 
public class HD_DUTY_1000WB extends BaseWB {
 
    /**
     * 멀티레코드처리 row 구분자
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    //public final String COL_SEPARATOR = "#";

	public void hd_duty_1000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1000_ADataSet ds = null;
		HD_DUTY_1000_ADM dm = new HD_DUTY_1000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_DUTY_1000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1001_LDataSet ds = null;
		HD_DUTY_1001_LDM dm = new HD_DUTY_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1002_LDataSet ds = null;
		HD_DUTY_1002_LDM dm = new HD_DUTY_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
		dm.print();

		ds = (HD_DUTY_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1003_ADataSet ds = null;
		HD_DUTY_1003_ADM dm = new HD_DUTY_1003_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		//String aa = (String)hash.get("rownum");
		//System.out.println("aa == " + aa);
		dm.clndr_dt = (String)hash.get("clndr_dt");
		dm.clndr_tm = (String)hash.get("clndr_tm");
		dm.hody_clsf = (String)hash.get("hody_clsf");
		dm.remk = (String)hash.get("remk");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1004_LDataSet ds = null;
		HD_DUTY_1004_LDM dm = new HD_DUTY_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_DUTY_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1107_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1107_LDataSet ds = null;
		HD_DUTY_1107_LDM dm = new HD_DUTY_1107_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("clndr_dt"));

		dm.print();

		ds = (HD_DUTY_1107_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1100_LDataSet ds = null;
		HD_DUTY_1100_LDM dm = new HD_DUTY_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

	    System.out.print("웹빈");
	    
		HD_DUTY_1101_MDataSet ds = null;
		HD_DUTY_1101_MDM dm = new HD_DUTY_1101_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_DUTY_1101_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1102_LDataSet ds = null;
		HD_DUTY_1102_LDM dm = new HD_DUTY_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
		dm.print();

		ds = (HD_DUTY_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1103_ADataSet ds = null;
		HD_DUTY_1103_ADM dm = new HD_DUTY_1103_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.prsnt_tm = (String)hash.get("prsnt_tm");
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");
		dm.finish_tm = (String)hash.get("finish_tm");
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1104_LDataSet ds = null;
		HD_DUTY_1104_LDM dm = new HD_DUTY_1104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.print();

		ds = (HD_DUTY_1104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1105_LDataSet ds = null;
		HD_DUTY_1105_LDM dm = new HD_DUTY_1105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.print();

		ds = (HD_DUTY_1105_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	/*	
	public void hd_duty_1105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1105_ADataSet ds = null;
		HD_DUTY_1105_ADM dm = new HD_DUTY_1105_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.app_emp_no = (String)hash.get("app_emp_no");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1105_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	*/
	public void hd_duty_1106_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1106_ADataSet ds = null;
		HD_DUTY_1106_ADM dm = new HD_DUTY_1106_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate2"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.duty_dt = (String)hash.get("duty_dt2");
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1106_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1200_LDataSet ds = null;
		HD_DUTY_1200_LDM dm = new HD_DUTY_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_DUTY_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1201_ADataSet ds = null;
		HD_DUTY_1201_ADM dm = new HD_DUTY_1201_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.prsnt_tm = (String)hash.get("prsnt_tm");
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");
		dm.finish_tm = (String)hash.get("finish_tm");
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.addm_rest_minute = (String)hash.get("addm_rest_minute");
	    dm.duty_clsf = (String)hash.get("duty_clsf"); // 2018.08.09 추가 

		dm.print();

		ds = (HD_DUTY_1201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1202_LDataSet ds = null;
		HD_DUTY_1202_LDM dm = new HD_DUTY_1202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_DUTY_1202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1203_LDataSet ds = null;
		HD_DUTY_1203_LDM dm = new HD_DUTY_1203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.print();

		ds = (HD_DUTY_1203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1204_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1204_LDataSet ds = null;
		HD_DUTY_1204_LDM dm = new HD_DUTY_1204_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (HD_DUTY_1204_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1205_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1205_LDataSet ds = null;
		HD_DUTY_1205_LDM dm = new HD_DUTY_1205_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1205_LDataSet)manager.executeCall(dm);
		
		//20091121추가
		System.out.println("결제자curlist1 : "+ds.curMap3);
		System.out.println("결제자curlist2 : "+ds.curMap4);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1206_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1206_LDataSet ds = null;
		HD_DUTY_1206_LDM dm = new HD_DUTY_1206_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no_tm"));

		ds = (HD_DUTY_1206_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1207_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_1207_MDataSet ds = null;
		HD_DUTY_1207_MDM dm = new HD_DUTY_1207_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_DUTY_1207_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	/*
	public void hd_duty_1208_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1208_LDataSet ds = null;
		HD_DUTY_1208_LDM dm = new HD_DUTY_1208_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_DUTY_1208_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	*/
	public void hd_duty_1209_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1209_LDataSet ds = null;
		HD_DUTY_1209_LDM dm = new HD_DUTY_1209_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (HD_DUTY_1209_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1300_LDataSet ds = null;
		HD_DUTY_1300_LDM dm = new HD_DUTY_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.decid_fr_tm = Util.checkString(req.getParameter("decid_fr_tm"));
		//dm.decid_to_tm = Util.checkString(req.getParameter("decid_to_tm"));
		
		dm.print();

		ds = (HD_DUTY_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1303_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1303_LDataSet ds = null;
		HD_DUTY_1303_LDM dm = new HD_DUTY_1303_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.decid_fr_tm = Util.checkString(req.getParameter("decid_fr_tm"));
		dm.decid_to_tm = Util.checkString(req.getParameter("decid_to_tm"));
		
		dm.print();

		ds = (HD_DUTY_1303_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1304_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1304_MDataSet ds = null;
		HD_DUTY_1304_MDM dm = new HD_DUTY_1304_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_DUTY_1304_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1301_ADataSet ds = null;
		HD_DUTY_1301_ADM dm = new HD_DUTY_1301_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.send = ((String)hash.get("send")).toUpperCase();
		dm.retu = ((String)hash.get("retu")).toUpperCase();
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.emp_no_tm = (String)hash.get("emp_no_tm");
		dm.ep_seq = (String)hash.get("ep_seq");
		dm.aprv_pers = (String)hash.get("aprv_pers");
		dm.print();

		ds = (HD_DUTY_1301_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	/*
	public void hd_duty_1301_344_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1301_344_ADataSet ds = null;
		HD_DUTY_1301_344_ADM dm = new HD_DUTY_1301_344_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.send = ((String)hash.get("send")).toUpperCase();
		dm.retu = ((String)hash.get("retu")).toUpperCase();
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.emp_no_tm = (String)hash.get("emp_no_tm");
		dm.ep_seq = (String)hash.get("ep_seq");
		dm.duty_clsf = (String)hash.get("duty_clsf");
		dm.print();

		ds = (HD_DUTY_1301_344_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
*/	
	public void hd_duty_1302_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1302_UDataSet ds = null;
		HD_DUTY_1302_UDM dm = new HD_DUTY_1302_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = Util.checkString(req.getParameter("epView_seq"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_DUTY_1302_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1400_LDataSet ds = null;
		HD_DUTY_1400_LDM dm = new HD_DUTY_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1401_LDataSet ds = null;
		HD_DUTY_1401_LDM dm = new HD_DUTY_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_DUTY_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1402_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1402_ADataSet ds = null;
		HD_DUTY_1402_ADM dm = new HD_DUTY_1402_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.save = ((String)hash.get("save")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.alon_pay_mm = (String)hash.get("alon_pay_mm");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1402_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
/*	
	public void hd_duty_1402_344_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1402_344_ADataSet ds = null;
		HD_DUTY_1402_344_ADM dm = new HD_DUTY_1402_344_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.save = ((String)hash.get("save")).toUpperCase();
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.duty_clsf = (String)hash.get("duty_clsf");
		dm.print();

		ds = (HD_DUTY_1402_344_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
*/	
	public void hd_duty_1403_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1403_ADataSet ds = null;
		HD_DUTY_1403_ADM dm = new HD_DUTY_1403_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.save = ((String)hash.get("save")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1403_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1404_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1404_MDataSet ds = null;
		HD_DUTY_1404_MDM dm = new HD_DUTY_1404_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_DUTY_1404_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1500_LDataSet ds = null;
		HD_DUTY_1500_LDM dm = new HD_DUTY_1500_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.search_dt = Util.checkString(req.getParameter("search_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (HD_DUTY_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1501_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1501_ADataSet ds = null;
		HD_DUTY_1501_ADM dm = new HD_DUTY_1501_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.search_dt = Util.checkString(req.getParameter("search_dt"));
		dm.last_dt = Util.checkString(req.getParameter("last_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_DUTY_1501_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1502_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1502_ADataSet ds = null;
		HD_DUTY_1502_ADM dm = new HD_DUTY_1502_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.search_dt = Util.checkString(req.getParameter("search_dt"));
		dm.last_dt = Util.checkString(req.getParameter("last_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_DUTY_1502_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1600_LDataSet ds = null;
		HD_DUTY_1600_LDM dm = new HD_DUTY_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));
		dm.print(); 

		ds = (HD_DUTY_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1601_LDataSet ds = null;
		HD_DUTY_1601_LDM dm = new HD_DUTY_1601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.print();

		ds = (HD_DUTY_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1700_LDataSet ds = null;
		HD_DUTY_1700_LDM dm = new HD_DUTY_1700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_duty_1109_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1109_LDataSet ds = null;
		HD_DUTY_1109_LDM dm = new HD_DUTY_1109_LDM();
		System.out.print("MDM 1119 LDm");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		if(dm.emp_no == ""){
			dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		}
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));

		dm.print();
		
		ds = (HD_DUTY_1109_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1108_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_1108_ADataSet ds = null;
		HD_DUTY_1108_ADM dm = new HD_DUTY_1108_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
		dm.finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
		dm.finish_tm = Util.checkString(req.getParameter("finish_tm"));
//		dm.duty_clsf = Util.checkString(req.getParameter("duty_clsf"));
		dm.hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.alvc_plan_dt = Util.checkString(req.getParameter("alvc_plan_dt"));
		dm.alvc_plan_resn = Util.checkString(req.getParameter("alvc_plan_resn"));
	    dm.addm_rest_minute = Util.checkString(req.getParameter("addm_rest_minute"));


		dm.print();

		ds = (HD_DUTY_1108_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1110_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_1110_ADataSet ds = null;
		HD_DUTY_1110_ADM dm = new HD_DUTY_1110_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
		dm.finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
		dm.finish_tm = Util.checkString(req.getParameter("finish_tm"));
		dm.hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.alvc_plan_dt = Util.checkString(req.getParameter("alvc_plan_dt"));
	    dm.alvc_plan_resn = Util.checkString(req.getParameter("alvc_plan_resn"));
	    dm.addm_rest_minute = Util.checkString(req.getParameter("addm_rest_minute"));
	    dm.duty_clsf = Util.checkString(req.getParameter("duty_clsf"));

		dm.print();

		ds = (HD_DUTY_1110_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1111_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_1111_LDataSet ds = null;
		HD_DUTY_1111_LDM dm = new HD_DUTY_1111_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
	//	dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.print();

		ds = (HD_DUTY_1111_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1112_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_1112_DDataSet ds = null;
		HD_DUTY_1112_DDM dm = new HD_DUTY_1112_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));

		dm.print();

		ds = (HD_DUTY_1112_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_duty_1113_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
	 
		HD_DUTY_1113_LDataSet ds = null;
		HD_DUTY_1113_LDM dm = new HD_DUTY_1113_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_DUTY_1113_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_duty_1114_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
	 
		HD_DUTY_1114_LDataSet ds = null;
		HD_DUTY_1114_LDM dm = new HD_DUTY_1114_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true); //2018.06.14 수정 세션에서 사번으로 수정함 
	//	dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();

		ds = (HD_DUTY_1114_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
    // 2018.06.12 추가  주 52시간 조회 화면 
	public void hd_duty_1801_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DUTY_1801_LDataSet ds = null;
		HD_DUTY_1801_LDM dm = new HD_DUTY_1801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no  = Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers  = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_DUTY_1801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//chosun.com  PC 근태 오픈 
	//조회 
	public void hd_duty_work_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_WORK_1001_LDataSet ds = null;
		HD_DUTY_WORK_1001_LDM dm = new HD_DUTY_WORK_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.basi_dt_chg_clsf   = Util.checkString(req.getParameter("basi_dt_chg_clsf")); // 2018.08.08 추가 
	//	dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.print();

		ds = (HD_DUTY_WORK_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//저장 
	public void hd_duty_work_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_WORK_1002_ADataSet ds = null;
		HD_DUTY_WORK_1002_ADM dm = new HD_DUTY_WORK_1002_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
		dm.finish_tm = Util.checkString(req.getParameter("finish_tm"));
		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.addm_rest_minute = Util.checkString(req.getParameter("addm_rest_minute"));
	    dm.duty_clsf = Util.checkString(req.getParameter("duty_clsf"));
	    dm.basi_dt_chg_clsf = Util.checkString(req.getParameter("basi_dt_chg_clsf"));

		dm.print();

		ds = (HD_DUTY_WORK_1002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error. " + ds.errmsg);
        	req.setAttribute("resultMsg", ds.errmsg);
            //throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	//삭제 
	public void hd_duty_work_1003_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DUTY_WORK_1003_DDataSet ds = null;
		HD_DUTY_WORK_1003_DDM dm = new HD_DUTY_WORK_1003_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));

		dm.print();

		ds = (HD_DUTY_WORK_1003_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error. " + ds.errmsg);
        	req.setAttribute("resultMsg", ds.errmsg);
            //throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	
}