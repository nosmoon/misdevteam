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

import chosun.ciis.mt.commatr.dm.MT_COMMATR_7320_ADM;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_7320_ADataSet;
import chosun.ciis.mt.common.dm.MT_COMMON_COCD_1000_LDM;
import chosun.ciis.mt.common.ds.MT_COMMON_COCD_1000_LDataSet;
import chosun.ciis.mt.etcbook.dm.MT_ETCBOOK_2002_ADM;
import chosun.ciis.mt.etcbook.ds.MT_ETCBOOK_2002_ADataSet;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;
 
public class PR_PAPMAKE_7000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    public void pr_papmake_7010_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7010_MDataSet ds = null;
		
		PR_PAPMAKE_7010_MDM dm = new PR_PAPMAKE_7010_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();
		
		ds = (PR_PAPMAKE_7010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
	public void pr_papmake_7011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7011_LDataSet ds = null;
		
		PR_PAPMAKE_7011_LDM dm = new PR_PAPMAKE_7011_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
		dm.ispt_cd = Util.checkString(req.getParameter("ispt_cd"));
		dm.ispt_nm = Util.checkString(req.getParameter("ispt_nm"));
		dm.ispt_clas1 = Util.checkString(req.getParameter("ispt_clas1"));
		dm.ispt_clas2 = Util.checkString(req.getParameter("ispt_clas2"));
		dm.print();
		
		ds = (PR_PAPMAKE_7011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	

	public void pr_papmake_7012_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7012_ADataSet ds = null;
		
		PR_PAPMAKE_7012_ADM dm = new PR_PAPMAKE_7012_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		String gubun = Util.checkString(req.getParameter("gubun"));

		dm.ispt_cd = Util.checkString(req.getParameter("ispt_cd"));
		dm.ispt_nm = Util.checkString(req.getParameter("ispt_nm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
		dm.ispt_clas1 = Util.checkString(req.getParameter("ispt_clas1"));
		dm.ispt_clas2 = Util.checkString(req.getParameter("ispt_clas2"));
		dm.ispt_clas3 = Util.checkString(req.getParameter("ispt_clas3"));
		dm.ispt_clas4 = Util.checkString(req.getParameter("ispt_clas4"));
		dm.ispt_months = Util.checkString(req.getParameter("ispt_months"));
		dm.ispt_days = Util.checkString(req.getParameter("ispt_days"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (PR_PAPMAKE_7012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {	
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);
	}
	
	
	public void pr_papmake_7021_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7021_LDataSet ds = null;
		
		PR_PAPMAKE_7021_LDM dm = new PR_PAPMAKE_7021_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
		dm.ispt_dt = Util.checkString(req.getParameter("ispt_dt"));
		dm.ispt_clas1 = Util.checkString(req.getParameter("ispt_clas1"));
		dm.ispt_clas2 = Util.checkString(req.getParameter("ispt_clas2"));
		
		dm.print();
		
		ds = (PR_PAPMAKE_7021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_7022_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7022_ADataSet ds = null;
		
		PR_PAPMAKE_7022_ADM dm = new PR_PAPMAKE_7022_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		String ispt_clsf =  Util.checkString(req.getParameter("ispt_clsf"));
		
		
		
		dm.ispt_dt = Util.checkString((String)hash.get("ispt_dt"));
		dm.ispt_cd = Util.checkString((String)hash.get("ispt_cd"));
		dm.fac_clsf = Util.checkString((String)hash.get("fac_clsf"));
 
		dm.ispt_clas1 = Util.checkString((String)hash.get("ispt_clas1"));
		dm.ispt_clas2 = Util.checkString((String)hash.get("ispt_clas2"));
		dm.ispt_rslt = Util.checkString((String)hash.get("ispt_rslt"));
		dm.remk = Util.checkString((String)hash.get("remk"));
	
		dm.setCmpy_cd(cmpy_cd);
		dm.setIspt_clsf(ispt_clsf);
		
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (PR_PAPMAKE_7022_ADataSet)manager.executeCall(dm);

		
		if(!ds.getErrcode().equals("")) {	
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);
	}
	
	
	public void pr_papmake_7013_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
	    PR_PAPMAKE_7013_MDataSet ds = null;
	    PR_PAPMAKE_7013_MDM dm = new PR_PAPMAKE_7013_MDM();
 
		
		
		String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		String job_clsf = Util.checkString(req.getParameter("job_clsf"));
		String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
		String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));
		String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
         
        dm.setCmpy_cd(cmpy_cd);
		dm.setJob_clsf(job_clsf);
		dm.setCd_clsf(cd_clsf);
		dm.setMang_cd_1(mang_cd_1);
		dm.setMang_cd_2(mang_cd_2);
		dm.setMang_cd_3(mang_cd_3);
		
		dm.print();

        ds = (PR_PAPMAKE_7013_MDataSet)manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }		
        req.setAttribute("ds", ds);

	}
	
	public void pr_papmake_7100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7100_LDataSet ds = null;
		
		PR_PAPMAKE_7100_LDM dm = new PR_PAPMAKE_7100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
		dm.ispt_dt = Util.checkString(req.getParameter("ispt_dt"));
		dm.ispt_clas1 = Util.checkString(req.getParameter("ispt_clas1"));
		dm.ispt_clas2 = Util.checkString(req.getParameter("ispt_clas2"));
		dm.rslt_yn = Util.checkString(req.getParameter("rslt_yn"));
		dm.print();
		
		ds = (PR_PAPMAKE_7100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	
	public void pr_papmake_7101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7101_LDataSet ds = null;
		
		PR_PAPMAKE_7101_LDM dm = new PR_PAPMAKE_7101_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
 
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
		dm.ispt_dt = Util.checkString(req.getParameter("ispt_dt"));
		dm.ispt_clas1 = Util.checkString(req.getParameter("ispt_clas1"));
		dm.ispt_clas2 = Util.checkString(req.getParameter("ispt_clas2"));
		dm.rslt_yn = Util.checkString(req.getParameter("rslt_yn"));
		
		dm.print();
		
		ds = (PR_PAPMAKE_7101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	
}