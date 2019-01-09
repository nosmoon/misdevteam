
package chosun.ciis.mt.submatrcla.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

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
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1100_MDM;
import chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1100_MDataSet;


public class MT_SUBMATRCLA_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 시스템구분 공통코드 콤보 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_Submatrcla_1100(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRCLA_1100_LDataSet ds = null;
    	String TmpDt = null;

        // DM Setting
    	MT_SUBMATRCLA_1100_LDM dm = new MT_SUBMATRCLA_1100_LDM();
    	TmpDt = Util.checkString(req.getParameter("clam_dt"));
        TmpDt = TmpDt.replaceAll("-", "");
        dm.setFrom_dt(TmpDt);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.print();

        ds = (MT_SUBMATRCLA_1100_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 시스템구분 공통코드 콤보 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void mt_submatrcla_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1101_LDataSet ds = null;

		MT_SUBMATRCLA_1101_LDM dm = new MT_SUBMATRCLA_1101_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
		dm.acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
		dm.print();

		ds = (MT_SUBMATRCLA_1101_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
	public void mt_submatrcla_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1104_LDataSet ds = null;

		MT_SUBMATRCLA_1104_LDM dm = new MT_SUBMATRCLA_1104_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_SUBMATRCLA_1104_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1105_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRCLA_1105_MDataSet ds = null;

        // DM Setting
    	MT_SUBMATRCLA_1105_MDM dm = new MT_SUBMATRCLA_1105_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

        ds = (MT_SUBMATRCLA_1105_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
	
	public void mt_submatrcla_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1110_LDataSet ds = null;

		MT_SUBMATRCLA_1110_LDM dm = new MT_SUBMATRCLA_1110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
		dm.res_yn = Util.checkString(req.getParameter("res_yn"));
		dm.print();

		ds = (MT_SUBMATRCLA_1110_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1111_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1111_UDataSet ds = null;

		MT_SUBMATRCLA_1111_UDM dm = new MT_SUBMATRCLA_1111_UDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
		dm.acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
		dm.decid_key = Util.checkString(req.getParameter("decid_key"));
		dm.print();

		ds = (MT_SUBMATRCLA_1111_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1120_LDataSet ds = null;

		MT_SUBMATRCLA_1120_LDM dm = new MT_SUBMATRCLA_1120_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
		dm.print();

		ds = (MT_SUBMATRCLA_1120_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1130_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1130_ADataSet ds = null;

		MT_SUBMATRCLA_1130_ADM dm = new MT_SUBMATRCLA_1130_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.gubun       = (String)hash.get("m");
		dm.occr_dt     = (String)hash.get("occr_dt");
		dm.sub_seq     = (String)hash.get("sub_seq");
		dm.seq         = (String)hash.get("seq");
		dm.matr_cd     = (String)hash.get("matr_cd");
		dm.item_nm     = (String)hash.get("item_nm");
		dm.std         = (String)hash.get("std");
		dm.unit        = (String)hash.get("unit");
		dm.clam_qunt   = (String)hash.get("clam_qunt");
		dm.fix_qunt    = (String)hash.get("fix_qunt");
		dm.uprc        = (String)hash.get("uprc");
		dm.amt         = (String)hash.get("amt");
		dm.res_yn      = (String)hash.get("res_yn");
		dm.usag        = (String)hash.get("usag");
		dm.clam_clsf   = (String)hash.get("clam_clsf");
		dm.paper_clsf  = (String)hash.get("paper_clsf");
		dm.pay_posb_dt = (String)hash.get("pay_posb_dt");
		dm.recp_pers   = (String)hash.get("recp_pers");
		dm.pay_posb_dt = (String)hash.get("pay_posb_dt");
		dm.job_cntc_no = (String)hash.get("job_cntc_no");
		dm.remk        = (String)hash.get("remk");

		/*String[] converted      = convertMultiUpdateData(multiUpdateData);

		String gubun 	        = converted[0];
		String sub_seq          = converted[2];
		String occr_dt          = converted[3];
		String seq              = converted[4];
		String matr_cd          = converted[6];
		String item_nm          = converted[7];
		String std              = converted[8];
		String unit             = converted[9];
		String clam_qunt        = converted[10];
		String usag             = converted[11];
		String pay_posb_dt      = converted[12];
		String fix_qunt         = converted[13];
		String uprc             = converted[14];
		String amt              = converted[15];
		String res_yn           = converted[16];
		String recp_pers        = converted[17];
		String job_cntc_no      = converted[19];
		String remk             = converted[20];

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setSub_seq(sub_seq);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setMatr_cd(matr_cd);
		dm.setItem_nm(item_nm);
		dm.setStd(std);
		dm.setUnit(unit);
		dm.setClam_qunt(clam_qunt);
		dm.setUsag(usag);
		dm.setPay_posb_dt(pay_posb_dt);
		dm.setFix_qunt(fix_qunt);
		dm.setUprc(uprc);
		dm.setAmt(amt);
		dm.setRes_yn(res_yn);
		dm.setRecp_pers(recp_pers);
		dm.setJob_cntc_no(job_cntc_no);
		dm.setRemk(remk); */

		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_SUBMATRCLA_1130_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1140_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1140_LDataSet ds = null;

		MT_SUBMATRCLA_1140_LDM dm = new MT_SUBMATRCLA_1140_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
		dm.acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
		dm.acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.res_yn = Util.checkString(req.getParameter("res_yn"));
		dm.acpn_yn = Util.checkString(req.getParameter("acpn_yn"));
		dm.name = Util.checkString(req.getParameter("iv_name"));
		dm.reqgubun = Util.checkString(req.getParameter("reqgubun"));
		dm.group = Util.checkString(req.getParameter("group"));
		dm.print();

		ds = (MT_SUBMATRCLA_1140_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1141_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1141_LDataSet ds = null;

		MT_SUBMATRCLA_1141_LDM dm = new MT_SUBMATRCLA_1141_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
		dm.acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
		dm.acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.res_yn = Util.checkString(req.getParameter("res_yn"));
		dm.acpn_yn = Util.checkString(req.getParameter("acpn_yn"));
		dm.name = Util.checkString(req.getParameter("iv_name"));
		dm.reqgubun = Util.checkString(req.getParameter("reqgubun"));
		dm.group = Util.checkString(req.getParameter("group"));
		dm.print();

		ds = (MT_SUBMATRCLA_1141_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1142_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1142_LDataSet ds = null;

		MT_SUBMATRCLA_1142_LDM dm = new MT_SUBMATRCLA_1142_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
		dm.acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
		dm.acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.res_yn = Util.checkString(req.getParameter("res_yn"));
		dm.acpn_yn = Util.checkString(req.getParameter("acpn_yn"));
		dm.name = Util.checkString(req.getParameter("iv_name"));
		dm.reqgubun = Util.checkString(req.getParameter("reqgubun"));
		dm.group = Util.checkString(req.getParameter("group"));
		dm.print();

		ds = (MT_SUBMATRCLA_1142_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1143_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1143_LDataSet ds = null;

		MT_SUBMATRCLA_1143_LDM dm = new MT_SUBMATRCLA_1143_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
		dm.acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
		dm.acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.res_yn = Util.checkString(req.getParameter("res_yn"));
		dm.acpn_yn = Util.checkString(req.getParameter("acpn_yn"));
		dm.name = Util.checkString(req.getParameter("iv_name"));
		dm.reqgubun = Util.checkString(req.getParameter("reqgubun"));
		dm.group = Util.checkString(req.getParameter("group"));
		dm.print();

		ds = (MT_SUBMATRCLA_1143_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1150_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1150_LDataSet ds = null;

		MT_SUBMATRCLA_1150_LDM dm = new MT_SUBMATRCLA_1150_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_SUBMATRCLA_1150_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1160_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1160_LDataSet ds = null;

		MT_SUBMATRCLA_1160_LDM dm = new MT_SUBMATRCLA_1160_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.recp_pers = Util.checkString(req.getParameter("recp_pers"));
		dm.print();

		ds = (MT_SUBMATRCLA_1160_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_1310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1310_LDataSet ds = null;

		MT_SUBMATRCLA_1310_LDM dm = new MT_SUBMATRCLA_1310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_SUBMATRCLA_1310_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_SUBMATRCLA_1410_LDataSet ds = null;
		
    	MT_SUBMATRCLA_1410_LDM dm = new MT_SUBMATRCLA_1410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_SUBMATRCLA_1410_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
		
		
		
	}
	
	public void mt_submatrcla_1420_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_SUBMATRCLA_1420_ADataSet ds = null;
		
		MT_SUBMATRCLA_1420_ADM dm = new MT_SUBMATRCLA_1420_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.close_dt = Util.checkString(req.getParameter("close_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_SUBMATRCLA_1420_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
}