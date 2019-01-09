package chosun.ciis.mt.etcbook.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.ds.*;

public class MT_ETCBOOK_1000WB extends BaseWB {
	// 도서청구 조회
	public void mt_etcbook_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1100_LDataSet ds = null;
		
		MT_ETCBOOK_1100_LDM dm = new MT_ETCBOOK_1100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
		dm.clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (MT_ETCBOOK_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	// 도서관리조회
	public void mt_etcbook_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1300_LDataSet ds = null;
		
		MT_ETCBOOK_1300_LDM dm = new MT_ETCBOOK_1300_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
		dm.clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
		dm.subs_frdt = Util.checkString(req.getParameter("subs_frdt"));
		dm.sbend_dt = Util.checkString(req.getParameter("sbend_dt"));
		dm.print();

		ds = (MT_ETCBOOK_1300_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etcbook_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1101_LDataSet ds = null;
		
		MT_ETCBOOK_1101_LDM dm = new MT_ETCBOOK_1101_LDM();
		dm.book_cd = Util.checkString(req.getParameter("book_cd"));
		dm.book_nm = Util.checkString(req.getParameter("book_nm"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (MT_ETCBOOK_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	// 통화구분 Combo
	public void mt_etcbook_1102_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1102_MDataSet ds = null;
		
		MT_ETCBOOK_1102_MDM dm = new MT_ETCBOOK_1102_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (MT_ETCBOOK_1102_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	 
	public void mt_etcbook_1103_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1103_MDataSet ds = null;
		
		MT_ETCBOOK_1103_MDM dm = new MT_ETCBOOK_1103_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		ds = (MT_ETCBOOK_1103_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	// 도서청구 입력/삭제 
	public void mt_etcbook_1104_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1104_ADataSet ds = null;
		
		MT_ETCBOOK_1104_ADM dm = new MT_ETCBOOK_1104_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.clam_dt = Util.checkString(req.getParameter("clam_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.book_cd = Util.checkString(req.getParameter("book_cd"));
		dm.qty = Util.checkString(req.getParameter("qty"));
		dm.curc_clsf = Util.checkString(req.getParameter("curc_clsf"));
		dm.uprc_won = Util.checkString(req.getParameter("uprc_won"));
		dm.uprc_frex = Util.checkString(req.getParameter("uprc_frex"));
		dm.frex_exrate = Util.checkString(req.getParameter("frex_exrate"));
		dm.subs_frdt = Util.checkString(req.getParameter("subs_frdt"));
		dm.sbend_dt = Util.checkString(req.getParameter("sbend_dt"));
		dm.aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
		dm.extd_dt = Util.checkString(req.getParameter("extd_dt"));
		dm.dlvs_plac = Util.checkString(req.getParameter("dlvs_plac"));
		dm.dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
		dm.canc_yn = Util.checkString(req.getParameter("canc_yn"));
		dm.canc_pers = Util.checkString(req.getParameter("canc_pers"));
		dm.buy_plac_clsf = Util.checkString(req.getParameter("buy_plac_clsf"));
		dm.item_clam_occr_dt = Util.checkString(req.getParameter("item_clam_occr_dt"));
		dm.item_clam_seq = Util.checkString(req.getParameter("item_clam_seq"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		if("Y".equalsIgnoreCase(Util.checkString(req.getParameter("istt_hdqt_yn")))){
			dm.istt_hdqt_yn = "Y";
		}else{
			dm.istt_hdqt_yn = "N";
		}
		dm.acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (MT_ETCBOOK_1104_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	// 도서관리 수정/
	public void mt_etcbook_1201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1201_ADataSet ds = null;
		
		MT_ETCBOOK_1201_ADM dm = new MT_ETCBOOK_1201_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.clam_dt = Util.checkString(req.getParameter("clam_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.book_cd = Util.checkString(req.getParameter("book_cd"));
		dm.qty = Util.checkString(req.getParameter("qty"));
		dm.curc_clsf = Util.checkString(req.getParameter("curc_clsf"));
		dm.uprc_won = Util.checkString(req.getParameter("uprc_won"));
		dm.uprc_frex = Util.checkString(req.getParameter("uprc_frex"));
		dm.frex_exrate = Util.checkString(req.getParameter("frex_exrate"));
		dm.subs_frdt = Util.checkString(req.getParameter("subs_frdt"));
		dm.sbend_dt = Util.checkString(req.getParameter("sbend_dt"));
		dm.aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
		dm.extd_dt = Util.checkString(req.getParameter("extd_dt"));
		dm.dlvs_plac = Util.checkString(req.getParameter("dlvs_plac"));
		dm.dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
		dm.canc_yn = Util.checkString(req.getParameter("canc_yn"));
		dm.canc_pers = Util.checkString(req.getParameter("canc_pers"));
		dm.buy_plac_clsf = Util.checkString(req.getParameter("buy_plac_clsf"));
		dm.item_clam_occr_dt = Util.checkString(req.getParameter("item_clam_occr_dt"));
		dm.item_clam_seq = Util.checkString(req.getParameter("item_clam_seq"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.istt_hdqt_yn = Util.checkString(req.getParameter("istt_hdqt_yn"));
		dm.acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (MT_ETCBOOK_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
