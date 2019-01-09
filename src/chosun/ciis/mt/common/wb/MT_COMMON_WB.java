package chosun.ciis.mt.common.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.as.com.dm.AS_COM_1000_SDM;
import chosun.ciis.as.com.ds.AS_COM_1000_SDataSet;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.common.dm.*;
import chosun.ciis.mt.common.ds.*;


public class MT_COMMON_WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    
    
    
    public void mt_com_1000_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COM_1000_SDataSet ds = null;
		MT_COM_1000_SDM dm = new MT_COM_1000_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISMAT");
		ds = (MT_COM_1000_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	
	}
    
    
    
    /******** 부서코드 - > 부서 명칭 검색 (단건) **/
    public void mt_common_0001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_DEPT_0001_LDataSet ds = null;

        // DM Setting
    	MT_COMMON_DEPT_0001_LDM dm = new MT_COMMON_DEPT_0001_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.print();

        ds = (MT_COMMON_DEPT_0001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    /******** 사업장번호 -> 거래처 코드 / 거래처 명칭 (단건) **/
    public void mt_common_0002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_DLCO_0001_LDataSet ds = null;

        // DM Setting
    	MT_COMMON_DLCO_0001_LDM dm = new MT_COMMON_DLCO_0001_LDM();
    	dm.setErn(Util.checkString(req.getParameter("ern")));
        dm.print();

        ds = (MT_COMMON_DLCO_0001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    

    /* 자재코드 조회 */
    public void mt_common_0003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_MATR_0003_LDataSet ds = null;
    	
    	// DM Setting
    	MT_COMMON_MATR_0003_LDM dm = new MT_COMMON_MATR_0003_LDM();
     	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
        dm.print();

        ds = (MT_COMMON_MATR_0003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /* 부서 복수조회 */
    public void mt_common_0004(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_DLCO_0002_LDataSet ds = null;
    	
    	// DM Setting
    	MT_COMMON_DLCO_0002_LDM dm = new MT_COMMON_DLCO_0002_LDM();
     	dm.setDlco_nm(Util.checkString(req.getParameter("dlco_nm")));
     	dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
        dm.print();

        ds = (MT_COMMON_DLCO_0002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /* 사원 조회 */
    public void mt_common_0005(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_EMP_0001_LDataSet ds = null;
    	
    	// DM Setting
    	MT_COMMON_EMP_0001_LDM dm = new MT_COMMON_EMP_0001_LDM();
     	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.checkString(req.getParameter("emp_no")));
        dm.print();

        ds = (MT_COMMON_EMP_0001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /* 자재코드 POP-UP 조회 */
    public void mt_common_0006(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_MATR_0002_LDataSet ds = null;
    	
    	// DM Setting
    	MT_COMMON_MATR_0002_LDM dm = new MT_COMMON_MATR_0002_LDM();
     	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setMatr_nm(Util.checkString(req.getParameter("matr_nm")));
        dm.print();

        ds = (MT_COMMON_MATR_0002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /* 물품청구  POP-UP 조회 */
    public void mt_common_0007(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_MATR_0004_LDataSet ds = null;
    	
    	// DM Setting
    	MT_COMMON_MATR_0004_LDM dm = new MT_COMMON_MATR_0004_LDM();
     	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setClam_dt_fr(Util.checkString(req.getParameter("clam_dt_fr")));
    	dm.setClam_dt_to(Util.checkString(req.getParameter("clam_dt_to")));
    	dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
        dm.print();

        ds = (MT_COMMON_MATR_0004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /* 물품청구  POP-UP 조회2 */
    public void mt_common_0008(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_MATR_0005_LDataSet ds = null;
    	
    	// DM Setting
    	MT_COMMON_MATR_0005_LDM dm = new MT_COMMON_MATR_0005_LDM();
     	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_occr_dt(Util.checkString(req.getParameter("ewh_occr_dt")));
    	dm.setEwh_seq(Util.checkString(req.getParameter("ewh_seq")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
        dm.print();

        ds = (MT_COMMON_MATR_0005_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
	public void mt_com_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMON_1000_LDataSet ds = null;
		
		MT_COMMON_1000_LDM dm = new MT_COMMON_1000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.print();

		ds = (MT_COMMON_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_com_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMON_2000_LDataSet ds = null;
		
		MT_COMMON_2000_LDM dm = new MT_COMMON_2000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.print();

		ds = (MT_COMMON_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	} 
	
    /* 공통코드 복수조회 */
    public void mt_common_0009(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMON_DLCO_0003_LDataSet ds = null;

        // DM Setting
    	MT_COMMON_DLCO_0003_LDM dm = new MT_COMMON_DLCO_0003_LDM();
    	dm.setErn(Util.checkString(req.getParameter("ern")));
        dm.print();

        ds = (MT_COMMON_DLCO_0003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
//    public void mt_common_3001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
//		DBManager manager = new DBManager("MISMAT");
//		MT_COMMON_3001_LDataSet ds = null;
//		
//		MT_COMMON_3001_LDM dm = new MT_COMMON_3001_LDM();
//		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
//		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
//		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
//		dm.print();
//
//		ds = (MT_COMMON_3001_LDataSet)manager.executeCall(dm);
//
//		if(!ds.getErrcode().equals("")) {
//			throw new AppException(ds.getErrcode(), ds.getErrmsg());
//		}
//		
//		req.setAttribute("ds", ds);
//	}
    
    public void mt_common_cocd_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_COMMON_COCD_1000_LDataSet ds = null;
		MT_COMMON_COCD_1000_LDM dm = new MT_COMMON_COCD_1000_LDM();
 
	
		    String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
			String job_clsf = Util.checkString(req.getParameter("job_clsf"));
			String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
			String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
			String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));
			String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
	         
	        dm.setCmpy_cd(cmpy_cd);
			dm.setJob_clsf(job_clsf);
			dm.setCd_clsf(cd_clsf);
			dm.setMang_cd_1(mang_cd_1);
			dm.setMang_cd_2(mang_cd_2);
			dm.setMang_cd_3(mang_cd_3);
			
			dm.print();

	        ds = (MT_COMMON_COCD_1000_LDataSet)manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }		
	        req.setAttribute("ds", ds);

	}

}