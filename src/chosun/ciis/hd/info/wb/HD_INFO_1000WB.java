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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.hd.info.dm.HD_INFO_1000_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1001_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1002_SDM;
import chosun.ciis.hd.info.dm.HD_INFO_1003_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1004_SDM;
import chosun.ciis.hd.info.dm.HD_INFO_1005_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1006_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1007_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1008_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1009_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1010_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1011_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1012_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1013_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1014_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1015_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_1020_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1021_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1022_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1023_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1024_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1025_UDM;
import chosun.ciis.hd.info.dm.HD_INFO_1026_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1027_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_1031_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1032_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1033_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1040_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_1041_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1042_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1043_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1050_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1051_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1052_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1053_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1054_LDM;

import chosun.ciis.hd.info.dm.HD_INFO_1060_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1061_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1062_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1070_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_1071_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1072_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1080_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1081_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1082_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1083_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1084_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_1090_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_1091_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1092_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1093_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_1100_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_1110_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1120_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_1180_ADM;
import chosun.ciis.hd.info.dm.HD_INFO_6000_LDM;
import chosun.ciis.hd.info.dm.HD_INFO_6001_MDM;
import chosun.ciis.hd.info.dm.HD_INFO_6010_LDM;
import chosun.ciis.hd.info.ds.HD_INFO_1000_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1001_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1002_SDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1003_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1004_SDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1005_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1006_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1007_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1008_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1009_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1010_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1011_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1012_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1013_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1014_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1015_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1020_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1021_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1022_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1023_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1024_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1025_UDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1026_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1027_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1031_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1032_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1033_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1040_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1041_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1042_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1043_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1050_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1051_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1052_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1053_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1054_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1060_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1061_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1062_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1070_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1071_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1072_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1080_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1081_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1082_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1083_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1084_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1090_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1091_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1092_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1093_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1100_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1110_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1120_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_1180_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_6000_LDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_6001_MDataSet;
import chosun.ciis.hd.info.ds.HD_INFO_6010_LDataSet;
/**
 * 
 */

public class HD_INFO_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 인사기본정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_INFO_6000_LDataSet ds = null;
		HD_INFO_6000_LDM dm = new HD_INFO_6000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.prn = Util.checkString(req.getParameter("prn"));

		dm.print();

		ds = (HD_INFO_6000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
 public void hd_info_6010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
	 System.out.print("22222");
	 	DBManager manager = new DBManager("MISHDL");
    	HD_INFO_6010_LDataSet ds = null;
		HD_INFO_6010_LDM dm = new HD_INFO_6010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();
		System.out.print("33333");
		ds = (HD_INFO_6010_LDataSet)manager.executeCall(dm);
		System.out.print("55555");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void hd_info_6001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_6001_MDataSet ds = null;
		HD_INFO_6001_MDM dm = new HD_INFO_6001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true); //세션의 사번

		dm.print();
		
		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_6001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1000_LDataSet ds = null;

        // DM Setting
        HD_INFO_1000_LDM dm = new HD_INFO_1000_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 인사기본정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1001_LDataSet ds = null;

        // DM Setting
        HD_INFO_1001_LDM dm = new HD_INFO_1001_LDM();

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
        String prn_tm = Util.checkString(req.getParameter("prn"));
        String prn_str = "";
        
        dm.print();
        
        if(prn_tm.length() == 14){
        	prn_str = prn_tm.substring(0,6) + prn_tm.substring(7,14);
        }
        dm.prn = prn_str;

		ds = (HD_INFO_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 인사이미지 파일 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1002_SDataSet ds = null;

        // DM Setting
        HD_INFO_1002_SDM dm = new HD_INFO_1002_SDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        
        //dm.print();
        
		ds = (HD_INFO_1002_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1003_ADataSet ds = null;
		HD_INFO_1003_ADM dm = new HD_INFO_1003_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_INFO_1003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1004_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1004_SDataSet ds = null;
		HD_INFO_1004_SDM dm = new HD_INFO_1004_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prn = Util.checkString(req.getParameter("prn"));

		ds = (HD_INFO_1004_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
  	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1005_LDataSet ds = null;
		HD_INFO_1005_LDM dm = new HD_INFO_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_INFO_1005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
    
    public void hd_info_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_INFO_1006_LDataSet ds = null;
		HD_INFO_1006_LDM dm = new HD_INFO_1006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.prev_emp_no = Util.checkString(req.getParameter("prev_emp_no"));

		dm.print();

		ds = (HD_INFO_1006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1007_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_INFO_1007_ADataSet ds = null;
		HD_INFO_1007_ADM dm = new HD_INFO_1007_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.prev_emp_no = Util.checkString(req.getParameter("prev_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자

		dm.print();

		ds = (HD_INFO_1007_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_info_1008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1008_LDataSet ds = null;
		HD_INFO_1008_LDM dm = new HD_INFO_1008_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_INFO_1008_LDataSet )manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1009_A(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1009_ADataSet ds = null;
		HD_INFO_1009_ADM dm = new HD_INFO_1009_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_INFO_1009_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    /**
     * 상세 기본정보 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1010(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1010_LDataSet ds = null;

        // DM Setting
        HD_INFO_1010_LDM dm = new HD_INFO_1010_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 상세 기본정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1011(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1011_LDataSet ds = null;

        // DM Setting
        HD_INFO_1011_LDM dm = new HD_INFO_1011_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));

       
        dm.print();
        
		ds = (HD_INFO_1011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 상세 기본정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1012_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1012_ADataSet ds = null;
		HD_INFO_1012_ADM dm = new HD_INFO_1012_ADM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.nm_chin = Util.checkString(req.getParameter("nm_chin"));
		dm.nm_engl = Util.checkString(req.getParameter("nm_engl"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.emp_dtls_clsf = Util.checkString(req.getParameter("emp_dtls_clsf"));
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.alon_pay_dept_yn = Util.checkString(req.getParameter("alon_pay_dept_yn"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.addm_dept_cd = Util.checkString(req.getParameter("addm_dept_cd"));
		dm.addm_alon_pay_dept_yn = Util.checkString(req.getParameter("addm_alon_pay_dept_yn"));
		dm.addm_dty_cd = Util.checkString(req.getParameter("addm_dty_cd"));
		dm.addm_posi_cd = Util.checkString(req.getParameter("addm_posi_cd"));
		dm.duty_area_cd = Util.checkString(req.getParameter("duty_area_cd"));
		dm.dtplc_cd = Util.checkString(req.getParameter("dtplc_cd"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.lvcmpy_resn_cd = Util.checkString(req.getParameter("lvcmpy_resn_cd"));
		dm.last_midl_adjm_dt = Util.checkString(req.getParameter("last_midl_adjm_dt"));
		dm.midl_adjm_tms = Util.checkString(req.getParameter("midl_adjm_tms"));
		dm.last_upgrd_dt = Util.checkString(req.getParameter("last_upgrd_dt"));
		dm.last_saly_chg_appmt_dt = Util.checkString(req.getParameter("last_saly_chg_appmt_dt"));
		dm.last_appmt_dt = Util.checkString(req.getParameter("last_appmt_dt"));
		dm.last_appmt_cd = Util.checkString(req.getParameter("last_appmt_cd"));
		dm.last_appmt_cont = Util.checkString(req.getParameter("last_appmt_cont"));
		dm.last_temp_dt = Util.checkString(req.getParameter("last_temp_dt"));
		dm.last_reinst_dt = Util.checkString(req.getParameter("last_reinst_dt"));
		dm.last_temp_clsf = Util.checkString(req.getParameter("last_temp_clsf"));
		dm.last_stdy_dt = Util.checkString(req.getParameter("last_stdy_dt"));
		dm.last_stdy_reinst_dt = Util.checkString(req.getParameter("last_stdy_reinst_dt"));
		dm.in_cmpy_clsf = Util.checkString(req.getParameter("in_cmpy_clsf"));
		dm.open_invit_clsf = Util.checkString(req.getParameter("open_invit_clsf"));
		dm.open_invit_desty = Util.checkString(req.getParameter("open_invit_desty"));
		dm.relg_cd = Util.checkString(req.getParameter("relg_cd"));
		dm.in_cmpy_resn_cd = Util.checkString(req.getParameter("in_cmpy_resn_cd"));
		dm.recom_pers_rshp_cd = Util.checkString(req.getParameter("recom_pers_rshp_cd"));
		dm.recom_pers_flnm = Util.checkString(req.getParameter("recom_pers_flnm"));
		dm.spc_1 = Util.checkString(req.getParameter("spc_1"));
		dm.spc_2 = Util.checkString(req.getParameter("spc_2"));
		dm.hby_1 = Util.checkString(req.getParameter("hby_1"));
		dm.hby_2 = Util.checkString(req.getParameter("hby_2"));
		dm.nativ_cd = Util.checkString(req.getParameter("nativ_cd"));
		dm.nativ_dtls_area = Util.checkString(req.getParameter("nativ_dtls_area"));
		dm.blod_cd = Util.checkString(req.getParameter("blod_cd"));
		dm.in_cmpy_psgp_cd = Util.checkString(req.getParameter("in_cmpy_psgp_cd"));
		dm.in_cmpy_octgr_cd = Util.checkString(req.getParameter("in_cmpy_octgr_cd"));
		dm.in_cmpy_posk_cd = Util.checkString(req.getParameter("in_cmpy_posk_cd"));
		dm.cur_jobforc_cd = Util.checkString(req.getParameter("cur_jobforc_cd"));
		dm.cur_jobkind_cd = Util.checkString(req.getParameter("cur_jobkind_cd"));
		dm.cur_jobnon_cd = Util.checkString(req.getParameter("cur_jobnon_cd"));
		dm.saly_shft_bank_cd = Util.checkString(req.getParameter("saly_shft_bank_cd"));
		dm.saly_shft_acct_no = Util.checkString(req.getParameter("saly_shft_acct_no"));
		dm.alon_shft_bank_cd = Util.checkString(req.getParameter("alon_shft_bank_cd"));
		dm.alon_shft_acct_no = Util.checkString(req.getParameter("alon_shft_acct_no"));
		dm.encrg_amt_shft_bank_cd = Util.checkString(req.getParameter("encrg_amt_shft_bank_cd"));
		dm.encrg_amt_shft_acct_no = Util.checkString(req.getParameter("encrg_amt_shft_acct_no"));
		dm.etc_shft_bank_cd = Util.checkString(req.getParameter("etc_shft_bank_cd"));
		dm.etc_shft_acct_no = Util.checkString(req.getParameter("etc_shft_acct_no"));
		dm.etc_shft_chqe_pay_yn = Util.checkString(req.getParameter("etc_shft_chqe_pay_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.aprv_in_cmpy = Util.checkString(req.getParameter("aprv_in_cmpy"));
		
		dm.print();

		ds = (HD_INFO_1012_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1013(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1013_LDataSet ds = null;

        // DM Setting
        HD_INFO_1013_LDM dm = new HD_INFO_1013_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1013_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_1014_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
       	HD_INFO_1014_LDataSet ds = null;
		HD_INFO_1014_LDM dm = new HD_INFO_1014_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_INFO_1014_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.emp_no = (String)hash.get("emp_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		*******************************************************************************************/
	}
    
    public void hd_info_1015_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_1015_MDataSet ds = null;
		HD_INFO_1015_MDM dm = new HD_INFO_1015_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_1015_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    /**
     * 인사 학력정보 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1020(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1020_LDataSet ds = null;

        // DM Setting
        HD_INFO_1020_LDM dm = new HD_INFO_1020_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 인사학력정보의 전공구분에 따른 전공 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1021(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1021_LDataSet ds = null;

        // DM Setting
        HD_INFO_1021_LDM dm = new HD_INFO_1021_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.majr_clsf = Util.checkString(req.getParameter("majr_clsf"));

		ds = (HD_INFO_1021_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 인사학력의 학교 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1022(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1022_LDataSet ds = null;

        // DM Setting
        HD_INFO_1022_LDM dm = new HD_INFO_1022_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.scl_clsf = Util.checkString(req.getParameter("scl_clsf"));
        
        dm.print();

		ds = (HD_INFO_1022_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 인사학력정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1023(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1023_LDataSet ds = null;

        // DM Setting
        HD_INFO_1023_LDM dm = new HD_INFO_1023_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_INFO_1023_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 학력정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */

	public void hd_info_1024_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		long start_tm = System.currentTimeMillis();
		
		HD_INFO_1024_ADataSet ds = null;
		HD_INFO_1024_ADM dm = new HD_INFO_1024_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.schir_seq = (String)hash.get("schir_seq");
        dm.scl_clsf = (String)hash.get("scl_clsf");
        dm.scl_cd = (String)hash.get("scl_cd");
        dm.scl_nm = (String)hash.get("scl_nm");
        dm.enty_dt = (String)hash.get("enty_dt");
        dm.grdu_dt = (String)hash.get("grdu_dt");
        dm.grdu_clsf = (String)hash.get("grdu_clsf");
        dm.schir_cd = (String)hash.get("schir_cd");
        dm.majr_clsf_1 = (String)hash.get("majr_clsf_1");
        dm.majr_cd_1 = (String)hash.get("majr_cd_1");
        dm.majr_nm_1 = (String)hash.get("majr_nm_1");
        dm.majr_clsf_2 = (String)hash.get("majr_clsf_2");
        dm.majr_cd_2 = (String)hash.get("majr_cd_2");
        dm.majr_nm_2 = (String)hash.get("majr_nm_2");
        dm.majr_clsf_3 = (String)hash.get("majr_clsf_3");
        dm.majr_cd_3 = (String)hash.get("majr_cd_3");
        dm.majr_nm_3 = (String)hash.get("majr_nm_3");
        dm.sclgg_kind_cd = (String)hash.get("sclgg_kind_cd");
        dm.plcw_cd = (String)hash.get("plcw_cd");
        dm.natn_cd = (String)hash.get("natn_cd");
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_INFO_1024_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

	public void hd_info_1025_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		long start_tm = System.currentTimeMillis();
		
		HD_INFO_1025_UDataSet ds = null;
		HD_INFO_1025_UDM dm = new HD_INFO_1025_UDM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.schir_seq = Util.checkString(req.getParameter("schir_seq"));
		dm.scl_clsf = Util.checkString(req.getParameter("scl_clsf"));
		dm.scl_cd = Util.checkString(req.getParameter("scl_cd"));
		dm.scl_nm = Util.checkString(req.getParameter("scl_nm"));
		dm.enty_dt = Util.checkString(req.getParameter("enty_dt"));
		dm.grdu_dt = Util.checkString(req.getParameter("grdu_dt"));
		dm.grdu_clsf = Util.checkString(req.getParameter("grdu_clsf"));
		dm.schir_cd = Util.checkString(req.getParameter("schir_cd"));
		dm.majr_clsf_1 = Util.checkString(req.getParameter("majr_clsf_1"));
		dm.majr_cd_1 = Util.checkString(req.getParameter("majr_cd_1"));
		dm.majr_nm_1 = Util.checkString(req.getParameter("majr_nm_1"));
		dm.majr_clsf_2 = Util.checkString(req.getParameter("majr_clsf_2"));
		dm.majr_cd_2 = Util.checkString(req.getParameter("majr_cd_2"));
		dm.majr_nm_2 = Util.checkString(req.getParameter("majr_nm_2"));
		dm.majr_clsf_3 = Util.checkString(req.getParameter("majr_clsf_3"));
		dm.majr_cd_3 = Util.checkString(req.getParameter("majr_cd_3"));
		dm.majr_nm_3 = Util.checkString(req.getParameter("majr_nm_3"));
		dm.sclgg_kind_cd = Util.checkString(req.getParameter("sclgg_kind_cd"));
		dm.plcw_cd = Util.checkString(req.getParameter("plcw_cd"));
		dm.natn_cd = Util.checkString(req.getParameter("natn_cd"));
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_INFO_1025_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_1026_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		long start_tm = System.currentTimeMillis();
		
		HD_INFO_1026_LDataSet ds = null;
		HD_INFO_1026_LDM dm = new HD_INFO_1026_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scl_clsf = Util.checkString(req.getParameter("scl_clsf"));

		dm.print();

		ds = (HD_INFO_1026_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_1027_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_1027_MDataSet ds = null;
		HD_INFO_1027_MDM dm = new HD_INFO_1027_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_1027_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    /**
     * 인사 가족정보 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1031(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1031_LDataSet ds = null;

        // DM Setting
        HD_INFO_1031_LDM dm = new HD_INFO_1031_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1031_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 가족정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1032(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1032_LDataSet ds = null;

        // DM Setting
        HD_INFO_1032_LDM dm = new HD_INFO_1032_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_INFO_1032_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 인사 가족정보 등록,수정,삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1033_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1033_ADataSet ds = null;
        HD_INFO_1033_ADM dm = new HD_INFO_1033_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        int idx = 0;
        
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.faml_seq = (String)hash.get("faml_seq");             
		dm.faml_rshp_cd = (String)hash.get("faml_rshp_cd");    
		dm.faml_prn = (String)hash.get("faml_prn");
		dm.faml_flnm = (String)hash.get("faml_flnm"); 
		dm.schir_cd = (String)hash.get("schir_cd");
		dm.ocpn_cd = (String)hash.get("ocpn_cd");
		dm.offi_nm = (String)hash.get("offi_nm");
		dm.posi = (String)hash.get("posi");
		dm.nmat_yn = (String)hash.get("nmat_yn");
		dm.dth_dt = (String)hash.get("dth_dt");
		dm.spos_dduc_obj_yn = (String)hash.get("spos_dduc_obj_yn");      
		dm.child_dduc_obj_yn = (String)hash.get("child_dduc_obj_yn");     
		dm.oldg_dduc_obj_yn = (String)hash.get("oldg_dduc_obj_yn");      
		dm.obcl_pers_dduc_obj_yn = (String)hash.get("obcl_pers_dduc_obj_yn"); 
		dm.rspc_dduc_obj_yn = (String)hash.get("rspc_dduc_obj_yn");      
		dm.fml_hshd_dduc_yn = (String)hash.get("fml_hshd_dduc_yn");      
		dm.care_fee_dduc_yn = (String)hash.get("care_fee_dduc_yn");      
		dm.adopt_dt = (String)hash.get("adopt_dt");
		dm.emp_no = (String)hash.get("emp_no");
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        
		ds = (HD_INFO_1033_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_1040_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_1040_MDataSet ds = null;
		HD_INFO_1040_MDM dm = new HD_INFO_1040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_1040_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 병역정보 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1041(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1041_LDataSet ds = null;

        // DM Setting
        HD_INFO_1041_LDM dm = new HD_INFO_1041_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1041_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 병역정보 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1042(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1042_LDataSet ds = null;

        // DM Setting
        HD_INFO_1042_LDM dm = new HD_INFO_1042_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_INFO_1042_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * 병역정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void hd_info_1043_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		long start_tm = System.currentTimeMillis();
		
		HD_INFO_1043_ADataSet ds = null;
		HD_INFO_1043_ADM dm = new HD_INFO_1043_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.army_clsf_cd = Util.checkString(req.getParameter("army_clsf_cd"));
		dm.forc_clsi_cd = Util.checkString(req.getParameter("forc_clsi_cd"));
		dm.army_svc_cd = Util.checkString(req.getParameter("army_svc_cd"));
		dm.cmmd_army_part_cd = Util.checkString(req.getParameter("cmmd_army_part_cd"));
		dm.sold_main_spc_cd = Util.checkString(req.getParameter("sold_main_spc_cd"));
		dm.crps_spc_cd = Util.checkString(req.getParameter("crps_spc_cd"));
		dm.army_cd = Util.checkString(req.getParameter("army_cd"));
		dm.cls_cd = Util.checkString(req.getParameter("cls_cd"));
		dm.forc_no = Util.checkString(req.getParameter("forc_no"));
		dm.in_army_dt = Util.checkString(req.getParameter("in_army_dt"));
		dm.out_army_dt = Util.checkString(req.getParameter("out_army_dt"));
		dm.out_army_resn_cd = Util.checkString(req.getParameter("out_army_resn_cd"));
		dm.army_un_finsh_resn_cd = Util.checkString(req.getParameter("army_un_finsh_resn_cd"));
		dm.rsv_forc_form_cd = Util.checkString(req.getParameter("rsv_forc_form_cd"));
		dm.rsv_forc_form_dt = Util.checkString(req.getParameter("rsv_forc_form_dt"));
//		dm.incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
//		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
//		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_INFO_1043_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
	
	public void hd_info_1054_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1054_LDataSet ds = null;
		HD_INFO_1054_LDM dm = new HD_INFO_1054_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		ds = (HD_INFO_1054_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_info_1050_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	
    	HD_INFO_1050_LDataSet ds = null;

        // DM Setting
        HD_INFO_1050_LDM dm = new HD_INFO_1050_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        System.out.println(dm.cmpy_cd);
		ds = (HD_INFO_1050_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    /**
     * 인사 주소정보 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1051(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1051_LDataSet ds = null;

        // DM Setting
        HD_INFO_1051_LDM dm = new HD_INFO_1051_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1051_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 주소정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1052(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1052_LDataSet ds = null;

        // DM Setting
        HD_INFO_1052_LDM dm = new HD_INFO_1052_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        System.out.println(dm.cmpy_cd);
        System.out.println(dm.emp_no);
		ds = (HD_INFO_1052_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 주소정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1053_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1053_ADataSet ds = null;
		HD_INFO_1053_ADM dm = new HD_INFO_1053_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.addr_clsf_1 = Util.checkString(req.getParameter("addr_clsf_1"));
		dm.zip_1_1 = Util.checkString(req.getParameter("zip_1_1"));
		dm.zip_2_1 = Util.checkString(req.getParameter("zip_2_1"));
		dm.addr_1 = Util.checkString(req.getParameter("addr_1"));
		dm.addr_dtls_1 = Util.checkString(req.getParameter("addr_dtls_1"));
		dm.tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));
		dm.fax_no_1 = Util.checkString(req.getParameter("fax_no_1"));
		dm.ptph_no_1 = Util.checkString(req.getParameter("ptph_no_1"));
		//dm.email_id_1 = Util.checkString(req.getParameter("email_id_1"));
		dm.addr_clsf_2 = Util.checkString(req.getParameter("addr_clsf_2"));
		dm.zip_1_2 = Util.checkString(req.getParameter("zip_1_2"));
		dm.zip_2_2 = Util.checkString(req.getParameter("zip_2_2"));
		dm.addr_2 = Util.checkString(req.getParameter("addr_2"));
		dm.addr_dtls_2 = Util.checkString(req.getParameter("addr_dtls_2"));
		dm.tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));
		dm.fax_no_2 = Util.checkString(req.getParameter("fax_no_2"));
		dm.ptph_no_2 = Util.checkString(req.getParameter("ptph_no_2"));
		dm.email_id_2 = Util.checkString(req.getParameter("email_id_2"));
		dm.email_nm = Util.checkString(req.getParameter("email_nm"));
		dm.addr_clsf_3 = Util.checkString(req.getParameter("addr_clsf_3"));
		dm.forn_zip_3 = Util.checkString(req.getParameter("forn_zip_3"));
		dm.forn_addr_3 = Util.checkString(req.getParameter("forn_addr_3"));
		dm.tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));
		dm.fax_no_3 = Util.checkString(req.getParameter("fax_no_3"));
		dm.ptph_no_3 = Util.checkString(req.getParameter("ptph_no_3"));
		//dm.email_id_3 = Util.checkString(req.getParameter("email_id_3"));
		dm.addr_clsf_4 = Util.checkString(req.getParameter("addr_clsf_4"));
		dm.forn_zip_4 = Util.checkString(req.getParameter("forn_zip_4"));
		dm.forn_addr_4 = Util.checkString(req.getParameter("forn_addr_4"));
		dm.tel_no_4 = Util.checkString(req.getParameter("tel_no_4"));
		dm.fax_no_4 = Util.checkString(req.getParameter("fax_no_4"));
		dm.ptph_no_4 = Util.checkString(req.getParameter("ptph_no_4"));
		//dm.email_id_4 = Util.checkString(req.getParameter("email_id_4"));
		dm.addr_clsf_5 = Util.checkString(req.getParameter("addr_clsf_5"));
		dm.tel_no_5 = Util.checkString(req.getParameter("tel_no_5"));
		dm.cntc_rshp = Util.checkString(req.getParameter("cntc_rshp"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();
        
		ds = (HD_INFO_1053_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_1060_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1060_LDataSet ds = null;
		HD_INFO_1060_LDM dm = new HD_INFO_1060_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1060_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 인사 입사전경력정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1061_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1061_LDataSet ds = null;
		HD_INFO_1061_LDM dm = new HD_INFO_1061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_INFO_1061_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 입사전경력정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1062_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	//BaseDataSet ds = null;
    	HD_INFO_1062_ADataSet ds = null;
        HD_INFO_1062_ADM dm = new HD_INFO_1062_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        int idx = 0;

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.in_cmpy_dt = (String)hash.get("in_cmpy_dt");
		dm.lvcmpy_dt = (String)hash.get("lvcmpy_dt");
		dm.offi_nm = (String)hash.get("offi_nm");
		dm.dty = (String)hash.get("dty");
		dm.posk = (String)hash.get("posk");
		dm.asaly = (String)hash.get("asaly");
		dm.lvcmpy_resn = (String)hash.get("lvcmpy_resn");
		dm.natn_cd = (String)hash.get("natn_cd");
		dm.duty_yys = (String)hash.get("duty_yys");
		dm.duty_dds = (String)hash.get("duty_dds");
		dm.carr_aprv_yys = (String)hash.get("carr_aprv_yys");
		dm.carr_aprv_dds = (String)hash.get("carr_aprv_dds");
		dm.emp_no = (String)hash.get("emp_no");
		dm.carr_seq = (String)hash.get("carr_seq");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();
        
		ds = (HD_INFO_1062_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
       
    public void hd_info_1070_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_1070_MDataSet ds = null;
		HD_INFO_1070_MDM dm = new HD_INFO_1070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		DBManager manager = new DBManager("MISHDL");

		ds = (HD_INFO_1070_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 인사 자격면허정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1071(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1071_LDataSet ds = null;

        // DM Setting
        HD_INFO_1071_LDM dm = new HD_INFO_1071_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setEmp_no(Util.checkString(req.getParameter("emp_no")));

		ds = (HD_INFO_1071_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 자격면허정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1072_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1072_ADataSet ds = null;
        HD_INFO_1072_ADM dm = new HD_INFO_1072_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.qulf_pems_cd = (String)hash.get("qulf_pems_cd");
		dm.acqr_dt = (String)hash.get("acqr_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.qulf_no = (String)hash.get("qulf_no");
		dm.qulf_pems_issu_plac_cd = (String)hash.get("qulf_pems_issu_plac_cd");
		dm.qulf_pems_nm = (String)hash.get("qulf_pems_nm");
		dm.qulf_pems_issu_plac_nm = (String)hash.get("qulf_pems_issu_plac_nm");
		dm.emp_no = (String)hash.get("emp_no");
		dm.qulf_pems_seq = (String)hash.get("qulf_pems_seq");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_INFO_1072_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_1080_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_1080_LDataSet ds = null;
		HD_INFO_1080_LDM dm = new HD_INFO_1080_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1080_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
     * 인사 외국어정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1081_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1081_LDataSet ds = null;
		HD_INFO_1081_LDM dm = new HD_INFO_1081_LDM();

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_INFO_1081_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 외국어정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1082_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1082_ADataSet ds = null;
        HD_INFO_1082_ADM dm = new HD_INFO_1082_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frnc_word_cd = (String)hash.get("frnc_word_cd");
		dm.test_cd = (String)hash.get("test_cd");
		dm.test_grad = (String)hash.get("test_grad");
		dm.test_scor = (String)hash.get("test_scor");
		dm.test_dt = (String)hash.get("test_dt");
		dm.test_enfc_instt = (String)hash.get("test_enfc_instt");
		dm.spc_matt = (String)hash.get("spc_matt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.frnc_word_seq = (String)hash.get("frnc_word_seq");
		dm.frnc_word_nm = (String)hash.get("frnc_word_nm");
		dm.test_nm = (String)hash.get("test_flnm");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        
		ds = (HD_INFO_1082_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_1083_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_1083_LDataSet ds = null;
		HD_INFO_1083_LDM dm = new HD_INFO_1083_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frnc_word_cd = Util.checkString(req.getParameter("frnc_word_cd"));

		dm.print();

		ds = (HD_INFO_1083_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1084_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_1084_MDataSet ds = null;
		HD_INFO_1084_MDM dm = new HD_INFO_1084_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_INFO_1084_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1090_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISHDL");

		HD_INFO_1090_MDataSet ds = null;
		HD_INFO_1090_MDM dm = new HD_INFO_1090_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_INFO_1090_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 원호정보 공통코드 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1091(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1091_LDataSet ds = null;

        // DM Setting
        HD_INFO_1091_LDM dm = new HD_INFO_1091_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_1091_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 원호정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1092_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1092_LDataSet ds = null;

        // DM Setting
        HD_INFO_1092_LDM dm = new HD_INFO_1092_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setEmp_no(Util.checkString(req.getParameter("emp_no")));
        dm.print();
        
		ds = (HD_INFO_1092_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 인사 원호정보 등록,수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_info_1093_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1093_ADataSet ds = null;
		HD_INFO_1093_ADM dm = new HD_INFO_1093_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.prtct_obj_clsf_cd = Util.checkString(req.getParameter("prtct_obj_clsf_cd"));
		dm.prtct_obj_pers_no = Util.checkString(req.getParameter("prtct_obj_pers_no"));
		dm.prtct_grad_cd = Util.checkString(req.getParameter("prtct_grad_cd"));
		dm.prtct_obj_relatn = Util.checkString(req.getParameter("prtct_obj_relatn"));
		dm.prtct_obj_relatn_rshp_cd = Util.checkString(req.getParameter("prtct_obj_relatn_rshp_cd"));
		dm.prtct_appmt_ofbld_cd = Util.checkString(req.getParameter("prtct_appmt_ofbld_cd"));
		dm.gurt_insr_entr_dt = Util.checkString(req.getParameter("gurt_insr_entr_dt"));
		dm.gurt_insr_mtry_dt = Util.checkString(req.getParameter("gurt_insr_mtry_dt"));
		dm.gurt_insr_amt = Util.checkString(req.getParameter("gurt_insr_amt"));
		dm.gurt_insr_no = Util.checkString(req.getParameter("gurt_insr_no"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();
        
		ds = (HD_INFO_1093_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_1100_MDataSet ds = null;
		HD_INFO_1100_MDM dm = new HD_INFO_1100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_1100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_1110_LDataSet ds = null;
		HD_INFO_1110_LDM dm = new HD_INFO_1110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_INFO_1110_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_1120_LDataSet ds = null;
		HD_INFO_1120_LDM dm = new HD_INFO_1120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_INFO_1120_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_1180_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
  		DBManager manager = new DBManager("MISHDL");
  		
      	long start_tm = System.currentTimeMillis();
      	
      	HD_INFO_1180_ADataSet ds = null;
  		HD_INFO_1180_ADM dm = new HD_INFO_1180_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.appmt_indc_yn = (String)hash.get("appmt_indc_yn");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
          
  		ds = (HD_INFO_1180_ADataSet)manager.executeCall(dm);
  		

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
      }
}
