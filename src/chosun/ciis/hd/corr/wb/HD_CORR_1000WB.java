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

package chosun.ciis.hd.corr.wb;

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
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.ds.*;
/**
 * 
 */
 
public class HD_CORR_1000WB extends BaseWB {
 
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

 
	public void hd_corr_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1000_LDataSet ds = null;
		HD_CORR_1000_LDM dm = new HD_CORR_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_CORR_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_corr_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1010_LDataSet ds = null;
		HD_CORR_1010_LDM dm = new HD_CORR_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.pay_yymm = Util.checkString(req.getParameter("pay_yymm"));

		dm.print();

		ds = (HD_CORR_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_corr_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1011_LDataSet ds = null;
		HD_CORR_1011_LDM dm = new HD_CORR_1011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_CORR_1011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	} 

	public void hd_corr_1012_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1012_ADataSet ds = null;
		HD_CORR_1012_ADM dm = new HD_CORR_1012_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
			
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.pay_yymm = (String)hash.get("pay_yymm");
		dm.istt_cost_cd = (String)hash.get("istt_cost_cd");
		dm.istt_cost_ptcr = (String)hash.get("istt_cost_ptcr");
		dm.frex_clsf = (String)hash.get("frex_clsf");
		dm.aplc_frex = (String)hash.get("aplc_frex");
		dm.aplc_won = (String)hash.get("aplc_won");
		dm.adjm_frex = (String)hash.get("adjm_frex");
		dm.adjm_won = (String)hash.get("adjm_won");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.flnm = (String)hash.get("flnm");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.natn_cd = (String)hash.get("natn_cd");
		dm.duty_area = (String)hash.get("duty_area");		
		dm.remk = (String)hash.get("remk");
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);		

		dm.print();
		
		ds = (HD_CORR_1012_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_corr_1013_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1013_ADataSet ds = null;
		HD_CORR_1013_ADM dm = new HD_CORR_1013_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.pay_yymm = Util.checkString(req.getParameter("pay_yymm"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);		

		dm.print();
		
		ds = (HD_CORR_1013_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_corr_1014_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1014_MDataSet ds = null;
		HD_CORR_1014_MDM dm = new HD_CORR_1014_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);	

		dm.print();
		
		ds = (HD_CORR_1014_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_corr_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1020_LDataSet ds = null;
		HD_CORR_1020_LDM dm = new HD_CORR_1020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));

		dm.print();

		ds = (HD_CORR_1020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_corr_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1100_LDataSet ds = null;
		HD_CORR_1100_LDM dm = new HD_CORR_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_yymm = Util.checkString(req.getParameter("pay_yymm"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.print();

		ds = (HD_CORR_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_corr_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1101_LDataSet ds = null;
		HD_CORR_1101_LDM dm = new HD_CORR_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_CORR_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_corr_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1102_LDataSet ds = null;
		HD_CORR_1102_LDM dm = new HD_CORR_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();

		ds = (HD_CORR_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_corr_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1103_ADataSet ds = null;
		HD_CORR_1103_ADM dm = new HD_CORR_1103_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));		
		
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		dm.mode = ((String)hash.get("m")).toUpperCase();
		
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.pay_yymm = (String)hash.get("pay_yymm");
		dm.istt_cost_cd = (String)hash.get("istt_cost_cd");
		dm.istt_cost_ptcr = (String)hash.get("istt_cost_ptcr");
		dm.frex_clsf = (String)hash.get("frex_clsf");
		dm.aplc_frex = (String)hash.get("aplc_frex");
		dm.aplc_won = (String)hash.get("aplc_won");
		dm.adjm_frex = (String)hash.get("adjm_frex");
		dm.adjm_won = (String)hash.get("adjm_won");
		dm.remk = (String)hash.get("remk");
		
		dm.aplc_frex_stot = Util.checkString(req.getParameter("aplc_frex_stot")).trim();
		dm.aplc_won_stot = Util.checkString(req.getParameter("aplc_won_stot")).trim();
		dm.aplc_exrate = Util.checkString(req.getParameter("aplc_exrate")).trim();
		dm.adjm_won_stot = Util.checkString(req.getParameter("adjm_won_stot")).trim();
		dm.adjm_frex_stot = Util.checkString(req.getParameter("adjm_frex_stot")).trim();
		dm.adjm_exrate = Util.checkString(req.getParameter("adjm_exrate")).trim();
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);		
		
		dm.print();

		ds = (HD_CORR_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_corr_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1200_LDataSet ds = null;
		HD_CORR_1200_LDM dm = new HD_CORR_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_pay_yymm = Util.checkString(req.getParameter("fr_pay_yymm"));
		dm.to_pay_yymm = Util.checkString(req.getParameter("to_pay_yymm"));
		dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
		dm.duty_area = Util.checkString(req.getParameter("duty_area"));

		dm.print();

		ds = (HD_CORR_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_corr_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1201_LDataSet ds = null;
		HD_CORR_1201_LDM dm = new HD_CORR_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_CORR_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_corr_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1300_LDataSet ds = null;
		HD_CORR_1300_LDM dm = new HD_CORR_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_pay_yymm = Util.checkString(req.getParameter("fr_pay_yymm"));
		dm.to_pay_yymm = Util.checkString(req.getParameter("to_pay_yymm"));
		dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
		dm.duty_area = Util.checkString(req.getParameter("duty_area"));

		dm.print();

		ds = (HD_CORR_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_corr_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1301_LDataSet ds = null;
		HD_CORR_1301_LDM dm = new HD_CORR_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_CORR_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_corr_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1400_LDataSet ds = null;
		HD_CORR_1400_LDM dm = new HD_CORR_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		dm.real_reinst_return_dt = Util.checkString(req.getParameter("real_reinst_return_dt"));
		dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
		dm.duty_area = Util.checkString(req.getParameter("duty_area"));

		dm.print();

		ds = (HD_CORR_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_corr_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CORR_1401_LDataSet ds = null;
		HD_CORR_1401_LDM dm = new HD_CORR_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_CORR_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}