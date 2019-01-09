
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

package chosun.ciis.hd.dalon.wb;


import java.util.*;
import java.io.*;
import java.rmi.RemoteException;
import java.util.StringTokenizer;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.util.*;

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
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;
/**
 * 
 */
 





public class HD_DALON_1000WB extends BaseWB {
 
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

	public void hd_dalon_1000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1000_LDataSet ds = null;
		HD_DALON_1000_LDM dm = new HD_DALON_1000_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		
		dm.print();

		ds = (HD_DALON_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1001_ADataSet ds = null;
		HD_DALON_1001_ADM dm = new HD_DALON_1001_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String new_aply_basi_dt = Util.checkString(req.getParameter("new_apst_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		}
		
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_apst_dt = new_aply_basi_dt;
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.prvdd_prsnt_tm_prv = (String)hash.get("prvdd_prsnt_tm_prv");
		dm.prvdd_finish_tm_aft = (String)hash.get("prvdd_finish_tm_aft");	
		dm.prvdd_finish_tm_prv = (String)hash.get("prvdd_finish_tm_prv");	
		dm.thdd_prsnt_tm_aft = (String)hash.get("thdd_prsnt_tm_aft");	
		dm.thdd_prsnt_tm_prv = (String)hash.get("thdd_prsnt_tm_prv");	
		dm.thdd_duty_tm_excs = (String)hash.get("thdd_duty_tm_excs");	
		dm.thdd_duty_tm_undr = (String)hash.get("thdd_duty_tm_undr");	
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.seq = (String)hash.get("seq");

		
        dm.print();

		ds = (HD_DALON_1001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1002(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1002_LDataSet ds = null;
		HD_DALON_1002_LDM dm = new HD_DALON_1002_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
	
		dm.print();

		ds = (HD_DALON_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1010_LDataSet ds = null;
		HD_DALON_1010_LDM dm = new HD_DALON_1010_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_DALON_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1100_LDataSet ds = null;
		HD_DALON_1100_LDM dm = new HD_DALON_1100_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		
		dm.print();

		ds = (HD_DALON_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1102(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1102_LDataSet ds = null;
		HD_DALON_1102_LDM dm = new HD_DALON_1102_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
	
		dm.print();

		ds = (HD_DALON_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1101(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1101_ADataSet ds = null;
		HD_DALON_1101_ADM dm = new HD_DALON_1101_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String new_aply_basi_dt = Util.checkString(req.getParameter("new_apst_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		}
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_apst_dt = new_aply_basi_dt;
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.posi_clsf = (String)hash.get("posi_clsf");
		dm.prsnt_tm_aft = (String)hash.get("prsnt_tm_aft");    	 
		dm.prsnt_tm_prv = (String)hash.get("prsnt_tm_prv");
		dm.finish_tm_aft = (String)hash.get("finish_tm_aft");   	 
		dm.finish_tm_prv = (String)hash.get("finish_tm_prv");      	 
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.seq = (String)hash.get("seq");
		
        dm.print();

		ds = (HD_DALON_1101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1200(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1200_LDataSet ds = null;
		HD_DALON_1200_LDM dm = new HD_DALON_1200_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		ds = (HD_DALON_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1201(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1201_LDataSet ds = null;
		HD_DALON_1201_LDM dm = new HD_DALON_1201_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		
		dm.print();

		ds = (HD_DALON_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1202(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1202_ADataSet ds = null;
		HD_DALON_1202_ADM dm = new HD_DALON_1202_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String new_aply_basi_dt = Util.checkString(req.getParameter("new_apst_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		}
				
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_apst_dt = new_aply_basi_dt;
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.dd_subj_sel_fee_clsf = (String)hash.get("dd_subj_sel_fee_clsf");    	 
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.remk = (String)hash.get("remk");
		dm.seq = (String)hash.get("seq");
		
        dm.print();

		ds = (HD_DALON_1202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1300(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1300_LDataSet ds = null;
		HD_DALON_1300_LDM dm = new HD_DALON_1300_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		ds = (HD_DALON_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1301(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1301_LDataSet ds = null;
		HD_DALON_1301_LDM dm = new HD_DALON_1301_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		
		dm.print();

		ds = (HD_DALON_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1302(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1302_ADataSet ds = null;
		HD_DALON_1302_ADM dm = new HD_DALON_1302_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String new_aply_basi_dt = Util.checkString(req.getParameter("new_apst_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		}
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_apst_dt = new_aply_basi_dt;
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cnfr_fee_clsf = (String)hash.get("cnfr_fee_clsf");	 
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.remk = (String)hash.get("remk");
		dm.seq = (String)hash.get("seq");
		
        dm.print();

		ds = (HD_DALON_1302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1400(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1400_LDataSet ds = null;
		HD_DALON_1400_LDM dm = new HD_DALON_1400_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		ds = (HD_DALON_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1401(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1401_LDataSet ds = null;
		HD_DALON_1401_LDM dm = new HD_DALON_1401_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
		dm.session_dept_cd = Util.checkString(req.getParameter("session_dept_cd"));
		
		dm.print();

		ds = (HD_DALON_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1402(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1402_LDataSet ds = null;
		HD_DALON_1402_LDM dm = new HD_DALON_1402_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		
		dm.print();

		ds = (HD_DALON_1402_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1403(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1403_ADataSet ds = null;
		HD_DALON_1403_ADM dm = new HD_DALON_1403_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");      	 
		dm.session_emp_no = (String)hash.get("session_emp_no");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.out_in_plac = (String)hash.get("out_in_plac");
		dm.cost = (String)hash.get("cost");
		dm.session_dept_cd = (String)hash.get("session_dept_cd");
		//dm.cmpy_cd = (String)hash.get("cmpy_cd");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
        dm.print();

		ds = (HD_DALON_1403_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1404(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1404_LDataSet ds = null;
		HD_DALON_1404_LDM dm = new HD_DALON_1404_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stand_dt = Util.checkString(req.getParameter("stand_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();

		ds = (HD_DALON_1404_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1405(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1405_ADataSet ds = null;
		HD_DALON_1405_ADM dm = new HD_DALON_1405_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.emp_no = (String)hash.get("emp_no");
		dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");
		dm.todt = (String)hash.get("todt");
		dm.out_in_plac = (String)hash.get("out_in_plac");
		dm.dept_cd = (String)hash.get("dept_cd");
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
        dm.print();

		ds = (HD_DALON_1405_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_dalon_1406(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1406_LDataSet ds = null;
		HD_DALON_1406_LDM dm = new HD_DALON_1406_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();

		ds = (HD_DALON_1406_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1407(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1407_LDataSet ds = null;
		HD_DALON_1407_LDM dm = new HD_DALON_1407_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_DALON_1407_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1408(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1408_LDataSet ds = null;
		HD_DALON_1408_LDM dm = new HD_DALON_1408_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.session_emp_no = Util.checkString(req.getParameter("session_emp_no"));
		dm.session_dept_cd = Util.checkString(req.getParameter("session_dept_cd"));
		
		dm.print();

		ds = (HD_DALON_1408_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1409_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1409_MDataSet ds = null;
		HD_DALON_1409_MDM dm = new HD_DALON_1409_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_DALON_1409_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1500(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1500_LDataSet ds = null;
		HD_DALON_1500_LDM dm = new HD_DALON_1500_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
		dm.proc_stat = Util.checkString(req.getParameter("aplc_clsf"));
		
		dm.print();

		ds = (HD_DALON_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1501(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1501_ADataSet ds = null;
		HD_DALON_1501_ADM dm = new HD_DALON_1501_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String gubun = Util.checkString(req.getParameter("gubun"));
		if("2".equals(gubun)){
			dm.gubun = Util.checkString(req.getParameter("gubun"));
			dm.mode = ((String)hash.get("m")).toUpperCase();
			dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");   	 
			dm.emp_no = (String)hash.get("session_emp_no");
			dm.frdt = (String)hash.get("frdt");
			dm.todt = (String)hash.get("todt");
			dm.out_in_plac = (String)hash.get("out_in_plac");
			dm.cost = (String)hash.get("cost");
			dm.dept_cd = (String)hash.get("session_dept_cd");
			dm.proc_stat = (String)hash.get("proc_stat");
			dm.occr_dt = (String)hash.get("occr_dt");
			dm.seq = (String)hash.get("seq");
			dm.excl_pers_clsf = (String)hash.get("excl_pers_clsf");
			dm.tablename = (String)hash.get("tablename");
		}else{
			dm.gubun = Util.checkString(req.getParameter("gubun"));
			dm.mode = ((String)hash.get("m")).toUpperCase();
			dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");   	 
			dm.emp_no = (String)hash.get("emp_no");
			dm.frdt = (String)hash.get("frdt");
			dm.todt = (String)hash.get("todt");
			dm.out_in_plac = (String)hash.get("out_in_plac");
			dm.cost = (String)hash.get("cost");
			dm.dept_cd = (String)hash.get("dept_cd");
			dm.proc_stat = (String)hash.get("proc_stat");
			dm.occr_dt = (String)hash.get("occr_dt");
			dm.seq = (String)hash.get("seq");
			dm.excl_pers_clsf = (String)hash.get("excl_pers_clsf");
			dm.tablename = (String)hash.get("tablename");
		}

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
        dm.print();

		ds = (HD_DALON_1501_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1502(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1502_ADataSet ds = null;
		HD_DALON_1502_ADM dm = new HD_DALON_1502_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");     	 
		dm.emp_no = (String)hash.get("emp_no");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.out_in_plac = (String)hash.get("out_in_plac");
		dm.cost = (String)hash.get("cost");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.cost = (String)hash.get("cost");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.tablename = (String)hash.get("tablename");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.excl_pers_clsf = (String)hash.get("excl_pers_clsf");
	
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
        dm.print();

		ds = (HD_DALON_1502_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1600(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1600_LDataSet ds = null;
		HD_DALON_1600_LDM dm = new HD_DALON_1600_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stand_dt = Util.checkString(req.getParameter("stand_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));

		dm.stand_dt_fm = Util.checkString(req.getParameter("stand_dt_fm"));
		dm.stand_dt_to = Util.checkString(req.getParameter("stand_dt_to"));
		dm.radio_check_value = Util.checkString(req.getParameter("radio_check_value"));
		
		dm.print();

		ds = (HD_DALON_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1700(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1700_LDataSet ds = null;
		HD_DALON_1700_LDM dm = new HD_DALON_1700_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.not_cost_obj_clsf = Util.checkString(req.getParameter("not_cost_obj_clsf"));
		dm.print();

		ds = (HD_DALON_1700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1701(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1701_LDataSet ds = null;
		HD_DALON_1701_LDM dm = new HD_DALON_1701_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));

		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.bonsa_gbn = Util.checkString(req.getParameter("bonsa_gbn"));

		
		dm.print();

		ds = (HD_DALON_1701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1702(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1702_LDataSet ds = null;
		HD_DALON_1702_LDM dm = new HD_DALON_1702_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.bonsa_gbn = Util.checkString(req.getParameter("bonsa_gbn"));
		
		dm.print();

		ds = (HD_DALON_1702_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1704(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1704_ADataSet ds = null;
		HD_DALON_1704_ADM dm = new HD_DALON_1704_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.prsnt_tm = (String)hash.get("prsnt_tm");
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");    	 
		dm.finish_tm = (String)hash.get("finish_tm");
		dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");
		dm.out_in_plac = (String)hash.get("out_in_plac");
		dm.pay_dt = (String)hash.get("pay_dt");
		dm.pay_cost = (String)hash.get("pay_cost");
		dm.dept_cd = (String)hash.get("dept_cd");

        dm.connect_ip = req.getRemoteAddr();
        dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
        dm.print();

		ds = (HD_DALON_1704_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1705_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1705_LDataSet ds = null;
		HD_DALON_1705_LDM dm = new HD_DALON_1705_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_1705_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	


	public void hd_dalon_1706_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1706_ADataSet ds = null;
		HD_DALON_1706_ADM dm = new HD_DALON_1706_ADM();

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
		dm.tmp_dr_amt = (String)hash1.get("tmp_dr_amt");
		dm.flnm = (String)hash1.get("flnm");
		dm.emp_no = (String)hash1.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.dept_cd = (String)hash1.get("dept_cd");
		
		String tmp_crdt_amt         = Util.checkString(req.getParameter("tmp_crdt_amt"));
		String titl                 = Util.checkString(req.getParameter("titl"));    
  	    dm.setTmp_crdt_amt(tmp_crdt_amt);
  	    dm.setTitl(titl);

		dm.print();
		
		ds = (HD_DALON_1706_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1707_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1707_DDataSet ds = null;
		HD_DALON_1707_DDM dm = new HD_DALON_1707_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String slip_incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		
		dm.setSlip_seq(slip_seq);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_incmg_pers(slip_incmg_pers);
		dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

		dm.print();
 
		ds = (HD_DALON_1707_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_dalon_1708_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1708_MDataSet ds = null;
		HD_DALON_1708_MDM dm = new HD_DALON_1708_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_DALON_1708_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1800(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1800_LDataSet ds = null;
		HD_DALON_1800_LDM dm = new HD_DALON_1800_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.not_cost_obj_clsf = Util.checkString(req.getParameter("not_cost_obj_clsf"));
		dm.print();

		ds = (HD_DALON_1800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1801_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1801_LDataSet ds = null;
		HD_DALON_1801_LDM dm = new HD_DALON_1801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_1801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1802_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1802_ADataSet ds = null;
		HD_DALON_1802_ADM dm = new HD_DALON_1802_ADM();

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
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = (String)hash1.get("tmp_dr_amt");
		dm.flnm = (String)hash1.get("flnm");
		dm.dept_cd = (String)hash1.get("dept_cd");
	    
		String tmp_crdt_amt         = Util.checkString(req.getParameter("tmp_crdt_amt"));
		String titl                 = Util.checkString(req.getParameter("titl"));    
  	    dm.setTmp_crdt_amt(tmp_crdt_amt);
  	    dm.setTitl(titl);
  	    
		dm.print();

		ds = (HD_DALON_1802_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1803_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1803_DDataSet ds = null;
		HD_DALON_1803_DDM dm = new HD_DALON_1803_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String slip_incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		
		dm.setSlip_seq(slip_seq);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_incmg_pers(slip_incmg_pers);
		dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

		dm.print();

		ds = (HD_DALON_1803_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_dalon_1804_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1804_LDataSet ds = null;
		HD_DALON_1804_LDM dm = new HD_DALON_1804_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));

		dm.print();

		ds = (HD_DALON_1804_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1806_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1806_MDataSet ds = null;
		HD_DALON_1806_MDM dm = new HD_DALON_1806_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_DALON_1806_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_dalon_1900(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1900_LDataSet ds = null;
		HD_DALON_1900_LDM dm = new HD_DALON_1900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));

		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));		
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));

		
		dm.print();

		ds = (HD_DALON_1900_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_dalon_1901(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1901_LDataSet ds = null;
		HD_DALON_1901_LDM dm = new HD_DALON_1901_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		
		dm.print();

		ds = (HD_DALON_1901_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1911_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1911_LDataSet ds = null;
		HD_DALON_1911_LDM dm = new HD_DALON_1911_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_1911_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1912_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1912_LDataSet ds = null;
		HD_DALON_1912_LDM dm = new HD_DALON_1912_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_1912_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1913_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1913_LDataSet ds = null;
		HD_DALON_1913_LDM dm = new HD_DALON_1913_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_1913_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	

	public void hd_dalon_1914_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1914_LDataSet ds = null;
		HD_DALON_1914_LDM dm = new HD_DALON_1914_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_1914_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1915_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_DALON_1915_LDataSet ds = null;
		HD_DALON_1915_LDM dm = new HD_DALON_1915_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		DBManager manager = new DBManager("MISHDL");
		ds = (HD_DALON_1915_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

	}
	
	
	
	public void hd_dalon_1915_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_DALON_1915_344_LDataSet ds = null;
		HD_DALON_1915_344_LDM dm = new HD_DALON_1915_344_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		DBManager manager = new DBManager("MISHDL");
		ds = (HD_DALON_1915_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

	}

	public void hd_dalon_1902(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1902_LDataSet ds = null;
		HD_DALON_1902_LDM dm = new HD_DALON_1902_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_duty_dt = Util.checkString(req.getParameter("search_duty_dt"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.search_emp_no = Util.checkString(req.getParameter("search_emp_no"));
		dm.search_dept_cd = Util.checkString(req.getParameter("search_dept_cd"));
		
		dm.print();

		ds = (HD_DALON_1902_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1903(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1903_ADataSet ds = null;
		HD_DALON_1903_ADM dm = new HD_DALON_1903_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.vgl_duty_dt = (String)hash.get("vgl_duty_dt");
		dm.prvdd_prsnt_tm = (String)hash.get("prvdd_prsnt_tm");    	 
		dm.prvdd_finish_tm = (String)hash.get("prvdd_finish_tm");     	 
		dm.thdd_prsnt_tm = (String)hash.get("thdd_prsnt_tm");
		dm.thdd_finish_tm = (String)hash.get("thdd_finish_tm");
		dm.thdd_duty_tm = (String)hash.get("thdd_duty_tm");
		dm.pay_dt = (String)hash.get("pay_dt");
		dm.pay_cost = (String)hash.get("pay_cost");
		dm.pay_cost = (String)hash.get("pay_cost");
		dm.dept_cd = (String)hash.get("dept_cd");
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setCmpy_cd(cmpy_cd);
		dm.setConnect_ip(incmg_pers_ipadd);
		dm.setConnect_userid(ss_emp_no);
		
        dm.print();

		ds = (HD_DALON_1903_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1904_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1904_LDataSet ds = null;
		HD_DALON_1904_LDM dm = new HD_DALON_1904_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_1904_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_dalon_1905_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1905_ADataSet ds = null;
		HD_DALON_1905_ADM dm = new HD_DALON_1905_ADM();

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
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = (String)hash1.get("tmp_dr_amt");
		dm.flnm = (String)hash1.get("flnm");
		dm.dept_cd = (String)hash1.get("dept_cd");

		String tmp_crdt_amt         = Util.checkString(req.getParameter("tmp_crdt_amt"));
		String titl                 = Util.checkString(req.getParameter("titl"));
  	    dm.setTmp_crdt_amt(tmp_crdt_amt);
  	    dm.setTitl(titl);
 
		dm.print();

		ds = (HD_DALON_1905_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1906_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1906_DDataSet ds = null;
		HD_DALON_1906_DDM dm = new HD_DALON_1906_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String slip_incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		
		dm.setSlip_seq(slip_seq);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_incmg_pers(slip_incmg_pers);
		dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

		dm.print();
	
		ds = (HD_DALON_1906_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_dalon_1907_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1907_LDataSet ds = null;
		HD_DALON_1907_LDM dm = new HD_DALON_1907_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));

		dm.print();

		ds = (HD_DALON_1907_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_2000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2000_LDataSet ds = null;
		HD_DALON_2000_LDM dm = new HD_DALON_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));		
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		
		dm.print();

		ds = (HD_DALON_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1908_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_DALON_1908_MDataSet ds = null;
		HD_DALON_1908_MDM dm = new HD_DALON_1908_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		DBManager manager = new DBManager("MISHDL");
		ds = (HD_DALON_1908_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1909_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_DALON_1909_DDataSet ds = null;
		HD_DALON_1909_DDM dm = new HD_DALON_1909_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));

		dm.print();

		ds = (HD_DALON_1909_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_2001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2001_LDataSet ds = null;
		HD_DALON_2001_LDM dm = new HD_DALON_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		
		dm.print();

		ds = (HD_DALON_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_2002(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2002_LDataSet ds = null;
		HD_DALON_2002_LDM dm = new HD_DALON_2002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.search_duty_dt = Util.checkString(req.getParameter("search_duty_dt"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.search_emp_no = Util.checkString(req.getParameter("search_emp_no"));
		dm.search_dept_cd = Util.checkString(req.getParameter("search_dept_cd"));
		
		dm.print();

		ds = (HD_DALON_2002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_2003(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2003_ADataSet ds = null;
		HD_DALON_2003_ADM dm = new HD_DALON_2003_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");	 
		dm.duty_dt = (String)hash.get("duty_dt");	 
		dm.prsnt_tm = (String)hash.get("prsnt_tm");	 
		dm.finish_tm = (String)hash.get("finish_tm");	 
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");	 
		dm.pay_dt = (String)hash.get("pay_dt");	 
		dm.pay_cost = (String)hash.get("pay_cost");	 
		dm.dept_cd = (String)hash.get("dept_cd");	 
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setCmpy_cd(cmpy_cd);
		dm.setConnect_ip(incmg_pers_ipadd);
		dm.setConnect_userid(ss_emp_no);
		
        dm.print();

		ds = (HD_DALON_2003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_2004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2004_LDataSet ds = null;
		HD_DALON_2004_LDM dm = new HD_DALON_2004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_2004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_dalon_2005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2005_ADataSet ds = null;
		HD_DALON_2005_ADM dm = new HD_DALON_2005_ADM();

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
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = (String)hash1.get("tmp_dr_amt");
		dm.dept_nm = (String)hash1.get("dept_nm");
		/*dm.dept_nm = (String)hash1.get("flnm");*/
		dm.dept_cd = (String)hash1.get("dept_cd");
  	    
		String tmp_crdt_amt         = Util.checkString(req.getParameter("tmp_crdt_amt"));
		String titl                 = Util.checkString(req.getParameter("titl"));
  	    dm.setTmp_crdt_amt(tmp_crdt_amt);
  	    dm.setTitl(titl);
 
		dm.print();

		ds = (HD_DALON_2005_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_dalon_2006_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2006_DDataSet ds = null;
		HD_DALON_2006_DDM dm = new HD_DALON_2006_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String slip_incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		
		dm.setSlip_seq(slip_seq);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_incmg_pers(slip_incmg_pers);
		dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

		dm.print();		

		ds = (HD_DALON_2006_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_2007_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_2007_MDataSet ds = null;
		HD_DALON_2007_MDM dm = new HD_DALON_2007_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_DALON_2007_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1805_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1805_LDataSet ds = null;
		HD_DALON_1805_LDM dm = new HD_DALON_1805_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		ds = (HD_DALON_1805_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1503_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1503_LDataSet ds = null;
		HD_DALON_1503_LDM dm = new HD_DALON_1503_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		ds = (HD_DALON_1503_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1504_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1504_MDataSet ds = null;
		HD_DALON_1504_MDM dm = new HD_DALON_1504_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_DALON_1504_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1505_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1505_ADataSet ds = null;
		HD_DALON_1505_ADM dm = new HD_DALON_1505_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.todt = (String)hash.get("todt");
		dm.out_in_plac = (String)hash.get("out_in_plac");
		
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DALON_1505_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1506_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1506_MDataSet ds = null;
		HD_DALON_1506_MDM dm = new HD_DALON_1506_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_DALON_1506_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1510_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1510_ADataSet ds = null;
		HD_DALON_1510_ADM dm = new HD_DALON_1510_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.out_in_plac = Util.checkString(req.getParameter("out_in_plac"));
		dm.connect_ip = req.getRemoteAddr();	
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DALON_1510_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	/* 회의비 지급대상자 관리    2014.07.16 */
	public void hd_dalon_1550(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DALON_1550_LDataSet ds = null;
		HD_DALON_1550_LDM dm = new HD_DALON_1550_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
		dm.emp_no  =  Util.checkString(req.getParameter("emp_no"));
		dm.base_dt  =  Util.checkString(req.getParameter("base_dt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		
		dm.print();

		ds = (HD_DALON_1550_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_dalon_1551_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1551_MDataSet ds = null;
		HD_DALON_1551_MDM dm = new HD_DALON_1551_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_DALON_1551_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1552_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1552_ADataSet ds = null;
		HD_DALON_1552_ADM dm = new HD_DALON_1552_ADM();


		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.chk = (String)hash.get("chk");
		dm.emp_no = (String)hash.get("emp_no");
		dm.cost_obj_clsf = (String)hash.get("cost_obj_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.out_in_plac = (String)hash.get("out_in_plac");
		dm.cost = (String)hash.get("cost");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.excl_pers_clsf = (String)hash.get("excl_pers_clsf");
		dm.tablename = (String)hash.get("tablename");
		dm.connect_ip = (String)hash.get("connect_ip");
		
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DALON_1552_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1703_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1703_LDataSet ds = null;
		HD_DALON_1703_LDM dm = new HD_DALON_1703_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.bonsa_gbn = Util.checkString(req.getParameter("bonsa_gbn"));

		dm.print();

		ds = (HD_DALON_1703_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_dalon_1050_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1050_LDataSet ds = null;
		HD_DALON_1050_LDM dm = new HD_DALON_1050_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_DALON_1050_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_dalon_1052_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1052_ADataSet ds = null;
		HD_DALON_1052_ADM dm = new HD_DALON_1052_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = (String)hash.get("seq");
		dm.prvdd_prsnt_tm_prv = (String)hash.get("prvdd_prsnt_tm_prv");
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");
		dm.prvdd_finish_tm_aft = (String)hash.get("prvdd_finish_tm_aft");
		dm.prvdd_finish_tm_prv = (String)hash.get("prvdd_finish_tm_prv");
		dm.thdd_prsnt_tm_aft = (String)hash.get("thdd_prsnt_tm_aft");
		dm.thdd_prsnt_tm_prv = (String)hash.get("thdd_prsnt_tm_prv");
		dm.prsnt_hody_clsf = (String)hash.get("prsnt_hody_clsf");
		dm.finish_hody_clsf = (String)hash.get("finish_hody_clsf");
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DALON_1052_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_dalon_1053_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1053_MDataSet ds = null;
		HD_DALON_1053_MDM dm = new HD_DALON_1053_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_DALON_1053_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	/**심야교통비지급기준테이블 
	 * @param req
	 * @param res
	 * @throws AppException
	 */
	public void hd_dalon_2030_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2030_MDataSet ds = null;
		HD_DALON_2030_MDM dm = new HD_DALON_2030_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_DALON_2030_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	/**심야교통비지급기준테이블
	 * @param req
	 * @param res
	 * @throws AppException
	 */
	public void hd_dalon_2031_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2031_LDataSet ds = null;
		HD_DALON_2031_LDM dm = new HD_DALON_2031_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_DALON_2031_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2032_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2032_ADataSet ds = null;
		HD_DALON_2032_ADM dm = new HD_DALON_2032_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = (String)hash.get("seq");
		dm.prvdd_prsnt_tm_prv = (String)hash.get("prvdd_prsnt_tm_prv");
		dm.finish_dd_clsf = (String)hash.get("finish_dd_clsf");
		dm.prvdd_finish_tm_aft = (String)hash.get("prvdd_finish_tm_aft");
		dm.prvdd_finish_tm_prv = (String)hash.get("prvdd_finish_tm_prv");
		dm.thdd_prsnt_tm_aft = (String)hash.get("thdd_prsnt_tm_aft");
		dm.thdd_prsnt_tm_prv = (String)hash.get("thdd_prsnt_tm_prv");
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_DALON_2032_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2040_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2040_MDataSet ds = null;
		HD_DALON_2040_MDM dm = new HD_DALON_2040_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_DALON_2040_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2041_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2041_LDataSet ds = null;
		HD_DALON_2041_LDM dm = new HD_DALON_2041_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));

		dm.print();

		ds = (HD_DALON_2041_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2043_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2043_ADataSet ds = null;
		HD_DALON_2043_ADM dm = new HD_DALON_2043_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.vgl_duty_dt = (String)hash.get("vgl_duty_dt");
		dm.prvdd_prsnt_tm = (String)hash.get("prvdd_prsnt_tm");
		dm.prvdd_finish_tm = (String)hash.get("prvdd_finish_tm");
		dm.thdd_prsnt_tm = (String)hash.get("thdd_prsnt_tm");
		dm.thdd_finish_tm = (String)hash.get("thdd_finish_tm");
		dm.thdd_duty_tm = (String)hash.get("thdd_duty_tm");
		dm.pay_dt = (String)hash.get("pay_dt");
		dm.pay_cost = (String)hash.get("pay_cost");
		
		dm.print();

		ds = (HD_DALON_2043_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2045_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2045_ADataSet ds = null;
		HD_DALON_2045_ADM dm = new HD_DALON_2045_ADM();
		
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
		dm.emp_no = (String)hash.get("emp_no");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = (String)hash1.get("tmp_dr_amt");
		dm.flnm = (String)hash1.get("flnm");
		dm.dept_cd = (String)hash1.get("dept_cd");

		String tmp_crdt_amt         = Util.checkString(req.getParameter("tmp_crdt_amt"));
		String titl                 = Util.checkString(req.getParameter("titl"));
  	    dm.setTmp_crdt_amt(tmp_crdt_amt);
  	    dm.setTitl(titl);
 
		dm.print();

		ds = (HD_DALON_2045_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2046_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2046_DDataSet ds = null;
		HD_DALON_2046_DDM dm = new HD_DALON_2046_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String slip_incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		
		dm.setSlip_seq(slip_seq);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_incmg_pers(slip_incmg_pers);
		dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

		dm.print();

		ds = (HD_DALON_2046_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2047_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2047_LDataSet ds = null;
		HD_DALON_2047_LDM dm = new HD_DALON_2047_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_DALON_2047_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2049_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2049_DDataSet ds = null;
		HD_DALON_2049_DDM dm = new HD_DALON_2049_DDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
		
		dm.print();

		ds = (HD_DALON_2049_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_dalon_2042_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2042_LDataSet ds = null;
		HD_DALON_2042_LDM dm = new HD_DALON_2042_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_duty_dt = Util.checkString(req.getParameter("search_duty_dt"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.search_emp_no = Util.checkString(req.getParameter("search_emp_no"));
		dm.search_dept_cd = Util.checkString(req.getParameter("search_dept_cd"));
		
		dm.print();

		ds = (HD_DALON_2042_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}