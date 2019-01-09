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

package chosun.ciis.hd.job.wb;

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
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.ds.*;
/**
 * 
 */

public class HD_JOB_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    public void hd_job_1000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1000_LDataSet ds = null;

        // DM Setting
    	HD_JOB_1000_LDM dm = new HD_JOB_1000_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_JOB_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void hd_job_1001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1001_LDataSet ds = null;

        // DM Setting
    	HD_JOB_1001_LDM dm = new HD_JOB_1001_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.emp_no = Util.checkString(req.getParameter("emp_no"));
    	dm.print();
		
		ds = (HD_JOB_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_job_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_JOB_1002_ADataSet ds = null;
		HD_JOB_1002_ADM dm = new HD_JOB_1002_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.part_cd = (String)hash.get("part_cd");
		dm.in_cmpy_posk_cd = (String)hash.get("in_cmpy_posk_cd");
		dm.chrg_job = (String)hash.get("chrg_job");
		dm.dtls_job = (String)hash.get("dtls_job");
		dm.aprv_stat = (String)hash.get("aprv_stat");
		dm.emp_no_tm = Util.checkString(req.getParameter("app_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.dtls_cd1_1 = (String)hash.get("dtls_cd1_1");
		dm.dtls_cd2_1 = (String)hash.get("dtls_cd2_1");
		dm.dtls_cd1_2 = (String)hash.get("dtls_cd1_2");
		dm.dtls_cd2_2 = (String)hash.get("dtls_cd2_2");

		dm.print();

		ds = (HD_JOB_1002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_job_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_JOB_1003_LDataSet ds = null;
		HD_JOB_1003_LDM dm = new HD_JOB_1003_LDM();

		dm.tm_frdt = Util.checkString(req.getParameter("tm_frdt"));

		dm.print();

		ds = (HD_JOB_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_job_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_JOB_1004_LDataSet ds = null;
		HD_JOB_1004_LDM dm = new HD_JOB_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_JOB_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_job_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_JOB_1005_LDataSet ds = null;
		HD_JOB_1005_LDM dm = new HD_JOB_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_JOB_1005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_job_1006_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1006_MDataSet ds = null;

        // DM Setting
    	HD_JOB_1006_MDM dm = new HD_JOB_1006_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    	dm.print();
		
		ds = (HD_JOB_1006_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_job_1110_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1110_MDataSet ds = null;

        // DM Setting
    	HD_JOB_1110_MDM dm = new HD_JOB_1110_MDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.gbn     = Util.checkString(req.getParameter("gbn"));
		
        dm.print();

		ds = (HD_JOB_1110_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_job_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1100_LDataSet ds = null;

        // DM Setting
    	HD_JOB_1100_LDM dm = new HD_JOB_1100_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));
		dm.aprv_stat = Util.checkString(req.getParameter("aprv_stat"));
		dm.ss_emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		
        dm.print();

		ds = (HD_JOB_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void hd_job_1101(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1101_LDataSet ds = null;

        // DM Setting
    	HD_JOB_1101_LDM dm = new HD_JOB_1101_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("tmp_emp_no"));
		
		dm.print();
		
		ds = (HD_JOB_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void hd_job_1102(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1102_UDataSet ds = null;
		HD_JOB_1102_UDM dm = new HD_JOB_1102_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.save = (String)hash.get("save");
		dm.emp_no = (String)hash.get("emp_no");
        dm.seq = (String)hash.get("seq");
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_JOB_1102_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void hd_job_1103(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_JOB_1103_ADataSet ds = null;
		HD_JOB_1103_ADM dm = new HD_JOB_1103_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.part_cd = (String)hash.get("part_cd");
		dm.cmpy_posk_cd = (String)hash.get("cmpy_posk_cd");
		dm.chrg_job = (String)hash.get("chrg_job");
		dm.dtls_job = (String)hash.get("dtls_job");
		dm.aprv_stat = (String)hash.get("aprv_stat");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.dtls_cd1_1 = (String)hash.get("dtls_cd1_1");
		dm.dtls_cd2_1 = (String)hash.get("dtls_cd2_1");
		dm.dtls_cd1_2 = (String)hash.get("dtls_cd1_2");
		dm.dtls_cd2_2 = (String)hash.get("dtls_cd2_2");
        
        dm.print();

		ds = (HD_JOB_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_job_1104_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_JOB_1104_ADataSet ds = null;
		HD_JOB_1104_ADM dm = new HD_JOB_1104_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");

		dm.print();

		ds = (HD_JOB_1104_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_job_1105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
		HD_JOB_1105_ADataSet ds = null;
		HD_JOB_1105_ADM dm = new HD_JOB_1105_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_JOB_1105_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_job_1106_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_JOB_1106_MDataSet ds = null;
		HD_JOB_1106_MDM dm = new HD_JOB_1106_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_JOB_1106_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_job_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_JOB_1200_LDataSet ds = null;
		HD_JOB_1200_LDM dm = new HD_JOB_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_JOB_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_job_1201_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_JOB_1201_UDataSet ds = null;
		HD_JOB_1201_UDM dm = new HD_JOB_1201_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.send = (String)hash.get("send");
		dm.retu = (String)hash.get("retu");
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.emp_no_tm = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_JOB_1201_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_job_1202_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_JOB_1202_MDataSet ds = null;
		HD_JOB_1202_MDM dm = new HD_JOB_1202_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_JOB_1202_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
