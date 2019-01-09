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

public class MT_COMMATR_2000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * TAB 1 자재 내역 등록
     */
    /**
     * 콤보 셋팅
     */
	public void mt_commatr_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2100_LDataSet ds = null;
		
		MT_COMMATR_2100_LDM dm = new MT_COMMATR_2100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.uprc_meda_dt_fr = Util.checkString(req.getParameter("uprc_meda_dt_fr"));
		dm.uprc_meda_dt_to = Util.checkString(req.getParameter("uprc_meda_dt_to"));
		dm.print();

		ds = (MT_COMMATR_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_2110_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2110_ADataSet ds = null;
		
		MT_COMMATR_2110_ADM dm = new MT_COMMATR_2110_ADM();
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		if(dm.gubun.equals("I")){
			dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		}
		else{
			dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		}
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.purc_uprc = Util.checkString(req.getParameter("purc_uprc"));
		dm.uprc_meda_dt = Util.checkString(req.getParameter("uprc_meda_dt"));
		dm.dlco_eps_no = Util.checkString(req.getParameter("dlco_eps_no"));
		dm.setl_cond = Util.checkString(req.getParameter("setl_cond"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.rela_yn = Util.checkString(req.getParameter("rela_yn"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_2110_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2200_LDataSet ds = null;
		
		MT_COMMATR_2200_LDM dm = new MT_COMMATR_2200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd_list")).replaceAll("#", "'");
		dm.uprc_meda_dt_fr = Util.checkString(req.getParameter("uprc_meda_dt_fr"));
		dm.uprc_meda_dt_to = Util.checkString(req.getParameter("uprc_meda_dt_to"));
		dm.dlco_eps_no = Util.checkString(req.getParameter("dlco_eps_no_list")).replaceAll("#", "'");
		dm.print();

		ds = (MT_COMMATR_2200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_2210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2210_LDataSet ds = null;
		
		MT_COMMATR_2210_LDM dm = new MT_COMMATR_2210_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print();

		ds = (MT_COMMATR_2210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_2220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2220_LDataSet ds = null;
		
		MT_COMMATR_2220_LDM dm = new MT_COMMATR_2220_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		String tmp = Util.checkString(req.getParameter("matr_cd_list"));
		dm.dlco_eps_no = Util.checkString(req.getParameter("dlco_eps_no"));
		dm.matr_cd_list   =	tmp.replaceAll("#", "'");
		dm.print();

		ds = (MT_COMMATR_2220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

}