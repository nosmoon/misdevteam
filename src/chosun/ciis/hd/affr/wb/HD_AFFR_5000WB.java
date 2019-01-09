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

public class HD_AFFR_5000WB extends BaseWB {

	public void hd_affr_4000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4000_LDataSet ds = null;
		HD_AFFR_4000_LDM dm = new HD_AFFR_4000_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);


		dm.print();

		ds = (HD_AFFR_4000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4001_LDataSet ds = null;
		HD_AFFR_4001_LDM dm = new HD_AFFR_4001_LDM();

		String new_aply_basi_dt = Util.checkString(req.getParameter("n_aply_basi_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));
		}


		dm.aply_basi_dt = Util.checkString(new_aply_basi_dt);
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (HD_AFFR_4001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4002_ADataSet ds = null;
		HD_AFFR_4002_ADM dm = new HD_AFFR_4002_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode			= ((String)hash.get("m")).toUpperCase();
		dm.aply_basi_dt	= (String)hash.get("aply_basi_dt");
		dm.seq			= (String)hash.get("seq");
		dm.pont_clsf	= (String)hash.get("pont_clsf");
		dm.pont			= (String)hash.get("pont");

		dm.cmpy_cd		= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.u_ipadd		= req.getRemoteAddr();
		dm.u_id			= Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_AFFR_4002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4100_LDataSet ds = null;
		HD_AFFR_4100_LDM dm = new HD_AFFR_4100_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));

		dm.print();

		ds = (HD_AFFR_4100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4101_ADataSet ds = null;
		HD_AFFR_4101_ADM dm = new HD_AFFR_4101_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode					= ((String)hash.get("m")).toUpperCase();
		dm.emp_no				= (String)hash.get("emp_no");
		dm.dept_cd				= (String)hash.get("dept_cd");
		dm.in_cmpy_dt			= (String)hash.get("in_cmpy_dt");
		dm.lvcmpy_dt			= (String)hash.get("lvcmpy_dt");
		dm.frdt					= (String)hash.get("frdt");
		dm.stop_dt				= (String)hash.get("stop_dt");
		dm.cont_svc_yys			= (String)hash.get("cont_svc_yys");
		dm.rest_vaca_yys_clsf	= (String)hash.get("rest_vaca_yys_clsf");
		dm.base_pont			= (String)hash.get("base_pont");
		dm.faml_pont			= (String)hash.get("faml_pont");
		dm.cont_svc_pont		= (String)hash.get("cont_svc_pont");
		dm.rest_pont			= (String)hash.get("rest_pont");
		dm.dty_taem_chf_un_norm	= (String)hash.get("dty_taem_chf_un_norm");
		dm.dty_comite_memb		= (String)hash.get("dty_comite_memb");
		dm.pont_tot				= (String)hash.get("pont_tot");
		dm.use_pont				= (String)hash.get("use_pont");
		dm.rsrt_amt				= (String)hash.get("rsrt_amt");
		dm.cmpy_cd				= (String)hash.get("cmpy_cd");
		dm.aply_yy				= (String)hash.get("aply_yy");

		dm.act_flag		= Util.checkString(req.getParameter("act_flag"));
		dm.in_aply_yy	= Util.checkString(req.getParameter("aply_yy"));
		dm.in_cmpy_cd	= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.u_ipadd		= req.getRemoteAddr();
		dm.u_id			= Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_AFFR_4101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4102_LDataSet ds = null;
		HD_AFFR_4102_LDM dm = new HD_AFFR_4102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no  = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_AFFR_4102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4103_LDataSet ds = null;
		HD_AFFR_4103_LDM dm = new HD_AFFR_4103_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));

		dm.print();

		ds = (HD_AFFR_4103_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4104_LDataSet ds = null;
		HD_AFFR_4104_LDM dm = new HD_AFFR_4104_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_AFFR_4104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4201_ADataSet ds = null;
		HD_AFFR_4201_ADM dm = new HD_AFFR_4201_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.nm_korn = (String)hash.get("nm_korn");
		dm.prn = (String)hash.get("prn");
		dm.use_dt = (String)hash.get("use_dt");
		dm.use_plac = (String)hash.get("use_plac");
		dm.indt_nm = (String)hash.get("indt_nm");
		dm.indt_cd = (String)hash.get("indt_cd");
		dm.use_amt = (String)hash.get("use_amt");
		dm.aprv_dt = (String)hash.get("aprv_dt");

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_AFFR_4201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4200_LDataSet ds = null;
		HD_AFFR_4200_LDM dm = new HD_AFFR_4200_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_yymm = Util.checkString(req.getParameter("aply_yymm"));

		dm.print();

		ds = (HD_AFFR_4200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_5000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_5000_LDataSet ds = null;
		HD_AFFR_5000_LDM dm = new HD_AFFR_5000_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);


		String session_emp_no = Util.checkString(req.getParameter("session_emp_no"));

		if("OK".equals(session_emp_no)) {
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		}else{
			dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		}

		dm.print();
		
		ds = (HD_AFFR_5000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_5010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_5010_LDataSet ds = null;
		HD_AFFR_5010_LDM dm = new HD_AFFR_5010_LDM();

		//dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpycd"));

		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_AFFR_5010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_5011_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_5011_ADataSet ds = null;
		HD_AFFR_5011_ADM dm = new HD_AFFR_5011_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.aplc_dt = (String)hash.get("aplc_dt");
		dm.issu_num_shet = (String)hash.get("issu_num_shet");
		dm.usag = (String)hash.get("usag");
		dm.certi_clsf = (String)hash.get("certi_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.remk = (String)hash.get("remk");
		//dm.cmpy_cd = (String)hash.get("cmpy_cd");
		//dm.emp_no = (String)hash.get("emp_no");
		dm.cntc_plac = (String)hash.get("cntc_plac");
		dm.email = (String)hash.get("email");
		dm.engl_flnm = (String)hash.get("engl_flnm");

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.u_ipadd =  req.getRemoteAddr();
	    dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
	    dm.print();

		ds = (HD_AFFR_5011_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	
	public void hd_affr_5012_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_5012_LDataSet ds = null;
		HD_AFFR_5012_LDM dm = new HD_AFFR_5012_LDM();

		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_AFFR_5012_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_5020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_5020_LDataSet ds = null;
		HD_AFFR_5020_LDM dm = new HD_AFFR_5020_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.st_aplc_dt = Util.checkString(req.getParameter("st_aplc_dt"));
		dm.en_aplc_dt = Util.checkString(req.getParameter("en_aplc_dt"));

		dm.print();

		ds = (HD_AFFR_5020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_5021(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_5021_ADataSet ds = null;
		HD_AFFR_5021_ADM dm = new HD_AFFR_5021_ADM();

		System.out.println("111111111111111111111111111111");

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no  = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.emp_no = Util.checkString(req.getParameter("emp_no"));		
        // 출장자
		dm.mode = ((String)hash.get("m")).toUpperCase(); 
		//dm.mode = (String)hash.get("send");
		//dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));		
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.certi_clsf = (String)hash.get("certi_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.aplc_dt = (String)hash.get("aplc_dt");
		System.out.println("222222222222222222222222222");
		dm.print();
		System.out.println("33333333333333333333333333");
		ds = (HD_AFFR_5021_ADataSet)manager.executeCall(dm);
		System.out.println("444444444444444444444444");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_4300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4300_LDataSet ds = null;
		HD_AFFR_4300_LDM dm = new HD_AFFR_4300_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_4300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4301_LDataSet ds = null;
		HD_AFFR_4301_LDM dm = new HD_AFFR_4301_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
		dm.occr_todt = Util.checkString(req.getParameter("occr_todt"));

		dm.print();

		ds = (HD_AFFR_4301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4302_ADataSet ds = null;
		HD_AFFR_4302_ADM dm = new HD_AFFR_4302_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.category_clsf = (String)hash.get("category_clsf");
		dm.grp_indt_clsf = (String)hash.get("grp_indt_clsf");
		dm.indt_cd = (String)hash.get("indt_cd");
		dm.indt_nm = (String)hash.get("indt_nm");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_4302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_4400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_4400_LDataSet ds = null;
		HD_AFFR_4400_LDM dm = new HD_AFFR_4400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.use_dt_fr = Util.checkString(req.getParameter("use_dt_fr"));
		dm.use_dt_to = Util.checkString(req.getParameter("use_dt_to"));

		dm.print();

		ds = (HD_AFFR_4400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
