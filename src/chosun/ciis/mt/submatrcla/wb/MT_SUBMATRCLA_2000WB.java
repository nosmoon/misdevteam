
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

public class MT_SUBMATRCLA_2000WB extends BaseWB {

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
  
	public void mt_submatrcla_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2000_LDataSet ds = null;
		
		MT_SUBMATRCLA_2000_LDM dm = new MT_SUBMATRCLA_2000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.print();

		ds = (MT_SUBMATRCLA_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2000_500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2000_500_LDataSet ds = null;
		
		MT_SUBMATRCLA_2000_500_LDM dm = new MT_SUBMATRCLA_2000_500_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.print();

		ds = (MT_SUBMATRCLA_2000_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2001_LDataSet ds = null;
		MT_SUBMATRCLA_2001_LDM dm = new MT_SUBMATRCLA_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (MT_SUBMATRCLA_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2002_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2002_MDataSet ds = null;
		MT_SUBMATRCLA_2002_MDM dm = new MT_SUBMATRCLA_2002_MDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"uid",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.print();

		ds = (MT_SUBMATRCLA_2002_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	
	public void mt_submatrcla_2003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2003_ADataSet ds = null;
		
		MT_SUBMATRCLA_2003_ADM dm = new MT_SUBMATRCLA_2003_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		
		String gubun 	        = converted[0];
		String occr_dt          = converted[3];
		String seq              = converted[4];
		String sub_seq          = converted[5];
		String matr_cd          = converted[7];
		String matr_nm          = converted[8];
		String std_modl              = converted[9];
		String clam_qunt        = converted[10];
		String usag             = converted[11];
		String purc_uprc             = converted[12];
		String fix_qunt         = converted[13];
		String unit             = converted[14];
		String res_yn           = converted[16];
		String buy_proc_stat    = converted[17];
		
		//dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setSub_seq(sub_seq);
		dm.setMatr_cd(matr_cd);
		dm.setMatr_nm(matr_nm);
		dm.setStd_modl(std_modl);
		dm.setClam_qunt(clam_qunt);
		dm.setUsag(usag);
		dm.setPurc_uprc(purc_uprc);
		dm.setFix_qunt(fix_qunt);
		dm.setUnit(unit);
		dm.setRes_yn(res_yn);
		dm.setBuy_proc_stat(buy_proc_stat);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.amt = Util.checkString(req.getParameter("amt"));
		dm.recp_hope_dt = Util.checkString(req.getParameter("recp_hope_dt"));
		dm.recp_pers = Util.checkString(req.getParameter("recp_pers"));
		dm.pay_posb_dt = Util.checkString(req.getParameter("pay_posb_dt"));
		dm.via_dept_yn = Util.checkString(req.getParameter("via_dept_yn"));
		dm.acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
	 	dm.proc_pers = Util.checkString(req.getParameter("proc_pers"));
		dm.canc_yn = Util.checkString(req.getParameter("canc_yn"));
		dm.canc_pers = Util.checkString(req.getParameter("canc_pers"));
		dm.non_out_dt = Util.checkString(req.getParameter("non_out_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.rela_yn = Util.checkString(req.getParameter("rela_yn"));
		dm.print();

		ds = (MT_SUBMATRCLA_2003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_2004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2004_LDataSet ds = null;
		
		MT_SUBMATRCLA_2004_LDM dm = new MT_SUBMATRCLA_2004_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print();

		ds = (MT_SUBMATRCLA_2004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2005_ADataSet ds = null;
		
		MT_SUBMATRCLA_2005_ADM dm = new MT_SUBMATRCLA_2005_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.clam_clsf = Util.checkString(req.getParameter("clam_clsf"));
		dm.clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
		dm.via_dept = Util.checkString(req.getParameter("via_dept"));
		dm.aplc_pers = Util.checkString(req.getParameter("aplc_pers"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.rela_yn = Util.checkString(req.getParameter("rela_yn"));
		dm.print();

		ds = (MT_SUBMATRCLA_2005_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2006_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2006_ADataSet ds = null;
		
		MT_SUBMATRCLA_2006_ADM dm = new MT_SUBMATRCLA_2006_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.doc_type = Util.checkString(req.getParameter("doc_type"));
		dm.doc_nm = Util.checkString(req.getParameter("doc_nm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.print();

		ds = (MT_SUBMATRCLA_2006_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2010_ADataSet ds = null;
		MT_SUBMATRCLA_2010_ADM dm = new MT_SUBMATRCLA_2010_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.clam_clsf = Util.checkString(req.getParameter("clam_clsf"));
		dm.clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
		dm.via_dept = Util.checkString(req.getParameter("via_dept"));
		dm.aplc_pers = Util.checkString(req.getParameter("aplc_pers"));
		dm.buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
		
		dm.mode = Util.checkString((String)hash.get("m")).toUpperCase();
		dm.sub_seq = Util.checkString((String)hash.get("sub_seq"));
		dm.matr_cd = Util.checkString((String)hash.get("matr_cd"));
		dm.matr_nm = Util.checkString((String)hash.get("matr_nm"));
		dm.std_modl = Util.checkString((String)hash.get("std_modl"));
		dm.unit = Util.checkString((String)hash.get("unit"));
		dm.clam_qunt = Util.checkString((String)hash.get("clam_qunt"));
		dm.fix_qunt = Util.checkString((String)hash.get("fix_qunt"));
		dm.purc_uprc = Util.checkString((String)hash.get("purc_uprc"));
		dm.amt = Util.checkString((String)hash.get("amt"));
		dm.usag = Util.checkString((String)hash.get("usag"));
		dm.print();

		ds = (MT_SUBMATRCLA_2010_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2010_500_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2010_500_ADataSet ds = null;
		MT_SUBMATRCLA_2010_500_ADM dm = new MT_SUBMATRCLA_2010_500_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.clam_clsf = Util.checkString(req.getParameter("clam_clsf"));
		dm.clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
		dm.via_dept = Util.checkString(req.getParameter("via_dept"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.aplc_pers = Util.checkString(req.getParameter("aplc_pers"));
		dm.buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
		
		dm.mode = Util.checkString((String)hash.get("m")).toUpperCase();
		dm.sub_seq = Util.checkString((String)hash.get("sub_seq"));
		dm.matr_cd = Util.checkString((String)hash.get("matr_cd"));
		dm.matr_nm = Util.checkString((String)hash.get("matr_nm"));
		dm.std_modl = Util.checkString((String)hash.get("std_modl"));
		dm.unit = Util.checkString((String)hash.get("unit"));
		dm.clam_qunt = Util.checkString((String)hash.get("clam_qunt"));
		dm.fix_qunt = Util.checkString((String)hash.get("fix_qunt"));
		dm.purc_uprc = Util.checkString((String)hash.get("purc_uprc"));
		dm.amt = Util.checkString((String)hash.get("amt"));
		dm.usag = Util.checkString((String)hash.get("usag"));
		dm.print();

		ds = (MT_SUBMATRCLA_2010_500_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_2020_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2020_UDataSet ds = null;
		MT_SUBMATRCLA_2020_UDM dm = new MT_SUBMATRCLA_2020_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.decid_key = Util.checkString(req.getParameter("decid_key"));
		dm.print();

		ds = (MT_SUBMATRCLA_2020_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

}