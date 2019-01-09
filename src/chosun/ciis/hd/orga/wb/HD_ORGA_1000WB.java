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

package chosun.ciis.hd.orga.wb;

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
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;
/**
 * 
 */

public class HD_ORGA_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    public void hd_orga_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_ORGA_1000_MDataSet ds = null;
        HD_ORGA_1000_MDM dm = new HD_ORGA_1000_MDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
        
		dm.print();
		
		ds = (HD_ORGA_1000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 인사 부서 계층정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_ORGA_1001_LDataSet ds = null;
        HD_ORGA_1001_LDM dm = new HD_ORGA_1001_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.now_use_yn = Util.checkString(req.getParameter("now_use_yn"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		
		dm.print();
		
		ds = (HD_ORGA_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 부서 상세정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_ORGA_1002_LDataSet ds = null;
        HD_ORGA_1002_LDM dm = new HD_ORGA_1002_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.print();

		ds = (HD_ORGA_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 부서 변경이력정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_ORGA_1003_LDataSet ds = null;
        HD_ORGA_1003_LDM dm = new HD_ORGA_1003_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.print();

		ds = (HD_ORGA_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 부서정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1004_LDataSet ds = null;
		HD_ORGA_1004_LDM dm = new HD_ORGA_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (HD_ORGA_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 인사 부서정보 등록, 수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1005_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	//BaseDataSet ds = null;
		HD_ORGA_1005_ADataSet ds = null;
    	HD_ORGA_1005_ADM dm = new HD_ORGA_1005_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dept_nm = (String)hash.get("dept_nm");
		dm.seq = (String)hash.get("seq");
		dm.pre_dept_cd = (String)hash.get("pre_dept_cd");
		dm.pre_dept_nm = (String)hash.get("pre_dept_nm");
		dm.chg_aft_dept_cd = (String)hash.get("chg_aft_dept_cd"); 
		dm.chg_aft_dept_nm = (String)hash.get("chg_aft_dept_nm"); 
        dm.setIncmg_pers_ipadd(req.getRemoteAddr());
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		ds = (HD_ORGA_1005_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_orga_1006_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1006_ADataSet ds = null;
		HD_ORGA_1006_ADM dm = new HD_ORGA_1006_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dept_nm = (String)hash.get("dept_nm");
		dm.use_bgn_dt = (String)hash.get("use_bgn_dt");
		dm.use_end_dt = (String)hash.get("use_end_dt");
		dm.engl_nm = (String)hash.get("engl_nm");
		dm.abrv_nm = (String)hash.get("abrv_nm");
		dm.natn_cd = (String)hash.get("natn_cd");
		dm.duty_area = (String)hash.get("duty_area");
		dm.now_use_yn = (String)hash.get("now_use_yn");
		dm.cost_dept_clsf = (String)hash.get("cost_dept_clsf");
		dm.make_dept_clsf = (String)hash.get("make_dept_clsf");
		dm.prt_plac_yn = (String)hash.get("prt_plac_yn");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setIncmg_pers_ipadd(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_ORGA_1006_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1007_LDataSet ds = null;
		HD_ORGA_1007_LDM dm = new HD_ORGA_1007_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_ORGA_1007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1009_LDataSet ds = null;
		HD_ORGA_1009_LDM dm = new HD_ORGA_1009_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_ORGA_1009_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_orga_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1010_LDataSet ds = null;
		HD_ORGA_1010_LDM dm = new HD_ORGA_1010_LDM();

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_ORGA_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_orga_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1101_LDataSet ds = null;
		HD_ORGA_1101_LDM dm = new HD_ORGA_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_ORGA_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 인사 조직개편정보 등록, 수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	//BaseDataSet ds = null;
		HD_ORGA_1102_ADataSet ds = null;
        HD_ORGA_1102_ADM dm = new HD_ORGA_1102_ADM();
        
        dm.setMode(Util.checkString(req.getParameter("mode")));
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setOrga_reorga_dd(Util.checkString(req.getParameter("orga_reorga_dd")));
        dm.setOrga_reorga_resn(Util.checkString(req.getParameter("orga_reorga_resn")));
        dm.setIncmg_pers_ipadd(req.getRemoteAddr());
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		ds = (HD_ORGA_1102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

	public void hd_orga_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1103_ADataSet ds = null;
		HD_ORGA_1103_ADM dm = new HD_ORGA_1103_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); 
		dm.old_orga_reorga_dd = Util.checkString(req.getParameter("old_orga_reorga_dd"));
		dm.new_orga_reorga_dd = Util.checkString(req.getParameter("new_orga_reorga_dd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_ORGA_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 인사 시점별 조직계층정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1202(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_ORGA_1202_LDataSet ds = null;
        HD_ORGA_1202_LDM dm = new HD_ORGA_1202_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setOrga_reorga_dd(Util.checkString(req.getParameter("orga_reorga_dd")));
        
        dm.print();

		ds = (HD_ORGA_1202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 시점별 상위부서코드에 의한 하위부서 정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1203(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_ORGA_1203_LDataSet ds = null;
        HD_ORGA_1203_LDM dm = new HD_ORGA_1203_LDM();
        
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setOrga_reorga_dd(Util.checkString(req.getParameter("orga_reorga_dd")));
        String dept_cd = req.getParameter("supr_dept_cd");
        String dept = dept_cd.substring(0, 2);
        String supr_dept_cd = dept + "0000";
        dm.setSupr_dept_cd(supr_dept_cd);
        
        dm.print();

		ds = (HD_ORGA_1203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 시점별 조직구성정보 등록, 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_orga_1204_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1204_ADataSet ds = null;
		HD_ORGA_1204_ADM dm = new HD_ORGA_1204_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.supr_dept_cd = (String)hash.get("supr_dept_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.level = (String)hash.get("level");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_ORGA_1204_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1205_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1205_LDataSet ds = null;
		HD_ORGA_1205_LDM dm = new HD_ORGA_1205_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
		
		dm.print();

		ds = (HD_ORGA_1205_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1206_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1206_LDataSet ds = null;
		HD_ORGA_1206_LDM dm = new HD_ORGA_1206_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		
		dm.print();

		ds = (HD_ORGA_1206_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1207_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1207_ADataSet ds = null;
		HD_ORGA_1207_ADM dm = new HD_ORGA_1207_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		dm.supr_dept_cd = (String)hash.get("supr_dept_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.level = (String)hash.get("level");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_ORGA_1207_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1208_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1208_ADataSet ds = null;
		HD_ORGA_1208_ADM dm = new HD_ORGA_1208_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_ORGA_1208_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1209_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1209_ADataSet ds = null;
		HD_ORGA_1209_ADM dm = new HD_ORGA_1209_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_ORGA_1209_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1300_LDataSet ds = null;
		HD_ORGA_1300_LDM dm = new HD_ORGA_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_ORGA_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_orga_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1301_LDataSet ds = null;
		HD_ORGA_1301_LDM dm = new HD_ORGA_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd_1"));
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		dm.print();

		ds = (HD_ORGA_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_orga_1302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1302_ADataSet ds = null;
		HD_ORGA_1302_ADM dm = new HD_ORGA_1302_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.emp_no = (String)hash.get("emp_no");
		dm.nm_korn = (String)hash.get("nm_korn");
		dm.b_dept_cd = (String)hash.get("b_dept_nm");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.orga_reorga_dd = (String)hash.get("orga_reorga_dd");
		dm.emp_clsf = (String)hash.get("emp_clsf");
		dm.emp_dtls_clsf = (String)hash.get("emp_dtls_clsf");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.rgla_saly = (String)hash.get("rgla_saly");
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		ds = (HD_ORGA_1302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_orga_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1400_LDataSet ds = null;
		HD_ORGA_1400_LDM dm = new HD_ORGA_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
		dm.print();

		ds = (HD_ORGA_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_orga_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_ORGA_1401_LDataSet ds = null;
		HD_ORGA_1401_LDM dm = new HD_ORGA_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (HD_ORGA_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_orga_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_2000_LDataSet ds = null;
		HD_ORGA_2000_LDM dm = new HD_ORGA_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_ORGA_2000_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
		
	}
	
}
