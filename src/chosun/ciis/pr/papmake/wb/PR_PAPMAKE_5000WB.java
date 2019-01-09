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
 
public class PR_PAPMAKE_5000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
	
    
	public void pr_papmake_5000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_5000_LDataSet ds = null;
		
		PR_PAPMAKE_5000_LDM dm = new PR_PAPMAKE_5000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.all_slip_qty = Util.checkString(req.getParameter("all_slip_qty"));
		dm.all_slip_qty1 = Util.checkString(req.getParameter("all_slip_qty1"));
		dm.print();
		
		ds = (PR_PAPMAKE_5000_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_5020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_5020_ADataSet ds = null;
		
		PR_PAPMAKE_5020_ADM dm = new PR_PAPMAKE_5020_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.base_make_servcost = Util.checkString(req.getParameter("base_make_servcost"));
		dm.base_make_servcost1 = Util.checkString(req.getParameter("base_make_servcost1"));
		dm.basi_sep_prtn_servcost = Util.checkString(req.getParameter("basi_sep_prtn_servcost"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();
		
		ds = (PR_PAPMAKE_5020_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

}