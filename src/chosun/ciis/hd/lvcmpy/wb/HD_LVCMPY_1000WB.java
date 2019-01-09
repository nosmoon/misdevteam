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

package chosun.ciis.hd.lvcmpy.wb;

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
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;
/**
 * 
 */ 

public class HD_LVCMPY_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    public void hd_lvcmpy_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1000_LDataSet ds = null;
		HD_LVCMPY_1000_LDM dm = new HD_LVCMPY_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_LVCMPY_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1001_LDataSet ds = null;
		HD_LVCMPY_1001_LDM dm = new HD_LVCMPY_1001_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_LVCMPY_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1002_LDataSet ds = null;
		HD_LVCMPY_1002_LDM dm = new HD_LVCMPY_1002_LDM();

		dm.cmpy_dt = Util.checkString(req.getParameter("cmpy_dt"));
        
        dm.print();

		ds = (HD_LVCMPY_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1003_LDataSet ds = null;
		HD_LVCMPY_1003_LDM dm = new HD_LVCMPY_1003_LDM();

		//dm.avg_tm_dt = Util.checkString(req.getParameter("lvcmpy_tm_dt"));
		dm.avg_tm_dt = Util.checkString(req.getParameter("avg_tm_dt1"));
        
        dm.print();

		ds = (HD_LVCMPY_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1004_LDataSet ds = null;
		HD_LVCMPY_1004_LDM dm = new HD_LVCMPY_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_tm_dt")); // 퇴직(중간정산)예정일
		dm.lvcmpy_tm_dt = Util.checkString(req.getParameter("avg_tm_dt1")); // 평균임금계산기준일
		dm.ov_avg_tm_dt = Util.checkString(req.getParameter("ov_avg_tm_dt")); // 평균임금계산기준일 3개월 전
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        
        dm.print();

		ds = (HD_LVCMPY_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1005_ADataSet ds = null;
		HD_LVCMPY_1005_ADM dm = new HD_LVCMPY_1005_ADM();

		dm.update_clsf = Util.checkString(req.getParameter("update_clsf"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_tm_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.lvcmpy_fr = Util.checkString(req.getParameter("in_cmpy_tm_dt"));
		dm.lvcmpy_to = Util.checkString(req.getParameter("avg_tm_dt2"));
		dm.join_year = Util.checkString(req.getParameter("join_year"));
		dm.year = Util.checkString(req.getParameter("year"));
		dm.day = Util.checkString(req.getParameter("day"));
		dm.mm_saly_1 = Util.checkString(req.getParameter("mm_saly_1"));
		dm.mm_saly_2 = Util.checkString(req.getParameter("mm_saly_2"));
		dm.mm_saly_3 = Util.checkString(req.getParameter("mm_saly_3"));
		dm.mm_saly_4 = Util.checkString(req.getParameter("mm_saly_4"));
		dm.sum_mm_saly = Util.checkString(req.getParameter("sum_mm_saly"));
		dm.mm_alon_1 = Util.checkString(req.getParameter("mm_alon_1"));
		dm.mm_alon_2 = Util.checkString(req.getParameter("mm_alon_2"));
		dm.mm_alon_3 = Util.checkString(req.getParameter("mm_alon_3"));
		dm.mm_alon_4 = Util.checkString(req.getParameter("mm_alon_4"));
		dm.sum_mm_alon = Util.checkString(req.getParameter("sum_mm_alon"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.yymm_alon = Util.checkString(req.getParameter("yymm_alon"));
		dm.avg_saly = Util.checkString(req.getParameter("avg_saly"));
		dm.lvcmpy_saly = Util.checkString(req.getParameter("lvcmpy_saly"));
		dm.lvcmpy_mm = Util.checkString(req.getParameter("lvcmpy_mm"));
		dm.lvcmpy_add_saly = Util.checkString(req.getParameter("lvcmpy_add_saly"));
		dm.sp_lvcmpy_add_saly = Util.checkString(req.getParameter("sp_lvcmpy_add_saly"));
		dm.ym_avg_saly = Util.checkString(req.getParameter("ym_avg_saly"));
		dm.year_vaca_dds = Util.checkString(req.getParameter("year_vaca_dds"));
		dm.add_vaca_dds = Util.checkString(req.getParameter("add_vaca_dds"));
		//dm.tm_vaca_dds = Util.checkString(req.getParameter("tm_vaca_dds"));
		dm.tm_vaca_dds = Util.checkString(req.getParameter("temp_vaca_dds"));
		dm.total_vaca_dds = Util.checkString(req.getParameter("total_vaca_dds"));
		dm.ym_avg_saly2 = Util.checkString(req.getParameter("ym_avg_saly2"));
		dm.year_vaca_dds2 = Util.checkString(req.getParameter("year_vaca_dds2"));
		dm.add_vaca_dds2 = Util.checkString(req.getParameter("add_vaca_dds2"));
		dm.tm_vaca_dds2 = Util.checkString(req.getParameter("temp_vaca_dds2"));
		dm.total_vaca_dds2 = Util.checkString(req.getParameter("total_vaca_dds2"));
		dm.vaca_saly = Util.checkString(req.getParameter("vaca_saly"));
		dm.lvcmpy_add_saly = Util.checkString(req.getParameter("lvcmpy_add_saly"));
		dm.sp_lvcmpy_add_saly = Util.checkString(req.getParameter("sp_lvcmpy_add_saly"));
        dm.setIncmg_pers_ipadd(req.getRemoteAddr());
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.join_year_2012 = Util.checkString(req.getParameter("join_year_2012"));
        dm.join_year_2013 = Util.checkString(req.getParameter("join_year_2013"));
        dm.avg_wag_dt = Util.checkString(req.getParameter("avg_tm_dt1"));
		dm.mm_dty_acty_1 = Util.checkString(req.getParameter("mm_dty_acty_1"));
		dm.mm_dty_acty_2 = Util.checkString(req.getParameter("mm_dty_acty_2"));
		dm.mm_dty_acty_3 = Util.checkString(req.getParameter("mm_dty_acty_3"));
		dm.mm_dty_acty_4 = Util.checkString(req.getParameter("mm_dty_acty_4"));
		dm.sum_mm_dty_acty = Util.checkString(req.getParameter("sum_mm_dty_acty"));
        
        dm.print();

		ds = (HD_LVCMPY_1005_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1006_LDataSet ds = null;
		HD_LVCMPY_1006_LDM dm = new HD_LVCMPY_1006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		
		dm.print();

		ds = (HD_LVCMPY_1006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1007_LDataSet ds = null;
		HD_LVCMPY_1007_LDM dm = new HD_LVCMPY_1007_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_LVCMPY_1007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1009_LDataSet ds = null;
		HD_LVCMPY_1009_LDM dm = new HD_LVCMPY_1009_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));

		dm.print();

		ds = (HD_LVCMPY_1009_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1010_LDataSet ds = null;
		HD_LVCMPY_1010_LDM dm = new HD_LVCMPY_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));

		dm.print();

		ds = (HD_LVCMPY_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1011_LDataSet ds = null;
		HD_LVCMPY_1011_LDM dm = new HD_LVCMPY_1011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("avg_tm_dt2"));

		dm.print();

		ds = (HD_LVCMPY_1011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1050_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1050_LDataSet ds = null;
		HD_LVCMPY_1050_LDM dm = new HD_LVCMPY_1050_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_fr = Util.checkString(req.getParameter("lvcmpy_fr"));
		dm.lvcmpy_to = Util.checkString(req.getParameter("lvcmpy_to"));
		dm.print();

		ds = (HD_LVCMPY_1050_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1100_LDataSet ds = null;
		HD_LVCMPY_1100_LDM dm = new HD_LVCMPY_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.type_clsf = Util.checkString(req.getParameter("type_clsf"));
		
		ds = (HD_LVCMPY_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1101_LDataSet ds = null;
		HD_LVCMPY_1101_LDM dm = new HD_LVCMPY_1101_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_LVCMPY_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1104_LDataSet ds = null;
		HD_LVCMPY_1104_LDM dm = new HD_LVCMPY_1104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_tm_dt")); // 퇴직(중간정산)예정일
		dm.lvcmpy_tm_dt = Util.checkString(req.getParameter("avg_tm_dt1")); // 평균임금계산기준일
		dm.in_cmpy_tm_dt = Util.checkString(req.getParameter("in_cmpy_tm_dt")); // 퇴직 예정일(시작일)
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        
        dm.print();

		ds = (HD_LVCMPY_1104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1105_ADataSet ds = null;
		HD_LVCMPY_1105_ADM dm = new HD_LVCMPY_1105_ADM();

		dm.update_clsf = Util.checkString(req.getParameter("update_clsf"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_tm_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.lvcmpy_fr = Util.checkString(req.getParameter("in_cmpy_tm_dt"));
		dm.lvcmpy_to = Util.checkString(req.getParameter("avg_tm_dt2"));
		dm.join_year = Util.checkString(req.getParameter("join_year"));
		dm.year = Util.checkString(req.getParameter("year"));
		dm.day = Util.checkString(req.getParameter("day"));
		//dm.mm_saly_1 = Util.checkString(req.getParameter("mm_saly_1"));
		//dm.mm_saly_2 = Util.checkString(req.getParameter("mm_saly_2"));
		//dm.mm_saly_3 = Util.checkString(req.getParameter("mm_saly_3"));
		//dm.mm_saly_4 = Util.checkString(req.getParameter("mm_saly_4"));
		dm.sum_mm_saly = Util.checkString(req.getParameter("sum_mm_saly"));
		//dm.mm_alon_1 = Util.checkString(req.getParameter("mm_alon_1"));
		//dm.mm_alon_2 = Util.checkString(req.getParameter("mm_alon_2"));
		//dm.mm_alon_3 = Util.checkString(req.getParameter("mm_alon_3"));
		//dm.mm_alon_4 = Util.checkString(req.getParameter("mm_alon_4"));
		dm.sum_mm_alon = Util.checkString(req.getParameter("sum_mm_alon"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.yymm_alon = Util.checkString(req.getParameter("yymm_alon"));
		dm.avg_saly = Util.checkString(req.getParameter("avg_saly"));
		dm.lvcmpy_saly = Util.checkString(req.getParameter("lvcmpy_saly"));
		dm.lvcmpy_mm = Util.checkString(req.getParameter("lvcmpy_mm"));
		dm.lvcmpy_add_saly = Util.checkString(req.getParameter("lvcmpy_add_saly"));
		dm.sp_lvcmpy_add_saly = Util.checkString(req.getParameter("sp_lvcmpy_add_saly"));
		dm.ym_avg_saly = Util.checkString(req.getParameter("ym_avg_saly"));
		dm.year_vaca_dds = Util.checkString(req.getParameter("year_vaca_dds"));
		dm.add_vaca_dds = Util.checkString(req.getParameter("add_vaca_dds"));
		//dm.tm_vaca_dds = Util.checkString(req.getParameter("tm_vaca_dds"));
		dm.tm_vaca_dds = Util.checkString(req.getParameter("temp_vaca_dds"));
		dm.total_vaca_dds = Util.checkString(req.getParameter("total_vaca_dds"));
		dm.ym_avg_saly2 = Util.checkString(req.getParameter("ym_avg_saly2"));
		dm.year_vaca_dds2 = Util.checkString(req.getParameter("year_vaca_dds2"));
		dm.add_vaca_dds2 = Util.checkString(req.getParameter("add_vaca_dds2"));
		dm.tm_vaca_dds2 = Util.checkString(req.getParameter("temp_vaca_dds2"));
		dm.total_vaca_dds2 = Util.checkString(req.getParameter("total_vaca_dds2"));
		dm.vaca_saly = Util.checkString(req.getParameter("vaca_saly"));
		dm.lvcmpy_add_saly = Util.checkString(req.getParameter("lvcmpy_add_saly"));
		dm.sp_lvcmpy_add_saly = Util.checkString(req.getParameter("sp_lvcmpy_add_saly"));
        dm.setIncmg_pers_ipadd(req.getRemoteAddr());
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.join_year_2012 = Util.checkString(req.getParameter("join_year_2012"));
        dm.join_year_2013 = Util.checkString(req.getParameter("join_year_2013"));
        dm.avg_wag_dt = Util.checkString(req.getParameter("avg_tm_dt1"));
        dm.print();
        String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.saly_pay_mm = (String)hash.get("saly_pay_mm");
        dm.saly_fr_dt = (String)hash.get("saly_fr_dt");
        dm.saly_to_dt = (String)hash.get("saly_to_dt");
        dm.saly_cnt = (String)hash.get("saly_cnt");
        dm.pay_saly1 = (String)hash.get("pay_saly1");
        dm.pay_saly2 = (String)hash.get("pay_saly2");
        dm.hody_alon1 = (String)hash.get("hody_alon1");
        dm.hody_alon2 = (String)hash.get("hody_alon2");
        dm.yymm_alon1 = (String)hash.get("yymm_alon1");
        dm.yymm_alon2 = (String)hash.get("yymm_alon2");
        
        dm.print();

		ds = (HD_LVCMPY_1105_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    public void hd_lvcmpy_1109_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1109_LDataSet ds = null;
		HD_LVCMPY_1109_LDM dm = new HD_LVCMPY_1109_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));

		dm.print();

		ds = (HD_LVCMPY_1109_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1300_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1300_UDataSet ds = null;
		HD_LVCMPY_1300_UDM dm = new HD_LVCMPY_1300_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_mm_np = Util.checkString(req.getParameter("lvcmpy_mm_np"));
		dm.lvcmpy_mm_hlth = Util.checkString(req.getParameter("lvcmpy_mm_hlth"));
		dm.lvcmpy_mm_emp = Util.checkString(req.getParameter("lvcmpy_mm_emp"));
		dm.emp_insr_fee_drbk_amt = Util.checkString(req.getParameter("emp_insr_fee_drbk_amt"));
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_LVCMPY_1300_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1301_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1301_UDataSet ds = null;
		HD_LVCMPY_1301_UDM dm = new HD_LVCMPY_1301_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.workclos = Util.checkString(req.getParameter("workclos"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_LVCMPY_1301_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1302_LDataSet ds = null;
		HD_LVCMPY_1302_LDM dm = new HD_LVCMPY_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));

		dm.print();

		ds = (HD_LVCMPY_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_1303_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_1303_MDataSet ds = null;
		HD_LVCMPY_1303_MDM dm = new HD_LVCMPY_1303_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_LVCMPY_1303_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2000_LDataSet ds = null;
		HD_LVCMPY_2000_LDM dm = new HD_LVCMPY_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.etc_saly_yy = Util.checkString(req.getParameter("etc_saly_yy"));
		
		dm.print();

		ds = (HD_LVCMPY_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2001_ADataSet ds = null;
		HD_LVCMPY_2001_ADM dm = new HD_LVCMPY_2001_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.etc_saly_cd = (String)hash.get("etc_saly_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.dr_amt = (String)hash.get("dr_amt");
		dm.crdt_amt_1 = (String)hash.get("crdt_amt_1");
		dm.crdt_amt_2 = (String)hash.get("crdt_amt_2");
		dm.cal_pay_amt = (String)hash.get("cal_pay_amt");
		dm.emp_amt = (String)hash.get("emp_amt");
		dm.np_amt = (String)hash.get("np_amt");
		dm.hlth_amt = (String)hash.get("hlth_amt");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();
        
		ds = (HD_LVCMPY_2001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2002_LDataSet ds = null;
		HD_LVCMPY_2002_LDM dm = new HD_LVCMPY_2002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.etc_saly_yy = Util.checkString(req.getParameter("etc_saly_yy"));
		dm.print();

		ds = (HD_LVCMPY_2002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2003_ADataSet ds = null;
		HD_LVCMPY_2003_ADM dm = new HD_LVCMPY_2003_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.etc_saly_yy = Util.checkString(req.getParameter("etc_saly_yy"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_LVCMPY_2003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    public void hd_lvcmpy_2004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2004_LDataSet ds = null;
		HD_LVCMPY_2004_LDM dm = new HD_LVCMPY_2004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		
		dm.print();

		ds = (HD_LVCMPY_2004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2100_LDataSet ds = null;
		HD_LVCMPY_2100_LDM dm = new HD_LVCMPY_2100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.tm_clsf = Util.checkString(req.getParameter("tm_clsf"));
		dm.print();
		
		ds = (HD_LVCMPY_2100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2101_LDataSet ds = null;
		HD_LVCMPY_2101_LDM dm = new HD_LVCMPY_2101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_LVCMPY_2101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2102_ADataSet ds = null;
		HD_LVCMPY_2102_ADM dm = new HD_LVCMPY_2102_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.nmat_yn = (String)hash.get("nmat_yn");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.spos_dduc_yn = (String)hash.get("spos_dduc_yn");
		dm.child_dduc_yn = (String)hash.get("child_dduc_yn");
		dm.oldg_dduc_yn = (String)hash.get("oldg_dduc_yn");
		dm.obcl_pers_dduc_yn = (String)hash.get("obcl_pers_dduc_yn");
		dm.rspc_dduc_yn = (String)hash.get("rspc_dduc_yn");
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();
        
		ds = (HD_LVCMPY_2102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2103_ADataSet ds = null;
		HD_LVCMPY_2103_ADM dm = new HD_LVCMPY_2103_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.zip_1 = Util.checkString(req.getParameter("zip_1"));
		dm.zip_2 = Util.checkString(req.getParameter("zip_2"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.ptph_no = Util.checkString(req.getParameter("ptph_no"));
		dm.fax_no = Util.checkString(req.getParameter("fax_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_LVCMPY_2103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2200_LDataSet ds = null;
		HD_LVCMPY_2200_LDM dm = new HD_LVCMPY_2200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_LVCMPY_2200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2201_ADataSet ds = null;
		HD_LVCMPY_2201_ADM dm = new HD_LVCMPY_2201_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_nm = (String)hash.get("cmpy_nm");
		dm.ern = (String)hash.get("ern");
		dm.impt_saly = (String)hash.get("impt_saly");
		dm.impt_bns = (String)hash.get("impt_bns");
		dm.aprv_bns_tot_amt = (String)hash.get("aprv_bns_tot_amt");
		dm.non_tax_work = (String)hash.get("non_tax_work");
		dm.non_tax_prod = (String)hash.get("non_tax_prod");
		dm.non_tax_frnc = (String)hash.get("non_tax_frnc");
		dm.non_tax_etc = (String)hash.get("non_tax_etc");
		dm.hosp_insr_fee = (String)hash.get("hosp_insr_fee");
		dm.np_pymt_amt = (String)hash.get("np_pymt_amt");
		dm.emp_insr_fee = (String)hash.get("emp_insr_fee");
		dm.deci_incm_tax = (String)hash.get("deci_incm_tax");
		dm.deci_res_tax = (String)hash.get("deci_res_tax");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_LVCMPY_2201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2202_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2202_MDataSet ds = null;
		HD_LVCMPY_2202_MDM dm = new HD_LVCMPY_2202_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_LVCMPY_2202_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2300_LDataSet ds = null;
		HD_LVCMPY_2300_LDM dm = new HD_LVCMPY_2300_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_LVCMPY_2300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2301_ADataSet ds = null;
		HD_LVCMPY_2301_ADM dm = new HD_LVCMPY_2301_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.labr_incm_amt = Util.checkString(req.getParameter("labr_incm_amt"));
		dm.base_dduc_slf = Util.checkString(req.getParameter("base_dduc_slf"));
		dm.base_dduc_spos = Util.checkString(req.getParameter("base_dduc_spos"));
		dm.boks_qunt_faml_nops = Util.checkString(req.getParameter("boks_qunt_faml_nops"));
		dm.rspc_nops = Util.checkString(req.getParameter("rspc_nops"));
		dm.addm_dduc_obcl_pers = Util.checkString(req.getParameter("addm_dduc_obcl_pers"));
		dm.addm_dduc_fml_hshd = Util.checkString(req.getParameter("addm_dduc_fml_hshd"));
		dm.addm_dduc_care_fee = Util.checkString(req.getParameter("addm_dduc_care_fee"));
		dm.mj1birth_ibyang = Util.checkString(req.getParameter("mj1birth_ibyang"));
		dm.multi_child_addm_dduc = Util.checkString(req.getParameter("multi_child_addm_dduc"));
		dm.np_insr_fee_dduc = Util.checkString(req.getParameter("np_insr_fee_dduc"));
		dm.spc_dduc_insr_fee = Util.checkString(req.getParameter("spc_dduc_insr_fee"));
		dm.spc_dduc_hosp_fee = Util.checkString(req.getParameter("spc_dduc_hosp_fee"));
		dm.spc_dduc_hous_fund = Util.checkString(req.getParameter("spc_dduc_hous_fund"));
		dm.spc_dduc_dona_amt = Util.checkString(req.getParameter("spc_dduc_dona_amt"));
		dm.spc_dduc_wedd_etc = Util.checkString(req.getParameter("spc_dduc_wedd_etc"));
		dm.spc_dduc_stot = Util.checkString(req.getParameter("spc_dduc_stot"));
		dm.std_dduc_amt = Util.checkString(req.getParameter("std_dduc_amt"));
		dm.dedu_labr_incm_amt = Util.checkString(req.getParameter("dedu_labr_incm_amt"));
		dm.tax_amt_dduc_labr_incm = Util.checkString(req.getParameter("tax_amt_dduc_labr_incm"));
		dm.tax_amt_dduc_polt_fund = Util.checkString(req.getParameter("tax_amt_dduc_polt_fund"));
		dm.tax_amt_dduc_hous_loan_amt = Util.checkString(req.getParameter("tax_amt_dduc_hous_loan_amt"));
		dm.tax_amt_dduc_forn_pymt = Util.checkString(req.getParameter("tax_amt_dduc_forn_pymt"));
		dm.tax_amt_dduc_stot = Util.checkString(req.getParameter("tax_amt_dduc_stot"));
		dm.hous_mogg_loan_amt_int = Util.checkString(req.getParameter("hous_mogg_loan_amt_int"));
		dm.prsn_pens_pymt_amt = Util.checkString(req.getParameter("prsn_pens_pymt_amt"));
		dm.pens_savg_pymt_amt = Util.checkString(req.getParameter("pens_savg_pymt_amt"));
		dm.plac_cmpy_plac_trad_authr = Util.checkString(req.getParameter("plac_cmpy_plac_trad_authr"));
		dm.hous_fund_pymt_amt = Util.checkString(req.getParameter("hous_fund_pymt_amt"));
		dm.invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
		dm.emp_stok_ownr_cmpd_dona_amt = Util.checkString(req.getParameter("emp_stok_ownr_cmpd_dona_amt"));
		dm.crdt_non_pcc_use = Util.checkString(req.getParameter("crdt_non_pcc_use"));
		dm.ltrm_stok_type_savg_incm = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm"));
		dm.non_tax_frnc_01 = Util.checkString(req.getParameter("non_tax_frnc_01"));
		dm.non_tax_jrnst_01 = Util.checkString(req.getParameter("non_tax_jrnst_01"));
		dm.non_tax_frnc_02 = Util.checkString(req.getParameter("non_tax_frnc_02"));
		dm.non_tax_jrnst_02 = Util.checkString(req.getParameter("non_tax_jrnst_02"));
		dm.non_tax_frnc_03 = Util.checkString(req.getParameter("non_tax_frnc_03"));
		dm.non_tax_jrnst_03 = Util.checkString(req.getParameter("non_tax_jrnst_03"));
		dm.non_tax_frnc_04 = Util.checkString(req.getParameter("non_tax_frnc_04"));
		dm.non_tax_jrnst_04 = Util.checkString(req.getParameter("non_tax_jrnst_04"));
		dm.non_tax_frnc_05 = Util.checkString(req.getParameter("non_tax_frnc_05"));
		dm.non_tax_jrnst_05 = Util.checkString(req.getParameter("non_tax_jrnst_05"));
		dm.non_tax_frnc_06 = Util.checkString(req.getParameter("non_tax_frnc_06"));
		dm.non_tax_jrnst_06 = Util.checkString(req.getParameter("non_tax_jrnst_06"));
		dm.non_tax_frnc_07 = Util.checkString(req.getParameter("non_tax_frnc_07"));
		dm.non_tax_jrnst_07 = Util.checkString(req.getParameter("non_tax_jrnst_07"));
		dm.non_tax_frnc_08 = Util.checkString(req.getParameter("non_tax_frnc_08"));
		dm.non_tax_jrnst_08 = Util.checkString(req.getParameter("non_tax_jrnst_08"));
		dm.non_tax_frnc_09 = Util.checkString(req.getParameter("non_tax_frnc_09"));
		dm.non_tax_jrnst_09 = Util.checkString(req.getParameter("non_tax_jrnst_09"));
		dm.non_tax_frnc_10 = Util.checkString(req.getParameter("non_tax_frnc_10"));
		dm.non_tax_jrnst_10 = Util.checkString(req.getParameter("non_tax_jrnst_10"));
		dm.non_tax_frnc_11 = Util.checkString(req.getParameter("non_tax_frnc_11"));
		dm.non_tax_jrnst_11 = Util.checkString(req.getParameter("non_tax_jrnst_11"));
		dm.non_tax_frnc_12 = Util.checkString(req.getParameter("non_tax_frnc_12"));
		dm.non_tax_jrnst_12 = Util.checkString(req.getParameter("non_tax_jrnst_12"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_LVCMPY_2301_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2400_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2400_ADataSet ds = null;
		HD_LVCMPY_2400_ADM dm = new HD_LVCMPY_2400_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_LVCMPY_2400_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2500_LDataSet ds = null;
		HD_LVCMPY_2500_LDM dm = new HD_LVCMPY_2500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_LVCMPY_2500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2501_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2501_ADataSet ds = null;
		HD_LVCMPY_2501_ADM dm = new HD_LVCMPY_2501_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.incmp_welf_livg_lon_bal = Util.checkString(req.getParameter("incmp_welf_livg_lon_bal"));
		dm.incmp_welf_livg_lon_int = Util.checkString(req.getParameter("incmp_welf_livg_lon_int"));
		dm.jrnst_safe_livg_patr_bal = Util.checkString(req.getParameter("jrnst_safe_livg_patr_bal"));
		dm.jrnst_safe_livg_patr_int = Util.checkString(req.getParameter("jrnst_safe_livg_patr_int"));
		dm.lvmpy_amt_etc_dduc_nm = Util.checkString(req.getParameter("lvmpy_amt_etc_dduc_nm"));
		dm.lvmpy_amt_etc_dduc = Util.checkString(req.getParameter("lvmpy_amt_etc_dduc"));
		dm.adv_bal = Util.checkString(req.getParameter("adv_bal"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_LVCMPY_2501_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2502_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2502_MDataSet ds = null;
		HD_LVCMPY_2502_MDM dm = new HD_LVCMPY_2502_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_LVCMPY_2502_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2600_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2600_ADataSet ds = null;
		HD_LVCMPY_2600_ADM dm = new HD_LVCMPY_2600_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.lvcmpy_dt_tm = Util.checkString(req.getParameter("lvcmpy_dt_tm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_LVCMPY_2600_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2601_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_LVCMPY_2601_ADataSet ds = null;
		HD_LVCMPY_2601_ADM dm = new HD_LVCMPY_2601_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.lvcmpy_dt_tm = Util.checkString(req.getParameter("lvcmpy_dt_tm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.jms_yn = Util.checkString(req.getParameter("jms_yn"));

		dm.print();

		ds = (HD_LVCMPY_2601_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2601_2013_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_LVCMPY_2601_2013_ADataSet ds = null;
		HD_LVCMPY_2601_2013_ADM dm = new HD_LVCMPY_2601_2013_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.lvcmpy_dt_tm = Util.checkString(req.getParameter("lvcmpy_dt_tm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.jms_yn = Util.checkString(req.getParameter("jms_yn"));
        dm.midl_incd_clsf = Util.checkString(req.getParameter("midl_incd_clsf"));
        dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));

		dm.print();

		ds = (HD_LVCMPY_2601_2013_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2602_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2602_MDataSet ds = null;
		HD_LVCMPY_2602_MDM dm = new HD_LVCMPY_2602_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_LVCMPY_2602_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2605_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_LVCMPY_2605_ADataSet ds = null;
		HD_LVCMPY_2605_ADM dm = new HD_LVCMPY_2605_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
	//	dm.adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
		dm.flnm    = Util.checkString(req.getParameter("flnm"));
		dm.ernm = Util.checkString(req.getParameter("ernm"));
		dm.ern_no = Util.checkString(req.getParameter("ern_no"));
		dm.acct_no = Util.checkString(req.getParameter("acct_no"));
		dm.lgl_rcpm_amt = Util.checkString(req.getParameter("lgl_rcpm_amt"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.irp_amt = Util.checkString(req.getParameter("irp_amt"));
        dm.lvcmpy_dt  = Util.checkString(req.getParameter("lvcmpy_dt"));
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_LVCMPY_2605_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2606_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2606_LDataSet ds = null;
		HD_LVCMPY_2606_LDM dm = new HD_LVCMPY_2606_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));

		dm.print();

		ds = (HD_LVCMPY_2606_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    public void hd_lvcmpy_2700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2700_LDataSet ds = null;
		HD_LVCMPY_2700_LDM dm = new HD_LVCMPY_2700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("in_lvcmpy_dt"));

		dm.print();

		ds = (HD_LVCMPY_2700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2701_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2701_ADataSet ds = null;
		HD_LVCMPY_2701_ADM dm = new HD_LVCMPY_2701_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.check = (String)hash.get("check");
		dm.emp_no = (String)hash.get("emp_no");
		dm.lvcmpy_dt = (String)hash.get("lvcmpy_dt");
		dm.real_pay_saly = (String)hash.get("real_pay_saly");
		dm.no1 = (String)hash.get("no1");
		dm.no2 = (String)hash.get("no2");
		dm.no3 = (String)hash.get("no3");
		dm.no5 = (String)hash.get("no5");
		dm.no7 = (String)hash.get("no7");
		dm.no8 = (String)hash.get("no8");
		dm.no9 = (String)hash.get("no9");
		dm.no10 = (String)hash.get("no10");
		dm.no11 = (String)hash.get("no11");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_LVCMPY_2701_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_lvcmpy_2704_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2704_LDataSet ds = null;
		HD_LVCMPY_2704_LDM dm = new HD_LVCMPY_2704_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_slip_occr_dt = Util.checkString(req.getParameter("in_slip_occr_dt"));
		dm.in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
		dm.in_slip_clsf_cd = Util.checkString(req.getParameter("in_slip_clsf_cd"));
		dm.print();

		ds = (HD_LVCMPY_2704_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}    
	

	public void hd_lvcmpy_2705_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2705_ADataSet ds = null;
		HD_LVCMPY_2705_ADM dm = new HD_LVCMPY_2705_ADM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.in_lvcmpy_dt = Util.checkString(req.getParameter("in_lvcmpy_dt"));
		dm.in_slip_occr_dt = Util.checkString(req.getParameter("in_slip_occr_dt"));
		dm.in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
		
		dm.in_acctgb = "H";
		dm.in_managecd = " ";
		dm.lvcmpy_clsf = "BH";
		dm.comp_dt = " ";

		/*
		dm.in_gisan_cymd = Util.checkString(req.getParameter("in_gisan_cymd"));
		dm.in_acctgb = Util.checkString(req.getParameter("in_acctgb"));
		dm.in_managecd = Util.checkString(req.getParameter("in_managecd"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		*/
		dm.no1 = ((String)hash1.get("no1"));
		dm.no2 = ((String)hash1.get("no2"));
		dm.no3 = ((String)hash1.get("no3"));
		dm.no5 = ((String)hash1.get("no5"));
		dm.no7 = ((String)hash1.get("no7"));
		dm.no8 = ((String)hash1.get("no8"));
		dm.no9 = ((String)hash1.get("no9"));
		dm.no10 = ((String)hash1.get("no10"));
		dm.no11 = ((String)hash1.get("no11"));
		dm.real_pay_lvcmpy_saly = ((String)hash1.get("real_pay_lvcmpy_saly"));
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_LVCMPY_2705_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_lvcmpy_2706_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2706_DDataSet ds = null;
		HD_LVCMPY_2706_DDM dm = new HD_LVCMPY_2706_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.in_lvcmpy_dt = Util.checkString(req.getParameter("in_lvcmpy_dt"));
		dm.in_slip_occr_dt = Util.checkString(req.getParameter("in_slip_occr_dt"));
		dm.in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_LVCMPY_2706_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_lvcmpy_2707_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2707_MDataSet ds = null;
		HD_LVCMPY_2707_MDM dm = new HD_LVCMPY_2707_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_LVCMPY_2707_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_lvcmpy_2800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2800_LDataSet ds = null;
		HD_LVCMPY_2800_LDM dm = new HD_LVCMPY_2800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_LVCMPY_2800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2801_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2801_LDataSet ds = null;
		HD_LVCMPY_2801_LDM dm = new HD_LVCMPY_2801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));

		dm.print();

		ds = (HD_LVCMPY_2801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_lvcmpy_2802_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_2802_LDataSet ds = null;
		HD_LVCMPY_2802_LDM dm = new HD_LVCMPY_2802_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.search_tm = Util.checkString(req.getParameter("search_tm"));

		dm.print();

		ds = (HD_LVCMPY_2802_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_lvcmpy_3000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3000_ADataSet ds = null;
		HD_LVCMPY_3000_ADM dm = new HD_LVCMPY_3000_ADM();

		String emp_dtls_clsf_ratio = Util.checkString(req.getParameter("emp_dtls_clsf_ratio"));
		String emp_clsf_ratio = Util.checkString(req.getParameter("emp_clsf_ratio"));
		
		
		if("".equals(emp_dtls_clsf_ratio)) {
			emp_dtls_clsf_ratio = "1";
		}
		
		if("".equals(emp_clsf_ratio)) {
			emp_clsf_ratio = "1";
		}
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.estm_clsf = Util.checkString(req.getParameter("estm_clsf"));
		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		dm.emp_dtls_clsf_ratio = emp_dtls_clsf_ratio;
		dm.emp_clsf_ratio = emp_clsf_ratio;
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_LVCMPY_3000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
    
    public void hd_lvcmpy_3100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3100_MDataSet ds = null;
		HD_LVCMPY_3100_MDM dm = new HD_LVCMPY_3100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_LVCMPY_3100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_lvcmpy_3103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3103_ADataSet ds = null;
		HD_LVCMPY_3103_ADM dm = new HD_LVCMPY_3103_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.estm_dt = Util.checkString(req.getParameter("estm_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_occr_seq = Util.checkString(req.getParameter("slip_occr_seq"));
		dm.acml_yy = Util.checkString(req.getParameter("acml_yy"));
		dm.acml_mm = Util.checkString(req.getParameter("acml_mm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_LVCMPY_3103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}    
	

	public void hd_lvcmpy_3104_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3104_DDataSet ds = null;
		HD_LVCMPY_3104_DDM dm = new HD_LVCMPY_3104_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.estm_dt = Util.checkString(req.getParameter("estm_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_occr_seq = Util.checkString(req.getParameter("slip_occr_seq"));
		dm.acml_yy = Util.checkString(req.getParameter("acml_yy"));
		dm.acml_mm = Util.checkString(req.getParameter("acml_mm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		
		dm.print();

		ds = (HD_LVCMPY_3104_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	 
    public void hd_lvcmpy_3001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3001_ADataSet ds = null;
		HD_LVCMPY_3001_ADM dm = new HD_LVCMPY_3001_ADM();

		String emp_dtls_clsf_ratio = Util.checkString(req.getParameter("emp_dtls_clsf_ratio"));
		String emp_clsf_ratio = Util.checkString(req.getParameter("emp_clsf_ratio"));
		
		
		if("".equals(emp_dtls_clsf_ratio)) {
			emp_dtls_clsf_ratio = "1";
		}
		
		if("".equals(emp_clsf_ratio)) {
			emp_clsf_ratio = "1";
		}
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.estm_clsf = Util.checkString(req.getParameter("estm_clsf"));
		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		dm.emp_dtls_clsf_ratio = emp_dtls_clsf_ratio;
		dm.emp_clsf_ratio = emp_clsf_ratio;
		//dm.emp_dtls_clsf_ratio = Util.checkString(req.getParameter("emp_dtls_clsf_ratio"));
		//dm.emp_clsf_ratio = Util.checkString(req.getParameter("emp_clsf_ratio"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_LVCMPY_3001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_lvcmpy_3200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3200_LDataSet ds = null;
		HD_LVCMPY_3200_LDM dm = new HD_LVCMPY_3200_LDM();

		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_LVCMPY_3200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	    
	public void hd_lvcmpy_3300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3300_LDataSet ds = null;
		HD_LVCMPY_3300_LDM dm = new HD_LVCMPY_3300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));

		dm.print();

		ds = (HD_LVCMPY_3300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3400_LDataSet ds = null;
		HD_LVCMPY_3400_LDM dm = new HD_LVCMPY_3400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		dm.day_clsf = Util.checkString(req.getParameter("day_clsf"));

		dm.print();

		ds = (HD_LVCMPY_3400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3500_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3500_ADataSet ds = null;
		HD_LVCMPY_3500_ADM dm = new HD_LVCMPY_3500_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		
		dm.acml_yy = estm_work_dt.substring(0, 4);
		dm.acml_mm = estm_work_dt.substring(4, 6);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_LVCMPY_3500_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3502_LDataSet ds = null;
		HD_LVCMPY_3502_LDM dm = new HD_LVCMPY_3502_LDM();

		String estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acml_yy = estm_work_dt.substring(0, 4);
		dm.acml_mm = estm_work_dt.substring(4, 6);

		dm.print();

		ds = (HD_LVCMPY_3502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_lvcmpy_3503_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_LVCMPY_3503_LDataSet ds = null;
		HD_LVCMPY_3503_LDM dm = new HD_LVCMPY_3503_LDM();

		String estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acml_yy = estm_work_dt.substring(0, 4);
		dm.acml_mm = estm_work_dt.substring(4, 6);


		dm.print();

		ds = (HD_LVCMPY_3503_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3504_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3504_ADataSet ds = null;
		HD_LVCMPY_3504_ADM dm = new HD_LVCMPY_3504_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acml_dt = Util.checkString(req.getParameter("acml_dt"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_LVCMPY_3504_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3505_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3505_ADataSet ds = null;
		HD_LVCMPY_3505_ADM dm = new HD_LVCMPY_3505_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acml_dt = Util.checkString(req.getParameter("acml_dt"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_LVCMPY_3505_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3002_ADataSet ds = null;
		HD_LVCMPY_3002_ADM dm = new HD_LVCMPY_3002_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.estm_clsf = Util.checkString(req.getParameter("estm_clsf"));
		dm.estm_yy = Util.checkString(req.getParameter("estm_yy"));
		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		dm.emp_dtls_clsf_ratio = Util.checkString(req.getParameter("emp_dtls_clsf_ratio"));
		dm.emp_clsf_ratio = Util.checkString(req.getParameter("emp_clsf_ratio"));
		dm.estm_fr_dt = Util.checkString(req.getParameter("estm_fr_dt"));
		dm.estm_to_dt = Util.checkString(req.getParameter("estm_to_dt"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_LVCMPY_3002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3003_ADataSet ds = null;
		HD_LVCMPY_3003_ADM dm = new HD_LVCMPY_3003_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.estm_clsf = Util.checkString(req.getParameter("estm_clsf"));
		dm.estm_yy = Util.checkString(req.getParameter("estm_yy"));
		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		dm.emp_dtls_clsf_ratio = Util.checkString(req.getParameter("emp_dtls_clsf_ratio"));
		dm.emp_clsf_ratio = Util.checkString(req.getParameter("emp_clsf_ratio"));
		dm.estm_fr_dt = Util.checkString(req.getParameter("estm_fr_dt"));
		dm.estm_to_dt = Util.checkString(req.getParameter("estm_to_dt"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_LVCMPY_3003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_1017_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1017_LDataSet ds = null;
		HD_LVCMPY_1017_LDM dm = new HD_LVCMPY_1017_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_LVCMPY_1017_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
	}
	
	public void hd_lvcmpy_1018_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1018_LDataSet ds = null;
		HD_LVCMPY_1018_LDM dm = new HD_LVCMPY_1018_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));

		dm.print();

		ds = (HD_LVCMPY_1018_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
	}
	
	public void hd_lvcmpy_3600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL"); 
		HD_LVCMPY_3600_LDataSet ds = null;
		HD_LVCMPY_3600_LDM dm = new HD_LVCMPY_3600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.priv_lvc_yn = Util.checkString(req.getParameter("priv_lvc_yn"));

		dm.print();

		ds = (HD_LVCMPY_3600_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3601_LDataSet ds = null;
		HD_LVCMPY_3601_LDM dm = new HD_LVCMPY_3601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_LVCMPY_3601_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_lvcmpy_3401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3401_LDataSet ds = null;
		HD_LVCMPY_3401_LDM dm = new HD_LVCMPY_3401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_LVCMPY_3401_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
}