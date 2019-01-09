package chosun.ciis.mt.commatr.wb;

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

import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;
public class MT_COMMATR_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

	public void mt_commatr_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3000_LDataSet ds = null;
		
		MT_COMMATR_3000_LDM dm = new MT_COMMATR_3000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.print();

		ds = (MT_COMMATR_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3001_ADataSet ds = null;
		
		MT_COMMATR_3001_ADM dm = new MT_COMMATR_3001_ADM();
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.presi_tel_no_1 = Util.checkString(req.getParameter("presi_tel_no_1"));
		dm.presi_tel_no_2 = Util.checkString(req.getParameter("presi_tel_no_2"));
		dm.presi_email = Util.checkString(req.getParameter("presi_email"));
		dm.presi_prof = Util.checkString(req.getParameter("presi_prof"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.chrg_pers_tel_no_1 = Util.checkString(req.getParameter("chrg_pers_tel_no_1"));
		dm.chrg_pers_tel_no_2 = Util.checkString(req.getParameter("chrg_pers_tel_no_2"));
		dm.chrg_pers_email_1 = Util.checkString(req.getParameter("chrg_pers_email_1"));
		dm.trsm_usag_email_yn_1 = Util.checkString(req.getParameter("trsm_usag_email_yn_1"));
		dm.chrg_pers_email_2 = Util.checkString(req.getParameter("chrg_pers_email_2"));
		dm.trsm_usag_email_yn_2 = Util.checkString(req.getParameter("trsm_usag_email_yn_2"));
		dm.chrg_pers_dept = Util.checkString(req.getParameter("chrg_pers_dept"));
		dm.chrg_pers_prof = Util.checkString(req.getParameter("chrg_pers_prof"));
		dm.fndt_dt = Util.checkString(req.getParameter("fndt_dt"));
		dm.cmpy_hmpg = Util.checkString(req.getParameter("cmpy_hmpg"));
		dm.sale_amt = Util.checkString(req.getParameter("sale_amt"));
		dm.mrkt_ocpy_rate = Util.checkString(req.getParameter("mrkt_ocpy_rate"));
		dm.dlco_pcond = Util.checkString(req.getParameter("dlco_pcond"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3002_LDataSet ds = null;
		
		MT_COMMATR_3002_LDM dm = new MT_COMMATR_3002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_no"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.print();

		ds = (MT_COMMATR_3002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_3003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3003_ADataSet ds = null;
		
		MT_COMMATR_3003_ADM dm = new MT_COMMATR_3003_ADM();
        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));

		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String gubun 	        = converted[0];
		String seq              = converted[2];
		String dlco_no          = converted[3];
		String yy 	            = converted[5];
		String sale_amt         = converted[6];
		String busn_prft        = converted[7];
		String busn_prft_rate 	= converted[8];
		String thterm_net_prft  = converted[9];

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setSeq(seq);
		dm.setDlco_no(dlco_no);
		dm.setYy(yy);
		dm.setSale_amt(sale_amt);
		dm.setBusn_prft(busn_prft);
		dm.setBusn_prft_rate(busn_prft_rate);
		dm.setThterm_net_prft(thterm_net_prft);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_3003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3004_ADataSet ds = null;
		
		MT_COMMATR_3004_ADM dm = new MT_COMMATR_3004_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String gubun 	        = converted[0];
		String dlco_no          = converted[2];
		String seq              = converted[3];
		String chrg_pers_nm 	= converted[5];
		String chrg_pers_tel_no = converted[6];
		String chrg_pers_email  = converted[7];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setSeq(seq);
		dm.setDlco_no(dlco_no);
		dm.setChrg_pers_nm(chrg_pers_nm);
		dm.setChrg_pers_tel_no(chrg_pers_tel_no);
		dm.setChrg_pers_email(chrg_pers_email);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_3004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3005_ADataSet ds = null;
		
		MT_COMMATR_3005_ADM dm = new MT_COMMATR_3005_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String gubun 	        = converted[0];
		String dlco_no          = converted[2];
		String seq              = converted[3];
		String movmt 	        = converted[5];

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setSeq(seq);
		dm.setDlco_no(dlco_no);
		dm.setMovmt(movmt);
		dm.print();

		ds = (MT_COMMATR_3005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3006_LDataSet ds = null;
		
		MT_COMMATR_3006_LDM dm = new MT_COMMATR_3006_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.print();

		ds = (MT_COMMATR_3006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3007_LDataSet ds = null;
		
		MT_COMMATR_3007_LDM dm = new MT_COMMATR_3007_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print();

		ds = (MT_COMMATR_3007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3008_LDataSet ds = null;
		
		MT_COMMATR_3008_LDM dm = new MT_COMMATR_3008_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_no"));
		dm.dt_fr = Util.checkString(req.getParameter("dt_fr"));
		dm.dt_to = Util.checkString(req.getParameter("dt_to"));
		dm.print();

		ds = (MT_COMMATR_3008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3010_LDataSet ds = null;
		
		MT_COMMATR_3010_LDM dm = new MT_COMMATR_3010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.print();

		ds = (MT_COMMATR_3010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_3100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3100_LDataSet ds = null;
		
		MT_COMMATR_3100_LDM dm = new MT_COMMATR_3100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print();

		ds = (MT_COMMATR_3100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3200_LDataSet ds = null;
		
		MT_COMMATR_3200_LDM dm = new MT_COMMATR_3200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_cd"));
		dm.print();

		ds = (MT_COMMATR_3200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3210_ADataSet ds = null;
		
		MT_COMMATR_3210_ADM dm = new MT_COMMATR_3210_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun     = (String)hash.get("m");
		dm.seq       = (String)hash.get("seq");
		dm.dlco_no   = (String)hash.get("dlco_no");
		dm.yy        = (String)hash.get("yy");
		dm.sale_amt  = (String)hash.get("sale_amt");
		dm.busn_prft = (String)hash.get("busn_prft");
		dm.busn_prft_rate = (String)hash.get("busn_prft_rate");
		dm.thterm_net_prft = (String)hash.get("thterm_net_prft");
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_3210_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3300_LDataSet ds = null;
		
		MT_COMMATR_3300_LDM dm = new MT_COMMATR_3300_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.print();

		ds = (MT_COMMATR_3300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3310_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3310_ADataSet ds = null;
		
		MT_COMMATR_3310_ADM dm = new MT_COMMATR_3310_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.gubun     = (String)hash.get("m");
    	dm.seq       = (String)hash.get("seq");
		dm.dlco_no   = (String)hash.get("dlco_no");
		dm.chrg_pers_nm        = (String)hash.get("chrg_pers_nm");
        dm.chrg_pers_tel_no    = (String)hash.get("chrg_pers_tel_no");
        dm.chrg_pers_email = (String)hash.get("chrg_pers_email");
        dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_3310_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_3400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3400_LDataSet ds = null;
		
		MT_COMMATR_3400_LDM dm = new MT_COMMATR_3400_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.print();

		ds = (MT_COMMATR_3400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_3410_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3410_ADataSet ds = null;
		
		MT_COMMATR_3410_ADM dm = new MT_COMMATR_3410_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.gubun     = (String)hash.get("m");
    	dm.seq       = (String)hash.get("seq");
		dm.dlco_no   = (String)hash.get("dlco_no");
		dm.movmt        = (String)hash.get("movmt");
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_3410_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}