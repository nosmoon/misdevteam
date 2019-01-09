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
 
public class PR_PAPMAKE_8000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    
    public void pr_papmake_8000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8000_MDataSet ds = null;
		
		PR_PAPMAKE_8000_MDM dm = new PR_PAPMAKE_8000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (PR_PAPMAKE_8000_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
	public void pr_papmake_8011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8011_LDataSet ds = null;
		
		PR_PAPMAKE_8011_LDM dm = new PR_PAPMAKE_8011_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.dcmt_nm = Util.checkString(req.getParameter("dcmt_nm")); 
		dm.dcmt_clsf = Util.checkString(req.getParameter("dcmt_clsf"));
		dm.requ_dt_fr = Util.checkString(req.getParameter("requ_dt_fr"));
		dm.requ_dt_to = Util.checkString(req.getParameter("requ_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.requ_pers = Util.checkString(req.getParameter("requ_pers"));
		dm.remk2 = Util.checkString(req.getParameter("remk2")); 
		dm.print();
		
		ds = (PR_PAPMAKE_8011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	
	public void pr_papmake_8012_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8012_ADataSet ds = null;
		
		PR_PAPMAKE_8012_ADM dm = new PR_PAPMAKE_8012_ADM();

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.dcmt_no = Util.checkString(req.getParameter("dcmt_no"));
		dm.dcmt_clsf = Util.checkString(req.getParameter("dcmt_clsf"));
		dm.dcmt_nm = Util.checkString(req.getParameter("dcmt_nm"));
		dm.requ_dt = Util.checkString(req.getParameter("requ_dt"));
		dm.resp_dt = Util.checkString(req.getParameter("resp_dt"));
		dm.requ_pers = Util.checkString(req.getParameter("requ_pers"));
		dm.resp_pers = Util.checkString(req.getParameter("resp_pers"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.remk2 = Util.checkString(req.getParameter("remk2"));
		dm.dcmt_tp = Util.checkString(req.getParameter("dcmt_tp"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		ds = (PR_PAPMAKE_8012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {	
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);

	}
	public void pr_papmake_8070_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8070_MDataSet ds = null;
		
		PR_PAPMAKE_8070_MDM dm = new PR_PAPMAKE_8070_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
		dm.print();

		ds = (PR_PAPMAKE_8070_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
}