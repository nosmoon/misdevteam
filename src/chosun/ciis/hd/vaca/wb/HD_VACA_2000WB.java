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
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */
 
public class HD_VACA_2000WB extends BaseWB {
 
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

	public void hd_vaca_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2000_LDataSet ds = null;
		HD_VACA_2000_LDM dm = new HD_VACA_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.print();
		
		ds = (HD_VACA_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_2001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2001_MDataSet ds = null;
		HD_VACA_2001_MDM dm = new HD_VACA_2001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_2001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_2100_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2100_ADataSet ds = null;
		HD_VACA_2100_ADM dm = new HD_VACA_2100_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		ds = (HD_VACA_2100_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_2201_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2201_MDataSet ds = null;
		HD_VACA_2201_MDM dm = new HD_VACA_2201_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_VACA_2201_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_vaca_2210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2210_LDataSet ds = null;
		HD_VACA_2210_LDM dm = new HD_VACA_2210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_VACA_2210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_2220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2220_LDataSet ds = null;
		HD_VACA_2220_LDM dm = new HD_VACA_2220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_VACA_2220_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_vaca_2300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2300_LDataSet ds = null;
		HD_VACA_2300_LDM dm = new HD_VACA_2300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_VACA_2300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//부서원 휴가(신청)일 조회_부서원 휴가사용내역_년도별로 동적으로 결과값을 가져오도록 수정함_20150202_최호정
	public void hd_vaca_2302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2302_LDataSet ds = null;
		HD_VACA_2302_LDM dm = new HD_VACA_2302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);  
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt")); //휴가신청기간 시작일
		dm.to_dt = Util.checkString(req.getParameter("to_dt")); //휴가신청기간 종료일

		dm.print();

		ds = (HD_VACA_2302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
//부서원 휴가(신청)일 조회_부서원 휴가사용내역_신규추가_20150202_최호정
	public void hd_vaca_2303_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2303_LDataSet ds = null;
		HD_VACA_2303_LDM dm = new HD_VACA_2303_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);  
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.vaca_fr_dt = Util.checkString(req.getParameter("vaca_fr_dt")); //휴가신청기간 시작일	

		dm.print();

		ds = (HD_VACA_2303_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
}
