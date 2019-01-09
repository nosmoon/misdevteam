package chosun.ciis.hd.insr.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.hd.info.ds.HD_INFO_5210_LDataSet;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

public class HD_INSR_1000WB extends BaseWB {
	
	boolean debugmode = true;
	
	public void hd_insr_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1000_LDataSet ds = null;
		HD_INSR_1000_LDM dm = new HD_INSR_1000_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();  

		ds = (HD_INSR_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1001_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1001_UDataSet ds = null;
		HD_INSR_1001_UDM dm = new HD_INSR_1001_UDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.np_entr_dt = Util.checkString(req.getParameter("np_entr_dt"));
		dm.np_mtry_dt = Util.checkString(req.getParameter("np_mtry_dt"));
		dm.np_no = Util.checkString(req.getParameter("np_no"));
		dm.np_slf_ctrb_amt = Util.checkString(req.getParameter("np_slf_ctrb_amt"));
		dm.np_cmpy_burd_amt = Util.checkString(req.getParameter("np_cmpy_burd_amt"));
		//dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_INSR_1001_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_insr_1002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");

    	HD_INSR_1002_SDataSet ds = null; 

        // DM Setting
        HD_INSR_1002_SDM dm = new HD_INSR_1002_SDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_INSR_1002_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
	
	public void hd_insr_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1500_LDataSet ds = null;
		HD_INSR_1500_LDM dm = new HD_INSR_1500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yy = Util.checkString(req.getParameter("search_yy"));

		ds = (HD_INSR_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	  
    public void hd_insr_1510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1510_LDataSet ds = null;
		HD_INSR_1510_LDM dm = new HD_INSR_1510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly = Util.checkString(req.getParameter("search_yyyymm"));

		dm.print();

		ds = (HD_INSR_1510_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_insr_1511_A(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1511_ADataSet ds = null;
		HD_INSR_1511_ADM dm = new HD_INSR_1511_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.flag = ((String) hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
		dm.prn = (String)hash.get("prn");
		dm.slf_burd_amt = (String)hash.get("slf_burd_amt");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자

		dm.print();
		
		ds = (HD_INSR_1511_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_INSR_1520_LDataSet ds = null;
		HD_INSR_1520_LDM dm = new HD_INSR_1520_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));

		dm.print();

		ds = (HD_INSR_1520_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
    
    public void hd_insr_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1600_LDataSet ds = null;
		HD_INSR_1600_LDM dm = new HD_INSR_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yy = Util.checkString(req.getParameter("search_yy"));

		ds = (HD_INSR_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_insr_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1100_LDataSet ds = null;
		HD_INSR_1100_LDM dm = new HD_INSR_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly = Util.checkString(req.getParameter("search_yyyymm"));

		dm.print();

		ds = (HD_INSR_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_insr_1101_A(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1101_ADataSet ds = null;
		HD_INSR_1101_ADM dm = new HD_INSR_1101_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.flag = ((String) hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
		dm.prn = (String)hash.get("prn");
		dm.slf_burd_amt = (String)hash.get("slf_burd_amt");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자

		dm.print();
		
		ds = (HD_INSR_1101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1200_LDataSet ds = null;
		HD_INSR_1200_LDM dm = new HD_INSR_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_INSR_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1201_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1201_UDataSet ds = null;
		HD_INSR_1201_UDM dm = new HD_INSR_1201_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.hlth_insr_entr_dt = Util.checkString(req.getParameter("hlth_insr_entr_dt"));
		dm.hlth_entr_no = Util.checkString(req.getParameter("hlth_entr_no"));
		dm.slf_hlth_insr_fee = Util.checkString(req.getParameter("slf_hlth_insr_fee"));
		dm.cmpy_hlth_insr_fee = Util.checkString(req.getParameter("cmpy_hlth_insr_fee"));
		dm.self_insr_med_care_insr_fee = Util.checkString(req.getParameter("self_insr_med_care_insr_fee"));
		dm.cmpy_insr_med_care_insr_fee = Util.checkString(req.getParameter("cmpy_insr_med_care_insr_fee"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipass = req.getRemoteAddr(); //ip주소
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_INSR_1201_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1300_LDataSet ds = null;
		HD_INSR_1300_LDM dm = new HD_INSR_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly = Util.checkString(req.getParameter("search_yyyymm"));

		dm.print();

		ds = (HD_INSR_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1301_ADataSet ds = null;
		HD_INSR_1301_ADM dm = new HD_INSR_1301_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
		dm.prn = (String)hash.get("prn");
		dm.hlth_insr_fee = (String)hash.get("hlth_insr_fee");
		dm.hlth_insr_med_fee = (String)hash.get("hlth_insr_med_fee");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_INSR_1301_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1400_LDataSet ds = null;
		HD_INSR_1400_LDM dm = new HD_INSR_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();

		ds = (HD_INSR_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1711_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1711_LDataSet ds = null;
		HD_INSR_1711_LDM dm = new HD_INSR_1711_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_INSR_1711_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1712_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1712_ADataSet ds = null;
		HD_INSR_1712_ADM dm = new HD_INSR_1712_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.tms = (String)hash.get("tms");
		dm.insr_cmpy = (String)hash.get("insr_cmpy");
		dm.insr_entr_dt = (String)hash.get("insr_entr_dt");
		dm.insr_mtry_dt = (String)hash.get("insr_mtry_dt");
		dm.pymt_insr_fee = (String)hash.get("pymt_insr_fee");
		dm.entr_nops = (String)hash.get("entr_nops");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_INSR_1712_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1721_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1721_LDataSet ds = null;
		HD_INSR_1721_LDM dm = new HD_INSR_1721_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_INSR_1721_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1722_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1722_LDataSet ds = null;
		HD_INSR_1722_LDM dm = new HD_INSR_1722_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_INSR_1722_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1723_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_1723_ADataSet ds = null;
		HD_INSR_1723_ADM dm = new HD_INSR_1723_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.tms = (String)hash.get("tms");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.insr_amt_recp_dt = (String)hash.get("insr_amt_recp_dt");
		dm.insr_amt_recp_resn = (String)hash.get("insr_amt_recp_resn");
		dm.rela_spc_agrmnt = (String)hash.get("rela_spc_agrmnt");
		dm.recp_insr_amt = (String)hash.get("recp_insr_amt");
		dm.clam_resn_occr_dt = (String)hash.get("clam_resn_occr_dt");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.dlay_int = (String)hash.get("dlay_int");
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_INSR_1723_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_insr_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_2000_LDataSet ds = null;
		HD_INSR_2000_LDM dm = new HD_INSR_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_INSR_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_2001_LDataSet ds = null;
		HD_INSR_2001_LDM dm = new HD_INSR_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));

		dm.print();

		ds = (HD_INSR_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_2002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INSR_2002_ADataSet ds = null;
		HD_INSR_2002_ADM dm = new HD_INSR_2002_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
					
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.aply_basi_dt = (String)hash.get("aply_basi_dt");
		dm.seq = (String)hash.get("seq");
		dm.insr_clsf = (String)hash.get("insr_clsf");
		dm.insr_rate = (String)hash.get("insr_rate");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_INSR_2002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_INSR_1102_LDataSet ds = null;
		HD_INSR_1102_LDM dm = new HD_INSR_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));

		dm.print();

		ds = (HD_INSR_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_insr_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_INSR_1302_LDataSet ds = null;
		HD_INSR_1302_LDM dm = new HD_INSR_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));

		dm.print();

		ds = (HD_INSR_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
}
