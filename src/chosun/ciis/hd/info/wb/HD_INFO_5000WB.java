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

package chosun.ciis.hd.info.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.lang.*;

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
import chosun.ciis.hd.ddemp.dm.HD_DDEMP_1000_LDM;
import chosun.ciis.hd.ddemp.ds.HD_DDEMP_1000_LDataSet;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;
/**
 * 
 */

public class HD_INFO_5000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

        	
    public void hd_info_5210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5210_LDataSet ds = null;
		HD_INFO_5210_LDM dm = new HD_INFO_5210_LDM();
	
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
	public void hd_info_5211_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5211_LDataSet ds = null;
		HD_INFO_5211_LDM dm = new HD_INFO_5211_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		ds = (HD_INFO_5211_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5212_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5212_LDataSet ds = null;
		HD_INFO_5212_LDM dm = new HD_INFO_5212_LDM();

		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String emp_no = Util.checkString(req.getParameter("emp_no"));
		
		if("".equals(cmpy_cd)) {
			cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		}
		
		dm.cmpy_cd =  cmpy_cd;
		dm.emp_no =  emp_no;
		//dm.faml_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.faml_seq = Util.checkString(req.getParameter("faml_seq"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		
		dm.print();

		ds = (HD_INFO_5212_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_info_5213_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5213_ADataSet ds = null;
		HD_INFO_5213_ADM dm = new HD_INFO_5213_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.faml_seq = (String)hash.get("faml_seq");
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm");
		dm.ocpn_cd = (String)hash.get("ocpn_cd");
		dm.offi_nm = (String)hash.get("offi_nm");
		dm.posi = (String)hash.get("posi");
		dm.schir_cd = (String)hash.get("schir_cd");
		dm.nmat_yn = (String)hash.get("nmat_yn");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.proc_stat_req = (String)hash.get("proc_stat_req");
		dm.gubun = Util.checkString(req.getParameter("gubun"));
			
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		//dm.aplc_clsf_req = Util.checkString(req.getParameter("aplc_clsf_req"));
		
		dm.print();

		ds = (HD_INFO_5213_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5214_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5214_MDataSet ds = null;
		HD_INFO_5214_MDM dm = new HD_INFO_5214_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5214_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5220_LDataSet ds = null;
		HD_INFO_5220_LDM dm = new HD_INFO_5220_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5220_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5221_LDataSet ds = null;
		HD_INFO_5221_LDM dm = new HD_INFO_5221_LDM();

		
		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String emp_no = Util.checkString(req.getParameter("emp_no"));
		
		if("".equals(cmpy_cd)) {
			cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		}
		
		dm.cmpy_cd =  cmpy_cd;
		dm.emp_no =  emp_no;
		
		dm.frnc_word_seq = Util.checkString(req.getParameter("frnc_word_seq"));
		//dm.frnc_word_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		
		dm.print();
		
		ds = (HD_INFO_5221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5222_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5222_ADataSet ds = null;
		HD_INFO_5222_ADM dm = new HD_INFO_5222_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.frnc_word_cd = (String)hash.get("frnc_word_cd");
		dm.frnc_word_nm = (String)hash.get("frnc_word_flnm");
		dm.test_cd = (String)hash.get("test_cd");
		dm.test_nm = (String)hash.get("test_flnm");
		dm.test_grad = (String)hash.get("test_grad");
		dm.test_scor = (String)hash.get("test_scor");
		dm.test_dt = (String)hash.get("test_dt");
		dm.test_enfc_instt = (String)hash.get("test_enfc_instt");
		dm.spc_matt = (String)hash.get("spc_matt");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.frnc_word_seq = (String)hash.get("frnc_word_seq");
		dm.proc_stat_req = (String)hash.get("proc_stat_req");
		dm.gubun = Util.checkString(req.getParameter("gubun"));

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_INFO_5222_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5223_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5223_MDataSet ds = null;
		HD_INFO_5223_MDM dm = new HD_INFO_5223_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5223_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5230_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5230_LDataSet ds = null;
		HD_INFO_5230_LDM dm = new HD_INFO_5230_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
	
		ds = (HD_INFO_5230_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5231_LDataSet ds = null;
		HD_INFO_5231_LDM dm = new HD_INFO_5231_LDM();

		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String emp_no = Util.checkString(req.getParameter("emp_no"));
		
		if("".equals(cmpy_cd)) {
			cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		}
		
		dm.cmpy_cd =  cmpy_cd;
		dm.emp_no =  emp_no;

		//dm.qulf_pems_seq = Util.checkString(req.getParameter("qulf_pems_seq"));
		dm.qulf_pems_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		
		dm.print();

		ds = (HD_INFO_5231_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5232_ADataSet ds = null;
		HD_INFO_5232_ADM dm = new HD_INFO_5232_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.qulf_pems_cd = (String)hash.get("qulf_pems_cd");
		dm.qulf_pems_nm = (String)hash.get("qulf_pems_flnm");
		dm.acqr_dt = (String)hash.get("acqr_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.qulf_no = (String)hash.get("qulf_no");
		dm.qulf_pems_issu_plac_cd = (String)hash.get("qulf_pems_issu_plac_cd");	
		dm.qulf_pems_issu_plac_nm = (String)hash.get("qulf_pems_issu_plac_flnm");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.qulf_pems_seq = (String)hash.get("qulf_pems_seq");
		dm.proc_stat_req = (String)hash.get("proc_stat_req");
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_INFO_5232_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5233_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5233_MDataSet ds = null;
		HD_INFO_5233_MDM dm = new HD_INFO_5233_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5233_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5240_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5240_LDataSet ds = null;
		HD_INFO_5240_LDM dm = new HD_INFO_5240_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		ds = (HD_INFO_5240_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5241_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5241_LDataSet ds = null;
		HD_INFO_5241_LDM dm = new HD_INFO_5241_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5241_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5242_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5242_LDataSet ds = null;
		HD_INFO_5242_LDM dm = new HD_INFO_5242_LDM();

		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String emp_no = Util.checkString(req.getParameter("emp_no"));
		
		if("".equals(cmpy_cd)) {
			cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		}
		
		
		dm.cmpy_cd =  cmpy_cd;
		dm.emp_no =  emp_no;
		
		//dm.schir_seq = Util.checkString(req.getParameter("schir_seq"));
		dm.schir_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		
		dm.print();

		ds = (HD_INFO_5242_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5244_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5244_MDataSet ds = null;
		HD_INFO_5244_MDM dm = new HD_INFO_5244_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5244_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5243_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5243_ADataSet ds = null;
		HD_INFO_5243_ADM dm = new HD_INFO_5243_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.scl_clsf = (String)hash.get("scl_clsf");
		dm.scl_nm = (String)hash.get("scl_nm");
		dm.enty_dt = (String)hash.get("enty_dt");
		dm.grdu_dt = (String)hash.get("grdu_dt");
		dm.grdu_clsf = (String)hash.get("grdu_clsf");
		dm.degr_cd = (String)hash.get("degr_cd");
		dm.majr_clsf_1 = (String)hash.get("majr_clsf_1");
		dm.majr_nm_1 = (String)hash.get("majr_nm_1");
		dm.majr_clsf_2 = (String)hash.get("majr_clsf_2");
		dm.majr_nm_2 = (String)hash.get("majr_nm_2");
		dm.majr_clsf_3 = (String)hash.get("majr_clsf_3");
		dm.majr_nm_3 = (String)hash.get("majr_nm_3");
		dm.sclgg_kind_cd = (String)hash.get("sclgg_kind_cd");
		dm.plcw_cd = (String)hash.get("plcw_cd");
		dm.natn_cd = (String)hash.get("natn_cd");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.schir_seq = (String)hash.get("schir_seq");
		dm.proc_stat_req = (String)hash.get("proc_stat_req");
		dm.majr_cd_1 = (String)hash.get("majr_cd_1");
		dm.majr_cd_2 = (String)hash.get("majr_cd_2");
		dm.majr_cd_3 = (String)hash.get("majr_cd_3");
		dm.scl_cd = (String)hash.get("scl_cd");
		dm.gubun = Util.checkString(req.getParameter("gubun"));

		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_INFO_5243_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5250_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5250_LDataSet ds = null;
		HD_INFO_5250_LDM dm = new HD_INFO_5250_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

		ds = (HD_INFO_5250_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5251_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5251_LDataSet ds = null;
		HD_INFO_5251_LDM dm = new HD_INFO_5251_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5251_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5252_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5252_LDataSet ds = null;
		HD_INFO_5252_LDM dm = new HD_INFO_5252_LDM();

		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String emp_no = Util.checkString(req.getParameter("emp_no"));
		
		if("".equals(cmpy_cd)) {
			cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		}
		
		dm.cmpy_cd =  cmpy_cd;
		dm.emp_no =  emp_no;
		
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		//dm.carr_seq = Util.checkString(req.getParameter("carr_seq"));
		dm.carr_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
		dm.print();

		ds = (HD_INFO_5252_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5253_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5253_ADataSet ds = null;
		HD_INFO_5253_ADM dm = new HD_INFO_5253_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;

		String mode				= converted[0];
		String in_cmpy_dt		= converted[2];	
		String lvcmpy_dt		= converted[3];
		String offi_nm			= converted[4];
		String dty				= converted[5];
		String posk				= converted[6];
		String asaly			= converted[7];
		String lvcmpy_resn		= converted[8];
		String natn_cd			= converted[9];
		String duty_yys			= converted[10];
		String  duty_dds		= converted[11];
		String proc_stat		= converted[13];
		String seq				= converted[14];
		String occr_dt			= converted[15];
		String carr_seq			= converted[16];
		String proc_stat_req	= converted[17];
		
		dm.setMode(mode.toUpperCase());	
		dm.setIn_cmpy_dt(in_cmpy_dt);	
		dm.setLvcmpy_dt(lvcmpy_dt);    
		dm.setOffi_nm(offi_nm);      
		dm.setDty(dty);          
		dm.setPosk(posk);         
		dm.setAsaly(asaly);        
		dm.setLvcmpy_resn(lvcmpy_resn);  
		dm.setNatn_cd(natn_cd);      
		dm.setDuty_yys(duty_yys);     
		dm.setDuty_dds(duty_dds);    
		dm.setProc_stat(proc_stat);    
		dm.setSeq(seq);         
		dm.setOccr_dt(occr_dt);      
		dm.setCarr_seq(carr_seq);     
		dm.setProc_stat_req(proc_stat_req);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
	
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
	
		ds = (HD_INFO_5253_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5254_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5254_MDataSet ds = null;
		HD_INFO_5254_MDM dm = new HD_INFO_5254_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5254_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5260_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5260_LDataSet ds = null;
		HD_INFO_5260_LDM dm = new HD_INFO_5260_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5260_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5261_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5261_LDataSet ds = null;
		HD_INFO_5261_LDM dm = new HD_INFO_5261_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5261_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5262_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5262_LDataSet ds = null;
		HD_INFO_5262_LDM dm = new HD_INFO_5262_LDM();

		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String emp_no = Util.checkString(req.getParameter("emp_no"));
		
		if("".equals(cmpy_cd)) {
			cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		}
		
		dm.cmpy_cd =  cmpy_cd;
		dm.emp_no =  emp_no;
		
		//dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		//dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.saly_shft_bank_cd = Util.checkString(req.getParameter("saly_shft_bank_cd"));
		dm.alon_shft_bank_cd = Util.checkString(req.getParameter("alon_shft_bank_cd"));
		dm.encrg_amt_shft_bank_cd = Util.checkString(req.getParameter("encrg_amt_shft_bank_cd"));
		
		dm.print();

		ds = (HD_INFO_5262_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5263_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5263_ADataSet ds = null;
		HD_INFO_5263_ADM dm = new HD_INFO_5263_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		
//		String saly_shft_bank_cd				= converted[2];
//		String saly_shft_acct_no				= converted[3];
//		String alon_shft_bank_cd				= converted[4];
//		String alon_shft_acct_no				= converted[5];
//		String encrg_amt_shft_bank_cd			= converted[6];
//		String encrg_amt_shft_acct_no			= converted[7];
//		String etc_amt_shft_acct	= converted[8];
//		String proc_stat		= converted[10];
		
//		String proc_stat_req	= converted[13];
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.saly_shft_bank_cd = (String)hash.get("saly_shft_bank_cd");
		dm.saly_shft_acct_no = (String)hash.get("saly_shft_acct_no");
		dm.alon_shft_bank_cd = (String)hash.get("alon_shft_bank_cd");
		dm.alon_shft_acct_no = (String)hash.get("alon_shft_acct_no");
		dm.encrg_amt_shft_bank_cd = (String)hash.get("encrg_amt_shft_bank_cd");
		dm.encrg_amt_shft_acct_no = (String)hash.get("encrg_amt_shft_acct_no");
		dm.etc_amt_shft_acct = (String)hash.get("etc_amt_shft_acct");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.proc_stat_req = (String)hash.get("proc_stat_req");
		
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		//dm.aplc_clsf_req = Util.checkString(req.getParameter("aplc_clsf_req"));
		
	
		dm.print();
	
		ds = (HD_INFO_5263_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5264_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5264_MDataSet ds = null;
		HD_INFO_5264_MDM dm = new HD_INFO_5264_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5264_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5300_LDataSet ds = null;
		HD_INFO_5300_LDM dm = new HD_INFO_5300_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		dm.st_occr_dt = Util.checkString(req.getParameter("st_occr_dt"));
		dm.et_occr_dt = Util.checkString(req.getParameter("et_occr_dt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.print();

		ds = (HD_INFO_5300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5301_LDataSet ds = null;
		HD_INFO_5301_LDM dm = new HD_INFO_5301_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		
		ds = (HD_INFO_5301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5302_ADataSet ds = null;
		HD_INFO_5302_ADM dm = new HD_INFO_5302_ADM();

		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;
		    
		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		
		String mode				= converted[0];
		String proc_stat_yes	= converted[2];
		String proc_stat_no		= converted[3];
		String emp_no			= converted[5];
		String occr_dt			= converted[10];
		String seq				= converted[16];
		String remk				= converted[13];
		String proc_clsf		= converted[15];
		
		
		dm.setEmp_no(emp_no);
		dm.setMode(mode.toUpperCase());	
		dm.setProc_stat_yes(proc_stat_yes);
		dm.setProc_stat_no(proc_stat_no);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setRemk(remk);
		dm.setProc_clsf(proc_clsf);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);

	//	dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_INFO_5302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_5303_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_INFO_5303_MDataSet ds = null;
		HD_INFO_5303_MDM dm = new HD_INFO_5303_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_INFO_5303_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	public void hd_info_5101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5101_LDataSet ds = null;
		HD_INFO_5101_LDM dm = new HD_INFO_5101_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_INFO_5101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_5100_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_5100_ADataSet ds = null;
		HD_INFO_5100_ADM dm = new HD_INFO_5100_ADM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.addr_clsf_1 = Util.checkString(req.getParameter("addr_clsf_1"));
		dm.zip_1_1 = Util.checkString(req.getParameter("zip_1_1"));
		dm.zip_2_1 = Util.checkString(req.getParameter("zip_2_1"));
		dm.addr_1 = Util.checkString(req.getParameter("addr_1"));
		dm.addr_dtls_1 = Util.checkString(req.getParameter("addr_dtls_1"));
		dm.tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));
		dm.fax_no_1 = Util.checkString(req.getParameter("fax_no_1"));
		dm.ptph_no_1 = Util.checkString(req.getParameter("ptph_no_1"));
		dm.email_id_1 = Util.checkString(req.getParameter("email_id_1"));
		dm.addr_clsf_2 = Util.checkString(req.getParameter("addr_clsf_2"));
		dm.zip_1_2 = Util.checkString(req.getParameter("zip_1_2"));
		dm.zip_2_2 = Util.checkString(req.getParameter("zip_2_2"));
		dm.addr_2 = Util.checkString(req.getParameter("addr_2"));
		dm.addr_dtls_2 = Util.checkString(req.getParameter("addr_dtls_2"));
		dm.tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));
		dm.fax_no_2 = Util.checkString(req.getParameter("fax_no_2"));
		dm.ptph_no_2 = Util.checkString(req.getParameter("ptph_no_2"));
		dm.email_id_2 = Util.checkString(req.getParameter("email_id"));
		dm.addr_clsf_3 = Util.checkString(req.getParameter("addr_clsf_3"));
		dm.forn_zip_3 = Util.checkString(req.getParameter("forn_zip_3"));
		dm.forn_addr_3 = Util.checkString(req.getParameter("forn_addr_3"));
		dm.tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));
		dm.fax_no_3 = Util.checkString(req.getParameter("fax_no_3"));
		dm.ptph_no_3 = Util.checkString(req.getParameter("ptph_no_3"));
		dm.email_id_3 = Util.checkString(req.getParameter("email_id_3"));
		dm.addr_clsf_4 = Util.checkString(req.getParameter("addr_clsf_4"));
		dm.forn_zip_4 = Util.checkString(req.getParameter("forn_zip_4"));
		dm.forn_addr_4 = Util.checkString(req.getParameter("forn_addr_4"));
		dm.tel_no_4 = Util.checkString(req.getParameter("tel_no_4"));
		dm.fax_no_4 = Util.checkString(req.getParameter("fax_no_4"));
		dm.ptph_no_4 = Util.checkString(req.getParameter("ptph_no_4"));
		dm.email_id_4 = Util.checkString(req.getParameter("email_id_4"));
		dm.addr_clsf_5 = Util.checkString(req.getParameter("addr_clsf_5"));
		dm.tel_no_5 = Util.checkString(req.getParameter("tel_no_5"));
		dm.cntc_rshp = Util.checkString(req.getParameter("cntc_rshp"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();;
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_INFO_5100_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7000_LDataSet ds = null;
		HD_INFO_7000_LDM dm = new HD_INFO_7000_LDM();

		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));

		dm.print();

		ds = (HD_INFO_7000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_7001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7001_ADataSet ds = null;
		HD_INFO_7001_ADM dm = new HD_INFO_7001_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.mode 		    = (String)hash.get("m");
		dm.frlc_no 			= (String)hash.get("frlc_no");
		dm.flnm 			= (String)hash.get("flnm");
		dm.prn 				= (String)hash.get("prn");
		dm.tel_no		    = (String)hash.get("tel_no");
		dm.addr 			= (String)hash.get("addr");
		dm.chrg_posk_cd 	= (String)hash.get("chrg_posk_cd");
		dm.medi_cd			= (String)hash.get("medi_cd");
		dm.thrw_pgm	    	= (String)hash.get("thrw_pgm");
		dm.pay_cycl 		= (String)hash.get("pay_cycl");
		dm.servcost 		= (String)hash.get("servcost");
		dm.serv_pay_cond 	= (String)hash.get("serv_pay_cond");
		dm.fst_cntr_dt 		= (String)hash.get("fst_cntr_dt");
		dm.last_cntr_dt 	= (String)hash.get("last_cntr_dt");
		dm.cntr_expr_dt		= (String)hash.get("cntr_expr_dt");
		dm.draft_no 		= (String)hash.get("draft_no");
		dm.bank_cd 			= (String)hash.get("bank_cd");
		dm.acct_no 			= (String)hash.get("acct_no");
		dm.mang_no 			= (String)hash.get("mang_no");
		dm.medi_cd2			= (String)hash.get("medi_cd2");
		dm.thrw_pgm2    	= (String)hash.get("thrw_pgm2");		
		dm.incmg_pers 		= Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_INFO_7001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	 public void hd_info_7002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
			DBManager manager = new DBManager("MISHDL");

			HD_INFO_7002_LDataSet ds = null;
			HD_INFO_7002_LDM dm = new HD_INFO_7002_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
			dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
			dm.thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
			dm.flnm = Util.checkString(req.getParameter("flnm"));
			dm.basic_dt = Util.checkString(req.getParameter("basic_dt"));
			dm.clsf = Util.checkString(req.getParameter("clsf"));
			
			dm.print();
			
			ds = (HD_INFO_7002_LDataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
	}
	 
    public void hd_info_7010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
			DBManager manager = new DBManager("MISHDL");

			HD_INFO_7010_LDataSet ds = null;
			HD_INFO_7010_LDM dm = new HD_INFO_7010_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			
			ds = (HD_INFO_7010_LDataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
	}
    public void hd_info_7012_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7012_MDataSet ds = null;
		HD_INFO_7012_MDM dm = new HD_INFO_7012_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.medi_cd  = Util.checkString(req.getParameter("medi_cd"));
		
		ds = (HD_INFO_7012_MDataSet)manager.executeCall(dm);
		System.out.println("ddd");
		System.out.println(dm.medi_cd);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
  
//    public void hd_info_7101(HttpServletRequest req, HttpServletResponse res) throws AppException {
//		DBManager manager = new DBManager("MISHDL");
//
//		HD_INFO_7101_MDataSet ds = null;
//		HD_INFO_7101_MDM dm = new HD_INFO_7101_MDM();
//
//		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
//		dm.incmg_pers  = Util.getSessionParameterValue(req, "emp_no", true);
//		
//		ds = (HD_INFO_7101_MDataSet)manager.executeCall(dm);
//		System.out.println("ddd");
//		System.out.println(dm.incmg_pers);
//		
//		if (!"".equals(ds.errcode)) {
//        	System.out.println("DAO..error.");
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//		
//		req.setAttribute("ds", ds);
//	}

}
