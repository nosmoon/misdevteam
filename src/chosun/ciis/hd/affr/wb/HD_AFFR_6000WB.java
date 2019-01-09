/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.affr.wb;

import java.rmi.RemoteException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */
 
public class HD_AFFR_6000WB extends BaseWB {
 
	public void hd_affr_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6000_LDataSet ds = null;
		HD_AFFR_6000_LDM dm = new HD_AFFR_6000_LDM();
		
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.st_aplc_dt = Util.checkString(req.getParameter("st_aplc_dt"));
		dm.en_aplc_dt = Util.checkString(req.getParameter("en_aplc_dt"));
		dm.certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
		dm.issu_clsf = Util.checkString(req.getParameter("issu_clsf"));

		dm.print();

		ds = (HD_AFFR_6000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6003_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6003_MDataSet ds = null;
		HD_AFFR_6003_MDM dm = new HD_AFFR_6003_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_AFFR_6003_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	
	}
	
	public void hd_affr_6011_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6011_ADataSet ds = null;
		HD_AFFR_6011_ADM dm = new HD_AFFR_6011_ADM();

		String seq  = req.getParameter("seq");
		String mode = "I";
		String dty_cd_ck = Util.checkString(req.getParameter("dty_cd_ck"));
		String posi_cd_ck = Util.checkString(req.getParameter("posi_cd_ck"));
		String dirc_incmg_posi_ck = Util.checkString(req.getParameter("dirc_incmg_posi_ck"));
		String chce_posi_clsf = "";
		
		if(!("".equals(seq) || seq == null)) mode = "U";
		if("10".equals(dty_cd_ck)) chce_posi_clsf = dty_cd_ck;
		if("20".equals(posi_cd_ck)) chce_posi_clsf = posi_cd_ck;
		if("30".equals(dirc_incmg_posi_ck)) chce_posi_clsf = dirc_incmg_posi_ck;
		
		dm.mode = Util.checkString(mode);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
		dm.aplc_seq = Util.checkString(req.getParameter("aplc_seq"));
		dm.issu_num_shet = Util.checkString(req.getParameter("issu_num_shet"));
		dm.usag = Util.checkString(req.getParameter("usag"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
		dm.email = Util.checkString(req.getParameter("email"));
		dm.korn_flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.dirc_incmg_posi = Util.checkString(req.getParameter("dirc_incmg_posi"));
		dm.chce_posi_clsf = Util.checkString(chce_posi_clsf);
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
		dm.busi_trip_area = Util.checkString(req.getParameter("busi_trip_area"));
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
		dm.engl_flnm = Util.checkString(req.getParameter("engl_flnm"));
		dm.engl_bidt = Util.checkString(req.getParameter("engl_bidt"));
		dm.engl_dept_posi = Util.checkString(req.getParameter("engl_dept_posi"));
		dm.engl_in_cmpy_dt = Util.checkString(req.getParameter("engl_in_cmpy_dt"));
		dm.engl_now_dt = Util.checkString(req.getParameter("engl_now_dt"));
		dm.engl_busi_trip_purp = Util.checkString(req.getParameter("engl_busi_trip_purp"));
		dm.engl_busi_trip_area = Util.checkString(req.getParameter("engl_busi_trip_area"));
		dm.engl_busi_trip_frdt = Util.checkString(req.getParameter("engl_busi_trip_frdt"));
		dm.engl_busi_trip_todt = Util.checkString(req.getParameter("engl_busi_trip_todt"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.issu_clsf = Util.checkString(req.getParameter("issu_clsf"));
		dm.issu_no = Util.checkString(req.getParameter("issu_no"));
		dm.uipadd = req.getRemoteAddr();
		dm.uid = Util.getSessionParameterValue(req, "emp_no", true);
		dm.now_dt = Util.checkString(req.getParameter("et_in_cmpy_dt"));
		dm.print();

		ds = (HD_AFFR_6011_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6010_LDataSet ds = null;
		HD_AFFR_6010_LDM dm = new HD_AFFR_6010_LDM();
		
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.convertNull(req.getParameter("cmpy_cd"), Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();

		ds = (HD_AFFR_6010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_6012_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6012_ADataSet ds = null;
		HD_AFFR_6012_ADM dm = new HD_AFFR_6012_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
		dm.u_id = Util.checkString(req.getParameter("u_id"));
		dm.print();

		ds = (HD_AFFR_6012_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6013_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6013_LDataSet ds = null;
		HD_AFFR_6013_LDM dm = new HD_AFFR_6013_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_6013_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_6021_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6021_LDataSet ds = null;
		HD_AFFR_6021_LDM dm = new HD_AFFR_6021_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (HD_AFFR_6021_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6022_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6022_LDataSet ds = null;
		HD_AFFR_6022_LDM dm = new HD_AFFR_6022_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		ds = (HD_AFFR_6022_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6023_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6023_LDataSet ds = null;
		HD_AFFR_6023_LDM dm = new HD_AFFR_6023_LDM();

		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.convertNull(Util.checkString(req.getParameter("cmpy_cd")), Util.getSessionParameterValue(req, "cmpycd", true));
		
		dm.print();
		
		ds = (HD_AFFR_6023_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6024_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6024_ADataSet ds = null;
		HD_AFFR_6024_ADM dm = new HD_AFFR_6024_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;
		    
		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);
		
		String carr_mode		= converted[0];
		String carr_appmt_dt	= converted[6];
		String carr_appmt_cont	= converted[7];
		String carr_dept_cd	= converted[10];
		String carr_dty_cd		= converted[3];
		String carr_posi_cd		= converted[4];
		String carr_prt_usag_dty_cd		= converted[5];
		String carr_remk	= converted[8];
		String carr_seq	= converted[9];
		String carr_emp_no	= converted[11];
		String carr_cmpy_cd	= converted[12];
		String carr_occr_dt	= converted[13];
		String carr_certi_clsf	= converted[14];

		String seq  = req.getParameter("seq");
		String mode = "I";
		
		if(!("".equals(seq) || seq == null)) mode = "U";
		
		dm.setCarr_mode(carr_mode.toUpperCase());
		dm.setCarr_appmt_dt(carr_appmt_dt);
		dm.setCarr_appmt_cont(carr_appmt_cont);
		dm.setCarr_dept_cd(carr_dept_cd);
		dm.setCarr_dty_cd(carr_dty_cd);
		dm.setCarr_posi_cd(carr_posi_cd);
		dm.setCarr_prt_usag_dty_cd(carr_prt_usag_dty_cd);
		dm.setCarr_remk(carr_remk);
		dm.setCarr_seq(carr_seq);
		dm.setCarr_emp_no(carr_emp_no);
		dm.setCarr_cmpy_cd(carr_cmpy_cd);
		dm.setCarr_occr_dt(carr_occr_dt);
		dm.setCarr_certi_clsf(carr_certi_clsf);
		
		dm.mode = Util.checkString(mode);
		
		System.out.println("emp_no=>"+req.getParameter("emp_no"));
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
		dm.aplc_seq = Util.checkString(req.getParameter("aplc_seq"));
		dm.issu_num_shet = Util.checkString(req.getParameter("issu_num_shet"));
		dm.usag = Util.checkString(req.getParameter("usag"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
		dm.email = Util.checkString(req.getParameter("email"));
		dm.korn_flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.dirc_incmg_posi = Util.checkString(req.getParameter("dirc_incmg_posi"));
		dm.chce_posi_clsf = Util.checkString(req.getParameter("chce_posi_clsf"));
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.issu_clsf = Util.checkString(req.getParameter("issu_clsf"));
		dm.issu_no = Util.checkString(req.getParameter("issu_no"));
		dm.uipadd = req.getRemoteAddr();
		dm.uid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
	
		ds = (HD_AFFR_6024_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_6100_LDataSet ds = null;
		HD_AFFR_6100_LDM dm = new HD_AFFR_6100_LDM();
		
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.st_aplc_dt = Util.checkString(req.getParameter("st_aplc_dt"));
		dm.en_aplc_dt = Util.checkString(req.getParameter("en_aplc_dt"));
		dm.certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
		dm.issu_clsf = Util.checkString(req.getParameter("issu_clsf"));

		dm.print();

		ds = (HD_AFFR_6100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_6101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6101_ADataSet ds = null;
		HD_AFFR_6101_ADM dm = new HD_AFFR_6101_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.certi_clsf = (String)hash.get("certi_clsf");
		dm.uid = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_6101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

}