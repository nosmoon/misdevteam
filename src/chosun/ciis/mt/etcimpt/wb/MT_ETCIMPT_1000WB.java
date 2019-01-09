package chosun.ciis.mt.etcimpt.wb;

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

import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;
 
public class MT_ETCIMPT_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

	public void mt_etcimpt_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1000_MDataSet ds = null;
		
		MT_ETCIMPT_1000_MDM dm = new MT_ETCIMPT_1000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (MT_ETCIMPT_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etcimpt_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1010_LDataSet ds = null;
		
		MT_ETCIMPT_1010_LDM dm = new MT_ETCIMPT_1010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.print();

		ds = (MT_ETCIMPT_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_etcimpt_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1101_LDataSet ds = null;
		
		MT_ETCIMPT_1101_LDM dm = new MT_ETCIMPT_1101_LDM();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCIMPT_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_etcimpt_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1110_LDataSet ds = null;
		
		MT_ETCIMPT_1110_LDM dm = new MT_ETCIMPT_1110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.print();

		ds = (MT_ETCIMPT_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

	public void mt_etcimpt_1120_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1120_ADataSet ds = null;
		
		MT_ETCIMPT_1120_ADM dm = new MT_ETCIMPT_1120_ADM();		
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.case_nm = Util.checkString(req.getParameter("case_nm"));
		dm.impt_resn = Util.checkString(req.getParameter("impt_resn"));
		dm.matr_ptcr = Util.checkString(req.getParameter("matr_ptcr"));
		dm.use_dept = Util.checkString(req.getParameter("use_dept"));
		dm.offer_pric = Util.checkString(req.getParameter("offer_pric"));
		dm.offer_pric_curc_clsf = Util.checkString(req.getParameter("offer_pric_curc_clsf"));
		dm.ship_pers = Util.checkString(req.getParameter("ship_pers"));
		dm.base_cost = Util.checkString(req.getParameter("base_cost"));
		dm.impt_vexc_coms = Util.checkString(req.getParameter("impt_vexc_coms"));
		dm.impt_vexc_coms_vat = Util.checkString(req.getParameter("impt_vexc_coms_vat"));
		dm.lcopen_coms = Util.checkString(req.getParameter("lcopen_coms"));
		dm.telx_fee = Util.checkString(req.getParameter("telx_fee"));
		dm.offer_offr_plac = Util.checkString(req.getParameter("offer_offr_plac"));
		dm.impt_clsf = Util.checkString(req.getParameter("impt_clsf"));
		dm.lcopen_dt = Util.checkString(req.getParameter("lcopen_dt"));
		dm.lcopen_bank = Util.checkString(req.getParameter("lcopen_bank"));
		dm.lcno = Util.checkString(req.getParameter("lcno"));
		dm.lcvdty_prd = Util.checkString(req.getParameter("lcvdty_prd"));
		dm.crgo_insr_entr_dt = Util.checkString(req.getParameter("crgo_insr_entr_dt"));
		dm.crgo_insr_cntr_cmpy = Util.checkString(req.getParameter("crgo_insr_cntr_cmpy"));
		dm.crgo_insr_fee = Util.checkString(req.getParameter("crgo_insr_fee"));
		dm.ship_widr = Util.checkString(req.getParameter("ship_widr"));
		dm.ship_dt = Util.checkString(req.getParameter("ship_dt"));
		dm.ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
		dm.ewh_amt = Util.checkString(req.getParameter("ewh_amt"));
		dm.last_entr_dt = Util.checkString(req.getParameter("last_entr_dt"));
		dm.impt_vexc_cmpy = Util.checkString(req.getParameter("impt_vexc_cmpy"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.rela_yn = Util.checkString(req.getParameter("rela_yn"));
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_ETCIMPT_1120_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etcimpt_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1201_LDataSet ds = null;
		
		MT_ETCIMPT_1201_LDM dm = new MT_ETCIMPT_1201_LDM();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.print();

		ds = (MT_ETCIMPT_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etcimpt_1205_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1205_LDataSet ds = null;
		
		MT_ETCIMPT_1205_LDM dm = new MT_ETCIMPT_1205_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.print();

		ds = (MT_ETCIMPT_1205_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_etcimpt_1210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1210_LDataSet ds = null;
		
		MT_ETCIMPT_1210_LDM dm = new MT_ETCIMPT_1210_LDM();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.sub_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.print();

		ds = (MT_ETCIMPT_1210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	
	
	public void mt_etcimpt_1220_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1220_ADataSet ds = null;
		
		MT_ETCIMPT_1220_ADM dm = new MT_ETCIMPT_1220_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		
		String gubun 	        = converted[0];
		String cd               = converted[2];
		String impt_occr_cost   = converted[4];
		String impt_cost_cd     = converted[11];
		String sub_seq_s        = converted[10];
		String vat_clsf         = converted[5];
		String remk             = converted[6];
        String endgbn_s = "";

        String incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		String incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
        
		if(gubun.equals("")) {
			endgbn_s = "E";
		} else {
			endgbn_s = "C";
		}
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setEndgbn_s(endgbn_s);
		dm.setCd(cd);
		dm.setImpt_occr_cost(impt_occr_cost);
		dm.setImpt_cost_cd(impt_cost_cd);
		dm.setVat_clsf(vat_clsf);
		dm.setRemk(remk);
		dm.setSub_seq_s(sub_seq_s);
		
		dm.gubun_s = Util.checkString(req.getParameter("gubun_s"));
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.sub_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.cost_case_titl = Util.checkString(req.getParameter("cost_case_titl"));
		dm.real_ship_dt = Util.checkString(req.getParameter("real_ship_dt"));
		dm.ship_port = Util.checkString(req.getParameter("ship_port"));
		dm.ariv_port = Util.checkString(req.getParameter("ariv_port"));
		dm.entr_dt = Util.checkString(req.getParameter("entr_dt"));
		dm.ewh_amt = Util.checkString(req.getParameter("ewh_amt"));
		dm.proc_yn = Util.checkString(req.getParameter("proc_yn"));
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();

		ds = (MT_ETCIMPT_1220_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etcimpt_1221_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1221_ADataSet ds = null;
		
		MT_ETCIMPT_1221_ADM dm = new MT_ETCIMPT_1221_ADM();
		String multiUpData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
		dm.sub_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.cost_case_titl = Util.checkString(req.getParameter("cost_case_titl"));
		dm.real_ship_dt = Util.checkString(req.getParameter("real_ship_dt"));
		dm.ship_port = Util.checkString(req.getParameter("ship_port"));
		dm.ariv_port = Util.checkString(req.getParameter("ariv_port"));
		dm.entr_dt = Util.checkString(req.getParameter("entr_dt"));
		dm.cd = Util.checkString((String)hash.get("cd"));
		dm.impt_occr_cost = Util.checkString((String)hash.get("impt_occr_cost"));
		dm.vat_clsf = Util.checkString((String)hash.get("vat_clsf"));
		dm.remk = Util.checkString((String)hash.get("remk"));
		dm.proc_yn = "";
		dm.print();

		ds = (MT_ETCIMPT_1221_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_etcimpt_1230_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1230_LDataSet ds = null;
		
		MT_ETCIMPT_1230_LDM dm = new MT_ETCIMPT_1230_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.sub_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.print();

		ds = (MT_ETCIMPT_1230_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etcimpt_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1300_LDataSet ds = null;
		
		MT_ETCIMPT_1300_LDM dm = new MT_ETCIMPT_1300_LDM();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seq_fr = Util.checkString(req.getParameter("seq_fr"));
		dm.seq_to = Util.checkString(req.getParameter("seq_to"));
		dm.print();

		ds = (MT_ETCIMPT_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}