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

package chosun.ciis.hd.crcl.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;
import java.util.Hashtable;

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
import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.ds.*;
/**
 * 
 */

public class HD_CRCL_1000WB extends BaseWB {

	public void hd_crcl_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1000_MDataSet ds = null;
		HD_CRCL_1000_MDM dm = new HD_CRCL_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_CRCL_1000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1001_LDataSet ds = null;
		HD_CRCL_1001_LDM dm = new HD_CRCL_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_CRCL_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1002_ADataSet ds = null;
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

		HD_CRCL_1002_ADM dm = new HD_CRCL_1002_ADM();
		
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String mode = (String)hash.get("m");
		String paty_crc_cd = (String)hash.get("paty_crc_cd");
		String bgn_dty_cd = (String)hash.get("bgn_dty_cd");
		String end_dty_cd = (String)hash.get("end_dty_cd");
		String fix_fix_rate_clsf = (String)hash.get("fix_fix_rate_clsf");
		String rgla_dduc_dus = (String)hash.get("rgla_dduc_dus");
		String rgla_dduc_ratio = (String)hash.get("rgla_dduc_ratio");
		
		dm.setMode(mode.toUpperCase());
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setPaty_crc_cd(paty_crc_cd);
		dm.setBgn_dty_cd(bgn_dty_cd);
		dm.setEnd_dty_cd(end_dty_cd);
		dm.setFix_fix_rate_clsf(fix_fix_rate_clsf);
		dm.setRgla_dduc_dus(rgla_dduc_dus);
		dm.setRgla_dduc_ratio(rgla_dduc_ratio);
		dm.setIncmg_pers_ipadd(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_CRCL_1002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1100_MDataSet ds = null;
		HD_CRCL_1100_MDM dm = new HD_CRCL_1100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_CRCL_1100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1101_LDataSet ds = null;
		HD_CRCL_1101_LDM dm = new HD_CRCL_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.from_dt = Util.checkString(req.getParameter("from_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.print();

		ds = (HD_CRCL_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1102_ADataSet ds = null;
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

		HD_CRCL_1102_ADM dm = new HD_CRCL_1102_ADM();

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.paty_crc_cd = (String)hash.get("paty_crc_cd");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.bank_acct_no = (String)hash.get("bank_acct_no");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_CRCL_1102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1103_LDataSet ds = null;
		HD_CRCL_1103_LDM dm = new HD_CRCL_1103_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.print();

		ds = (HD_CRCL_1103_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1200_LDataSet ds = null;
		HD_CRCL_1200_LDM dm = new HD_CRCL_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_CRCL_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1201_LDataSet ds = null;
		HD_CRCL_1201_LDM dm = new HD_CRCL_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_CRCL_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1202_ADataSet ds = null;
		HD_CRCL_1202_ADM dm = new HD_CRCL_1202_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
		dm.entr_dt = Util.checkString(req.getParameter("entr_dt"));
		dm.lve_dt = Util.checkString(req.getParameter("lve_dt"));
		dm.entr_yn = Util.checkString(req.getParameter("entr_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_CRCL_1202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_crcl_1203_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1203_MDataSet ds = null;
		HD_CRCL_1203_MDM dm = new HD_CRCL_1203_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_CRCL_1203_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_crcl_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1300_LDataSet ds = null;
		HD_CRCL_1300_LDM dm = new HD_CRCL_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.from_dt = Util.checkString(req.getParameter("from_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.entr_clsf = Util.checkString(req.getParameter("entr_clsf"));
		dm.print();

		ds = (HD_CRCL_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1301_ADataSet ds = null;
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		HD_CRCL_1301_ADM dm = new HD_CRCL_1301_ADM();
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.paty_crc_cd = (String)hash.get("paty_crc_cd");
		dm.entr_dt = (String)hash.get("entr_dt");
		dm.lve_dt = (String)hash.get("lve_dt");
		dm.entr_yn = (String)hash.get("entr_yn");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_CRCL_1301_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1302_LDataSet ds = null;
		HD_CRCL_1302_LDM dm = new HD_CRCL_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.print();

		ds = (HD_CRCL_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_crcl_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CRCL_1400_LDataSet ds = null;
		HD_CRCL_1400_LDM dm = new HD_CRCL_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
		dm.from_dt = Util.checkString(req.getParameter("from_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.entr_clsf = Util.checkString(req.getParameter("entr_clsf"));
		
		dm.print();

		ds = (HD_CRCL_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

}
