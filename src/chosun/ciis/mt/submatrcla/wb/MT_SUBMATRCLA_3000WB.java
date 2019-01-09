
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
import chosun.ciis.mt.commatr.dm.MT_COMMATR_7320_ADM;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_7320_ADataSet;
import chosun.ciis.mt.common.dm.MT_COMMON_MATR_0004_LDM;
import chosun.ciis.mt.common.ds.MT_COMMON_MATR_0004_LDataSet;
import chosun.ciis.mt.outsdelmt.dm.MT_OUTSDELMT_3003_LDM;
import chosun.ciis.mt.outsdelmt.ds.MT_OUTSDELMT_3003_LDataSet;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;



public class MT_SUBMATRCLA_3000WB extends BaseWB {

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
    
    public void mt_submatrcla_3100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3100_MDataSet ds = null;
		MT_SUBMATRCLA_3100_MDM dm = new MT_SUBMATRCLA_3100_MDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_SUBMATRCLA_3100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_3101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3101_LDataSet ds = null;
		
		MT_SUBMATRCLA_3101_LDM dm = new MT_SUBMATRCLA_3101_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print(); 

		ds = (MT_SUBMATRCLA_3101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void mt_submatrcla_3102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3102_LDataSet ds = null;
		MT_SUBMATRCLA_3102_LDM dm = new MT_SUBMATRCLA_3102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (MT_SUBMATRCLA_3102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void mt_submatrcla_3103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3103_ADataSet ds = null;
		MT_SUBMATRCLA_3103_ADM dm = new MT_SUBMATRCLA_3103_ADM();

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
		dm.part_cd = Util.checkString((String)hash.get("part_cd"));
		dm.part_nm = Util.checkString((String)hash.get("part_nm"));
		dm.std_modl = Util.checkString((String)hash.get("std_modl"));
		dm.unit = Util.checkString((String)hash.get("unit"));
		dm.clam_qunt = Util.checkString((String)hash.get("clam_qunt"));
		dm.fix_qunt = Util.checkString((String)hash.get("fix_qunt"));
		dm.purc_uprc = Util.checkString((String)hash.get("purc_uprc"));
		dm.amt = Util.checkString((String)hash.get("amt"));
		dm.usag = Util.checkString((String)hash.get("usag"));
		dm.dlco_no = Util.checkString((String)hash.get("dlco_no"));
		dm.part_clas1 = Util.checkString((String)hash.get("part_clas1"));
		dm.frex_unit = Util.checkString((String)hash.get("frex_unit"));
		
		
		dm.print();

		ds = (MT_SUBMATRCLA_3103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	 /**
     * 자재코드의 단가 조회
     */
    public void getMt_submatrcla_3104(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRCLA_3104_LDataSet ds = null;
				
        // DM Setting
		MT_SUBMATRCLA_3104_LDM dm = new MT_SUBMATRCLA_3104_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setAply_dt(Util.checkString(req.getParameter("aply_dt")));
   	    dm.setOutsd_elmt_clsf(Util.checkString(req.getParameter("outsd_elmt_clsf")));
    	dm.print();
    	
    	ds = (MT_SUBMATRCLA_3104_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
	
	public void mt_submatrcla_3201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3201_LDataSet ds = null;

		MT_SUBMATRCLA_3201_LDM dm = new MT_SUBMATRCLA_3201_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
		dm.res_yn = Util.checkString(req.getParameter("res_yn"));
		dm.print();

		ds = (MT_SUBMATRCLA_3201_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_3202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3202_LDataSet ds = null;

		MT_SUBMATRCLA_3202_LDM dm = new MT_SUBMATRCLA_3202_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
		dm.print();
		ds = (MT_SUBMATRCLA_3202_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_3203_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3203_ADataSet ds = null;

		MT_SUBMATRCLA_3203_ADM dm = new MT_SUBMATRCLA_3203_ADM();
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
		dm.acpn_dt        = (String)hash.get("acpn_dt");
		dm.dlco_no = Util.checkString((String)hash.get("dlco_no"));
		dm.frex_unit   = (String)hash.get("frex_unit"); 
		dm.frex_uprc   = (String)hash.get("frex_uprc");
		

		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_SUBMATRCLA_3203_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_3310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3310_LDataSet ds = null;

		MT_SUBMATRCLA_3310_LDM dm = new MT_SUBMATRCLA_3310_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.part_nm = Util.checkString(req.getParameter("part_nm"));
		dm.part_clas1 = Util.checkString(req.getParameter("part_clas1"));
		dm.part_clas2 = Util.checkString(req.getParameter("part_clas2"));
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

		ds = (MT_SUBMATRCLA_3310_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
	
	public void mt_submatrcla_3320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRCLA_3320_LDataSet ds = null;
    	
    	// DM Setting
    	MT_SUBMATRCLA_3320_LDM dm = new MT_SUBMATRCLA_3320_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setClam_dt_fr(Util.checkString(req.getParameter("clam_dt_fr")));
    	dm.setClam_dt_to(Util.checkString(req.getParameter("clam_dt_to")));
    	dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setPart_cd(Util.checkString(req.getParameter("part_cd")));
    	dm.setAcpn_dt_fr(Util.checkString(req.getParameter("acpn_dt_fr")));
		dm.setAcpn_dt_to(Util.checkString(req.getParameter("acpn_dt_to")));
		dm.setPart_clas1(Util.checkString(req.getParameter("part_clas1")));
		dm.setEwh_clsf(Util.checkString(req.getParameter("ewh_clsf")));
		
    	dm.print();

        ds = (MT_SUBMATRCLA_3320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
	
	public void mt_submatrcla_3321_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3321_ADataSet ds = null;
		MT_SUBMATRCLA_3321_ADM dm = new MT_SUBMATRCLA_3321_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	        
		dm.gubun = Util.checkString((String)hash.get("chk_yn"));
		dm.occr_dt = Util.checkString((String)hash.get("occr_dt"));
		dm.seq = Util.checkString((String)hash.get("seq"));
		dm.sub_seq = Util.checkString((String)hash.get("sub_seq"));
		
		dm.setCmpy_cd(cmpy_cd);
		
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_SUBMATRCLA_3321_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_submatrcla_3501_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRCLA_3501_LDataSet ds = null;
    	
    	// DM Setting
    	MT_SUBMATRCLA_3501_LDM dm = new MT_SUBMATRCLA_3501_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setClam_dt_fr(Util.checkString(req.getParameter("clam_dt_fr")));
    	dm.setClam_dt_to(Util.checkString(req.getParameter("clam_dt_to")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setPart_cd(Util.checkString(req.getParameter("part_cd")));
    	dm.setPart_clas1(Util.checkString(req.getParameter("part_clas1")));
    	dm.setPart_nm(Util.checkString(req.getParameter("part_cm")));
    	dm.setStd_modl(Util.checkString(req.getParameter("std_modl")));
    	dm.print();

        ds = (MT_SUBMATRCLA_3501_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
		
}