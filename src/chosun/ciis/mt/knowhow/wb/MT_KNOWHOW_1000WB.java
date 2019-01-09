package chosun.ciis.mt.knowhow.wb;

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

import chosun.ciis.mt.knowhow.dm.*;
import chosun.ciis.mt.knowhow.ds.*;
 
public class MT_KNOWHOW_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

	public void mt_knowhow_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1001_MDataSet ds = null;
		
		MT_KNOWHOW_1001_MDM dm = new MT_KNOWHOW_1001_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_KNOWHOW_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_knowhow_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1002_LDataSet ds = null;
		
		MT_KNOWHOW_1002_LDM dm = new MT_KNOWHOW_1002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.lcls = Util.checkString(req.getParameter("lcls"));
		dm.qust_answer = Util.checkString(req.getParameter("qust_answer"));
		dm.reg_dt_fr = Util.checkString(req.getParameter("reg_dt_fr"));
		dm.reg_dt_to = Util.checkString(req.getParameter("reg_dt_to"));
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.print();

		ds = (MT_KNOWHOW_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_knowhow_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1003_LDataSet ds = null;
		
		MT_KNOWHOW_1003_LDM dm = new MT_KNOWHOW_1003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.lcls = Util.checkString(req.getParameter("lcls"));
		dm.reg_seq = Util.checkString(req.getParameter("reg_seq"));
		dm.print();

		ds = (MT_KNOWHOW_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_knowhow_1004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1004_ADataSet ds = null;
		
		MT_KNOWHOW_1004_ADM dm = new MT_KNOWHOW_1004_ADM();
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.lcls = Util.checkString(req.getParameter("lcls"));
		dm.reg_seq = Util.checkString(req.getParameter("reg_seq"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.question = Util.checkString(req.getParameter("question"));
		dm.ans_mode = Util.checkString(req.getParameter("ans_mode"));
		dm.answer = Util.checkString(req.getParameter("answer"));
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_KNOWHOW_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_knowhow_1005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1005_ADataSet ds = null;
		
		MT_KNOWHOW_1005_ADM dm = new MT_KNOWHOW_1005_ADM();
		dm.ans_mode = Util.checkString(req.getParameter("ans_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.lcls = Util.checkString(req.getParameter("lcls"));
		dm.reg_seq = Util.checkString(req.getParameter("reg_seq"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.answer = Util.checkString(req.getParameter("answer"));
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_KNOWHOW_1005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

}