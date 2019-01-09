package chosun.ciis.pr.papmake.wb;

import java.rmi.RemoteException;

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
 
public class PR_PAPMAKE_6000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
	public void pr_papmake_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_6000_LDataSet ds = null;
		
		PR_PAPMAKE_6000_LDM dm = new PR_PAPMAKE_6000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_6000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_6010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_6010_ADataSet ds = null;
		
		PR_PAPMAKE_6010_ADM dm = new PR_PAPMAKE_6010_ADM();
        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
	    String[] converted      = convertMultiUpdateData(multiUpdateData);
		String gubun 	        = converted[0];
		String yymm             = converted[3];
		String fac_clsf 	    = converted[4];	
		String crps_cost        = converted[9];
		String etc_cost         = converted[10];
		
		dm.setGubun(gubun);
		dm.setYymm(yymm);
		dm.setFac_clsf(fac_clsf);
		dm.setCrps_cost(crps_cost);
		dm.setEtc_cost(etc_cost);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();
		
		ds = (PR_PAPMAKE_6010_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_6030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_6030_LDataSet ds = null;
		
		PR_PAPMAKE_6030_LDM dm = new PR_PAPMAKE_6030_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_6030_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

	/*
	 * 인쇄용역비 전표 등록
	 */
	public void pr_papmake_6040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_6040_ADataSet ds = null;
		
		PR_PAPMAKE_6040_ADM dm = new PR_PAPMAKE_6040_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
	    String[] converted      = convertMultiUpdateData(multiUpdateData);
		String mode 	        = converted[0];
		String sub_rumn         = converted[2];
		String gubun            = converted[3];
		String prt      	    = converted[4];	
		String prt_total        = converted[5];
		String make             = converted[6];
		String make_total       = converted[7];
		String pre_code         = converted[8];
		String yymm             = converted[13];
	    String fac_clsf         = converted[14];
	    String total            = converted[15];
	    String vat_total        = converted[16];
	    
		dm.setMode(mode);
		dm.setSub_rumn(sub_rumn);
		dm.setGubun(gubun);
		dm.setPrt(prt);
		dm.setPrt_total(prt_total);
		dm.setMake(make);
		dm.setMake_total(make_total);
		dm.setPre_code(pre_code);
		dm.setYymm(yymm);
		dm.setFac_clsf(fac_clsf);
		dm.setTotal(total);
		dm.setVat_total(vat_total);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.slip_proc_dt = Util.checkString(req.getParameter("slip_proc_dt"));
		dm.slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
		dm.delco_no = Util.checkString(req.getParameter("delco_no"));
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr()); 
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
        dm.incmg_pers=Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_6040_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/*
	 * 인쇄용역비 전표 취소
	 */
	public void pr_papmake_6050_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_6050_ADataSet ds = null;
		PR_PAPMAKE_6050_ADM dm = new PR_PAPMAKE_6050_ADM();

		dm.setSlip_proc_occr_dt(Util.checkString(req.getParameter("slip_proc_occr_dt")));
		dm.setSlip_proc_seq(Util.checkString(req.getParameter("slip_proc_seq")));
		dm.setTax_stmt_dt(Util.checkString(req.getParameter("tax_stmt_dt")));
		dm.setTax_stmt_seq(Util.checkString(req.getParameter("tax_stmt_seq")));
		dm.setYymm(Util.checkString(req.getParameter("yymm")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_6050_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/*
	 * 인쇄용역비 전표 등록
	 */
	public void pr_papmake_6060_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_6060_ADataSet ds = null;
		
		PR_PAPMAKE_6060_ADM dm = new PR_PAPMAKE_6060_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setYymm(Util.checkString(req.getParameter("yymm")));
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers=Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_6060_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}