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

package chosun.ciis.hd.prsn.wb;

import java.rmi.RemoteException;
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
import chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1000_LDataSet;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.ds.*;

/**
 * 
 */ 

public class HD_PRSN_1000WB extends BaseWB {

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
    public void hd_prsn_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_1000_LDataSet ds = null;
		HD_PRSN_1000_LDM dm = new HD_PRSN_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_PRSN_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_1001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_1001_ADataSet ds = null;
		HD_PRSN_1001_ADM dm = new HD_PRSN_1001_ADM();
		
		//DM Setting
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		System.out.println(multiUpdateData);
		String[] converted = convertMultiUpdateData(multiUpdateData);

		System.out.println("length=" + converted.length);
		String mode					= converted[0];
		String pgm_id				= converted[2];
		String pgm_nm				= converted[3];
		String pgm_url				= converted[4];
		String job_clsf				= converted[5];
		String annc_link_clsf		= converted[6];

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setMode(mode.toUpperCase());
		dm.setPgm_id(pgm_id);
		dm.setPgm_nm(pgm_nm);
		dm.setPgm_url(pgm_url);
		dm.setJob_clsf(job_clsf);
		dm.setAnnc_link_clsf(annc_link_clsf);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_PRSN_1001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_1002_LDataSet ds = null;
		HD_PRSN_1002_LDM dm = new HD_PRSN_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_PRSN_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2000_LDataSet ds = null;
		HD_PRSN_2000_LDM dm = new HD_PRSN_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.annc_frdt = Util.checkString(req.getParameter("annc_frdt"));
		dm.annc_todt = Util.checkString(req.getParameter("annc_todt"));
		dm.print();

		ds = (HD_PRSN_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2001_LDataSet ds = null;
		HD_PRSN_2001_LDM dm = new HD_PRSN_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_PRSN_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2002_LDataSet ds = null;
		HD_PRSN_2002_LDM dm = new HD_PRSN_2002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pgm_id = Util.checkString(req.getParameter("pgm_id_tm"));
		dm.print();

		ds = (HD_PRSN_2002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2003_LDataSet ds = null;
		HD_PRSN_2003_LDM dm = new HD_PRSN_2003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_PRSN_2003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2004_ADataSet ds = null;
		HD_PRSN_2004_ADM dm = new HD_PRSN_2004_ADM();
		
		//DM Setting
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		System.out.println(multiUpdateData);
		String[] converted = convertMultiUpdateData(multiUpdateData);

		System.out.println("length=" + converted.length);
		String mode					= converted[0];
		String annc_frdt				= converted[2];
		String annc_todt				= converted[3];
		String emp_no					= converted[5];
		String flnm					= converted[6];
		String annc_cont				= converted[9];
		String pgm_nm					= converted[10];
		String pgm_id					= converted[11];
		String pgm_url				= converted[12];
		String occr_dt				= converted[15];
		String seq					= converted[16];
		String dept_cd				= converted[17];
		String dty_cd					= converted[18];
		String posi_cd				= converted[19];
		String job_clsf				= converted[20];
		String annc_clsf				= converted[21];

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setMode(mode.toUpperCase());
		dm.setAnnc_frdt(annc_frdt);
		dm.setAnnc_todt(annc_todt);
		dm.setEmp_no(emp_no);
		dm.setFlnm(flnm);
		dm.setAnnc_cont(annc_cont);
		dm.setPgm_nm(pgm_nm);
		dm.setPgm_id(pgm_id);
		dm.setPgm_url(pgm_url);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setDept_cd(dept_cd);
		dm.setDty_cd(dty_cd);
		dm.setPosi_cd(posi_cd);
		dm.setJob_clsf(job_clsf);
		dm.setAnnc_clsf(annc_clsf);
		dm.lg_id = Util.checkString(req.getParameter("lg_id"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_PRSN_2004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2005_LDataSet ds = null;
		HD_PRSN_2005_LDM dm = new HD_PRSN_2005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_PRSN_2005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2006_LDataSet ds = null;
		HD_PRSN_2006_LDM dm = new HD_PRSN_2006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pgm_id = Util.checkString(req.getParameter("pgm_id"));
		dm.print();

		ds = (HD_PRSN_2006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2007_LDataSet ds = null;
		HD_PRSN_2007_LDM dm = new HD_PRSN_2007_LDM();

		dm.now_dt = Util.checkString(req.getParameter("now_dt"));

		dm.print();

		ds = (HD_PRSN_2007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_2010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_2010_ADataSet ds = null;
		HD_PRSN_2010_ADM dm = new HD_PRSN_2010_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.pgm_id = Util.checkString(req.getParameter("pgm_id"));
		dm.pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
		dm.pgm_url = Util.checkString(req.getParameter("pgm_url"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.annc_frdt = Util.checkString(req.getParameter("annc_frdt"));
		dm.annc_todt = Util.checkString(req.getParameter("annc_todt"));
		dm.annc_cont = Util.checkString(req.getParameter("annc_cont"));
		dm.annc_clsf = Util.checkString(req.getParameter("annc_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_PRSN_2010_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_prsn_5000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_5000_LDataSet ds = null;
		HD_PRSN_5000_LDM dm = new HD_PRSN_5000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_PRSN_5000_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
    
  //예외결재자&차기결재자 관리  
    public void hd_prsn_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_6001_LDataSet ds = null;
		HD_PRSN_6001_LDM dm = new HD_PRSN_6001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.fr_dt  = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt  = Util.checkString(req.getParameter("to_dt"));
		dm.use_yn  = Util.checkString(req.getParameter("use_yn"));

		dm.print();

		ds = (HD_PRSN_6001_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
    

    public void hd_prsn_6002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_6002_ADataSet ds = null;
		HD_PRSN_6002_ADM dm = new HD_PRSN_6002_ADM();

//		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.obj_dept_cd = Util.checkString(req.getParameter("obj_dept_cd"));
		dm.obj_emp_no = Util.checkString(req.getParameter("obj_emp_no"));
		dm.prv_aprv_emp_no = Util.checkString(req.getParameter("prv_aprv_emp_no"));
		dm.aft_aprv_emp_no = Util.checkString(req.getParameter("aft_aprv_emp_no"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_PRSN_6002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    

    public void hd_prsn_6003_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRSN_6003_DDataSet ds = null;
		HD_PRSN_6003_DDM dm = new HD_PRSN_6003_DDM();

//		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.prv_aprv_emp_no = Util.checkString(req.getParameter("prv_aprv_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_PRSN_6003_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
}