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

package chosun.ciis.hd.vaca.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
import chosun.ciis.hd.duty.dm.HD_DUTY_1404_MDM;
import chosun.ciis.hd.duty.ds.HD_DUTY_1000_ADataSet;
import chosun.ciis.hd.duty.ds.HD_DUTY_1404_MDataSet;
import chosun.ciis.hd.trip.ds.HD_TRIP_1601_ADataSet;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */
 
public class HD_VACA_1000WB extends BaseWB {
 
    /**
     * 멀티레코드처리 row 구분자
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    //public final String COL_SEPARATOR = "#";
  
    /**
     * 발령관련된 코드
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void hd_vaca_1804_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1804_LDataSet ds = null;
		HD_VACA_1804_LDM dm = new HD_VACA_1804_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.decid_fr_tm = Util.checkString(req.getParameter("decid_fr_tm"));
		dm.decid_to_tm = Util.checkString(req.getParameter("decid_to_tm"));

		dm.print();

		ds = (HD_VACA_1804_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1805_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1805_MDataSet ds = null;
		HD_VACA_1805_MDM dm = new HD_VACA_1805_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1805_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1803_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1803_LDataSet ds = null;
		HD_VACA_1803_LDM dm = new HD_VACA_1803_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_VACA_1803_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1802_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1802_LDataSet ds = null;
		HD_VACA_1802_LDM dm = new HD_VACA_1802_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_VACA_1802_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1615_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1615_DDataSet ds = null;
		HD_VACA_1615_DDM dm = new HD_VACA_1615_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();

		ds = (HD_VACA_1615_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1614_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1614_ADataSet ds = null;
		HD_VACA_1614_ADM dm = new HD_VACA_1614_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));
		dm.vaca_dtls_clsf = Util.checkString(req.getParameter("vaca_dtls_clsf"));
		dm.vaca_frdt = Util.checkString(req.getParameter("vaca_frdt"));
		dm.vaca_todt = Util.checkString(req.getParameter("vaca_todt"));
		dm.vaca_dds = Util.checkString(req.getParameter("vaca_dds"));
		dm.alvc_use_dt = Util.checkString(req.getParameter("alvc_use_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();	
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_VACA_1614_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1613_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1613_LDataSet ds = null;
		HD_VACA_1613_LDM dm = new HD_VACA_1613_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.search_frdt = Util.checkString(req.getParameter("search_frdt"));
		dm.search_todt = Util.checkString(req.getParameter("search_todt"));

		dm.print();

		ds = (HD_VACA_1613_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1612_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1612_LDataSet ds = null;
		HD_VACA_1612_LDM dm = new HD_VACA_1612_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));
		dm.vaca_dtls_clsf = Util.checkString(req.getParameter("vaca_dtls_clsf"));
		dm.mang_cd_4 = Util.checkString(req.getParameter("mang_cd_4"));
		dm.vaca_frdt = Util.checkString(req.getParameter("vaca_frdt"));
		dm.vaca_todt = Util.checkString(req.getParameter("vaca_todt"));

		dm.print();

		ds = (HD_VACA_1612_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1611_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1611_LDataSet ds = null;
		HD_VACA_1611_LDM dm = new HD_VACA_1611_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));
		dm.search_frdt = Util.checkString(req.getParameter("search_frdt"));
		dm.search_todt = Util.checkString(req.getParameter("search_todt"));

		dm.print();

		ds = (HD_VACA_1611_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1611_500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1611_500_LDataSet ds = null;
		HD_VACA_1611_500_LDM dm = new HD_VACA_1611_500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));
		dm.search_frdt = Util.checkString(req.getParameter("search_frdt"));
		dm.search_todt = Util.checkString(req.getParameter("search_todt"));

		dm.print();

		ds = (HD_VACA_1611_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_vaca_1000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1000_ADataSet ds = null;
		HD_VACA_1000_ADM dm = new HD_VACA_1000_ADM();
		
		ds = (HD_VACA_1000_ADataSet)manager.executeCall(dm);
		
		/*if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }*/
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1001_ADataSet ds = null;
		HD_VACA_1001_ADM dm = new HD_VACA_1001_ADM();


		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.day1 = Util.checkString(req.getParameter("occr_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		
		dm.print();
		
		ds = (HD_VACA_1001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_vaca_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1200_LDataSet ds = null;
		HD_VACA_1200_LDM dm = new HD_VACA_1200_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no	= Util.getSessionParameterValue(req,"emp_no",true);
		dm.aply_yy	= Util.checkString(req.getParameter("aply_yy"));
		dm.qq_clsf	= Util.checkString(req.getParameter("qq_clsf"));

		dm.print();
		
		ds = (HD_VACA_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_vaca_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1201_LDataSet ds = null;
		HD_VACA_1201_LDM dm = new HD_VACA_1201_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no	= Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1202_LDataSet ds = null;
		HD_VACA_1202_LDM dm = new HD_VACA_1202_LDM();

		dm.cmpy_cd	= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no	= Util.getSessionParameterValue(req,"emp_no",true);
		dm.aply_yy	= Util.checkString(req.getParameter("aply_yy"));

		dm.print();
		
		ds = (HD_VACA_1202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1203_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1203_ADataSet ds = null;
		HD_VACA_1203_ADM dm = new HD_VACA_1203_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode					= ((String)hash.get("m")).toUpperCase();
		dm.emp_no				= (String)hash.get("emp_no");
		dm.seq					= (String)hash.get("seq");
		dm.aply_yy				= (String)hash.get("aply_yy");
		dm.occr_dt				= (String)hash.get("occr_dt");
		dm.qq_clsf				= (String)hash.get("qq_clsf");
		dm.appm_vaca_plan_dt	= (String)hash.get("appm_vaca_plan_dt");
		dm.wkdy					= (String)hash.get("wkdy");
		dm.dept_cd				= (String)hash.get("dept_cd");
		dm.proc_stat			= (String)hash.get("proc_stat");
		
		dm.cmpy_cd				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd  	= req.getRemoteAddr();	

		dm.print();
		
		ds = (HD_VACA_1203_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1204_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1204_UDataSet ds = null;
		HD_VACA_1204_UDM dm = new HD_VACA_1204_UDM();

		dm.emp_no_tm 			= Util.checkString(req.getParameter("emp_no_temp"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode					= ((String)hash.get("m")).toUpperCase();
		dm.emp_no				= (String)hash.get("emp_no");
		dm.seq					= (String)hash.get("seq");
		dm.occr_dt				= (String)hash.get("occr_dt");
		dm.cmpy_cd				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd  	= req.getRemoteAddr();	

		dm.print();
		
		ds = (HD_VACA_1204_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_vaca_1205_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1205_MDataSet ds = null;
		HD_VACA_1205_MDM dm = new HD_VACA_1205_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1205_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1300_LDataSet ds = null;
		HD_VACA_1300_LDM dm = new HD_VACA_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));
		dm.qq_clsf = Util.checkString(req.getParameter("qq_clsf"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.ss_emp_no = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1301_LDataSet ds = null;
		HD_VACA_1301_LDM dm = new HD_VACA_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		ds = (HD_VACA_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1302_LDataSet ds = null;
		HD_VACA_1302_LDM dm = new HD_VACA_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));

		dm.print();
		
		ds = (HD_VACA_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}		
	

	public void hd_vaca_1303_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1303_ADataSet ds = null;
		HD_VACA_1303_ADM dm = new HD_VACA_1303_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode					= ((String)hash.get("m")).toUpperCase();
		dm.emp_no				= (String)hash.get("emp_no");
		dm.occr_dt				= (String)hash.get("occr_dt");
		dm.seq					= (String)hash.get("seq");
		dm.aply_yy				= (String)hash.get("aply_yy");
		dm.qq_clsf				= (String)hash.get("qq_clsf");
		dm.appm_vaca_plan_dt	= (String)hash.get("appm_vaca_plan_dt");
		dm.wkdy					= (String)hash.get("wkdy");
		dm.dept_cd				= (String)hash.get("dept_cd");
		dm.proc_stat			= (String)hash.get("proc_stat");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1303_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_vaca_1304_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1304_UDataSet ds = null;
		HD_VACA_1304_UDM dm = new HD_VACA_1304_UDM();
		
		dm.emp_no_tm 			= Util.checkString(req.getParameter("emp_no_temp"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode				= ((String)hash.get("m")).toUpperCase();
		dm.emp_no			= (String)hash.get("emp_no");
		dm.seq				= (String)hash.get("seq");
		dm.occr_dt			= (String)hash.get("occr_dt");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1304_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1305_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1305_LDataSet ds = null;
		HD_VACA_1305_LDM dm = new HD_VACA_1305_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));

		dm.print();
		
		ds = (HD_VACA_1305_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1306_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1306_MDataSet ds = null;
		HD_VACA_1306_MDM dm = new HD_VACA_1306_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1306_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1400_LDataSet ds = null;
		HD_VACA_1400_LDM dm = new HD_VACA_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));
		dm.qq_clsf = Util.checkString(req.getParameter("qq_clsf"));
		dm.ss_emp_no = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_vaca_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1401_LDataSet ds = null;
		HD_VACA_1401_LDM dm = new HD_VACA_1401_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (HD_VACA_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_vaca_1402_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1402_UDataSet ds = null;
		HD_VACA_1402_UDM dm = new HD_VACA_1402_UDM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		String mode 				  =	converted[0];
		
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());
		String emp_no	= converted[5];
		String proc_stat = converted[27];
		String aply_yy = converted[33];
		String qq_clsf = converted[34];
		String emp_no_tm = converted[35];
		String ep_seq = converted[36];
		
		dm.setEmp_no(emp_no);
		dm.setProc_stat(proc_stat);
		dm.setAply_yy(aply_yy);
		dm.setQq_clsf(qq_clsf);
		dm.setEmp_no_tm(emp_no_tm);
		dm.setEp_seq(ep_seq);
		
		dm.print(); 
		
		ds = (HD_VACA_1402_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1403_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1403_MDataSet ds = null;
		HD_VACA_1403_MDM dm = new HD_VACA_1403_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1403_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1500_LDataSet ds = null;
		HD_VACA_1500_LDM dm = new HD_VACA_1500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_appm_vaca_plan_dt = Util.checkString(req.getParameter("fr_appm_vaca_plan_dt"));
		dm.to_appm_vaca_plan_dt = Util.checkString(req.getParameter("to_appm_vaca_plan_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.emp_nm = Util.checkString(req.getParameter("nm_korn"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));
		dm.qq_clsf = Util.checkString(req.getParameter("qq_clsf"));

		dm.print();
		
		ds = (HD_VACA_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1501_LDataSet ds = null;
		HD_VACA_1501_LDM dm = new HD_VACA_1501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		ds = (HD_VACA_1501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1502_LDataSet ds = null;
		HD_VACA_1502_LDM dm = new HD_VACA_1502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.aply_yy = Util.checkString(req.getParameter("aply_yy"));

		dm.print();
		
		ds = (HD_VACA_1502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_vaca_1503_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_VACA_1503_ADataSet ds = null;
		HD_VACA_1503_ADM dm = new HD_VACA_1503_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.aply_yy = (String)hash.get("aply_yy");
		dm.qq_clsf = (String)hash.get("qq_clsf");
		dm.appm_vaca_plan_dt = (String)hash.get("appm_vaca_plan_dt");
		dm.wkdy = (String)hash.get("wkdy");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.mode = (String)hash.get("m");
		
		dm.print();
		
		ds = (HD_VACA_1503_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
 
	public void hd_vaca_1504_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1504_ADataSet ds = null;
		HD_VACA_1504_ADM dm = new HD_VACA_1504_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.aply_yy = (String)hash.get("aply_yy");
		dm.qq_clsf = (String)hash.get("qq_clsf");
		dm.appm_vaca_plan_dt = (String)hash.get("appm_vaca_plan_dt");
		dm.wkdy = (String)hash.get("wkdy");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();
		
		ds = (HD_VACA_1504_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1505_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1505_LDataSet ds = null;
		HD_VACA_1505_LDM dm = new HD_VACA_1505_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		//dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		ds = (HD_VACA_1505_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1506_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1506_MDataSet ds = null;
		HD_VACA_1506_MDM dm = new HD_VACA_1506_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1506_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

			
	public void hd_vaca_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1600_LDataSet ds = null;
		HD_VACA_1600_LDM dm = new HD_VACA_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();
		
		ds = (HD_VACA_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1601_LDataSet ds = null;
		HD_VACA_1601_LDM dm = new HD_VACA_1601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_VACA_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_vaca_1602_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1602_ADataSet ds = null;
		HD_VACA_1602_ADM dm = new HD_VACA_1602_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.vaca_clsf = (String)hash.get("vaca_clsf");
        dm.vaca_dtls_clsf = (String)hash.get("vaca_dtls_clsf");
        dm.vaca_frdt = (String)hash.get("vaca_frdt");
        dm.vaca_todt = (String)hash.get("vaca_todt");
        dm.vaca_dds = (String)hash.get("vaca_dds");
        dm.alvc_use_dt = (String)hash.get("duty_dt");
        dm.remk = (String)hash.get("remk");
		
        dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_1602_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1604_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1604_ADataSet ds = null;
		HD_VACA_1604_ADM dm = new HD_VACA_1604_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.vaca_clsf = (String)hash.get("vaca_clsf");
        dm.vaca_dtls_clsf = (String)hash.get("vaca_dtls_clsf");
        dm.vaca_frdt = (String)hash.get("vaca_frdt");
        dm.vaca_todt = (String)hash.get("vaca_todt");
        dm.vaca_dds = (String)hash.get("vaca_dds");
        dm.alvc_use_dt = (String)hash.get("duty_dt");
        dm.remk = (String)hash.get("remk");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_1604_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1605_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1605_LDataSet ds = null;
		HD_VACA_1605_LDM dm = new HD_VACA_1605_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.vaca_dt = Util.checkString(req.getParameter("vaca_dt"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));

		dm.print();
		
		ds = (HD_VACA_1605_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1609_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1609_MDataSet ds = null;
		HD_VACA_1609_MDM dm = new HD_VACA_1609_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1609_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1610_LDataSet ds = null;
		HD_VACA_1610_LDM dm = new HD_VACA_1610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_VACA_1610_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1700_LDataSet ds = null;
		HD_VACA_1700_LDM dm = new HD_VACA_1700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_VACA_1700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1701_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1701_LDataSet ds = null;
		HD_VACA_1701_LDM dm = new HD_VACA_1701_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
		dm.ss_emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();
		
		ds = (HD_VACA_1701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_vaca_1702_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1702_ADataSet ds = null;
		HD_VACA_1702_ADM dm = new HD_VACA_1702_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.chk = (String)hash.get("chk");
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.vaca_clsf = (String)hash.get("vaca_clsf");
        dm.vaca_dtls_clsf = (String)hash.get("vaca_dtls_clsf");
        dm.vaca_frdt = (String)hash.get("vaca_frdt");
        dm.vaca_todt = (String)hash.get("vaca_todt");
        dm.vaca_dds = (String)hash.get("vaca_dds");
        dm.alvc_use_dt = (String)hash.get("duty_dt");
        dm.remk = (String)hash.get("remk");
		
        dm.emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_1702_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1703_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1703_ADataSet ds = null;
		HD_VACA_1703_ADM dm = new HD_VACA_1703_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.chk = (String)hash.get("chk");
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.vaca_clsf = (String)hash.get("vaca_clsf");
        dm.vaca_dtls_clsf = (String)hash.get("vaca_dtls_clsf");
        dm.vaca_frdt = (String)hash.get("vaca_frdt");
        dm.vaca_todt = (String)hash.get("vaca_todt");
        dm.vaca_dds = (String)hash.get("vaca_dds");
        dm.alvc_use_dt = (String)hash.get("duty_dt");
        dm.remk = (String)hash.get("remk");
		
        dm.emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_1703_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1706_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1706_MDataSet ds = null;
		HD_VACA_1706_MDM dm = new HD_VACA_1706_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_1706_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1800_LDataSet ds = null;
		HD_VACA_1800_LDM dm = new HD_VACA_1800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_1800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1801_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1801_ADataSet ds = null;
		HD_VACA_1801_ADM dm = new HD_VACA_1801_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String mode = (String)hash.get("m");
        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.send = (String)hash.get("send");
		dm.retu = (String)hash.get("retu");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.emp_no_tm = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_1801_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1900_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1900_LDataSet ds = null;
		HD_VACA_1900_LDM dm = new HD_VACA_1900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.emp_nm = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));

		dm.print();
		
		ds = (HD_VACA_1900_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1603_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1603_LDataSet ds = null;
		HD_VACA_1603_LDM dm = new HD_VACA_1603_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));

		dm.print();
		
		ds = (HD_VACA_1603_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1606_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1606_LDataSet ds = null;
		HD_VACA_1606_LDM dm = new HD_VACA_1606_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_VACA_1606_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1607_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1607_LDataSet ds = null;
		HD_VACA_1607_LDM dm = new HD_VACA_1607_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no_tm"));

		dm.print();
		
		ds = (HD_VACA_1607_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1608_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1608_LDataSet ds = null;
		HD_VACA_1608_LDM dm = new HD_VACA_1608_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no_tm"));

		dm.print();
		
		ds = (HD_VACA_1608_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1850_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1850_MDataSet ds = null;
		HD_VACA_1850_MDM dm = new HD_VACA_1850_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_VACA_1850_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1851_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1851_LDataSet ds = null;
		HD_VACA_1851_LDM dm = new HD_VACA_1851_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));

		dm.print();
		
		ds = (HD_VACA_1851_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1852_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1852_UDataSet ds = null;
		HD_VACA_1852_UDM dm = new HD_VACA_1852_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers_ipadd = req.getRemoteAddr();	
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.mode = (String)hash.get("mode");

		dm.print();
		
		ds = (HD_VACA_1852_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1853_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1853_DDataSet ds = null;
		HD_VACA_1853_DDM dm = new HD_VACA_1853_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.mode = (String)hash.get("mode");
		dm.chg_pers = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();
		
		ds = (HD_VACA_1853_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1861_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1861_LDataSet ds = null;
		HD_VACA_1861_LDM dm = new HD_VACA_1861_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.emp_nm = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_VACA_1861_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_9999_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_9999_SDataSet ds = null;
		HD_VACA_9999_SDM dm = new HD_VACA_9999_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));

		dm.print();
		
		ds = (HD_VACA_9999_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1710_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1710_LDataSet ds = null;
		HD_VACA_1710_LDM dm = new HD_VACA_1710_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_VACA_1710_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1711_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1711_LDataSet ds = null;
		HD_VACA_1711_LDM dm = new HD_VACA_1711_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.app_dept_cd = Util.checkString(req.getParameter("app_dept_cd"));

		dm.print();

		ds = (HD_VACA_1711_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1712_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1712_DDataSet ds = null;
		HD_VACA_1712_DDM dm = new HD_VACA_1712_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        dm.mode = ((String)hash.get("m")).toUpperCase();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.del_chk = (String)hash.get("del_chk");
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		
		dm.print();
		
		ds = (HD_VACA_1712_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_1713_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1713_ADataSet ds = null;
		HD_VACA_1713_ADM dm = new HD_VACA_1713_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.del_chk = (String)hash.get("del_chk");
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.vaca_clsf = (String)hash.get("vaca_clsf");
		dm.vaca_dtls_clsf = (String)hash.get("vaca_dtls_clsf");
		dm.vaca_frdt = (String)hash.get("vaca_frdt");
		dm.vaca_todt = (String)hash.get("vaca_todt");
		dm.vaca_dds = (String)hash.get("vaca_dds");
		dm.duty_dt = (String)hash.get("duty_dt");
		dm.remk = (String)hash.get("remk");
		dm.app_emp_no = (String)hash.get("app_emp_no");
		dm.incmg_pers_ipadd = req.getRemoteAddr();	
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_1713_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

//	휴일예고제(현업)_기준표등록(생성)  실서버에 아직 반영 안됨으로 임시 주석 처리 
/*
	public void hd_vaca_3000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3000_ADataSet ds = null;
		HD_VACA_3000_ADM dm = new HD_VACA_3000_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_VACA_3000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
//	휴일예고제(현업)_기준표조회  
	public void hd_vaca_3002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3002_LDataSet ds = null;
		HD_VACA_3002_LDM dm = new HD_VACA_3002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
		
		dm.print();

		ds = (HD_VACA_3002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
//	휴일예고제(현업)_기준표 저장 
	public void hd_vaca_3003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3003_ADataSet ds = null;
		HD_VACA_3003_ADM dm = new HD_VACA_3003_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("multiUpdateData=>"+multiUpdateData);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clndr_dt = Util.checkString(req.getParameter("clndr_dt")); //휴무계획 년월+주
		dm.aply_yymm = (String)hash.get("aply_yymm");
		dm.week = (String)hash.get("week");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	*/
	//휴일예고제(현업)_휴무계획일,진행상태 콤보박스
	public void hd_vaca_3110_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3110_MDataSet ds = null;
		HD_VACA_3110_MDM dm = new HD_VACA_3110_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_VACA_3110_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//휴일예고제(현업)_그리드 동적 타이틀바 설정
	public void hd_vaca_3120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3120_LDataSet ds = null;
		HD_VACA_3120_LDM dm = new HD_VACA_3120_LDM();
	  
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.plan_dt = Util.checkString(req.getParameter("plan_dt"));

		dm.print();

		ds = (HD_VACA_3120_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		

		req.setAttribute("ds", ds);
	}
	
	//휴일예고제(현업)_대상자조회  
	public void hd_vaca_3130_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3130_LDataSet ds = null;
		HD_VACA_3130_LDM dm = new HD_VACA_3130_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));  //진행상태
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd")); //부서코드
		dm.plan_dt = Util.checkString(req.getParameter("plan_dt")); //휴무계획일

		dm.print();

		ds = (HD_VACA_3130_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_3140_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3140_ADataSet ds = null;
		HD_VACA_3140_ADM dm = new HD_VACA_3140_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("multiUpdateData=>"+multiUpdateData);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.plan_dt = Util.checkString(req.getParameter("plan_dt")); //휴무계획 년월+주
		dm.gubun = Util.checkString(req.getParameter("gubun")); //저장,결재구분 및 결재자사번		
		dm.mon_ck = (String)hash.get("mon_ck");
		dm.tue_ck = (String)hash.get("tue_ck");
		dm.wed_ck = (String)hash.get("wed_ck");
		dm.thu_ck = (String)hash.get("thu_ck");
		dm.fri_ck = (String)hash.get("fri_ck");
		dm.sat_ck = (String)hash.get("sat_ck");
		dm.sun_ck = (String)hash.get("sun_ck");
		dm.incmg_pers_ipadd = req.getRemoteAddr();	
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3140_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//휴일예고제(현업)_결과장표 승인여부체크
	public void hd_vaca_3150_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3150_LDataSet ds = null;
		HD_VACA_3150_LDM dm = new HD_VACA_3150_LDM();
	  
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.plan_dt = Util.checkString(req.getParameter("plan_dt"));

		dm.print();

		ds = (HD_VACA_3150_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }		

		req.setAttribute("ds", ds);
	}
	
	//휴일예고제(현업)_대상자조회  
	public void hd_vaca_3210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3210_LDataSet ds = null;
		HD_VACA_3210_LDM dm = new HD_VACA_3210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.decid_fr_tm = Util.checkString(req.getParameter("decid_fr_tm"));
		dm.decid_to_tm = Util.checkString(req.getParameter("decid_to_tm"));
		dm.aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
		dm.srch_dept_cd = Util.checkString(req.getParameter("dept_cd")); //관리자 부서검색한 부서코드
		
		dm.print();

		ds = (HD_VACA_3210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	//휴일예고결재_결재
	public void hd_vaca_3220_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3220_ADataSet ds = null;
		HD_VACA_3220_ADM dm = new HD_VACA_3220_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("multiUpdateData=>"+multiUpdateData);
						
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.send = ((String)hash.get("send")).toUpperCase();
		dm.retu = ((String)hash.get("retu")).toUpperCase();
		dm.aply_yymm = ((String)hash.get("aply_yymm")).toUpperCase();
		dm.mon_ck = (String)hash.get("mon_ck");
		dm.tue_ck = (String)hash.get("tue_ck");
		dm.wed_ck = (String)hash.get("wed_ck");
		dm.thu_ck = (String)hash.get("thu_ck");
		dm.fri_ck = (String)hash.get("fri_ck");
		dm.sat_ck = (String)hash.get("sat_ck");
		dm.sun_ck = (String)hash.get("sun_ck");		
		dm.hody_plan_dt_mon = (String)hash.get("hody_plan_dt_mon");
		dm.hody_plan_dt_tue = (String)hash.get("hody_plan_dt_tue");
		dm.hody_plan_dt_wed = (String)hash.get("hody_plan_dt_wed");
		dm.hody_plan_dt_thu = (String)hash.get("hody_plan_dt_thu");
		dm.hody_plan_dt_fri = (String)hash.get("hody_plan_dt_fri");
		dm.hody_plan_dt_sat = (String)hash.get("hody_plan_dt_sat");
		dm.hody_plan_dt_sun = (String)hash.get("hody_plan_dt_sun");
		dm.emp_no_tm = (String)hash.get("emp_no_tm");
		dm.ep_seq = (String)hash.get("ep_seq");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3220_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_3310_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3310_MDataSet ds = null;
		HD_VACA_3310_MDM dm = new HD_VACA_3310_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_3310_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	
	//휴일예고통계(인사)_조회  
	public void hd_vaca_3320_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3320_LDataSet ds = null;
		HD_VACA_3320_LDM dm = new HD_VACA_3320_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter( "emp_no"));
		dm.plan_dt = Util.checkString(req.getParameter("plan_dt"));
		dm.posi_gb = Util.checkString(req.getParameter("posi_gb"));
		
		dm.print();

		ds = (HD_VACA_3320_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

//	휴일예고통계(대상자 )_초기화  
	public void hd_vaca_3410_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3410_MDataSet ds = null;
		HD_VACA_3410_MDM dm = new HD_VACA_3410_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_VACA_3410_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
//	휴일예고통계(대상자 )_조회  
	public void hd_vaca_3420_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3420_LDataSet ds = null;
		HD_VACA_3420_LDM dm = new HD_VACA_3420_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.plan_dt = Util.checkString(req.getParameter("plan_dt"));
		
		dm.print();

		ds = (HD_VACA_3420_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	//휴일예고대상자 관리 - 저장  
	public void hd_vaca_3430_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3430_ADataSet ds = null;
		HD_VACA_3430_ADM dm = new HD_VACA_3430_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("multiUpdateData=>"+multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.plan_dt	=  Util.checkString(req.getParameter("plan_dt"));
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.exec_clsf = (String)hash.get("exec_clsf");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3430_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//휴일예고대상자 관리 -추가 
	public void hd_vaca_3440_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3440_ADataSet ds = null;
		HD_VACA_3440_ADM dm = new HD_VACA_3440_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("multiUpdateData=>"+multiUpdateData);
						
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.save = (String)hash.get("save");
		dm.plan_dt	=  Util.checkString(req.getParameter("plan_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3440_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
//	휴일예고대상자 관리 -승인  
	public void hd_vaca_3450_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3450_ADataSet ds = null;
		HD_VACA_3450_ADM dm = new HD_VACA_3450_ADM();
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.plan_dt	=  Util.checkString(req.getParameter("plan_dt"));
        dm.u_id = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3450_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
//	휴일예고대상자 관리 - 미승인  
	public void hd_vaca_3460_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3460_ADataSet ds = null;
		HD_VACA_3460_ADM dm = new HD_VACA_3460_ADM();
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.plan_dt	=  Util.checkString(req.getParameter("plan_dt"));
        dm.u_id = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3460_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
//	휴일예고통계(대상자 ) 팝업 _초기화  
	public void hd_vaca_3510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3510_LDataSet ds = null;
		HD_VACA_3510_LDM dm = new HD_VACA_3510_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.plan_dt = Util.checkString(req.getParameter("plan_dt"));
		
		dm.print();
		
		ds = (HD_VACA_3510_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	//휴일예고대상자 관리 팝업  - 부서 변경  
	public void hd_vaca_3520_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_3520_ADataSet ds = null;
		HD_VACA_3520_ADM dm = new HD_VACA_3520_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("multiUpdateData=>"+multiUpdateData);

		dm.save = (String)hash.get("chk");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.plan_dt	=  Util.checkString(req.getParameter("plan_dt"));
		dm.chg_dept_cd = (String)hash.get("chg_dept_cd");
		dm.chg_dty_cd = (String)hash.get("chg_dty_cd");
		dm.chg_posi_cd = (String)hash.get("chg_posi_cd");
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_VACA_3520_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1620_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1620_LDataSet ds = null;
		HD_VACA_1620_LDM dm = new HD_VACA_1620_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prv_aprv_emp_no = Util.checkString(req.getParameter("prv_aprv_emp_no"));

		dm.print();
		
		ds = (HD_VACA_1620_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_1621_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1621_ADataSet ds = null;
		HD_VACA_1621_ADM dm = new HD_VACA_1621_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		
		dm.mode					= ((String)hash.get("m")).toUpperCase();
		dm.seq					= (String)hash.get("seq");
		dm.obj_dept_cd				= (String)hash.get("obj_dept_cd");
		dm.obj_emp_no			= (String)hash.get("obj_emp_no");
		dm.prv_aprv_emp_no			= (String)hash.get("prv_aprv_emp_no");
		dm.aft_aprv_emp_no	= (String)hash.get("aft_aprv_emp_no");
		dm.fr_dt					= (String)hash.get("fr_dt");
		dm.to_dt				= (String)hash.get("to_dt");
		dm.use_yn			= (String)hash.get("use_yn");
		
		dm.cmpy_cd				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd  	= req.getRemoteAddr();	
		

		dm.print();
		
		ds = (HD_VACA_1621_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
}
