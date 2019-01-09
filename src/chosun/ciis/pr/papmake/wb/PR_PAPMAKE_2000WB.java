package chosun.ciis.pr.papmake.wb;

import java.rmi.RemoteException;

import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;
 
public class PR_PAPMAKE_2000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

	public void pr_papmake_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2000_LDataSet ds = null;
		
		PR_PAPMAKE_2000_LDM dm = new PR_PAPMAKE_2000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.dept_clsf = Util.checkString(req.getParameter("dept_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_2000_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2010_ADataSet ds = null;
		
		PR_PAPMAKE_2010_ADM dm = new PR_PAPMAKE_2010_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.dept_clsf = Util.checkString(req.getParameter("dept_clsf"));
		dm.mang_nops = Util.checkString(req.getParameter("mang_nops"));
		dm.prt_nops = Util.checkString(req.getParameter("prt_nops"));
		dm.prt_board_nops = Util.checkString(req.getParameter("prt_board_nops"));
		dm.repa_nops = Util.checkString(req.getParameter("repa_nops"));
		dm.nwsp_high_nops = Util.checkString(req.getParameter("nwsp_high_nops"));
		dm.send_nops = Util.checkString(req.getParameter("send_nops"));
		dm.cmpos_nops = Util.checkString(req.getParameter("cmpos_nops"));
		dm.mony_trad_nops = Util.checkString(req.getParameter("mony_trad_nops"));
		dm.edt_side_nops = Util.checkString(req.getParameter("edt_side_nops"));
		dm.advt_incmg_nops = Util.checkString(req.getParameter("advt_incmg_nops"));
		dm.ofcr_nops = Util.checkString(req.getParameter("ofcr_nops"));
		dm.gen_affr_nops = Util.checkString(req.getParameter("gen_affr_nops"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.ref_matt = Util.checkString(req.getParameter("ref_matt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();

		ds = (PR_PAPMAKE_2010_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2100_LDataSet ds = null;
		
		PR_PAPMAKE_2100_LDM dm = new PR_PAPMAKE_2100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
		dm.print();
		
		ds = (PR_PAPMAKE_2100_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2101_ADataSet ds = null;
		
		PR_PAPMAKE_2101_ADM dm = new PR_PAPMAKE_2101_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println(multiUpdateData);
		Hashtable hash  = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
   	    dm.gubun            = (String)hash.get("m");
   	    dm.gubun			= dm.gubun.toUpperCase();
   	    dm.occr_dt          = (String)hash.get("occr_dt");
	    dm.seq              = (String)hash.get("seq");
	    dm.ecnt             = (String)hash.get("ecnt");
	    dm.clos_yymm        = (String)hash.get("clos_yymm");
   	    dm.clr_clsf         = (String)hash.get("clr_clsf");
   	    dm.re_off_plat      = (String)hash.get("re_off_plat");
	    dm.re_re_off_plat   = (String)hash.get("re_re_off_plat");
	    dm.film_num_shet   	= (String)hash.get("film_num_shet");
	    dm.psplat_cnt   	= (String)hash.get("psplat_cnt");
	    
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();

		ds = (PR_PAPMAKE_2101_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2200_LDataSet ds = null;
		
		PR_PAPMAKE_2200_LDM dm = new PR_PAPMAKE_2200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
		dm.print();
		
		ds = (PR_PAPMAKE_2200_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2201_ADataSet ds = null;
		
		PR_PAPMAKE_2201_ADM dm = new PR_PAPMAKE_2201_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println(multiUpdateData);
		Hashtable hash  = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
   	    dm.gubun            = (String)hash.get("m");
   	    dm.gubun			= dm.gubun.toUpperCase();
	    dm.clos_yymm        = (String)hash.get("clos_yymm");
   	    dm.fac_clsf         = (String)hash.get("fac_clsf");
   	    dm.ps_loss_rate      = (String)hash.get("ps_loss_rate");
   	    dm.film_loss_rate      = (String)hash.get("film_loss_rate");
	    
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();

		ds = (PR_PAPMAKE_2201_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2300_LDataSet ds = null;
		
		PR_PAPMAKE_2300_LDM dm = new PR_PAPMAKE_2300_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
		dm.print();
		
		ds = (PR_PAPMAKE_2300_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2301_ADataSet ds = null;
		
		PR_PAPMAKE_2301_ADM dm = new PR_PAPMAKE_2301_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println(multiUpdateData);
		Hashtable hash  = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
   	    dm.gubun            = (String)hash.get("m");
   	    dm.gubun			= dm.gubun.toUpperCase();
	    dm.clos_yymm        = (String)hash.get("clos_yymm");
   	    dm.fac_clsf         = (String)hash.get("fac_clsf");
   	    dm.prt_fee      = (String)hash.get("prt_fee");
	    
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();

		ds = (PR_PAPMAKE_2301_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_2202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_2202_LDataSet ds = null;
		
		PR_PAPMAKE_2202_LDM dm = new PR_PAPMAKE_2202_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (PR_PAPMAKE_2202_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
}