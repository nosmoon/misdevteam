package chosun.ciis.mt.commatr.wb;

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

import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;
 
public class MT_COMMATR_4000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

	public void mt_commatr_4000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4000_LDataSet ds = null;
		
		MT_COMMATR_4000_LDM dm = new MT_COMMATR_4000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_COMMATR_4000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_4001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4001_LDataSet ds = null;
		
		MT_COMMATR_4001_LDM dm = new MT_COMMATR_4001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_COMMATR_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_4002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4002_LDataSet ds = null;
		
		MT_COMMATR_4002_LDM dm = new MT_COMMATR_4002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.print();

		ds = (MT_COMMATR_4002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_4003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4003_ADataSet ds = null;
		
		MT_COMMATR_4003_ADM dm = new MT_COMMATR_4003_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String gubun 	        = converted[0];
		String fac_clsf         = converted[2];
		String matr_cd          = converted[3];
		String roll_wgt         = converted[4];
		String paper_gm         = converted[5];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun.toUpperCase());
		dm.setFac_clsf(fac_clsf);
		dm.setMatr_cd(matr_cd);
		dm.setRoll_wgt(roll_wgt);
		dm.setPaper_gm(paper_gm);
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_COMMATR_4003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}