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

package chosun.ciis.hd.com.wb;

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
import chosun.ciis.hd.com.dm.*;
import chosun.ciis.hd.com.ds.*;
/**
 * 
 */ 

public class HD_COM_1000WB extends BaseWB {

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
    public void hd_com_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_COM_1001_LDataSet ds = null;
		HD_COM_1001_LDM dm = new HD_COM_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_COM_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    /* 안쓰는것으로 보임 주석처리함( 이가연 ) 2018.09.04 
    public void hd_com_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {//편집국용 
        DBManager manager = new DBManager("MISHDL");

        HD_COM_1011_LDataSet ds = null;
        HD_COM_1011_LDM dm = new HD_COM_1011_LDM();

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        ds = (HD_COM_1011_LDataSet)manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
          System.out.println("DAO..error.");
          throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
      }

   */
    /**
     * 사원정보 검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_com_1002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");

    	HD_COM_1002_LDataSet ds = null;

        // DM Setting
        HD_COM_1002_LDM dm = new HD_COM_1002_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.setEmp_no(Util.checkString(req.getParameter("emp_no")));
        dm.setNm_korn(Util.checkString(req.getParameter("nm_korn")));
        dm.setEmp_clsf_cd(Util.checkString(req.getParameter("emp_clsf_cd")));
        dm.lvcmpy = Util.checkString(req.getParameter("lvcmpy"));
        
        dm.print();

		ds = (HD_COM_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    /* 안쓰는것으로 보임 주석처리함( 이가연 ) 2018.09.04 
    public void hd_com_1022(HttpServletRequest req, HttpServletResponse res) throws AppException {
      DBManager manager = new DBManager("MISHDL");

      HD_COM_1022_LDataSet ds = null;

      HD_COM_1022_LDM dm = new HD_COM_1022_LDM();
      dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
      dm.setEmp_no(Util.checkString(req.getParameter("emp_no")));
      dm.setNm_korn(Util.checkString(req.getParameter("nm_korn")));
      dm.setEmp_clsf_cd(Util.checkString(req.getParameter("emp_clsf_cd")));
      dm.lvcmpy = Util.checkString(req.getParameter("lvcmpy"));

      dm.print();

      ds = (HD_COM_1022_LDataSet)manager.executeCall(dm);

      if (!"".equals(ds.errcode)) {
        System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
      }

      req.setAttribute("ds", ds);
    }
    */
    /**
     * 사원정보 검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_com_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_COM_1003_LDataSet ds = null;
		HD_COM_1003_LDM dm = new HD_COM_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_tm"));
		dm.print();

		ds = (HD_COM_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 사원정보 검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_com_1004(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");

    	HD_COM_1004_SDataSet ds = null;

        // DM Setting
        HD_COM_1004_SDM dm = new HD_COM_1004_SDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.print();

		ds = (HD_COM_1004_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_com_1005_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_COM_1005_MDataSet ds = null;
		HD_COM_1005_MDM dm = new HD_COM_1005_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		DBManager manager = new DBManager("MISHDL");
		ds = (HD_COM_1005_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_com_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_COM_1100_LDataSet ds = null;
		HD_COM_1100_LDM dm = new HD_COM_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_tag = Util.checkString(req.getParameter("search_tag"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.abrv_nm = Util.checkString(req.getParameter("abrv_nm"));

		dm.print();

		ds = (HD_COM_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 부서정보 검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_com_1101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");

    	HD_COM_1101_LDataSet ds = null;

        // DM Setting
        HD_COM_1101_LDM dm = new HD_COM_1101_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.setAbrv_nm(Util.checkString(req.getParameter("abrv_nm")));
        dm.setSearch_tag(Util.checkString(req.getParameter("search_tag")));
        
        dm.print();

		ds = (HD_COM_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 부서정보 검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_com_1102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");

    	HD_COM_1102_SDataSet ds = null;

        // DM Setting
        HD_COM_1102_SDM dm = new HD_COM_1102_SDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.print();

		ds = (HD_COM_1102_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_com_1103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_1103_LDataSet ds = null;
		HD_COM_1103_LDM dm = new HD_COM_1103_LDM();

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
        dm.print();

		ds = (HD_COM_1103_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_com_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_1110_LDataSet ds = null;
		HD_COM_1110_LDM dm = new HD_COM_1110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));

		dm.print();

		ds = (HD_COM_1110_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
    
    public void hd_com_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_COM_1200_LDataSet ds = null;
		HD_COM_1200_LDM dm = new HD_COM_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		
		dm.print();
		
		ds = (HD_COM_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_com_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_COM_2000_LDataSet ds = null;
		HD_COM_2000_LDM dm = new HD_COM_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();
		
		ds = (HD_COM_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_com_2100_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_2100_ADataSet ds = null;
		HD_COM_2100_ADM dm = new HD_COM_2100_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.pgm_id = Util.checkString(req.getParameter("pgm_id"));

		dm.print();
		
		ds = (HD_COM_2100_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    public void hd_com_5000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5000_LDataSet ds = null;
		HD_COM_5000_LDM dm = new HD_COM_5000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_COM_5000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    public void hd_com_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5000_LDataSet ds = null;
		HD_COM_5000_LDM dm = new HD_COM_5000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_COM_5000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    public void hd_com_5002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5002_LDataSet ds = null;
		HD_COM_5002_LDM dm = new HD_COM_5002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_COM_5002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    public void hd_com_5003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5002_LDataSet ds = null;
		HD_COM_5002_LDM dm = new HD_COM_5002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_COM_5002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    public void hd_com_5004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5004_LDataSet ds = null;
		HD_COM_5004_LDM dm = new HD_COM_5004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		if(   Util.checkString(req.getParameter("emp_no")) != "" 
		   && Util.checkString(req.getParameter("emp_no")).length() > 0	   ) 
		{
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
			System.out.println("*****입력 " );
		}else 
		{
			dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
			System.out.println("******세션 ");
        }
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));


		dm.print();
		
		ds = (HD_COM_5004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    public void hd_com_5100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5100_LDataSet ds = null;
		HD_COM_5100_LDM dm = new HD_COM_5100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("app_dept_cd"));

		dm.print();

		ds = (HD_COM_5100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    public void hd_com_5200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5200_LDataSet ds = null;
		HD_COM_5200_LDM dm = new HD_COM_5200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_COM_5200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    public void hd_com_5300_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_COM_5300_IDataSet ds = null;
		HD_COM_5300_IDM dm = new HD_COM_5300_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.pgm_id = Util.checkString(req.getParameter("pgm_id"));
		dm.pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
		dm.pgm_url = Util.checkString(req.getParameter("pgm_url"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.annc_cont = Util.checkString(req.getParameter("annc_cont"));
		dm.annc_clsf = Util.checkString(req.getParameter("annc_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_COM_5300_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);	
	}
    
    
}
