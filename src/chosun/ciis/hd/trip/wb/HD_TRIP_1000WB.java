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

package chosun.ciis.hd.trip.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;

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
import chosun.ciis.hd.srch.ds.HD_SRCH_1300_LDataSet;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 *
 */

public class HD_TRIP_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 사원정보 검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_trip_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1000_LDataSet ds = null;
		HD_TRIP_1000_LDM dm = new HD_TRIP_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		ds = (HD_TRIP_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_trip_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1001_LDataSet ds = null;
		HD_TRIP_1001_LDM dm = new HD_TRIP_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();
		
		ds = (HD_TRIP_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_trip_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1002_ADataSet ds = null;
		HD_TRIP_1002_ADM dm = new HD_TRIP_1002_ADM();


		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        // 출장자
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpDate2"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
        // 출장상세내역
		dm.mode_tm = ((String)hash2.get("m")).toUpperCase();		
		dm.busi_trip_dt_tm = (String)hash2.get("busi_trip_dt");
		dm.start_area_tm = (String)hash2.get("start_area");
		dm.via_area_tm = (String)hash2.get("via_area");
		dm.ariv_area_tm = (String)hash2.get("ariv_area");
		dm.stay_area_tm = (String)hash2.get("stay_area");
		dm.trff_means_cd_tm = (String)hash2.get("trff_means_cd");
		dm.trff_means_etc_tm = (String)hash2.get("trff_means_etc");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.busi_trip = Util.checkString(req.getParameter("busi_trip"));
		dm.trff_means = Util.checkString(req.getParameter("trff_means"));
		dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
		dm.remk = Util.checkString(req.getParameter("remk"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        
        dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtl_medi_cd = Util.checkString(req.getParameter("dtl_medi_cd"));
		dm.print();
		
		ds = (HD_TRIP_1002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    /*  2017.11.21 사용 안하는거 같아서 막음 
    public void hd_trip_1002_344_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1002_344_ADataSet ds = null;
		HD_TRIP_1002_344_ADM dm = new HD_TRIP_1002_344_ADM();


		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        // 출장자
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
        dm.tot_dd_fee  = (String)hash.get("tot_dd_fee");
        dm.tot_food_fee   = (String)hash.get("tot_food_fee");
        dm.tot_stay_fee = (String)hash.get("tot_stay_fee");
        dm.tot_trff_fee   = (String)hash.get("tot_trff_fee");
		

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpDate2"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
        // 출장상세내역
		dm.mode_tm = ((String)hash2.get("m")).toUpperCase();	
		dm.emp_no_tm = (String)hash2.get("emp_no");
		dm.flnm_tm = (String)hash2.get("flnm");
		dm.busi_trip_dt_tm = (String)hash2.get("busi_trip_dt");
		dm.start_area_tm = (String)hash2.get("start_area");
		dm.via_area_tm = (String)hash2.get("via_area");
		dm.ariv_area_tm = (String)hash2.get("ariv_area");
		dm.stay_area_tm = (String)hash2.get("stay_area");
		dm.trff_means_cd_tm = (String)hash2.get("trff_means_cd");
		dm.trff_means_etc_tm = (String)hash2.get("trff_means_etc");
		dm.dd_fee_tm = (String)hash2.get("dd_fee");
		dm.food_fee_tm = (String)hash2.get("food_fee");
		dm.stay_fee_tm = (String)hash2.get("stay_fee");
		dm.trff_fee_tm = (String)hash2.get("trff_fee");
		dm.stay_clsf_tm = (String)hash2.get("stay_clsf");
		
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.busi_trip = Util.checkString(req.getParameter("busi_trip"));
		dm.trff_means = Util.checkString(req.getParameter("trff_means"));
		dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
		dm.remk = Util.checkString(req.getParameter("remk"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.start_tm  = Util.checkString(req.getParameter("start_tm"));
        dm.ariv_tm   = Util.checkString(req.getParameter("ariv_tm"));
        dm.start_tm = Util.checkString(req.getParameter("start_tm"));
        dm.ariv_tm   = Util.checkString(req.getParameter("ariv_tm"));
        
        dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtl_medi_cd = Util.checkString(req.getParameter("dtl_medi_cd"));
		dm.print();
		
		ds = (HD_TRIP_1002_344_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
   */
    public void hd_trip_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1003_LDataSet ds = null;
		HD_TRIP_1003_LDM dm = new HD_TRIP_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_TRIP_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_trip_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1004_LDataSet ds = null;
		HD_TRIP_1004_LDM dm = new HD_TRIP_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));

		dm.print();
		
		ds = (HD_TRIP_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error. 1004");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    /*  2017.11.21 사용 안하는거 같아서 막음 
    public void hd_trip_1004_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1004_344_LDataSet ds = null;
		HD_TRIP_1004_344_LDM dm = new HD_TRIP_1004_344_LDM();
		
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
        // 출장상세내역
			
		dm.emp_no = (String)hash2.get("emp_no");
		dm.flnm = (String)hash2.get("flnm");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		
		dm.print();
		
		ds = (HD_TRIP_1004_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error. 1004");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
   */ 
    public void hd_trip_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1005_LDataSet ds = null;
		HD_TRIP_1005_LDM dm = new HD_TRIP_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.busi_trip_dt = Util.checkString(req.getParameter("busi_trip_dt"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_TRIP_1005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error. 1005");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_trip_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1006_LDataSet ds = null;
		HD_TRIP_1006_LDM dm = new HD_TRIP_1006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bis_cd = Util.checkString(req.getParameter("medi_cd"));
		
		dm.print();
		
		ds = (HD_TRIP_1006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error. 1006");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_trip_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_TRIP_1010_LDataSet ds = null;
		HD_TRIP_1010_LDM dm = new HD_TRIP_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));

		dm.print();

		ds = (HD_TRIP_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error. 1005");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_trip_1011(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1011_ADataSet ds = null;
		HD_TRIP_1011_ADM dm = new HD_TRIP_1011_ADM();

		System.out.println("dddd");

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));		
        // 출장자
		dm.mode = ((String)hash.get("m")).toUpperCase(); 
		//dm.mode = (String)hash.get("send");
		//dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));		
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		
		dm.print();

		
		ds = (HD_TRIP_1011_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	

    public void hd_trip_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1100_LDataSet ds = null;
		HD_TRIP_1100_LDM dm = new HD_TRIP_1100_LDM();


		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_TRIP_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /*  2017.11.21 사용 안하는거 같아서 막음 
    public void hd_trip_1100_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1100_344_LDataSet ds = null;
		HD_TRIP_1100_344_LDM dm = new HD_TRIP_1100_344_LDM();


		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_TRIP_1100_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
  */
    public void hd_trip_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1101_LDataSet ds = null;
		HD_TRIP_1101_LDM dm = new HD_TRIP_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		
		dm.print();
		
		ds = (HD_TRIP_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    /*  2017.11.21 사용 안하는거 같아서 막음 
    public void hd_trip_1101_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1101_344_LDataSet ds = null;
		HD_TRIP_1101_344_LDM dm = new HD_TRIP_1101_344_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		
		dm.print();
		
		ds = (HD_TRIP_1101_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
*/
    public void hd_trip_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1102_LDataSet ds = null;
		HD_TRIP_1102_LDM dm = new HD_TRIP_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		ds = (HD_TRIP_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_trip_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1103_ADataSet ds = null;
		HD_TRIP_1103_ADM dm = new HD_TRIP_1103_ADM();

//		 DM Setting
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		//     출장자
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.busi_trip_fee_stot = (String)hash.get("busi_trip_fee_stot");
		dm.dd_fee = (String)hash.get("dd_fee");
		dm.dd_stay_fee = (String)hash.get("dd_stay_fee");
		dm.trff_fee = (String)hash.get("trff_fee");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpDate2"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		// 출장상세내역
		dm.mode_tm = ((String)hash2.get("m")).toUpperCase();
		dm.emp_no_tm = (String)hash2.get("emp_no");
		dm.busi_trip_dt_tm = (String)hash2.get("busi_trip_dt");
		dm.start_area_tm = (String)hash2.get("start_area");
		dm.via_area_tm = (String)hash2.get("via_area");
		dm.ariv_area_tm = (String)hash2.get("ariv_area");
		dm.stay_area_tm = (String)hash2.get("stay_area");
		dm.path_clsf_tm = (String)hash2.get("path_clsf");
		dm.dd_fee_tm = (String)hash2.get("dd_fee");
		dm.stay_clsf_tm = (String)hash2.get("stay_clsf");
		dm.stay_fee_tm = (String)hash2.get("stay_fee");
		dm.occr_dt_tm = (String)hash2.get("occr_dt");
		dm.seq_tm = (String)hash2.get("seq");
		dm.sub_seq_tm = (String)hash2.get("sub_seq");
		dm.cmpy_cd_tm = (String)hash2.get("cmpy_cd");
		dm.trff_means_cd_tm = (String)hash2.get("trff_means_cd");
		dm.trff_means_etc_tm = (String)hash2.get("trff_means_etc");

		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_TRIP_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    /*  2017.11.21 사용 안하는거 같아서 막음 
    public void hd_trip_1103_344_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1103_344_ADataSet ds = null;
		HD_TRIP_1103_344_ADM dm = new HD_TRIP_1103_344_ADM();

//		 DM Setting
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		//     출장자
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.busi_trip_fee_stot = (String)hash.get("busi_trip_fee_stot");
		dm.dd_fee = (String)hash.get("dd_fee");
		dm.food_fee = (String)hash.get("food_fee");
		dm.dd_stay_fee = (String)hash.get("dd_stay_fee");
		dm.trff_fee = (String)hash.get("trff_fee");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpDate2"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		// 출장상세내역
		dm.mode_tm = ((String)hash2.get("m")).toUpperCase();
		dm.emp_no_tm = (String)hash2.get("emp_no");
		dm.busi_trip_dt_tm = (String)hash2.get("busi_trip_dt");
		dm.start_area_tm = (String)hash2.get("start_area");
		dm.via_area_tm = (String)hash2.get("via_area");
		dm.ariv_area_tm = (String)hash2.get("ariv_area");
		dm.stay_area_tm = (String)hash2.get("stay_area");
		dm.path_clsf_tm = (String)hash2.get("path_clsf");
		dm.dd_fee_tm = (String)hash2.get("dd_fee");
		dm.food_fee_tm = (String)hash2.get("eat_fee");
		dm.stay_clsf_tm = (String)hash2.get("stay_clsf");
		dm.stay_fee_tm = (String)hash2.get("stay_fee");
		dm.occr_dt_tm = (String)hash2.get("occr_dt");
		dm.seq_tm = (String)hash2.get("seq");
		dm.sub_seq_tm = (String)hash2.get("sub_seq");
		dm.cmpy_cd_tm = (String)hash2.get("cmpy_cd");
		dm.trff_fee_tm = (String)hash2.get("trff_fee");
		dm.trff_means_cd_tm = (String)hash2.get("trff_means_cd");
		dm.trff_means_etc_tm = (String)hash2.get("trff_means_etc");

		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_TRIP_1103_344_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
  */
    public void hd_trip_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1104_LDataSet ds = null;
		HD_TRIP_1104_LDM dm = new HD_TRIP_1104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.area_clsf = Util.checkString(req.getParameter("grid_area"));
		dm.cost_clsf = Util.checkString(req.getParameter("grid_cost"));
		dm.emp_no = Util.checkString(req.getParameter("grid_empno"));
		dm.occr_dt = Util.checkString(req.getParameter("grid_occrdt"));
		dm.print();
		
		ds = (HD_TRIP_1104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1105_ADataSet ds = null;
		HD_TRIP_1105_ADM dm = new HD_TRIP_1105_ADM();

		String tm1 = Util.checkString(req.getParameter("multiUpDate"));
		String tm2 = Util.checkString(req.getParameter("multiUpData"));
		String multiUpdateData = "";
		if(!"".equals(tm1)){
			multiUpdateData = tm1;
		}else if(!"".equals(tm2)){
			multiUpdateData = tm2;
		}
		
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());

		dm.setIncmg_pers(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		String cost_fix_yn   		  = Util.checkString(req.getParameter("cost_fix_yn"));
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.setCost_fix_yn(cost_fix_yn);

		dm.print();
		
		ds = (HD_TRIP_1105_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_trip_1106_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1106_LDataSet ds = null;
		HD_TRIP_1106_LDM dm = new HD_TRIP_1106_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.print();
		
		ds = (HD_TRIP_1106_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_trip_1107_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1107_ADataSet ds = null;
		HD_TRIP_1107_ADM dm = new HD_TRIP_1107_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
        
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.busi_trip_clsf = (String)hash.get("busi_trip_clsf");
		dm.medi_cd = (String)hash.get("medi_cd2"); //2012.02.20
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd2"); //2012.02.20
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = (String)hash1.get("tmp_dr_amt");
		
		dm.emp_no = (String)hash1.get("emp_no");
		dm.occr_dt = (String)hash1.get("incmg_pers"); 
		dm.seq = (String)hash1.get("incmg_pers_ipadd");
	
		dm.flnm = (String)hash1.get("flnm");
		dm.dept_cd = (String)hash1.get("dept_cd");
		
		String tmp_crdt_amt         = Util.checkString(req.getParameter("tmp_crdt_amt"));
		String titl                 = Util.checkString(req.getParameter("titl"));    
		String tit2                 = Util.checkString(req.getParameter("tit2"));
  	    dm.setTmp_crdt_amt(tmp_crdt_amt);
  	    dm.setTitl(titl);
  	    dm.setTitl2(tit2);

		dm.print();
		
		ds = (HD_TRIP_1107_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_trip_1108_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1108_DDataSet ds = null;
		HD_TRIP_1108_DDM dm = new HD_TRIP_1108_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		
		String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		String slip_seq = Util.checkString(req.getParameter("slip_seq"));
		String slip_incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		
		dm.setSlip_seq(slip_seq);
		dm.setSlip_occr_dt(slip_occr_dt);
		dm.setSlip_clsf_cd(slip_clsf_cd);
		dm.setSlip_incmg_pers(slip_incmg_pers);
		dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

		dm.print();
		
		ds = (HD_TRIP_1108_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_1109_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1109_ADataSet ds = null;
		HD_TRIP_1109_ADM dm = new HD_TRIP_1109_ADM();

		String tm1 = Util.checkString(req.getParameter("multiUpDate"));
		String tm2 = Util.checkString(req.getParameter("multiUpData"));
		String multiUpdateData = "";
		if(!"".equals(tm1)){
			multiUpdateData = tm1;
		}else if(!"".equals(tm2)){
			multiUpdateData = tm2;
		}
		
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setIncmg_pers(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());

		String mode_gubun   		  = Util.checkString(req.getParameter("mode_gubun"));
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.setMode_gubun(mode_gubun);

		dm.print();
		
		ds = (HD_TRIP_1109_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1200_LDataSet ds = null;
		HD_TRIP_1200_LDM dm = new HD_TRIP_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.print();
		
		ds = (HD_TRIP_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	 /*  2017.11.21 사용 안하는거 같아서 막음 
	public void hd_trip_1200_344_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1200_344_LDataSet ds = null;
		HD_TRIP_1200_344_LDM dm = new HD_TRIP_1200_344_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.print();
		
		ds = (HD_TRIP_1200_344_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
   */

	public void hd_trip_1201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1201_ADataSet ds = null;
		HD_TRIP_1201_ADM dm = new HD_TRIP_1201_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		String mode 				  =	converted[0];
		String slip_proc_mang_dt      = converted[19];
		String slip_proc_mang_seq     = converted[20];

		dm.setMode(mode.toUpperCase());
		dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
		dm.setSlip_proc_mang_seq(slip_proc_mang_seq);

		dm.print();
		
		ds = (HD_TRIP_1201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_1203_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1203_MDataSet ds = null;
		HD_TRIP_1203_MDM dm = new HD_TRIP_1203_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1203_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_trip_9996_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9996_LDataSet ds = null;
		HD_TRIP_9996_LDM dm = new HD_TRIP_9996_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.area_clsf = Util.checkString(req.getParameter("area_clsf"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.posi_clsf = Util.checkString(req.getParameter("posi_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.aply_frdt = Util.checkString(req.getParameter("aply_frdt"));
		dm.aply_todt = Util.checkString(req.getParameter("aply_todt"));

		dm.print();
		
		ds = (HD_TRIP_9996_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    public void hd_trip_9997_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9997_ADataSet ds = null;
		HD_TRIP_9997_ADM dm = new HD_TRIP_9997_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.area_clsf = (String)hash.get("area_clsf");
		dm.cost_clsf = (String)hash.get("cost_clsf");
		dm.posi_clsf = (String)hash.get("posi_clsf");
		dm.busi_trip_cost = (String)hash.get("busi_trip_cost");
		dm.aply_basi_dt = (String)hash.get("aply_basi_dt");
		dm.new_aply_basi_dt = (String)hash.get("new_aply_basi_dt");
		dm.remk = (String)hash.get("remk");
		dm.seq = (String)hash.get("seq");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd_tm = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		ds = (HD_TRIP_9997_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_trip_9998_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9998_LDataSet ds = null;
		HD_TRIP_9998_LDM dm = new HD_TRIP_9998_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_TRIP_9998_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_trip_9999_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9999_LDataSet ds = null;
		HD_TRIP_9999_LDM dm = new HD_TRIP_9999_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		
		ds = (HD_TRIP_9999_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_trip_1700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1700_LDataSet ds = null;
		HD_TRIP_1700_LDM dm = new HD_TRIP_1700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_TRIP_1700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1701_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1701_LDataSet ds = null;
		HD_TRIP_1701_LDM dm = new HD_TRIP_1701_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_TRIP_1701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1702_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1702_ADataSet ds = null;
		HD_TRIP_1702_ADM dm = new HD_TRIP_1702_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
        dm.u_ipadd =  req.getRemoteAddr();

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.flnm = (String)hash.get("flnm");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.dty_cd = (String)hash.get("dty_cd");
        dm.posi_cd = (String)hash.get("posi_cd");
        dm.busi_trip_frdt = (String)hash.get("busi_trip_frdt");
        dm.busi_trip_todt = (String)hash.get("busi_trip_todt");
        dm.busi_trip_purp = (String)hash.get("busi_trip_purp");
        dm.dd_fee = (String)hash.get("dd_fee");
        dm.busi_trip_dds = (String)hash.get("busi_trip_dds");
        dm.busi_trip_fee_stot = (String)hash.get("busi_trip_fee_stot");
        dm.stay_area = (String)hash.get("stay_area");
        dm.stay_clsf = (String)hash.get("stay_clsf");

        dm.print();
		
		ds = (HD_TRIP_1702_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_trip_1703_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1703_LDataSet ds = null;
		HD_TRIP_1703_LDM dm = new HD_TRIP_1703_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
        dm.stay_clsf = Util.checkString(req.getParameter("stay_clsf"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.ss_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);

		dm.print();
		
		ds = (HD_TRIP_1703_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1704_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1704_ADataSet ds = null;
		HD_TRIP_1704_ADM dm = new HD_TRIP_1704_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.flnm = (String)hash.get("flnm");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.dty_cd = (String)hash.get("dty_cd");
        dm.posi_cd = (String)hash.get("posi_cd");
        dm.busi_trip_frdt = (String)hash.get("busi_trip_frdt");
        dm.busi_trip_todt = (String)hash.get("busi_trip_todt");
        dm.busi_trip_purp = (String)hash.get("busi_trip_purp");
        dm.dd_fee = (String)hash.get("dd_fee");
        dm.busi_trip_dds = (String)hash.get("busi_trip_dds");
        dm.busi_trip_fee_stot = (String)hash.get("busi_trip_fee_stot");
        dm.stay_area = (String)hash.get("stay_area");
        dm.stay_clsf = (String)hash.get("stay_clsf");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");

        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.u_ipadd =  req.getRemoteAddr();
        dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
        
        dm.print();
		
		ds = (HD_TRIP_1704_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_1705_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1705_MDataSet ds = null;
		HD_TRIP_1705_MDM dm = new HD_TRIP_1705_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1705_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_1800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1800_LDataSet ds = null;
		HD_TRIP_1800_LDM dm = new HD_TRIP_1800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.u_id = Util.getSessionParameterValue(req, "emp_no", true);
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));

		dm.print();
		
		ds = (HD_TRIP_1800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1801_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1801_ADataSet ds = null;
		HD_TRIP_1801_ADM dm = new HD_TRIP_1801_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");

        dm.mode = mode.toUpperCase();
        dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
        dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");

        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.u_ipadd =  req.getRemoteAddr();
        dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_TRIP_1801_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1300_LDataSet ds = null;
		HD_TRIP_1300_LDM dm = new HD_TRIP_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1301_LDataSet ds = null;
		HD_TRIP_1301_LDM dm = new HD_TRIP_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        if(dm.emp_no.equals("")){
            dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		}

		dm.print();
		
		ds = (HD_TRIP_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1302_ADataSet ds = null;
		HD_TRIP_1302_ADM dm = new HD_TRIP_1302_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

        String g_mode= (String)hash.get("m");
        dm.g_mode = g_mode.toUpperCase();
        dm.g_cmpy_cd = cmpy_cd;
        dm.g_emp_no = (String)hash.get("g_emp_no");
        dm.g_occr_dt = (String)hash.get("g_occr_dt");
        dm.g_seq = (String)hash.get("g_seq");
        dm.g_with_seq = (String)hash.get("g_with_seq");
        dm.g_flnm = (String)hash.get("g_flnm");
        dm.g_dept_cd = (String)hash.get("g_dept_cd");
        dm.g_dty_cd = (String)hash.get("g_dty_cd");
        dm.g_posi_cd = (String)hash.get("g_posi_cd");
        dm.print();

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
        Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

        String e_mode =  (String)hash2.get("m");
        dm.e_mode = e_mode.toUpperCase();
        dm.e_cmpy_cd = cmpy_cd;
        dm.e_emp_no = (String)hash2.get("e_emp_no");
        dm.e_occr_dt = (String)hash2.get("e_occr_dt");
        dm.e_seq = (String)hash2.get("e_seq");
        dm.e_sub_seq = (String)hash2.get("e_sub_seq");
        dm.e_with_seq = (String)hash2.get("e_with_seq");
        dm.e_etc_cost_ptcr = (String)hash2.get("e_etc_cost_ptcr");
        dm.e_etc_cost = (String)hash2.get("e_etc_cost");
        dm.e_etc_cost_neces = (String)hash2.get("e_etc_cost_neces");
        dm.print();

		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
        Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

        String d_mode =  (String)hash3.get("m");
        dm.d_mode = d_mode.toUpperCase();

        dm.d_cmpy_cd = cmpy_cd;
        dm.d_emp_no = (String)hash3.get("d_emp_no");
        dm.d_occr_dt = (String)hash3.get("d_occr_dt");
        dm.d_seq = (String)hash3.get("d_seq");
        dm.d_sub_seq = (String)hash3.get("d_sub_seq");
        dm.d_with_seq = (String)hash3.get("d_with_seq");
        dm.d_start_area = (String)hash3.get("d_start_area");
        dm.d_midl_start_dt = (String)hash3.get("d_midl_start_dt");
        dm.d_dest = (String)hash3.get("d_dest");
        dm.d_busi_trip_cont = (String)hash3.get("d_busi_trip_cont");
        dm.print();

		dm.mode = Util.checkString(req.getParameter("mode"));
        dm.cmpy_cd = cmpy_cd;
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.with_seq = Util.checkString(req.getParameter("with_seq"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
		dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
		dm.busi_trip_dest = Util.checkString(req.getParameter("busi_trip_dest"));
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
		dm.busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
		dm.invit_instt = Util.checkString(req.getParameter("invit_instt"));
		dm.busi_trip_fee_burd_clsf = Util.checkString(req.getParameter("busi_trip_fee_burd_clsf"));
		dm.busi_trip_neces = Util.checkString(req.getParameter("busi_trip_neces"));
		dm.aviat_fee = Util.checkString(req.getParameter("aviat_fee"));
		dm.stay_fee = Util.checkString(req.getParameter("stay_fee"));
		dm.dd_fee = Util.checkString(req.getParameter("dd_fee"));
		dm.ceph_use_yn = Util.checkString(req.getParameter("ceph_use_yn"));
		dm.busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.genl_affrs_clsf = Util.checkString(req.getParameter("genl_affrs_clsf"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1303_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1303_LDataSet ds = null;
		HD_TRIP_1303_LDM dm = new HD_TRIP_1303_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
		dm.print();
		
		ds = (HD_TRIP_1303_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1304_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1304_LDataSet ds = null;
		HD_TRIP_1304_LDM dm = new HD_TRIP_1304_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();
		
		ds = (HD_TRIP_1304_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1305_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1305_ADataSet ds = null;
		HD_TRIP_1305_ADM dm = new HD_TRIP_1305_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

        String g_mode= (String)hash.get("m");
        dm.g_mode = g_mode.toUpperCase();
        dm.g_cmpy_cd = cmpy_cd;
        dm.g_emp_no = (String)hash.get("g_emp_no");
        dm.g_occr_dt = (String)hash.get("g_occr_dt");
        dm.g_seq = (String)hash.get("g_seq");
        dm.g_with_seq = (String)hash.get("g_with_seq");
        dm.g_flnm = (String)hash.get("g_flnm");
        dm.g_dept_cd = (String)hash.get("g_dept_cd");
        dm.g_dty_cd = (String)hash.get("g_dty_cd");
        dm.g_posi_cd = (String)hash.get("g_posi_cd");

        String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
        Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

        String e_mode =  (String)hash2.get("m");
        dm.e_mode = e_mode.toUpperCase();
        dm.e_cmpy_cd = cmpy_cd;
        dm.e_emp_no = (String)hash2.get("e_emp_no");
        dm.e_occr_dt = (String)hash2.get("e_occr_dt");
        dm.e_seq = (String)hash2.get("e_seq");
        dm.e_sub_seq = (String)hash2.get("e_sub_seq");
        dm.e_with_seq = (String)hash2.get("e_with_seq");
        dm.e_etc_cost_ptcr = (String)hash2.get("e_etc_cost_ptcr");
        dm.e_etc_cost = (String)hash2.get("e_etc_cost");
        dm.e_etc_cost_neces = (String)hash2.get("e_etc_cost_neces");

        String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
        Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

        String d_mode =  (String)hash3.get("m");
        dm.d_mode = d_mode.toUpperCase();

        dm.d_cmpy_cd = cmpy_cd;
        dm.d_emp_no = (String)hash3.get("d_emp_no");
        dm.d_occr_dt = (String)hash3.get("d_occr_dt");
        dm.d_seq = (String)hash3.get("d_seq");
        dm.d_sub_seq = (String)hash3.get("d_sub_seq");
        dm.d_with_seq = (String)hash3.get("d_with_seq");
        dm.d_start_area = (String)hash3.get("d_start_area");
        dm.d_midl_start_dt = (String)hash3.get("d_midl_start_dt");
        dm.d_dest = (String)hash3.get("d_dest");
        dm.d_busi_trip_cont = (String)hash3.get("d_busi_trip_cont");

        dm.mode = Util.checkString(req.getParameter("mode"));
        dm.cmpy_cd = cmpy_cd;
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
        dm.seq = Util.checkString(req.getParameter("seq"));
        dm.with_seq = Util.checkString(req.getParameter("with_seq"));
        dm.flnm = Util.checkString(req.getParameter("nm_korn"));
        dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
        dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
        dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
        dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
        dm.busi_trip_dest = Util.checkString(req.getParameter("busi_trip_dest"));
        dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
        dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
        dm.busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
        dm.invit_instt = Util.checkString(req.getParameter("invit_instt"));
        dm.busi_trip_fee_burd_clsf = Util.checkString(req.getParameter("busi_trip_fee_burd_clsf"));
        dm.busi_trip_neces = Util.checkString(req.getParameter("busi_trip_neces"));
        dm.aviat_fee = Util.checkString(req.getParameter("aviat_fee"));
        dm.stay_fee = Util.checkString(req.getParameter("stay_fee"));
        dm.dd_fee = Util.checkString(req.getParameter("dd_fee"));
        dm.ceph_use_yn = Util.checkString(req.getParameter("ceph_use_yn"));
        dm.busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
		dm.via_area = Util.checkString(req.getParameter("via_area"));
        dm.remk = Util.checkString(req.getParameter("remk"));
        dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
        dm.genl_affrs_clsf = Util.checkString(req.getParameter("genl_affrs_clsf"));
        dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_TRIP_1305_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_1307_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1307_LDataSet ds = null;
		HD_TRIP_1307_LDM dm = new HD_TRIP_1307_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));

		dm.print();
		
		ds = (HD_TRIP_1307_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1402_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1402_ADataSet ds = null;
		HD_TRIP_1402_ADM dm = new HD_TRIP_1402_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

        String g_mode= (String)hash.get("m");
        dm.g_mode = g_mode.toUpperCase();
        dm.g_cmpy_cd = cmpy_cd;
        dm.g_emp_no = (String)hash.get("g_emp_no");
        dm.g_occr_dt = (String)hash.get("g_occr_dt");
        dm.g_seq = (String)hash.get("g_seq");
        dm.g_with_seq = (String)hash.get("g_with_seq");
        dm.g_flnm = (String)hash.get("g_flnm");
        dm.g_dept_cd = (String)hash.get("g_dept_cd");
        dm.g_dty_cd = (String)hash.get("g_dty_cd");
        dm.g_posi_cd = (String)hash.get("g_posi_cd");
        dm.print();

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
        Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

        String e_mode =  (String)hash2.get("m");
        dm.e_mode = e_mode.toUpperCase();
        dm.e_cmpy_cd = cmpy_cd;
        dm.e_emp_no = (String)hash2.get("e_emp_no");
        dm.e_occr_dt = (String)hash2.get("e_occr_dt");
        dm.e_seq = (String)hash2.get("e_seq");
        dm.e_sub_seq = (String)hash2.get("e_sub_seq");
        dm.e_with_seq = (String)hash2.get("e_with_seq");
        dm.e_etc_cost_ptcr = (String)hash2.get("e_etc_cost_ptcr");
        dm.e_etc_cost = (String)hash2.get("e_etc_cost");
        dm.e_etc_cost_neces = (String)hash2.get("e_etc_cost_neces");
        dm.print();

		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
        Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

        String d_mode =  (String)hash3.get("m");
        dm.d_mode = d_mode.toUpperCase();

        dm.d_cmpy_cd = cmpy_cd;
        dm.d_emp_no = (String)hash3.get("d_emp_no");
        dm.d_occr_dt = (String)hash3.get("d_occr_dt");
        dm.d_seq = (String)hash3.get("d_seq");
        dm.d_sub_seq = (String)hash3.get("d_sub_seq");
        dm.d_with_seq = (String)hash3.get("d_with_seq");
        dm.d_start_area = (String)hash3.get("d_start_area");
        dm.d_midl_start_dt = (String)hash3.get("d_midl_start_dt");
        dm.d_dest = (String)hash3.get("d_dest");
        dm.d_busi_trip_cont = (String)hash3.get("d_busi_trip_cont");
        dm.print();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = cmpy_cd;
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.with_seq = Util.checkString(req.getParameter("with_seq"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
		dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
		dm.busi_trip_dest = Util.checkString(req.getParameter("busi_trip_dest"));
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
		dm.busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
		dm.invit_instt = Util.checkString(req.getParameter("invit_instt"));
		dm.busi_trip_fee_burd_clsf = Util.checkString(req.getParameter("busi_trip_fee_burd_clsf"));
		dm.busi_trip_neces = Util.checkString(req.getParameter("busi_trip_neces"));
		dm.aviat_fee = Util.checkString(req.getParameter("aviat_fee"));
		dm.stay_fee = Util.checkString(req.getParameter("stay_fee"));
		dm.dd_fee = Util.checkString(req.getParameter("dd_fee"));
		dm.ceph_use_yn = Util.checkString(req.getParameter("ceph_use_yn"));
		dm.busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.genl_affrs_clsf = Util.checkString(req.getParameter("genl_affrs_clsf"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1402_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_trip_1403_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1403_LDataSet ds = null;
		HD_TRIP_1403_LDM dm = new HD_TRIP_1403_LDM();

		dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_TRIP_1403_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1405_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1405_ADataSet ds = null;
		HD_TRIP_1405_ADM dm = new HD_TRIP_1405_ADM();


        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

        String g_mode= (String)hash.get("m");
        dm.g_mode = g_mode.toUpperCase();
        dm.g_cmpy_cd = cmpy_cd;
        dm.g_emp_no = (String)hash.get("g_emp_no");
        dm.g_occr_dt = (String)hash.get("g_occr_dt");
        dm.g_seq = (String)hash.get("g_seq");
        dm.g_with_seq = (String)hash.get("g_with_seq");
        dm.g_flnm = (String)hash.get("g_flnm");
        dm.g_dept_cd = (String)hash.get("g_dept_cd");
        dm.g_dty_cd = (String)hash.get("g_dty_cd");
        dm.g_posi_cd = (String)hash.get("g_posi_cd");

        String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
        Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

        String e_mode =  (String)hash2.get("m");
        dm.e_mode = e_mode.toUpperCase();
        dm.e_cmpy_cd = cmpy_cd;
        dm.e_emp_no = (String)hash2.get("e_emp_no");
        dm.e_occr_dt = (String)hash2.get("e_occr_dt");
        dm.e_seq = (String)hash2.get("e_seq");
        dm.e_sub_seq = (String)hash2.get("e_sub_seq");
        dm.e_with_seq = (String)hash2.get("e_with_seq");
        dm.e_etc_cost_ptcr = (String)hash2.get("e_etc_cost_ptcr");
        dm.e_etc_cost = (String)hash2.get("e_etc_cost");
        dm.e_etc_cost_neces = (String)hash2.get("e_etc_cost_neces");

        String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
        Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

        String d_mode =  (String)hash3.get("m");
        dm.d_mode = d_mode.toUpperCase();

        dm.d_cmpy_cd = cmpy_cd;
        dm.d_emp_no = (String)hash3.get("d_emp_no");
        dm.d_occr_dt = (String)hash3.get("d_occr_dt");
        dm.d_seq = (String)hash3.get("d_seq");
        dm.d_sub_seq = (String)hash3.get("d_sub_seq");
        dm.d_with_seq = (String)hash3.get("d_with_seq");
        dm.d_start_area = (String)hash3.get("d_start_area");
        dm.d_midl_start_dt = (String)hash3.get("d_midl_start_dt");
        dm.d_dest = (String)hash3.get("d_dest");
        dm.d_busi_trip_cont = (String)hash3.get("d_busi_trip_cont");

        dm.mode = Util.checkString(req.getParameter("mode"));
        dm.cmpy_cd = cmpy_cd;
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
        dm.seq = Util.checkString(req.getParameter("seq"));
        dm.with_seq = Util.checkString(req.getParameter("with_seq"));
        dm.flnm = Util.checkString(req.getParameter("nm_korn"));
        dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
        dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
        dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
        dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
        dm.busi_trip_dest = Util.checkString(req.getParameter("busi_trip_dest"));
        dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
        dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
        dm.busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
        dm.invit_instt = Util.checkString(req.getParameter("invit_instt"));
        dm.busi_trip_fee_burd_clsf = Util.checkString(req.getParameter("busi_trip_fee_burd_clsf"));
        dm.busi_trip_neces = Util.checkString(req.getParameter("busi_trip_neces"));
        dm.aviat_fee = Util.checkString(req.getParameter("aviat_fee"));
        dm.stay_fee = Util.checkString(req.getParameter("stay_fee"));
        dm.dd_fee = Util.checkString(req.getParameter("dd_fee"));
        dm.ceph_use_yn = Util.checkString(req.getParameter("ceph_use_yn"));
        dm.busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
        dm.remk = Util.checkString(req.getParameter("remk"));
        dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
        dm.genl_affrs_clsf = Util.checkString(req.getParameter("genl_affrs_clsf"));
        dm.u_ipadd =  req.getRemoteAddr();
        dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1405_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1500_LDataSet ds = null;
		HD_TRIP_1500_LDM dm = new HD_TRIP_1500_LDM();

		dm.busi_frdt = Util.checkString(req.getParameter("busi_frdt"));
		dm.busi_todt = Util.checkString(req.getParameter("busi_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();
		
		ds = (HD_TRIP_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1501_LDataSet ds = null;
		HD_TRIP_1501_LDM dm = new HD_TRIP_1501_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.with_seq = Util.checkString(req.getParameter("with_seq"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();
		
		ds = (HD_TRIP_1501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_trip_1502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1502_LDataSet ds = null;
		HD_TRIP_1502_LDM dm = new HD_TRIP_1502_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.with_seq = Util.checkString(req.getParameter("with_seq"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();
		
		ds = (HD_TRIP_1502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_trip_1503_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1503_ADataSet ds = null;
		HD_TRIP_1503_ADM dm = new HD_TRIP_1503_ADM();


		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

        String g_mode = (String)hash.get("m");
        dm.g_mode = g_mode.toUpperCase();
        dm.g_emp_no = (String)hash.get("g_emp_no");
        dm.g_occr_dt = (String)hash.get("g_occr_dt");
        dm.g_seq = (String)hash.get("g_seq");
        dm.g_with_seq = (String)hash.get("g_with_seq");
        dm.g_flnm = (String)hash.get("g_flnm");
        dm.g_dept_cd = (String)hash.get("g_dept_cd");
        dm.g_dty_cd = (String)hash.get("g_dty_cd");
        dm.g_posi_cd = (String)hash.get("g_posi_cd");
		dm.g_cost_fix_clsf = (String)hash.get("g_cost_fix_clsf");
		dm.g_cmpy_cd = cmpy_cd;

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
        Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

        String e_mode = (String)hash2.get("m");
        dm.e_mode = e_mode.toUpperCase();
        dm.e_cmpy_cd = cmpy_cd;
        dm.e_emp_no = (String)hash2.get("e_emp_no");
        dm.e_occr_dt = (String)hash2.get("e_occr_dt");
        dm.e_seq = (String)hash2.get("e_seq");
        dm.e_sub_seq = (String)hash2.get("e_sub_seq");
        dm.e_with_seq = (String)hash2.get("e_with_seq");
        dm.e_etc_cost_ptcr = (String)hash2.get("e_etc_cost_ptcr");
        dm.e_etc_cost = (String)hash2.get("e_etc_cost");
        dm.e_fix_etc_cost = (String)hash2.get("e_fix_etc_cost");
        dm.e_adjm_etc_cost = (String)hash2.get("e_adjm_etc_cost");
        dm.e_etc_cost_neces = (String)hash2.get("e_etc_cost_neces");


		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
        Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

        String d_mode = (String)hash3.get("m");

        dm.d_mode = d_mode.toUpperCase();
        dm.d_cmpy_cd = cmpy_cd;
        dm.d_emp_no = (String)hash3.get("d_emp_no");
        dm.d_occr_dt = (String)hash3.get("d_occr_dt");
        dm.d_seq = (String)hash3.get("d_seq");
        dm.d_sub_seq = (String)hash3.get("d_sub_seq");
        dm.d_with_seq = (String)hash3.get("d_with_seq");
        dm.d_start_area = (String)hash3.get("d_start_area");
        dm.d_midl_start_dt = (String)hash3.get("d_midl_start_dt");
        dm.d_dest = (String)hash3.get("d_dest");
		dm.d_busi_trip_cont = (String)hash3.get("d_busi_trip_cont");

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = cmpy_cd;
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.with_seq = Util.checkString(req.getParameter("with_seq"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
		dm.busi_trip_dest = Util.checkString(req.getParameter("busi_trip_dest"));
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
		dm.busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
		dm.invit_instt = Util.checkString(req.getParameter("invit_instt"));
		dm.busi_trip_fee_burd_clsf = Util.checkString(req.getParameter("busi_trip_fee_burd_clsf"));
		dm.busi_trip_neces = Util.checkString(req.getParameter("busi_trip_neces"));
		dm.aviat_fee = Util.checkString(req.getParameter("aviat_fee"));
		dm.fix_aviat_fee = Util.checkString(req.getParameter("fix_aviat_fee"));
		dm.adjm_aviat_fee = Util.checkString(req.getParameter("adjm_aviat_fee"));
		dm.stay_fee = Util.checkString(req.getParameter("stay_fee"));
		dm.fix_stay_fee = Util.checkString(req.getParameter("fix_stay_fee"));
		dm.adjm_stay_fee = Util.checkString(req.getParameter("adjm_stay_fee"));
		dm.dd_fee = Util.checkString(req.getParameter("dd_fee"));
		dm.fix_dd_fee = Util.checkString(req.getParameter("fix_dd_fee"));
		dm.adjm_dd_fee = Util.checkString(req.getParameter("adjm_dd_fee"));
		dm.ceph_use_yn = Util.checkString(req.getParameter("ceph_use_yn"));
		dm.busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.genl_affrs_clsf = Util.checkString(req.getParameter("genl_affrs_clsf"));

		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1503_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1504_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1504_ADataSet ds = null;
		HD_TRIP_1504_ADM dm = new HD_TRIP_1504_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.with_seq = (String)hash.get("with_seq");
        dm.invit_dds = (String)hash.get("invit_dds");
		dm.busi_trip_dds = (String)hash.get("busi_trip_dds");
		dm.adpay_no = (String)hash.get("adpay_no");
		dm.adpay_amt = (String)hash.get("adpay_amt");
		dm.expn_reso_no = (String)hash.get("expn_reso_no");
		dm.ceph_use_yn = (String)hash.get("ceph_use_yn");
		dm.aviat_fee = (String)hash.get("aviat_fee");
		dm.fix_aviat_fee = (String)hash.get("fix_aviat_fee");
		dm.adjm_aviat_fee = (String)hash.get("adjm_aviat_fee");
		dm.stay_fee = (String)hash.get("stay_fee");
		dm.fix_stay_fee = (String)hash.get("fix_stay_fee");
		dm.adjm_stay_fee = (String)hash.get("adjm_stay_fee");
		dm.dd_fee = (String)hash.get("dd_fee");
		dm.fix_dd_fee = (String)hash.get("fix_dd_fee");
		dm.adjm_dd_fee = (String)hash.get("adjm_dd_fee");
		
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
        Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

        String mode2 = (String)hash2.get("m");
        dm.e_mode = mode2.toUpperCase();
		dm.e_cmpy_cd = (String)hash2.get("e_cmpy_cd");
		dm.e_occr_dt = (String)hash2.get("e_occr_dt");
		dm.e_seq = (String)hash2.get("e_seq");
		dm.e_with_seq = (String)hash2.get("e_with_seq");
        dm.e_etc_cost_ptcr = (String)hash2.get("e_etc_cost_ptcr");
		dm.e_etc_cost = (String)hash2.get("e_etc_cost");
		dm.e_fix_etc_cost = (String)hash2.get("e_fix_etc_cost");
		dm.e_adjm_etc_cost = (String)hash2.get("e_adjm_etc_cost");
		dm.e_etc_cost_neces = (String)hash2.get("e_etc_cost_neces");
		dm.e_sub_seq = (String)hash2.get("e_sub_seq");

		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
        Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

        String mode3 = (String)hash3.get("m");
        dm.d_mode = mode3.toUpperCase();
		dm.d_cmpy_cd = (String)hash3.get("d_cmpy_cd");
		dm.d_occr_dt = (String)hash3.get("d_occr_dt");
		dm.d_seq = (String)hash3.get("d_seq");
		dm.d_with_seq = (String)hash3.get("d_with_seq");
		dm.d_start_area = (String)hash3.get("d_start_area");
		dm.d_dest = (String)hash3.get("d_dest");
		dm.d_busi_trip_cont = (String)hash3.get("d_busi_trip_cont");
		dm.d_sub_seq = (String)hash3.get("d_sub_seq");

		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1504_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_trip_1510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1510_LDataSet ds = null;
		HD_TRIP_1510_LDM dm = new HD_TRIP_1510_LDM();

		dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));

		dm.print();
		
		ds = (HD_TRIP_1510_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_2020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2020_LDataSet ds = null;
		HD_TRIP_2020_LDM dm = new HD_TRIP_2020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_TRIP_2020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_trip_2022_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2022_ADataSet ds = null;
		HD_TRIP_2022_ADM dm = new HD_TRIP_2022_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;

		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		String new_aply_basi_dt = Util.checkString(req.getParameter("n_aply_basi_dt"));
		if("".equals(new_aply_basi_dt) || new_aply_basi_dt == null) {
			new_aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));
		}


		System.out.println("new_aply_basi_dt="+new_aply_basi_dt);

		String mode		= converted[0];

		String pay_basi_clsf	= converted[2];
		String dspch_clsf		= converted[3];
		String base_alon		= converted[4];
		String cmpy_cd			= converted[5];
		String aply_basi_dt		= converted[6];
		String seq				= converted[7];

		dm.setMode(mode.toUpperCase());
		dm.setPay_basi_clsf(pay_basi_clsf);
		dm.setDspch_clsf(dspch_clsf);
		dm.setBase_alon(base_alon);
//		dm.setCmpy_cd(cmpy_cd);
		dm.setAply_basi_dt(aply_basi_dt);
		dm.setSeq(seq);

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.new_aply_basi_dt = Util.checkString(new_aply_basi_dt);

		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_2022_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_trip_2021_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2021_LDataSet ds = null;
		HD_TRIP_2021_LDM dm = new HD_TRIP_2021_LDM();

		dm.aply_basi_dt = Util.checkString(req.getParameter("s_aply_basi_dt"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (HD_TRIP_2021_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1900_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1900_LDataSet ds = null;
		HD_TRIP_1900_LDM dm = new HD_TRIP_1900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1900_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1901_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1901_ADataSet ds = null;
		HD_TRIP_1901_ADM dm = new HD_TRIP_1901_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.flnm = (String)hash.get("flnm");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.dty_cd = (String)hash.get("dty_cd");
        dm.posi_cd = (String)hash.get("posi_cd");
        dm.busi_trip_frdt = (String)hash.get("busi_trip_frdt");
        dm.busi_trip_todt = (String)hash.get("busi_trip_todt");
        dm.busi_trip_purp = (String)hash.get("busi_trip_purp");
        dm.dd_fee = (String)hash.get("dd_fee");
        dm.busi_trip_dds = (String)hash.get("busi_trip_dds");
        dm.busi_trip_fee_stot = (String)hash.get("busi_trip_fee_stot");
        dm.stay_area = (String)hash.get("stay_area");
        dm.stay_clsf = (String)hash.get("stay_clsf");
        dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");

        dm.u_ipadd =  req.getRemoteAddr();
        dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
        dm.print();
		
		ds = (HD_TRIP_1901_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1902_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1902_LDataSet ds = null;
		HD_TRIP_1902_LDM dm = new HD_TRIP_1902_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
		dm.proc_stat=  Util.checkString(req.getParameter("proc_stat"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();
		
		ds = (HD_TRIP_1902_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1903_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1903_LDataSet ds = null;
		HD_TRIP_1903_LDM dm = new HD_TRIP_1903_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();
		
		ds = (HD_TRIP_1903_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1904_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1904_ADataSet ds = null;
		HD_TRIP_1904_ADM dm = new HD_TRIP_1904_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.flnm = (String)hash.get("flnm");
        dm.dept_cd = (String)hash.get("dept_cd");
        //dm.tmp_dr_amt = (String)hash.get("tmp_dr_amt");
        dm.tmp_dr_amt = (String)hash.get("busi_trip_fee_stot");
        dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
        dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
        
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");

        dm.tmp_crdt_amt = (String)hash.get("tmp_crdt_amt");
        dm.titl = (String)hash.get("titl");
        dm.titl2 = (String)hash.get("titl2");

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ipadd  = req.getRemoteAddr();
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);

		
		ds = (HD_TRIP_1904_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_trip_1905_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1905_DDataSet ds = null;
		HD_TRIP_1905_DDM dm = new HD_TRIP_1905_DDM();


        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ipadd  = req.getRemoteAddr();

        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setSs_emp_no(ss_emp_no);
        dm.setCmpy_cd(cmpy_cd);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
        dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");

        dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
        dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
        dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

/*
        dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
        dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
        dm.slip_seq = (String)hash.get("slip_seq");
*/
        dm.slip_incmg_pers =ss_emp_no;
        dm.slip_incmg_pers_ipadd = incmg_pers_ipadd;
		
		ds = (HD_TRIP_1905_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1600_LDataSet ds = null;
		HD_TRIP_1600_LDM dm = new HD_TRIP_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
		dm.busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));

		dm.print();
		
		ds = (HD_TRIP_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_trip_1601_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1601_ADataSet ds = null;
		HD_TRIP_1601_ADM dm = new HD_TRIP_1601_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();

        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.with_seq = (String)hash.get("with_seq");
        dm.invit_dds = (String)hash.get("invit_dds");
        dm.draft_dt = (String)hash.get("draft_dt");
        dm.adpay_no = (String)hash.get("adpay_no");
        dm.adpay_amt = (String)hash.get("adpay_amt");
        dm.adpay_plan_dt = (String)hash.get("adpay_plan_dt");
        dm.actu_pay_dt = (String)hash.get("actu_pay_dt");
        dm.expn_reso_no = (String)hash.get("expn_reso_no");
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_TRIP_1601_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2100_LDataSet ds = null;
		HD_TRIP_2100_LDM dm = new HD_TRIP_2100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.biz_trip_frdt = Util.checkString(req.getParameter("biz_trip_frdt"));
		dm.biz_trip_todt = Util.checkString(req.getParameter("biz_trip_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_TRIP_2100_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_trip_2110_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2110_ADataSet ds = null;
		HD_TRIP_2110_ADM dm = new HD_TRIP_2110_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.biz_trip_dest = (String)hash.get("biz_trip_dest");
		dm.biz_trip_frdt = (String)hash.get("biz_trip_frdt");
		dm.biz_trip_todt = (String)hash.get("biz_trip_todt");
		dm.biz_trip_dds = (String)hash.get("biz_trip_dds");
		dm.biz_trip_purp = (String)hash.get("biz_trip_purp");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_TRIP_2110_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);

	}
	
	
}
