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

public class PR_PAPMAKE_4000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
	public void pr_papmake_4000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4000_LDataSet ds = null;
		
		PR_PAPMAKE_4000_LDM dm = new PR_PAPMAKE_4000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_4000_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_4010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4010_LDataSet ds = null;
		
		PR_PAPMAKE_4010_LDM dm = new PR_PAPMAKE_4010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_4010_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_4020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4020_ADataSet ds = null;
		
		PR_PAPMAKE_4020_ADM dm = new PR_PAPMAKE_4020_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
	    String[] converted      = convertMultiUpdateData(multiUpdateData);
	    
	    //for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		
	    String fac_clsf_2			= converted[15];
	    String issu_dt				= converted[3];
	    String issu_pcnt			= converted[8];
	    String clr_pcnt				= converted[9];
		String medi_cd				= converted[16];
		String sect_cd				= converted[17];
		String dual_out_clsf	    = converted[11];
		String all_slip_qty			= converted[13];
		String all_slip_qty_1		= converted[14];
		String seq					= converted[2];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.seq = seq;
		dm.fac_clsf_2 = fac_clsf_2;
		dm.issu_dt = issu_dt;
		dm.medi_cd = medi_cd;
		dm.sect_cd = sect_cd;
		dm.issu_pcnt = issu_pcnt;
		dm.clr_pcnt = clr_pcnt;
		dm.dual_out_clsf = dual_out_clsf;
		dm.all_slip_qty = all_slip_qty;
		dm.all_slip_qty_1 = all_slip_qty_1;
		dm.base_servcost = Util.checkString(req.getParameter("base_servcost"));
		dm.basi_excs_servcost = Util.checkString(req.getParameter("basi_excs_servcost"));
		dm.basi_sep_prtn_servcost = Util.checkString(req.getParameter("basi_sep_prtn_servcost"));
		dm.crps_cost = Util.checkString(req.getParameter("crps_cost"));
		dm.dduc_cost = Util.checkString(req.getParameter("dduc_cost"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();
		
		ds = (PR_PAPMAKE_4020_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_4030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4030_LDataSet ds = null;
		
		PR_PAPMAKE_4030_LDM dm = new PR_PAPMAKE_4030_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.all_slip_qty = Util.checkString(req.getParameter("all_slip_qty"));
		dm.all_slip_qty1 = Util.checkString(req.getParameter("all_slip_qty1"));
		dm.print();
		
		ds = (PR_PAPMAKE_4030_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_4040_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4040_MDataSet ds = null;
		
		PR_PAPMAKE_4040_MDM dm = new PR_PAPMAKE_4040_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (PR_PAPMAKE_4040_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_4050_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4050_DDataSet ds = null;
		
		PR_PAPMAKE_4050_DDM dm = new PR_PAPMAKE_4050_DDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_4050_DDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}